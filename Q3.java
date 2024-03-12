import java.util.Scanner;
class Eshop {
    String name;
    double price;
    float discount;
    Scanner foo = new Scanner(System.in);
    void accept() {
        System.out.print("Enter the name of the product: ");
        name=foo.nextLine();

        System.out.print("Enter the price of the product: ");
        price=foo.nextDouble();
    }

    void calculate() {
        if (price>=1000 && price<=25000) {
            discount=5.0f;
        }
        else if (price>=25001 && price<=57000) {
            discount=7.5f;
        }
        else if (price>=57001 && price<=100000) {
            discount=10.0f;
        }
        else {
            discount=15.0f;
        }
    }
    
    void display() {
        System.out.println("The name of the product is: "+name);
        System.out.println("The price of the product is: "+price);
    }
    public static void main(String[] args) {
        Eshop bar = new Eshop();
        bar.accept();
        bar.calculate();
        bar.display();
    }
}
