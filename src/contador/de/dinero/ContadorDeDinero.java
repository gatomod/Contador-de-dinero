
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

      //este es una intro
      JOptionPane.showMessageDialog(null, "Hola, bienvenido al contador de dinero de Gátomo"+"\nCon este programa puedes contar todo el dinero que tienes"+"\n "+"\n¿Cómo funciona?"+"\nTe vamos a pedir cuántas monedas o billetes tienes de una cosa, por ejemplo cuántos billetes de 5 euros/dólares tienes"+"\nsi no tienes un billete o moneda que no tengas, pon un 0"+"\n "+"\nDicho todo esto, ya puedes empezar");
      JOptionPane.showMessageDialog(null, "Este programa acepta Euros y Dólares");
      JOptionPane.showMessageDialog(null, "Para más información visite la página web"+"\n https://gatomo-oficial.github.io/Contador-de-dinero");

      //1- pedir datos

      //Pedir los datos
      cent1 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 1 céntimo/centavo tienes?"));
      cent2 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 2 céntimos/centavos tienes?"));
      cent5 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 5 céntimos/centavos tienes?"));
      cent10 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 10 céntimos/centavos tienes?"));
      cent20 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 20 céntimos/centavos tienes?"));
      cent50 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas de 50 céntimos/centavos tienes?"));
      eur1 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas/billetes de 1 euro/dólar tienes?"));
      eur2 = Double.parseDouble(JOptionPane.showInputDialog("Cuantas monedas/billetes de 2 euros/dólares tienes?"));
      eur5 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 5 euros/dólares tienes?"));
      eur10 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 10 euros/dólares tienes?"));
      eur20 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 20 euros/dólares tienes?"));
      eur50 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 50 euros/dólares tienes?"));
      eur100 = Double.parseDouble(JOptionPane.showInputDialog("Cuantos billetes de 100 euros/dólares tienes?"));
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
          JOptionPane.showMessageDialog(null,"A ver si nos entendemos, no puedes tener menos de un céntimo/centavo"+"\nNo es como en la gasolinera");
      JOptionPane.showMessageDialog(null,"Que no pasa nada"+"\nNo vuelvas a cometer ese error"+"\nQue tengas un buen día");
     }
     else{
          JOptionPane.showMessageDialog(null,"Tu dinero total es de "+resultado+"€/$");
      JOptionPane.showMessageDialog(null,"Recuerda seguirme por Instagram"+"\nGátomo @gatomo_oficial"+"\nVisita la página web"+"\nhttps://gatomo-oficial.github.io/Contador-de-dinero/"+ "\nEntra a mi server de Discord"+"\nhttps://discord.gg/baEBjwU"+"\n\nQue pases un buen día");
     }

    }

}
