<%@page import="com.nbp.hsra.application.service.model.HsraApplication"%>
<%@page import="com.nbp.hsra.application.service.service.HsraApplicationLocalServiceUtil"%>
<%
	HsraApplication hasraApplicationData=null;
	 if(hsraApplicationId>0){
	try{
		hasraApplicationData=HsraApplicationLocalServiceUtil.getHsraApplication(hsraApplicationId);
		System.out.println("hasraApplicationData******"+hasraApplicationData);
	}catch(Exception e){
	}
	}
	%>
<fieldset class="wizard-fieldset show" id="hsraApplicantTypeFieldset" name="TYPE OF APPLICATION">
	<div class="instruction-div">
		<p class="heading">Instructions to Applicant</p>
		<ol>
			<li>Kindly complete all applicable sections of this application
				form and submit to the HSRA along with a copy of receipt for fees
				paid.</li>
			<li>Completed Fit and Proper Questionnaire,</li>
			<li>A certified copy of the legal operator's valid national ID</li>
			<li>All supporting documents stipulated in the guidance
				document.</li>
			<li>Additionally, a Declaration Form is to be completed and
				submitted if radioactive material or nuclear material is being used
				on premises that are leased.</li>
			<li>For construction of new facilities that will use sources of
				Categories 1 and 2, an Environmental Impact Assessment (EIA) is also
				to be submitted</li>
		</ol>
	</div>
	<section class="appicant-type">
		<div class="row" id="applicantType">
			<div class="col-md-12">
				<p class="common-section-small-heading mb-3">Types of Applicants</p>
			</div>
			<div class="col-lg-3">
				<div class="application-type-card wizard-card">
					<a href="javascript:;" class="d-block">
						<div class="application-type-card-icon text-center mb-3">
							<jsp:include page="/svg/applicant-type-svg1.jsp"/>
						</div>
						<div class="application-type-card-content">
							<p class="application-type-card-title wizard-title f2">Users of Radiation Sources</p>
						</div>
					</a>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="application-type-card wizard-card ">
					<a href="javascript:;" class="d-block">
						<div class="application-type-card-icon text-center mb-3">
							<jsp:include page="/svg/applicant-type-svg2.jsp"/>
						</div>
						<div class="application-type-card-content">
							<p class="application-type-card-title wizard-title f2">Service
								Providers</p>
						</div>
					</a>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="application-type-card wizard-card">
					<a href="javascript:;" class="d-block">
						<div class="application-type-card-icon text-center mb-3">
							<jsp:include page="/svg/applicant-type-svg3.jsp"/>
						</div>
						<div class="application-type-card-content">
							<p class="application-type-card-title wizard-title f2">Brokers</p>
						</div>
					</a>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="application-type-card wizard-card">
					<a href="javascript:;" class="d-block">
						<div class="application-type-card-icon text-center mb-3">
							<jsp:include page="/svg/applicant-type-svg4.jsp"/>
						</div>
						<div class="application-type-card-content">
							<p class="application-type-card-title wizard-title f2">Qualified
								Experts</p>
						</div>
					</a>
				</div>
			</div>
			<input type="hidden" id="applicantTypeVal" name="applicantTypeVal">
		</div>
	</section>	
	<jsp:include page="/type-of-applicant/type-of-activity.jsp" />

<section class="category-sources mt-3 hide">
		<div class="row" id="accreditationTypeServices">
			<div class="col-md-12">
				<p class="common-section-small-heading mb-0">Category of Sources</p>
				<p class="common-section-small-heading mb-3">
					<span>Please select the Categories of Sources</span>
				</p>
			</div>
		</div>
		<div class="row tab-plus-wizard" id="category-high-medium-low">
			<div class="col-md-12 tab-form">
				<table class="table table-bordered table-responsive form-group table-striped">
					<tr>
						<th class="text-nowrap">Category</th>
						<th class="w-75">Source and Practice</th>
						<th class="w-100">Activity Ratio (A/D)</th>
						<th>Risk</th>
					</tr>
					<tr>
						<td class="align-top">1.</td>
						<td class="align-top">
							<div class="form-group">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne1"
										value="High energy accelerators (Linacs Cyclotron)"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("High energy accelerators (Linacs Cyclotron)")? "checked":StringPool.BLANK%>
										name="categoryOne"> <label for="categoryOne1">
										<p class="tab-form-main-heading mb-0">High energy
											accelerators (Linacs, Cyclotron)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne2"
										value="Teletherapy (Co60 Unit)"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("Teletherapy (Co60 Unit)")? "checked":StringPool.BLANK%> name="categoryOne"> <label
										for="categoryOne2">
										<p class="tab-form-main-heading mb-0">Teletherapy (Co60
											Unit)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne3" value="Gamma Knife"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("Gamma Knife")? "checked":StringPool.BLANK%>
										name="categoryOne"> <label for="categoryOne3">
										<p class="tab-form-main-heading mb-0">Gamma Knife</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne4"
										value="Unsealed sources"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("Unsealed sources")? "checked":StringPool.BLANK%> name="categoryOne"> <label
										for="categoryOne4">
										<p class="tab-form-main-heading mb-0">Unsealed sources</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne5"
										value="Nuclear Reactors"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("Nuclear Reactors")? "checked":StringPool.BLANK%> name="categoryOne"> <label
										for="categoryOne5">
										<p class="tab-form-main-heading mb-0">Nuclear Reactors</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne6" value="Irradiators"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("Irradiators")? "checked":StringPool.BLANK%>
										name="categoryOne"> <label for="categoryOne6">
										<p class="tab-form-main-heading mb-0">Irradiators</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne7"
										value="Storage of radioactive material or waste and disposal"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("Storage of radioactive material or waste and disposal")? "checked":StringPool.BLANK%>
										name="categoryOne"> <label for="categoryOne7">
										<p class="tab-form-main-heading mb-0">Storage of
											radioactive material or waste and disposal</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne8"
										value="Radioisotope thermoelectric generators (RTGs)"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("Radioisotope thermoelectric generators (RTGs)")? "checked":StringPool.BLANK%>
										name="categoryOne"> <label for="categoryOne8">
										<p class="tab-form-main-heading mb-0">Radioisotope
											thermoelectric generators (RTGs)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryOne9" value="Other"<%=hasraApplicationData!=null &&hasraApplicationData.getHighOne().contains("Other")? "checked":StringPool.BLANK%>
										name="categoryOne"> <label for="categoryOne9">
										<p class="tab-form-main-heading mb-0">Other</p>
									</label>
								</div>
								<div class="row categoryOneOtherBox hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Please Specify</p>
											<input type="text" class="form-control" id="categoryOneOther"
												value="" placeholder="Please Specify">
										</div>
									</div>
								</div>
							</div>
						</td>
						<td class="align-top">A/D &#8805; 1000 or Personally extremely
							dangerous</td>
						<td class="align-top">High</td>
					</tr>
					<tr>
						<td class="align-top">2.</td>
						<td class="align-top">
							<div class="form-group">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo1" value="PET"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("PET")? "checked":StringPool.BLANK%>
										name="categoryTwo"> <label for="categoryTwo1">
										<p class="tab-form-main-heading mb-0">PET</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo2" value="SPECT"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("SPECT")? "checked":StringPool.BLANK%>
										name="categoryTwo"> <label for="categoryTwo2">
										<p class="tab-form-main-heading mb-0">SPECT</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo3"
										value="CT scanners (including CT simulators)"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("CT scanners (including CT simulators)")? "checked":StringPool.BLANK%>
										name="categoryTwo"> <label for="categoryTwo3">
										<p class="tab-form-main-heading mb-0">CT scanners
											(including CT simulators)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo4"
										value="Conventional Simulators"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("Conventional Simulators")? "checked":StringPool.BLANK%> name="categoryTwo"> <label
										for="categoryTwo4">
										<p class="tab-form-main-heading mb-0">Conventional
											Simulators</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo5"
										value="Brachytherapy (High Dose Rate and Medium Dose Rate)"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("Brachytherapy (High Dose Rate and Medium Dose Rate)")? "checked":StringPool.BLANK%>
										name="categoryTwo"> <label for="categoryTwo5">
										<p class="tab-form-main-heading mb-0">Brachytherapy (High
											Dose Rate and Medium Dose Rate</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo6"
										value="Industrial radiography sources"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("Industrial radiography sources")? "checked":StringPool.BLANK%> name="categoryTwo">
									<label for="categoryTwo6">
										<p class="tab-form-main-heading mb-0">Industrial
											radiography sources</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo7"
										value="Gamma radiography camera"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("Gamma radiography camera")? "checked":StringPool.BLANK%> name="categoryTwo"> <label
										for="categoryTwo7">
										<p class="tab-form-main-heading mb-0">Gamma radiography
											camera</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo8" value="Other"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("Other")? "checked":StringPool.BLANK%>
										name="categoryTwo"> <label for="categoryTwo8">
										<p class="tab-form-main-heading mb-0">Other</p>
									</label>
								</div>
								<div class="row categoryTwoOtherBox hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Please Specify</p>
											<input type="text" class="form-control" id="categoryTwoOther"
												value="" placeholder="Please Specify">
										</div>
									</div>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo9"
										value="Gamma radiography crawlers"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("Gamma radiography crawlers")? "checked":StringPool.BLANK%> name="categoryTwo">
									<label for="categoryTwo9">
										<p class="tab-form-main-heading mb-0">Gamma radiography
											crawlers</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryTwo10"
										value="VACIS scanners"<%=hasraApplicationData!=null &&hasraApplicationData.getHighTwo().contains("VACIS scanners")? "checked":StringPool.BLANK%> name="categoryTwo"> <label
										for="categoryTwo10">
										<p class="tab-form-main-heading mb-0">VACIS scanners</p>
									</label>
								</div>
							</div>
						</td>
						<td class="align-top">1000 > A/D &#8805; 10 or Personally very
							dangerous</td>
						<td class="align-top">High</td>
					</tr>
					<tr>
						<td class="align-top">3.</td>
						<td class="align-top">
							<div class="form-group">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree1"
										value="X-ray fluorescence machines"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("X-ray fluorescence machines")? "checked":StringPool.BLANK%> name="categoryThree">
									<label for="categoryThree1">
										<p class="tab-form-main-heading mb-0">X-ray fluorescence
											machines</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree2"
										value="Angiography machines"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Angiography machines")? "checked":StringPool.BLANK%> name="categoryThree"> <label
										for="categoryThree2">
										<p class="tab-form-main-heading mb-0">Angiography machines</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree3" value="C-Arm"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("C-Arm")? "checked":StringPool.BLANK%>
										name="categoryThree"> <label for="categoryThree3">
										<p class="tab-form-main-heading mb-0">C-Arm</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree4"
										value="Plane X-ray machines (includes portable x-ray machines)"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Plane X-ray machines (includes portable x-ray machines)")? "checked":StringPool.BLANK%>
										name="categoryThree"> <label for="categoryThree4">
										<p class="tab-form-main-heading mb-0">Plane X-ray machines
											(includes portable x-ray machines)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree5"
										value="Superficial X-rays"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Superficial X-rays")? "checked":StringPool.BLANK%> name="categoryThree"> <label
										for="categoryThree5">
										<p class="tab-form-main-heading mb-0">Superficial X-rays</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree6"
										value="Fixed industrial high-activity gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Fixed industrial high-activity gauges")? "checked":StringPool.BLANK%>
										name="categoryThree"> <label for="categoryThree6">
										<p class="tab-form-main-heading mb-0">Fixed industrial
											high-activity gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree7"
										value="Well logging gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Well logging gauges")? "checked":StringPool.BLANK%> name="categoryThree"> <label
										for="categoryThree7">
										<p class="tab-form-main-heading mb-0">Well logging gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree8"
										value="Density gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Density gauges")? "checked":StringPool.BLANK%> name="categoryThree"> <label
										for="categoryThree8">
										<p class="tab-form-main-heading mb-0">Density gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree9"
										value="Level gauges Backscatter gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Level gauges Backscatter gauges")? "checked":StringPool.BLANK%> name="categoryThree">
									<label for="categoryThree9">
										<p class="tab-form-main-heading mb-0">Level gauges
											Backscatter gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree10"
										value="Moisture or density gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Moisture or density gauges")? "checked":StringPool.BLANK%> name="categoryThree">
									<label for="categoryThree10">
										<p class="tab-form-main-heading mb-0">Moisture or density
											gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree11"
										value="In-stream analysis gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("In-stream analysis gauges")? "checked":StringPool.BLANK%> name="categoryThree">
									<label for="categoryThree11">
										<p class="tab-form-main-heading mb-0">In-stream analysis
											gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree12"
										value="Portable gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Portable gauges")? "checked":StringPool.BLANK%> name="categoryThree"> <label
										for="categoryThree12">
										<p class="tab-form-main-heading mb-0">Portable gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryThree13" value="Other"<%=hasraApplicationData!=null &&hasraApplicationData.getMedium().contains("Other")? "checked":StringPool.BLANK%>
										name="categoryThree"> <label for="categoryThree13">
										<p class="tab-form-main-heading mb-0">Other</p>
									</label>
								</div>
								<div class="row categoryThreeOtherBox hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Please Specify</p>
											<input type="text" class="form-control"
												id="categoryThreeOther" value=""
												placeholder="Please Specify">
										</div>
									</div>
								</div>
							</div>
						</td>
						<td class="align-top">10 >A/D&#8805;  1 or Personally dangerous</td>
						<td class="align-top">Medium</td>
					</tr>
					<tr>
						<td class="align-top">4.</td>
						<td class="align-top">
							<div class="form-group">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFour1"
										value="X-ray industrial gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getLowOne().contains("X-ray industrial gauges")? "checked":StringPool.BLANK%> name="categoryFour"> <label
										for="categoryFour1">
										<p class="tab-form-main-heading mb-0">X-ray industrial
											gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFour2"
										value="Low activity industrial gauges"<%=hasraApplicationData!=null &&hasraApplicationData.getLowOne().contains("Low activity industrial gauges")? "checked":StringPool.BLANK%> name="categoryFour">
									<label for="categoryFour2">
										<p class="tab-form-main-heading mb-0">Low activity
											industrial gauges</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFour3"
										value="Panoramic and cephalometric dental X-rays"<%=hasraApplicationData!=null &&hasraApplicationData.getLowOne().contains("Panoramic and cephalometric dental X-rays")? "checked":StringPool.BLANK%>
										name="categoryFour"> <label for="categoryFour3">
										<p class="tab-form-main-heading mb-0">Panoramic and
											cephalometric dental X-rays</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFour4"
										value="Whole body bone densitometers"<%=hasraApplicationData!=null &&hasraApplicationData.getLowOne().contains("Whole body bone densitometers")? "checked":StringPool.BLANK%> name="categoryFour">
									<label for="categoryFour4">
										<p class="tab-form-main-heading mb-0">Whole body bone
											densitometers</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFour5"
										value="Full scan vehicle imaging system"<%=hasraApplicationData!=null &&hasraApplicationData.getLowOne().contains("Full scan vehicle imaging system")? "checked":StringPool.BLANK%> name="categoryFour">
									<label for="categoryFour5">
										<p class="tab-form-main-heading mb-0">Full scan vehicle
											imaging system</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFour6" value="Other"<%=hasraApplicationData!=null &&hasraApplicationData.getLowOne().contains("Other")? "checked":StringPool.BLANK%>
										name="categoryFour"> <label for="categoryFour6">
										<p class="tab-form-main-heading mb-0">Other</p>
									</label>
								</div>
								<div class="row categoryFourOtherBox hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Please Specify</p>
											<input type="text" class="form-control"
												id="categoryFourOther" value="" placeholder="Please Specify">
										</div>
									</div>
								</div>
							</div>
						</td>
						<td class="align-top">1 >A/D&#8805;  0.01 or Unlikely to be
							dangerous</td>
						<td class="align-top">Low</td>
					</tr>
					<tr>
						<td class="align-top">5.</td>
						<td class="align-top">
							<div class="form-group">
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive1"
										value="Brachytherapy permanent implants"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("Brachytherapy permanent implants")? "checked":StringPool.BLANK%> name="categoryFive">
									<label for="categoryFive1">
										<p class="tab-form-main-heading mb-0">Brachytherapy
											permanent implants</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive2" value="XRF analyzers"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("XRF analyzers")? "checked":StringPool.BLANK%>
										name="categoryFive"> <label for="categoryFive2">
										<p class="tab-form-main-heading mb-0">XRF analyzers</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive3"
										value="X-ray diffraction (XRD)"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("X-ray diffraction (XRD)")? "checked":StringPool.BLANK%> name="categoryFive"> <label
										for="categoryFive3">
										<p class="tab-form-main-heading mb-0">X-ray diffraction
											(XRD)</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive4"
										value="Mammography units"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("Mammography units")? "checked":StringPool.BLANK%> name="categoryFive"> <label
										for="categoryFive4">
										<p class="tab-form-main-heading mb-0">Mammography units</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive5"
										value="Intra oral and portable dental units"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("Intra oral and portable dental units")? "checked":StringPool.BLANK%>
										name="categoryFive"> <label for="categoryFive5">
										<p class="tab-form-main-heading mb-0">Intra oral and
											portable dental units</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive6"
										value="Veterinary X-rays units"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("Veterinary X-rays units")? "checked":StringPool.BLANK%> name="categoryFive">
									<label for="categoryFive6">
										<p class="tab-form-main-heading mb-0">Veterinary X-rays
											units</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive7"
										value="Baggage scanners"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("Baggage scanners")? "checked":StringPool.BLANK%> name="categoryFive"> <label
										for="categoryFive7">
										<p class="tab-form-main-heading mb-0">Baggage scanners</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive8"
										value="Portable bone densitometers"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("Portable bone densitometers")? "checked":StringPool.BLANK%> name="categoryFive">
									<label for="categoryFive8">
										<p class="tab-form-main-heading mb-0">Portable bone
											densitometers</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive9" value="Check sources"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("Check sources")? "checked":StringPool.BLANK%>
										name="categoryFive"> <label for="categoryFive9">
										<p class="tab-form-main-heading mb-0">Check sources</p>
									</label>
								</div>
								<div class="checkbox-form-group second-custom-checkbox">
									<input type="checkbox" id="categoryFive10" value="Other"<%=hasraApplicationData!=null &&hasraApplicationData.getLowTwo().contains("Other")? "checked":StringPool.BLANK%>
										name="categoryFive"> <label for="categoryFive10">
										<p class="tab-form-main-heading mb-0">Other</p>
									</label>
								</div>
								<div class="row categoryFiveOtherBox hide">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Please Specify</p>
											<input type="text" class="form-control"
												id="categoryFiveOther" value="" placeholder="Please Specify">
										</div>
									</div>
								</div>
							</div>
						</td>
						<td class="align-top">0.01 >and A&#8805;  exempt or Not dangerous</td>
						<td class="align-top">Low</td>
					</tr>
				</table>
			</div>
		</div>
	</section>
	<%@ include file="/hsra-wizard-buttons.jsp"%>
</fieldset>