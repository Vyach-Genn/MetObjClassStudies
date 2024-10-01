public class Main {
    public static void main(String[] args) {
        // Написать программу, которая будет проверять, является ли слово из пяти букв, палиндромом
        // (примеры: «комок», «ротор») и возвращает true/false.
        System.out.println("task 1");
        String word = "комок";
        MainServis mainServis = new MainServis(word);
        System.out.println(mainServis.toString());
        System.out.println();

        // Напишите программу, которая выводит в консоль все положительные делители натурального числа.
        System.out.println("Task 2");
        int value = 14;
        PositiveDivisor positiveDivisor = new PositiveDivisor(value);
        System.out.println(positiveDivisor.toString());
        System.out.println();

        //Напишите программу, которая считает сумму всех чисел многозначного числа и выводит ее в консоль.
        System.out.println("task 3");
        int number = 1239513;
        CalcullatoCumNumber calcullatoCumNumber = new CalcullatoCumNumber(number);
        System.out.println(calcullatoCumNumber);

    }
}