package Moore;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Cabu
 */
public class Algoritmo {

    int estados[] = new int[2];
    int alfabeto[] = new int[2];
    int renglones[] = new int[2];
    int rep = 0,numestafin;
    String transicionesA1[][],transicionesA2[][];
    String automata1 = "Automata 1 \n q    σ    δ\n", letrasA1[],estafinA1[];
    String automata2 = "Automata 2 \n q    σ    δ\n", letrasA2[],estafinA2[];
    String estadoini[] = new String[2];
    
    public Algoritmo() {
        preguntasuno();
        preguntasdos();
        JOptionPane.showMessageDialog(null, automata1);
        JOptionPane.showMessageDialog(null, automata2);
    }

    public void preguntasuno() {
        estados[0] = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cuantos Estados tiene tu primer automata?"));
        alfabeto[0] = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escribe cuantas letras tiene tu primer automata"));
        letrasA1 = new String[alfabeto[0]];

        for (int i = 0; i < alfabeto[0]; i++) {
            letrasA1[i] = JOptionPane.showInputDialog(null, "Escribe una letra");
        }

        renglones[0] = (estados[0] * alfabeto[0]);
        transicionesA1 = new String[renglones[0]][3];

        System.out.println("Automata 1 \n q\tσ\tδ\n");
        for (int i = 0; i < estados[0]; i++) {
            for (int j = 0; j < alfabeto[0]; j++) {
                transicionesA1[i][0] = "q" + rep;
                System.out.print(transicionesA1[i][0] + "\t");
                automata1 += transicionesA1[i][0] + "     ";
                transicionesA1[i][1] = "" + letrasA1[j];
                System.out.print(transicionesA1[i][1] + "\t");
                automata1 += transicionesA1[i][1] + "     ";
                transicionesA1[i][2] = JOptionPane.showInputDialog(null,
                        "Ingresa el destino de tu transicion");
                System.out.print(transicionesA1[i][2] + "\n");
                automata1 += transicionesA1[i][2] + "     \n";
            }
            rep++;
        }
        rep=0;
        estadoini[0] = JOptionPane.showInputDialog(null,
                "Ingresa el estado inicial de tu automata uno");
        automata1+="\nEstado inicial: "+estadoini[0]+"\nEstado finales: ";
        numestafin= Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cuantos estados finales tiene tu automata uno?"));
        estafinA1= new String[numestafin];
        for (int i = 0; i < numestafin; i++) {
            estafinA1[i]=JOptionPane.showInputDialog(null,
                    "Ingrasa un estado final");
            automata1+=estafinA1[i]+", ";
        }
        JOptionPane.showMessageDialog(null, automata1);
    }
    
    
    public void preguntasdos() {
        estados[1] = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cuantos Estados tiene tu segundo automata?"));
        alfabeto[1] = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Escribe cuantas letras tiene tu segundo automata"));
        letrasA2 = new String[alfabeto[1]];

        for (int i = 0; i < alfabeto[1]; i++) {
            letrasA2[i] = JOptionPane.showInputDialog(null, "Escribe una letra");
        }

        renglones[1] = (estados[1] * alfabeto[1]);
        transicionesA2 = new String[renglones[1]][3];

        System.out.println("Automata 2 \n q\tσ\tδ\n");
        for (int i = 0; i < estados[1]; i++) {
            for (int j = 0; j < alfabeto[1]; j++) {
                transicionesA2[i][0] = "q" + rep;
                System.out.print(transicionesA2[i][0] + "\t");
                automata2 += transicionesA2[i][0] + "     ";
                transicionesA2[i][1] = "" + letrasA2[j];
                System.out.print(transicionesA2[i][1] + "\t");
                automata2 += transicionesA2[i][1] + "     ";
                transicionesA2[i][2] = JOptionPane.showInputDialog(null,
                        "Ingresa el destino de tu transicion");
                System.out.print(transicionesA2[i][2]+ "\n");
                automata2 += transicionesA1[i][2] + "     \n";
            }
            rep++;
        }
        estadoini[1] = JOptionPane.showInputDialog(null,
                "Ingresa el estado inicial de tu automata uno");
        automata2+="\nEstado inicial: "+estadoini[1]+"\nEstado finales: ";
        numestafin= Integer.parseInt(JOptionPane.showInputDialog(null,
                "Cuantos estados finales tiene tu automata uno?"));
        estafinA2= new String[numestafin];
        for (int i = 0; i < numestafin; i++) {
            estafinA2[i]=JOptionPane.showInputDialog(null,
                    "Ingrasa un estado final");
            automata2+=estafinA2[i]+", ";
        }
        JOptionPane.showMessageDialog(null, automata2);
    }
    public static void main(String[] args) {
        Algoritmo x = new Algoritmo();
    }
}
