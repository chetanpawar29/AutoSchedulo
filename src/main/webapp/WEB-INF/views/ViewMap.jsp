<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="icon"
      href="https://cdn0.iconfinder.com/data/icons/small-n-flat/24/678111-map-marker-512.png"
      type="image/gif"
      sizes="16x16"
    />
    <title>Route Map</title>
    <link href="./resources/style1.css" rel="stylesheet" />

    <link
      href="https://api.mapbox.com/mapbox-gl-js/v1.12.0/mapbox-gl.css"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://api.mapbox.com/mapbox-gl-js/plugins/mapbox-gl-directions/v4.1.0/mapbox-gl-directions.css"
      type="text/css"
    />
  </head>

  <body>
    <div id="map"></div>
    
    <a
      href="https://github.com/suhailkakar/Google-Map-Clone"
      class="github-corner"
      aria-label="View source on GitHub"
    ></a>
    
    <script src="https://api.mapbox.com/mapbox-gl-js/v1.12.0/mapbox-gl.js"></script>
    <script src="https://api.mapbox.com/mapbox-gl-js/plugins/mapbox-gl-directions/v4.1.0/mapbox-gl-directions.js"></script>
    <script>
      // Accessing Spring model attributes using JSP
      var source = "<%= request.getAttribute("source") %>";
      var destination = "<%= request.getAttribute("destination") %>";
      
      console.log("Source: " + source);
      console.log("Destination: " + destination);
      
      mapboxgl.accessToken =
    	  "pk.eyJ1Ijoic3ViaGFtcHJlZXQiLCJhIjoiY2toY2IwejF1MDdodzJxbWRuZHAweDV6aiJ9.Ys8MP5kVTk5P9V2TDvnuDg"

      // Geolocation options
      navigator.geolocation.getCurrentPosition(successLocation, errorLocation, {
        enableHighAccuracy: true,
      });

      // Geolocation success function
      function successLocation(position) {
        setupMap([position.coords.longitude, position.coords.latitude]);
      }

      // Geolocation error function
      function errorLocation() {
        setupMap([-2.24, 53.48]); // Fallback location
      }

      // Function to initialize and set up the map
      function setupMap(center) {
        const map = new mapboxgl.Map({
          container: "map",
          style: "mapbox://styles/mapbox/streets-v11",
          center: center,
          zoom: 12,
        });

        const nav = new mapboxgl.NavigationControl();
        map.addControl(nav, "bottom-right");

        const directions = new MapboxDirections({
          accessToken: mapboxgl.accessToken,
          profile: "mapbox/driving",
          interactive: false,
        });

        // Add directions control after the map is fully loaded
        map.on("load", function () {
          map.addControl(directions, "top-left");

          // Set the route on the map
          directions.setOrigin(source);
          directions.setDestination(destination);
        });
      }

    </script>
  </body>
</html>
