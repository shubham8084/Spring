package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CoustomerBO;

public class CoustomerDAOImpl implements CoustomerDAO {
	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO COUSTOMER_TAB VALUES(CID_SEQ.NEXTVAL,?,?,?,?)";

	private DataSource ds;

	public CoustomerDAOImpl(DataSource ds) {

		this.ds = ds;
	}

	@Override
	public int insertDAO(CoustomerBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		// get connection obj
		con = ds.getConnection();
		// crrate prepared Statemet
		ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);
		// set values to repective coloums
		ps.setString(1, bo.getCname());
		ps.setString(2, bo.getCadd());
		ps.setFloat(3, bo.getPamt());
		ps.setFloat(4, bo.getIntrest());

		count = ps.executeUpdate();

		return count;
	}

}
