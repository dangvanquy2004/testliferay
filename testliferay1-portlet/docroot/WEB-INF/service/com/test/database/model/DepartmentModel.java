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
 * The base model interface for the Department service. Represents a row in the &quot;department&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.test.database.model.impl.DepartmentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.test.database.model.impl.DepartmentImpl}.
 * </p>
 *
 * @author QUY CNTT
 * @see Department
 * @see com.test.database.model.impl.DepartmentImpl
 * @see com.test.database.model.impl.DepartmentModelImpl
 * @generated
 */
public interface DepartmentModel extends BaseModel<Department> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a department model instance should use the {@link Department} interface instead.
	 */

	/**
	 * Returns the primary key of this department.
	 *
	 * @return the primary key of this department
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this department.
	 *
	 * @param primaryKey the primary key of this department
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the iddepartment of this department.
	 *
	 * @return the iddepartment of this department
	 */
	public int getIddepartment();

	/**
	 * Sets the iddepartment of this department.
	 *
	 * @param iddepartment the iddepartment of this department
	 */
	public void setIddepartment(int iddepartment);

	/**
	 * Returns the name of this department.
	 *
	 * @return the name of this department
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this department.
	 *
	 * @param name the name of this department
	 */
	public void setName(String name);

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

	public int compareTo(Department department);

	public int hashCode();

	public CacheModel<Department> toCacheModel();

	public Department toEscapedModel();

	public String toString();

	public String toXmlString();
}