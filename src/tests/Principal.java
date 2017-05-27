package tests;

import java.awt.*;
import java.io.OutputStreamWriter;
import java.io.Serializable;

/**
 * Created by mromero on 5/7/17.
 */
public class Principal {
    public static void main(String args[]){
        Auto auto1 = new Auto("1234dfas234", "Nissan", "Sentra", "Blanco");
        System.out.println("La ID del Auto es: "+auto1.getId());
        System.out.println("La matricula del Auto es: "+auto1.getMatricula());
        System.out.println("La marca del Auto es: "+auto1.getMarca());
        System.out.println("El Modelo del Auto es: "+auto1.getModelo());
        System.out.println("El color del Auto es: "+auto1.getColor());

        Auto auto2 = new Auto("245fgsd3345", "Ford", "Fiesta", "Rojo");
        System.out.println("La ID del Auto es: "+auto2.getId());
        System.out.println("La matricula del Auto es: "+auto2.getMatricula());
        System.out.println("La marca del Auto es: "+auto2.getMarca());
        System.out.println("El Modelo del Auto es: "+auto2.getModelo());
        System.out.println("El color del Auto es: "+auto2.getColor());

        //Toolkit.getDefaultToolkit().beep();
        //System.out.println("BEEP!");

        out("El sistema contine un metodo para imprimir directamente con la palabra out");

        Generic<String> obj1 = new Generic<String>();
        obj1.setValor("Uno");
        out("El obj1 es: "+obj1.getValor());

        Generic<Integer> obj2 = new Generic<Integer>();
        obj2.setValor(2);
        Integer x=obj2.getValor()+2;
        obj2.setValor(x);
        out("El valor de obj2 es: "+Integer.toString(obj2.getValor()));

    }

    public static void out(String s){
        System.out.println(s);
    }


}


class Generic<T>{
    Generic(){
        valor = null;
    }

    public T getValor(){
        return valor;
    }

    public void setValor(T valor){
        this.valor=valor;
    }

    private T valor;
}