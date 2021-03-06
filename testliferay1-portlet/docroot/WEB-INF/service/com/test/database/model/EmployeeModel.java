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

package com.test.database.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.test.database.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.test.database.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author QUY CNTT
 * @see Employee
 * @see com.test.database.model.impl.EmployeeImpl
 * @see com.test.database.model.impl.EmployeeModelImpl
 * @generated
 */
public interface EmployeeModel extends BaseModel<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the ID of this employee.
	 *
	 * @return the ID of this employee
	 */
	public int getId();

	/**
	 * Sets the ID of this employee.
	 *
	 * @param id the ID of this employee
	 */
	public void setId(int id);

	/**
	 * Returns the name of this employee.
	 *
	 * @return the name of this employee
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this employee.
	 *
	 * @param name the name of this employee
	 */
	public void setName(String name);

	/**
	 * Returns the address of this employee.
	 *
	 * @return the address of this employee
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this employee.
	 *
	 * @param address the address of this employee
	 */
	public void setAddress(String address);

	/**
	 * Returns the phone of this employee.
	 *
	 * @return the phone of this employee
	 */
	@AutoEscape
	public String getPhone();

	/**
	 * Sets the phone of this employee.
	 *
	 * @param phone the phone of this employee
	 */
	public void setPhone(String phone);

	/**
	 * Returns the iddepartment of this employee.
	 *
	 * @return the iddepartment of this employee
	 */
	public int getIddepartment();

	/**
	 * Sets the iddepartment of this employee.
	 *
	 * @param iddepartment the iddepartment of this employee
	 */
	public void setIddepartment(int iddepartment);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Employee employee);

	public int hashCode();

	public CacheModel<Employee> toCacheModel();

	public Employee toEscapedModel();

	public String toString();

	public String toXmlString();
}