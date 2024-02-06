public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("mur");
    }

    @Override
    public String getInfo() {
        return  "{name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
