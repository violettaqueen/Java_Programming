package utilities;

import day26_Statics.StaticMembers.Data;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        // Data.method3();
        // Data.method4();

        Data object1 = new Data();

        System.out.println(object1.a);
        System.out.println(object1.b);
        System.out.println(object1.c);

        // object1.method1();
        // object1.method2();



    }


}
