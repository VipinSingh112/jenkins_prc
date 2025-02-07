package com.nbp.hsra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.hsra.application.form.web.constants.HSRAApplicationFormPortletKeys;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;
import com.nbp.hsra.application.service.service.DetailOfBusinessSecThreeLocalServiceUtil;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + HSRAApplicationFormPortletKeys.HSRAAPPLICATIONFORM,
		"mvc.command.name=/hsra/detail/of/business/three" }, service = MVCResourceCommand.class)

public class HsraDetailOfBusinessSectionResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(HsraDetailOfBusinessSectionResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("Inside Section Three Detail of Business******");
		long hsraApplicationId = ParamUtil.getLong(resourceRequest, "hsraApplicationId");
		String businessType = ParamUtil.getString(resourceRequest, "businessType");
		String nuclearBusinessNumber = ParamUtil.getString(resourceRequest, "nuclearBusinessNumber");
		String nuclearCorporationNumber = ParamUtil.getString(resourceRequest, "nuclearCorporationNumber");
		String nuclearPublicAct = ParamUtil.getString(resourceRequest, "nuclearPublicAct");
		String nuclearName = ParamUtil.getString(resourceRequest, "nuclearName");
		String nuclearAddressThird = ParamUtil.getString(resourceRequest, "nuclearAddressThird");
		String nuclearThirdParish = ParamUtil.getString(resourceRequest, "nuclearThirdParish");
		String nuclearTelephoneNum = ParamUtil.getString(resourceRequest, "nuclearTelephoneNum");
		String nuclearfaxNumber = ParamUtil.getString(resourceRequest, "nuclearfaxNumber");
		String nuclearEmailAdd = ParamUtil.getString(resourceRequest, "nuclearEmailAdd");
		String nuclearFinancialGuarantee = ParamUtil.getString(resourceRequest, "nuclearFinancialGuarantee");

		DetailOfBusinessSecThree detailOfBusiness = null;
		try {
			detailOfBusiness = DetailOfBusinessSecThreeLocalServiceUtil.getHsraById(hsraApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(detailOfBusiness)) {
			detailOfBusiness = DetailOfBusinessSecThreeLocalServiceUtil
					.createDetailOfBusinessSecThree(CounterLocalServiceUtil.increment());
		}
		detailOfBusiness.setBusinessType(businessType);
		detailOfBusiness.setNuclearBusinessNumber(nuclearBusinessNumber);
		detailOfBusiness.setNuclearCorporationNum(nuclearCorporationNumber);
		detailOfBusiness.setNuclearPublicAct(nuclearPublicAct);
		detailOfBusiness.setNuclearName(nuclearName);
		detailOfBusiness.setNuclearAddressThird(nuclearAddressThird);
		detailOfBusiness.setNuclearThirdParish(nuclearThirdParish);
		detailOfBusiness.setNuclearTelephoneNum(nuclearTelephoneNum);
		detailOfBusiness.setNuclearfaxNumber(nuclearfaxNumber);
		detailOfBusiness.setNuclearEmailAdd(nuclearEmailAdd);
		detailOfBusiness.setNuclearFinancial(nuclearFinancialGuarantee);
		detailOfBusiness.setHsraApplicationId(hsraApplicationId);
		DetailOfBusinessSecThreeLocalServiceUtil.updateDetailOfBusinessSecThree(detailOfBusiness);
		return false;
	}

}
