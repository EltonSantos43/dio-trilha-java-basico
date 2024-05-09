public class VariableTypes {
    public static void main(String[] args) throws Exception {
        // Primitive Types
        // Study the String class that represents text in the application

        String myName = "Elton Santos";
        System.out.println(myName);

        double MinimumWage = 2500;
        System.out.println(MinimumWage);

        short shortNumber = 1;
        int normalNumber = shortNumber;
        short shortNumber2 = (short) normalNumber;
        System.out.println(shortNumber2);

        int number = 5;

        number = 10;

        System.out.println(number);

        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);
    }
}
