package Week4;

public abstract class Doctor implements BonusCalculable {
    private int id;
    private String name;
    private double salary;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Doctor(){}
    public Doctor(int id, String name, double salary){
        setId(id);
        setName(name);
        setSalary(salary);
    }
    public String getInfo(){
        return "[" + getClass().getSimpleName() + "] " +
                "id=" + id + " name=" + name + " salary=" + salary;
    }
}
