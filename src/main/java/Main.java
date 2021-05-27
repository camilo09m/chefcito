import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iniciador();
        menu();
    }
    public static void menu() {
        System.out.println("=========================================");
        System.out.println("Seleccione una opcion:");
        System.out.println("1)Organizador de comidas \n2)Buscador de receta \n3)Salir");
        System.out.println("=========================================");
        opcion();

    }
    public static void opcion(){
        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.next();
        validarOpcion(opcion);
    }
     public static void validarOpcion(String opcion){
       switch (opcion){
         case "1": {
             Organizador org = new Organizador();
             org.menuOrg();
             menu();
             break;
         }
         case "2": {
             System.out.println("hola mundo");
             menu();
             break;
         }
         case "3":{
               break;
         }
           default:
               System.err.println("opcion no valida intentelo nuevamente");
               menu();

       }
     }
    public static void iniciador(){
        ManejoArchivo archivo = new ManejoArchivo();
        archivo.crearDirectorio(); //crea un directorio en el cual se almacenará toda la informacion de las recetas por archivo
        //crea el archivo de recetas para cada comida:
        archivo.crearArchivoDesayuno();
        archivo.crearArchivoAlmuerzo();
        archivo.crearArchivoCena();
    }
}
