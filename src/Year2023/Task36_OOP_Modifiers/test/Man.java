package Year2023.Task36_OOP_Modifiers.test;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be grater than Zero");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
}
