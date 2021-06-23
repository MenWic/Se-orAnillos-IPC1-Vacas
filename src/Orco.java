public class Orco extends Bestias {

    private static int instanciaOrco=0;
    public Orco(String nombre){
        super(300,45,nombre);
        Orco.instanciaOrco++;
    }
    
    @Override
    public void saludar(){
    	System.out.println("Hola soy una Bestia, mi nombre es: "+this.nombre+" y soy un Orco.");
    }

    public static int getInstancia(){
        return Orco.instanciaOrco;
    }
}
