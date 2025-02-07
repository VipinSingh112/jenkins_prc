/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjProductServiceDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjProductServiceDetailLocalService
 * @generated
 */
public class NcbjProductServiceDetailLocalServiceWrapper
	implements NcbjProductServiceDetailLocalService,
			   ServiceWrapper<NcbjProductServiceDetailLocalService> {

	public NcbjProductServiceDetailLocalServiceWrapper() {
		this(null);
	}

	public NcbjProductServiceDetailLocalServiceWrapper(
		NcbjProductServiceDetailLocalService
			ncbjProductServiceDetailLocalService) {

		_ncbjProductServiceDetailLocalService =
			ncbjProductServiceDetailLocalService;
	}

	/**
	 * Adds the ncbj product service detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjProductServiceDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjProductServiceDetail the ncbj product service detail
	 * @return the ncbj product service detail that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
		addNcbjProductServiceDetail(
			com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
				ncbjProductServiceDetail) {

		return _ncbjProductServiceDetailLocalService.
			addNcbjProductServiceDetail(ncbjProductServiceDetail);
	}

	/**
	 * Creates a new ncbj product service detail with the primary key. Does not add the ncbj product service detail to the database.
	 *
	 * @param ncbjProductServiceDetailId the primary key for the new ncbj product service detail
	 * @return the new ncbj product service detail
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
		createNcbjProductServiceDetail(long ncbjProductServiceDetailId) {

		return _ncbjProductServiceDetailLocalService.
			createNcbjProductServiceDetail(ncbjProductServiceDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjProductServiceDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj product service detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjProductServiceDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail that was removed
	 * @throws PortalException if a ncbj product service detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
			deleteNcbjProductServiceDetail(long ncbjProductServiceDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjProductServiceDetailLocalService.
			deleteNcbjProductServiceDetail(ncbjProductServiceDetailId);
	}

	/**
	 * Deletes the ncbj product service detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjProductServiceDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjProductServiceDetail the ncbj product service detail
	 * @return the ncbj product service detail that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
		deleteNcbjProductServiceDetail(
			com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
				ncbjProductServiceDetail) {

		return _ncbjProductServiceDetailLocalService.
			deleteNcbjProductServiceDetail(ncbjProductServiceDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjProductServiceDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjProductServiceDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjProductServiceDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjProductServiceDetailLocalService.dynamicQuery();
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

		return _ncbjProductServiceDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjProductServiceDetailModelImpl</code>.
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

		return _ncbjProductServiceDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjProductServiceDetailModelImpl</code>.
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

		return _ncbjProductServiceDetailLocalService.dynamicQuery(
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

		return _ncbjProductServiceDetailLocalService.dynamicQueryCount(
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

		return _ncbjProductServiceDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
		fetchNcbjProductServiceDetail(long ncbjProductServiceDetailId) {

		return _ncbjProductServiceDetailLocalService.
			fetchNcbjProductServiceDetail(ncbjProductServiceDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjProductServiceDetailLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjProductServiceDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail>
			getNCBJ_ByAppId(long ncbjApplicationId) {

		return _ncbjProductServiceDetailLocalService.getNCBJ_ByAppId(
			ncbjApplicationId);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
			getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjProductServiceDetailException {

		return _ncbjProductServiceDetailLocalService.getNCBJByAppId(
			ncbjApplicationId);
	}

	/**
	 * Returns the ncbj product service detail with the primary key.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail
	 * @throws PortalException if a ncbj product service detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
			getNcbjProductServiceDetail(long ncbjProductServiceDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjProductServiceDetailLocalService.
			getNcbjProductServiceDetail(ncbjProductServiceDetailId);
	}

	/**
	 * Returns a range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @return the range of ncbj product service details
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail>
			getNcbjProductServiceDetails(int start, int end) {

		return _ncbjProductServiceDetailLocalService.
			getNcbjProductServiceDetails(start, end);
	}

	/**
	 * Returns the number of ncbj product service details.
	 *
	 * @return the number of ncbj product service details
	 */
	@Override
	public int getNcbjProductServiceDetailsCount() {
		return _ncbjProductServiceDetailLocalService.
			getNcbjProductServiceDetailsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjProductServiceDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjProductServiceDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj product service detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjProductServiceDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjProductServiceDetail the ncbj product service detail
	 * @return the ncbj product service detail that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
		updateNcbjProductServiceDetail(
			com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail
				ncbjProductServiceDetail) {

		return _ncbjProductServiceDetailLocalService.
			updateNcbjProductServiceDetail(ncbjProductServiceDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjProductServiceDetailLocalService.getBasePersistence();
	}

	@Override
	public NcbjProductServiceDetailLocalService getWrappedService() {
		return _ncbjProductServiceDetailLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjProductServiceDetailLocalService
			ncbjProductServiceDetailLocalService) {

		_ncbjProductServiceDetailLocalService =
			ncbjProductServiceDetailLocalService;
	}

	private NcbjProductServiceDetailLocalService
		_ncbjProductServiceDetailLocalService;

}