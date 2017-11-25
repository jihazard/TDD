package LADDER;

public class Ladder {
	int[] row;

	public Ladder(int noOfPerson) {
		// TODO Auto-generated constructor stub
		row = new int[noOfPerson];

	}

	public int run(int nthOfPerson) {
		// TODO Auto-generated method stub
		if (row[nthOfPerson] == 0) {
			return nthOfPerson;
		}
		// 좌측처리
		if (nthOfPerson - 1 >= 0) {
			int leftValue = row[nthOfPerson - 1];
			if (leftValue == 1) {
				return nthOfPerson - 1;

			}
		}

		return nthOfPerson + 1;
	}

	public void drawLine(int startPosition) {
		// TODO Auto-generated method stub
		row[startPosition] = 1;
		row[startPosition + 1] = 1;

	}

}
