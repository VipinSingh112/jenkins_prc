/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AssetsNotUsedAsSecurityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsNotUsedAsSecurityLocalService
 * @generated
 */
public class AssetsNotUsedAsSecurityLocalServiceWrapper
	implements AssetsNotUsedAsSecurityLocalService,
			   ServiceWrapper<AssetsNotUsedAsSecurityLocalService> {

	public AssetsNotUsedAsSecurityLocalServiceWrapper() {
		this(null);
	}

	public AssetsNotUsedAsSecurityLocalServiceWrapper(
		AssetsNotUsedAsSecurityLocalService
			assetsNotUsedAsSecurityLocalService) {

		_assetsNotUsedAsSecurityLocalService =
			assetsNotUsedAsSecurityLocalService;
	}

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
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssetsNotUsedAsSecurity addAssetsNotUsedAsSecurity(
			com.nbp.osi.insolvency.application.form.services.model.
				AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return _assetsNotUsedAsSecurityLocalService.addAssetsNotUsedAsSecurity(
			assetsNotUsedAsSecurity);
	}

	/**
	 * Creates a new assets not used as security with the primary key. Does not add the assets not used as security to the database.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key for the new assets not used as security
	 * @return the new assets not used as security
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssetsNotUsedAsSecurity createAssetsNotUsedAsSecurity(
			long assetsNotUsedAsSecurityId) {

		return _assetsNotUsedAsSecurityLocalService.
			createAssetsNotUsedAsSecurity(assetsNotUsedAsSecurityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsNotUsedAsSecurityLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssetsNotUsedAsSecurity deleteAssetsNotUsedAsSecurity(
			com.nbp.osi.insolvency.application.form.services.model.
				AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return _assetsNotUsedAsSecurityLocalService.
			deleteAssetsNotUsedAsSecurity(assetsNotUsedAsSecurity);
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
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssetsNotUsedAsSecurity deleteAssetsNotUsedAsSecurity(
				long assetsNotUsedAsSecurityId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsNotUsedAsSecurityLocalService.
			deleteAssetsNotUsedAsSecurity(assetsNotUsedAsSecurityId);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_assetsNotUsedAsSecurityLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsNotUsedAsSecurityLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _assetsNotUsedAsSecurityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _assetsNotUsedAsSecurityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetsNotUsedAsSecurityLocalService.dynamicQuery();
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

		return _assetsNotUsedAsSecurityLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _assetsNotUsedAsSecurityLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _assetsNotUsedAsSecurityLocalService.dynamicQuery(
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

		return _assetsNotUsedAsSecurityLocalService.dynamicQueryCount(
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

		return _assetsNotUsedAsSecurityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssetsNotUsedAsSecurity fetchAssetsNotUsedAsSecurity(
			long assetsNotUsedAsSecurityId) {

		return _assetsNotUsedAsSecurityLocalService.
			fetchAssetsNotUsedAsSecurity(assetsNotUsedAsSecurityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _assetsNotUsedAsSecurityLocalService.getActionableDynamicQuery();
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
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			AssetsNotUsedAsSecurity> getAssetsNotUsedAsSecurities(
				int start, int end) {

		return _assetsNotUsedAsSecurityLocalService.
			getAssetsNotUsedAsSecurities(start, end);
	}

	/**
	 * Returns the number of assets not used as securities.
	 *
	 * @return the number of assets not used as securities
	 */
	@Override
	public int getAssetsNotUsedAsSecuritiesCount() {
		return _assetsNotUsedAsSecurityLocalService.
			getAssetsNotUsedAsSecuritiesCount();
	}

	/**
	 * Returns the assets not used as security with the primary key.
	 *
	 * @param assetsNotUsedAsSecurityId the primary key of the assets not used as security
	 * @return the assets not used as security
	 * @throws PortalException if a assets not used as security with the primary key could not be found
	 */
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssetsNotUsedAsSecurity getAssetsNotUsedAsSecurity(
				long assetsNotUsedAsSecurityId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsNotUsedAsSecurityLocalService.getAssetsNotUsedAsSecurity(
			assetsNotUsedAsSecurityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _assetsNotUsedAsSecurityLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assetsNotUsedAsSecurityLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			AssetsNotUsedAsSecurity> getOsiById(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchAssetsNotUsedAsSecurityException {

		return _assetsNotUsedAsSecurityLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsNotUsedAsSecurityLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public com.nbp.osi.insolvency.application.form.services.model.
		AssetsNotUsedAsSecurity updateAssetsNotUsedAsSecurity(
			com.nbp.osi.insolvency.application.form.services.model.
				AssetsNotUsedAsSecurity assetsNotUsedAsSecurity) {

		return _assetsNotUsedAsSecurityLocalService.
			updateAssetsNotUsedAsSecurity(assetsNotUsedAsSecurity);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _assetsNotUsedAsSecurityLocalService.getBasePersistence();
	}

	@Override
	public AssetsNotUsedAsSecurityLocalService getWrappedService() {
		return _assetsNotUsedAsSecurityLocalService;
	}

	@Override
	public void setWrappedService(
		AssetsNotUsedAsSecurityLocalService
			assetsNotUsedAsSecurityLocalService) {

		_assetsNotUsedAsSecurityLocalService =
			assetsNotUsedAsSecurityLocalService;
	}

	private AssetsNotUsedAsSecurityLocalService
		_assetsNotUsedAsSecurityLocalService;

}