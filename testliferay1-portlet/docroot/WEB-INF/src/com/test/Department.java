package com.test;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class Department
 */
public class Department extends MVCPortlet {
	public void getListEmployee(ActionRequest actionRequest, ActionResponse actionResponse) {
		int iddepartment = ParamUtil.getInteger(actionRequest, "iddepartment");
		String id1 = StringUtil.valueOf(iddepartment);
		actionResponse.setRenderParameter("id1", id1);
	}
}
