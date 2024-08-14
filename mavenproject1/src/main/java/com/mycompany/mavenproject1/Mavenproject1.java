package com.mycompany.mavenproject1;


import java.io.BufferedReader;
import java.io.FileReader;

public class Mavenproject1 {

    public static void main(String[] args) {
        try {
            FileReader archivoFisico = new FileReader("codigos_postales.csv");
            
            BufferedReader archivoLogico = new BufferedReader(archivoFisico);
            String registro = null;
            int Rural = 0;
            int Urbano = 0;
            int contador = 0;
            archivoLogico.readLine();
            String campos[];

            while ( (registro = archivoLogico.readLine()) != null ) {
                campos = registro.split(",");
                if ("Urbano".equals(campos[2])) {
                    Rural++;
                }else{
                    Urbano++;
                }
                contador++;
            }
            System.out.println("las ubicaciones rurales son: "+ Rural);
            System.out.println("las ubicaciones urbanas son: "+ Urbano);
            archivoLogico.close();
            archivoFisico.close();
        } catch (Exception e) {
        }
    }
}