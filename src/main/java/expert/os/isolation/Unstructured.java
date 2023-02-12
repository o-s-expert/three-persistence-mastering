package expert.os.isolation;

import java.util.HashMap;
import java.util.Map;

public class Unstructured {

    public static void main(String[] args) {
        User otavio = new User("otaviojava", "Otavio Santana");

        Map<String, Object> entry = new HashMap<>();
        entry.put("id", otavio.id());
        entry.put("name", otavio.name());

        Database.INSTANCE.insert(otavio.id(), entry);

        Map<String, Object> retrieve = Database.INSTANCE.retrieve("otaviojava");
        if(!retrieve.isEmpty()) {
            User user = new User((String) retrieve.get("id"), (String) retrieve.get("name"));
            System.out.println("User found: " + user);
        }
    }
}
