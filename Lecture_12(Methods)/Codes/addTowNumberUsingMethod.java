import java.util.Scanner;

class sum {
int a;
int b;
    sum(int x,int y){
            System.out.println("constructor running...");
            a=x;
            b=y;
        }

    int add() {
        return a + b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}

public class addTowNumberUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        sum obj = new sum(a,b);
        System.out.println(obj.add());
        System.out.println(obj.mul());
        System.out.println(obj.sub());
        
        // System.out.println(Math.sqrt(24));
        // System.out.println(Math.sqrt(16));

        // System.out.println(Math.floor(5.3));
        // System.out.println(Math.floor(5.8));

        // System.out.println(Math.ceil(5.3));
        // System.out.println(Math.ceil(5.8));
    }
}
