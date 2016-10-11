package ED_02_Recursividade;

/**
 *
 * @author Wesley A.V
 */
public class Exer_03 {

    public static int Fibonacci(int num) {

        if (num < 2) {
            return num;
        } else {
            return Fibonacci(num - 1) + Fibonacci(num - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n SEQUENCIA FIBONACCI: ");
        //int num2 = ler1.nextInt();

        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + "):" + Fibonacci(i) + "\n");
        }
    }
}
