/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.OsiIndiTotalDetailOfAssets;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiIndiTotalDetailOfAssets. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiIndiTotalDetailOfAssetsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiIndiTotalDetailOfAssetsLocalService
 * @generated
 */
public class OsiIndiTotalDetailOfAssetsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.OsiIndiTotalDetailOfAssetsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi indi total detail of assets to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiIndiTotalDetailOfAssetsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiIndiTotalDetailOfAssets the osi indi total detail of assets
	 * @return the osi indi total detail of assets that was added
	 */
	public static OsiIndiTotalDetailOfAssets addOsiIndiTotalDetailOfAssets(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return getService().addOsiIndiTotalDetailOfAssets(
			osiIndiTotalDetailOfAssets);
	}

	/**
	 * Creates a new osi indi total detail of assets with the primary key. Does not add the osi indi total detail of assets to the database.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key for the new osi indi total detail of assets
	 * @return the new osi indi total detail of assets
	 */
	public static OsiIndiTotalDetailOfAssets createOsiIndiTotalDetailOfAssets(
		long osiIndiTotalDetailOfAssetsId) {

		return getService().createOsiIndiTotalDetailOfAssets(
			osiIndiTotalDetailOfAssetsId);
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
	 * Deletes the osi indi total detail of assets with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiIndiTotalDetailOfAssetsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets that was removed
	 * @throws PortalException if a osi indi total detail of assets with the primary key could not be found
	 */
	public static OsiIndiTotalDetailOfAssets deleteOsiIndiTotalDetailOfAssets(
			long osiIndiTotalDetailOfAssetsId)
		throws PortalException {

		return getService().deleteOsiIndiTotalDetailOfAssets(
			osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Deletes the osi indi total detail of assets from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiIndiTotalDetailOfAssetsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiIndiTotalDetailOfAssets the osi indi total detail of assets
	 * @return the osi indi total detail of assets that was removed
	 */
	public static OsiIndiTotalDetailOfAssets deleteOsiIndiTotalDetailOfAssets(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return getService().deleteOsiIndiTotalDetailOfAssets(
			osiIndiTotalDetailOfAssets);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiIndiTotalDetailOfAssetsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiIndiTotalDetailOfAssetsModelImpl</code>.
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

	public static OsiIndiTotalDetailOfAssets fetchOsiIndiTotalDetailOfAssets(
		long osiIndiTotalDetailOfAssetsId) {

		return getService().fetchOsiIndiTotalDetailOfAssets(
			osiIndiTotalDetailOfAssetsId);
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

	public static OsiIndiTotalDetailOfAssets getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchOsiIndiTotalDetailOfAssetsException {

		return getService().getOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the osi indi total detail of assets with the primary key.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets
	 * @throws PortalException if a osi indi total detail of assets with the primary key could not be found
	 */
	public static OsiIndiTotalDetailOfAssets getOsiIndiTotalDetailOfAssets(
			long osiIndiTotalDetailOfAssetsId)
		throws PortalException {

		return getService().getOsiIndiTotalDetailOfAssets(
			osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * Returns a range of all the osi indi total detail of assetses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiIndiTotalDetailOfAssetsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi indi total detail of assetses
	 * @param end the upper bound of the range of osi indi total detail of assetses (not inclusive)
	 * @return the range of osi indi total detail of assetses
	 */
	public static List<OsiIndiTotalDetailOfAssets>
		getOsiIndiTotalDetailOfAssetses(int start, int end) {

		return getService().getOsiIndiTotalDetailOfAssetses(start, end);
	}

	/**
	 * Returns the number of osi indi total detail of assetses.
	 *
	 * @return the number of osi indi total detail of assetses
	 */
	public static int getOsiIndiTotalDetailOfAssetsesCount() {
		return getService().getOsiIndiTotalDetailOfAssetsesCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi indi total detail of assets in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiIndiTotalDetailOfAssetsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiIndiTotalDetailOfAssets the osi indi total detail of assets
	 * @return the osi indi total detail of assets that was updated
	 */
	public static OsiIndiTotalDetailOfAssets updateOsiIndiTotalDetailOfAssets(
		OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return getService().updateOsiIndiTotalDetailOfAssets(
			osiIndiTotalDetailOfAssets);
	}

	public static OsiIndiTotalDetailOfAssetsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiIndiTotalDetailOfAssetsLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiIndiTotalDetailOfAssetsLocalServiceUtil.class,
			OsiIndiTotalDetailOfAssetsLocalService.class);

}