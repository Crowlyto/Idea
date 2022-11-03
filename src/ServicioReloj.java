import java.util.*;

public class ServicioReloj {

    public Tiempo ponerHora() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Tiempo one = new Tiempo();
        System.out.println("Ingrese una Hora");
        one.setHora(leer.nextInt());
        System.out.println("Ingrese los Minutos");
        one.setMinuto(leer.nextInt());
        System.out.println("Ingrese los Segundos");
        one.setSegundo(leer.nextInt());
        System.out.println("Ingrese modo 12/24 hs");
        one.setModo(leer.nextInt());
        return one;
    }

    public void incrementeTiempo(Tiempo one) {
        int segundos = one.getSegundo();
        int minutos = one.getMinuto();
        int hora = one.getHora();
        segundos++;
        if (segundos == 60) {
            one.setSegundo(0);
            minutos=(one.getMinuto()+1);
            one.setMinuto(minutos);
            if (minutos == 60) {
                one.setMinuto(0);
                one.setHora(one.getHora()+1);
                hora = (hora + 1) % 24;

            }
        }else{
            one.setSegundo(segundos++);
            one.setMinuto(minutos++);
        }

    }

    public String mostrarHora(Tiempo one){
        String tiempo= "Son las ";
        if (one.getModo()==12){
            tiempo+=(one.getHora()>12)?one.getHora()-12:one.getHora();
            tiempo+=":"+one.getMinuto()+":"+one.getSegundo();
            tiempo+=(one.getHora()>=12)?"pm":"am";
        }else{
            tiempo+=one.getHora()+":"+one.getMinuto()+":"+one.getSegundo();
        }
        return tiempo;
    }
}
