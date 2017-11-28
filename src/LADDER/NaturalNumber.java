package LADDER;

public class NaturalNumber {
		private int number;
		
		public NaturalNumber(int number) {
			// TODO Auto-generated constructor stub
		
			if(number < 1) {
				throw new IllegalArgumentException(String.format("자연수는 1 이상이영야 합니다.. : %d", number));
				}
			this.number = number;
		}
		
		
		public int getNumber() {
			return this. number;
		}


		public int toArrayIndex() {
			// TODO Auto-generated method stub
			return this.number-1;
		}
}
