public class Q8 {
    void display(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
    void display(int n) {
        while (n>0) {
            int temp=n%10;
            System.out.println(Math.sqrt(temp));
            n/=10;
        }
    }
    public static void main(String[] args) {
        Q8 foo = new Q8();
        foo.display();
        System.out.println();
        foo.display(4329);
    }
}
