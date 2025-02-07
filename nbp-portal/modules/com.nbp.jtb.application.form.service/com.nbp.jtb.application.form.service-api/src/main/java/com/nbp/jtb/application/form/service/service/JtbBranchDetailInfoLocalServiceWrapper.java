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

package com.nbp.jtb.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link JtbBranchDetailInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JtbBranchDetailInfoLocalService
 * @generated
 */
public class JtbBranchDetailInfoLocalServiceWrapper
	implements JtbBranchDetailInfoLocalService,
			   ServiceWrapper<JtbBranchDetailInfoLocalService> {

	public JtbBranchDetailInfoLocalServiceWrapper() {
		this(null);
	}

	public JtbBranchDetailInfoLocalServiceWrapper(
		JtbBranchDetailInfoLocalService jtbBranchDetailInfoLocalService) {

		_jtbBranchDetailInfoLocalService = jtbBranchDetailInfoLocalService;
	}

	/**
	 * Adds the jtb branch detail info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 * @return the jtb branch detail info that was added
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
		addJtbBranchDetailInfo(
			com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
				jtbBranchDetailInfo) {

		return _jtbBranchDetailInfoLocalService.addJtbBranchDetailInfo(
			jtbBranchDetailInfo);
	}

	/**
	 * Creates a new jtb branch detail info with the primary key. Does not add the jtb branch detail info to the database.
	 *
	 * @param jtbBranchDetailInfoId the primary key for the new jtb branch detail info
	 * @return the new jtb branch detail info
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
		createJtbBranchDetailInfo(long jtbBranchDetailInfoId) {

		return _jtbBranchDetailInfoLocalService.createJtbBranchDetailInfo(
			jtbBranchDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbBranchDetailInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the jtb branch detail info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 * @return the jtb branch detail info that was removed
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
		deleteJtbBranchDetailInfo(
			com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
				jtbBranchDetailInfo) {

		return _jtbBranchDetailInfoLocalService.deleteJtbBranchDetailInfo(
			jtbBranchDetailInfo);
	}

	/**
	 * Deletes the jtb branch detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info that was removed
	 * @throws PortalException if a jtb branch detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
			deleteJtbBranchDetailInfo(long jtbBranchDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbBranchDetailInfoLocalService.deleteJtbBranchDetailInfo(
			jtbBranchDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbBranchDetailInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _jtbBranchDetailInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _jtbBranchDetailInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jtbBranchDetailInfoLocalService.dynamicQuery();
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

		return _jtbBranchDetailInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoModelImpl</code>.
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

		return _jtbBranchDetailInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoModelImpl</code>.
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

		return _jtbBranchDetailInfoLocalService.dynamicQuery(
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

		return _jtbBranchDetailInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _jtbBranchDetailInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
		fetchJtbBranchDetailInfo(long jtbBranchDetailInfoId) {

		return _jtbBranchDetailInfoLocalService.fetchJtbBranchDetailInfo(
			jtbBranchDetailInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _jtbBranchDetailInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _jtbBranchDetailInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the jtb branch detail info with the primary key.
	 *
	 * @param jtbBranchDetailInfoId the primary key of the jtb branch detail info
	 * @return the jtb branch detail info
	 * @throws PortalException if a jtb branch detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
			getJtbBranchDetailInfo(long jtbBranchDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbBranchDetailInfoLocalService.getJtbBranchDetailInfo(
			jtbBranchDetailInfoId);
	}

	/**
	 * Returns a range of all the jtb branch detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JtbBranchDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb branch detail infos
	 * @param end the upper bound of the range of jtb branch detail infos (not inclusive)
	 * @return the range of jtb branch detail infos
	 */
	@Override
	public java.util.List
		<com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo>
			getJtbBranchDetailInfos(int start, int end) {

		return _jtbBranchDetailInfoLocalService.getJtbBranchDetailInfos(
			start, end);
	}

	/**
	 * Returns the number of jtb branch detail infos.
	 *
	 * @return the number of jtb branch detail infos
	 */
	@Override
	public int getJtbBranchDetailInfosCount() {
		return _jtbBranchDetailInfoLocalService.getJtbBranchDetailInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _jtbBranchDetailInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _jtbBranchDetailInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the jtb branch detail info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbBranchDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbBranchDetailInfo the jtb branch detail info
	 * @return the jtb branch detail info that was updated
	 */
	@Override
	public com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
		updateJtbBranchDetailInfo(
			com.nbp.jtb.application.form.service.model.JtbBranchDetailInfo
				jtbBranchDetailInfo) {

		return _jtbBranchDetailInfoLocalService.updateJtbBranchDetailInfo(
			jtbBranchDetailInfo);
	}

	@Override
	public JtbBranchDetailInfoLocalService getWrappedService() {
		return _jtbBranchDetailInfoLocalService;
	}

	@Override
	public void setWrappedService(
		JtbBranchDetailInfoLocalService jtbBranchDetailInfoLocalService) {

		_jtbBranchDetailInfoLocalService = jtbBranchDetailInfoLocalService;
	}

	private JtbBranchDetailInfoLocalService _jtbBranchDetailInfoLocalService;

}