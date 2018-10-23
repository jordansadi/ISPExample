package isp.lab1.student;

public class Person implements Animal {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void talk(String s) {
        System.out.println(s);
    }

    @Override
    public void run(int distance) {
        if (distance > 0) {
            System.out.println("You ran " + (distance - 1) + " miles.");
            trip();
        }
        else
            trip();
    }

    @Override
    public void jump() {
        trip();
    }

    @Override
    public void hike() {
        trip();
    }

    @Override
    public void swim() {
        System.out.println("Are you sure you aren't a fish?");
    }

    @Override
    public void trip() {
        System.out.println("You tripped!\nSee you next fall!");
    }
}
