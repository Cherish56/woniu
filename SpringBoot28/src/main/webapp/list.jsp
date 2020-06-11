<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
      <table border="1">

			<thead>
				<tr>
					<th width="30">#</th>
					<th>部门编号</th>
					<th>部门名称</th>
					<th>部门地址</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list }" var="dept" varStatus="i">
					<tr>
						<td>${i.count }</td>
						<td>${dept.deptno }</td>
						<td>${dept.dname }</td>
						<td>${dept.loc }</td>
					</tr>
				</c:forEach>
			
			</tbody>
	 </table>
</body>
</html>