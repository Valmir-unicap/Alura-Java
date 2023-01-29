public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try{
            metodo1();
        }catch (ArithmeticException | NullPointerException e){
            String mensagem = e.getMessage();
            System.out.println("Ocorreu erro de "+mensagem);
            e.printStackTrace(); //pega o rastro da pilha de execução java
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            Conta c = null;
            c.depositar(); // Erro objeto vazio
        }
        System.out.println("Fim do metodo2");
    }
}
