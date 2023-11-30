import inout.Out;

class BasicControlFlow {
    public static void main(String[] args) {
        int x = 0;

        switch (x) {
            case 0:
                Out.println("The value is 0");
                break;
            case 1:
                Out.println("The value is 1");
                break;
            case 2:
                Out.println("The value is 2");
                break;
            default:
                Out.println("The value is something else");
        }
    }
}
