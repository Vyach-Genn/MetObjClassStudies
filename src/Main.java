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


        System.out.println("Authors:");
        Library stephenKing = new Library("Stephen", "King");
        Library stephenKing2 = new Library("Stephen", "King");
        Library levTolstoy = new Library("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));


        System.out.println(stephenKing);
        System.out.println(levTolstoy);


    }
}