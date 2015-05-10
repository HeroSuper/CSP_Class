package com.ac.company;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManager;

public class MemberManager {
	public static PersistenceManager getManager()
	{
		PersistenceManager pm = JDOHelper.getPersistenceManagerFactory("transactions-optional").getPersistenceManager();
		return pm;
	}
}
