public class fecha{
  public static void main(String[] args) {
        String fecha = "12-02-2024";
        
        // Separar la fecha en día, mes y año usando el separador "-"
        String[] partes = fecha.split("-");
        
        // Convertir cada parte de la fecha a un número entero
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int anio = Integer.parseInt(partes[2]);
        
        // Sumar los valores numéricos
        int suma = dia + mes + anio;
        
        // Imprimir el resultado
        System.out.println("La suma de los valores de la fecha " + fecha + " es: " + suma);
  }
}
