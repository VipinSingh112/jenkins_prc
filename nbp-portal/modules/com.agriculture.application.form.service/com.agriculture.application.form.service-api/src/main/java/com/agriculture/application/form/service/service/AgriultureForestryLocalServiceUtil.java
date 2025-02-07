/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service;

import com.agriculture.application.form.service.model.AgriultureForestry;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AgriultureForestry. This utility wraps
 * <code>com.agriculture.application.form.service.service.impl.AgriultureForestryLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AgriultureForestryLocalService
 * @generated
 */
public class AgriultureForestryLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.agriculture.application.form.service.service.impl.AgriultureForestryLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the agriulture forestry to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriultureForestryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriultureForestry the agriulture forestry
	 * @return the agriulture forestry that was added
	 */
	public static AgriultureForestry addAgriultureForestry(
		AgriultureForestry agriultureForestry) {

		return getService().addAgriultureForestry(agriultureForestry);
	}

	/**
	 * Creates a new agriulture forestry with the primary key. Does not add the agriulture forestry to the database.
	 *
	 * @param agriultureForestryId the primary key for the new agriulture forestry
	 * @return the new agriulture forestry
	 */
	public static AgriultureForestry createAgriultureForestry(
		long agriultureForestryId) {

		return getService().createAgriultureForestry(agriultureForestryId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteAgriForestryById(long applicationId) {
		getService().deleteAgriForestryById(applicationId);
	}

	/**
	 * Deletes the agriulture forestry from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriultureForestryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriultureForestry the agriulture forestry
	 * @return the agriulture forestry that was removed
	 */
	public static AgriultureForestry deleteAgriultureForestry(
		AgriultureForestry agriultureForestry) {

		return getService().deleteAgriultureForestry(agriultureForestry);
	}

	/**
	 * Deletes the agriulture forestry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriultureForestryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry that was removed
	 * @throws PortalException if a agriulture forestry with the primary key could not be found
	 */
	public static AgriultureForestry deleteAgriultureForestry(
			long agriultureForestryId)
		throws PortalException {

		return getService().deleteAgriultureForestry(agriultureForestryId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriultureForestryModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriultureForestryModelImpl</code>.
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

	public static AgriultureForestry fetchAgriultureForestry(
		long agriultureForestryId) {

		return getService().fetchAgriultureForestry(agriultureForestryId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<AgriultureForestry> getAF_by_AAI(
		long agricultureApplicatiId) {

		return getService().getAF_by_AAI(agricultureApplicatiId);
	}

	public static List<AgriultureForestry> getAForest_by_AAI(
		long agricultureApplicationId) {

		return getService().getAForest_by_AAI(agricultureApplicationId);
	}

	public static AgriultureForestry getAgricultureById(long ApplicationId)
		throws com.agriculture.application.form.service.exception.
			NoSuchAgriultureForestryException {

		return getService().getAgricultureById(ApplicationId);
	}

	/**
	 * Returns a range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.agriculture.application.form.service.model.impl.AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @return the range of agriulture forestries
	 */
	public static List<AgriultureForestry> getAgriultureForestries(
		int start, int end) {

		return getService().getAgriultureForestries(start, end);
	}

	/**
	 * Returns the number of agriulture forestries.
	 *
	 * @return the number of agriulture forestries
	 */
	public static int getAgriultureForestriesCount() {
		return getService().getAgriultureForestriesCount();
	}

	/**
	 * Returns the agriulture forestry with the primary key.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry
	 * @throws PortalException if a agriulture forestry with the primary key could not be found
	 */
	public static AgriultureForestry getAgriultureForestry(
			long agriultureForestryId)
		throws PortalException {

		return getService().getAgriultureForestry(agriultureForestryId);
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
	 * Updates the agriulture forestry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgriultureForestryLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agriultureForestry the agriulture forestry
	 * @return the agriulture forestry that was updated
	 */
	public static AgriultureForestry updateAgriultureForestry(
		AgriultureForestry agriultureForestry) {

		return getService().updateAgriultureForestry(agriultureForestry);
	}

	public static AgriultureForestryLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AgriultureForestryLocalService>
		_serviceSnapshot = new Snapshot<>(
			AgriultureForestryLocalServiceUtil.class,
			AgriultureForestryLocalService.class);

}