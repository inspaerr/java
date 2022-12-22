package lab41;

public class Person {
    private String fullName;
    private int age;

    public void move(){
        System.out.println(fullName + " двигается");
    }
    public void talk(){
        System.out.println(fullName + " говорит");
    }
    Person(){}
    Person(String fullName, int age){
        this.age = age;
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
