package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;
import com.nbp.ncbj.application.form.service.service.NcbjSectionThreeLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;


@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/activities/process/list/info" 
		},service = MVCResourceCommand.class)

public class NcbjActivitiesProcessesListResourceCommand implements MVCResourceCommand{
	private static Log _log = LogFactoryUtil.getLog(NcbjActivitiesProcessesListResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		String transferReasonList = ParamUtil.getString(resourceRequest, "transferReasonList");
		String processActivityDescription = ParamUtil.getString(resourceRequest, "processActivityDescription");
		String incomingMaterialsDescription = ParamUtil.getString(resourceRequest, "incomingMaterialsDescription");
		String processesDescription = ParamUtil.getString(resourceRequest, "processesDescription");
	    String explainActivity = ParamUtil.getString(resourceRequest, "explainActivity");
	    String categoryOne = ParamUtil.getString(resourceRequest, "categoryOne");
//	    String categoryTwo = ParamUtil.getString(resourceRequest, "categoryTwo");
//	    String categoryThree = ParamUtil.getString(resourceRequest, "categoryThree");
//	    String categoryFour = ParamUtil.getString(resourceRequest, "categoryFour");
		long ncbjApplicationId=ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		
		NcbjSectionThree sectionThree=null;
		try {
			sectionThree= NcbjSectionThreeLocalServiceUtil.getNCBJByAppId(ncbjApplicationId);
		} catch (Exception e) {
			// TODO: handle exception
		}
		  if(sectionThree==null) {
			  sectionThree=NcbjSectionThreeLocalServiceUtil.createNcbjSectionThree(CounterLocalServiceUtil.increment());
		  }
		  sectionThree.setProcessActivitiesList(transferReasonList);
		  sectionThree.setIncomingMaterialsDes(incomingMaterialsDescription);
		  sectionThree.setExplainationBox(explainActivity);
		  sectionThree.setCategoryOne(categoryOne);
		  sectionThree.setProcessActivityDescription(processActivityDescription);
		  sectionThree.setProcessDescription(processesDescription);
//		  sectionThree.setCategoryTwo(categoryTwo);
//		  sectionThree.setCategoryThree(categoryThree);
//		  sectionThree.setCategoryFour(categoryFour);
		  sectionThree.setNcbjApplicationId(ncbjApplicationId);
		  NcbjSectionThreeLocalServiceUtil.updateNcbjSectionThree(sectionThree);
		 
		// TODO Auto-generated method stub
		return false;
	}

}
