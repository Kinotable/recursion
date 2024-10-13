
public class Main {
    public static double factorial(double k){
        if (k<=1){
            return 1;
        }
        else {
            System.out.println(k);
            return k*factorial(k-1);
        }
    }
    public static int fibonacci(int n){
        if (n==1||n==2){
            return 1;

        }
        else{
            System.out.println(n);
            return (fibonacci(n-1)+ fibonacci(n-2));
        }
    }
    public static int sumofthedigits(int x){
        if (x==0){
            return 0;
        }
        else{

        }
    }

    public static void main(String[] args) {
        //double ans = factorial(100);
        //System.out.println("factorial= "+ans);
        long ans = fibonacci(4);
        System.out.println(ans);

        }
    }
