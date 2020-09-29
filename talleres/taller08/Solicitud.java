public class Solicitud {
    private int c;
    private String empresa;

    public Solicitud(String empresa, int c){
        this.c = c;
        this.empresa = empresa;
    }

    public int getCant(){
        return this.c;
    }

    public String getEmpresa(){
        return this.empresa;
    }
}