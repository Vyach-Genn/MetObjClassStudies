public class PositiveDivisor {
    int value;

    public PositiveDivisor(int value) {
        this.value = value;
    }

    public String findingDivisors(int value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Значение должно быть положительным");
        }
        StringBuilder sd = new StringBuilder();
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                if (sd.length() > 0) {
                    sd.append(", ");
                }
                sd.append(i);
            }
        }
        sd.append(".");
        return "У числа %d, положительные делители: %s".formatted(value, sd.toString());
    }

    @Override
    public String toString() {
        return findingDivisors(value);
    }
}
