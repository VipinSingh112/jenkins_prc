/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjCompanyDetailGenLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetailGenLocalService
 * @generated
 */
public class NcbjCompanyDetailGenLocalServiceWrapper
	implements NcbjCompanyDetailGenLocalService,
			   ServiceWrapper<NcbjCompanyDetailGenLocalService> {

	public NcbjCompanyDetailGenLocalServiceWrapper() {
		this(null);
	}

	public NcbjCompanyDetailGenLocalServiceWrapper(
		NcbjCompanyDetailGenLocalService ncbjCompanyDetailGenLocalService) {

		_ncbjCompanyDetailGenLocalService = ncbjCompanyDetailGenLocalService;
	}

	/**
	 * Adds the ncbj company detail gen to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailGenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 * @return the ncbj company detail gen that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
		addNcbjCompanyDetailGen(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
				ncbjCompanyDetailGen) {

		return _ncbjCompanyDetailGenLocalService.addNcbjCompanyDetailGen(
			ncbjCompanyDetailGen);
	}

	/**
	 * Creates a new ncbj company detail gen with the primary key. Does not add the ncbj company detail gen to the database.
	 *
	 * @param ncbjCompanyDetailGenId the primary key for the new ncbj company detail gen
	 * @return the new ncbj company detail gen
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
		createNcbjCompanyDetailGen(long ncbjCompanyDetailGenId) {

		return _ncbjCompanyDetailGenLocalService.createNcbjCompanyDetailGen(
			ncbjCompanyDetailGenId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailGenLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj company detail gen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailGenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen that was removed
	 * @throws PortalException if a ncbj company detail gen with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
			deleteNcbjCompanyDetailGen(long ncbjCompanyDetailGenId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailGenLocalService.deleteNcbjCompanyDetailGen(
			ncbjCompanyDetailGenId);
	}

	/**
	 * Deletes the ncbj company detail gen from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailGenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 * @return the ncbj company detail gen that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
		deleteNcbjCompanyDetailGen(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
				ncbjCompanyDetailGen) {

		return _ncbjCompanyDetailGenLocalService.deleteNcbjCompanyDetailGen(
			ncbjCompanyDetailGen);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailGenLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjCompanyDetailGenLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjCompanyDetailGenLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjCompanyDetailGenLocalService.dynamicQuery();
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

		return _ncbjCompanyDetailGenLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenModelImpl</code>.
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

		return _ncbjCompanyDetailGenLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenModelImpl</code>.
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

		return _ncbjCompanyDetailGenLocalService.dynamicQuery(
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

		return _ncbjCompanyDetailGenLocalService.dynamicQueryCount(
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

		return _ncbjCompanyDetailGenLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
		fetchNcbjCompanyDetailGen(long ncbjCompanyDetailGenId) {

		return _ncbjCompanyDetailGenLocalService.fetchNcbjCompanyDetailGen(
			ncbjCompanyDetailGenId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjCompanyDetailGenLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjCompanyDetailGenLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
			getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjCompanyDetailGenException {

		return _ncbjCompanyDetailGenLocalService.getNCBJByAppId(
			ncbjApplicationId);
	}

	/**
	 * Returns the ncbj company detail gen with the primary key.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen
	 * @throws PortalException if a ncbj company detail gen with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
			getNcbjCompanyDetailGen(long ncbjCompanyDetailGenId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailGenLocalService.getNcbjCompanyDetailGen(
			ncbjCompanyDetailGenId);
	}

	/**
	 * Returns a range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @return the range of ncbj company detail gens
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen>
			getNcbjCompanyDetailGens(int start, int end) {

		return _ncbjCompanyDetailGenLocalService.getNcbjCompanyDetailGens(
			start, end);
	}

	/**
	 * Returns the number of ncbj company detail gens.
	 *
	 * @return the number of ncbj company detail gens
	 */
	@Override
	public int getNcbjCompanyDetailGensCount() {
		return _ncbjCompanyDetailGenLocalService.
			getNcbjCompanyDetailGensCount();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen>
			getNCBJListByAppId(long ncbjApplicationId) {

		return _ncbjCompanyDetailGenLocalService.getNCBJListByAppId(
			ncbjApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjCompanyDetailGenLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjCompanyDetailGenLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj company detail gen in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjCompanyDetailGenLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 * @return the ncbj company detail gen that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
		updateNcbjCompanyDetailGen(
			com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen
				ncbjCompanyDetailGen) {

		return _ncbjCompanyDetailGenLocalService.updateNcbjCompanyDetailGen(
			ncbjCompanyDetailGen);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjCompanyDetailGenLocalService.getBasePersistence();
	}

	@Override
	public NcbjCompanyDetailGenLocalService getWrappedService() {
		return _ncbjCompanyDetailGenLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjCompanyDetailGenLocalService ncbjCompanyDetailGenLocalService) {

		_ncbjCompanyDetailGenLocalService = ncbjCompanyDetailGenLocalService;
	}

	private NcbjCompanyDetailGenLocalService _ncbjCompanyDetailGenLocalService;

}