<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>

<portlet:defineObjects />

<liferay-portlet:actionURL var="configurationURL" portletConfiguration="true" />
<%String number = portletPreferences.getValue("number", ""); %>
<%= number %>
<aui:form action="<%= configurationURL.toString() %>" method="post">
<aui:input name="number" label="input record" value="" type="text">
	<aui:validator name="required" />
</aui:input>
<aui:button type="submit" />
</aui:form>