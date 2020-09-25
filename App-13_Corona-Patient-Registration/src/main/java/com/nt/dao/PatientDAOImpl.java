package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public class PatientDAOImpl implements PatientDAO {
  private static final String PATIENT_REGISTRATION="INSRET INTO CORONA_PATIENT VALUES(PID_SEQ.NEXTVAL,?,?,?,?,?,?)"; 
	private DataSource drds;
	
	public PatientDAOImpl(DataSource drds) {	
	this.drds = drds;
}


	@Override
	public int insert(PatientBO bo)throws Exception {
		
		
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get connetion obj
		con=drds.getConnection();
		//Get parepaer statement obj
		ps=con.prepareStatement(PATIENT_REGISTRATION);
		ps.setString(1, bo.getPname());
		ps.setInt(2, bo.getAge());
		ps.setString(3, bo.getAddress());
		ps.setNString(4,bo.getReport());
		ps.setLong(5, bo.getMobile());
		ps.setString(6, bo.getEmail());
		
		count = ps.executeUpdate();

		return count;
	}

}
