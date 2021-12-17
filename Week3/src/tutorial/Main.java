package tutorial;

public class Main {

    public static void main(String[] args) {
        Mobile mobile = Mobile.getInstance(); // getInstance() is a static method, we do not need to create an object via new Mobile()
        mobile.setName("Nokia");
        mobile.setPhoneNumber("1234567890");
        System.out.println(mobile); // here, we can see that the instance is created and the name and phone number are set

        Mobile obj2 = Mobile.getInstance(); // here, we're getting the same instance as before
        obj2.setName("Samsung"); // we can change the name
        System.out.println(obj2); // here, the phone number is not changed, but the name is changed
        obj2.setPhoneNumber("0987654321");
        System.out.println(obj2);
    }
}
