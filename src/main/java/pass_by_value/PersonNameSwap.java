package pass_by_value;

public class PersonNameSwap {

    public static void main(String[] args) {

        Person p1 = new Person("Ilayda");
        Person p2 = new Person("Test User");

        System.out.println(p1);
        System.out.println(p2);

        swap(p1, p2);

        System.out.println(p1);
        System.out.println(p2);
    }

    private static void swap(Person p1Param, Person p2Param) {

        Person temp = p1Param;
        p1Param = p2Param;
        p2Param = temp;

        System.out.println(p1Param);
        System.out.println(p2Param);
    }
}
