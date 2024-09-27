//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static boolean isPrime(int n) {
        if (n <=1)
         return false;

        for (int i = 2; i<n; i++)
            if (n%i==0)
                return false;
        return true;

    }
    public static void main(String[] args) {
            if (isPrime(10))
                System.out.println("true");
            else
                System.out.println("false");
            if (isPrime(16))
                System.out.println("true");
            else
                System.out.println("false");

        }

}