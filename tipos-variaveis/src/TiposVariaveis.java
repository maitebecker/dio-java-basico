public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        short num1 = 1;
        int num2 = num1;
        num1 = (short) num2; //preciso fazer o cast

        final double PI = 3.14; //declaração de constante. Final, pois só posso atribuir o valor uma vez

        //Declaração
        String ola; //strings são objetos ou instâncias da classe String

        //instânciação
        ola = new String("Olá, mundo");

        System.out.println(ola.length()); //método da classe String
    }
}
