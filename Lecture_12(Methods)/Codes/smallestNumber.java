import java.util.Scanner;

class main {
    public void val(int x, int y, int z) {
        if(x>=y && x>=z){
            System.out.println("Greatest is "+x);
        }
        else if(y>=z){
            System.out.println("greatest is "+y);
        }
        else{
            System.out.println("Geatesr is "+z);
        }
    }
}

public class smallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c = sc.nextInt();
        main obj=new main();
        obj.val(a, b, c);
    }
}
