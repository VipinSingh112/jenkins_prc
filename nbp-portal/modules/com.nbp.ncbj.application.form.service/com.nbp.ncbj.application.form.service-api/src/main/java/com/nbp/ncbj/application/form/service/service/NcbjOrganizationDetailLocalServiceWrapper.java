/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjOrganizationDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjOrganizationDetailLocalService
 * @generated
 */
public class NcbjOrganizationDetailLocalServiceWrapper
	implements NcbjOrganizationDetailLocalService,
			   ServiceWrapper<NcbjOrganizationDetailLocalService> {

	public NcbjOrganizationDetailLocalServiceWrapper() {
		this(null);
	}

	public NcbjOrganizationDetailLocalServiceWrapper(
		NcbjOrganizationDetailLocalService ncbjOrganizationDetailLocalService) {

		_ncbjOrganizationDetailLocalService =
			ncbjOrganizationDetailLocalService;
	}

	/**
	 * Adds the ncbj organization detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrganizationDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 * @return the ncbj organization detail that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
		addNcbjOrganizationDetail(
			com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
				ncbjOrganizationDetail) {

		return _ncbjOrganizationDetailLocalService.addNcbjOrganizationDetail(
			ncbjOrganizationDetail);
	}

	/**
	 * Creates a new ncbj organization detail with the primary key. Does not add the ncbj organization detail to the database.
	 *
	 * @param ncbjOrganizationDetailId the primary key for the new ncbj organization detail
	 * @return the new ncbj organization detail
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
		createNcbjOrganizationDetail(long ncbjOrganizationDetailId) {

		return _ncbjOrganizationDetailLocalService.createNcbjOrganizationDetail(
			ncbjOrganizationDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrganizationDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj organization detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrganizationDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail that was removed
	 * @throws PortalException if a ncbj organization detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
			deleteNcbjOrganizationDetail(long ncbjOrganizationDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrganizationDetailLocalService.deleteNcbjOrganizationDetail(
			ncbjOrganizationDetailId);
	}

	/**
	 * Deletes the ncbj organization detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrganizationDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 * @return the ncbj organization detail that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
		deleteNcbjOrganizationDetail(
			com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
				ncbjOrganizationDetail) {

		return _ncbjOrganizationDetailLocalService.deleteNcbjOrganizationDetail(
			ncbjOrganizationDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrganizationDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjOrganizationDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjOrganizationDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjOrganizationDetailLocalService.dynamicQuery();
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

		return _ncbjOrganizationDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrganizationDetailModelImpl</code>.
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

		return _ncbjOrganizationDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrganizationDetailModelImpl</code>.
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

		return _ncbjOrganizationDetailLocalService.dynamicQuery(
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

		return _ncbjOrganizationDetailLocalService.dynamicQueryCount(
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

		return _ncbjOrganizationDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
		fetchNcbjOrganizationDetail(long ncbjOrganizationDetailId) {

		return _ncbjOrganizationDetailLocalService.fetchNcbjOrganizationDetail(
			ncbjOrganizationDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjOrganizationDetailLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjOrganizationDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
			getNCBJ_ByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return _ncbjOrganizationDetailLocalService.getNCBJ_ByAppId(
			ncbjApplicationId);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
			getNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjOrganizationDetailException {

		return _ncbjOrganizationDetailLocalService.getNCBJById(
			ncbjApplicationId);
	}

	/**
	 * Returns the ncbj organization detail with the primary key.
	 *
	 * @param ncbjOrganizationDetailId the primary key of the ncbj organization detail
	 * @return the ncbj organization detail
	 * @throws PortalException if a ncbj organization detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
			getNcbjOrganizationDetail(long ncbjOrganizationDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrganizationDetailLocalService.getNcbjOrganizationDetail(
			ncbjOrganizationDetailId);
	}

	/**
	 * Returns a range of all the ncbj organization details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjOrganizationDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj organization details
	 * @param end the upper bound of the range of ncbj organization details (not inclusive)
	 * @return the range of ncbj organization details
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail>
			getNcbjOrganizationDetails(int start, int end) {

		return _ncbjOrganizationDetailLocalService.getNcbjOrganizationDetails(
			start, end);
	}

	/**
	 * Returns the number of ncbj organization details.
	 *
	 * @return the number of ncbj organization details
	 */
	@Override
	public int getNcbjOrganizationDetailsCount() {
		return _ncbjOrganizationDetailLocalService.
			getNcbjOrganizationDetailsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjOrganizationDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjOrganizationDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj organization detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjOrganizationDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjOrganizationDetail the ncbj organization detail
	 * @return the ncbj organization detail that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
		updateNcbjOrganizationDetail(
			com.nbp.ncbj.application.form.service.model.NcbjOrganizationDetail
				ncbjOrganizationDetail) {

		return _ncbjOrganizationDetailLocalService.updateNcbjOrganizationDetail(
			ncbjOrganizationDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjOrganizationDetailLocalService.getBasePersistence();
	}

	@Override
	public NcbjOrganizationDetailLocalService getWrappedService() {
		return _ncbjOrganizationDetailLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjOrganizationDetailLocalService ncbjOrganizationDetailLocalService) {

		_ncbjOrganizationDetailLocalService =
			ncbjOrganizationDetailLocalService;
	}

	private NcbjOrganizationDetailLocalService
		_ncbjOrganizationDetailLocalService;

}