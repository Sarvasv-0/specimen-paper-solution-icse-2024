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
        for (int i = 0; i < arr1.length-1; i++) {
            int min=i;
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[min]<arr1[j]) {
                    min=j;    
               }
            }
            // swap
            int temp=arr1[min];
            arr1[min]=arr1[i];
            arr1[i]=temp;
        }

        // printing
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
