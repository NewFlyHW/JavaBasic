package Algor;
import java.util.Scanner;

public class Algorithms {
    public Algorithms(){
        while(true){
            System.out.println("GCD: 1...");
            Scanner in =new Scanner(System.in);
            if(in.nextInt() == 1){
                GCD();
            }


            Scanner ch =new Scanner(System.in);
            System.out.println("Press 'q' to exit, enter to continue. ");
            String c = ch.nextLine();
            if(c.equals("q")){
                System.exit(0);
            }
        }

    }



    //GCD algorithm
    private void GCD(){
        System.out.printf("gcd compute - enter m and n: ");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.printf("You enter m = "+m +", n = "+n +"\n");

        //compute gcd
        if(n!=0){
            int r;
            while(n!=0){
                r = m % n;
                m = n;
                n = r;
            }
            System.out.printf("Result: " +m);
        }else{
            System.out.printf("Result: "+m);
        }
    }

    //find the common element from two list element
    private void commonElement(){
        Scanner s = new Scanner(System.in);



    }


}
