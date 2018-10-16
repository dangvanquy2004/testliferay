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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.test.database.model.Employee;
import com.test.database.model.EmployeeModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Employee service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.test.database.model.EmployeeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeImpl}.
 * </p>
 *
 * @author QUY CNTT
 * @see EmployeeImpl
 * @see com.test.database.model.Employee
 * @see com.test.database.model.EmployeeModel
 * @generated
 */
public class EmployeeModelImpl extends BaseModelImpl<Employee>
	implements EmployeeModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee model instance should use the {@link com.test.database.model.Employee} interface instead.
	 */
	public static final String TABLE_NAME = "employee";
	public static final Object[][] TABLE_COLUMNS = {
			{ "id", Types.INTEGER },
			{ "name", Types.VARCHAR },
			{ "address", Types.VARCHAR },
			{ "phone", Types.VARCHAR },
			{ "iddepartment", Types.INTEGER }
		};
	public static final String TABLE_SQL_CREATE = "create table employee (id INTEGER not null primary key,name VARCHAR(75) null,address VARCHAR(75) null,phone VARCHAR(75) null,iddepartment INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table employee";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.test.database.model.Employee"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.test.database.model.Employee"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.test.database.model.Employee"),
			true);
	public static long ID_COLUMN_BITMASK = 1L;
	public static long IDDEPARTMENT_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.test.database.model.Employee"));

	public EmployeeModelImpl() {
	}

	public int getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(int primaryKey) {
		setId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Integer(_id);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	public Class<?> getModelClass() {
		return Employee.class;
	}

	public String getModelClassName() {
		return Employee.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("address", getAddress());
		attributes.put("phone", getPhone());
		attributes.put("iddepartment", getIddepartment());

		return attributes;
	}

	@Override
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

	public int getId() {
		return _id;
	}

	public void setId(int id) {
		_columnBitmask |= ID_COLUMN_BITMASK;

		if (!_setOriginalId) {
			_setOriginalId = true;

			_originalId = _id;
		}

		_id = id;
	}

	public int getOriginalId() {
		return _originalId;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_name = name;
	}

	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getPhone() {
		if (_phone == null) {
			return StringPool.BLANK;
		}
		else {
			return _phone;
		}
	}

	public void setPhone(String phone) {
		_phone = phone;
	}

	public int getIddepartment() {
		return _iddepartment;
	}

	public void setIddepartment(int iddepartment) {
		_columnBitmask |= IDDEPARTMENT_COLUMN_BITMASK;

		if (!_setOriginalIddepartment) {
			_setOriginalIddepartment = true;

			_originalIddepartment = _iddepartment;
		}

		_iddepartment = iddepartment;
	}

	public int getOriginalIddepartment() {
		return _originalIddepartment;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public Employee toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Employee)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		EmployeeImpl employeeImpl = new EmployeeImpl();

		employeeImpl.setId(getId());
		employeeImpl.setName(getName());
		employeeImpl.setAddress(getAddress());
		employeeImpl.setPhone(getPhone());
		employeeImpl.setIddepartment(getIddepartment());

		employeeImpl.resetOriginalValues();

		return employeeImpl;
	}

	public int compareTo(Employee employee) {
		int primaryKey = employee.getPrimaryKey();

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

		Employee employee = null;

		try {
			employee = (Employee)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		int primaryKey = employee.getPrimaryKey();

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
	public void resetOriginalValues() {
		EmployeeModelImpl employeeModelImpl = this;

		employeeModelImpl._originalId = employeeModelImpl._id;

		employeeModelImpl._setOriginalId = false;

		employeeModelImpl._originalIddepartment = employeeModelImpl._iddepartment;

		employeeModelImpl._setOriginalIddepartment = false;

		employeeModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Employee> toCacheModel() {
		EmployeeCacheModel employeeCacheModel = new EmployeeCacheModel();

		employeeCacheModel.id = getId();

		employeeCacheModel.name = getName();

		String name = employeeCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			employeeCacheModel.name = null;
		}

		employeeCacheModel.address = getAddress();

		String address = employeeCacheModel.address;

		if ((address != null) && (address.length() == 0)) {
			employeeCacheModel.address = null;
		}

		employeeCacheModel.phone = getPhone();

		String phone = employeeCacheModel.phone;

		if ((phone != null) && (phone.length() == 0)) {
			employeeCacheModel.phone = null;
		}

		employeeCacheModel.iddepartment = getIddepartment();

		return employeeCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", phone=");
		sb.append(getPhone());
		sb.append(", iddepartment=");
		sb.append(getIddepartment());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.test.database.model.Employee");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phone</column-name><column-value><![CDATA[");
		sb.append(getPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>iddepartment</column-name><column-value><![CDATA[");
		sb.append(getIddepartment());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Employee.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Employee.class
		};
	private int _id;
	private int _originalId;
	private boolean _setOriginalId;
	private String _name;
	private String _address;
	private String _phone;
	private int _iddepartment;
	private int _originalIddepartment;
	private boolean _setOriginalIddepartment;
	private long _columnBitmask;
	private Employee _escapedModelProxy;
}