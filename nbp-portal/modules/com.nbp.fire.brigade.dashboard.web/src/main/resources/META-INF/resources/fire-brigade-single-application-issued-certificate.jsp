<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="com.liferay.document.library.util.DLURLHelperUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.document.library.kernel.model.DLFileEntry"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.nbp.fire.brigade.stage.service.service.FireBrigadeCertificateLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.nbp.fire.brigade.application.form.service.service.FireBrigadePremisesInfoLocalServiceUtil"%>
<%@page import="com.nbp.fire.brigade.application.form.service.model.FireBrigadePremisesInfo"%>
<% 
FireBrigadePremisesInfo premiseIfo=null;
FireBrigadeCertificate certificate=null;
String docfileUrl = "";
String docPreviewUrl = "";
try{
	premiseIfo=FireBrigadePremisesInfoLocalServiceUtil.getFireBrigadeByAppId(fireBrigadeApp.getFireBrigadeApplicationId());
 }catch(Exception e){
  }
try{
	certificate=FireBrigadeCertificateLocalServiceUtil.getFireBrigadeCertificateByCaseId(fireBrigadeApp.getCaseId());
}catch(Exception e){
}
FileEntry docfileEntry = null;
if(certificate!=null){
	try {
		 docfileEntry = DLAppLocalServiceUtil.getFileEntry(certificate.getDocFileEntry());
	     docfileUrl = DLURLHelperUtil.getDownloadURL(docfileEntry, docfileEntry.getFileVersion(), themeDisplay,
				StringPool.BLANK, false, false);
		 docPreviewUrl = DLURLHelperUtil.getPreviewURL(docfileEntry, docfileEntry.getFileVersion(), themeDisplay,
				StringPool.BLANK, false, true); 
	}catch (Exception e) {
    }
}
%>
<section class="mt-5 conditional-licence wizard-section dashboard-progress certificate-issuance">
  <div class="container">
	<div class="d-flex justify-content-between">
		<p class="main-heading mb-0">Certificates</p>
	</div>
	
	<div class="dashboard-progress dash-common-card">
		<div class="container">
			<div class="row py-3 overview-details">
					<div class="col-md-3 tier-plus-issuedate-box">
						<div class="single-box">
							<p class="upper-title">Name Of Premises</p>
							<p class="lower-title">
								<span class="one sub-heading"><%=Validator.isNotNull(premiseIfo)&&Validator.isNotNull(premiseIfo.getName())?premiseIfo.getName():"Not Available" %></span> 
							</p>
						</div>
					</div>	
					<div class="col-md-3 tier-plus-issuedate-box">
						<div class="single-box">
							<p class="upper-title">Name Of Owner/Manager</p>
							<p class="lower-title">
								<span class="one sub-heading"><%=Validator.isNotNull(certificate)&&Validator.isNotNull(certificate.getNameOfOwner())?certificate.getNameOfOwner():"Not Available" %></span> 
							</p>
						</div>
					</div>	
					<div class="col-md-3 tier-plus-issuedate-box">
						<div class="single-box">
							<p class="upper-title">Date of Issue</p>
							<p class="lower-title">
								<span class="one sub-heading"><%=Validator.isNotNull(certificate)&&Validator.isNotNull(certificate.getIssueDate()) ?new SimpleDateFormat("dd/MM/yyyy").format(certificate.getIssueDate()):"Not Available"%></span>
							</p>
						</div>
					</div>	
					<div class="col-md-3 tier-plus-issuedate-box">
						<div class="single-box">
							<p class="upper-title">Date of Expiration</p>
							<p class="lower-title">
								<span class="one sub-heading"><%=Validator.isNotNull(certificate)&&Validator.isNotNull(certificate.getExpirationDate()) ?new SimpleDateFormat("dd/MM/yyyy").format(certificate.getExpirationDate()):"Not Available"%></span>
							</p>
						</div>
					</div>
					<div class="col-md-3 tier-plus-issuedate-box">	
						<div class="single-box">
							<p class="upper-title">Type of Premises</p>
							<p class="lower-title">
								<span class="one sub-heading"><%=Validator.isNotNull(fireBrigadeApp)&&Validator.isNotNull(fireBrigadeApp.getTypeOfPermises())?fireBrigadeApp.getTypeOfPermises():"Not Available" %></span>
							</p>
						</div>
					</div>
					<div class="col-md-3 tier-plus-issuedate-box">	
						<div class="single-box">
							<p class="upper-title">Address of Premises</p>
							<p class="lower-title">
								<span class="one sub-heading"><%=Validator.isNotNull(premiseIfo)&&Validator.isNotNull(premiseIfo.getAddress())?premiseIfo.getAddress():"Not Available" %></span>
							</p>
						</div>
					</div>
					<div class="col-md-3 tier-plus-issuedate-box">	
						<div class="single-box">
							<p class="upper-title">Certificate Number</p>
							<p class="lower-title">
								<span class="one sub-heading"><%=Validator.isNotNull(certificate)&&Validator.isNotNull(certificate.getCertificateNumber())?certificate.getCertificateNumber():"Not Available" %></span>
							</p>
						</div>
					</div>
					<div class="col-md-3 tier-plus-issuedate-box">	
						<div class="dash-action-box d-flex">
							<a href="<%=Validator.isNotNull(docfileUrl)?docfileUrl:"javascript:void(0);"%>" class="dash-action-btns common-yellow-bg mr-2"> 
								<svg width="15" height="17" viewBox="0 0 15 17" fill="none" xmlns="http://www.w3.org/2000/svg">
		                            <path d="M14.5 6H10.5V0H4.5V6H0.5L7.5 13L14.5 6ZM0.5 15V17H14.5V15H0.5Z" fill="#1B1917"></path>
		                        </svg>
							</a> 
							<a href="<%=Validator.isNotNull(docPreviewUrl)?docPreviewUrl:"javascript:void(0);"%>" class="dash-action-btns common-yellow-bg"> 
								<svg xmlns="http://www.w3.org/2000/svg" width="23" height="18" viewBox="0 0 20 20" fill="none">
								  <path fill="#1B1917" fill-rule="evenodd" d="M4 1a2 2 0 00-2 2v14a2 2 0 002 2h12a2 2 0 002-2V7.414A2 2 0 0017.414 6L13 1.586A2 2 0 0011.586 1H4zm0 2h7.586L16 7.414V17H4V3zm2 2a1 1 0 000 2h5a1 1 0 100-2H6zm-1 5a1 1 0 011-1h8a1 1 0 110 2H6a1 1 0 01-1-1zm1 3a1 1 0 100 2h8a1 1 0 100-2H6z"/>
								</svg>
							</a>
						</div>
					</div>	
				</div>
			</div>
		</div>
	</div>
</section>