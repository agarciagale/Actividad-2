/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Juego 
{
    public static void main(String[] args)
    {
        Jugador p1=new Jugador();
        Jugador p2=new Jugador();
        boolean fin_de_juego=false;  
        int rondasJugadas = 0;    // Número de rondas jugadas
        int empates = 0;
        String opcj1, opcj2;
        
        // Bucle de juego
        do
        {
            System.out.println("***** Ronda: " + rondasJugadas+" *********************\n");
            System.out.println("Numero de empates: "+ empates + "\n");
            opcj1=p1.opcion_al_azar();
            System.out.println("Jugador 1: " + opcj1+"\t Jugador 1 - Partidas ganadas: " + p1.getExitos());
            opcj2 = p2.opcion_al_azar();
            System.out.println("Jugador 2: " + opcj2+"\t Jugador 2 - Partidas ganadas: " + p2.getExitos());
            
            if((opcj1.equals("piedra"))&&(opcj2.equals("papel")))
            {
                System.out.println("Jugador 2 GANA");
                 p1.setexitos();
                
            }
            else if((opcj1.equals("papel"))&&(opcj2.equals("piedra")))
            {
            	 p1.setexitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcj1.equals("piedra"))&&(opcj2.equals("tijeras")))
            {
            	 p1.setexitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcj1.equals("tijeras"))&&(opcj2.equals("piedra")))
            {
            	 p2.setexitos();
                System.out.println("Jugador 2 GANA");
            }
            else if((opcj1.equals("tijeras"))&&(opcj2.equals("papel")))
            {
            	 p1.setexitos();
                System.out.println("Jugador 1 GANA");
            }
            else if((opcj1.equals("papel"))&&(opcj2.equals("tijeras")))
            {
            	p2.setexitos();
                System.out.println("Jugador 2 GANA");
            }
            if(opcj1.equals(opcj2))
            {
            	empates++;
                System.out.println("\n\t\t\t Empate \n");
            }
            rondasJugadas++;
            if((p1.getExitos()>=3)||(p2.getExitos()>=3))
            {
            	fin_de_juego=true;
                System.out.println("FIN DEL JUEGO!!");
            }
            System.out.println();
        } while(!fin_de_juego);
    }
}
/**
 *
 */
class Jugador{
   
    /**
     * Escoge piedra, papel o tijera al azar
     */
    public String opcion_al_azar()
    {
        String opcion="";
        int c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            case 2:
            	opcion=("tijeras");
        }
        return opcion;
    }
    public void setexitos() 
    {
        exitos++;
    }

    public int getExitos() {
        return exitos;
    }

    int exitos;      // número de partidas ganadas
}
