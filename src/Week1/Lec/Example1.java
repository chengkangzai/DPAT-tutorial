package Week1.Lec;

class Programme {
    Module mod1 = new Module();

    public void CreateProgramme() {
        mod1.display();
    }
}

class Module {
    private String name = "no name";

    public void display() {
        System.out.println(name);
    }
}

public class Example1 {
}
