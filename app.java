import java.util.Scanner;

public class app {
    public static void main(String[] args) {
    Scanner newScanner = new Scanner(System.in);
    System.out.println("What is your name");
    String name = newScanner.nextLine();
    System.out.println("How old are you? ");
    int age = newScanner.nextInt();
    System.out.println("what is the time? ");
    double time = newScanner.nextDouble();

    if (time < 22.00) {
        System.out.println("Hej, " + name + " read a book");
    } else {
        System.out.println("Hej, " + name + " Go to sleep");
    }

    
}
}

