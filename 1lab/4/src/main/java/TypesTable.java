class TypesTable {
	public static void main(String[] args) {
		System.out.printf("%-12s%-24s%-24s%-2s%n", "Type", "Mins", "Max", "Size");
		System.out.printf("%-12s%-24s%-24s%-2s%n", "Long", Long.MIN_VALUE, Long.MAX_VALUE, (Long.SIZE) / 8);
		System.out.printf("%-12s%-24s%-24s%-2s%n", "Integer", Integer.MIN_VALUE, Integer.MAX_VALUE, (Integer.SIZE) / 8);
		System.out.printf("%-12s%-24s%-24s%-2s%n", "Short", Short.MIN_VALUE, Short.MAX_VALUE, (Short.SIZE) / 8);
		System.out.printf("%-12s%-24s%-24s%-2s%n", "Byte", Byte.MIN_VALUE, Byte.MAX_VALUE, (Byte.SIZE) / 8);
		System.out.printf("%-12s%-24s%-24s%-2s%n", "Double", Double.MIN_VALUE, Double.MAX_VALUE, (Double.SIZE) / 8);
		System.out.printf("%-12s%-24s%-24s%-2s%n", "Float", Float.MIN_VALUE, Float.MAX_VALUE, (Float.SIZE) / 8);
		System.out.printf("%-12s%-24s%-24s%-2s%n", "Char", Character.MIN_VALUE+0, Character.MAX_VALUE+0, (Character.SIZE) / 8);
	}
}