package com.nbp.explosives.competency.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.nbp.explosives.competency.application.form.service.model.PyrotechnicCompetencyForm;
import com.nbp.explosives.competency.application.form.service.service.PyrotechnicCompetencyFormLocalServiceUtil;
import com.nbp.explosives.competency.form.web.constants.ExplosivesCompetencyApplicationFormPortletKeys;

import java.text.SimpleDateFormat;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = {
		"javax.portlet.name=" + ExplosivesCompetencyApplicationFormPortletKeys.EXPLOSIVESCOMPETENCYAPPLICATIONFORM,
		"mvc.command.name=pyrotechnic/detail/Info" 
},
service = MVCResourceCommand.class)

public class PyroTechniqueFormData implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(BlasterCompetencyFormData.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		
		String pyrotechnicSurname=ParamUtil.getString(resourceRequest, "pyrotechnicSurname");
		String pyrotechnicFistName=ParamUtil.getString(resourceRequest, "pyrotechnicFistName");
		String pyrotechnicMiddleName=ParamUtil.getString(resourceRequest, "pyrotechnicMiddleName");
		String pyrotechnicGender=ParamUtil.getString(resourceRequest, "pyrotechnicGender");
		String pyrotechnicOfficeNumber=ParamUtil.getString(resourceRequest, "pyrotechnicOfficeNumber");
		String pyrotechnicCellNumber=ParamUtil.getString(resourceRequest, "pyrotechnicCellNumber");
		String pyrotechnicTrnNumber=ParamUtil.getString(resourceRequest, "pyrotechnicTrnNumber");
		String pyrotechnicAddress=ParamUtil.getString(resourceRequest, "pyrotechnicAddress");
		String pyrotechnicDob=ParamUtil.getString(resourceRequest, "pyrotechnicDob");
		String selectedPyrotechnicEducBackArrayString=ParamUtil.getString(resourceRequest, "selectedPyrotechnicEducBackArrayString");
		String pyrotechnicCourseParticipated=ParamUtil.getString(resourceRequest, "pyrotechnicCourseParticipated");
		String pyrotechnicState=ParamUtil.getString(resourceRequest, "pyrotechnicState");
		String pyrotechnicCoursename=ParamUtil.getString(resourceRequest, "pyrotechnicCoursename");
		String pyrotechnicOrganizer=ParamUtil.getString(resourceRequest, "pyrotechnicOrganizer");
		String pyrotechnicDate=ParamUtil.getString(resourceRequest, "pyrotechnicDate");
		long explosivesApplicationId=ParamUtil.getLong(resourceRequest, "explosivesApplicationId");
		
		PyrotechnicCompetencyForm pyrotechnique=null;
		
		try {
			pyrotechnique= PyrotechnicCompetencyFormLocalServiceUtil.getExplosiveById(explosivesApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  if(pyrotechnique==null) {
			  pyrotechnique=PyrotechnicCompetencyFormLocalServiceUtil.createPyrotechnicCompetencyForm(CounterLocalServiceUtil.increment());
		  }
		  
		  pyrotechnique.setSurNamePyro(pyrotechnicSurname);
		  pyrotechnique.setFirstNamePyro(pyrotechnicFistName);
		  pyrotechnique.setMiddleNamePyro(pyrotechnicMiddleName);
		  pyrotechnique.setGenderPyro(pyrotechnicGender);
		  pyrotechnique.setOfficeNumberPyro(pyrotechnicOfficeNumber);
		  pyrotechnique.setCellNumPyro(pyrotechnicCellNumber);
		  pyrotechnique.setTrnNumPyro(pyrotechnicTrnNumber);
		  pyrotechnique.setAddressPyro(pyrotechnicAddress);
		  try {
				if (Validator.isNotNull(pyrotechnicDob)) {
					  pyrotechnique.setDateOfBirthPyro(new SimpleDateFormat("yyyy-MM-dd").parse(pyrotechnicDob));
				}
			} catch (Exception e) {
			}
		  
		  pyrotechnique.setEducationalBackPyro(selectedPyrotechnicEducBackArrayString);
		  pyrotechnique.setBlastingCoursePyro(pyrotechnicCourseParticipated);
		  pyrotechnique.setStatePyro(pyrotechnicState);
		  pyrotechnique.setNameOfCoursePyro(pyrotechnicCoursename);
		  pyrotechnique.setCourseOrganiserPyro(pyrotechnicOrganizer);
		  pyrotechnique.setDateAppliPyro(pyrotechnicDate);
		  pyrotechnique.setExplosivesApplicationId(explosivesApplicationId);
		  PyrotechnicCompetencyFormLocalServiceUtil.updatePyrotechnicCompetencyForm(pyrotechnique);

		  return false;
	}
}
