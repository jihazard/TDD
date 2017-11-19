
public class StringCalculator {

	public String[] split(String text) {
		// TODO Auto-generated method stub
		if(text==null){
			return new String[]{};
		}
		return text.split(",|\n");
	}

	public int[] toInt(String[] test) {
		if(test==null){
			return new int[]{};
		}
		int[] numbers= new int[test.length];
		
		for (int i = 0; i < test.length; i++) {
			numbers[i] = Integer.parseInt(test[i]);
		}
		return numbers ;
	}
		
}
