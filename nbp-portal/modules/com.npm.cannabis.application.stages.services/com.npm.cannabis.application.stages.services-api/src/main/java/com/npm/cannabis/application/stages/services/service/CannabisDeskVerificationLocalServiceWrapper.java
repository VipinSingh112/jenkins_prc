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
 * Provides a wrapper for {@link CannabisDeskVerificationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeskVerificationLocalService
 * @generated
 */
public class CannabisDeskVerificationLocalServiceWrapper
	implements CannabisDeskVerificationLocalService,
			   ServiceWrapper<CannabisDeskVerificationLocalService> {

	public CannabisDeskVerificationLocalServiceWrapper() {
		this(null);
	}

	public CannabisDeskVerificationLocalServiceWrapper(
		CannabisDeskVerificationLocalService
			cannabisDeskVerificationLocalService) {

		_cannabisDeskVerificationLocalService =
			cannabisDeskVerificationLocalService;
	}

	/**
	 * Adds the cannabis desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeskVerification the cannabis desk verification
	 * @return the cannabis desk verification that was added
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisDeskVerification addCannabisDeskVerification(
				com.npm.cannabis.application.stages.services.model.
					CannabisDeskVerification cannabisDeskVerification) {

		return _cannabisDeskVerificationLocalService.
			addCannabisDeskVerification(cannabisDeskVerification);
	}

	/**
	 * Creates a new cannabis desk verification with the primary key. Does not add the cannabis desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis desk verification
	 * @return the new cannabis desk verification
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisDeskVerification createCannabisDeskVerification(
				long cannabisDeskVerificationId) {

		return _cannabisDeskVerificationLocalService.
			createCannabisDeskVerification(cannabisDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisDeskVerificationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeskVerification the cannabis desk verification
	 * @return the cannabis desk verification that was removed
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisDeskVerification deleteCannabisDeskVerification(
				com.npm.cannabis.application.stages.services.model.
					CannabisDeskVerification cannabisDeskVerification) {

		return _cannabisDeskVerificationLocalService.
			deleteCannabisDeskVerification(cannabisDeskVerification);
	}

	/**
	 * Deletes the cannabis desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification that was removed
	 * @throws PortalException if a cannabis desk verification with the primary key could not be found
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisDeskVerification deleteCannabisDeskVerification(
					long cannabisDeskVerificationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisDeskVerificationLocalService.
			deleteCannabisDeskVerification(cannabisDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisDeskVerificationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisDeskVerificationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisDeskVerificationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisDeskVerificationLocalService.dynamicQuery();
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

		return _cannabisDeskVerificationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisDeskVerificationModelImpl</code>.
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

		return _cannabisDeskVerificationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisDeskVerificationModelImpl</code>.
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

		return _cannabisDeskVerificationLocalService.dynamicQuery(
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

		return _cannabisDeskVerificationLocalService.dynamicQueryCount(
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

		return _cannabisDeskVerificationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisDeskVerification fetchCannabisDeskVerification(
				long cannabisDeskVerificationId) {

		return _cannabisDeskVerificationLocalService.
			fetchCannabisDeskVerification(cannabisDeskVerificationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisDeskVerificationLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis desk verification with the primary key.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification
	 * @throws PortalException if a cannabis desk verification with the primary key could not be found
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisDeskVerification getCannabisDeskVerification(
					long cannabisDeskVerificationId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisDeskVerificationLocalService.
			getCannabisDeskVerification(cannabisDeskVerificationId);
	}

	/**
	 * Returns a range of all the cannabis desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @return the range of cannabis desk verifications
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.
			CannabisDeskVerification> getCannabisDeskVerifications(
				int start, int end) {

		return _cannabisDeskVerificationLocalService.
			getCannabisDeskVerifications(start, end);
	}

	/**
	 * Returns the number of cannabis desk verifications.
	 *
	 * @return the number of cannabis desk verifications
	 */
	@Override
	public int getCannabisDeskVerificationsCount() {
		return _cannabisDeskVerificationLocalService.
			getCannabisDeskVerificationsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisDeskVerificationLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisDeskVerificationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisDeskVerificationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the cannabis desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeskVerification the cannabis desk verification
	 * @return the cannabis desk verification that was updated
	 */
	@Override
	public
		com.npm.cannabis.application.stages.services.model.
			CannabisDeskVerification updateCannabisDeskVerification(
				com.npm.cannabis.application.stages.services.model.
					CannabisDeskVerification cannabisDeskVerification) {

		return _cannabisDeskVerificationLocalService.
			updateCannabisDeskVerification(cannabisDeskVerification);
	}

	@Override
	public CannabisDeskVerificationLocalService getWrappedService() {
		return _cannabisDeskVerificationLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisDeskVerificationLocalService
			cannabisDeskVerificationLocalService) {

		_cannabisDeskVerificationLocalService =
			cannabisDeskVerificationLocalService;
	}

	private CannabisDeskVerificationLocalService
		_cannabisDeskVerificationLocalService;

}