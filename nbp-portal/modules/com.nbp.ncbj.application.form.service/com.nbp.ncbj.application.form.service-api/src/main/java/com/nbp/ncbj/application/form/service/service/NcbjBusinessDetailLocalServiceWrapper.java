/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjBusinessDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailLocalService
 * @generated
 */
public class NcbjBusinessDetailLocalServiceWrapper
	implements NcbjBusinessDetailLocalService,
			   ServiceWrapper<NcbjBusinessDetailLocalService> {

	public NcbjBusinessDetailLocalServiceWrapper() {
		this(null);
	}

	public NcbjBusinessDetailLocalServiceWrapper(
		NcbjBusinessDetailLocalService ncbjBusinessDetailLocalService) {

		_ncbjBusinessDetailLocalService = ncbjBusinessDetailLocalService;
	}

	/**
	 * Adds the ncbj business detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjBusinessDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjBusinessDetail the ncbj business detail
	 * @return the ncbj business detail that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
		addNcbjBusinessDetail(
			com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
				ncbjBusinessDetail) {

		return _ncbjBusinessDetailLocalService.addNcbjBusinessDetail(
			ncbjBusinessDetail);
	}

	/**
	 * Creates a new ncbj business detail with the primary key. Does not add the ncbj business detail to the database.
	 *
	 * @param ncbjBusinessDetailId the primary key for the new ncbj business detail
	 * @return the new ncbj business detail
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
		createNcbjBusinessDetail(long ncbjBusinessDetailId) {

		return _ncbjBusinessDetailLocalService.createNcbjBusinessDetail(
			ncbjBusinessDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj business detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjBusinessDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjBusinessDetailId the primary key of the ncbj business detail
	 * @return the ncbj business detail that was removed
	 * @throws PortalException if a ncbj business detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
			deleteNcbjBusinessDetail(long ncbjBusinessDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailLocalService.deleteNcbjBusinessDetail(
			ncbjBusinessDetailId);
	}

	/**
	 * Deletes the ncbj business detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjBusinessDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjBusinessDetail the ncbj business detail
	 * @return the ncbj business detail that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
		deleteNcbjBusinessDetail(
			com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
				ncbjBusinessDetail) {

		return _ncbjBusinessDetailLocalService.deleteNcbjBusinessDetail(
			ncbjBusinessDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjBusinessDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjBusinessDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjBusinessDetailLocalService.dynamicQuery();
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

		return _ncbjBusinessDetailLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailModelImpl</code>.
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

		return _ncbjBusinessDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailModelImpl</code>.
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

		return _ncbjBusinessDetailLocalService.dynamicQuery(
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

		return _ncbjBusinessDetailLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjBusinessDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
		fetchNcbjBusinessDetail(long ncbjBusinessDetailId) {

		return _ncbjBusinessDetailLocalService.fetchNcbjBusinessDetail(
			ncbjBusinessDetailId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjBusinessDetailLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail>
			getByNcbjBusiDetail(long ncbjApplicationId) {

		return _ncbjBusinessDetailLocalService.getByNcbjBusiDetail(
			ncbjApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjBusinessDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the ncbj business detail with the primary key.
	 *
	 * @param ncbjBusinessDetailId the primary key of the ncbj business detail
	 * @return the ncbj business detail
	 * @throws PortalException if a ncbj business detail with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
			getNcbjBusinessDetail(long ncbjBusinessDetailId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailLocalService.getNcbjBusinessDetail(
			ncbjBusinessDetailId);
	}

	/**
	 * Returns a range of all the ncbj business details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj business details
	 * @param end the upper bound of the range of ncbj business details (not inclusive)
	 * @return the range of ncbj business details
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail>
			getNcbjBusinessDetails(int start, int end) {

		return _ncbjBusinessDetailLocalService.getNcbjBusinessDetails(
			start, end);
	}

	/**
	 * Returns the number of ncbj business details.
	 *
	 * @return the number of ncbj business details
	 */
	@Override
	public int getNcbjBusinessDetailsCount() {
		return _ncbjBusinessDetailLocalService.getNcbjBusinessDetailsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjBusinessDetailLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjBusinessDetailLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj business detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjBusinessDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjBusinessDetail the ncbj business detail
	 * @return the ncbj business detail that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
		updateNcbjBusinessDetail(
			com.nbp.ncbj.application.form.service.model.NcbjBusinessDetail
				ncbjBusinessDetail) {

		return _ncbjBusinessDetailLocalService.updateNcbjBusinessDetail(
			ncbjBusinessDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjBusinessDetailLocalService.getBasePersistence();
	}

	@Override
	public NcbjBusinessDetailLocalService getWrappedService() {
		return _ncbjBusinessDetailLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjBusinessDetailLocalService ncbjBusinessDetailLocalService) {

		_ncbjBusinessDetailLocalService = ncbjBusinessDetailLocalService;
	}

	private NcbjBusinessDetailLocalService _ncbjBusinessDetailLocalService;

}