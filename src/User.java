public class User {
    String name;
    short age;
    int height;

    static int count = 0;

    // Constructor №1
    public User(String name, short age, int height) {
        count++;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Constructor №2
    public User(String name, int height, short age) {
        count++;
        this.name = name;
        this.height = height;
        this.age = age;
    }

    // Constructor №3
    public User(short age, String name, int height) {
        count++;
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
