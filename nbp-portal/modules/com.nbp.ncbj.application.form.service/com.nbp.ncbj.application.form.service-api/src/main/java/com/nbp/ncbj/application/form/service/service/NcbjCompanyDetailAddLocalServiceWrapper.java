/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjCompanyDetailAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailAddLocalService
 * @generated
 */
public class NcbjCompanyDetailAddLocalServiceWrapper
	implements NcbjCompanyDetailAddLocalService,
			   ServiceWrapper<NcbjCompanyDetailAddLocalService> {

	public NcbjCompanyDetailAddLocalServiceWrapper() {
		this(null);
	}

	public NcbjCompanyDetailAddLocalServiceWrapper(
		NcbjCompanyDetailAddLocalService ncbjCompanyDetailAddLocalService) {

		_ncbjCompanyDetailAddLocalService = ncbjCompanyDetailAddLocalService;
	}

	/**
	 * Adds the ncbj company detail add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailAdd the ncbj company detail add
	 * @return the ncbj company detail add that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
		addNcbjCompanyDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
				ncbjCompanyDetailAdd) {

		return _ncbjCompanyDetailAddLocalService.addNcbjCompanyDetailAdd(
			ncbjCompanyDetailAdd);
	}

	/**
	 * Creates a new ncbj company detail add with the primary key. Does not add the ncbj company detail add to the database.
	 *
	 * @param ncbjCompanyDetailAddId the primary key for the new ncbj company detail add
	 * @return the new ncbj company detail add
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
		createNcbjCompanyDetailAdd(long ncbjCompanyDetailAddId) {

		return _ncbjCompanyDetailAddLocalService.createNcbjCompanyDetailAdd(
			ncbjCompanyDetailAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailAddLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj company detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the ncbj company detail add
	 * @return the ncbj company detail add that was removed
	 * @throws PortalException if a ncbj company detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
			deleteNcbjCompanyDetailAdd(long ncbjCompanyDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailAddLocalService.deleteNcbjCompanyDetailAdd(
			ncbjCompanyDetailAddId);
	}

	/**
	 * Deletes the ncbj company detail add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailAdd the ncbj company detail add
	 * @return the ncbj company detail add that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
		deleteNcbjCompanyDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
				ncbjCompanyDetailAdd) {

		return _ncbjCompanyDetailAddLocalService.deleteNcbjCompanyDetailAdd(
			ncbjCompanyDetailAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjCompanyDetailAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjCompanyDetailAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjCompanyDetailAddLocalService.dynamicQuery();
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

		return _ncbjCompanyDetailAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailAddModelImpl</code>.
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

		return _ncbjCompanyDetailAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailAddModelImpl</code>.
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

		return _ncbjCompanyDetailAddLocalService.dynamicQuery(
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

		return _ncbjCompanyDetailAddLocalService.dynamicQueryCount(
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

		return _ncbjCompanyDetailAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
		fetchNcbjCompanyDetailAdd(long ncbjCompanyDetailAddId) {

		return _ncbjCompanyDetailAddLocalService.fetchNcbjCompanyDetailAdd(
			ncbjCompanyDetailAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjCompanyDetailAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjCompanyDetailAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd>
			getNCBJById(long ncbjApplicationId) {

		return _ncbjCompanyDetailAddLocalService.getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail add with the primary key.
	 *
	 * @param ncbjCompanyDetailAddId the primary key of the ncbj company detail add
	 * @return the ncbj company detail add
	 * @throws PortalException if a ncbj company detail add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
			getNcbjCompanyDetailAdd(long ncbjCompanyDetailAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailAddLocalService.getNcbjCompanyDetailAdd(
			ncbjCompanyDetailAddId);
	}

	/**
	 * Returns a range of all the ncbj company detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail adds
	 * @param end the upper bound of the range of ncbj company detail adds (not inclusive)
	 * @return the range of ncbj company detail adds
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd>
			getNcbjCompanyDetailAdds(int start, int end) {

		return _ncbjCompanyDetailAddLocalService.getNcbjCompanyDetailAdds(
			start, end);
	}

	/**
	 * Returns the number of ncbj company detail adds.
	 *
	 * @return the number of ncbj company detail adds
	 */
	@Override
	public int getNcbjCompanyDetailAddsCount() {
		return _ncbjCompanyDetailAddLocalService.
			getNcbjCompanyDetailAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCompanyDetailAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailAddLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj company detail add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailAdd the ncbj company detail add
	 * @return the ncbj company detail add that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
		updateNcbjCompanyDetailAdd(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailAdd
				ncbjCompanyDetailAdd) {

		return _ncbjCompanyDetailAddLocalService.updateNcbjCompanyDetailAdd(
			ncbjCompanyDetailAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjCompanyDetailAddLocalService.getBasePersistence();
	}

	@Override
	public NcbjCompanyDetailAddLocalService getWrappedService() {
		return _ncbjCompanyDetailAddLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjCompanyDetailAddLocalService ncbjCompanyDetailAddLocalService) {

		_ncbjCompanyDetailAddLocalService = ncbjCompanyDetailAddLocalService;
	}

	private NcbjCompanyDetailAddLocalService _ncbjCompanyDetailAddLocalService;

}