public class Exer1 {
    /**
     * Write a method named isDivisible that takes two integers, 
     * n and m, and that returns true if n is divisible by m, and false otherwise.
     * @return true se n for divisivel por m, fcaso contrario retorna falso
     *
     */
    public static boolean isDivisible(int n, int m) {
        if(n % m == 0){

            return true;

        }else {

            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(15, 3));
    }
}
