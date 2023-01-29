public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try{
            metodo1();
        }catch (ArithmeticException e){
            String mensagem1 = e.getMessage();
            System.out.println("Ocorreu erro de "+mensagem1);
        }catch (NullPointerException e){ //se ocorrer erro de objeto vazio, trate o com a mensagem abaixo.
            String mensagem2 = e.getMessage();
            System.out.println("Ocorreu erro de "+mensagem2);
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
