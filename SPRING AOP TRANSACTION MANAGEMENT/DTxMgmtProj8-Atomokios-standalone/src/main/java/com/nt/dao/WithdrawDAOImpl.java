package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("wDAO")
public class WithdrawDAOImpl implements WithdrawDAO {
	private static final  String  WITHDRAW_QUERY="UPDATE DTX_ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?";
	
	@Autowired
	@Qualifier(value="oraTemplate")
	private JdbcTemplate oraJt;

	@Override
	public int withdraw(int acno, float amount) {
		int count=0;
		count=oraJt.update(WITHDRAW_QUERY,amount,acno);
		return count;
	}

}
