package LADDER;

 class Ladder {

	private Row[] rows;
	
	
	 
	 Ladder(NaturalNumber height, NaturalNumber noOfPerson) {
			// TODO Auto-generated constructor stub
			 
			 
			rows = new Row[height.getNumber()];
			for (int i = 0; i < height.getNumber(); i++) {
				rows[i] = new Row(noOfPerson);
				
			}
			
		}
	 

	 void drawLine(int height, int startPosition) {
		// TODO Auto-generated method stub
		if(height < 0 ){
			 throw new IllegalArgumentException(String.format("사다리 높이는 0이상이야 합니다 : %d", height ));
			 	
		}
		if(height < rows.length -1  ){
			 throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어씃ㅂ니다. : %d", height ));
			 	
		}
		 
		 
		 rows[height].drawLine(startPosition);
	}
	 
	 void drawLine(NaturalNumber height, NaturalNumber startPosition) {
			// TODO Auto-generated method stub
			int startIndex = height.toArrayIndex();
			if(startIndex < 0 ){
				 throw new IllegalArgumentException(String.format("사다리 높이는 0이상이야 합니다 : %d", height ));
				 	
			}
			if(startIndex < rows.length -1  ){
				 throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어씃ㅂ니다. : %d", height ));
				 	
			}
			 
			 
			 rows[startIndex].drawLine(startPosition);
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
