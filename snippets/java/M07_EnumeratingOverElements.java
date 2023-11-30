import inout.Out;

class EnumeratingOverElements {
    public static void main(String[] args) {
        String[] names = {"Lisa", "John", "Susan", "Alex"};

        int i = 0;
        while (i < names.length) {
            Out.println(i + " " + names[i]);
            i++;
        }
    }
}
