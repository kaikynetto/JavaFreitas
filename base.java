
import java.awt.*;
import javax.swing.*; 
public class base {
	
	private static JPanel Painel = new JPanel();
	private static JFrame Formulario= new JFrame();
	
	public static void main(String[] args) {
		//definir o tamanho da tela
		Formulario.setSize(600, 400);
		//a memória
		Formulario.setDefaultCloseOperation(Formulario.EXIT_ON_CLOSE);
		//exemplo de título
		Formulario.setTitle("Exemplo de tela");
		//centralizar tela
		Formulario.setLocationRelativeTo(null);
		//adicional painel
		Formulario.add(Painel);
		//desligar o gerenciador de layout
		Painel.setLayout(null);
		Formulario.setVisible(true);
		
		

	}

}
