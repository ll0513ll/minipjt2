<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<script>
	function serch_zip(){
		
		window.open("./controller?cmd=serch_zip","","width=700px height=500px");
		return false;
		
	}

</script>
</head>
<body>

<form action="./home.jsp">

ID<input type = "text" name = "id" size = "30"><br><br>
PW<input type = "password" name = "pw" size = "30"><br><br>
E-mail<input type = "text" name= "email" size = "30"><br><br>
<input type = "text" name = "zip1" readonly = "readonly" size = "10">-<input type = "text" name = "zip2"  readonly = "readonly" size = "10">
<button onclick = "return serch_zip()">우편번호 조회</button><br><br>
주소<input type = "text" name = "addr1" size = "50"><br><br>
상세주소<input type = "text" name = "addr2" size = "50"><br><br>
<input type = "submit" value = "가입">


</form>

</body>
</html>