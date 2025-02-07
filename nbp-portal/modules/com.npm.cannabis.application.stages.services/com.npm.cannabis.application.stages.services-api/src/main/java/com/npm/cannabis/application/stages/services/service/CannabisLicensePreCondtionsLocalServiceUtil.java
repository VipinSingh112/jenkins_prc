/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisLicensePreCondtions;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisLicensePreCondtions. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisLicensePreCondtionsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePreCondtionsLocalService
 * @generated
 */
public class CannabisLicensePreCondtionsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisLicensePreCondtionsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis license pre condtions to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePreCondtions the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was added
	 */
	public static CannabisLicensePreCondtions addCannabisLicensePreCondtions(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		return getService().addCannabisLicensePreCondtions(
			cannabisLicensePreCondtions);
	}

	/**
	 * Creates a new cannabis license pre condtions with the primary key. Does not add the cannabis license pre condtions to the database.
	 *
	 * @param cannabisPreconditionsId the primary key for the new cannabis license pre condtions
	 * @return the new cannabis license pre condtions
	 */
	public static CannabisLicensePreCondtions createCannabisLicensePreCondtions(
		long cannabisPreconditionsId) {

		return getService().createCannabisLicensePreCondtions(
			cannabisPreconditionsId);
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
	 * Deletes the cannabis license pre condtions from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePreCondtions the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was removed
	 */
	public static CannabisLicensePreCondtions deleteCannabisLicensePreCondtions(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		return getService().deleteCannabisLicensePreCondtions(
			cannabisLicensePreCondtions);
	}

	/**
	 * Deletes the cannabis license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was removed
	 * @throws PortalException if a cannabis license pre condtions with the primary key could not be found
	 */
	public static CannabisLicensePreCondtions deleteCannabisLicensePreCondtions(
			long cannabisPreconditionsId)
		throws PortalException {

		return getService().deleteCannabisLicensePreCondtions(
			cannabisPreconditionsId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePreCondtionsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePreCondtionsModelImpl</code>.
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

	public static CannabisLicensePreCondtions fetchCannabisLicensePreCondtions(
		long cannabisPreconditionsId) {

		return getService().fetchCannabisLicensePreCondtions(
			cannabisPreconditionsId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis license pre condtions with the primary key.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions
	 * @throws PortalException if a cannabis license pre condtions with the primary key could not be found
	 */
	public static CannabisLicensePreCondtions getCannabisLicensePreCondtions(
			long cannabisPreconditionsId)
		throws PortalException {

		return getService().getCannabisLicensePreCondtions(
			cannabisPreconditionsId);
	}

	public static List<CannabisLicensePreCondtions>
		getCannabisLicensePreCondtions(String caseId, String licenseType) {

		return getService().getCannabisLicensePreCondtions(caseId, licenseType);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of cannabis license pre condtionses
	 */
	public static List<CannabisLicensePreCondtions>
		getCannabisLicensePreCondtionses(int start, int end) {

		return getService().getCannabisLicensePreCondtionses(start, end);
	}

	/**
	 * Returns the number of cannabis license pre condtionses.
	 *
	 * @return the number of cannabis license pre condtionses
	 */
	public static int getCannabisLicensePreCondtionsesCount() {
		return getService().getCannabisLicensePreCondtionsesCount();
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
	 * Updates the cannabis license pre condtions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePreCondtions the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was updated
	 */
	public static CannabisLicensePreCondtions updateCannabisLicensePreCondtions(
		CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		return getService().updateCannabisLicensePreCondtions(
			cannabisLicensePreCondtions);
	}

	public static CannabisLicensePreCondtionsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisLicensePreCondtionsLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisLicensePreCondtionsLocalServiceUtil.class,
			CannabisLicensePreCondtionsLocalService.class);

}