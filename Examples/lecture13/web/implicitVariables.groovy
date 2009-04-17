println """
<html>
	<head>
		<title>Hello system groovlet</title>
	<head>
	<body>
		<h1>Hello system groovlet</h1>
		
		<table border="1">
			<tr>
				<td>Servlet container:</td>
				<td>${application.getServerInfo()}</td>
			</tr>
			<tr>
				<td>User init parameter:</td>
				<td>${application.getInitParameter("lecturer")}</td>
			</tr>
			<tr>
				<td>Project init parameter:</td>
				<td>${application.getInitParameter("module")}</td>
			</tr>
		</table>			
	</body>
</html>
"""