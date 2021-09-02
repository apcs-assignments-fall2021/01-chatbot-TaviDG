import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello, "+ name+ "! It's nice to meet you!");
        System.out.println("What is your favorite color?");
        String color = scan.next();
        System.out.println(color+ " is an ugly color");
        System.out.println("How old are you?");
        int age = scan.nextInt();
        int yearsLeft=100-age;
        System.out.println("You have at most about "+yearsLeft+ " years left.");
        System.out.println("What is your favorite food?");
        String food = scan.next();
        System.out.println("I guess "+ food+ " taste(s) alright.");
        System.out.println("What is your favorite videogame?");
        String game = scan.next();
        System.out.println("Really, "+ game+ "? Such a scrub.");



        // Add some code here!

        scan.close();
    }
}
