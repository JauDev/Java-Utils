package utils;

import java.io.*;
import java.util.ArrayList;

/**
 * WriteBinariFile
 * @author Jaume Gàndara
 * @version 1.1
 * @date 15/05/2023
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

    /**
     * Mètode per escriure a continuació un array de String en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus String, que és el array que volem escriure dins del fitxer
     */
    private static void writeArrayString(String rutaFitxer, String[] dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.length; i++) {
                writer.writeUTF(dada[i]);
            }
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
     * Mètode per escriure a continuació un array de int en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus int, que és el array que volem escriure dins del fitxer
     */
    private static void writeArrayInt(String rutaFitxer, int[] dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.length; i++) {
                writer.writeInt(dada[i]);
            }
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
     * Mètode per escriure a continuació un array de long en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus long, que és el array que volem escriure dins del fitxer
     */
    private static void writeArrayLong(String rutaFitxer, long[] dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.length; i++) {
                writer.writeLong(dada[i]);
            }
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
     * Mètode per escriure a continuació un array de float en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus float, que és el array que volem escriure dins del fitxer
     */
    private static void writeArrayFloat(String rutaFitxer, float[] dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.length; i++) {
                writer.writeFloat(dada[i]);
            }
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
     * Mètode per escriure a continuació un array de double en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus double, que és el array que volem escriure dins del fitxer
     */
    private static void writeArrayDouble(String rutaFitxer, double[] dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.length; i++) {
                writer.writeDouble(dada[i]);
            }
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
     * Mètode per escriure a continuació un ArrayList<> de String en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus String, que és el ArrayList<> que volem escriure dins del fitxer
     */
    private static void writeArrayListString(String rutaFitxer, ArrayList<String> dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.size(); i++) {
                writer.writeUTF(dada.get(i));
            }
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
     * Mètode per escriure a continuació un ArrayList<> de int en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus int, que és el ArrayList<> que volem escriure dins del fitxer
     */
    private static void writeArrayListInt(String rutaFitxer, ArrayList<Integer> dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.size(); i++) {
                writer.writeDouble(dada.get(i));
            }
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
     * Mètode per escriure a continuació un ArrayList<> de long en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus long, que és el ArrayList<> que volem escriure dins del fitxer
     */
    private static void writeArrayListLong(String rutaFitxer, ArrayList<Long> dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.size(); i++) {
                writer.writeLong(dada.get(i));
            }
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
     * Mètode per escriure a continuació un ArrayList<> de float en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus float, que és el ArrayList<> que volem escriure dins del fitxer
     */
    private static void writeArrayListFloat(String rutaFitxer, ArrayList<Float> dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.size(); i++) {
                writer.writeFloat(dada.get(i));
            }
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
     * Mètode per escriure a continuació un ArrayList<> de double en un fitxer binari
     * @since 1.1
     * @param rutaFitxer de tipus String, que és la ruta del fitxer a escriure
     * @param dada de tipus double, que és el ArrayList<> que volem escriure dins del fitxer
     */
    private static void writeArrayListDouble(String rutaFitxer, ArrayList<Double> dada) {
        File fileName = new File(rutaFitxer);
        FileOutputStream file = null;
        ObjectOutputStream writer = null;

        try {
            file = new FileOutputStream(fileName, true);
            writer = new ObjectOutputStream(file);

            for (int i = 0; i < dada.size(); i++) {
                writer.writeDouble(dada.get(i));
            }
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
