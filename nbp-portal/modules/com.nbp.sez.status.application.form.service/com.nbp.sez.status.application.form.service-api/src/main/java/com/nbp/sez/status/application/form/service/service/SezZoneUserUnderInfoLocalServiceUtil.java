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

import com.nbp.sez.status.application.form.service.model.SezZoneUserUnderInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezZoneUserUnderInfo. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezZoneUserUnderInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneUserUnderInfoLocalService
 * @generated
 */
public class SezZoneUserUnderInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezZoneUserUnderInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez zone user under info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneUserUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 * @return the sez zone user under info that was added
	 */
	public static SezZoneUserUnderInfo addSezZoneUserUnderInfo(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return getService().addSezZoneUserUnderInfo(sezZoneUserUnderInfo);
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
	 * Creates a new sez zone user under info with the primary key. Does not add the sez zone user under info to the database.
	 *
	 * @param sezZoneUserUnderInfoId the primary key for the new sez zone user under info
	 * @return the new sez zone user under info
	 */
	public static SezZoneUserUnderInfo createSezZoneUserUnderInfo(
		long sezZoneUserUnderInfoId) {

		return getService().createSezZoneUserUnderInfo(sezZoneUserUnderInfoId);
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
	 * Deletes the sez zone user under info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneUserUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info that was removed
	 * @throws PortalException if a sez zone user under info with the primary key could not be found
	 */
	public static SezZoneUserUnderInfo deleteSezZoneUserUnderInfo(
			long sezZoneUserUnderInfoId)
		throws PortalException {

		return getService().deleteSezZoneUserUnderInfo(sezZoneUserUnderInfoId);
	}

	/**
	 * Deletes the sez zone user under info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneUserUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 * @return the sez zone user under info that was removed
	 */
	public static SezZoneUserUnderInfo deleteSezZoneUserUnderInfo(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return getService().deleteSezZoneUserUnderInfo(sezZoneUserUnderInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoModelImpl</code>.
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

	public static SezZoneUserUnderInfo fetchSezZoneUserUnderInfo(
		long sezZoneUserUnderInfoId) {

		return getService().fetchSezZoneUserUnderInfo(sezZoneUserUnderInfoId);
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

	public static SezZoneUserUnderInfo getSezById(long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezZoneUserUnderInfoException {

		return getService().getSezById(sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone user under info with the primary key.
	 *
	 * @param sezZoneUserUnderInfoId the primary key of the sez zone user under info
	 * @return the sez zone user under info
	 * @throws PortalException if a sez zone user under info with the primary key could not be found
	 */
	public static SezZoneUserUnderInfo getSezZoneUserUnderInfo(
			long sezZoneUserUnderInfoId)
		throws PortalException {

		return getService().getSezZoneUserUnderInfo(sezZoneUserUnderInfoId);
	}

	/**
	 * Returns a range of all the sez zone user under infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneUserUnderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone user under infos
	 * @param end the upper bound of the range of sez zone user under infos (not inclusive)
	 * @return the range of sez zone user under infos
	 */
	public static List<SezZoneUserUnderInfo> getSezZoneUserUnderInfos(
		int start, int end) {

		return getService().getSezZoneUserUnderInfos(start, end);
	}

	/**
	 * Returns the number of sez zone user under infos.
	 *
	 * @return the number of sez zone user under infos
	 */
	public static int getSezZoneUserUnderInfosCount() {
		return getService().getSezZoneUserUnderInfosCount();
	}

	/**
	 * Updates the sez zone user under info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneUserUnderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneUserUnderInfo the sez zone user under info
	 * @return the sez zone user under info that was updated
	 */
	public static SezZoneUserUnderInfo updateSezZoneUserUnderInfo(
		SezZoneUserUnderInfo sezZoneUserUnderInfo) {

		return getService().updateSezZoneUserUnderInfo(sezZoneUserUnderInfo);
	}

	public static SezZoneUserUnderInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezZoneUserUnderInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezZoneUserUnderInfoLocalServiceUtil.class,
			SezZoneUserUnderInfoLocalService.class);

}