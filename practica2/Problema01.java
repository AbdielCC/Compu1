/**
 * Archivo a modificar.
 * Modifica el código ASCII que representa a un camello y agrega una cola.
 * @author Ulises Abdiel Cabello Cardenas      (modificar a su respectivo nombre y agrega tus datos).
 * @version 1.0                 (modifica el número de versión).
 * @date 12 feb 2024.           (modifica la fecha a la fecha de elaboración).
 */

public class Problema01{
    public static void main(String[] pps){
	String camello;
	camello =
	    "               Camello\n" +
	    "                     .--.      .'  `.\n" +
	    "                   .' . :\\    /   :  L\n" +
	    "                   F     :\\  /   . : |        .-._\n" +
	    "                  /     :  \\/        J      .' ___\\\n" +
	    "                 J     :   /      : : L    /--'   ``.\n" +
	    "                 F      : J           |  .<'.o.  `-'>\n" +
	    "                /        J             L \\_>.   .--w)\n" +
	    "               J        /              \\_/|   . `-__|\n" +
	    "               F                        / `    -' /|)\n" +
	    "              |   :                    J   '        |\n" +
	    "             .'   ':                   |    .    :  \\\n" +
	    "            /                          J      :     |L\n" +
	    "           F                              |     \\   ||\n" +
	    "          F .                             |   :      |\n" +
	    "         F  |                             ; .   :  : F\n" +
	    "        /   |                                     : J\n" +
	    "       J    J             )                ;        F\n" +
	    "       |     L           /      .:'                J\n" +
	    "      'F:     L        ./       :: :       .       F\n" +
	    "      `F:     .\\    `:.J         :::.             J\n" +
	    "      J       ::\\    `:|        |::::\\            |\n" +
	    "      J        |:`.    J        :`:::\\            F\n" +
	    "       L   :':/ \\ `-`.  \\       : `:::|        .-'\n" +
	    "       |     /   L    >--\\         :::|`.    .-'\n" +
	    "       J    J    |    |   L     .  :::: :`, /\n" +
	    "        L   F    J    )   |        >::   : /\n" +
	    "        |  J      L   F   \\     .-.:'   . /\n" +
	    "        ): |     J   /     `-   | |   .--'\n" +
	    "        /  |     |: J        L  J J   )\n" +
	    "        L  |     |: |        L   F|   /\n" +
	    "        \\: J     \\:  L       \\  /  L |\n" +
	    "         L |      \\  |        F|   | )\n" +
	    "         J F       \\ J       J |   |J\n" +
	    "          L|        \\ \\      | |   | L\n" +
	    "          J L        \\ \\     F \\   F |\n" +
	    "           L\\         \\ \\   J   | J   L\n" +
	    "          /__\\_________)_`._)_  |_/   \\_____\n" +
	    "                              \"\"   `\"\"\"";
	System.out.println(camello);
  camello=camello.replace("  'F", ",-'F");
  camello=camello.replace("  `F", "`-`F");
  System.out.println(camello);
    }
}
//,-'
//`-`
