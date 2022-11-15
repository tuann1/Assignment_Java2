/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Laptop
 */
public class Read {
    
    public static void write(ArrayList<Manager> list) throws FileNotFoundException, IOException {
        FileOutputStream f = new FileOutputStream(new File("file.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);
        ArrayList<Manager> mng = new ArrayList<>();
        mng = list;
        try {
            o.writeObject(mng);
            
            o.close();
            f.close();
            JOptionPane.showMessageDialog(null,"Quá trình ghi File thành công.");
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Quá trình ghi File thất bại.");
        }
    }
    
    @SuppressWarnings("unchecked")
    public static ArrayList<Manager> read() {
        ArrayList<Manager> list = new ArrayList<>();
        FileInputStream fi;
        
        try {
            fi = new FileInputStream(new File("file.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            if(fi.available() != 0) {
              list = (ArrayList<Manager>) oi.readObject();
                System.out.println(oi.readObject());
            }
            JOptionPane.showMessageDialog(null, "Qua trinh doc File thanh cong");
        } catch (HeadlessException | IOException | ClassNotFoundException e) {
          
        }
        return list;
    }
}
