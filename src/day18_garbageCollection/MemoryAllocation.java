package day18_garbageCollection;


import day17_customClass.Employee;

class Car{

    public String brand, model, color;

}





public class MemoryAllocation {  // only one public class in file

    public static void main(String[] args) {

        int a = 100;  // stack

        Car car = new Car();
        // stack    heap

        System.out.println("---------------------------------------------------------------------------------");

        Employee employee1 = new Employee();
        Employee employee2 = employee1;

        employee1.setInfo("Rehane", 30, 'F', "Java Developer",95000, "A12");

        System.out.println(employee1);
        System.out.println(employee2);


        System.out.println("-----------------------------------------");

        String batch1 = new String("Java");
        String batch2 = batch1;
        String batch3 = batch1;


    }

   public static void method1(){   // methods allocated in stack
        int b = 200;  // stack

   }
    public static void method2(){

        String c = "Hello world";
       // stack      // heap
    }

}
