<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<table class="table" id="tabela">
                
                <thead>
                  <tr>
                    <th>Codigo</th>
                    <th>Nome</th>
                  </tr>
                </thead>
                <tbody>
<c:forEach items="${pessoas}" var="pessoa">
<tr data-dismiss="modal">
<td>${pessoa.cd_pessoa_fisica}</td>
<td>${pessoa.nm_pessoa}</td>
</tr>

</c:forEach>



</tbody>

</table>

