/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisLicensePreCondtionsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePreCondtionsLocalService
 * @generated
 */
public class CannabisLicensePreCondtionsLocalServiceWrapper
	implements CannabisLicensePreCondtionsLocalService,
			   ServiceWrapper<CannabisLicensePreCondtionsLocalService> {

	public CannabisLicensePreCondtionsLocalServiceWrapper() {
		this(null);
	}

	public CannabisLicensePreCondtionsLocalServiceWrapper(
		CannabisLicensePreCondtionsLocalService
			cannabisLicensePreCondtionsLocalService) {

		_cannabisLicensePreCondtionsLocalService =
			cannabisLicensePreCondtionsLocalService;
	}

	/**
	 * Adds the cannabis license pre condtions to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePreCondtions the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisLicensePreCondtions addCannabisLicensePreCondtions(
			com.npm.cannabis.application.stages.services.model.
				CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		return _cannabisLicensePreCondtionsLocalService.
			addCannabisLicensePreCondtions(cannabisLicensePreCondtions);
	}

	/**
	 * Creates a new cannabis license pre condtions with the primary key. Does not add the cannabis license pre condtions to the database.
	 *
	 * @param cannabisPreconditionsId the primary key for the new cannabis license pre condtions
	 * @return the new cannabis license pre condtions
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisLicensePreCondtions createCannabisLicensePreCondtions(
			long cannabisPreconditionsId) {

		return _cannabisLicensePreCondtionsLocalService.
			createCannabisLicensePreCondtions(cannabisPreconditionsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePreCondtionsLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis license pre condtions from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePreCondtions the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisLicensePreCondtions deleteCannabisLicensePreCondtions(
			com.npm.cannabis.application.stages.services.model.
				CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		return _cannabisLicensePreCondtionsLocalService.
			deleteCannabisLicensePreCondtions(cannabisLicensePreCondtions);
	}

	/**
	 * Deletes the cannabis license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was removed
	 * @throws PortalException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisLicensePreCondtions deleteCannabisLicensePreCondtions(
				long cannabisPreconditionsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePreCondtionsLocalService.
			deleteCannabisLicensePreCondtions(cannabisPreconditionsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePreCondtionsLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisLicensePreCondtionsLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisLicensePreCondtionsLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisLicensePreCondtionsLocalService.dynamicQuery();
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

		return _cannabisLicensePreCondtionsLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePreCondtionsModelImpl</code>.
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

		return _cannabisLicensePreCondtionsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePreCondtionsModelImpl</code>.
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

		return _cannabisLicensePreCondtionsLocalService.dynamicQuery(
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

		return _cannabisLicensePreCondtionsLocalService.dynamicQueryCount(
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

		return _cannabisLicensePreCondtionsLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisLicensePreCondtions fetchCannabisLicensePreCondtions(
			long cannabisPreconditionsId) {

		return _cannabisLicensePreCondtionsLocalService.
			fetchCannabisLicensePreCondtions(cannabisPreconditionsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisLicensePreCondtionsLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis license pre condtions with the primary key.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis license pre condtions
	 * @return the cannabis license pre condtions
	 * @throws PortalException if a cannabis license pre condtions with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisLicensePreCondtions getCannabisLicensePreCondtions(
				long cannabisPreconditionsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePreCondtionsLocalService.
			getCannabisLicensePreCondtions(cannabisPreconditionsId);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisLicensePreCondtions> getCannabisLicensePreCondtions(
				String caseId, String licenseType) {

		return _cannabisLicensePreCondtionsLocalService.
			getCannabisLicensePreCondtions(caseId, licenseType);
	}

	/**
	 * Returns a range of all the cannabis license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license pre condtionses
	 * @param end the upper bound of the range of cannabis license pre condtionses (not inclusive)
	 * @return the range of cannabis license pre condtionses
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisLicensePreCondtions> getCannabisLicensePreCondtionses(
				int start, int end) {

		return _cannabisLicensePreCondtionsLocalService.
			getCannabisLicensePreCondtionses(start, end);
	}

	/**
	 * Returns the number of cannabis license pre condtionses.
	 *
	 * @return the number of cannabis license pre condtionses
	 */
	@Override
	public int getCannabisLicensePreCondtionsesCount() {
		return _cannabisLicensePreCondtionsLocalService.
			getCannabisLicensePreCondtionsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisLicensePreCondtionsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisLicensePreCondtionsLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisLicensePreCondtionsLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis license pre condtions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePreCondtions the cannabis license pre condtions
	 * @return the cannabis license pre condtions that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisLicensePreCondtions updateCannabisLicensePreCondtions(
			com.npm.cannabis.application.stages.services.model.
				CannabisLicensePreCondtions cannabisLicensePreCondtions) {

		return _cannabisLicensePreCondtionsLocalService.
			updateCannabisLicensePreCondtions(cannabisLicensePreCondtions);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisLicensePreCondtionsLocalService.getBasePersistence();
	}

	@Override
	public CannabisLicensePreCondtionsLocalService getWrappedService() {
		return _cannabisLicensePreCondtionsLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisLicensePreCondtionsLocalService
			cannabisLicensePreCondtionsLocalService) {

		_cannabisLicensePreCondtionsLocalService =
			cannabisLicensePreCondtionsLocalService;
	}

	private CannabisLicensePreCondtionsLocalService
		_cannabisLicensePreCondtionsLocalService;

}