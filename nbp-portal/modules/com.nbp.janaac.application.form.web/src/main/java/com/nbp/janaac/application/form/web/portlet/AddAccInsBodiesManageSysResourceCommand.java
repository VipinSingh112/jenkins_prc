package com.nbp.janaac.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.janaac.application.form.service.model.AccInsBodiesManageSys;
import com.nbp.janaac.application.form.service.service.AccInsBodiesManageSysLocalServiceUtil;
import com.nbp.janaac.application.form.web.constants.JanaacApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" +JanaacApplicationFormPortletKeys.JANAACAPPLICATIONFORM,
		"mvc.command.name=/acc/ins/bodies/manage/sys/req" }, service = MVCResourceCommand.class)
public class AddAccInsBodiesManageSysResourceCommand implements MVCResourceCommand{

	private static Log _log = LogFactoryUtil.getLog(AddAccInsBodiesManageSysResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accreditation inspection bodies management system requirement info------ Started]");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long janaacApplicationId = ParamUtil.getLong(resourceRequest, "janaacApplicationId");
		String optionFollow = ParamUtil.getString(resourceRequest, "optionFollow");
		String manualApproval = ParamUtil.getString(resourceRequest, "manualApproval");
		String qMRefManual = ParamUtil.getString(resourceRequest, "qMRefManual");
		String relevantPolicies= ParamUtil.getString(resourceRequest, "relevantPolicies");
		String qMRefRelevant= ParamUtil.getString(resourceRequest, "qMRefRelevant");
		String overallObj= ParamUtil.getString(resourceRequest, "overallObj");
		String qMRefOverallObj= ParamUtil.getString(resourceRequest, "qMRefOverallObj");
		String supportingProcedure= ParamUtil.getString(resourceRequest, "supportingProcedure");
		String qMRefSupporting= ParamUtil.getString(resourceRequest, "qMRefSupporting");
		String technicalMangmnt= ParamUtil.getString(resourceRequest, "technicalMangmnt");
		String qMRefTechnical= ParamUtil.getString(resourceRequest, "qMRefTechnical");
		String documentation= ParamUtil.getString(resourceRequest, "documentation");
		String qMRefDocumentation= ParamUtil.getString(resourceRequest, "qMRefDocumentation");
		String docContolProc= ParamUtil.getString(resourceRequest, "docContolProc");
		String qMRefDocControl= ParamUtil.getString(resourceRequest, "qMRefDocControl");
		String documntChanges= ParamUtil.getString(resourceRequest, "documntChanges");
		String qMRefDocumntChanges= ParamUtil.getString(resourceRequest, "qMRefDocumntChanges");
		String controlOfQuality= ParamUtil.getString(resourceRequest, "controlOfQuality");
		String qMRefControl= ParamUtil.getString(resourceRequest, "qMRefControl");
		String managementReview= ParamUtil.getString(resourceRequest, "managementReview");
		String qMRefManage = ParamUtil.getString(resourceRequest, "qMRefManage");
		String insInternalAudits= ParamUtil.getString(resourceRequest, "insInternalAudits");
		String qMRefInternalAudit= ParamUtil.getString(resourceRequest, "qMRefInternalAudit");
		String insCorrectiveAction=ParamUtil.getString(resourceRequest, "insCorrectiveAction");
		String qMRefCorrect=ParamUtil.getString(resourceRequest, "qMRefCorrect");
		String insPreventiveAction=ParamUtil.getString(resourceRequest, "insPreventiveAction");
		String qMRefPreventive=ParamUtil.getString(resourceRequest, "qMRefPreventive");
		String personnel=ParamUtil.getString(resourceRequest, "personnel");
		String qMRefPersonnel=ParamUtil.getString(resourceRequest, "qMRefPersonnel");
		String equipment=ParamUtil.getString(resourceRequest, "equipment");
		String qMRefEquip=ParamUtil.getString(resourceRequest, "qMRefEquip");
		String inspection=ParamUtil.getString(resourceRequest, "inspection");
		String qMRefInspection=ParamUtil.getString(resourceRequest, "qMRefInspection");
		String contractualArrange=ParamUtil.getString(resourceRequest, "contractualArrange");
		String qMRefContractual=ParamUtil.getString(resourceRequest, "qMRefContractual");
		String handlingInsItem=ParamUtil.getString(resourceRequest, "handlingInsItem");
		String qMRefHandling=ParamUtil.getString(resourceRequest, "qMRefHandling");
		String complaintsAppeals=ParamUtil.getString(resourceRequest, "complaintsAppeals");
		String qMRefComplaints=ParamUtil.getString(resourceRequest, "qMRefComplaints");
		AccInsBodiesManageSys application=null;
		try {
			application = AccInsBodiesManageSysLocalServiceUtil.getJANAAC_ByApplicationId(janaacApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccInsBodiesManageSysLocalServiceUtil.createAccInsBodiesManageSys(CounterLocalServiceUtil.increment(AddAccInsBodiesManageSysResourceCommand.class.getName()));
		}
		application.setOptionFollow(optionFollow);
		application.setManualApproval(manualApproval);
		application.setQMRefManual(qMRefManual);
		application.setRelevantPolicies(relevantPolicies);
		application.setQMRefRelevant(qMRefRelevant);
		application.setOverallObj(overallObj);
		application.setQMRefOverallObj(qMRefOverallObj);
		application.setSupportingProcedure(supportingProcedure);
		application.setQMRefSupporting(qMRefSupporting);
		application.setTechnicalMangmnt(technicalMangmnt);
		application.setQMRefTechnical(qMRefTechnical);
		application.setDocumentation(documentation);
		application.setQMRefDocumentation(qMRefDocumentation);
		application.setDocContolProc(docContolProc);
		application.setQMRefDocControl(qMRefDocControl);
		application.setDocumntChanges(documntChanges);
		application.setQMRefDocumntChanges(qMRefDocumntChanges);
		application.setControlOfQuality(controlOfQuality);
		application.setQMRefControl(qMRefControl);
		application.setManagementReview(managementReview);
		application.setQMRefManage(qMRefManage);
		application.setInsInternalAudits(insInternalAudits);
		application.setQMRefInternalAudit(qMRefInternalAudit);
		application.setInsCorrectiveAction(insCorrectiveAction);
		application.setQMRefCorrect(qMRefCorrect);
		application.setInsPreventiveAction(insPreventiveAction);
		application.setQMRefPreventive(qMRefPreventive);
		application.setPersonnel(personnel);
		application.setQMRefPersonnel(qMRefPersonnel);
		application.setEquipment(equipment);
		application.setQMRefEquip(qMRefEquip);
		application.setInspection(inspection);
		application.setQMRefInspection(qMRefInspection);
		application.setContractualArrange(contractualArrange);
		application.setQMRefContractual(qMRefContractual);
		application.setHandlingInsItem(handlingInsItem);
		application.setQMRefHandling(qMRefHandling);
		application.setComplaintsAppeals(complaintsAppeals);
		application.setQMRefComplaints(qMRefComplaints);
		application.setJanaacApplicationId(janaacApplicationId);
		AccInsBodiesManageSysLocalServiceUtil.updateAccInsBodiesManageSys(application);
		jsonOBJ.put("janaacApplicationId", application.getJanaacApplicationId());
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("an error occured----"+e);
		}
		return false;
	}

}
