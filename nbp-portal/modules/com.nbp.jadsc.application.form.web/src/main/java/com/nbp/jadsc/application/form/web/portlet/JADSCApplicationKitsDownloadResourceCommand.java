package com.nbp.jadsc.application.form.web.portlet;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.nbp.jadsc.application.documents.util.JADSCApplicationKitDocuments;
import com.nbp.jadsc.application.form.web.constants.JADSCApplicationFormPortletKeys;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + JADSCApplicationFormPortletKeys.JADSCAPPLICATIONFORM,
		"mvc.command.name=jadsc/application/kits/documents/url" }, service = MVCResourceCommand.class)
public class JADSCApplicationKitsDownloadResourceCommand implements MVCResourceCommand {
	private static Log _log = LogFactoryUtil.getLog(JADSCApplicationKitsDownloadResourceCommand.class.getName());

	@Override
	public boolean serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws PortletException {
		JSONObject jsonFeed = JSONFactoryUtil.createJSONObject();
		JSONObject jsonOBJ = JSONFactoryUtil.createJSONObject();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);

		_log.info("Setting JADSC Application Kits Document Download URI Initiated");
		String applciationKitUrl = JADSCApplicationKitDocuments
				.getApplciationKitDownloadUrl(themeDisplay.getScopeGroupId(), "Application Kit", themeDisplay);
		jsonOBJ.put("applicationKitUrl", applciationKitUrl);

		String handBookUrl = JADSCApplicationKitDocuments.getApplciationKitDownloadUrl(themeDisplay.getScopeGroupId(),
				"Hand Book", themeDisplay);
		jsonOBJ.put("handBookUrl", handBookUrl);

		String tradeRemedyGuideUrl = JADSCApplicationKitDocuments
				.getApplciationKitDownloadUrl(themeDisplay.getScopeGroupId(), "Trade Remedy Guide", themeDisplay);
		jsonOBJ.put("tradeRemedyGuideUrl", tradeRemedyGuideUrl);

		String supplementUrl = JADSCApplicationKitDocuments.getApplciationKitDownloadUrl(themeDisplay.getScopeGroupId(),
				"Supplement", themeDisplay);
		jsonOBJ.put("supplementUrl", supplementUrl);

		String dumpingAndSubsidiesUrl = JADSCApplicationKitDocuments
				.getApplciationKitDownloadUrl(themeDisplay.getScopeGroupId(), "Dumping And Subsidies", themeDisplay);
		jsonOBJ.put("dumpingAndSubsidiesUrl", dumpingAndSubsidiesUrl);

		jsonFeed.put("APP_DATA", jsonOBJ);
		resourceResponse.setContentType("application/json");
		try {
			resourceResponse.getWriter().write(jsonFeed.toString());
		} catch (IOException e) {
		}

		_log.info("Setting JADSC Application Kits Document Download URI Completed");

		return false;
	}

}
