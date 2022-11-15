/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Laptop
 */
public class MyClock extends Thread {

    JLabel clock;

    public MyClock(JLabel clock) {
        this.clock = clock;
    }

    @Override
    public void run() {
//        while (true) {
//            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" dd/MM/yyyy  HH:mm:ss");
//            LocalDateTime now = LocalDateTime.now();
//            clock.setText(dtf.format(now));
//            try {
//                sleep(1000);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }

        while (true) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy  HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            clock.setText(dtf.format(now));
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClock.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
