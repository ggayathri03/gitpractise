package com.test;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
 
public class EmployeeDao {
 
	private JdbcTemplate jdbcTemplate;
 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int createEmployee(Employee emp) {
		String sql="insert into employee(e_name,e_cmp,e_city) " +"values ('"+emp.getE_name()+"',"+" '"+emp.getE_cmp()+"','"+emp.getE_city()+"')";
		return jdbcTemplate.update(sql);
	}
	public int updateEmployee(Employee emp) {
		
		String sql ="update employee set e_name='"+emp.getE_name()+"','"+emp.getE_cmp()+"','"+emp.getE_city()+"' where id="+emp.getId();
		return jdbcTemplate.update(sql);
		
			}
	
	public int deleteEmployee(Employee emp) {
		
		String sql="delete from employee where id ="+emp.getId();
		return jdbcTemplate.update(sql);
	
		}
	
	public List<Employee> getAllEmployee()
	{
		return jdbcTemplate.query("select * from employee" ,new ResultSetExtractor<List<Employee>>()
				{
			public List<Employee> extractData(ResultSet rs) throws SQLException,DataAccessException
			{
				List<Employee> listEmp=new ArrayList<>();
				while(rs.next())
				{
					Employee emp=new Employee();
					
					emp.setId(rs.getInt(1));
					emp.setE_name(rs.getString(2));
					emp.setE_cmp(rs.getString(3));
					emp.setE_city(rs.getString(4));
					
					listEmp.add(emp);
				}
				return listEmp;
			}
				});
	}
}
 