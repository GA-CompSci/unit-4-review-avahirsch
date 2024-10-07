import java.util.Scanner;
public class Drills{

    public static void main(String[] args){

        // Declare 5 different data types with initial values
            int numb = 4;
            boolean set = true;
            char alpha = 'a';
            double second = 2.2;
            String First = "Hello World!";
        // A standard for loop printing a message three times
            for(int i=1; i<numb; i++){
                System.out.println("Hey!");
            }
        // A for-each loop traversing a String[array]
            int[] numbers = {1, 2, 3, 4, 5};
            for (int i = 0; i < numbers.length; i++){
                System.out.println("This is:" + (i + 1));
            }
        // An infinite loop
        while (true) {
            System.out.println("This loop will run forever.");
        }
        // a short-circuit conditional with four tests
            int a = 3;
            int b = 7;
            int c = 6;
            int d = 11;

            if(a>c && a>b && a>d){
                System.out.println("A is the biggest");
            }
            else if(b>c && b>a && b>d){
                System.out.println("B is the biggest");
            }
            else if(c>b && c>a && c>d){
                System.out.println("C is the biggest");
            }
            else if(d>b && d>a && d>c){
                System.out.println("D is the biggest");
            }
            else{
                System.out.println("Idk what's bigger");
            }
        // Break a loop if a conditional passes
            for(int q = 3; q<10; q++){
                if(q>7){
                    break;
                }
            }
        // Loop through each char in a String
        String text = "Hey guys!";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i); 
            System.out.println("The character is: " + currentChar);
        }
        // Print only the first three letters in “word”
            System.out.println("wor");
        // Print all the odd numbers from 1 - 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        // Create a Scanner and take an input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Say something! ");
        String said = scanner.nextLine();  
        System.out.println("You said: " + said);
        
        // Create a Scanner, take a number, and count down from that number to 0
        
        Scanner secondScanner = new Scanner(System.in);
        System.out.println("Enter a number to count down from: ");
        int number = secondScanner.nextInt();
        for (int i = number; i >= 0; i--) {
            System.out.println(i);

        scanner.close();
        secondScanner.close();
    }
}
    // Create a method that returns a comparison (include a JavaDoc comment)
    /**
 * Compares two integers and returns a message indicating which is larger,
 * or if they are equal.
 *
 * @param num1 the first number to compare
 * @param num2 the second number to compare
 * @return a String indicating the result of the comparison:
 *         - "num1 is greater than num2"
 *         - "num2 is greater than num1"
 *         - "num1 is equal to num2"
 */
        int a = 10;
        int b = 20;
        public static String compareNumbers(int num1, int num2) {
        if (num1 > num2) {
            return num1 + " is greater than " + num2;
        } else if (num2 > num1) {
            return num2 + " is greater than " + num1;
        } else {
            return num1 + " is equal to " + num2;
        }
    }
}


