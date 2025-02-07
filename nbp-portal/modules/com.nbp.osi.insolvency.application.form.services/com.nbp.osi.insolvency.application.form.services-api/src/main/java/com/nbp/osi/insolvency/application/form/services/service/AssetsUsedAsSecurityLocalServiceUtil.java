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

import com.nbp.osi.insolvency.application.form.services.model.AssetsUsedAsSecurity;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AssetsUsedAsSecurity. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.AssetsUsedAsSecurityLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsUsedAsSecurityLocalService
 * @generated
 */
public class AssetsUsedAsSecurityLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.AssetsUsedAsSecurityLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the assets used as security to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetsUsedAsSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetsUsedAsSecurity the assets used as security
	 * @return the assets used as security that was added
	 */
	public static AssetsUsedAsSecurity addAssetsUsedAsSecurity(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return getService().addAssetsUsedAsSecurity(assetsUsedAsSecurity);
	}

	/**
	 * Creates a new assets used as security with the primary key. Does not add the assets used as security to the database.
	 *
	 * @param assetsUsedAsSecurityId the primary key for the new assets used as security
	 * @return the new assets used as security
	 */
	public static AssetsUsedAsSecurity createAssetsUsedAsSecurity(
		long assetsUsedAsSecurityId) {

		return getService().createAssetsUsedAsSecurity(assetsUsedAsSecurityId);
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
	 * Deletes the assets used as security from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetsUsedAsSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetsUsedAsSecurity the assets used as security
	 * @return the assets used as security that was removed
	 */
	public static AssetsUsedAsSecurity deleteAssetsUsedAsSecurity(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return getService().deleteAssetsUsedAsSecurity(assetsUsedAsSecurity);
	}

	/**
	 * Deletes the assets used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetsUsedAsSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security that was removed
	 * @throws PortalException if a assets used as security with the primary key could not be found
	 */
	public static AssetsUsedAsSecurity deleteAssetsUsedAsSecurity(
			long assetsUsedAsSecurityId)
		throws PortalException {

		return getService().deleteAssetsUsedAsSecurity(assetsUsedAsSecurityId);
	}

	public static void deleteBY_Id(long applicationId) {
		getService().deleteBY_Id(applicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssetsUsedAsSecurityModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssetsUsedAsSecurityModelImpl</code>.
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

	public static AssetsUsedAsSecurity fetchAssetsUsedAsSecurity(
		long assetsUsedAsSecurityId) {

		return getService().fetchAssetsUsedAsSecurity(assetsUsedAsSecurityId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the assets used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssetsUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets used as securities
	 * @param end the upper bound of the range of assets used as securities (not inclusive)
	 * @return the range of assets used as securities
	 */
	public static List<AssetsUsedAsSecurity> getAssetsUsedAsSecurities(
		int start, int end) {

		return getService().getAssetsUsedAsSecurities(start, end);
	}

	/**
	 * Returns the number of assets used as securities.
	 *
	 * @return the number of assets used as securities
	 */
	public static int getAssetsUsedAsSecuritiesCount() {
		return getService().getAssetsUsedAsSecuritiesCount();
	}

	/**
	 * Returns the assets used as security with the primary key.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security
	 * @throws PortalException if a assets used as security with the primary key could not be found
	 */
	public static AssetsUsedAsSecurity getAssetsUsedAsSecurity(
			long assetsUsedAsSecurityId)
		throws PortalException {

		return getService().getAssetsUsedAsSecurity(assetsUsedAsSecurityId);
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

	public static List<AssetsUsedAsSecurity> getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsUsedAsSecurityException {

		return getService().getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the assets used as security in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetsUsedAsSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetsUsedAsSecurity the assets used as security
	 * @return the assets used as security that was updated
	 */
	public static AssetsUsedAsSecurity updateAssetsUsedAsSecurity(
		AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return getService().updateAssetsUsedAsSecurity(assetsUsedAsSecurity);
	}

	public static AssetsUsedAsSecurityLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AssetsUsedAsSecurityLocalService>
		_serviceSnapshot = new Snapshot<>(
			AssetsUsedAsSecurityLocalServiceUtil.class,
			AssetsUsedAsSecurityLocalService.class);

}