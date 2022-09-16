package Week4.Day15.Assignments.Exception;

class Parent {
    String name;
    int id;

    void show() {
        System.out.println("Name :: "+name);
        System.out.println("Id :: "+id);
    }

}

class Child extends Parent {
    @Override
    void show() {
        super.show();
        System.out.println("This is Child's show() method.");
    }
}

public class ClassCastExceptionDemo {
    public static void main(String[] args) {

        try {
            Child c = (Child) new Parent();
        } catch (ClassCastException e) {
            System.out.println("Class Cast Exception Occurred...");
            e.printStackTrace();
        }


    }
}

/*

Class Cast Exception Occurred...
java.lang.ClassCastException: Week4.Day15.Assignments.Exception.Parent cannot be cast to Week4.Day15.Assignments.Exception.Child
	at Week4.Day15.Assignments.Exception.ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:26)


* */