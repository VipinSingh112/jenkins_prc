/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjPremisesLocationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPremisesLocationLocalService
 * @generated
 */
public class NcbjPremisesLocationLocalServiceWrapper
	implements NcbjPremisesLocationLocalService,
			   ServiceWrapper<NcbjPremisesLocationLocalService> {

	public NcbjPremisesLocationLocalServiceWrapper() {
		this(null);
	}

	public NcbjPremisesLocationLocalServiceWrapper(
		NcbjPremisesLocationLocalService ncbjPremisesLocationLocalService) {

		_ncbjPremisesLocationLocalService = ncbjPremisesLocationLocalService;
	}

	/**
	 * Adds the ncbj premises location to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPremisesLocationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPremisesLocation the ncbj premises location
	 * @return the ncbj premises location that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
		addNcbjPremisesLocation(
			com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
				ncbjPremisesLocation) {

		return _ncbjPremisesLocationLocalService.addNcbjPremisesLocation(
			ncbjPremisesLocation);
	}

	/**
	 * Creates a new ncbj premises location with the primary key. Does not add the ncbj premises location to the database.
	 *
	 * @param ncbjPremisesLocationId the primary key for the new ncbj premises location
	 * @return the new ncbj premises location
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
		createNcbjPremisesLocation(long ncbjPremisesLocationId) {

		return _ncbjPremisesLocationLocalService.createNcbjPremisesLocation(
			ncbjPremisesLocationId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPremisesLocationLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj premises location with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPremisesLocationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location that was removed
	 * @throws PortalException if a ncbj premises location with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
			deleteNcbjPremisesLocation(long ncbjPremisesLocationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPremisesLocationLocalService.deleteNcbjPremisesLocation(
			ncbjPremisesLocationId);
	}

	/**
	 * Deletes the ncbj premises location from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPremisesLocationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPremisesLocation the ncbj premises location
	 * @return the ncbj premises location that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
		deleteNcbjPremisesLocation(
			com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
				ncbjPremisesLocation) {

		return _ncbjPremisesLocationLocalService.deleteNcbjPremisesLocation(
			ncbjPremisesLocation);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPremisesLocationLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjPremisesLocationLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjPremisesLocationLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjPremisesLocationLocalService.dynamicQuery();
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

		return _ncbjPremisesLocationLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjPremisesLocationModelImpl</code>.
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

		return _ncbjPremisesLocationLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjPremisesLocationModelImpl</code>.
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

		return _ncbjPremisesLocationLocalService.dynamicQuery(
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

		return _ncbjPremisesLocationLocalService.dynamicQueryCount(
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

		return _ncbjPremisesLocationLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
		fetchNcbjPremisesLocation(long ncbjPremisesLocationId) {

		return _ncbjPremisesLocationLocalService.fetchNcbjPremisesLocation(
			ncbjPremisesLocationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjPremisesLocationLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjPremisesLocationLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
			getNCBJByAppId(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjPremisesLocationException {

		return _ncbjPremisesLocationLocalService.getNCBJByAppId(
			ncbjApplicationId);
	}

	/**
	 * Returns the ncbj premises location with the primary key.
	 *
	 * @param ncbjPremisesLocationId the primary key of the ncbj premises location
	 * @return the ncbj premises location
	 * @throws PortalException if a ncbj premises location with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
			getNcbjPremisesLocation(long ncbjPremisesLocationId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPremisesLocationLocalService.getNcbjPremisesLocation(
			ncbjPremisesLocationId);
	}

	/**
	 * Returns a range of all the ncbj premises locations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjPremisesLocationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj premises locations
	 * @param end the upper bound of the range of ncbj premises locations (not inclusive)
	 * @return the range of ncbj premises locations
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation>
			getNcbjPremisesLocations(int start, int end) {

		return _ncbjPremisesLocationLocalService.getNcbjPremisesLocations(
			start, end);
	}

	/**
	 * Returns the number of ncbj premises locations.
	 *
	 * @return the number of ncbj premises locations
	 */
	@Override
	public int getNcbjPremisesLocationsCount() {
		return _ncbjPremisesLocationLocalService.
			getNcbjPremisesLocationsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjPremisesLocationLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjPremisesLocationLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj premises location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPremisesLocationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPremisesLocation the ncbj premises location
	 * @return the ncbj premises location that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
		updateNcbjPremisesLocation(
			com.nbp.ncbj.application.form.service.model.NcbjPremisesLocation
				ncbjPremisesLocation) {

		return _ncbjPremisesLocationLocalService.updateNcbjPremisesLocation(
			ncbjPremisesLocation);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjPremisesLocationLocalService.getBasePersistence();
	}

	@Override
	public NcbjPremisesLocationLocalService getWrappedService() {
		return _ncbjPremisesLocationLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjPremisesLocationLocalService ncbjPremisesLocationLocalService) {

		_ncbjPremisesLocationLocalService = ncbjPremisesLocationLocalService;
	}

	private NcbjPremisesLocationLocalService _ncbjPremisesLocationLocalService;

}