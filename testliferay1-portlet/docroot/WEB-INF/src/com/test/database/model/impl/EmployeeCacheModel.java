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

package com.test.database.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.test.database.model.Employee;

import java.io.Serializable;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author QUY CNTT
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", address=");
		sb.append(address);
		sb.append(", phone=");
		sb.append(phone);
		sb.append(", iddepartment=");
		sb.append(iddepartment);
		sb.append("}");

		return sb.toString();
	}

	public Employee toEntityModel() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setId(id);

		if (name == null) {
			employeeImpl.setName(StringPool.BLANK);
		}
		else {
			employeeImpl.setName(name);
		}

		if (address == null) {
			employeeImpl.setAddress(StringPool.BLANK);
		}
		else {
			employeeImpl.setAddress(address);
		}

		if (phone == null) {
			employeeImpl.setPhone(StringPool.BLANK);
		}
		else {
			employeeImpl.setPhone(phone);
		}

		employeeImpl.setIddepartment(iddepartment);

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	public int id;
	public String name;
	public String address;
	public String phone;
	public int iddepartment;
}