package is2.grupo21.tapas;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
 
public class ej1 extends JFrame
{

	ImageIcon imagen = new ImageIcon("/home/noelia/Descargas/Imagen_1.png");
 
	JLabel etiqueta = new JLabel(imagen);
 
	private JLabel bienvenida;
	
	private JButton crear;
	private JButton entrar;
 
	public ej1(){
		super();
		//COMPONENTES
		componentes();
 
		//AGREGAMOS LA ETIQUETA QUE CONTIENE LA IMAGEN AL FRAME
		getContentPane().add(etiqueta);
 
		//ESTABLECEMOS EL TAMAÑO DEL FRAME
		this.setSize(600, 600);
		this.setLocationRelativeTo(null);                                                     
        this.setResizable(true);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
 
	}
 
	public void componentes() {
       bienvenida = new JLabel("¡BIENVENIDO A LA APLICACIÓN!");
       bienvenida.setBounds(200,-20, 500, 200);
       add(bienvenida);
       
       crear = new JButton("CREAR CUENTA");
       crear.setBounds(100,480,150,30);
       //crear.addActionListener(this);
       add(crear);
		
       entrar = new JButton("ENTRAR EN EL SISTEMA");
       entrar.setBounds(300,480,200,30);
       //entrar.addActionListener(this);
       add(entrar);
	}
 
	public static void main(String H[]){
		ej1 p = new ej1();
		p.show();
 
		//COLOCAMOS EL CODIGO QUE PERMITE CERRAR LA VENTANA
		p.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent evt){
				System.exit(0);
			}
		});
	}

}
