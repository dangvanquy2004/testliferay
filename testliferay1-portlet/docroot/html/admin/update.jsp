<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>


<portlet:actionURL var="updateEmployee" name="updateEmployee">
</portlet:actionURL>

<aui:form action="<%=updateEmployee%>" method="post">
    <aui:input label="id" name="id" type="number" value="" >
    	<aui:validator name="required" />
    	<aui:validator name="number"/>
    	<aui:validator name="min">1</aui:validator>
    </aui:input>
	<aui:input label="name" name="name" type="text" value="">
		<aui:validator name="required" />
	</aui:input>
	<aui:input label="phone" name="phone" type="text" value="">
		<aui:validator name="required" />
	</aui:input>
	<aui:input label="address" name="address" type="text" value="">
		<aui:validator name="required" />
	</aui:input>
	<aui:input label="Department" name="iddepart" type="number" value="" >
		<aui:validator name="required" />
	</aui:input>
	<aui:button type="submit" />
</aui:form>