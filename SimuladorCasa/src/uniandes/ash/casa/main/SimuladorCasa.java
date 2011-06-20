/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.ash.casa.main;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import uniandes.ash.casa.hilo.HiloAntena;

/**
 *
 * @author TOSHIBA
 */
public class SimuladorCasa {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            while(true){
                HiloAntena ha1=new HiloAntena();
                HiloAntena ha2=new HiloAntena();
                HiloAntena ha3=new HiloAntena();
                HiloAntena ha4=new HiloAntena();
                ha1.start();
                ha2.start();
                ha3.start();
                ha4.start();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Could not listen on port: 4444.");
        }
    }
}