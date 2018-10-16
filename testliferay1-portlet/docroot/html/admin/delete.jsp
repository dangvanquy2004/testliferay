<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<portlet:actionURL var="deleteEmployee" name="deleteEmployee">
</portlet:actionURL>

<aui:form action="<%=deleteEmployee%>" method="post">
	<aui:input label="id" name="id" type="number" value="" >
	<aui:validator name="required" />
	<aui:validator name="number"></aui:validator>
	<aui:validator name="min">1</aui:validator>
	</aui:input>
	<aui:button type="submit" />
</aui:form>