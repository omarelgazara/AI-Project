/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectfootball;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mo
 */
public class footballer16 extends Agent{
     String content;
     @Override
    protected void setup()
    {
        System.out.println(" footballer16 started");
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                ACLMessage x=receive();
                if (x!=null)
                {
                    JOptionPane.showMessageDialog(new JFrame(),"message 16 " +x.getContent());
                }

            }
        });
    }
     @Override
    protected void takeDown()
    {
        System.out.println(" footballer16 killed");
    }
}

