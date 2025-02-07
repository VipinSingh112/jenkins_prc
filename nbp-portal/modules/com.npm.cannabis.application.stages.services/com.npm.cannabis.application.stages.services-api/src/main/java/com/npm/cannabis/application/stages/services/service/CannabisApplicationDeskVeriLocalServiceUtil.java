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

import com.npm.cannabis.application.stages.services.model.CannabisApplicationDeskVeri;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisApplicationDeskVeri. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationDeskVeriLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDeskVeriLocalService
 * @generated
 */
public class CannabisApplicationDeskVeriLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisApplicationDeskVeriLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis application desk veri to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 * @return the cannabis application desk veri that was added
	 */
	public static CannabisApplicationDeskVeri addCannabisApplicationDeskVeri(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		return getService().addCannabisApplicationDeskVeri(
			cannabisApplicationDeskVeri);
	}

	/**
	 * Creates a new cannabis application desk veri with the primary key. Does not add the cannabis application desk veri to the database.
	 *
	 * @param cannabisDeskVeriId the primary key for the new cannabis application desk veri
	 * @return the new cannabis application desk veri
	 */
	public static CannabisApplicationDeskVeri createCannabisApplicationDeskVeri(
		long cannabisDeskVeriId) {

		return getService().createCannabisApplicationDeskVeri(
			cannabisDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteCannabisAppDV_ById(long cannabisApplicationId) {
		getService().deleteCannabisAppDV_ById(cannabisApplicationId);
	}

	/**
	 * Deletes the cannabis application desk veri from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 * @return the cannabis application desk veri that was removed
	 */
	public static CannabisApplicationDeskVeri deleteCannabisApplicationDeskVeri(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		return getService().deleteCannabisApplicationDeskVeri(
			cannabisApplicationDeskVeri);
	}

	/**
	 * Deletes the cannabis application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri that was removed
	 * @throws PortalException if a cannabis application desk veri with the primary key could not be found
	 */
	public static CannabisApplicationDeskVeri deleteCannabisApplicationDeskVeri(
			long cannabisDeskVeriId)
		throws PortalException {

		return getService().deleteCannabisApplicationDeskVeri(
			cannabisDeskVeriId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriModelImpl</code>.
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

	public static CannabisApplicationDeskVeri fetchCannabisApplicationDeskVeri(
		long cannabisDeskVeriId) {

		return getService().fetchCannabisApplicationDeskVeri(
			cannabisDeskVeriId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<CannabisApplicationDeskVeri>
		getApplicationDeskVerificationList(long cannabisApplicationId) {

		return getService().getApplicationDeskVerificationList(
			cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application desk veri with the primary key.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri
	 * @throws PortalException if a cannabis application desk veri with the primary key could not be found
	 */
	public static CannabisApplicationDeskVeri getCannabisApplicationDeskVeri(
			long cannabisDeskVeriId)
		throws PortalException {

		return getService().getCannabisApplicationDeskVeri(cannabisDeskVeriId);
	}

	/**
	 * Returns a range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @return the range of cannabis application desk veris
	 */
	public static List<CannabisApplicationDeskVeri>
		getCannabisApplicationDeskVeris(int start, int end) {

		return getService().getCannabisApplicationDeskVeris(start, end);
	}

	/**
	 * Returns the number of cannabis application desk veris.
	 *
	 * @return the number of cannabis application desk veris
	 */
	public static int getCannabisApplicationDeskVerisCount() {
		return getService().getCannabisApplicationDeskVerisCount();
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
	 * Updates the cannabis application desk veri in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 * @return the cannabis application desk veri that was updated
	 */
	public static CannabisApplicationDeskVeri updateCannabisApplicationDeskVeri(
		CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		return getService().updateCannabisApplicationDeskVeri(
			cannabisApplicationDeskVeri);
	}

	public static CannabisApplicationDeskVeriLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisApplicationDeskVeriLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisApplicationDeskVeriLocalServiceUtil.class,
			CannabisApplicationDeskVeriLocalService.class);

}