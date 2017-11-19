
public class Calcu {
	
	int add(String text){
		
		if (text.isEmpty()){
			return 0;
		} 

		String[] numbers = split(text);
		int[] values = toInt(numbers);
		return sum(values);
	}
	
	int[] toInt(String[] numbers){
		int[] values= new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			values[i] = Integer.parseInt(numbers[i]);
		}
		return values;
	}
	
	int sum(int[] numbers){
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			sum +=numbers[i];
		}
		return sum;
	}
	
	String[] split(String text){
		return text.split(",|\n");
	}
	
	
	public static void main(String[] args) {
		
		Calcu cal = new Calcu();
		System.out.println("0 : " + cal.add(""));
		System.out.println("1 : " + cal.add("1"));
		System.out.println("12 : " + cal.add("1,2"));
		System.out.println("123 : " + cal.add("1,2,3"));
		System.out.println("123 \n : " + cal.add("1\n2,3"));
		System.out.println("123 ,\n : " + cal.add("1,2\n3"));
		System.out.println("0 : " + cal.add("1\n2\n3"));		
		
		
	}
}
