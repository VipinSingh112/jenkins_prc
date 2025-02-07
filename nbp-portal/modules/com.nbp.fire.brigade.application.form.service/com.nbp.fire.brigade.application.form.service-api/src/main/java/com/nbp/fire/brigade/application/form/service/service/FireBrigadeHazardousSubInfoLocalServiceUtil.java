/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeHazardousSubInfo;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FireBrigadeHazardousSubInfo. This utility wraps
 * <code>com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeHazardousSubInfoLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeHazardousSubInfoLocalService
 * @generated
 */
public class FireBrigadeHazardousSubInfoLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeHazardousSubInfoLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the fire brigade hazardous sub info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeHazardousSubInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeHazardousSubInfo the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was added
	 */
	public static FireBrigadeHazardousSubInfo addFireBrigadeHazardousSubInfo(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		return getService().addFireBrigadeHazardousSubInfo(
			fireBrigadeHazardousSubInfo);
	}

	/**
	 * Creates a new fire brigade hazardous sub info with the primary key. Does not add the fire brigade hazardous sub info to the database.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key for the new fire brigade hazardous sub info
	 * @return the new fire brigade hazardous sub info
	 */
	public static FireBrigadeHazardousSubInfo createFireBrigadeHazardousSubInfo(
		long fireBrigadeHazardousSubInfoId) {

		return getService().createFireBrigadeHazardousSubInfo(
			fireBrigadeHazardousSubInfoId);
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
	 * Deletes the fire brigade hazardous sub info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeHazardousSubInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeHazardousSubInfo the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was removed
	 */
	public static FireBrigadeHazardousSubInfo deleteFireBrigadeHazardousSubInfo(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		return getService().deleteFireBrigadeHazardousSubInfo(
			fireBrigadeHazardousSubInfo);
	}

	/**
	 * Deletes the fire brigade hazardous sub info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeHazardousSubInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was removed
	 * @throws PortalException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	public static FireBrigadeHazardousSubInfo deleteFireBrigadeHazardousSubInfo(
			long fireBrigadeHazardousSubInfoId)
		throws PortalException {

		return getService().deleteFireBrigadeHazardousSubInfo(
			fireBrigadeHazardousSubInfoId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoModelImpl</code>.
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

	public static FireBrigadeHazardousSubInfo fetchFireBrigadeHazardousSubInfo(
		long fireBrigadeHazardousSubInfoId) {

		return getService().fetchFireBrigadeHazardousSubInfo(
			fireBrigadeHazardousSubInfoId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static FireBrigadeHazardousSubInfo getFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeHazardousSubInfoException {

		return getService().getFireBrigadeByAppId(fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade hazardous sub info with the primary key.
	 *
	 * @param fireBrigadeHazardousSubInfoId the primary key of the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info
	 * @throws PortalException if a fire brigade hazardous sub info with the primary key could not be found
	 */
	public static FireBrigadeHazardousSubInfo getFireBrigadeHazardousSubInfo(
			long fireBrigadeHazardousSubInfoId)
		throws PortalException {

		return getService().getFireBrigadeHazardousSubInfo(
			fireBrigadeHazardousSubInfoId);
	}

	/**
	 * Returns a range of all the fire brigade hazardous sub infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeHazardousSubInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade hazardous sub infos
	 * @param end the upper bound of the range of fire brigade hazardous sub infos (not inclusive)
	 * @return the range of fire brigade hazardous sub infos
	 */
	public static List<FireBrigadeHazardousSubInfo>
		getFireBrigadeHazardousSubInfos(int start, int end) {

		return getService().getFireBrigadeHazardousSubInfos(start, end);
	}

	/**
	 * Returns the number of fire brigade hazardous sub infos.
	 *
	 * @return the number of fire brigade hazardous sub infos
	 */
	public static int getFireBrigadeHazardousSubInfosCount() {
		return getService().getFireBrigadeHazardousSubInfosCount();
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
	 * Updates the fire brigade hazardous sub info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeHazardousSubInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeHazardousSubInfo the fire brigade hazardous sub info
	 * @return the fire brigade hazardous sub info that was updated
	 */
	public static FireBrigadeHazardousSubInfo updateFireBrigadeHazardousSubInfo(
		FireBrigadeHazardousSubInfo fireBrigadeHazardousSubInfo) {

		return getService().updateFireBrigadeHazardousSubInfo(
			fireBrigadeHazardousSubInfo);
	}

	public static FireBrigadeHazardousSubInfoLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FireBrigadeHazardousSubInfoLocalService>
		_serviceSnapshot = new Snapshot<>(
			FireBrigadeHazardousSubInfoLocalServiceUtil.class,
			FireBrigadeHazardousSubInfoLocalService.class);

}