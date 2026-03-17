public class Humans{
    String name;
    int age;
    float height;
    Humans otherHuman;

    public Humans(int age, float height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public static void main(String[] args){
        Humans bob = new Humans(24, 171, "Bob");
        Humans alice = new Humans(23, 170, "Alice");

        bob.otherHuman = alice;

        System.out.println(bob.otherHuman.name);
        System.out.println(bob.otherHuman);
    }

    
}