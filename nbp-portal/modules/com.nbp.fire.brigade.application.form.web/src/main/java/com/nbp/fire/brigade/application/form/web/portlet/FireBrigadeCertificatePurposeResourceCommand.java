package com.nbp.fire.brigade.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeCerPurposeInfo;
import com.nbp.fire.brigade.application.form.service.service.FireBrigadeCerPurposeInfoLocalServiceUtil;
import com.nbp.fire.brigade.application.form.web.constants.FireBrigadeApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + FireBrigadeApplicationFormPortletKeys.FIREBRIGADEAPPLICATIONFORM,
		"mvc.command.name=/add/certificate/purpose/info" }, service = MVCResourceCommand.class)
public class FireBrigadeCertificatePurposeResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {

		String certificatePurposePre = ParamUtil.getString(resourceRequest, "certificatePurposePre");
		String otherCertificatePurpose = ParamUtil.getString(resourceRequest, "otherCertificatePurpose");
		long fireBrigadeApplicationId = ParamUtil.getLong(resourceRequest, "fireBrigadeApplicationId");

		FireBrigadeCerPurposeInfo certificatePupose = null;
			try {
				certificatePupose = FireBrigadeCerPurposeInfoLocalServiceUtil
						.getFireBrigadeByAppId(fireBrigadeApplicationId);
			} catch (Exception e) {
		}
           if(certificatePupose==null){
			certificatePupose = FireBrigadeCerPurposeInfoLocalServiceUtil
					.createFireBrigadeCerPurposeInfo(CounterLocalServiceUtil.increment());
		   }
		certificatePupose.setCertificatePurposePre(certificatePurposePre);
		certificatePupose.setOtherCertificatePurpose(otherCertificatePurpose);
		certificatePupose.setFireBrigadeApplicationId(fireBrigadeApplicationId);
		FireBrigadeCerPurposeInfoLocalServiceUtil.updateFireBrigadeCerPurposeInfo(certificatePupose);
		return false;
	}
}