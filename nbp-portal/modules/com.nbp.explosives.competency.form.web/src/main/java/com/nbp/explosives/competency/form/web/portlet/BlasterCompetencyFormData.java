package com.nbp.explosives.competency.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.explosives.competency.application.form.service.model.BlasterCompetencyForm;
import com.nbp.explosives.competency.application.form.service.service.BlasterCompetencyFormLocalServiceUtil;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + ExplosivesCompetencyApplicationFormPortletKeys.EXPLOSIVESCOMPETENCYAPPLICATIONFORM,
		"mvc.command.name=blaster/detail/Info" 
},
service = MVCResourceCommand.class)
public class BlasterCompetencyFormData implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(BlasterCompetencyFormData.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		String blasterSurname=ParamUtil.getString(resourceRequest, "blasterSurname");
		String blasterFistName=ParamUtil.getString(resourceRequest, "blasterFistName");
		String blasterMiddleName=ParamUtil.getString(resourceRequest, "blasterMiddleName");
		String blasterGender=ParamUtil.getString(resourceRequest, "blasterGender");
		String blasterOfficeNumber=ParamUtil.getString(resourceRequest, "blasterOfficeNumber");
		String blasterCellNumber=ParamUtil.getString(resourceRequest, "blasterCellNumber");
		String blasterTrnNumber=ParamUtil.getString(resourceRequest, "blasterTrnNumber");
		String blasterAddress=ParamUtil.getString(resourceRequest, "blasterAddress");
		String blasterDob=ParamUtil.getString(resourceRequest, "blasterDob");
		String selectedEducBackString=ParamUtil.getString(resourceRequest, "selectedEducBackString");
		String blasterCourseParticipated=ParamUtil.getString(resourceRequest, "blasterCourseParticipated");
		String blasterState=ParamUtil.getString(resourceRequest, "blasterState");
		String blasterCourseName=ParamUtil.getString(resourceRequest, "blasterCourseName");
		String blasterOrganizer=ParamUtil.getString(resourceRequest, "blasterOrganizer");
		String blasterDate=ParamUtil.getString(resourceRequest, "blasterDate");
		long explosivesApplicationId=ParamUtil.getLong(resourceRequest, "explosivesApplicationId");
		
		BlasterCompetencyForm blaster=null;
		
		try {
			blaster= BlasterCompetencyFormLocalServiceUtil.getExplosiveById(explosivesApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  if(blaster==null) {
			  blaster=BlasterCompetencyFormLocalServiceUtil.createBlasterCompetencyForm(CounterLocalServiceUtil.increment());
		  }
		  
		  blaster.setSurName(blasterSurname);
		  blaster.setFirstName(blasterFistName);
		  blaster.setMiddleName(blasterMiddleName);
		  blaster.setGender(blasterGender);
		  blaster.setOfficeNumber(blasterOfficeNumber);
		  blaster.setCellNum(blasterCellNumber);
		  blaster.setTrnNum(blasterTrnNumber);
		  blaster.setAddress(blasterAddress);
		  try {
				if (Validator.isNotNull(blasterDob)) {
					  blaster.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse(blasterDob));
				}
			} catch (Exception e) {
			}
		  
		  blaster.setEducationalBack(selectedEducBackString);
		  blaster.setBlastingCourse(blasterCourseParticipated);
		  blaster.setState(blasterState);
		  blaster.setNameOfCourse(blasterCourseName);
		  blaster.setCourseOrganiser(blasterOrganizer);
		  try {
				if (Validator.isNotNull(blasterDate)) {
					  blaster.setDateAppli(new SimpleDateFormat("yyyy-MM-dd").parse(blasterDate));
				}
			} catch (Exception e) {
			}
		  blaster.setExplosivesApplicationId(explosivesApplicationId);
		  BlasterCompetencyFormLocalServiceUtil.updateBlasterCompetencyForm(blaster);

		  return false;
	}
}
