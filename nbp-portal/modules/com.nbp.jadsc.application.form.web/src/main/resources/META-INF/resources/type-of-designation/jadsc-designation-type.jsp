<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.petra.string.StringPool"%>
<%-- <%@ include file="../init.jsp" %> --%>
<fieldset class="wizard-fieldset" id="jadscDesignationFieldset" name="REQUESTED DESIGNATION">
	<section class="designation-type">
		<div class="row">
            <div class="col-md-12"> 
            	<p class="common-section-small-heading mb-1"><span>Requested Designation</span></p>
	        	<p class="common-section-small-heading mb-1">Information provided to the Commission, for the purposes of its proceedings, is treated as 
	        	public information unless it is designated as confidential. At the time of submitting a submission, if a person wants information to be 
	        	designated as confidential, it is required to submit both a confidential version and a public version to the Commission:
	        	</p>
	        	<p class="common-section-small-heading mb-3">
	        	Please choose your level of confidentiality below
				</p> 
	        </div>
	        <div class="col-md-12"> 
            	<p class="common-section-small-heading mb-1"><span>Note to Applicant</span></p>
            	<p class="common-section-small-heading mb-3"><span>Breach of Confidentiality</span></p>
            	<p class="common-section-small-heading">Section 8 of the Customs Duties (Dumping and Subsidies) Act provides that information 
            	treated as confidential shall not be disclosed by anyone who receives such information, otherwise than in the discharge of his functions 
            	under the Act. The sanction for violation of the aforementioned provision of the CDDASA is a fine not exceeding Five Hundred Thousand Dollars 
            	(J$500,000) or imprisonment for a term not exceeding 2 years or both; upon a summary conviction before a Resident Magistrate.
            	</p>
            </div>
            <div class="col-md-12 confidential-ver hide">
				<div class="application-type-card wizard-card">
					<a href="javascript:;" class="d-block">
						<div class="application-type-card-icon text-center mb-3">
							<svg xmlns="http://www.w3.org/2000/svg" width="80" height="80" viewBox="0 0 220 242" fill="none">
								<g clip-path="url(#clip0_10053_318987)">
								<path d="M6.37408 1.54194C-0.308162 4.42045 0.000249375 -0.308525 0.000249375 110.514C0.000249375 197.486 0.205857 211.262 1.54231 213.832C4.83203 220.103 3.70118 220 48.5236 220H89.4395V213.832V207.663H50.8881H12.3367L12.5423 110.206L12.8507 12.8504L58.3928 12.5419L103.832 12.3363V38.7569C103.832 58.084 104.243 65.9999 105.168 67.8504L106.505 70.4205L135.187 70.9345L163.972 71.4485L164.486 92.5233L165 113.598H170.963H176.823V87.6915V61.7849L166.337 51.7102C160.477 46.1588 147.626 33.7195 137.757 24.056C127.888 14.4952 118.019 5.03727 115.86 3.28961L111.954 -0.000113358H60.8601C18.9161 0.10269 9.14978 0.308298 6.37408 1.54194ZM153.178 56.2335L155.748 58.598H136.421H117.197V40.5046V22.4111L133.954 38.1401C143.103 46.7756 151.739 54.8971 153.178 56.2335Z" fill="#047247"/>
								<path d="M38.2434 44.4107C37.5238 45.1304 37.0098 46.4668 37.0098 47.392C37.0098 50.8874 39.4771 51.5042 54.0752 51.1958C68.1593 50.8874 68.3649 50.8874 68.6733 48.5229C69.3929 43.7939 67.6453 43.1771 53.0471 43.1771C43.8976 43.1771 39.0658 43.5883 38.2434 44.4107Z" fill="#047247"/>
								<path d="M38.038 75.4573C37.4212 76.2797 37.01 78.0274 37.2156 79.3639L37.524 81.7283L62.0941 82.0367C86.767 82.2424 89.4399 81.9339 89.4399 78.5414C89.4399 77.8218 88.7203 76.4853 87.795 75.6629C85.5334 73.2984 39.9913 73.1956 38.038 75.4573Z" fill="#047247"/>
								<path d="M37.7288 106.609C36.598 107.739 36.9064 111.543 38.2429 112.88C39.1681 113.805 49.4485 114.113 78.1307 114.113C120.383 114.113 121.205 114.01 119.869 108.665L119.252 105.889H78.7475C56.5419 105.889 38.0373 106.197 37.7288 106.609Z" fill="#047247"/>
								<path d="M121.515 131.692C118.636 133.131 116.272 135.393 114.627 138.271L112.057 142.589V184.944C112.057 231.309 112.057 231.617 118.122 236.757C123.776 241.486 126.244 241.692 168.187 241.383L207.253 241.075L211.571 238.299C219.589 232.953 219.487 234.084 219.795 186.795C220.103 147.318 220.001 144.645 218.15 140.43C217.019 137.963 214.346 134.673 212.187 133.028L208.384 130.047L167.159 129.738C126.86 129.533 125.832 129.533 121.515 131.692ZM174.561 158.421C180.627 161.402 184.019 166.851 184.739 174.458C185.15 179.393 185.767 180.729 187.515 181.552C189.571 182.477 189.673 183.094 189.673 198.411V214.346H166.029H142.384V197.897V181.449L145.057 181.14C147.627 180.832 147.832 180.421 148.244 174.355C148.758 166.439 152.15 161.196 158.73 158.215C164.281 155.748 169.01 155.748 174.561 158.421Z" fill="#047247"/>
								<path d="M161.916 164.382C158.01 166.027 155.954 169.522 155.44 175.279L155.028 180.934H166.542H178.159L177.542 175.793C177.234 173.018 176.206 169.625 175.281 168.289C172.608 164.074 166.851 162.429 161.916 164.382Z" fill="#047247"/>
								<path d="M163.253 190.289C160.991 191.523 160.888 195.944 162.944 197.177C164.281 197.897 164.383 198.822 163.561 202.626C162.122 208.794 162.019 208.691 165.617 208.691C168.084 208.691 168.598 208.28 168.187 206.841C166.542 201.084 166.44 197.691 167.982 196.458C170.038 194.71 170.038 192.86 167.982 190.803C166.131 188.85 165.617 188.85 163.253 190.289Z" fill="#047247"/>
								<path d="M38.2434 137.962C37.5238 138.682 37.0098 139.916 37.0098 140.841C37.0098 144.645 38.8602 144.953 64.4584 144.953H89.4397V140.841V136.729H64.4584C46.3649 136.729 39.1686 137.037 38.2434 137.962Z" fill="#047247"/>
								<path d="M38.0373 169.111C37.3177 169.933 37.0093 171.681 37.4205 173.223L38.0373 175.793H63.7383H89.4392V171.681V167.569H64.3551C43.4859 167.569 39.0654 167.774 38.0373 169.111Z" fill="#047247"/>
								</g>
								<defs>
								<clipPath id="clip0_10053_318987">
								<rect width="220" height="241.589" fill="white"/>
								</clipPath>
								</defs>
							</svg>
						</div>
						<div class="application-type-card-content">
							<p class="application-type-card-title wizard-title f2">Confidential Version</p>                  
						</div>
					</a>
				</div>
			</div>
            <div class="col-md-12 non-confidential-ver hide">
				<div class="application-type-card wizard-card">
					<a href="javascript:;" class="d-block">
						<div class="application-type-card-icon text-center mb-3">
							<svg xmlns="http://www.w3.org/2000/svg" width="80" height="80" viewBox="0 0 220 242" fill="none">
								<g clip-path="url(#clip0_10053_318998)">
								<path d="M6.37408 1.54194C-0.308162 4.42045 0.000249375 -0.308525 0.000249375 110.514C0.000249375 197.486 0.205857 211.262 1.54231 213.832C4.83203 220.103 3.70118 220 48.5236 220H89.4395V213.832V207.663H50.8881H12.3367L12.5423 110.206L12.8507 12.8504L58.3928 12.5419L103.832 12.3363V38.7569C103.832 58.084 104.243 65.9999 105.168 67.8504L106.505 70.4205L135.187 70.9345L163.972 71.4485L164.486 92.5233L165 113.598H170.963H176.823V87.6915V61.7849L166.337 51.7102C160.477 46.1588 147.626 33.7195 137.757 24.056C127.888 14.4952 118.019 5.03727 115.86 3.28961L111.954 -0.000113358H60.8601C18.9161 0.10269 9.14978 0.308298 6.37408 1.54194ZM153.178 56.2335L155.748 58.598H136.421H117.197V40.5046V22.4111L133.954 38.1401C143.103 46.7756 151.739 54.8971 153.178 56.2335Z" fill="#047247"/>
								<path d="M38.2434 44.4107C37.5238 45.1304 37.0098 46.4668 37.0098 47.392C37.0098 50.8874 39.4771 51.5042 54.0752 51.1958C68.1593 50.8874 68.3649 50.8874 68.6733 48.5229C69.3929 43.7939 67.6453 43.1771 53.0471 43.1771C43.8976 43.1771 39.0658 43.5883 38.2434 44.4107Z" fill="#047247"/>
								<path d="M38.038 75.4573C37.4212 76.2797 37.01 78.0274 37.2156 79.3639L37.524 81.7283L62.0941 82.0367C86.767 82.2424 89.4399 81.9339 89.4399 78.5414C89.4399 77.8218 88.7203 76.4853 87.795 75.6629C85.5334 73.2984 39.9913 73.1956 38.038 75.4573Z" fill="#047247"/>
								<path d="M37.7288 106.609C36.598 107.739 36.9064 111.543 38.2429 112.88C39.1681 113.805 49.4485 114.113 78.1307 114.113C120.383 114.113 121.205 114.01 119.869 108.665L119.252 105.889H78.7475C56.5419 105.889 38.0373 106.197 37.7288 106.609Z" fill="#047247"/>
								<path d="M38.2434 137.962C37.5238 138.682 37.0098 139.916 37.0098 140.841C37.0098 144.645 38.8602 144.953 64.4584 144.953H89.4397V140.841V136.729H64.4584C46.3649 136.729 39.1686 137.037 38.2434 137.962Z" fill="#047247"/>
								<path d="M38.0373 169.111C37.3177 169.933 37.0093 171.681 37.4205 173.223L38.0373 175.793H63.7383H89.4392V171.681V167.569H64.3551C43.4859 167.569 39.0654 167.774 38.0373 169.111Z" fill="#047247"/>
								<path fill-rule="evenodd" clip-rule="evenodd" d="M175.105 187.953C171.787 192.433 160.717 193.594 160.717 193.594C160.717 193.594 149.411 192.48 146.085 188.055C130.119 188.055 121.779 210.988 121.779 210.988H199.654C199.654 210.988 193.08 187.953 175.105 187.953Z" fill="#047247"/>
								<path fill-rule="evenodd" clip-rule="evenodd" d="M175.797 155.513C175.797 163.821 168.885 179.693 160.38 179.693C151.844 179.693 144.948 163.821 144.948 155.513C144.948 147.204 151.844 140.465 160.38 140.465C168.885 140.465 175.797 147.204 175.797 155.513Z" fill="#047247"/>
								<path fill-rule="evenodd" clip-rule="evenodd" d="M208.441 172.008C205.53 176.519 196.461 178.92 196.461 178.92C196.461 178.92 185.83 176.558 182.896 172.118C182.896 172.118 182.802 177.327 178.369 183.384C192.491 181.564 198.595 195.176 198.595 195.176L223.159 195.223C223.159 195.223 224.25 172.008 208.441 172.008Z" fill="#047247"/>
								<path fill-rule="evenodd" clip-rule="evenodd" d="M207.547 144.644C207.547 151.297 202.353 163.984 195.943 163.984C189.51 163.984 184.324 151.297 184.324 144.644C184.324 138.007 189.526 132.617 195.943 132.617C202.353 132.617 207.547 138.015 207.547 144.644Z" fill="#047247"/>
								<path fill-rule="evenodd" clip-rule="evenodd" d="M112.836 172.008C115.801 176.488 124.988 178.873 124.988 178.873C124.988 178.873 135.76 176.527 138.702 172.118C138.702 172.118 138.812 177.296 143.3 183.305C128.99 181.501 122.823 195.011 122.823 195.011L97.9525 195.05C97.9525 195.05 96.8306 172.008 112.836 172.008Z" fill="#047247"/>
								<path fill-rule="evenodd" clip-rule="evenodd" d="M113.495 144.905C113.495 151.401 118.705 163.821 125.099 163.821C131.524 163.821 136.71 151.401 136.71 144.905C136.71 138.401 131.516 133.129 125.099 133.129C118.689 133.129 113.495 138.401 113.495 144.905Z" fill="#047247"/>
								</g>
								<defs>
								<clipPath id="clip0_10053_318998">
								<rect width="220" height="241.589" fill="white"/>
								</clipPath>
								</defs>
							</svg>
						</div>
						<div class="application-type-card-content">
							<p class="application-type-card-title wizard-title f2">Public (Non-Confidential) Version</p>                  
						</div>
					</a>
				</div>
			</div>
			<input type="hidden" id="designationTypeVal" name="designationTypeVal">
	     </div>
	      <div class="row tab-plus-wizard pt-4" id="confidentialInfoCatList">
        	<div class="col-md-12 tab-form">
				<div class="form-group mb-0">
					<p class="tab-form-main-heading mb-1">
						<span class="tab-form-highlghtme-link">Categories of Confidential Information</span>
					</p>
					<p class="common-section-small-heading mb-3">Please Select from the list below the Types of Information that may be Considered Confidential. The list is NOT exhaustive.
					</p>
					<table class="">
						<tbody>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat1" value="Business or trade" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("Business or trade")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat1">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">i.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">Business or trade secrets concerning the nature of a product or production process</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat2" value="Production costs" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("Production costs")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat2">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">ii.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										Production costs (but not the identity of the production components unless a particular component is a trade secret)
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat3" value="Distribution costs" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("Distribution costs")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat3">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">iii.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0"><span class="tab-form-highlghtme-link pr-2"></span>
									Distribution costs (but not channels of distribution)
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat4" value="Terms of sale" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("Terms of sale")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat4">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">iv.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										Terms of sale (but not terms of sale offered to the public)
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat5" value="Prices of individual sales" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("Prices of individual sales")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat5">
											
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">v.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
									Prices of individual sales, likely sales, or other offers [but not components of prices, such as transportation, if based on 
									published schedules, dates of sale, product descriptions (other than business or trade secrets described in paragraph (i) of this section),
									 or order numbers];
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat6" value="Names of particular customers" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("Names of particular customers")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat6">	
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">vi.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										Names of particular customers, distributors, or suppliers (but not destination of sale or designation of type of customer, distributor, or 
										supplier, unless the destination or designation would reveal the name);
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat7" value="In an antidumping proceeding" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("In an antidumping proceeding")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat7">											
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">vii.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										In an antidumping proceeding, the exact amount of the dumping margin on individual sales
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat8" value="In a countervailing duty proceeding" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("In a countervailing duty proceeding")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat8">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">viii.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										In a countervailing duty proceeding, the exact amount of the benefit applied for or received by a person from each of the programmes under 
										investigation or review (but not descriptions of the operation of the programmes, or the amount if included in official public statements or 
										documents or publications, or the ad valorem countervailable subsidy rate calculated for each person under a programme)
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat9" value="The names of particular persons" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("The names of particular persons")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat9">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">ix.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										The names of particular persons from whom business proprietary information was obtained
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat10" value="The position of a domestic" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("The position of a domestic")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat10">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">x.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										The position of a domestic producer or workers regarding a petition; and
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat11" value="Any other specific business information" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("Any other specific business information")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat11">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">xi.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										Any other specific business information the release of which to the public would cause substantial harm to the competitive 
										position of the submitter.
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2">
									<div class="checkbox-form-group second-custom-checkbox">
										<input type="checkbox" id="confidentialInfoCat12" value="Other" <%=jadscApplication!=null &&jadscApplication.getCategoriesOfConfidentialInfo().contains("Other")?"checked":StringPool.BLANK%>
										 name="confidentialInfoCat"> 
										<label for="confidentialInfoCat12">
										</label>
									</div>
								</td>
								<td class="w-2">
									<p class="tab-form-highlghtme-link pr-2 mb-0">xii.</p>
								</td>
								<td>
									<p class="tab-form-main-heading mb-0">
										Other
									</p>
								</td>
							</tr>
							<tr>
								<td class="w-2"></td>
								<td class="w-2"></td>
								<td>
									<div class="row confidentialInfoCatOtherBox hide">
										<div class="col-md-12">
											<div class="form-group">
												<p class="tab-form-main-heading">Please Specify</p>
												<input type="text" class="form-control"
													id="confidentialInfoCatOther" value="<%=Validator.isNotNull(jadscApplication)&&Validator.isNotNull(jadscApplication.getCategoriesOfConfiOtherPlease())?jadscApplication.getCategoriesOfConfiOtherPlease():"" %>"
													placeholder="Please Specify">
											</div>
										</div>
									</div>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
			<div class="col-md-12  tab-form confidential-ver hide">
				<div class="form-group">
					<p class="tab-form-main-heading">Explanation/Reasons for Confidential Status</p>
					<textarea rows="3" class="mt-3 form-control" maxlength="255" id="confidentialStatusReason" placeholder="" style="border-radius: 5px; width: 100%"><%=jadscApplication!=null?jadscApplication.getReasonForConfidentialStatus():StringPool.BLANK %></textarea>
				</div>
			</div>
			<div class="col-md-12  tab-form non-confidential-ver hide">
				<div class="form-group">
					<p class="tab-form-main-heading">(Public) Non-Confidential Summary</p>
					<textarea rows="3" class="mt-3 form-control" maxlength="255" id="nonConfidentialSummary" placeholder="" style="border-radius: 5px; width: 100%"><%=jadscApplication!=null?jadscApplication.getNonConfidentialSummary():StringPool.BLANK %></textarea>
				</div>
			</div>
		</div>
	</section>
	<%@ include file="/jadsc-wizard-buttons.jsp"%>
</fieldset>