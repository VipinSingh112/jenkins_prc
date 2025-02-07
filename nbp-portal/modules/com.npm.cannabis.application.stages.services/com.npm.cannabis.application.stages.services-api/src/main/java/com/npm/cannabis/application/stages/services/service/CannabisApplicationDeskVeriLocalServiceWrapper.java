/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisApplicationDeskVeriLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationDeskVeriLocalService
 * @generated
 */
public class CannabisApplicationDeskVeriLocalServiceWrapper
	implements CannabisApplicationDeskVeriLocalService,
			   ServiceWrapper<CannabisApplicationDeskVeriLocalService> {

	public CannabisApplicationDeskVeriLocalServiceWrapper() {
		this(null);
	}

	public CannabisApplicationDeskVeriLocalServiceWrapper(
		CannabisApplicationDeskVeriLocalService
			cannabisApplicationDeskVeriLocalService) {

		_cannabisApplicationDeskVeriLocalService =
			cannabisApplicationDeskVeriLocalService;
	}

	/**
	 * Adds the cannabis application desk veri to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 * @return the cannabis application desk veri that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDeskVeri addCannabisApplicationDeskVeri(
			com.npm.cannabis.application.stages.services.model.
				CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		return _cannabisApplicationDeskVeriLocalService.
			addCannabisApplicationDeskVeri(cannabisApplicationDeskVeri);
	}

	/**
	 * Creates a new cannabis application desk veri with the primary key. Does not add the cannabis application desk veri to the database.
	 *
	 * @param cannabisDeskVeriId the primary key for the new cannabis application desk veri
	 * @return the new cannabis application desk veri
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDeskVeri createCannabisApplicationDeskVeri(
			long cannabisDeskVeriId) {

		return _cannabisApplicationDeskVeriLocalService.
			createCannabisApplicationDeskVeri(cannabisDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDeskVeriLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteCannabisAppDV_ById(long cannabisApplicationId) {
		_cannabisApplicationDeskVeriLocalService.deleteCannabisAppDV_ById(
			cannabisApplicationId);
	}

	/**
	 * Deletes the cannabis application desk veri from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 * @return the cannabis application desk veri that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDeskVeri deleteCannabisApplicationDeskVeri(
			com.npm.cannabis.application.stages.services.model.
				CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		return _cannabisApplicationDeskVeriLocalService.
			deleteCannabisApplicationDeskVeri(cannabisApplicationDeskVeri);
	}

	/**
	 * Deletes the cannabis application desk veri with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri that was removed
	 * @throws PortalException if a cannabis application desk veri with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDeskVeri deleteCannabisApplicationDeskVeri(
				long cannabisDeskVeriId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDeskVeriLocalService.
			deleteCannabisApplicationDeskVeri(cannabisDeskVeriId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDeskVeriLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisApplicationDeskVeriLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisApplicationDeskVeriLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisApplicationDeskVeriLocalService.dynamicQuery();
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

		return _cannabisApplicationDeskVeriLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriModelImpl</code>.
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

		return _cannabisApplicationDeskVeriLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriModelImpl</code>.
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

		return _cannabisApplicationDeskVeriLocalService.dynamicQuery(
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

		return _cannabisApplicationDeskVeriLocalService.dynamicQueryCount(
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

		return _cannabisApplicationDeskVeriLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDeskVeri fetchCannabisApplicationDeskVeri(
			long cannabisDeskVeriId) {

		return _cannabisApplicationDeskVeriLocalService.
			fetchCannabisApplicationDeskVeri(cannabisDeskVeriId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisApplicationDeskVeriLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationDeskVeri> getApplicationDeskVerificationList(
				long cannabisApplicationId) {

		return _cannabisApplicationDeskVeriLocalService.
			getApplicationDeskVerificationList(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis application desk veri with the primary key.
	 *
	 * @param cannabisDeskVeriId the primary key of the cannabis application desk veri
	 * @return the cannabis application desk veri
	 * @throws PortalException if a cannabis application desk veri with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDeskVeri getCannabisApplicationDeskVeri(
				long cannabisDeskVeriId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDeskVeriLocalService.
			getCannabisApplicationDeskVeri(cannabisDeskVeriId);
	}

	/**
	 * Returns a range of all the cannabis application desk veris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisApplicationDeskVeriModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis application desk veris
	 * @param end the upper bound of the range of cannabis application desk veris (not inclusive)
	 * @return the range of cannabis application desk veris
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisApplicationDeskVeri> getCannabisApplicationDeskVeris(
				int start, int end) {

		return _cannabisApplicationDeskVeriLocalService.
			getCannabisApplicationDeskVeris(start, end);
	}

	/**
	 * Returns the number of cannabis application desk veris.
	 *
	 * @return the number of cannabis application desk veris
	 */
	@Override
	public int getCannabisApplicationDeskVerisCount() {
		return _cannabisApplicationDeskVeriLocalService.
			getCannabisApplicationDeskVerisCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisApplicationDeskVeriLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisApplicationDeskVeriLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisApplicationDeskVeriLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis application desk veri in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationDeskVeriLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationDeskVeri the cannabis application desk veri
	 * @return the cannabis application desk veri that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisApplicationDeskVeri updateCannabisApplicationDeskVeri(
			com.npm.cannabis.application.stages.services.model.
				CannabisApplicationDeskVeri cannabisApplicationDeskVeri) {

		return _cannabisApplicationDeskVeriLocalService.
			updateCannabisApplicationDeskVeri(cannabisApplicationDeskVeri);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisApplicationDeskVeriLocalService.getBasePersistence();
	}

	@Override
	public CannabisApplicationDeskVeriLocalService getWrappedService() {
		return _cannabisApplicationDeskVeriLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisApplicationDeskVeriLocalService
			cannabisApplicationDeskVeriLocalService) {

		_cannabisApplicationDeskVeriLocalService =
			cannabisApplicationDeskVeriLocalService;
	}

	private CannabisApplicationDeskVeriLocalService
		_cannabisApplicationDeskVeriLocalService;

}