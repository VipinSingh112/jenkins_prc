package com.nbp.miic.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.miic.application.form.services.model.MiicSuspensionOfCet;
import com.nbp.miic.application.form.services.service.MiicSuspensionOfCetLocalServiceUtil;
import com.nbp.miic.application.form.web.constants.MIICApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + MIICApplicationFormPortletKeys.MIICAPPLICATIONFORM,
		"mvc.command.name=/add/miic/suspension/of/cet/form" }, service = MVCResourceCommand.class)
public class MIICSuspensionOfCetResourceCommnad implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		String indicationOfUrgency = ParamUtil.getString(resourceRequest, "indicationOfUrgency");
		String suspensionOfRate = ParamUtil.getString(resourceRequest, "suspensionOfRate");
		String suspensionEvidenceInability = ParamUtil.getString(resourceRequest, "suspensionEvidenceInability");
		String suspensionConsultation = ParamUtil.getString(resourceRequest, "suspensionConsultation");
		String suspensionConsultationLocal = ParamUtil.getString(resourceRequest, "suspensionConsultationLocal");
		String suspensionConsultationForeign = ParamUtil.getString(resourceRequest, "suspensionConsultationForeign");
		String authorizedPersonnelName = ParamUtil.getString(resourceRequest, "authorizedPersonnelName");
		long miicApplicationId = ParamUtil.getLong(resourceRequest, "miicApplicationId");
		MiicSuspensionOfCet suspensionOfCet = null;
		suspensionOfCet = MiicSuspensionOfCetLocalServiceUtil
				.createMiicSuspensionOfCet(CounterLocalServiceUtil.increment());
		suspensionOfCet.setIndicationOfUrgency(indicationOfUrgency);
		suspensionOfCet.setRequestForSuspension(suspensionOfRate);
		suspensionOfCet.setEvidenceOfInability(suspensionEvidenceInability);
		suspensionOfCet.setEvidenceOfConsultation(suspensionConsultationLocal);
		suspensionOfCet.setEvidenceOfConsultationForeign(suspensionConsultationForeign);
		suspensionOfCet.setNameOfAuthorizedPersonnel(authorizedPersonnelName);
		suspensionOfCet.setMiicApplicationId(miicApplicationId);
		MiicSuspensionOfCetLocalServiceUtil.updateMiicSuspensionOfCet(suspensionOfCet);
		return false;
	}
}