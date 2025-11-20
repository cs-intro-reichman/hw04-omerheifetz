public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args [0]);
        boolean [] isPrime = new boolean[n+1];
        int p = 2;
        int primeCounter = 0;
        int primeStatistics = 0;
        isPrime [0] = false;
        isPrime [1] = false;
        for (int i=2; i<isPrime.length; i++) {
            isPrime [i] = true;
        }
        for (int i=2; i<=(int) Math.sqrt(n); i++) {
            for (int j=i+1; j<isPrime.length; j++) {
                if (j%i == 0) {
                    isPrime [j] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i=2; i<isPrime.length; i++) {
            if (isPrime [i] == true) {
                primeCounter++;
                System.out.println(i);
            }
        }
        primeStatistics = (int) (((double) primeCounter/n)*100);
        System.out.println("There are " + primeCounter + " primes between 2 and " + n + " (" + primeStatistics + "% are primes)");
    }
}