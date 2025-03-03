package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

	public Ventana() {
		this.setTitle("Calculando el Interés");
		this.setVisible(true);
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		
		//this.add(this.calculadora());
		//this.add(this.calc_layout());
		this.add(this.calc_interes());
		//this.add(this.interfaz());
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
	
	public JPanel calc_layout() 
	{
		Font fuente = new Font("American TYpewrite", Font.BOLD, 40);
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#380038")); 
		mipanel.setOpaque(true);		
		mipanel.setLayout(new BorderLayout());
		
		JLabel results = new JLabel("20.00"); 
		results.setBackground(Color.WHITE);
		results.setOpaque(true);
		results.setFont(fuente);
		results.setHorizontalAlignment(JLabel.RIGHT);
		mipanel.add(results,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.BLUE);
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		mipanel.add(centro,BorderLayout.CENTER);
		
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(4,3));
		centro.add(botones,BorderLayout.CENTER);
		
		String[] textos = {"9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "."};
		
		for(String texto_boton : textos) {
			JButton boton = new JButton(texto_boton);
			botones.add(boton);
		}
		
		JPanel orilla = new JPanel();
		orilla.setLayout(new GridLayout(6,1));
		centro.add(orilla,BorderLayout.LINE_END);
		
		String[] textos2 = {"+", "-", "*", "/", "=", "CE"};
		
		for(String texto_boton : textos2) {
			JButton boton = new JButton(texto_boton);
			orilla.add(boton);
		}
		
		return mipanel;
	}
	
	public JPanel interfaz() {
		Font fuente = new Font("American TYpewrite", Font.ITALIC, 40);
		//JPANEL PRINCIPAL
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.WHITE);
		mipanel.setOpaque(true);
		mipanel.setLayout(new BorderLayout());
		
		JLabel titulo = new JLabel(" Interés");
		
		titulo.setBackground(Color.WHITE);
		titulo.setFont(fuente);
		mipanel.add(titulo,BorderLayout.NORTH);
		
		//JPANEL CALCULAR INTERES
		JPanel calcular = new JPanel();
		
		calcular.setOpaque(true);
		calcular.setBackground(Color.GREEN);
		mipanel.add(calcular, BorderLayout.CENTER);
		
		//JPANEL CALCULAR RESULTADO
		
		JPanel resultado = new JPanel();
		resultado.setOpaque(true);
		resultado.setBackground(Color.PINK);
		resultado.setLayout(new GridLayout(2,2));
		mipanel.add(resultado, BorderLayout.SOUTH);
		
		JLabel interes = new JLabel("Interés: ");
		interes.setBorder(BorderFactory.createMatteBorder(PROPERTIES, ALLBITS, ABORT, HEIGHT, getForeground()));
		resultado.add(interes);
		
		JTextField interes_text = new JTextField("315.000000002");
		resultado.add(interes_text);
		
		JLabel Monto = new JLabel("Monto: ");
		resultado.add(Monto);
		
		JTextField monto_text = new JTextField("1815.000000002");
		resultado.add(monto_text); 
		
		
		
		return mipanel;
	}
	
	public JPanel calc_interes(){
        Font fuente = new Font("American Typewriter", Font.ITALIC, 40);
        
        JPanel mipanel = new JPanel();
        mipanel.setBackground(Color.WHITE);
        mipanel.setOpaque(true);
        mipanel.setLayout(new BorderLayout());
        
        JLabel titulo = new JLabel(" Interés");
        titulo.setFont(fuente);
        titulo.setForeground(Color.RED); 
        mipanel.add(titulo, BorderLayout.NORTH);

        JPanel calcular = new JPanel();
        calcular.setOpaque(true);
        calcular.setBackground(Color.GREEN);
        calcular.setLayout(new GridLayout(4, 2, 5, 5)); 

        JLabel capitalLabel = new JLabel("Capital:");
        JTextField capitalText = new JTextField("1500");
        JLabel tiempoLabel = new JLabel("Tiempo:");
        JTextField tiempoText = new JTextField("2");
        JLabel tasaLabel = new JLabel("Tasa Interés:");
        JTextField tasaText = new JTextField("0.1");

        calcular.add(capitalLabel);
        calcular.add(capitalText);
        calcular.add(tiempoLabel);
        calcular.add(tiempoText);
        calcular.add(tasaLabel);
        calcular.add(tasaText);
        
        JPanel botonesPanel = new JPanel();
        botonesPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); // FlowLayout centrado con espacio entre botones
        
        JButton calcularButton = new JButton("Calcular");
        botonesPanel.add(calcularButton);
        
        JButton cancelarButton = new JButton("Cancelar");
        botonesPanel.add(cancelarButton);
        
        mipanel.add(calcular, BorderLayout.CENTER);
        mipanel.add(botonesPanel, BorderLayout.EAST);
        
        JPanel resultado = new JPanel();
        resultado.setOpaque(true);
        resultado.setBackground(Color.PINK);
        resultado.setLayout(new GridLayout(2, 2));

        JLabel interesLabel = new JLabel("Interés:");
        JTextField interesText = new JTextField("315.0000000000002");
        JLabel montoLabel = new JLabel("Monto:");
        JTextField montoText = new JTextField("1815.0000000000002");

        resultado.add(interesLabel);
        resultado.add(interesText);
        resultado.add(montoLabel);
        resultado.add(montoText);
        
        mipanel.add(resultado, BorderLayout.SOUTH);
        
        return mipanel;
	}
}
