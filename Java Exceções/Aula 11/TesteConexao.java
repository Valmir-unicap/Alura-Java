public class TesteConexao {
    public static void main(String[]args){
        try(Conexao conexao = new Conexao()){//ele abre e fecha conexão, pois está embutido no AutoCloseState.
            conexao.leDados();
        }catch (Exception e){
            System.out.println("Erro de conecão!");
        }
    }
}
