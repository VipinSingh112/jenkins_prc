package com.nbp.user.dashboard.portlet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.commons.util.api.CommonsUtil;
import com.nbp.user.dashboard.constants.UserDashboardPortletKeys;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author hp
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=UserDashboard",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UserDashboardPortletKeys.USERDASHBOARD,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class UserDashboardPortlet extends MVCPortlet {
	Log _log = LogFactoryUtil.getLog(UserDashboardPortlet.class.getName());
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		renderRequest.setAttribute("Cannabis",commonsUtil.checkUserRoles(themeDisplay, "CLA - Cannabis"));
		renderRequest.setAttribute("Crown Lands",commonsUtil.checkUserRoles(themeDisplay, "NLA- (Crown Lands)"));
		renderRequest.setAttribute("Tourism",commonsUtil.checkUserRoles(themeDisplay, "MOT (Tourism)"));
		renderRequest.setAttribute("PIR",commonsUtil.checkUserRoles(themeDisplay, "MoHW (PIR)"));
		renderRequest.setAttribute("Pharmaceutical",commonsUtil.checkUserRoles(themeDisplay, "MoHW (Pharmaceutical)"));
		renderRequest.setAttribute("Film",commonsUtil.checkUserRoles(themeDisplay, "Film Registration"));
		renderRequest.setAttribute("Manufacturing",commonsUtil.checkUserRoles(themeDisplay, "MIIC (Manufacturing)"));
		renderRequest.setAttribute("CreativeEntertainment",commonsUtil.checkUserRoles(themeDisplay, "MCGES (Creative/Entertainment)"));
		renderRequest.setAttribute("SuperAdmin",commonsUtil.checkUserRoles(themeDisplay, "Administrator"));
		renderRequest.setAttribute("SEZ Status",commonsUtil.checkUserRoles(themeDisplay, "JSEZA (SEZ Status)"));
		/*
		 * renderRequest.setAttribute("Fire Brigade",commonsUtil.checkUserRoles(
		 * themeDisplay, "Fire Brigade"));
		 */
		super.render(renderRequest, renderResponse);
	}
	
	@Reference
	private CommonsUtil commonsUtil;
}