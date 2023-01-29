public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try{
            metodo1(); //bloco de código perigoso
        }catch (ArithmeticException e){ //caso haja erro aritmético, dispare a mensagem abaixo.
            System.out.println("Ocorreu erro aritmético");
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
            int a = 9 / 0; //erro aritmético, não se pode dividir por zero.
        }
        System.out.println("Fim do metodo2");
    }
}
