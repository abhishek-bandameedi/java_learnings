public class MethodOverloading {
    static void welcome(){
        System.out.println("Hello, This is my new program");
    }
    static void welcome(String name){
        System.out.println("Hello "+name+", This is my new program");
    }
    static void welcome(String name, int n){
        System.out.println("Hello "+name+", This is my program "+n);
    }
    static int add(int ...nums){
        int res=0;
        for(int i:nums){
            res+=i;
        }
        return res;
    }
    public static void main(String[] args) {
        welcome();
        welcome("Abhishek");
        welcome("Abhi",5);
        int val=add(4,5,3,7);
        System.out.println(val);
    }
}
