public class Trasgo extends Bestias{

    private static int instanciaTrasgo=0;
    public Trasgo(String nombre){
        super(325,46,nombre);
        Trasgo.instanciaTrasgo++;
    }
    
    @Override
    public void saludar(){
    	System.out.println("Hola soy una Bestia, mi nombre es: "+this.nombre+" y soy un trasgo.");
    }

    public static int getInstancia(){
        return Trasgo.instanciaTrasgo;
    }
}
