package Moore;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cabu
 */
public class Algoritmo {
    
    int estados[]= new int[2];
    int alfabeto[]= new int[2];
    String transiciones[][],automata1="Automata 1 \n q    σ    δ\n";
    String automata2="Automata 1 \n q    σ    δ\n",letrasA1[],letrasA2[];
    String estadoini[] = new String[2];
    
    public Algoritmo(){
        preguntasuno();
        preguntasdos();
    }
    
    public void preguntasuno(){
        estados[0]=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cuantos Estados tiene tu primer automata?"));
        alfabeto[0]=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escribe cuantas letras tiene tu primer automata"));
        letrasA1 = new String[alfabeto[0]];
        
        for (int i = 0; i < alfabeto[0]; i++) {
            letrasA1[i]=JOptionPane.showInputDialog(null,"Escribe una letra");
        }
        
        int renglones=(estados[0]*alfabeto[0]);
        transiciones= new String[renglones][3];
        
        int rep=0;
        System.out.println("Automata 1 \n q\tσ\tδ\n");
        for (int i = 0; i < estados[0]; i++) {
            for (int j = 0; j < alfabeto[0]; j++) {
                transiciones[i][0]="q"+rep;
                System.out.print(transiciones[i][0]+"\t");
                automata1+=transiciones[i][0]+"     ";
                transiciones[i][1]=""+letrasA1[j];
                System.out.print(transiciones[i][1]+"\t");
                automata1+=transiciones[i][1]+"     ";
                transiciones[i][2]=JOptionPane.showInputDialog(null,
                        "Ingresa el destino de tu transicion");
                System.out.print(transiciones[i][0]+"\n");
                automata1+=transiciones[i][2]+"     \n";
            }
            rep++;
        }
        JOptionPane.showMessageDialog(null, automata1);
        estadoini[0]=JOptionPane.showInputDialog(null,
                        "Ingresa el estado inicial de tu automata uno");
    }
    
    
    public void preguntasdos(){
        estados[1]=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cuantos Estados tiene tu segundo automata?"));
        alfabeto[1]=Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escribe cuantas letras tiene tu segundo automata"));
        letrasA2 = new String[alfabeto[1]];
        
        for (int i = 0; i < alfabeto[1]; i++) {
            letrasA2[i]=JOptionPane.showInputDialog(null,"Escribe una letra");
        }
        
        int renglones=(estados[1]*alfabeto[1]);
        transiciones= new String[renglones][3];
        
        int rep=0;
        System.out.println("Automata 1");
        System.out.println("q \tσ \tδ");
        for (int i = 0; i < estados[1]; i++) {
            for (int j = 0; j < alfabeto[1]; j++) {
                transiciones[i][0]="q"+rep;
                System.out.print(transiciones[i][0]+"\t");
                transiciones[i][1]=""+letrasA2[j];
                System.out.print(transiciones[i][1]+"\t");
                transiciones[i][2]=JOptionPane.showInputDialog(null,
                        "Ingresa el destino de tu transicion");
                System.out.print(transiciones[i][2]);
                System.out.println("");
            }
            rep++;
        }
        estadoini[0]=JOptionPane.showInputDialog(null,
                        "Ingresa el estado inicial de tu automata dos");
        
    }
    
    
    public static void main(String[] args) {
        Algoritmo x= new Algoritmo();
    }
}

