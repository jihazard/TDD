package LADDER;

public class Row {

	int[] persons;
	Node[] nodes;

	public Row(NaturalNum noOfPerson) {

		nodes = new Node[noOfPerson.getNumber()];
		
	}

	public void drawLine(NaturalNum startPosition) {

		int startIndex = startPosition.toArrayIndex();

		if (startIndex >= nodes.length - 1) {
			throw new IllegalArgumentException(
					String.format("시작시점은  %d 미만이어야 합니다. 현재값 : %d", nodes.length - 1, startPosition));
		}
		if (nodes[startIndex].equals(Node.createLEFTNode())) {
			throw new IllegalArgumentException("상태를 변경할 수 없습니다.");
		}

		nodes[startIndex].changeRight();
		nodes[startIndex + 1].changeLeft();

	}

	public Marker move(Marker startMarker) {
		return nodes[startMarker.toArrayIndex()].move(startMarker);
	}

}
