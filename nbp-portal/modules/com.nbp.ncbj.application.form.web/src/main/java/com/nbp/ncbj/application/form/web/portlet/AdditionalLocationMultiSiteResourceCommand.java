package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjAddLocMultiSite;
import com.nbp.ncbj.application.form.service.service.NcbjAddLocMultiSiteLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=/additional/location/multisite/info"
		},
		service = MVCResourceCommand.class
	)

public class AdditionalLocationMultiSiteResourceCommand implements MVCResourceCommand{

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String signatureName = ParamUtil.getString(resourceRequest, "signatureName");
		String position = ParamUtil.getString(resourceRequest, "position");
		String date = ParamUtil.getString(resourceRequest, "date");
		String centralOfficeLink = ParamUtil.getString(resourceRequest, "centralOfficeLink");
		String commonManagementSystem = ParamUtil.getString(resourceRequest, "commonManagementSystem");
		String substantiallySameProcess = ParamUtil.getString(resourceRequest, "substantiallySameProcess");
		String siteSimilarMethod = ParamUtil.getString(resourceRequest, "siteSimilarMethod");
		String siteUnderAudit = ParamUtil.getString(resourceRequest, "siteUnderAudit");
		String siteCorrectiveRight = ParamUtil.getString(resourceRequest, "siteCorrectiveRight");
		String changesAuthority = ParamUtil.getString(resourceRequest, "changesAuthority");
		
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		
		NcbjAddLocMultiSite ncbjAdditionalLocation=null;
		
		try {
			ncbjAdditionalLocation= NcbjAddLocMultiSiteLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		if (ncbjAdditionalLocation == null) {
			ncbjAdditionalLocation=NcbjAddLocMultiSiteLocalServiceUtil.createNcbjAddLocMultiSite(CounterLocalServiceUtil.increment());
		}
		ncbjAdditionalLocation.setSignatureName(signatureName);
	    
	    ncbjAdditionalLocation.setPosition(position);
	    try {
	    	ncbjAdditionalLocation.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(date));
		} catch (Exception e) {
			// TODO: handle exception
		}
	    
	    ncbjAdditionalLocation.setCentralOfficeLink(centralOfficeLink);
	    ncbjAdditionalLocation.setCommonManagementSystem(commonManagementSystem);
	    ncbjAdditionalLocation.setSubstantiallySameProcess(substantiallySameProcess);
	    ncbjAdditionalLocation.setSiteSimilarMethod(siteSimilarMethod);
	    ncbjAdditionalLocation.setSiteUnderAudit(siteUnderAudit);
	    ncbjAdditionalLocation.setSiteCorrectiveRight(siteCorrectiveRight);
	    ncbjAdditionalLocation.setChangesAuthority(changesAuthority);
	    
	    ncbjAdditionalLocation.setNcbjApplicationId(ncbjApplicationId);
	    NcbjAddLocMultiSiteLocalServiceUtil.updateNcbjAddLocMultiSite(ncbjAdditionalLocation);
		
		// TODO Auto-generated method stub
		return false;
	}

}
