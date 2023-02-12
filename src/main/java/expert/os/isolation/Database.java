package expert.os.isolation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Database {

    INSTANCE;

    private Map<String, Map<String, Object>> database = new HashMap<>();


    public void insert(String key, Map<String, Object> entry) {
        this.database.put(key, entry);
    }

    public void update(String key, Map<String, Object> entry) {
        this.insert(key, entry);
    }

    public void remove(String key) {
        this.database.remove(key);
    }

    public Map<String, Object> find(String key) {
        Map<String, Object> map = this.database.get(key);
        return Optional.ofNullable(map).orElse(Collections.emptyMap());
    }

}
