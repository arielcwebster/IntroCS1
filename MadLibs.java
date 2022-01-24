import java.util.Scanner;

public class MadLibs {
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to MadLibs!");
    System.out.println("I will ask you for a few words and numbers then tell you a story!");
    System.out.println("Feel free to ask your friends to play along with you :)");

    System.out.println("Please enter a year:");
    int year = scan.nextInt();
    System.out.println("Please enter an amount of money:");
    double money = scan.nextDouble();
    System.out.println("Please enter an adjective:");
    String adjective = scan.next();
    System.out.println("Please enter a whole number:");
    int number = scan.nextInt();
    System.out.println("Please enter a larger whole number:");
    int largerNumber = scan.nextInt();
    System.out.println("Please enter a percentage:");
    double percent = scan.nextDouble();
    System.out.println("Please enter a noun:");
    String noun = scan.next();


    System.out.println("I first got a Dell computer in " + year + " and it cost $" + money + " I wasn't sure it" +
    "was worth the money, I thought computers were " + adjective + ", but I was required to have a computer" +
    "for " + number + " of the " + largerNumber + " of classes I was taking. I would say it was " + percent
    + "% useful for those classes. When that computer stopped working I got a " + noun + " to replace it." );

  }
}
