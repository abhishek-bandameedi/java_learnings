class Vehicle{
    void engine(){
        System.out.println("This is a vehicle engine");
    }

    public static void main(String[] args) {
        Vehicle v= new Vehicle();
        v.engine();
    }
}
class Bike extends Vehicle{
    void engine(){
//        super.engine();
        System.out.println("This is bike engine");
    }

    public static void main(String[] args) {
        Bike b=new Bike();
        b.engine();
    }
}