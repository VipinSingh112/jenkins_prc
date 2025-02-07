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

import com.nbp.cannabis.application.form.services.model.CannabisFeeMaster;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisFeeMaster. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisFeeMasterLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisFeeMasterLocalService
 * @generated
 */
public class CannabisFeeMasterLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisFeeMasterLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis fee master to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was added
	 */
	public static CannabisFeeMaster addCannabisFeeMaster(
		CannabisFeeMaster cannabisFeeMaster) {

		return getService().addCannabisFeeMaster(cannabisFeeMaster);
	}

	/**
	 * Creates a new cannabis fee master with the primary key. Does not add the cannabis fee master to the database.
	 *
	 * @param cannabisFeeMasterId the primary key for the new cannabis fee master
	 * @return the new cannabis fee master
	 */
	public static CannabisFeeMaster createCannabisFeeMaster(
		long cannabisFeeMasterId) {

		return getService().createCannabisFeeMaster(cannabisFeeMasterId);
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
	 * Deletes the cannabis fee master from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was removed
	 */
	public static CannabisFeeMaster deleteCannabisFeeMaster(
		CannabisFeeMaster cannabisFeeMaster) {

		return getService().deleteCannabisFeeMaster(cannabisFeeMaster);
	}

	/**
	 * Deletes the cannabis fee master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master that was removed
	 * @throws PortalException if a cannabis fee master with the primary key could not be found
	 */
	public static CannabisFeeMaster deleteCannabisFeeMaster(
			long cannabisFeeMasterId)
		throws PortalException {

		return getService().deleteCannabisFeeMaster(cannabisFeeMasterId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
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

	public static CannabisFeeMaster fetchCannabisFeeMaster(
		long cannabisFeeMasterId) {

		return getService().fetchCannabisFeeMaster(cannabisFeeMasterId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis fee master with the primary key.
	 *
	 * @param cannabisFeeMasterId the primary key of the cannabis fee master
	 * @return the cannabis fee master
	 * @throws PortalException if a cannabis fee master with the primary key could not be found
	 */
	public static CannabisFeeMaster getCannabisFeeMaster(
			long cannabisFeeMasterId)
		throws PortalException {

		return getService().getCannabisFeeMaster(cannabisFeeMasterId);
	}

	/**
	 * Returns a range of all the cannabis fee masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisFeeMasterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis fee masters
	 * @param end the upper bound of the range of cannabis fee masters (not inclusive)
	 * @return the range of cannabis fee masters
	 */
	public static List<CannabisFeeMaster> getCannabisFeeMasters(
		int start, int end) {

		return getService().getCannabisFeeMasters(start, end);
	}

	/**
	 * Returns the number of cannabis fee masters.
	 *
	 * @return the number of cannabis fee masters
	 */
	public static int getCannabisFeeMastersCount() {
		return getService().getCannabisFeeMastersCount();
	}

	public static CannabisFeeMaster getFeeByCategoryAndSubCategory(
			String category, String subCategory)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisFeeMasterException {

		return getService().getFeeByCategoryAndSubCategory(
			category, subCategory);
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
	 * Updates the cannabis fee master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisFeeMasterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisFeeMaster the cannabis fee master
	 * @return the cannabis fee master that was updated
	 */
	public static CannabisFeeMaster updateCannabisFeeMaster(
		CannabisFeeMaster cannabisFeeMaster) {

		return getService().updateCannabisFeeMaster(cannabisFeeMaster);
	}

	public static CannabisFeeMasterLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisFeeMasterLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisFeeMasterLocalServiceUtil.class,
			CannabisFeeMasterLocalService.class);

}