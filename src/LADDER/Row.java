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

	public Row(int noOfPerson) {
		persons = new int[noOfPerson];
	}

	public void drawLine(int startPostion) {
		persons[startPostion] = Direction.RIGHT.getNo();
		persons[startPostion + 1] = Direction.LEFT.getNo();

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
