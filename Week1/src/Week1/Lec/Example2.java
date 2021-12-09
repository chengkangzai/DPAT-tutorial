package Week1.Lec;

class Student {
    public static void main(String[] args) {
        Name stdName = new Name("John"); //Driver Class
        System.out.println(stdName.getName());
        Age stdAge = new Age(10); //Driver Class
        System.out.println(stdAge.getAge());
    }
}

class Name {
    String name;

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Age {
    int age;

    public Age(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
