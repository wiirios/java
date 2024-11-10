package org.william.items;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.william.Instrument;

public class Flute extends Instrument {
	public Flute (String model, File sound) {
		super(model, sound);
	}
	
	@Override
	public String toString() {
		return getModel();
	}
	
	@Override
	public void sound(File sound) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		super.sound(sound);
	}
}
