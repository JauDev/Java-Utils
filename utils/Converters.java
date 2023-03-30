package utils;

import static utils.Inputs.inputFloat;

/**
 * Converters
 * @author Jaume Gàndara
 * @version 1.2
 * @date 30/03/2023
 */
public final class Converters {
    private Converters() {}

    /**
     * Mètode per convertir els ºC en ºF
     * @since 1.2
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return La temperatura en Fahrenheit
     */
    public static float converterCelsiusFahrenheit(String text, String error) {
        float c = inputFloat(text, error);
        return ((9.0f / 5) * c + 32);
    }

    /**
     * Mètode per convertir els ºC en ºK
     * @since 1.2
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return La temperatura en Kelvin
     */
    public static float converterCelsiusKelvin(String text, String error){
        float c = inputFloat(text, error);
        return c + 273.15f;
    }

    /**
     * Mètode per convertir els ºF en ºC
     * @since 1.2
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return La temperatura en Celsius
     */
    public static float converterFahrenheitCelsius(String text, String error) {
        float f = inputFloat(text, error);
        return ((5.0f /9) * (f - 32));
    }

    /**
     * Mètode per convertir els ºF en ºK
     * @since 1.2
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return La temperatura en Kelvin
     */
    public static float converterFahrenheitKelvin(String text, String error){
        float f = inputFloat(text, error);
        return ((f - 32) / 1.8f) + 273.15f;
    }

    /**
     * Mètode per convertir els ºK en ºC
     * @since 1.2
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return La temperatura en Celsius
     */
    public static float converterKelvinCelsius(String text, String error){
        float k = inputFloat(text, error);
        return k - 273.15f;
    }

    /**
     * Mètode per convertir de ºK a ºF
     * @since 1.2
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return La temperatura en Fahrenheit
     */
    public static float converterKelvinFahrenheit(String text, String error){
        float k = inputFloat(text, error);
        return (k - 273.15f) * 1.8f + 32;
    }

    /**
     * Mètode per convertir de Libra a Kilogram
     * @since 1.0
     * @param lb de tipus double, que és el valor que l'usuari vol passar a Kilograms
     * @return kg de tipus double, que és el valor de l'usuari, ja ha passat a Kilograms
     */
    public static double converterKilo(double lb){
        double kilo = lb / 2.20462262;
        return kilo;
    }

    /**
     * Mètode per convertir de Kilograms a Libras
     * @since 1.0
     * @param kg de tipus double, que és el valor que l'usuari vol passar a Libras
     * @return lb de tipus double, que és el valor de l'usuari, ja ha passat a Libras
     */
    public static double converterLibra(double kg){
        double libra = kg * 2.20462262;
        return libra;
    }

    /**
     * Mètode per convertir de Metres a Peus
     * @since 1.1
     * @param m de tipus double, que és el valor que l'usuari vol passar a Peus
     * @return ft de tipus double, que és el valor que l'usuari, ja ha passat a Metres
     */
    public static double converterFoot(double m){
        double ft = m * 3.2808;
        return ft;
    }

    /**
     * Mètode per convertir de Peus a Metres
     * @since 1.1
     * @param ft de tipus double, que és el valor que l'usuari vol passar a Metres
     * @return m de tipus double, que és el valor que l'usuari, ja ha passat a Peus
     */
    public static double converterMeter(double ft){
        double m = ft / 3.2808;
        return m;
    }
}
