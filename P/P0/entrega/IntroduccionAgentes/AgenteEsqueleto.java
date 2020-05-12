/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes;

import jade.core.Agent;
import jade.wrapper.ControllerException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jgr97
 */
public class AgenteEsqueleto extends Agent {

    @Override
    protected void setup() {
        
        try {
            System.out.println("Hola soy "+ this.getLocalName()+
                    ". Acabo de iniciar mi ejecucion y estoy en " + 
                    this.getContainerController().getContainerName());
        } catch (ControllerException ex) {
            Logger.getLogger(AgenteEsqueleto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void takeDown() {
        try {
            System.out.println("Hola me llamo " + this.getLocalName()+ 
                    ". Acabo de finalizar mi ejecucion y estaba en " + 
                    this.getContainerController().getContainerName());
        } catch (ControllerException ex) {
            Logger.getLogger(AgenteEsqueleto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
