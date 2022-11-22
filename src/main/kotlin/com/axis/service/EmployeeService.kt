package com.axis.service

import com.axis.modal.Employee
class EmployeeService {
    /*
        description: this method is used to display employee details
        param : It takes employee objects are param
        returns : It returns unit
     */


    fun dislayEmployeeDetails(employee:Employee)
    {
        println("----------Employee Info --------")
        println("Employee id = ${employee.id}")
        println("Employee name = ${employee.name}")
        println("Employee salary= ${employee.salary}")
    }


    fun perDaySalary(employee:Employee):Int
    {
        return (employee.salary/30)
    }


    fun increaseSalaryByTenPercentage(employee:Employee):Double
    {
        var incrementedSalary=(employee.salary*0.10)
        println("10% of salary is $incrementedSalary")
        return (incrementedSalary+employee.salary)

    }
}