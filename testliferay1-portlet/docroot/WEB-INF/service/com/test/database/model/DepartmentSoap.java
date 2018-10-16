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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author    QUY CNTT
 * @generated
 */
public class DepartmentSoap implements Serializable {
	public static DepartmentSoap toSoapModel(Department model) {
		DepartmentSoap soapModel = new DepartmentSoap();

		soapModel.setIddepartment(model.getIddepartment());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static DepartmentSoap[] toSoapModels(Department[] models) {
		DepartmentSoap[] soapModels = new DepartmentSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DepartmentSoap[][] toSoapModels(Department[][] models) {
		DepartmentSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DepartmentSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DepartmentSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DepartmentSoap[] toSoapModels(List<Department> models) {
		List<DepartmentSoap> soapModels = new ArrayList<DepartmentSoap>(models.size());

		for (Department model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DepartmentSoap[soapModels.size()]);
	}

	public DepartmentSoap() {
	}

	public int getPrimaryKey() {
		return _iddepartment;
	}

	public void setPrimaryKey(int pk) {
		setIddepartment(pk);
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

	private int _iddepartment;
	private String _name;
}