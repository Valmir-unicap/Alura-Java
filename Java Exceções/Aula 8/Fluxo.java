public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Inicio do main");

        try{
            metodo1();
        }catch (ArithmeticException | NullPointerException | MinhaExcecao e){
            String mensagem = e.getMessage();
            System.out.println("Ocorreu erro de = "+mensagem);
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {//Estou usando uma exceção verificada pelo compilador
        System.out.println("Inicio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{//Estou usando uma exceção verificada pelo compilador
        System.out.println("Inicio do metodo2");
        throw new MinhaExcecao("Oiiii, infelizmente deu erro! :(");//pega uma exceção criada por me.
    }
}
