public class Main {
    public static void main(String[] args) {
//        for(int i=8; i >= 2; i--){
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
//        }

        int p = 0;
        for (int i=0; i < 1000; i++){
            if (isPrime(i)){
                p++;
                System.out.println(i);
            }
            if (p > 15){
                break;
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        for (int i=2; i <= (long) Math.sqrt(n); i++){
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
