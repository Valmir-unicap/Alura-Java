import java.util.InputMismatchException;
import java.util.Scanner;
public class TratandoEntradaNumerica {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continua;
        continua = true;
        menu();
        
        do {
            
            try {
                int a;
                System.err.print("Digite um numero: ");
                a = in.nextInt();
                continua = false;
            } catch (InputMismatchException e) {
                System.err.println("Erro esparava numero inteiro");
                in.nextLine();//limpa a variavel
            }
            
        } while (continua);
        System.out.println("Entrada numerica válida! ");
        
    }
    public static void menu(){
        System.out.println("");
        System.out.println("Tratando entradas de variaveis numerica inteiras");
        System.out.println("");
    }
}
