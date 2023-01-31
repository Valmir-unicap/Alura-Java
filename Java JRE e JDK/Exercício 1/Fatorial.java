import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fatorial");
        System.out.println("");
        int fatorial = 1;
        for (int i = 1; i < 20; i=i+1) {
            fatorial = fatorial * i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
