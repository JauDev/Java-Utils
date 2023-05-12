package utils;

import java.util.Scanner;

/**
 * Inputs
 * @author Jaume Gàndara
 * @version 1.2
 * @date 12/05/2023
 */
public final class Inputs {
    static Scanner input = new Scanner(System.in);

    private Inputs(){}

    /**
     * Mètode per llegir una lletra en minúscula amb un valor String
     * @since 1.2
     * @param text de tipus String, que és el text que veu l'usuari
     * @return lletra de tipus String, que és la lletra en minúscula que ha introduït l'usuari
     */
    public static String inputOneLetterMinus(String text){
        String lletra;

        while(true){
            System.out.println(text);
            lletra = input.nextLine();

            if (lletra.matches("[a-z]")){
                return lletra;
            }else{
                System.out.println("ERROR: només pots introduïr una lletra minúscula");
            }
        }
    }

    /**
     * Mètode per llegir una lletra en majúscula amb un valor String
     * @since 1.2
     * @param text de tipus String, que és el text que veu l'usuari
     * @return lletra de tipus String, que és la lletra en majúscules que ha introduït l'usuari
     */
    public static String inputOneLetterMayus(String text){
        String lletra;

        while(true){
            System.out.println(text);
            lletra = input.nextLine();

            if (lletra.matches("[A-Z]")){
                return lletra;
            }else{
                System.out.println("ERROR: només pots introduïr una lletra majúscula");
            }
        }
    }

    /**
     * Mètode per llegir una frase amb un valor String
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @return w de tipus String, que és la paraula que ha introduït l'usuari
     */
    public static String inputStringWord(String text){
        System.out.print(text);
        String w;
        return w = input.next();
    }

    /**
     * Mètode per llegir una frase amb un valor String
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @return s de tipus String, que és la frase que ha introduït l'usuari
     */
    public static String inputStringSentence(String text){
        System.out.print(text);
        String s;
        return s = input.nextLine();
    }

    /**
     * Mètode per llegir un valor byte amb control d'errors
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return value de tipus byte, que és el valor que retorna
     */
    public static byte inputByte(String text, String error){
        byte value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextByte();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextByte();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor byte amb control d'errors i amb màxims i mínims
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @param min de tipus byte, que és el valor mínim
     * @param max de tipus byte, que és el valor màxim
     * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
     * @return value de tipus byte, que és el valor que retorna
     */
    public static byte inputByte(String text, String error1, byte min, byte max, String error2){
        byte value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextByte();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextByte();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor short amb control d'errors
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return value de tipus short, que és el valor que retorna
     */
    public static short inputShort(String text, String error){
        short value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextShort();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextShort();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor short amb control d'errors i amb màxims i mínims
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @param min de tipus short, que és el valor mínim
     * @param max de tipus short, que és el valor màxim
     * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
     * @return value de tipus short, que és el valor que retorna
     */
    public static short inputShort(String text, String error1, short min, short max, String error2){
        short value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextShort();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextShort();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor long amb control d'errors
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return value de tipus long, que és el valor que retorna
     */
    public static long inputLong(String text, String error){
        long value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextLong();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextLong();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor long amb control d'errors i amb màxims i mínims
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @param min de tipus long, que és el valor mínim
     * @param max de tipus long, que és el valor màxim
     * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
     * @return value de tipus long, que és el valor que retorna
     */
    public static long inputLong(String text, String error1, long min, long max, String error2){
        long value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextLong();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextLong();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor int amb control d'errors
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return value de tipus int, que és el valor que retorna
     */
    public static int inputInt(String text, String error){
        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextInt();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor int amb control d'errors i amb màxims i mínims
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @param min de tipus int, que és el valor mínim
     * @param max de tipus int, que és el valor màxim
     * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
     * @return value de tipus int, que és el valor que retorna
     */
    public static int inputInt(String text, String error1, int min, int max, String error2){
        int value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextInt();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextInt();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor float amb control d'errors
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return value de tipus float, que és el valor que retorna
     */
    public static float inputFloat(String text, String error){
        float value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextFloat();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor float amb control d'errors i amb màxims i mínims
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @param min de tipus float, que és el valor mínim
     * @param max de tipus float, que és el valor màxim
     * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
     * @return value de tipus float, que és el valor que retorna
     */
    public static float inputFloat(String text, String error1, float min, float max, String error2){
        float value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextFloat();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextFloat();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor double amb control d'errors
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return value de tipus double, que és el valor que retorna
     */
    public static double inputDouble(String text, String error){
        double value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextDouble();

            if (!correctTyping) {
                System.out.println(error);
            } else {
                value = input.nextDouble();
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }

    /**
     * Mètode per llegir un valor double amb control d'errors i amb màxims i mínims
     * @since 1.1
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @param min de tipus double, que és el valor mínim
     * @param max de tipus double, que és el valor màxim
     * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
     * @return value de tipus double, que és el valor que retorna
     */
    public static double inputDouble(String text, String error1, double min, double max, String error2){
        double value = 0;
        boolean correctTyping;

        do {
            System.out.print(text);
            correctTyping = input.hasNextDouble();

            if (!correctTyping) {
                System.out.println(error1);
            } else {
                value = input.nextDouble();
                if (min > value || max < value) {
                    System.out.println(error2);
                    correctTyping = false;
                }
            }
            input.nextLine();
        } while (!correctTyping);

        return value;
    }
}
