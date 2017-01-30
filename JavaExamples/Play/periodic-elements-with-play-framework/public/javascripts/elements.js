$( document ).ready(function() {
	var doSearch = function() {
		var e = document.getElementById("searchCriteria");
		var searchTerm = document.getElementById("searchTerm").value;
		var url = "/element?element=" + searchTerm;
		$.get(url, function(data) {
			$.get('/template', function(template) {
					var newElementBox = Mustache.render(template, data);
					$("#element").html(newElementBox);
			});
		});
	};
	document.getElementById("searchButton").addEventListener('click', doSearch);
	doSearch();
});