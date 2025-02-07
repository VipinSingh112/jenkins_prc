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

import com.nbp.creative.application.form.service.model.CreativeCompanyDirectorInformation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreativeCompanyDirectorInformation. This utility wraps
 * <code>com.nbp.creative.application.form.service.service.impl.CreativeCompanyDirectorInformationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyDirectorInformationLocalService
 * @generated
 */
public class CreativeCompanyDirectorInformationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.creative.application.form.service.service.impl.CreativeCompanyDirectorInformationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the creative company director information to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformation the creative company director information
	 * @return the creative company director information that was added
	 */
	public static CreativeCompanyDirectorInformation
		addCreativeCompanyDirectorInformation(
			CreativeCompanyDirectorInformation
				creativeCompanyDirectorInformation) {

		return getService().addCreativeCompanyDirectorInformation(
			creativeCompanyDirectorInformation);
	}

	/**
	 * Creates a new creative company director information with the primary key. Does not add the creative company director information to the database.
	 *
	 * @param creativeComDirectorInfoId the primary key for the new creative company director information
	 * @return the new creative company director information
	 */
	public static CreativeCompanyDirectorInformation
		createCreativeCompanyDirectorInformation(
			long creativeComDirectorInfoId) {

		return getService().createCreativeCompanyDirectorInformation(
			creativeComDirectorInfoId);
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
	 * Deletes the creative company director information from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformation the creative company director information
	 * @return the creative company director information that was removed
	 */
	public static CreativeCompanyDirectorInformation
		deleteCreativeCompanyDirectorInformation(
			CreativeCompanyDirectorInformation
				creativeCompanyDirectorInformation) {

		return getService().deleteCreativeCompanyDirectorInformation(
			creativeCompanyDirectorInformation);
	}

	/**
	 * Deletes the creative company director information with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information that was removed
	 * @throws PortalException if a creative company director information with the primary key could not be found
	 */
	public static CreativeCompanyDirectorInformation
			deleteCreativeCompanyDirectorInformation(
				long creativeComDirectorInfoId)
		throws PortalException {

		return getService().deleteCreativeCompanyDirectorInformation(
			creativeComDirectorInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationModelImpl</code>.
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

	public static CreativeCompanyDirectorInformation fetchBygetCreativeById(
		long creativeApplicationId) {

		return getService().fetchBygetCreativeById(creativeApplicationId);
	}

	public static CreativeCompanyDirectorInformation
		fetchCreativeCompanyDirectorInformation(
			long creativeComDirectorInfoId) {

		return getService().fetchCreativeCompanyDirectorInformation(
			creativeComDirectorInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CreativeCompanyDirectorInformation getCreativeById(
		long creativeApplicationId) {

		return getService().getCreativeById(creativeApplicationId);
	}

	/**
	 * Returns the creative company director information with the primary key.
	 *
	 * @param creativeComDirectorInfoId the primary key of the creative company director information
	 * @return the creative company director information
	 * @throws PortalException if a creative company director information with the primary key could not be found
	 */
	public static CreativeCompanyDirectorInformation
			getCreativeCompanyDirectorInformation(
				long creativeComDirectorInfoId)
		throws PortalException {

		return getService().getCreativeCompanyDirectorInformation(
			creativeComDirectorInfoId);
	}

	/**
	 * Returns a range of all the creative company director informations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeCompanyDirectorInformationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative company director informations
	 * @param end the upper bound of the range of creative company director informations (not inclusive)
	 * @return the range of creative company director informations
	 */
	public static List<CreativeCompanyDirectorInformation>
		getCreativeCompanyDirectorInformations(int start, int end) {

		return getService().getCreativeCompanyDirectorInformations(start, end);
	}

	/**
	 * Returns the number of creative company director informations.
	 *
	 * @return the number of creative company director informations
	 */
	public static int getCreativeCompanyDirectorInformationsCount() {
		return getService().getCreativeCompanyDirectorInformationsCount();
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
	 * Updates the creative company director information in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeCompanyDirectorInformationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeCompanyDirectorInformation the creative company director information
	 * @return the creative company director information that was updated
	 */
	public static CreativeCompanyDirectorInformation
		updateCreativeCompanyDirectorInformation(
			CreativeCompanyDirectorInformation
				creativeCompanyDirectorInformation) {

		return getService().updateCreativeCompanyDirectorInformation(
			creativeCompanyDirectorInformation);
	}

	public static CreativeCompanyDirectorInformationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot
		<CreativeCompanyDirectorInformationLocalService> _serviceSnapshot =
			new Snapshot<>(
				CreativeCompanyDirectorInformationLocalServiceUtil.class,
				CreativeCompanyDirectorInformationLocalService.class);

}