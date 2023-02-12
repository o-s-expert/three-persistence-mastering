package expert.os.business;

import java.time.Year;
import java.util.Objects;

public record Movie(String title, int edition, Year year) {


    public Movie {
        Objects.requireNonNull(title, "title is required");
        Objects.requireNonNull(year, "year is required");
        if(edition < 0) {
            throw new IllegalArgumentException("Edition cannot be negative");
        }
    }
    Movie newEdition(Year year) {
        return new Movie(this.title, edition + 1, year);
    }
}
