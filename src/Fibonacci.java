import  java.util.Scanner;
public class Fibonacci
{
    public static void main (String[] args) {
        System.out.println("Input: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Output: " + fib(n));
    }
    public static int fib(int n)
    {
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}