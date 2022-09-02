import java.util.Scanner;

public class MobileDriver {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Mobile m=new Mobile("iphone", 120000);

        boolean b=true;
        while(b)
        {
            System.out.println("1.insert\n2.remove\n3.details\n4.exist\nEnter your choice");
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter the brand");
                    String brand=s.next();
                    System.out.println("enter the color");
                    String color=s.next();
                    System.out.println("enter the price");
                    Double price=s.nextDouble();
                    m.insert(new Earphone(brand,color,price));
                    break;

                case 2: m.remove();
                break;

                case 3:m.details();
                break;

                case 4: System.exit(0);
                break;
                default: System.out.println("inavlid");
                    
            }
        }
        
    }

}

