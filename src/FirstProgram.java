import java.util.Scanner;

public class FirstProgram {


    public void addNdPrintValuesInArrays(){
        int[] a = new int[10];

        for(int i=0; i<10 ; i++){
            System.out.println("adding the value for the array index location "+i);
            a[i] = i+1;
        }
        int i=1;
        System.out.println("The lenght of the array "+a.length);
        while (i<=a.length){
            System.out.println(a[i-1]);
            i++;
        }
    }

    public void addValuesToTwoDimension(){
        int[][] a = new int[3][6];
        // Adding the values in the 2dimensional array
        for(int i=0; i<3; i++){
            for(int j=0; j<6; j++){
                a[i][j] = j*2;
            }
        }

        // printing the values from the 2dimnesional array
        for(int i=0; i<3; i++){
            for(int j=0; j<6; j++){
                System.out.println("for the row -> "+i+" and for the column ->"+j+" the inserted values are -> "+a[i][j]);
            }
        }


    }

    public void addCalc(int a, int b){
        int c =  a+b;
        System.out.println("The added value is "+c);
    }


    public static void main(String[] args) {
        FirstProgram f1 = new FirstProgram();
     /*   f1.addNdPrintValuesInArrays();
        f1.addCalc(10,40);*/
        f1.addValuesToTwoDimension();
    }
}
