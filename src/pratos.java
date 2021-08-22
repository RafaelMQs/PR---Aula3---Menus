import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class pratos extends JPanel{
	ImageIcon imgE1, imgE2, imgE3, imgPP1, imgPP2, imgPP3, imgS1, imgS2, imgS3;
	JLabel jlE1, jlE2, jlE3, jlPP1, jlPP2, jlPP3, jlS1, jlS2, jlS3;
	
	public pratos(){
		setLayout(null);
		imgE1 = new ImageIcon("Maçã.png");
		jlE1 = new JLabel(imgE1);
		
		imgE2 = new ImageIcon("Biscoito.png");
		jlE2 = new JLabel(imgE2);

		imgE3 = new ImageIcon("Sopa.png");
		jlE3 = new JLabel(imgE3);
		
		imgPP1 = new ImageIcon("Maça Dourada.png");
		jlPP1 = new JLabel(imgPP1);
		
		imgPP2 = new ImageIcon("Carne.png");
		jlPP2 = new JLabel(imgPP2);
		
		imgPP3 = new ImageIcon("Salmao.png");
		jlPP3 = new JLabel(imgPP3);
		
		imgS1 = new ImageIcon("Maça CAP.gif");
		jlS1 = new JLabel(imgS1);
		
		imgS2 = new ImageIcon("Bolo.png");
		jlS2 = new JLabel(imgS2);

		imgS3 = new ImageIcon("Bagas.png");
		jlS3 = new JLabel(imgS3);


		
	}
}

