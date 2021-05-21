/**
 * Write a method named isTriangle that takes three integers as arguments
 * and returns either true or false, depending on whether you can or cannot
 * form a triangle from sticks with the given lengths. 
 * If any of the three lengths is greater than the sum of the other
 * two, you cannot form a triangle.
 */
public class Exer2 {
    /**
     * 
     * @param x inteiro que forma o triangulo
     * @param y inteiro que forma o triangulo
     * @param z inteiro que forma o triangulo
     * @return false se o valor de qualquer um lados for maior que a soma dos outros dois, caso contrario retorna true
     */
    public static boolean isTriangle(int x, int y, int z) {
        
        if(x > Integer.sum(y,z)) {

            return false;

        } if (y > Integer.sum(x,z)) {

            return false;

        } if (z > Integer.sum(y,x)) {

            return false;

        } else {

        return true;

        }
    }

    public static void main(String[] args) {

        boolean triangulo = isTriangle(10, 20, 10) ;
        
        if (triangulo != true) {

            System.out.println("Não é possivel formar um tringulo com esses valores.");

        } else {

            System.out.println("É possivel formar um triangulo com esses valores!");

        }
            
    } 

}
