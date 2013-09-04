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
    public int cant;
    public constructor(){
    talla = 0;
    color = "";
    marca = "";
    tipo_calzado = "";
    id = 0;
    tipo_persona = "";
    cant = 0;
    }
    public void agregar(int id,int cant,int talla,String color,String marca,String tipo_calzado,String tipo_persona){
        this.id = id;
        this.talla = talla;
        this.cant = cant;
        this.color = color;
        this.marca = marca;
        this.tipo_calzado = tipo_calzado; // tipo de calzado
        this.tipo_persona = tipo_persona;
    }
    
    public int get_id(){
        return id;
    }
    public int get_cant_pares(){
        return cant;
    }
    public int get_talla(){
        return talla;
    }
    public String get_color(){
        return color;
    }
    public String get_marca(){
        return marca;
    }
    
    public String get_tipo_calzado(){
        return tipo_calzado;
    }
    
    public String get_tipo_persona(){
        return tipo_persona;
    }
    

}

