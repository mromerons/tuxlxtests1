package tests;

/**
 * Created by mromero on 5/7/17.
 */
public class Auto {

    private static int idCounter=1;

    private int id;

    private String matricula;
    private String marca;
    private String modelo;
    private String color;

    public Auto(String matricula, String marca, String modelo, String color){
        id=idCounter;
        idCounter++;

        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
    }

    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }

    public String getMarca(){
        return marca;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public String getModelo(){
        return modelo;
    }

    public void setColor(String color){
        this.color=color;
    }

    public String getColor(){
        return color;
    }

    public int getId(){
        return id;
    }
}
