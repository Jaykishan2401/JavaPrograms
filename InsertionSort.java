import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Array : ");
        int n = in.nextInt();

        int[] array = new int[n];

        System.out.println("Enter elements : ");
        for(int i = 0 ; i<n ; i++){
            array[i] = in.nextInt();
        }

        for(int i = 1 ; i<n ; i++){
            for(int j = i ; j>0 && (array[j] < array[j-1]); j--){
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }
        }

        for(int i = 0; i<n ; i++){
            System.out.println(array[i]);
        }
    }


}
