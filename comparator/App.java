import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner First = new Scanner(System.in);
        Scanner Second = new Scanner(System.in);
        NumbersComparator comparator = new NumbersComparator();

        System.out.println("Enter a: ");
        String first = First.nextLine();
        System.out.println("Enter b: ");
        String second = Second.nextLine();
        
        int a = Integer.parseInt(first);
        int b = Integer.parseInt(second);
        
        comparator.comparator(a, b);
    }
}