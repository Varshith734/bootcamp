class P3{
    public static void main(String[] args)
    {
        char ch='p';
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.println(ch+ "  it is alphabet");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println(ch+ " it is alphabet");
        }
        else{
           System.out.println(ch+ " it is special"); 
        }
         
    }
}