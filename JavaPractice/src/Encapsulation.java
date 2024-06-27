class Encapsulate {
    private String name;
    private int roll;
    private int age;
    public int getAge() { return age; }
    public String getName() { return name; }
    public int getRoll() { return roll; }
    public void setAge(int newAge) { age = newAge; }
    public void setName(String newName)
    {
        name = newName;
    }
    public void setRoll(int newRoll) { roll = newRoll; }
}
class Encapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();
        obj.setName("Abhishek");
        obj.setAge(21);
        obj.setRoll(51);
        System.out.println("name: " + obj.getName());
        System.out.println("age: " + obj.getAge());
        System.out.println("roll: " + obj.getRoll());
    }
}
