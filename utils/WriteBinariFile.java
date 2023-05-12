package utils;

import java.io.*;

/**
 * Inputs
 * @author Jaume Gàndara
 * @version 1.0
 * @date 12/05/2023
 */
public class WriteBinariFile {
    private WriteBinariFile(){}

    /**
     * Mètode per escriure a continuació un valor String en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus String, que és el valor que volem escriure dins del fitxer
     */
    private static void writeString(String rutaFitxer, String dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            writer.writeUTF(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per escriure a continuació un valor int en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus int, que és el valor que volem escriure dins del fitxer
     */
    private static void writeInt(String rutaFitxer, int dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            writer.writeInt(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per escriure a continuació un valor long en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus long, que és el valor que volem escriure dins del fitxer
     */
    private static void writeLong(String rutaFitxer, long dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            writer.writeLong(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per escriure a continuació un valor float en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus float, que és el valor que volem escriure dins del fitxer
     */
    private static void writeFloat(String rutaFitxer, float dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            writer.writeFloat(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per escriure a continuació un valor double en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus double, que és el valor que volem escriure dins del fitxer
     */
    private static void writeDouble(String rutaFitxer, double dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            writer.writeDouble(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per sobreescriure a continuació un valor String en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus String, que és el valor que volem escriure dins del fitxer
     */
    private static void overwriteString(String rutaFitxer, String dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName);
            writer = new ObjectOutputStream(file);

            writer.writeUTF(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per sobreescriure a continuació un valor int en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus int, que és el valor que volem escriure dins del fitxer
     */
    private static void overwriteInt(String rutaFitxer, int dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName);
            writer = new ObjectOutputStream(file);

            writer.writeInt(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per sobreescriure a continuació un valor long en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus long, que és el valor que volem escriure dins del fitxer
     */
    private static void overwriteLong(String rutaFitxer, long dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName);
            writer = new ObjectOutputStream(file);

            writer.writeLong(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per sobreescriure a continuació un valor float en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus float, que és el valor que volem escriure dins del fitxer
     */
    private static void overwriteFloat(String rutaFitxer, float dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName);
            writer = new ObjectOutputStream(file);

            writer.writeFloat(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }

    /**
     * Mètode per sobreescriure a continuació un valor double en un fitxer binari
     * @since 1.0
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus double, que és el valor que volem escriure dins del fitxer
     */
    private static void overwriteDouble(String rutaFitxer, double dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName);
            writer = new ObjectOutputStream(file);

            writer.writeDouble(dada);
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar buffer d'escriptura!");
                }
            }
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    System.out.println("ERROR: Intentant tancar el rutaFitxer!");
                }
            }
        }
    }
}
