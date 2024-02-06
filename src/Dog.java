public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("bark");
    }

    @Override
    public String getInfo() {
        return  "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
