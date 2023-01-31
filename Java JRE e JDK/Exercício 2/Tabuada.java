import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Tabuada");
        System.out.println("");
        int numero;
        System.out.print("Digite o número que deseja saber a tabuada: ");
        numero = in.nextInt();
        int resultado;
        for (int i = 0; i <= 10; i=i+1) {
            resultado = numero * i;
            System.out.println(numero+ " * " + i + " = "+resultado);
        }
    }
}
