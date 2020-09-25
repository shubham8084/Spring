package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeDAOImpl implements EmployeeDAO {
	private final String GET_EMP_QUERY = "SELECT ENO,ENAME,DESG,SALARY,DEPTNO FROM EMP_TABLE WHERE DESG IN(?,?,?) ORDER BY DESG";
	private DataSource ds;
	public EmployeeDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}
	
	@Override
	public List<EmployeeBO> getEmpByDesg(String desg1, String desg2, String desg3) throws Exception {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<EmployeeBO> listBO = null;
		EmployeeBO bo = null;
		try {
			// get Data Soruce Object
			con = ds.getConnection();
			ps = con.prepareStatement(GET_EMP_QUERY);
			//set Query parameter
			System.out.println(desg1+" "+desg2+" "+desg3);
			ps.setString(1,"clerk"); ps.setString(2,"developer"); ps.setString(3, "manager");
			//ps.setString(1,desg1); 
			ps.setString(2,desg2);
			ps.setString(3, desg3);
			//execute ResultSet query
	        rs = ps.executeQuery();
	        
			listBO = new ArrayList();
			
			while (rs.next()) {
			
				bo = new EmployeeBO();
				if (rs != null) {
					
					// copy object into resultset and set into BO obj
					bo.setEno(rs.getInt(1));
					bo.setEname(rs.getString(2));
					bo.setDesg(rs.getString(3));
					bo.setSalary(rs.getFloat(4));
					bo.setDeptno(rs.getInt(5));

					// add to Array
					listBO.add(bo);
					
				}
			} // while
		} // try

		catch (SQLException se) { // known exception
			se.printStackTrace();
			throw se; // exception rethrowing..
		} catch (Exception e) { // unknow exception
			e.printStackTrace();
			throw e; // exeception rethrowing
		} finally {
			// close jdbc objs
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw se; // exeception rethrowing
			}
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw se; // exeception rethrowing
			}
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw se; // exeception rethrowing
			}
		} // finally

		return listBO;
	}


	
}
