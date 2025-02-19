public class App {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("TV Ligada?: " + smartTv.ligada);
        System.out.println("Canal atual?: " + smartTv.canal);
        System.out.println("volume atual?: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada?: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status -> volume?: " + smartTv.volume);

        smartTv.baixarVolume();
        System.out.println("Novo status -> volume?: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo status -> canal?: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo status -> canal?: " + smartTv.canal);
        
        smartTv.mudarCanal(9);
        System.out.println("Novo status -> canal?: " + smartTv.volume);

    }
}
