<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>

<body>

<table>
<c:forEach items="${pessoas}" var="pessoa">
<tr>
<td>Nome:</td>
<td>${pessoa.nm_pessoa}</td>
</tr>

<tr>
<td>Nome Social:</td>
<td>${pessoa.nm_social} </td>
</tr>

<tr>
<td>Nome Mae:</td>
<td>${pessoa.mae.nm_pessoa} </td>
</tr>

</c:forEach>





</table>

</body>
</html>