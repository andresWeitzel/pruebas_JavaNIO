package versionador.java.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejodeArchivos implements I_ManejodeArchivos {

    
        //No lee caracteres especiales

    @Override
    public void leer_archivo(String filePath) throws FileNotFoundException, IOException {
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) { // Utilizamos try with resources porque RandomAccessFile es closeable.
            FileChannel fc = raf.getChannel();
            
             ByteBuffer buf = ByteBuffer.allocate(1024); // Acá indicamos el tamaño del buffer que vamos a usar. Un buffer es un espacio en memoria envuelto en un objeto
             int bytesRead = fc.read(buf); // Acá el método read() nos devuelve un entero indicando cuántos bytes fueron escritos al Buffer. Si devuelve -1, se llegó al final del archivo. 

            while (bytesRead != -1) {
                System.out.println("Leídos  "+bytesRead);
                buf.flip(); // Este método es necesario para cambiar el Buffer del modo escritura al modo lectura y viceversa.
                while (buf.hasRemaining()) {
                    System.out.println((char) buf.get());
                }
                buf.clear(); // Se le indica al Buffer que vuelva a su posición inicial
                bytesRead = fc.read(buf);
                
            }
        }
        
                
    }

    
    @Override
    public void escribir_archivo(String contenido, String destino) throws FileNotFoundException, IOException {
        try (RandomAccessFile raf = new RandomAccessFile(destino, "rw")){
            FileChannel fc = raf.getChannel();
            ByteBuffer buf = ByteBuffer.allocate(1024);
            buf.clear();
            buf.put(contenido.getBytes());
            buf.flip();   
            fc.position(fc.size()+1);
            while (buf.hasRemaining()) {
             fc.write(buf);
            
            }
        } catch (Exception e) {e.printStackTrace();}
        
    }
    
    
    public static void main(String[] args) {
        String path = "archivos_de_prueba/arch1.txt";
        String a_escribir = "Esto no es una prueba";
        ManejodeArchivos mArch = new ManejodeArchivos();
            try {
                mArch.leer_archivo(path);
                mArch.escribir_archivo(a_escribir, path);
            } catch (IOException ex) {
                Logger.getLogger(ManejodeArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }


   

}
