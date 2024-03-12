import java.util.Scanner;
class Q4 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];

        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            arr1[i]=sc.nextInt();
        }
        sc.close();
        
        // sorting
        int min=1;
        for (int i = 0; i < 10; i++) {
            int j;
            for (j = 0; j < 10; j++) {
                if (arr1[min]<arr1[min-1]) {
                    min=j;
                }    
            }
            int temp=arr1[j];
            arr1[j]=arr1[min];
            arr1[min]=temp;
        }

        // printing
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
