/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjNumOfEmpAddLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumOfEmpAddLocalService
 * @generated
 */
public class NcbjNumOfEmpAddLocalServiceWrapper
	implements NcbjNumOfEmpAddLocalService,
			   ServiceWrapper<NcbjNumOfEmpAddLocalService> {

	public NcbjNumOfEmpAddLocalServiceWrapper() {
		this(null);
	}

	public NcbjNumOfEmpAddLocalServiceWrapper(
		NcbjNumOfEmpAddLocalService ncbjNumOfEmpAddLocalService) {

		_ncbjNumOfEmpAddLocalService = ncbjNumOfEmpAddLocalService;
	}

	/**
	 * Adds the ncbj num of emp add to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjNumOfEmpAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjNumOfEmpAdd the ncbj num of emp add
	 * @return the ncbj num of emp add that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
		addNcbjNumOfEmpAdd(
			com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
				ncbjNumOfEmpAdd) {

		return _ncbjNumOfEmpAddLocalService.addNcbjNumOfEmpAdd(ncbjNumOfEmpAdd);
	}

	/**
	 * Creates a new ncbj num of emp add with the primary key. Does not add the ncbj num of emp add to the database.
	 *
	 * @param ncbjNumOfEmpAddId the primary key for the new ncbj num of emp add
	 * @return the new ncbj num of emp add
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
		createNcbjNumOfEmpAdd(long ncbjNumOfEmpAddId) {

		return _ncbjNumOfEmpAddLocalService.createNcbjNumOfEmpAdd(
			ncbjNumOfEmpAddId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumOfEmpAddLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj num of emp add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjNumOfEmpAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add that was removed
	 * @throws PortalException if a ncbj num of emp add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
			deleteNcbjNumOfEmpAdd(long ncbjNumOfEmpAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumOfEmpAddLocalService.deleteNcbjNumOfEmpAdd(
			ncbjNumOfEmpAddId);
	}

	/**
	 * Deletes the ncbj num of emp add from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjNumOfEmpAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjNumOfEmpAdd the ncbj num of emp add
	 * @return the ncbj num of emp add that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
		deleteNcbjNumOfEmpAdd(
			com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
				ncbjNumOfEmpAdd) {

		return _ncbjNumOfEmpAddLocalService.deleteNcbjNumOfEmpAdd(
			ncbjNumOfEmpAdd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumOfEmpAddLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjNumOfEmpAddLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjNumOfEmpAddLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjNumOfEmpAddLocalService.dynamicQuery();
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

		return _ncbjNumOfEmpAddLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjNumOfEmpAddModelImpl</code>.
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

		return _ncbjNumOfEmpAddLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjNumOfEmpAddModelImpl</code>.
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

		return _ncbjNumOfEmpAddLocalService.dynamicQuery(
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

		return _ncbjNumOfEmpAddLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjNumOfEmpAddLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
		fetchNcbjNumOfEmpAdd(long ncbjNumOfEmpAddId) {

		return _ncbjNumOfEmpAddLocalService.fetchNcbjNumOfEmpAdd(
			ncbjNumOfEmpAddId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjNumOfEmpAddLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjNumOfEmpAddLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd>
			getNCBJById(long ncbjApplicationId) {

		return _ncbjNumOfEmpAddLocalService.getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj num of emp add with the primary key.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add
	 * @throws PortalException if a ncbj num of emp add with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
			getNcbjNumOfEmpAdd(long ncbjNumOfEmpAddId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumOfEmpAddLocalService.getNcbjNumOfEmpAdd(
			ncbjNumOfEmpAddId);
	}

	/**
	 * Returns a range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @return the range of ncbj num of emp adds
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd>
			getNcbjNumOfEmpAdds(int start, int end) {

		return _ncbjNumOfEmpAddLocalService.getNcbjNumOfEmpAdds(start, end);
	}

	/**
	 * Returns the number of ncbj num of emp adds.
	 *
	 * @return the number of ncbj num of emp adds
	 */
	@Override
	public int getNcbjNumOfEmpAddsCount() {
		return _ncbjNumOfEmpAddLocalService.getNcbjNumOfEmpAddsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjNumOfEmpAddLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjNumOfEmpAddLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj num of emp add in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjNumOfEmpAddLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjNumOfEmpAdd the ncbj num of emp add
	 * @return the ncbj num of emp add that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
		updateNcbjNumOfEmpAdd(
			com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd
				ncbjNumOfEmpAdd) {

		return _ncbjNumOfEmpAddLocalService.updateNcbjNumOfEmpAdd(
			ncbjNumOfEmpAdd);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjNumOfEmpAddLocalService.getBasePersistence();
	}

	@Override
	public NcbjNumOfEmpAddLocalService getWrappedService() {
		return _ncbjNumOfEmpAddLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjNumOfEmpAddLocalService ncbjNumOfEmpAddLocalService) {

		_ncbjNumOfEmpAddLocalService = ncbjNumOfEmpAddLocalService;
	}

	private NcbjNumOfEmpAddLocalService _ncbjNumOfEmpAddLocalService;

}