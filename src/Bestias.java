public class Bestias extends Personaje {
    
    private static int instanciaBestias=0;    

    public Bestias(int vida, int armadura, String nombre){
        super(vida, armadura,nombre);
        Bestias.instanciaBestias++;
    }
    
    public void setAtaque(){
        this.ataque = tirarDado(90);
    }

    public static int getInstancia(){
        return Bestias.instanciaBestias;
    }
}
