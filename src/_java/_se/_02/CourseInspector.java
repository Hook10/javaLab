package _java._se._02;

public class CourseInspector {

    public static void main(String[] args) {
        Course course1 = new BaseCourse();
        Course course2 = new OptionalCourse();
        System.out.println(course1.getInformation());
        System.out.println(course2.getInformation());
    }
}
