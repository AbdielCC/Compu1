public class tabla{
  public static void main(String[] args) {
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

