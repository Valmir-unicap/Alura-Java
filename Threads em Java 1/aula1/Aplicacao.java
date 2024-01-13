package alura.aula1.thread;

public class Aplicacao {
    public static void main(String[] args) {
        System.out.println("Calculadora com Thread");
        System.out.println("=======================================");
        System.out.println("Thread atual: "+Thread.currentThread());
        System.out.println("=======================================");
        Calculadora calculadora = new Calculadora(0L, 0L, 0L);
        calculadora.calcular();
    }
}
