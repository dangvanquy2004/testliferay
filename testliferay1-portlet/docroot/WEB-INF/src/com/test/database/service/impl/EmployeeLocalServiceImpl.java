/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.database.service.impl;

import java.rmi.RemoteException;
import java.util.List;

import com.liferay.portal.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.test.database.NoSuchEmployeeException;
import com.test.database.model.Employee;
import com.test.database.service.base.EmployeeLocalServiceBaseImpl;
import com.test.database.service.persistence.EmployeeFinderUtil;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.test.database.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author QUY CNTT
 * @see com.test.database.service.base.EmployeeLocalServiceBaseImpl
 * @see com.test.database.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	public List<Employee> findByDepartment(int id) throws SystemException {
		return employeePersistence.findByDepartment(id);
	}
	
	public Employee findByEmployee(int id) throws NoSuchEmployeeException, SystemException {
		return employeePersistence.findByEmployee(id);
	}
	
	public int getCount(int id) throws SystemException {
		List<Employee> list = employeePersistence.findByDepartment(id);
		return list != null ? list.size() : 0;
	}
	
	public List<Employee> findEmployee(String name) throws PortalException, SystemException, RemoteException {
        return EmployeeFinderUtil.findEmployee("%" + name + "%");
    }
	
	public List<Employee> findPhoneEmployee(String phone) throws PortalException, SystemException, RemoteException {
        return EmployeeFinderUtil.findPhoneEmployee("%" + phone + "%");
    }
}