package LADDER;

public class Row {
	int[] persons;

	Row(int noOfPerson) {
		persons = new int[noOfPerson];
	}

	void drawLine(int startPostion) {
		persons[startPostion] = 1;
		persons[startPostion + 1] = 1;

	}

	int moveRow(int nthOfPerson) {
		if (isNoLine(nthOfPerson)) {
			return nthOfPerson;
		}
		// 좌측처리
		if (isNotLeftEnd(nthOfPerson) && canLeftt(nthOfPerson)) {
			return nthOfPerson - 1;
		}
		return nthOfPerson + 1;
	}

	
	private boolean canLeftt(int nthOfPerson) {
		return persons[nthOfPerson - 1] == 1;
	}

	private boolean isNotLeftEnd(int nthOfPerson) {
		return nthOfPerson - 1 >= 0;
	}

	private boolean isNoLine(int nthOfPerson) {
		return persons[nthOfPerson] == 0;
	}
}
