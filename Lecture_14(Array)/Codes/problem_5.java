/*
    Problem 5 First peak elemrnt on the array...
*/
public class problem_5 {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 0, 3, 7 };
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
