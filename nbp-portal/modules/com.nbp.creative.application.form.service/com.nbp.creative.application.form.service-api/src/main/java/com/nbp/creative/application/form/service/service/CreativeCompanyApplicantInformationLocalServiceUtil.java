/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeCompanyApplicantInformation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreativeCompanyApplicantInformation. This utility wraps
 * <code>com.nbp.creative.application.form.service.service.impl.CreativeCompanyApplicantInformationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyApplicantInformationLocalService
 * @generated
 */
public class CreativeCompanyApplicantInformationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.creative.application.form.service.service.impl.CreativeCompanyApplicantInformationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the creative company applicant information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyApplicantInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 * @return the creative company applicant information that was added
	 */
	public static CreativeCompanyApplicantInformation
		addCreativeCompanyApplicantInformation(
			CreativeCompanyApplicantInformation
				creativeCompanyApplicantInformation) {

		return getService().addCreativeCompanyApplicantInformation(
			creativeCompanyApplicantInformation);
	}

	/**
	 * Creates a new creative company applicant information with the primary key. Does not add the creative company applicant information to the database.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key for the new creative company applicant information
	 * @return the new creative company applicant information
	 */
	public static CreativeCompanyApplicantInformation
		createCreativeCompanyApplicantInformation(
			long creativeCompanyApplicantInfoId) {

		return getService().createCreativeCompanyApplicantInformation(
			creativeCompanyApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the creative company applicant information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyApplicantInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 * @return the creative company applicant information that was removed
	 */
	public static CreativeCompanyApplicantInformation
		deleteCreativeCompanyApplicantInformation(
			CreativeCompanyApplicantInformation
				creativeCompanyApplicantInformation) {

		return getService().deleteCreativeCompanyApplicantInformation(
			creativeCompanyApplicantInformation);
	}

	/**
	 * Deletes the creative company applicant information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyApplicantInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information that was removed
	 * @throws PortalException if a creative company applicant information with the primary key could not be found
	 */
	public static CreativeCompanyApplicantInformation
			deleteCreativeCompanyApplicantInformation(
				long creativeCompanyApplicantInfoId)
		throws PortalException {

		return getService().deleteCreativeCompanyApplicantInformation(
			creativeCompanyApplicantInfoId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static CreativeCompanyApplicantInformation
		fetchCreativeCompanyApplicantInformation(
			long creativeCompanyApplicantInfoId) {

		return getService().fetchCreativeCompanyApplicantInformation(
			creativeCompanyApplicantInfoId);
	}

	public static CreativeCompanyApplicantInformation findBygetCreativeById(
		long creativeApplicationId) {

		return getService().findBygetCreativeById(creativeApplicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CreativeCompanyApplicantInformation getCreativeById(
		long creativeApplicationId) {

		return getService().getCreativeById(creativeApplicationId);
	}

	/**
	 * Returns the creative company applicant information with the primary key.
	 *
	 * @param creativeCompanyApplicantInfoId the primary key of the creative company applicant information
	 * @return the creative company applicant information
	 * @throws PortalException if a creative company applicant information with the primary key could not be found
	 */
	public static CreativeCompanyApplicantInformation
			getCreativeCompanyApplicantInformation(
				long creativeCompanyApplicantInfoId)
		throws PortalException {

		return getService().getCreativeCompanyApplicantInformation(
			creativeCompanyApplicantInfoId);
	}

	/**
	 * Returns a range of all the creative company applicant informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyApplicantInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company applicant informations
	 * @param end the upper bound of the range of creative company applicant informations (not inclusive)
	 * @return the range of creative company applicant informations
	 */
	public static List<CreativeCompanyApplicantInformation>
		getCreativeCompanyApplicantInformations(int start, int end) {

		return getService().getCreativeCompanyApplicantInformations(start, end);
	}

	/**
	 * Returns the number of creative company applicant informations.
	 *
	 * @return the number of creative company applicant informations
	 */
	public static int getCreativeCompanyApplicantInformationsCount() {
		return getService().getCreativeCompanyApplicantInformationsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the creative company applicant information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyApplicantInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyApplicantInformation the creative company applicant information
	 * @return the creative company applicant information that was updated
	 */
	public static CreativeCompanyApplicantInformation
		updateCreativeCompanyApplicantInformation(
			CreativeCompanyApplicantInformation
				creativeCompanyApplicantInformation) {

		return getService().updateCreativeCompanyApplicantInformation(
			creativeCompanyApplicantInformation);
	}

	public static CreativeCompanyApplicantInformationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<CreativeCompanyApplicantInformationLocalService> _serviceSnapshot =
			new Snapshot<>(
				CreativeCompanyApplicantInformationLocalServiceUtil.class,
				CreativeCompanyApplicantInformationLocalService.class);

}