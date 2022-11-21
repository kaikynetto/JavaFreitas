
import java.awt.*;

import javax.swing.*; 
public class Exerciciotelacadastro {
	
	private static JPanel Painel = new JPanel();
	private static JFrame Formulario= new JFrame();
	public static void Adicionar(Component Objeto, int Coluna, int Linha, int Largura, int Altura) {
		Objeto.setBounds(Coluna, Linha, Largura, Altura);
		Painel.add(Objeto);
	}
	public static void main(String[] args) {
		//definir o tamanho da tela
		Formulario.setSize(1920,1080);
		//Limpar a memória
		Formulario.setDefaultCloseOperation(Formulario.EXIT_ON_CLOSE);
		//exemplo de título
		Formulario.setTitle("Tela de Cadastro aula 01.11");
		//centralizar tela
		Formulario.setLocationRelativeTo(null);
		//CRIANDO LABEL CADASTRO
		JLabel labelcadastro= new JLabel("Cadastro");
		//Posicionar o objeto
		labelcadastro.setBounds(550, 100, 200, 30);
		//Mudando a fonte , estilo ,Tamanho
				Font f= new Font ("Arial" , Font.BOLD , 40);
				labelcadastro.setForeground(Color.magenta);
				labelcadastro.setFont(f);
		//Inserir objeto 
		Painel.add(labelcadastro);
		//CRIANDO LABEL HOME
		JLabel labelhome= new JLabel("Home");
		//Posicionar o objeto
		labelhome.setBounds(130, 350, 100, 30);
		Font fh= new Font ("Arial" , Font.BOLD , 25);
		labelhome.setForeground(Color.blue);
		labelhome.setFont(fh);
	
		//Inserir objeto 
		Painel.add(labelhome);
		//CRIANDO LABEL EMPRESA
		JLabel labelempresa= new JLabel("Empresa");
		//Posicionar o objeto
		labelempresa.setBounds(130, 465, 150, 30);
		Font fe= new Font ("Arial" , Font.BOLD , 25);
		labelempresa.setForeground(Color.blue);
		labelempresa.setFont(fe);
		//Inserir objeto 
		Painel.add(labelempresa);
		//CRIANDO LABEL CONTATO
				JLabel labelcontato= new JLabel("Contato");
				//Posicionar o objeto
				labelcontato.setBounds(130, 550, 150, 30);
				Font fcontato= new Font ("Arial" , Font.BOLD , 25);
				labelcontato.setForeground(Color.blue);
				labelcontato.setFont(fcontato);
				Painel.add(labelcontato);
				
				// COLOCANDO AS IMAGENS
				ImageIcon imagecaipira = new ImageIcon("E:\\caipira.JPEG");
				imagecaipira.setImage(imagecaipira.getImage().getScaledInstance(400,150, 100));
				JLabel labcaipira = new JLabel(imagecaipira);
				Adicionar(labcaipira,95 ,100,200,260);
				Painel.add(labcaipira);
				
				// COLOCANDO AS IMAGENS
				ImageIcon imagecasa = new ImageIcon("E:\\casa.JPG");
				imagecasa.setImage(imagecasa.getImage().getScaledInstance(75,50, 100));
				JLabel labcasa = new JLabel(imagecasa);
				Adicionar(labcasa,1 ,250,200,260);
				Painel.add(labcasa);
				// COLOCANDO AS IMAGENS
				ImageIcon imagempresa = new ImageIcon("E:\\empresa.png");
				imagempresa.setImage(imagempresa.getImage().getScaledInstance(50,100, 100));
				JLabel labempresa = new JLabel(imagempresa);
				Adicionar(labempresa,0 ,450,200 ,65);
				Painel.add(labempresa);
				
				// COLOCANDO AS IMAGENS
				ImageIcon imagectt = new ImageIcon("E:\\ss.png");
				imagectt.setImage(imagectt.getImage().getScaledInstance(65,100, 100));
				JLabel labctt = new JLabel(imagectt);
				Adicionar(labctt,1 ,450,200,250);
				Painel.add(labctt);
				
				// COLOCANDO AS IMAGENS
				ImageIcon image1 = new ImageIcon("E:\\foto1.PNG");
				image1.setImage(image1.getImage().getScaledInstance(400,900, 100));
				JLabel labiimg1 = new JLabel(image1);
				Adicionar(labiimg1,50 ,150,300 ,700);
				Painel.add(labiimg1);
				
				// COLOCANDO AS IMAGENS
				ImageIcon image2 = new ImageIcon("E:\\foto1.PNG");
				image2.setImage(image2.getImage().getScaledInstance(1300,800, 100));
				JLabel labiimg2 = new JLabel(image2);
				Adicionar(labiimg2,400 ,70,1300 ,825);
				Painel.add(labiimg2);
				
				
				
		ImageIcon imagebg = new ImageIcon("E:\\imgmarrom.JPG");
		imagebg.setImage(imagebg.getImage().getScaledInstance(1920, 1080, 100));
		JLabel labimgbg = new JLabel(imagebg);
		Adicionar(labimgbg, 0 ,0, 1920, 1080);
		Painel.add(labimgbg);
		//-------------------------------------------------------------------------------------
		
		
		//adicional painel
		Formulario.add(Painel);
		//desligar o gerenciador de layout
		Painel.setLayout(null);
		Formulario.setVisible(true);
		
		
		

	}
	
}
