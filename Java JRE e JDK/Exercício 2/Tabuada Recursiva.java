// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class tabuada {
    
   public static int qtd = 0; // variavel global
  
    public static void main(String[] args) {
        tabuadaRecursiva();
    }

    public static void tabuadaRecursiva(){
        if (qtd==11){
            System.out.println("Fim da tabuada!");
        }else{
            int numero = 9;
            int resultado = numero * qtd;
            System.out.println(resultado);
            qtd=qtd+1;
            tabuadaRecursiva();
        }
    }
} 
