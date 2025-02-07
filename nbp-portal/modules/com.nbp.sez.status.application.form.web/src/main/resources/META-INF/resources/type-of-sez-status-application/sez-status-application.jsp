<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<fieldset class="wizard-fieldset" id="SezStatusApplicationFieldset" name="TYPE OF TRANSACTION">
	<div class="row hide" id="typeOfSezStatus">
		<div class="col-md-12">
			<div class="row wizard-cards-list" id="level-1">
				<div class="col-md-12 pt-3">
		            <p class="common-section-small-heading">What type of SEZ Status are you applying for</p>
		        </div>
				<div class="col-lg-3">
					<div class="wizard-card" id="sezDeveloperLevel1">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
									<path d="M17.3645 24.3813C16.5835 22.0001 16.0147 19.5425 16.2736 18.0399C16.2736 18.0229 16.2779 18.0101 16.2822 17.9932C16.3161 17.8065 16.1166 17.6494 15.9341 17.7258C15.5393 17.8956 15.1743 18.129 14.8475 18.4092C13.625 19.4533 12.9161 21.1428 12.8865 22.7261C12.8779 22.968 13.1157 23.1378 13.4 23.1165L15.6454 22.9637L14.249 24.3814H17.3645V24.3813Z" fill="#047247"/>
									<path d="M13.4718 23.9616C12.6076 23.82 12.0144 23.5768 12.0371 22.701C12.0626 21.3087 12.5465 19.9122 13.3402 18.8087C11.2095 19.3646 9.38422 19.7213 9.23148 19.7213C7.2832 20.4726 6.42578 22.0643 6.42578 23.5923V24.3818H13.0516C13.2256 24.1993 13.3997 24.0635 13.4718 23.9616ZM21.7361 24.3818C22.3813 22.4718 22.8779 20.5363 22.9373 19.1354C21.3201 20.7867 18.6799 20.7909 17.0627 19.1354C17.1179 20.5363 17.6187 22.476 18.2597 24.3818H21.7361ZM27.963 22.7095C27.9862 23.5786 27.3827 23.822 26.5283 23.9616C26.6005 24.0677 26.7702 24.2036 26.9442 24.3818H33.5743V23.5882C33.5743 21.8266 32.4495 20.2816 30.7771 19.7213C30.7431 19.7128 28.502 19.1568 26.5622 18.6729C27.4196 19.7976 27.9375 21.2451 27.963 22.7095Z" fill="#047247"/>
									<path d="M27.1141 22.7265C27.0844 21.105 26.3416 19.3647 25.0597 18.329C24.7541 18.0871 24.4273 17.8791 24.0665 17.7262C23.884 17.6498 23.6844 17.8069 23.7184 17.9936C23.7227 18.0106 23.7269 18.0276 23.7312 18.0488C23.9816 19.5514 23.4128 22.0048 22.6318 24.3818H25.7516L24.3551 22.9641L26.6005 23.1169C26.8848 23.1382 27.1226 22.9684 27.1141 22.7265ZM14.5118 12.0019C14.5995 12.2452 14.1272 13.9474 17.1137 17.1422C18.6721 18.8066 21.339 18.8041 22.8949 17.1422C25.8899 13.9384 25.4116 12.2493 25.5011 12.0019C26.4512 12.0019 26.9486 10.8607 26.2821 10.1639C26.8424 8.92453 27.1608 7.58328 27.1608 6.29703C27.1608 2.23078 23.9561 0.316406 20.0001 0.316406C16.0526 0.316406 12.8479 2.2307 12.8479 6.29703C12.8479 7.58328 13.1662 8.92453 13.7265 10.1639C13.0598 10.8611 13.5587 12.0019 14.5118 12.0019ZM35.4019 25.2309H4.59796C3.78546 25.2309 3.21812 26.0357 3.49125 26.8009L7.81039 38.9036C7.97734 39.3714 8.42039 39.6837 8.91711 39.6837H31.0827C31.5794 39.6837 32.0225 39.3713 32.1894 38.9036L36.5086 26.8009C36.7817 26.0358 36.2144 25.2309 35.4019 25.2309ZM20.0001 34.6101C18.5366 34.6101 17.3494 33.9025 17.3494 33.0258C17.3494 32.1491 18.5366 31.4382 20.0001 31.4382C21.4635 31.4382 22.6508 32.1491 22.6508 33.0258C22.6508 33.9025 21.4635 34.6101 20.0001 34.6101Z" fill="#047247"/>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2">Application to become a <span>SEZ Developer</span></p>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="wizard-card" id="sezOccupantLevel1">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
									<path d="M20 20C24.6754 20 28.5 16.1749 28.5 11.5C28.5 6.82509 24.6754 3 20 3C15.3246 3 11.5 6.82509 11.5 11.5C11.5 16.1749 15.3246 20 20 20ZM20 24.25C14.3689 24.25 3 27.1189 3 32.75V37H37V32.75C37 27.1189 25.6311 24.25 20 24.25Z" fill="#047247"/>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2">Application to become a <span>SEZ Occupant</span></p>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="wizard-card" id="sezZoneLevel1">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
									<path d="M20.0536 25.1024C22.7891 25.1024 25.0267 22.8645 25.0267 20.1293C25.0267 17.3942 22.7891 15.1562 20.0536 15.1562C17.3181 15.1562 15.0805 17.3942 15.0805 20.1293C15.0805 22.8645 17.3181 25.1024 20.0536 25.1024ZM20.0536 27.589C16.759 27.589 10.1074 29.2675 10.1074 32.5621V35.0486H29.9998V32.5621C29.9998 29.2675 23.3482 27.589 20.0536 27.589Z" fill="#047247"/>
									<path d="M21.6487 18.4072H17.8901V22.1658H21.6487V18.4072Z" fill="#047247"/>
									<path d="M11.7826 12.3186C10.7342 13.3658 9.90255 14.6094 9.33511 15.9783C8.76766 17.3471 8.47559 18.8144 8.47559 20.2962C8.47559 21.7781 8.76766 23.2453 9.33511 24.6142C9.90255 25.9831 10.7342 27.2267 11.7826 28.2739L14.4512 25.6241C13.7495 24.9256 13.1927 24.0953 12.8127 23.181C12.4327 22.2667 12.2371 21.2864 12.2371 20.2962C12.2371 19.3061 12.4327 18.3258 12.8127 17.4114C13.1927 16.4971 13.7495 15.6669 14.4512 14.9684L11.7826 12.3186ZM27.7567 28.2551C28.8051 27.2079 29.6368 25.9643 30.2042 24.5954C30.7717 23.2265 31.0637 21.7593 31.0637 20.2774C31.0637 18.7956 30.7717 17.3283 30.2042 15.9595C29.6368 14.5906 28.8051 13.347 27.7567 12.2998L25.0881 14.9496C25.7898 15.6481 26.3467 16.4783 26.7266 17.3927C27.1066 18.307 27.3022 19.2873 27.3022 20.2774C27.3022 21.2676 27.1066 22.2479 26.7266 23.1622C26.3467 24.0765 25.7898 24.9068 25.0881 25.6053L27.7567 28.2551Z" fill="#047247"/>
									<path d="M9.15216 30.9047C6.34053 28.0863 4.76154 24.2677 4.76154 20.2867C4.76154 16.3056 6.34053 12.4871 9.15216 9.66861L6.50234 7C2.97919 10.5242 1 15.3034 1 20.2867C1 25.2699 2.97919 30.0491 6.50234 33.5733L9.15216 30.9047ZM30.3883 9.66861C33.1999 12.4871 34.7789 16.3056 34.7789 20.2867C34.7789 24.2677 33.1999 28.0863 30.3883 30.9047L33.0381 33.5733C36.5612 30.0491 38.5404 25.2699 38.5404 20.2867C38.5404 15.3034 36.5612 10.5242 33.0381 7L30.3883 9.66861Z" fill="#047247"/>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2">Application to become a <span>SEZ Zone User</span></p>
							</div>
						</a>
					</div>
				</div>
				<div class="col-lg-3">
					<div class="wizard-card" id="msmeOccupantLevel1">
						<a href="javascript:;">
							<div class="wizard-card-icon">
								<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 500 500" fill="none">
									<path d="M398.317 301.575C370.378 273.636 335.943 254.565 298.421 245.739L273.98 270.18L284.69 399.866C285.053 404.266 283.855 408.652 281.305 412.255L256.866 446.788C255.289 449.017 252.729 450.341 250 450.341C247.271 450.341 244.711 449.017 243.133 446.788L218.695 412.255C216.145 408.652 214.946 404.265 215.309 399.866L226.02 270.18L201.579 245.739C164.057 254.565 129.621 273.636 101.683 301.575C62.067 341.192 40.249 393.865 40.249 449.891C40.249 457.683 46.5662 464 54.358 464H445.643C453.435 464 459.752 457.683 459.752 449.891C459.752 393.865 437.934 341.192 398.317 301.575Z" fill="#047247"></path>
									<path d="M250.002 222.481C301.497 222.481 343.243 180.736 343.243 129.241C343.243 77.7453 301.497 36.0001 250.002 36.0001C198.507 36.0001 156.762 77.7453 156.762 129.241C156.762 180.736 198.507 222.481 250.002 222.481Z" fill="#047247"></path>
								</svg>
							</div>
							<div class="wizard-card-content-box">
								<p class="wizard-title f2 disabled-individual-rd">Application to become a <span>MSME Occupant</span></p>
							</div>
						</a>
					</div>
				</div>
			</div>
			<input type="hidden" id="sez-submit-application-type-option-value" name="sez-submit-application-type-option-value">
		</div>
	</div>
	   
     <div class="row hide" id="sezDeveloperLevel2">
	         <div class="col-md-12 cannabis-licence-process-content pt-4">
                   <a class="bordered-link f2" href="javascript:void(0)" id="download_kit" target="_self" onclick='downloadEntries();'>
                   		Download Developer Application Kit
                       <span class="ml-2"> 
		                  <svg width="15" height="15" viewBox="0 0 15 15" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		                   <path d="M5 0V2H11.59L0 13.59L1.41 15L13 3.41V10H15V0H5Z" fill="#047247"></path> 
		                  </svg> 
		               </span> 
		             </a>
             </div>
	        <div class="col-md-12 pt-3">
	            <p class="common-section-small-heading">Please select the type of transaction</p>
	        </div>
			<div class="col-md-12" id="sezDeveloperTypeOfTransactionLevel2">
				<div class="row wizard-cards-list">
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M5 6.25V33.75C5 34.7446 5.39509 35.6984 6.09835 36.4017C6.80161 37.1049 7.75544 37.5 8.75 37.5H23C22.886 37.4372 22.7754 37.3683 22.6688 37.2937C21.4642 36.496 20.4759 35.4124 19.7921 34.1397C19.1083 32.867 18.7503 31.4448 18.75 30C18.7489 29.3693 18.8181 28.7404 18.9562 28.125H9.375V26.875H19.3313C19.3938 26.7 19.4688 26.5312 19.5438 26.3562C20.1263 25.0927 21.0003 23.9853 22.0937 23.125H9.375V21.875H24.25C24.5974 21.7387 24.9521 21.6218 25.3125 21.525C26.0273 21.3421 26.7622 21.2497 27.5 21.25C27.9184 21.2501 28.3362 21.2815 28.75 21.3438L28.9563 21.375C29.3085 21.434 29.657 21.5133 30 21.6125V11.25H21.875C21.7092 11.25 21.5503 11.1842 21.4331 11.0669C21.3158 10.9497 21.25 10.7908 21.25 10.625V2.5H8.75C7.75544 2.5 6.80161 2.89509 6.09835 3.59835C5.39509 4.30161 5 5.25544 5 6.25ZM9.375 6.875H18.125V8.125H9.375V6.875ZM9.375 11.875H18.125V13.125H9.375V11.875ZM9.375 16.875H25.625V18.125H9.375V16.875Z" fill="#047247"/>
										<path d="M22.5 4.63105V9.9998H27.8688H29.6375L22.5 2.8623V4.63105Z" fill="#047247"/>
										<path d="M28.7502 22.6067C27.7109 22.4303 26.646 22.475 25.6252 22.7379C25.2407 22.8379 24.8646 22.9675 24.5002 23.1254C22.8117 23.8667 21.4532 25.2007 20.6814 26.8754C20.4983 27.2787 20.3499 27.6969 20.2377 28.1254C19.9674 29.171 19.9261 30.2626 20.1167 31.3256C20.3072 32.3885 20.7251 33.3978 21.3416 34.2844C21.9582 35.171 22.759 35.914 23.6892 36.4626C24.6194 37.0112 25.6572 37.3524 26.7314 37.4629C26.9814 37.4629 27.2377 37.5004 27.4939 37.5004C29.262 37.4989 30.9726 36.8728 32.324 35.7326C33.6753 34.5924 34.5803 33.0115 34.8793 31.2689C35.1784 29.5263 34.8521 27.7341 33.9583 26.2086C33.0644 24.6832 31.6603 23.5226 29.9939 22.9317C29.5903 22.785 29.1739 22.6762 28.7502 22.6067ZM31.8752 30.6254H28.1252V34.3754H26.8752V30.6254H23.1252V29.3754H26.8752V25.6254H28.1252V29.3754H31.8752V30.6254Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">New Application for SEZ Developer Status</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path fill-rule="evenodd" clip-rule="evenodd" d="M36.6668 19.9997C36.6668 29.2043 29.2048 36.6663 20.0002 36.6663C10.7954 36.6663 3.3335 29.2043 3.3335 19.9997C3.3335 10.7949 10.7954 3.33301 20.0002 3.33301C29.2048 3.33301 36.6668 10.7949 36.6668 19.9997ZM13.6365 20.1512C13.6365 16.6406 16.4896 13.7876 20.0002 13.7876C21.0713 13.7876 22.0895 14.0527 22.9698 14.53L24.5183 12.9815C23.2138 12.1542 21.6653 11.6663 20.0002 11.6663C15.3123 11.6663 11.5153 15.4633 11.5153 20.1512H8.3335L12.5759 24.3937L16.8183 20.1512H13.6365ZM27.4243 15.9088L23.182 20.1512H26.3638C26.3638 23.6618 23.5108 26.5148 20.0002 26.5148C18.929 26.5148 17.9108 26.2497 17.0305 25.7723L15.482 27.3208C16.7865 28.1482 18.335 28.636 20.0002 28.636C24.688 28.636 28.485 24.839 28.485 20.1512H31.6668L27.4243 15.9088Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Application for Renewal of SEZ Developer Status</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M31.25 20.1H33.75V33.85H6.25V6.35001H20V20.1H31.25ZM25 6.35001V8.85001H29.4875L22.225 16.1125L23.9875 17.875L31.25 10.625V15.1H33.75V6.35001H25Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Application to Expand SEZ Developer Status</p>
								</div>
							</a>
						</div>
					</div>
				</div>
				<input type="hidden" id="sez-developer-type-option-value" name="sez-developer-type-option-value">
			</div>
     </div>
     <div class="row hide" id="sezOccupantLevel2">
	        <div class="col-md-12 cannabis-licence-process-content pt-4">
                   <a class="bordered-link f2" href="javascript:void(0)" id="download_kit_Occupant" target="_self" onclick='downloadEntries();' >
                   		Download Occupant Application Kit
                       <span class="ml-2"> 
		                  <svg width="15" height="15" viewBox="0 0 15 15" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		                   <path d="M5 0V2H11.59L0 13.59L1.41 15L13 3.41V10H15V0H5Z" fill="#047247"></path> 
		                  </svg> 
		               </span> 
		             </a>
             </div>
	         <div class="col-md-12 pt-3">
	            <p class="common-section-small-heading">Please select the type of transaction</p>
	        </div>
			<div class="col-md-12" id="occupant-type-of-transaction-box">
				<div class="row wizard-cards-list">
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M5 6.25V33.75C5 34.7446 5.39509 35.6984 6.09835 36.4017C6.80161 37.1049 7.75544 37.5 8.75 37.5H23C22.886 37.4372 22.7754 37.3683 22.6688 37.2937C21.4642 36.496 20.4759 35.4124 19.7921 34.1397C19.1083 32.867 18.7503 31.4448 18.75 30C18.7489 29.3693 18.8181 28.7404 18.9562 28.125H9.375V26.875H19.3313C19.3938 26.7 19.4688 26.5312 19.5438 26.3562C20.1263 25.0927 21.0003 23.9853 22.0937 23.125H9.375V21.875H24.25C24.5974 21.7387 24.9521 21.6218 25.3125 21.525C26.0273 21.3421 26.7622 21.2497 27.5 21.25C27.9184 21.2501 28.3362 21.2815 28.75 21.3438L28.9563 21.375C29.3085 21.434 29.657 21.5133 30 21.6125V11.25H21.875C21.7092 11.25 21.5503 11.1842 21.4331 11.0669C21.3158 10.9497 21.25 10.7908 21.25 10.625V2.5H8.75C7.75544 2.5 6.80161 2.89509 6.09835 3.59835C5.39509 4.30161 5 5.25544 5 6.25ZM9.375 6.875H18.125V8.125H9.375V6.875ZM9.375 11.875H18.125V13.125H9.375V11.875ZM9.375 16.875H25.625V18.125H9.375V16.875Z" fill="#047247"/>
										<path d="M22.5 4.63105V9.9998H27.8688H29.6375L22.5 2.8623V4.63105Z" fill="#047247"/>
										<path d="M28.7502 22.6067C27.7109 22.4303 26.646 22.475 25.6252 22.7379C25.2407 22.8379 24.8646 22.9675 24.5002 23.1254C22.8117 23.8667 21.4532 25.2007 20.6814 26.8754C20.4983 27.2787 20.3499 27.6969 20.2377 28.1254C19.9674 29.171 19.9261 30.2626 20.1167 31.3256C20.3072 32.3885 20.7251 33.3978 21.3416 34.2844C21.9582 35.171 22.759 35.914 23.6892 36.4626C24.6194 37.0112 25.6572 37.3524 26.7314 37.4629C26.9814 37.4629 27.2377 37.5004 27.4939 37.5004C29.262 37.4989 30.9726 36.8728 32.324 35.7326C33.6753 34.5924 34.5803 33.0115 34.8793 31.2689C35.1784 29.5263 34.8521 27.7341 33.9583 26.2086C33.0644 24.6832 31.6603 23.5226 29.9939 22.9317C29.5903 22.785 29.1739 22.6762 28.7502 22.6067ZM31.8752 30.6254H28.1252V34.3754H26.8752V30.6254H23.1252V29.3754H26.8752V25.6254H28.1252V29.3754H31.8752V30.6254Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">New Application for SEZ Occupant  Status</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path fill-rule="evenodd" clip-rule="evenodd" d="M36.6668 19.9997C36.6668 29.2043 29.2048 36.6663 20.0002 36.6663C10.7954 36.6663 3.3335 29.2043 3.3335 19.9997C3.3335 10.7949 10.7954 3.33301 20.0002 3.33301C29.2048 3.33301 36.6668 10.7949 36.6668 19.9997ZM13.6365 20.1512C13.6365 16.6406 16.4896 13.7876 20.0002 13.7876C21.0713 13.7876 22.0895 14.0527 22.9698 14.53L24.5183 12.9815C23.2138 12.1542 21.6653 11.6663 20.0002 11.6663C15.3123 11.6663 11.5153 15.4633 11.5153 20.1512H8.3335L12.5759 24.3937L16.8183 20.1512H13.6365ZM27.4243 15.9088L23.182 20.1512H26.3638C26.3638 23.6618 23.5108 26.5148 20.0002 26.5148C18.929 26.5148 17.9108 26.2497 17.0305 25.7723L15.482 27.3208C16.7865 28.1482 18.335 28.636 20.0002 28.636C24.688 28.636 28.485 24.839 28.485 20.1512H31.6668L27.4243 15.9088Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2"> Application for Renewal of SEZ Occupant  Status</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M31.25 20.1H33.75V33.85H6.25V6.35001H20V20.1H31.25ZM25 6.35001V8.85001H29.4875L22.225 16.1125L23.9875 17.875L31.25 10.625V15.1H33.75V6.35001H25Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Application to Expand SEZ Occupant Status</p>
								</div>
							</a>
						</div>
					</div>
				</div>
				<input type="hidden" id="sez-occupant-type-option-value" name="sez-occupant-type-option-value">
			</div>
     </div>
     <div class="row hide" id="sezZoneLevel2">
	        <div class="col-md-12 cannabis-licence-process-content pt-4">
                   <a class="bordered-link f2" href="javascript:void(0)" id="download_kit_Zone_User" target="_self" onclick='downloadEntries();'>
                   		Download Zone User Application Kit
                       <span class="ml-2"> 
		                  <svg width="15" height="15" viewBox="0 0 15 15" fill="none" xmlns="http://www.w3.org/2000/svg"> 
		                   <path d="M5 0V2H11.59L0 13.59L1.41 15L13 3.41V10H15V0H5Z" fill="#047247"></path> 
		                  </svg> 
		               </span> 
		             </a>
             </div>
	         <div class="col-md-12 pt-3">
	            <p class="common-section-small-heading">Please select the type of transaction</p>
	        </div>
			<div class="col-md-12" id="sezZoneTransactionType">
				<div class="row wizard-cards-list">
					<div class="col-lg-6">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M5 6.25V33.75C5 34.7446 5.39509 35.6984 6.09835 36.4017C6.80161 37.1049 7.75544 37.5 8.75 37.5H23C22.886 37.4372 22.7754 37.3683 22.6688 37.2937C21.4642 36.496 20.4759 35.4124 19.7921 34.1397C19.1083 32.867 18.7503 31.4448 18.75 30C18.7489 29.3693 18.8181 28.7404 18.9562 28.125H9.375V26.875H19.3313C19.3938 26.7 19.4688 26.5312 19.5438 26.3562C20.1263 25.0927 21.0003 23.9853 22.0937 23.125H9.375V21.875H24.25C24.5974 21.7387 24.9521 21.6218 25.3125 21.525C26.0273 21.3421 26.7622 21.2497 27.5 21.25C27.9184 21.2501 28.3362 21.2815 28.75 21.3438L28.9563 21.375C29.3085 21.434 29.657 21.5133 30 21.6125V11.25H21.875C21.7092 11.25 21.5503 11.1842 21.4331 11.0669C21.3158 10.9497 21.25 10.7908 21.25 10.625V2.5H8.75C7.75544 2.5 6.80161 2.89509 6.09835 3.59835C5.39509 4.30161 5 5.25544 5 6.25ZM9.375 6.875H18.125V8.125H9.375V6.875ZM9.375 11.875H18.125V13.125H9.375V11.875ZM9.375 16.875H25.625V18.125H9.375V16.875Z" fill="#047247"/>
										<path d="M22.5 4.63105V9.9998H27.8688H29.6375L22.5 2.8623V4.63105Z" fill="#047247"/>
										<path d="M28.7502 22.6067C27.7109 22.4303 26.646 22.475 25.6252 22.7379C25.2407 22.8379 24.8646 22.9675 24.5002 23.1254C22.8117 23.8667 21.4532 25.2007 20.6814 26.8754C20.4983 27.2787 20.3499 27.6969 20.2377 28.1254C19.9674 29.171 19.9261 30.2626 20.1167 31.3256C20.3072 32.3885 20.7251 33.3978 21.3416 34.2844C21.9582 35.171 22.759 35.914 23.6892 36.4626C24.6194 37.0112 25.6572 37.3524 26.7314 37.4629C26.9814 37.4629 27.2377 37.5004 27.4939 37.5004C29.262 37.4989 30.9726 36.8728 32.324 35.7326C33.6753 34.5924 34.5803 33.0115 34.8793 31.2689C35.1784 29.5263 34.8521 27.7341 33.9583 26.2086C33.0644 24.6832 31.6603 23.5226 29.9939 22.9317C29.5903 22.785 29.1739 22.6762 28.7502 22.6067ZM31.8752 30.6254H28.1252V34.3754H26.8752V30.6254H23.1252V29.3754H26.8752V25.6254H28.1252V29.3754H31.8752V30.6254Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">New Application for SEZ Zone User  Status</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-6">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 500 500" fill="none">
										<path fill-rule="evenodd" clip-rule="evenodd" d="M225.515 485.084C233.001 489.228 241.443 491.339 249.999 491.205C258.39 491.254 266.653 489.146 273.994 485.084L281.34 480.921C338.645 448.615 386.341 401.668 419.552 344.883C452.763 288.097 470.297 223.51 470.36 157.726V154.298C470.438 145.628 468.212 137.092 463.91 129.564C459.608 122.036 453.385 115.785 445.876 111.45L274.484 14.9809C267.04 10.683 258.595 8.42029 249.999 8.42029C241.404 8.42029 232.959 10.683 225.515 14.9809L54.1232 111.45C46.6141 115.785 40.3905 122.036 36.0887 129.564C31.7869 137.092 29.5611 145.628 29.6387 154.298V157.726C29.6531 223.461 47.113 288.016 80.2353 344.797C113.358 401.578 160.956 448.552 218.17 480.921L225.515 485.084ZM250 403.826C334.938 403.826 403.794 334.97 403.794 250.032C403.794 165.095 334.938 96.2389 250 96.2389C165.062 96.2389 96.2068 165.095 96.2068 250.032C96.2068 334.97 165.062 403.826 250 403.826Z" fill="#047247"></path>
										<path d="M332.191 167.123C291.874 127.656 229.862 123.232 184.64 153.465L184.513 136.109C184.492 133.187 182.09 130.836 179.149 130.86L168.504 130.942C165.565 130.964 163.202 133.349 163.223 136.268L163.517 175.851C163.559 181.666 168.32 186.345 174.163 186.345C174.184 186.345 174.215 186.345 174.246 186.345L214.091 186.053C217.032 186.032 219.397 183.645 219.375 180.724L219.292 170.146C219.269 167.226 216.869 164.878 213.931 164.899L207.158 164.948C242.797 147.272 287.324 152.9 317.243 182.182C345.955 210.303 353.801 252.578 337.485 288.826C336.323 291.407 337.275 294.414 339.809 295.701L349.31 300.524C352.002 301.891 355.406 300.79 356.656 298.056C376.953 253.631 367.44 201.646 332.191 167.123ZM325.839 313.656C325.817 313.656 325.787 313.656 325.756 313.656L285.91 313.947C282.97 313.969 280.604 316.355 280.627 319.276L280.71 329.854C280.732 332.773 283.132 335.121 286.071 335.101L292.837 335.052C257.196 352.724 212.677 347.09 182.759 317.818C154.046 289.697 146.2 247.421 162.516 211.174C163.678 208.593 162.726 205.586 160.193 204.299L150.691 199.476C147.999 198.109 144.595 199.21 143.345 201.944C123.046 246.368 132.56 298.353 167.808 332.877C190.585 355.176 220.298 366.29 249.988 366.29C272.849 366.29 295.688 359.678 315.358 346.523L315.485 363.89C315.506 366.812 317.908 369.163 320.849 369.14L331.494 369.058C334.433 369.035 336.796 366.65 336.775 363.731L336.481 324.149C336.443 318.334 331.682 313.656 325.839 313.656Z" fill="#047247"></path>
										<path d="M243.378 279.496C242.417 280.453 241.056 281.25 239.855 281.25C238.653 281.25 237.292 280.413 236.291 279.456L213.867 257.135L220.995 250.04L239.895 268.854L289.868 218.75L296.875 225.965L243.378 279.496Z" fill="#047247" stroke="#047247" stroke-width="6" stroke-linejoin="round"></path>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Application for Re-authorization SEZ Zone User Status</p>
								</div>
							</a>
						</div>
					</div>
				</div>
				<input type="hidden" id="sez-zone-type-option-value" name="sez-zone-type-option-value">
			</div>
     </div>
     <div class="row pt-3 hide" id="sezDeveloperLevel3">
		<div class="col-md-6" id="developer-zoning-classification">
			<div class="form-group mb-0">
				<p class="tab-form-main-heading mb-0">
					Zoning Classification
				</p>
				<div class="checkbox-form-group second-custom-checkbox">
					<input type="checkbox" id="zoningClassification1" value="Industrial"
					<%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Industrial")?"checked":"" %>
						name="sezDevzoningClassification"> <label
						for="zoningClassification1">
						<p class="tab-form-main-heading mb-0">Industrial</p>
					</label>
				</div>
				<div class="checkbox-form-group second-custom-checkbox">
					<input type="checkbox" id="zoningClassification2" value="Agricultural"
					<%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Agricultural")?"checked":"" %>	name="sezDevzoningClassification"> <label for="zoningClassification2">
						<p class="tab-form-main-heading mb-0">Agricultural</p>
					</label>
				</div>
				<div class="checkbox-form-group second-custom-checkbox">
					<input type="checkbox" id="zoningClassification3" value="Residential"
				<%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Residential")?"checked":"" %>		
				name="sezDevzoningClassification"> <label for="zoningClassification3">
						<p class="tab-form-main-heading mb-0">Residential</p>
					</label>
				</div>
				<div class="checkbox-form-group second-custom-checkbox">
					<input type="checkbox" id="zoningClassification4" value="Commercial"
				<%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Commercial")?"checked":"" %>		name="sezDevzoningClassification"> <label for="zoningClassification4">
						<p class="tab-form-main-heading mb-0">Commercial</p>
					</label>
				</div>
				<!-- <p id="emailHelp" class="tab-form-sub-heading">Tick all that
					apply</p> -->
			</div>
		</div>
		<div class="col-md-6">
			<div class="form-group">
				<p class="tab-form-main-heading">What type of Special Economic
					Zone is the application for</p>
				<div class="wizard-form-radio d-block">
					<input value="Multi-Purpose Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Multi-Purpose Zone")?"checked":"" %>
						name="sezDevEconomicZone"> <label for="">Multi-Purpose
						Zone</label>
				</div>
				<div class="wizard-form-radio d-block">
					<input value="Single-Entity Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Single-Entity Zone")?"checked":"" %>
						name="sezDevEconomicZone"> <label for="">Single-Entity
						Zone</label>
				</div>
				<div class="wizard-form-radio d-block">
					<input
						value="Multi-Purpose Integrated Zone (Includes residential areas)" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Multi-Purpose Integrated Zone (Includes residential areas")?"checked":"" %>
						type="radio" name="sezDevEconomicZone"> <label for="">Multi-Purpose
						Integrated Zone (Includes residential areas)</label>
				</div>
				<div class="wizard-form-radio d-block">
					<input value="Specialised Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Specialised Zone")?"checked":"" %>
						name="sezDevEconomicZone"> <label for="">Specialised
						Zone</label>
				</div>
		</div>
		</div>
		<div class="col-md-12 pt-3"> 
               <p class="common-section-small-heading mb-0">Please Select Parish</p> 
        </div>
		<div class="col-lg-6">
			<div class="form-group">
				<div class="select-wrapper position-relative">
					<select class="form-select form-control" id="sezDevParish">
						<option value="" selected="" disabled="">Choose Parish</option>
						<option value="Kingston" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Kingston"))?"selected":"" %>>Kingston</option>
	                    <option value="St. Andrew" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Andrew"))?"selected":"" %> >St. Andrew</option>
	                    <option value="Manchester" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Manchester"))?"selected":"" %> >Manchester</option>
	                    <option value="St. Catherine" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Catherine"))?"selected":"" %>>St. Catherine</option>
	                    <option value="St. Thomas" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Thomas"))?"selected":"" %>>St. Thomas</option>
	                    <option value="St. Mary" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Mary"))?"selected":"" %>>St. Mary</option>
	                    <option value="Portland" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Portland"))?"selected":"" %>>Portland</option>
	                    <option value="St. Ann" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Ann"))?"selected":"" %>>St. Ann</option>
	                    <option value="Trelawny" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Trelawny"))?"selected":"" %>>Trelawny</option>
	                    <option value="St. James" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. James"))?"selected":"" %>>St. James</option>
	                    <option value="Hanover" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Hanover"))?"selected":"" %>>Hanover</option>
	                    <option value="Westmoreland" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Westmoreland"))?"selected":"" %>>Westmoreland</option>
	                    <option value="St. Elizabeth" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Elizabeth"))?"selected":"" %>>St. Elizabeth</option>
	                    <option value="Clarendon" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Clarendon"))?"selected":"" %>>Clarendon</option>
					</select>
				</div>
			</div>
		</div>
		<input type="hidden" id="sez-application-parish-option-value" name="sez-application-parish-option-value">
		<div class="col-md-12 pt-3">
	            <p class="common-section-small-heading">Industries ( Select your preferred industry/ies by clicking on the links below)</p>
	        </div>
			<div class="col-md-12" id="sez-industries">
				<div class="row wizard-cards-list">
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
									<path fill-rule="evenodd" clip-rule="evenodd" d="M0.175008 35.575L18.8938 3.15001C19.0051 2.95489 19.1661 2.79269 19.3604 2.67988C19.5547 2.56707 19.7753 2.50764 20 2.50764C20.2247 2.50764 20.4453 2.56707 20.6396 2.67988C20.8339 2.79269 20.9949 2.95489 21.1063 3.15001L39.825 35.575C40.3188 36.4313 39.7 37.4938 38.7188 37.4938H1.28126C0.300008 37.4938 -0.318742 36.425 0.175008 35.575ZM19.1125 27.2875H20.8813C21.05 27.2875 21.1813 27.1625 21.1938 27L21.925 17.3813C21.9375 17.2 21.7938 17.0438 21.6125 17.0438H18.375C18.1938 17.0438 18.05 17.2 18.0625 17.3813L18.8 27C18.8125 27.1625 18.95 27.2875 19.1125 27.2875ZM18.825 31.5563C18.825 31.7313 18.9625 31.8688 19.1375 31.8688H20.8625C21.0313 31.8688 21.175 31.7313 21.175 31.5563V29.6875C21.175 29.5125 21.0375 29.375 20.8625 29.375H19.1375C18.9625 29.375 18.825 29.5125 18.825 29.6875V31.5563Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Priority Industries</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M36.5283 18.2786L33.6179 15.3683C33.3918 15.1423 33.2124 14.8739 33.0901 14.5785C32.9677 14.2832 32.9048 13.9666 32.9048 13.6469V9.52965C32.905 9.2099 32.8422 8.89325 32.7199 8.5978C32.5976 8.30235 32.4183 8.0339 32.1922 7.80781C31.9661 7.58171 31.6977 7.40239 31.4022 7.28011C31.1068 7.15783 30.7901 7.09499 30.4704 7.09517H26.3531C26.0335 7.09541 25.717 7.03268 25.4216 6.91056C25.1263 6.78844 24.8579 6.60932 24.6317 6.38344L21.7214 3.47172C21.4954 3.24551 21.2271 3.06606 20.9317 2.94362C20.6364 2.82118 20.3197 2.75816 20 2.75816C19.6803 2.75816 19.3637 2.82118 19.0683 2.94362C18.7729 3.06606 18.5046 3.24551 18.2786 3.47172L15.3683 6.38206C15.1423 6.60819 14.8739 6.78756 14.5786 6.90992C14.2832 7.03228 13.9666 7.09523 13.6469 7.09517H9.52967C9.2098 7.09499 8.89303 7.15788 8.5975 7.28024C8.30196 7.40261 8.03345 7.58205 7.80733 7.80829C7.58122 8.03454 7.40193 8.30315 7.27973 8.59876C7.15753 8.89436 7.09482 9.21116 7.09518 9.53103V13.6483C7.09542 13.9679 7.03269 14.2844 6.91057 14.5798C6.78845 14.8751 6.60934 15.1435 6.38346 15.3697L3.47173 18.28C3.24553 18.506 3.06607 18.7743 2.94364 19.0697C2.8212 19.365 2.75818 19.6816 2.75818 20.0014C2.75818 20.3211 2.8212 20.6377 2.94364 20.9331C3.06607 21.2284 3.24553 21.4968 3.47173 21.7228L6.38208 24.6331C6.60821 24.8591 6.78758 25.1275 6.90993 25.4228C7.03229 25.7182 7.09524 26.0348 7.09518 26.3545V30.4717C7.095 30.7915 7.15785 31.1081 7.28013 31.4036C7.40241 31.699 7.58172 31.9675 7.80782 32.1936C8.03392 32.4197 8.30237 32.599 8.59781 32.7213C8.89326 32.8435 9.20991 32.9064 9.52967 32.9062H13.6469C13.9665 32.906 14.283 32.9687 14.5784 33.0908C14.8738 33.2129 15.1422 33.392 15.3683 33.6179L18.2786 36.5297C18.5046 36.7559 18.7729 36.9353 19.0683 37.0577C19.3637 37.1802 19.6803 37.2432 20 37.2432C20.3197 37.2432 20.6364 37.1802 20.9317 37.0577C21.2271 36.9353 21.4954 36.7559 21.7214 36.5297L24.6317 33.6193C24.8577 33.3932 25.1261 33.2138 25.4215 33.0915C25.7168 32.9691 26.0334 32.9061 26.3531 32.9062H30.4704C30.7901 32.9064 31.1068 32.8435 31.4022 32.7213C31.6977 32.599 31.9661 32.4197 32.1922 32.1936C32.4183 31.9675 32.5976 31.699 32.7199 31.4036C32.8422 31.1081 32.905 30.7915 32.9048 30.4717V26.3545C32.9046 26.0349 32.9673 25.7183 33.0895 25.423C33.2116 25.1276 33.3907 24.8592 33.6166 24.6331L36.5283 21.7228C36.7545 21.4968 36.9339 21.2284 37.0564 20.9331C37.1788 20.6377 37.2418 20.3211 37.2418 20.0014C37.2418 19.6816 37.1788 19.365 37.0564 19.0697C36.9339 18.7743 36.7545 18.506 36.5283 18.28V18.2786ZM28.189 14.8648L18.1545 26.9007C18.0319 27.0482 17.8799 27.1686 17.7082 27.2541C17.5365 27.3396 17.3489 27.3884 17.1573 27.3972H17.0952C16.7294 27.3972 16.3786 27.2518 16.12 26.9931L11.8952 22.7683C11.7634 22.641 11.6584 22.4888 11.5861 22.3206C11.5138 22.1523 11.4757 21.9713 11.4741 21.7881C11.4726 21.605 11.5075 21.4234 11.5768 21.2539C11.6462 21.0843 11.7486 20.9303 11.8781 20.8008C12.0076 20.6713 12.1616 20.5689 12.3311 20.4995C12.5006 20.4302 12.6822 20.3953 12.8654 20.3969C13.0485 20.3985 13.2295 20.4365 13.3978 20.5088C13.5661 20.5811 13.7183 20.6862 13.8455 20.8179L17.0041 23.9752L26.069 13.0993C26.3031 12.818 26.6394 12.6412 27.0039 12.6078C27.3683 12.5745 27.7311 12.6873 28.0124 12.9214C28.2937 13.1555 28.4705 13.4918 28.5039 13.8562C28.5373 14.2207 28.4231 14.5835 28.189 14.8648Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Permitted Industries</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24" fill="none">
										<g id="SVGRepo_bgCarrier" stroke-width="0"></g>
										<g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
										<g id="SVGRepo_iconCarrier"> <path d="M3.75 5C3.33579 5 3 5.33579 3 5.75V11C3 16.0012 5.95756 19.6757 11.7251 21.9478C11.9018 22.0174 12.0982 22.0174 12.2749 21.9478C12.4188 21.8911 12.561 21.8335 12.7014 21.7751C11.0651 20.5947 10 18.6717 10 16.5C10 12.9101 12.9101 10 16.5 10C18.2341 10 19.8095 10.679 20.975 11.7857C20.9917 11.5275 21 11.2656 21 11V5.75C21 5.33579 20.6642 5 20.25 5C17.5866 5 14.992 4.05652 12.45 2.15C12.1833 1.95 11.8167 1.95 11.55 2.15C9.00797 4.05652 6.41341 5 3.75 5Z" fill="#047247"></path> <path d="M16.5 22C19.5376 22 22 19.5376 22 16.5C22 13.4624 19.5376 11 16.5 11C13.4624 11 11 13.4624 11 16.5C11 19.5376 13.4624 22 16.5 22ZM13.1911 18.7482C12.755 18.1075 12.5 17.3335 12.5 16.5C12.5 14.2909 14.2909 12.5 16.5 12.5C17.3335 12.5 18.1075 12.755 18.7482 13.1911L13.1911 18.7482ZM14.2518 19.8089L19.8089 14.2518C20.245 14.8925 20.5 15.6665 20.5 16.5C20.5 18.7091 18.7091 20.5 16.5 20.5C15.6665 20.5 14.8925 20.245 14.2518 19.8089Z" fill="#047247"></path> </g>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Prohibited Industries</p>
								</div>
							</a>
						</div>
					</div>
				</div>
				<input type="hidden" id="sez-dev-industry-option-value" name="sez-dev-industry-option-value">
			</div>
	</div>
     <div class="row pt-3 hide commonsavepopup" id="sezOccupantLevel3">
	    <div class="col-md-6"> 
	        <div class="form-group"> 
	         <p class="tab-form-main-heading" for="sezDevName">Name of SEZ Developer</p> 
	         <input type="text" class="form-control" id="sezDevName" placeholder="" value="<%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getDeveloperName())?sezDeveloperDetails.getDeveloperName():"" %>"> 
	         <p class="tab-form-sub-heading fieldAlert hide" id="sezDevNameValidation" style="color: red;">Please Enter Name</p> 
	        </div> 
	    </div>
	    <div class="col-md-6"> 
	        <div class="form-group"> 
	         <p class="tab-form-main-heading" for="sezDevControl">SEZ Developer Control</p> 
	         <input type="text" class="form-control" id="sezDevControl" placeholder="" value="<%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getDeveloperControl())?sezDeveloperDetails.getDeveloperControl():"" %>"> 
	        </div> 
	    </div>
	    <div class="col-md-6">
			<div class="supporting-document-card my-3"
				id="approvalLetterAttachmentbox">
				<div class="row">
					<div class="col-md-12">
						<div class="supporting-document-card-wrapper">
							<div class="left">
								<p class="supporting-document-card-upper-heading">Letter of Approval</p>
							</div>
							<div class="right">
								<input type="file" id="approvalLetter"
									onchange="attachDetailed(this.id)" hidden="" multiple=""
									name="<portlet:namespace/>approvalLetter"> <label
									class="custom-upload" for="approvalLetter"> <span
									class="mr-2"> <svg width="14" height="17"
											viewBox="0 0 14 17" fill="none"
											xmlns="http://www.w3.org/2000/svg"> 
	                                     <path
												d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
												fill="#047247"></path> 
	                                    </svg>
								</span>Upload
								</label> 
							</div>
						</div>
						<span class="attach-detailed-overview"><%=(Validator.isNotNull(occApproveLetter))?occApproveLetter:""%></span>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6">
			<div class="supporting-document-card my-3"
				id="sezDevAgreeAttachmentbox">
				<div class="row">
					<div class="col-md-12">
						<div class="supporting-document-card-wrapper">
							<div class="left">
								<p class="supporting-document-card-upper-heading">SEZ Developer's Agreement</p>
							</div>
							<div class="right">
								<input type="file" id="sezDevAgree"
									onchange="attachDetailed(this.id)" hidden="" multiple=""
									name="<portlet:namespace/>sezDevAgree"> <label
									class="custom-upload" for="sezDevAgree"> <span
									class="mr-2"> <svg width="14" height="17"
											viewBox="0 0 14 17" fill="none"
											xmlns="http://www.w3.org/2000/svg"> 
	                                     <path
												d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
												fill="#047247"></path> 
	                                    </svg>
								</span>Upload
								</label>
							</div>
						</div>
						<span class="attach-detailed-overview"><%=(Validator.isNotNull(occAgree))?occAgree:""%></span>
					</div>
				</div>
			</div>
		</div>
	    <%-- <div class="col-md-6"> 
	        <div class="form-group"> 
	         <p class="tab-form-main-heading" for="approvalLetter">Letter of Approval</p> 
	         <input type="text" class="form-control" id="approvalLetter" placeholder="" value="
	        <%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getDeveloperName())?sezDeveloperDetails.getDeveloperName():"" %>  
	         "> 
	        </div> 
	    </div> --%>
	    <div class="col-md-6"> 
	        <div class="form-group"> 
	         <p class="tab-form-main-heading" for="approvalLetterDate">Letter of Approval Date</p> 
	         <input type="date" class="form-control" id="approvalLetterDate" placeholder="" value="<%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getLetterOfApprovalDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezDeveloperDetails.getLetterOfApprovalDate()):"" %>"> 
	        </div> 
	    </div>
	    <div class="col-md-6"> 
	        <div class="form-group"> 
	         <p class="tab-form-main-heading" for="sezDevdate">SEZ Developer's Date</p> 
	         <input type="date" class="form-control" id="sezDevdate" placeholder="" value="<%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getSezDeveloperDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezDeveloperDetails.getSezDeveloperDate()):"" %>"> 
	        </div> 
	    </div>
	    <div class="col-md-6">
	        <div class="form-group mb-0">
	            <p class="tab-form-main-heading mb-0">
	                Zoning Classification
	            </p>
	            <div class="checkbox-form-group second-custom-checkbox">
	                <input type="checkbox" id="occuZoningClassification1" value="Industrial"
	              <%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Industrial")?"checked":"" %>      name="sezOccuZoningClassification"> <label
	                    for="occuZoningClassification1">
	                    <p class="tab-form-main-heading mb-0">Industrial</p>
	                </label>
	            </div>
	            <div class="checkbox-form-group second-custom-checkbox">
	                <input type="checkbox" id="occuZoningClassification2" value="Agricultural"
	               <%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Agricultural")?"checked":"" %>     name="sezOccuZoningClassification"> <label for="occuZoningClassification2">
	                    <p class="tab-form-main-heading mb-0">Agricultural</p>
	                </label>
	            </div>
	            <div class="checkbox-form-group second-custom-checkbox">
	                <input type="checkbox" id="occuZoningClassification3" value="Residential"
	            <%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Residential")?"checked":"" %>        name="sezOccuZoningClassification"> <label for="occuZoningClassification3">
	                    <p class="tab-form-main-heading mb-0">Residential</p>
	                </label>
	            </div>
	            <div class="checkbox-form-group second-custom-checkbox">
	                <input type="checkbox" id="occuZoningClassification4" value="Commercial"
	             <%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Commercial")?"checked":"" %>       name="sezOccuZoningClassification"> <label for="occuZoningClassification4">
	                    <p class="tab-form-main-heading mb-0">Commercial</p>
	                </label>
	            </div>
	            <!-- <p id="emailHelp" class="tab-form-sub-heading">Tick all that
	                apply</p> -->
	        </div>
	    </div>
        <div class="col-md-6">
			<div class="form-group">
				<p class="tab-form-main-heading">What type of Special Economic
					Zone is the application for</p>
				<div class="wizard-form-radio d-block">
					<input value="Multi-Purpose Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Multi-Purpose Zone")?"checked":"" %>
						name="sezOccuEconomicZone"> <label for="">Multi-Purpose
						Zone</label>
				</div>
				<div class="wizard-form-radio d-block">
					<input value="Single-Entity Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Single-Entity Zone")?"checked":"" %>
						name="sezOccuEconomicZone"> <label for="">Single-Entity
						Zone</label>
				</div>
				<div class="wizard-form-radio d-block">
					<input
						value="Multi-Purpose Integrated Zone (Includes residential areas)" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Multi-Purpose Integrated Zone (Includes residential areas")?"checked":"" %>
						type="radio" name="sezOccuEconomicZone"> <label for="">Multi-Purpose
						Integrated Zone (Includes residential areas)</label>
				</div>
				<div class="wizard-form-radio d-block">
					<input value="Specialised Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Specialised Zone")?"checked":"" %>
						name="sezOccuEconomicZone"> <label for="">Specialised
						Zone</label>
				</div>
			</div>
		</div>
	    <div class="col-md-12 pt-3"> 
	           <p class="common-section-small-heading mb-0">Please Select Parish</p> 
	    </div>
	    <div class="col-lg-6">
	        <div class="form-group">
	            <div class="select-wrapper position-relative">
	                <select class="form-select form-control" id="sezOccuParish">
	                    <option value="" selected="" disabled="">Choose Parish</option>
						<option value="Kingston" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Kingston"))?"selected":"" %>>Kingston</option>
	                    <option value="St. Andrew" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Andrew"))?"selected":"" %> >St. Andrew</option>
	                    <option value="Manchester" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Manchester"))?"selected":"" %> >Manchester</option>
	                    <option value="St. Catherine" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Catherine"))?"selected":"" %>>St. Catherine</option>
	                    <option value="St. Thomas" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Thomas"))?"selected":"" %>>St. Thomas</option>
	                    <option value="St. Mary" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Mary"))?"selected":"" %>>St. Mary</option>
	                    <option value="Portland" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Portland"))?"selected":"" %>>Portland</option>
	                    <option value="St. Ann" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Ann"))?"selected":"" %>>St. Ann</option>
	                    <option value="Trelawny" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Trelawny"))?"selected":"" %>>Trelawny</option>
	                    <option value="St. James" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. James"))?"selected":"" %>>St. James</option>
	                    <option value="Hanover" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Hanover"))?"selected":"" %>>Hanover</option>
	                    <option value="Westmoreland" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Westmoreland"))?"selected":"" %>>Westmoreland</option>
	                    <option value="St. Elizabeth" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Elizabeth"))?"selected":"" %>>St. Elizabeth</option>
	                    <option value="Clarendon" <%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Clarendon"))?"selected":"" %>>Clarendon</option>
	                </select>
	            </div>
	        </div>
	        <input type="hidden" id="sez-occu-parish-option-value" name="sez-occu-industry-option-value">
	    </div>
	    <div class="col-md-12 pt-3">
	            <p class="common-section-small-heading">Industries ( Select your preferred industry/ies by clicking on the links below)</p>
	        </div>
	        <div class="col-md-12" id="occupant-industries-check-box">
	            <div class="row wizard-cards-list">
	                <div class="col-lg-4">
	                    <div class="wizard-card">
	                        <a href="javascript:;">
	                            <div class="wizard-card-icon">
	                                <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path fill-rule="evenodd" clip-rule="evenodd" d="M0.175008 35.575L18.8938 3.15001C19.0051 2.95489 19.1661 2.79269 19.3604 2.67988C19.5547 2.56707 19.7753 2.50764 20 2.50764C20.2247 2.50764 20.4453 2.56707 20.6396 2.67988C20.8339 2.79269 20.9949 2.95489 21.1063 3.15001L39.825 35.575C40.3188 36.4313 39.7 37.4938 38.7188 37.4938H1.28126C0.300008 37.4938 -0.318742 36.425 0.175008 35.575ZM19.1125 27.2875H20.8813C21.05 27.2875 21.1813 27.1625 21.1938 27L21.925 17.3813C21.9375 17.2 21.7938 17.0438 21.6125 17.0438H18.375C18.1938 17.0438 18.05 17.2 18.0625 17.3813L18.8 27C18.8125 27.1625 18.95 27.2875 19.1125 27.2875ZM18.825 31.5563C18.825 31.7313 18.9625 31.8688 19.1375 31.8688H20.8625C21.0313 31.8688 21.175 31.7313 21.175 31.5563V29.6875C21.175 29.5125 21.0375 29.375 20.8625 29.375H19.1375C18.9625 29.375 18.825 29.5125 18.825 29.6875V31.5563Z" fill="#047247"/>
										</svg>
	                            </div>
	                            <div class="wizard-card-content-box">
	                                <p class="wizard-title f2">Priority Industries</p>
	                            </div>
	                        </a>
	                    </div>
	                </div>
	                <div class="col-lg-4">
	                    <div class="wizard-card">
	                        <a href="javascript:;">
	                            <div class="wizard-card-icon">
	                                <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M36.5283 18.2786L33.6179 15.3683C33.3918 15.1423 33.2124 14.8739 33.0901 14.5785C32.9677 14.2832 32.9048 13.9666 32.9048 13.6469V9.52965C32.905 9.2099 32.8422 8.89325 32.7199 8.5978C32.5976 8.30235 32.4183 8.0339 32.1922 7.80781C31.9661 7.58171 31.6977 7.40239 31.4022 7.28011C31.1068 7.15783 30.7901 7.09499 30.4704 7.09517H26.3531C26.0335 7.09541 25.717 7.03268 25.4216 6.91056C25.1263 6.78844 24.8579 6.60932 24.6317 6.38344L21.7214 3.47172C21.4954 3.24551 21.2271 3.06606 20.9317 2.94362C20.6364 2.82118 20.3197 2.75816 20 2.75816C19.6803 2.75816 19.3637 2.82118 19.0683 2.94362C18.7729 3.06606 18.5046 3.24551 18.2786 3.47172L15.3683 6.38206C15.1423 6.60819 14.8739 6.78756 14.5786 6.90992C14.2832 7.03228 13.9666 7.09523 13.6469 7.09517H9.52967C9.2098 7.09499 8.89303 7.15788 8.5975 7.28024C8.30196 7.40261 8.03345 7.58205 7.80733 7.80829C7.58122 8.03454 7.40193 8.30315 7.27973 8.59876C7.15753 8.89436 7.09482 9.21116 7.09518 9.53103V13.6483C7.09542 13.9679 7.03269 14.2844 6.91057 14.5798C6.78845 14.8751 6.60934 15.1435 6.38346 15.3697L3.47173 18.28C3.24553 18.506 3.06607 18.7743 2.94364 19.0697C2.8212 19.365 2.75818 19.6816 2.75818 20.0014C2.75818 20.3211 2.8212 20.6377 2.94364 20.9331C3.06607 21.2284 3.24553 21.4968 3.47173 21.7228L6.38208 24.6331C6.60821 24.8591 6.78758 25.1275 6.90993 25.4228C7.03229 25.7182 7.09524 26.0348 7.09518 26.3545V30.4717C7.095 30.7915 7.15785 31.1081 7.28013 31.4036C7.40241 31.699 7.58172 31.9675 7.80782 32.1936C8.03392 32.4197 8.30237 32.599 8.59781 32.7213C8.89326 32.8435 9.20991 32.9064 9.52967 32.9062H13.6469C13.9665 32.906 14.283 32.9687 14.5784 33.0908C14.8738 33.2129 15.1422 33.392 15.3683 33.6179L18.2786 36.5297C18.5046 36.7559 18.7729 36.9353 19.0683 37.0577C19.3637 37.1802 19.6803 37.2432 20 37.2432C20.3197 37.2432 20.6364 37.1802 20.9317 37.0577C21.2271 36.9353 21.4954 36.7559 21.7214 36.5297L24.6317 33.6193C24.8577 33.3932 25.1261 33.2138 25.4215 33.0915C25.7168 32.9691 26.0334 32.9061 26.3531 32.9062H30.4704C30.7901 32.9064 31.1068 32.8435 31.4022 32.7213C31.6977 32.599 31.9661 32.4197 32.1922 32.1936C32.4183 31.9675 32.5976 31.699 32.7199 31.4036C32.8422 31.1081 32.905 30.7915 32.9048 30.4717V26.3545C32.9046 26.0349 32.9673 25.7183 33.0895 25.423C33.2116 25.1276 33.3907 24.8592 33.6166 24.6331L36.5283 21.7228C36.7545 21.4968 36.9339 21.2284 37.0564 20.9331C37.1788 20.6377 37.2418 20.3211 37.2418 20.0014C37.2418 19.6816 37.1788 19.365 37.0564 19.0697C36.9339 18.7743 36.7545 18.506 36.5283 18.28V18.2786ZM28.189 14.8648L18.1545 26.9007C18.0319 27.0482 17.8799 27.1686 17.7082 27.2541C17.5365 27.3396 17.3489 27.3884 17.1573 27.3972H17.0952C16.7294 27.3972 16.3786 27.2518 16.12 26.9931L11.8952 22.7683C11.7634 22.641 11.6584 22.4888 11.5861 22.3206C11.5138 22.1523 11.4757 21.9713 11.4741 21.7881C11.4726 21.605 11.5075 21.4234 11.5768 21.2539C11.6462 21.0843 11.7486 20.9303 11.8781 20.8008C12.0076 20.6713 12.1616 20.5689 12.3311 20.4995C12.5006 20.4302 12.6822 20.3953 12.8654 20.3969C13.0485 20.3985 13.2295 20.4365 13.3978 20.5088C13.5661 20.5811 13.7183 20.6862 13.8455 20.8179L17.0041 23.9752L26.069 13.0993C26.3031 12.818 26.6394 12.6412 27.0039 12.6078C27.3683 12.5745 27.7311 12.6873 28.0124 12.9214C28.2937 13.1555 28.4705 13.4918 28.5039 13.8562C28.5373 14.2207 28.4231 14.5835 28.189 14.8648Z" fill="#047247"/>
									</svg>
	                            </div>
	                            <div class="wizard-card-content-box">
	                                <p class="wizard-title f2">Permitted Industries</p>
	                            </div>
	                        </a>
	                    </div>
	                </div>
	                <div class="col-lg-4">
	                    <div class="wizard-card">
	                        <a href="javascript:;">
	                            <div class="wizard-card-icon">
	                                <svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 24 24" fill="none">
										<g id="SVGRepo_bgCarrier" stroke-width="0"></g>
										<g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
										<g id="SVGRepo_iconCarrier"> <path d="M3.75 5C3.33579 5 3 5.33579 3 5.75V11C3 16.0012 5.95756 19.6757 11.7251 21.9478C11.9018 22.0174 12.0982 22.0174 12.2749 21.9478C12.4188 21.8911 12.561 21.8335 12.7014 21.7751C11.0651 20.5947 10 18.6717 10 16.5C10 12.9101 12.9101 10 16.5 10C18.2341 10 19.8095 10.679 20.975 11.7857C20.9917 11.5275 21 11.2656 21 11V5.75C21 5.33579 20.6642 5 20.25 5C17.5866 5 14.992 4.05652 12.45 2.15C12.1833 1.95 11.8167 1.95 11.55 2.15C9.00797 4.05652 6.41341 5 3.75 5Z" fill="#047247"></path> <path d="M16.5 22C19.5376 22 22 19.5376 22 16.5C22 13.4624 19.5376 11 16.5 11C13.4624 11 11 13.4624 11 16.5C11 19.5376 13.4624 22 16.5 22ZM13.1911 18.7482C12.755 18.1075 12.5 17.3335 12.5 16.5C12.5 14.2909 14.2909 12.5 16.5 12.5C17.3335 12.5 18.1075 12.755 18.7482 13.1911L13.1911 18.7482ZM14.2518 19.8089L19.8089 14.2518C20.245 14.8925 20.5 15.6665 20.5 16.5C20.5 18.7091 18.7091 20.5 16.5 20.5C15.6665 20.5 14.8925 20.245 14.2518 19.8089Z" fill="#047247"></path> </g>
									</svg>
	                            </div>
	                            <div class="wizard-card-content-box">
	                                <p class="wizard-title f2">Prohibited Industries</p>
	                            </div>
	                        </a>
	                    </div>
	                </div>
	            </div>
	            <input type="hidden" id="sez-occu-industry-option-value" name="sez-occu-industry-option-value">
	        </div>
	</div>
	<div class="row pt-3 hide commonsavepopup" id="sezZoneUserLevel3">
	    <div class="col-md-6"> 
	        <div class="form-group"> 
	         <p class="tab-form-main-heading" for="sezZoneDevName">Name of SEZ Developer</p> 
	         <input type="text" class="form-control" id="sezZoneDevName" placeholder="" 
	         value="<%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getDeveloperName())?sezDeveloperDetails.getDeveloperName():"" %>"> 
	         <p class="tab-form-sub-heading fieldAlert hide" id="sezZoneDevNameValidation" style="color: red;">Please Enter Name</p> 
	        </div> 
	    </div>
	    <div class="col-md-6"> 
	        <div class="form-group"> 
	         <p class="tab-form-main-heading" for="sezZoneDevControl">SEZ Developer Control</p> 
	         <input type="text" class="form-control" id="sezZoneDevControl" placeholder="" 
	         value=" <%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getDeveloperControl())?sezDeveloperDetails.getDeveloperControl():"" %>"> 
	        </div> 
	    </div>
	    <div class="col-md-6">
			<div class="supporting-document-card my-3"
				id="zoneApprovalLetterAttachmentbox">
				<div class="row">
					<div class="col-md-12">
						<div class="supporting-document-card-wrapper">
							<div class="left">
								<p class="supporting-document-card-upper-heading">Letter of Approval</p>
							</div>
							<div class="right">
								<input type="file" id="zoneApprovalLetter"
									onchange="attachDetailed(this.id)" hidden="" multiple=""
									name="<portlet:namespace/>zoneApprovalLetter"> <label
									class="custom-upload" for="zoneApprovalLetter"> <span
									class="mr-2"> <svg width="14" height="17"
											viewBox="0 0 14 17" fill="none"
											xmlns="http://www.w3.org/2000/svg"> 
	                                     <path
												d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
												fill="#047247"></path> 
	                                    </svg>
								</span>Upload
								</label>
							</div>
						</div>
						<span class="attach-detailed-overview"><%=(Validator.isNotNull(approveLetter))?approveLetter:""%></span>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-6">
			<div class="supporting-document-card my-3"
				id="sezZoneDevAgreebox">
				<div class="row">
					<div class="col-md-12">
						<div class="supporting-document-card-wrapper">
							<div class="left">
								<p class="supporting-document-card-upper-heading">SEZ Developer's Agreement</p>
							</div>
							<div class="right">
								<input type="file" id="sezZoneDevAgree"
									onchange="attachDetailed(this.id)" hidden="" multiple=""
									name="<portlet:namespace/>sezZoneDevAgree"> <label
									class="custom-upload" for="sezZoneDevAgree"> <span
									class="mr-2"> <svg width="14" height="17"
											viewBox="0 0 14 17" fill="none"
											xmlns="http://www.w3.org/2000/svg"> 
	                                     <path
												d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
												fill="#047247"></path> 
	                                    </svg>
								</span>Upload
								</label>
							</div>
						</div>
						<span class="attach-detailed-overview"><%=(Validator.isNotNull(zoneAgree))?zoneAgree:""%></span>
					</div>
					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading" for="zoneApprovalLetterDate">Letter
						of Approval Date</p>
					<input type="date" class="form-control" id="zoneApprovalLetterDate"
						placeholder=""
						value="<%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getLetterOfApprovalDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezDeveloperDetails.getLetterOfApprovalDate()):"" %>">
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading" for="sezZoneDevdate">SEZ
						Developer's Date</p>
					<input type="date" class="form-control" id="sezZoneDevdate"
						placeholder=""
						value="<%=Validator.isNotNull(sezDeveloperDetails)&&Validator.isNotNull(sezDeveloperDetails.getSezDeveloperDate())?new SimpleDateFormat("yyyy-MM-dd").format(sezDeveloperDetails.getSezDeveloperDate()):"" %>">
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading mb-0">Zoning Classification</p>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="zoneUserZoningClassification1"
							value="Industrial"
							<%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Industrial")?"checked":"" %>
							name="sezZoneUserZoningClassification"> <label
							for="zoneUserZoningClassification1">
							<p class="tab-form-main-heading mb-0">Industrial</p>
						</label>
					</div>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="zoneUserZoningClassification2"
							value="Agricultural"
							<%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Agricultural")?"checked":"" %>
							name="sezZoneUserZoningClassification"> <label
							for="zoneUserZoningClassification2">
							<p class="tab-form-main-heading mb-0">Agricultural</p>
						</label>
					</div>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="zoneUserZoningClassification3"
							value="Residential"
							<%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Residential")?"checked":"" %>
							name="sezZoneUserZoningClassification"> <label
							for="zoneUserZoningClassification3">
							<p class="tab-form-main-heading mb-0">Residential</p>
						</label>
					</div>
					<div class="checkbox-form-group second-custom-checkbox">
						<input type="checkbox" id="zoneUserZoningClassification4"
							value="Commercial"
							<%=Validator.isNotNull(zoneClassification)&&zoneClassification.contains("Commercial")?"checked":"" %>
							name="sezZoneUserZoningClassification"> <label
							for="zoneUserZoningClassification4">
							<p class="tab-form-main-heading mb-0">Commercial</p>
						</label>
					</div>
					<!-- <p id="emailHelp" class="tab-form-sub-heading">Tick all that
	                apply</p> -->
				</div>
			</div>
			<div class="col-md-6">
				<div class="form-group">
					<p class="tab-form-main-heading">What type of Special Economic
						Zone is the application for</p>
					<div class="wizard-form-radio d-block">
						<input value="Multi-Purpose Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Multi-Purpose Zone")?"checked":"" %>
							name="sezZoneEconomicZone"> <label for="">Multi-Purpose
							Zone</label>
					</div>
					<div class="wizard-form-radio d-block">
						<input value="Single-Entity Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Single-Entity Zone")?"checked":"" %>
							name="sezZoneEconomicZone"> <label for="">Single-Entity
							Zone</label>
					</div>
					<div class="wizard-form-radio d-block">
						<input
							value="Multi-Purpose Integrated Zone (Includes residential areas)" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Multi-Purpose Integrated Zone (Includes residential areas")?"checked":"" %>
							type="radio" name="sezZoneEconomicZone"> <label for="">Multi-Purpose
							Integrated Zone (Includes residential areas)</label>
					</div>
					<div class="wizard-form-radio d-block">
						<input value="Specialised Zone" type="radio" <%=Validator.isNotNull(specialEconomicZone)&&specialEconomicZone.contains("Specialised Zone")?"checked":"" %>
							name="sezZoneEconomicZone"> <label for="">Specialised
							Zone</label>
					</div>
				</div>
			</div>
			<div class="col-md-12 pt-3">
				<p class="common-section-small-heading mb-0">Please Select
					Parish</p>
			</div>
			<div class="col-lg-6">
				<div class="form-group">
					<div class="select-wrapper position-relative">
						<select class="form-select form-control" id="sezZoneParish">
							<option value="" selected="" disabled="">Choose Parish</option>
							<option value="Kingston"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Kingston"))?"selected":"" %>>Kingston</option>
							<option value="St. Andrew"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Andrew"))?"selected":"" %>>St.
								Andrew</option>
							<option value="Manchester"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Manchester"))?"selected":"" %>>Manchester</option>
							<option value="St. Catherine"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Catherine"))?"selected":"" %>>St.
								Catherine</option>
							<option value="St. Thomas"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Thomas"))?"selected":"" %>>St.
								Thomas</option>
							<option value="St. Mary"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Mary"))?"selected":"" %>>St.
								Mary</option>
							<option value="Portland"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Portland"))?"selected":"" %>>Portland</option>
							<option value="St. Ann"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Ann"))?"selected":"" %>>St.
								Ann</option>
							<option value="Trelawny"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Trelawny"))?"selected":"" %>>Trelawny</option>
							<option value="St. James"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. James"))?"selected":"" %>>St.
								James</option>
							<option value="Hanover"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Hanover"))?"selected":"" %>>Hanover</option>
							<option value="Westmoreland"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Westmoreland"))?"selected":"" %>>Westmoreland</option>
							<option value="St. Elizabeth"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("St. Elizabeth"))?"selected":"" %>>St.
								Elizabeth</option>
							<option value="Clarendon"
								<%=Validator.isNotNull(parish)&&Validator.isNotNull(parish.contains("Clarendon"))?"selected":"" %>>Clarendon</option>
						</select>
					</div>
				</div>
			</div>
			<div class="col-md-12 pt-3">
				<p class="common-section-small-heading">Industries ( Select your
					preferred industry/ies by clicking on the links below)</p>
			</div>
			<div class="col-md-12" id="sezZoneUserIndustryBox">
				<div class="row wizard-cards-list">
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40"
										viewBox="0 0 40 40" fill="none">
										<path fill-rule="evenodd" clip-rule="evenodd"
											d="M0.175008 35.575L18.8938 3.15001C19.0051 2.95489 19.1661 2.79269 19.3604 2.67988C19.5547 2.56707 19.7753 2.50764 20 2.50764C20.2247 2.50764 20.4453 2.56707 20.6396 2.67988C20.8339 2.79269 20.9949 2.95489 21.1063 3.15001L39.825 35.575C40.3188 36.4313 39.7 37.4938 38.7188 37.4938H1.28126C0.300008 37.4938 -0.318742 36.425 0.175008 35.575ZM19.1125 27.2875H20.8813C21.05 27.2875 21.1813 27.1625 21.1938 27L21.925 17.3813C21.9375 17.2 21.7938 17.0438 21.6125 17.0438H18.375C18.1938 17.0438 18.05 17.2 18.0625 17.3813L18.8 27C18.8125 27.1625 18.95 27.2875 19.1125 27.2875ZM18.825 31.5563C18.825 31.7313 18.9625 31.8688 19.1375 31.8688H20.8625C21.0313 31.8688 21.175 31.7313 21.175 31.5563V29.6875C21.175 29.5125 21.0375 29.375 20.8625 29.375H19.1375C18.9625 29.375 18.825 29.5125 18.825 29.6875V31.5563Z"
											fill="#047247" />
										</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Priority Industries</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40"
										viewBox="0 0 40 40" fill="none">
										<path
											d="M36.5283 18.2786L33.6179 15.3683C33.3918 15.1423 33.2124 14.8739 33.0901 14.5785C32.9677 14.2832 32.9048 13.9666 32.9048 13.6469V9.52965C32.905 9.2099 32.8422 8.89325 32.7199 8.5978C32.5976 8.30235 32.4183 8.0339 32.1922 7.80781C31.9661 7.58171 31.6977 7.40239 31.4022 7.28011C31.1068 7.15783 30.7901 7.09499 30.4704 7.09517H26.3531C26.0335 7.09541 25.717 7.03268 25.4216 6.91056C25.1263 6.78844 24.8579 6.60932 24.6317 6.38344L21.7214 3.47172C21.4954 3.24551 21.2271 3.06606 20.9317 2.94362C20.6364 2.82118 20.3197 2.75816 20 2.75816C19.6803 2.75816 19.3637 2.82118 19.0683 2.94362C18.7729 3.06606 18.5046 3.24551 18.2786 3.47172L15.3683 6.38206C15.1423 6.60819 14.8739 6.78756 14.5786 6.90992C14.2832 7.03228 13.9666 7.09523 13.6469 7.09517H9.52967C9.2098 7.09499 8.89303 7.15788 8.5975 7.28024C8.30196 7.40261 8.03345 7.58205 7.80733 7.80829C7.58122 8.03454 7.40193 8.30315 7.27973 8.59876C7.15753 8.89436 7.09482 9.21116 7.09518 9.53103V13.6483C7.09542 13.9679 7.03269 14.2844 6.91057 14.5798C6.78845 14.8751 6.60934 15.1435 6.38346 15.3697L3.47173 18.28C3.24553 18.506 3.06607 18.7743 2.94364 19.0697C2.8212 19.365 2.75818 19.6816 2.75818 20.0014C2.75818 20.3211 2.8212 20.6377 2.94364 20.9331C3.06607 21.2284 3.24553 21.4968 3.47173 21.7228L6.38208 24.6331C6.60821 24.8591 6.78758 25.1275 6.90993 25.4228C7.03229 25.7182 7.09524 26.0348 7.09518 26.3545V30.4717C7.095 30.7915 7.15785 31.1081 7.28013 31.4036C7.40241 31.699 7.58172 31.9675 7.80782 32.1936C8.03392 32.4197 8.30237 32.599 8.59781 32.7213C8.89326 32.8435 9.20991 32.9064 9.52967 32.9062H13.6469C13.9665 32.906 14.283 32.9687 14.5784 33.0908C14.8738 33.2129 15.1422 33.392 15.3683 33.6179L18.2786 36.5297C18.5046 36.7559 18.7729 36.9353 19.0683 37.0577C19.3637 37.1802 19.6803 37.2432 20 37.2432C20.3197 37.2432 20.6364 37.1802 20.9317 37.0577C21.2271 36.9353 21.4954 36.7559 21.7214 36.5297L24.6317 33.6193C24.8577 33.3932 25.1261 33.2138 25.4215 33.0915C25.7168 32.9691 26.0334 32.9061 26.3531 32.9062H30.4704C30.7901 32.9064 31.1068 32.8435 31.4022 32.7213C31.6977 32.599 31.9661 32.4197 32.1922 32.1936C32.4183 31.9675 32.5976 31.699 32.7199 31.4036C32.8422 31.1081 32.905 30.7915 32.9048 30.4717V26.3545C32.9046 26.0349 32.9673 25.7183 33.0895 25.423C33.2116 25.1276 33.3907 24.8592 33.6166 24.6331L36.5283 21.7228C36.7545 21.4968 36.9339 21.2284 37.0564 20.9331C37.1788 20.6377 37.2418 20.3211 37.2418 20.0014C37.2418 19.6816 37.1788 19.365 37.0564 19.0697C36.9339 18.7743 36.7545 18.506 36.5283 18.28V18.2786ZM28.189 14.8648L18.1545 26.9007C18.0319 27.0482 17.8799 27.1686 17.7082 27.2541C17.5365 27.3396 17.3489 27.3884 17.1573 27.3972H17.0952C16.7294 27.3972 16.3786 27.2518 16.12 26.9931L11.8952 22.7683C11.7634 22.641 11.6584 22.4888 11.5861 22.3206C11.5138 22.1523 11.4757 21.9713 11.4741 21.7881C11.4726 21.605 11.5075 21.4234 11.5768 21.2539C11.6462 21.0843 11.7486 20.9303 11.8781 20.8008C12.0076 20.6713 12.1616 20.5689 12.3311 20.4995C12.5006 20.4302 12.6822 20.3953 12.8654 20.3969C13.0485 20.3985 13.2295 20.4365 13.3978 20.5088C13.5661 20.5811 13.7183 20.6862 13.8455 20.8179L17.0041 23.9752L26.069 13.0993C26.3031 12.818 26.6394 12.6412 27.0039 12.6078C27.3683 12.5745 27.7311 12.6873 28.0124 12.9214C28.2937 13.1555 28.4705 13.4918 28.5039 13.8562C28.5373 14.2207 28.4231 14.5835 28.189 14.8648Z"
											fill="#047247" />
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Permitted Industries</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40"
										viewBox="0 0 24 24" fill="none">
										<g id="SVGRepo_bgCarrier" stroke-width="0"></g>
										<g id="SVGRepo_tracerCarrier" stroke-linecap="round"
											stroke-linejoin="round"></g>
										<g id="SVGRepo_iconCarrier"> <path
											d="M3.75 5C3.33579 5 3 5.33579 3 5.75V11C3 16.0012 5.95756 19.6757 11.7251 21.9478C11.9018 22.0174 12.0982 22.0174 12.2749 21.9478C12.4188 21.8911 12.561 21.8335 12.7014 21.7751C11.0651 20.5947 10 18.6717 10 16.5C10 12.9101 12.9101 10 16.5 10C18.2341 10 19.8095 10.679 20.975 11.7857C20.9917 11.5275 21 11.2656 21 11V5.75C21 5.33579 20.6642 5 20.25 5C17.5866 5 14.992 4.05652 12.45 2.15C12.1833 1.95 11.8167 1.95 11.55 2.15C9.00797 4.05652 6.41341 5 3.75 5Z"
											fill="#047247"></path> <path
											d="M16.5 22C19.5376 22 22 19.5376 22 16.5C22 13.4624 19.5376 11 16.5 11C13.4624 11 11 13.4624 11 16.5C11 19.5376 13.4624 22 16.5 22ZM13.1911 18.7482C12.755 18.1075 12.5 17.3335 12.5 16.5C12.5 14.2909 14.2909 12.5 16.5 12.5C17.3335 12.5 18.1075 12.755 18.7482 13.1911L13.1911 18.7482ZM14.2518 19.8089L19.8089 14.2518C20.245 14.8925 20.5 15.6665 20.5 16.5C20.5 18.7091 18.7091 20.5 16.5 20.5C15.6665 20.5 14.8925 20.245 14.2518 19.8089Z"
											fill="#047247"></path> </g>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Prohibited Industries</p>
								</div>
							</a>
						</div>
					</div>
				</div>
				<input type="hidden" id="sez-zone-user-option-value"
					name="sez-zone-user-option-value">
			</div>
		</div>
		<div class="row hide" id="sezApplicantStatus">
			<div class="col-md-12">
				<div class="row wizard-cards-list">
					<div class="col-md-12 pt-3">
			            <p class="common-section-small-heading">Applicant Status</p>
			        </div>
			        <div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M20 20C24.6754 20 28.5 16.1749 28.5 11.5C28.5 6.82509 24.6754 3 20 3C15.3246 3 11.5 6.82509 11.5 11.5C11.5 16.1749 15.3246 20 20 20ZM20 24.25C14.3689 24.25 3 27.1189 3 32.75V37H37V32.75C37 27.1189 25.6311 24.25 20 24.25Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Occupancy</p>
								</div>
							</a>
						</div>
					</div>
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M17.3645 24.3813C16.5835 22.0001 16.0147 19.5425 16.2736 18.0399C16.2736 18.0229 16.2779 18.0101 16.2822 17.9932C16.3161 17.8065 16.1166 17.6494 15.9341 17.7258C15.5393 17.8956 15.1743 18.129 14.8475 18.4092C13.625 19.4533 12.9161 21.1428 12.8865 22.7261C12.8779 22.968 13.1157 23.1378 13.4 23.1165L15.6454 22.9637L14.249 24.3814H17.3645V24.3813Z" fill="#047247"/>
										<path d="M13.4718 23.9616C12.6076 23.82 12.0144 23.5768 12.0371 22.701C12.0626 21.3087 12.5465 19.9122 13.3402 18.8087C11.2095 19.3646 9.38422 19.7213 9.23148 19.7213C7.2832 20.4726 6.42578 22.0643 6.42578 23.5923V24.3818H13.0516C13.2256 24.1993 13.3997 24.0635 13.4718 23.9616ZM21.7361 24.3818C22.3813 22.4718 22.8779 20.5363 22.9373 19.1354C21.3201 20.7867 18.6799 20.7909 17.0627 19.1354C17.1179 20.5363 17.6187 22.476 18.2597 24.3818H21.7361ZM27.963 22.7095C27.9862 23.5786 27.3827 23.822 26.5283 23.9616C26.6005 24.0677 26.7702 24.2036 26.9442 24.3818H33.5743V23.5882C33.5743 21.8266 32.4495 20.2816 30.7771 19.7213C30.7431 19.7128 28.502 19.1568 26.5622 18.6729C27.4196 19.7976 27.9375 21.2451 27.963 22.7095Z" fill="#047247"/>
										<path d="M27.1141 22.7265C27.0844 21.105 26.3416 19.3647 25.0597 18.329C24.7541 18.0871 24.4273 17.8791 24.0665 17.7262C23.884 17.6498 23.6844 17.8069 23.7184 17.9936C23.7227 18.0106 23.7269 18.0276 23.7312 18.0488C23.9816 19.5514 23.4128 22.0048 22.6318 24.3818H25.7516L24.3551 22.9641L26.6005 23.1169C26.8848 23.1382 27.1226 22.9684 27.1141 22.7265ZM14.5118 12.0019C14.5995 12.2452 14.1272 13.9474 17.1137 17.1422C18.6721 18.8066 21.339 18.8041 22.8949 17.1422C25.8899 13.9384 25.4116 12.2493 25.5011 12.0019C26.4512 12.0019 26.9486 10.8607 26.2821 10.1639C26.8424 8.92453 27.1608 7.58328 27.1608 6.29703C27.1608 2.23078 23.9561 0.316406 20.0001 0.316406C16.0526 0.316406 12.8479 2.2307 12.8479 6.29703C12.8479 7.58328 13.1662 8.92453 13.7265 10.1639C13.0598 10.8611 13.5587 12.0019 14.5118 12.0019ZM35.4019 25.2309H4.59796C3.78546 25.2309 3.21812 26.0357 3.49125 26.8009L7.81039 38.9036C7.97734 39.3714 8.42039 39.6837 8.91711 39.6837H31.0827C31.5794 39.6837 32.0225 39.3713 32.1894 38.9036L36.5086 26.8009C36.7817 26.0358 36.2144 25.2309 35.4019 25.2309ZM20.0001 34.6101C18.5366 34.6101 17.3494 33.9025 17.3494 33.0258C17.3494 32.1491 18.5366 31.4382 20.0001 31.4382C21.4635 31.4382 22.6508 32.1491 22.6508 33.0258C22.6508 33.9025 21.4635 34.6101 20.0001 34.6101Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Developer</p>
								</div>
							</a>
						</div>
					</div>
					
					<div class="col-lg-4">
						<div class="wizard-card">
							<a href="javascript:;">
								<div class="wizard-card-icon">
									<svg xmlns="http://www.w3.org/2000/svg" width="40" height="40" viewBox="0 0 40 40" fill="none">
										<path d="M20.0536 25.1024C22.7891 25.1024 25.0267 22.8645 25.0267 20.1293C25.0267 17.3942 22.7891 15.1562 20.0536 15.1562C17.3181 15.1562 15.0805 17.3942 15.0805 20.1293C15.0805 22.8645 17.3181 25.1024 20.0536 25.1024ZM20.0536 27.589C16.759 27.589 10.1074 29.2675 10.1074 32.5621V35.0486H29.9998V32.5621C29.9998 29.2675 23.3482 27.589 20.0536 27.589Z" fill="#047247"/>
										<path d="M21.6487 18.4072H17.8901V22.1658H21.6487V18.4072Z" fill="#047247"/>
										<path d="M11.7826 12.3186C10.7342 13.3658 9.90255 14.6094 9.33511 15.9783C8.76766 17.3471 8.47559 18.8144 8.47559 20.2962C8.47559 21.7781 8.76766 23.2453 9.33511 24.6142C9.90255 25.9831 10.7342 27.2267 11.7826 28.2739L14.4512 25.6241C13.7495 24.9256 13.1927 24.0953 12.8127 23.181C12.4327 22.2667 12.2371 21.2864 12.2371 20.2962C12.2371 19.3061 12.4327 18.3258 12.8127 17.4114C13.1927 16.4971 13.7495 15.6669 14.4512 14.9684L11.7826 12.3186ZM27.7567 28.2551C28.8051 27.2079 29.6368 25.9643 30.2042 24.5954C30.7717 23.2265 31.0637 21.7593 31.0637 20.2774C31.0637 18.7956 30.7717 17.3283 30.2042 15.9595C29.6368 14.5906 28.8051 13.347 27.7567 12.2998L25.0881 14.9496C25.7898 15.6481 26.3467 16.4783 26.7266 17.3927C27.1066 18.307 27.3022 19.2873 27.3022 20.2774C27.3022 21.2676 27.1066 22.2479 26.7266 23.1622C26.3467 24.0765 25.7898 24.9068 25.0881 25.6053L27.7567 28.2551Z" fill="#047247"/>
										<path d="M9.15216 30.9047C6.34053 28.0863 4.76154 24.2677 4.76154 20.2867C4.76154 16.3056 6.34053 12.4871 9.15216 9.66861L6.50234 7C2.97919 10.5242 1 15.3034 1 20.2867C1 25.2699 2.97919 30.0491 6.50234 33.5733L9.15216 30.9047ZM30.3883 9.66861C33.1999 12.4871 34.7789 16.3056 34.7789 20.2867C34.7789 24.2677 33.1999 28.0863 30.3883 30.9047L33.0381 33.5733C36.5612 30.0491 38.5404 25.2699 38.5404 20.2867C38.5404 15.3034 36.5612 10.5242 33.0381 7L30.3883 9.66861Z" fill="#047247"/>
									</svg>
								</div>
								<div class="wizard-card-content-box">
									<p class="wizard-title f2">Single Entity Developer</p>
								</div>
							</a>
						</div>
					</div>
				</div>
				<input type="hidden" id="applicantStatusVal" name="applicantStatusVal">
			</div>
		</div>
		<div class="row hide" id="sezTransactionTypeBox">
	        <div class="col-md-12 pt-3">
	            <p class="common-section-small-heading">Type of Transaction</p>
	        </div>
	        <div class="col-md-12">
	            <div class="row wizard-cards-list">
	                <div class="col-lg-4" id="sezNewBtn">
		                <div class="wizard-card">
		                    <a href="javascript:;">
		                        <div class="wizard-card-icon">
			                        <svg xmlns="http://www.w3.org/2000/svg" width="45" height="45" viewBox="0 0 40 40" fill="none">
										<path d="M5 6.25V33.75C5 34.7446 5.39509 35.6984 6.09835 36.4017C6.80161 37.1049 7.75544 37.5 8.75 37.5H23C22.886 37.4372 22.7754 37.3683 22.6688 37.2937C21.4642 36.496 20.4759 35.4124 19.7921 34.1397C19.1083 32.867 18.7503 31.4448 18.75 30C18.7489 29.3693 18.8181 28.7404 18.9562 28.125H9.375V26.875H19.3313C19.3938 26.7 19.4688 26.5312 19.5438 26.3562C20.1263 25.0927 21.0003 23.9853 22.0937 23.125H9.375V21.875H24.25C24.5974 21.7387 24.9521 21.6218 25.3125 21.525C26.0273 21.3421 26.7622 21.2497 27.5 21.25C27.9184 21.2501 28.3362 21.2815 28.75 21.3438L28.9563 21.375C29.3085 21.434 29.657 21.5133 30 21.6125V11.25H21.875C21.7092 11.25 21.5503 11.1842 21.4331 11.0669C21.3158 10.9497 21.25 10.7908 21.25 10.625V2.5H8.75C7.75544 2.5 6.80161 2.89509 6.09835 3.59835C5.39509 4.30161 5 5.25544 5 6.25ZM9.375 6.875H18.125V8.125H9.375V6.875ZM9.375 11.875H18.125V13.125H9.375V11.875ZM9.375 16.875H25.625V18.125H9.375V16.875Z" fill="#047247"/>
										<path d="M22.5 4.63105V9.9998H27.8688H29.6375L22.5 2.8623V4.63105Z" fill="#047247"/>
										<path d="M28.7502 22.6067C27.7109 22.4303 26.646 22.475 25.6252 22.7379C25.2407 22.8379 24.8646 22.9675 24.5002 23.1254C22.8117 23.8667 21.4532 25.2007 20.6814 26.8754C20.4983 27.2787 20.3499 27.6969 20.2377 28.1254C19.9674 29.171 19.9261 30.2626 20.1167 31.3256C20.3072 32.3885 20.7251 33.3978 21.3416 34.2844C21.9582 35.171 22.759 35.914 23.6892 36.4626C24.6194 37.0112 25.6572 37.3524 26.7314 37.4629C26.9814 37.4629 27.2377 37.5004 27.4939 37.5004C29.262 37.4989 30.9726 36.8728 32.324 35.7326C33.6753 34.5924 34.5803 33.0115 34.8793 31.2689C35.1784 29.5263 34.8521 27.7341 33.9583 26.2086C33.0644 24.6832 31.6603 23.5226 29.9939 22.9317C29.5903 22.785 29.1739 22.6762 28.7502 22.6067ZM31.8752 30.6254H28.1252V34.3754H26.8752V30.6254H23.1252V29.3754H26.8752V25.6254H28.1252V29.3754H31.8752V30.6254Z" fill="#047247"/>
									</svg>
		                        </div>
		                        <div class="wizard-card-content-box">
		                            <p class="wizard-title f2">New</p>
		                        </div>
		                    </a>
		                </div>
		            </div>
	                <div class="col-lg-4 sezRenewBtn">
	                    <div class="wizard-card">
	                        <a href="javascript:;">
	                            <div class="wizard-card-icon">
		                            <svg xmlns="http://www.w3.org/2000/svg" width="45" height="45" viewBox="0 0 40 40" fill="none">
										<path fill-rule="evenodd" clip-rule="evenodd" d="M36.6668 19.9997C36.6668 29.2043 29.2048 36.6663 20.0002 36.6663C10.7954 36.6663 3.3335 29.2043 3.3335 19.9997C3.3335 10.7949 10.7954 3.33301 20.0002 3.33301C29.2048 3.33301 36.6668 10.7949 36.6668 19.9997ZM13.6365 20.1512C13.6365 16.6406 16.4896 13.7876 20.0002 13.7876C21.0713 13.7876 22.0895 14.0527 22.9698 14.53L24.5183 12.9815C23.2138 12.1542 21.6653 11.6663 20.0002 11.6663C15.3123 11.6663 11.5153 15.4633 11.5153 20.1512H8.3335L12.5759 24.3937L16.8183 20.1512H13.6365ZM27.4243 15.9088L23.182 20.1512H26.3638C26.3638 23.6618 23.5108 26.5148 20.0002 26.5148C18.929 26.5148 17.9108 26.2497 17.0305 25.7723L15.482 27.3208C16.7865 28.1482 18.335 28.636 20.0002 28.636C24.688 28.636 28.485 24.839 28.485 20.1512H31.6668L27.4243 15.9088Z" fill="#047247"/>
									</svg>
	                            </div>
	                            <div class="wizard-card-content-box">
	                                <p class="wizard-title f2">Renewal</p>
	                            </div>
	                        </a>
	                    </div>
	                </div>
	                <div class="col-lg-4 sezRenewBtn">
	                    <div class="wizard-card">
	                        <a href="javascript:;">
	                            <div class="wizard-card-icon">
		                            <svg xmlns="http://www.w3.org/2000/svg" width="45" height="45" viewBox="0 0 40 40" fill="none">
										<path fill-rule="evenodd" clip-rule="evenodd" d="M36.6668 19.9997C36.6668 29.2043 29.2048 36.6663 20.0002 36.6663C10.7954 36.6663 3.3335 29.2043 3.3335 19.9997C3.3335 10.7949 10.7954 3.33301 20.0002 3.33301C29.2048 3.33301 36.6668 10.7949 36.6668 19.9997ZM13.6365 20.1512C13.6365 16.6406 16.4896 13.7876 20.0002 13.7876C21.0713 13.7876 22.0895 14.0527 22.9698 14.53L24.5183 12.9815C23.2138 12.1542 21.6653 11.6663 20.0002 11.6663C15.3123 11.6663 11.5153 15.4633 11.5153 20.1512H8.3335L12.5759 24.3937L16.8183 20.1512H13.6365ZM27.4243 15.9088L23.182 20.1512H26.3638C26.3638 23.6618 23.5108 26.5148 20.0002 26.5148C18.929 26.5148 17.9108 26.2497 17.0305 25.7723L15.482 27.3208C16.7865 28.1482 18.335 28.636 20.0002 28.636C24.688 28.636 28.485 24.839 28.485 20.1512H31.6668L27.4243 15.9088Z" fill="#047247"/>
									</svg>
	                            </div>
	                            <div class="wizard-card-content-box">
	                                <p class="wizard-title f2">Quarterly Report/Payment</p>
	                            </div>
	                        </a>
	                    </div>
	                </div>
	                <input type="hidden" id="typeTransactionTypeVal" name="typeTransactionTypeVal">
	           </div>
	        </div>
	    </div>
	    <div class="row hide" id="registrationCertificate"> 
       		<div class="col-md-12"> 
        			<div class="tab-plus-wizard wizard-section"> 
         			<div class="tab-form"> 
          				<div class="row"> 
           					<div class="col-md-12"> 
           						<div class="form-group"> 
			                <p class="tab-form-main-heading">Please Enter Control Number</p>
			                <input type="text" class="form-control" id="controlNumber" name="controlNumber" placeholder="Control Number" value="" oninput="this.value = this.value.replace(/[^0-9\/]/g, '').replace(/(\..*)\./g, '$1');"> 
			                <p class="tab-form-sub-heading">Separate values with Enter</p> 
						</div> 
					</div> 
					<div class="col-md-2"> 
							<button class="btn common-green-bg w-100" id="farm-renew-btn" onclick="renewLicense();" type="button">Submit</button> 
   							</div> 
  						</div> 
 					</div> 
					</div> 
			</div> 
		</div> 
	   
		<section class="hide" id="sezDevNumvalidate">
		<div class="commonsavepopup final-submit-container px-5">
			<div class="row">
				<div class="col-md-12">
					<p class="modal-title f1 text-center">Enter your SEZ Developer Number</p>
					<p class="modal-subtitle f2 text-center d-block">In this section you will provide your Sez Developer number.</p>
				</div>
			</div>
			<div class="row my-5">
				 <div class="col-md-7 offset-md-1">
					<div class="form-group">
						<p class="tab-form-main-heading">SEZ Developer Number</p>
						<input type="text" class="form-control" id="sezDevNumber"
							placeholder="Enter Sez Developer Number" value="" />
						<p class="tab-form-sub-heading fieldAlert hide" id="notSezDev" style="color:red">Please contact Your SEZ Developer to submit an application on Your Behalf.</p>
					</div>
				</div>
				<div class="col-md-2">
					<div class="form-group">
						<p class="tab-form-main-heading invisible">Submit button</p>
						<button type="button" onclick="settingDevNumber();" class="btn common-green-bg w-100 sez-dev-submit-btn">Submit</button>
					</div>
				</div>
				<div class="col-md-2">
					<div class="form-group">
						<p class="tab-form-main-heading invisible">Back button</p>
						<button type="button" class="btn common-yellow-bg w-100 sez-dev-back-btn">Back</button>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section class="hide" id="sezRenewSection">
		<hr>
		<div class="row">
			<div class="col-md-12">
				<div class="tab-plus-wizard wizard-section">
					<div class="tab-form">
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Please Enter Licence
										Number</p>
									<input type="text" class="form-control"
										id="renew-licence-number" placeholder="Licence Number"
										value=""
										oninput="this.value = this.value.replace(/[^0-9\/]/g, '').replace(/(\..*)\./g, '$1');">
									<p class="tab-form-sub-heading hide"
										id="renewLicenseNumbervalidation" style="color: red;">Please
										Enter Valid Licence Number</p>
								</div>
							</div>
							<div class="col-md-2">
								<button class="btn common-green-bg w-100"
									id="sez-renew-btn" onclick="renewLicense();" type="button">Submit</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<section class="hide" id="sezOccRenewSection">
		<hr>
		<div class="row">
			<div class="col-md-12">
				<div class="tab-plus-wizard wizard-section">
					<div class="tab-form">
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Please Enter Licence
										Number</p>
									<input type="text" class="form-control"
										id="occ-renew-licence-number" placeholder="Licence Number"
										value=""
										oninput="this.value = this.value.replace(/[^0-9\/]/g, '').replace(/(\..*)\./g, '$1');">
									<p class="tab-form-sub-heading hide"
										id="renewLicenseNumbervalidationOcc" style="color: red;">Please
										Enter Valid Licence Number</p>
								</div>
							</div>
							<div class="col-md-2">
								<button class="btn common-green-bg w-100"
									id="sez-occ-renew-btn" onclick="renewLicenseOcc();" type="button">Submit</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	
	<section class="hide" id="sezZoneRenewSection">
		<hr>
		<div class="row">
			<div class="col-md-12">
				<div class="tab-plus-wizard wizard-section">
					<div class="tab-form">
						<div class="row">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Please Enter Licence
										Number</p>
									<input type="text" class="form-control"
										id="zone-renew-licence-number" placeholder="Licence Number"
										value=""
										oninput="this.value = this.value.replace(/[^0-9\/]/g, '').replace(/(\..*)\./g, '$1');">
									<p class="tab-form-sub-heading hide"
										id="renewLicenseNumbervalidationZone" style="color: red;">Please
										Enter Valid Licence Number</p>
								</div>
							</div>
							<div class="col-md-2">
								<button class="btn common-green-bg w-100"
									id="sez-zone-renew-btn" onclick="renewLicenseZone();" type="button">Submit</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
     <%@ include file="/sez-status-wizard-buttons.jsp" %>
</fieldset>