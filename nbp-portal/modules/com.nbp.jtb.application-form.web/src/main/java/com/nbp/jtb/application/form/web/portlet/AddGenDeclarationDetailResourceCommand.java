package com.nbp.jtb.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.jtb.application.form.service.model.AccoGenDeclaration;
import com.nbp.jtb.application.form.service.service.AccoGenDeclarationLocalServiceUtil;
import com.nbp.jtb.application.form.web.constants.JTBApplicationFormWebPortletKeys;
import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + JTBApplicationFormWebPortletKeys.JTBAPPLICATIONFORMWEB,
		"mvc.command.name=/add/acco/gen/dec" }, service = MVCResourceCommand.class)
public class AddGenDeclarationDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(AddHotelLicenceDetailResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("[Adding accomodation general declaration info");
		long jtbApplicationId = ParamUtil.getLong(resourceRequest, "jtbApplicationId");
		String newAccomadationHotelBedroom = ParamUtil.getString(resourceRequest, "newAccomadationHotelBedroom");
		String accomadationHotelOwner = ParamUtil.getString(resourceRequest, "accomadationHotelOwner");
		String newAccomadationHotelAddress = ParamUtil.getString(resourceRequest, "newAccomadationHotelAddress");
		String accomadationHotelLaws = ParamUtil.getString(resourceRequest, "accomadationHotelLaws");
		String newAccomadationDateCom = ParamUtil.getString(resourceRequest, "newAccomadationDateCom");// date
		String newAccomadationHotelOperator = ParamUtil.getString(resourceRequest, "newAccomadationHotelOperator");
		String newHotelAccomadationAddress = ParamUtil.getString(resourceRequest, "newHotelAccomadationAddress");
		String newAccomadationHotelCompanylaws = ParamUtil.getString(resourceRequest,
				"newAccomadationHotelCompanylaws");
		String newAccomadationHotelOperatorName = ParamUtil.getString(resourceRequest,
				"newAccomadationHotelOperatorName");
		String newAccomadationDateHotel = ParamUtil.getString(resourceRequest, "newAccomadationDateHotel");// date
		String newAccomadationDate = ParamUtil.getString(resourceRequest, "newAccomadationDate");// date
		String newAccomadationHotelFinance = ParamUtil.getString(resourceRequest, "newAccomadationHotelFinance");
		String newAccomadationHotelEmployeesNo = ParamUtil.getString(resourceRequest,
				"newAccomadationHotelEmployeesNo");
		String newAccomadationSignDate = ParamUtil.getString(resourceRequest, "newAccomadationSignDate");// date
		String newAccomadationHotelOperatorDate = ParamUtil.getString(resourceRequest, "newAccomadationHotelOperatorDate");// date
		String newAccomadationHotelManager = ParamUtil.getString(resourceRequest, "newAccomadationHotelManager");
		AccoGenDeclaration application = null;
		try {
			application = AccoGenDeclarationLocalServiceUtil.getJTB_ByApplicationId(jtbApplicationId);
		} catch (Exception e) {
		}
		if (Validator.isNull(application)) {
			application = AccoGenDeclarationLocalServiceUtil.createAccoGenDeclaration(
					CounterLocalServiceUtil.increment());
		}
		application.setNoOfBedroom(newAccomadationHotelBedroom);
		application.setOwnerOfHotel(accomadationHotelOwner);
		application.setAddressOne(newAccomadationHotelAddress);
		application.setCompIncorporatedOne(accomadationHotelLaws);
		if (Validator.isNotNull(newAccomadationDateCom)) {
			try {
				application.setCompanyDate(new SimpleDateFormat("yyyy-MM-dd").parse(newAccomadationDateCom));
			} catch (Exception e) {
			}
		}
		application.setHotelOperator(newAccomadationHotelOperator);
		application.setAddressTwo(newHotelAccomadationAddress);
		application.setCompIncorporatedTwo(newAccomadationHotelCompanylaws);
		application.setHotelOperatorName(newAccomadationHotelOperatorName);
		if (Validator.isNotNull(newAccomadationDateHotel)) {
			try {
				application.setDateTwo(new SimpleDateFormat("yyyy-MM-dd").parse(newAccomadationDateHotel));
			} catch (Exception e) {
			}
		}
		if (Validator.isNotNull(newAccomadationDate)) {
			try {
				application.setHotelIncepDate(new SimpleDateFormat("yyyy-MM-dd").parse(newAccomadationDate));
			} catch (Exception e) {
			}
		}
		application.setFinanceOfOper(newAccomadationHotelFinance);
		application.setNoOfEmployee(newAccomadationHotelEmployeesNo);
		if (Validator.isNotNull(newAccomadationSignDate)) {
			try {
				application.setSignatureDate(new SimpleDateFormat("yyyy-MM-dd").parse(newAccomadationSignDate));
			} catch (Exception e) {
			}
		}
		try {
			application.setHotelOperatorDateSince(new SimpleDateFormat("yyyy-MM-dd").parse(newAccomadationHotelOperatorDate));
		} catch (Exception e) {
		}
		application.setNameOfManager(newAccomadationHotelManager);
		application.setJtbApplicationId(jtbApplicationId);
		AccoGenDeclarationLocalServiceUtil.updateAccoGenDeclaration(application);
		return false;
	}

}
