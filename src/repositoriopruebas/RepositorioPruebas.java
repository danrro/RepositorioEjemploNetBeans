/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositoriopruebas;
import java.util.Scanner;
/**
 *
 * @author dam107
 */
public class RepositorioPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int j=0;
        
        i = sc.nextInt();
        j = sc.nextInt();
        
        System.out.println("Multi: "+(i*j));
    }
    
}
