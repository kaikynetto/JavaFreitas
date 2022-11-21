import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Trabalho extends JFrame {

	  private ImageIcon icon;
	  private JLabel label;
		private static JPanel Painel = new JPanel();
	  

	  public Trabalho(){

	    icon = new ImageIcon("E:\\background.png");

	    label= new JLabel() {
	      public void paintComponent(Graphics g) {
	        g.drawImage(icon.getImage(), 0, 0, null);
	        super.paintComponent(g);
	      }
	    };
	   

	    label.setText("A B P");
	    
	    
;
	  }

	  public static void main(String[] args) {
		Trabalho frame = new Trabalho();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
		  frame.setSize(400, 700);
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	  }
	} 