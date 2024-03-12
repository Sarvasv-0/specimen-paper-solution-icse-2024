import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        int[][] A = new int[3][3];
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter a number: ");
                A[i][j]=sc.nextInt();
                
            }
        }
        sc.close();

        int sE=0;
        int sO=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (A[i][j]%2==0) {
                    sE+=A[i][j];
                }
                else {
                    sO+=A[i][j];
                }
            }
        }
        System.out.println("Sum of odd numbers: "+sO);
        System.out.println("Sum of even numbers: "+sE);
    }
}
