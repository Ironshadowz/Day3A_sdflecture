package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {

    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPERATOR = "\n";
    public static final String FILE_HEADER = "staffNo, fullName, department, role, emailAddress, salary";
    
    public List<Employee> employees = null;
    public List<Employee> generateEmployees()
    {
        employees = new ArrayList<>();
        Employee emp1 = new Employee("123", "John", "Customer Service", "Relationship Manager", "JohnW@gmail.com", 10000);
        Employee emp2 = new Employee("222", "Wick", "IT Service", "Hotdesk", "Wicked@gmail.com", 30000);
        Employee emp3 = new Employee("432", "Mary", "Room Service", "Delivery", "MaryM@gmail.com", 31000);
        
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;
    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException
    {
        FileWriter fw = new FileWriter(fileName);
        //write the FILE_HEADER
        fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPERATOR);
        // iterate through employees to write each employee record to file
        
        for(Employee emp : employees)
        {
            fw.append(emp.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueOf(emp.getSalary()));
            fw.append(COMMA_DELIMITER);
            fw.append(NEWLINE_SEPERATOR);
        }
        
        //flush and close the fileWriter
        fw.flush();
        fw.close();
        
    }

}
