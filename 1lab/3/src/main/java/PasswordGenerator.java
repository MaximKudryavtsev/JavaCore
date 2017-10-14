class PasswordGenerator {
    public static void main(String[] args) {
        int lengthPassword = Integer.parseInt(args[0]);
		String usingSymbols = args[1];
		int pos;
		int beginPos = 0;
		for (int i = 0; i < lengthPassword; i++) {
			beginPos = 0 + (int) (Math.random() * usingSymbols.length());
			System.out.print(usingSymbols.charAt(pos));
		}
	}
}	
