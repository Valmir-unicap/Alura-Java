package alura.aula1.thread;

public class Calculadora {

    private final Long number1;
    private final Long number2;
    private final Long result;

    public Calculadora(Long number1, Long number2, Long result){
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public void calcular() {
        Runnable minhaThread = new MinhaThread(number1,number2,result);
        Thread calcularMultiplicacaoNaThread = new Thread(minhaThread, "Minha Thread #1");
        calcularMultiplicacaoNaThread.start();
    }
}
