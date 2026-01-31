//Open for Extension but closed for modification.
public class OpenClosedPrinciple {

    static void main() {
        Employee employee = new Employee(1,"alex");
        EmployeeService employeeService = new EmployeeService();
        employeeService.saveEmployee(employee);
    }
}

class Employee {
    int id;
    String name;
    Employee(int id,String name){
        this.id = id;
        this.name = name;
    }
}

interface Save {
    void save(Employee employee);
}

class SqlSave implements Save{

    @Override
    public void save(Employee employee) {
        //save to mysql;
    }
}

class NoSqlSave implements Save{
    @Override
    public void save(Employee employee) {
        //save to mongodb;
    }
}

class EmployeeService{
    Save s = new NoSqlSave();
    public void saveEmployee(Employee employee){
        s.save(employee);
    }
}
