<%@page import="com.liferay.portal.kernel.util.StringUtil"%>
<%@page import="com.test.database.service.DepartmentLocalServiceUtil"%>
<%@page import="com.test.database.model.Department"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<portlet:defineObjects />

<liferay-ui:search-container delta="5">
	<liferay-ui:search-container-results
		results="<%= DepartmentLocalServiceUtil.getDepartments(searchContainer.getStart(), searchContainer.getEnd()) %>"
		total="<%= DepartmentLocalServiceUtil.getDepartmentsCount() %>"
	/>

	<liferay-ui:search-container-row
		className="com.test.database.model.Department"
		modelVar="aDepartment"
	>
	
	<portlet:actionURL var="list" name="getListEmployee">
	<portlet:param name="iddepartment" value="<%= StringUtil.valueOf(aDepartment.getIddepartment()) %>"/>
	</portlet:actionURL>
	
		<liferay-ui:search-container-column-text property="name" href="<%=list %>"/>

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator />
</liferay-ui:search-container>

<portlet:renderURL var="admin">
<portlet:param name="path" value="/html/admin/view.jsp"/>
</portlet:renderURL>

<a href="<%= admin%>">Admin</a>