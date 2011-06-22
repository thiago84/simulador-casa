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
        //Estado del sensor 0 estado normal, 1 en larma
        int valorDado = r.nextInt(2);
        mensaje.append(valorDado);
        //Tipo de sensor 0 Sensor de Movimiento, 1 Sensor de incendios
        valorDado = r.nextInt(2);
        mensaje.append(valorDado);
        //Tipo de Espacio 0 Casa, 1 Oficinas
        valorDado = r.nextInt(2);
        mensaje.append(valorDado);
        //Ubicacion dentro del Inmueble
        valorDado = r.nextInt(21);
        if(valorDado<10){
            mensaje.append("0").append(valorDado);
        }else{
            mensaje.append(valorDado);
        }
        //Objeto que emite la trama
        valorDado = r.nextInt(51);
        if(valorDado<10){
            mensaje.append("0").append(valorDado);
        }else{
            mensaje.append(valorDado);
        }
        //Personas que se encuentran en esa ubicacion
        valorDado = r.nextInt(3);
        mensaje.append(valorDado);
        return mensaje.toString();
    }

    public StringBuffer getMensaje() {
        return mensaje;
    }

    public void setMensaje(StringBuffer mensaje) {
        this.mensaje = mensaje;
    }
}