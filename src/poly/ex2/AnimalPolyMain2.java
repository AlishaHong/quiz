package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();
        
        Animal[] animalArr = {dog,cat,cow,duck};

        for (Animal animal : animalArr) {
            System.out.println("동물소리 테스트 시작");
            animal.sound();
            System.out.println("동물소리 테스트 종료");
        }
    }
}
