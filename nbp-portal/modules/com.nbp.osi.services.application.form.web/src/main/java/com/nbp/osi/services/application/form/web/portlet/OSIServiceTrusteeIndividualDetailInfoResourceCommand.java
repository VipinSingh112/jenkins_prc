package com.nbp.osi.services.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesTrusteeIndividualDetailinfoException;
import com.nbp.osi.services.application.form.service.model.OsiServicesTrusteeIndividualDetailinfo;
import com.nbp.osi.services.application.form.service.service.OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil;
import com.nbp.osi.services.application.form.web.constants.OSIServicesApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + OSIServicesApplicationFormPortletKeys.OSISERVICESAPPLICATIONFORM,
		"mvc.command.name=/trustee/Indi/Detail/Info/Url" }, service = MVCResourceCommand.class)
public class OSIServiceTrusteeIndividualDetailInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		long osiServicesApplicationId = ParamUtil.getLong(resourceRequest, "osiServicesApplicationId");
		String indiFamilyName = ParamUtil.getString(resourceRequest, "indiFamilyName");
		String indiGivenName = ParamUtil.getString(resourceRequest, "indiGivenName");
		String indiDateOfBirth = ParamUtil.getString(resourceRequest, "indiDateOfBirth");
		String indiOtherLegalNames = ParamUtil.getString(resourceRequest, "indiOtherLegalNames");
		String indiBusinessAddress = ParamUtil.getString(resourceRequest, "indiBusinessAddress");
		String indiBusinessTeleNo = ParamUtil.getString(resourceRequest, "indiBusinessTeleNo");
		String indiBusinessFaxNo = ParamUtil.getString(resourceRequest, "indiBusinessFaxNo");
		String indiBusinessEmail = ParamUtil.getString(resourceRequest, "indiBusinessEmail");
		String indiHomeAddress = ParamUtil.getString(resourceRequest, "indiHomeAddress");
		String indiHomeTeleNo = ParamUtil.getString(resourceRequest, "indiHomeTeleNo");
		String indiHomeFaxNo = ParamUtil.getString(resourceRequest, "indiHomeFaxNo");
		String indiHomeEmail = ParamUtil.getString(resourceRequest, "indiHomeEmail");
		String indiCurrentEmployer = ParamUtil.getString(resourceRequest, "indiCurrentEmployer");
		String indiDateOfEmployment = ParamUtil.getString(resourceRequest, "indiDateOfEmployment");
		String indiProfessionalOrg = ParamUtil.getString(resourceRequest, "indiProfessionalOrg");
		OsiServicesTrusteeIndividualDetailinfo detailinfo = null;
		try {
			detailinfo = OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil
					.getOsiServicesTrusteeIndividualDetailinfoById(osiServicesApplicationId);
		} catch (NoSuchOsiServicesTrusteeIndividualDetailinfoException e) {
		}
		if (detailinfo == null) {
			detailinfo = OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil
					.createOsiServicesTrusteeIndividualDetailinfo(CounterLocalServiceUtil.increment());
		}
		detailinfo.setIndiFamilyName(indiFamilyName);
	    detailinfo.setIndiGivenName(indiGivenName);
	    try {
			detailinfo.setIndiDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse(indiDateOfBirth));
		} catch (ParseException e) {
		}
	    detailinfo.setIndiOtherLegalNames(indiOtherLegalNames);
	    detailinfo.setIndiBusinessAddress(indiBusinessAddress);
	    detailinfo.setIndiBusinessTeleNo(indiBusinessTeleNo);
	    detailinfo.setIndiBusinessFaxNo(indiBusinessFaxNo);
	    detailinfo.setIndiBusinessEmail(indiBusinessEmail);
	    detailinfo.setIndiHomeAddress(indiHomeAddress);
	    detailinfo.setIndiHomeTeleNo(indiHomeTeleNo);
	    detailinfo.setIndiHomeFaxNo(indiHomeFaxNo);
	    detailinfo.setIndiHomeEmail(indiHomeEmail);
	    detailinfo.setIndiCurrentEmployer(indiCurrentEmployer);
	    try {
			detailinfo.setIndiDateOfEmployment(new SimpleDateFormat("yyyy-MM-dd").parse(indiDateOfEmployment));
		} catch (ParseException e) {
		}
	    detailinfo.setIndiProfessionalOrg(indiProfessionalOrg);
		detailinfo.setOsiServicesApplicationId(osiServicesApplicationId);
		OsiServicesTrusteeIndividualDetailinfoLocalServiceUtil.updateOsiServicesTrusteeIndividualDetailinfo(detailinfo);
		return false;
	}

}
