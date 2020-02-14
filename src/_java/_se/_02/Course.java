package _java._se._02;

public abstract class Course {
    public abstract String getInformation();
}

class BaseCourse extends Course {
    public String getInformation() {
        return "Base course";
    }
}

class OptionalCourse extends Course {
    public String getInformation() {
        return "Optional course";
    }
}
