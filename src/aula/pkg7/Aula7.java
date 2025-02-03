package aula.pkg7;

import javax.swing.JOptionPane;

public class Aula7 {

    public static void main(String[] args) {
        int n,c,r;
        n = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite o número: "));
        for(c=1;c<=10;c++) {
            r = n*c;
            System.out.println("A tabuada do "+n+" é: "+n+"x"+c+"="+r);
        }
    }
    
}
