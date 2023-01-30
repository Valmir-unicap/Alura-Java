public class TesteConexao {
    public static void main(String[]args){
        Conexao conexao = null;
        try{
            conexao = new Conexao();
            conexao.leDados();
        }catch (IllegalStateException e){
            System.out.println("Deu erro de conexação");
        }finally {//sempre vai ser executado dando erro ou não.
            conexao.fecha();
        }
    }
}
