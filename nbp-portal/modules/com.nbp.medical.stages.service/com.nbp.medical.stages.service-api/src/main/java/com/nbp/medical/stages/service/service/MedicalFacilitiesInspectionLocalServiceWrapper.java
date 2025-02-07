/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesInspectionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesInspectionLocalService
 * @generated
 */
public class MedicalFacilitiesInspectionLocalServiceWrapper
	implements MedicalFacilitiesInspectionLocalService,
			   ServiceWrapper<MedicalFacilitiesInspectionLocalService> {

	public MedicalFacilitiesInspectionLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesInspectionLocalServiceWrapper(
		MedicalFacilitiesInspectionLocalService
			medicalFacilitiesInspectionLocalService) {

		_medicalFacilitiesInspectionLocalService =
			medicalFacilitiesInspectionLocalService;
	}

	/**
	 * Adds the medical facilities inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesInspection the medical facilities inspection
	 * @return the medical facilities inspection that was added
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
		addMedicalFacilitiesInspection(
			com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
				medicalFacilitiesInspection) {

		return _medicalFacilitiesInspectionLocalService.
			addMedicalFacilitiesInspection(medicalFacilitiesInspection);
	}

	/**
	 * Creates a new medical facilities inspection with the primary key. Does not add the medical facilities inspection to the database.
	 *
	 * @param medicalInspectionId the primary key for the new medical facilities inspection
	 * @return the new medical facilities inspection
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
		createMedicalFacilitiesInspection(long medicalInspectionId) {

		return _medicalFacilitiesInspectionLocalService.
			createMedicalFacilitiesInspection(medicalInspectionId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesInspectionLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection that was removed
	 * @throws PortalException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
			deleteMedicalFacilitiesInspection(long medicalInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesInspectionLocalService.
			deleteMedicalFacilitiesInspection(medicalInspectionId);
	}

	/**
	 * Deletes the medical facilities inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesInspection the medical facilities inspection
	 * @return the medical facilities inspection that was removed
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
		deleteMedicalFacilitiesInspection(
			com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
				medicalFacilitiesInspection) {

		return _medicalFacilitiesInspectionLocalService.
			deleteMedicalFacilitiesInspection(medicalFacilitiesInspection);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesInspectionLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesInspectionLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesInspectionLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesInspectionLocalService.dynamicQuery();
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

		return _medicalFacilitiesInspectionLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalFacilitiesInspectionModelImpl</code>.
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

		return _medicalFacilitiesInspectionLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalFacilitiesInspectionModelImpl</code>.
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

		return _medicalFacilitiesInspectionLocalService.dynamicQuery(
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

		return _medicalFacilitiesInspectionLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesInspectionLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
		fetchMedicalFacilitiesInspection(long medicalInspectionId) {

		return _medicalFacilitiesInspectionLocalService.
			fetchMedicalFacilitiesInspection(medicalInspectionId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesInspectionLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesInspectionLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long medicalApplicationId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return _medicalFacilitiesInspectionLocalService.
			getInspectionByStatus_SlotBoooked_ApplicationId(
				status, slotBookedByUser, medicalApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalFacilitiesInspection>
			getMed_CaseId(String caseId) {

		return _medicalFacilitiesInspectionLocalService.getMed_CaseId(caseId);
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalFacilitiesInspection>
			getMed_CaseIdApplicationId(
				String status, long medicalApplicationId) {

		return _medicalFacilitiesInspectionLocalService.
			getMed_CaseIdApplicationId(status, medicalApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalFacilitiesInspection>
			getMed_CaseIdStatus(String caseId, String status) {

		return _medicalFacilitiesInspectionLocalService.getMed_CaseIdStatus(
			caseId, status);
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalFacilitiesInspection>
			getMed_FBAI(long medicalApplicationId) {

		return _medicalFacilitiesInspectionLocalService.getMed_FBAI(
			medicalApplicationId);
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalFacilitiesInspection>
			getMed_Status(String status) {

		return _medicalFacilitiesInspectionLocalService.getMed_Status(status);
	}

	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalFacilitiesInspection>
			getMed_StatusApplicationId(
				String status, long medicalApplicationId) {

		return _medicalFacilitiesInspectionLocalService.
			getMed_StatusApplicationId(status, medicalApplicationId);
	}

	/**
	 * Returns the medical facilities inspection with the primary key.
	 *
	 * @param medicalInspectionId the primary key of the medical facilities inspection
	 * @return the medical facilities inspection
	 * @throws PortalException if a medical facilities inspection with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
			getMedicalFacilitiesInspection(long medicalInspectionId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesInspectionLocalService.
			getMedicalFacilitiesInspection(medicalInspectionId);
	}

	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
			getMedicalFacilitiesInspectionBy_CI(String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalFacilitiesInspectionException {

		return _medicalFacilitiesInspectionLocalService.
			getMedicalFacilitiesInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the medical facilities inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalFacilitiesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities inspections
	 * @param end the upper bound of the range of medical facilities inspections (not inclusive)
	 * @return the range of medical facilities inspections
	 */
	@Override
	public java.util.List
		<com.nbp.medical.stages.service.model.MedicalFacilitiesInspection>
			getMedicalFacilitiesInspections(int start, int end) {

		return _medicalFacilitiesInspectionLocalService.
			getMedicalFacilitiesInspections(start, end);
	}

	/**
	 * Returns the number of medical facilities inspections.
	 *
	 * @return the number of medical facilities inspections
	 */
	@Override
	public int getMedicalFacilitiesInspectionsCount() {
		return _medicalFacilitiesInspectionLocalService.
			getMedicalFacilitiesInspectionsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesInspectionLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesInspectionLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesInspection the medical facilities inspection
	 * @return the medical facilities inspection that was updated
	 */
	@Override
	public com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
		updateMedicalFacilitiesInspection(
			com.nbp.medical.stages.service.model.MedicalFacilitiesInspection
				medicalFacilitiesInspection) {

		return _medicalFacilitiesInspectionLocalService.
			updateMedicalFacilitiesInspection(medicalFacilitiesInspection);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesInspectionLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesInspectionLocalService getWrappedService() {
		return _medicalFacilitiesInspectionLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesInspectionLocalService
			medicalFacilitiesInspectionLocalService) {

		_medicalFacilitiesInspectionLocalService =
			medicalFacilitiesInspectionLocalService;
	}

	private MedicalFacilitiesInspectionLocalService
		_medicalFacilitiesInspectionLocalService;

}