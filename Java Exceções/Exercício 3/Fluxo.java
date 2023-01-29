public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try{
            metodo1();
        }catch (ArithmeticException e){ 
            String mensagem = e.getMessage(); //getMessage() pega o motivo da exceção estourada.
            System.out.println("Ocorreu erro aritmético "+mensagem);
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
            int a = i / 0; //erro aritmético, não se pode dividir por zero.
        }
        System.out.println("Fim do metodo2");
    }
}
