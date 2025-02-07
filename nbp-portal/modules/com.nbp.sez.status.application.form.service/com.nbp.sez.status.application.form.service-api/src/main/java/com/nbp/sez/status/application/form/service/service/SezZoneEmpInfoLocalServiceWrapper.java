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

package com.nbp.sez.status.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SezZoneEmpInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmpInfoLocalService
 * @generated
 */
public class SezZoneEmpInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneEmpInfoLocalService>,
			   SezZoneEmpInfoLocalService {

	public SezZoneEmpInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneEmpInfoLocalServiceWrapper(
		SezZoneEmpInfoLocalService sezZoneEmpInfoLocalService) {

		_sezZoneEmpInfoLocalService = sezZoneEmpInfoLocalService;
	}

	/**
	 * Adds the sez zone emp info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmpInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmpInfo the sez zone emp info
	 * @return the sez zone emp info that was added
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
		addSezZoneEmpInfo(
			com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
				sezZoneEmpInfo) {

		return _sezZoneEmpInfoLocalService.addSezZoneEmpInfo(sezZoneEmpInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmpInfoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new sez zone emp info with the primary key. Does not add the sez zone emp info to the database.
	 *
	 * @param sezZoneEmpInfoId the primary key for the new sez zone emp info
	 * @return the new sez zone emp info
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
		createSezZoneEmpInfo(long sezZoneEmpInfoId) {

		return _sezZoneEmpInfoLocalService.createSezZoneEmpInfo(
			sezZoneEmpInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmpInfoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the sez zone emp info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmpInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info that was removed
	 * @throws PortalException if a sez zone emp info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
			deleteSezZoneEmpInfo(long sezZoneEmpInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmpInfoLocalService.deleteSezZoneEmpInfo(
			sezZoneEmpInfoId);
	}

	/**
	 * Deletes the sez zone emp info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmpInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmpInfo the sez zone emp info
	 * @return the sez zone emp info that was removed
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
		deleteSezZoneEmpInfo(
			com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
				sezZoneEmpInfo) {

		return _sezZoneEmpInfoLocalService.deleteSezZoneEmpInfo(sezZoneEmpInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneEmpInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneEmpInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneEmpInfoLocalService.dynamicQuery();
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

		return _sezZoneEmpInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmpInfoModelImpl</code>.
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

		return _sezZoneEmpInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmpInfoModelImpl</code>.
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

		return _sezZoneEmpInfoLocalService.dynamicQuery(
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

		return _sezZoneEmpInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _sezZoneEmpInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
		fetchSezZoneEmpInfo(long sezZoneEmpInfoId) {

		return _sezZoneEmpInfoLocalService.fetchSezZoneEmpInfo(
			sezZoneEmpInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneEmpInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneEmpInfoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneEmpInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmpInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the sez zone emp info with the primary key.
	 *
	 * @param sezZoneEmpInfoId the primary key of the sez zone emp info
	 * @return the sez zone emp info
	 * @throws PortalException if a sez zone emp info with the primary key could not be found
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
			getSezZoneEmpInfo(long sezZoneEmpInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmpInfoLocalService.getSezZoneEmpInfo(sezZoneEmpInfoId);
	}

	/**
	 * Returns a range of all the sez zone emp infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmpInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone emp infos
	 * @param end the upper bound of the range of sez zone emp infos (not inclusive)
	 * @return the range of sez zone emp infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo>
			getSezZoneEmpInfos(int start, int end) {

		return _sezZoneEmpInfoLocalService.getSezZoneEmpInfos(start, end);
	}

	/**
	 * Returns the number of sez zone emp infos.
	 *
	 * @return the number of sez zone emp infos
	 */
	@Override
	public int getSezZoneEmpInfosCount() {
		return _sezZoneEmpInfoLocalService.getSezZoneEmpInfosCount();
	}

	/**
	 * Updates the sez zone emp info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmpInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmpInfo the sez zone emp info
	 * @return the sez zone emp info that was updated
	 */
	@Override
	public com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
		updateSezZoneEmpInfo(
			com.nbp.sez.status.application.form.service.model.SezZoneEmpInfo
				sezZoneEmpInfo) {

		return _sezZoneEmpInfoLocalService.updateSezZoneEmpInfo(sezZoneEmpInfo);
	}

	@Override
	public SezZoneEmpInfoLocalService getWrappedService() {
		return _sezZoneEmpInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneEmpInfoLocalService sezZoneEmpInfoLocalService) {

		_sezZoneEmpInfoLocalService = sezZoneEmpInfoLocalService;
	}

	private SezZoneEmpInfoLocalService _sezZoneEmpInfoLocalService;

}