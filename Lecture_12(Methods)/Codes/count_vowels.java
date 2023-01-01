import java.util.Scanner;

class main {
    int count=0;

    public int vowel(String x) {
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

public class count_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String n = sc.nextLine();
        main obj = new main();
        System.out.println("The number of vowel present in this string is : " + obj.vowel(n));
    }
}
