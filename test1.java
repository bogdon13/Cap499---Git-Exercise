
public class test1 {

	public static void main(String[] args) {
		
		int[] myNum = new int[]{34, 46, 26, 56};
		
		int temp;
		
		for(int i=0; i < myNum.length; i++) {
			for(int j=0; j < myNum.length; j++) {
				if(myNum[i] > myNum[j]) {
					temp = myNum[i];
					myNum[i] = myNum[j];
					myNum[j] = temp;
				}
			}
		}
		for(int i=0; i < myNum.length; i++) {
			System.out.println(myNum[i]);
		}
	}

}
