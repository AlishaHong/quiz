package poly;

public class CastingMain4 {
    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();


        Parent parent2 = new Parent();
        Child child2 = (Child) parent2;//런타임오류 형변환예외
//        child2.childMethod(); //실행불가

        }
    }


