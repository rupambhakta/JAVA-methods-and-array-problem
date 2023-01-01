class arrayExample {

void muntyArray(){
    // int [][] array_1=new int[5][3];
    int [][] arr={{12,23,34},{43,32,21}};
    // System.out.print(arr[0][0]+" ");
    // System.out.print(arr[0][1]+" ");
    // System.out.println(arr[0][2]);

    // System.out.print(arr[1][0]+" ");
    // System.out.print(arr[1][1]+" ");
    // System.out.println(arr[1][2]);

    // System.out.print(arr[2][0]+" ");
    // System.out.print(arr[2][1]+" ");
    // System.out.println(arr[2][2]);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(" "+arr[i][j]);
        }
    }
}


    void demoArray() {
        int ages[] = new int[3];
        float[] weight = new float[3];
        String name[] = { "Rahul", "Rohon", "Sneha" };
        ages[0] = 12;
        ages[1] = 15;
        ages[2] = 31;
        // ages[5]=50;
        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);


        for(int i=0;i<ages.length;i++){
            System.out.println(ages[i]);
        }

        // for(int age:ages){             // <------ For each loop
        //     System.out.println(age);                       
        // }

        // int i=0;
        // while (i<ages.length) {
        //     System.out.println(ages[i]);
        //     i++;
        // }

        // System.out.println(ages[5]);

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println("...............................................................");
        System.out.println(name.length);
    }
}

public class array {

    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        // obj.demoArray();
        obj.muntyArray();
    }
}
