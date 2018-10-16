<%@page import="com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletClassLoaderUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.dao.orm.DynamicQuery"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.test.database.service.EmployeeLocalServiceUtil"%>
<%@page import="com.test.database.model.Employee"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<portlet:defineObjects />

<% int id = ParamUtil.getInteger(renderRequest, "id1");
List<Employee> listEmp = EmployeeLocalServiceUtil.findByDepartment(id);
%>

<liferay-ui:search-container deltaConfigurable="<%=true %>">
	<liferay-ui:search-container-results
		results="<%= listEmp %>"
		total="<%= listEmp.size() %>" />

	<liferay-ui:search-container-row
		className="com.test.database.model.Employee"
		modelVar="aEmployee">
	
		<portlet:renderURL var="viewDetail" >
			<portlet:param name="idemp" value="<%= String.valueOf(aEmployee.getId()) %>"/>
			<portlet:param name="mvcPath" value="/html/employee/detail.jsp" />
		</portlet:renderURL>
		
		<liferay-ui:search-container-column-text property="id" href="<%=viewDetail %>"/>
		<liferay-ui:search-container-column-text property="name" href="<%=viewDetail %>"/>

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator paginate="<%= false %>"/>
</liferay-ui:search-container>

<portlet:actionURL var="findNameURL" name="findNameEmployee" />
<aui:form action="<%= findNameURL %>" method="post">
<aui:input label="Search Name" name="title" type="text" value="" />
<aui:button type="submit" value="Search" />
</aui:form>

<portlet:actionURL var="findPhoneURL" name="findPhoneEmployee"/>
<aui:form action="<%=findPhoneURL %>" method="post">
<aui:input label="Search Phone" name="phone" text="text" value=""/>
<aui:button type="submit" value="Search" />
</aui:form>

<portlet:actionURL var="findAddressURL" name="findAddressEmployee"/>
<aui:form action="<%=findAddressURL %>" method="post">
<aui:input name="address" type="text" label="Address" value=""/>
<aui:button type="submit" value="Search"/>
</aui:form>

<%
String address = ParamUtil.getString(renderRequest, "address");
DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Employee.class, PortletClassLoaderUtil.getClassLoader());
dynamicQuery.add(PropertyFactoryUtil.forName("address").like("%" + address + "%"));
List<Employee> listAddress = EmployeeLocalServiceUtil.dynamicQuery(dynamicQuery);
%>


<%
String phone = ParamUtil.getString(renderRequest, "phone");
List<Employee> listEmpPhone = EmployeeLocalServiceUtil.findPhoneEmployee(phone);
%>

<%
String name = ParamUtil.getString(renderRequest, "name");
List<Employee> listEmpSearch = EmployeeLocalServiceUtil.findEmployee(name);
%>

<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= listEmpSearch %>"
		total="<%= listEmpSearch.size() %>"
	/>

	<liferay-ui:search-container-row
		className="com.test.database.model.Employee"
		modelVar="aEmployee"
	>
	
		<liferay-ui:search-container-column-text property="id" />

		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text property="phone" />

		<liferay-ui:search-container-column-text property="address" />

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="<%= false %>" />
</liferay-ui:search-container>


<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= listEmpPhone %>"
		total="<%= listEmpPhone.size() %>"
	/>

	<liferay-ui:search-container-row
		className="com.test.database.model.Employee"
		modelVar="aEmployee"
	>
	
		<liferay-ui:search-container-column-text property="id" />

		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text property="phone" />

		<liferay-ui:search-container-column-text property="address" />

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="<%= false %>" />
</liferay-ui:search-container>

<liferay-ui:search-container>
	<liferay-ui:search-container-results
		results="<%= listAddress  %>"
		total="<%= listAddress.size() %>"
	/>

	<liferay-ui:search-container-row
		className="com.test.database.model.Employee"
		modelVar="aEmployee"
	>
	
		<liferay-ui:search-container-column-text property="id" />

		<liferay-ui:search-container-column-text property="name" />

		<liferay-ui:search-container-column-text property="phone" />

		<liferay-ui:search-container-column-text property="address" />

		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="<%= false %>" />
</liferay-ui:search-container>


