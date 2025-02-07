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

import com.nbp.sez.status.application.form.service.model.SezZoneEmployInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezZoneEmployInfo. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezZoneEmployInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmployInfoLocalService
 * @generated
 */
public class SezZoneEmployInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezZoneEmployInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez zone employ info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmployInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 * @return the sez zone employ info that was added
	 */
	public static SezZoneEmployInfo addSezZoneEmployInfo(
		SezZoneEmployInfo sezZoneEmployInfo) {

		return getService().addSezZoneEmployInfo(sezZoneEmployInfo);
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
	 * Creates a new sez zone employ info with the primary key. Does not add the sez zone employ info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone employ info
	 * @return the new sez zone employ info
	 */
	public static SezZoneEmployInfo createSezZoneEmployInfo(
		long sezZoneEmpInfoId) {

		return getService().createSezZoneEmployInfo(sezZoneEmpInfoId);
	}

	public static void deleteBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		getService().deleteBygetSezStatusByAppId(sezStatusApplicationId);
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
	 * Deletes the sez zone employ info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmployInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info that was removed
	 * @throws PortalException if a sez zone employ info with the primary key could not be found
	 */
	public static SezZoneEmployInfo deleteSezZoneEmployInfo(
			long sezZoneEmpInfoId)
		throws PortalException {

		return getService().deleteSezZoneEmployInfo(sezZoneEmpInfoId);
	}

	/**
	 * Deletes the sez zone employ info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmployInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 * @return the sez zone employ info that was removed
	 */
	public static SezZoneEmployInfo deleteSezZoneEmployInfo(
		SezZoneEmployInfo sezZoneEmployInfo) {

		return getService().deleteSezZoneEmployInfo(sezZoneEmployInfo);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmployInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmployInfoModelImpl</code>.
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

	public static SezZoneEmployInfo fetchSezZoneEmployInfo(
		long sezZoneEmpInfoId) {

		return getService().fetchSezZoneEmployInfo(sezZoneEmpInfoId);
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

	public static List<SezZoneEmployInfo> getSezById(
		long sezStatusApplicationId) {

		return getService().getSezById(sezStatusApplicationId);
	}

	/**
	 * Returns the sez zone employ info with the primary key.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone employ info
	 * @return the sez zone employ info
	 * @throws PortalException if a sez zone employ info with the primary key could not be found
	 */
	public static SezZoneEmployInfo getSezZoneEmployInfo(long sezZoneEmpInfoId)
		throws PortalException {

		return getService().getSezZoneEmployInfo(sezZoneEmpInfoId);
	}

	/**
	 * Returns a range of all the sez zone employ infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmployInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employ infos
	 * @param end the upper bound of the range of sez zone employ infos (not inclusive)
	 * @return the range of sez zone employ infos
	 */
	public static List<SezZoneEmployInfo> getSezZoneEmployInfos(
		int start, int end) {

		return getService().getSezZoneEmployInfos(start, end);
	}

	/**
	 * Returns the number of sez zone employ infos.
	 *
	 * @return the number of sez zone employ infos
	 */
	public static int getSezZoneEmployInfosCount() {
		return getService().getSezZoneEmployInfosCount();
	}

	/**
	 * Updates the sez zone employ info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmployInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmployInfo the sez zone employ info
	 * @return the sez zone employ info that was updated
	 */
	public static SezZoneEmployInfo updateSezZoneEmployInfo(
		SezZoneEmployInfo sezZoneEmployInfo) {

		return getService().updateSezZoneEmployInfo(sezZoneEmployInfo);
	}

	public static SezZoneEmployInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezZoneEmployInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezZoneEmployInfoLocalServiceUtil.class,
			SezZoneEmployInfoLocalService.class);

}