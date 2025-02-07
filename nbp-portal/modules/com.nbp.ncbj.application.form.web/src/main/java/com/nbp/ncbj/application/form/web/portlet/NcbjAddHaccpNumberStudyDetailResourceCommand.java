package com.nbp.ncbj.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalService;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;
import com.nbp.ncbj.application.form.service.service.NcbjSectionDetailAddLocalServiceUtil;
import com.nbp.ncbj.application.form.web.constants.NCBJApplicationFormPortletKeys;
import com.nbp.ncbj.application.util.NCBjApplicationUtil;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(immediate = true, property = {
		"javax.portlet.name=" + NCBJApplicationFormPortletKeys.NCBJAPPLICATIONFORM,
		"mvc.command.name=/haccp/number/shift/info" 
		},service = MVCResourceCommand.class)

public class NcbjAddHaccpNumberStudyDetailResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(NcbjAddHaccpNumberStudyDetailResourceCommand.class.getName());
	
	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		_log.info("calling HACCP Resource Command");
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		long ncbjApplicationId = ParamUtil.getLong(resourceRequest, "ncbjApplicationId");
		long haccpNumberDetailId = ParamUtil.getLong(resourceRequest, "haccpNumberDetailId");
	    String haccpNumber = ParamUtil.getString(resourceRequest, "haccpNumber");
	    String haccpType = ParamUtil.getString(resourceRequest, "haccpType");
		String counter = ParamUtil.getString(resourceRequest, "counter");
		NcbjSectionDetailAdd haccpStudy = null;
			try {
				haccpStudy = NcbjSectionDetailAddLocalServiceUtil.getNcbjSectionDetailAdd(haccpNumberDetailId);
			} catch (PortalException e) {}
		if(haccpStudy==null) {
			haccpStudy = NcbjSectionDetailAddLocalServiceUtil.createNcbjSectionDetailAdd(
					CounterLocalServiceUtil.increment());
			haccpStudy.setCounter(counter);
		}
        haccpStudy.setAddNumHaccp(haccpNumber);
        haccpStudy.setAddTypeHaccp(haccpType);
		haccpStudy.setNcbjApplicationId(ncbjApplicationId);
		NcbjSectionDetailAddLocalServiceUtil.updateNcbjSectionDetailAdd(haccpStudy);
		jsonOBJ.put("haccpNumberDetailId", haccpStudy.getNcbjSectionDetailAddId());
		jsonOBJ.put("counter", counter);
		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
			_log.error("An Error Has Occured", e);
		 }
		return false;
	}

@Reference
DLAppLocalService _dlAppLocalService;
}
