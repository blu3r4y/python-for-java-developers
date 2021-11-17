class StringConcatenation {
    public static void main(String[] args) {
        String a = "How";
        String b = "to";
        String c = "concatenate";
        String d = "strings";

        String result = String.join(" ", a, b, c, d);
        System.out.println(result);
    }
}
