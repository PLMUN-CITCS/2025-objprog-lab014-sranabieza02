public class MethodReturnTypes {


    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }


   
    public static double calculateAverage(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }


    public static void main(String[] args) {
        
        displayWelcomeMessage();


               double average = calculateAverage(20.0, 25.0, 30.0);


              System.out.println("The average is: " + average);
    }
}