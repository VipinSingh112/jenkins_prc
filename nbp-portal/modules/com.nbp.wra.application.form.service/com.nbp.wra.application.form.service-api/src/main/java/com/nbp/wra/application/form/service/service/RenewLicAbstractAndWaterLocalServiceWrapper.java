/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link RenewLicAbstractAndWaterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWaterLocalService
 * @generated
 */
public class RenewLicAbstractAndWaterLocalServiceWrapper
	implements RenewLicAbstractAndWaterLocalService,
			   ServiceWrapper<RenewLicAbstractAndWaterLocalService> {

	public RenewLicAbstractAndWaterLocalServiceWrapper() {
		this(null);
	}

	public RenewLicAbstractAndWaterLocalServiceWrapper(
		RenewLicAbstractAndWaterLocalService
			renewLicAbstractAndWaterLocalService) {

		_renewLicAbstractAndWaterLocalService =
			renewLicAbstractAndWaterLocalService;
	}

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
	@Override
	public com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
		addRenewLicAbstractAndWater(
			com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
				renewLicAbstractAndWater) {

		return _renewLicAbstractAndWaterLocalService.
			addRenewLicAbstractAndWater(renewLicAbstractAndWater);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _renewLicAbstractAndWaterLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new renew lic abstract and water with the primary key. Does not add the renew lic abstract and water to the database.
	 *
	 * @param renewLicAbstractAndWaterId the primary key for the new renew lic abstract and water
	 * @return the new renew lic abstract and water
	 */
	@Override
	public com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
		createRenewLicAbstractAndWater(long renewLicAbstractAndWaterId) {

		return _renewLicAbstractAndWaterLocalService.
			createRenewLicAbstractAndWater(renewLicAbstractAndWaterId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _renewLicAbstractAndWaterLocalService.deletePersistedModel(
			persistedModel);
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
	@Override
	public com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
			deleteRenewLicAbstractAndWater(long renewLicAbstractAndWaterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _renewLicAbstractAndWaterLocalService.
			deleteRenewLicAbstractAndWater(renewLicAbstractAndWaterId);
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
	@Override
	public com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
		deleteRenewLicAbstractAndWater(
			com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
				renewLicAbstractAndWater) {

		return _renewLicAbstractAndWaterLocalService.
			deleteRenewLicAbstractAndWater(renewLicAbstractAndWater);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _renewLicAbstractAndWaterLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _renewLicAbstractAndWaterLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _renewLicAbstractAndWaterLocalService.dynamicQuery();
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

		return _renewLicAbstractAndWaterLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _renewLicAbstractAndWaterLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _renewLicAbstractAndWaterLocalService.dynamicQuery(
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

		return _renewLicAbstractAndWaterLocalService.dynamicQueryCount(
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

		return _renewLicAbstractAndWaterLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
		fetchRenewLicAbstractAndWater(long renewLicAbstractAndWaterId) {

		return _renewLicAbstractAndWaterLocalService.
			fetchRenewLicAbstractAndWater(renewLicAbstractAndWaterId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _renewLicAbstractAndWaterLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _renewLicAbstractAndWaterLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _renewLicAbstractAndWaterLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _renewLicAbstractAndWaterLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the renew lic abstract and water with the primary key.
	 *
	 * @param renewLicAbstractAndWaterId the primary key of the renew lic abstract and water
	 * @return the renew lic abstract and water
	 * @throws PortalException if a renew lic abstract and water with the primary key could not be found
	 */
	@Override
	public com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
			getRenewLicAbstractAndWater(long renewLicAbstractAndWaterId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _renewLicAbstractAndWaterLocalService.
			getRenewLicAbstractAndWater(renewLicAbstractAndWaterId);
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
	@Override
	public java.util.List
		<com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater>
			getRenewLicAbstractAndWaters(int start, int end) {

		return _renewLicAbstractAndWaterLocalService.
			getRenewLicAbstractAndWaters(start, end);
	}

	/**
	 * Returns the number of renew lic abstract and waters.
	 *
	 * @return the number of renew lic abstract and waters
	 */
	@Override
	public int getRenewLicAbstractAndWatersCount() {
		return _renewLicAbstractAndWaterLocalService.
			getRenewLicAbstractAndWatersCount();
	}

	@Override
	public com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
			getWRA_By_Id(long wraApplicationId)
		throws com.nbp.wra.application.form.service.exception.
			NoSuchRenewLicAbstractAndWaterException {

		return _renewLicAbstractAndWaterLocalService.getWRA_By_Id(
			wraApplicationId);
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
	@Override
	public com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
		updateRenewLicAbstractAndWater(
			com.nbp.wra.application.form.service.model.RenewLicAbstractAndWater
				renewLicAbstractAndWater) {

		return _renewLicAbstractAndWaterLocalService.
			updateRenewLicAbstractAndWater(renewLicAbstractAndWater);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _renewLicAbstractAndWaterLocalService.getBasePersistence();
	}

	@Override
	public RenewLicAbstractAndWaterLocalService getWrappedService() {
		return _renewLicAbstractAndWaterLocalService;
	}

	@Override
	public void setWrappedService(
		RenewLicAbstractAndWaterLocalService
			renewLicAbstractAndWaterLocalService) {

		_renewLicAbstractAndWaterLocalService =
			renewLicAbstractAndWaterLocalService;
	}

	private RenewLicAbstractAndWaterLocalService
		_renewLicAbstractAndWaterLocalService;

}