import inout.Out;

class IteratingElementsByValue {
    public static void main(String[] args) {
        String[] names = {"Lisa", "John", "Susan", "Alex"};

        for (String name : names) {
            Out.println(name);
        }
    }
}
