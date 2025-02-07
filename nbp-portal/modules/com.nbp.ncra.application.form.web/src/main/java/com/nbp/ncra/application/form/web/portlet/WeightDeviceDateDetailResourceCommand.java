package com.nbp.ncra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDateLocalServiceUtil;
import com.nbp.ncra.application.form.service.service.NcraVerifyWeighingDeviceInfoLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
			"mvc.command.name=/weight/device/date/info"
		},
		service = MVCResourceCommand.class
	)
public class WeightDeviceDateDetailResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String weighingDate = ParamUtil.getString(resourceRequest, "weighingDate");
		long ncraApplicationId = ParamUtil.getLong(resourceRequest, "ncraApplicationId");
		NcraVerifyWeighingDate weightDate=null;
		try {
			weightDate=NcraVerifyWeighingDateLocalServiceUtil.getNcraVerify_By_Date(ncraApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		 if (weightDate==null) {
			 weightDate=NcraVerifyWeighingDateLocalServiceUtil.createNcraVerifyWeighingDate(CounterLocalServiceUtil.increment());
			}
		try {
			weightDate.setWeighingDate(new SimpleDateFormat("yyyy-MM-dd").parse(weighingDate));
		} catch (Exception e) {
			// TODO: handle exception
		}
		weightDate.setNcraApplicationId(ncraApplicationId);;
		NcraVerifyWeighingDateLocalServiceUtil.updateNcraVerifyWeighingDate(weightDate);

		return false;
	}

}
