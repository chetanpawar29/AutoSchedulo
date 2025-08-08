<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <link rel="shortcut icon" href="./resources/vendors/images/bus-solid.svg">
    <title>AutoSchedulo</title>
    
    <!-- Site favicon -->
	<link rel="apple-touch-icon" sizes="180x180" href="./resources/vendors/images/apple-touch-icon.png">
	<link rel="icon" type="image/png" sizes="32x32" href="./resources/vendors/images/favicon-32x32.png">
	<link rel="icon" type="image/png" sizes="16x16" href="./resources/vendors/images/favicon-16x16.png">

	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">
	<!-- Google Font -->
	<link href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700;800&display=swap" rel="stylesheet">
	<!-- CSS -->
	<link rel="stylesheet" type="text/css" href="./resources/vendors/styles/core.css">
	<link rel="stylesheet" type="text/css" href="./resources/vendors/styles/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="./resources/src/plugins/datatables/css/dataTables.bootstrap4.min.css">
	<link rel="stylesheet" type="text/css" href="./resources/src/plugins/datatables/css/responsive.bootstrap4.min.css">
	<link rel="stylesheet" type="text/css" href="./resources/vendors/styles/style.css">
	<link href="styles/styles.css" rel="stylesheet" />
	<link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;600;700&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@800&display=swap" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css2?family=Exo+2:ital,wght@1,900&display=swap" rel="stylesheet">
	
	
    
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
        <link href="./resources/vendors/styles/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        <script async src="https://www.googletagmanager.com/gtag/js?id=UA-119386393-1"></script>
	<script>
		window.dataLayer = window.dataLayer || [];
		function gtag(){dataLayer.push(arguments);}
		gtag('js', new Date());

		gtag('config', 'UA-119386393-1');
	</script>
	<style>
    .sidebar-menu a {
        text-decoration: none !important;
    }
</style>
	
    </head>
    <body >
    <!-- Header -->
    <div class="header d-flex justify-content-end align-items-center px-4" style="height: 69px; background-color: #fff; box-shadow: 0 2px 4px rgba(0,0,0,0.1);">
        <div class="dropdown">
            <a class="dropdown-toggle" href="#" role="button" data-toggle="dropdown">
                <img src="./resources/vendors/images/admin.jpg" alt="" style="height: 45px; width: 45px; border-radius: 50%;">
            </a>
            <div class="dropdown-menu dropdown-menu-right dropdown-menu-icon-list">
                <a class="dropdown-item" href="#"><i class="dw dw-user1"></i> Profile</a>
                <a class="dropdown-item" href="#"><i class="dw dw-settings2"></i> Setting</a>
                <a class="dropdown-item" href="#"><i class="dw dw-help"></i> Help</a>
                <a class="dropdown-item" href="adminLogin"><i class="dw dw-logout"></i> Log Out</a>
            </div>
        </div>
    </div>

    <!-- Sidebar & Main Layout -->
    <div class="left-side-bar" style="width: 22rem;background: #536493">
		<div class="login-header box-shadow">
	  <div class="container-fluid d-flex justify-content-between align-items-center">
	    <div class="brand-logo">
	      <h2 style="
	        font-family: 'Exo 2', sans-serif;
	        font-weight: 900;
	        font-style: italic;
	        background: linear-gradient(to top, #FFAAAA, #d42121);
	        -webkit-background-clip: text;
	        -webkit-text-fill-color: transparent;
	        display: inline-block;
	        margin: 0;">
	        <i class="fa-solid fa-bus" style="color:#DA6C6C;"></i> AutoSchedulo
	     </h2>
	    </div>
	  </div>
	</div>
		<div class="menu-block customscroll" >
			<div class="sidebar-menu">
				<ul id="accordion-menu">
					<li class="dropdown">
						<a href="openAdminHomePage" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-house-1"></span><span class="mtext">Home</span>
						</a>
						
					</li>
					<li class="dropdown">
						<a href="openAddConductor" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-user-1"></span><span class="mtext">Add Conductor</span>
						</a>
						
					</li>
					<li class="dropdown">
						<a href="openAddDriver" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-user-2"></span><span class="mtext">Add Driver</span>
						</a>
						
					</li>
					<li>
						<a href="addBuses" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-bus"></span><span class="mtext">Add Bus</span>
						</a>
					</li>
					<li>
						<a href="addRoutes" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-route"></span><span class="mtext">Add Route</span>
						</a>
					</li>
					<li class="dropdown">
						<a href="generateTomorrowSchedule" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-settings"></span><span class="mtext">Generate Tomorrow Schedule</span>
						</a>
						
					</li>
					
					<li class="dropdown">
						<a href="viewTomorrowSchedules" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-calendar1"></span><span class="mtext">View Tomorrow's Schedules</span>
						</a>
						
					</li>
					<li class="dropdown">
						<a href="viewTodaySchedules" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-calendar"></span><span class="mtext">View Today's Schedules</span>
						</a>
						
					</li>
					<li class="dropdown">
						<a href="openChangePassPage" class="dropdown-toggle no-arrow">
							<span class="micon dw dw-password"></span><span class="mtext">Change Password</span>
						</a>
						
					</li>
					
			</div>
		</div>
	</div>
        

        <!-- Content Area -->
        
        <div id="layoutSidenav_content" class="flex-grow-1" style="margin-left: 27%;margin-top: 7%;">
        
            <main >
                <div class="container-fluid px-4 mt-4">
                    <ol class="breadcrumb mb-4">
                        <li class="breadcrumb-item active">Dashboard</li>
                    </ol>

                    <!-- Cards -->
				<div class="row">
				<div class="col-xl-3 col-md-6 mb-4">
				        <div class="card text-white h-100" style="background:#FF90BB">
				            <div class="card-body">
				                <i class="fas fa-user-tie fa-fw me-1"></i> Available Conductors
				                <h3 class="mt-2">56 / 70</h3> <!-- Replace 350 with dynamic data if needed -->
				            </div>
				            <div class="card-footer d-flex align-items-center justify-content-between">
				                <a class="small text-white stretched-link" href="viewAllConductors">View</a>
				                <div class="small text-white"><i class="fas fa-angle-right"></i></div>
				            </div>
				        </div>
				    </div>
				    
				    <div class="col-xl-3 col-md-6 mb-4">
				        <div class="card text-white h-100" style="background:#547792">
				            <div class="card-body">
				                <i class="fas fa-person-dots-from-line fa-fw me-2"></i> Available Driver
				                <h3 class="mt-2">59 / 78</h3> <!-- Replace 350 with dynamic data if needed -->
				            </div>
				            <div class="card-footer d-flex align-items-center justify-content-between">
				                <a class="small text-white stretched-link" href="viewAllDrivers">View</a>
				                <div class="small text-white"><i class="fas fa-angle-right"></i></div>
				            </div>
				        </div>
				    </div>
				    <div class="col-xl-3 col-md-6 mb-4">
				        <div class="card text-white h-100" style="background:#A35C7A">
				            <div class="card-body">
				                <i class="fas fa-bus fa-fw me-2"></i> Available Buses
				                <h3 class="mt-2">70 / 80</h3> <!-- Replace 120 with dynamic data if needed -->
				            </div>
				            <div class="card-footer d-flex align-items-center justify-content-between">
				                <a class="small text-white stretched-link" href="viewAllBuses">Manage Buses</a>
				                <div class="small text-white"><i class="fas fa-angle-right"></i></div>
				            </div>
				        </div>
				    </div>
				    <div class="col-xl-3 col-md-6 mb-4">
				        <div class="card text-white h-100" style="background:#48A6A7">
				            <div class="card-body">
				                <i class="fas fa-route fa-fw me-2"></i> Available Routes
				                <h3 class="mt-2">55 / 57</h3> <!-- Replace 45 with dynamic data if needed -->
				            </div>
				            <div class="card-footer d-flex align-items-center justify-content-between">
				                <a class="small text-white stretched-link" href="viewAllRoutes">View</a>
				                <div class="small text-white"><i class="fas fa-angle-right"></i></div>
				            </div>
				        </div>
				    </div>
				</div>


                    <!-- Charts -->
                    <div class="row" style="margin-top: 2%;">
                        <div class="col-xl-6">
                            <div class="card mb-4">
                                <div class="card-header"><i class="fas fa-chart-area me-1"></i>Area Chart</div>
                                <div class="card-body"><canvas id="myAreaChart" width="100%" height="40"></canvas></div>
                            </div>
                        </div>
                        <div class="col-xl-6">
                            <div class="card mb-4">
                                <div class="card-header"><i class="fas fa-chart-bar me-1"></i>Bar Chart</div>
                                <div class="card-body"><canvas id="myBarChart" width="100%" height="40"></canvas></div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>

        </div>
    </div>
    </div>
	<div class="footer-wrap pd-20 mb-20 card-box" style="margin-left: 10rem;background: #fff;margin-top: 10%;">
				<i class="fas fa-bus" style="font-size:20px; color:#FF8A8A;"></i> AutoSchedulo by <a href="https://www.linkedin.com/in/chetan-pawar-a023a2240?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BNiToC5JORW63AKuigKF3Aw%3D%3D" target="_blank">Chetan Pawar</a>
			</div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="./resources/vendors/scripts/scripts.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js" crossorigin="anonymous"></script>
        <script src="./resources/vendors/scripts/chart-area-demo.js"></script>
        <script src="./resources/vendors/scripts/chart-bar-demo.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js" crossorigin="anonymous"></script>
        <script src="./resources/vendors/scripts/core.js"></script>
		<script src="./resources/vendors/scripts/scripts.js"></script>
		<script src="./resources/vendors/scripts/datatables-simple-demo.js"></script>
		<script src="./resources/vendors/scripts/script.min.js"></script>
		<script src="./resources/vendors/scripts/process.js"></script>
		<script src="./resources/vendors/scripts/layout-settings.js"></script>
		<script src="./resources/src/plugins/apexcharts/apexcharts.min.js"></script>
		<script src="./resources/src/plugins/datatables/js/jquery.dataTables.min.js"></script>
		<script src="./resources/src/plugins/datatables/js/dataTables.bootstrap4.min.js"></script>
		<script src="./resources/src/plugins/datatables/js/dataTables.responsive.min.js"></script>
		<script src="./resources/src/plugins/datatables/js/responsive.bootstrap4.min.js"></script>
		<script src="./resources/vendors/scripts/dashboard.js"></script>
        <script src="./resources/vendors/scripts/datatables-simple-demo.js"></script>
    </body>
</html>
