public class Test {
    public static void main(String[] args) {
        NonCitizen c = new NonCitizen();
        c.passportNumber = 12345;
        c.name = "John";
        c.register();

    }
}

//Interface
abstract class People {
    public String name;
    public int age;
    public int contact;
    public String email;
    public String gender;
    public String status;

    public void register() {
        //TODO
    }

    public void modify() {
        //TODO
    }

    public void view() {
        //TODO
    }
}

class Citizen extends People {
    public int ICNumber;
}

class NonCitizen extends People {
    public int passportNumber;
}