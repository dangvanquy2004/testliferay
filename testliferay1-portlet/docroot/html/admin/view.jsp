<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<portlet:renderURL var="add">
<portlet:param name="mvcPath" value="/html/admin/add.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="update">
<portlet:param name="mvcPath" value="/html/admin/update.jsp"/>
</portlet:renderURL>
<portlet:renderURL var="delete">
<portlet:param name="mvcPath" value="/html/admin/delete.jsp"/>
</portlet:renderURL>

<p><a href="<%=add %>">Add</a></p>
<p><a href="<%=update%>">Update</a></p>
<p><a href="<%=delete%>">Delete</a></p>
