/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.ash.casa.hilo;

import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import uniandes.ash.casa.antena.Antena;
import uniandes.ash.casa.main.SimuladorCasa;
import uniandes.ash.casa.mensajes.Mensajes;

/**
 *
 * @author TOSHIBA
 */
public class HiloAntena extends Thread {

    static final String HOST = "localhost";
    static final int PUERTO = 5000;

    @Override
    public void run() {
        try {
            while (true) {
                ArrayList<String> listaMensajes = new ArrayList();
                Mensajes mensaje = new Mensajes();
                for (int i = 0; i < 13; i++) {
                    listaMensajes.add(mensaje.generarMensaje());
                }
                Socket skCliente = new Socket(HOST, PUERTO);
                ObjectOutputStream bufferObjetos = new ObjectOutputStream(skCliente.getOutputStream());
                bufferObjetos.writeObject(listaMensajes);
                skCliente.close();
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }





        //SimuladorCasa scasa=new SimuladorCasa();

        //scasa.enviarDatos(listaMensajes);
            /*ArrayList listaMensajes=new ArrayList();
        Mensajes mensaje=new Mensajes();
        for (int i = 0; i < 13; i++) {
        listaMensajes.add(mensaje.generarMensaje());
        }
        System.out.println(listaMensajes);*/
        /*Antena antena=new Antena();
        ArrayList listaMensajes=new ArrayList();
        Mensajes mensaje=new Mensajes();
        for (int i = 0; i < 13; i++) {
        listaMensajes.add(mensaje.generarMensaje());
        }
        for (int i = 0; i < listaMensajes.size(); i++) {
        System.out.println(listaMensajes.get(i).toString());
        }
        antena.setMensajes(listaMensajes);
        try{
        Thread.sleep(1000*60);
        }catch(Exception e){
        e.printStackTrace();
        }*/
    }
}