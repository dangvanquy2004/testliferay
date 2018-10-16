<%@page import="org.apache.jasper.tagplugins.jstl.core.Param"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.test.database.service.EmployeeLocalServiceUtil"%>
<%@page import="com.test.database.model.Employee"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<portlet:defineObjects />

<% int id = ParamUtil.getInteger(renderRequest, "idemp"); %>

<table id="customers">
<tr>
<th>Id</th>
<th>Name</th>
<th>Phone</th>
<th>Address</th>
</tr>
<%
Employee employee = EmployeeLocalServiceUtil.findByEmployee(id);
%>

<tr>
<td><%=employee.getId() %></td>
<td><%=employee.getName() %></td>
<td><%=employee.getPhone() %></td>
<td><%=employee.getAddress() %></td>
</tr>
</table>
