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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.database.service.DepartmentLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author QUY CNTT
 */
public class DepartmentClp extends BaseModelImpl<Department>
	implements Department {
	public DepartmentClp() {
	}

	public Class<?> getModelClass() {
		return Department.class;
	}

	public String getModelClassName() {
		return Department.class.getName();
	}

	public int getPrimaryKey() {
		return _iddepartment;
	}

	public void setPrimaryKey(int primaryKey) {
		setIddepartment(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_iddepartment);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("iddepartment", getIddepartment());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
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

	public int getIddepartment() {
		return _iddepartment;
	}

	public void setIddepartment(int iddepartment) {
		_iddepartment = iddepartment;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public BaseModel<?> getDepartmentRemoteModel() {
		return _departmentRemoteModel;
	}

	public void setDepartmentRemoteModel(BaseModel<?> departmentRemoteModel) {
		_departmentRemoteModel = departmentRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			DepartmentLocalServiceUtil.addDepartment(this);
		}
		else {
			DepartmentLocalServiceUtil.updateDepartment(this);
		}
	}

	@Override
	public Department toEscapedModel() {
		return (Department)Proxy.newProxyInstance(Department.class.getClassLoader(),
			new Class[] { Department.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		DepartmentClp clone = new DepartmentClp();

		clone.setIddepartment(getIddepartment());
		clone.setName(getName());

		return clone;
	}

	public int compareTo(Department department) {
		int primaryKey = department.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		DepartmentClp department = null;

		try {
			department = (DepartmentClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = department.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{iddepartment=");
		sb.append(getIddepartment());
		sb.append(", name=");
		sb.append(getName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(10);

		sb.append("<model><model-name>");
		sb.append("com.test.database.model.Department");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>iddepartment</column-name><column-value><![CDATA[");
		sb.append(getIddepartment());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _iddepartment;
	private String _name;
	private BaseModel<?> _departmentRemoteModel;
}