/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesNurseStaffLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseStaffLocalService
 * @generated
 */
public class MedicalFacilitiesNurseStaffLocalServiceWrapper
	implements MedicalFacilitiesNurseStaffLocalService,
			   ServiceWrapper<MedicalFacilitiesNurseStaffLocalService> {

	public MedicalFacilitiesNurseStaffLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesNurseStaffLocalServiceWrapper(
		MedicalFacilitiesNurseStaffLocalService
			medicalFacilitiesNurseStaffLocalService) {

		_medicalFacilitiesNurseStaffLocalService =
			medicalFacilitiesNurseStaffLocalService;
	}

	/**
	 * Adds the medical facilities nurse staff to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff addMedicalFacilitiesNurseStaff(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return _medicalFacilitiesNurseStaffLocalService.
			addMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaff);
	}

	/**
	 * Creates a new medical facilities nurse staff with the primary key. Does not add the medical facilities nurse staff to the database.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key for the new medical facilities nurse staff
	 * @return the new medical facilities nurse staff
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff createMedicalFacilitiesNurseStaff(
			long medicalFacilitiesNurseStaffId) {

		return _medicalFacilitiesNurseStaffLocalService.
			createMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaffId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseStaffLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities nurse staff with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 * @throws PortalException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff deleteMedicalFacilitiesNurseStaff(
				long medicalFacilitiesNurseStaffId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseStaffLocalService.
			deleteMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaffId);
	}

	/**
	 * Deletes the medical facilities nurse staff from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff deleteMedicalFacilitiesNurseStaff(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return _medicalFacilitiesNurseStaffLocalService.
			deleteMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaff);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseStaffLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesNurseStaffLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesNurseStaffLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesNurseStaffLocalService.dynamicQuery();
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

		return _medicalFacilitiesNurseStaffLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
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

		return _medicalFacilitiesNurseStaffLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
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

		return _medicalFacilitiesNurseStaffLocalService.dynamicQuery(
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

		return _medicalFacilitiesNurseStaffLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesNurseStaffLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff fetchMedicalFacilitiesNurseStaff(
			long medicalFacilitiesNurseStaffId) {

		return _medicalFacilitiesNurseStaffLocalService.
			fetchMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns the medical facilities nurse staff matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse staff, or <code>null</code> if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff
			fetchMedicalFacilitiesNurseStaffByUuidAndGroupId(
				String uuid, long groupId) {

		return _medicalFacilitiesNurseStaffLocalService.
			fetchMedicalFacilitiesNurseStaffByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesNurseStaffLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesNurseStaffLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesNurseStaffLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesNurseStaff> getMedicalFacilitiesAppliInfoBy_Id(
				long applicationId) {

		return _medicalFacilitiesNurseStaffLocalService.
			getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities nurse staff with the primary key.
	 *
	 * @param medicalFacilitiesNurseStaffId the primary key of the medical facilities nurse staff
	 * @return the medical facilities nurse staff
	 * @throws PortalException if a medical facilities nurse staff with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff getMedicalFacilitiesNurseStaff(
				long medicalFacilitiesNurseStaffId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseStaffLocalService.
			getMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaffId);
	}

	/**
	 * Returns the medical facilities nurse staff matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse staff's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse staff
	 * @throws PortalException if a matching medical facilities nurse staff could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff
				getMedicalFacilitiesNurseStaffByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseStaffLocalService.
			getMedicalFacilitiesNurseStaffByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities nurse staffs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseStaffModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @return the range of medical facilities nurse staffs
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesNurseStaff> getMedicalFacilitiesNurseStaffs(
				int start, int end) {

		return _medicalFacilitiesNurseStaffLocalService.
			getMedicalFacilitiesNurseStaffs(start, end);
	}

	/**
	 * Returns all the medical facilities nurse staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse staffs
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities nurse staffs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesNurseStaff>
				getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesNurseStaffLocalService.
			getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities nurse staffs matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse staffs
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities nurse staffs
	 * @param end the upper bound of the range of medical facilities nurse staffs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities nurse staffs, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesNurseStaff>
				getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesNurseStaff>
								orderByComparator) {

		return _medicalFacilitiesNurseStaffLocalService.
			getMedicalFacilitiesNurseStaffsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities nurse staffs.
	 *
	 * @return the number of medical facilities nurse staffs
	 */
	@Override
	public int getMedicalFacilitiesNurseStaffsCount() {
		return _medicalFacilitiesNurseStaffLocalService.
			getMedicalFacilitiesNurseStaffsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesNurseStaffLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseStaffLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities nurse staff in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseStaffLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseStaff the medical facilities nurse staff
	 * @return the medical facilities nurse staff that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseStaff updateMedicalFacilitiesNurseStaff(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesNurseStaff medicalFacilitiesNurseStaff) {

		return _medicalFacilitiesNurseStaffLocalService.
			updateMedicalFacilitiesNurseStaff(medicalFacilitiesNurseStaff);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesNurseStaffLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesNurseStaffLocalService getWrappedService() {
		return _medicalFacilitiesNurseStaffLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesNurseStaffLocalService
			medicalFacilitiesNurseStaffLocalService) {

		_medicalFacilitiesNurseStaffLocalService =
			medicalFacilitiesNurseStaffLocalService;
	}

	private MedicalFacilitiesNurseStaffLocalService
		_medicalFacilitiesNurseStaffLocalService;

}