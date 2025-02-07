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

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeOperatorDetail;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FireBrigadeOperatorDetail. This utility wraps
 * <code>com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeOperatorDetailLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeOperatorDetailLocalService
 * @generated
 */
public class FireBrigadeOperatorDetailLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeOperatorDetailLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the fire brigade operator detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeOperatorDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 * @return the fire brigade operator detail that was added
	 */
	public static FireBrigadeOperatorDetail addFireBrigadeOperatorDetail(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return getService().addFireBrigadeOperatorDetail(
			fireBrigadeOperatorDetail);
	}

	/**
	 * Creates a new fire brigade operator detail with the primary key. Does not add the fire brigade operator detail to the database.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key for the new fire brigade operator detail
	 * @return the new fire brigade operator detail
	 */
	public static FireBrigadeOperatorDetail createFireBrigadeOperatorDetail(
		long fireBrigadeOperatorDetailId) {

		return getService().createFireBrigadeOperatorDetail(
			fireBrigadeOperatorDetailId);
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
	 * Deletes the fire brigade operator detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeOperatorDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 * @return the fire brigade operator detail that was removed
	 */
	public static FireBrigadeOperatorDetail deleteFireBrigadeOperatorDetail(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return getService().deleteFireBrigadeOperatorDetail(
			fireBrigadeOperatorDetail);
	}

	/**
	 * Deletes the fire brigade operator detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeOperatorDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail that was removed
	 * @throws PortalException if a fire brigade operator detail with the primary key could not be found
	 */
	public static FireBrigadeOperatorDetail deleteFireBrigadeOperatorDetail(
			long fireBrigadeOperatorDetailId)
		throws PortalException {

		return getService().deleteFireBrigadeOperatorDetail(
			fireBrigadeOperatorDetailId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailModelImpl</code>.
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

	public static FireBrigadeOperatorDetail fetchFireBrigadeOperatorDetail(
		long fireBrigadeOperatorDetailId) {

		return getService().fetchFireBrigadeOperatorDetail(
			fireBrigadeOperatorDetailId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static FireBrigadeOperatorDetail getFireBrigadeByAppId(
			long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeOperatorDetailException {

		return getService().getFireBrigadeByAppId(fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade operator detail with the primary key.
	 *
	 * @param fireBrigadeOperatorDetailId the primary key of the fire brigade operator detail
	 * @return the fire brigade operator detail
	 * @throws PortalException if a fire brigade operator detail with the primary key could not be found
	 */
	public static FireBrigadeOperatorDetail getFireBrigadeOperatorDetail(
			long fireBrigadeOperatorDetailId)
		throws PortalException {

		return getService().getFireBrigadeOperatorDetail(
			fireBrigadeOperatorDetailId);
	}

	/**
	 * Returns a range of all the fire brigade operator details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeOperatorDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade operator details
	 * @param end the upper bound of the range of fire brigade operator details (not inclusive)
	 * @return the range of fire brigade operator details
	 */
	public static List<FireBrigadeOperatorDetail> getFireBrigadeOperatorDetails(
		int start, int end) {

		return getService().getFireBrigadeOperatorDetails(start, end);
	}

	/**
	 * Returns the number of fire brigade operator details.
	 *
	 * @return the number of fire brigade operator details
	 */
	public static int getFireBrigadeOperatorDetailsCount() {
		return getService().getFireBrigadeOperatorDetailsCount();
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
	 * Updates the fire brigade operator detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeOperatorDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeOperatorDetail the fire brigade operator detail
	 * @return the fire brigade operator detail that was updated
	 */
	public static FireBrigadeOperatorDetail updateFireBrigadeOperatorDetail(
		FireBrigadeOperatorDetail fireBrigadeOperatorDetail) {

		return getService().updateFireBrigadeOperatorDetail(
			fireBrigadeOperatorDetail);
	}

	public static FireBrigadeOperatorDetailLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FireBrigadeOperatorDetailLocalService>
		_serviceSnapshot = new Snapshot<>(
			FireBrigadeOperatorDetailLocalServiceUtil.class,
			FireBrigadeOperatorDetailLocalService.class);

}