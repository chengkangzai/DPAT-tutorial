package Week1.Lec;

/**
 * The Programme class is very rigid, as you can not use Programme class to CreateProgramme with different Module.
 * Only the module that is instantiated inside the Programme is able to be used
 * For code improvement, the relationship should be changed to aggregation instead of composition
 */
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
