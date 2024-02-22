package com.example.Crud.Service;

import com.example.Crud.Model.Employee;
import com.example.Crud.Repository.Employee_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceIMP implements EmployeeService{
    @Autowired
    Employee_repo emp;
    @Override
    public void addEmployee(Employee employee) {
        emp.save(employee);

    }

    @Override
    public String RemoveEmployee(String eid) {
        if(emp.findById(eid)!=null)
        {
            emp.deleteById(eid);
            return "Deleted succesfully";

        }
          return "UNABLE TO FIND EMPLOYEE";



    }




    @Override
    public String UpdateEmployee(Employee e) {
        String empid=Integer.toString(e.getEid());
        Employee employee= emp.findById(empid).orElse(null);
        employee.setEid(e.getEid());
        employee.setEname(e.getEname());
        employee.setEdesignation(e.getEdesignation());
        employee.setEsalary(e.getEsalary());
        employee.getProjects().setProjectName(e.getProjects().getProjectName());
        employee.getProjects().setSubmitionDate(e.getProjects().getSubmitionDate());
        employee.getAddress().setStreet(e.getAddress().getStreet());
        employee.getAddress().setStreet(e.getAddress().getVillage());
        employee.getAddress().setDistrict(e.getAddress().getDistrict());
        emp.save(employee);
        return "Successfully Updated";


    }
    public boolean checking(Employee employee)
    {

        if(employee.getEname().isBlank()|| employee.getEdesignation().isBlank() || employee.getEsalary().isBlank() || employee.getProjects().getProjectName().isBlank() || employee.getProjects().getSubmitionDate().isBlank())
        {
            return false;
        }
        else
        {
            System.out.println("METHOD IS CALLED");

        }
        return true;



    }

    @Override
    public Employee SearchEmployee(String eid) {
       return emp.findById(eid).orElse(null);

    }
    public Employee SingleEmployee(String eid)
    {
        return emp.findById(eid).orElse(null);
    }

    @Override
    public List<Employee> DisplayEmployess() {
        return emp.findAll();
    }

}
