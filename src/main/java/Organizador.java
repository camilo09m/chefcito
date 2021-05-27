import java.util.Scanner;

public class Organizador {

    public Organizador(){
    }
    public void menuOrg(){
        System.out.println("=========================================");
        System.out.println("Seleccione una opcion:");
        System.out.println("1)Desayuno \n2)Almuerzo \n3)Cena \n4)volver al menú anterior");
        System.out.println("=========================================");
        opcionOrg();

    }

    public void opcionOrg(){
        Scanner teclado = new Scanner(System.in);
        String opcion = teclado.next();
        validarOpcionOrg(opcion);
    }
    public void validarOpcionOrg(String opcion){
            switch (opcion){
                case "1": {
                    System.out.println("desayuno");
                    menuOrg();
                    break;
                }
                case "2": {
                    System.out.println("almuerzo");
                    menuOrg();
                    break;
                }
                case "3":{
                    System.out.println("cena");
                    menuOrg();
                    break;
                }
                case "4":{
                    break;
                }
                default:
                    System.err.println("opcion no valida intentelo nuevamente");
                    menuOrg();

            }
        }
}
