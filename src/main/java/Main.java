import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        System.out.println("=========================================");
        System.out.println("Seleccione una opcion:");
        System.out.println("1)Ingresar horarios de comidas \n2)Buscar receta \n3)Salir");
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
             System.out.println("hola bb");
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
}
