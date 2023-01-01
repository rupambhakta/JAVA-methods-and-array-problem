import java.util.Scanner;
class avg{
    public float average(Float x,Float y,Float z){
        return (x+y+z)/3;
    }
}
public class averageOfTwoNumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number: ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        avg obj=new avg(); 
        System.out.println(obj.average(a, b, c));
    }
}
