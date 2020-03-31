package com.tutosoftware.manobluetooth.app;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.panamahitek.PanamaHitek_Arduino;

import javax.swing.JButton;
import javax.swing.JFrame;


public class ManoWindow extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();

	public ManoWindow() {
		
		
		
		  
		 initComponents();
		 try {
		        arduino.arduinoTX("COM8", 9600);
		        } catch (Exception ex) {
		            Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
		        }
		  
	}
	
	
	private void initComponents() {
		
		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  setBounds(100, 100, 450, 300);
		  setTitle("Tutosoftware  Mano Bluetooth  Arduino");
		  ManoPanel p = new ManoPanel(new FlowLayout(FlowLayout.LEFT));
		  
		  
          JButton botonUno = new JButton();
		  botonUno.setForeground(Color.WHITE);
		  botonUno.setFocusPainted(false);
		  botonUno.setBorderPainted(true);
		  botonUno.setContentAreaFilled(false);
		  botonUno.setText("1");
		  botonUno.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonUnoActionPerformed(evt);
			  }
			  
		  });
		  
		  
		  JButton botonDos = new JButton();
          botonDos.setForeground(Color.WHITE);
          botonDos.setFocusPainted(false);
		  botonDos.setBorderPainted(true);
		  botonDos.setContentAreaFilled(false);
		  botonDos.setText("2");
		  
          botonDos.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonDosActionPerformed(evt);
			  }
			  
		  });
		  
		  JButton botonTres = new JButton();
		  botonTres.setForeground(Color.WHITE);
		  botonTres.setFocusPainted(false);
		  botonTres.setBorderPainted(true);
		  botonTres.setContentAreaFilled(false);
		  botonTres.setText("3");
		  
          botonTres.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonTresActionPerformed(evt);
			  }
			  
		  });
		  
		  JButton botonCuatro = new JButton();
		  botonCuatro.setForeground(Color.WHITE);
		  botonCuatro.setFocusPainted(false);
		  botonCuatro.setBorderPainted(true);
		  botonCuatro.setContentAreaFilled(false);
		  botonCuatro.setText("4");
		  
          botonCuatro.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonCuatroActionPerformed(evt);
			  }
			  
		  });
		  
		  JButton botonAbrir = new JButton();
		  botonAbrir.setForeground(Color.WHITE);
		  botonAbrir.setFocusPainted(false);
		  botonAbrir.setBorderPainted(true);
		  botonAbrir.setContentAreaFilled(false);
		  botonAbrir.setText("Abrir mano");
		  
          botonAbrir.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonAbrirActionPerformed(evt);
			  }
			  
		  });
		  
		  JButton botonCerrar = new JButton();
		  botonCerrar.setForeground(Color.WHITE);
		  botonCerrar.setFocusPainted(false);
		  botonCerrar.setBorderPainted(true);
		  botonCerrar.setContentAreaFilled(false);
		  botonCerrar.setText("Cerrar mano");
		  
          botonCerrar.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonCerrarActionPerformed(evt);
			  }
			  
		  });
		  
		  JButton botonPaz = new JButton();
		  botonPaz.setForeground(Color.WHITE);
		  botonPaz.setFocusPainted(false);
		  botonPaz.setBorderPainted(true);
		  botonPaz.setContentAreaFilled(false);
		  botonPaz.setText("Paz y amor");
		  
          botonPaz.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonPazActionPerformed(evt);
			  }
			  
		  });
		  
		  JButton botonOk = new JButton();
		  botonOk.setForeground(Color.WHITE);
		  botonOk.setFocusPainted(false);
		  botonOk.setBorderPainted(true);
		  botonOk.setContentAreaFilled(false);
		  botonOk.setText("OK");
		  
          botonOk.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonOkActionPerformed(evt);
			  }
			  
		  });
		  
		  JButton botonSaludo = new JButton();
		  botonSaludo.setForeground(Color.WHITE);
		  botonSaludo.setFocusPainted(false);
		  botonSaludo.setBorderPainted(true);
		  botonSaludo.setContentAreaFilled(false);
		  botonSaludo.setText("Saludo");
		  
		  
          botonSaludo.addActionListener(new ActionListener() {
			  
			  public void actionPerformed(ActionEvent evt) {
				  botonSaludoActionPerformed(evt);
			  }
			  
		  });
		  
		  
		  
		  
		  p.add(botonUno);
		  p.add(botonDos);
		  p.add(botonTres);
		  p.add(botonCuatro);
		  p.add(botonAbrir);
		  p.add(botonCerrar);
		  p.add(botonPaz);
		  p.add(botonOk);
		  p.add(botonSaludo);
		  
		  
		  
		  setContentPane(p);
		  setVisible(true);
		  
		  
		  
		  
		  
		  
		  
		
	}
	
	private void botonUnoActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("1");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	private void botonDosActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("2");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	private void botonTresActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("3");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	private void botonCuatroActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("5");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	private void botonAbrirActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("a");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	private void botonCerrarActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("b");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	private void botonPazActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("c");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	private void botonOkActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("d");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}
	
	private void botonSaludoActionPerformed(ActionEvent e) {
		try {
			arduino.sendData("e");
			
		}catch(Exception ex) {
			
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE, null, ex);
			
		}
	}

}
