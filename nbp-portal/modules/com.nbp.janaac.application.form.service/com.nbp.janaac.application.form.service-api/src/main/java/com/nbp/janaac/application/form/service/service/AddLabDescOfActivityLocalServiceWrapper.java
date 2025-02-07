/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link AddLabDescOfActivityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AddLabDescOfActivityLocalService
 * @generated
 */
public class AddLabDescOfActivityLocalServiceWrapper
	implements AddLabDescOfActivityLocalService,
			   ServiceWrapper<AddLabDescOfActivityLocalService> {

	public AddLabDescOfActivityLocalServiceWrapper() {
		this(null);
	}

	public AddLabDescOfActivityLocalServiceWrapper(
		AddLabDescOfActivityLocalService addLabDescOfActivityLocalService) {

		_addLabDescOfActivityLocalService = addLabDescOfActivityLocalService;
	}

	/**
	 * Adds the add lab desc of activity to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabDescOfActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabDescOfActivity the add lab desc of activity
	 * @return the add lab desc of activity that was added
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
		addAddLabDescOfActivity(
			com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
				addLabDescOfActivity) {

		return _addLabDescOfActivityLocalService.addAddLabDescOfActivity(
			addLabDescOfActivity);
	}

	/**
	 * Creates a new add lab desc of activity with the primary key. Does not add the add lab desc of activity to the database.
	 *
	 * @param addLabDescOfActivityId the primary key for the new add lab desc of activity
	 * @return the new add lab desc of activity
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
		createAddLabDescOfActivity(long addLabDescOfActivityId) {

		return _addLabDescOfActivityLocalService.createAddLabDescOfActivity(
			addLabDescOfActivityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabDescOfActivityLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the add lab desc of activity from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabDescOfActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabDescOfActivity the add lab desc of activity
	 * @return the add lab desc of activity that was removed
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
		deleteAddLabDescOfActivity(
			com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
				addLabDescOfActivity) {

		return _addLabDescOfActivityLocalService.deleteAddLabDescOfActivity(
			addLabDescOfActivity);
	}

	/**
	 * Deletes the add lab desc of activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabDescOfActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity that was removed
	 * @throws PortalException if a add lab desc of activity with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
			deleteAddLabDescOfActivity(long addLabDescOfActivityId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabDescOfActivityLocalService.deleteAddLabDescOfActivity(
			addLabDescOfActivityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabDescOfActivityLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _addLabDescOfActivityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _addLabDescOfActivityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _addLabDescOfActivityLocalService.dynamicQuery();
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

		return _addLabDescOfActivityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabDescOfActivityModelImpl</code>.
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

		return _addLabDescOfActivityLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabDescOfActivityModelImpl</code>.
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

		return _addLabDescOfActivityLocalService.dynamicQuery(
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

		return _addLabDescOfActivityLocalService.dynamicQueryCount(
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

		return _addLabDescOfActivityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
		fetchAddLabDescOfActivity(long addLabDescOfActivityId) {

		return _addLabDescOfActivityLocalService.fetchAddLabDescOfActivity(
			addLabDescOfActivityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _addLabDescOfActivityLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns a range of all the add lab desc of activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.application.form.service.model.impl.AddLabDescOfActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of add lab desc of activities
	 * @param end the upper bound of the range of add lab desc of activities (not inclusive)
	 * @return the range of add lab desc of activities
	 */
	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabDescOfActivity>
			getAddLabDescOfActivities(int start, int end) {

		return _addLabDescOfActivityLocalService.getAddLabDescOfActivities(
			start, end);
	}

	/**
	 * Returns the number of add lab desc of activities.
	 *
	 * @return the number of add lab desc of activities
	 */
	@Override
	public int getAddLabDescOfActivitiesCount() {
		return _addLabDescOfActivityLocalService.
			getAddLabDescOfActivitiesCount();
	}

	/**
	 * Returns the add lab desc of activity with the primary key.
	 *
	 * @param addLabDescOfActivityId the primary key of the add lab desc of activity
	 * @return the add lab desc of activity
	 * @throws PortalException if a add lab desc of activity with the primary key could not be found
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
			getAddLabDescOfActivity(long addLabDescOfActivityId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabDescOfActivityLocalService.getAddLabDescOfActivity(
			addLabDescOfActivityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _addLabDescOfActivityLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.janaac.application.form.service.model.AddLabDescOfActivity>
			getJanaacById(long janaacApplicationId) {

		return _addLabDescOfActivityLocalService.getJanaacById(
			janaacApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _addLabDescOfActivityLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _addLabDescOfActivityLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the add lab desc of activity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AddLabDescOfActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param addLabDescOfActivity the add lab desc of activity
	 * @return the add lab desc of activity that was updated
	 */
	@Override
	public com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
		updateAddLabDescOfActivity(
			com.nbp.janaac.application.form.service.model.AddLabDescOfActivity
				addLabDescOfActivity) {

		return _addLabDescOfActivityLocalService.updateAddLabDescOfActivity(
			addLabDescOfActivity);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _addLabDescOfActivityLocalService.getBasePersistence();
	}

	@Override
	public AddLabDescOfActivityLocalService getWrappedService() {
		return _addLabDescOfActivityLocalService;
	}

	@Override
	public void setWrappedService(
		AddLabDescOfActivityLocalService addLabDescOfActivityLocalService) {

		_addLabDescOfActivityLocalService = addLabDescOfActivityLocalService;
	}

	private AddLabDescOfActivityLocalService _addLabDescOfActivityLocalService;

}