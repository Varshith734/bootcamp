import java.util.Scanner;

public class MobileSmart {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     Mobile m=new Mobile(4,5);
        boolean b=true;
        while(b)
        {
            System.out.println("1.connect\n2.disconnect\n3.details\n4.exit\nEnter your choice");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("enter the brand");
                    String brand=sc.next();
                    System.out.println("enter the color");
                    String color=sc.next();
                    System.out.println("enter the price");
                    Double price=sc.nextDouble();
                    m.connectwatch(new Smartwatch(brand,color,price));
                    break;

                case 2: m.disconnect();
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


class Smartwatch{
    String brand;
    String color;
    double price;
    
    

    Smartwatch( String brand,String color,Double price)
    {
        this.brand=brand;
        this.color=color;
        this.price=price;
    }

}
class Mobile{
    int ram;
    int rom;
    Smartwatch s;

    Mobile(int ram,int rom)
    {
        this.ram=ram;
        this.rom=rom;
    }

    public void connectwatch(Smartwatch s)
    {
        if(this.s==null )
        {
            this.s=s;
            System.out.println("connected successfully");
        }
        else{
            System.out.println("connected already exists");
        }
    }
    public void disconnect()
    {
        if(this.s==null)
        {
            System.out.println("disconnected already ");
        }
        else{
            this.s=null;
            System.out.println("disconnected successfully");

        }
    }

    public void details()
    {
        System.out.println(s.brand);
        System.out.println(s.color);
        System.out.println(s.price);
    }
}
