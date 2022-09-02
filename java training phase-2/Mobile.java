public class Mobile {
    String brand;
    int price;
    Earphone e;

    Mobile(String brand,int price)
    {
        this.brand=brand;
        this.price=price;
    }
    public void insert(Earphone e)
    {
        if(this.e==null)
        {
            this.e=e;
            System.out.println("earphone is inserted successfully");
        }
        else{
            System.out.println("earphonr already exists");
        }
    }
    public void remove()
    {
        if(this.e==null)
        {
            System.out.println("no earphone is found to remove");
        }
        else{
            this.e=null;
            System.out.println("earphone is deleted successfully");
        }
    }
    public void details()
    {
        if(this.e==null)
        {
            System.out.println("no earphone is to found to show details");
        }
        else
        {
        System.out.println(e.brand);
        System.out.println(e.color);
        System.out.println(e.price);
        System.out.println(brand);
        System.out.println(price);
        }
    }


}
