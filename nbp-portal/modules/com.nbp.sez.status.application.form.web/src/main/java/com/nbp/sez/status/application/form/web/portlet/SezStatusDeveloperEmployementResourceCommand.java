package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezDevEmplomentInfo;
import com.nbp.sez.status.application.form.service.service.SezDevEmplomentInfoLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
		"mvc.command.name=/dev/employement" }, service = MVCResourceCommand.class)
public class SezStatusDeveloperEmployementResourceCommand implements MVCResourceCommand {
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String directFirstYrEm = ParamUtil.getString(resourceRequest, "directFirstYrEm");
		String indirectFirstYrEm = ParamUtil.getString(resourceRequest, "indirectFirstYrEm");
		String maleDirectFirstYrEm = ParamUtil.getString(resourceRequest, "maleDirectFirstYrEm");
		String femaleDirectFirstYrEm = ParamUtil.getString(resourceRequest, "femaleDirectFirstYrEm");
		String localFirstYrEm = ParamUtil.getString(resourceRequest, "localFirstYrEm");
		String foreignFirstYrEm = ParamUtil.getString(resourceRequest, "foreignFirstYrEm");
		String directSecondYrEm = ParamUtil.getString(resourceRequest, "directSecondYrEm");
		String indirectSecondYrEm = ParamUtil.getString(resourceRequest, "indirectSecondYrEm");
		String maleDirectSecondYrEm = ParamUtil.getString(resourceRequest, "maleDirectSecondYrEm");
		String femaleDirectSecondYrEm = ParamUtil.getString(resourceRequest, "femaleDirectSecondYrEm");
		String localSecondYrEm = ParamUtil.getString(resourceRequest, "localSecondYrEm");
		String foreignSecondYrEm = ParamUtil.getString(resourceRequest, "foreignSecondYrEm");
		String directThirdYrEm = ParamUtil.getString(resourceRequest, "directThirdYrEm");
		String indirectThirdYrEm = ParamUtil.getString(resourceRequest, "indirectThirdYrEm");
		String maleDirectThirdYrEm = ParamUtil.getString(resourceRequest, "maleDirectThirdYrEm");
		String femaleDirectThirdYrEm = ParamUtil.getString(resourceRequest, "femaleDirectThirdYrEm");
		String localThirdYrEm = ParamUtil.getString(resourceRequest, "localThirdYrEm");
		String foreignThirdYrEm = ParamUtil.getString(resourceRequest, "foreignThirdYrEm");
		long sezStatusApplicationId=ParamUtil.getLong(resourceRequest, "sezStatusApplicationId");
		SezDevEmplomentInfo devEmploment = null;
		try {
			devEmploment = SezDevEmplomentInfoLocalServiceUtil.getgetSezById(sezStatusApplicationId);
		} catch (Exception e) {
		}
		if(devEmploment==null) {
		devEmploment = SezDevEmplomentInfoLocalServiceUtil
				.createSezDevEmplomentInfo(CounterLocalServiceUtil.increment());
		}
		devEmploment.setFirstYearDirect(directFirstYrEm);
		devEmploment.setFirstYearInDirect(indirectFirstYrEm);
		devEmploment.setFirstYearMale(maleDirectFirstYrEm);
		devEmploment.setFirstYearFemale(femaleDirectFirstYrEm);
		devEmploment.setFirstYearLocal(localFirstYrEm);
		devEmploment.setFirstYearForeign(foreignFirstYrEm);
		devEmploment.setSecondYearDirect(directSecondYrEm);
		devEmploment.setSecondYearIndirect(indirectSecondYrEm);
		devEmploment.setSecondYearMale(maleDirectSecondYrEm);
		devEmploment.setSecondYearFemale(femaleDirectSecondYrEm);
		devEmploment.setSecondYearLocal(localSecondYrEm);
		devEmploment.setSecondYearForeign(foreignSecondYrEm);
		devEmploment.setThirdYearDirect(directThirdYrEm);
		devEmploment.setThirdYearIndirect(indirectThirdYrEm);
		devEmploment.setThirdYearMale(maleDirectThirdYrEm);
		devEmploment.setThirdYearFemale(femaleDirectThirdYrEm);
		devEmploment.setThirdYearLocal(localThirdYrEm);
		devEmploment.setThirdYearForeign(foreignThirdYrEm);
		devEmploment.setSezStatusApplicationId(sezStatusApplicationId);
		SezDevEmplomentInfoLocalServiceUtil.updateSezDevEmplomentInfo(devEmploment);
		return false;
	}
}