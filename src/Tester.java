/**
 * @author eduar
 * This is the main class that prints calculation
 */
public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        /**
         * Calls the operation class
         */
        ArithmeticOperators operation = new ArithmeticOperators();

        System.out.println(operation.sum(10, 3));
        System.out.println(operation.sub(10, 3));
        System.out.println(operation.mul(10, 3));
        System.out.println(operation.div(10, 3));

    }
}
