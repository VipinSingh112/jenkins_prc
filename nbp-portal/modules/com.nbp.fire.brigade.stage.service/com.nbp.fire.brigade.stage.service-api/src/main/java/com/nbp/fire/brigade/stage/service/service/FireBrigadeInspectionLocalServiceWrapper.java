/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link FireBrigadeInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeInspectionLocalService
 * @generated
 */
public class FireBrigadeInspectionLocalServiceWrapper
	implements FireBrigadeInspectionLocalService,
			   ServiceWrapper<FireBrigadeInspectionLocalService> {

	public FireBrigadeInspectionLocalServiceWrapper() {
		this(null);
	}

	public FireBrigadeInspectionLocalServiceWrapper(
		FireBrigadeInspectionLocalService fireBrigadeInspectionLocalService) {

		_fireBrigadeInspectionLocalService = fireBrigadeInspectionLocalService;
	}

	/**
	 * Adds the fire brigade inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 * @return the fire brigade inspection that was added
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
		addFireBrigadeInspection(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
				fireBrigadeInspection) {

		return _fireBrigadeInspectionLocalService.addFireBrigadeInspection(
			fireBrigadeInspection);
	}

	/**
	 * Creates a new fire brigade inspection with the primary key. Does not add the fire brigade inspection to the database.
	 *
	 * @param fireBrigadeInspectionId the primary key for the new fire brigade inspection
	 * @return the new fire brigade inspection
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
		createFireBrigadeInspection(long fireBrigadeInspectionId) {

		return _fireBrigadeInspectionLocalService.createFireBrigadeInspection(
			fireBrigadeInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the fire brigade inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 * @return the fire brigade inspection that was removed
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
		deleteFireBrigadeInspection(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
				fireBrigadeInspection) {

		return _fireBrigadeInspectionLocalService.deleteFireBrigadeInspection(
			fireBrigadeInspection);
	}

	/**
	 * Deletes the fire brigade inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection that was removed
	 * @throws PortalException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
			deleteFireBrigadeInspection(long fireBrigadeInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeInspectionLocalService.deleteFireBrigadeInspection(
			fireBrigadeInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fireBrigadeInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fireBrigadeInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fireBrigadeInspectionLocalService.dynamicQuery();
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

		return _fireBrigadeInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeInspectionModelImpl</code>.
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

		return _fireBrigadeInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeInspectionModelImpl</code>.
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

		return _fireBrigadeInspectionLocalService.dynamicQuery(
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

		return _fireBrigadeInspectionLocalService.dynamicQueryCount(
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

		return _fireBrigadeInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
		fetchFireBrigadeInspection(long fireBrigadeInspectionId) {

		return _fireBrigadeInspectionLocalService.fetchFireBrigadeInspection(
			fireBrigadeInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fireBrigadeInspectionLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection>
			getFBI_CaseId(String caseId) {

		return _fireBrigadeInspectionLocalService.getFBI_CaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection>
			getFBI_CaseIdApplicationId(
				String status, long fireBrigadeApplicationId) {

		return _fireBrigadeInspectionLocalService.getFBI_CaseIdApplicationId(
			status, fireBrigadeApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection>
			getFBI_CaseIdStatus(String caseId, String status) {

		return _fireBrigadeInspectionLocalService.getFBI_CaseIdStatus(
			caseId, status);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection>
			getFBI_FBAI(long fireBrigadeApplicationId) {

		return _fireBrigadeInspectionLocalService.getFBI_FBAI(
			fireBrigadeApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection>
			getFBI_Status(String status) {

		return _fireBrigadeInspectionLocalService.getFBI_Status(status);
	}

	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection>
			getFBI_StatusApplicationId(
				String status, long fireBrigadeApplicationId) {

		return _fireBrigadeInspectionLocalService.getFBI_StatusApplicationId(
			status, fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade inspection with the primary key.
	 *
	 * @param fireBrigadeInspectionId the primary key of the fire brigade inspection
	 * @return the fire brigade inspection
	 * @throws PortalException if a fire brigade inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
			getFireBrigadeInspection(long fireBrigadeInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeInspectionLocalService.getFireBrigadeInspection(
			fireBrigadeInspectionId);
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
			getFireBrigadeInspectionBy_CI(String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return _fireBrigadeInspectionLocalService.getFireBrigadeInspectionBy_CI(
			caseId);
	}

	/**
	 * Returns a range of all the fire brigade inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade inspections
	 * @param end the upper bound of the range of fire brigade inspections (not inclusive)
	 * @return the range of fire brigade inspections
	 */
	@Override
	public java.util.List
		<com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection>
			getFireBrigadeInspections(int start, int end) {

		return _fireBrigadeInspectionLocalService.getFireBrigadeInspections(
			start, end);
	}

	/**
	 * Returns the number of fire brigade inspections.
	 *
	 * @return the number of fire brigade inspections
	 */
	@Override
	public int getFireBrigadeInspectionsCount() {
		return _fireBrigadeInspectionLocalService.
			getFireBrigadeInspectionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fireBrigadeInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser,
				long fireBrigadeApplicationId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeInspectionException {

		return _fireBrigadeInspectionLocalService.
			getInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, fireBrigadeApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fireBrigadeInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fireBrigadeInspectionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the fire brigade inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeInspection the fire brigade inspection
	 * @return the fire brigade inspection that was updated
	 */
	@Override
	public com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
		updateFireBrigadeInspection(
			com.nbp.fire.brigade.stage.service.model.FireBrigadeInspection
				fireBrigadeInspection) {

		return _fireBrigadeInspectionLocalService.updateFireBrigadeInspection(
			fireBrigadeInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _fireBrigadeInspectionLocalService.getBasePersistence();
	}

	@Override
	public FireBrigadeInspectionLocalService getWrappedService() {
		return _fireBrigadeInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		FireBrigadeInspectionLocalService fireBrigadeInspectionLocalService) {

		_fireBrigadeInspectionLocalService = fireBrigadeInspectionLocalService;
	}

	private FireBrigadeInspectionLocalService
		_fireBrigadeInspectionLocalService;

}