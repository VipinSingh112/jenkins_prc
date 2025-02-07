/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.acquire.stages.service.model.AcquireAdvertising;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AcquireAdvertising. This utility wraps
 * <code>com.nbp.acquire.stages.service.service.impl.AcquireAdvertisingLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AcquireAdvertisingLocalService
 * @generated
 */
public class AcquireAdvertisingLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.acquire.stages.service.service.impl.AcquireAdvertisingLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the acquire advertising to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was added
	 */
	public static AcquireAdvertising addAcquireAdvertising(
		AcquireAdvertising acquireAdvertising) {

		return getService().addAcquireAdvertising(acquireAdvertising);
	}

	/**
	 * Creates a new acquire advertising with the primary key. Does not add the acquire advertising to the database.
	 *
	 * @param acquireAdvertisingId the primary key for the new acquire advertising
	 * @return the new acquire advertising
	 */
	public static AcquireAdvertising createAcquireAdvertising(
		long acquireAdvertisingId) {

		return getService().createAcquireAdvertising(acquireAdvertisingId);
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
	 * Deletes the acquire advertising from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was removed
	 */
	public static AcquireAdvertising deleteAcquireAdvertising(
		AcquireAdvertising acquireAdvertising) {

		return getService().deleteAcquireAdvertising(acquireAdvertising);
	}

	/**
	 * Deletes the acquire advertising with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising that was removed
	 * @throws PortalException if a acquire advertising with the primary key could not be found
	 */
	public static AcquireAdvertising deleteAcquireAdvertising(
			long acquireAdvertisingId)
		throws PortalException {

		return getService().deleteAcquireAdvertising(acquireAdvertisingId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
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

	public static AcquireAdvertising fetchAcquireAdvertising(
		long acquireAdvertisingId) {

		return getService().fetchAcquireAdvertising(acquireAdvertisingId);
	}

	/**
	 * Returns the acquire advertising with the primary key.
	 *
	 * @param acquireAdvertisingId the primary key of the acquire advertising
	 * @return the acquire advertising
	 * @throws PortalException if a acquire advertising with the primary key could not be found
	 */
	public static AcquireAdvertising getAcquireAdvertising(
			long acquireAdvertisingId)
		throws PortalException {

		return getService().getAcquireAdvertising(acquireAdvertisingId);
	}

	public static AcquireAdvertising getAcquireAdvertisingBy_CI(String caseId)
		throws com.nbp.acquire.stages.service.exception.
			NoSuchAcquireAdvertisingException {

		return getService().getAcquireAdvertisingBy_CI(caseId);
	}

	/**
	 * Returns a range of all the acquire advertisings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.acquire.stages.service.model.impl.AcquireAdvertisingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire advertisings
	 * @param end the upper bound of the range of acquire advertisings (not inclusive)
	 * @return the range of acquire advertisings
	 */
	public static List<AcquireAdvertising> getAcquireAdvertisings(
		int start, int end) {

		return getService().getAcquireAdvertisings(start, end);
	}

	/**
	 * Returns the number of acquire advertisings.
	 *
	 * @return the number of acquire advertisings
	 */
	public static int getAcquireAdvertisingsCount() {
		return getService().getAcquireAdvertisingsCount();
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

	/**
	 * Updates the acquire advertising in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AcquireAdvertisingLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param acquireAdvertising the acquire advertising
	 * @return the acquire advertising that was updated
	 */
	public static AcquireAdvertising updateAcquireAdvertising(
		AcquireAdvertising acquireAdvertising) {

		return getService().updateAcquireAdvertising(acquireAdvertising);
	}

	public static AcquireAdvertising updateAcquireApplicationAdvertising(
		String caseId, java.util.Date dateFrom, java.util.Date dateTo,
		String advertisingMediaStatus) {

		return getService().updateAcquireApplicationAdvertising(
			caseId, dateFrom, dateTo, advertisingMediaStatus);
	}

	public static AcquireAdvertisingLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AcquireAdvertisingLocalService>
		_serviceSnapshot = new Snapshot<>(
			AcquireAdvertisingLocalServiceUtil.class,
			AcquireAdvertisingLocalService.class);

}