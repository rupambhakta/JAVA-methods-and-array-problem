import java.util.Scanner;

class main {
    public void val(String x) {
        if (x.length() % 2 == 0) {
            System.out.print(x.charAt((x.length() / 2) - 1));
            System.out.print(x.charAt((x.length() / 2)));
        } else {
            System.out.println(x.charAt(x.length() / 2));
        }
    }
}

public class foundMiddleCherecter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        main obj = new main();
        obj.val(s);
    }
}
