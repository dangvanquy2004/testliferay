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

<%
String name = ParamUtil.getString(renderRequest, "name");
List<Employee> listEmpSearch = EmployeeLocalServiceUtil.findEmployee(name);
%>

<%= name%>