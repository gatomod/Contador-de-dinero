
package contador.de.dinero;

import javax.swing.JOptionPane;

public class ContadorDeDinero {

    public static void main(String[] args) {
        //definir datos
        
        //con esta definición pedimos cuantas monedas tiene
        double cent1, cent2, cent5, cent10, cent20, cent50, eur1, eur2, eur5, eur10, eur20, eur50, eur100, eur200;
        //son esta definición multiplicaremos las definiciones anteriores si tenemos mas de 2 monedas
        double centx1, centx2, centx5, centx10, centx20, centx50,eurx1, eurx2, eurx5, eurx10, eurx20, eurx50, eurx100, eurx200;
        double resultado;
        

        //1- pedir datos
        //este es una intro
        JOptionPane.showMessageDialog(null, "Hola, bienvenido al contador de dinero"+"\nCon este programa puedes contar todo el dinero que tienes"+"\n "+"\n¿Cómo funciona?"+"\nTe vamos a pedir cuántas monedas o billetes tienes de una cosa, por ejemplo cuántos billetes de 5 euros tienes"+"\nsi no tienes un billete de 200 o cualquier cosa, pon un 0"+"\nNo acepta billetes de 500 euros, aunque dudo que tengas"+"\n "+"\nDicho todo esto, ya puedes empezar");    
        //Pedir los datos
        cent1 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 1 céntimo tienes?"));
        cent2 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 2 céntimos tienes?"));
        cent5 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 5 céntimos tienes?"));
        cent10 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 10 céntimos tienes?"));
        cent20 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 20 céntimos tienes?"));
        cent50 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 50 céntimos tienes?"));
        eur1 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 1 euro tienes?"));
        eur2 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 2 euros tienes?"));
        eur5 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 5 euros tienes?"));
        eur10 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 10 euros tienes?"));
        eur20 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 20 euros tienes?"));
        eur50 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 50 euros tienes?"));
        eur100 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 100 euros tienes?"));
        eur200 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 200 euros tienes?"));
                
        
        //2- calcular los datos
        //2.1- convertir los datos a cantidades
        centx1 = cent1/100;
        centx2 = cent2/100 * 2;
        centx5 = cent5/100 * 5;
        centx10 = cent10/10;
        centx20 = cent20/10 * 2;
        centx50 = cent50/10 * 5;
        eurx1 = eur1;
        eurx2 = eur2 * 2;
        eurx5 = eur5 * 5;
        eurx10 = eur10 * 10;
        eurx20 = eur20 * 20;
        eurx50 = eur50 * 50;
        eurx100 = eur100 * 100;
        eurx200 = eur200 * 200;
        //2.2- sumar las cantidades
        resultado = centx1 + centx2 + centx5 + centx10 + centx20 + centx50 + eurx1 + eurx2 + eurx5 + eurx10 + eurx20 + eurx50 + eurx100 + eurx200;
        
        
        //decirle la cantidad total
        
       if (resultado < 0.01){
            JOptionPane.showMessageDialog(null,"A ver si nos entendemos, no puedes tener menos de un céntimo"+"\nNo es como en la gasolinera");
        JOptionPane.showMessageDialog(null,"Que no pasa nada"+"\nNo vuelvas a cometer ese error"+"\nQue tengas un buen día");    
       }
       else{
            JOptionPane.showMessageDialog(null,"Tu dinero total es de "+resultado+"€");
        JOptionPane.showMessageDialog(null,"Que pases un buen día");
       }
       
    }   
    
}
