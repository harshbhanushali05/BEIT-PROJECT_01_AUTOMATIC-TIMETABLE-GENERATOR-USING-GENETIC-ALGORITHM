<%@ page contentType="application/json" %>
<%= getEvents(request) %>
	
<%@ page import="com.dhtmlx.planner.*,demoapp.*" %>
<%!
	String getEvents(HttpServletRequest request) throws Exception {
		CustomRecEventsManager evs = new CustomRecEventsManager(request);		
		return evs.run();
	}
%>