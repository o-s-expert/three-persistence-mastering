package expert.os.isolation;

import java.util.Map;
import java.util.Optional;

public class UserDAO {

    private Mapper mapper = new Mapper();

    private Database database = Database.INSTANCE;

    public void insert(User user) {
        Map<String, Object> entry = mapper.toMap(user);
        database.insert(user.id(), entry);
    }

    public Optional<User> findById(String id) {
        Map<String, Object> retrieve = database.retrieve(id);
        return mapper.toEntity(retrieve);
    }
}
