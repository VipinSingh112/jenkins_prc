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
 * Provides a wrapper for {@link FarmerStakeholderInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmerStakeholderInfoLocalService
 * @generated
 */
public class FarmerStakeholderInfoLocalServiceWrapper
	implements FarmerStakeholderInfoLocalService,
			   ServiceWrapper<FarmerStakeholderInfoLocalService> {

	public FarmerStakeholderInfoLocalServiceWrapper() {
		this(null);
	}

	public FarmerStakeholderInfoLocalServiceWrapper(
		FarmerStakeholderInfoLocalService farmerStakeholderInfoLocalService) {

		_farmerStakeholderInfoLocalService = farmerStakeholderInfoLocalService;
	}

	/**
	 * Adds the farmer stakeholder info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 * @return the farmer stakeholder info that was added
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
		addFarmerStakeholderInfo(
			com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
				farmerStakeholderInfo) {

		return _farmerStakeholderInfoLocalService.addFarmerStakeholderInfo(
			farmerStakeholderInfo);
	}

	/**
	 * Creates a new farmer stakeholder info with the primary key. Does not add the farmer stakeholder info to the database.
	 *
	 * @param farmerStakeholderInfoId the primary key for the new farmer stakeholder info
	 * @return the new farmer stakeholder info
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
		createFarmerStakeholderInfo(long farmerStakeholderInfoId) {

		return _farmerStakeholderInfoLocalService.createFarmerStakeholderInfo(
			farmerStakeholderInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the farmer stakeholder info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 * @return the farmer stakeholder info that was removed
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
		deleteFarmerStakeholderInfo(
			com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
				farmerStakeholderInfo) {

		return _farmerStakeholderInfoLocalService.deleteFarmerStakeholderInfo(
			farmerStakeholderInfo);
	}

	/**
	 * Deletes the farmer stakeholder info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info that was removed
	 * @throws PortalException if a farmer stakeholder info with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
			deleteFarmerStakeholderInfo(long farmerStakeholderInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderInfoLocalService.deleteFarmerStakeholderInfo(
			farmerStakeholderInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmerStakeholderInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmerStakeholderInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmerStakeholderInfoLocalService.dynamicQuery();
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

		return _farmerStakeholderInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderInfoModelImpl</code>.
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

		return _farmerStakeholderInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderInfoModelImpl</code>.
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

		return _farmerStakeholderInfoLocalService.dynamicQuery(
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

		return _farmerStakeholderInfoLocalService.dynamicQueryCount(
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

		return _farmerStakeholderInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
		fetchBygetFA_FSH_by_AppId(long ApplicationId) {

		return _farmerStakeholderInfoLocalService.fetchBygetFA_FSH_by_AppId(
			ApplicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
		fetchFarmerStakeholderInfo(long farmerStakeholderInfoId) {

		return _farmerStakeholderInfoLocalService.fetchFarmerStakeholderInfo(
			farmerStakeholderInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmerStakeholderInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerStakeholderInfo>
			getFA_SH_FAI(long ApplicationId) {

		return _farmerStakeholderInfoLocalService.getFA_SH_FAI(ApplicationId);
	}

	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
		getFarmerById(long ApplicationId) {

		return _farmerStakeholderInfoLocalService.getFarmerById(ApplicationId);
	}

	/**
	 * Returns the farmer stakeholder info with the primary key.
	 *
	 * @param farmerStakeholderInfoId the primary key of the farmer stakeholder info
	 * @return the farmer stakeholder info
	 * @throws PortalException if a farmer stakeholder info with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
			getFarmerStakeholderInfo(long farmerStakeholderInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderInfoLocalService.getFarmerStakeholderInfo(
			farmerStakeholderInfoId);
	}

	/**
	 * Returns a range of all the farmer stakeholder infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.form.service.model.impl.FarmerStakeholderInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder infos
	 * @param end the upper bound of the range of farmer stakeholder infos (not inclusive)
	 * @return the range of farmer stakeholder infos
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.form.service.model.FarmerStakeholderInfo>
			getFarmerStakeholderInfos(int start, int end) {

		return _farmerStakeholderInfoLocalService.getFarmerStakeholderInfos(
			start, end);
	}

	/**
	 * Returns the number of farmer stakeholder infos.
	 *
	 * @return the number of farmer stakeholder infos
	 */
	@Override
	public int getFarmerStakeholderInfosCount() {
		return _farmerStakeholderInfoLocalService.
			getFarmerStakeholderInfosCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmerStakeholderInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmerStakeholderInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmerStakeholderInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the farmer stakeholder info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmerStakeholderInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmerStakeholderInfo the farmer stakeholder info
	 * @return the farmer stakeholder info that was updated
	 */
	@Override
	public com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
		updateFarmerStakeholderInfo(
			com.nbp.farm.application.form.service.model.FarmerStakeholderInfo
				farmerStakeholderInfo) {

		return _farmerStakeholderInfoLocalService.updateFarmerStakeholderInfo(
			farmerStakeholderInfo);
	}

	@Override
	public FarmerStakeholderInfoLocalService getWrappedService() {
		return _farmerStakeholderInfoLocalService;
	}

	@Override
	public void setWrappedService(
		FarmerStakeholderInfoLocalService farmerStakeholderInfoLocalService) {

		_farmerStakeholderInfoLocalService = farmerStakeholderInfoLocalService;
	}

	private FarmerStakeholderInfoLocalService
		_farmerStakeholderInfoLocalService;

}