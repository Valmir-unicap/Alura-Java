package alura.aula1.thread;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinhaThread implements Runnable{

    private Long number1;
    private Long number2;
    private Long result;

    public MinhaThread(Long number1, Long number2, Long result) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    @Override
    public void run() {
        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Thread atual: "+Thread.currentThread());
            System.out.print("Digite o primeiro numero: ");
            number1 = in.nextLong();
            System.out.print("Digite o segundo numero: ");
            number2 = in.nextLong();
            result = number1 * number2;
            System.out.println("Resultado = "+result);
        }catch (InputMismatchException e){
            e.printStackTrace();
        }

        System.out.println("Fim da " +Thread.currentThread());
    }
}
