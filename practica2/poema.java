public class poema {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        // Modificación de las líneas del poema
        String linea1 = "Hablas y te emocionas,";
        linea1 = RED + linea1.toUpperCase() + RESET;

        String linea2 = "ries y me enamoras,";

        String linea3 = "y es que tu sonrisa encantadora,";
        linea3 = GREEN + linea3.replaceAll("[aeiouAEIOU]", "\\$") + RESET;

        String linea4 = "esta a merced de mi por horas,";

        String linea5 = "o al menos en mi vida eso desearía ahora.";
        linea5 = BLUE + linea5.toLowerCase() + RESET;

        String linea6 = "Como un rayo de sol,";

        // Modificación de la línea 7: alternar colores y quitar espacios
        String linea7 = "como un faro en la noche,";
        linea7 = RED + "como" + GREEN + "un" + RED + "faro" + GREEN + "en" + RED + "la" + GREEN + "noche," + RESET;

        // Imprimir cada línea del poema modificado
        System.out.println(linea1);
        System.out.println(linea2);
        System.out.println(linea3);
        System.out.println(linea4);
        System.out.println(linea5);
        System.out.println(linea6);
        System.out.println(linea7);
    }
}


