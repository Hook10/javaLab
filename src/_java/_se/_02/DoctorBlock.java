package _java._se._02;

public class DoctorBlock extends ManBlock {
    private String speciality;

    {
        System.out.println("logic block in Doctor");
        speciality = "surgeon";
    }

    public DoctorBlock() {
        System.out.println("Constructor in Doctor");
    }

    public String getSpeciality() {
        return speciality;
    }
}
