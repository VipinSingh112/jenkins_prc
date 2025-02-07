/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiAssesmentDetailsOfAssetLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiAssesmentDetailsOfAssetLocalService
 * @generated
 */
public class OsiAssesmentDetailsOfAssetLocalServiceWrapper
	implements OsiAssesmentDetailsOfAssetLocalService,
			   ServiceWrapper<OsiAssesmentDetailsOfAssetLocalService> {

	public OsiAssesmentDetailsOfAssetLocalServiceWrapper() {
		this(null);
	}

	public OsiAssesmentDetailsOfAssetLocalServiceWrapper(
		OsiAssesmentDetailsOfAssetLocalService
			osiAssesmentDetailsOfAssetLocalService) {

		_osiAssesmentDetailsOfAssetLocalService =
			osiAssesmentDetailsOfAssetLocalService;
	}

	/**
	 * Adds the osi assesment details of asset to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssesmentDetailsOfAssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssesmentDetailsOfAsset the osi assesment details of asset
	 * @return the osi assesment details of asset that was added
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssesmentDetailsOfAsset addOsiAssesmentDetailsOfAsset(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		return _osiAssesmentDetailsOfAssetLocalService.
			addOsiAssesmentDetailsOfAsset(osiAssesmentDetailsOfAsset);
	}

	/**
	 * Creates a new osi assesment details of asset with the primary key. Does not add the osi assesment details of asset to the database.
	 *
	 * @param osiAssetDetailsId the primary key for the new osi assesment details of asset
	 * @return the new osi assesment details of asset
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssesmentDetailsOfAsset createOsiAssesmentDetailsOfAsset(
			long osiAssetDetailsId) {

		return _osiAssesmentDetailsOfAssetLocalService.
			createOsiAssesmentDetailsOfAsset(osiAssetDetailsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssesmentDetailsOfAssetLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the osi assesment details of asset with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssesmentDetailsOfAssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset that was removed
	 * @throws PortalException if a osi assesment details of asset with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssesmentDetailsOfAsset deleteOsiAssesmentDetailsOfAsset(
				long osiAssetDetailsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssesmentDetailsOfAssetLocalService.
			deleteOsiAssesmentDetailsOfAsset(osiAssetDetailsId);
	}

	/**
	 * Deletes the osi assesment details of asset from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssesmentDetailsOfAssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssesmentDetailsOfAsset the osi assesment details of asset
	 * @return the osi assesment details of asset that was removed
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssesmentDetailsOfAsset deleteOsiAssesmentDetailsOfAsset(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		return _osiAssesmentDetailsOfAssetLocalService.
			deleteOsiAssesmentDetailsOfAsset(osiAssesmentDetailsOfAsset);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssesmentDetailsOfAssetLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiAssesmentDetailsOfAssetLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiAssesmentDetailsOfAssetLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiAssesmentDetailsOfAssetLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _osiAssesmentDetailsOfAssetLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _osiAssesmentDetailsOfAssetLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _osiAssesmentDetailsOfAssetLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _osiAssesmentDetailsOfAssetLocalService.dynamicQueryCount(
			dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _osiAssesmentDetailsOfAssetLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssesmentDetailsOfAsset fetchOsiAssesmentDetailsOfAsset(
			long osiAssetDetailsId) {

		return _osiAssesmentDetailsOfAssetLocalService.
			fetchOsiAssesmentDetailsOfAsset(osiAssetDetailsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiAssesmentDetailsOfAssetLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiAssesmentDetailsOfAssetLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiAssesmentDetailsOfAssetLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * Returns the osi assesment details of asset with the primary key.
	 *
	 * @param osiAssetDetailsId the primary key of the osi assesment details of asset
	 * @return the osi assesment details of asset
	 * @throws PortalException if a osi assesment details of asset with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssesmentDetailsOfAsset getOsiAssesmentDetailsOfAsset(
				long osiAssetDetailsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssesmentDetailsOfAssetLocalService.
			getOsiAssesmentDetailsOfAsset(osiAssetDetailsId);
	}

	/**
	 * Returns a range of all the osi assesment details of assets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.application.form.services.model.impl.OsiAssesmentDetailsOfAssetModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi assesment details of assets
	 * @param end the upper bound of the range of osi assesment details of assets (not inclusive)
	 * @return the range of osi assesment details of assets
	 */
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiAssesmentDetailsOfAsset> getOsiAssesmentDetailsOfAssets(
				int start, int end) {

		return _osiAssesmentDetailsOfAssetLocalService.
			getOsiAssesmentDetailsOfAssets(start, end);
	}

	/**
	 * Returns the number of osi assesment details of assets.
	 *
	 * @return the number of osi assesment details of assets
	 */
	@Override
	public int getOsiAssesmentDetailsOfAssetsCount() {
		return _osiAssesmentDetailsOfAssetLocalService.
			getOsiAssesmentDetailsOfAssetsCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiAssesmentDetailsOfAssetLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the osi assesment details of asset in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiAssesmentDetailsOfAssetLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiAssesmentDetailsOfAsset the osi assesment details of asset
	 * @return the osi assesment details of asset that was updated
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiAssesmentDetailsOfAsset updateOsiAssesmentDetailsOfAsset(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiAssesmentDetailsOfAsset osiAssesmentDetailsOfAsset) {

		return _osiAssesmentDetailsOfAssetLocalService.
			updateOsiAssesmentDetailsOfAsset(osiAssesmentDetailsOfAsset);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiAssesmentDetailsOfAssetLocalService.getBasePersistence();
	}

	@Override
	public OsiAssesmentDetailsOfAssetLocalService getWrappedService() {
		return _osiAssesmentDetailsOfAssetLocalService;
	}

	@Override
	public void setWrappedService(
		OsiAssesmentDetailsOfAssetLocalService
			osiAssesmentDetailsOfAssetLocalService) {

		_osiAssesmentDetailsOfAssetLocalService =
			osiAssesmentDetailsOfAssetLocalService;
	}

	private OsiAssesmentDetailsOfAssetLocalService
		_osiAssesmentDetailsOfAssetLocalService;

}