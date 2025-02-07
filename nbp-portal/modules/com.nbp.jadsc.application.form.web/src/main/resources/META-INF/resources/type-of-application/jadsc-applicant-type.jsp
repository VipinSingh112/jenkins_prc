<%@page import="com.liferay.petra.string.StringPool"%>
<%@ include file="../init.jsp" %>
<section class="appicant-type mt-3 hide">
        <div class="row" id="applicationType">
            <div class="col-md-12"> 
	        	<p class="common-section-small-heading mb-3">Type of Applicant</p> 
	        </div>
			<div class="col-lg-6">
				<div class="application-type-card wizard-card" id="laboratoriesTab">
					<a href="javascript:;" class="d-block">
						<div class="application-type-card-icon text-center mb-3">
							<img src="<%=request.getContextPath()%>/image/application-type/applicant company.png" class="img-fluid"  alt="Applicant image" height="80" width="80"/>
							<img src="<%=request.getContextPath()%>/image/application-type/applicant company-1.png" class="img-fluid active hide"  alt="Applicant image" height="80" width="80"/>
						</div>
						<div class="application-type-card-content">
							<p class="application-type-card-title wizard-title f2">Applicant/Company</p>                  
						</div>
					</a>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="application-type-card wizard-card" id="certificationTab">
					<a href="javascript:;" class="d-block">
						<div class="application-type-card-icon text-center mb-3">
							<img src="<%=request.getContextPath()%>/image/application-type/acting on behalf of company.png" class="img-fluid"  alt="Company image" height="80" width="80"/>
							<img src="<%=request.getContextPath()%>/image/application-type/acting on behalf of company-1.png" class="img-fluid active hide"  alt="Company image" height="80" width="80"/>
						</div>
						<div class="application-type-card-content">
							<p class="application-type-card-title wizard-title f2">Acting on  Behalf of Company E.g. Legal Council</p>
						</div>
					</a>
				</div>
			</div>
			<input type="hidden" id="typeOfApplicant" name="typeOfApplicant">
        </div>
        <div class="row tab-plus-wizard" id="insdustryImpactedChoiceList">
        	<div class="col-md-12 tab-form">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading">
						<span class="tab-form-highlghtme-link">Industries Impacted</span>
					</p>
					<table class="table table-striped tabled-bordered" style="border: 1px solid var(--text-color-stone-300);">
						<tbody>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted1" value="Agriculture Forestry and Fishing" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Agriculture Forestry and Fishing")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted1">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/crops.png" class="img-fluid" alt="Agriculture image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">A</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Agriculture, Forestry and Fishing</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted2" value="Mining and Quarrying" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Mining and Quarrying")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted2">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/dump-truck.png" class="img-fluid" alt="Mining and Quarrying image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">B</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Mining and Quarrying</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted3" value="Manufacturing" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Manufacturing")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted3">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/manufacturing.png" class="img-fluid" alt="Manufacturing image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">C</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Manufacturing</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted4" value="Electricity Gas Steam and Air conditioning supply" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Electricity Gas Steam and Air conditioning supply")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted4">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/energy.png" class="img-fluid" alt="Electricity image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">D</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Electricity, Gas, Steam and Air conditioning supply</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted5" value="Water Supply Sewerage Waste management and Remediation activities" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Water Supply Sewerage Waste management and Remediation activities")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted5">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/tap.png" class="img-fluid" alt="Water Supply image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">E</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Water Supply; Sewerage, Waste management and Remediation activities</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted6" value="Construction" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Construction")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted6">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/engineer.png" class="img-fluid" alt="Construction image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">F</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Construction</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted7" value="Wholesale and Retail trade repair of motor vehicles and motorcycles" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Wholesale and Retail trade repair of motor vehicles and motorcycles")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted7">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/food.png" class="img-fluid" alt="Retail trade image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">G</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Wholesale and Retail trade; repair of motor vehicles and motorcycles</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted8" value="Transport and Storage" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Transport and Storage")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted8">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/transport.png" class="img-fluid" alt="Transport image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">H</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Transport and Storage</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted9" value="Accomodation and Food service activities" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Accomodation and Food service activities")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted9">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/hotel-1.png" class="img-fluid" alt="Accomodation image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">I</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Accomodation and Food service activities</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted10" value="Information and Communication" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Information and Communication")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted10">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/news.png" class="img-fluid" alt="Information image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">J</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Information and Communication</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted11" value="Financial and Insurance activities" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Financial and Insurance activities")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted11">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/cash.png" class="img-fluid" alt="Financial image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">K</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Financial and Insurance activities</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted12" value="Real Estate Activities" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Real Estate Activities")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted12">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/for-sale.png" class="img-fluid" alt="Real Estate image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">L</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Real Estate Activities</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted13" value="Professional Scientific and Technical activities" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Professional Scientific and Technical activities")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted13">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/flask.png" class="img-fluid" alt="Professional image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">M</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Professional, Scientific and Technical activities</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted14" value="Administrative and Support service activities" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Administrative and Support service activities")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted14">
											
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/justice-scale.png" class="img-fluid" alt="Administrative image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">N</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Administrative and Support service activities</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted15" value="Public Administration and Defence Compulsory social security" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Public Administration and Defence Compulsory social security")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted15">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/policeman.png" class="img-fluid" alt="Public Administration image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">O</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Public Administration and Defence; Compulsory social security</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted16" value="Education" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Education")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted16">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/graduate.png" class="img-fluid" alt="Education image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">P</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Education</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted17" value="Human Health and Social work activities" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Human Health and Social work activities")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted17">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/first-aid-kit-1.png" class="img-fluid" alt="Human Health image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">Q</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Human Health and Social work activities</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted18" value="Arts Entertainment and Recreation" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Arts Entertainment and Recreation")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted18">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/entertainment.png" class="img-fluid" alt="Arts image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">R</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Arts, Entertainment and Recreation</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted19" value="Other Service activities" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Other Service activities")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted19">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/church.png" class="img-fluid" alt="Service image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">S</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Other Service activities</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted20" value="Activities of Households as employers undifferentiated goods and services-producing activities of households for own use" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Activities of Households as employers undifferentiated goods and services-producing activities of households for own use")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted20">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/maid.png" class="img-fluid" alt="Households image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">T</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Activities of Households as employers; undifferentiated goods- and services-producing activities of households for own use</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="insdustryImpacted21" value="Activities of Extraterritorial organizations and bodies" <%=jadscApplication!=null &&jadscApplication.getIndustriesImpacted().contains("Activities of Extraterritorial organizations and bodies")?"checked":StringPool.BLANK%> name="insdustryImpacted"> 
										<label for="insdustryImpacted21">
										</label>
									</div>
								</td>
								<td class="w-2">
									<img src="<%=request.getContextPath()%>/image/industry-impacted/global.png" class="img-fluid" alt="Extraterritorial image"/>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">U</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Activities of Extraterritorial organizations and bodies</p>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
   </section>