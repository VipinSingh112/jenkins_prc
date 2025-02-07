<%@page import="com.liferay.petra.string.StringPool"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ include file="../init.jsp" %>
<% 
JADSCNoticeOfAppearance noticOfAppreanceInfo=null;
if(jadscApplicationId>0){
	try{
		noticOfAppreanceInfo=JADSCNoticeOfAppearanceLocalServiceUtil.getJADSCNoticeOfAppearanceBy_Id(jadscApplicationId);
	}catch(Exception e){
	}
}
%>
<div class="tab-pane appearance-notice-form hide confidential-ver-forms" role="tabpanel" id="childStep5">
    <div class="tab-form">
        <div class="appearance-notice-details-forms">
            <div class="row">
                <div class="col-md-12">
                    <p class="tab-form-title f2">Notice of Appearance</p>
                    <p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.
                    </p>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Full Name</p>
                        <input type="text" class="form-control" id="appearanceNoticeFullName" value="<%=Validator.isNotNull(noticOfAppreanceInfo)&&Validator.isNotNull(noticOfAppreanceInfo.getFullName())?noticOfAppreanceInfo.getFullName():""%>" placeholder="" />
                    </div>
                </div>
                <div class="col-md-12"> 
                    <div class="form-group"> 
                        <p class="tab-form-main-heading">Address</p>
                        <textarea rows="3" class="mt-3 form-control" maxlength="255" id="appearanceNoticeAddressOne" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(noticOfAppreanceInfo)&&Validator.isNotNull(noticOfAppreanceInfo.getAddressOne())?noticOfAppreanceInfo.getAddressOne():""%></textarea>
                    </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Date</p>
                        <input type="date" class="form-control" id="appearanceNoticeDate" value="<%=Validator.isNotNull(noticOfAppreanceInfo)&&Validator.isNotNull(noticOfAppreanceInfo.getDate())?new SimpleDateFormat("yyyy-MM-dd").format(noticOfAppreanceInfo.getDate()):""%>" placeholder="" />
                    </div>
                </div>
                <div class="col-md-12"> 
                    <div class="form-group">
                        <p class="tab-form-main-heading mb-3"><span class="tab-form-highlghtme-link">IN THE MATTER OF</span></p> 
                        <p class="tab-form-main-heading mb-1"><span class="tab-form-highlghtme-link">The Executive Director
                        </span></p> 
                        <p class="tab-form-main-heading mb-1"><span class="tab-form-highlghtme-link">Anti-Dumping & Subsidies Commission</span></p>
                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link">The Roswind, 25 Windsor Avenue Kingston 5</span></p>
                        <p class="tab-form-main-heading">Notice is hereby given that the undersigned appears as Counsel/Representative for <span class="appearance-notice-full-name"></span> a party before the Commission in the above matter.
                        </p>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <p class="tab-form-main-heading">
                        The undersigned's address for service is <span class="appearance-notice-address-one"></span> Dated at <span class="appearance-notice-date"></span>.
                        </p>
                        <p class="pt-2 common-para">Signature</p>
                        <div class="signature_texarea mb-2" id="appearanceNoticeSignatureImageHolder">
                        <%if(Validator.isNotNull(noticeSignDoc)){ %>
							<img src="<%=noticeSignDoc%>"  width="100" height="100"/>
							<%} %>
                        </div>
                        <input type="file" id="appearanceNoticeSignatureBtn" hidden="" name="<portlet:namespace/>appearanceNoticeSignatureBtn">
                        <label for="appearanceNoticeSignatureBtn" class="choose-sign-btn">
                            <span class="mr-2"> <svg width="14" height="17"
                                    viewBox="0 0 14 17" fill="none"
                                    xmlns="http://www.w3.org/2000/svg"> 
                                    <path
                                        d="M5 13H9C9.55 13 10 12.55 10 12V6.99997H11.59C12.48 6.99997 12.93 5.91997 12.3 5.28997L7.71 0.699971C7.32 0.309971 6.69 0.309971 6.3 0.699971L1.71 5.28997C1.08 5.91997 1.52 6.99997 2.41 6.99997H4V12C4 12.55 4.45 13 5 13ZM1 15H13C13.55 15 14 15.45 14 16C14 16.55 13.55 17 13 17H1C0.45 17 0 16.55 0 16C0 15.45 0.45 15 1 15Z"
                                        fill="#ffffff"></path> 
                                </svg>
                        </span> Upload Signature
                        </label>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Name</p>
                        <input type="text" class="form-control" id="appearanceNoticeName" value="<%=Validator.isNotNull(noticOfAppreanceInfo)&&Validator.isNotNull(noticOfAppreanceInfo.getName())?noticOfAppreanceInfo.getName():""%>" placeholder="" />
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Firm</p>
                        <input type="text" class="form-control" id="appearanceNoticeFirm" value="<%=Validator.isNotNull(noticOfAppreanceInfo)&&Validator.isNotNull(noticOfAppreanceInfo.getFirm())?noticOfAppreanceInfo.getFirm():""%>" placeholder="" />
                    </div>
                </div>
                <div class="col-md-12"> 
                    <div class="form-group"> 
                        <p class="tab-form-main-heading">Address</p>
                        <textarea rows="3" class="mt-3 form-control" maxlength="255" id="appearanceNoticeAddress" placeholder="" style="border-radius: 5px; width: 100%"><%=Validator.isNotNull(noticOfAppreanceInfo)&&Validator.isNotNull(noticOfAppreanceInfo.getAddress())?noticOfAppreanceInfo.getAddress():""%></textarea>
                    </div> 
                </div>
                <div class="col-md-6">
                    <div class="form-group">
                        <p class="tab-form-main-heading">Telephone No.</p>
                        <input type="text" class="form-control" id="appearanceNoticeTelephone" value="<%=Validator.isNotNull(noticOfAppreanceInfo)&&Validator.isNotNull(noticOfAppreanceInfo.getTelephone())?noticOfAppreanceInfo.getTelephone():""%>" placeholder="" oninput="formatPhoneNumber(this);"/>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <button type="button" id="saveName" onclick="applicantInfo(); setNoticeOfAppearanceFormInfo(false);"
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

<div class="tab-pane non-confidential-ver-forms" role="tabpanel" id="childStep6">
    <div class="tab-form">
        <div class="checklist-details-forms">
            <div class="row">
                <div class="col-md-12">
                    <p class="tab-form-title f2">Checklist</p>
                    <!-- <p class="tab-form-title-subtitle f2">Please Read the Forms Carefully and upload all required supporting documentation.
                    </p> -->
                </div>
                <div class="col-md-12">
                    <div class="form-group">
                        <p class="tab-form-main-heading">The Commission considers a complaint to be properly documented if it includes the following information, where it is available: </p>
                        <p class="tab-form-main-heading"><span class="tab-form-highlghtme-link">Note- Numbers 1-12 must be addressed in your application/complaint for dumping, subsidies and safeguards investigations, AND Numbers 13-14 must also be specifically addressed for Safeguard Investigations.</span></p>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint1" value="The identity of the Jamaican producer(s) making the complaint or on behalf of whom it is made (the complainant(s))"<%= (checklist != null && checklist.size() > 14 && checklist.get(14) != null && checklist.get(14).getSelectedChecklistValues() != null && checklist.get(14).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint1">
                                <p class="tab-form-main-heading mb-0">The identity of the Jamaican producer(s) making the complaint or on behalf of whom it is made (the complainant(s)).</p>
                            </label>
                        </div>
						<div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther1" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 14 &&checklist.get(14)!=null&&checklist.get(14).getDescription()!=null?checklist.get(14).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
						<div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint2" value="The identity of all known Jamaican producers of like goods"<%= (checklist != null && checklist.size() > 13 && checklist.get(13) != null && checklist.get(13).getSelectedChecklistValues() != null && checklist.get(13).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint2">
                                <p class="tab-form-main-heading mb-0">The identity of all known Jamaican producers of like goods.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther2" placeholder="Description"value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 13 &&checklist.get(13)!=null&&checklist.get(13).getDescription()!=null?checklist.get(13).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint3" value="A description of the volume and value of the domestic production of the like goods both by the complainant(s) and all other known Jamaican producers"<%= (checklist != null && checklist.size() > 12 && checklist.get(12) != null && checklist.get(12).getSelectedChecklistValues() != null && checklist.get(12).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint3">
                                <p class="tab-form-main-heading mb-0">A description of the volume and value of the domestic production of the like goods both by the complainant(s) and all other known Jamaican producers.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther3" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 12 &&checklist.get(12)!=null&&checklist.get(12).getDescription()!=null?checklist.get(12).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint4" value="A complete description of the goods under consideration"<%= (checklist != null && checklist.size() > 11 && checklist.get(11) != null && checklist.get(11).getSelectedChecklistValues() != null && checklist.get(11).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint4">
                                <p class="tab-form-main-heading mb-0">A complete description of the goods under consideration.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther4" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 11 &&checklist.get(11)!=null&&checklist.get(11).getDescription()!=null?checklist.get(11).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint5" value="The names of the countries of origin or export of the goods under consideration"<%= (checklist != null && checklist.size() > 10 && checklist.get(10) != null && checklist.get(10).getSelectedChecklistValues() != null && checklist.get(10).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint5">
                                <p class="tab-form-main-heading mb-0">The names of the countries of origin or export of the goods under consideration.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther5" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 10 &&checklist.get(10)!=null&&checklist.get(10).getDescription()!=null?checklist.get(10).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint6" value="The identity of each known exporter or foreign producer and importers of the goods under consideration"<%= (checklist != null && checklist.size() > 9 && checklist.get(9) != null && checklist.get(9).getSelectedChecklistValues() != null && checklist.get(9).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint6">
                                <p class="tab-form-main-heading mb-0">The identity of each known exporter or foreign producer and importers of the goods under consideration.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther6" placeholder="Description" value="" 
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 9 &&checklist.get(9)!=null&&checklist.get(9).getDescription()!=null?checklist.get(9).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint7" value="Information on the prices at which the goods under consideration are sold when destined for consumption in the domestic markets of the countries of origin or export, or where appropriate, the prices based on a constructed value (normal value)"<%= (checklist != null && checklist.size() > 8 && checklist.get(8) != null && checklist.get(8).getSelectedChecklistValues() != null && checklist.get(8).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint7">
                                <p class="tab-form-main-heading mb-0">Information on the prices at which the goods under consideration are sold when destined for consumption in the domestic markets of the countries of origin or export, or where appropriate, the prices based on a constructed value (normal value).</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther7" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 8 &&checklist.get(8)!=null&&checklist.get(8).getDescription()!=null?checklist.get(8).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint8" value="Information on the export prices of the goods under consideration"<%= (checklist != null && checklist.size() > 7 && checklist.get(7) != null && checklist.get(7).getSelectedChecklistValues() != null && checklist.get(7).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint8">
                                <p class="tab-form-main-heading mb-0"> Information on the export prices of the goods under consideration (or, where appropriate the prices at which the goods are first resold in arm's length transactions in Jamaica).
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther8" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 7 &&checklist.get(7)!=null&&checklist.get(7).getDescription()!=null?checklist.get(7).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint9" value="Information on the evolution of the volume of the goods under consideration imported into Jamaica;"<%= (checklist != null && checklist.size() > 6 && checklist.get(6) != null && checklist.get(6).getSelectedChecklistValues() != null && checklist.get(6).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint9">
                                <p class="tab-form-main-heading mb-0">Information on the evolution of the volume of the goods under consideration imported into Jamaica.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther9" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 6 &&checklist.get(6)!=null&&checklist.get(6).getDescription()!=null?checklist.get(6).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint10" value="The effects that the imports of the goods under consideration have had, or will have, on prices of like goods in Jamaica"<%= (checklist != null && checklist.size() > 5 && checklist.get(5) != null && checklist.get(5).getSelectedChecklistValues() != null && checklist.get(5).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint10">
                                <p class="tab-form-main-heading mb-0">The effects that the imports of the goods under consideration have had, or will have, on prices of like goods in Jamaica.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther10" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 5 &&checklist.get(5)!=null&&checklist.get(5).getDescription()!=null?checklist.get(5).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint11" value="The consequent impact of those imports on the domestic industry, as demonstrated by relevant factors and indices having a bearing on the state of the domestic industry"<%= (checklist != null && checklist.size() > 4 && checklist.get(4) != null && checklist.get(4).getSelectedChecklistValues() != null && checklist.get(4).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint11">
                                <p class="tab-form-main-heading mb-0">The consequent impact of those imports on the domestic industry, as demonstrated by relevant factors and indices having a bearing on the state of the domestic industry.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther11" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 4 &&checklist.get(4)!=null&&checklist.get(4).getDescription()!=null?checklist.get(4).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint12" value="Other relevant factors affecting the domestic industry that may have a bearing on the information required in the two sections immediately prior to this one"<%= (checklist != null && checklist.size() > 3 && checklist.get(3) != null && checklist.get(3).getSelectedChecklistValues() != null && checklist.get(3).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint12">
                                <p class="tab-form-main-heading mb-0">Other relevant factors affecting the domestic industry that may have a bearing on the information required in the two sections immediately prior to this one.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther12" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 3 &&checklist.get(3)!=null&&checklist.get(3).getDescription()!=null?checklist.get(3).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint13" value="Information on whether the volume of imports was foreseeable. (Safeguard)"<%= (checklist != null && checklist.size() > 2 && checklist.get(2) != null && checklist.get(2).getSelectedChecklistValues() != null && checklist.get(2).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>

                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint13">
                                <p class="tab-form-main-heading mb-0">Information on whether the volume of imports was foreseeable. (Safeguard)</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther13" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 2 &&checklist.get(2)!=null&&checklist.get(2).getDescription()!=null?checklist.get(2).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint14" value="An adjustment plan showing how the industry intends to become competitive during the period within which duties or a quota may be imposed."<%= (checklist != null && checklist.size() > 1 && checklist.get(1) != null && checklist.get(1).getSelectedChecklistValues() != null && checklist.get(1).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint14">
                                <p class="tab-form-main-heading mb-0">An adjustment plan showing how the industry intends to become competitive during the period within which duties or a quota may be imposed.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther14" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 1 &&checklist.get(1)!=null&&checklist.get(1).getDescription()!=null?checklist.get(1).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                        <div class="checkbox-form-group second-custom-checkbox">
                            <input type="checkbox" id="informationRegComplaint15" value="The level of duties/quotas/safeguards that you are seeking that will result in the removal of your injuries."<%= (checklist != null && checklist.size() > 0 && checklist.get(0) != null && checklist.get(0).getSelectedChecklistValues() != null && checklist.get(0).getSelectedChecklistValues().contains("true")) ? "checked" : StringPool.BLANK %>
                            name="informationRegComplaint"> 
                            <label for="informationRegComplaint15">
                                <p class="tab-form-main-heading mb-0">The level of duties/quotas/safeguards that you are seeking that will result in the removal of your injuries.</p>
                            </label>
                        </div>
                        <div class="row checklistOtherBox ml-3 pl-2 hide">
							<div class="col-md-12">
								<div class="form-group">
									<p class="tab-form-main-heading">Description</p>
									<textarea rows="3" class="mt-3 form-control" maxlength="255" id="checklistOther15" placeholder="Description" value=""
									style="border-radius: 5px; width: 100%"><%=checklist!=null&& checklist.size() > 0 &&checklist.get(0)!=null&&checklist.get(0).getDescription()!=null?checklist.get(0).getDescription():"" %></textarea>
								</div>
							</div>
						</div>
                    </div>
                </div>
            
            	<div class="col-md-12">
                <input id="checklistVal" type="hidden" name="checklistVal" value="1">
                    <div class="">
                        <div class="accordion secured-accordian"
                            id="checklistDetailBox">
                            <div class="accordion__header is-active"
                                id="checklistDetail" onclick="expandDetails(this.id)">
                                <div class="d-flex align-items-center">
                                    <div class="d-flex align-items-center">
                                        <div>
                                            <span class="accordion__toggle"></span>
                                        </div>
                                        <div>
                                            <h2>Add Items to the Checklist</h2>
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
                                            <p class="tab-form-main-heading">Item</p>
                                            <input type="text" class="form-control"
                                                id="checklistItem" value="" placeholder="">
                                        </div>
                                    </div>
                                    <div class="col-md-12 d-flex justify-content-end py-4">
                                        <a href="javascript:void(0);" class="add-more-employee" id="addChecklistDetail" onclick="addChecklistDetail();"> 
                                            <span>+ 1</span>
                                            Add More
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 table-responsive hide addChecklistDetailTableBox">
                        <table class="table table-bordered mb-3">
                            <tbody class="addChecklistDetailTable">
                                <tr>
                                    <th class="sub_heading text-nowrap">Item</th>
                                    <th class="sub_heading">Edit</th>
                                    <th class="sub_heading">Delete</th>
                                </tr>	
             <%if(jadscChecklistadd!=null){
				long jadscChecklistaddCounter=1;
				for(JADSCChecklistAdd jadscCheck:jadscChecklistadd){
			%>	<tr>
				<td class="sub_heading_content jadscChecklistItem<%=jadscChecklistaddCounter%>">
				<%=Validator.isNotNull(jadscCheck)&&Validator.isNotNull(jadscCheck.getAddItem())?jadscCheck.getAddItem():""%>
				</td>
				
				<td> 
					<span> 
						<a href="javascript:void(0)" onclick="jadscChecklistaddEditTab('<%=jadscChecklistaddCounter%>');"> 
					        <svg width="19" height="19" viewBox="0 0 19 19" fill="none" xmlns="http://www.w3.org/2000/svg"> 
					         <path d="M0 15.2498V18.9998H3.75L14.81 7.93984L11.06 4.18984L0 15.2498ZM18.41 4.33984L14.66 0.589844L12.13 3.12984L15.88 6.87984L18.41 4.33984V4.33984Z" fill="#047247"></path> 
					        </svg> 
					      </a> 
					  </span>
			     </td>
			     <td> 
					<span> 
						<a href="javascript:void(0)" onclick="jadscChecklistaddDeleteData('<%=jadscChecklistaddCounter%>');"> 
					        <svg width="14" height="18" viewBox="0 0 14 18" fill="none" xmlns="http://www.w3.org/2000/svg">
					        <path d="M1 18H13V4H1V18ZM3.46 8.88L4.87 7.47L7 9.59L9.12 7.47L10.53 8.88L8.41 11L10.53 13.12L9.12 14.53L7 12.41L4.88 14.53L3.47 13.12L5.59 11L3.46 8.88ZM10.5 1L9.5 0H4.5L3.5 1H0V3H14V1H10.5Z" fill="#047247"></path>
					        </svg>
					      </a> 
					  </span>  
			     </td>
			</tr>
			<input type="hidden" id="jadsc-checklist-add-id<%=jadscChecklistaddCounter%>"  name="jadsc-checklist-add-id<%=jadscChecklistaddCounter%>" value="<%=jadscCheck.getJADSCChecklistAddId()%>">
										<%
										jadscChecklistaddCounter++;
										}
			 }
									%>		
							
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>