package org.william;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.william.items.Bass;
import org.william.items.Flute;
import org.william.items.Guitar;

public class Main extends JFrame implements KeyListener {
	private static final long serialVersionUID = 1L;
	private Inventory<Object> inventory;
	private int WIDTH = 200, HEIGHT = 200;
	private String title = "game?";
	
	File guitarSound = new File("src/org/william/resources/wav/guitar.wav");
	File bassSound = new File("src/org/william/resources/wav/bass.wav");
	File fluteSound = new File("src/org/william/resources/wav/flute.wav");
	
	Guitar guitar = new Guitar("Waldman", guitarSound);
	Bass bass = new Bass("Tagima", bassSound);
	Flute flute = new Flute("YFL-311", fluteSound);
	
	public Main() {
		this.setSize(WIDTH, HEIGHT);
		this.setTitle(title);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(this);
		this.setFocusable(true);
		this.setVisible(true);
		
		inventory = new Inventory<>();
		inventory.addItem(guitar.getModel());
		inventory.addItem(bass.getModel());
		inventory.addItem(flute.getModel());

		System.out.println("1 = Guitar \n2 = Bass \n3 = Flute");
		System.out.println("playing some notes");
		System.out.println("Current instrument = " + inventory.getCurrentItem());
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		char key = e.getKeyChar();
		switch (Character.toString(key).toLowerCase()) {
		case "a":
			System.out.println(key);
			try {
				guitar.sound(guitarSound);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			break;
		case "b":
			System.out.println(key);
			try {
				bass.sound(bassSound);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			break;
		case "c":
			System.out.println(key);
			try {
				flute.sound(fluteSound);
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e1) {
				e1.printStackTrace();
			}
			break;
			
			default: System.out.println("teste");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
