public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            // interrompe o for 
            System.out.println(numero);
            
        }


        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
             // vai para a proxima posiçao do for 
            System.out.println(numero);
            
        }
    }
}
