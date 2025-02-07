/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link HealthcareEquipHeadingListLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HealthcareEquipHeadingListLocalService
 * @generated
 */
public class HealthcareEquipHeadingListLocalServiceWrapper
	implements HealthcareEquipHeadingListLocalService,
			   ServiceWrapper<HealthcareEquipHeadingListLocalService> {

	public HealthcareEquipHeadingListLocalServiceWrapper() {
		this(null);
	}

	public HealthcareEquipHeadingListLocalServiceWrapper(
		HealthcareEquipHeadingListLocalService
			healthcareEquipHeadingListLocalService) {

		_healthcareEquipHeadingListLocalService =
			healthcareEquipHeadingListLocalService;
	}

	/**
	 * Adds the healthcare equip heading list to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthcareEquipHeadingListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 * @return the healthcare equip heading list that was added
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList addHealthcareEquipHeadingList(
				com.nbp.healthcare.application.form.service.model.
					HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return _healthcareEquipHeadingListLocalService.
			addHealthcareEquipHeadingList(healthcareEquipHeadingList);
	}

	/**
	 * Creates a new healthcare equip heading list with the primary key. Does not add the healthcare equip heading list to the database.
	 *
	 * @param healthcareEquipHeadingListId the primary key for the new healthcare equip heading list
	 * @return the new healthcare equip heading list
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList createHealthcareEquipHeadingList(
				long healthcareEquipHeadingListId) {

		return _healthcareEquipHeadingListLocalService.
			createHealthcareEquipHeadingList(healthcareEquipHeadingListId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthcareEquipHeadingListLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the healthcare equip heading list from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthcareEquipHeadingListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 * @return the healthcare equip heading list that was removed
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList deleteHealthcareEquipHeadingList(
				com.nbp.healthcare.application.form.service.model.
					HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return _healthcareEquipHeadingListLocalService.
			deleteHealthcareEquipHeadingList(healthcareEquipHeadingList);
	}

	/**
	 * Deletes the healthcare equip heading list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthcareEquipHeadingListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list that was removed
	 * @throws PortalException if a healthcare equip heading list with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList deleteHealthcareEquipHeadingList(
					long healthcareEquipHeadingListId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthcareEquipHeadingListLocalService.
			deleteHealthcareEquipHeadingList(healthcareEquipHeadingListId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthcareEquipHeadingListLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _healthcareEquipHeadingListLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _healthcareEquipHeadingListLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _healthcareEquipHeadingListLocalService.dynamicQuery();
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

		return _healthcareEquipHeadingListLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListModelImpl</code>.
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

		return _healthcareEquipHeadingListLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListModelImpl</code>.
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

		return _healthcareEquipHeadingListLocalService.dynamicQuery(
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

		return _healthcareEquipHeadingListLocalService.dynamicQueryCount(
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

		return _healthcareEquipHeadingListLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList fetchHealthcareEquipHeadingList(
				long healthcareEquipHeadingListId) {

		return _healthcareEquipHeadingListLocalService.
			fetchHealthcareEquipHeadingList(healthcareEquipHeadingListId);
	}

	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList get_HL_HD(String healthcareDescription)
				throws com.nbp.healthcare.application.form.service.exception.
					NoSuchHealthcareEquipHeadingListException {

		return _healthcareEquipHeadingListLocalService.get_HL_HD(
			healthcareDescription);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _healthcareEquipHeadingListLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the healthcare equip heading list with the primary key.
	 *
	 * @param healthcareEquipHeadingListId the primary key of the healthcare equip heading list
	 * @return the healthcare equip heading list
	 * @throws PortalException if a healthcare equip heading list with the primary key could not be found
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList getHealthcareEquipHeadingList(
					long healthcareEquipHeadingListId)
				throws com.liferay.portal.kernel.exception.PortalException {

		return _healthcareEquipHeadingListLocalService.
			getHealthcareEquipHeadingList(healthcareEquipHeadingListId);
	}

	/**
	 * Returns a range of all the healthcare equip heading lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.application.form.service.model.impl.HealthcareEquipHeadingListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of healthcare equip heading lists
	 * @param end the upper bound of the range of healthcare equip heading lists (not inclusive)
	 * @return the range of healthcare equip heading lists
	 */
	@Override
	public java.util.List
		<com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList> getHealthcareEquipHeadingLists(
				int start, int end) {

		return _healthcareEquipHeadingListLocalService.
			getHealthcareEquipHeadingLists(start, end);
	}

	/**
	 * Returns the number of healthcare equip heading lists.
	 *
	 * @return the number of healthcare equip heading lists
	 */
	@Override
	public int getHealthcareEquipHeadingListsCount() {
		return _healthcareEquipHeadingListLocalService.
			getHealthcareEquipHeadingListsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _healthcareEquipHeadingListLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _healthcareEquipHeadingListLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _healthcareEquipHeadingListLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the healthcare equip heading list in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthcareEquipHeadingListLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthcareEquipHeadingList the healthcare equip heading list
	 * @return the healthcare equip heading list that was updated
	 */
	@Override
	public
		com.nbp.healthcare.application.form.service.model.
			HealthcareEquipHeadingList updateHealthcareEquipHeadingList(
				com.nbp.healthcare.application.form.service.model.
					HealthcareEquipHeadingList healthcareEquipHeadingList) {

		return _healthcareEquipHeadingListLocalService.
			updateHealthcareEquipHeadingList(healthcareEquipHeadingList);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _healthcareEquipHeadingListLocalService.getBasePersistence();
	}

	@Override
	public HealthcareEquipHeadingListLocalService getWrappedService() {
		return _healthcareEquipHeadingListLocalService;
	}

	@Override
	public void setWrappedService(
		HealthcareEquipHeadingListLocalService
			healthcareEquipHeadingListLocalService) {

		_healthcareEquipHeadingListLocalService =
			healthcareEquipHeadingListLocalService;
	}

	private HealthcareEquipHeadingListLocalService
		_healthcareEquipHeadingListLocalService;

}