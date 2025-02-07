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

import com.nbp.osi.insolvency.application.form.services.model.AssetsNotUsedAsSecurity;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AssetsNotUsedAsSecurity. This utility wraps
 * <code>com.nbp.osi.insolvency.application.form.services.service.impl.AssetsNotUsedAsSecurityLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsNotUsedAsSecurityLocalService
 * @generated
 */
public class AssetsNotUsedAsSecurityLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.application.form.services.service.impl.AssetsNotUsedAsSecurityLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the assets not used as security to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetsNotUsedAsSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetsNotUsedAsSecurity the assets not used as security
	 * @return the assets not used as security that was added
	 */
	public static AssetsNotUsedAsSecurity addAssetsNotUsedAsSecurity(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return getService().addAssetsNotUsedAsSecurity(assetsNotUsedAsSecurity);
	}

	/**
	 * Creates a new assets not used as security with the primary key. Does not add the assets not used as security to the database.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key for the new assets not used as security
	 * @return the new assets not used as security
	 */
	public static AssetsNotUsedAsSecurity createAssetsNotUsedAsSecurity(
		long assetsNotUsedAsSecurityId) {

		return getService().createAssetsNotUsedAsSecurity(
			assetsNotUsedAsSecurityId);
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
	 * Deletes the assets not used as security from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetsNotUsedAsSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetsNotUsedAsSecurity the assets not used as security
	 * @return the assets not used as security that was removed
	 */
	public static AssetsNotUsedAsSecurity deleteAssetsNotUsedAsSecurity(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return getService().deleteAssetsNotUsedAsSecurity(
			assetsNotUsedAsSecurity);
	}

	/**
	 * Deletes the assets not used as security with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetsNotUsedAsSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security that was removed
	 * @throws PortalException if a assets not used as security with the primary key could not be found
	 */
	public static AssetsNotUsedAsSecurity deleteAssetsNotUsedAsSecurity(
			long assetsNotUsedAsSecurityId)
		throws PortalException {

		return getService().deleteAssetsNotUsedAsSecurity(
			assetsNotUsedAsSecurityId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssetsNotUsedAsSecurityModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssetsNotUsedAsSecurityModelImpl</code>.
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

	public static AssetsNotUsedAsSecurity fetchAssetsNotUsedAsSecurity(
		long assetsNotUsedAsSecurityId) {

		return getService().fetchAssetsNotUsedAsSecurity(
			assetsNotUsedAsSecurityId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the assets not used as securities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.AssetsNotUsedAsSecurityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assets not used as securities
	 * @param end the upper bound of the range of assets not used as securities (not inclusive)
	 * @return the range of assets not used as securities
	 */
	public static List<AssetsNotUsedAsSecurity> getAssetsNotUsedAsSecurities(
		int start, int end) {

		return getService().getAssetsNotUsedAsSecurities(start, end);
	}

	/**
	 * Returns the number of assets not used as securities.
	 *
	 * @return the number of assets not used as securities
	 */
	public static int getAssetsNotUsedAsSecuritiesCount() {
		return getService().getAssetsNotUsedAsSecuritiesCount();
	}

	/**
	 * Returns the assets not used as security with the primary key.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security
	 * @throws PortalException if a assets not used as security with the primary key could not be found
	 */
	public static AssetsNotUsedAsSecurity getAssetsNotUsedAsSecurity(
			long assetsNotUsedAsSecurityId)
		throws PortalException {

		return getService().getAssetsNotUsedAsSecurity(
			assetsNotUsedAsSecurityId);
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

	public static List<AssetsNotUsedAsSecurity> getOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssetsNotUsedAsSecurityException {

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
	 * Updates the assets not used as security in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AssetsNotUsedAsSecurityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param assetsNotUsedAsSecurity the assets not used as security
	 * @return the assets not used as security that was updated
	 */
	public static AssetsNotUsedAsSecurity updateAssetsNotUsedAsSecurity(
		AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return getService().updateAssetsNotUsedAsSecurity(
			assetsNotUsedAsSecurity);
	}

	public static AssetsNotUsedAsSecurityLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AssetsNotUsedAsSecurityLocalService>
		_serviceSnapshot = new Snapshot<>(
			AssetsNotUsedAsSecurityLocalServiceUtil.class,
			AssetsNotUsedAsSecurityLocalService.class);

}