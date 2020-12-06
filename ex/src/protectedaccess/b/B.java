package protectedaccess.b;

import protectedaccess.a.A;

//protected дает доступ к переменной из класса-наследника даже если он в другом пакете
public class B extends A {
    void m() {
        //так можно
        int i = this.i;
    }

    public static void main(String[] args) {
        //так можно:
        int i = new B().i;

        //так нельзя:
        // int i=new A().i;
    }
}
