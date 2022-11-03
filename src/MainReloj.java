public class MainReloj {
    public static void main(String[] args) throws InterruptedException {
        ServicioReloj serv=new ServicioReloj();
        Tiempo hora=serv.ponerHora();
        int i=0;
        do {
            System.out.println(serv.mostrarHora(hora));
            serv.incrementeTiempo(hora);
            i++;
            Thread.sleep(1000);

        }while(i<60);


    }
}
