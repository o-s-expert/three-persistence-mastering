package expert.os.isolation;

import java.util.HashMap;
import java.util.Map;

public class Unstructured {

    public static void main(String[] args) {

        User user = new User("otaviojava", "Otavio Santana");
        Map<String, Object> entry = new HashMap<>();
        entry.put("id", user.id());
        entry.put("name", user.name());
        Database.INSTANCE.insert(user.id(), entry);

        Map<String, Object> map = Database.INSTANCE.find("otaviojava");
        User otavio = null;
        if (!map.isEmpty()) {
            otavio = new User((String) map.get("id"), (String) map.get("name"));
        }

        System.out.println("End of operation " + otavio);
    }
}
