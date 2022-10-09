import java.util.Date;

public class Log {

    private static Log instanciaLog;
    private String log;

    private Log(){

    }

    public static Log getInstancia(){
        if(instanciaLog==null){
            instanciaLog=new Log();
        }
        return instanciaLog;
    }

    public void anadirLog(String texto){
        Date fecha=new Date();
        log+="\n"+"Log: "+texto+" "+".Date: "+fecha;
        System.out.println(log);
    }
}
