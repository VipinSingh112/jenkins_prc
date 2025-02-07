/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjOrgDetailInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrgDetailInfoLocalService
 * @generated
 */
public class NcbjOrgDetailInfoLocalServiceWrapper
	implements NcbjOrgDetailInfoLocalService,
			   ServiceWrapper<NcbjOrgDetailInfoLocalService> {

	public NcbjOrgDetailInfoLocalServiceWrapper() {
		this(null);
	}

	public NcbjOrgDetailInfoLocalServiceWrapper(
		NcbjOrgDetailInfoLocalService ncbjOrgDetailInfoLocalService) {

		_ncbjOrgDetailInfoLocalService = ncbjOrgDetailInfoLocalService;
	}

	/**
	 * Adds the ncbj org detail info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrgDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrgDetailInfo the ncbj org detail info
	 * @return the ncbj org detail info that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
		addNcbjOrgDetailInfo(
			com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
				ncbjOrgDetailInfo) {

		return _ncbjOrgDetailInfoLocalService.addNcbjOrgDetailInfo(
			ncbjOrgDetailInfo);
	}

	/**
	 * Creates a new ncbj org detail info with the primary key. Does not add the ncbj org detail info to the database.
	 *
	 * @param ncbjOrgDetailInfoId the primary key for the new ncbj org detail info
	 * @return the new ncbj org detail info
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
		createNcbjOrgDetailInfo(long ncbjOrgDetailInfoId) {

		return _ncbjOrgDetailInfoLocalService.createNcbjOrgDetailInfo(
			ncbjOrgDetailInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrgDetailInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj org detail info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrgDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info that was removed
	 * @throws PortalException if a ncbj org detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
			deleteNcbjOrgDetailInfo(long ncbjOrgDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrgDetailInfoLocalService.deleteNcbjOrgDetailInfo(
			ncbjOrgDetailInfoId);
	}

	/**
	 * Deletes the ncbj org detail info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrgDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrgDetailInfo the ncbj org detail info
	 * @return the ncbj org detail info that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
		deleteNcbjOrgDetailInfo(
			com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
				ncbjOrgDetailInfo) {

		return _ncbjOrgDetailInfoLocalService.deleteNcbjOrgDetailInfo(
			ncbjOrgDetailInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrgDetailInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjOrgDetailInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjOrgDetailInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjOrgDetailInfoLocalService.dynamicQuery();
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

		return _ncbjOrgDetailInfoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrgDetailInfoModelImpl</code>.
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

		return _ncbjOrgDetailInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrgDetailInfoModelImpl</code>.
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

		return _ncbjOrgDetailInfoLocalService.dynamicQuery(
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

		return _ncbjOrgDetailInfoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjOrgDetailInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
		fetchNcbjOrgDetailInfo(long ncbjOrgDetailInfoId) {

		return _ncbjOrgDetailInfoLocalService.fetchNcbjOrgDetailInfo(
			ncbjOrgDetailInfoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjOrgDetailInfoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjOrgDetailInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
			getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrgDetailInfoException {

		return _ncbjOrgDetailInfoLocalService.getNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj org detail info with the primary key.
	 *
	 * @param ncbjOrgDetailInfoId the primary key of the ncbj org detail info
	 * @return the ncbj org detail info
	 * @throws PortalException if a ncbj org detail info with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
			getNcbjOrgDetailInfo(long ncbjOrgDetailInfoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrgDetailInfoLocalService.getNcbjOrgDetailInfo(
			ncbjOrgDetailInfoId);
	}

	/**
	 * Returns a range of all the ncbj org detail infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrgDetailInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj org detail infos
	 * @param end the upper bound of the range of ncbj org detail infos (not inclusive)
	 * @return the range of ncbj org detail infos
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo>
			getNcbjOrgDetailInfos(int start, int end) {

		return _ncbjOrgDetailInfoLocalService.getNcbjOrgDetailInfos(start, end);
	}

	/**
	 * Returns the number of ncbj org detail infos.
	 *
	 * @return the number of ncbj org detail infos
	 */
	@Override
	public int getNcbjOrgDetailInfosCount() {
		return _ncbjOrgDetailInfoLocalService.getNcbjOrgDetailInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjOrgDetailInfoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrgDetailInfoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj org detail info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrgDetailInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrgDetailInfo the ncbj org detail info
	 * @return the ncbj org detail info that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
		updateNcbjOrgDetailInfo(
			com.nbp.ncbj.application.form.service.model.NcbjOrgDetailInfo
				ncbjOrgDetailInfo) {

		return _ncbjOrgDetailInfoLocalService.updateNcbjOrgDetailInfo(
			ncbjOrgDetailInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjOrgDetailInfoLocalService.getBasePersistence();
	}

	@Override
	public NcbjOrgDetailInfoLocalService getWrappedService() {
		return _ncbjOrgDetailInfoLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjOrgDetailInfoLocalService ncbjOrgDetailInfoLocalService) {

		_ncbjOrgDetailInfoLocalService = ncbjOrgDetailInfoLocalService;
	}

	private NcbjOrgDetailInfoLocalService _ncbjOrgDetailInfoLocalService;

}