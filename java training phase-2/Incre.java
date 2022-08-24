class Incre{
    public static void main(String[] args)
    {
        int i=10;
        i=i++;
        System.out.println(i);
         i=++i;
        System.out.println(i);

        int a=20;
        int result=(++a)+a+(++a);
          System.out.println(result);

          
           System.out.println(++a);
            System.out.println(a+"java");
             System.out.println(++a +a+ "james");

            //  post
            System.out.println("//////////// post increament //////");
            System.out.println();
            System.out.println();
            System.out.println();

            int b=15;
            int resul=(++b)+b+(b++)-b;
            System.out.println(resul);

            int c=23;
            System.out.println(c++);
            System.out.println(++c + c++ -c);
             System.out.println("Alvas"+ (c - ++c));


        
    }
}