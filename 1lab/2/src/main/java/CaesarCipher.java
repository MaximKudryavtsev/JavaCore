class CaesarCipher{
	public static void encode(String alphabet, String string, int key) {
		int[] positions = new int[string.length()];
		int alphabetLength = alphabet.length();
		for (int i = 0; i < string.length(); i++) {
			positions[i] = alphabet.indexOf(string.charAt(i));
			positions[i] -= key;
			if (positions[i] < 0) {
				while (positions[i] < 0) positions[i] += alphabetLength;
			}
			System.out.print(alphabet.charAt(positions[i]));
		}
	}
	
	public static void decode(String alphabet, String string, int key) {
		int[] positions = new int[string.length()];
		int alphabetLength = alphabet.length();
		for (int i = 0; i < string.length(); i++) {
			positions[i] = alphabet.indexOf(string.charAt(i));
			positions[i] += key;
			if (positions[i] > alphabetLength - 1) {
				while (positions[i] > alphabetLength) positions[i] -= alphabetLength;
			}
			System.out.print(alphabet.charAt(positions[i]));
		}
	}
	
    public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String modeOfOperation = args[0];
        int key = Integer.parseInt(args[1]);
		String string = args[2];
		string = string.toLowerCase();
		if (modeOfOperation.compareTo("-e") == 0) {
			encode (alphabet, string, key);
		} else if (modeOfOperation.compareTo("-d") == 0) {
			decode(alphabet, string, key);
		}
		
		
	}
}	

