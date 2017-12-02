package core;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NaturalNum other = (NaturalNum) obj;
		if (number != other.number)
			return false;
		return true;
	}

	 
	 	
}
