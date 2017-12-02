package LADDER;

public class Row {
	
	enum Direction{
		LEFT(-1),
		CENTER(0),
		RIGHT(1);
		
		private int no;
		private Direction(int no) {
			// TODO Auto-generated constructor stub
		this.no = no;
		}
		public int getNo(){
			return no;
		}
	}
	

	int[] persons;
	
	public Row(NaturalNum noOfPerson)  {

		
		persons = new int[noOfPerson.getNumber()];		
	}





	public void drawLine(NaturalNum startPosition) {
		  
		 int startIndex = startPosition.toArrayIndex();
		 
		if(startIndex >= persons.length-1){
			 throw new IllegalArgumentException(String.format("시작시점은  %d 미만이어야 합니다. 현재값 : %d",persons.length-1,startPosition));
		 }
		 
		 if(persons[startIndex]==-1){
			 throw new IllegalArgumentException("선을 그을수 없는 위치입니다.");
		 }
		 
		 
		persons[startIndex] = Direction.RIGHT.getNo();
		persons[startIndex + 1] = Direction.LEFT.getNo();

	}

	public int move(int nthOfPerson) {
		if (isNoLine(nthOfPerson)) {
			return nthOfPerson;
		}
		
		if(persons[nthOfPerson]==1){
			return nthOfPerson +1;
		}
		
		
		return nthOfPerson - 1;
	}

	
	private boolean canLeftt(int nthOfPerson) {
		return persons[nthOfPerson - 1] == Direction.RIGHT.getNo();
	}

	private boolean isNotLeftEnd(int nthOfPerson) {
		return nthOfPerson - 1 >= 0;
	}

	private boolean isNoLine(int nthOfPerson) {
		return persons[nthOfPerson] == Direction.CENTER.getNo();
	}
}
