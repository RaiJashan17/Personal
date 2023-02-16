package main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		//Labels
		JLabel label=new JLabel(); //Creates label object
		ImageIcon imageLabel=new ImageIcon("src/winorlose.jpeg");
		label.setText("You gonna win or lose?"); //Changes label object
		label.setIcon(imageLabel);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(new Color(120,50,200));
		label.setFont(new Font("Times New Roman",Font.PLAIN,20));
		label.setIconTextGap(50);
		
		//Frame
		JFrame frame=new JFrame(); //Creates a frame
		frame.setSize(1920, 1080); //Sets the dimensions of the frame
		frame.setTitle("Jashan Rai's Doom"); //Sets the title at top
		frame.add(label);
		ImageIcon imageLogo=new ImageIcon("src/download.png"); //Creates image icon
		frame.setIconImage(imageLogo.getImage()); //Changes icon of frame
		frame.setVisible(true); //Makes frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exits out of app
		
	}

}
