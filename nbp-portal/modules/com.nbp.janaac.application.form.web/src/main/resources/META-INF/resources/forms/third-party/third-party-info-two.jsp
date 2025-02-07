<%@page import="com.nbp.janaac.application.form.service.service.AccThirdPartyScopeLocalServiceUtil"%>
<%@page import="com.nbp.janaac.application.form.service.model.AccThirdPartyScope"%>
<%@ include file="../../init.jsp" %>
<% 
AccThirdPartyScope accThirdPartyScopeInfo=null;
if (janaacApplicationId > 0) {
	try{
		accThirdPartyScopeInfo=	AccThirdPartyScopeLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
	}catch(Exception e){
	}
}
%>
<div class="tab-pane" role="tabpanel" id="childStep57">
	<div class="tab-form">
		<div class="laboratories-medical-organization-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">II. Scope, Clients and Interested Parties</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">4.0</span> Indicate in the section below, the specific scope(s) which accreditation is being requested. Also, include technical competence/expertise and limits of capability where applicable.</p>
					<p class="tab-form-sub-heading"><span class="tab-form-highlghtme-link pr-2">NB:</span> Refer Appendix 1 as a guide for selecting the applicable products/processes and FDA Regulations.</p>
					<p class="tab-form-main-heading mb-0"><b>Category</b></p>
					<p class="tab-form-sub-heading mb-0">Select the relevant food categories that apply</p>
					<p class="tab-form-sub-heading">Example: Seafood HACCP</p>
				</div>
				<div class="col-md-12 scope-list-checkboxes">
					<div class="form-group">
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory1" value="Preventive Control for Human Foods(PCHF)"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Preventive Control for Human Foods(PCHF)")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory1">
								<p class="tab-form-main-heading mb-0">Preventive Control for Human Foods(PCHF)</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct1" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct1())?accThirdPartyScopeInfo.getFoodProduct1():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>	
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation1" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation1())?accThirdPartyScopeInfo.getFoodRegulation1():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory2" value="Preventive Control for Animal Foods (PCAF)"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Preventive Control for Animal Foods (PCAF)")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory2">
								<p class="tab-form-main-heading mb-0">Preventive Control for Animal Foods (PCAF)</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct2" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct2())?accThirdPartyScopeInfo.getFoodProduct2():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation2" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation2())?accThirdPartyScopeInfo.getFoodRegulation2():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory3" value="Acidified Foods (AF)"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Acidified Foods (AF)")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory3">
								<p class="tab-form-main-heading mb-0">Acidified Foods (AF)</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct3" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct3())?accThirdPartyScopeInfo.getFoodProduct3():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation3" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation3())?accThirdPartyScopeInfo.getFoodRegulation3():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory4" value="Low-Acid Canned Foods (LACF)"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Low-Acid Canned Foods (LACF)")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory4">
								<p class="tab-form-main-heading mb-0">Low-Acid Canned Foods (LACF)</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct4" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct4())?accThirdPartyScopeInfo.getFoodProduct4():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation4" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation4())?accThirdPartyScopeInfo.getFoodRegulation4():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory5" value="Juice Hazard Analysis and Critical Control Point (Juice HACCP)"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Juice Hazard Analysis and Critical Control Point (Juice HACCP)")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory5">
								<p class="tab-form-main-heading mb-0">Juice Hazard Analysis and Critical Control Point (Juice HACCP)</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct5" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct5())?accThirdPartyScopeInfo.getFoodProduct5():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation5" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation5())?accThirdPartyScopeInfo.getFoodRegulation5():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory6" value="Seafood Hazard Analysis and Critical Control Point (Seafood HACCP)"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Seafood Hazard Analysis and Critical Control Point (Seafood HACCP)")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory6">
								<p class="tab-form-main-heading mb-0">Seafood Hazard Analysis and Critical Control Point (Seafood HACCP)</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct6" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct6())?accThirdPartyScopeInfo.getFoodProduct6():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation6" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation6())?accThirdPartyScopeInfo.getFoodRegulation6():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory7" value="Shell eggs"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Shell eggs")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory7">
								<p class="tab-form-main-heading mb-0">Shell eggs</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct7" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct7())?accThirdPartyScopeInfo.getFoodProduct7():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation7" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation7())?accThirdPartyScopeInfo.getFoodRegulation7():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory8" value="Produce Safety"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Produce Safety")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory8">
								<p class="tab-form-main-heading mb-0">Produce Safety</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct8" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct8())?accThirdPartyScopeInfo.getFoodProduct8():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation8" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation8())?accThirdPartyScopeInfo.getFoodRegulation8():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory9" value="Medicated Feed"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Medicated Feed")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory9">
								<p class="tab-form-main-heading mb-0">Medicated Feed</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct9" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct9())?accThirdPartyScopeInfo.getFoodProduct9():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation9" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation9())?accThirdPartyScopeInfo.getFoodRegulation9():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory10" value="Dietary Supplements"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Dietary Supplements")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory10">
								<p class="tab-form-main-heading mb-0">Dietary Supplements</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct10" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct10())?accThirdPartyScopeInfo.getFoodProduct10():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation10" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation10())?accThirdPartyScopeInfo.getFoodRegulation10():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
							<input type="checkbox" id="accreditationCategory11" value="Other"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getAccreditationCategory().contains("Other")? "checked":StringPool.BLANK%> name="accreditationCategory"> 
							<label for="accreditationCategory11">
								<p class="tab-form-main-heading mb-0">Other</p>
							</label>
						</div>
						<div class="row accreditationCategoryInfo px-4 mx-1 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Please Specify</p>
									<input type="text" class="form-control" id="accreditationCategoryOther" value="<%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getAccCategoryOther())?accThirdPartyScopeInfo.getAccCategoryOther():""%>" placeholder="">
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Food Products/Process</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodProduct11" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodProduct11())?accThirdPartyScopeInfo.getFoodProduct11():""%></textarea>
									<p class="tab-form-sub-heading mb-0">Describe the specific food products/processes to be covered by the scope</p>
									<p class="tab-form-sub-heading mb-0"><b>Example:</b> Fisheries/Seafood products:<br>
										a) Fish and Fishery products<br>
										b) Fish and shellfish</p>
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">FDA Regulations</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="foodRegulation11" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getFoodRegulation11())?accThirdPartyScopeInfo.getFoodRegulation11():""%></textarea>
									<p class="tab-form-sub-heading mb-0">State the specific FDA regulations against which accreditation is being sought.</p>
									<p class="tab-form-sub-heading"><b>Example:</b> CFR 21, Chapter I, Subchapter B, parts 123, 161, 121, 108, 113, 114, 117, 172, 174</p>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading mb-0">
							<span class="tab-form-highlghtme-link pr-2">5.0</span> List the registered client organizations for which the certification body currently provides certification services (add additional pages as necessary). State also the food products/processes and FDA Regulatory Codes applicable to the scope of certification.
						</p>
					</div>
					<input id="registeredClientOrgThirdPartyVal" type="hidden" name="registeredClientOrgThirdPartyVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="registeredClientOrgThirdPartyDetailBox">
							<div class="accordion__header is-active"
								id="registeredClientOrgThirdPartyDetail" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>Registered Client Organizations</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Client Organization</p>
											<input type="text" class="form-control" id="clientOrganizationNameThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Food Products/Process</p>
											<input type="text" class="form-control"
												id="foodProductThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">FDA Regulations</p>
											<input type="text" class="form-control"
												id="fdaRegulationsThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Date granted</p>
											<input type="date" class="form-control" id="firstGrantedDateThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addRegisteredClientOrgThirdPartyDetail" onclick="addRegisteredClientOrgThirdPartyDetail();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div
						class="col-12 table-responsive hide addRegisteredClientOrgThirdPartyDetailTableBox">
						<table class="table table-bordered mb-3">
							<tbody class="addRegisteredClientOrgThirdPartyDetailTable">
								<tr>
									<th class="sub_heading text-nowrap">Client Organization</th>
									<th class="sub_heading text-nowrap">Food Products/Process</th>
									<th class="sub_heading text-nowrap">FDA Regulations</th>
									<th class="sub_heading text-nowrap">Date granted</th>
									<th class="sub_heading">Edit</th>
									<th class="sub_heading">Delete</th>
								</tr>
<%if(fdaScopeClientInfo!=null){
long CounterOfFdaScopeClientInfoAdd=1;
for(AddFdaScopeClient ScopeClientInfo:fdaScopeClientInfo){
%>			
<tr class="registered-client-org-third-party-row<%=CounterOfFdaScopeClientInfoAdd%>">
<td class="sub_heading_content clientOrganizationNameThirdParty<%=CounterOfFdaScopeClientInfoAdd%>">
<%=Validator.isNotNull(ScopeClientInfo)&&Validator.isNotNull(ScopeClientInfo.getClientOrganization())?ScopeClientInfo.getClientOrganization():""%></td>
<td class="sub_heading_content foodProductThirdParty<%=CounterOfFdaScopeClientInfoAdd%>">
<%=Validator.isNotNull(ScopeClientInfo)&&Validator.isNotNull(ScopeClientInfo.getFoodProducts())?ScopeClientInfo.getFoodProducts():""%></td>
<td class="sub_heading_content fdaRegulationsThirdParty<%=CounterOfFdaScopeClientInfoAdd%>">
<%=Validator.isNotNull(ScopeClientInfo)&&Validator.isNotNull(ScopeClientInfo.getFdaRegulations())?ScopeClientInfo.getFdaRegulations():""%></td>
<td class="sub_heading_content firstGrantedDateThirdParty<%=CounterOfFdaScopeClientInfoAdd%>">
<%=Validator.isNotNull(ScopeClientInfo)&&Validator.isNotNull(ScopeClientInfo.getDateGranted())?new SimpleDateFormat("YYYY-mm-dd").format(ScopeClientInfo.getDateGranted()):""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="registeredClientOrgThirdPartyEditTab" onclick="registeredClientOrgThirdPartyEditTab('<%=CounterOfFdaScopeClientInfoAdd%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="registeredClientOrgThirdPartyDeleteDataTab" onclick="registeredClientOrgThirdPartyDeleteData('<%=CounterOfFdaScopeClientInfoAdd%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="registeredClientOrgThirdPartyId<%=CounterOfFdaScopeClientInfoAdd%>" name="registeredClientOrgThirdPartyId<%=CounterOfFdaScopeClientInfoAdd%>" value="<%=ScopeClientInfo.getAddFdaScopeClientId()%>">    
 <%
  CounterOfFdaScopeClientInfoAdd++;
						}
}
					%>											
							</tbody>
						</table>
					</div>
				</div>
										
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">6.0</span> Indicate the interested parties (persons or organizations), excluding clients and staff, stating their specific interest. (e.g., government ministries, public/private entities, individuals etc.).</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="intrestedPartiesThirdParty" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getCerIntrestedParties())?accThirdPartyScopeInfo.getCerIntrestedParties():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">7.0</span> Does the certification body or entities under the same organizational control, provide services other than
							certification?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getOtherServices().equals("Yes")? "checked":StringPool.BLANK%> name="thirdPartyOtherServices">
							<label for="thirdPartyOtherServices">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getOtherServices().equals("No")? "checked":StringPool.BLANK%> name="thirdPartyOtherServices">
							<label for="thirdPartyOtherServices">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 thirdPartyOtherServicesBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">8.0</span> briefly describe the nature of these services and the general groups who are clients of these services</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="thirdPartyOtherServicesDescribe" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getOtherServicesDescribe())?accThirdPartyScopeInfo.getOtherServicesDescribe():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">9.0</span> Does the certification body have established relationships with any organizations that perform internal auditing or consultancy services?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getEstablishedRelation().equals("Yes")? "checked":StringPool.BLANK%> name="thirdPartyEstablishedRelation">
							<label for="thirdPartyEstablishedRelation">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getEstablishedRelation().equals("No")? "checked":StringPool.BLANK%> name="thirdPartyEstablishedRelation">
							<label for="thirdPartyEstablishedRelation">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 thirdPartyEstablishedRelationBox hide">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">10.0</span> give a brief description of the organization(s), services provided and the nature/extent of their relationship with the certification body. Include names/positions of the key operational personnel within the organization(s)</p>
						<textarea rows="3" class="mt-3 form-control" maxlength="255" id="thirdPartyEstablishedRelationDesc" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getEstablishedRelDesc())?accThirdPartyScopeInfo.getEstablishedRelDesc():""%></textarea>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">11.0</span> Has your organization provided certification services for any client that has received consultancy or internal audit services from any organization described in 9 and 10 above?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getClientService().equals("Yes")? "checked":StringPool.BLANK%> name="thirdPartyCertificationService">
							<label for="thirdPartyCertificationService">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getClientService().equals("No")? "checked":StringPool.BLANK%> name="thirdPartyCertificationService">
							<label for="thirdPartyCertificationService">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">12.0</span> Has your organization provided certification services for any client that is also a certification body?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getCertificationCerBody().equals("Yes")? "checked":StringPool.BLANK%> name="orgProvideCertificateThirdParty">
							<label for="orgProvideCertificateThirdParty">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getCertificationCerBody().equals("No")? "checked":StringPool.BLANK%> name="orgProvideCertificateThirdParty">
							<label for="orgProvideCertificateThirdParty">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">13.0</span> Has your organization been previously accredited by another accreditation body?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getOrgAccredited().equals("Yes")? "checked":StringPool.BLANK%> name="orgPreviouslyAccreditedThirdParty">
							<label for="orgPreviouslyAccreditedThirdParty">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=accThirdPartyScopeInfo!=null &&accThirdPartyScopeInfo.getOrgAccredited().equals("No")? "checked":StringPool.BLANK%> name="orgPreviouslyAccreditedThirdParty">
							<label for="orgPreviouslyAccreditedThirdParty">No</label>
						</div>
					</div>
				</div>
			</div>
			<div class="row hide orgPreviouslyAccreditedThirdPartyBox">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">14.0 Indicate:</span></p>
						<p class="tab-form-main-heading">The name of the body responsible for the most recent accreditation</p>
						<input type="text" class="form-control" id="responsibleBodyAccreditationThirdParty" value="<%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getResponsibleBody())?accThirdPartyScopeInfo.getResponsibleBody():""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-6">
					<div class="form-group">
						<p class="tab-form-main-heading">The expiry date of accreditation</p>
						<input type="date" class="form-control" id="accreditationExpDateThirdParty" value="<%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getAccExpDate())?new SimpleDateFormat("YYYY-MM-dd").format(accThirdPartyScopeInfo.getAccExpDate()):""%>" placeholder=""/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading">The scope for which the certification body is/was accredited</p>
						<input type="text" class="form-control" id="certBodyScopeThirdParty" value="<%=Validator.isNotNull(accThirdPartyScopeInfo)&&Validator.isNotNull(accThirdPartyScopeInfo.getCertBodyScope())?accThirdPartyScopeInfo.getCertBodyScope():""%>" placeholder=""/>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="addThirdPartyScopeInfo(); accFDAThirdPartyScopeService(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
	                        <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
	                       </svg>
		</span>
	</button>
</div>
<!-- Scope, Clients and Interested Parties Form End-->

<!-- Personnel and Resources Form Start-->
<div class="tab-pane" role="tabpanel" id="childStep58">
	<div class="tab-form">
		<div class="human-resources-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">III. Personnel and Resources</p>
					<!-- <p class="tab-form-title-subtitle f2">Answer all questions in the space provided. Please ensure that the cover page is 
					signed by the organization/department leader, stamped or sealed, and dated, where attachments are necessary.</p> -->
				</div>
			</div>
			<div class="row">
				<div class="col-md-12"> 
					<div class="form-group mb-0"> 
					 <p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2">15.0</span> Indicate</p> 
					</div> 
				</div>
				<div class="col-md-6"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">a. Size of internal staff</p> 
					 <input type="text" class="form-control" id="internalStaffSizeThirdParty" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getInternalStaffSize())?cerBodyPersonnel.getInternalStaffSize():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-6"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">b. Number of auditors</p> 
					 <input type="text" class="form-control" id="auditorsNumThirdParty" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getAuditorsNum())?cerBodyPersonnel.getAuditorsNum():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-12"> 
					<div class="form-group mt-2"> 
					 <p class="tab-form-sub-heading">c. Number of contracted personnel</p> 
					 <input type="text" class="form-control" id="contractedPerNumThirdParty" placeholder="" value="<%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getContractedPerNum())?cerBodyPersonnel.getContractedPerNum():""%>"
					 oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');"> 
					</div> 
				</div>
				<div class="col-md-12">
					<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">16.0</span> Supported by documentation in Section A, II, 6. above, list all internal staff members for each position within the organizational with functions related to certification activities, indicating the name, respective job titles and primary responsibilities in the table below. Please also indicate in the last column by referencing the corresponding letter (i.e., a - o), individuals specifically responsible for the following functions</p>
					<ul class="list-group tab-form-sub-heading mb-3">
						<li class="list-group-item">a. Development and implementation of operational policies, processes and procedures</li>
						<li class="list-group-item">b. Supervision of the implementation of operational policies, processes and procedures</li>
						<li class="list-group-item">c. Ensuring impartiality</li>
						<li class="list-group-item">d. Making decisions on certification</li>
						<li class="list-group-item">e. Supervision of finances</li>
						<li class="list-group-item">f. Development of management system certification schemes and services</li>
						<li class="list-group-item">g. Leading/conducting certification audits; audit reporting</li>
						<li class="list-group-item">h. Contractual arrangements</li>
						<li class="list-group-item">i. Provision of resources for certification activities and associated operations</li>
						<li class="list-group-item">j. Delegating authority to individual and committees to undertake activities on its behalf</li>
						<li class="list-group-item">k. Selection, training and authorizing personnel including auditors and technical experts</li>
						<li class="list-group-item">l. Handling appeals</li>
						<li class="list-group-item">m. Handling complaints</li>
						<li class="list-group-item">n. Establishing, implementing and maintaining the management system processes and procedures</li>
						<li class="list-group-item">o. Assessing and reporting on the performance of the management system</li>
					</ul>
				</div>
				<div class="col-md-12">
					<input id="staffDetailThirdPartyVal" type="hidden" name="staffDetailThirdPartyVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="staffDetailThirdPartyBox">
							<div class="accordion__header is-active"
								id="staffDetailCertificationThirdParty" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2>Staff Details</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Name of Staff Member</p>
											<input type="text" class="form-control"
												id="staffNameThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Job Title</p>
											<input type="text" class="form-control"
												id="jobTitleThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Major Responsibilities</p>
											<textarea rows="3" id="majorResponsibilitiesThirdParty"
												class="form-control" maxlength="255" placeholder=""
												style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Specific Functions</p>
											<input type="text" class="form-control"
												id="specificFunctionThirdParty" value="" placeholder="">
											<p class="tab-form-sub-heading">(Relative to 16.0 a. - o. above)</p>
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addStaffDetailThirdParty" onclick="addStaffDetailThirdParty();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addStaffDetailThirdPartyTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addStaffDetailThirdPartyTable">
							<tr>
								<th class="sub_heading text-nowrap">Name of Staff</th>
								<th class="sub_heading text-nowrap">Job Title</th>
								<th class="sub_heading text-nowrap">Major Responsibilities</th>
								<th class="sub_heading text-nowrap">Specific Functions</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(fdaPersonnelFirstInfo!=null){
long counterOfFdaPerFirstInfoAdd=1;
for(AddFdaPersonnelFirst perFirstInfo:fdaPersonnelFirstInfo){
%>			
<tr class="staff-detail-third-party-row<%=counterOfFdaPerFirstInfoAdd%>">
<td class="sub_heading_content staffNameThirdParty<%=counterOfFdaPerFirstInfoAdd%>">
<%=Validator.isNotNull(perFirstInfo)&&Validator.isNotNull(perFirstInfo.getNameOfStaff())?perFirstInfo.getNameOfStaff():""%></td>
<td class="sub_heading_content jobTitleThirdParty<%=counterOfFdaPerFirstInfoAdd%>">
<%=Validator.isNotNull(perFirstInfo)&&Validator.isNotNull(perFirstInfo.getJobTitle())?perFirstInfo.getJobTitle():""%></td>
<td class="sub_heading_content majorResponsibilitiesThirdParty<%=counterOfFdaPerFirstInfoAdd%>">
<%=Validator.isNotNull(perFirstInfo)&&Validator.isNotNull(perFirstInfo.getMajorResponsibilites())?perFirstInfo.getMajorResponsibilites():""%></td>
<td class="sub_heading_content specificFunctionThirdParty<%=counterOfFdaPerFirstInfoAdd%>">
<%=Validator.isNotNull(perFirstInfo)&&Validator.isNotNull(perFirstInfo.getSpecificFunctions())?perFirstInfo.getSpecificFunctions():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="staffDetailThirdPartyEditTab" onclick="staffDetailThirdPartyEditTab('<%=counterOfFdaPerFirstInfoAdd%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="staffDetailThirdPartyDeleteDataTab" onclick="staffDetailThirdPartyDeleteData('<%=counterOfFdaPerFirstInfoAdd%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="staffDetailThirdPartyId<%=counterOfFdaPerFirstInfoAdd%>" name="staffDetailThirdPartyId<%=counterOfFdaPerFirstInfoAdd%>" value="<%=perFirstInfo.getAddFdaPersonnelFirstId()%>">    
 <%
  counterOfFdaPerFirstInfoAdd++;
						}
}
					%>		
						</tbody>
					</table>
				</div>
				
				<div class="col-md-12">
					<input id="auditorListThirdPartyVal" type="hidden" name="auditorListThirdPartyVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="auditorListThirdPartyBox">
							<div class="accordion__header is-active"
								id="auditorListThirdParty" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2><span class="">17.0</span> Supported by documentation in Section A, II, 7. above, list all auditors, technical experts including contracted personnel that perform certification activities.</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Name</p>
											<input type="text" class="form-control"
												id="auditorNameThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Role</p>
											<input type="text" class="form-control" id="auditorRoleThirdParty" value="" placeholder="">
											<p class="tab-form-sub-heading">Auditor, Technical Expert, etc</p>
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">FDA Regulation/Area of Expertise</p>
											<input type="text" class="form-control"
												id="auditorExpertiseAreaThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addAuditorListThirdParty" onclick="addAuditorListThirdParty();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addAuditorListThirdPartyTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addAuditorListThirdPartyTable">
							<tr>
								<th class="sub_heading text-nowrap">Name</th>
								<th class="sub_heading text-nowrap">Role</th>
								<th class="sub_heading text-nowrap">FDA Regulation/Area of Expertise</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(fdaPersonnelSecInfo!=null){
long counterOfFdaPerSecInfoAdd=1;
for(AddFdaPersonnelSecond perSecInfo:fdaPersonnelSecInfo){
%>			
<tr class="auditor-list-third-party-row<%=counterOfFdaPerSecInfoAdd%>">
<td class="sub_heading_content auditorNameThirdParty<%=counterOfFdaPerSecInfoAdd%>">
<%=Validator.isNotNull(perSecInfo)&&Validator.isNotNull(perSecInfo.getName())?perSecInfo.getName():""%></td>
<td class="sub_heading_content auditorRoleThirdParty<%=counterOfFdaPerSecInfoAdd%>">
<%=Validator.isNotNull(perSecInfo)&&Validator.isNotNull(perSecInfo.getRole())?perSecInfo.getRole():""%></td>
<td class="sub_heading_content auditorExpertiseAreaThirdParty<%=counterOfFdaPerSecInfoAdd%>">
<%=Validator.isNotNull(perSecInfo)&&Validator.isNotNull(perSecInfo.getFdaRegulation())?perSecInfo.getFdaRegulation():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="auditorListThirdPartyEditTab" onclick="auditorListThirdPartyEditTab('<%=counterOfFdaPerSecInfoAdd%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="auditorListThirdPartyDeleteDataTab" onclick="auditorListThirdPartyDeleteData('<%=counterOfFdaPerSecInfoAdd%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="auditorListThirdPartyId<%=counterOfFdaPerSecInfoAdd%>" name="auditorListThirdPartyId<%=counterOfFdaPerSecInfoAdd%>" value="<%=perSecInfo.getAddFdaPersonnelSecondId()%>">    
 <%
  counterOfFdaPerSecInfoAdd++;
						}
}
					%>			
						</tbody>
					</table>
				</div>
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">18.0</span> Does the certification body outsource (in part or in whole) any of its certification services (e.g., to other
							certification bodies etc.)?</p>
						<div class="wizard-form-radio d-block">
							<input value="Yes" type="radio"<%=cerBodyPersonnel!=null &&cerBodyPersonnel.getBodyOutsource().equals("Yes")? "checked":StringPool.BLANK%> name="thirdPartyBodyOutsource">
							<label for="thirdPartyBodyOutsource">Yes</label>
						</div>
						<div class="wizard-form-radio d-block">
							<input value="No" type="radio"<%=cerBodyPersonnel!=null &&cerBodyPersonnel.getBodyOutsource().equals("No")? "checked":StringPool.BLANK%> name="thirdPartyBodyOutsource">
							<label for="thirdPartyBodyOutsource">No</label>
						</div>
					</div>
				</div>
				<div class="col-md-12 thirdPartyOutsourceBox hide">
					<input id="outsourceActNatureThirdPartyVal" type="hidden" name="outsourceActNatureThirdPartyVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="outsourceActNatureThirdPartyBox">
							<div class="accordion__header is-active"
								id="outsourceActNatureThirdParty" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2><span class="">19.0</span> Identify in the table below the nature of the outsourced activities and respective suppliers/service providers for each</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Outsourced Activity</p>
											<input type="text" class="form-control"
												id="outsourcedActivityThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<p class="tab-form-main-heading">Supplier/Service provdier</p>
											<input type="text" class="form-control"
												id="serviceProvdierThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addOutsourceActNatureThirdParty" onclick="addOutsourceActNatureThirdParty();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addOutsourceActNatureThirdPartyTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addOutsourceActNatureThirdPartyTable">
							<tr>
								<th class="sub_heading text-nowrap">Outsourced Activity</th>
								<th class="sub_heading text-nowrap">Supplier/Service provdier</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(fdaPersonnelThirdInfo!=null){
long counterOfFdaPerThirdInfoAdd=1;
for(AddFdaPersonnelThird perThirdInfo:fdaPersonnelThirdInfo){
%>			
<tr class="outsource-act-nature-third-party-row<%=counterOfFdaPerThirdInfoAdd%>">
<td class="sub_heading_content outsourcedActivityThirdParty<%=counterOfFdaPerThirdInfoAdd%>">
<%=Validator.isNotNull(perThirdInfo)&&Validator.isNotNull(perThirdInfo.getOutsourcedActivity())?perThirdInfo.getOutsourcedActivity():""%></td>
<td class="sub_heading_content serviceProvdierThirdParty<%=counterOfFdaPerThirdInfoAdd%>">
<%=Validator.isNotNull(perThirdInfo)&&Validator.isNotNull(perThirdInfo.getSupplierServiceProvider())?perThirdInfo.getSupplierServiceProvider():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="outsourceActNatureThirdPartyEditTab" onclick="outsourceActNatureThirdPartyEditTab('<%=counterOfFdaPerThirdInfoAdd%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="outsourceActNatureThirdPartyDeleteDataTab" onclick="outsourceActNatureThirdPartyDeleteData('<%=counterOfFdaPerThirdInfoAdd%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="outsourceActNatureThirdPartyId<%=counterOfFdaPerThirdInfoAdd%>" name="outsourceActNatureThirdPartyId<%=counterOfFdaPerThirdInfoAdd%>" value="<%=perThirdInfo.getAddFdaPersonnelThirdId()%>">    
 <%
  counterOfFdaPerThirdInfoAdd++;
						}
}
					%>										
						</tbody>
					</table>
				</div>

				<div class="col-md-12">
					<input id="activityPerformedLocThirdPartyVal" type="hidden" name="activityPerformedLocThirdPartyVal" value="1">
					<div class="">
						<div class="accordion secured-accordian"
							id="activityPerformedLocThirdPartyBox">
							<div class="accordion__header is-active"
								id="activityPerformedLocThirdParty" onclick="expandDetails(this.id)">
								<div class="d-flex align-items-center">
									<div class="d-flex align-items-center">
										<div>
											<span class="accordion__toggle"></span>
										</div>
										<div>
											<h2><span class="">20.0</span> If your application covers activities performed at more than one location (including virtual sites if applicable, branch offices, partners locations, agents, etc.), provide details in the table below: [Clause 6.2; 8.1.2]</h2>
										</div>
									</div>
								</div>
								<div>
									<p class="accordian-employee mb-0 common-para"></p>
								</div>
							</div>
							<div class="accordion__body is-active">
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">No.</p>
											<input type="text" class="form-control"
												id="activityLocNumThirdParty" value="" placeholder=""
												oninput="this.value = this.value.replace(/[^0-9]/g, '').replace(/(\..*)\./g, '$1');">
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Location/Address</p>
											<textarea rows="3" id="activityLocationThirdParty" class="form-control" maxlength="255" placeholder="" style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Certification activities performed at location</p>
											<textarea rows="3" id="certifiedActivityLocationThirdParty" class="form-control" maxlength="255" placeholder="" style="border-radius: 5px; width: 100%"></textarea>
										</div>
									</div>
									<div class="col-md-12">
										<div class="form-group">
											<p class="tab-form-main-heading">Contact Details</p>
											<input type="text" class="form-control"
												id="activityContactDetailThirdParty" value="" placeholder="">
										</div>
									</div>
									<div class="col-md-12 d-flex justify-content-end py-4">
										<a href="javascript:void(0);" class="add-more-employee" id="addActivityPerformedLocThirdParty" onclick="addActivityPerformedLocThirdParty();"> 
											<span>+ 1</span>
											Add More
										</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-12 table-responsive hide addActivityPerformedLocThirdPartyTableBox">
					<table class="table table-bordered mb-3">
						<tbody class="addActivityPerformedLocThirdPartyTable">
							<tr>
								<th class="sub_heading text-nowrap">No.</th>
								<th class="sub_heading text-nowrap">Location/Address</th>
								<th class="sub_heading text-nowrap">Certification activities performed at location</th>
								<th class="sub_heading text-nowrap">Contact Details</th>
								<th class="sub_heading">Edit</th>
								<th class="sub_heading">Delete</th>
							</tr>
<%if(fdaPersonnelFourInfo!=null){
long counterOfFdaPerFourInfoAdd=1;
for(AddFdaPersonnelFour perFourInfo:fdaPersonnelFourInfo){
%>			
<tr class="activity-performed-third-party-row<%=counterOfFdaPerFourInfoAdd%>">
<td class="sub_heading_content activityLocNumThirdParty<%=counterOfFdaPerFourInfoAdd%>">
<%=Validator.isNotNull(perFourInfo)&&Validator.isNotNull(perFourInfo.getNumber())?perFourInfo.getNumber():""%></td>
<td class="sub_heading_content activityLocationThirdParty<%=counterOfFdaPerFourInfoAdd%>">
<%=Validator.isNotNull(perFourInfo)&&Validator.isNotNull(perFourInfo.getLocationAddress())?perFourInfo.getLocationAddress():""%></td>
<td class="sub_heading_content certifiedActivityLocationThirdParty<%=counterOfFdaPerFourInfoAdd%>">
<%=Validator.isNotNull(perFourInfo)&&Validator.isNotNull(perFourInfo.getCertificationActivities())?perFourInfo.getCertificationActivities():""%></td>
<td class="sub_heading_content activityContactDetailThirdParty<%=counterOfFdaPerFourInfoAdd%>">
<%=Validator.isNotNull(perFourInfo)&&Validator.isNotNull(perFourInfo.getContactDetails())?perFourInfo.getContactDetails():""%></td>
<td> 
	<span> 
		<a href="javascript:void(0)" id="activityPerformedLocEditTab" onclick="activityPerformedLocEditTab('<%=counterOfFdaPerFourInfoAdd%>');"> 
        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
        </svg>
      </a> 
  </span>
   </td>
   <td> 
<span> 
	<a href="javascript:void(0)" id="activityPerformedLocDeleteDataTab" onclick="activityPerformedLocDeleteData('<%=counterOfFdaPerFourInfoAdd%>');"> 
		        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
		        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
		        </svg>
		      </a> 
		  </span>  
     </td>
</tr>
<input type="hidden" id="activityPerformedLocId<%=counterOfFdaPerFourInfoAdd%>" name="activityPerformedLocId<%=counterOfFdaPerFourInfoAdd%>" value="<%=perFourInfo.getAddFdaPersonnelFourId()%>">    
 <%
  counterOfFdaPerFourInfoAdd++;
						}
}
					%>		
						</tbody>
					</table>
				</div>

				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">21.0</span> Briefly describe the security arrangements, equipment and/or facilities established to prevent loss of, or unauthorized access to client data and information?</p>
						<textarea rows="3" id="descSecurityArrangementsThirdParty" class="form-control" maxlength="255" 
						placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBodyPersonnel)&&Validator.isNotNull(cerBodyPersonnel.getDescSecurity())?cerBodyPersonnel.getDescSecurity():""%></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick=" accThirdPersonnelResource(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
	                        <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
	                       </svg>
		</span>
	</button>
</div>

<div class="tab-pane" role="tabpanel" id="childStep59">
	<div class="tab-form">
		<div class="information-ifno-forms">
			<div class="row">
				<div class="col-md-12">
					<p class="tab-form-title f2">IV. Information</p>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="form-group">
						<p class="tab-form-main-heading"><span class="tab-form-highlghtme-link pr-2">22.0</span> Briefly describe the mechanisms through which information about the organization and its certification services is made available to the public; to certified clients.</p>
						<textarea rows="3" id="describeMechanismThirdParty" class="form-control" maxlength="255" 
						placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(cerBobyInformation)&&Validator.isNotNull(cerBobyInformation.getDescribeMechanism())?cerBobyInformation.getDescribeMechanism():""%></textarea>
					</div>
				</div>
			</div>
		</div>
	</div>
	<button type="button" id="saveName" onclick="accThirdPartyInformation(false);"
		class="btn btn-primary common-yellow-bg text-dark common-nav-links next-step float-right">
		Continue to the next form section <span class="ml-2"> <svg
				width="18" height="14" viewBox="0 0 18 14" fill="none"
				xmlns="http://www.w3.org/2000/svg"> 
	                        <pathd ="m6.00016 11.17l1.83016=""
					6.99997l0.410156="" 8.40997l6.00016="" 14l18.0002=""
					1.99997l16.5902="" 0.589966l6.00016="" 11.17z"="" fill="#1B1917"></pathd="m6.00016> 
	                       </svg>
		</span>
	</button>
</div>