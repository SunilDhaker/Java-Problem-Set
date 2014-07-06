public class prob1 {

	public static void main(String[] args) {

		String in = "aaaaabbbbbbcccccdddddddgggggg";
		System.out.println(compress(in));

		
		//dont why its not working 
		//compress2(in.toCharArray());
	}


	
	
	
	private static String  compress(String in){
		
		/**
		 * 
		 * @param in input String that to be compresse
		 * @return output String
		 */
	
	int freq = 1;
    String out = "";
	// doing the stuff ..
	char last = in.charAt(0);
	char a = ' ';
	for (int i = 1; i < in.length(); i++) {

		a = in.charAt(i);

		if (last == a) {
			freq += 1;
		} else {

			out = out + last + freq;
			freq = 1;
			last = a;
		}

	}
	out = out + last + freq;
	return out;
}

	

	private static void  compress2(char[] in){
		

		/**
		 * 
		 * this method prints the compressed String 
		 * 
		 * @param in  charcter squence that to be compressed
		 */
	
	int freq = 1;
    
	// doing the stuff ..
	char last = in[0];
	char a ;
	for (int i = 1; i < in.length; i++) {

		a = in[i];

		if (last == a) {
			freq += 1;
		} else {

			System.out.print(last + freq);
			freq = 1;
			last = a;
		}

	}
	
	System.out.println(last+freq);
}

}
