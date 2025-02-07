/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjSectionTwoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionTwoLocalService
 * @generated
 */
public class NcbjSectionTwoLocalServiceWrapper
	implements NcbjSectionTwoLocalService,
			   ServiceWrapper<NcbjSectionTwoLocalService> {

	public NcbjSectionTwoLocalServiceWrapper() {
		this(null);
	}

	public NcbjSectionTwoLocalServiceWrapper(
		NcbjSectionTwoLocalService ncbjSectionTwoLocalService) {

		_ncbjSectionTwoLocalService = ncbjSectionTwoLocalService;
	}

	/**
	 * Adds the ncbj section two to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionTwo the ncbj section two
	 * @return the ncbj section two that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
		addNcbjSectionTwo(
			com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
				ncbjSectionTwo) {

		return _ncbjSectionTwoLocalService.addNcbjSectionTwo(ncbjSectionTwo);
	}

	/**
	 * Creates a new ncbj section two with the primary key. Does not add the ncbj section two to the database.
	 *
	 * @param ncbjSectionTwoId the primary key for the new ncbj section two
	 * @return the new ncbj section two
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
		createNcbjSectionTwo(long ncbjSectionTwoId) {

		return _ncbjSectionTwoLocalService.createNcbjSectionTwo(
			ncbjSectionTwoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionTwoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the ncbj section two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionTwoId the primary key of the ncbj section two
	 * @return the ncbj section two that was removed
	 * @throws PortalException if a ncbj section two with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
			deleteNcbjSectionTwo(long ncbjSectionTwoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionTwoLocalService.deleteNcbjSectionTwo(
			ncbjSectionTwoId);
	}

	/**
	 * Deletes the ncbj section two from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionTwo the ncbj section two
	 * @return the ncbj section two that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
		deleteNcbjSectionTwo(
			com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
				ncbjSectionTwo) {

		return _ncbjSectionTwoLocalService.deleteNcbjSectionTwo(ncbjSectionTwo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionTwoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjSectionTwoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjSectionTwoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjSectionTwoLocalService.dynamicQuery();
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

		return _ncbjSectionTwoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionTwoModelImpl</code>.
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

		return _ncbjSectionTwoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionTwoModelImpl</code>.
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

		return _ncbjSectionTwoLocalService.dynamicQuery(
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

		return _ncbjSectionTwoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _ncbjSectionTwoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
		fetchNcbjSectionTwo(long ncbjSectionTwoId) {

		return _ncbjSectionTwoLocalService.fetchNcbjSectionTwo(
			ncbjSectionTwoId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjSectionTwoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjSectionTwoLocalService.getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
			getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSectionTwoException {

		return _ncbjSectionTwoLocalService.getNCBJByAppId(ncbjApplicationId);
	}

	/**
	 * Returns the ncbj section two with the primary key.
	 *
	 * @param ncbjSectionTwoId the primary key of the ncbj section two
	 * @return the ncbj section two
	 * @throws PortalException if a ncbj section two with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
			getNcbjSectionTwo(long ncbjSectionTwoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionTwoLocalService.getNcbjSectionTwo(ncbjSectionTwoId);
	}

	/**
	 * Returns a range of all the ncbj section twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section twos
	 * @param end the upper bound of the range of ncbj section twos (not inclusive)
	 * @return the range of ncbj section twos
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSectionTwo>
			getNcbjSectionTwos(int start, int end) {

		return _ncbjSectionTwoLocalService.getNcbjSectionTwos(start, end);
	}

	/**
	 * Returns the number of ncbj section twos.
	 *
	 * @return the number of ncbj section twos
	 */
	@Override
	public int getNcbjSectionTwosCount() {
		return _ncbjSectionTwoLocalService.getNcbjSectionTwosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSectionTwoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSectionTwoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the ncbj section two in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSectionTwoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSectionTwo the ncbj section two
	 * @return the ncbj section two that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
		updateNcbjSectionTwo(
			com.nbp.ncbj.application.form.service.model.NcbjSectionTwo
				ncbjSectionTwo) {

		return _ncbjSectionTwoLocalService.updateNcbjSectionTwo(ncbjSectionTwo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjSectionTwoLocalService.getBasePersistence();
	}

	@Override
	public NcbjSectionTwoLocalService getWrappedService() {
		return _ncbjSectionTwoLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjSectionTwoLocalService ncbjSectionTwoLocalService) {

		_ncbjSectionTwoLocalService = ncbjSectionTwoLocalService;
	}

	private NcbjSectionTwoLocalService _ncbjSectionTwoLocalService;

}