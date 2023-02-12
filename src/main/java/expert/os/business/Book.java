package expert.os.business;

import java.time.Year;
import java.util.Objects;

public record Book(String title, Year release, int edition) {

    public Book {
        Objects.requireNonNull(title, "Title is required");
        Objects.requireNonNull(release, "release is required");

        if(edition < 0) {
            throw new IllegalArgumentException("A release cannot be negative");
        }
        //validations
    }

    public Book newEdition(Year release) {
        return new Book(this.title, release, edition + 1);
    }
}
