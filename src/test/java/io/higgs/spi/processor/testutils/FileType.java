package io.higgs.spi.processor.testutils;

public enum FileType {
	VALID, INVALID;
	
	public String getLocation() {
		return name().toLowerCase();
	}
}
