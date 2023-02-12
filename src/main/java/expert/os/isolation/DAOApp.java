package expert.os.isolation;

import java.util.Optional;

public class DAOApp {

    public static void main(String[] args) {
       UserDAO dao = new UserDAO();
        User otavio = new User("otaviojava", "Otavio Santana");

        dao.insert(otavio);

        Optional<User> user = dao.findById("otaviojava");
        System.out.println("the user: " + user);
    }
}
