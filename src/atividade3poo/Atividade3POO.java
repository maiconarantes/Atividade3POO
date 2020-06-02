/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade3poo;

import javax.swing.JOptionPane;

/**
 *
 * @author Maicon
 */
public class Atividade3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
   {
     
      float peso, altura;
      float imc;
      String classifica;
      
      
      peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso:  (kg):"));
      altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura: (m):"));
      
      imc = (float) (peso/(altura * altura));
      
      if (imc <= 19)
         classifica = "Abaixo do Peso";
      else
         if (imc <= 25)
            classifica = "Peso ideal";
         else
            if (imc <= 30)
               classifica = "Acima do Peso";
            else
               if (imc <= 35)
                  classifica = "Obesidade Leve";
               else
                  classifica = "Obesidade";
      
      
 
      JOptionPane.showMessageDialog(null, "Seu IMC = "+imc+" - " +classifica);
     
   }
}