/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CannabisInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisInspectionLocalService
 * @generated
 */
public class CannabisInspectionLocalServiceWrapper
	implements CannabisInspectionLocalService,
			   ServiceWrapper<CannabisInspectionLocalService> {

	public CannabisInspectionLocalServiceWrapper() {
		this(null);
	}

	public CannabisInspectionLocalServiceWrapper(
		CannabisInspectionLocalService cannabisInspectionLocalService) {

		_cannabisInspectionLocalService = cannabisInspectionLocalService;
	}

	/**
	 * Adds the cannabis inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisInspection the cannabis inspection
	 * @return the cannabis inspection that was added
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
		addCannabisInspection(
			com.npm.cannabis.application.stages.services.model.
				CannabisInspection cannabisInspection) {

		return _cannabisInspectionLocalService.addCannabisInspection(
			cannabisInspection);
	}

	/**
	 * Creates a new cannabis inspection with the primary key. Does not add the cannabis inspection to the database.
	 *
	 * @param cannabisInspectionId the primary key for the new cannabis inspection
	 * @return the new cannabis inspection
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
		createCannabisInspection(long cannabisInspectionId) {

		return _cannabisInspectionLocalService.createCannabisInspection(
			cannabisInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the cannabis inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisInspection the cannabis inspection
	 * @return the cannabis inspection that was removed
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
		deleteCannabisInspection(
			com.npm.cannabis.application.stages.services.model.
				CannabisInspection cannabisInspection) {

		return _cannabisInspectionLocalService.deleteCannabisInspection(
			cannabisInspection);
	}

	/**
	 * Deletes the cannabis inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection that was removed
	 * @throws PortalException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
			deleteCannabisInspection(long cannabisInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisInspectionLocalService.deleteCannabisInspection(
			cannabisInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _cannabisInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _cannabisInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _cannabisInspectionLocalService.dynamicQuery();
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

		return _cannabisInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionModelImpl</code>.
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

		return _cannabisInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionModelImpl</code>.
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

		return _cannabisInspectionLocalService.dynamicQuery(
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

		return _cannabisInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _cannabisInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
		fetchCannabisInspection(long cannabisInspectionId) {

		return _cannabisInspectionLocalService.fetchCannabisInspection(
			cannabisInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _cannabisInspectionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis inspection with the primary key.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection
	 * @throws PortalException if a cannabis inspection with the primary key could not be found
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
			getCannabisInspection(long cannabisInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisInspectionLocalService.getCannabisInspection(
			cannabisInspectionId);
	}

	/**
	 * Returns a range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of cannabis inspections
	 */
	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.CannabisInspection>
			getCannabisInspections(int start, int end) {

		return _cannabisInspectionLocalService.getCannabisInspections(
			start, end);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.CannabisInspection>
			getCannabisInspections(long cannabisApplicationId) {

		return _cannabisInspectionLocalService.getCannabisInspections(
			cannabisApplicationId);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.CannabisInspection>
			getCannabisInspectionsByCaseId(String caseId) {

		return _cannabisInspectionLocalService.getCannabisInspectionsByCaseId(
			caseId);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.CannabisInspection>
			getCannabisInspectionsByStatusApplicationId(
				long cannabisApplicationId, String status) {

		return _cannabisInspectionLocalService.
			getCannabisInspectionsByStatusApplicationId(
				cannabisApplicationId, status);
	}

	@Override
	public java.util.List
		<com.npm.cannabis.application.stages.services.model.CannabisInspection>
			getCannabisInspectionsByStatusCaseId(String caseId, String status) {

		return _cannabisInspectionLocalService.
			getCannabisInspectionsByStatusCaseId(caseId, status);
	}

	/**
	 * Returns the number of cannabis inspections.
	 *
	 * @return the number of cannabis inspections
	 */
	@Override
	public int getCannabisInspectionsCount() {
		return _cannabisInspectionLocalService.getCannabisInspectionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _cannabisInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
			getInspectionByStatus_SlotBoooked(
				String status, long slotBookedByUser)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return _cannabisInspectionLocalService.
			getInspectionByStatus_SlotBoooked(status, slotBookedByUser);
	}

	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
			getInspectionByStatus_SlotBoooked(
				String status, long slotBookedByUser,
				long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return _cannabisInspectionLocalService.
			getInspectionByStatus_SlotBoooked(
				status, slotBookedByUser, cannabisApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _cannabisInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _cannabisInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the cannabis inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisInspection the cannabis inspection
	 * @return the cannabis inspection that was updated
	 */
	@Override
	public com.npm.cannabis.application.stages.services.model.CannabisInspection
		updateCannabisInspection(
			com.npm.cannabis.application.stages.services.model.
				CannabisInspection cannabisInspection) {

		return _cannabisInspectionLocalService.updateCannabisInspection(
			cannabisInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _cannabisInspectionLocalService.getBasePersistence();
	}

	@Override
	public CannabisInspectionLocalService getWrappedService() {
		return _cannabisInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		CannabisInspectionLocalService cannabisInspectionLocalService) {

		_cannabisInspectionLocalService = cannabisInspectionLocalService;
	}

	private CannabisInspectionLocalService _cannabisInspectionLocalService;

}