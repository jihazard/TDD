package LADDER;

public class Ladder {

	Row[] rows;
	
	public Ladder(int countOfRows, int noOfPerson) {
		// TODO Auto-generated constructor stub
		rows = new Row[countOfRows];
		for (int i = 0; i < countOfRows; i++) {
			rows[i] = new Row(noOfPerson);
			
		}
		
	}

	public void drawLine(int noOfRow, int startPosition) {
		// TODO Auto-generated method stub
		rows[noOfRow].drawLine(startPosition);
	}

	// 좌우이동 처리 로직
	public int run(int nthOfPerson) {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows.length; i++) {
			
			Row row= rows[i];
			nthOfPerson = row.moveRow(nthOfPerson);
			
		}

		return nthOfPerson;
	}


}
