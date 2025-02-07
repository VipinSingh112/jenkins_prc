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
 * Provides a wrapper for {@link SezZoneEmploymentInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneEmploymentInfoLocalService
 * @generated
 */
public class SezZoneEmploymentInfoLocalServiceWrapper
	implements ServiceWrapper<SezZoneEmploymentInfoLocalService>,
			   SezZoneEmploymentInfoLocalService {

	public SezZoneEmploymentInfoLocalServiceWrapper() {
		this(null);
	}

	public SezZoneEmploymentInfoLocalServiceWrapper(
		SezZoneEmploymentInfoLocalService sezZoneEmploymentInfoLocalService) {

		_sezZoneEmploymentInfoLocalService = sezZoneEmploymentInfoLocalService;
	}

	/**
	 * Adds the sez zone employment info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmploymentInfo the sez zone employment info
	 * @return the sez zone employment info that was added
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneEmploymentInfo
			addSezZoneEmploymentInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneEmploymentInfo sezZoneEmploymentInfo) {

		return _sezZoneEmploymentInfoLocalService.addSezZoneEmploymentInfo(
			sezZoneEmploymentInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmploymentInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new sez zone employment info with the primary key. Does not add the sez zone employment info to the database.
	 *
	 * @param sezZoneEmploymentInfoId the primary key for the new sez zone employment info
	 * @return the new sez zone employment info
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneEmploymentInfo
			createSezZoneEmploymentInfo(long sezZoneEmploymentInfoId) {

		return _sezZoneEmploymentInfoLocalService.createSezZoneEmploymentInfo(
			sezZoneEmploymentInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmploymentInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the sez zone employment info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmploymentInfoId the primary key of the sez zone employment info
	 * @return the sez zone employment info that was removed
	 * @throws PortalException if a sez zone employment info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneEmploymentInfo
				deleteSezZoneEmploymentInfo(long sezZoneEmploymentInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmploymentInfoLocalService.deleteSezZoneEmploymentInfo(
			sezZoneEmploymentInfoId);
	}

	/**
	 * Deletes the sez zone employment info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmploymentInfo the sez zone employment info
	 * @return the sez zone employment info that was removed
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneEmploymentInfo
			deleteSezZoneEmploymentInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneEmploymentInfo sezZoneEmploymentInfo) {

		return _sezZoneEmploymentInfoLocalService.deleteSezZoneEmploymentInfo(
			sezZoneEmploymentInfo);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _sezZoneEmploymentInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _sezZoneEmploymentInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _sezZoneEmploymentInfoLocalService.dynamicQuery();
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

		return _sezZoneEmploymentInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmploymentInfoModelImpl</code>.
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

		return _sezZoneEmploymentInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmploymentInfoModelImpl</code>.
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

		return _sezZoneEmploymentInfoLocalService.dynamicQuery(
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

		return _sezZoneEmploymentInfoLocalService.dynamicQueryCount(
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

		return _sezZoneEmploymentInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneEmploymentInfo
			fetchSezZoneEmploymentInfo(long sezZoneEmploymentInfoId) {

		return _sezZoneEmploymentInfoLocalService.fetchSezZoneEmploymentInfo(
			sezZoneEmploymentInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _sezZoneEmploymentInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _sezZoneEmploymentInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _sezZoneEmploymentInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmploymentInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the sez zone employment info with the primary key.
	 *
	 * @param sezZoneEmploymentInfoId the primary key of the sez zone employment info
	 * @return the sez zone employment info
	 * @throws PortalException if a sez zone employment info with the primary key could not be found
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneEmploymentInfo
				getSezZoneEmploymentInfo(long sezZoneEmploymentInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _sezZoneEmploymentInfoLocalService.getSezZoneEmploymentInfo(
			sezZoneEmploymentInfoId);
	}

	/**
	 * Returns a range of all the sez zone employment infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneEmploymentInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez zone employment infos
	 * @param end the upper bound of the range of sez zone employment infos (not inclusive)
	 * @return the range of sez zone employment infos
	 */
	@Override
	public java.util.List
		<com.nbp.sez.status.application.form.service.model.
			SezZoneEmploymentInfo> getSezZoneEmploymentInfos(
				int start, int end) {

		return _sezZoneEmploymentInfoLocalService.getSezZoneEmploymentInfos(
			start, end);
	}

	/**
	 * Returns the number of sez zone employment infos.
	 *
	 * @return the number of sez zone employment infos
	 */
	@Override
	public int getSezZoneEmploymentInfosCount() {
		return _sezZoneEmploymentInfoLocalService.
			getSezZoneEmploymentInfosCount();
	}

	/**
	 * Updates the sez zone employment info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezZoneEmploymentInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezZoneEmploymentInfo the sez zone employment info
	 * @return the sez zone employment info that was updated
	 */
	@Override
	public
		com.nbp.sez.status.application.form.service.model.SezZoneEmploymentInfo
			updateSezZoneEmploymentInfo(
				com.nbp.sez.status.application.form.service.model.
					SezZoneEmploymentInfo sezZoneEmploymentInfo) {

		return _sezZoneEmploymentInfoLocalService.updateSezZoneEmploymentInfo(
			sezZoneEmploymentInfo);
	}

	@Override
	public SezZoneEmploymentInfoLocalService getWrappedService() {
		return _sezZoneEmploymentInfoLocalService;
	}

	@Override
	public void setWrappedService(
		SezZoneEmploymentInfoLocalService sezZoneEmploymentInfoLocalService) {

		_sezZoneEmploymentInfoLocalService = sezZoneEmploymentInfoLocalService;
	}

	private SezZoneEmploymentInfoLocalService
		_sezZoneEmploymentInfoLocalService;

}