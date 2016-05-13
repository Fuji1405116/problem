/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracket;

import javax.swing.JOptionPane;

/**
 *
 * @author Laptop Dream
 */
public class Bracket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String y=JOptionPane.showInputDialog(null,"Input number of case:");
        int x=Integer.parseInt(y);
        for(int z=0;z<x;z++){
        String s=JOptionPane.showInputDialog(null,"Input String:");
        int i=0;
        int a=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                a++;
            }
            if(s.charAt(i)==')'){
                a--;
            }
            if(a<0){
                System.out.println("invalid");
                return;
            }
        }
        if(a==0){
             System.out.println("valid");
        }
        else{
             System.out.println("invalid");
        }
    }
}
    
}
