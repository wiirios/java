package org.william;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Instrument {
	private String model;
	private File sound;
	
	public Instrument(String model, File sound) {
		this.model= model;
		this.sound = sound;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public File getSound() {
		return sound;
	}

	public void setSound(File sound) {
		this.sound = sound;
	}
	
	public void sound(File sound) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		
		clip.open(audioStream);
		clip.start();
	}
}
