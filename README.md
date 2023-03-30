# Utilities
## 1. Control d'errors (versió 1.1)
### 1.1 inputStringWord
    * Mètode per llegir una frase amb un valor String
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @return w de tipus String, que és la paraula que ha introduït l'usuari
### 1.2 inputStringSentence
    * Mètode per llegir una frase amb un valor String
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @return s de tipus String, que és la frase que ha introduït l'usuari
### 1.3 inputByte
    * Mètode per llegir un valor byte amb control d'errors
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return value de tipus byte, que és el valor que retorna
### 1.4 inputByte
    * Mètode per llegir un valor byte amb control d'errors i amb màxims i mínims
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @param min de tipus byte, que és el valor mínim
    * @param max de tipus byte, que és el valor màxim
    * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
    * @return value de tipus byte, que és el valor que retorna
### 1.5 inputShort
    * Mètode per llegir un valor short amb control d'errors
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return value de tipus short, que és el valor que retorna
### 1.6 inputShort
    * Mètode per llegir un valor short amb control d'errors i amb màxims i mínims
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @param min de tipus short, que és el valor mínim
    * @param max de tipus short, que és el valor màxim
    * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
    * @return value de tipus short, que és el valor que retorna
### 1.7 inputInt
    * Mètode per llegir un valor int amb control d'errors
    * @since 1.0
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return value de tipus int, que és el valor que retorna
### 1.8 inputInt
    * Mètode per llegir un valor int amb control d'errors i amb màxims i mínims
    * @since 1.0
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @param min de tipus int, que és el valor mínim
    * @param max de tipus int, que és el valor màxim
    * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
    * @return value de tipus int, que és el valor que retorna
### 1.9 inputLong
    * Mètode per llegir un valor long amb control d'errors
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return value de tipus long, que és el valor que retorna
### 1.10 inputLong
    * Mètode per llegir un valor long amb control d'errors i amb màxims i mínims
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @param min de tipus long, que és el valor mínim
    * @param max de tipus long, que és el valor màxim
    * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
    * @return value de tipus long, que és el valor que retorna
### 1.11 inputFloat
    * Mètode per llegir un valor float amb control d'errors
    * @since 1.0
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return value de tipus float, que és el valor que retorna
### 1.12 inputFloat
    * Mètode per llegir un valor float amb control d'errors i amb màxims i mínims
    * @since 1.0
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @param min de tipus float, que és el valor mínim
    * @param max de tipus float, que és el valor màxim
    * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
    * @return value de tipus float, que és el valor que retorna
### 1.13 inputDouble
    * Mètode per llegir un valor double amb control d'errors
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return value de tipus double, que és el valor que retorna
### 1.14 inputDouble
    * Mètode per llegir un valor double amb control d'errors i amb màxims i mínims
    * @since 1.1
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error1 de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @param min de tipus double, que és el valor mínim
    * @param max de tipus double, que és el valor màxim
    * @param error2 de tipus String, que és el text que veu l'usuari si el valor està fora de rang
    * @return value de tipus double, que és el valor que retorna
## 2. Convertidors (versió 1.2)
### 2.1 converterCelsiusFahrenheit
    * Mètode per convertir els ºC en ºF
    * @since 1.2
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return La temperatura en Fahrenheit
### 2.2 converterCelsiusKelvin
    * Mètode per convertir els ºC en ºK
    * @since 1.2
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return La temperatura en Kelvin
### 2.3 converterFahrenheitCelsius
    * Mètode per convertir els ºF en ºC
    * @since 1.2
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return La temperatura en Celsius
### 2.4 converterFahrenheitKelvin
    * Mètode per convertir els ºF en ºK
    * @since 1.2
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return La temperatura en Kelvin
### 2.5 converterKelvinCelsius
    * Mètode per convertir els ºK en ºC
    * @since 1.2
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return La temperatura en Celsius
### 2.6 converterKelvinFahrenheit
    * Mètode per convertir de ºK a ºF
    * @since 1.2
    * @param text de tipus String, que és el text que veu l'usuari
    * @param error de tipus String, que és el text que veu l'usuari si hi ha un error de tipatge
    * @return La temperatura en Fahrenheit
### 2.7 converterKilo
    * Mètode per convertir de Libra a Kilogram
    * @since 1.0
    * @param lb de tipus double, que és el valor que l'usuari vol passar a Kilograms
    * @return kg de tipus double, que és el valor de l'usuari, ja passat a Kilograms
### 2.8 converterLibra
    * Mètode per convertir de Kilograms a Libras
    * @since 1.0
    * @param kg de tipus double, que és el valor que l'usuari vol passar a Libras
    * @return lb de tipus double, que és el valor de l'usuari, ja passat a Libras
### 2.9 converterFoot
    * Mètode per convertir de Metres a Peus
    * @since 1.1
    * @param m de tipus double, que és el valor que l'usuari vol passar a Peus
    * @return ft de tipus double, que és el valor que l'usuari, ja ha passat a Metres
### 2.10 converterMeter
    * Mètode per convertir de Peus a Metres
    * @since 1.1
    * @param ft de tipus double, que és el valor que l'usuari vol passar a Metres
    * @return m de tipus double, que és el valor que l'usuari, ja ha passat a Peus
## 3. Colors (Versió 1.0)
### 3.1
    * BLACK = Lletra de color negre
    * RED = Lletra de color vermella
    * GREEN = Lletra de color verda
    * YELLOW = Lletra de color groga
    * BLUE = Lletra de color blava
    * PURPLE = Lletra de color lila
    * CYAN = Lletra de color cyan
    * WHITE = Lletra de color blanca
### 3.2
    * BLACK_BACKGROUND = Text amb fons de color negre
    * RED_BACKGROUND = Text amb fons de color vermell
    * GREEN_BACKGROUND = Text amb fons de color verd
    * YELLOW_BACKGROUND = Text amb fons de color grog
    * BLUE_BACKGROUND = Text amb fons de color blau
    * PURPLE_BACKGROUND = Text amb fons de color lila
    * CYAN_BACKGROUND = Text amb fons de color cyan
    * WHITE_BACKGROUND = Text amb fons de color blanc
### 3.3
    * RESET = Acabar canviar color