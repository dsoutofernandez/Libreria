/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteCod;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author dsoutofernandez
 */
public class EntradaDatos {
    
    
    public int introducir(int num){
        
            int numero=0;
        
        switch (num) {

            case 0:

                System.out.println("Introduce un numero");
                Scanner scan = new Scanner(System.in);
                numero = scan.nextInt();

            case 1:

                String var = JOptionPane.showInputDialog("Introduce un numero:");
                numero = Integer.parseInt(var);

            default:

                JOptionPane.showInputDialog("Las cagao!!!");

        }
        
    return numero;
    
    }
    
    
    
}
