package another;

public class PassObjToMethod {

    void m(Animal animal) {
        // animal=new Animal("sss");
        animal.setName("Dog");

    }

    void m1(int i) {
        i = 5;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Cat");
        new PassObjToMethod().m(animal);
        //объект меняется
        System.out.println(animal.getName());

        int i = 6;
        new PassObjToMethod().m1(i);
        //примитивная переменная не меняется
        System.out.println(i);
    }
}

