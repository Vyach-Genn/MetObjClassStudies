public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        String word = "комок";
        MainServis mainServis = new MainServis(word);
        System.out.println(mainServis.toString());
        System.out.println();

        System.out.println("Task 2");
        int value = 14;
        PositiveDivisor positiveDivisor = new PositiveDivisor(value);
        System.out.println(positiveDivisor.toString());

    }
}