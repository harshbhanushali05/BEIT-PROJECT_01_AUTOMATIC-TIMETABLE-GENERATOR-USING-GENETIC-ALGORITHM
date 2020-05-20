<%
String ical = request.getParameter("ical");
if (ical!=null) {
	response.setContentType("text/plain");
	response.addHeader("Content-Disposition","attachment; filename=calendar.ics");
	response.setContentLength(ical.length());
	response.getWriter().write(ical);
}
%>