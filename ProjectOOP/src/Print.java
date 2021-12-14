class Print {
    public String delimiter = "";

    public Print(String delimiter) {
        this.delimiter = delimiter;
    }

    public void printB() {
        System.out.println(delimiter);
        System.out.println("B");
        System.out.println("B");
    }

    public void printA() {
        System.out.println(delimiter);
        System.out.println("A");
        System.out.println("A");
    }
}
