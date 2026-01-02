package Week4;

public class Surgeon extends Doctor {
    public Surgeon(){}
    public Surgeon(int id, String name, double salary){
        super(id, name, salary);
    }
    public double bonus (){
        return getSalary() * 0.3;
    }
}
