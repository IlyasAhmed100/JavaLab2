import java.util.Scanner;public class HelloYou {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?"); /* Programme asks user for his name to start conversation */
        String name = in.nextLine(); /* New line */
        System.out.println("Hello " + name + "!"); /* Programme responds to user*/
        System.out.println(name + " What is your favourite fruit?"); /* System asks user what his favourite fruit is */
        String fruit = in.nextLine(); /* New line */
        System.out.println("I love " + fruit + " too " + name + "!"); /* System responds to user*/

    }
}

