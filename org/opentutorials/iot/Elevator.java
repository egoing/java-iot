package org.opentutorials.iot;

public class Elevator {
	String _id;
	public Elevator(String id) {
		this._id = id;
	}

	public Boolean callForUp() {
		System.out.println(this._id+" → Elevator callForUp");
		return true;
	}
	
	public Boolean callForDown() {
		System.out.println(this._id+" → Elevator callForDown");
		return true;
	}
}