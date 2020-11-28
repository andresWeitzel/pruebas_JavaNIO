package versionador.java.test;

import java.io.File;
import java.time.LocalDateTime;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import versionador.java.entidades.ProyectosCab;
import versionador.java.interfaces.I_ProyectosCab;
import versionador.java.repositorios.ProyectosCab_Repositorio;

public class Test {

    public Test() {
    }
    
    private String ruta="D:\\Francisco\\Programación\\Versionador";
    File carpeta=new File(ruta);
    File[] lista=carpeta.listFiles();
    
    private void buscarCarpeta(File[] listado){
        for (int i = 0; i < listado.length; i++) {
        if(listado[i].isDirectory()) {
//                    modelo.addElement(listado[i].getName()+" (Carpeta)");
                    System.out.println(listado[i].getName()+" (Carpeta)");
                    File subCarpeta = new File(ruta+File.separator+listado[i].getName());
                    File[] subListado = subCarpeta.listFiles();
                    if(subListado.length>0){
                        for (int j = 0; j < subListado.length; j++){
                            if(subListado[j].isDirectory()) buscarCarpeta(subListado);
                            System.out.println(subListado[j].getName());
//                            modelo.addElement(subListado[j].getName());
                        }
                    }
                            
    }
        else{
            System.out.println(listado[i].getName());
//            modelo.addElement(listado[i].getName());
        }
        }}
    public static void main(String[] args) {
//        Test test = new Test();
//        test.buscarCarpeta(lista);
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
//        
////        LocalDateTime dia=LocalDateTime.now()
//;
//        
//        I_ProyectosCab pcr = new ProyectosCab_Repositorio(emf);
//        
//        
//        
//        ProyectosCab proyectosCab = new ProyectosCab("Pepito", "prueba de consistencia con la base", "c:/sadsa/adsad/sdasd", "NO", "24");
//        pcr.save(proyectosCab);
//        System.out.println("************************");
//        System.out.println("");
//        System.out.println(proyectosCab);
//        
//        emf.close();

    }
}
