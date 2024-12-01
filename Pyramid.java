import java.util.Scanner;
class Pyramid
{
    void palindromepyramid()
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
            }

            for(j=i;j>0;j--)
            {
                System.out.print(j);
            }

            for(j=2;j<=i;j++)
            {   
                    System.out.print(j);   
            }
            System.out.println();
        }
    }
    void snumpyramid() 
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");  
                }
            }

            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }

            System.out.println();
        }
    }
    void ad2()
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=2*n-1;j++)
            {
                if(j<=n-i || j>2*n-i)
                {
                    System.out.print("-");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    void butterfly()
    {
        int i,j,n=4;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=2*n;j++)
            {
                if(j<=i || j>2*n-i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for(i=n;i>0;i--)
        {
            for(j=1;j<=n*2;j++)
            {
                if(j<=i || j>2*n-i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void zero_onetri()
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((i+j+1)%2+" ");
            }
            System.out.println();
        }
    }
    void floyd()
    {
        int i,j,s=1,n=5;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(s);
                s++;
            }
            System.out.println();
        }
    }
    void numpyr()
    {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void InvertedHalfP180(int n)
    {
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j>=n+1-i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
     void pyramid()
     {
        int r,c,l=5,u=5;
        for(r=1;r<=5;r++)
        {
            for(c=1;c<=9;c++)
            {
                if(c>=l &&c<=u)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            l--;u++;
            System.out.println();
        }
     }
     void invpyramid()
     {
        int r,c,l=1,u=9;
        for(r=1;r<=5;r++)
        {
            for(c=1;c<=9;c++)
            {
                if(c>=l &&c<=u)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            l++;u--;
            System.out.println();
        }  
     }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Bhej de bhai value");
        //int n=sc.nextInt();
        Pyramid p=new Pyramid();
        //p.InvertedHalfP180(n);
        //p.pyramid();
        //p.invpyramid();
        //p.numpyr();
        //p.floyd();
        //p.zero_onetri();
        //p.butterfly();
        //p.ad2();
        //p.snumpyramid();
        p.palindromepyramid();
        sc.close();
    }
}