public class Hobbit extends Heroes {

    private static int instanciaHobbit=0;

    public Hobbit(String nombre){
        super(200, 40, nombre);
        Hobbit.instanciaHobbit++;
    }

    @Override
    public void saludar(){
        System.out.println("Hola soy un Heroe, mi nombre es: " + this.nombre+" y soy un Hobbit.");
    }

    @Override
    public int getAtaque(Personaje defensor){
        if(defensor instanceof Trasgo){
            System.out.println("- Miedo de Hobbit (ataque disminuido -5 contra Trasgo) -");
            return this.ataque -5;
        }
        return this.ataque;
    }
    public static int getInstancia(){
        return Hobbit.instanciaHobbit;
    }
}
