public class Elfo extends Heroes {

    private static int instanciaElfo=0;

    public Elfo(String nombre){
        super(250, 60, nombre);
        Elfo.instanciaElfo++;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Heroe, mi nombre es: " + this.nombre+" y soy un Elfo.");
    }

    @Override
    public int getAtaque(Personaje defensor){
       if(defensor instanceof  Orco){
           System.out.println("- Furia élfica (ataque aumentado +10 contra Orco) -");
           return this.ataque+10;
       }
       return this.ataque;
    }

    public static int getInstancia(){
        return Elfo.instanciaElfo;
    }
}
