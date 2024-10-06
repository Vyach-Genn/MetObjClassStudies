import java.util.Random;

public class CalcullatoCumNumber {


    // Напишите программу, которая считает сумму всех чисел многозначного числа и выводит ее в консоль.
    public static int weCalculateTheSumOfNumbers(int num) {
        String strNumber = Integer.toString(num);
        strNumber = Integer.toString(num);
        int sum = 0;
        for (int i = 0; i < strNumber.length(); i++) {
            int c = strNumber.charAt(i) - '0';
            sum += c;

        }
        return sum;
    }
}


