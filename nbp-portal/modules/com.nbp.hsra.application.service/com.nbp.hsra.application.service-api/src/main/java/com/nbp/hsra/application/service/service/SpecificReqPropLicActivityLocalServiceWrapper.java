/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link SpecificReqPropLicActivityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see SpecificReqPropLicActivityLocalService
 * @generated
 */
public class SpecificReqPropLicActivityLocalServiceWrapper
	implements ServiceWrapper<SpecificReqPropLicActivityLocalService>,
			   SpecificReqPropLicActivityLocalService {

	public SpecificReqPropLicActivityLocalServiceWrapper() {
		this(null);
	}

	public SpecificReqPropLicActivityLocalServiceWrapper(
		SpecificReqPropLicActivityLocalService
			specificReqPropLicActivityLocalService) {

		_specificReqPropLicActivityLocalService =
			specificReqPropLicActivityLocalService;
	}

	/**
	 * Adds the specific req prop lic activity to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was added
	 */
	@Override
	public com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
		addSpecificReqPropLicActivity(
			com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
				specificReqPropLicActivity) {

		return _specificReqPropLicActivityLocalService.
			addSpecificReqPropLicActivity(specificReqPropLicActivity);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _specificReqPropLicActivityLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new specific req prop lic activity with the primary key. Does not add the specific req prop lic activity to the database.
	 *
	 * @param specificReqPropLicActivityId the primary key for the new specific req prop lic activity
	 * @return the new specific req prop lic activity
	 */
	@Override
	public com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
		createSpecificReqPropLicActivity(long specificReqPropLicActivityId) {

		return _specificReqPropLicActivityLocalService.
			createSpecificReqPropLicActivity(specificReqPropLicActivityId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _specificReqPropLicActivityLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the specific req prop lic activity with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 * @throws PortalException if a specific req prop lic activity with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
			deleteSpecificReqPropLicActivity(long specificReqPropLicActivityId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _specificReqPropLicActivityLocalService.
			deleteSpecificReqPropLicActivity(specificReqPropLicActivityId);
	}

	/**
	 * Deletes the specific req prop lic activity from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was removed
	 */
	@Override
	public com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
		deleteSpecificReqPropLicActivity(
			com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
				specificReqPropLicActivity) {

		return _specificReqPropLicActivityLocalService.
			deleteSpecificReqPropLicActivity(specificReqPropLicActivity);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _specificReqPropLicActivityLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _specificReqPropLicActivityLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _specificReqPropLicActivityLocalService.dynamicQuery();
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

		return _specificReqPropLicActivityLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
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

		return _specificReqPropLicActivityLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
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

		return _specificReqPropLicActivityLocalService.dynamicQuery(
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

		return _specificReqPropLicActivityLocalService.dynamicQueryCount(
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

		return _specificReqPropLicActivityLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
		fetchSpecificReqPropLicActivity(long specificReqPropLicActivityId) {

		return _specificReqPropLicActivityLocalService.
			fetchSpecificReqPropLicActivity(specificReqPropLicActivityId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _specificReqPropLicActivityLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
			getHsraById(long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchSpecificReqPropLicActivityException {

		return _specificReqPropLicActivityLocalService.getHsraById(
			hsraApplicationId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _specificReqPropLicActivityLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _specificReqPropLicActivityLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _specificReqPropLicActivityLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the specific req prop lic activities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.SpecificReqPropLicActivityModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of specific req prop lic activities
	 * @param end the upper bound of the range of specific req prop lic activities (not inclusive)
	 * @return the range of specific req prop lic activities
	 */
	@Override
	public java.util.List
		<com.nbp.hsra.application.service.model.SpecificReqPropLicActivity>
			getSpecificReqPropLicActivities(int start, int end) {

		return _specificReqPropLicActivityLocalService.
			getSpecificReqPropLicActivities(start, end);
	}

	/**
	 * Returns the number of specific req prop lic activities.
	 *
	 * @return the number of specific req prop lic activities
	 */
	@Override
	public int getSpecificReqPropLicActivitiesCount() {
		return _specificReqPropLicActivityLocalService.
			getSpecificReqPropLicActivitiesCount();
	}

	/**
	 * Returns the specific req prop lic activity with the primary key.
	 *
	 * @param specificReqPropLicActivityId the primary key of the specific req prop lic activity
	 * @return the specific req prop lic activity
	 * @throws PortalException if a specific req prop lic activity with the primary key could not be found
	 */
	@Override
	public com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
			getSpecificReqPropLicActivity(long specificReqPropLicActivityId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _specificReqPropLicActivityLocalService.
			getSpecificReqPropLicActivity(specificReqPropLicActivityId);
	}

	/**
	 * Updates the specific req prop lic activity in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SpecificReqPropLicActivityLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param specificReqPropLicActivity the specific req prop lic activity
	 * @return the specific req prop lic activity that was updated
	 */
	@Override
	public com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
		updateSpecificReqPropLicActivity(
			com.nbp.hsra.application.service.model.SpecificReqPropLicActivity
				specificReqPropLicActivity) {

		return _specificReqPropLicActivityLocalService.
			updateSpecificReqPropLicActivity(specificReqPropLicActivity);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _specificReqPropLicActivityLocalService.getBasePersistence();
	}

	@Override
	public SpecificReqPropLicActivityLocalService getWrappedService() {
		return _specificReqPropLicActivityLocalService;
	}

	@Override
	public void setWrappedService(
		SpecificReqPropLicActivityLocalService
			specificReqPropLicActivityLocalService) {

		_specificReqPropLicActivityLocalService =
			specificReqPropLicActivityLocalService;
	}

	private SpecificReqPropLicActivityLocalService
		_specificReqPropLicActivityLocalService;

}