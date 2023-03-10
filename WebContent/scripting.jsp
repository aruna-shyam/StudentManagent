<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scripting Elements</title>
</head>
<body>
<h1>Below Output is All About Scripting</h1>

<%
//declaring vari
int i1=10;
int j=20;

//do some operation
int k=i1+j;

//disply data in browser
out.println(k);

//display on console
System.out.println(k);
%><br/>

<%! 
//declared global variable
int i=20;
%>

<%
out.println(i);
System.out.println(i);
%><br/>

<%!
int i2=10;
public int f1()
{
	return 10;
}
public String f2()
{
	return "palle";
}
%>

<%
int i2=f1();
String s=f2();
out.println(i2);
out.println(s);
%><br/>

<%!
int m=10;
public int f3(int n)
{
	return m+n+1;
}
%>

<%
int n=20;
int m=f3(n);
out.println(m);
%>

</body>
</html>