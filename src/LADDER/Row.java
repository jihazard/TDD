package LADDER;

import core.NaturalNum;

public class Row {

	Node[] nodes;

	public Row(NaturalNum noOfPerson) {

		nodes = new Node[noOfPerson.getNumber()];
	for (int i = 0; i < nodes.length; i++) {
		nodes[i] = Node.createCenterNode();
	}
	}

	public void drawLine(NaturalNum startPosition) {

		int startIndex = startPosition.toArrayIndex();

		if (isOverArrayLength(startIndex)) {
			throw new IllegalArgumentException(
					String.format("시작시점은  %d 미만이어야 합니다. 현재값 : %d", nodes.length - 1, startPosition));
		}
		if (nodes[startIndex].isLeftDirection()) {
			throw new IllegalArgumentException("상태를 변경할 수 없습니다.");
		}

		nodes[startIndex].changeRight();
		nodes[startIndex + 1].changeLeft();

	}

	private boolean isOverArrayLength(int startIndex) {
		
		//사람수가 5일 경우 선 시작 위치는 4이상이 될 수없다 즉 3까지 허용
		return startIndex >= nodes.length - 1;
	}

	public Marker move(Marker startMarker) {
		return nodes[startMarker.toArrayIndex()].move(startMarker);
	}

	Node[] getNodes() {
		// TODO Auto-generated method stub
		return this.nodes;
	}
	
	 void generatorRow(StringBuilder sb, int currentHeight ,NaturalNum height, NaturalNum nOfPerson) {
	
		for (int j = 0; j < nodes.length; j++) {
			Node node= nodes[j];	
			sb.append(node.getSymbol());
			
			if (height.toArrayIndex() == currentHeight && nOfPerson.toArrayIndex()== j){
				sb.append("*");
				}
			sb.append(" ");
		}
		
		sb.append("\n");
	}
}
