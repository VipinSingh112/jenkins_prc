/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjSectionOneLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionOneLocalService
 * @generated
 */
public class NcbjSectionOneLocalServiceWrapper
	implements NcbjSectionOneLocalService,
			   ServiceWrapper<NcbjSectionOneLocalService> {

	public NcbjSectionOneLocalServiceWrapper() {
		this(null);
	}

	public NcbjSectionOneLocalServiceWrapper(
		NcbjSectionOneLocalService ncbjSectionOneLocalService) {

		_ncbjSectionOneLocalService = ncbjSectionOneLocalService;
	}

	/**
	 * Adds the ncbj section one to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionOneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionOne the ncbj section one
	 * @return the ncbj section one that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOne
		addNcbjSectionOne(
			com.nbp.ncbj.application.form.service.model.NcbjSectionOne
				ncbjSectionOne) {

		return _ncbjSectionOneLocalService.addNcbjSectionOne(ncbjSectionOne);
	}

	/**
	 * Creates a new ncbj section one with the primary key. Does not add the ncbj section one to the database.
	 *
	 * @param ncbjSectionOneId the primary key for the new ncbj section one
	 * @return the new ncbj section one
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOne
		createNcbjSectionOne(long ncbjSectionOneId) {

		return _ncbjSectionOneLocalService.createNcbjSectionOne(
			ncbjSectionOneId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj section one with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionOneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one that was removed
	 * @throws PortalException if a ncbj section one with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOne
			deleteNcbjSectionOne(long ncbjSectionOneId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneLocalService.deleteNcbjSectionOne(
			ncbjSectionOneId);
	}

	/**
	 * Deletes the ncbj section one from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionOneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionOne the ncbj section one
	 * @return the ncbj section one that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOne
		deleteNcbjSectionOne(
			com.nbp.ncbj.application.form.service.model.NcbjSectionOne
				ncbjSectionOne) {

		return _ncbjSectionOneLocalService.deleteNcbjSectionOne(ncbjSectionOne);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjSectionOneLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjSectionOneLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjSectionOneLocalService.dynamicQuery();
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

		return _ncbjSectionOneLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneModelImpl</code>.
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

		return _ncbjSectionOneLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneModelImpl</code>.
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

		return _ncbjSectionOneLocalService.dynamicQuery(
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

		return _ncbjSectionOneLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjSectionOneLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOne
		fetchNcbjSectionOne(long ncbjSectionOneId) {

		return _ncbjSectionOneLocalService.fetchNcbjSectionOne(
			ncbjSectionOneId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjSectionOneLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjSectionOneLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOne
			getNCBJById(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionOneException {

		return _ncbjSectionOneLocalService.getNCBJById(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section one with the primary key.
	 *
	 * @param ncbjSectionOneId the primary key of the ncbj section one
	 * @return the ncbj section one
	 * @throws PortalException if a ncbj section one with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOne
			getNcbjSectionOne(long ncbjSectionOneId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneLocalService.getNcbjSectionOne(ncbjSectionOneId);
	}

	/**
	 * Returns a range of all the ncbj section ones.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionOneModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section ones
	 * @param end the upper bound of the range of ncbj section ones (not inclusive)
	 * @return the range of ncbj section ones
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSectionOne>
			getNcbjSectionOnes(int start, int end) {

		return _ncbjSectionOneLocalService.getNcbjSectionOnes(start, end);
	}

	/**
	 * Returns the number of ncbj section ones.
	 *
	 * @return the number of ncbj section ones
	 */
	@Override
	public int getNcbjSectionOnesCount() {
		return _ncbjSectionOneLocalService.getNcbjSectionOnesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionOneLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionOneLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj section one in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionOneLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionOne the ncbj section one
	 * @return the ncbj section one that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionOne
		updateNcbjSectionOne(
			com.nbp.ncbj.application.form.service.model.NcbjSectionOne
				ncbjSectionOne) {

		return _ncbjSectionOneLocalService.updateNcbjSectionOne(ncbjSectionOne);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjSectionOneLocalService.getBasePersistence();
	}

	@Override
	public NcbjSectionOneLocalService getWrappedService() {
		return _ncbjSectionOneLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionOneLocalService ncbjSectionOneLocalService) {

		_ncbjSectionOneLocalService = ncbjSectionOneLocalService;
	}

	private NcbjSectionOneLocalService _ncbjSectionOneLocalService;

}