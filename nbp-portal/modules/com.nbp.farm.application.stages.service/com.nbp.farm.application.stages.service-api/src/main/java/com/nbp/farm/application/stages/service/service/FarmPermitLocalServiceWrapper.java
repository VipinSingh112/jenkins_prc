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
 * Provides a wrapper for {@link FarmPermitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FarmPermitLocalService
 * @generated
 */
public class FarmPermitLocalServiceWrapper
	implements FarmPermitLocalService, ServiceWrapper<FarmPermitLocalService> {

	public FarmPermitLocalServiceWrapper() {
		this(null);
	}

	public FarmPermitLocalServiceWrapper(
		FarmPermitLocalService farmPermitLocalService) {

		_farmPermitLocalService = farmPermitLocalService;
	}

	/**
	 * Adds the farm permit to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmPermit the farm permit
	 * @return the farm permit that was added
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
		addFarmPermit(
			com.nbp.farm.application.stages.service.model.FarmPermit
				farmPermit) {

		return _farmPermitLocalService.addFarmPermit(farmPermit);
	}

	/**
	 * Creates a new farm permit with the primary key. Does not add the farm permit to the database.
	 *
	 * @param farmPermitId the primary key for the new farm permit
	 * @return the new farm permit
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
		createFarmPermit(long farmPermitId) {

		return _farmPermitLocalService.createFarmPermit(farmPermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmPermitLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the farm permit from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmPermit the farm permit
	 * @return the farm permit that was removed
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
		deleteFarmPermit(
			com.nbp.farm.application.stages.service.model.FarmPermit
				farmPermit) {

		return _farmPermitLocalService.deleteFarmPermit(farmPermit);
	}

	/**
	 * Deletes the farm permit with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit that was removed
	 * @throws PortalException if a farm permit with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
			deleteFarmPermit(long farmPermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmPermitLocalService.deleteFarmPermit(farmPermitId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmPermitLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _farmPermitLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _farmPermitLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _farmPermitLocalService.dynamicQuery();
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

		return _farmPermitLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmPermitModelImpl</code>.
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

		return _farmPermitLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmPermitModelImpl</code>.
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

		return _farmPermitLocalService.dynamicQuery(
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

		return _farmPermitLocalService.dynamicQueryCount(dynamicQuery);
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

		return _farmPermitLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
		fetchFarmPermit(long farmPermitId) {

		return _farmPermitLocalService.fetchFarmPermit(farmPermitId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _farmPermitLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
			getFarmBY_CI(String caseId)
		throws com.nbp.farm.application.stages.service.exception.
			NoSuchFarmPermitException {

		return _farmPermitLocalService.getFarmBY_CI(caseId);
	}

	/**
	 * Returns the farm permit with the primary key.
	 *
	 * @param farmPermitId the primary key of the farm permit
	 * @return the farm permit
	 * @throws PortalException if a farm permit with the primary key could not be found
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
			getFarmPermit(long farmPermitId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmPermitLocalService.getFarmPermit(farmPermitId);
	}

	/**
	 * Returns a range of all the farm permits.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.farm.application.stages.service.model.impl.FarmPermitModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm permits
	 * @param end the upper bound of the range of farm permits (not inclusive)
	 * @return the range of farm permits
	 */
	@Override
	public java.util.List
		<com.nbp.farm.application.stages.service.model.FarmPermit>
			getFarmPermits(int start, int end) {

		return _farmPermitLocalService.getFarmPermits(start, end);
	}

	/**
	 * Returns the number of farm permits.
	 *
	 * @return the number of farm permits
	 */
	@Override
	public int getFarmPermitsCount() {
		return _farmPermitLocalService.getFarmPermitsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _farmPermitLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _farmPermitLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _farmPermitLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the farm permit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FarmPermitLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param farmPermit the farm permit
	 * @return the farm permit that was updated
	 */
	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
		updateFarmPermit(
			com.nbp.farm.application.stages.service.model.FarmPermit
				farmPermit) {

		return _farmPermitLocalService.updateFarmPermit(farmPermit);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
		updateFarmPermit(
			String caseId, String PIRPermtNumber, java.util.Date dateofIssue,
			java.util.Date dateofExpiration, long docFileEntryId) {

		return _farmPermitLocalService.updateFarmPermit(
			caseId, PIRPermtNumber, dateofIssue, dateofExpiration,
			docFileEntryId);
	}

	@Override
	public com.nbp.farm.application.stages.service.model.FarmPermit
		updateFarmPermit(
			String caseId, String PIRPermtNumber, java.util.Date dateofIssue,
			java.util.Date dateofExpiration, long docFileEntryId,
			String durationOfPermit) {

		return _farmPermitLocalService.updateFarmPermit(
			caseId, PIRPermtNumber, dateofIssue, dateofExpiration,
			docFileEntryId, durationOfPermit);
	}

	@Override
	public FarmPermitLocalService getWrappedService() {
		return _farmPermitLocalService;
	}

	@Override
	public void setWrappedService(
		FarmPermitLocalService farmPermitLocalService) {

		_farmPermitLocalService = farmPermitLocalService;
	}

	private FarmPermitLocalService _farmPermitLocalService;

}