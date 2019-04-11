<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>

 <c:forEach items="${requestScope.list}" var="person">
     <h4> ${person.name}======${person.age}======${person.tel}=======${person.address}</h4><br>
 </c:forEach>
</body>
</html>
