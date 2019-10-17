package org.opentutorials.iot;

import java.util.Random;

public class Speaker {
	String _id;
	public Speaker(String id) {
		this._id = id;
	}
	public Boolean makeVoice(String content) {
		System.out.println(this._id + " -> Speaker on : " + content);
		return true;
	}
}