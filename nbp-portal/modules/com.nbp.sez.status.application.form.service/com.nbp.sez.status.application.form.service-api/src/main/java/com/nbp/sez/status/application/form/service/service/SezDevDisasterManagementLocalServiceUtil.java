/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevDisasterManagement;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezDevDisasterManagement. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezDevDisasterManagementLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezDevDisasterManagementLocalService
 * @generated
 */
public class SezDevDisasterManagementLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezDevDisasterManagementLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez dev disaster management to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 * @return the sez dev disaster management that was added
	 */
	public static SezDevDisasterManagement addSezDevDisasterManagement(
		SezDevDisasterManagement sezDevDisasterManagement) {

		return getService().addSezDevDisasterManagement(
			sezDevDisasterManagement);
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
	 * Creates a new sez dev disaster management with the primary key. Does not add the sez dev disaster management to the database.
	 *
	 * @param sezDevDisasterManagementId the primary key for the new sez dev disaster management
	 * @return the new sez dev disaster management
	 */
	public static SezDevDisasterManagement createSezDevDisasterManagement(
		long sezDevDisasterManagementId) {

		return getService().createSezDevDisasterManagement(
			sezDevDisasterManagementId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez dev disaster management with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management that was removed
	 * @throws PortalException if a sez dev disaster management with the primary key could not be found
	 */
	public static SezDevDisasterManagement deleteSezDevDisasterManagement(
			long sezDevDisasterManagementId)
		throws PortalException {

		return getService().deleteSezDevDisasterManagement(
			sezDevDisasterManagementId);
	}

	/**
	 * Deletes the sez dev disaster management from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 * @return the sez dev disaster management that was removed
	 */
	public static SezDevDisasterManagement deleteSezDevDisasterManagement(
		SezDevDisasterManagement sezDevDisasterManagement) {

		return getService().deleteSezDevDisasterManagement(
			sezDevDisasterManagement);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementModelImpl</code>.
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

	public static SezDevDisasterManagement fetchSezDevDisasterManagement(
		long sezDevDisasterManagementId) {

		return getService().fetchSezDevDisasterManagement(
			sezDevDisasterManagementId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
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

	public static SezDevDisasterManagement getSezById(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevDisasterManagementException {

		return getService().getSezById(sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev disaster management with the primary key.
	 *
	 * @param sezDevDisasterManagementId the primary key of the sez dev disaster management
	 * @return the sez dev disaster management
	 * @throws PortalException if a sez dev disaster management with the primary key could not be found
	 */
	public static SezDevDisasterManagement getSezDevDisasterManagement(
			long sezDevDisasterManagementId)
		throws PortalException {

		return getService().getSezDevDisasterManagement(
			sezDevDisasterManagementId);
	}

	/**
	 * Returns a range of all the sez dev disaster managements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezDevDisasterManagementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev disaster managements
	 * @param end the upper bound of the range of sez dev disaster managements (not inclusive)
	 * @return the range of sez dev disaster managements
	 */
	public static List<SezDevDisasterManagement> getSezDevDisasterManagements(
		int start, int end) {

		return getService().getSezDevDisasterManagements(start, end);
	}

	/**
	 * Returns the number of sez dev disaster managements.
	 *
	 * @return the number of sez dev disaster managements
	 */
	public static int getSezDevDisasterManagementsCount() {
		return getService().getSezDevDisasterManagementsCount();
	}

	/**
	 * Updates the sez dev disaster management in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezDevDisasterManagementLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezDevDisasterManagement the sez dev disaster management
	 * @return the sez dev disaster management that was updated
	 */
	public static SezDevDisasterManagement updateSezDevDisasterManagement(
		SezDevDisasterManagement sezDevDisasterManagement) {

		return getService().updateSezDevDisasterManagement(
			sezDevDisasterManagement);
	}

	public static SezDevDisasterManagementLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezDevDisasterManagementLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezDevDisasterManagementLocalServiceUtil.class,
			SezDevDisasterManagementLocalService.class);

}