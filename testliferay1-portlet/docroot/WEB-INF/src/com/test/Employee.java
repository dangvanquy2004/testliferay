package com.test;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.test.database.service.EmployeeLocalServiceUtil;

/**
 * Portlet implementation class Employee
 */
public class Employee extends MVCPortlet {
	public void getListEmployee(ActionRequest actionRequest, ActionResponse actionResponse) {
		int iddepartment = ParamUtil.getInteger(actionRequest, "id1");
		String id1 = StringUtil.valueOf(iddepartment);
		actionResponse.setRenderParameter("id1", id1);
	}
	
	public void findNameEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
		String name = ParamUtil.getString(actionRequest, "title");
		actionResponse.setRenderParameter("name", name);
	}
	
	public void findPhoneEmployee(ActionRequest actionRequest, ActionResponse actionResponse) throws SystemException {
		String phone = ParamUtil.getString(actionRequest, "phone");
		actionResponse.setRenderParameter("phone", phone);
	}
	
	public void findAddressEmployee(ActionRequest actionRequest, ActionResponse actionResponse) {
		String address = ParamUtil.getString(actionRequest, "address");
		actionResponse.setRenderParameter("address", address);
	}
}
