package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail;
import com.nbp.ncbj.application.form.service.service.NcbjOrganizationDetailLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
			"mvc.command.name=add/org/detail/info"
		},
		service = MVCResourceCommand.class
	)

public class NcbjCertifiPreferredDateInfoResourceCommand implements MVCResourceCommand {

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String nameOfOrganization=ParamUtil.getString(resourceRequest, "nameOfOrganization");
		String address=ParamUtil.getString(resourceRequest, "address");
		String telephoneNumber=ParamUtil.getString(resourceRequest, "telephoneNumber");
		String faxNumber=ParamUtil.getString(resourceRequest, "faxNumber");
		String emailAddress=ParamUtil.getString(resourceRequest, "emailAddress");
		String headOfOrganization=ParamUtil.getString(resourceRequest, "headOfOrganization");
		String positionFirst=ParamUtil.getString(resourceRequest, "positionFirst");
		String contactPersonName=ParamUtil.getString(resourceRequest, "contactPersonName");
		String contactPersonEmail=ParamUtil.getString(resourceRequest, "contactPersonEmail");
		String positionSecond=ParamUtil.getString(resourceRequest, "positionSecond");
		String managementSystem=ParamUtil.getString(resourceRequest, "managementSystem");
		String orgDeterminedTheScope=ParamUtil.getString(resourceRequest, "orgDeterminedTheScope");
		String pleaseStateTheScope=ParamUtil.getString(resourceRequest, "pleaseStateTheScope");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		
		NcbjOrganizationDetail ncbjOrganizationDetail=null;
		try {
			ncbjOrganizationDetail= NcbjOrganizationDetailLocalServiceUtil.getNCBJ_ByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  if(ncbjOrganizationDetail==null) {
			  ncbjOrganizationDetail=NcbjOrganizationDetailLocalServiceUtil.createNcbjOrganizationDetail(CounterLocalServiceUtil.increment());
		  }
		  ncbjOrganizationDetail.setNameOfOrganization(nameOfOrganization);
		  ncbjOrganizationDetail.setAddress(address);
		  ncbjOrganizationDetail.setTelephoneNumber(telephoneNumber);
		  ncbjOrganizationDetail.setFaxNumber(faxNumber);
		  ncbjOrganizationDetail.setEmailAddress(emailAddress);
		  ncbjOrganizationDetail.setHeadOfOrganization(headOfOrganization);
		  ncbjOrganizationDetail.setPosition(positionFirst);
		  ncbjOrganizationDetail.setContactPersonName(contactPersonName);
		  ncbjOrganizationDetail.setContactPersonEmailAddress(contactPersonEmail);
		  ncbjOrganizationDetail.setContactPersonPosition(positionSecond);
		  ncbjOrganizationDetail.setManagementSystem(managementSystem);
		  ncbjOrganizationDetail.setDeterminedTheScope(orgDeterminedTheScope);
		  ncbjOrganizationDetail.setNcbjApplicationId(ncbjApplicationId);
		  ncbjOrganizationDetail.setPleaseStageTheScope(pleaseStateTheScope);
		  NcbjOrganizationDetailLocalServiceUtil.updateNcbjOrganizationDetail(ncbjOrganizationDetail);
		 
		// TODO Auto-generated method stub
		return false;
	}

}
