<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
        <%@ page isELIgnored = "false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Doctor</title>
</head>
<body>
<springform:form modelAttribute="doctor" method="post" action="adddoctor.htm">

<table>
<tr>
<td><springform:label path="doctorId">Doctor Id:</springform:label>
<td><springform:input path="doctorId"/></td>
<td><springform:errors path ="doctorId" cssClass = "error" /></td>
</tr>
<tr>
<td><springform:label path="firstName">First Name:</springform:label>
<td><springform:input path="firstName"/></td>
<td><springform:errors path ="firstName" cssClass = "error" /></td>
</tr>
<tr>
<td><springform:label path="lastName">Last Name:</springform:label>
<td><springform:input path="lastName"/></td>
<td><springform:errors path ="lastName" cssClass = "error" /></td>

</tr>

<tr>
<td><springform:label path="age">Age:</springform:label>
<td><springform:input path="age"/></td>
<td><springform:errors path ="age" cssClass = "error" /></td>

</tr>
<tr>
<td><springform:label path="gender">gender:</springform:label>
<td><springform:input path="gender"/>
<td><springform:errors path ="gender" cssClass = "error" />

</td>
</tr>
<tr>
<td><springform:label path="dob">Date of Birth:</springform:label>
<td><springform:input path="dob"/>
</td>
</tr>
<tr>
<td><springform:label path="contactNumber">Contact Number:</springform:label>
<td><springform:input path="contactNumber"/>
<td><springform:errors path ="contactNumber" cssClass = "error" />

</td>
</tr>
<tr>
<td><springform:label path="alternateContactNumber">Alternate Contact Number:</springform:label>
<td><springform:input path="alternateContactNumber"/>
</td>
</tr>
<tr>
<td><springform:label path="emailId">Email Id:</springform:label>
<td><springform:input path="emailId"/>
<td><springform:errors path ="emailId" cssClass = "error" /></td>


</tr>
<tr>
<td><springform:label path="addressLine1">Address Line1:</springform:label>
<td><springform:input path="addressLine1"/>
<td><springform:errors path ="addressLine1" cssClass = "error" /></td>


</tr>

<tr>
<td><springform:label path="addressLine2">Address Line2:</springform:label>
<td><springform:input path="addressLine2"/>

</td>
</tr>
<tr>
<td><springform:label path="city">City:</springform:label>
<td><springform:input path="city"/>
<td><springform:errors path ="city" cssClass = "error" /></td>


</tr>
<tr>
<td><springform:label path="state">State:</springform:label>
<td><springform:input path="state"/>
<td><springform:errors path ="state" cssClass = "error" /></td>


</tr>
<tr>
<td><springform:label path="zipCode">Zip Code:</springform:label>
<td><springform:input path="zipCode"/>
<td><springform:errors path ="zipCode" cssClass = "error" /></td>

</tr>
<tr>
<td><springform:label path="degree">Degree:</springform:label>
<td><springform:input path="degree"/>
<td><springform:errors path ="degree" cssClass = "error" /></td>


</tr>
<tr>
<td><springform:label path="speciality">Speciality:</springform:label>
<td><springform:input path="speciality"/>
<td><springform:errors path ="speciality" cssClass = "error" /></td>


</tr>
<tr>
<td><springform:label path="workHours">Work Hours:</springform:label>
<td><springform:input path="workHours"/>
<td><springform:errors path ="workHours" cssClass = "error" /></td>

</tr>
<tr>
<td><springform:label path="hospitalClinicName">Hospital Clinic Name:</springform:label>
<td><springform:input path="hospitalClinicName"/>
<td><springform:errors path ="hospitalClinicName" cssClass = "error" /></td>

</tr>
<tr>
<td><input type="submit" value="Add Product"></td>
</tr>
</table>
</springform:form>
${status}
<form method="post" action="viewDoctor.htm">
<input type="submit" value="View"/>
</form>
</body>
</html>