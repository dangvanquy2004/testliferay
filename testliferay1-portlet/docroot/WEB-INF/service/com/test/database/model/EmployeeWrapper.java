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

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author    QUY CNTT
 * @see       Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
	public EmployeeWrapper(Employee employee) {
		_employee = employee;
	}

	public Class<?> getModelClass() {
		return Employee.class;
	}

	public String getModelClassName() {
		return Employee.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("address", getAddress());
		attributes.put("phone", getPhone());
		attributes.put("iddepartment", getIddepartment());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer id = (Integer)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		Integer iddepartment = (Integer)attributes.get("iddepartment");

		if (iddepartment != null) {
			setIddepartment(iddepartment);
		}
	}

	/**
	* Returns the primary key of this employee.
	*
	* @return the primary key of this employee
	*/
	public int getPrimaryKey() {
		return _employee.getPrimaryKey();
	}

	/**
	* Sets the primary key of this employee.
	*
	* @param primaryKey the primary key of this employee
	*/
	public void setPrimaryKey(int primaryKey) {
		_employee.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this employee.
	*
	* @return the ID of this employee
	*/
	public int getId() {
		return _employee.getId();
	}

	/**
	* Sets the ID of this employee.
	*
	* @param id the ID of this employee
	*/
	public void setId(int id) {
		_employee.setId(id);
	}

	/**
	* Returns the name of this employee.
	*
	* @return the name of this employee
	*/
	public java.lang.String getName() {
		return _employee.getName();
	}

	/**
	* Sets the name of this employee.
	*
	* @param name the name of this employee
	*/
	public void setName(java.lang.String name) {
		_employee.setName(name);
	}

	/**
	* Returns the address of this employee.
	*
	* @return the address of this employee
	*/
	public java.lang.String getAddress() {
		return _employee.getAddress();
	}

	/**
	* Sets the address of this employee.
	*
	* @param address the address of this employee
	*/
	public void setAddress(java.lang.String address) {
		_employee.setAddress(address);
	}

	/**
	* Returns the phone of this employee.
	*
	* @return the phone of this employee
	*/
	public java.lang.String getPhone() {
		return _employee.getPhone();
	}

	/**
	* Sets the phone of this employee.
	*
	* @param phone the phone of this employee
	*/
	public void setPhone(java.lang.String phone) {
		_employee.setPhone(phone);
	}

	/**
	* Returns the iddepartment of this employee.
	*
	* @return the iddepartment of this employee
	*/
	public int getIddepartment() {
		return _employee.getIddepartment();
	}

	/**
	* Sets the iddepartment of this employee.
	*
	* @param iddepartment the iddepartment of this employee
	*/
	public void setIddepartment(int iddepartment) {
		_employee.setIddepartment(iddepartment);
	}

	public boolean isNew() {
		return _employee.isNew();
	}

	public void setNew(boolean n) {
		_employee.setNew(n);
	}

	public boolean isCachedModel() {
		return _employee.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_employee.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _employee.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _employee.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_employee.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _employee.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_employee.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new EmployeeWrapper((Employee)_employee.clone());
	}

	public int compareTo(com.test.database.model.Employee employee) {
		return _employee.compareTo(employee);
	}

	@Override
	public int hashCode() {
		return _employee.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.test.database.model.Employee> toCacheModel() {
		return _employee.toCacheModel();
	}

	public com.test.database.model.Employee toEscapedModel() {
		return new EmployeeWrapper(_employee.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _employee.toString();
	}

	public java.lang.String toXmlString() {
		return _employee.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_employee.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Employee getWrappedEmployee() {
		return _employee;
	}

	public Employee getWrappedModel() {
		return _employee;
	}

	public void resetOriginalValues() {
		_employee.resetOriginalValues();
	}

	private Employee _employee;
}