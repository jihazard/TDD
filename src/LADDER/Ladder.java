package LADDER;

 class Ladder {

	private Row[] rows;
	
	 Ladder(int countOfRows, int noOfPerson) {
		// TODO Auto-generated constructor stub
		rows = new Row[countOfRows];
		for (int i = 0; i < countOfRows; i++) {
			rows[i] = new Row(noOfPerson);
			
		}
		
	}

	 void drawLine(int noOfRow, int startPosition) {
		// TODO Auto-generated method stub
		rows[noOfRow].drawLine(startPosition);
	}

	// 좌우이동 처리 로직
	 int run(int nthOfPerson) {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows.length; i++) {
			
			Row row= rows[i];
			nthOfPerson = row.move(nthOfPerson);
			
		}

		return nthOfPerson;
	}


}
