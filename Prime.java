public class Prime {
    public static void main(String[] args) {
        int n = 11;
        boolean isPrime = true;

        if (n <= 1) 
        isPrime = false;
        else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(n + (isPrime ? " is a prime number." : " is not a prime number."));
    }
}
