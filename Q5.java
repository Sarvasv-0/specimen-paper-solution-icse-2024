import java.util.Scanner;
class Q5 {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        str1=str1.toUpperCase();
        int vowels=0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'A'||str1.charAt(i) == 'E'||str1.charAt(i) == 'I'||str1.charAt(i) == 'O' || str1.charAt(i) == 'U') {
                vowels+=1;
            }
        }
        System.out.println(str1);
        System.out.println("no. of vowels: "+vowels);
    }
}