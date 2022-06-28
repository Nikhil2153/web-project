package com.nikhil.database;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import com.nikhil.model.Employee;    
    
public class Empdatabase {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int save(Employee p){    
    String sql="insert into Employees(first_name,last_name,salary,department,position,email,contact) values('"+p.getfirst_name()+"','"+p.getlast_name()+"',"+p.getSalary()+",'"+p.getdepartment()+"','"+p.getposition()+"','"+p.getemail()+"','"+p.getcontact()+"','"+p.getdata()+"')";    
    return template.update(sql);    
}    
public int update(Employee p){    
    String sql="update Employees set first_name='"+p.getfirst_name()+"',last_name='"+p.getlast_name()+"', salary="+p.getSalary()+",department='"+p.getdepartment()+"',position='"+p.getposition()+"',email='"+p.getemail()+"',contact='"+p.getcontact()+"',photo='"+p.getdata()+"' where first_name="+p.getfirst_name()+"";    
    return template.update(sql);    
}    
public int delete(String first_name){    
    String sql="delete from Employees where first_name="+first_name+"";    
    return template.update(sql);    
}    
public Employee getEmployeeByfirst_name(String first_name){    
    String sql="select * from Employees where first_name=?";    
    return template.queryForObject(sql, new Object[]{first_name},new BeanPropertyRowMapper<Employee>(Employee.class));    
}    
public List<Employee> getEmployees(){    
    return template.query("select * from Employees",new RowMapper<Employee>(){    
        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
            Employee e=new Employee();    
            e.setfirst_name(rs.getString(1));    
            e.setlast_Name(rs.getString(2));    
            e.setSalary(rs.getFloat(3));    
            e.setdepartment(rs.getString(4));  
            e.setposition(rs.getString(5));  
            e.setemail(rs.getString(6));  
            e.setcontact(rs.getString(7));
            e.setdata(rs.getBytes(8))
            return e;    
        }    
    });    
}    
}   
