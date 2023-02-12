package expert.os.isolation;

import java.util.Optional;

public class RepositoryApp {

    public static void main(String[] args) {
       UserRepository repository = new UserRepository();

        User otavio = new User("otaviojava", "Otavio Santana");

        repository.save(otavio);

        Optional<User> user = repository.findById("otaviojava");
        System.out.println("the user: " + user);
    }
}
