package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jadsc.application.form.service.model.JADSCOathRequest;
import com.nbp.jadsc.application.form.service.service.JADSCOathRequestLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=set/Oat/For/Request/Info/Url" }, service = MVCResourceCommand.class)
public class JADSCApplicationOathForRequestInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			String investigationType = ParamUtil.getString(resourceRequest, "investigationType");
			String partyName = ParamUtil.getString(resourceRequest, "partyName");
			String requestReason = ParamUtil.getString(resourceRequest, "requestReason");
			String comOfficial = ParamUtil.getString(resourceRequest, "comOfficial");
			String signatureDate = ParamUtil.getString(resourceRequest, "signatureDate");
			long jadscApplicationId = ParamUtil.getLong(resourceRequest, "jadscApplicationId");
			JADSCOathRequest jadscOathRequest = null;
			try {
				jadscOathRequest = JADSCOathRequestLocalServiceUtil.getJADSCBy_Id(jadscApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
			if (jadscOathRequest == null) {
				jadscOathRequest = JADSCOathRequestLocalServiceUtil
						.createJADSCOathRequest(CounterLocalServiceUtil.increment());
			}
			jadscOathRequest.setInvestigationType(investigationType);
			jadscOathRequest.setPartyName(partyName);
			jadscOathRequest.setRequestReason(requestReason);
			jadscOathRequest.setComOfficial(comOfficial);
			try {
				if(Validator.isNotNull(signatureDate)) {
				jadscOathRequest.setSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(signatureDate));
			} }catch (ParseException e) {
			}
			jadscOathRequest.setJadscApplicationId(jadscApplicationId);
			JADSCOathRequestLocalServiceUtil.updateJADSCOathRequest(jadscOathRequest);

		return false;
	}

}
