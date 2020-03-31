package com.tutosoftware.manobluetooth.app;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ManoPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ManoPanel(FlowLayout flowLayout) {
		this.setSize(900,700);
	}
	
	 @Override
	 public void paintComponent(Graphics g) {
	  Dimension tamanio = getSize();
	  ImageIcon imagenFondo = new ImageIcon(getClass().getResource("/com/tutosoftware/manobluetooth/image/mano.jpg"));
	  g.drawImage(imagenFondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
	  setOpaque(false);
	  super.paintComponent(g);
	 }
	
	
	

}
