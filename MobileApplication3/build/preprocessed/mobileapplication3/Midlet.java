/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileapplication3;

import java.util.Vector;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.TextField;
import javax.microedition.lcdui.Ticker;
import javax.microedition.midlet.*;

/**
 * @author familia_
 */
public class Midlet extends MIDlet implements CommandListener {

    public Form form1;
   public ChoiceGroup choice_escoge;
   public ChoiceGroup choice_principal,choice_hombre,choice_color,choice_mujer,choice_marca,choice_niño,choice_tipo;
   public String numeracion_niño[] = {"18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34"};
   public String color[] = {"Negro","Blanco","Rojo","Cafe","Gris","Verde","Naranja","Rosado"};
   public String numeracion_adulto[] = {"35","36","37","38","39","40","41","42","43","44","45"};
   public String tipo_producto[] = {"chancla","sandalia","teniz","convers","bota","zapato"};
   public String marca[] = {"Venus","Hunt","Xirera","Panema","Novaflex","Sport","CC"};
   public Command btn_enviar,btn_salir,btn_enviar2,btn_salir2,btn_enviar3,btn_salir3;
   public TextField item;
   constructor objeto;
   public Form f1,f2,f3,f4,f5;
   Display pantalla;
   int num;
   int item_;
   
  //  Alert alertMensaje;
   String tipo_talla,tipo_color_s,tipo_marca_s,tipo_persona_,tipo_calzado_;
  // public Image add = null,search = null,view = null;
   Vector vector;
  // public ImageItem imagen;
   List lista;
    
   public void pantalla_principal(){
            pantalla = Display.getDisplay(this);      
            f1 = new Form("Opcion....");
            btn_enviar = new Command("Enviar", Command.OK, 0);
            btn_salir = new Command("Salir",Command.EXIT,1);
            choice_principal = new ChoiceGroup("Tipo de persona", ChoiceGroup.EXCLUSIVE);
            choice_principal.append("Hombre",null);
            choice_principal.append("Mujer",null);
            choice_principal.append("Niño",null);
            choice_principal.append("Niña",null);
            f1.append(choice_principal);
            f1.addCommand(btn_enviar);
            f1.addCommand(btn_salir);
            f1.setCommandListener(this);
            crearTicker("Seleccionar el tipo de persona",f1);
            pantalla.setCurrent(f1);
     }
    public void escoger() {        
           pantalla = Display.getDisplay(this);
           form1 = new Form("Seleccione..");
           choice_escoge = new ChoiceGroup("Escoge !", ChoiceGroup.EXCLUSIVE);
           choice_escoge.append("Añadir",null);
           choice_escoge.append("Buscar", null);
           choice_escoge.append("Mostrar",null);
           btn_enviar = new Command("Enviar",Command.OK, 0);
           btn_salir = new Command("Salir",Command.EXIT,1);
           form1.append(choice_escoge);
           form1.addCommand(btn_enviar);
           form1.addCommand(btn_salir);
           form1.setCommandListener(this);
           crearTicker("Carrareria MI EXITO",form1);
           pantalla.setCurrent(form1);   
   }
   public void pantalla_hombre(){
            pantalla = Display.getDisplay(this);
            item = new TextField("Codigo","",8,TextField.DECIMAL);            
            f2 = new Form("Hombre...");
            choice_hombre = new ChoiceGroup("numeracion",ChoiceGroup.POPUP, numeracion_adulto,null);         
            choice_color = new ChoiceGroup("Color",ChoiceGroup.POPUP,color,null);
            choice_marca = new ChoiceGroup("Marca",ChoiceGroup.POPUP,marca,null);
            choice_tipo = new ChoiceGroup("Tipo de calzado : ",ChoiceGroup.POPUP,tipo_producto,null);
            btn_enviar = new Command("Enviar", Command.OK, 0);
            btn_salir = new Command("Salir",Command.EXIT,1);
            f2.append(item);
            f2.append(choice_hombre);
            f2.append(choice_color);
            f2.append(choice_marca);
            f2.append(choice_tipo);
            f2.addCommand(btn_enviar);
            f2.addCommand(btn_salir);
            f2.setCommandListener(this);
            pantalla.setCurrent(f2);
    }
    public void pantalla_mujer(){
            pantalla = Display.getDisplay(this);
            f3 = new Form("Mujer...");
            choice_hombre = new ChoiceGroup("Mujer", ChoiceGroup.POPUP, numeracion_adulto, null);
            choice_color = new ChoiceGroup("Color",ChoiceGroup.POPUP,color,null);
            choice_marca = new ChoiceGroup("Marca",ChoiceGroup.POPUP,marca,null);
            choice_tipo = new ChoiceGroup("Tipo de calzado : ",ChoiceGroup.POPUP,tipo_producto,null);
            btn_enviar = new Command("Enviar", Command.OK, 0);
            btn_salir = new Command("Salir",Command.EXIT,1);
            item = new TextField("Codigo","",8,TextField.DECIMAL); 
            f3.append(item);
            f3.append(choice_hombre);
            f3.append(choice_color);
            f3.append(choice_marca);
            f3.append(choice_tipo);
            f3.addCommand(btn_enviar);
            f3.addCommand(btn_salir);
            f3.setCommandListener(this);
            pantalla.setCurrent(f3);
    }
    public void pantalla_niño(){
            
        
            pantalla = Display.getDisplay(this);
            f4 = new Form("Niño...");
            choice_niño = new ChoiceGroup("Niño", ChoiceGroup.POPUP, numeracion_niño, null);
            choice_color = new ChoiceGroup("Color",ChoiceGroup.POPUP,color,null);
            choice_marca = new ChoiceGroup("Marca",ChoiceGroup.POPUP,marca,null);
            choice_tipo = new ChoiceGroup("Tipo de calzado : ",ChoiceGroup.POPUP,tipo_producto,null);
            btn_enviar = new Command("Enviar", Command.OK, 0);
            btn_salir = new Command("Salir",Command.EXIT,1);
            item = new TextField("Codigo","",8,TextField.DECIMAL); 
            f4.append(item);
            f4.append(choice_niño);
            f4.append(choice_color);
            f4.append(choice_marca);
            f4.append(choice_tipo);
            f4.addCommand(btn_enviar);
            f4.addCommand(btn_salir);
            f4.setCommandListener(this);
            pantalla.setCurrent(f4);    
    }
     public void pantalla_niña(){
            pantalla = Display.getDisplay(this);
            f5 = new Form("Niña...");
            choice_niño = new ChoiceGroup("Niño", ChoiceGroup.POPUP, numeracion_niño, null);
            choice_color = new ChoiceGroup("Color",ChoiceGroup.POPUP,color,null);
            choice_marca = new ChoiceGroup("Marca",ChoiceGroup.POPUP,marca,null);
            choice_tipo = new ChoiceGroup("Tipo de calzado : ",ChoiceGroup.POPUP,tipo_producto,null);
            btn_enviar = new Command("Enviar", Command.OK, 0);
            btn_salir = new Command("Salir",Command.EXIT,1);
            item = new TextField("Codigo","",8,TextField.DECIMAL); 
            f5.append(item);
            f5.append(choice_niño);
            f5.append(choice_color);
            f5.append(choice_marca);
            f5.append(choice_tipo);
            f5.addCommand(btn_enviar);
            f5.addCommand(btn_salir);
            f5.setCommandListener(this);
            pantalla.setCurrent(f5);
            
    }
     public void transformacion(){
                          
                  this.item_ = Integer.parseInt(item.getString()); 
                  int tipo_color = choice_color.getSelectedIndex();
                  this.tipo_color_s = choice_color.getString(tipo_color);
                  int tipo_marca = choice_marca.getSelectedIndex();
                  this.tipo_marca_s = choice_marca.getString(tipo_marca);
                  int tipo_persona = choice_tipo.getSelectedIndex(); // si es niño,niña,adulto
                  this.tipo_persona_ = choice_tipo.getString(tipo_persona);     
                  int tipo_calzado = choice_marca.getSelectedIndex();
                  this.tipo_calzado_ = choice_marca.getString(tipo_calzado);
                  int talla = Integer.parseInt(this.tipo_talla);
                 objeto = new constructor();
                 //int id,int talla,String color,String marca,String tipo_calzado,String tipo_persona
                 objeto.agregar(item_, talla, tipo_color_s, tipo_marca_s,tipo_calzado_,tipo_persona_);
                 vector.addElement(objeto);
     
     }
     public void crearTicker(String str, Form form) {
        //crea espacio en memoria para crear el Ticker
        Ticker tickerMensaje = new Ticker(str);
        //adiciona el Ticker al Formulario
        form.setTicker(tickerMensaje);
    }//fin del metodo crearTicker
     
     
     public void Alerta(String titulo_alerta, String msg_Alerta){
        
       Alert alertMensaje = new Alert(titulo_alerta, msg_Alerta,null, AlertType.INFO);
        //configura tiempo de duracion de la alerta en la pantalla esta dado en  milisegundos
        alertMensaje.setTimeout(3000);
        //ubica alerta en la pantalla
        pantalla.setCurrent(alertMensaje);
     
     }
   
    
    protected void startApp()  {   
           escoger();

    }
  
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
        notifyDestroyed();
    }



    public void commandAction(Command c, Displayable d) {
       if(d == form1){
          
          
           if(c == btn_enviar){
               int num1 = choice_escoge.getSelectedIndex();
                if(num1 == 0){
                    pantalla_principal();
                }if(num1 == 1){
                ////---------------------------- aqui poner la segunda opcion
                   
                    }if(num1 == 2){
               ////-------------------------------- aqui poner la tercera opcion
                    }
                    
                    }if(c == btn_salir){
                        destroyApp(true);
                        notifyDestroyed();
                    }// fin del form1
                   //btn_enviar = null;
                   //btn_salir = null;
                    }
//_________________________________________________________________________________
       if(d == f1){
            if(c == btn_enviar){ //btn_enviar2
               int num2 = choice_principal.getSelectedIndex();
               Alerta("Si funciona",""+ num2);
                
                switch(num2){
                    case 0:
                         pantalla_hombre();
                         Alerta("Si funciona",""+ num2);
                        break;
                    case 1:
                         pantalla_mujer();
                         Alerta("Si funciona",""+ num2);
                        break;
                    case 2:
                         pantalla_niño();
                         Alerta("Si funciona",""+ num2);
                        break;
                    case 3:
                         pantalla_niña();
                         Alerta("Si funciona",""+ num2);
                        break;
                }
            }if(c == btn_salir) {
                Alerta("Saliendo","");
                escoger();
            }//btn_enviar = null;
             //btn_salir = null;
           }
//________________________________________________________________________________
        if(d == f2){ // hombre
            if(c == btn_enviar){
                int tallaje1 =  choice_hombre.getSelectedIndex();
                this.tipo_talla = choice_hombre.getString(tallaje1);   // tallaje         
                Alerta("Enviado..","Procesando");
                transformacion();
            
            
            }if(c == btn_salir3){
             //   btn_enviar = null;
            escoger();
              }
            }
//________________________________________________________________________________
            if(d == f3){ // mujer
                if(c == btn_enviar){
                
                  int tallaje2 =  choice_hombre.getSelectedIndex();
                  this.tipo_talla = choice_hombre.getString(tallaje2);
                  Alerta("Enviado..","Procesando");
                  transformacion();
                
                }if(c == btn_salir){ 
                    escoger();
                }        
            }
//_________________________________________________________________________________
            if(d == f4){ // niño
                if(c == btn_enviar){
                    int tallaje3 = choice_niño.getSelectedIndex();
                    this.tipo_talla = choice_niño.getString(tallaje3);
                    Alerta("Enviado..",""+tallaje3);
                    transformacion();
                }if(c == btn_salir){
                    escoger();
                }
            }
//_________________________________________________________________________________
            if(d == f5){ // niña
                if(c == btn_enviar){
                    Alerta("Enviado..","Procesando");
                  //  int tallaje4 = choice_niño.getSelectedIndex();
                   // this.tipo_talla =  choice_niño.getString(tallaje4);
                    
                    //transformacion();
                }if(c == btn_salir){
                  escoger();
                }
            }
    }
}
