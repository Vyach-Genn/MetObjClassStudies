public class CalcullatoCumNumber {

    private int number;
    String strNumber = Integer.toString(number);

    public CalcullatoCumNumber(int number) {
        this.number = number;

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Напишите программу, которая считает сумму всех чисел многозначного числа и выводит ее в консоль.
    public int weCalculateTheSumOfNumbers(int number) {
        strNumber = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            int c = strNumber.charAt(i) -'0';
            sum += c;

        }
        return sum;

    }

    @Override
    public String toString() {
        int sum = weCalculateTheSumOfNumbers(number);
        return String.format("Сумма цифр числа %d равна %d", number, sum);
    }
}
