package Week4;

public class Dentist extends Doctor{
    public Dentist(){}
    public Dentist(int id, String name, double salary){
        super(id, name, salary);
    }
    public double bonus (){
        return getSalary() * 0.2;
    }
}
