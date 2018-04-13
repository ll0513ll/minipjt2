<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>우편번호 조회</title>
</head>
<body>
<form action="./controller?cmd=zipAll" method = "post">
<input type = "text" name = "zip"><br>
<select >
<option>우편번호 상세조회
</select>
<input type = "submit" value = "조회">


</form>

</body>
</html>