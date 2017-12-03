package LADDER;

import core.NaturalNum;
import core.NaturalNumberTest;

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
		
		if ( isOverHeight(height)) {
			throw new IllegalArgumentException(String.format("사다리 최대 높이를 넘어씃ㅂ니다. : %d", height));

		}

		rows[ height.toArrayIndex()].drawLine(startPosition );
	}

	private boolean isOverHeight(NaturalNum height) {
		return height.toArrayIndex()> rows.length - 1;
	}
  


	// 좌우이동 처리 로직


	Marker run(Marker nthOfPerson) {
		// TODO Auto-generated method stub
		for (int i = 0; i < rows.length; i++) {
			Row row = rows[i];
			nthOfPerson = row.move(nthOfPerson);
			String result =generator(rows, new NaturalNum(i+1), nthOfPerson);
			System.out.println(result);

		}
		return nthOfPerson;
	}

	 static String generator(Row[] rows, NaturalNum height, NaturalNum nOfPerson) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < rows.length; i++) {
			Row row = rows[i];
			Node[] nodes= row.getNodes();
			for (int j = 0; j < nodes.length; j++) {
				Node node= nodes[j];	
				if (node.equals(Node.createCenterNode())){
					sb.append("0");
					}else if(node.equals(Node.createLEFTNode())){
						sb.append("-1");
					}else if(node.equals(Node.createRIGHTNode())){
						sb.append("1");
					}
				if (height.toArrayIndex() == i && nOfPerson.toArrayIndex()== j){
					sb.append("*");
					}
				sb.append(" ");
			}
			
			sb.append("\n"); 
			
		}
		
		return sb.toString();
	}
}
