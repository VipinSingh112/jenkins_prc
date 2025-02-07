package com.nbp.sez.status.application.form.web.portlet;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.util.ParamUtil;
import com.nbp.sez.status.application.form.service.model.SezStatusWFMLocationAdd;
import com.nbp.sez.status.application.form.service.service.SezStatusWFMLocationAddLocalServiceUtil;
import com.nbp.sez.status.application.form.web.constants.SezStatusApplicationFormPortletKeys;
import org.osgi.service.component.annotations.Component;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

@Component(immediate = true, property = {
        "javax.portlet.name=" + SezStatusApplicationFormPortletKeys.SEZSTATUSAPPLICATIONFORM,
        "mvc.command.name=/wfm/location/info/save/url" }, service = MVCResourceCommand.class)
public class SezStatusWFMLocationAddInfo implements  MVCResourceCommand {
    private  static Log _log= LogFactoryUtil.getLog(SezStatusWFMLocationAddInfo.class.getName());
    @Override
    public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException {
        _log.info("****************Saving Wfm Data***********************");
        String controlNumber= ParamUtil.getString(resourceRequest,"controlNumber");
        String location= ParamUtil.getString(resourceRequest,"location");
        String controlNumberParishWfh= ParamUtil.getString(resourceRequest,"controlNumberParishWfh");
        long applicationId=ParamUtil.getLong(resourceRequest,"applicationId");
        long wfmAppId=ParamUtil.getLong(resourceRequest,"");

        SezStatusWFMLocationAdd addressOfLocation=null;
        try {
            addressOfLocation= SezStatusWFMLocationAddLocalServiceUtil.getSezStatusWFMLocationAdd(wfmAppId);
        }catch (Exception e){}
        if(addressOfLocation==null)
            addressOfLocation=SezStatusWFMLocationAddLocalServiceUtil.createSezStatusWFMLocationAdd(CounterLocalServiceUtil.increment());
        _log.info("****************Saving Wfm Created***********************");
        addressOfLocation.setControlNumber(controlNumber);
        addressOfLocation.setParish(controlNumberParishWfh);
        addressOfLocation.setLocation(location);
        addressOfLocation.setSezStatusApplicationId(applicationId);
        SezStatusWFMLocationAddLocalServiceUtil.updateSezStatusWFMLocationAdd(addressOfLocation);
        _log.info("****************Saving Wfm Updated***********************");

        return false;
    }
}
