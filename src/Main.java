import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    /**
     * Создайте абстрактный класс "Animal" с полями "name" и "age".
     * Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
     * Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
     * Выведите на экран информацию о каждом объекте.
     * Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
     * @param args
     */
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Animal[] animals = new Animal[] {new Cat("Murzik", 1),
                new Dog("Bobik", 5),
                new Cat("Kotya", 3)};

        // Вывод информации о каждом объекте с помощью Reflection API
        for(Animal a : animals) {
            Class<?> clazz = Class.forName("Animal");
            Method info = clazz.getDeclaredMethod("getInfo", null);
            System.out.println(info.invoke(a));
        }

        // Вызов метода makeSound() у каждого объекта с помощью Reflection API
        for(Animal a : animals) {
            Class<?> clazz = Class.forName(Animal.class.getName());
            Method sound = clazz.getDeclaredMethod("makeSound", null);
            sound.invoke(a);
        }
    }
}