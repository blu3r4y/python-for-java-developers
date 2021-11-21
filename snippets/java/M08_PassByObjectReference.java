import java.util.*;

class PassByObjectReference {
    static void replace(List<Integer> numbers) {
        numbers = Arrays.asList(42, 43, 44);
    }

    static void append(List<Integer> numbers) {
        numbers.add(42);
    }

    public static void main(String[] args) {
        List<Integer> oneTwoThree = new LinkedList<>(Arrays.asList(1, 2, 3));

        replace(oneTwoThree);
        System.out.println(Arrays.toString(oneTwoThree.toArray()));

        append(oneTwoThree);
        System.out.println(Arrays.toString(oneTwoThree.toArray()));
    }
}
