/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisConsentBySoleOwner;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisConsentBySoleOwner. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisConsentBySoleOwnerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentBySoleOwnerLocalService
 * @generated
 */
public class CannabisConsentBySoleOwnerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisConsentBySoleOwnerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis consent by sole owner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentBySoleOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was added
	 */
	public static CannabisConsentBySoleOwner addCannabisConsentBySoleOwner(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return getService().addCannabisConsentBySoleOwner(
			cannabisConsentBySoleOwner);
	}

	/**
	 * Creates a new cannabis consent by sole owner with the primary key. Does not add the cannabis consent by sole owner to the database.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key for the new cannabis consent by sole owner
	 * @return the new cannabis consent by sole owner
	 */
	public static CannabisConsentBySoleOwner createCannabisConsentBySoleOwner(
		long cannabisConsentBySoleOwnerId) {

		return getService().createCannabisConsentBySoleOwner(
			cannabisConsentBySoleOwnerId);
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
	 * Deletes the cannabis consent by sole owner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentBySoleOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was removed
	 */
	public static CannabisConsentBySoleOwner deleteCannabisConsentBySoleOwner(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return getService().deleteCannabisConsentBySoleOwner(
			cannabisConsentBySoleOwner);
	}

	/**
	 * Deletes the cannabis consent by sole owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentBySoleOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was removed
	 * @throws PortalException if a cannabis consent by sole owner with the primary key could not be found
	 */
	public static CannabisConsentBySoleOwner deleteCannabisConsentBySoleOwner(
			long cannabisConsentBySoleOwnerId)
		throws PortalException {

		return getService().deleteCannabisConsentBySoleOwner(
			cannabisConsentBySoleOwnerId);
	}

	public static void deleteCS_CSO_CAI(long cannabisApplicationId) {
		getService().deleteCS_CSO_CAI(cannabisApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerModelImpl</code>.
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

	public static CannabisConsentBySoleOwner fetchCannabisConsentBySoleOwner(
		long cannabisConsentBySoleOwnerId) {

		return getService().fetchCannabisConsentBySoleOwner(
			cannabisConsentBySoleOwnerId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<CannabisConsentBySoleOwner> getCA_CSO_BY_CAI(
		long cannabisApplicationId) {

		return getService().getCA_CSO_BY_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis consent by sole owner with the primary key.
	 *
	 * @param cannabisConsentBySoleOwnerId the primary key of the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner
	 * @throws PortalException if a cannabis consent by sole owner with the primary key could not be found
	 */
	public static CannabisConsentBySoleOwner getCannabisConsentBySoleOwner(
			long cannabisConsentBySoleOwnerId)
		throws PortalException {

		return getService().getCannabisConsentBySoleOwner(
			cannabisConsentBySoleOwnerId);
	}

	/**
	 * Returns a range of all the cannabis consent by sole owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentBySoleOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by sole owners
	 * @param end the upper bound of the range of cannabis consent by sole owners (not inclusive)
	 * @return the range of cannabis consent by sole owners
	 */
	public static List<CannabisConsentBySoleOwner>
		getCannabisConsentBySoleOwners(int start, int end) {

		return getService().getCannabisConsentBySoleOwners(start, end);
	}

	/**
	 * Returns the number of cannabis consent by sole owners.
	 *
	 * @return the number of cannabis consent by sole owners
	 */
	public static int getCannabisConsentBySoleOwnersCount() {
		return getService().getCannabisConsentBySoleOwnersCount();
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
	 * Updates the cannabis consent by sole owner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentBySoleOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentBySoleOwner the cannabis consent by sole owner
	 * @return the cannabis consent by sole owner that was updated
	 */
	public static CannabisConsentBySoleOwner updateCannabisConsentBySoleOwner(
		CannabisConsentBySoleOwner cannabisConsentBySoleOwner) {

		return getService().updateCannabisConsentBySoleOwner(
			cannabisConsentBySoleOwner);
	}

	public static CannabisConsentBySoleOwnerLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisConsentBySoleOwnerLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisConsentBySoleOwnerLocalServiceUtil.class,
			CannabisConsentBySoleOwnerLocalService.class);

}