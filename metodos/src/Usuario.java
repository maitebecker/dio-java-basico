public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTV smartTv = new SmartTV();

        smartTv.ligar();
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Canal atual? " + smartTv.canal);
       


    }
}
