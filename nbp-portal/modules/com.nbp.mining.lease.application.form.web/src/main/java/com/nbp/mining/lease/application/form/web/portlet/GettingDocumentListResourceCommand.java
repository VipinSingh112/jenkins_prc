package com.nbp.mining.lease.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.mining.lease.application.form.web.constants.MiningLeaseApplicationFormPortletKeys;

import java.io.IOException;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = {
		"javax.portlet.name=" + MiningLeaseApplicationFormPortletKeys.MININGLEASEAPPLICATIONFORM,
		"mvc.command.name=mining/Application/Getting/Document/List" }, service = MVCResourceCommand.class)
public class GettingDocumentListResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(GettingDocumentListResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Getting Document List of Mining Lease]");
		long miningLeaseApplicationId = ParamUtil.getLong(resourceRequest, "miningLeaseApplicationId");
		String typeOfProspectingLicence = ParamUtil.getString(resourceRequest, "typeOfProspectingLicence");
		String typeOfTransaction = ParamUtil.getString(resourceRequest, "typeOfTransaction");
		String typeOfApplicant = ParamUtil.getString(resourceRequest, "typeOfApplicant");
		String typeofTransactionMiningLease = ParamUtil.getString(resourceRequest, "typeofTransactionMiningLease");
		String categories="";
		System.out.println("typeOfApplicant----" + typeOfApplicant);
		System.out.println("typeOfProspectingLicence----" + typeOfProspectingLicence);
		System.out.println("typeOfTransaction----" + typeOfTransaction);
		System.out.println("miningLeaseApplicationId----" + miningLeaseApplicationId);
		System.out.println("typeofTransactionMiningLease----" + typeofTransactionMiningLease);

		if(typeOfApplicant.contains("Prospecting Licence")&&typeOfProspectingLicence.contains("New")) {
			categories="New";
		}else if(typeOfApplicant.contains("Prospecting Licence")&&typeOfProspectingLicence.contains("Additional Minerals")) {
			categories="New";
		}else if(typeOfProspectingLicence.contains("Renewal")&&typeOfApplicant.contains("Prospecting Licence")) {
			categories="Renew";
		}else if(typeOfProspectingLicence.contains("Transfer")&&typeOfApplicant.contains("Prospecting Licence")) {
			categories="Transfer";
		}else if(typeOfApplicant.contains("Mining Lease")&&typeofTransactionMiningLease.contains("New")) {
			categories="New";
		}else if(typeOfApplicant.contains("Mining Lease")&&typeofTransactionMiningLease.contains("Renewal")) {
			categories="Renew";
		}
		else {
			categories="";
		}
		System.out.println("categories----" + categories);
		JSONObject gettingSupportingDocumentArray = commonsUtil.gettingSupportingDocumentArray(resourceRequest,
				categories, "miningsupportingdocuments");
		_log.info("gettingSupportingDocumentArray----" + gettingSupportingDocumentArray);
		resourceRequest.setAttribute("documentListJsonArray", gettingSupportingDocumentArray);
		resourceRequest.setAttribute("miningLeaseApplicationId", String.valueOf(miningLeaseApplicationId));

		_log.info("**********Mining  Application Id" + miningLeaseApplicationId);
		try {
			resourceRequest.getPortletContext().getRequestDispatcher("/supporting-documents/mining-documents-list.jsp")
					.include(resourceRequest, resourceResponse);
		} catch (IOException e) {
		}
		return false;

	}

	@Reference
	private CommonsUtil commonsUtil;
}
