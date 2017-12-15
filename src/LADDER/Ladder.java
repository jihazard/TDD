package LADDER;

import core.NaturalNum;
import core.NaturalNumberTest;
import core.Postion;

class Ladder {
	private LadderCreator ladderCreator;
	
	Ladder(NaturalNum height, NaturalNum noOfPerson) {
		// TODO Auto-generated constructor stub
		ladderCreator = new LadderCreator(height, noOfPerson);
		
	}

	void drawLine(NaturalNum height, NaturalNum startPosition) {
		// TODO Auto-generated method stub
	
		ladderCreator.drawLine(height, startPosition);
	
	}

	

	// 좌우이동 처리 로직


	Marker run(Marker nthOfPerson) {
		// TODO Auto-generated method stub
		LadderRunner ladderRunner = new LadderRunner(ladderCreator.getLadder()); 
		return ladderRunner.run(nthOfPerson);
	}


	

	private static void generatorRow(NaturalNum height, NaturalNum nOfPerson, StringBuilder sb, int i, Row row) {
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
}
