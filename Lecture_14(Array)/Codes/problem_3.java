/*Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even
elements. 
Output:
2
4
6
8
*/
public class problem_3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        for(int aray:arr){
            if(aray%2==0){
                System.out.println(aray);
            }
        }
    }
}
