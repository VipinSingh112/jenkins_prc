/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjApplicantDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicantDetailLocalService
 * @generated
 */
public class NcbjApplicantDetailLocalServiceWrapper
	implements NcbjApplicantDetailLocalService,
			   ServiceWrapper<NcbjApplicantDetailLocalService> {

	public NcbjApplicantDetailLocalServiceWrapper() {
		this(null);
	}

	public NcbjApplicantDetailLocalServiceWrapper(
		NcbjApplicantDetailLocalService ncbjApplicantDetailLocalService) {

		_ncbjApplicantDetailLocalService = ncbjApplicantDetailLocalService;
	}

	/**
	 * Adds the ncbj applicant detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicantDetail the ncbj applicant detail
	 * @return the ncbj applicant detail that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
		addNcbjApplicantDetail(
			com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
				ncbjApplicantDetail) {

		return _ncbjApplicantDetailLocalService.addNcbjApplicantDetail(
			ncbjApplicantDetail);
	}

	/**
	 * Creates a new ncbj applicant detail with the primary key. Does not add the ncbj applicant detail to the database.
	 *
	 * @param ncbjApplicantDetailId the primary key for the new ncbj applicant detail
	 * @return the new ncbj applicant detail
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
		createNcbjApplicantDetail(long ncbjApplicantDetailId) {

		return _ncbjApplicantDetailLocalService.createNcbjApplicantDetail(
			ncbjApplicantDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicantDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj applicant detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail that was removed
	 * @throws PortalException if a ncbj applicant detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
			deleteNcbjApplicantDetail(long ncbjApplicantDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicantDetailLocalService.deleteNcbjApplicantDetail(
			ncbjApplicantDetailId);
	}

	/**
	 * Deletes the ncbj applicant detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicantDetail the ncbj applicant detail
	 * @return the ncbj applicant detail that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
		deleteNcbjApplicantDetail(
			com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
				ncbjApplicantDetail) {

		return _ncbjApplicantDetailLocalService.deleteNcbjApplicantDetail(
			ncbjApplicantDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicantDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjApplicantDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjApplicantDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjApplicantDetailLocalService.dynamicQuery();
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

		return _ncbjApplicantDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicantDetailModelImpl</code>.
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

		return _ncbjApplicantDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicantDetailModelImpl</code>.
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

		return _ncbjApplicantDetailLocalService.dynamicQuery(
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

		return _ncbjApplicantDetailLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjApplicantDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
		fetchNcbjApplicantDetail(long ncbjApplicantDetailId) {

		return _ncbjApplicantDetailLocalService.fetchNcbjApplicantDetail(
			ncbjApplicantDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjApplicantDetailLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjApplicantDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncbj applicant detail with the primary key.
	 *
	 * @param ncbjApplicantDetailId the primary key of the ncbj applicant detail
	 * @return the ncbj applicant detail
	 * @throws PortalException if a ncbj applicant detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
			getNcbjApplicantDetail(long ncbjApplicantDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicantDetailLocalService.getNcbjApplicantDetail(
			ncbjApplicantDetailId);
	}

	/**
	 * Returns a range of all the ncbj applicant details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjApplicantDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applicant details
	 * @param end the upper bound of the range of ncbj applicant details (not inclusive)
	 * @return the range of ncbj applicant details
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail>
			getNcbjApplicantDetails(int start, int end) {

		return _ncbjApplicantDetailLocalService.getNcbjApplicantDetails(
			start, end);
	}

	/**
	 * Returns the number of ncbj applicant details.
	 *
	 * @return the number of ncbj applicant details
	 */
	@Override
	public int getNcbjApplicantDetailsCount() {
		return _ncbjApplicantDetailLocalService.getNcbjApplicantDetailsCount();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
			getNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjApplicantDetailException {

		return _ncbjApplicantDetailLocalService.getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjApplicantDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjApplicantDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj applicant detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjApplicantDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjApplicantDetail the ncbj applicant detail
	 * @return the ncbj applicant detail that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
		updateNcbjApplicantDetail(
			com.nbp.ncbj.application.form.service.model.NcbjApplicantDetail
				ncbjApplicantDetail) {

		return _ncbjApplicantDetailLocalService.updateNcbjApplicantDetail(
			ncbjApplicantDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjApplicantDetailLocalService.getBasePersistence();
	}

	@Override
	public NcbjApplicantDetailLocalService getWrappedService() {
		return _ncbjApplicantDetailLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjApplicantDetailLocalService ncbjApplicantDetailLocalService) {

		_ncbjApplicantDetailLocalService = ncbjApplicantDetailLocalService;
	}

	private NcbjApplicantDetailLocalService _ncbjApplicantDetailLocalService;

}