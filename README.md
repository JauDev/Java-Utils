# Utilities
## 1. Control d'errors
### inputString
* Mètode per llegir un valor String
* @since 1.0
* @param text de tipus String, que és el text que veu l'usuari
* @return t de tipus String, que és el text que ha introduït l'usuari
### inputInt
    * Mètode per llegir un valor int amb control d'errors
    * @since 1.0
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return value de tipus int, que és el valor que retorna
### inputInt
    * Mètode per llegir un valor int amb control d'errors i amb màxims i mínims
    * @since 1.0
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @param min de tipus int, que és el valor mínim
    * @param max de tipus int, que és el valor màxim
    * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
    * @return value de tipus int, que és el valor que retorna
### inputFloat
    * Mètode per llegir un valor float amb control d'errors
    * @since 1.0
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return value de tipus float, que és el valor que retorna
### inputFloat
     * Mètode per llegir un valor float amb control d'errors i amb màxims i mínims
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @param min de tipus float, que és el valor mínim
     * @param max de tipus float, que és el valor màxim
     * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
     * @return value de tipus float, que és el valor que retorna
## 2. Convertidors
### converterCelsius
     * Mètode per convertir els Fº en Cº
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return temperaturaCelsius de tipus float, conte la temperatura en Celsius
### converterFahrenheit
     * Mètode per convertir els Cº en Fº
     * @since 1.0
     * @param text de tipus String, que és el text que veu l'usuari
     * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
     * @return temperaturaFahrenheit de tipus float, conte la temperatura en Fahrenheit
### converterKilo
     * Mètode per convertir de Libra a Kilogram
     * @since 1.0
     * @param lb de tipus double, que és el valor que l'usuari vol passar a Kilograms
     * @return kg de tipus double, que és el valor de l'usuari, ja passat a Kilograms
### converterLibra
     * Mètode per convertir de Kilograms a Libras
     * @since 1.0
     * @param kg de tipus double, que és el valor que l'usuari vol passar a Libras
     * @return lb de tipus double, que és el valor de l'usuari, ja passat a Libras