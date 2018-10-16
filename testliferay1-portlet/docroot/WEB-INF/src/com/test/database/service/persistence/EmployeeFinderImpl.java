package com.test.database.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;
import com.test.database.model.Employee;
import com.test.database.model.impl.EmployeeImpl;

public class EmployeeFinderImpl extends BasePersistenceImpl<Employee> implements EmployeeFinder{
	public List<Employee> findEmployee(String name) throws SystemException {
        Session session = null;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(LOCAL_METHOD_FINDNAMEEMPLOYEE);
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity("Employee", EmployeeImpl.class);
            QueryPos qPos = QueryPos.getInstance(query);
            qPos.add(name);
            return (List)query.list();
        }catch (Exception e) {
        	 try {
                 throw new SystemException(e);
             } catch (SystemException se) {
                 se.printStackTrace();
             }
        } finally {
        	closeSession(session);
        }
        return null;
    }
	
	public List<Employee> findPhoneEmployee(String phone) throws SystemException {
        Session session = null;
        try {
            session = openSession();
            String sql = CustomSQLUtil.get(LOCAL_METHOD_FINDPHONEEMPLOYEE);
            SQLQuery query = session.createSQLQuery(sql);
            query.addEntity("Employee", EmployeeImpl.class);
            QueryPos qPos = QueryPos.getInstance(query);
            qPos.add(phone);
            return (List)query.list();
        }catch (Exception e) {
        	 try {
                 throw new SystemException(e);
             } catch (SystemException se) {
                 se.printStackTrace();
             }
        } finally {
        	closeSession(session);
        }
        return null;
    }
	
	public static final String LOCAL_METHOD_FINDNAMEEMPLOYEE = EmployeeFinder.class.getName() + ".findEmployee";
	public static final String LOCAL_METHOD_FINDPHONEEMPLOYEE = EmployeeFinder.class.getName() + ".findPhoneEmployee";
}
