import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class menu extends JFrame {
	private Container c1;
	private JMenuBar mnBar;
	private JMenu mnArq, mnEnt, mnPP, mnS;
	private JMenuItem mniPrinc, mniSair, mniEnt1, mniEnt2, mniEnt3, mniPP1, mniPP2, mniPP3, mniS1, mniS2, mniS3;	
	private ImageIcon imLogo;
	private JLabel lLogo;
	

	public menu() {
		Componentes();
		Eventos();
	}

	public void Componentes() {
		c1 = getContentPane();
		mnBar = new JMenuBar(); //Barra do menu

		mnArq = new JMenu("Arquvio"); //Topico do menu
		mnEnt = new JMenu("Entrada"); //Topico do menu
		mnPP = new JMenu("Prato Princ."); //Topico do menu
		mnS = new JMenu("Saida"); //Topico do menu
	
		mniPrinc = new JMenuItem("Princi."); //Topico Arquivo
		mniSair = new JMenuItem("Sair"); //Topico Arquivo
		mniSair.setMnemonic('S'); //Sublinhado
		
		mniEnt1 = new JMenuItem("Maçã"); //Topico Entrada
		mniEnt2 = new JMenuItem("Bicoito"); //Topico Entrada
		mniEnt3 = new JMenuItem("Sopa"); //Topico Entrada
		
		mniPP1 = new JMenuItem("Maça Dourada"); //Topico Saida
		mniPP2 = new JMenuItem("Carne"); //Topico Saida
		mniPP3 = new JMenuItem("Salmão Assado"); //Topico Saida
		
		mniS1 = new JMenuItem("Maçã CAP"); 
		mniS2 = new JMenuItem("Bolo"); 
		mniS3 = new JMenuItem("Bagas"); 
		
		imLogo = new ImageIcon("Logo.png");
		lLogo = new JLabel(imLogo);
		
		mniSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK)); //Atalho de Saida
		mniPrinc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK)); //Atalho de Princ
		mniS1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK)); //Atalho de Princ
		
		mnBar.add(mnArq);
		mnBar.add(mnEnt);
		mnBar.add(mnPP);
		mnBar.add(mnS);
		
		mnArq.add(mniPrinc);
		mnArq.add(mniSair);
		
		mnEnt.add(mniEnt1);
		mnEnt.add(mniEnt2);
		mnEnt.add(mniEnt3);

		mnPP.add(mniPP1);
		mnPP.add(mniPP2);
		mnPP.add(mniPP3);
		
		mnS.add(mniS1);
		mnS.add(mniS2);
		mnS.add(mniS3);
		
		c1.add(lLogo);
		
		setJMenuBar(mnBar);


	}

	public void Eventos() {
		mniPrinc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu menu = new menu();
				c1.removeAll();
				c1.add(menu.add(menu.lLogo));
				c1.validate();
			}
		});
		
		
		mniSair.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				System.exit(0);	
			}
		});
		
		mniEnt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlE1));
				c1.validate();
			}
		});
		
		mniEnt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlE2));
				c1.validate();
			}
		});
		
		mniEnt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlE3));
				c1.validate();
			}
		});

		mniPP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlPP1));
				c1.validate();
			}
		});
		
		mniPP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlPP2));
				c1.validate();
			}
		});
		
		mniPP3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlPP3));
				c1.validate();
			}
		});
		
		mniS1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlS1));
				c1.validate();
			}
		});
		
		mniS2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlS2));
				c1.validate();
			}
		});
		
		mniS3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pratos pratos = new pratos();
				c1.removeAll();
				c1.add(pratos.add(pratos.jlS3));
				c1.validate();
			}
		});
		
	}

	public static void main (String args[]) {
		menu frame = new menu();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
