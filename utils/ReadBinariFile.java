package utils;

import java.io.*;
import java.util.ArrayList;

/**
 * Inputs
 * @author Jaume Gàndara
 * @version 1.0
 * @date 12/05/2023
 */
public class ReadBinariFile {
    private ReadBinariFile(){}

    /**
     *
     * @param rutaFitxer
     * @param dades
     * @return
     */
    private static ArrayList<String> inputString(String rutaFitxer, ArrayList<String> dades) {
        FileInputStream fitxer = null;
        DataInputStream lector = null;

        try {
            fitxer = new FileInputStream(rutaFitxer);
            lector = new DataInputStream(fitxer);

            while (true){
                String valor = lector.readUTF();
                dades.add(valor);
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (EOFException eofe){
            System.out.println("Warning: Final del fitxer");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (lector != null){
                try {
                    lector.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }
            if (fitxer != null){
                try {
                    fitxer.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }

            return dades;
        }
    }

    /**
     *
     * @param rutaFitxer
     * @param dades
     * @return
     */
    private static ArrayList<Integer> inputInt(String rutaFitxer, ArrayList<Integer> dades) {
        FileInputStream fitxer = null;
        DataInputStream lector = null;

        try {
            fitxer = new FileInputStream(rutaFitxer);
            lector = new DataInputStream(fitxer);

            while (true){
                int valor = lector.readInt();
                dades.add(valor);
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (EOFException eofe){
            System.out.println("Warning: Final del fitxer");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (lector != null){
                try {
                    lector.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }
            if (fitxer != null){
                try {
                    fitxer.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }

            return dades;
        }
    }

    /**
     *
     * @param rutaFitxer
     * @param dades
     * @return
     */
    private static ArrayList<Short> inputShort(String rutaFitxer, ArrayList<Short> dades) {
        FileInputStream fitxer = null;
        DataInputStream lector = null;

        try {
            fitxer = new FileInputStream(rutaFitxer);
            lector = new DataInputStream(fitxer);

            while (true){
                short valor = lector.readShort();
                dades.add(valor);
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (EOFException eofe){
            System.out.println("Warning: Final del fitxer");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (lector != null){
                try {
                    lector.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }
            if (fitxer != null){
                try {
                    fitxer.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }

            return dades;
        }
    }

    /**
     *
     * @param rutaFitxer
     * @param dades
     * @return
     */
    private static ArrayList<Long> inputLong(String rutaFitxer, ArrayList<Long> dades) {
        FileInputStream fitxer = null;
        DataInputStream lector = null;

        try {
            fitxer = new FileInputStream(rutaFitxer);
            lector = new DataInputStream(fitxer);

            while (true){
                long valor = lector.readLong();
                dades.add(valor);
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (EOFException eofe){
            System.out.println("Warning: Final del fitxer");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (lector != null){
                try {
                    lector.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }
            if (fitxer != null){
                try {
                    fitxer.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }

            return dades;
        }
    }

    /**
     *
     * @param rutaFitxer
     * @param dades
     * @return
     */
    private static ArrayList<Float> inputFloat(String rutaFitxer, ArrayList<Float> dades) {
        FileInputStream fitxer = null;
        DataInputStream lector = null;

        try {
            fitxer = new FileInputStream(rutaFitxer);
            lector = new DataInputStream(fitxer);

            while (true){
                Float valor = lector.readFloat();
                dades.add(valor);
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (EOFException eofe){
            System.out.println("Warning: Final del fitxer");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (lector != null){
                try {
                    lector.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }
            if (fitxer != null){
                try {
                    fitxer.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }

            return dades;
        }
    }

    /**
     *
     * @param rutaFitxer
     * @param dades
     * @return
     */
    private static ArrayList<Double> inputDouble(String rutaFitxer, ArrayList<Double> dades) {
        FileInputStream fitxer = null;
        DataInputStream lector = null;

        try {
            fitxer = new FileInputStream(rutaFitxer);
            lector = new DataInputStream(fitxer);

            while (true){
                double valor = lector.readDouble();
                dades.add(valor);
            }
        }catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }catch (EOFException eofe){
            System.out.println("Warning: Final del fitxer");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (lector != null){
                try {
                    lector.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }
            if (fitxer != null){
                try {
                    fitxer.close();
                }catch (IOException ioe) {
                    System.out.println("Excepció explícita de IOE: " + ioe.getMessage());
                }
            }

            return dades;
        }
    }
}
