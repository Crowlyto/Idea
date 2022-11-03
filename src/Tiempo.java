public class Tiempo {
    Integer modo , hora, minuto, segundo;

    public Tiempo() {
        modo=24;
        hora=0;
        minuto=0;
        segundo=0;
    }

    public Tiempo(Integer modo, Integer hora, Integer minuto, Integer segundo) {
        this.modo = 24;
        this.hora =hora%24;
        this.minuto = minuto%60;
        this.segundo = segundo%60;
    }

    public Integer getModo() {
        return modo;
    }

    public void setModo(Integer modo) {
        this.modo = modo;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    public void setMinuto(Integer minuto) {
        this.minuto = minuto;
    }

    public Integer getSegundo() {
        return segundo;
    }

    public void setSegundo(Integer segundo) {
        this.segundo = segundo;
    }
}

