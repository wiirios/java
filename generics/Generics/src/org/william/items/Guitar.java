package org.william.items;

import java.io.File;

import org.william.Instrument;

public class Guitar extends Instrument {
	public Guitar(String model, File sound) {
		super(model, sound);
	}

	@Override
	public String toString() {
		return getModel();
	}
}
