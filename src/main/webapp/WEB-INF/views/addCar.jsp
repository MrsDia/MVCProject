<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
     
       
       
		<form:form  method="post" modelAttribute="cars">
		
				<form:errors  path="make"/>
				year: <form:input type="text" path="year" />
				make: <form:input type="text" path="make" />
				model: <form:input type="text" path="model" />
				image: <form:input type="text" path="image" />
				<input type="submit">
		</form:form>
		
	  
	<%@ include file="common/footer.jspf"%>
	