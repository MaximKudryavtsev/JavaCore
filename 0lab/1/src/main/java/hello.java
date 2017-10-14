class Hello {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Wrong quantity of arguments");
            System.exit(1);
        }
        System.out.print("Hello Java from ");
        String nameOS = System.getProperty("os.name");
        String versionOS = System.getProperty("os.version");
        String versionJava = System.getProperty("java.version");
        String pathJava = System.getProperty("java.home");
        for (int i = 0; i < args.length; i++){
            System.out.print(args[i] + ' ');
        }
        System.out.println("\nMy OS is " + nameOS + ", version is  " + versionOS);
        System.out.println("Version of Java is " + versionJava);
        System.out.println("Path to Java directory is " + pathJava);
    }
}