public class Aeroplane {
    String color;
    String brand;
    int capacity;
    Airport A;

    Aeroplane(String color,String brand,int capacity,Airport A)
    {
        this.color=color;
        this.brand=brand;
        this.A=A;
        this.capacity=capacity;
    }
    public void details()
    {
        System.out.println(color);
        System.out.println(brand);
        System.out.println(capacity);
        
    }
}
