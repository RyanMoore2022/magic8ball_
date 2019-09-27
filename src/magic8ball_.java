import java.util.Scanner;

    public class magic8ball_ {

        public static void main(String[] args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int masterKey;
        String userName;

        String yes;
            yes = "Yes";
        String possibly;
            possibly = "Possibly";
        String perhaps;
            perhaps = "Perhaps";
        String maybe;
            maybe = "Maybe";
        String mostLikely;
            mostLikely = "Most Likely";
        String no;
            no = "No";
        String maybeNot;
            maybeNot = "Maybe Not";
        String notLikely;
            notLikely = "Not Likely";
        String never;
            never = "Never";
        String keepDreaming;
            keepDreaming = "Keep Dreaming";

            String question1;
            String question2;
            String question3;
            String question4;
            String question5;
            String question6;
            String question7;
            String question8;
            String question9;
            String question10;
            String question11;
            String question12;
            String question13;
            String question14;
            String question15;


            System.out.println("Welcome to the Magic 8 ball.");
        System.out.println("What is your name?");
            userName = keyboard.nextLine();
        System.out.println("Hello, " +userName);
        System.out.println("Enter a number between 1 and 100 to play.");
            masterKey = keyboard.nextByte();
        System.out.println("Now ask away all of your questions...");
            question1 = keyboard.nextLine();
            if (masterKey < 10) {
                System.out.println("If you dare");
            } else if (masterKey < 20) {
                System.out.println("If you dare");
            } else {
                System.out.println("If you dare");
            }
            question2 = keyboard.nextLine();
            if (masterKey < 10) {
                System.out.println(maybe);
            } else if (masterKey < 20) {
                System.out.println(no);
            } else {
                System.out.println(yes);
            }
            question3 = keyboard.nextLine();
            if (masterKey < 10) {
                System.out.println(maybe);
            } else if (masterKey < 20) {
                System.out.println(no);
            } else {
                System.out.println(yes);
                

        System.out.println("Thank you for playing!");
    }
}
