/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileapplication3;


public class constructor{
    public int talla;
    public String color;
    public String marca;
    public String tipo_calzado;
    private int id;
    public String tipo_persona;
    public int cantidad;
    
    public constructor(){
    talla = 0;
    color = "";
    marca = "";
    tipo_calzado = "";
    id = 0;
    tipo_persona = "";
    cantidad = 0;
    
    }
    public void agregar(int id,int talla,int cantidad,String color,String marca,String tipo_calzado,String tipo_persona){
        this.id = id;
        this.talla = talla;
        this.cantidad = cantidad;
        this.color = color;
        this.marca = marca;
        this.tipo_calzado = tipo_calzado; // tipo de calzado
        this.tipo_persona = tipo_persona;
    }
    /*public void set_id(int id){
        this.id = id;
    }
    public void set_talla(int talla){
        this.talla = talla;
    }
   
    public void set_color(String color){
        this.color = color;
    }
    public void set_marca(String marca){
        this.marca = marca;
    }
    public void set_tipo(String tipo){ //calzado ejem: chancla,sandalia etc..
        this.tipo_calzado = tipo;
    }*/
    public int get_id(){
        return id;
    }
    public int get_talla(){
        return talla;
    }
    public int get_cantidad(){
        return cantidad;
    }
    public String get_color(){
        return color;
    }
    public String get_marca(){
        return marca;
    }
    public String get_tipo_persona(){
        return tipo_persona;
    }

}

