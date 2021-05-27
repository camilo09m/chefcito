import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ManejoArchivo{
    public ManejoArchivo() {

    }

    public void crearArchivoDesayuno() {
        String ruta = "Comidas/Desayuno.txt";
        String contenido = "Comidinha";
        Path archivo = Paths.get(ruta);
            try {
                Files.write(archivo, contenido.getBytes());
            } catch (IOException e) {
            }
        }

        public void crearArchivoAlmuerzo() {
        String ruta = "Comidas/Almuerzo.txt";
        String contenido = "Comidinha";
        Path archivo = Paths.get(ruta);
            try {
                Files.write(archivo, contenido.getBytes());
            } catch (IOException e) {
            }
        }

        public void crearArchivoCena() {
        String ruta = "Comidas/Cena.txt";
        String contenido = "Comidinha";
        Path archivo = Paths.get(ruta);
            try {
                Files.write(archivo, contenido.getBytes());
            } catch (IOException e) {
            }
        }

   /* public void agregarLinea(String ruta, String contenido) {
            String oldFile = leerArchivo(ruta);
            crearArchivo(ruta, oldFile + "\n" + contenido);
        }*/

    public String leerArchivo() {
        String ruta = "Comidas/Desayuno.txt";
        Path archivo = Paths.get(ruta);
        String texto = "";
        try {
            texto = new String(Files.readAllBytes(archivo));
        }catch (IOException e) {
        }
        return texto;
        }

    public void crearDirectorio() {
        String ruta = "Comidas";
            Path directorio = Paths.get(ruta);
            if (Files.exists(directorio)) {
            } else {
                try {
                    Files.createDirectories(directorio);
                } catch (IOException e) {
                }
            }
        }

    public String[] listaArchivos(String ruta) {
            File f = new File(ruta);
            String[] archivos = f.list();
            return archivos;
        }
}
