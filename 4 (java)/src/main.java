import java.util.Scanner;
class Main {
    public static
    void main(String args[])
    {
        long t = System.currentTimeMillis();
        System.out.println("Введите размер:");
        Scanner y = new Scanner(System.in);
        int n = y.nextInt();
        int [] z = new int [n];
        int a=0;
        z[0]=0; int b=3;int c=3;
        for (int j=1; j<n;j++)
        {
            z[j]=z[j-1];
            for (int i=1;i<=100000000;i++)
            {
                z[j]+=2*b+c-j;
            }
        }
        long x = System.currentTimeMillis();
        System.out.println(String.format("Времени прошло: %d мс.", x-t));
    }
}
