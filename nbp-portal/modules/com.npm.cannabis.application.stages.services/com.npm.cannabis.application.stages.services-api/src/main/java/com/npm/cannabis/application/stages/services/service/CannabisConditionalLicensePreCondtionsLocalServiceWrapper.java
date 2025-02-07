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
 * Provides a wrapper for {@link CannabisConditionalLicensePreCondtionsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConditionalLicensePreCondtionsLocalService
 * @generated
 */
public class CannabisConditionalLicensePreCondtionsLocalServiceWrapper
	implements CannabisConditionalLicensePreCondtionsLocalService,
			   ServiceWrapper
				   <CannabisConditionalLicensePreCondtionsLocalService> {

	public CannabisConditionalLicensePreCondtionsLocalServiceWrapper() {
		this(null);
	}

	public CannabisConditionalLicensePreCondtionsLocalServiceWrapper(
		CannabisConditionalLicensePreCondtionsLocalService
			cannabisConditionalLicensePreCondtionsLocalService) {

		_cannabisConditionalLicensePreCondtionsLocalService =
			cannabisConditionalLicensePreCondtionsLocalService;
	}

	/**
	 * Adds the cannabis conditional license pre condtions to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicensePreCondtions the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicensePreCondtions
			addCannabisConditionalLicensePreCondtions(
				com.npm.cannabis.application.stages.services.model.
					CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions) {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			addCannabisConditionalLicensePreCondtions(
				cannabisConditionalLicensePreCondtions);
	}

	/**
	 * Creates a new cannabis conditional license pre condtions with the primary key. Does not add the cannabis conditional license pre condtions to the database.
	 *
	 * @param cannabisPreconditionsId the primary key for the new cannabis conditional license pre condtions
	 * @return the new cannabis conditional license pre condtions
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicensePreCondtions
			createCannabisConditionalLicensePreCondtions(
				long cannabisPreconditionsId) {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			createCannabisConditionalLicensePreCondtions(
				cannabisPreconditionsId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the cannabis conditional license pre condtions from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicensePreCondtions the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicensePreCondtions
			deleteCannabisConditionalLicensePreCondtions(
				com.npm.cannabis.application.stages.services.model.
					CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions) {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			deleteCannabisConditionalLicensePreCondtions(
				cannabisConditionalLicensePreCondtions);
	}

	/**
	 * Deletes the cannabis conditional license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions that was removed
	 * @throws PortalException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicensePreCondtions
				deleteCannabisConditionalLicensePreCondtions(
					long cannabisPreconditionsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			deleteCannabisConditionalLicensePreCondtions(
				cannabisPreconditionsId);
	}

	@Override
	public void deleteCannabisConditionalLicensePreCondtions(String caseId) {
		_cannabisConditionalLicensePreCondtionsLocalService.
			deleteCannabisConditionalLicensePreCondtions(caseId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisConditionalLicensePreCondtionsLocalService.dslQuery(
			dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisConditionalLicensePreCondtionsLocalService.
			dynamicQuery();
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

		return _cannabisConditionalLicensePreCondtionsLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsModelImpl</code>.
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

		return _cannabisConditionalLicensePreCondtionsLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsModelImpl</code>.
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

		return _cannabisConditionalLicensePreCondtionsLocalService.dynamicQuery(
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

		return _cannabisConditionalLicensePreCondtionsLocalService.
			dynamicQueryCount(dynamicQuery);
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

		return _cannabisConditionalLicensePreCondtionsLocalService.
			dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicensePreCondtions
			fetchCannabisConditionalLicensePreCondtions(
				long cannabisPreconditionsId) {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			fetchCannabisConditionalLicensePreCondtions(
				cannabisPreconditionsId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis conditional license pre condtions with the primary key.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions
	 * @throws PortalException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicensePreCondtions
				getCannabisConditionalLicensePreCondtions(
					long cannabisPreconditionsId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			getCannabisConditionalLicensePreCondtions(cannabisPreconditionsId);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisConditionalLicensePreCondtions>
				getCannabisConditionalLicensePreCondtions(String caseId) {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			getCannabisConditionalLicensePreCondtions(caseId);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of cannabis conditional license pre condtionses
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisConditionalLicensePreCondtions>
				getCannabisConditionalLicensePreCondtionses(
					int start, int end) {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			getCannabisConditionalLicensePreCondtionses(start, end);
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses.
	 *
	 * @return the number of cannabis conditional license pre condtionses
	 */
	@Override
	public int getCannabisConditionalLicensePreCondtionsesCount() {
		return _cannabisConditionalLicensePreCondtionsLocalService.
			getCannabisConditionalLicensePreCondtionsesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisConditionalLicensePreCondtionsLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cannabis conditional license pre condtions in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConditionalLicensePreCondtionsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConditionalLicensePreCondtions the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.
		CannabisConditionalLicensePreCondtions
			updateCannabisConditionalLicensePreCondtions(
				com.npm.cannabis.application.stages.services.model.
					CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions) {

		return _cannabisConditionalLicensePreCondtionsLocalService.
			updateCannabisConditionalLicensePreCondtions(
				cannabisConditionalLicensePreCondtions);
	}

	@Override
	public CannabisConditionalLicensePreCondtionsLocalService
		getWrappedService() {

		return _cannabisConditionalLicensePreCondtionsLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisConditionalLicensePreCondtionsLocalService
			cannabisConditionalLicensePreCondtionsLocalService) {

		_cannabisConditionalLicensePreCondtionsLocalService =
			cannabisConditionalLicensePreCondtionsLocalService;
	}

	private CannabisConditionalLicensePreCondtionsLocalService
		_cannabisConditionalLicensePreCondtionsLocalService;

}