<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="javax.swing.text.StyledEditorKit.ForegroundAction"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeApplicationLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication"%>
<fieldset class="wizard-fieldset" id="fireBrigadeTransactionFieldset" name="FIRE BRIGADE TRANSACTION TYPE">

	<div class="row" id="certificateType">
		<div class="col-md-12"> 
        	<p class="common-section-small-heading mb-3">Please select the type of transaction</p> 
        </div>
		<div class="col-lg-6">
			<div class="application-type-card wizard-card" id="fireBrigadeNewApplicationBtn">
				<a href="javascript:;" class="d-block">
					<div class="application-type-card-icon text-center mb-3">
						<svg width="73" height="84" viewBox="0 0 73 84" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <path opacity="0.3" d="M27.987 64L30.347 66.36L36.667 72.68L43.027 66.32L45.347 64H64.667V8H8.66699V64H27.987ZM29.147 28.48L36.667 12L44.187 28.48L60.667 36L44.187 43.52L36.667 60L29.147 43.52L12.667 36L29.147 28.48Z" fill="#0C8D5A"></path>
                            <path d="M8.66699 72H24.667L36.667 84L48.667 72H64.667C69.067 72 72.667 68.4 72.667 64V8C72.667 3.6 69.067 0 64.667 0H8.66699C4.26699 0 0.666992 3.6 0.666992 8V64C0.666992 68.4 4.26699 72 8.66699 72ZM8.66699 8H64.667V64H45.347L42.987 66.36L36.667 72.68L30.307 66.32L27.987 64H8.66699V8ZM36.667 60L44.187 43.52L60.667 36L44.187 28.48L36.667 12L29.147 28.48L12.667 36L29.147 43.52L36.667 60Z" fill="#0C8D5A"></path>
                        </svg>
					</div>
					<div class="application-type-card-content">
						<p class="application-type-card-title wizard-title f2">New Application for a Certificate</p>                  
					</div>
				</a>
			</div>
		</div>
		<div class="col-lg-6">
			<div class="application-type-card wizard-card" id="fireBrigadeRecertificationBtn">
				<a href="javascript:;" class="d-block">
					<div class="application-type-card-icon text-center mb-3">
						<svg width="80" height="88" viewBox="0 0 80 88" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <path d="M72 8H68V0H60V8H20V0H12V8H8C3.6 8 0 11.6 0 16V80C0 84.4 3.6 88 8 88H72C76.4 88 80 84.4 80 80V16C80 11.6 76.4 8 72 8ZM72 16V28H8V16H72ZM8 80V36H72V80H8Z" fill="#0C8D5A" />
                        </svg>
					</div>
					<div class="application-type-card-content">
						<p class="application-type-card-title wizard-title f2">Application for Recertification</p>
					</div>
				</a>
			</div>
		</div>
		<input type="hidden" id="applicationTypeVal" name="applicationTypeVal">
	</div>
	<div class="row mt-3 hide" id="applicantTypeBox">
		<div class="col-md-12"> 
        	<p class="common-section-small-heading mb-3">Please select the type of Applicant</p> 
        </div>
		<div class="col-lg-6">
			<div class="application-type-card wizard-card">
				<a href="javascript:;" class="d-block">
					<div class="application-type-card-icon text-center mb-3">
						<svg xmlns="http://www.w3.org/2000/svg" width="61" height="61" viewBox="0 0 532 532" fill="none">
							<path d="M437.404 0H196.259C195.511 0 194.679 0.083125 194.098 0.16625H193.848C193.1 0.249375 192.435 0.49875 191.77 0.748125C191.438 0.83125 191.188 0.83125 190.856 0.9975C190.191 1.24687 189.609 1.57938 189.027 1.91188L188.944 1.995C188.778 2.07812 188.694 2.16125 188.528 2.24438L187.78 2.74313L187.697 2.82625C187.281 3.15875 186.949 3.40812 186.699 3.6575L186.201 4.07313V4.15625L86.2845 89.2762C86.2845 89.2762 86.2013 89.2763 86.2013 89.3594L85.5363 89.9412L85.287 90.1906C84.5388 90.8556 83.957 91.5206 83.4582 92.1025C82.5438 93.4325 81.7957 94.7625 81.297 96.2587C80.7982 97.6719 80.5488 99.2513 80.5488 100.831V517.869C80.5488 525.682 86.9495 532 94.6801 532H437.488C445.301 532 451.619 525.599 451.619 517.869V14.1313C451.575 10.3826 450.061 6.80092 447.402 4.1578C444.744 1.51468 441.153 0.0215435 437.404 0ZM423.273 503.654H108.728V114.796H196.259C204.073 114.796 210.39 108.478 210.39 100.664V28.3456H423.19V503.654H423.273Z" fill="#047247"></path>
							<path d="M151.787 402.907C151.787 408.559 156.359 413.131 162.011 413.131H369.907C372.619 413.131 375.219 412.054 377.137 410.137C379.054 408.219 380.131 405.619 380.131 402.907C380.131 400.195 379.054 397.595 377.137 395.677C375.219 393.76 372.619 392.683 369.907 392.683H162.011C156.442 392.683 151.787 397.254 151.787 402.907ZM369.99 442.558H162.011C159.3 442.558 156.699 443.635 154.782 445.552C152.864 447.47 151.787 450.07 151.787 452.782C151.787 455.494 152.864 458.094 154.782 460.012C156.699 461.929 159.3 463.006 162.011 463.006H369.907C375.56 463.006 380.131 458.434 380.131 452.782C380.215 447.129 375.643 442.558 369.99 442.558ZM190.606 363.422H341.395C345.718 363.422 349.292 359.848 349.292 355.526V306.731C349.292 275.227 324.438 249.874 292.601 249.042C291.297 248.959 289.995 249.222 288.827 249.807C287.658 250.391 286.666 251.274 285.951 252.367L264.837 282.376L246.3 252.783C245.572 251.622 244.551 250.673 243.34 250.031C242.129 249.389 240.771 249.077 239.401 249.126C207.647 249.957 182.71 275.31 182.71 306.814V355.609C182.71 359.848 186.284 363.422 190.606 363.422ZM266.001 245.052C289.775 245.052 309.143 225.684 309.143 201.911C309.143 178.137 289.775 158.769 266.001 158.769C242.227 158.769 222.859 178.137 222.859 201.911C222.859 225.684 242.227 245.052 266.001 245.052ZM252.867 65.835H355.194C357.906 65.835 360.506 64.7578 362.424 62.8403C364.341 60.9229 365.418 58.3223 365.418 55.6106C365.418 52.8989 364.341 50.2983 362.424 48.3809C360.506 46.4634 357.906 45.3862 355.194 45.3862H252.867C250.155 45.3862 247.555 46.4634 245.637 48.3809C243.72 50.2983 242.643 52.8989 242.643 55.6106C242.643 58.3223 243.72 60.9229 245.637 62.8403C247.555 64.7578 250.155 65.835 252.867 65.835ZM356.358 85.2031H254.031C251.319 85.2031 248.719 86.2803 246.801 88.1978C244.884 90.1152 243.806 92.7158 243.806 95.4275C243.806 98.1391 244.884 100.74 246.801 102.657C248.719 104.575 251.319 105.652 254.031 105.652H356.358C359.069 105.652 361.67 104.575 363.587 102.657C365.505 100.74 366.582 98.1391 366.582 95.4275C366.582 92.7158 365.505 90.1152 363.587 88.1978C361.67 86.2803 359.069 85.2031 356.358 85.2031Z" fill="#047247"></path>
						</svg>
					</div>
					<div class="application-type-card-content">
						<p class="application-type-card-title wizard-title f2">Applicant</p>                  
					</div>
				</a>
			</div>
		</div>
		<div class="col-lg-6">
			<div class="application-type-card wizard-card">
				<a href="javascript:;" class="d-block">
					<div class="application-type-card-icon text-center mb-3">
						<svg xmlns="http://www.w3.org/2000/svg" width="61" height="61" viewBox="0 0 521 532" fill="none">
							<path d="M244.817 251.752C265.622 251.751 285.96 245.587 303.259 234.039C320.558 222.49 334.04 206.076 342.002 186.873C349.963 167.669 352.046 146.538 347.987 126.152C343.927 105.766 333.908 87.0403 319.196 72.3429C304.485 57.6455 285.741 47.6365 265.335 43.5817C244.929 39.5268 223.778 41.6083 204.557 49.5627C185.335 57.5172 168.906 70.9874 157.347 88.2701C145.789 105.553 139.619 125.872 139.619 146.657C139.65 174.521 150.743 201.235 170.465 220.938C190.187 240.64 216.926 251.722 244.817 251.752ZM244.817 74.5438C259.093 74.5444 273.049 78.7743 284.918 86.6987C296.788 94.623 306.039 105.886 311.502 119.063C316.965 132.24 318.394 146.739 315.608 160.728C312.823 174.716 305.948 187.565 295.853 197.65C285.758 207.735 272.896 214.603 258.895 217.385C244.893 220.167 230.379 218.739 217.19 213.281C204.001 207.823 192.728 198.58 184.796 186.721C176.865 174.862 172.632 160.92 172.632 146.657C172.654 127.538 180.267 109.208 193.8 95.6892C207.332 82.1701 225.68 74.5656 244.817 74.5438ZM294.006 317.747H195.618C173.738 317.773 152.761 326.469 137.289 341.926C121.817 357.383 113.113 378.34 113.087 400.2V469.791C113.087 474.164 111.348 478.359 108.252 481.451C105.157 484.544 100.958 486.281 96.5805 486.281C92.2028 486.281 88.0043 484.544 84.9088 481.451C81.8133 478.359 80.0742 474.164 80.0742 469.791V400.204C80.1109 369.6 92.2961 340.26 113.957 318.62C135.618 296.98 164.985 284.806 195.618 284.769H293.996C316.418 284.784 338.354 291.295 357.145 303.515C375.937 315.735 390.777 333.137 399.867 353.614C400.793 355.601 401.313 357.751 401.397 359.941C401.482 362.13 401.128 364.314 400.358 366.366C399.588 368.417 398.416 370.295 396.912 371.889C395.407 373.483 393.599 374.761 391.594 375.649C389.59 376.537 387.428 377.017 385.235 377.062C383.042 377.106 380.863 376.713 378.824 375.906C376.785 375.099 374.927 373.894 373.36 372.362C371.792 370.829 370.546 369 369.694 366.982C363.196 352.339 352.586 339.894 339.15 331.156C325.713 322.417 310.038 317.757 294.006 317.747Z" fill="#047247"/>
							<path d="M367.831 449.395C367.831 431.969 381.845 417.776 399.369 417.254V432.817V435.212L401.072 433.528L423.43 411.424L424.15 410.713L423.43 410.002L401.072 387.898L399.369 386.215V388.609V404.198C374.583 404.723 354.652 424.738 354.652 449.395C354.652 458.272 357.284 466.498 361.741 473.473L362.407 474.516L363.286 473.646L371.447 465.578L371.98 465.052L371.624 464.393C369.212 459.918 367.831 454.831 367.831 449.395ZM438.997 425.316L438.331 424.273L437.451 425.143L429.291 433.211L428.758 433.737L429.113 434.396C431.525 438.871 432.906 443.958 432.906 449.395C432.906 466.82 418.893 481.013 401.369 481.535V465.972V463.577L399.666 465.261L377.308 487.365L376.588 488.076L377.308 488.787L399.666 510.891L401.369 512.574V510.18V494.591C426.155 494.066 446.085 474.051 446.085 449.395C446.085 440.517 443.454 432.292 438.997 425.316Z" fill="#047247" stroke="#047247" stroke-width="2"/>
						</svg>
					</div>
					<div class="application-type-card-content">
						<p class="application-type-card-title wizard-title f2">Acting on Behalf of Owner/Occupier</p>
					</div>
				</a>
			</div>
		</div>
		<input type="hidden" id="applicantTypeVal" name="applicantTypeVal">
	</div>
	<div class="row mt-3 hide" id="premisesTypeBox">
		<div class="col-md-12"> 
        	<p class="common-section-small-heading mb-3">Type of Premises</p> 
        </div>
		<div class="col-md-12">
			<ul class="ps-0 list-unstyled wizard-cards-list">
				<li>
					<div class="wizard-card">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="37" height="30" viewBox="0 0 800 800" fill="none">
									<g clip-path="url(#clip0_184_506)">
									<path fill-rule="evenodd" clip-rule="evenodd" d="M566.667 733.333V700C566.667 681.59 581.59 666.667 600 666.667C618.41 666.667 633.333 681.59 633.333 700V733.333H700V200H500V733.333H566.667ZM200 733.333V700C200 681.59 214.924 666.667 233.333 666.667H300C318.41 666.667 333.333 681.59 333.333 700V733.333H433.333V66.6667H100V733.333H200ZM500 133.333H733.333C751.743 133.333 766.667 148.257 766.667 166.667V766.667C766.667 785.077 751.743 800 733.333 800H66.6668C48.2573 800 33.3335 785.077 33.3335 766.667V33.3333C33.3335 14.9238 48.2573 0 66.6668 0H466.667C485.077 0 500 14.9238 500 33.3333V133.333ZM200 133.333C218.409 133.333 233.333 148.257 233.333 166.667C233.333 185.076 218.409 200 200 200C181.591 200 166.667 185.076 166.667 166.667C166.667 148.257 181.591 133.333 200 133.333ZM200 266.667C218.409 266.667 233.333 281.59 233.333 300C233.333 318.41 218.409 333.333 200 333.333C181.591 333.333 166.667 318.41 166.667 300C166.667 281.59 181.591 266.667 200 266.667ZM600 266.667C618.41 266.667 633.333 281.59 633.333 300C633.333 318.41 618.41 333.333 600 333.333C581.59 333.333 566.667 318.41 566.667 300C566.667 281.59 581.59 266.667 600 266.667ZM200 400C218.409 400 233.333 414.923 233.333 433.333C233.333 451.743 218.409 466.667 200 466.667C181.591 466.667 166.667 451.743 166.667 433.333C166.667 414.923 181.591 400 200 400ZM600 400C618.41 400 633.333 414.923 633.333 433.333C633.333 451.743 618.41 466.667 600 466.667C581.59 466.667 566.667 451.743 566.667 433.333C566.667 414.923 581.59 400 600 400ZM200 533.333C218.409 533.333 233.333 548.257 233.333 566.667C233.333 585.077 218.409 600 200 600C181.591 600 166.667 585.077 166.667 566.667C166.667 548.257 181.591 533.333 200 533.333ZM600 533.333C618.41 533.333 633.333 548.257 633.333 566.667C633.333 585.077 618.41 600 600 600C581.59 600 566.667 585.077 566.667 566.667C566.667 548.257 581.59 533.333 600 533.333ZM333.333 133.333C351.743 133.333 366.667 148.257 366.667 166.667C366.667 185.076 351.743 200 333.333 200C314.924 200 300 185.076 300 166.667C300 148.257 314.924 133.333 333.333 133.333ZM333.333 266.667C351.743 266.667 366.667 281.59 366.667 300C366.667 318.41 351.743 333.333 333.333 333.333C314.924 333.333 300 318.41 300 300C300 281.59 314.924 266.667 333.333 266.667ZM333.333 400C351.743 400 366.667 414.923 366.667 433.333C366.667 451.743 351.743 466.667 333.333 466.667C314.924 466.667 300 451.743 300 433.333C300 414.923 314.924 400 333.333 400ZM333.333 533.333C351.743 533.333 366.667 548.257 366.667 566.667C366.667 585.077 351.743 600 333.333 600C314.924 600 300 585.077 300 566.667C300 548.257 314.924 533.333 333.333 533.333Z" fill="#047247"/>
									</g>
									<defs>
									<clipPath id="clip0_184_506">
									<rect width="800" height="800" fill="white"/>
									</clipPath>
									</defs>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2">Commercial</p>
							</div>
						</a>
					</div>
				</li>
				<li>
					<div class="wizard-card">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="37" height="30" viewBox="0 0 800 800" fill="none">
									<path d="M400 495.333C379.217 495.336 358.823 489.691 341 479L50 304.667V271.333C50.3488 254.68 57.2102 238.827 69.1125 227.174C81.0147 215.521 97.0097 208.996 113.667 209H686.333C703.219 209 719.413 215.708 731.352 227.648C743.292 239.587 750 255.781 750 272.667V306L459 480.333C441.044 490.558 420.659 495.741 400 495.333Z" stroke="#047247" stroke-width="63.6667" stroke-miterlimit="10"/>
									<path d="M400 463.667V527.333" stroke="#047247" stroke-width="63.6667" stroke-miterlimit="10" stroke-linecap="square"/>
									<path d="M527.333 209H272.667L304.667 82H495.333L527.333 209Z" stroke="#047247" stroke-width="63.6667" stroke-miterlimit="10" stroke-linecap="square"/>
									<path d="M686.333 209H113.667C78.5045 209 50 237.505 50 272.667V654.333C50 689.495 78.5045 718 113.667 718H686.333C721.495 718 750 689.495 750 654.333V272.667C750 237.505 721.495 209 686.333 209Z" stroke="#047247" stroke-width="63.6667" stroke-miterlimit="10"/>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2">Office</p>
							</div>
						</a>
					</div>
				</li>
				<li>
					<div class="wizard-card">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="37" height="30" viewBox="0 0 800 800" fill="none">
									<path d="M175 100V650H625V100H175ZM150 50H650C656.63 50 662.989 52.6339 667.678 57.3223C672.366 62.0107 675 68.3696 675 75V675C675 681.63 672.366 687.989 667.678 692.678C662.989 697.366 656.63 700 650 700H150C143.37 700 137.011 697.366 132.322 692.678C127.634 687.989 125 681.63 125 675V75C125 68.3696 127.634 62.0107 132.322 57.3223C137.011 52.6339 143.37 50 150 50Z" fill="#047247"/>
									<path d="M50 650H750V700H50V650ZM250 150H350V225H250V150Z" fill="#047247"/>
									<path d="M300 650H500V600C500 573.478 489.464 548.043 470.711 529.289C451.957 510.536 426.522 500 400 500C373.478 500 348.043 510.536 329.289 529.289C310.536 548.043 300 573.478 300 600V650ZM400 450C439.782 450 477.936 465.804 506.066 493.934C534.196 522.064 550 560.218 550 600V700H250V600C250 560.218 265.804 522.064 293.934 493.934C322.064 465.804 360.218 450 400 450ZM250 300H350V375H250V300ZM450 150H550V225H450V150ZM450 300H550V375H450V300Z" fill="#047247"/>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2">School</p>
							</div>
						</a>
					</div>
				</li>
				<li>
					<div class="wizard-card">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="37" height="30" viewBox="0 0 800 800" fill="none">
									<path fill-rule="evenodd" clip-rule="evenodd" d="M385.093 36.8525C394.476 32.1605 405.523 32.1605 414.906 36.8525L748.24 203.519C762.066 210.433 769.326 225.946 765.773 240.992C762.223 256.038 748.793 266.667 733.333 266.667H66.6658C51.2064 266.667 37.7758 256.038 34.2241 240.992C30.6722 225.946 37.9314 210.433 51.7584 203.519L385.093 36.8525ZM207.868 200H592.13L400 103.935L207.868 200ZM199.999 300C218.408 300 233.332 314.924 233.332 333.334V500C233.332 518.41 218.408 533.334 199.999 533.334C181.589 533.334 166.666 518.41 166.666 500V333.334C166.666 314.924 181.589 300 199.999 300ZM333.332 300C351.743 300 366.666 314.924 366.666 333.334V500C366.666 518.41 351.743 533.334 333.332 533.334C314.923 533.334 299.999 518.41 299.999 500V333.334C299.999 314.924 314.923 300 333.332 300ZM466.666 300C485.076 300 500 314.924 500 333.334V500C500 518.41 485.076 533.334 466.666 533.334C448.256 533.334 433.333 518.41 433.333 500V333.334C433.333 314.924 448.256 300 466.666 300ZM600 300C618.41 300 633.333 314.924 633.333 333.334V500C633.333 518.41 618.41 533.334 600 533.334C581.59 533.334 566.666 518.41 566.666 500V333.334C566.666 314.924 581.59 300 600 300ZM99.9991 600C99.9991 581.59 114.923 566.667 133.332 566.667H666.666C685.076 566.667 700 581.59 700 600C700 618.41 685.076 633.333 666.666 633.333H133.332C114.923 633.333 99.9991 618.41 99.9991 600ZM33.3323 700C33.3323 681.59 48.2561 666.667 66.6658 666.667H733.333C751.743 666.667 766.666 681.59 766.666 700C766.666 718.41 751.743 733.333 733.333 733.333H66.6658C48.2561 733.333 33.3323 718.41 33.3323 700Z" fill="#047247"/>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2">Institution</p>
							</div>
						</a>
					</div>
				</li>
				<li>
					<div class="wizard-card">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="37" height="30" viewBox="0 0 800 800" fill="none">
									<path d="M700 333.333L400 166.667L100 333.333L200 388.89M700 333.333L600 388.89M700 333.333C720.43 343.546 733.333 364.426 733.333 387.266V566.66M200 388.89L400 500L600 388.89M200 388.89V588.89L400 700L600 588.89V388.89" stroke="#047247" stroke-width="66.6667" stroke-linecap="round" stroke-linejoin="round"/>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2">Basic School</p>
							</div>
						</a>
					</div>
				</li>
			</ul>
			<input type="hidden" id="premisesTypeVal" name="premisesTypeVal">
		</div>
	</div>
	<div class="row mt-3 hide" id="certificatePurposeBox">
		<div class="col-md-12"> 
        	<p class="common-section-small-heading mb-3">Purpose of Certificate</p> 
        </div>
        <div class="col-md-12">
        	<div class="row">
        		<div class="col-lg-4">
					<div class="application-type-card wizard-card">
						<a href="javascript:;" class="d-block">
							<div class="application-type-card-icon text-center mb-3">
								<svg xmlns="http://www.w3.org/2000/svg" width="55" height="55" viewBox="0 0 800 800" fill="none">
									<g clip-path="url(#clip0_184_488)">
									<path d="M700 150C700 136.739 694.732 124.021 685.355 114.645C675.979 105.268 663.261 100 650 100H550V50H500V100H300V50H250V100H150C136.739 100 124.021 105.268 114.645 114.645C105.268 124.021 100 136.739 100 150V650C100 663.261 105.268 675.979 114.645 685.355C124.021 694.732 136.739 700 150 700H250V650H150V150H250V200H300V150H500V200H550V150H650V300H700V150Z" fill="#047247"/>
									<path d="M525 375L588.725 498.45L725 518.225L625 614.325L650 750L525 685.95L400 750L425 614.325L325 518.225L465 498.45L525 375Z" fill="#047247"/>
									</g>
									<defs>
									<clipPath id="clip0_184_488">
									<rect width="800" height="800" fill="white"/>
									</clipPath>
									</defs>
								</svg>
							</div>
							<div class="application-type-card-content">
								<p class="application-type-card-title wizard-title f2">Event Hosting</p>                  
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="application-type-card wizard-card">
						<a href="javascript:;" class="d-block">
							<div class="application-type-card-icon text-center mb-3">
							 	<svg xmlns="http://www.w3.org/2000/svg" width="55" height="55" viewBox="0 0 800 800" fill="none">
								 	<path d="M739.113 498.621V371.545C739.113 359.823 729.61 350.322 717.89 350.322H690.391V256.093C690.391 244.372 680.89 234.871 669.168 234.871C657.446 234.871 647.945 244.372 647.945 256.093V350.322H561.043V256.093C561.043 244.372 551.54 234.871 539.82 234.871H414.379C405.205 234.871 397.07 240.765 394.212 249.482L388.647 266.458L86.1675 128.214C81.0469 125.874 75.2064 125.664 69.933 127.63C64.6579 129.596 60.3811 133.576 58.0415 138.696L25.2737 210.412C20.8967 219.991 24.2074 231.332 33.0514 237.052L56.0279 251.913V408.362C23.7219 417.608 0 447.388 0 482.624C0 525.221 34.6541 559.875 77.2506 559.875C119.847 559.875 154.501 525.219 154.501 482.624C154.501 447.388 130.779 417.608 98.4732 408.362V279.367L347.514 440.442V498.623C312.138 510.743 286.627 544.307 286.627 583.739C286.627 633.348 326.985 673.706 376.594 673.706H710.031C759.64 673.706 799.998 633.348 799.998 583.739C800 544.306 774.489 510.742 739.113 498.621ZM112.056 482.624C112.056 501.816 96.4427 517.429 77.2506 517.429C58.0585 517.429 42.4454 501.816 42.4454 482.624C42.4454 463.432 58.0585 447.819 77.2506 447.819C96.4427 447.819 112.056 463.432 112.056 482.624ZM539.818 392.767H696.666V493.77H389.959V416.537H461.126C472.846 416.537 482.349 407.036 482.349 395.314V277.316H518.596V371.545C518.596 383.266 528.098 392.767 539.818 392.767ZM439.904 277.316V374.091H398.027L429.754 277.316H439.904ZM87.8262 175.641L375.339 307.046L348.57 388.703C348.398 389.224 348.251 389.752 348.12 390.283L71.5018 211.371L87.8262 175.641ZM710.033 631.261H376.596C350.392 631.261 329.074 609.943 329.074 583.739C329.074 557.535 350.392 536.217 376.596 536.217H710.033C736.237 536.217 757.555 557.535 757.555 583.739C757.555 609.943 736.237 631.261 710.033 631.261Z" fill="#047247"/>
								</svg>
							</div>
							<div class="application-type-card-content">
								<p class="application-type-card-title wizard-title f2">Demolition</p>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="application-type-card wizard-card">
						<a href="javascript:;" class="d-block">
							<div class="application-type-card-icon text-center mb-3">
								<svg xmlns="http://www.w3.org/2000/svg" width="55" height="55" viewBox="0 0 800 800" fill="none">
									<path d="M500 700H433.333M433.333 700H300M433.333 700V600C433.333 563.18 403.486 533.333 366.666 533.333C329.847 533.333 300 563.18 300 600V700M300 700H166.667V153.333C166.667 134.665 166.667 125.331 170.3 118.2C173.496 111.928 178.595 106.829 184.867 103.633C191.997 100 201.331 100 220 100H513.333C532.003 100 541.337 100 548.467 103.633C554.74 106.829 559.837 111.928 563.033 118.2C566.667 125.331 566.666 134.665 566.666 153.333V383.333M266.667 233.333H300M266.667 333.333H300M433.333 333.333H466.666M433.333 433.333H466.666M266.667 433.333H300M433.333 233.333H466.666M633.333 500V600M633.333 700H633.666" stroke="#047247" stroke-width="66.6667" stroke-linecap="round" stroke-linejoin="round"/>
								</svg>
							</div>
							<div class="application-type-card-content">
								<p class="application-type-card-title wizard-title f2">Operation of Premises</p>
							</div>
						</a>
					</div>
				</div>
        	</div>
        	<div class="row mt-3">
        		<div class="col-lg-4">
					<div class="application-type-card wizard-card">
						<a href="javascript:;" class="d-block">
							<div class="application-type-card-icon text-center mb-3">
								<svg xmlns="http://www.w3.org/2000/svg" width="55" height="55" viewBox="0 0 800 800" fill="none">
									<path d="M590.5 48C588.75 48.25 587.062 48.75 585.5 49.5L30.5 296C25.75 297.938 22.25 302 21 307L0.5 396.5C-0.75 402.375 1.375 408.438 6 412.188C10.625 416 17 416.875 22.5 414.5L96 382V448H48C21.6875 448 0 469.688 0 496V624C0 650.312 21.6875 672 48 672H113.5C121.125 717.375 160.562 752 208 752C255.438 752 294.875 717.375 302.5 672H529.5C537.125 717.375 576.562 752 624 752C671.438 752 710.875 717.375 718.5 672H752C778.312 672 800 650.312 800 624V481.5C800 471.375 798.125 463.375 796.5 457L796 456V455.5L751 326V325.5C739.188 293.938 709.125 272 675 272H400C373.688 272 352 293.688 352 320V448H224V325L678.5 123.5C684 121.062 687.688 115.75 688 109.688C688.312 103.688 685.25 98 680 95L600 50C597.125 48.375 593.812 47.6875 590.5 48ZM593 83L636 107L572.5 135L593 83ZM573 90L551.5 144.5L542.5 148.5L489 127.5L573 90ZM469 136L522 157.5L437.5 195L459 140.5L469 136ZM438.5 149.5L417.5 204L408.5 208L354 187L438.5 149.5ZM333.5 196.5L388 217.5L303 255L325 200L333.5 196.5ZM305 209L283 264L274.5 267.5L220 247L305 209ZM199 256L254 277L169 315L189.5 260.5L199 256ZM168.5 269.5L148.5 324L139.5 328L85 306.5L168.5 269.5ZM400 304H675C695 304 713.438 316.812 721 336H640C631.625 336 623.062 338.938 617 345C610.938 351.062 608 359.625 608 368V448C608 456.375 610.938 464.938 617 471C623.062 477.062 631.625 480 640 480H768C768 480.5 768 480.938 768 481.5V624C768 632.875 760.875 640 752 640H718.5C710.875 594.625 671.438 560 624 560C576.562 560 537.125 594.625 529.5 640H302.5C294.875 594.625 255.438 560 208 560C160.562 560 121.125 594.625 113.5 640H48C39.125 640 32 632.875 32 624V496C32 487.125 39.125 480 48 480H384V320C384 311.125 391.125 304 400 304ZM64.5 315.5L119 337L110.5 340.5C110.312 340.5 110.188 340.5 110 340.5C106.188 340.938 102.625 342.688 100 345.5L39 372.5L50.5 322L64.5 315.5ZM448 336C439.625 336 431.062 338.938 425 345C418.938 351.062 416 359.625 416 368V448C416 456.375 418.938 464.938 425 471C431.062 477.062 439.625 480 448 480H544C552.375 480 560.938 477.062 567 471C573.062 464.938 576 456.375 576 448V368C576 359.625 573.062 351.062 567 345C560.938 338.938 552.375 336 544 336H448ZM192 339.5V448H128V367.5L192 339.5ZM448 368H544V448H448V368ZM640 368H731.5L759.5 448H640V368ZM208 592C243.562 592 272 620.438 272 656C272 691.562 243.562 720 208 720C172.438 720 144 691.562 144 656C144 620.438 172.438 592 208 592ZM624 592C659.562 592 688 620.438 688 656C688 691.562 659.562 720 624 720C588.438 720 560 691.562 560 656C560 620.438 588.438 592 624 592Z" fill="#047247"/>
								</svg>
							</div>
							<div class="application-type-card-content">
								<p class="application-type-card-title wizard-title f2">Fire-works Displays</p>                  
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="application-type-card wizard-card">
						<a href="javascript:;" class="d-block">
							<div class="application-type-card-icon text-center mb-3">
								<svg xmlns="http://www.w3.org/2000/svg" width="55" height="55" viewBox="0 0 800 800" fill="none">
									<path d="M266.666 411.113L348.716 500.003L533.333 300.003M66.6665 400.003L233.333 111.328H566.666L733.333 400.003L566.666 688.68H233.333L66.6665 400.003Z" stroke="#047247" stroke-width="66.6667" stroke-linecap="round" stroke-linejoin="round"/>
								</svg>
							</div>
							<div class="application-type-card-content">
								<p class="application-type-card-title wizard-title f2">General Building Certification</p>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="application-type-card wizard-card">
						<a href="javascript:;" class="d-block">
							<div class="application-type-card-icon text-center mb-3">
								<svg xmlns="http://www.w3.org/2000/svg" width="55" height="55" viewBox="0 0 512 512" fill="none">
									<path fill-rule="evenodd" clip-rule="evenodd" d="M255.999 58.667C147.015 58.667 58.666 147.016 58.666 256C58.666 364.984 147.015 453.334 255.999 453.334C364.983 453.334 453.333 364.984 453.333 256C453.333 147.016 364.983 58.667 255.999 58.667ZM26.666 256C26.666 129.343 129.342 26.667 255.999 26.667C382.657 26.667 485.333 129.343 485.333 256C485.333 382.658 382.657 485.334 255.999 485.334C129.342 485.334 26.666 382.658 26.666 256Z" fill="#047247"/>
									<path fill-rule="evenodd" clip-rule="evenodd" d="M256 165.333C242.746 165.333 232 176.078 232 189.333C232 198.169 224.836 205.333 216 205.333C207.164 205.333 200 198.169 200 189.333C200 158.405 225.073 133.333 256 133.333C286.927 133.333 312 158.405 312 189.333C312 209.884 300.919 227.831 284.486 237.555C280.288 240.038 276.823 242.75 274.566 245.41C272.373 247.991 272 249.676 272 250.666V277.333C272 286.169 264.836 293.333 256 293.333C247.164 293.333 240 286.169 240 277.333V250.666C240 239.874 244.725 231.116 250.167 224.704C255.543 218.368 262.249 213.529 268.192 210.013C275.294 205.811 280 198.113 280 189.333C280 176.078 269.254 165.333 256 165.333Z" fill="#047247"/>
									<path d="M277.333 341.333C277.333 353.116 267.782 362.667 255.999 362.667C244.217 362.667 234.666 353.116 234.666 341.333C234.666 329.551 244.217 320 255.999 320C267.782 320 277.333 329.551 277.333 341.333Z" fill="#047247"/>
								</svg>
							</div>
							<div class="application-type-card-content">
								<p class="application-type-card-title wizard-title f2">Other</p>
							</div>
						</a>
					</div>
				</div>
        	</div>
        </div>
        <div class="col-md-12 pt-3"> 
         	<p class="common-section-small-heading mb-0">Please Select Parish</p> 
        </div>
		<div class="col-lg-6">
			<div class="form-group">
				<div class="select-wrapper position-relative">
					<select class="form-select form-control" id="fireBrigadeParish">
						<option value="" selected="" disabled="">Choose Parish</option>
						<option value="Kingston" <%=applicationData!=null?applicationData.getParish().equals("Kingston")?"selected":"":StringPool.BLANK%>>Kingston</option>
						<option value="St. Andrew" <%=applicationData!=null?applicationData.getParish().equals("St. Andrew")?"selected":"":StringPool.BLANK%>>St. Andrew</option>
						<option value="Manchester" <%=applicationData!=null?applicationData.getParish().equals("Manchester")?"selected":"":StringPool.BLANK%>>Manchester</option>
						<option value="St. Catherine" <%=applicationData!=null?applicationData.getParish().equals("St. Catherine")?"selected":"":StringPool.BLANK%>>St. Catherine</option>
						<option value="St. Thomas" <%=applicationData!=null?applicationData.getParish().equals("St. Thomas")?"selected":"":StringPool.BLANK%>>St. Thomas</option>
						<option value="St. Mary" <%=applicationData!=null?applicationData.getParish().equals("St. Mary")?"selected":"":StringPool.BLANK%>>St. Mary</option>
						<option value="Portland" <%=applicationData!=null?applicationData.getParish().equals("Portland")?"selected":"":StringPool.BLANK%>>Portland</option>
						<option value="St. Ann" <%=applicationData!=null?applicationData.getParish().equals("St. Ann")?"selected":"":StringPool.BLANK%>>St. Ann</option>
						<option value="Trelawny" <%=applicationData!=null?applicationData.getParish().equals("Trelawny")?"selected":"":StringPool.BLANK%>>Trelawny</option>
						<option value="St. James" <%=applicationData!=null?applicationData.getParish().equals("St. James")?"selected":"":StringPool.BLANK%>>St. James</option>
						<option value="Hanover" <%=applicationData!=null?applicationData.getParish().equals("Hanover")?"selected":"":StringPool.BLANK%>>Hanover</option>
						<option value="Westmoreland" <%=applicationData!=null?applicationData.getParish().equals("Westmoreland")?"selected":"":StringPool.BLANK%>>Westmoreland</option>
						<option value="St. Elizabeth" <%=applicationData!=null?applicationData.getParish().equals("St. Elizabeth")?"selected":"":StringPool.BLANK%>>St. Elizabeth</option>
						<option value="Clarendon" <%=applicationData!=null?applicationData.getParish().equals("Clarendon")?"selected":"":StringPool.BLANK%>>Clarendon</option>
					</select>
				</div>
			</div>
		</div>
		<input type="hidden" id="certificatePurposeVal" name="certificatePurposeVal">
	</div>

	<section class="hide" id="fireRenewSection"> 
		<hr> 
        	<div class="row"> 
          		<div class="col-md-12"> 
           			<div class="tab-plus-wizard wizard-section"> 
            			<div class="tab-form"> 
             				<div class="row"> 
              					<div class="col-md-12"> 
              						<div class="form-group"> 
						                <p class="tab-form-main-heading">Please Enter Transaction Number (The Transaction Number of the Previously Submitted Application.)</p> 
						                <input type="text" class="form-control" id="renew-licence-number" placeholder="Transaction Number" value="" oninput="this.value = this.value.replace(/[^0-9\/]/g, '').replace(/(\..*)\./g, '$1');"> 
						                <p class="tab-form-sub-heading hide" id="renewLicenseNumbervalidation" style="color: red;">Please Enter Valid Transaction Number</p> 
									</div> 
								</div> 
								<div class="col-md-12">
									<p class="text-center mb-0">OR</p>
								</div> 
              					<div class="col-md-12"> 
              						<div class="form-group"> 
						                <p class="tab-form-main-heading">Please Enter Licence Number</p> 
						                <input type="text" class="form-control" id="renew-permit-number" placeholder="Licence Number" value="" oninput="this.value = this.value.replace(/[^0-9\/]/g, '').replace(/(\..*)\./g, '$1');"> 
									</div> 
								</div> 
								<div class="col-md-2"> 
 									<button class="btn common-green-bg w-100" id="fire-renew-btn" onclick="recertificationAppFB();" type="button">Submit</button> 
      							</div> 
     						</div> 
    					</div> 
   					</div> 
  				</div> 
 			</div> 
	</section>
<%@include file="/fire-brigade-wizard-buttons.jsp" %>
</fieldset>