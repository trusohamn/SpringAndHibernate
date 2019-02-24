<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmation</title>
</head>
<body>

Registered: ${person.firstName} ${person.lastName} 
<br>
from: ${person.country}
<br>
subject: ${person.subject}
<br>
<br>
Groups: 
<br>
<ul>
	<c:forEach var="temp" items= "${person.groups}">
		<li> ${temp} </li>
	</c:forEach>

</ul>
<br>
<br>
Age: ${person.age}

</body>
</html>