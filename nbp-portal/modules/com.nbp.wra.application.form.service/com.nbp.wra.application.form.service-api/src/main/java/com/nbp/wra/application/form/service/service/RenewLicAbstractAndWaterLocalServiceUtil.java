/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RenewLicAbstractAndWater. This utility wraps
 * <code>com.nbp.wra.application.form.service.service.impl.RenewLicAbstractAndWaterLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWaterLocalService
 * @generated
 */
public class RenewLicAbstractAndWaterLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.application.form.service.service.impl.RenewLicAbstractAndWaterLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the renew lic abstract and water to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RenewLicAbstractAndWaterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param renewLicAbstractAndWater the renew lic abstract and water
	 * @return the renew lic abstract and water that was added
	 */
	public static RenewLicAbstractAndWater addRenewLicAbstractAndWater(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		return getService().addRenewLicAbstractAndWater(
			renewLicAbstractAndWater);
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
	 * Creates a new renew lic abstract and water with the primary key. Does not add the renew lic abstract and water to the database.
	 *
	 * @param renewLicAbstractAndWaterId the primary key for the new renew lic abstract and water
	 * @return the new renew lic abstract and water
	 */
	public static RenewLicAbstractAndWater createRenewLicAbstractAndWater(
		long renewLicAbstractAndWaterId) {

		return getService().createRenewLicAbstractAndWater(
			renewLicAbstractAndWaterId);
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
	 * Deletes the renew lic abstract and water with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RenewLicAbstractAndWaterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water that was removed
	 * @throws PortalException if a renew lic abstract and water with the primary key could not be found
	 */
	public static RenewLicAbstractAndWater deleteRenewLicAbstractAndWater(
			long renewLicAbstractAndWaterId)
		throws PortalException {

		return getService().deleteRenewLicAbstractAndWater(
			renewLicAbstractAndWaterId);
	}

	/**
	 * Deletes the renew lic abstract and water from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RenewLicAbstractAndWaterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param renewLicAbstractAndWater the renew lic abstract and water
	 * @return the renew lic abstract and water that was removed
	 */
	public static RenewLicAbstractAndWater deleteRenewLicAbstractAndWater(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		return getService().deleteRenewLicAbstractAndWater(
			renewLicAbstractAndWater);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterModelImpl</code>.
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

	public static RenewLicAbstractAndWater fetchRenewLicAbstractAndWater(
		long renewLicAbstractAndWaterId) {

		return getService().fetchRenewLicAbstractAndWater(
			renewLicAbstractAndWaterId);
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
	 * Returns the renew lic abstract and water with the primary key.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water
	 * @throws PortalException if a renew lic abstract and water with the primary key could not be found
	 */
	public static RenewLicAbstractAndWater getRenewLicAbstractAndWater(
			long renewLicAbstractAndWaterId)
		throws PortalException {

		return getService().getRenewLicAbstractAndWater(
			renewLicAbstractAndWaterId);
	}

	/**
	 * Returns a range of all the renew lic abstract and waters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of renew lic abstract and waters
	 * @param end the upper bound of the range of renew lic abstract and waters (not inclusive)
	 * @return the range of renew lic abstract and waters
	 */
	public static List<RenewLicAbstractAndWater> getRenewLicAbstractAndWaters(
		int start, int end) {

		return getService().getRenewLicAbstractAndWaters(start, end);
	}

	/**
	 * Returns the number of renew lic abstract and waters.
	 *
	 * @return the number of renew lic abstract and waters
	 */
	public static int getRenewLicAbstractAndWatersCount() {
		return getService().getRenewLicAbstractAndWatersCount();
	}

	public static RenewLicAbstractAndWater getWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchRenewLicAbstractAndWaterException {

		return getService().getWRA_By_Id(wraApplicationId);
	}

	/**
	 * Updates the renew lic abstract and water in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RenewLicAbstractAndWaterLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param renewLicAbstractAndWater the renew lic abstract and water
	 * @return the renew lic abstract and water that was updated
	 */
	public static RenewLicAbstractAndWater updateRenewLicAbstractAndWater(
		RenewLicAbstractAndWater renewLicAbstractAndWater) {

		return getService().updateRenewLicAbstractAndWater(
			renewLicAbstractAndWater);
	}

	public static RenewLicAbstractAndWaterLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<RenewLicAbstractAndWaterLocalService>
		_serviceSnapshot = new Snapshot<>(
			RenewLicAbstractAndWaterLocalServiceUtil.class,
			RenewLicAbstractAndWaterLocalService.class);

}