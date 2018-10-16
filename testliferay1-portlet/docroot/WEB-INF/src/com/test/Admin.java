package com.test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.database.model.Employee;
import com.test.database.service.EmployeeLocalServiceUtil;

/**
 * Portlet implementation class Admin
 */
public class Admin extends MVCPortlet {
	public void addEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException {
		String name = ParamUtil.getString(actionRequest, "name");
		String phone = ParamUtil.getString(actionRequest, "phone");
		String address = ParamUtil.getString(actionRequest, "address");
		int iddepart = ParamUtil.getInteger(actionRequest, "iddepart");
		
		Employee employee = EmployeeLocalServiceUtil.createEmployee((int) CounterLocalServiceUtil.increment());
		employee.setName(name);
		employee.setPhone(phone);
		employee.setAddress(address);
		employee.setIddepartment(iddepart);
		EmployeeLocalServiceUtil.addEmployee(employee);
	}
	
	public void updateEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		int id = ParamUtil.getInteger(actionRequest, "id");
		String name = ParamUtil.getString(actionRequest, "name");
		String phone = ParamUtil.getString(actionRequest, "phone");
		String address = ParamUtil.getString(actionRequest, "address");
		int iddepart = ParamUtil.getInteger(actionRequest, "iddepart");
		
		Employee employee = null;
		employee = EmployeeLocalServiceUtil.getEmployee(id);
		employee.setName(name);
		employee.setPhone(phone);
		employee.setAddress(address);
		employee.setIddepartment(iddepart);
		EmployeeLocalServiceUtil.updateEmployee(employee);
	}
	
	public void deleteEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException, SystemException {
		int id = ParamUtil.getInteger(actionRequest, "id");
		
		Employee employee = EmployeeLocalServiceUtil.getEmployee(id);
		EmployeeLocalServiceUtil.deleteEmployee(employee);
	}
}
