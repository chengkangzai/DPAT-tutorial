package Week1.Lec;

import java.util.Random;
import java.util.Vector;

class ModuleEx4 {
    private String moduleCode;
    private String moduleName;

    public ModuleEx4(String code, String name) {
        this.moduleCode = code;
        this.moduleName = name;
    }
}

class StudentEx4 {
    public String studentName;
    public String studentID;

    public StudentEx4(String name, String id) {
        this.studentID = id;
        this.studentName = name;
    }
}

class ProgrammeEx4 {
    private String programmeName;
    private Vector<ModuleEx4> modules;

    public ProgrammeEx4(String name, Vector<ModuleEx4> mods) {
        modules = mods;
        programmeName = name;
    }

    public void UpdateProgrammeName(String name) {
        programmeName = name;
    }

    public void EnrolStudent(Vector<StudentEx4> namelist) {
        Vector<StudentEx4> students = namelist;
    }

    public void createNewStudent(String name) {
        int number = new Random().nextInt(10000);
        StudentEx4 newstd = new StudentEx4(name, "TP" + number);
    }
}
