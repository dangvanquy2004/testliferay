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
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author    QUY CNTT
 * @see       Department
 * @generated
 */
public class DepartmentWrapper implements Department, ModelWrapper<Department> {
	public DepartmentWrapper(Department department) {
		_department = department;
	}

	public Class<?> getModelClass() {
		return Department.class;
	}

	public String getModelClassName() {
		return Department.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("iddepartment", getIddepartment());
		attributes.put("name", getName());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Integer iddepartment = (Integer)attributes.get("iddepartment");

		if (iddepartment != null) {
			setIddepartment(iddepartment);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this department.
	*
	* @return the primary key of this department
	*/
	public int getPrimaryKey() {
		return _department.getPrimaryKey();
	}

	/**
	* Sets the primary key of this department.
	*
	* @param primaryKey the primary key of this department
	*/
	public void setPrimaryKey(int primaryKey) {
		_department.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the iddepartment of this department.
	*
	* @return the iddepartment of this department
	*/
	public int getIddepartment() {
		return _department.getIddepartment();
	}

	/**
	* Sets the iddepartment of this department.
	*
	* @param iddepartment the iddepartment of this department
	*/
	public void setIddepartment(int iddepartment) {
		_department.setIddepartment(iddepartment);
	}

	/**
	* Returns the name of this department.
	*
	* @return the name of this department
	*/
	public java.lang.String getName() {
		return _department.getName();
	}

	/**
	* Sets the name of this department.
	*
	* @param name the name of this department
	*/
	public void setName(java.lang.String name) {
		_department.setName(name);
	}

	public boolean isNew() {
		return _department.isNew();
	}

	public void setNew(boolean n) {
		_department.setNew(n);
	}

	public boolean isCachedModel() {
		return _department.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_department.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _department.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _department.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_department.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _department.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_department.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new DepartmentWrapper((Department)_department.clone());
	}

	public int compareTo(com.test.database.model.Department department) {
		return _department.compareTo(department);
	}

	@Override
	public int hashCode() {
		return _department.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.test.database.model.Department> toCacheModel() {
		return _department.toCacheModel();
	}

	public com.test.database.model.Department toEscapedModel() {
		return new DepartmentWrapper(_department.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _department.toString();
	}

	public java.lang.String toXmlString() {
		return _department.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_department.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Department getWrappedDepartment() {
		return _department;
	}

	public Department getWrappedModel() {
		return _department;
	}

	public void resetOriginalValues() {
		_department.resetOriginalValues();
	}

	private Department _department;
}