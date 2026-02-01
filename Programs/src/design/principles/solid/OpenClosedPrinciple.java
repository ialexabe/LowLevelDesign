package design.principles.solid;

import java.util.logging.Logger;

//Open for Extension but closed for modification.
public class OpenClosedPrinciple {
    private OpenClosedPrinciple() {}
    static void main() {
        Employee employee = new Employee();
        EmployeeService employeeService = new EmployeeService();
        employeeService.saveEmployee(employee);
    }
}

class Employee {
    final int id;
    final String name;
    Employee(){
        this.id = 1;
        this.name = "Alex";
    }
}

interface Save {
    void save(Employee employee);
}

class SqlSave implements Save{
    final Logger logger = Logger.getLogger(getClass().getName());
    @Override
    public void save(Employee employee)  {
        logger.info("saving to mysql");
    }
}

class NoSqlSave implements Save{
    final Logger logger = Logger.getLogger(getClass().getName());
    @Override
    public void save(Employee employee) {
        logger.info("saving to mongodb");
    }
}

class EmployeeService{
    final Save noSqlSave = new NoSqlSave();
    final Save sqlSave = new SqlSave();
    public void saveEmployee(Employee employee){
        noSqlSave.save(employee);
        sqlSave.save(employee);
    }
}
