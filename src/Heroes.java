public class Heroes extends Personaje {

    private static int instanciaHeroe=0;

    public Heroes(int vida, int armadura, String nombre){
        super(vida, armadura, nombre);
        Heroes.instanciaHeroe++;
    }

    public void setAtaque(){
        int dado1 = tirarDado(100);
        int dado2 = tirarDado(100);
        if(dado1>=dado2){
            this.ataque = dado1;
        } else {
            this.ataque = dado2;
        }
    }

    public static int getInstancia(){
        return Heroes.instanciaHeroe;
    }    
}
