/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AssetsUsedAsSecurityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AssetsUsedAsSecurityLocalService
 * @generated
 */
public class AssetsUsedAsSecurityLocalServiceWrapper
	implements AssetsUsedAsSecurityLocalService,
			   ServiceWrapper<AssetsUsedAsSecurityLocalService> {

	public AssetsUsedAsSecurityLocalServiceWrapper() {
		this(null);
	}

	public AssetsUsedAsSecurityLocalServiceWrapper(
		AssetsUsedAsSecurityLocalService assetsUsedAsSecurityLocalService) {

		_assetsUsedAsSecurityLocalService = assetsUsedAsSecurityLocalService;
	}

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
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity addAssetsUsedAsSecurity(
				com.nbp.osi.insolvency.application.form.services.model.
					AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return _assetsUsedAsSecurityLocalService.addAssetsUsedAsSecurity(
			assetsUsedAsSecurity);
	}

	/**
	 * Creates a new assets used as security with the primary key. Does not add the assets used as security to the database.
	 *
	 * @param assetsUsedAsSecurityId the primary key for the new assets used as security
	 * @return the new assets used as security
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity createAssetsUsedAsSecurity(
				long assetsUsedAsSecurityId) {

		return _assetsUsedAsSecurityLocalService.createAssetsUsedAsSecurity(
			assetsUsedAsSecurityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsUsedAsSecurityLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity deleteAssetsUsedAsSecurity(
				com.nbp.osi.insolvency.application.form.services.model.
					AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return _assetsUsedAsSecurityLocalService.deleteAssetsUsedAsSecurity(
			assetsUsedAsSecurity);
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
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity deleteAssetsUsedAsSecurity(
					long assetsUsedAsSecurityId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsUsedAsSecurityLocalService.deleteAssetsUsedAsSecurity(
			assetsUsedAsSecurityId);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_assetsUsedAsSecurityLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsUsedAsSecurityLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _assetsUsedAsSecurityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _assetsUsedAsSecurityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _assetsUsedAsSecurityLocalService.dynamicQuery();
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

		return _assetsUsedAsSecurityLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _assetsUsedAsSecurityLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _assetsUsedAsSecurityLocalService.dynamicQuery(
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

		return _assetsUsedAsSecurityLocalService.dynamicQueryCount(
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

		return _assetsUsedAsSecurityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity fetchAssetsUsedAsSecurity(
				long assetsUsedAsSecurityId) {

		return _assetsUsedAsSecurityLocalService.fetchAssetsUsedAsSecurity(
			assetsUsedAsSecurityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _assetsUsedAsSecurityLocalService.getActionableDynamicQuery();
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
	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity> getAssetsUsedAsSecurities(
				int start, int end) {

		return _assetsUsedAsSecurityLocalService.getAssetsUsedAsSecurities(
			start, end);
	}

	/**
	 * Returns the number of assets used as securities.
	 *
	 * @return the number of assets used as securities
	 */
	@Override
	public int getAssetsUsedAsSecuritiesCount() {
		return _assetsUsedAsSecurityLocalService.
			getAssetsUsedAsSecuritiesCount();
	}

	/**
	 * Returns the assets used as security with the primary key.
	 *
	 * @param assetsUsedAsSecurityId the primary key of the assets used as security
	 * @return the assets used as security
	 * @throws PortalException if a assets used as security with the primary key could not be found
	 */
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity getAssetsUsedAsSecurity(
					long assetsUsedAsSecurityId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsUsedAsSecurityLocalService.getAssetsUsedAsSecurity(
			assetsUsedAsSecurityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _assetsUsedAsSecurityLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _assetsUsedAsSecurityLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.util.List
		<com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity> getOsiById(long osiInsolvencyId)
				throws com.nbp.osi.insolvency.application.form.services.
					exception.NoSuchAssetsUsedAsSecurityException {

		return _assetsUsedAsSecurityLocalService.getOsiById(osiInsolvencyId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _assetsUsedAsSecurityLocalService.getPersistedModel(
			primaryKeyObj);
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
	@Override
	public
		com.nbp.osi.insolvency.application.form.services.model.
			AssetsUsedAsSecurity updateAssetsUsedAsSecurity(
				com.nbp.osi.insolvency.application.form.services.model.
					AssetsUsedAsSecurity assetsUsedAsSecurity) {

		return _assetsUsedAsSecurityLocalService.updateAssetsUsedAsSecurity(
			assetsUsedAsSecurity);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _assetsUsedAsSecurityLocalService.getBasePersistence();
	}

	@Override
	public AssetsUsedAsSecurityLocalService getWrappedService() {
		return _assetsUsedAsSecurityLocalService;
	}

	@Override
	public void setWrappedService(
		AssetsUsedAsSecurityLocalService assetsUsedAsSecurityLocalService) {

		_assetsUsedAsSecurityLocalService = assetsUsedAsSecurityLocalService;
	}

	private AssetsUsedAsSecurityLocalService _assetsUsedAsSecurityLocalService;

}