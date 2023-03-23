package utils;

import java.util.Scanner;

/**
 * Utilities
 * @author Jaume Gàndara
 * @version 1.0
 * @date 23/03/2023
 */
public final class Utilities {
    static Scanner input = new Scanner(System.in);

    private Utilities(){}

    /**
     * Mètode per llegir un valor String
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @return t de tipus String, que és el text que ha introduït l'usuari
     */
    public static String inputString(String text){
        System.out.print(text);
        String t;
        return t = input.nextLine();
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
     * Mètode per convertir els Fº en Cº
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return temperaturaCelsius de tipus float, conte la temperatura en Celsius
     */
    public static float converterCelsius(String text, String error) {
        float temperaturaFahrenheit = inputFloat(text, error);
        float temperaturaCelsius = (float) ((5.0 /9) * (temperaturaFahrenheit - 32));
        return temperaturaCelsius;
    }

    /**
     * Mètode per convertir els Cº en Fº
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return temperaturaFahrenheit de tipus float, conte la temperatura en Fahrenheit
     */
    public static float converterFahrenheit(String text, String error) {
        float temperaturaCelsius = inputFloat(text, error);
        float temperaturaFahrenheit = (float) ((9.0 / 5) * temperaturaCelsius + 32);
        return temperaturaFahrenheit;
    }

    /**
     * Mètode per convertir de Libra a Kilogram
     * @since 1.0
     * @param lb de tipus double, que és el valor que l'usuari vol passar a Kilograms
     * @return kg de tipus double, que és el valor de l'usuari, ja passat a Kilograms
     */
    public static double converterKilo(double lb){
        double kilo = lb / 2.20462262;
        return kilo;
    }

    /**
     * Mètode per convertir de Kilograms a Libras
     * @since 1.0
     * @param kg de tipus double, que és el valor que l'usuari vol passar a Libras
     * @return lb de tipus double, que és el valor de l'usuari, ja passat a Libras
     */
    public static double converterLibra(double kg){
        double libra = kg * 2.20462262;
        return libra;
    }
}
