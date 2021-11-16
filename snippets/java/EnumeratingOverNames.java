public class EnumeratingOverNames {
    public static void main(String[] args) {
        String[] names = {"Lisa", "John", "Susan", "Alex"};

        int i = 0;
        while (i < names.length) {
            System.out.println(i + " " + names[i]);
            i++;
        }
    }
}
