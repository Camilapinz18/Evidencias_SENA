import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion=0;
        Users user = new Users();
        while(opcion!=9){
            System.out.println("Seleccione una opcion: ");
            System.out.println("1. Iniciar sesión // 9. Salir");
            opcion=input.nextInt();
            if(opcion==1){
                user.solicitarDatos();
                user.verificarDatos();
            } else if(opcion==9){
                System.out.println("Programa terminado");
                System.exit(0);
            } else{
                System.out.println("Opcion incorrecta");
            }
        }
    }

    public static class Users {
        private String nombre;
        private String clave;
        private Map<String, String> listado = new HashMap<String, String>();
        static Scanner input = new Scanner(System.in);
        boolean isNombre, isClave;

        Log log = Log.getInstancia();

        public Users() {
            listado.put("admin1", "abc123");
            listado.put("cajero1", "xyz456");
            listado.put("aseo2", "jkl789");
        }

        public void solicitarDatos() {
            System.out.println("Ingrese su nombre de usuario: ");
            nombre = input.nextLine();
            System.out.println("Ingrese su clave: ");
            clave = input.nextLine();
        }

        public void verificarDatos() {
            for (String key : listado.keySet()) {
                if (nombre.equals(key)) {
                    isNombre=true;
                    break;
                } else {
                    isNombre=false;
                }
            }

            for (String value : listado.values()) {
                if (clave.equals(value)) {
                    isClave=true;
                    break;
                } else {
                   isClave=false;
                }
            }

            if(isClave && isNombre){
                System.out.println("Inicio de sesión exitoso");
                log.anadirLog("Ingreso exitoso. Usuario: "+nombre+", Clave: "+clave);
            } else {
                System.out.println("Datos erroneos, verifique por favor");
                log.anadirLog("Ingreso errado. Usuario: "+nombre+", Clave: "+clave);
            }

        }

    }
}







