import java.util.Scanner;

    public class magic8ball_ {

        public static void main(String[] args){

        Scanner keyboard;
        keyboard = new Scanner(System.in);


        String userName;
        int startNumber;
        String yes;
        String possibly;
        String prehaps;
        String maybe;
        String mostLikely;
        String no;
        String maybeNot;
        String NotLikely;
        String never;
        String keepDreaming;

        System.out.println("Welcome to the Magic 8 ball.");
        System.out.println("What is your name?");
            userName = keyboard.nextLine();
        System.out.println("Hello, " +userName);
        System.out.println("Enter a number between 1 and 100 to play.");
            startNumber = keyboard.nextByte();
        System.out.println("Now as any question you like.");



    }
}
