<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<portlet:actionURL var="addEmp" name="addEmployee">
</portlet:actionURL>

<aui:form action="<%=addEmp %>" method="post">
	<aui:input label="Name" name="name" type="text" value="" >
		<aui:validator name="required" />
	</aui:input>
	<aui:input label="Phone" name="phone" type="text" value="" >
		<aui:validator name="required" />
	</aui:input>
	<aui:input label="Address" name="address" type="text" value="" >
		<aui:validator name="required" />
	</aui:input>
	<aui:input label="Department" name="iddepart" type="number" value="" >
		<aui:validator name="required" />
	</aui:input>

	<aui:button type="submit" />
</aui:form>