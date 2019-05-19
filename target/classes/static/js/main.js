$.ajax({
		url : "/user/findAll",
		type : "post",
		dataType : "json",
		success : function(data) {
			if (data) {

				var appendHtml = "";
				for ( var key in data) {
					var curUser = data[key];
					appendHtml += "<tr><td>" + curUser['id'] + "</td><td>"
							+ curUser['userName'] + "</td><td>" + curUser['name']
							+ "</td></tr>"
				}
				$("#userTable>tbody").append(appendHtml);
			}
		}
	})