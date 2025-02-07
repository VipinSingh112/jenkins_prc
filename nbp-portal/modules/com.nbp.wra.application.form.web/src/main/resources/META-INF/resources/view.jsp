<%@ include file="/init.jsp" %>
<%@ include file="/wra-wizard.jsp" %>
<%@ include file="/js/wra-all-forms-save.jsp"%>
<portlet:resourceURL var="wraApplicationGettingDocumentList" id="/wra/application/getting/document/list"></portlet:resourceURL>
<portlet:resourceURL var="pendingWraApplicationUrl" id="/wra/application/pending"></portlet:resourceURL>
<portlet:resourceURL var="addWraUploadDocumentUrl" id="/add/Wra/Upload/Document/Url"></portlet:resourceURL>
<portlet:resourceURL var="deletedocumentUrl" id="/delete/document/Url"></portlet:resourceURL>
<portlet:resourceURL var="submitWraApplicationUrl" id="/submit/Wra/Application/Url"></portlet:resourceURL>


<div class="modal fade commonsavepopup savecountinuePopup" data-keyboard="false" tabindex="-1"
    aria-labelledby="staticBackdropLabel" aria-hidden="true" style="display:none;">
    <div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm">
        <div class="modal-content">
        	<div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
            </div>
            <div class="modal-pic">
                <img src="<%=themeDisplay.getPathThemeImages()%>/popup.png" class="img-fluid" />
            </div>
            <div class="modal-body">
                <div class="row">
                    <div class="col-md-12">
                        <p class="modal-title f1">Application saved as draft</p>
                        <p class="modal-subtitle f2">Your application for WRA has been correctly saved as draft.</p>
                        <p class="modal-info f2">
                            You will be able to continue your application process at any moment. You can find the draft
                            in
                            <a href="/group/guest/dashboard">your Dashboard:</a>
                        </p>
                    </div>
                    <div class="col-md-12">
                        <div class="cards-wrapper">
                            <div class="row">
                                <div class="col-lg-5 d-flex justify-content-center">
                                    <div class="licence-box ml-2">
                                        <div class="left">
											<svg xmlns="http://www.w3.org/2000/svg" width="36" height="42" viewBox="0 0 220 220" fill="none">
												<path d="M18.3312 63.6101C18.9969 63.6095 18.9969 63.6095 19.676 63.609C21.1283 63.6107 22.5799 63.6295 24.0321 63.6486C25.0447 63.6531 26.0573 63.6566 27.0699 63.659C29.7241 63.6682 32.378 63.692 35.0321 63.7189C37.7448 63.7438 40.4576 63.7548 43.1704 63.767C48.4851 63.793 53.7995 63.8343 59.114 63.8855C59.4628 64.7468 59.4628 64.7468 59.8186 65.6256C60.1357 66.3913 60.453 67.157 60.7705 67.9225C60.9982 68.488 60.9982 68.488 61.2305 69.065C63.7782 75.1577 68.3498 79.3227 74.259 82.0804C80.7689 84.522 87.6033 84.1654 94.4397 84.1416C95.6886 84.1428 96.9376 84.1446 98.1865 84.1468C100.793 84.1495 103.4 84.1457 106.007 84.1371C109.331 84.1268 112.655 84.1327 115.979 84.1436C118.555 84.1502 121.131 84.1481 123.707 84.1434C124.932 84.1422 126.156 84.1436 127.381 84.1479C137.496 84.1754 146.183 83.6331 154.073 76.5461C157.393 73.0262 159.129 68.3244 160.888 63.8855C166.739 63.8292 172.59 63.7861 178.441 63.7598C181.158 63.7472 183.875 63.73 186.592 63.7025C189.215 63.676 191.839 63.6616 194.463 63.6553C195.462 63.6508 196.462 63.6421 197.461 63.629C198.864 63.6113 200.267 63.609 201.671 63.6101C202.469 63.6047 203.267 63.5993 204.089 63.5938C207.192 63.9988 209.424 64.9278 211.41 67.3393C213.42 70.395 214.031 72.6521 213.969 76.2814C213.973 76.7734 213.977 77.2653 213.981 77.7722C213.99 79.4085 213.978 81.0439 213.966 82.6801C213.968 83.858 213.971 85.0359 213.976 86.2139C213.984 89.4042 213.974 92.5942 213.96 95.7846C213.948 99.1258 213.951 102.467 213.953 105.808C213.953 111.418 213.941 117.027 213.921 122.636C213.899 129.12 213.894 135.604 213.898 142.087C213.902 148.328 213.895 154.569 213.883 160.81C213.878 163.465 213.877 166.119 213.878 168.774C213.878 171.899 213.87 175.025 213.854 178.15C213.85 179.296 213.848 180.443 213.85 181.59C213.853 183.155 213.844 184.721 213.832 186.286C213.835 186.739 213.838 187.193 213.842 187.66C213.792 191.493 212.804 193.859 210.11 196.557C205.776 199.56 201.402 199.309 196.297 199.293C195.531 199.295 194.764 199.297 193.974 199.3C191.853 199.306 189.732 199.305 187.611 199.302C185.321 199.3 183.03 199.306 180.74 199.31C176.256 199.318 171.772 199.319 167.287 199.318C163.642 199.317 159.996 199.318 156.351 199.32C155.572 199.321 155.572 199.321 154.778 199.322C153.723 199.322 152.669 199.323 151.614 199.324C141.727 199.33 131.841 199.329 121.954 199.325C112.912 199.322 103.871 199.329 94.8294 199.341C85.5418 199.352 76.2542 199.357 66.9666 199.355C61.7539 199.354 56.5412 199.355 51.3285 199.364C46.8908 199.371 42.4531 199.372 38.0154 199.365C35.7522 199.361 33.4892 199.36 31.226 199.368C28.7702 199.376 26.3147 199.369 23.8589 199.361C23.1469 199.366 22.435 199.37 21.7015 199.375C17.298 199.346 12.9121 199.12 9.34378 196.273C9.07514 195.916 8.80651 195.56 8.52974 195.192C8.24861 194.836 7.96748 194.479 7.67783 194.112C6.14502 191.7 6.31801 189.253 6.3162 186.505C6.31355 186.016 6.31089 185.528 6.30816 185.025C6.30005 183.382 6.2963 181.739 6.29259 180.097C6.28781 178.921 6.2828 177.746 6.27758 176.57C6.2617 172.705 6.25243 168.839 6.24379 164.974C6.24054 163.644 6.23728 162.313 6.23401 160.983C6.22091 155.448 6.20956 149.914 6.20274 144.38C6.1929 136.448 6.17281 128.516 6.13828 120.583C6.11484 115.007 6.10301 109.43 6.0998 103.853C6.09759 100.522 6.09031 97.1914 6.07066 93.8604C6.05244 90.7256 6.04862 87.5912 6.05575 84.4564C6.05588 83.3073 6.05085 82.1581 6.04021 81.0091C6.02644 79.4369 6.0315 77.8658 6.04111 76.2936C6.0327 75.8418 6.02429 75.3899 6.01562 74.9243C6.06785 71.4435 7.22813 68.9932 9.43844 66.3115C12.1435 64.0035 14.8393 63.5865 18.3312 63.6101ZM28.2182 108.16C27.6637 110.063 27.4478 111.26 28.0289 113.163C29.026 114.494 29.6907 114.837 31.2472 115.438C33.259 115.634 33.259 115.634 35.5338 115.624C36.1741 115.631 36.1741 115.631 36.8272 115.639C38.2353 115.654 39.6431 115.659 41.0513 115.663C42.032 115.668 43.0128 115.674 43.9936 115.679C46.0484 115.689 48.1031 115.694 50.1579 115.696C52.7886 115.699 55.4188 115.722 58.0494 115.75C60.0747 115.768 62.0999 115.772 64.1252 115.773C65.095 115.775 66.0648 115.783 67.0344 115.795C68.3919 115.812 69.7481 115.809 71.1056 115.801C72.263 115.806 72.263 115.806 73.4438 115.811C76.0109 115.338 76.904 114.432 78.4996 112.405C79.0045 110.586 79.0045 110.586 78.4996 108.766C76.8972 106.727 76.0004 105.832 73.4208 105.353C72.6384 105.352 71.8561 105.352 71.05 105.351C70.3993 105.345 70.3993 105.345 69.7355 105.338C68.3078 105.328 66.8813 105.339 65.4536 105.352C64.4587 105.352 63.4637 105.35 62.4688 105.348C60.3864 105.346 58.3044 105.355 56.2221 105.372C53.554 105.392 50.8866 105.389 48.2185 105.377C46.1651 105.371 44.1119 105.376 42.0585 105.386C41.0748 105.389 40.091 105.388 39.1072 105.385C37.7323 105.381 36.3584 105.394 34.9836 105.41C33.8108 105.416 33.8108 105.416 32.6143 105.422C30.3077 105.787 29.5979 106.308 28.2182 108.16ZM172.701 125.386C172.043 126.046 171.384 126.706 170.726 127.366C169.007 129.089 167.291 130.813 165.575 132.538C163.817 134.304 162.058 136.068 160.299 137.832C156.859 141.283 153.421 144.735 149.984 148.189C148.259 147.407 147.041 146.597 145.731 145.233C145.391 144.883 145.051 144.533 144.701 144.172C144.341 143.796 143.98 143.419 143.609 143.031C142.833 142.236 142.057 141.441 141.28 140.647C140.064 139.394 138.849 138.14 137.64 136.881C136.468 135.664 135.288 134.457 134.105 133.251C133.747 132.874 133.39 132.496 133.021 132.106C131.356 130.419 130.328 129.49 128.025 128.786C126.281 128.649 126.281 128.649 124.654 129.69C122.868 131.734 122.542 132.731 122.723 135.452C123.499 136.618 123.499 136.618 124.565 137.727C124.952 138.151 125.34 138.575 125.739 139.012C127.658 141.037 129.602 143.032 131.576 145.002C131.997 145.425 132.419 145.847 132.853 146.282C133.734 147.165 134.616 148.047 135.499 148.929C136.855 150.283 138.207 151.64 139.559 152.997C140.419 153.857 141.279 154.718 142.139 155.578C142.544 155.984 142.948 156.39 143.365 156.809C143.739 157.182 144.114 157.555 144.499 157.939C144.828 158.267 145.157 158.596 145.496 158.935C146.851 160.169 147.649 160.33 149.505 160.576C152.602 160.229 153.723 158.989 155.832 156.813C156.21 156.44 156.588 156.068 156.977 155.684C158.221 154.451 159.448 153.204 160.675 151.956C161.536 151.093 162.398 150.232 163.261 149.371C165.065 147.565 166.861 145.753 168.653 143.935C170.949 141.605 173.26 139.292 175.577 136.985C177.358 135.208 179.132 133.423 180.903 131.637C181.752 130.781 182.604 129.927 183.458 129.076C184.65 127.884 185.832 126.683 187.012 125.479C187.366 125.129 187.719 124.779 188.084 124.419C190.095 122.341 191.136 120.893 191.178 117.864C189.998 115.648 189.128 114.975 186.786 114.073C181.256 114.442 176.489 121.574 172.701 125.386ZM27.6124 134.846C27.6124 137.046 27.7385 138.436 29.0512 140.228C31.4616 141.899 34.1137 141.607 36.9146 141.605C37.6891 141.608 37.6891 141.608 38.4793 141.611C40.1885 141.617 41.8977 141.618 43.607 141.619C44.7938 141.621 45.9806 141.623 47.1675 141.625C49.6562 141.629 52.1449 141.63 54.6337 141.63C57.8245 141.63 61.0153 141.638 64.2061 141.648C66.6575 141.655 69.1089 141.656 71.5604 141.656C72.7369 141.657 73.9134 141.659 75.0899 141.664C76.7345 141.67 78.3789 141.668 80.0234 141.665C80.7538 141.67 80.7538 141.67 81.499 141.675C84.7437 141.681 84.7437 141.681 87.5866 140.304C89.0892 138.048 89.0789 136.909 88.7982 134.239C87.9477 132.806 87.9477 132.806 86.375 131.813C84.5215 131.571 82.8855 131.475 81.0318 131.49C80.4927 131.484 79.9536 131.479 79.3982 131.474C77.6163 131.46 75.8351 131.464 74.0531 131.47C72.8143 131.467 71.5755 131.463 70.3366 131.458C67.7399 131.452 65.1434 131.455 62.5466 131.464C59.2192 131.474 55.8923 131.46 52.5649 131.438C50.0064 131.425 47.448 131.426 44.8895 131.431C43.6627 131.432 42.436 131.427 41.2093 131.418C39.4934 131.408 37.7788 131.417 36.063 131.43C35.3033 131.42 35.3033 131.42 34.5283 131.409C31.2328 131.463 29.6452 132.028 27.6124 134.846ZM28.824 159.106C27.4033 160.855 27.4033 160.855 27.6882 163.048C28.0152 165.158 28.0152 165.158 29.2891 166.198C30.82 167.095 31.6637 167.22 33.4234 167.225C34.2565 167.234 34.2565 167.234 35.1065 167.243C36.0139 167.239 36.0139 167.239 36.9396 167.235C37.9004 167.241 37.9004 167.241 38.8806 167.248C40.9996 167.259 43.1184 167.257 45.2374 167.253C46.7086 167.256 48.1798 167.259 49.651 167.263C52.7351 167.268 55.819 167.267 58.9031 167.261C62.8594 167.254 66.8153 167.266 70.7716 167.284C73.8097 167.295 76.8478 167.295 79.8859 167.291C81.3448 167.291 82.8037 167.295 84.2626 167.302C86.3004 167.311 88.3376 167.305 90.3754 167.294C90.9804 167.3 91.5853 167.306 92.2086 167.312C95.4384 167.309 95.4384 167.309 98.2599 165.891C99.497 163.93 99.4204 162.586 99.0968 160.319C97.9657 158.884 97.0852 158.099 95.462 157.286C94.6169 157.227 93.769 157.204 92.9219 157.201C92.3894 157.198 91.8568 157.194 91.3082 157.19C90.4297 157.189 90.4297 157.189 89.5334 157.188C88.9177 157.185 88.302 157.182 87.6676 157.179C85.6236 157.17 83.5797 157.166 81.5357 157.163C80.1186 157.159 78.7014 157.156 77.2843 157.152C74.3096 157.146 71.335 157.143 68.3603 157.14C64.5467 157.137 60.7333 157.123 56.9198 157.105C53.9913 157.094 51.0628 157.091 48.1343 157.09C46.7283 157.088 45.3223 157.083 43.9164 157.075C41.9497 157.065 39.9834 157.066 38.0168 157.07C37.4348 157.064 36.8528 157.059 36.2532 157.053C33.2952 157.072 31.1924 157.121 28.824 159.106Z" fill="#047247"/>
												<path d="M122.338 20.9627C127.147 24.881 130.424 29.3678 131.147 35.6284C131.197 36.4122 131.247 37.196 131.299 38.0036C132.05 38.0285 132.802 38.0534 133.577 38.079C139.425 38.7557 144.262 41.733 147.931 46.2248C149.968 49.1834 151.591 52.5 151.954 56.1001C152.011 56.6506 152.011 56.6506 152.07 57.2123C152.394 62.9497 150.725 68.3353 146.942 72.6885C142.661 76.9878 138.212 79.7259 131.972 79.8024C131.524 79.8019 131.076 79.8013 130.615 79.8008C130.133 79.8048 129.651 79.8089 129.155 79.8131C127.57 79.8245 125.985 79.8269 124.4 79.8282C123.291 79.8321 122.182 79.8361 121.072 79.8403C118.748 79.8476 116.424 79.8498 114.1 79.8491C111.137 79.849 108.174 79.8654 105.211 79.8862C102.92 79.8997 100.628 79.9021 98.3362 79.9014C97.2447 79.9028 96.1531 79.9081 95.0616 79.9175C86.4666 79.9845 80.0776 79.3497 73.6429 73.1221C69.8055 69.0843 68.1085 64.3218 67.8906 58.7769C68.1632 52.45 70.9379 46.9248 75.5983 42.6408C79.6284 39.4747 83.7071 38.323 88.7735 38.0036C88.8189 37.551 88.8643 37.0985 88.9111 36.6322C89.7958 29.7939 92.4103 25.2999 97.7412 20.8873C104.738 15.8434 115.341 16.0418 122.338 20.9627ZM102.29 31.7452C100.553 34.0076 99.8295 36.3786 99.7085 39.21C100.221 42.7452 102.001 44.7859 104.739 46.9741C107.131 48.534 109.704 48.5398 112.466 48.2583C115.469 47.2058 117.501 45.5269 119.149 42.8293C120.38 40.1954 120.558 38.0188 119.794 35.2137C118.684 32.3572 116.867 30.5846 114.289 28.9553C109.508 27.3732 105.889 28.3341 102.29 31.7452Z" fill="#047247"/>
											</svg>
                                        </div>
                                        <div class="right pl-2">
                                            <p class="licence-title f2">WRA<br> Transaction Number</p>
                                            <p class="licence-number f2" id="pop_app_no"></p>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-4 d-flex justify-content-center">
                                    <div class="tier-box">
                                        <p class="tier-box-upper f2">Type of Application</p>
                                        <p class="tier-box-upper f2" id="pop_category"></p>
                                    </div>
                                </div>
                                <div class="col-lg-3 d-flex justify-content-center">
                                    <div class="status-box">
                                        <p class="tier-box-upper f2">
                                            Status
                                        </p>
                                        <a href="" class="draftlink f2" id="pop_status">Draft</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-12">
                        <div class="footer-above-border"></div>
                    </div>
                </div>
            </div>
            <div class="modal-footer border-0 d-flex justify-content-between">
                <div><a href="/home" class="text-dark common-nav-links text-white popup-home hidePopup">
                        <span class="mr-2"><svg width="16" height="16" viewBox="0 0 16 16" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z" fill="#282524" />
                            </svg>
                        </span>Go back to the Homepage</a>
                </div>
                <div>
                    <a href="/group/guest/dashboard" data-senna-off="true" class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard ">
                        Continue to your dashboard<span class="ml-2">
                            <svg width="22" height="17" viewBox="0 0 22 17" fill="none"
                                xmlns="http://www.w3.org/2000/svg">
                                <path
                                    d="M20 5C18.55 5 17.74 6.44 18.07 7.51L14.52 11.07C14.22 10.98 13.78 10.98 13.48 11.07L10.93 8.52C11.27 7.45 10.46 6 9 6C7.55 6 6.73 7.44 7.07 8.52L2.51 13.07C1.44 12.74 0 13.55 0 15C0 16.1 0.9 17 2 17C3.45 17 4.26 15.56 3.93 14.49L8.48 9.93C8.78 10.02 9.22 10.02 9.52 9.93L12.07 12.48C11.73 13.55 12.54 15 14 15C15.45 15 16.27 13.56 15.93 12.48L19.49 8.93C20.56 9.26 22 8.45 22 7C22 5.9 21.1 5 20 5Z"
                                    fill="#1B1917" />
                                <path d="M14 6L14.94 3.93L17 3L14.94 2.07L14 0L13.08 2.07L11 3L13.08 3.93L14 6Z"
                                    fill="#1B1917" />
                                <path d="M2.5 8L3 6L5 5.5L3 5L2.5 3L2 5L0 5.5L2 6L2.5 8Z" fill="#323232" />
                            </svg>

                        </span>
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- WFH MODAL -->
<div class="modal fade commonsavepopup editWaterIrrigationDetailPopup tab-plus-wizard "
	data-keyboard="false" tabindex="-1"
	aria-labelledby="staticBackdropLabel" aria-hidden="true"
	style="display: none;">
	<div class="modal-dialog modal-dialog-centered my-0 modal-dialog-sm tab-form">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
			</div>
			<!-- <div class="modal-pic">
			</div> -->
			<div class="modal-body">
				<div class="row">
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">a. </span>Area and crop type to be irrigated</p>
							<input type="text" class="form-control editAbstractAreaIrrigated" placeholder="" value="<%-- <%=wraAbstractInfo!=null?wraAbstractInfo.getAreaAndCropType():StringPool.BLANK%> --%>" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="form-group">
							<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">b. </span>System of irrigation</p>
							<input type="text" class="form-control editAbstractSystemIrrigation" placeholder="" value="<%-- <%=wraAbstractInfo!=null?wraAbstractInfo.getSystemOfIrrigation():StringPool.BLANK%> --%>" />
						</div>
					</div>
					<div class="col-md-12">
						<div class="footer-above-border"></div>
					</div>
				</div>
			</div>
			<div class="modal-footer border-0 d-flex justify-content-between">
				<div>
					<a href="javascript:void(0)"
						class="text-dark common-nav-links text-white popup-home hidePopup">
						<span class="mr-2"><svg width="16" height="16"
								viewBox="0 0 16 16" fill="none"
								xmlns="http://www.w3.org/2000/svg">
                                <path
									d="M16 7H3.83L9.42 1.41L8 0L0 8L8 16L9.41 14.59L3.83 9H16V7Z"
									fill="#282524" />
                            </svg> </span>Cancel
					</a>
				</div>
				<div>
					<a href="javascript:void(0)" data-senna-off="true"
						class="common-yellow-bg text-dark common-nav-links text-white popup-dashboard hidePopup saveEditWaterIrrigationDetailPopupDataBtn">
						Save<span class="ml-2">
					</span>
					</a>
					<span class="ml-3"> 
						<svg width="16" height="16" viewBox="0 0 16 16" fill="none" xmlns="http://www.w3.org/2000/svg">
							<path d="M8 0L6.59 1.41L12.17 7H0V9H12.17L6.59 14.59L8 16L16 8L8 0Z" fill="#FAFAF9" />
						</svg>
					</span>
				</div>
			</div>
		</div>
	</div>
</div>
<script>
/* save and continue */
$(document).ready(function () {
	continueApplicationForm();
	
});

$(".hidePopup").click(function () {
	  $("#commonsavepopup").modal("hide");
	  $(".editWaterIrrigationDetailPopup").modal("hide");
});

function continueApplicationForm(){
	var wraApplicationId = "<%=wraApplicationId%>";
	if(wraApplicationId > 0 ){
		showSelectedCategory();
		showLastFormStep();
		continueEditFormDetails();

	}
}
function showLastFormStep(){
	var currentStage = "<%=currentStage %>";
	$( ".form-wizard-header .application-form-lower-heading" ).each( function( index, element ){
	    if($(this).text() == currentStage ){
	    	$(this).parents("li").addClass("active");
	    	$(this).parents("li").prevAll().removeClass("active");
	    	$(this).parents("li").prevAll().addClass("activated");
	    }
	});
	
	$( ".form-wizard fieldset" ).each( function( index, element ){
        if($(this).attr("name") == currentStage ){
	    	$(this).addClass("show");
	    	$(this).prevAll().removeClass("show");
    	}
	});
}
function showSelectedCategory(){
	currentStage = "<%=currentStage%>";
	lastFormStep = "<%=lastFormStep%>";
	typeOfApplication="<%=typeOfApplication%>";
	typeOfTransaction="<%=typeOfTransaction%>";
	typeOfPermit="<%=typeOfPermit%>";
	typeOfTransacPermit="<%=typeOfTransacPermit%>";
	userWaterTypeCategories="<%=userWaterTypeCategories%>";
	consumptiveSubCategories="<%=consumptiveSubCategories%>";
	nonConsumptiveSubCategories="<%=nonConsumptiveSubCategories%>";
	industrialTypeSubCategories="<%=industrialTypeSubCategories%>";
	paymentMethod="<%=paymentMethod%>";
	amountPaidq="<%=amountPaidq%>";
	methodOfPaymentq="<%=methodOfPaymentq%>";
	sizeOfWaterReqIrrAdd = "<%=sizeOfWaterReqIrrAdd%>";
	
	$("#wraApplicationId").val(<%=wraApplicationId%>);
	$("#applicationTypeVal").val(typeOfApplication);
	if(typeOfApplication=="Application for a Licence to Abstract & User Water"||typeOfApplication=="Application for a Licence to Abstract &amp; User Water"){
		$("#transactionTypeVal").val(typeOfTransaction);
	}else if(typeOfApplication=="Application for a Well Drillers Licence"){
		$("#wraLicenceTransactionTypeVal").val(typeOfTransaction);
	}
	$("#drillPermitTypeVal").val(typeOfPermit);
	$("#wraPermitTransactionTypeVal").val(typeOfTransacPermit);
	$("#userWaterTypeCategoriesVal").val(userWaterTypeCategories);
	$("#consumptiveSubCategoriesVal").val(consumptiveSubCategories);
	$("#nonConsumptiveSubCategoriesVal").val(nonConsumptiveSubCategories);
	if(consumptiveSubCategories=="Industrial"){
		$("#industrialTypeSubCategoriesVal").val(industrialTypeSubCategories);
	}else if(consumptiveSubCategories=="Domestic"){
		$("#domesticTypeSubCategoriesVal").val(industrialTypeSubCategories);
	}else if(consumptiveSubCategories=="Agriculture"){
		$("#agricultureTypeSubCategoriesVal").val(industrialTypeSubCategories);
	}
	$("#payment-method").val(paymentMethod);
	
	gettingDocumentList();
	/*Type of application*/
	if(typeOfApplication !=""){
		  	
		$("#applicationType").removeClass("hide");
		$("#applicationType .wizard-title").each(function( index, element ){
		    if($(this).text() == typeOfApplication){
		    	$(this).closest('.wizard-card').addClass("active");
		    	//$(this).closest("a").click();
		    	}
			 });
	      }
		  if(typeOfApplication == "Application for a Licence to Abstract & User Water"||typeOfApplication=="Application for a Licence to Abstract &amp; User Water"){
			  	
			  $(this).addClass("active");
				  $("#userWaterType").removeClass("hide");
					$("#userWaterType .wizard-title").each(function( index, element ){
					    if($(this).text() == typeOfTransaction){
					    	$(this).closest('.wizard-card').addClass("active");
					    	$(this).closest("a").click();
					    	}
						 });
				/* 	$(".water-resources-forms").removeClass("hide");
					$(".water-resources-forms-details").removeClass("hide");
					$(".water-resources-forms-preview").removeClass("hide"); */
					if(typeOfTransaction=="New Licence"){
						$("#userWaterTypeCategories").removeClass("hide");	
						$("#userWaterTypeCategories .wizard-title").each(function( index, element ){
						    if($(this).text() == userWaterTypeCategories){
						    	$(this).closest('.wizard-card').addClass("active");
						    	$(this).closest("a").click();
						    	}
							 });
						$(".water-resources-forms").removeClass("hide");
						$(".water-resources-forms-details").removeClass("hide");
						$(".water-resources-forms-preview").removeClass("hide");
						$(".wraFacilitiesFee").html("15,000");
					}else if(typeOfTransaction=="Licence Renewal"){
						  $(".water-resources-renew-forms").removeClass("hide");
						  $("#abstractWaterUser").removeClass("hide");
						  $(".wraFacilitiesFee").html("30,000");
						  
					  }
					if(userWaterTypeCategories=="Consumptive"){
						$("#consumptiveSubCategories").removeClass("hide");
						$("#consumptiveSubCategories .wizard-title").each(function( index, element ){
						    if($(this).text() == consumptiveSubCategories){
						    	$(this).closest('.wizard-card').addClass("active");
						    	$(this).closest("a").click();
						    	}
							 });
						if(consumptiveSubCategories=="Industrial"){
							$("#industrialTypeSubCategories").removeClass("hide");
							$("#industrialTypeSubCategories .wizard-title").each( function( index, element ){
							    if($(this).text() == industrialTypeSubCategories){
							    	$(this).closest('.wizard-card').addClass("active");
							    	$(this).closest("a").click();
							    	}
								  });
						}else if(consumptiveSubCategories=="Domestic"){
							$("#domesticTypeSubCategories").removeClass("hide");
							$("#domesticTypeSubCategories .wizard-title").each( function( index, element ){
							    if($(this).text() == industrialTypeSubCategories){
							    	$(this).closest('.wizard-card').addClass("active");
							    	$(this).closest("a").click();
							    	}
								  });
						}else if(consumptiveSubCategories=="Agriculture"){
							$("#agricultureTypeSubCategories").removeClass("hide");
							$("#agricultureTypeSubCategories .wizard-title").each( function( index, element ){
							    if($(this).text() == industrialTypeSubCategories){
							    	$(this).closest('.wizard-card').addClass("active");
							    	$(this).closest("a").click();
							    	}
								  });
						}
					}else if(userWaterTypeCategories=="Non-Consumptive"){
						$("#nonConsumptiveSubCategories").removeClass("hide");
						$("#nonConsumptiveSubCategories .wizard-title").each(function(index, element){
						    if($(this).text() == nonConsumptiveSubCategories){
						    	$(this).closest('.wizard-card').addClass("active");
						    	$(this).closest("a").click();
						    	}
							  });
					}
					if(sizeOfWaterReqIrrAdd>0){
						var counterOffWaterReqIrrAdd=parseInt(sizeOfWaterReqIrrAdd)+1;
						$(".addWaterIrrigationDetailTableBox").removeClass("hide");
						$("#waterIrrigationVal").val(counterOffWaterReqIrrAdd);
					}
					$("#payment_category").html("Licence to Abstract & User Water");
			}
			if(typeOfApplication == "Application for a Permit to Drill a Well"){
				$(this).addClass("active");
				$("#drillPermitType").removeClass("hide");
				$(".water-permit-drilling-forms").removeClass("hide");
			    $(".water-permit-drilling-forms-details").removeClass("hide");
				$(".water-permit-drilling-forms-preview").removeClass("hide");
				$(".wraFacilitiesFee").html("15,000");
				
				   $("#drillPermitType .wizard-title").each( function( index, element ){
				    if($(this).text() == typeOfPermit){
				    	$(this).closest(".wizard-card").trigger("click");
				    	}
					  });
				   $("#wraPermitTransactionTypeBox").removeClass("hide");
				
				   $("#wraPermitTransactionTypeBox .wizard-title").each( function( index, element ){
					    if($(this).text() == typeOfTransacPermit){
					    	$(this).closest(".wizard-card").trigger("click");
					    	}
						  });
			   if(typeOfPermit=="Permit to Alter an Existing Well"){
				   $("#wraPermitTransactionTypeBox").addClass("hide");
			   }
				
					
			   $("#payment_category").html("Permit to Drill a Well");
			}
			
			if(typeOfApplication == "Application for a Well Drillers Licence"){
				
				$(".water-well-drilling-forms").removeClass("hide");
				$(".water-well-drilling-forms-details").removeClass("hide");
				$(".water-well-drilling-forms-preview").removeClass("hide");
				$(".wraFacilitiesFee").html("15,000");
				$(this).addClass("active");
				$("#wraNewBtn").removeClass("hide");
				$("#wraLicenceTransactionTypeBox").removeClass("hide");
				 $("#wraLicenceTransactionTypeBox .wizard-title").each( function( index, element ){
				    if(($(this).text() == "New Licence" )||($(this).text() == "Licence Renewal" )){
				    	$(this).closest('.wizard-card').addClass("active");
				    	$(this).closest("a").click();
				    	}
				  	});
				 $("#payment_category").html("Well Drillers Licence");
			}
	
	 /* if(typeOfTransaction !=""){
		 if((typeOfApplication=="Application for a Licence to Abstract & User Water")
				 ||(typeOfApplication=="Application for a Licence to Abstract &amp; User Water")){
			
			 if(sizeOfWaterReqIrrAdd>0){
					var counterOffWaterReqIrrAdd=parseInt(sizeOfWaterReqIrrAdd)+1;
					$(".addWaterIrrigationDetailTableBox").removeClass("hide");
					$("#waterIrrigationVal").val(counterOffWaterReqIrrAdd);
				}

		 	}
		 }  */
	 $("input[name='attachedDevice']:checked").each(function () {
		    if($(this).val() == "Yes"){
			     $(".measuring-device").removeClass("hide");
			   }else if($(this).val() == "No"){
			     $(".measuring-device").addClass("hide");
			   }
			});
	 $("input[name='selfEmployed']:checked").each(function () {
		    if($(this).val() == "Yes"){
              $(".notSelfEmployed").addClass("hide");
			   }else if($(this).val() == "No"){
			     $(".notSelfEmployed").removeClass("hide");
			   }
			});
	 
	 /* Fee Payment */
	 if (paymentMethod != "") {
	 	$("#payment-method-wrapper .wizard-title").each( function( index, element ){
		    if($(this).text() == paymentMethod){
		    	$(this).closest(".wizard-card").addClass("active");
		    	$(this).closest("a").click();
		    	}
			  });
	 	 $("#amountPaid").val(amountPaidq);
		 $("#amountCurrency").val(methodOfPaymentq);  	                                                                                                                 
		 var selectedOptionCurrency = $("#amountCurrency option:selected").text(methodOfPaymentq); 
	  	}
	
	 /* if(currentStage=="APPLICATION FORM DETAILS"){
		 $("#wraTransactionFieldset").addClass("hide");
	 
	 if(lastFormStep=="childStep2"){
		   
			$(".water-resources-forms").addClass("hide");
			$(".water-resources-renew-forms").removeClass("hide");
		}
	 }  */
	 
	/* if(currentStage == "SUPPORTING DOCUMENTS"){
	var requiredDoc = $("div[id='requiredDoc']").length;
 	filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
 	if(requiredDoc >= 1){
 		$(".mandatory-doc-heading").removeClass("hide");
 		numberOfDocument = requiredDoc;
 		if(numberOfDocument != filledDocument){
     		$("#wraSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
     	}
 	}
  }	 */
	 
	 if($(".generic-document .supporting-document-card").length > 0){
			$(".noAdditionalSupportingDoc").addClass("hide");
		}
  if(($("#transactionTypeVal").val()=="Licence Renewal")||($("#drillPermitTypeVal").val()=="Permit to Alter an Existing Well")){
	  $("#wraTransactionFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
	  $("#consumptiveSubCategories").addClass("hide");
	  $("#industrialTypeSubCategories").addClass("hide");
	  $("#domesticTypeSubCategories").addClass("hide");
	  $("#agricultureTypeSubCategories").addClass("hide");
	  $("#nonConsumptiveSubCategories").addClass("hide");
	  $("#wraPermitTransactionTypeBox").addClass("hide");
	  
  }
}
function continueEditFormDetails(){
	var lastFormStep = "<%=lastFormStep%>";
	$( ".tab-content .tab-pane" ).each( function( index, element ){
	    if($(this).attr("id") == lastFormStep ){
	    	$(this).addClass("active");
	    	$(this).prevAll().removeClass("active");
	    	$(this).nextAll().removeClass("active");
	    }
	});
	
	$(".tab-plus-wizard-left li a").each( function( index, element ){
	    if($(this).attr("href") == "#"+lastFormStep ){
	    	$(this).parents().prevAll("li").find("a").removeClass("active disabled");
	    	$(this).addClass("active");
	    	$(this).removeClass("disabled");
	    }
	});
}
/* functions */
	function pendingWraApplication(){
		typeOfApplication=$("#applicationTypeVal").val();
		typeOfPermit=$("#drillPermitTypeVal").val();
		typeOfTransationPermit=$("#wraPermitTransactionTypeVal").val();
		var typeOfTransaction;
		if(typeOfApplication=="Application for a Licence to Abstract & User Water"||typeOfApplication=="Application for a Licence to Abstract &amp; User Water"){
			typeOfTransaction=$("#transactionTypeVal").val();
		}else if(typeOfApplication=="Application for a Well Drillers Licence"){
			typeOfTransaction=$("#wraLicenceTransactionTypeVal").val();
		}
		userWaterTypeCategories=$("#userWaterTypeCategoriesVal").val();
		consumptiveSubCategories=$("#consumptiveSubCategoriesVal").val();
		nonConsumptiveSubCategories=$("#nonConsumptiveSubCategoriesVal").val();
		var industrialTypeSubCategories; 
		if(consumptiveSubCategories=="Industrial"){
		    industrialTypeSubCategories=$("#industrialTypeSubCategoriesVal").val();
		}else if(consumptiveSubCategories=="Domestic"){
			industrialTypeSubCategories=$("#domesticTypeSubCategoriesVal").val();
		}else if(consumptiveSubCategories=="Agriculture"){
			industrialTypeSubCategories=$("#agricultureTypeSubCategoriesVal").val();
		}
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   	 	lastFormDetailsStep = $(".tab-pane.active").attr("id");
		wraApplicationId=$("#wraApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${pendingWraApplicationUrl}",
			data : {
				"<portlet:namespace/>typeOfApplication" : typeOfApplication,
				"<portlet:namespace/>typeOfPermit" : typeOfPermit,
				"<portlet:namespace/>typeOfTransationPermit" : typeOfTransationPermit,
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>userWaterTypeCategories" : userWaterTypeCategories,
				"<portlet:namespace/>consumptiveSubCategories" : consumptiveSubCategories,
				"<portlet:namespace/>nonConsumptiveSubCategories" : nonConsumptiveSubCategories,
				"<portlet:namespace/>industrialTypeSubCategories" : industrialTypeSubCategories,
				"<portlet:namespace/>currentFormToSave": currentFormToSave,
	    		"<portlet:namespace/>currentStage":currentStage,
		        "<portlet:namespace/>lastFormDetailsStep":lastFormDetailsStep,
				"<portlet:namespace/>wraApplicationId" : wraApplicationId,
				},
				async:false,
			success : function(data) {
				var result = data.APP_DATA;
				$("#pop_app_no").html(result["wraAppNum"]);
			    $("#pop_category").html(result["category"]);
			    $("#pop_status").html(result["appStatus"]);
		    	$("#wraApplicationId").val(result["wraApplicationId"]);
		    	
			},
			error : function(data) {
			},
		});
}
	function draftWraApplication(){
		typeOfApplication=$("#applicationTypeVal").val();
		typeOfPermit=$("#drillPermitTypeVal").val();
		typeOfTransationPermit=$("#wraPermitTransactionTypeVal").val();
		var typeOfTransaction;
		if(typeOfApplication=="Application for a Licence to Abstract & User Water"||typeOfApplication=="Application for a Licence to Abstract &amp; User Water"){
			typeOfTransaction=$("#transactionTypeVal").val();
		}else if(typeOfApplication=="Application for a Well Drillers Licence"){
			typeOfTransaction=$("#wraLicenceTransactionTypeVal").val();
		}
		userWaterTypeCategories=$("#userWaterTypeCategoriesVal").val();
		consumptiveSubCategories=$("#consumptiveSubCategoriesVal").val();
		nonConsumptiveSubCategories=$("#nonConsumptiveSubCategoriesVal").val();
		var industrialTypeSubCategories; 
		if(consumptiveSubCategories=="Industrial"){
		    industrialTypeSubCategories=$("#industrialTypeSubCategoriesVal").val();
		}else if(consumptiveSubCategories=="Domestic"){
			industrialTypeSubCategories=$("#domesticTypeSubCategoriesVal").val();
		}else if(consumptiveSubCategories=="Agriculture"){
			industrialTypeSubCategories=$("#agricultureTypeSubCategoriesVal").val();
		}
		currentFormToSave = $("#side-tabs").find(".active span:nth-child(2)").text();
		currentStage = $(".form-wizard-header li.active .application-form-lower-heading").html();
   	 	lastFormDetailsStep = $(".tab-pane.active").attr("id");
		wraApplicationId=$("#wraApplicationId").val();
		$.ajax({
			type : "POST",
			url : "${pendingWraApplicationUrl}",
			data : {
				"<portlet:namespace/>typeOfApplication" : typeOfApplication,
				"<portlet:namespace/>typeOfPermit" : typeOfPermit,
				"<portlet:namespace/>typeOfTransationPermit" : typeOfTransationPermit,
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>userWaterTypeCategories" : userWaterTypeCategories,
				"<portlet:namespace/>consumptiveSubCategories" : consumptiveSubCategories,
				"<portlet:namespace/>nonConsumptiveSubCategories" : nonConsumptiveSubCategories,
				"<portlet:namespace/>industrialTypeSubCategories" : industrialTypeSubCategories,
				"<portlet:namespace/>currentFormToSave": currentFormToSave,
	    		"<portlet:namespace/>currentStage":currentStage,
		        "<portlet:namespace/>lastFormDetailsStep":lastFormDetailsStep,
				"<portlet:namespace/>wraApplicationId" : wraApplicationId,
				},
				async:false,
			    success : function(data) {
				var result = data.APP_DATA;
				$("#pop_app_no").html(result["wraAppNum"]);
			    $("#pop_category").html(result["category"]);
			    $("#pop_status").html(result["appStatus"]);
		    	$("#wraApplicationId").val(result["wraApplicationId"]);
		    	
		    	var categoryOfApplicant=result["category"];
		        if(categoryOfApplicant=="Application for a Licence to Abstract & User Water"){
		        	$("#drafted-status").html("Licence to Abstract & User Water");
		        	$("#pop_category").html("Licence to Abstract & User Water");
		        }else  if(categoryOfApplicant=="Application for a Permit to Drill a Well"){
		        	$("#drafted-status").html("Permit to Drill");
		        	$("#pop_category").html("Permit to Drill");
		        }else  if(categoryOfApplicant=="Application for a Well Drillers Licence"){
		        	$("#drafted-status").html("Well Drillers Licence");
		        	$("#pop_category").html("Well Drillers Licence");
		        }
		    	
			},
			error : function(data) {
			},
		});
}
	function submitWraApplication(){
		typeOfApplication=$("#applicationTypeVal").val();
		typeOfPermit=$("#drillPermitTypeVal").val();
		typeOfTransationPermit=$("#wraPermitTransactionTypeVal").val();
		var typeOfTransaction;
		if(typeOfApplication=="Application for a Licence to Abstract & User Water"||typeOfApplication=="Application for a Licence to Abstract &amp; User Water"){
			typeOfTransaction=$("#transactionTypeVal").val();
		}else if(typeOfApplication=="Application for a Well Drillers Licence"){
			typeOfTransaction=$("#wraLicenceTransactionTypeVal").val();
		}
		userWaterTypeCategories=$("#userWaterTypeCategoriesVal").val();
		consumptiveSubCategories=$("#consumptiveSubCategoriesVal").val();
		nonConsumptiveSubCategories=$("#nonConsumptiveSubCategoriesVal").val();
		var industrialTypeSubCategories; 
		if(consumptiveSubCategories=="Industrial"){
		    industrialTypeSubCategories=$("#industrialTypeSubCategoriesVal").val();
		}else if(consumptiveSubCategories=="Domestic"){
			industrialTypeSubCategories=$("#domesticTypeSubCategoriesVal").val();
		}else if(consumptiveSubCategories=="Agriculture"){
			industrialTypeSubCategories=$("#agricultureTypeSubCategoriesVal").val();
		}
		//industrialTypeSubCategories=$("#industrialTypeSubCategoriesVal").val();
		wraApplicationId=$("#wraApplicationId").val();
		
		$.ajax({
			type : "POST",
			url : "${submitWraApplicationUrl}",
			data : {
				"<portlet:namespace/>typeOfApplication" : typeOfApplication,
				"<portlet:namespace/>typeOfPermit" : typeOfPermit,
				"<portlet:namespace/>typeOfTransationPermit" : typeOfTransationPermit,
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>userWaterTypeCategories" : userWaterTypeCategories,
				"<portlet:namespace/>consumptiveSubCategories" : consumptiveSubCategories,
				"<portlet:namespace/>nonConsumptiveSubCategories" : nonConsumptiveSubCategories,
				"<portlet:namespace/>industrialTypeSubCategories" : industrialTypeSubCategories,
				"<portlet:namespace/>wraApplicationId" : wraApplicationId,
				},
			success : function(data) {
				var result = data.APP_DATA;
	    		var appStatus = result["appStatus"];
	    		$(".custom_loader").addClass("hide");
	        	$("#submit_pop_app_no").html(result["wraAppNo"]);
			    $("#submit_pop_status").html(result["appStatus"]);
		        $("#wraApplicationId").val(result["wraApplicationId"]);
	    		if(appStatus=="submitted"){
	    			$("#continueDashboardWra").removeClass("hide");
		    		$("#submitted-content").removeClass("hide");
		    		$("#application_submitted-img").removeClass("hide");
		    	}else{
		    		$("#draft-content").removeClass("hide");
		    		$("#application_draft-img").removeClass("hide");
		    	}
		        var categoryOfApplicant=result["category"];
		        if(categoryOfApplicant=="Application for a Licence to Abstract & User Water"){
		        	$("#submitted-status").html("Licence to Abstract & User Water");
		        	$("#submit_pop_category").html("Licence to Abstract & User Water");
		        }else  if(categoryOfApplicant=="Application for a Permit to Drill a Well"){
		        	$("#submitted-status").html("Permit to Drill");
		        	$("#submit_pop_category").html("Permit to Drill");
		        }else  if(categoryOfApplicant=="Application for a Well Drillers Licence"){
		        	$("#submitted-status").html("Well Drillers Licence");
		        	$("#submit_pop_category").html("Well Drillers Licence");
		        }
			},
			error : function(data) {
			},
		});
}
	
		/* function gettingDocumentList(){
			typeOfApplication=$("#applicationTypeVal").val();
			typeOfTransaction=$("#transactionTypeVal").val();
			wraApplicationId=$("#wraApplicationId").val();
			$.ajax({
				type : "POST",
				url : "${wraApplicationGettingDocumentList}",
				data : {
					"<portlet:namespace/>typeOfApplication" : typeOfApplication,
					"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
					"<portlet:namespace/>wraApplicationId" : wraApplicationId,
					},
					async:false,
				success : function(data) {
					$("#documentList").html(data);
				},
				error : function(data) {
				},
			});
	} */
	async function gettingDocumentList(){
		typeOfApplication=$("#applicationTypeVal").val();
		typeOfTransaction=$("#transactionTypeVal").val();
		wraApplicationId=$("#wraApplicationId").val();
	    $.ajax({
		    type: "POST",
		    url: "${wraApplicationGettingDocumentList}",
		    data: {
		    	"<portlet:namespace/>typeOfApplication" : typeOfApplication,
				"<portlet:namespace/>typeOfTransaction" : typeOfTransaction,
				"<portlet:namespace/>wraApplicationId" : wraApplicationId,
		    },
		    async:false,
		    success: function (data) {
		    	$("#documentList").html(data);
             /* Doc Validation */
		    	
		    	var wraApplicationId = '<%=wraApplicationId%>';
				if (wraApplicationId > 0) {
					var currentStage = "<%=currentStage %>";
					if(currentStage == "SUPPORTING DOCUMENTS"){
						numberOfDocument = $("div[id='requiredDoc']").length;
						filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;

						if (numberOfDocument != filledDocument) {
							$("#wraSupportingDocumentFieldset #save-continue").css({
								"opacity": "0.4", 
								"pointer-events": "none", 
								"cursor": "default"
							});
						} else {
							$("#wraSupportingDocumentFieldset #save-continue").css({
								"opacity": "1", 
								"pointer-events": "auto", 
								"cursor": "pointer"
							});
						}
					}
				}
		    },
		    error: function (data) {},
		});
	    /* validation(); */
	}
	<%-- async function validation(){
		var wraApplicationId='<%=wraApplicationId%>';
		if(wraApplicationId>0 ){
		  var requiredDoc = $("div[id='requiredDoc']").length;
		    filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
		    numberOfDocument = requiredDoc;

		    if (numberOfDocument != filledDocument) {
		        $("#wraSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
		    } else {
		        $("#wraSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
		    }
	    
	}
	} --%>
		 function openDocumentUploadPopup(counterVal, documentName) {
				$("#<portlet:namespace/>documentNumber").val("");
				$("#<portlet:namespace/>issueDate").val("");
				$("#<portlet:namespace/>expiryDate").val("");
				$("#wraEnrollDocuments").val("");
				$('.custom-file-label').html('Choose File');
				$("#documentuploadCounter").val(counterVal);
				$("#<portlet:namespace/>documentName").val(documentName);
				$("#commonuploadpopup").modal("show");
			}
		 function supportingDocumentUpload() {
				var documentNumber = $("#<portlet:namespace/>documentNumber").val();
				var issueDate = $("#<portlet:namespace/>issueDate").val();
				var expiryDate = $("#<portlet:namespace/>expiryDate").val();
				var enrollDocuments = $(
						"#<portlet:namespace/>wraEnrollDocuments").val();
				var documentuploadCounter = $("#documentuploadCounter").val();
				var fileID = 'wraEnrollDocuments';
				var documentName = $("#<portlet:namespace/>documentName").val();
				$("#commonuploadpopup").modal("hide");
				$('.hidden' + documentuploadCounter).removeClass('hide');
				var progress = document.getElementById('progress'
						+ documentuploadCounter);
				progress.ariaValueNow = 50;
				progress.style.width = '50%';
				wraApplicationId=$("#wraApplicationId").val();
				$
						.ajaxFileUpload({
							secureuri : false,
							method : "POST",
							fileElementId : 'wraEnrollDocuments',
							url : '${addWraUploadDocumentUrl}',
							dataType : 'text',
							data : {
								"<portlet:namespace/>documentNumber" : documentNumber,
								"<portlet:namespace/>fileID" : fileID,
								"<portlet:namespace/>command" : "fileUpload",
								"<portlet:namespace/>issueDate" : issueDate,
								"<portlet:namespace/>expiryDate" : expiryDate,
								"<portlet:namespace/>wraApplicationId" : wraApplicationId,
								"<portlet:namespace/>documentuploadCounter" : documentuploadCounter,
								"<portlet:namespace/>documentName" : documentName,
							},
							success : function(data, status) {
								
								var progress = document.getElementById('progress'
										+ documentuploadCounter);
								progress.ariaValueNow = 100;
								progress.style.width = '100%';
								$('.hidden' + documentuploadCounter).addClass('hide');
								$("#uploadedFormResult" + documentuploadCounter).html(
										data);
								$(
										"#<portlet:namespace/>uploaded-documents"
												+ documentuploadCounter).hide();
								$(".uploaded-info").removeClass("hide");
								if (data != "") {
									$("#documentUpload" + documentuploadCounter)
											.addClass("disabled");
								}
								 filledDocument = $("#documentList #requiredDoc .supporting-document-card").find(".uploaded-info").length;
								if(numberOfDocument == filledDocument){
					            	$("#wraSupportingDocumentFieldset #save-continue").css({"opacity":"1", "pointer-events":"auto", "cursor":"pointer"});
					            }	
								
							},
							error : function(data, status, e) {
							}
						});
			}
			function opendelDocPopup(fileEntryId,documentCounter){
				  $("#documentuploadCounter").val(documentCounter);
				  $("#deletepopup"+fileEntryId).modal("show");
			}
			function deleteUploadedDocument(fileEntryId) {
				documentuploadCounter = $("#documentuploadCounter").val();
			  $.ajax({
			      type: "POST",
			      url: '${deletedocumentUrl}',
			      data: {
			          "<portlet:namespace/>fileEntryId": fileEntryId,
			      },
			      success: function (data) {
			          $("#deletepopup"+fileEntryId).modal("hide");
			          $("#unpload-info-card"+fileEntryId).remove();
			          $("#documentUpload"+documentuploadCounter).removeClass("disabled");
			          $("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
					  var requiredDoc = $("div[id='requiredDoc']").length;
					  var notRequireDoc = $("div[id='notRequiredDoc']").length;
					  if(requiredDoc >= 1){
					  if(documentuploadCounter <= requiredDoc){
							$("#requireDocNamePreview" + documentuploadCounter).html("");
							filledDocument = filledDocument -1;
							$("#wraSupportingDocumentFieldset #save-continue").css({"opacity":"0.4", "pointer-events":"none", "cursor":"default"});
					}
					}
						if(notRequireDoc >= 1){
							$("#nonRequireDocNamePreview" + documentuploadCounter).html("");
						}
			      },
			      error: function (data) {

			      }
			  });
			}
			function deleteDocumentFee(fileEntryId) {
				documentuploadCounter = $("#documentuploadCounter").val();
			  $.ajax({
			      type: "POST",
			      url: '${deletedocumentUrl}',
			      data: {
			          "<portlet:namespace/>fileEntryId": fileEntryId,
			      },
			      success: function (data) {
			          $("#deletepopup"+fileEntryId).modal("hide");
			          $("#unpload-info-card"+fileEntryId).remove();
			          $("#documentUpload"+documentuploadCounter).removeClass("disabled");
			          $("#genericSupportingDocuments"+documentuploadCounter).addClass("hide");
					
			          checkFilePresence();
			      },
			      error: function (data) {

			      }
			  });
			}
			function checkFilePresence() {
			    // Count the remaining file cards
			    var filesRemaining = $(".uploaded-info-two").length; // Adjust this selector if needed
			    if (filesRemaining === 0) {
			        // If no files are remaining, enable the upload button
			     
			        $("#wra-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
			    } else {
			        // Otherwise, disable the upload button
			    	$("#wra-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
			    }
			}
			$(function() {
				$(document).on('change', '#wraEnrollDocuments', function() {
					var fileName = $(this).val();
					fileName = fileName.replace("C:\\fakepath\\", "");
					$(this).next('.custom-file-label').html(fileName);
				})
			});
</script>