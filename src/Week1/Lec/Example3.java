package Week1.Lec;

interface ModuleEx3 {
    void Display();
}

class ElectiveEx3 implements ModuleEx3 {
    public void Display() {
        System.out.println("This is an elective module");
    }
}

class Core implements ModuleEx3 {
    public void Display() {
        System.out.println("This is the core module");
    }
}

class Example3 {

    public static void main(String[] args) {
        ModuleEx3 mod;
        mod = new ElectiveEx3();
        mod.Display();
    }
}
