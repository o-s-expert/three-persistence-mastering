package expert.os.isolation;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public enum Database {
    INSTANCE;

    private Map<String, Map<String, Object>> data = new HashMap<>();

    public void insert(String key, Map<String, Object> entry) {
        Objects.requireNonNull(key, "key is required");
        Objects.requireNonNull(entry, "entry is required");
        if (!retrieve(key).isEmpty()) {
            throw new IllegalStateException("You cannot overwrite info, please, use update method instead");
        }
        this.data.put(key, entry);
    }

    public void update(String key, Map<String, Object> entry) {
        Objects.requireNonNull(key, "key is required");
        Objects.requireNonNull(entry, "entry is required");
        if (retrieve(key).isEmpty()) {
            throw new IllegalStateException("You cannot update a data that does not exist");
        }
        this.data.put(key, entry);
    }

    public void delete(String key) {
        this.data.remove(key);
    }

    public Map<String, Object> retrieve(String key) {
        Map<String, Object> entry = this.data.get(key);
        return Optional.ofNullable(entry)
                .map(Collections::unmodifiableMap)
                .orElse(Collections.emptyMap());
    }

}
