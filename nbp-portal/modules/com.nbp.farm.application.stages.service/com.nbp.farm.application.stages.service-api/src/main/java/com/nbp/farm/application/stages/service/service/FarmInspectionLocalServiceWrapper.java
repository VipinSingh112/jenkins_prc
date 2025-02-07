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

package com.nbp.farm.application.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FarmInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmInspectionLocalService
 * @generated
 */
public class FarmInspectionLocalServiceWrapper
	implements FarmInspectionLocalService,
			   ServiceWrapper<FarmInspectionLocalService> {

	public FarmInspectionLocalServiceWrapper() {
		this(null);
	}

	public FarmInspectionLocalServiceWrapper(
		FarmInspectionLocalService farmInspectionLocalService) {

		_farmInspectionLocalService = farmInspectionLocalService;
	}

	/**
	 * Adds the farm inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmInspection the farm inspection
	 * @return the farm inspection that was added
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmInspection
		addFarmInspection(
			com.nbp.farm.application.stages.service.model.FarmInspection
				farmInspection) {

		return _farmInspectionLocalService.addFarmInspection(farmInspection);
	}

	/**
	 * Creates a new farm inspection with the primary key. Does not add the farm inspection to the database.
	 *
	 * @param farmInspectionId the primary key for the new farm inspection
	 * @return the new farm inspection
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmInspection
		createFarmInspection(long farmInspectionId) {

		return _farmInspectionLocalService.createFarmInspection(
			farmInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmInspectionLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the farm inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmInspection the farm inspection
	 * @return the farm inspection that was removed
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmInspection
		deleteFarmInspection(
			com.nbp.farm.application.stages.service.model.FarmInspection
				farmInspection) {

		return _farmInspectionLocalService.deleteFarmInspection(farmInspection);
	}

	/**
	 * Deletes the farm inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection that was removed
	 * @throws PortalException if a farm inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmInspection
			deleteFarmInspection(long farmInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmInspectionLocalService.deleteFarmInspection(
			farmInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmInspectionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmInspectionLocalService.dynamicQuery();
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

		return _farmInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmInspectionModelImpl</code>.
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

		return _farmInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmInspectionModelImpl</code>.
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

		return _farmInspectionLocalService.dynamicQuery(
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

		return _farmInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _farmInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmInspection
		fetchFarmInspection(long farmInspectionId) {

		return _farmInspectionLocalService.fetchFarmInspection(
			farmInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmInspectionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the farm inspection with the primary key.
	 *
	 * @param farmInspectionId the primary key of the farm inspection
	 * @return the farm inspection
	 * @throws PortalException if a farm inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmInspection
			getFarmInspection(long farmInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmInspectionLocalService.getFarmInspection(farmInspectionId);
	}

	/**
	 * Returns a range of all the farm inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm inspections
	 * @param end the upper bound of the range of farm inspections (not inclusive)
	 * @return the range of farm inspections
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmInspection>
			getFarmInspections(int start, int end) {

		return _farmInspectionLocalService.getFarmInspections(start, end);
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmInspection>
			getFarmInspections(long farmApplicationId) {

		return _farmInspectionLocalService.getFarmInspections(
			farmApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmInspection>
			getFarmInspectionsByCaseId(String caseId) {

		return _farmInspectionLocalService.getFarmInspectionsByCaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmInspection>
			getFarmInspectionsByStatusApplicationId(
				long farmApplicationId, String status) {

		return _farmInspectionLocalService.
			getFarmInspectionsByStatusApplicationId(farmApplicationId, status);
	}

	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmInspection>
			getFarmInspectionsByStatusCaseId(String caseId, String status) {

		return _farmInspectionLocalService.getFarmInspectionsByStatusCaseId(
			caseId, status);
	}

	/**
	 * Returns the number of farm inspections.
	 *
	 * @return the number of farm inspections
	 */
	@Override
	public int getFarmInspectionsCount() {
		return _farmInspectionLocalService.getFarmInspectionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmInspectionLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmInspection
			getInspectionByStatus_SlotBoooked(
				String status, long slotBookedByUser, long farmApplicationId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmInspectionException {

		return _farmInspectionLocalService.getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser, farmApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farm inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmInspection the farm inspection
	 * @return the farm inspection that was updated
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmInspection
		updateFarmInspection(
			com.nbp.farm.application.stages.service.model.FarmInspection
				farmInspection) {

		return _farmInspectionLocalService.updateFarmInspection(farmInspection);
	}

	@Override
	public FarmInspectionLocalService getWrappedService() {
		return _farmInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		FarmInspectionLocalService farmInspectionLocalService) {

		_farmInspectionLocalService = farmInspectionLocalService;
	}

	private FarmInspectionLocalService _farmInspectionLocalService;

}