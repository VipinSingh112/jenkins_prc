package com.agriculture.remote.services.internal.graphql.mutation.v1_0;

import com.agriculture.remote.services.dto.v1_0.AgricultureApplicationInspection;
import com.agriculture.remote.services.dto.v1_0.AgricultureApplicationPermit;
import com.agriculture.remote.services.dto.v1_0.AgricultureApplicationStages;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationInspectionResource;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationPermitResource;
import com.agriculture.remote.services.resource.v1_0.AgricultureApplicationStagesResource;

import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.multipart.MultipartBody;

import java.util.Date;
import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author Yogesh Chandra
 * @generated
 */
@Generated("")
public class Mutation {

	public static void
		setAgricultureApplicationInspectionResourceComponentServiceObjects(
			ComponentServiceObjects<AgricultureApplicationInspectionResource>
				agricultureApplicationInspectionResourceComponentServiceObjects) {

		_agricultureApplicationInspectionResourceComponentServiceObjects =
			agricultureApplicationInspectionResourceComponentServiceObjects;
	}

	public static void
		setAgricultureApplicationPermitResourceComponentServiceObjects(
			ComponentServiceObjects<AgricultureApplicationPermitResource>
				agricultureApplicationPermitResourceComponentServiceObjects) {

		_agricultureApplicationPermitResourceComponentServiceObjects =
			agricultureApplicationPermitResourceComponentServiceObjects;
	}

	public static void
		setAgricultureApplicationStagesResourceComponentServiceObjects(
			ComponentServiceObjects<AgricultureApplicationStagesResource>
				agricultureApplicationStagesResourceComponentServiceObjects) {

		_agricultureApplicationStagesResourceComponentServiceObjects =
			agricultureApplicationStagesResourceComponentServiceObjects;
	}

	@GraphQLField(description = "Update a new Agriculture application stage.")
	public AgricultureApplicationInspection
			updateAgricultureApplicationInspection(
				@GraphQLName("agricultureApplicationInspection")
					AgricultureApplicationInspection
						agricultureApplicationInspection)
		throws Exception {

		return _applyComponentServiceObjects(
			_agricultureApplicationInspectionResourceComponentServiceObjects,
			this::_populateResourceContext,
			agricultureApplicationInspectionResource ->
				agricultureApplicationInspectionResource.
					updateAgricultureApplicationInspection(
						agricultureApplicationInspection));
	}

	@GraphQLField(description = "Update agriculture condtional license")
	@GraphQLName(
		description = "Update agriculture condtional license",
		value = "updateAgricultureApplicationPermitCaseIdPirPermtNumberDateofIssueDateOfExpirationDurationOfPermitMultipartBody"
	)
	public AgricultureApplicationPermit updateAgricultureApplicationPermit(
			@GraphQLName("caseId") String caseId,
			@GraphQLName("pirPermtNumber") String pirPermtNumber,
			@GraphQLName("dateofIssue") Date dateofIssue,
			@GraphQLName("dateOfExpiration") Date dateOfExpiration,
			@GraphQLName("durationOfPermit") String durationOfPermit,
			@GraphQLName("multipartBody") MultipartBody multipartBody)
		throws Exception {

		return _applyComponentServiceObjects(
			_agricultureApplicationPermitResourceComponentServiceObjects,
			this::_populateResourceContext,
			agricultureApplicationPermitResource ->
				agricultureApplicationPermitResource.
					updateAgricultureApplicationPermit(
						caseId, pirPermtNumber, dateofIssue, dateOfExpiration,
						durationOfPermit, multipartBody));
	}

	@GraphQLField(description = "Update a new Agriculture application stage.")
	public AgricultureApplicationStages updateAgricultureApplicationStage(
			@GraphQLName("agricultureApplicationStages")
				AgricultureApplicationStages agricultureApplicationStages)
		throws Exception {

		return _applyComponentServiceObjects(
			_agricultureApplicationStagesResourceComponentServiceObjects,
			this::_populateResourceContext,
			agricultureApplicationStagesResource ->
				agricultureApplicationStagesResource.
					updateAgricultureApplicationStage(
						agricultureApplicationStages));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			AgricultureApplicationInspectionResource
				agricultureApplicationInspectionResource)
		throws Exception {

		agricultureApplicationInspectionResource.setContextAcceptLanguage(
			_acceptLanguage);
		agricultureApplicationInspectionResource.setContextCompany(_company);
		agricultureApplicationInspectionResource.setContextHttpServletRequest(
			_httpServletRequest);
		agricultureApplicationInspectionResource.setContextHttpServletResponse(
			_httpServletResponse);
		agricultureApplicationInspectionResource.setContextUriInfo(_uriInfo);
		agricultureApplicationInspectionResource.setContextUser(_user);
		agricultureApplicationInspectionResource.setGroupLocalService(
			_groupLocalService);
		agricultureApplicationInspectionResource.setRoleLocalService(
			_roleLocalService);
	}

	private void _populateResourceContext(
			AgricultureApplicationPermitResource
				agricultureApplicationPermitResource)
		throws Exception {

		agricultureApplicationPermitResource.setContextAcceptLanguage(
			_acceptLanguage);
		agricultureApplicationPermitResource.setContextCompany(_company);
		agricultureApplicationPermitResource.setContextHttpServletRequest(
			_httpServletRequest);
		agricultureApplicationPermitResource.setContextHttpServletResponse(
			_httpServletResponse);
		agricultureApplicationPermitResource.setContextUriInfo(_uriInfo);
		agricultureApplicationPermitResource.setContextUser(_user);
		agricultureApplicationPermitResource.setGroupLocalService(
			_groupLocalService);
		agricultureApplicationPermitResource.setRoleLocalService(
			_roleLocalService);
	}

	private void _populateResourceContext(
			AgricultureApplicationStagesResource
				agricultureApplicationStagesResource)
		throws Exception {

		agricultureApplicationStagesResource.setContextAcceptLanguage(
			_acceptLanguage);
		agricultureApplicationStagesResource.setContextCompany(_company);
		agricultureApplicationStagesResource.setContextHttpServletRequest(
			_httpServletRequest);
		agricultureApplicationStagesResource.setContextHttpServletResponse(
			_httpServletResponse);
		agricultureApplicationStagesResource.setContextUriInfo(_uriInfo);
		agricultureApplicationStagesResource.setContextUser(_user);
		agricultureApplicationStagesResource.setGroupLocalService(
			_groupLocalService);
		agricultureApplicationStagesResource.setRoleLocalService(
			_roleLocalService);
	}

	private static ComponentServiceObjects
		<AgricultureApplicationInspectionResource>
			_agricultureApplicationInspectionResourceComponentServiceObjects;
	private static ComponentServiceObjects<AgricultureApplicationPermitResource>
		_agricultureApplicationPermitResourceComponentServiceObjects;
	private static ComponentServiceObjects<AgricultureApplicationStagesResource>
		_agricultureApplicationStagesResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}