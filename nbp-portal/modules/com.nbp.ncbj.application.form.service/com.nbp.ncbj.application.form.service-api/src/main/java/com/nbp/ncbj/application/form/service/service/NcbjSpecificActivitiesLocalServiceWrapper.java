/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link NcbjSpecificActivitiesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSpecificActivitiesLocalService
 * @generated
 */
public class NcbjSpecificActivitiesLocalServiceWrapper
	implements NcbjSpecificActivitiesLocalService,
			   ServiceWrapper<NcbjSpecificActivitiesLocalService> {

	public NcbjSpecificActivitiesLocalServiceWrapper() {
		this(null);
	}

	public NcbjSpecificActivitiesLocalServiceWrapper(
		NcbjSpecificActivitiesLocalService ncbjSpecificActivitiesLocalService) {

		_ncbjSpecificActivitiesLocalService =
			ncbjSpecificActivitiesLocalService;
	}

	/**
	 * Adds the ncbj specific activities to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSpecificActivitiesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSpecificActivities the ncbj specific activities
	 * @return the ncbj specific activities that was added
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
		addNcbjSpecificActivities(
			com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
				ncbjSpecificActivities) {

		return _ncbjSpecificActivitiesLocalService.addNcbjSpecificActivities(
			ncbjSpecificActivities);
	}

	/**
	 * Creates a new ncbj specific activities with the primary key. Does not add the ncbj specific activities to the database.
	 *
	 * @param ncbjSpecificActivitiesId the primary key for the new ncbj specific activities
	 * @return the new ncbj specific activities
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
		createNcbjSpecificActivities(long ncbjSpecificActivitiesId) {

		return _ncbjSpecificActivitiesLocalService.createNcbjSpecificActivities(
			ncbjSpecificActivitiesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSpecificActivitiesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the ncbj specific activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSpecificActivitiesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities that was removed
	 * @throws PortalException if a ncbj specific activities with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
			deleteNcbjSpecificActivities(long ncbjSpecificActivitiesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSpecificActivitiesLocalService.deleteNcbjSpecificActivities(
			ncbjSpecificActivitiesId);
	}

	/**
	 * Deletes the ncbj specific activities from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSpecificActivitiesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSpecificActivities the ncbj specific activities
	 * @return the ncbj specific activities that was removed
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
		deleteNcbjSpecificActivities(
			com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
				ncbjSpecificActivities) {

		return _ncbjSpecificActivitiesLocalService.deleteNcbjSpecificActivities(
			ncbjSpecificActivities);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSpecificActivitiesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _ncbjSpecificActivitiesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _ncbjSpecificActivitiesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ncbjSpecificActivitiesLocalService.dynamicQuery();
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

		return _ncbjSpecificActivitiesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSpecificActivitiesModelImpl</code>.
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

		return _ncbjSpecificActivitiesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSpecificActivitiesModelImpl</code>.
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

		return _ncbjSpecificActivitiesLocalService.dynamicQuery(
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

		return _ncbjSpecificActivitiesLocalService.dynamicQueryCount(
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

		return _ncbjSpecificActivitiesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
		fetchNcbjSpecificActivities(long ncbjSpecificActivitiesId) {

		return _ncbjSpecificActivitiesLocalService.fetchNcbjSpecificActivities(
			ncbjSpecificActivitiesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _ncbjSpecificActivitiesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
			getApp_byNcbjID(long ncbjApplicationId)
		throws com.nbp.ncbj.application.form.service.exception.
			NoSuchNcbjSpecificActivitiesException {

		return _ncbjSpecificActivitiesLocalService.getApp_byNcbjID(
			ncbjApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _ncbjSpecificActivitiesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities>
			getNcbjById(long ncbjApplicationId) {

		return _ncbjSpecificActivitiesLocalService.getNcbjById(
			ncbjApplicationId);
	}

	/**
	 * Returns the ncbj specific activities with the primary key.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities
	 * @throws PortalException if a ncbj specific activities with the primary key could not be found
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
			getNcbjSpecificActivities(long ncbjSpecificActivitiesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSpecificActivitiesLocalService.getNcbjSpecificActivities(
			ncbjSpecificActivitiesId);
	}

	/**
	 * Returns a range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @return the range of ncbj specific activitieses
	 */
	@Override
	public java.util.List
		<com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities>
			getNcbjSpecificActivitieses(int start, int end) {

		return _ncbjSpecificActivitiesLocalService.getNcbjSpecificActivitieses(
			start, end);
	}

	/**
	 * Returns the number of ncbj specific activitieses.
	 *
	 * @return the number of ncbj specific activitieses
	 */
	@Override
	public int getNcbjSpecificActivitiesesCount() {
		return _ncbjSpecificActivitiesLocalService.
			getNcbjSpecificActivitiesesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _ncbjSpecificActivitiesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _ncbjSpecificActivitiesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the ncbj specific activities in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjSpecificActivitiesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjSpecificActivities the ncbj specific activities
	 * @return the ncbj specific activities that was updated
	 */
	@Override
	public com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
		updateNcbjSpecificActivities(
			com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities
				ncbjSpecificActivities) {

		return _ncbjSpecificActivitiesLocalService.updateNcbjSpecificActivities(
			ncbjSpecificActivities);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _ncbjSpecificActivitiesLocalService.getBasePersistence();
	}

	@Override
	public NcbjSpecificActivitiesLocalService getWrappedService() {
		return _ncbjSpecificActivitiesLocalService;
	}

	@Override
	public void setWrappedService(
		NcbjSpecificActivitiesLocalService ncbjSpecificActivitiesLocalService) {

		_ncbjSpecificActivitiesLocalService =
			ncbjSpecificActivitiesLocalService;
	}

	private NcbjSpecificActivitiesLocalService
		_ncbjSpecificActivitiesLocalService;

}