package expert.os.isolation;

import java.util.Map;
import java.util.Optional;

public class MapperApp {

    public static void main(String[] args) {
        Database database = Database.INSTANCE;
        User otavio = new User("otaviojava", "Otavio Santana");

        Mapper mapper = new Mapper();
        database.insert(otavio.id(), mapper.toMap(otavio));

        Map<String, Object> entry = database.retrieve("otaviojava");
        Optional<User> user = mapper.toEntity(entry);

        System.out.println("the user: " + user);
    }
}
