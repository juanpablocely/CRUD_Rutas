function initMap() {
	// Instanciación del servicio de direcciones
	var directionsService = new google.maps.DirectionsService;
	// Se crea un renderizador para las direcciones y se liga al mapa
	var directionsDisplay = new google.maps.DirectionsRenderer;

	// Se crea el mapa y se centra en Colombia
	var map = new google.maps.Map(document.getElementById("map"), {
		zoom: 7,
		center: {
			lat: 3.9902569,
			lng: -73.7618485
		}
	});

	directionsDisplay.setMap(map);

	var onChangeHandler = function () {
		calculateAndDisplayRoute(directionsService, directionsDisplay);
	};

	document.getElementById('origin').addEventListener('change', onChangeHandler);
	document.getElementById('destiny').addEventListener('change', onChangeHandler);
}

function calculateAndDisplayRoute(
	argDirectionsService,
	argDirectionsDisplay
) {
	// Retrieve the start and end locations and create a DirectionsRequest using
	// WALKING directions.

	var pOrigin = document.getElementById('origin').value;
	var pDestin = document.getElementById('destiny').value;

	argDirectionsService.route({
			origin: pOrigin,
			destination: pDestin,
			travelMode: "DRIVING"
		},
		function (response, status) {
			// Route the directions and pass the response to a function to create
			// markers for each step.
			if (status === "OK") {
				argDirectionsDisplay.setDirections(response);
				var distancia = response['routes'][0]['legs'][0]['distance']['text'];
				var duracion = response['routes'][0]['legs'][0]['duration']['text'];

				$('#distancia .val-detalle-ruta').text(distancia);
				$('#duracion .val-detalle-ruta').text(duracion);

				// document.getElementById('warnings-panel').innerHTML = '<b>' + response.routes[0].warnings + '</b>';
			} else {
				window.alert("Error con \"Directions API\": " + status);
			}
		}
	);
}