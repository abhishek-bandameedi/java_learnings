class Person {
    private String name;
    private int age;
    //constructor:
//    public Person(){
//        name="Abhi";
//        age=21;
//    }

    //constructor with parameters:
//    public Person(String nm,int ag){
//        name=nm;
//        age=ag;
//    }
    //Getters and Setters
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        this.age = a;
    }
    public int getAge() {
        return age;
    }
}


public class AccessModifiers{
    public static void main(String[] args) {
        Person abhi=new Person();
//        Person abhi=new Person("Abhishek",21);
        abhi.setName("Abhishek");
        abhi.setAge(21);
        System.out.println("Name of the person: "+abhi.getName());
        System.out.println("Age of the person: "+abhi.getAge());
    }
}
