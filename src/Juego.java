public class Juego {

    private static Bestias[] ejercitoBestias;
    private static Heroes[] ejercitoHeroes;
    private static int Cantidad = 6;
    
    public Juego(){
        ejercitoBestias = new Bestias[Cantidad];
        ejercitoHeroes = new Heroes[Cantidad];
    }

    public void jugar(){
        System.out.println("\nBienvenido al juego del señor de los anillos: \n\n");
        inicializarHeroes();
        inicializarBestias();
        presentarHeroes();
        presentarBestias();
        System.out.println(" * * * Cantidad de Personajes: "+ Personaje.getInstancia()+" * * *\n");
        System.out.println(" * Número de Héroes: "+Heroes.getInstancia()+" *\n");
        System.out.println(" Elfos: "+ Elfo.getInstancia());
        System.out.println(" Hobbits: "+Hobbit.getInstancia());
        System.out.println(" Humanos: "+ Humano.getInstancia());
        System.out.println("\n * Número de Bestias: "+Bestias.getInstancia()+" *\n");
        System.out.println(" Trasgos: "+Trasgo.getInstancia());
        System.out.println(" Orcos: "+ Orco.getInstancia());
        Pelea.pelear(ejercitoHeroes, ejercitoBestias);
    }

    public static void inicializarHeroes(){
        ejercitoHeroes[0]= new Elfo("Legolas");
        ejercitoHeroes[1]= new Hobbit("Frodo");
        ejercitoHeroes[2] = new Humano("Aragorn");
        ejercitoHeroes[3]= new Elfo("Elrond");
        ejercitoHeroes[4]= new Hobbit("Pippin");
        ejercitoHeroes[5]= new Humano("Boromir");
    }

    public static void inicializarBestias(){
        ejercitoBestias[0] = new Orco("Ucror");
        ejercitoBestias[1] = new Trasgo("Krorbidh");
        ejercitoBestias[2] = new Orco("Azog");
        ejercitoBestias[3] = new Trasgo("Lurtz");
        ejercitoBestias[4] = new Orco("Bolgo");
        ejercitoBestias[5] = new Trasgo("Uldukh");
    }

    public static void presentarHeroes(){
        for(int i = 0; i < ejercitoHeroes.length; i++){
            ejercitoHeroes[i].saludar();
        }
        System.out.println("\n");
    }

    public static void presentarBestias(){
        for(int i = 0; i < ejercitoBestias.length; i++){
            ejercitoBestias[i].saludar();
        }
        System.out.println("\n");
    }
}
