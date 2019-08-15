package com.netcracker.services;

import com.netcracker.dto.Admin;
import com.netcracker.dao.EmployeeDAO;
import com.netcracker.dto.Employee;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeService {
    private EmployeeDAO dao = new EmployeeDAO();

    public ArrayList<Employee> getAllEmployees(){
        ArrayList<Employee> allEmployees =  dao.getAllEmployees();
        return allEmployees;

    }

    public String saveEmployeeDetails(Employee employee) throws SQLException {
        Boolean result = false;
        if (dao.saveEmployeeDetails(employee).equals("true")) {
            return "true";
        }
        return "false";
    }

    public Employee getEmployeeById(Employee employee){

        Employee retrievedEmployee = dao.getEmployeeById(employee);

        if(retrievedEmployee!=null){
            return retrievedEmployee;
        }
        return retrievedEmployee;
    }

    public String updateEmployee(Employee employee){
        String temp = dao.updateEmployee(employee);
        if(temp.equals("true")){
            return "true";
        }
        else{
            return temp;
        }

    }
}
