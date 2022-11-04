<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/jstree.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jstree/3.2.1/themes/default/style.min.css" />
<title>Insert title here</title>
</head>
<body>
	<div id="tree">
		
	</div>
</body>
<script type="text/javascript">
$('#tree').jstree({ 
	'core' : {
	'data' : [
			{ "id" : "ajson1", "parent" : "#", "text" : "Simple root node" },
			{ "id" : "ajson2", "parent" : "#", "text" : "Root node 2" },
			{ "id" : "ajson3", "parent" : "ajson2", "text" : "Child 1" },
			{ "id" : "ajson4", "parent" : "ajson2", "text" : "Child 2" },
		]
	},
	'plugins' : ["search"],
	"search" : {
	    "show_only_matches" : true,
	    "show_only_matches_children" : true,
	}
});
</script>
</html>