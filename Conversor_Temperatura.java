/**
 * Aquest script conte 2 mètodes per fer la conversió de Cº a Fº o al reves
 * @author Jaume Gàndara
 * @version 1.0
 * @date 27/1/2023
 */
public class Conversor_Temperatura {
    /**
     * Mètode main
     * @param args
     */
    public static void main(String[] args) {
        menu();
    }

    /**
     * Menú que et dona les opcions per fer la conversió de Cº a Fº o al reves
     * @since 1.0
     */
    private static void menu(){
        int opcio;
        float temperatura;

        do {
            opcio = Control_Errors.inputInt("""
                            Les opcions del menú són:
                            \t1- Canviar a Celsius
                            \t2- Canviar a Fahrenheit
                            \t3- Sortir""",
                    "ERROR: Tipatge incorrecte");
            switch (opcio){
                case 1:
                    temperatura = celsius();
                    System.out.println("La temperatura en Celsius és: " + temperatura);
                    break;
                case 2:
                    temperatura = fahrenheit();
                    System.out.println("La temperatura en Fahrenheit és: " + temperatura);
                    break;
                case 3:
                    System.out.println("Adeu...");
                    break;
                default:
                    System.out.println("Valor fora de rang");
                    break;
            }
        }while(opcio != 3);
    }

    /**
     * Mètode per convertir els Fº en Cº
     * @since 1.0
     * @return temperaturaCelsius de tipus float, conte la temperatura en Celsius
     */
    public static float celsius() {
        float temperaturaFahrenheit = Control_Errors.inputFloat("Introdueix la temperatura en Fahrenheit per convertir-la en Celsius: ", "ERROR: Tipatge incorrecte");
        float temperaturaCelsius = (float) ((5.0 /9) * (temperaturaFahrenheit - 32));
        return temperaturaCelsius;
    }

    /**
     * Mètode per convertir els Cº en Fº
     * @since 1.0
     * @return temperaturaFahrenheit de tipus float, conte la temperatura en Fahrenheit
     */
    public static float fahrenheit() {
        float temperaturaCelsius = Control_Errors.inputFloat("Introdueix la temperatura en Celsius per convertir-la en Fahrenheit: ", "ERROR: Tipatge incorrecte");
        float temperaturaFahrenheit = (float) ((9.0 / 5) * temperaturaCelsius + 32);
        return temperaturaFahrenheit;
    }
}
