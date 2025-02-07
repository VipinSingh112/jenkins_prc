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

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ManuAdditionalComapnyInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ManuAdditionalComapnyInfoLocalService
 * @generated
 */
public class ManuAdditionalComapnyInfoLocalServiceWrapper
	implements ManuAdditionalComapnyInfoLocalService,
			   ServiceWrapper<ManuAdditionalComapnyInfoLocalService> {

	public ManuAdditionalComapnyInfoLocalServiceWrapper() {
		this(null);
	}

	public ManuAdditionalComapnyInfoLocalServiceWrapper(
		ManuAdditionalComapnyInfoLocalService
			manuAdditionalComapnyInfoLocalService) {

		_manuAdditionalComapnyInfoLocalService =
			manuAdditionalComapnyInfoLocalService;
	}

	/**
	 * Adds the manu additional comapny info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuAdditionalComapnyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuAdditionalComapnyInfo the manu additional comapny info
	 * @return the manu additional comapny info that was added
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalComapnyInfo addManuAdditionalComapnyInfo(
			com.nbp.manufacturing.application.form.service.model.
				ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		return _manuAdditionalComapnyInfoLocalService.
			addManuAdditionalComapnyInfo(manuAdditionalComapnyInfo);
	}

	/**
	 * Creates a new manu additional comapny info with the primary key. Does not add the manu additional comapny info to the database.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key for the new manu additional comapny info
	 * @return the new manu additional comapny info
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalComapnyInfo createManuAdditionalComapnyInfo(
			long manuAdditionalComapnyInfoId) {

		return _manuAdditionalComapnyInfoLocalService.
			createManuAdditionalComapnyInfo(manuAdditionalComapnyInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalComapnyInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the manu additional comapny info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuAdditionalComapnyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info that was removed
	 * @throws PortalException if a manu additional comapny info with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalComapnyInfo deleteManuAdditionalComapnyInfo(
				long manuAdditionalComapnyInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalComapnyInfoLocalService.
			deleteManuAdditionalComapnyInfo(manuAdditionalComapnyInfoId);
	}

	/**
	 * Deletes the manu additional comapny info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuAdditionalComapnyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuAdditionalComapnyInfo the manu additional comapny info
	 * @return the manu additional comapny info that was removed
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalComapnyInfo deleteManuAdditionalComapnyInfo(
			com.nbp.manufacturing.application.form.service.model.
				ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		return _manuAdditionalComapnyInfoLocalService.
			deleteManuAdditionalComapnyInfo(manuAdditionalComapnyInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalComapnyInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _manuAdditionalComapnyInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _manuAdditionalComapnyInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _manuAdditionalComapnyInfoLocalService.dynamicQuery();
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

		return _manuAdditionalComapnyInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalComapnyInfoModelImpl</code>.
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

		return _manuAdditionalComapnyInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalComapnyInfoModelImpl</code>.
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

		return _manuAdditionalComapnyInfoLocalService.dynamicQuery(
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

		return _manuAdditionalComapnyInfoLocalService.dynamicQueryCount(
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

		return _manuAdditionalComapnyInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalComapnyInfo fetchManuAdditionalComapnyInfo(
			long manuAdditionalComapnyInfoId) {

		return _manuAdditionalComapnyInfoLocalService.
			fetchManuAdditionalComapnyInfo(manuAdditionalComapnyInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _manuAdditionalComapnyInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _manuAdditionalComapnyInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the manu additional comapny info with the primary key.
	 *
	 * @param manuAdditionalComapnyInfoId the primary key of the manu additional comapny info
	 * @return the manu additional comapny info
	 * @throws PortalException if a manu additional comapny info with the primary key could not be found
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalComapnyInfo getManuAdditionalComapnyInfo(
				long manuAdditionalComapnyInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalComapnyInfoLocalService.
			getManuAdditionalComapnyInfo(manuAdditionalComapnyInfoId);
	}

	/**
	 * Returns a range of all the manu additional comapny infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuAdditionalComapnyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu additional comapny infos
	 * @param end the upper bound of the range of manu additional comapny infos (not inclusive)
	 * @return the range of manu additional comapny infos
	 */
	@Override
	public java.util.List
		<com.nbp.manufacturing.application.form.service.model.
			ManuAdditionalComapnyInfo> getManuAdditionalComapnyInfos(
				int start, int end) {

		return _manuAdditionalComapnyInfoLocalService.
			getManuAdditionalComapnyInfos(start, end);
	}

	/**
	 * Returns the number of manu additional comapny infos.
	 *
	 * @return the number of manu additional comapny infos
	 */
	@Override
	public int getManuAdditionalComapnyInfosCount() {
		return _manuAdditionalComapnyInfoLocalService.
			getManuAdditionalComapnyInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _manuAdditionalComapnyInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _manuAdditionalComapnyInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the manu additional comapny info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuAdditionalComapnyInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuAdditionalComapnyInfo the manu additional comapny info
	 * @return the manu additional comapny info that was updated
	 */
	@Override
	public com.nbp.manufacturing.application.form.service.model.
		ManuAdditionalComapnyInfo updateManuAdditionalComapnyInfo(
			com.nbp.manufacturing.application.form.service.model.
				ManuAdditionalComapnyInfo manuAdditionalComapnyInfo) {

		return _manuAdditionalComapnyInfoLocalService.
			updateManuAdditionalComapnyInfo(manuAdditionalComapnyInfo);
	}

	@Override
	public ManuAdditionalComapnyInfoLocalService getWrappedService() {
		return _manuAdditionalComapnyInfoLocalService;
	}

	@Override
	public void setWrappedService(
		ManuAdditionalComapnyInfoLocalService
			manuAdditionalComapnyInfoLocalService) {

		_manuAdditionalComapnyInfoLocalService =
			manuAdditionalComapnyInfoLocalService;
	}

	private ManuAdditionalComapnyInfoLocalService
		_manuAdditionalComapnyInfoLocalService;

}