package interfaces_classes;
interface Student {
    void study();
}

interface Teacher {
    void teach();
}

interface Staff {
    void manage();
}

interface Sports {
    void play();
}

class SchoolMember implements Student, Teacher, Staff {
    public void study() {
        System.out.println("Student is studying.");
    }

    public void teach() {
        System.out.println("Teacher is teaching.");
    }

    public void manage() {
        System.out.println("Staff is managing school tasks.");
    }
}

public class SchoolActivity extends SchoolMember implements Sports {
    public void play() {
        System.out.println("Participating in school sports activity.");
    }

    public void conductEvent() {
        System.out.println("Conducting annual school event.");
    }

    public static void main(String[] args) {
        SchoolActivity activity = new SchoolActivity();
        activity.study();
        activity.teach();
        activity.manage();
        activity.play();
        activity.conductEvent();
    }
}
