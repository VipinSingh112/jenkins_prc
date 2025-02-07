/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link OsiIndiTotalDetailOfAssetsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OsiIndiTotalDetailOfAssetsLocalService
 * @generated
 */
public class OsiIndiTotalDetailOfAssetsLocalServiceWrapper
	implements OsiIndiTotalDetailOfAssetsLocalService,
			   ServiceWrapper<OsiIndiTotalDetailOfAssetsLocalService> {

	public OsiIndiTotalDetailOfAssetsLocalServiceWrapper() {
		this(null);
	}

	public OsiIndiTotalDetailOfAssetsLocalServiceWrapper(
		OsiIndiTotalDetailOfAssetsLocalService
			osiIndiTotalDetailOfAssetsLocalService) {

		_osiIndiTotalDetailOfAssetsLocalService =
			osiIndiTotalDetailOfAssetsLocalService;
	}

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
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiIndiTotalDetailOfAssets addOsiIndiTotalDetailOfAssets(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return _osiIndiTotalDetailOfAssetsLocalService.
			addOsiIndiTotalDetailOfAssets(osiIndiTotalDetailOfAssets);
	}

	/**
	 * Creates a new osi indi total detail of assets with the primary key. Does not add the osi indi total detail of assets to the database.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key for the new osi indi total detail of assets
	 * @return the new osi indi total detail of assets
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiIndiTotalDetailOfAssets createOsiIndiTotalDetailOfAssets(
			long osiIndiTotalDetailOfAssetsId) {

		return _osiIndiTotalDetailOfAssetsLocalService.
			createOsiIndiTotalDetailOfAssets(osiIndiTotalDetailOfAssetsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiIndiTotalDetailOfAssetsLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiIndiTotalDetailOfAssets deleteOsiIndiTotalDetailOfAssets(
				long osiIndiTotalDetailOfAssetsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiIndiTotalDetailOfAssetsLocalService.
			deleteOsiIndiTotalDetailOfAssets(osiIndiTotalDetailOfAssetsId);
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
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiIndiTotalDetailOfAssets deleteOsiIndiTotalDetailOfAssets(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return _osiIndiTotalDetailOfAssetsLocalService.
			deleteOsiIndiTotalDetailOfAssets(osiIndiTotalDetailOfAssets);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiIndiTotalDetailOfAssetsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _osiIndiTotalDetailOfAssetsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _osiIndiTotalDetailOfAssetsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _osiIndiTotalDetailOfAssetsLocalService.dynamicQuery();
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

		return _osiIndiTotalDetailOfAssetsLocalService.dynamicQuery(
			dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _osiIndiTotalDetailOfAssetsLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _osiIndiTotalDetailOfAssetsLocalService.dynamicQuery(
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

		return _osiIndiTotalDetailOfAssetsLocalService.dynamicQueryCount(
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

		return _osiIndiTotalDetailOfAssetsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiIndiTotalDetailOfAssets fetchOsiIndiTotalDetailOfAssets(
			long osiIndiTotalDetailOfAssetsId) {

		return _osiIndiTotalDetailOfAssetsLocalService.
			fetchOsiIndiTotalDetailOfAssets(osiIndiTotalDetailOfAssetsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _osiIndiTotalDetailOfAssetsLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _osiIndiTotalDetailOfAssetsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _osiIndiTotalDetailOfAssetsLocalService.
			getOSGiServiceIdentifier();
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiIndiTotalDetailOfAssets getOsiById(long osiInsolvencyId)
			throws com.nbp.osi.insolvency.application.form.services.exception.
				NoSuchOsiIndiTotalDetailOfAssetsException {

		return _osiIndiTotalDetailOfAssetsLocalService.getOsiById(
			osiInsolvencyId);
	}

	/**
	 * Returns the osi indi total detail of assets with the primary key.
	 *
	 * @param osiIndiTotalDetailOfAssetsId the primary key of the osi indi total detail of assets
	 * @return the osi indi total detail of assets
	 * @throws PortalException if a osi indi total detail of assets with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiIndiTotalDetailOfAssets getOsiIndiTotalDetailOfAssets(
				long osiIndiTotalDetailOfAssetsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _osiIndiTotalDetailOfAssetsLocalService.
			getOsiIndiTotalDetailOfAssets(osiIndiTotalDetailOfAssetsId);
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
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			OsiIndiTotalDetailOfAssets> getOsiIndiTotalDetailOfAssetses(
				int start, int end) {

		return _osiIndiTotalDetailOfAssetsLocalService.
			getOsiIndiTotalDetailOfAssetses(start, end);
	}

	/**
	 * Returns the number of osi indi total detail of assetses.
	 *
	 * @return the number of osi indi total detail of assetses
	 */
	@Override
	public int getOsiIndiTotalDetailOfAssetsesCount() {
		return _osiIndiTotalDetailOfAssetsLocalService.
			getOsiIndiTotalDetailOfAssetsesCount();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _osiIndiTotalDetailOfAssetsLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		OsiIndiTotalDetailOfAssets updateOsiIndiTotalDetailOfAssets(
			com.nbp.osi.insolvency.application.form.services.model.
				OsiIndiTotalDetailOfAssets osiIndiTotalDetailOfAssets) {

		return _osiIndiTotalDetailOfAssetsLocalService.
			updateOsiIndiTotalDetailOfAssets(osiIndiTotalDetailOfAssets);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _osiIndiTotalDetailOfAssetsLocalService.getBasePersistence();
	}

	@Override
	public OsiIndiTotalDetailOfAssetsLocalService getWrappedService() {
		return _osiIndiTotalDetailOfAssetsLocalService;
	}

	@Override
	public void setWrappedService(
		OsiIndiTotalDetailOfAssetsLocalService
			osiIndiTotalDetailOfAssetsLocalService) {

		_osiIndiTotalDetailOfAssetsLocalService =
			osiIndiTotalDetailOfAssetsLocalService;
	}

	private OsiIndiTotalDetailOfAssetsLocalService
		_osiIndiTotalDetailOfAssetsLocalService;

}