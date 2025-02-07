/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjCompanyDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailLocalService
 * @generated
 */
public class NcbjCompanyDetailLocalServiceWrapper
	implements NcbjCompanyDetailLocalService,
			   ServiceWrapper<NcbjCompanyDetailLocalService> {

	public NcbjCompanyDetailLocalServiceWrapper() {
		this(null);
	}

	public NcbjCompanyDetailLocalServiceWrapper(
		NcbjCompanyDetailLocalService ncbjCompanyDetailLocalService) {

		_ncbjCompanyDetailLocalService = ncbjCompanyDetailLocalService;
	}

	/**
	 * Adds the ncbj company detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
		addNcbjCompanyDetail(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
				ncbjCompanyDetail) {

		return _ncbjCompanyDetailLocalService.addNcbjCompanyDetail(
			ncbjCompanyDetail);
	}

	/**
	 * Creates a new ncbj company detail with the primary key. Does not add the ncbj company detail to the database.
	 *
	 * @param ncbjCompanyDetailId the primary key for the new ncbj company detail
	 * @return the new ncbj company detail
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
		createNcbjCompanyDetail(long ncbjCompanyDetailId) {

		return _ncbjCompanyDetailLocalService.createNcbjCompanyDetail(
			ncbjCompanyDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj company detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail that was removed
	 * @throws PortalException if a ncbj company detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
			deleteNcbjCompanyDetail(long ncbjCompanyDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailLocalService.deleteNcbjCompanyDetail(
			ncbjCompanyDetailId);
	}

	/**
	 * Deletes the ncbj company detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
		deleteNcbjCompanyDetail(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
				ncbjCompanyDetail) {

		return _ncbjCompanyDetailLocalService.deleteNcbjCompanyDetail(
			ncbjCompanyDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjCompanyDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjCompanyDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjCompanyDetailLocalService.dynamicQuery();
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

		return _ncbjCompanyDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
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

		return _ncbjCompanyDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
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

		return _ncbjCompanyDetailLocalService.dynamicQuery(
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

		return _ncbjCompanyDetailLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjCompanyDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
		fetchNcbjCompanyDetail(long ncbjCompanyDetailId) {

		return _ncbjCompanyDetailLocalService.fetchNcbjCompanyDetail(
			ncbjCompanyDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjCompanyDetailLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjCompanyDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
			getNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailException {

		return _ncbjCompanyDetailLocalService.getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail with the primary key.
	 *
	 * @param ncbjCompanyDetailId the primary key of the ncbj company detail
	 * @return the ncbj company detail
	 * @throws PortalException if a ncbj company detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
			getNcbjCompanyDetail(long ncbjCompanyDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailLocalService.getNcbjCompanyDetail(
			ncbjCompanyDetailId);
	}

	/**
	 * Returns a range of all the ncbj company details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company details
	 * @param end the upper bound of the range of ncbj company details (not inclusive)
	 * @return the range of ncbj company details
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail>
			getNcbjCompanyDetails(int start, int end) {

		return _ncbjCompanyDetailLocalService.getNcbjCompanyDetails(start, end);
	}

	/**
	 * Returns the number of ncbj company details.
	 *
	 * @return the number of ncbj company details
	 */
	@Override
	public int getNcbjCompanyDetailsCount() {
		return _ncbjCompanyDetailLocalService.getNcbjCompanyDetailsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCompanyDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj company detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetail the ncbj company detail
	 * @return the ncbj company detail that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
		updateNcbjCompanyDetail(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetail
				ncbjCompanyDetail) {

		return _ncbjCompanyDetailLocalService.updateNcbjCompanyDetail(
			ncbjCompanyDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjCompanyDetailLocalService.getBasePersistence();
	}

	@Override
	public NcbjCompanyDetailLocalService getWrappedService() {
		return _ncbjCompanyDetailLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjCompanyDetailLocalService ncbjCompanyDetailLocalService) {

		_ncbjCompanyDetailLocalService = ncbjCompanyDetailLocalService;
	}

	private NcbjCompanyDetailLocalService _ncbjCompanyDetailLocalService;

}