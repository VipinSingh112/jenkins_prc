package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.jadsc.application.form.service.model.JADSCChecklistAdd;
import com.nbp.jadsc.application.form.service.service.JADSCChecklistAddLocalServiceUtil;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
			"mvc.command.name=/add/Checklist/Detail/Data",
		},
		service = MVCResourceCommand.class
	)
public class AddCheckListItemResourceCommand implements MVCResourceCommand {
	private static Log _log=LogFactoryUtil.getLog(AddCheckListItemResourceCommand.class.getName());
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
				JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
				JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
				String checklistItem = ParamUtil.getString(resourceRequest, "checklistItem");
				String counterChecklistVal=ParamUtil.getString(resourceRequest, "counterChecklistVal");
				
				long jadscApplicationId=ParamUtil.getLong(resourceRequest, "jadscApplicationId");
				long checklistItemId = ParamUtil.getLong(resourceRequest, "checklistItemId");
				
				JADSCChecklistAdd jadscChecklistadd=null;
				
				try {
					jadscChecklistadd =JADSCChecklistAddLocalServiceUtil.getJADSCChecklistAdd(checklistItemId);
				} catch (Exception e) {
				}
				 if(jadscChecklistadd==null) {
					 jadscChecklistadd= JADSCChecklistAddLocalServiceUtil.createJADSCChecklistAdd(CounterLocalServiceUtil.increment());
					
					 jadscChecklistadd.setCounter(counterChecklistVal);
					 
					  }
				 jadscChecklistadd.setAddItem(checklistItem);
				 jadscChecklistadd.setJadscApplicationId(jadscApplicationId);
				 JADSCChecklistAddLocalServiceUtil.updateJADSCChecklistAdd(jadscChecklistadd);
				
				
				
				 jsonOBJ.put("checklistItemId", jadscChecklistadd.getJADSCChecklistAddId());
					jsonOBJ.put("counter", jadscChecklistadd.getCounter());
					jsonFeed.put("APP_DATA", jsonOBJ);
					resourceResponse.setContentType("application/json");
					try {
						resourceResponse.getWriter().write(jsonFeed.toString());
					} catch (Exception e) {
						_log.error("An Error Occured", e);
					}
				return false;
		}
	}
	


