public class Humano extends Heroes {

    private static int instanciaHumano=0;

    public Humano(String nombre){
        super(180,75,nombre);
        Humano.instanciaHumano++;
    }

    @Override
    public void saludar(){
    	System.out.println("Hola soy una Heroe, mi nombre es: "+this.nombre+" y soy un Humano.");
    }

    public static int getInstancia(){
        return Humano.instanciaHumano;
    }
}
