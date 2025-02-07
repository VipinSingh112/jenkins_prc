/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddOutsourcedActivitiesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddOutsourcedActivitiesLocalService
 * @generated
 */
public class AddOutsourcedActivitiesLocalServiceWrapper
	implements AddOutsourcedActivitiesLocalService,
			   ServiceWrapper<AddOutsourcedActivitiesLocalService> {

	public AddOutsourcedActivitiesLocalServiceWrapper() {
		this(null);
	}

	public AddOutsourcedActivitiesLocalServiceWrapper(
		AddOutsourcedActivitiesLocalService
			addOutsourcedActivitiesLocalService) {

		_addOutsourcedActivitiesLocalService =
			addOutsourcedActivitiesLocalService;
	}

	/**
	 * Adds the add outsourced activities to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddOutsourcedActivitiesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addOutsourcedActivities the add outsourced activities
	 * @return the add outsourced activities that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddOutsourcedActivities
		addAddOutsourcedActivities(
			com.nbp.janaac.application.form.service.model.
				AddOutsourcedActivities addOutsourcedActivities) {

		return _addOutsourcedActivitiesLocalService.addAddOutsourcedActivities(
			addOutsourcedActivities);
	}

	/**
	 * Creates a new add outsourced activities with the primary key. Does not add the add outsourced activities to the database.
	 *
	 * @param addOutsourcedActivitiesId the primary key for the new add outsourced activities
	 * @return the new add outsourced activities
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddOutsourcedActivities
		createAddOutsourcedActivities(long addOutsourcedActivitiesId) {

		return _addOutsourcedActivitiesLocalService.
			createAddOutsourcedActivities(addOutsourcedActivitiesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addOutsourcedActivitiesLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add outsourced activities from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddOutsourcedActivitiesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addOutsourcedActivities the add outsourced activities
	 * @return the add outsourced activities that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddOutsourcedActivities
		deleteAddOutsourcedActivities(
			com.nbp.janaac.application.form.service.model.
				AddOutsourcedActivities addOutsourcedActivities) {

		return _addOutsourcedActivitiesLocalService.
			deleteAddOutsourcedActivities(addOutsourcedActivities);
	}

	/**
	 * Deletes the add outsourced activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddOutsourcedActivitiesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities that was removed
	 * @throws PortalException if a add outsourced activities with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddOutsourcedActivities
			deleteAddOutsourcedActivities(long addOutsourcedActivitiesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addOutsourcedActivitiesLocalService.
			deleteAddOutsourcedActivities(addOutsourcedActivitiesId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addOutsourcedActivitiesLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addOutsourcedActivitiesLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addOutsourcedActivitiesLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addOutsourcedActivitiesLocalService.dynamicQuery();
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

		return _addOutsourcedActivitiesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddOutsourcedActivitiesModelImpl</code>.
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

		return _addOutsourcedActivitiesLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddOutsourcedActivitiesModelImpl</code>.
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

		return _addOutsourcedActivitiesLocalService.dynamicQuery(
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

		return _addOutsourcedActivitiesLocalService.dynamicQueryCount(
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

		return _addOutsourcedActivitiesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddOutsourcedActivities
		fetchAddOutsourcedActivities(long addOutsourcedActivitiesId) {

		return _addOutsourcedActivitiesLocalService.
			fetchAddOutsourcedActivities(addOutsourcedActivitiesId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addOutsourcedActivitiesLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the add outsourced activities with the primary key.
	 *
	 * @param addOutsourcedActivitiesId the primary key of the add outsourced activities
	 * @return the add outsourced activities
	 * @throws PortalException if a add outsourced activities with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddOutsourcedActivities
			getAddOutsourcedActivities(long addOutsourcedActivitiesId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addOutsourcedActivitiesLocalService.getAddOutsourcedActivities(
			addOutsourcedActivitiesId);
	}

	/**
	 * Returns a range of all the add outsourced activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddOutsourcedActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add outsourced activitieses
	 * @param end the upper bound of the range of add outsourced activitieses (not inclusive)
	 * @return the range of add outsourced activitieses
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddOutsourcedActivities>
			getAddOutsourcedActivitieses(int start, int end) {

		return _addOutsourcedActivitiesLocalService.
			getAddOutsourcedActivitieses(start, end);
	}

	/**
	 * Returns the number of add outsourced activitieses.
	 *
	 * @return the number of add outsourced activitieses
	 */
	@Override
	public int getAddOutsourcedActivitiesesCount() {
		return _addOutsourcedActivitiesLocalService.
			getAddOutsourcedActivitiesesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addOutsourcedActivitiesLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddOutsourcedActivities>
			getJanaac_OutSrc_Id(long janaacApplicationId) {

		return _addOutsourcedActivitiesLocalService.getJanaac_OutSrc_Id(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addOutsourcedActivitiesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addOutsourcedActivitiesLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add outsourced activities in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddOutsourcedActivitiesLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addOutsourcedActivities the add outsourced activities
	 * @return the add outsourced activities that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddOutsourcedActivities
		updateAddOutsourcedActivities(
			com.nbp.janaac.application.form.service.model.
				AddOutsourcedActivities addOutsourcedActivities) {

		return _addOutsourcedActivitiesLocalService.
			updateAddOutsourcedActivities(addOutsourcedActivities);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addOutsourcedActivitiesLocalService.getBasePersistence();
	}

	@Override
	public AddOutsourcedActivitiesLocalService getWrappedService() {
		return _addOutsourcedActivitiesLocalService;
	}

	@Override
	public void setWrappedService(
		AddOutsourcedActivitiesLocalService
			addOutsourcedActivitiesLocalService) {

		_addOutsourcedActivitiesLocalService =
			addOutsourcedActivitiesLocalService;
	}

	private AddOutsourcedActivitiesLocalService
		_addOutsourcedActivitiesLocalService;

}