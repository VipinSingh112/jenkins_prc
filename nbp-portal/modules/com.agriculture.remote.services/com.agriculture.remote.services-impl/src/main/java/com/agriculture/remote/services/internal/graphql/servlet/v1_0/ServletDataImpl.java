package com.agriculture.remote.services.internal.graphql.servlet.v1_0;

import com.agriculture.remote.services.internal.graphql.mutation.v1_0.Mutation;
import com.agriculture.remote.services.internal.graphql.query.v1_0.Query;
import com.agriculture.remote.services.internal.resource.v1_0.AgricultureApplicationInspectionResourceImpl;
import com.agriculture.remote.services.internal.resource.v1_0.AgricultureApplicationPermitResourceImpl;
import com.agriculture.remote.services.internal.resource.v1_0.AgricultureApplicationStagesResourceImpl;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationInspectionResource;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationPermitResource;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationStagesResource;

import com.liferay.portal.kernel.util.ObjectValuePair;
import com.liferay.portal.vulcan.graphql.servlet.ServletData;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;

/**
 * @author Yogesh Chandra
 * @generated
 */
@Component(service = ServletData.class)
@Generated("")
public class ServletDataImpl implements ServletData {

	@Activate
	public void activate(BundleContext bundleContext) {
		Mutation.
			setAgricultureApplicationInspectionResourceComponentServiceObjects(
				_agricultureApplicationInspectionResourceComponentServiceObjects);
		Mutation.setAgricultureApplicationPermitResourceComponentServiceObjects(
			_agricultureApplicationPermitResourceComponentServiceObjects);
		Mutation.setAgricultureApplicationStagesResourceComponentServiceObjects(
			_agricultureApplicationStagesResourceComponentServiceObjects);
	}

	public String getApplicationName() {
		return "AgricultureRemoteServices";
	}

	@Override
	public Mutation getMutation() {
		return new Mutation();
	}

	@Override
	public String getPath() {
		return "/headless-agriculture-app-graphql/v1_0";
	}

	@Override
	public Query getQuery() {
		return new Query();
	}

	public ObjectValuePair<Class<?>, String> getResourceMethodObjectValuePair(
		String methodName, boolean mutation) {

		if (mutation) {
			return _resourceMethodObjectValuePairs.get(
				"mutation#" + methodName);
		}

		return _resourceMethodObjectValuePairs.get("query#" + methodName);
	}

	private static final Map<String, ObjectValuePair<Class<?>, String>>
		_resourceMethodObjectValuePairs =
			new HashMap<String, ObjectValuePair<Class<?>, String>>() {
				{
					put(
						"mutation#updateAgricultureApplicationInspection",
						new ObjectValuePair<>(
							AgricultureApplicationInspectionResourceImpl.class,
							"updateAgricultureApplicationInspection"));
					put(
						"mutation#updateAgricultureApplicationPermit",
						new ObjectValuePair<>(
							AgricultureApplicationPermitResourceImpl.class,
							"updateAgricultureApplicationPermit"));
					put(
						"mutation#updateAgricultureApplicationStage",
						new ObjectValuePair<>(
							AgricultureApplicationStagesResourceImpl.class,
							"updateAgricultureApplicationStage"));
				}
			};

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<AgricultureApplicationInspectionResource>
		_agricultureApplicationInspectionResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<AgricultureApplicationPermitResource>
		_agricultureApplicationPermitResourceComponentServiceObjects;

	@Reference(scope = ReferenceScope.PROTOTYPE_REQUIRED)
	private ComponentServiceObjects<AgricultureApplicationStagesResource>
		_agricultureApplicationStagesResourceComponentServiceObjects;

}