

import java.awt.*;

import javax.swing.*; 
public class Exercicio1{
	
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
		Formulario.setTitle("Desenvolvimento Aberto");
		//centralizar tela
		Formulario.setLocationRelativeTo(null);
		//adicional painel
		Formulario.add(Painel);
		//Criar um label - Titulo --------------------------------------
		JLabel label= new JLabel("Database - Cadastro de Funcionário");
//		//Posicionar o objeto
		label.setBounds(150, 5, 400, 30);
//		//Inserir objeto 
		Painel.add(label);
//		//----------------------------------------------------------------------------------------------------
//		//Mudando a fonte , estilo ,Tamanho
		Font f= new Font ("Arial" , Font.BOLD , 20);
//		
		label.setFont(f);
//		//-----------------------------------------------------------------------------------
//		//Mudando a cor da fonte
		label.setForeground(Color.BLUE);
//		//Criar um label - CÓDIGO --------------------------------------
		JLabel labelcodigo= new JLabel("Código:");
//		//Posicionar o objeto
		labelcodigo.setBounds(70,60, 100, 30);
		labelcodigo.setForeground(Color.RED);
		
		//Inserir objeto 
		Painel.add(labelcodigo);
//		
//		//Criando a caixa de text0
		JTextField caixatextcod= new JTextField();
		caixatextcod.setBounds(450,60, 100, 30);
		Painel.add(caixatextcod);
		//-------------------------------------------------------------------------------------
		//Criar um label - PRIMEIRO NOME --------------------------------------
				JLabel labelnome= new JLabel("Primeiro Nome:");
				//Posicionar o objeto
				labelnome.setBounds(70,90, 100, 30);
				labelnome.setForeground(Color.red);
				//Inserir objeto
				Painel.add(labelnome);
				//-----------------------------------------------------------------------------------
				//Criando a caixa de text0
				JTextField caixatextnome = new JTextField();
				caixatextnome.setBounds(450,90, 100, 30);
				Painel.add(caixatextnome);
//		//----------------------------------------------------------------------------------------
//				//Criar um label - SOBRENOME --------------------------------------
				JLabel labelsobrenome= new JLabel("Sobrenome:");
//				//Posicionar o objeto
//				
				labelsobrenome.setBounds(70,120, 100, 30);
				labelsobrenome.setForeground(Color.red);
				//Inserir objeto 
				Painel.add(labelsobrenome);
//				//-----------------------------------------------------------------------------------
//				//Criando a caixa de text0
				JTextField caixatextsobrenome = new JTextField();
				caixatextsobrenome.setBounds(450,120, 100, 30);
				Painel.add(caixatextsobrenome);
//		//-------------------------------------------------------------------------------------------
//				//Criar um label - Cargo --------------------------------------
				JLabel labelcargo= new JLabel("Cargo:");
				//Posicionar o objeto
				labelcargo.setBounds(70,150, 100, 30);
				labelcargo.setForeground(Color.red);
				//Inserir objeto 
				Painel.add(labelcargo);
//				//-----------------------------------------------------------------------------------
//				//Criando a caixa de text0
				JTextField caixatextcargo = new JTextField();
				caixatextcargo.setBounds(450,150, 100, 30);
				Painel.add(caixatextcargo);
//		//-----------------------------------------------------------------------------------------------
//				//Criar um label - Salario --------------------------------------
				JLabel labelsalario= new JLabel("Salário:");
				//Posicionar o objeto
				labelsalario.setBounds(70,180, 100, 30);
				labelsalario.setForeground(Color.red);
				//Inserir objeto 
				Painel.add(labelsalario);
//				//-----------------------------------------------------------------------------------
//				//Criando a caixa de text0
				JTextField caixatextsalario = new JTextField();
				caixatextsalario.setBounds(450,180, 100, 30);
				Painel.add(caixatextsalario);
//		//------------------------------------------------------------------------------------------------
//				//Criar um label - Porcentagem --------------------------------------
				JLabel labelporcentagem= new JLabel("Porcentagem:");
//				//Posicionar o objeto
				labelporcentagem.setBounds(70,210, 100, 30);
				labelporcentagem.setForeground(Color.red);
//				//Inserir objeto 
				Painel.add(labelporcentagem);
//				//-----------------------------------------------------------------------------------
//				//Criando a caixa de text0
				JTextField caixatextporcentagem = new JTextField();
				caixatextporcentagem.setBounds(450,210, 100,30 );
				Painel.add(caixatextporcentagem);
//		//---------------------------------------------------------------------------------------------------
				JButton botaonovo = new JButton ("Novo");
				botaonovo.setBounds(70, 250, 100, 30);
				Painel.add(botaonovo);
//		//-----------------------------------------------------------------------------------------------------
//				JButton botaoinserir = new JButton ("Inserir");
//				botaoinserir.setBounds(210, 250, 100, 30);
//				Painel.add(botaoinserir);
//		//------------------------------------------------------------------------------------------------
//				JButton botaoalterar = new JButton ("Alterar");
//				botaoalterar.setBounds(350, 250, 100, 30);
//				Painel.add(botaoalterar);
//		//-------------------------------------------------------------------------------------------------
//				JButton botaoapagar = new JButton ("Apagar");
//				botaoapagar.setBounds(475, 250, 100, 30);
//				Painel.add(botaoapagar);
//		//
//			
		
	Adicionar(botaonovo, 310, 350, 150, 60);
			
		ImageIcon image = new ImageIcon("E:\\logo@4x.png");
		
		image.setImage(image.getImage().getScaledInstance(400, 200, 100));
		
		JLabel labimg = new JLabel(image);
		Adicionar(labimg, 10 , 330, 350, 200);

				//desligar o gerenciador de layout
		Painel.setLayout(null);
		Formulario.setVisible(true);
		
		

	}

}

