/*
*En este programa se disena el calculo de la diagonal dentro de el cuadrado para calcular el rombo
*@author Ulises Abdiel Cabello Cardenas
*@version 1
*/
public class cuadrado{
/*
*@ param 1 es la medida de la longitud
*@ param mitad calcula la mitad de la longitud
*/
  public static void main(String[] args) {
      float l=2;
      float mitad=l/2;
      System.out.println(Math.sqrt(2*(Math.pow(2, mitad))));
  }
}