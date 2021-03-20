import java.util.Scanner;

public class Re1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int l = input.nextInt();
        int n1 = input.nextInt();
        input.nextLine();
        String s2 = input.nextLine();
        String s1 = String.valueOf(n1);
        int count = 0;
        int midl = -1;

        for(int i = 0; i<l; i++){
            if(s2.substring(i,i+1).equals("*")){
                count++;
            }
        }

        for(int i = 0; count > 0 ; i++){
            String comp2 = s2.substring(i,i+1);
            String comp1 = s1.substring(i,i+1);

            if(!comp2.equals("*")){
                if(Integer.valueOf(comp1) > Integer.valueOf(comp2)){
                    String s2pre = s2.substring(0,i);
                    String s2pos = s2.substring(i+1, l);
                    
                }
            }
        }

    }
}

