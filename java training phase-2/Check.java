class Check{
    public static void main(String[] args)
    {
        char ch='p';
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.println(ch + "  alphabet");
        }
        else
        {
           System.out.println( ch +" not alphabet"); 
        }

    }
}