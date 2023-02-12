package expert.os.isolation;

import java.util.Optional;

public class UserRepository {

    private UserDAO dao = new UserDAO();

    public void save(User user) {

        if (dao.findById(user.id()).isPresent()) {
            //update
        }
        dao.insert(user);
    }

    public Optional<User> findById(String id) {
        return dao.findById(id);
    }
}
