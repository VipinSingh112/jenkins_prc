/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link CreativeInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeInspectionLocalService
 * @generated
 */
public class CreativeInspectionLocalServiceWrapper
	implements CreativeInspectionLocalService,
			   ServiceWrapper<CreativeInspectionLocalService> {

	public CreativeInspectionLocalServiceWrapper() {
		this(null);
	}

	public CreativeInspectionLocalServiceWrapper(
		CreativeInspectionLocalService creativeInspectionLocalService) {

		_creativeInspectionLocalService = creativeInspectionLocalService;
	}

	/**
	 * Adds the creative inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeInspection the creative inspection
	 * @return the creative inspection that was added
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
		addCreativeInspection(
			com.nbp.creative.stages.services.model.CreativeInspection
				creativeInspection) {

		return _creativeInspectionLocalService.addCreativeInspection(
			creativeInspection);
	}

	/**
	 * Creates a new creative inspection with the primary key. Does not add the creative inspection to the database.
	 *
	 * @param creativeInspectionId the primary key for the new creative inspection
	 * @return the new creative inspection
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
		createCreativeInspection(long creativeInspectionId) {

		return _creativeInspectionLocalService.createCreativeInspection(
			creativeInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the creative inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeInspection the creative inspection
	 * @return the creative inspection that was removed
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
		deleteCreativeInspection(
			com.nbp.creative.stages.services.model.CreativeInspection
				creativeInspection) {

		return _creativeInspectionLocalService.deleteCreativeInspection(
			creativeInspection);
	}

	/**
	 * Deletes the creative inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection that was removed
	 * @throws PortalException if a creative inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
			deleteCreativeInspection(long creativeInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeInspectionLocalService.deleteCreativeInspection(
			creativeInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _creativeInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _creativeInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _creativeInspectionLocalService.dynamicQuery();
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

		return _creativeInspectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeInspectionModelImpl</code>.
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

		return _creativeInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeInspectionModelImpl</code>.
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

		return _creativeInspectionLocalService.dynamicQuery(
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

		return _creativeInspectionLocalService.dynamicQueryCount(dynamicQuery);
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

		return _creativeInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
		fetchCreativeInspection(long creativeInspectionId) {

		return _creativeInspectionLocalService.fetchCreativeInspection(
			creativeInspectionId);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
			geCreativeInspectionBy_CI(String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return _creativeInspectionLocalService.geCreativeInspectionBy_CI(
			caseId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _creativeInspectionLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the creative inspection with the primary key.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection
	 * @throws PortalException if a creative inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
			getCreativeInspection(long creativeInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeInspectionLocalService.getCreativeInspection(
			creativeInspectionId);
	}

	/**
	 * Returns a range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of creative inspections
	 */
	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeInspection>
			getCreativeInspections(int start, int end) {

		return _creativeInspectionLocalService.getCreativeInspections(
			start, end);
	}

	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeInspection>
			getCreativeInspections(long creativeApplicationId) {

		return _creativeInspectionLocalService.getCreativeInspections(
			creativeApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeInspection>
			getCreativeInspectionsByCaseId(String caseId) {

		return _creativeInspectionLocalService.getCreativeInspectionsByCaseId(
			caseId);
	}

	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeInspection>
			getCreativeInspectionsByStatusApplicationId(
				long creativeApplicationId, String status) {

		return _creativeInspectionLocalService.
			getCreativeInspectionsByStatusApplicationId(
				creativeApplicationId, status);
	}

	@Override
	public java.util.List
		<com.nbp.creative.stages.services.model.CreativeInspection>
			getCreativeInspectionsByStatusCaseId(String caseId, String status) {

		return _creativeInspectionLocalService.
			getCreativeInspectionsByStatusCaseId(caseId, status);
	}

	/**
	 * Returns the number of creative inspections.
	 *
	 * @return the number of creative inspections
	 */
	@Override
	public int getCreativeInspectionsCount() {
		return _creativeInspectionLocalService.getCreativeInspectionsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _creativeInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
			getInspectionByStatus_SlotBoooked(
				String status, long slotBookedByUser,
				long creativeApplicationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return _creativeInspectionLocalService.
			getInspectionByStatus_SlotBoooked(
				status, slotBookedByUser, creativeApplicationId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _creativeInspectionLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _creativeInspectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the creative inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeInspection the creative inspection
	 * @return the creative inspection that was updated
	 */
	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
		updateCreativeInspection(
			com.nbp.creative.stages.services.model.CreativeInspection
				creativeInspection) {

		return _creativeInspectionLocalService.updateCreativeInspection(
			creativeInspection);
	}

	@Override
	public com.nbp.creative.stages.services.model.CreativeInspection
		updateCreativeInspection(
			String caseId, java.util.Date dateOfinspection) {

		return _creativeInspectionLocalService.updateCreativeInspection(
			caseId, dateOfinspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _creativeInspectionLocalService.getBasePersistence();
	}

	@Override
	public CreativeInspectionLocalService getWrappedService() {
		return _creativeInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		CreativeInspectionLocalService creativeInspectionLocalService) {

		_creativeInspectionLocalService = creativeInspectionLocalService;
	}

	private CreativeInspectionLocalService _creativeInspectionLocalService;

}