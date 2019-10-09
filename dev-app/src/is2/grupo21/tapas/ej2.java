package is2.grupo21.tapas;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ej2 extends JFrame{

	public ej2(){
		super();
		
		//ESTABLECEMOS EL TAMAÑO DEL FRAME
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);                                                     
        this.setResizable(true);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        //FECHA NACIMIENTO
    
 
	}

	public static void main(String[] args) {
		
		ej2 p = new ej2();
		p.show();
		
		
		p.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				System.exit(0);
			}
		});
	}

}
