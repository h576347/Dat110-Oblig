package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] payload;

	public Message(byte[] payload) {
		this.payload = payload; // TODO: check for length within boundary
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload; 
	}

	public byte[] encapsulate() {
		
		// TODO
				// encapulate/encode the payload of this message in the
				// encoded byte array according to message format
		
		byte[] encoded = null;
		encoded = new byte[MessageConfig.SEGMENTSIZE];
		
		int lengde = payload.length;
		encoded[0] = (byte)lengde;
		
		for(int i = 0; i < payload.length; i++) {		
			encoded[i + 1] = payload[i];
		}

		return encoded;
		
	}

	public void decapsulate(byte[] received) {

		// TODO
		// decapsulate the data contained in the received byte array and store it 
		// in the payload of this message
		
		int lengde = received[0];
		payload = new byte[lengde];
		
		for(int i = 0; i < lengde; i++) {
			payload[i] = received[i + 1];
		}	
	}
}
