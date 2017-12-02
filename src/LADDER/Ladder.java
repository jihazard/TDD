package LADDER;

class Ladder {

	private Row[] rows;


	Ladder(NaturalNum height, NaturalNum noOfPerson) {
		// TODO Auto-generated constructor stub

		rows = new Row[height.getNumber()];
		for (int i = 0; i < height.getNumber(); i++) {
			rows[i] = new Row(noOfPerson);

		}

	}

	void drawLine(NaturalNum height, NaturalNum startPosition) {
		// TODO Auto-generated method stub
		int startIndex = height.toArrayIndex();
		
		if (startIndex > rows.length - 1) {
			throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어씃ㅂ니다. : %d", height));

		}

		rows[startIndex].drawLine(startPosition );
	}
  


	// 좌우이동 처리 로직

	int run(Marker nthOfPerson) {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows.length; i++) {
			Row row = rows[i];
			nthOfPerson = row.move(nthOfPerson);

		}
		return nthOfPerson.getNumber();
	}
}
