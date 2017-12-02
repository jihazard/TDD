package LADDER;

import core.NaturalNum;

public class Marker extends NaturalNum{

	 public Marker(int number) {
		super(number);
		// TODO Auto-generated constructor stub
	}

	 Marker moveRight() {
		// TODO Auto-generated method stub
		return new Marker(getNumber()+1);
	}
	 
	 Marker moveLeft() {
		// TODO Auto-generated method stub
		return new Marker(getNumber()-1);
	}


}
