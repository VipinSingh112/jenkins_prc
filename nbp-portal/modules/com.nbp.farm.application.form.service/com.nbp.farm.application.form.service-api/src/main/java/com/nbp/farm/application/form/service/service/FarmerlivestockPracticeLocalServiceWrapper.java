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

package com.nbp.farm.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FarmerlivestockPracticeLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerlivestockPracticeLocalService
 * @generated
 */
public class FarmerlivestockPracticeLocalServiceWrapper
	implements FarmerlivestockPracticeLocalService,
			   ServiceWrapper<FarmerlivestockPracticeLocalService> {

	public FarmerlivestockPracticeLocalServiceWrapper() {
		this(null);
	}

	public FarmerlivestockPracticeLocalServiceWrapper(
		FarmerlivestockPracticeLocalService
			farmerlivestockPracticeLocalService) {

		_farmerlivestockPracticeLocalService =
			farmerlivestockPracticeLocalService;
	}

	/**
	 * Adds the farmerlivestock practice to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerlivestockPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerlivestockPractice the farmerlivestock practice
	 * @return the farmerlivestock practice that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerlivestockPractice
		addFarmerlivestockPractice(
			com.nbp.farm.application.form.service.model.FarmerlivestockPractice
				farmerlivestockPractice) {

		return _farmerlivestockPracticeLocalService.addFarmerlivestockPractice(
			farmerlivestockPractice);
	}

	/**
	 * Creates a new farmerlivestock practice with the primary key. Does not add the farmerlivestock practice to the database.
	 *
	 * @param farmerLivestockPracticeId the primary key for the new farmerlivestock practice
	 * @return the new farmerlivestock practice
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerlivestockPractice
		createFarmerlivestockPractice(long farmerLivestockPracticeId) {

		return _farmerlivestockPracticeLocalService.
			createFarmerlivestockPractice(farmerLivestockPracticeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerlivestockPracticeLocalService.createPersistedModel(
			primaryKeyObj);
	}

	@Override
	public void deleteBY_Id(long applicationId) {
		_farmerlivestockPracticeLocalService.deleteBY_Id(applicationId);
	}

	/**
	 * Deletes the farmerlivestock practice from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerlivestockPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerlivestockPractice the farmerlivestock practice
	 * @return the farmerlivestock practice that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerlivestockPractice
		deleteFarmerlivestockPractice(
			com.nbp.farm.application.form.service.model.FarmerlivestockPractice
				farmerlivestockPractice) {

		return _farmerlivestockPracticeLocalService.
			deleteFarmerlivestockPractice(farmerlivestockPractice);
	}

	/**
	 * Deletes the farmerlivestock practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerlivestockPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice that was removed
	 * @throws PortalException if a farmerlivestock practice with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerlivestockPractice
			deleteFarmerlivestockPractice(long farmerLivestockPracticeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerlivestockPracticeLocalService.
			deleteFarmerlivestockPractice(farmerLivestockPracticeId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerlivestockPracticeLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerlivestockPracticeLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerlivestockPracticeLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerlivestockPracticeLocalService.dynamicQuery();
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

		return _farmerlivestockPracticeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerlivestockPracticeModelImpl</code>.
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

		return _farmerlivestockPracticeLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerlivestockPracticeModelImpl</code>.
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

		return _farmerlivestockPracticeLocalService.dynamicQuery(
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

		return _farmerlivestockPracticeLocalService.dynamicQueryCount(
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

		return _farmerlivestockPracticeLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerlivestockPractice
		fetchFarmerlivestockPractice(long farmerLivestockPracticeId) {

		return _farmerlivestockPracticeLocalService.
			fetchFarmerlivestockPractice(farmerLivestockPracticeId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerlivestockPracticeLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerlivestockPractice>
			getFA_FLSP_FAI(long ApplicationId) {

		return _farmerlivestockPracticeLocalService.getFA_FLSP_FAI(
			ApplicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerlivestockPractice
		getFarmerById(long ApplicationId) {

		return _farmerlivestockPracticeLocalService.getFarmerById(
			ApplicationId);
	}

	/**
	 * Returns the farmerlivestock practice with the primary key.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice
	 * @throws PortalException if a farmerlivestock practice with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerlivestockPractice
			getFarmerlivestockPractice(long farmerLivestockPracticeId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerlivestockPracticeLocalService.getFarmerlivestockPractice(
			farmerLivestockPracticeId);
	}

	/**
	 * Returns a range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @return the range of farmerlivestock practices
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerlivestockPractice>
			getFarmerlivestockPractices(int start, int end) {

		return _farmerlivestockPracticeLocalService.getFarmerlivestockPractices(
			start, end);
	}

	/**
	 * Returns the number of farmerlivestock practices.
	 *
	 * @return the number of farmerlivestock practices
	 */
	@Override
	public int getFarmerlivestockPracticesCount() {
		return _farmerlivestockPracticeLocalService.
			getFarmerlivestockPracticesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerlivestockPracticeLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerlivestockPracticeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerlivestockPracticeLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the farmerlivestock practice in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerlivestockPracticeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerlivestockPractice the farmerlivestock practice
	 * @return the farmerlivestock practice that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerlivestockPractice
		updateFarmerlivestockPractice(
			com.nbp.farm.application.form.service.model.FarmerlivestockPractice
				farmerlivestockPractice) {

		return _farmerlivestockPracticeLocalService.
			updateFarmerlivestockPractice(farmerlivestockPractice);
	}

	@Override
	public FarmerlivestockPracticeLocalService getWrappedService() {
		return _farmerlivestockPracticeLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerlivestockPracticeLocalService
			farmerlivestockPracticeLocalService) {

		_farmerlivestockPracticeLocalService =
			farmerlivestockPracticeLocalService;
	}

	private FarmerlivestockPracticeLocalService
		_farmerlivestockPracticeLocalService;

}