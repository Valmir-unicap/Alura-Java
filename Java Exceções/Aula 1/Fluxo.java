public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
            try { //bloco de código perigoso.
                int a = i / 0; //erro aritmético, não se pode dividir por zero.
            }catch (ArithmeticException e){ //caso ocorre erro aritmético, ele vai executar o que está dentro do catch
                System.out.println("Erro aritmético, você tentou dividir por zero.");
            }
        }
        System.out.println("Fim do metodo2");
    }
}
