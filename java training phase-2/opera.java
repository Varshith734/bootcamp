import com.sun.source.doctree.SystemPropertyTree;

public class opera {
    public static void main(String[] args)
    {
        int a=10,b=20,c=30;
//        if(a<b && b>c)
//        {
//            System.out.println("and");
//        }
        boolean res=(a<b && b<c);
                System.out.println(res);
        boolean res1=(a>b && b<c);
        System.out.println(res1);

    }
}

