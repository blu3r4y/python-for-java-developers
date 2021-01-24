public class EnumeratingOverNames {
    public static void main(String[] args) throws Exception {
        String[] names = {"Franz", "Susanne", "Hans", "Herbert", "Peter", "Max", "Lisa"};

        int i = 0;
        while (i < names.length) {
            System.out.println(i + " " + names[i]);
            i++;
        }
    }
}
