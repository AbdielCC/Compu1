/*
*En este programa se realizara la impresion de la tabla de verdad del or
*@author Ulises Abdiel Cabello Cardenas
*@version 1
*/
public class tabla{
  public static void main(String[] args) {
//@param se define a como el primer valor de la variable a usar para la tabla de verdad
//@param b es el otro valor de la variable a usar
//@param resultado es donde se asigna el valor de la operacion or
      boolean a;
      boolean b;
      boolean resultado;
      a=true;
      b=true;
      String espacio="---------------";
      System.out.println(espacio);
      System.out.println("| A | B | A || B |");
      System.out.println(espacio);
      resultado=a||b;
      System.out.println("| T | T |"+ resultado);
      a=false;
      resultado=a||b;
      System.out.println("| F | T |"+ resultado);
      a=true;
      b=false;
      resultado=a||b;
      System.out.println("| T | F |"+ resultado);
      a=false;
      b=false;
      resultado=a||b;
      System.out.println("| F | F |"+ resultado);
      System.out.println(espacio);
  }
}

