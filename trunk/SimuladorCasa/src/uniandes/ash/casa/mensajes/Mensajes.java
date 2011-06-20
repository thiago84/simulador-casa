/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.ash.casa.mensajes;

import java.util.Random;

/**
 *
 * @author TOSHIBA
 */
public class Mensajes {
    public StringBuffer mensaje;
    
    public String generarMensaje(){
        mensaje=new StringBuffer();
        Random r = new Random();
        int valorDado = r.nextInt(2);
        mensaje.append(valorDado);
        valorDado = r.nextInt(2);
        mensaje.append(valorDado);
        valorDado = r.nextInt(2);
        mensaje.append(valorDado);
        valorDado = r.nextInt(21);
        if(valorDado<10){
            mensaje.append("0").append(valorDado);
        }else{
            mensaje.append(valorDado);
        }
        valorDado = r.nextInt(51);
        if(valorDado<10){
            mensaje.append("0").append(valorDado);
        }else{
            mensaje.append(valorDado);
        }
        return mensaje.toString();
    }

    public StringBuffer getMensaje() {
        return mensaje;
    }

    public void setMensaje(StringBuffer mensaje) {
        this.mensaje = mensaje;
    }
}