<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Patient-Tracker</title>
</head>
<body>
<table>
<tr>
<th>Doctor Id</th>
<th>First Name</th>
<th>Last Name</th>
<th>Contact No.</th>
<th>EmailId</th>
<!-- 
<th>Age</th>
<th>Gender</th>
<th>DoB</th>

<th>Alt. Contact No.</th>
<th>EmailId</th>
<th>Address</th>
<th>City</th>
<th>State</th>
<th>ZipCode</th>
<th>Degree</th>
<th>Speciality</th>
<th>Work hours</th>
<th>Clinic</th> -->

</tr>
<c:forEach items="${doctorList}" var="doctor">
<tr>
<td> 
<a href="viewonedoctor.htm?doctorId=${doctor.doctorId}">
<c:out value="${doctor.doctorId}"></c:out></a>
</td>
<td><c:out value="${doctor.doctorId}"/></td>
<td><c:out value="${doctor.firstName}"/></td>
<td><c:out value="${doctor.lastName}"/></td>
<td><c:out value="${doctor.contactNumber}"/></td>
<td><c:out value="${doctor.emailId}"/></td>
<%-- 

<td><c:out value="${doctor.age}"/></td>
<td><c:out value="${doctor.gender}"/></td>
<td><c:out value="${doctor.dob}"/></td>
<td><c:out value="${doctor.contactNumber}"/></td>
<td><c:out value="${doctor.alternateContactNumber}"/></td>
<td><c:out value="${doctor.emailId}"/></td>
<td><c:out value="${doctor.addressLine1}"/></td>
<td><c:out value="${doctor.addressLine2}"/></td>
<td><c:out value="${doctor.city}"/></td>
<td><c:out value="${doctor.state}"/></td>
<td><c:out value="${doctor.zipCode}"/></td>
<td><c:out value="${doctor.degree}"/></td>
<td><c:out value="${doctor.speciality}"/></td>
<td><c:out value="${doctor.workHours}"/></td>
<td><c:out value="${doctor.hospitalClinicName}"/></td> --%>
</tr>
</c:forEach>

</table>
<form method="post" action="adddoctorform.htm">
<input type="submit" value="Add Doctor"/>
</form>
</body>
</html>