package _java._se._02;

public class ManBlock {
    private int age;
    {
        age = 0;
        System.out.println("logic block in Man");
    }

    public ManBlock(){
        System.out.println("Constructor in Man");
    }

    public int getAge(){
        return age;
    }
}
