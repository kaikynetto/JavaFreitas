import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField ;
import javax.swing.JTextField;


public class SisAdm {

	/**
	 * @param args
	 */
	private static JPanel Painel = new JPanel();
	private static JFrame Formulario= new JFrame();
	
	public static void Adicionar(Component Objeto, int Coluna, int Linha, int Largura, int Altura) {
		Objeto.setBounds(Coluna, Linha, Largura, Altura);
		Painel.add(Objeto);
	}
	
	public static void main(String[] args) {
		//definir o tamanho da tela
		Formulario.setSize(600, 400);
		//a memória
		Formulario.setDefaultCloseOperation(Formulario.EXIT_ON_CLOSE);
		//exemplo de título
		Formulario.setTitle("Sistema administrativo");
		//centralizar tela
		Formulario.setLocationRelativeTo(null);
		//adicional painel
		Formulario.add(Painel);
		//Criar um label - Titulo --------------------------------------
		JLabel label= new JLabel("ABP");
//		//Posicionar o objeto
		label.setBounds(150, 5, 400, 30);
//		//Inserir objeto 
		Painel.add(label);
		
		JLabel label2= new JLabel("Soluções em identificação");
//		//Posicionar o objeto
		label2.setBounds(150, 25, 400, 30);
//		//Inserir objeto 
		Painel.add(label2);
//		//----------------------------------------------------------------------------------------------------
//		//Mudando a fonte , estilo ,Tamanho
		Font f= new Font ("Arial" , Font.BOLD , 20);
//		
		label.setFont(f);
		
		//Inserir objeto 
		//-------------------------------------------------------------------------------------

				JLabel labelnome= new JLabel("Kaiky Dias Netto");
				//Posicionar o objeto
				labelnome.setBounds(70,90, 150, 30);
				labelnome.setForeground(Color.red);
				//Inserir objeto
				Painel.add(labelnome);
				//-------------------------------------
				
				JLabel  labelnome2= new JLabel ("CEO");
				//Posicionar o objeto
				labelnome2.setBounds(70,240, 100, 30);
				labelnome2.setForeground(Color.red);
				//Inserir objeto
				Painel.add(labelnome2);
//		//-----------------------------------------------------------------------------------------------------
//				JButton botaoinserir = new JButton ("Inserir");
//				botaoinserir.setBounds(210, 250, 100, 30);
//				Painel.add(botaoinserir);
//		//------------------------------------------------------------------------------------------------
//				JButton botaoalterar = new JButton ("Alterar");
//				botaoalterar.setBounds(350, 250, 100, 30);
//				Painel.add(botaoalterar);
//		//
//			
		
//	Adicionar(botaonovo, 310, 350, 150, 60);
				Container c = Formulario.getContentPane();

				c.setBackground(Color.red);
			
		ImageIcon image = new ImageIcon("E:\\kaiky.jpeg");
		
		image.setImage(image.getImage().getScaledInstance(500, 200, 100));
		
		JLabel labimg = new JLabel(image);
		Adicionar(labimg, 250,150, 250, 100);

				//desligar o gerenciador de layout
		Painel.setLayout(null);
		Formulario.setVisible(true);
		
		

	}

}
