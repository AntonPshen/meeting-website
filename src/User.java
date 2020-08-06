public class User {
    String name;
    short age;
    int height;

    static int count = 0;

    // Constructor №1
    public User(String name, short age, int height) {
        count++;
        this.name = count + ". " + "User named: " + name + " aged ";
        this.age = age;
        this.height = height;
    }

    // Constructor №2
    public User(String name, int height, short age) {
        count++;
        this.name = count + ". " + "User named: " + name + " aged ";
        this.height = height;
        this.age = age;
    }

    // Constructor №3
    public User(short age, String name, int height) {
        count++;
        this.age = age;
        this.name = count + ". " + "User named: " + name + " aged ";
        this.height = height;
    }

    public static void main(String[] args) {
        User bill = new User("Bill", (short) 23, 165);
        User kate = new User("Kate", (short) 25, 158);
        User jack = new User("Jack", 176, (short) 33);
        User masha = new User("Masha", 163, (short) 28);
        User michael = new User((short) 63, "Michael", 180);
        User sara = new User((short) 65, "Sara", 167);

        System.out.println(bill.name + " " + bill.age);
        System.out.println(jack.name + " " + jack.age);
        System.out.println(michael.name + " " + michael.age);
        System.out.println(kate.name + " " + kate.age);
        System.out.println(masha.name + " " + masha.age);
        System.out.println(sara.name + " " + sara.age);
    }
}
