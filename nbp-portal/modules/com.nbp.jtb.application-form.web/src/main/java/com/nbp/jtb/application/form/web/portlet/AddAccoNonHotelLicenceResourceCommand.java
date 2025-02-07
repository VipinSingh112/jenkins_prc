package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AccoNonHotelLicence;
import com.nbp.jtb.application.form.service.service.AccoNonHotelLicenceLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/acco/non/hotel/licence" }, service = MVCResourceCommand.class)
public class AddAccoNonHotelLicenceResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddHotelLicenceDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accomodation non-hotel licence info------ Started]");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String nonHotelAccommodationName=ParamUtil.getString(resourceRequest, "nonHotelAccommodationName");
		String nonHotelAccomadationAddress=ParamUtil.getString(resourceRequest, "nonHotelAccomadationAddress");
		String nonHotelAccomadationTelephone=ParamUtil.getString(resourceRequest, "nonHotelAccomadationTelephone");
		String nonHotelAccomadationFaxNum=ParamUtil.getString(resourceRequest, "nonHotelAccomadationFaxNum");
		String nonHotelAccomadationEmail=ParamUtil.getString(resourceRequest, "nonHotelAccomadationEmail");
		String nonHotelAccomadationEmployeesNum=ParamUtil.getString(resourceRequest, "nonHotelAccomadationEmployeesNum");
		String nonHotelAccomadationTypeOffered=ParamUtil.getString(resourceRequest, "nonHotelAccomadationTypeOffered");
		String nonHotelAccomadationRoomNum=ParamUtil.getString(resourceRequest, "nonHotelAccomadationRoomNum");
		String nonHotelAccomadationOwnerName=ParamUtil.getString(resourceRequest, "nonHotelAccomadationOwnerName");
		String nonHotelAccomadationAddressOwner=ParamUtil.getString(resourceRequest, "nonHotelAccomadationAddressOwner");
		String nonHotelAccomadationTelNo=ParamUtil.getString(resourceRequest, "nonHotelAccomadationTelNo");
		String nonHotelAccomadationFaxNumber=ParamUtil.getString(resourceRequest, "nonHotelAccomadationFaxNumber");
		String nonHotelAccomadationCompanyName=ParamUtil.getString(resourceRequest, "nonHotelAccomadationCompanyName");
		String nonHotelAccomadationAddressCompany=ParamUtil.getString(resourceRequest, "nonHotelAccomadationAddressCompany");
		String nonHotelAccomadationManagerName=ParamUtil.getString(resourceRequest, "nonHotelAccomadationManagerName");
		String nonHotelAccomadationAddressManager=ParamUtil.getString(resourceRequest, "nonHotelAccomadationAddressManager");
		String nonHotelAccomadationManagerTel=ParamUtil.getString(resourceRequest, "nonHotelAccomadationManagerTel");
		String nonHotelAccomadationManagerFax=ParamUtil.getString(resourceRequest, "nonHotelAccomadationManagerFax");
		String nonHotelAccomadationManagerEmail=ParamUtil.getString(resourceRequest, "nonHotelAccomadationManagerEmail");
		AccoNonHotelLicence application=null;
		try {
			application=AccoNonHotelLicenceLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		if(Validator.isNull(application)) {
			application = AccoNonHotelLicenceLocalServiceUtil.createAccoNonHotelLicence(CounterLocalServiceUtil.increment());
		}
		application.setAccoName(nonHotelAccommodationName);
		application.setAccoAddress(nonHotelAccomadationAddress);
		application.setAccoTeleNo(nonHotelAccomadationTelephone);
		application.setAccoFaxNo(nonHotelAccomadationFaxNum);
		application.setAccoEmail(nonHotelAccomadationEmail);
		application.setAccoNoOfEmp(nonHotelAccomadationEmployeesNum);
		application.setAccoOfferedType(nonHotelAccomadationTypeOffered);
		application.setNoOfRooms(nonHotelAccomadationRoomNum);
		application.setOwnerName(nonHotelAccomadationOwnerName);
		application.setOwnerAddress(nonHotelAccomadationAddressOwner);
		application.setOwnerTeleNo(nonHotelAccomadationTelNo);
		application.setOwnerFaxNo(nonHotelAccomadationFaxNumber);
		application.setOperCompName(nonHotelAccomadationCompanyName);
		application.setOperAddress(nonHotelAccomadationAddressCompany);
		application.setManagerName(nonHotelAccomadationManagerName);
		application.setManagerAddress(nonHotelAccomadationAddressManager);
		application.setManagerTeleNo(nonHotelAccomadationManagerTel);
		application.setManagerFaxNo(nonHotelAccomadationManagerFax);
		application.setManagerEmail(nonHotelAccomadationManagerEmail);
		application.setJtbApplicationId(jtbApplicationId);
		AccoNonHotelLicenceLocalServiceUtil.updateAccoNonHotelLicence(application);
		return false;
	}

}
