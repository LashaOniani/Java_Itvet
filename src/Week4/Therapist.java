package Week4;

public class Therapist extends Doctor{
    public Therapist(){}
    public Therapist(int id, String name, double salary){
        super(id, name, salary);
    }
    public double bonus (){
        return getSalary() * 0.15;
    }
}
