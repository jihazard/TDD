package core;

public class Postion {

	private NaturalNum height;
	private NaturalNum nOfPerson;

	 public Postion(NaturalNum height, NaturalNum nOfPerson) {
		// TODO Auto-generated constructor stub
		this.height= height;
		this.nOfPerson = nOfPerson;
		
		
	}

	 Postion(int height, int nOfPerson) {
		// TODO Auto-generated constructor stub
		 this(new NaturalNum(height), new NaturalNum(nOfPerson));
		 
	}

	 public static Postion createFromArrayIndex(int height, int nthOfPerson) {
			// TODO Auto-generated method stub
			return new Postion(NaturalNum.createFromArrayIndex(height),
							   NaturalNum.createFromArrayIndex(nthOfPerson));
		}
	   
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((height == null) ? 0 : height.hashCode());
		result = prime * result + ((nOfPerson == null) ? 0 : nOfPerson.hashCode());
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
		Postion other = (Postion) obj;
		if (height == null) {
			if (other.height != null)
				return false;
		} else if (!height.equals(other.height))
			return false;
		if (nOfPerson == null) {
			if (other.nOfPerson != null)
				return false;
		} else if (!nOfPerson.equals(other.nOfPerson))
			return false;
		return true;
	}

	public static Postion creat(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	 
	
}
