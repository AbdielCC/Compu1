/*
*En este programa se desarrollara el calculo de el area y perimetro de un circulo
*@author Ulises Abdiel Cabello Cardenas
*@version 1
*/
public class circulo{
  public static void main(String[] args) {
    //@param diametro se especifica el diametro de el ciculo
    //@param pi se especifica la constante pi
    //@param area donde se colocara el area a calcular
    //@perimetro donde se colocara el perimetro a calcular
      int diametro=32;
      final float pi =3.14f;
      float area;
      float perimetro;
      area= pi * diametro;
      perimetro= pi*((diametro/2)*(diametro/2));
      System.out.println(area);
      System.out.println(perimetro);
  }
}