/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CannabisAppDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisAppDeskVerificationLocalService
 * @generated
 */
public class CannabisAppDeskVerificationLocalServiceWrapper
	implements CannabisAppDeskVerificationLocalService,
			   ServiceWrapper<CannabisAppDeskVerificationLocalService> {

	public CannabisAppDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public CannabisAppDeskVerificationLocalServiceWrapper(
		CannabisAppDeskVerificationLocalService
			cannabisAppDeskVerificationLocalService) {

		_cannabisAppDeskVerificationLocalService =
			cannabisAppDeskVerificationLocalService;
	}

	/**
	 * Adds the cannabis app desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisAppDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 * @return the cannabis app desk verification that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisAppDeskVerification addCannabisAppDeskVerification(
			com.npm.cannabis.application.stages.services.model.
				CannabisAppDeskVerification cannabisAppDeskVerification) {

		return _cannabisAppDeskVerificationLocalService.
			addCannabisAppDeskVerification(cannabisAppDeskVerification);
	}

	/**
	 * Creates a new cannabis app desk verification with the primary key. Does not add the cannabis app desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis app desk verification
	 * @return the new cannabis app desk verification
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisAppDeskVerification createCannabisAppDeskVerification(
			long cannabisDeskVerificationId) {

		return _cannabisAppDeskVerificationLocalService.
			createCannabisAppDeskVerification(cannabisDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisAppDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis app desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisAppDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 * @return the cannabis app desk verification that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisAppDeskVerification deleteCannabisAppDeskVerification(
			com.npm.cannabis.application.stages.services.model.
				CannabisAppDeskVerification cannabisAppDeskVerification) {

		return _cannabisAppDeskVerificationLocalService.
			deleteCannabisAppDeskVerification(cannabisAppDeskVerification);
	}

	/**
	 * Deletes the cannabis app desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisAppDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification that was removed
	 * @throws PortalException if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisAppDeskVerification deleteCannabisAppDeskVerification(
				long cannabisDeskVerificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisAppDeskVerificationLocalService.
			deleteCannabisAppDeskVerification(cannabisDeskVerificationId);
	}

	@Override
	public void deleteCannabisDV_ById(long cannabisApplicationId) {
		_cannabisAppDeskVerificationLocalService.deleteCannabisDV_ById(
			cannabisApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisAppDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisAppDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisAppDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisAppDeskVerificationLocalService.dynamicQuery();
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

		return _cannabisAppDeskVerificationLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisAppDeskVerificationModelImpl</code>.
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

		return _cannabisAppDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisAppDeskVerificationModelImpl</code>.
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

		return _cannabisAppDeskVerificationLocalService.dynamicQuery(
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

		return _cannabisAppDeskVerificationLocalService.dynamicQueryCount(
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

		return _cannabisAppDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisAppDeskVerification fetchCannabisAppDeskVerification(
			long cannabisDeskVerificationId) {

		return _cannabisAppDeskVerificationLocalService.
			fetchCannabisAppDeskVerification(cannabisDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisAppDeskVerificationLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisAppDeskVerification> getAppDeskVerificationBy_CI(
				long cannabisApplicationId) {

		return _cannabisAppDeskVerificationLocalService.
			getAppDeskVerificationBy_CI(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis app desk verification with the primary key.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification
	 * @throws PortalException if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisAppDeskVerification getCannabisAppDeskVerification(
				long cannabisDeskVerificationId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisAppDeskVerificationLocalService.
			getCannabisAppDeskVerification(cannabisDeskVerificationId);
	}

	/**
	 * Returns a range of all the cannabis app desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @return the range of cannabis app desk verifications
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisAppDeskVerification> getCannabisAppDeskVerifications(
				int start, int end) {

		return _cannabisAppDeskVerificationLocalService.
			getCannabisAppDeskVerifications(start, end);
	}

	/**
	 * Returns the number of cannabis app desk verifications.
	 *
	 * @return the number of cannabis app desk verifications
	 */
	@Override
	public int getCannabisAppDeskVerificationsCount() {
		return _cannabisAppDeskVerificationLocalService.
			getCannabisAppDeskVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisAppDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisAppDeskVerificationLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisAppDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis app desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisAppDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 * @return the cannabis app desk verification that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisAppDeskVerification updateCannabisAppDeskVerification(
			com.npm.cannabis.application.stages.services.model.
				CannabisAppDeskVerification cannabisAppDeskVerification) {

		return _cannabisAppDeskVerificationLocalService.
			updateCannabisAppDeskVerification(cannabisAppDeskVerification);
	}

	@Override
	public CannabisAppDeskVerificationLocalService getWrappedService() {
		return _cannabisAppDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisAppDeskVerificationLocalService
			cannabisAppDeskVerificationLocalService) {

		_cannabisAppDeskVerificationLocalService =
			cannabisAppDeskVerificationLocalService;
	}

	private CannabisAppDeskVerificationLocalService
		_cannabisAppDeskVerificationLocalService;

}