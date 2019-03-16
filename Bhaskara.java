import java.util.Scanner;

class Bhaskara {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero para o valor de b : ");
        float b = input.nextFloat();

        System.out.print("Digite um numero para o valor de a : ");
        float a = input.nextFloat();

        System.out.print("Digite um numero para o valor de c : ");
        float c = input.nextFloat();

        double delta = Math.pow(b, 2f) - (4 * a * c);

        System.out.print("Delta = ");
        System.out.println(delta);

        double x1 = ((-b + Math.sqrt(delta)) / 2 * a);
        double x2 = ((-b - Math.sqrt(delta)) / 2 * a);

        System.out.print("X1 = ");
        System.out.println(x1);
        System.out.print("X2 = ");
        System.out.println(x2);
    }
}