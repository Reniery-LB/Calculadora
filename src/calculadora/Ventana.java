package calculadora;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	public Ventana() {
		this.setTitle("CALCULADORA");
		this.setVisible(true);
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.add(this.calculadora());
	}
	
	public JPanel calculadora() {
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.BLACK);
		mipanel.setOpaque(true);
		mipanel.setSize(500,500);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null);
		
		//JLABEL
		JLabel display = new JLabel("198");
		
		display.setBounds(10, 10, 465, 80);
		display.setHorizontalAlignment(JLabel.RIGHT);
		//display.setBackground(Color.decode("#EAEAEA"));
		display.setForeground(Color.WHITE);
		display.setFont(new Font("Gill Sans MT",Font.BOLD,44));
		display.setBorder(BorderFactory.createLineBorder(Color.CYAN,4));
		display.setOpaque(false);
		
		mipanel.add(display);
		//----------------------------------
		//JBUTTON
		
		//COMIENZA PRIMER FILA
		//BOTON AC
		JButton boton_ac = new JButton("AC");
		
		boton_ac.setBounds(10, 100, 105, 60);
		boton_ac.setBackground(Color.decode("#66D2CE"));
		boton_ac.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_ac.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_ac.setForeground(Color.WHITE);
		mipanel.add(boton_ac);
		
		//BOTON +-
		
		JButton boton_MasMenos = new JButton("+/-");
		
		boton_MasMenos.setBounds(130, 100, 105, 60);
		boton_MasMenos.setBackground(Color.decode("#66D2CE"));
		boton_MasMenos.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_MasMenos.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_MasMenos.setForeground(Color.WHITE);
		mipanel.add(boton_MasMenos);
		
		//BOTON %
		
		JButton boton_porciento = new JButton("%");
		
		boton_porciento.setBounds(250, 100, 105, 60);
		boton_porciento.setBackground(Color.decode("#66D2CE"));
		boton_porciento.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_porciento.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_porciento.setForeground(Color.WHITE);

		mipanel.add(boton_porciento);
		
		//BOTON DIV
		
		JButton boton_div = new JButton("/");
		
		boton_div.setBounds(370, 100, 105, 60);
		boton_div.setBackground(Color.decode("#2DAA9E"));
		boton_div.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_div.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_div.setForeground(Color.WHITE);
		mipanel.add(boton_div);
		//-------------------------------
		//COMIENZA SEGUNDA FILA
		
		//BOTON 7
		JButton boton_7 = new JButton("7");
		
		boton_7.setBounds(10, 170, 105, 60);
		boton_7.setBackground(Color.DARK_GRAY);
		boton_7.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_7.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_7.setForeground(Color.WHITE);
		mipanel.add(boton_7);
		
		//BOTON 8
		
		JButton boton_8 = new JButton("8");
		
		boton_8.setBounds(130, 170, 105, 60);
		boton_8.setBackground(Color.DARK_GRAY);
		boton_8.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_8.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_8.setForeground(Color.WHITE);
		mipanel.add(boton_8);
		
		//BOTON 9
		
		JButton boton_9 = new JButton("9");
		
		boton_9.setBounds(250, 170, 105, 60);
		boton_9.setBackground(Color.DARK_GRAY);
		boton_9.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_9.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_9.setForeground(Color.WHITE);
		mipanel.add(boton_9);
		
		//BOTON X
		
		JButton boton_x = new JButton("X");
		
		boton_x.setBounds(370, 170, 105, 60);
		boton_x.setBackground(Color.decode("#2DAA9E"));
		boton_x.setFont(new Font("Gill Sans MT",Font.BOLD,24));
		boton_x.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_x.setForeground(Color.WHITE);
		mipanel.add(boton_x);
		//-------------------------------
		//COMIENZA TERCERA FILA
		
		//BOTON 4
		JButton boton_4 = new JButton("4");
		
		boton_4.setBounds(10, 240, 105, 60);
		boton_4.setBackground(Color.DARK_GRAY);
		boton_4.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_4.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_4.setForeground(Color.WHITE);
		mipanel.add(boton_4);
		
		//BOTON 5
		JButton boton_5 = new JButton("5");
		
		boton_5.setBounds(130, 240, 105, 60);
		boton_5.setBackground(Color.DARK_GRAY);
		boton_5.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_5.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_5.setForeground(Color.WHITE);
		mipanel.add(boton_5);
		
		//BOTON 6
		
		JButton boton_6 = new JButton("6");
		
		boton_6.setBounds(250, 240, 105, 60);
		boton_6.setBackground(Color.DARK_GRAY);
		boton_6.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_6.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_6.setForeground(Color.WHITE);
		mipanel.add(boton_6);
		
		//BOTON -
		
		JButton boton_menos = new JButton("-");
		
		boton_menos.setBounds(370, 240, 105, 60);
		boton_menos.setBackground(Color.decode("#2DAA9E"));
		boton_menos.setFont(new Font("Gill Sans MT",Font.BOLD,44));
		boton_menos.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_menos.setForeground(Color.WHITE);
		mipanel.add(boton_menos);
		//-------------------------------
		//COMIENZA CUARTA FILA
		
		//BOTON 1
		JButton boton_1 = new JButton("1");
		
		boton_1.setBounds(10, 310, 105, 60);
		boton_1.setBackground(Color.DARK_GRAY);
		boton_1.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_1.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_1.setForeground(Color.WHITE);
		mipanel.add(boton_1);
		
		//BOTON 2
		
		JButton boton_2 = new JButton("2");
		
		boton_2.setBounds(130, 310, 105, 60);
		boton_2.setBackground(Color.DARK_GRAY);
		boton_2.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_2.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_2.setForeground(Color.WHITE);
		mipanel.add(boton_2);
		
		//BOTON 3
		
		JButton boton_3 = new JButton("3");
		
		boton_3.setBounds(250, 310, 105, 60);
		boton_3.setBackground(Color.DARK_GRAY);
		boton_3.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_3.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_3.setForeground(Color.WHITE);
		mipanel.add(boton_3);
		
		//BOTON +
		
		JButton boton_mas = new JButton("+");
		
		boton_mas.setBounds(370, 310, 105, 60);
		boton_mas.setBackground(Color.decode("#2DAA9E"));
		boton_mas.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_mas.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_mas.setForeground(Color.WHITE);
		mipanel.add(boton_mas);
		//-------------------------------
		//COMIENZA QUINTA FILA
		
		//BOTON 0
		JButton boton_0 = new JButton("0");
		
		boton_0.setBounds(10, 380, 225, 60);
		boton_0.setHorizontalAlignment(JLabel.CENTER);
		boton_0.setBackground(Color.DARK_GRAY);
		boton_0.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_0.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_0.setForeground(Color.WHITE);
		mipanel.add(boton_0);
		
		//BOTON .
		JButton boton_punto = new JButton(".");
		
		boton_punto.setBounds(250, 380, 105, 60);
		boton_punto.setBackground(Color.DARK_GRAY);
		boton_punto.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_punto.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_punto.setForeground(Color.WHITE);
		mipanel.add(boton_punto);
		
		//BOTON =
		JButton boton_igual = new JButton("=");
		
		boton_igual.setBounds(370, 380, 105, 60);
		boton_igual.setBackground(Color.decode("#2DAA9E"));
		boton_igual.setFont(new Font("Gill Sans MT",Font.BOLD,34));
		boton_igual.setBorder(BorderFactory.createLineBorder(Color.CYAN,3));
		boton_igual.setForeground(Color.WHITE);
		mipanel.add(boton_igual);
		return mipanel;
	}

}
