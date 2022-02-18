package DS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DataStructure {

    public DataStructure (){

        while(true){
            System.out.println("arrayVSArrayList -> 1 array2D-> 2\n");
            Scanner in = new Scanner(System.in);
            int input = in.nextInt();
            switch (input){
                case 1:
                    arrayVsArrayList();
                    break;
                case 2:
                    array2D();
                    break;
            }

            Scanner ch =new Scanner(System.in);
            System.out.println("Press 'q' to exit, enter to continue. ");
            String c = ch.nextLine();
            if(c.equals("q")){
                System.exit(0);
            }

        }
    }



    /* array:
    - Has a specific size, can hold datatype and object
    - String[] xxx = new String[5] ->size 5 or String[] xxx = {xxx,xx,xxx}
    -  xxx[0] to println
    arrayList:
    - Has a dynamic size, can only hold object(no int, char)
    - ArrayList<String> xxx = new ArrayList<>() or ArrayList<String> xxx = new ArrayList<>(Arrays.aslist("xxx","xxx","xxx"))
    - xxx.get(0) to println
    - xxx.add("xxx"), xxx.remove()
     */
    private void arrayVsArrayList(){
        //array
        String[] arrayT = new String[5];
        arrayT[0] = "Hello";
        arrayT[1] = "World";

        for(int i=0;i<arrayT.length;i++){
            System.out.println("Arry"+i+": " + arrayT[i]);  //println will print and move to next line
        }

        //arrayList
        ArrayList<String> arrayListT = new ArrayList<>(Arrays.asList("How","are","you","doing"));
        arrayListT.add(1, "dare");
        arrayListT.remove(2);

        System.out.println("Array list: "+arrayListT);

    }


    /*
    2D array as known as Matrix
    */
    private void array2D(){
        int[][] intMatrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        for(int i=0; i<intMatrix.length;i++){
            for(int j=0; j<intMatrix.length;j++){
                System.out.print(intMatrix[i][j]+" ");
            }
            System.out.println("\n");
        }
        System.out.print("Matrix length: "+ intMatrix.length);
    }




    /*stack method:
    boolean empty(): test if is empty
    Object peek(): search for the peek from the stack, but do not remove it
    Object pop(): remove the peek object and return is value
    Object push(Object element): push the element to the peek
    int search(Object element): return the element position in the stack, start from 1
     */
    public void stackDemo(){

    }


}


