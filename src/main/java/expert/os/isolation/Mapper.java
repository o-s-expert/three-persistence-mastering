package expert.os.isolation;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Mapper {

    public Map<String, Object> toMap(User user) {
        Map<String, Object> entry = new HashMap<>();
        entry.put("id", user.id());
        entry.put("name", user.name());
        return entry;
    }

    public Optional<User> toEntity(Map<String, Object> entry) {
        Map<String, Object> retrieve = Database.INSTANCE.retrieve("otaviojava");
        if (!retrieve.isEmpty()) {
            User user = new User((String) retrieve.get("id"), (String) retrieve.get("name"));
            return Optional.of(user);
        }
        return Optional.empty();
    }
}
