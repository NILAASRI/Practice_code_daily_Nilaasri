//Check Prime Number with Boolean
class PrimeCheck {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;
        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(num + " is prime? " + isPrime);
    }
}
// Output: 29 is prime? true
