import java.awt.*;

import javax.swing.*; 
public class Exemplo {
	private static JPanel Painel = new JPanel();
	private static JFrame Formulario= new JFrame();

	
	public static void main(String[] args) {
				
				//definir o tamanho da tela
				Formulario.setSize(600, 400);
				//a memória
				Formulario.setDefaultCloseOperation(Formulario.EXIT_ON_CLOSE);
				//exemplo de título
				Formulario.setTitle("Aula dia 07/10/22");
				//centralizar tela
				Formulario.setLocationRelativeTo(null);
				//adicional painel
				Formulario.add(Painel);
				//desligar o gerenciador de layout
				Painel.setLayout(null);
				Formulario.setVisible(true);
				//definir uma cor para o painel
				Painel.setBackground(Color.CYAN);
				//Criar um label
				JLabel label= new JLabel("Boa tarde");
				//Posicionar o objeto
				label.setBounds(250, 5, 100, 30);
				//Inserir objeto 
				Painel.add(label);
				
				// Criar uma caixa de texto
				JTextField caixatext= new JTextField();
				caixatext.setBounds(250,30, 100, 30);
				
				Painel.add(caixatext);
				
				//Criando um botão
				JButton botao= new JButton("Enviar");
				botao.setBounds(250, 60, 100, 30);
				Painel.add(botao);
				
				
	

	}

}
