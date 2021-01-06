package versionador.java.utils;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface I_ManejodeArchivos {
  void leer_archivo(String filePath) throws FileNotFoundException, IOException;  
  void escribir_archivo(String contenido, String destino) throws FileNotFoundException, IOException;  
}
