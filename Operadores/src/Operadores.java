import javax.print.DocFlavor.STRING;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
                
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 
        System.out.println(concatenacao); //"?"
        concatenacao = 1+1+1+"1"; //31, pois fez 1+1+1=3 e depois concatenou 1
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1; //1111, depois do número tinha uma string, então ele concatena
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1"; //1111, a partir do momento que detecta caracter ele irá concatenar
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1; //1111, a partir do momento que detecta caracter ele irá concatenar
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1); //13, primeiro realizou a soma e depois ele fez a concatenação
        System.out.println(concatenacao);

        int a, b;
        a = 4;
        b = 5;

        String resultado = a == b? "Vrdadeiro" : "Falso"; //operador ternario
        System.out.println(resultado);

        //operadores relcionais
        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 != num2; 

        System.out.println("Num1 é diferente de num2? " + simNao);

        String nome1 = "Maite";
        String nome2 = new String("Maite");
        String nome3 = "Maite";

        System.out.println(nome1 == nome2); //falso, pois apontam para endereços diferentes
        System.out.println(nome1.equals(nome2)); //verdadeiro
        System.out.println(nome1 == nome3); //verdadeiro, pois possuem o mesmo endereço. Toda vez que você escreve String = ".." o programa verifica se existe uma string idêntica no pool de strings
        //quando usamos o new, estamos criando um novo objeto e isso aloca uma nova área de memória para o objeto

        
        //operadores logicos
        if(true && true) System.out.println("verdadeiro");
    }
}
