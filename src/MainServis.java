import java.util.Objects;

public class MainServis {
    String word;

    public MainServis(String word) {
        this.word = word;
    }

    public boolean checkPalindrome(String word) {
        if (word.length() != 5) {
            throw new IllegalArgumentException("Слово должно содержать 5 букв");
        } else {
            StringBuilder sd = new StringBuilder(word);
            return sd.reverse().toString().equalsIgnoreCase(word);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainServis that = (MainServis) o;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(word);

    }

    @Override
    public String toString() {
        if (checkPalindrome(word)) {
            return "слово %s из пяти букв, является палиндромом ".formatted(word);
        }
        return "слово %s из пяти букв, не является палиндромом ".formatted(word);
    }
}
