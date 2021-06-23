import java.util.Scanner;

public class Pelea{

    public static Scanner entrada = new Scanner(System.in);
    static int heroes, bestias;
    
    
    public static void pelear(Personaje ejercitoHeroes[], Personaje ejercitoBestias[]){

        char avanzar;
        int nTurnos;
        heroes = 5;
        bestias =5;
        System.out.println("\n\tInicia el combate.");

        do{
            nTurnos=0;
            do{     
                if(ejercitoHeroes[nTurnos] != null && ejercitoBestias[nTurnos] != null){
                    System.out.print("\nIngrese cualquier letra o número para avanzar al encuentro: ");
                    avanzar = entrada.nextLine().charAt(0);
                    ejercitoBestias[nTurnos].recibirAtaque(ejercitoHeroes[nTurnos]);

                    if(ejercitoBestias[nTurnos].getVida() > 0){
                        ejercitoHeroes[nTurnos].recibirAtaque(ejercitoBestias[nTurnos]);

                        if(ejercitoHeroes[nTurnos].getVida() <= 0){
                            eliminarJugador(ejercitoHeroes, nTurnos);
                        }
                    } 
                    else {
                        eliminarJugador(ejercitoBestias, nTurnos);
                    }
                }
                nTurnos++;
            } 
            while(nTurnos < ejercitoHeroes.length);
        }
        while(heroes > 0 && bestias > 0);

        if(heroes > 0){
            System.out.println("Ejercito de Bestias aniquilado. Ganan los Heroes.");
        } 
        else {
            System.out.println("Ejercito de Heroes aniquilado. Ganan las bestias.");
        }
        System.out.println("Fin programa");
    }

    public static void eliminarJugador(Personaje ejercito[], int n){
        if( ejercito[0] instanceof Heroes){

            for(int i = n; i < heroes-1; i++){
                ejercito[i] = ejercito[i+1];
            }
            heroes--;
            ejercito[heroes] = null;
            
        } 
        else if (ejercito[0] instanceof Bestias){
            
            for(int i = n; i < bestias-1; i++){
                ejercito[i] = ejercito[i+1];
            }
            bestias--;
            ejercito[bestias] = null;
        }
    }
}
