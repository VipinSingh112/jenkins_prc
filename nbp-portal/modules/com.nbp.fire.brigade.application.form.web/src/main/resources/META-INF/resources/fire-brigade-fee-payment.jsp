<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadeAppPaymentLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolderConstants"%>
<%@page import="com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadeAppPayment"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.document.library.kernel.model.DLFolder"%>
<%

	DLFolder supportingDocumentsFolder = null;
	DLFolder supportingDocumentsParentFolder = null;
	DLFolder supportingDocumentsFolderSubFolder = null;
	List<DLFileEntry> fileEntryPaymentFile = null;
	List<DLFileEntry> supportinfDocFileEntries = null;

	String paymentMethodBankDraft= "";
	String paymentMethodCash= "";
	String paymentMethodBankCheque= "";
	String paymentMethodBankOther= "";
	String paymentMethodDirectDeposit= "";
	String clickPaymentOption="";
	String selPaymentMethod = "";
	FireBrigadeAppPayment fireBrigadeApplicationForPaymentMethod = null;
		try {
			supportingDocumentsParentFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, "Fire Brigade Supported Documents");
			
			supportingDocumentsFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsParentFolder.getFolderId(), String.valueOf(fireBrigadeApplicationId));
			
			supportingDocumentsFolderSubFolder = DLFolderLocalServiceUtil.getFolder(themeDisplay.getScopeGroupId(),
					supportingDocumentsFolder.getFolderId(), "Fee Reciept");
			
			supportinfDocFileEntries = DLFileEntryLocalServiceUtil
					.getFileEntries(themeDisplay.getScopeGroupId(), supportingDocumentsFolderSubFolder.getFolderId());
		}catch (Exception e) {
			
		}
		try{
			fireBrigadeApplicationForPaymentMethod=FireBrigadeAppPaymentLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApplicationId);
			if(Validator.isNotNull(fireBrigadeApplicationForPaymentMethod)&&(Validator.isNotNull(fireBrigadeApplicationForPaymentMethod.getPaymentMethod()))){
			if(fireBrigadeApplicationForPaymentMethod.getPaymentMethod().equals("Bank Draft")){
				paymentMethodBankDraft="active";
			}else if(fireBrigadeApplicationForPaymentMethod.getPaymentMethod().equals("Cheque")){
				paymentMethodBankCheque="active";
			}else if(fireBrigadeApplicationForPaymentMethod.getPaymentMethod().equals("Cash")){
				paymentMethodCash="active";
			}else if(fireBrigadeApplicationForPaymentMethod.getPaymentMethod().equals("Direct Deposit")){
				paymentMethodDirectDeposit="active";
			}else if(fireBrigadeApplicationForPaymentMethod.getPaymentMethod().equals("Other")){
				paymentMethodBankOther="active";
			}
		clickPaymentOption=fireBrigadeApplicationForPaymentMethod.getPaymentMethod();
			}
			}catch(Exception e){
		}
		try{
			selPaymentMethod = fireBrigadeApplicationForPaymentMethod.getPaymentMethod();
		}catch(Exception e){
		}

%>

<fieldset class="wizard-fieldset" id="fireBrigadeFeePaymentFieldset" name="APPLICATION FEES PAYMENT">
	<section class="application-Fees">
		<div class="row">
			<div class="col-md-12">
				<div class="first-heading">
					<h1 class="common-heading" id="applicationFee">Application Fee</h1>
				</div>
			</div>
		</div>
		<div class="row" id="rm-payment-method">
			<div class="col-md-12">
				<ul class="d-flex">
					<li class="arrowed" id="choose-payment-method"><span>Payment
							method</span></li>
					<li class="arrowed hide" id="payment-method"><span></span></li>
				</ul>
			</div>
			<div class="col-md-7">
				<div id="payment-method-wrapper" class="">
					<div class="row">
						<div class="col-md-12">
							<ul class="ps-0 list-unstyled wizard-cards-list">
								<li class="w-100">
									<div class="wizard-card disabled">
										<a href="javascript:;" id="credit-card-method"
											style="pointer-events: none; opacity: 0.4;">
											<div class="wizard-card-icon">
												<svg width="45" height="29" viewBox="0 0 45 29" fill="none"
													xmlns="http://www.w3.org/2000/svg"> 
				<path
														d="M41.8318 0H2.22744C0.997285 0 0 0.997286 0 2.22744V4.76302H44.0593V2.22744C44.0593 0.997286 43.062 0 41.8318 0Z"
														fill="#047247"></path> 
				<path
														d="M0 26.0995C0 27.3297 0.997285 28.327 2.22744 28.327H41.8318C43.0619 28.327 44.0592 27.3297 44.0592 26.0995V11.2761H0V26.0995ZM18.9315 23.3542H16.1329C15.3334 23.3542 14.6853 22.7061 14.6853 21.9067C14.6853 21.1072 15.3334 20.4591 16.1329 20.4591H18.9315C19.731 20.4591 20.3791 21.1072 20.3791 21.9067C20.3791 22.7061 19.731 23.3542 18.9315 23.3542ZM33.6289 20.4591H38.1647C38.9641 20.4591 39.6122 21.1072 39.6122 21.9067C39.6122 22.7061 38.9641 23.3542 38.1647 23.3542H33.6289C32.8295 23.3542 32.1813 22.7061 32.1813 21.9067C32.1813 21.1072 32.8295 20.4591 33.6289 20.4591ZM29.2576 21.9067C29.2576 22.7061 28.6095 23.3542 27.81 23.3542H25.0114C24.2119 23.3542 23.5638 22.7061 23.5638 21.9067C23.5638 21.1072 24.2119 20.4591 25.0114 20.4591H27.81C28.6095 20.4591 29.2576 21.1072 29.2576 21.9067ZM5.68165 14.9583H27.2988C28.0983 14.9583 28.7464 15.6064 28.7464 16.4059C28.7464 17.2053 28.0983 17.8534 27.2988 17.8534H5.68165C4.8822 17.8534 4.23407 17.2053 4.23407 16.4059C4.23407 15.6064 4.8822 14.9583 5.68165 14.9583ZM5.68165 20.4591H10.2174C11.0168 20.4591 11.665 21.1072 11.665 21.9067C11.665 22.7061 11.0169 23.3542 10.2174 23.3542H5.68165C4.8822 23.3542 4.23407 22.7061 4.23407 21.9067C4.23407 21.1072 4.8822 20.4591 5.68165 20.4591Z"
														fill="#047247"></path> 
			   </svg>
											</div>
											<div class="wizard-card-content-box">
												<p class="wizard-title f2">Credit Card</p>
												<p class="wizard-info hide">Pay directly through credit
													card. Secured by PayGate.</p>
												<p class="wizard-info disabled-credit-card">Credit Cards
													are not accepted for now.</p>
											</div>
										</a>
									</div>
								</li>
								<li class="w-100">
									<div class="wizard-card <%=paymentMethodDirectDeposit%>">
										<a href="javascript:;" id="direct-deposit-method">
											<div class="wizard-card-icon">
												<svg width="33" height="32" viewBox="0 0 33 32" fill="none"
													xmlns="http://www.w3.org/2000/svg"> 
				<path
														d="M27.5996 15H5.59961C4.99961 15 4.59961 14.6 4.59961 14V2C4.59961 1.4 4.99961 1 5.59961 1H27.5996C28.1996 1 28.5996 1.4 28.5996 2V14C28.5996 14.6 28.1996 15 27.5996 15ZM6.59961 13H26.5996V3H6.59961V13Z"
														fill="#047247"></path> 
				<path
														d="M16.5996 12C14.8996 12 13.5996 10.2 13.5996 8C13.5996 5.8 14.8996 4 16.5996 4C18.2996 4 19.5996 5.8 19.5996 8C19.5996 10.2 18.2996 12 16.5996 12Z"
														fill="#047247"></path> 
				<path
														d="M30.4988 16.5C30.2988 16.2 29.9988 16 29.5988 16C27.3988 16 25.2988 17 23.9988 18.8L23.0988 20C21.9988 21.3 20.2988 22 18.5988 22H15.5988C14.9988 22 14.5988 21.6 14.5988 21C14.5988 20.4 14.9988 20 15.5988 20H17.4988C19.0988 20 20.5988 18.7 20.5988 17.1V17C20.5988 16.5 20.0988 16 19.5988 16H13.4988C9.89883 16 6.99883 17.6 5.39883 20.2L2.69883 24.4C2.49883 24.7 2.49883 25.1 2.69883 25.4L5.69883 30.4C5.79883 30.6 6.09883 30.8 6.29883 30.9C6.39883 30.9 6.39883 30.9 6.49883 30.9C6.69883 30.9 6.89883 30.8 7.09883 30.7C10.8988 28.2 15.2988 26.9 19.7988 26.9C23.0988 26.9 26.0988 25.1 27.6988 22.2L30.3988 17.4C30.5988 17.2 30.5988 16.8 30.4988 16.5Z"
														fill="#047247"></path> 
				<path
														d="M9.59961 2H8.59961H5.59961V5V6V7C8.39961 7 10.5996 4.8 10.5996 2H9.59961Z"
														fill="#047247"></path> 
				<path
														d="M5.59961 10V11V14H8.59961H9.59961H10.5996C10.5996 11.2 8.39961 9 5.59961 9V10Z"
														fill="#047247"></path> 
				<path
														d="M23.5996 14H24.5996H27.5996V11V10V9C24.7996 9 22.5996 11.2 22.5996 14H23.5996Z"
														fill="#047247"></path> 
				<path
														d="M27.5996 6V5V2H24.5996H23.5996H22.5996C22.5996 4.8 24.7996 7 27.5996 7V6Z"
														fill="#047247"></path> 
			   </svg>
											</div>
											<div class="wizard-card-content-box">
												<p class="wizard-title f2">Direct Deposit</p>
												<p class="wizard-info">Please make direct deposit payment, and upload proof of payment.</p>
											</div>
										</a>
									</div>
								</li>
								<li class="w-100">
									<div class="wizard-card <%=paymentMethodBankDraft%>">
										<a href="javascript:;" id="bank-draft-method">
											<div class="wizard-card-icon">
												<svg width="32" height="30" viewBox="0 0 32 30" fill="none"
													xmlns="http://www.w3.org/2000/svg"> 
				<path
														d="M30.1905 29.2649H1.81055C1.41272 29.2649 1.03119 29.1069 0.749887 28.8256C0.468582 28.5442 0.310547 28.1627 0.310547 27.7649C0.310547 27.3671 0.468582 26.9855 0.749887 26.7042C1.03119 26.4229 1.41272 26.2649 1.81055 26.2649H30.1905C30.5884 26.2649 30.9699 26.4229 31.2512 26.7042C31.5325 26.9855 31.6905 27.3671 31.6905 27.7649C31.6905 28.1627 31.5325 28.5442 31.2512 28.8256C30.9699 29.1069 30.5884 29.2649 30.1905 29.2649Z"
														fill="#047247"></path> 
				<path
														d="M27.3709 29.2649C26.973 29.2649 26.5915 29.1068 26.3102 28.8255C26.0289 28.5442 25.8709 28.1627 25.8709 27.7649V25.0049H6.13086V27.7649C6.13086 28.1627 5.97282 28.5442 5.69152 28.8255C5.41021 29.1068 5.02868 29.2649 4.63086 29.2649C4.23303 29.2649 3.8515 29.1068 3.5702 28.8255C3.28889 28.5442 3.13086 28.1627 3.13086 27.7649V23.5049C3.13086 23.1071 3.28889 22.7255 3.5702 22.4442C3.8515 22.1629 4.23303 22.0049 4.63086 22.0049H27.3709C27.7687 22.0049 28.1502 22.1629 28.4315 22.4442C28.7128 22.7255 28.8709 23.1071 28.8709 23.5049V27.7649C28.8709 28.1627 28.7128 28.5442 28.4315 28.8255C28.1502 29.1068 27.7687 29.2649 27.3709 29.2649Z"
														fill="#047247"></path> 
				<path
														d="M8.90625 20.76C8.50843 20.76 8.12689 20.602 7.84559 20.3207C7.56429 20.0393 7.40625 19.6578 7.40625 19.26V10.74C7.40625 10.3422 7.56429 9.96063 7.84559 9.67933C8.12689 9.39803 8.50843 9.23999 8.90625 9.23999C9.30407 9.23999 9.68561 9.39803 9.96691 9.67933C10.2482 9.96063 10.4063 10.3422 10.4063 10.74V19.26C10.4063 19.6578 10.2482 20.0393 9.96691 20.3207C9.68561 20.602 9.30407 20.76 8.90625 20.76Z"
														fill="#047247"></path> 
				<path
														d="M16 20.76C15.6022 20.76 15.2206 20.602 14.9393 20.3207C14.658 20.0394 14.5 19.6579 14.5 19.26V7.90503C14.5 7.5072 14.658 7.12567 14.9393 6.84437C15.2206 6.56306 15.6022 6.40503 16 6.40503C16.3978 6.40503 16.7794 6.56306 17.0607 6.84437C17.342 7.12567 17.5 7.5072 17.5 7.90503V19.26C17.5 19.6579 17.342 20.0394 17.0607 20.3207C16.7794 20.602 16.3978 20.76 16 20.76Z"
														fill="#047247"></path> 
				<path
														d="M23.0957 20.76C22.6979 20.76 22.3163 20.602 22.035 20.3207C21.7537 20.0393 21.5957 19.6578 21.5957 19.26V10.74C21.5957 10.3422 21.7537 9.96063 22.035 9.67933C22.3163 9.39803 22.6979 9.23999 23.0957 9.23999C23.4935 9.23999 23.8751 9.39803 24.1564 9.67933C24.4377 9.96063 24.5957 10.3422 24.5957 10.74V19.26C24.5957 19.6578 24.4377 20.0393 24.1564 20.3207C23.8751 20.602 23.4935 20.76 23.0957 20.76Z"
														fill="#047247"></path> 
				<path
														d="M2.50069 10.8299C2.21956 10.8305 1.94393 10.752 1.70523 10.6035C1.46654 10.455 1.27438 10.2424 1.15069 9.98993C0.97385 9.63384 0.945613 9.22211 1.07218 8.84522C1.19875 8.46833 1.46977 8.1571 1.82569 7.97992L16.0007 0.884925C16.2158 0.771928 16.4552 0.712891 16.6982 0.712891C16.9412 0.712891 17.1806 0.771928 17.3957 0.884925L30.1607 7.96492C30.5088 8.16384 30.7636 8.49288 30.8691 8.87968C30.9746 9.26647 30.9221 9.67933 30.7232 10.0274C30.5243 10.3755 30.1952 10.6303 29.8084 10.7358C29.4216 10.8413 29.0088 10.7888 28.6607 10.5899L16.6607 3.88492L3.16069 10.6199C2.96008 10.7405 2.73406 10.8124 2.50069 10.8299Z"
														fill="#047247"></path> 
			   </svg>
											</div>
											<div class="wizard-card-content-box">
												<p class="wizard-title f2">Bank Draft</p>
												<p class="wizard-info">Please make your payment via bank draft, and upload proof of payment.</p>
											</div>
										</a>
									</div>
								</li>
							</ul>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<ul class="ps-0 list-unstyled wizard-cards-list">
								<li class="w-100">
									<div class="wizard-card <%=paymentMethodCash%>">
										<a href="javascript:;" id="cash-method">
											<div class="wizard-card-icon">
												<svg width="50" height="40" viewBox="0 0 50 40" fill="none"
													xmlns="http://www.w3.org/2000/svg"> 
				<path
														d="M31.2679 11.0341C27.8119 9.04021 22.2291 9.04021 18.7936 11.0341C15.358 13.0279 15.3785 16.2692 18.8345 18.2631C22.2905 20.2569 27.8733 20.2569 31.3088 18.2631C34.7444 16.259 34.724 13.0279 31.2679 11.0341ZM29.6831 14.1731C29.3866 14.2651 29.09 14.3674 28.7935 14.4594C28.6095 14.5105 28.497 14.5208 28.4152 14.4799C28.3743 14.4492 28.3334 14.4083 28.2925 14.3469C28.0982 14.03 27.8017 13.7539 27.4029 13.5289C27.3518 13.4983 27.2905 13.4676 27.2291 13.4369C27.0962 13.3653 26.9735 13.3142 26.8099 13.2733C26.2373 13.1404 25.7261 13.3551 25.7976 13.713C25.8283 13.897 25.9306 14.0606 26.0533 14.2345C26.2578 14.5208 26.4827 14.807 26.6258 15.1138C27.1064 16.0749 26.0635 17.0258 24.3866 17.1179C23.7833 17.1485 23.2107 17.077 22.679 16.9032C22.4439 16.8316 22.27 16.8316 22.0962 16.9543C21.9224 17.0667 21.7281 17.169 21.5441 17.2712C21.3805 17.3633 21.2067 17.3735 21.0431 17.2815C20.9204 17.2201 20.8079 17.1485 20.6852 17.0872C20.6034 17.0361 20.5216 16.9952 20.4398 16.944C20.266 16.8418 20.2864 16.7396 20.45 16.6373C20.5829 16.5555 20.7159 16.4839 20.8386 16.4021C21.1351 16.2283 21.1351 16.2181 20.8897 16.0238C20.5829 15.7784 20.3069 15.5228 20.133 15.2365C20.0001 15.0115 20.0308 14.9604 20.3887 14.8377C20.6545 14.7559 20.9101 14.6639 21.176 14.5821C21.3703 14.5208 21.4827 14.5105 21.5645 14.5514C21.6157 14.5821 21.6463 14.623 21.6872 14.6946C21.8611 15.0218 22.1576 15.3081 22.5154 15.5841C22.5768 15.6353 22.6484 15.6762 22.7097 15.7171C22.904 15.8295 23.1289 15.9113 23.3846 15.9727C24.0492 16.1261 24.6422 15.8602 24.5809 15.441C24.5604 15.2978 24.4888 15.1751 24.3968 15.0422C24.1719 14.7048 23.8754 14.3878 23.722 14.03C23.4766 13.4574 23.5891 12.9359 24.3764 12.5269C25.2762 12.0668 26.2782 12.0361 27.3416 12.3224C27.7813 12.4451 27.771 12.4451 28.1085 12.2508C28.2209 12.1793 28.3334 12.1179 28.4459 12.0566C28.7015 11.9134 28.7935 11.9134 29.0491 12.0566C29.1309 12.0975 29.2025 12.1486 29.2843 12.1895C29.8262 12.4962 29.8262 12.4962 29.2945 12.8132C28.9162 13.0279 28.9162 13.0279 29.2332 13.2835C29.4786 13.4778 29.6729 13.6823 29.816 13.9073C29.9285 14.0197 29.8876 14.1118 29.6831 14.1731ZM35.8794 20.9011C34.9285 21.4532 33.3845 21.4532 32.4234 20.9011C31.4724 20.3489 31.4622 19.4491 32.4131 18.897C33.364 18.3449 34.908 18.3449 35.8691 18.897C36.8303 19.4491 36.8405 20.3489 35.8794 20.9011ZM17.6791 10.3899C16.7282 10.942 15.1842 10.942 14.2231 10.3899C13.2619 9.83776 13.2619 8.93796 14.2128 8.38582C15.1638 7.83368 16.7077 7.83368 17.6688 8.38582C18.6198 8.93796 18.63 9.83776 17.6791 10.3899ZM48.8139 16.6169L21.5645 0.880753C19.9899 -0.0292615 17.4337 -0.0292615 15.8693 0.880753L1.25791 9.36741C-0.3065 10.2774 -0.296275 11.76 1.27836 12.67L28.5277 28.4061C30.1023 29.3162 32.6585 29.3162 34.2229 28.4061L48.8241 19.9195C50.3987 19.0095 50.3885 17.5269 48.8139 16.6169ZM34.5195 25.4103C34.3456 25.2467 34.1411 25.0933 33.8957 24.9501C32.3007 24.0299 29.7138 24.0299 28.1289 24.9501C28.0062 25.0217 27.904 25.0933 27.7915 25.1751L6.6362 12.9563C6.84069 12.8745 7.03497 12.7825 7.21902 12.6803C8.80387 11.76 8.79365 10.2672 7.19857 9.34696C7.02474 9.24471 6.84069 9.15269 6.64642 9.08111L15.3682 4.00957C15.5012 4.12204 15.6545 4.22429 15.8284 4.32654C17.4235 5.24678 20.0103 5.24678 21.5952 4.32654C21.7793 4.22429 21.9326 4.11182 22.0758 3.98912L43.3026 16.2385C43.0163 16.3408 42.7607 16.4533 42.5153 16.5964C40.9305 17.5166 40.9305 19.0197 42.5358 19.9399C42.7812 20.0831 43.0572 20.1956 43.3435 20.2978L34.5195 25.4103ZM0.562615 15.8193C1.25791 15.4614 2.33152 15.5126 2.99614 15.9011L31.4827 32.3427L46.8813 23.3857C47.546 22.9972 48.64 22.9972 49.3149 23.3857C49.9897 23.7743 49.9897 24.4082 49.3251 24.7968L32.9551 34.3059C32.1575 34.7763 30.8487 34.7763 30.041 34.3059L29.4684 33.9787L29.0696 33.7435L0.511491 17.261C-0.183801 16.8623 -0.173577 16.1976 0.562615 15.8193ZM49.3455 29.9399L32.9755 39.449C32.178 39.9194 30.8692 39.9194 30.0614 39.449L29.499 39.1218L29.09 38.8867L0.531941 22.4041C-0.163352 22.0054 -0.142902 21.3408 0.59329 20.9624C1.27836 20.6046 2.3622 20.6557 3.02681 21.0442L31.5031 37.4859L46.9018 28.5391C47.5766 28.1505 48.6605 28.1505 49.3353 28.5391C50.0102 28.9174 50.0204 29.5513 49.3455 29.9399Z"
														fill="#047247"></path> 
			   </svg>
											</div>
											<div class="wizard-card-content-box">
												<p class="wizard-title f2">Cash</p>
												<p class="wizard-info">Please make payment by cash at one of our offices, and upload proof of payment.</p>
											</div>
										</a>
									</div>
								</li>
								<li class="w-100">
									<div class="wizard-card  <%=paymentMethodBankCheque%>">
										<a href="javascript:;" id="cheque-method">
											<div class="wizard-card-icon">
												<svg width="46" height="32" viewBox="0 0 46 32" fill="none"
													xmlns="http://www.w3.org/2000/svg"> 
				<path
														d="M42.7971 0.465576H3.19353C1.43191 0.465576 0 1.89748 0 3.6591V28.3407C0 30.1023 1.43191 31.5342 3.19353 31.5342H42.8065C44.5681 31.5342 46 30.1023 46 28.3407V3.6591C46 1.89748 44.5587 0.465576 42.7971 0.465576ZM42.7971 29.0566H3.19353C2.79787 29.0566 2.47758 28.7363 2.47758 28.3407V7.91714H43.5224V28.3407C43.5224 28.7363 43.1927 29.0566 42.7971 29.0566ZM13.5278 22.5659C13.0661 23.1312 12.4632 23.508 11.7567 23.7058C11.4458 23.7906 11.3139 23.9507 11.3234 24.271C11.3328 24.5819 11.3234 24.9022 11.3234 25.2131C11.3234 25.4957 11.1821 25.6464 10.8994 25.6464C10.5603 25.6558 10.2212 25.6558 9.88204 25.6464C9.59001 25.637 9.4487 25.4768 9.43928 25.1848C9.43928 24.9587 9.43928 24.7232 9.42986 24.4971C9.42044 23.9884 9.41102 23.9696 8.92115 23.8942C8.29941 23.8 7.68708 23.6493 7.11243 23.3761C6.66025 23.1594 6.62257 23.0464 6.74503 22.5753C6.83924 22.2268 6.93344 21.8782 7.04649 21.5297C7.16895 21.1246 7.282 21.0775 7.6494 21.2659C8.28057 21.5956 8.94942 21.7746 9.64653 21.8688C10.0987 21.9253 10.5415 21.8782 10.956 21.6992C11.7379 21.3601 11.8603 20.4557 11.2009 19.9094C10.9748 19.721 10.7205 19.5891 10.4567 19.4666C9.769 19.1651 9.05304 18.9391 8.41245 18.5434C7.36678 17.9122 6.69793 17.055 6.7733 15.7738C6.85808 14.3325 7.67766 13.4281 9.00594 12.9477C9.55233 12.7498 9.55233 12.7592 9.56175 12.1846C9.56175 11.9868 9.56175 11.7984 9.56175 11.6005C9.57117 11.1672 9.64653 11.0918 10.0704 11.0824C10.2023 11.0824 10.3342 11.0824 10.4661 11.0824C11.3799 11.0824 11.3799 11.0824 11.3799 11.9962C11.3799 12.6462 11.3799 12.6462 12.0299 12.7498C12.5198 12.8252 12.9908 12.9759 13.4524 13.1737C13.7067 13.2868 13.8009 13.4564 13.7256 13.7296C13.6125 14.1252 13.4995 14.5209 13.377 14.9071C13.2546 15.2745 13.1415 15.331 12.7835 15.1615C12.0676 14.8129 11.3234 14.6716 10.5321 14.7187C10.3248 14.7281 10.127 14.7564 9.92914 14.8412C9.25087 15.1426 9.13783 15.8868 9.71247 16.3579C10.0045 16.5934 10.3436 16.7629 10.6922 16.9042C11.2951 17.1492 11.898 17.3941 12.4727 17.7144C14.3191 18.7224 14.8089 21.0116 13.5278 22.5659ZM37.9926 11.544V13.0701C37.9926 13.3245 37.7854 13.5223 37.5404 13.5223H18.0401C17.7858 13.5223 17.588 13.3151 17.588 13.0701V11.544C17.588 11.2897 17.7952 11.0918 18.0401 11.0918H37.5404C37.7854 11.0918 37.9926 11.2991 37.9926 11.544ZM17.5785 17.1115V15.5854C17.5785 15.331 17.7858 15.1332 18.0307 15.1332H29.2316C29.486 15.1332 29.6838 15.3404 29.6838 15.5854V17.1115C29.6838 17.3658 29.4766 17.5637 29.2316 17.5637H18.0401C17.7858 17.5731 17.5785 17.3658 17.5785 17.1115ZM37.7289 20.5688C37.8136 20.7572 37.7948 20.9739 37.71 21.1623C37.6912 21.2188 37.6252 21.4072 37.4557 21.5674C37.3144 21.6898 37.1636 21.8311 36.947 21.9253C36.1651 22.2362 35.3172 22.5471 34.394 22.7072C33.6215 22.8391 32.9621 22.6319 32.4817 22.1232L32.2085 22.2456C31.794 22.4246 31.3983 22.5848 31.0215 22.7826C30.5599 23.0275 30.1077 23.2819 29.6555 23.5362C29.307 23.7341 28.949 23.9319 28.6005 24.1203C28.299 24.2804 27.9787 24.4123 27.649 24.5065C27.1874 24.6384 26.7164 24.516 26.4149 24.1957C26.1888 23.9601 26.0852 23.6304 26.104 23.2913C26.104 23.2348 26.1135 23.1877 26.1229 23.1312C25.4258 23.6775 24.7192 24.2239 24.0127 24.7609C23.6076 25.0718 23.1743 25.3544 22.7598 25.6276C22.5243 25.7783 22.2793 25.8537 22.1098 25.8913C21.4409 26.0609 20.8003 25.6652 20.6402 24.9776C20.5366 24.5536 20.6496 24.1674 20.7061 23.9413C20.7344 23.8283 20.7721 23.7058 20.8097 23.5928C20.3105 24.2333 19.8206 24.8928 19.3307 25.5428L18.9728 26.0232C18.822 26.2211 18.6996 26.4095 18.6054 26.579C18.5394 26.6921 18.4923 26.8145 18.4452 26.937L18.3604 27.1254L18.3416 27.1819C18.238 27.4928 17.9365 27.7001 17.6162 27.7001C17.5597 27.7001 17.5126 27.6906 17.4561 27.6812C17.0604 27.5964 16.7684 27.2196 16.8249 26.8145C16.8343 26.7486 16.8437 26.6921 16.8532 26.645C16.9756 26.1268 17.2206 25.7029 17.4561 25.3073C18.6148 23.3949 19.651 21.8971 20.725 20.5782C21.0735 20.1449 21.4598 19.7586 21.8366 19.3818L21.8743 19.3441C22.0721 19.1369 22.3453 18.9862 22.6279 18.9108C23.0518 18.7883 23.4946 18.9108 23.7678 19.2122C23.9844 19.4478 24.0786 19.7681 24.0504 20.0978C24.0221 20.4086 23.9562 20.7007 23.862 20.9739C23.7207 21.3601 23.5794 21.7463 23.4381 22.142C23.3344 22.4246 23.2214 22.7072 23.1272 22.9898C23.4757 22.6978 23.8243 22.3964 24.1728 22.1043C24.6627 21.6898 25.1526 21.2753 25.6424 20.8702C25.9156 20.6442 26.2077 20.4746 26.4903 20.305L26.6222 20.2202C26.8954 20.0601 27.1874 20.0601 27.3099 20.0601C27.6113 20.0601 27.9033 20.1826 28.1106 20.3992C28.3178 20.6159 28.4215 20.9079 28.4026 21.2094C28.3838 21.4732 28.3461 21.7558 28.2707 22.0666C28.2613 22.1043 28.2519 22.142 28.2425 22.1797C28.412 22.0761 28.5816 21.963 28.7512 21.8594C29.0432 21.6804 29.3258 21.492 29.6179 21.313C30.3809 20.842 31.0403 20.5123 31.6998 20.2768C32.2744 20.0601 32.7831 20.0978 33.2165 20.3615C33.4237 20.4934 33.6121 20.663 33.7723 20.8702C33.8194 20.9362 33.8382 20.9362 33.9136 20.9362C33.9513 20.9362 33.9889 20.9362 34.0266 20.9268C34.4317 20.8608 34.8368 20.7007 35.2701 20.5405L35.4491 20.4746C35.5433 20.4369 35.6375 20.3992 35.7317 20.3521C35.8825 20.2862 36.0238 20.2202 36.1839 20.1731C36.3912 20.0978 36.5984 20.0695 36.7586 20.0507C36.7868 20.0507 36.8622 20.0412 36.8904 20.0412C37.0977 20.0412 37.2578 20.1166 37.3238 20.1543C37.5028 20.2297 37.6441 20.3804 37.7289 20.5688Z"
														fill="#047247"></path> 
			   </svg>
											</div>
											<div class="wizard-card-content-box">
												<p class="wizard-title f2">Cheque</p>
												<p class="wizard-info">Please pay by a cheque, and upload proof of payment.</p>
											</div>
										</a>
									</div>
								</li>
								<li class="w-100">
									<div class="wizard-card  <%=paymentMethodBankOther%>">
										<a href="javascript:;" id="other-method">
											<div class="wizard-card-icon">
												<svg width="30" height="32" viewBox="0 0 30 32" fill="none"
													xmlns="http://www.w3.org/2000/svg"> 
				<path
														d="M20.756 9.03375L22.8043 0H7.19459L9.24291 9.03369C4.19872 11.2502 0.675781 16.2895 0.675781 22.1525C0.675781 25.9674 2.16828 29.4329 4.59991 32H25.3987C27.8304 29.4329 29.3231 25.9674 29.3231 22.1525C29.3232 16.2896 25.8001 11.2503 20.756 9.03375ZM19.8726 2.34144L18.563 8.11706H11.4361L10.1265 2.34144H19.8726ZM24.3381 29.6586H5.66059C3.94953 27.5348 3.01728 24.9044 3.01728 22.1525C3.01728 17.3986 5.83078 13.0906 10.1849 11.1772L11.8207 10.4585H18.1783L19.814 11.1773C24.1682 13.0908 26.9817 17.3988 26.9817 22.1524C26.9817 24.9042 26.0493 27.5348 24.3381 29.6586Z"
														fill="#047247"></path> 
			   </svg>
											</div>
											<div class="wizard-card-content-box">
												<p class="wizard-title f2">Other</p>
												<p class="wizard-info">Please pay using an alternative method, and upload proof of payment.</p>
											</div>
										</a>
									</div>
								</li>
							</ul>
						</div>
					</div>
					<input id="paymentMethod" type="hidden" name="paymentMethod"> 
					<input id="paymentFee" type="hidden" name="paymentFee">
				</div>
				
				<div class="credit-card-detail-view-wrapper hide"
					id="credit-card-details">
					<div class="fee-payment-wrapper">
						<div class="row">
							<div class="col-md-12">
								<div class="d-flex mb-3">
									<span> <svg width="99" height="64" viewBox="0 0 99 64"
											fill="none" xmlns="http://www.w3.org/2000/svg"> 
			  <path
												d="M93.995 0H5.00499C2.24087 0 0 2.24087 0 5.00499V10.7024H99V5.00499C99 2.24087 96.7591 0 93.995 0Z"
												fill="#047247"></path> 
			  <path
												d="M0 58.6449C0 61.4091 2.24087 63.6499 5.00499 63.6499H93.9948C96.7589 63.6499 98.9998 61.4091 98.9998 58.6449V25.3372H0V58.6449ZM42.5386 52.4764H36.2501C34.4538 52.4764 32.9975 51.02 32.9975 49.2237C32.9975 47.4273 34.4538 45.971 36.2501 45.971H42.5386C44.335 45.971 45.7913 47.4273 45.7913 49.2237C45.7913 51.02 44.335 52.4764 42.5386 52.4764ZM75.5632 45.971H85.7549C87.5513 45.971 89.0076 47.4273 89.0076 49.2237C89.0076 51.02 87.5513 52.4764 85.7549 52.4764H75.5632C73.7669 52.4764 72.3106 51.02 72.3106 49.2237C72.3106 47.4273 73.7669 45.971 75.5632 45.971ZM65.741 49.2237C65.741 51.02 64.2847 52.4764 62.4883 52.4764H56.1999C54.4035 52.4764 52.9472 51.02 52.9472 49.2237C52.9472 47.4273 54.4035 45.971 56.1999 45.971H62.4883C64.2847 45.971 65.741 47.4273 65.741 49.2237ZM12.7665 33.6109H61.3397C63.1361 33.6109 64.5924 35.0672 64.5924 36.8635C64.5924 38.6599 63.1361 40.1162 61.3397 40.1162H12.7665C10.9702 40.1162 9.51384 38.6599 9.51384 36.8635C9.51384 35.0672 10.9702 33.6109 12.7665 33.6109ZM12.7665 45.971H22.9582C24.7546 45.971 26.2109 47.4273 26.2109 49.2237C26.2109 51.02 24.7548 52.4764 22.9582 52.4764H12.7665C10.9702 52.4764 9.51384 51.02 9.51384 49.2237C9.51384 47.4273 10.9702 45.971 12.7665 45.971Z"
												fill="#047247"></path> 
			 </svg>
									</span>
									<div class="right-side ml-3">
										<p class="mb-0">Credit Card</p>
										<p class="mb-0">Pay directly through credit card. Secured
											by PayGate.</p>
									</div>
								</div>
							</div>
							<div class="col-md-12">
								<div class="tab-plus-wizard">
									<div class="tab-form">
										<input type="text" class="form-control border-0 mb-3"
											id="CCNumber" aria-describedby=""
											placeholder="Credit Card Number"> <input type="text"
											class="form-control border-0 mb-3" id="nameOncard"
											aria-describedby="" placeholder="Name on Card"> <input
											type="text" class="form-control border-0 mb-3"
											id="expirationDate" aria-describedby=""
											placeholder="Expiration Date">
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="fee-payment-wrapper mt-2">
						<div class="row">
							<div class="col-md-12">
								<div class="tab-plus-wizard">
									<div class="tab-form">
										<input type="text" class="form-control border-0 mb-3"
											id="fullName" aria-describedby="" placeholder="Full Name">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="tab-plus-wizard">
									<div class="tab-form">
										<input type="text" class="form-control border-0 mb-3"
											id="postalCode" aria-describedby="" placeholder="Postal Code">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="tab-plus-wizard">
									<div class="tab-form">
										<input type="text" class="form-control border-0 mb-3"
											id="city" aria-describedby="" placeholder="City">
									</div>
								</div>
							</div>
							<div class="col-md-4">
								<div class="tab-plus-wizard">
									<div class="tab-form">
										<input type="text" class="form-control border-0 mb-3"
											id="country" aria-describedby="" placeholder="Country">
									</div>
								</div>
							</div>
						</div>
					</div>
					<button type="button"
						class="btn btn-primary common-green-bg text-white mt-3 mx-auto d-flex common-nav-links"
						id="makePayment">Make Payment Now</button>
				</div>
				<div class="credit-card-detail-view-wrapper hide"
					id="all-other-payment-details">
					<div class="fee-payment-wrapper">
						<div class="row">
							<div class="col-md-12">
								<div class="d-flex align-items-center">
									<div class="left">
										<div class="d-flex">
											<span> <svg width="99" height="99" viewBox="0 0 99 99"
													fill="none" xmlns="http://www.w3.org/2000/svg"> 
				<path
														d="M83.5312 46.4062H15.4688C13.6125 46.4062 12.375 45.1688 12.375 43.3125V6.1875C12.375 4.33125 13.6125 3.09375 15.4688 3.09375H83.5312C85.3875 3.09375 86.625 4.33125 86.625 6.1875V43.3125C86.625 45.1688 85.3875 46.4062 83.5312 46.4062ZM18.5625 40.2188H80.4375V9.28125H18.5625V40.2188Z"
														fill="#047247"></path> 
				<path
														d="M49.5 37.125C44.2406 37.125 40.2188 31.5562 40.2188 24.75C40.2188 17.9437 44.2406 12.375 49.5 12.375C54.7594 12.375 58.7812 17.9437 58.7812 24.75C58.7812 31.5562 54.7594 37.125 49.5 37.125Z"
														fill="#047247"></path> 
				<path
														d="M92.5035 51.0469C91.8848 50.1187 90.9566 49.5 89.7191 49.5C82.9129 49.5 76.416 52.5937 72.3941 58.1625L69.6098 61.875C66.2066 65.8969 60.9473 68.0625 55.6879 68.0625H46.4066C44.5504 68.0625 43.3129 66.825 43.3129 64.9688C43.3129 63.1125 44.5504 61.875 46.4066 61.875H52.2848C57.2348 61.875 61.8754 57.8531 61.8754 52.9031V52.5938C61.8754 51.0469 60.3285 49.5 58.7816 49.5H39.9098C28.7723 49.5 19.8004 54.45 14.8504 62.4938L6.49727 75.4875C5.87852 76.4156 5.87852 77.6531 6.49727 78.5812L15.7785 94.05C16.0879 94.6687 17.016 95.2875 17.6348 95.5969C17.9441 95.5969 17.9441 95.5969 18.2535 95.5969C18.8723 95.5969 19.491 95.2875 20.1098 94.9781C31.866 87.2438 45.4785 83.2219 59.4004 83.2219C69.6098 83.2219 78.891 77.6531 83.841 68.6813L92.1941 53.8312C92.8129 53.2125 92.8129 51.975 92.5035 51.0469Z"
														fill="#047247"></path> 
				<path
														d="M27.8438 6.1875H24.75H15.4688V15.4688V18.5625V21.6562C24.1312 21.6562 30.9375 14.85 30.9375 6.1875H27.8438Z"
														fill="#047247"></path> 
				<path
														d="M15.4688 30.9375V34.0312V43.3125H24.75H27.8438H30.9375C30.9375 34.65 24.1312 27.8438 15.4688 27.8438V30.9375Z"
														fill="#047247"></path> 
				<path
														d="M71.1562 43.3125H74.25H83.5312V34.0312V30.9375V27.8438C74.8688 27.8438 68.0625 34.65 68.0625 43.3125H71.1562Z"
														fill="#047247"></path> 
				<path
														d="M83.5312 18.5625V15.4688V6.1875H74.25H71.1562H68.0625C68.0625 14.85 74.8688 21.6562 83.5312 21.6562V18.5625Z"
														fill="#047247"></path> 
			   </svg>
											</span>
											<div class="right-side ml-3">
												<p class="mb-0" id="selected-payment-method">Cheque</p>
												<p class="mb-0">
													Pay with a <span id="selected-payment-method-inner">Cheque</span>
													and uploading a proof of payment.
												</p>
											</div>
										</div>
									</div>
									<div class="right">
										<input type="file" id="fire-brigade-payment-upload" onchange="attachDetailed(this.id)" 
										name="<portlet:namespace/>fire-brigade-payment-upload"
											hidden=""> <label
											class="btn btn-primary ml-5 transparent-btn"
											for="fire-brigade-payment-upload">Upload</label>
									</div>
								</div>
								<div class="supporting-document-card">
								<span id="fireBrigade-payment-file-chosen" class="attach-detailed-overview"></span>
			<%
				int counterFee=1;
				if(fireBrigadeApplicationId>0){
					boolean isFilePresent = false; 
				if(Validator.isNotNull(supportinfDocFileEntries)){
					for(DLFileEntry uploadedFile:supportinfDocFileEntries){
						try {
							FileEntry	fileEntryIdDocPay = DLAppLocalServiceUtil.getFileEntry(uploadedFile.getFileEntryId());
							fileUrlInFireBrigade=DLURLHelperUtil.getDownloadURL(fileEntryIdDocPay, fileEntryIdDocPay.getFileVersion(), themeDisplay,
									StringPool.BLANK, false, true);
							 isFilePresent = true; 
							%>
							<div class="row">
								<div class="col-md-12" id="uploadedFormResult<%=counterFee%>">
								<%if(Validator.isNotNull(uploadedFile.getSize())){ %>
								<%@ include file="/forms/uploadedFileRender2.jsp"%>
							<% 
							}%>
								</div>
							</div>
							<%
								} catch (Exception e) {}
							}
						}
				
					%>
					<script >
    // jQuery to disable or enable the upload button based on the file presence
    <% if (isFilePresent) { %>
        // Disable upload button if a file exists
        $("#fire-brigade-payment-upload, .transparent-btn").css({ "opacity": "0.4", "pointer-events": "none", "cursor": "default" });
    <% } else { %>
        // Enable upload button if no file exists
       $("#fire-brigade-payment-upload, .transparent-btn").css({ "opacity": "1", "pointer-events": "auto", "cursor": "pointer" });
    <% } %>
     </script>
     <%} %>
		                       </div>
							</div>
						</div>
					</div>
					<div class="tab-plus-wizard">
						<div class="row tab-form">
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Amount Paid</p>
									<input type="text" class="form-control" id="amountPaid"
										value="" placeholder="" oninput="this.value = this.value.replace(/[^\d.,]+/g, '').replace(/(\..*)\./g, '$1');">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
									<p class="tab-form-main-heading">Currency</p>
									<div class="select-wrapper position-relative">
										<select class="form-select form-control"
											name="currency-status" id="amountCurrency">
											<option value="" disabled="" selected="">Please
												Select</option>
											<option value="JMD">JMD</option>
											<option value="USD">USD</option>
											<option value="POUND">POUND</option>
											<option value="EURO">EURO</option>
										</select>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-5 ">
				<div class="side-line p-4">
					<div class="row">
						<div class="col-12 heading-main">
							<h1 class="first-one">Application Fee</h1>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<p class="mb-0 feeHeading"></p>
						</div>
					</div>
					<div class="row pt-3">
						<div class="col-md-12">
							<div class="d-flex align-items-center justify-content-between">
								<h1 class="fee-heading">Application Fee</h1>
								<p class="mb-0 feeAmount">$JMD 1,500.00</p>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div
								class="d-flex align-items-center justify-content-between heading-last-wrapper">
								<h1 class="heading-last">Total</h1>
								<p class="mb-0 feeAmount">$JMD 1,500.00</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="credit-card-detail-view-wrapper hide" id="receipt">
			<div class="fee-payment-wrapper">
				<div class="row">
					<div class="col-md-7">
						<div class="tab-plus-wizard">
							<div class="tab-form">
								<input type="text" class="form-control border-0 mb-3"
									id="postalCode" aria-describedby="" placeholder="Entity number">
							</div>
						</div>
					</div>
					<div class="col-md-5">
						<div class="tab-plus-wizard">
							<div class="tab-form">
								<input type="text" class="form-control border-0 mb-3" id="city"
									aria-describedby="" placeholder="Receipt Number">
							</div>
						</div>
					</div>
					<div class="col-md-12">
						<div class="tab-plus-wizard">
							<div class="tab-form">
								<input type="text" class="form-control border-0 mb-3" id="city"
									aria-describedby="" placeholder="Receipt Number"> <input
									type="text" class="form-control border-0 mb-3" id="city"
									aria-describedby="" placeholder="License Number(Optional)">
								<input type="text" class="form-control border-0 mb-3" id="city"
									aria-describedby="" placeholder="Category/Tier/Type"> <input
									type="text" class="form-control border-0 mb-3" id="city"
									aria-describedby="" placeholder="Type of Payment"> <input
									type="text" class="form-control border-0 mb-3" id="city"
									aria-describedby="" placeholder="Security Bond"> <input
									type="text" class="form-control border-0 mb-3" id="city"
									aria-describedby="" placeholder="Security Bond"> <input
									type="text" class="form-control border-0 mb-3" id="city"
									aria-describedby="" placeholder="Total">
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<%@include file="/fire-brigade-wizard-buttons.jsp" %>
</fieldset>