public class Nevera {
    private int id;
    private String marca;

    public Nevera(String s, int id){
        this.id = id;
        this.marca = s;
    }

    public String toString(){
        return "(" + this.id + ", " + this.marca + ")";
    }
}