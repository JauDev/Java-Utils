import java.util.Scanner;

public class Control_Errors {
    /**
     * Mètode main
     * @param args
     */
    public static void main(String[] args) {
        int opcio = 0;

        do {
            opcio = inputInt("Escull el mètode a executar:" +
                                        "\n\t1.- inputInt" +
                                        "\n\t2.- inputIntMinMax" +
                                        "\n\t3.- inputFloat" +
                                        "\n\t4.- inputFloatMinMax" +
                                        "\n\t5.- Sortir\n",
                                "ERROR: Tipatge incorrecte");
            switch (opcio){
                case 1:
                    inputInt("Escriu un valor: ","ERROR: Tipatge incorrecte");
                    break;
                case 2:
                    inputIntMinMax("Escriu un valor entre 1-10: ",
                                    "ERROR: Tipatge incorrecte",
                                    1,
                                    10,
                                    "ERROR: Valor fora de rang");
                    break;
                case 3:
                    inputFloat("Escriu un valor: ","ERROR: Tipatge incorrecte");
                    break;
                case 4:
                    inputFloatMinMax("Escriu un valor entre 1-10: ",
                                        "ERROR: Tipatge incorrecte",
                                        1,
                                        10,
                                        "ERROR: Valor fora de rang");
                    break;
                default:
                    System.out.println("ERROR: Valor fora de rang");
                    break;
            }
        }while(opcio !=5);
    }

    /**
     * Mètode per llegir un valor int amb control d'errors
     * @param text de tipus String
     * @param error de tipus String
     * @return x de tipus int
     */
    private static int inputInt(String text, String error){
        Scanner input = new Scanner(System.in);

        int x = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                x = input.nextInt();
            }
            input.nextLine();
        } while (!correctTyping);

        return x;
    }

    /**
     * Mètode per llegir un valor int amb control d'errors i amb màxims i mínims
     * @param text de tipus String
     * @param error1 de tipus String
     * @param min de tipus int
     * @param max de tipus int
     * @param error2 de tipus String
     * @return
     */
    private static int inputIntMinMax(String text, String error1,int min, int max, String error2){
        Scanner input = new Scanner(System.in);

        int x = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                x = input.nextInt();
                if (min > x || max < x) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return x;
    }

    /**
     * Mètode per llegir un valor float amb control d'errors
     * @param text de tipus String
     * @param error de tipus String
     * @return x de tipus float
     */
    private static float inputFloat(String text, String error){
        Scanner input = new Scanner(System.in);

        float x = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                x = input.nextFloat();
            }
            input.nextLine();
        } while (!correctTyping);

        return x;
    }

    /**
     * Mètode per llegir un valor float amb control d'errors i amb màxims i mínims
     * @param text de tipus String
     * @param error1 de tipus String
     * @param min de tipus float
     * @param max de tipus float
     * @param error2 de tipus String
     * @return x de tipus float
     */
    private static float inputFloatMinMax(String text, String error1,float min, float max, String error2){
        Scanner input = new Scanner(System.in);

        float x = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                x = input.nextFloat();
                if (min > x || max < x) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return x;
    }
}