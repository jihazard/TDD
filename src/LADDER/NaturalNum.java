package LADDER;

public class NaturalNum {

	private int number;

	public NaturalNum(int number) {
		// TODO Auto-generated constructor stub
		if(number < 1){
			throw new IllegalArgumentException(String.format(". 자연수는 1보다 커야 합니다. %d" , number));
		}
		this.number=  number;
	}

	public int getNumber() {
		// TODO Auto-generated method stub
		return this.number ;
	}

	public int toArrayIndex() {
		// TODO Auto-generated method stub
		return number - 1 ;
	}

}
