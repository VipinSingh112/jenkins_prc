/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjSectionFourLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionFourLocalService
 * @generated
 */
public class NcbjSectionFourLocalServiceWrapper
	implements NcbjSectionFourLocalService,
			   ServiceWrapper<NcbjSectionFourLocalService> {

	public NcbjSectionFourLocalServiceWrapper() {
		this(null);
	}

	public NcbjSectionFourLocalServiceWrapper(
		NcbjSectionFourLocalService ncbjSectionFourLocalService) {

		_ncbjSectionFourLocalService = ncbjSectionFourLocalService;
	}

	/**
	 * Adds the ncbj section four to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionFourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionFour the ncbj section four
	 * @return the ncbj section four that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionFour
		addNcbjSectionFour(
			com.nbp.ncbj.application.form.service.model.NcbjSectionFour
				ncbjSectionFour) {

		return _ncbjSectionFourLocalService.addNcbjSectionFour(ncbjSectionFour);
	}

	/**
	 * Creates a new ncbj section four with the primary key. Does not add the ncbj section four to the database.
	 *
	 * @param ncbjSectionFourId the primary key for the new ncbj section four
	 * @return the new ncbj section four
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionFour
		createNcbjSectionFour(long ncbjSectionFourId) {

		return _ncbjSectionFourLocalService.createNcbjSectionFour(
			ncbjSectionFourId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionFourLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj section four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionFourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four that was removed
	 * @throws PortalException if a ncbj section four with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionFour
			deleteNcbjSectionFour(long ncbjSectionFourId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionFourLocalService.deleteNcbjSectionFour(
			ncbjSectionFourId);
	}

	/**
	 * Deletes the ncbj section four from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionFourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionFour the ncbj section four
	 * @return the ncbj section four that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionFour
		deleteNcbjSectionFour(
			com.nbp.ncbj.application.form.service.model.NcbjSectionFour
				ncbjSectionFour) {

		return _ncbjSectionFourLocalService.deleteNcbjSectionFour(
			ncbjSectionFour);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionFourLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjSectionFourLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjSectionFourLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjSectionFourLocalService.dynamicQuery();
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

		return _ncbjSectionFourLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionFourModelImpl</code>.
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

		return _ncbjSectionFourLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionFourModelImpl</code>.
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

		return _ncbjSectionFourLocalService.dynamicQuery(
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

		return _ncbjSectionFourLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjSectionFourLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionFour
		fetchNcbjSectionFour(long ncbjSectionFourId) {

		return _ncbjSectionFourLocalService.fetchNcbjSectionFour(
			ncbjSectionFourId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjSectionFourLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjSectionFourLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionFour
			getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionFourException {

		return _ncbjSectionFourLocalService.getNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section four with the primary key.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four
	 * @throws PortalException if a ncbj section four with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionFour
			getNcbjSectionFour(long ncbjSectionFourId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionFourLocalService.getNcbjSectionFour(
			ncbjSectionFourId);
	}

	/**
	 * Returns a range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @return the range of ncbj section fours
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSectionFour>
			getNcbjSectionFours(int start, int end) {

		return _ncbjSectionFourLocalService.getNcbjSectionFours(start, end);
	}

	/**
	 * Returns the number of ncbj section fours.
	 *
	 * @return the number of ncbj section fours
	 */
	@Override
	public int getNcbjSectionFoursCount() {
		return _ncbjSectionFourLocalService.getNcbjSectionFoursCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionFourLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionFourLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj section four in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionFourLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionFour the ncbj section four
	 * @return the ncbj section four that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionFour
		updateNcbjSectionFour(
			com.nbp.ncbj.application.form.service.model.NcbjSectionFour
				ncbjSectionFour) {

		return _ncbjSectionFourLocalService.updateNcbjSectionFour(
			ncbjSectionFour);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjSectionFourLocalService.getBasePersistence();
	}

	@Override
	public NcbjSectionFourLocalService getWrappedService() {
		return _ncbjSectionFourLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionFourLocalService ncbjSectionFourLocalService) {

		_ncbjSectionFourLocalService = ncbjSectionFourLocalService;
	}

	private NcbjSectionFourLocalService _ncbjSectionFourLocalService;

}