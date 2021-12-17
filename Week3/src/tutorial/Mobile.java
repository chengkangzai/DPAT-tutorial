package tutorial;

public class Mobile {
    private String name;
    private String phoneNumber;

    private static Mobile com = null;

    private Mobile() {

    }

    public static Mobile getInstance() {
        if (com == null) {
            System.out.println("Creating new instance");
            com = new Mobile();
        }
        System.out.println("Returning instance");
        return com;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "Mobile{" + "name='" + name + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
    }
}
