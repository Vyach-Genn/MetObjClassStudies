import java.util.Objects;

public class Library {
    String name;
    String surname;

    public Library(String name, String surname) {
        this.surname = surname;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(surname, library.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Library: %s %s".formatted( name, surname);
    }
}
