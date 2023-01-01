import java.util.Scanner;

class main {

    void search() {
        int arr[]={1,2,3,4,5,3,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a search value: ");
        int ch=sc.nextInt();
        
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch){
                ans=i;
                break;
            }
        }
        System.out.println("x at index : "+ans);
    }

    void maxarray() {
        int arr[] = { 2, 5, 3, 7, 4, 9, 12, 1 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        System.out.println("Max is : " + ans);
    }

    void sumOfArray() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of all the elemrnt of the array is : " + sum);
    }
}

public class arrExample {
    public static void main(String[] args) {
        main obj = new main();
        // obj.sumOfArray();
        // obj.maxarray();
        obj.search();
    }
}
