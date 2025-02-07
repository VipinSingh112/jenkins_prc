package com.nbp.ncra.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncra.application.form.service.model.NcraFeeSubmission;
import com.nbp.ncra.application.form.service.service.NcraFeeSubmissionLocalServiceUtil;
import com.nbp.ncra.application.form.web.constants.NCRAApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
		"javax.portlet.name=" + NCRAApplicationFormPortletKeys.NCRAAPPLICATIONFORM,
		"mvc.command.name=/payment/Ncra" }, service = MVCResourceCommand.class)
public class NCRAPaymentResourceCommmand implements MVCResourceCommand{
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
			System.out.println("called  payment");
			String paymentNcra = ParamUtil.getString(resourceRequest, "creditStatus");
		    long ncraApplicationId = ParamUtil.getLong(resourceRequest, "ncraApplicationId");
		    System.out.println("Payment ");
		    NcraFeeSubmission feeSubmission=null;
		    try {
		    	feeSubmission=NcraFeeSubmissionLocalServiceUtil.getNcraFee_By_NCRA_Id(ncraApplicationId);
			} catch (Exception e) {
				// TODO: handle exception
			}
		    if (feeSubmission==null) {
		    	feeSubmission=NcraFeeSubmissionLocalServiceUtil.createNcraFeeSubmission(CounterLocalServiceUtil.increment());
			}
		    feeSubmission.setCreditStatus(paymentNcra);
		    feeSubmission.setNcraApplicationId(ncraApplicationId);
		    NcraFeeSubmissionLocalServiceUtil.updateNcraFeeSubmission(feeSubmission);
		    System.out.println("called payment end");
		return false;
	}
}
