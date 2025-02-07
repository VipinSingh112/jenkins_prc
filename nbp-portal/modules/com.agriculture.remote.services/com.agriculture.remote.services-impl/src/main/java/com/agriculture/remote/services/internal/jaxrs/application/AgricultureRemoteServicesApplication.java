package com.agriculture.remote.services.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author Yogesh Chandra
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false",
		"osgi.jaxrs.application.base=/headless-agriculture-app",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=AgricultureRemoteServices"
	},
	service = Application.class
)
@Generated("")
public class AgricultureRemoteServicesApplication extends Application {
}