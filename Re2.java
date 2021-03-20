import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Re2 {
    public static void main(String[] args) {

       String str = String.format("%.6g%n", 0.91238578);

       String s = "Jay";
       double num = 2;

        System.out.println(GCD(48,42));
        System.out.println(LCM(48,42));

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(4);

        for(int i =0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println(10/2/5);

        for(int i = 0; i < arr.size()-1; i++){
            for(int j = 0; j < arr.size()-i-1 ; j++){
                if(arr.get(j) > arr.get(j+1)){
                    int temp = arr.get(j+1);
                    arr.set(j+1, arr.get(j));
                    arr.set(j,temp);
                }
            }
        }

        for(int i =0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }


    }

    public static int GCD(int n1, int n2){
        if(n1==0){
            return n2;
        }
        if(n2==0){
            return n1;
        }
        if(n1==n2){
            return n1;
        }
        if(n1>n2){
            return GCD(n1-n2,n2);
        }
        return GCD(n1,n2-n1);
    }

    public static int LCM(int n1, int n2){
        return(n1*n2/GCD(n1,n2));
    }
}
