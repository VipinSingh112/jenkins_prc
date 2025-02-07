/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesNurseDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesNurseDetailLocalService
 * @generated
 */
public class MedicalFacilitiesNurseDetailLocalServiceWrapper
	implements MedicalFacilitiesNurseDetailLocalService,
			   ServiceWrapper<MedicalFacilitiesNurseDetailLocalService> {

	public MedicalFacilitiesNurseDetailLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesNurseDetailLocalServiceWrapper(
		MedicalFacilitiesNurseDetailLocalService
			medicalFacilitiesNurseDetailLocalService) {

		_medicalFacilitiesNurseDetailLocalService =
			medicalFacilitiesNurseDetailLocalService;
	}

	/**
	 * Adds the medical facilities nurse detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail addMedicalFacilitiesNurseDetail(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return _medicalFacilitiesNurseDetailLocalService.
			addMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetail);
	}

	/**
	 * Creates a new medical facilities nurse detail with the primary key. Does not add the medical facilities nurse detail to the database.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key for the new medical facilities nurse detail
	 * @return the new medical facilities nurse detail
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail createMedicalFacilitiesNurseDetail(
			long medicalFacilitiesNurseDetailId) {

		return _medicalFacilitiesNurseDetailLocalService.
			createMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities nurse detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was removed
	 * @throws PortalException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail deleteMedicalFacilitiesNurseDetail(
				long medicalFacilitiesNurseDetailId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseDetailLocalService.
			deleteMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetailId);
	}

	/**
	 * Deletes the medical facilities nurse detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail deleteMedicalFacilitiesNurseDetail(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return _medicalFacilitiesNurseDetailLocalService.
			deleteMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesNurseDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesNurseDetailLocalService.dslQueryCount(
			dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesNurseDetailLocalService.dynamicQuery();
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

		return _medicalFacilitiesNurseDetailLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailModelImpl</code>.
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

		return _medicalFacilitiesNurseDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailModelImpl</code>.
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

		return _medicalFacilitiesNurseDetailLocalService.dynamicQuery(
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

		return _medicalFacilitiesNurseDetailLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesNurseDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail fetchMedicalFacilitiesNurseDetail(
			long medicalFacilitiesNurseDetailId) {

		return _medicalFacilitiesNurseDetailLocalService.
			fetchMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetailId);
	}

	/**
	 * Returns the medical facilities nurse detail matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse detail, or <code>null</code> if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail
			fetchMedicalFacilitiesNurseDetailByUuidAndGroupId(
				String uuid, long groupId) {

		return _medicalFacilitiesNurseDetailLocalService.
			fetchMedicalFacilitiesNurseDetailByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesNurseDetailLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesNurseDetailLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesNurseDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesNurseDetail> getMedicalFacilitiesAppliInfoBy_Id(
				long applicationId) {

		return _medicalFacilitiesNurseDetailLocalService.
			getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities nurse detail with the primary key.
	 *
	 * @param medicalFacilitiesNurseDetailId the primary key of the medical facilities nurse detail
	 * @return the medical facilities nurse detail
	 * @throws PortalException if a medical facilities nurse detail with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail getMedicalFacilitiesNurseDetail(
				long medicalFacilitiesNurseDetailId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseDetailLocalService.
			getMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetailId);
	}

	/**
	 * Returns the medical facilities nurse detail matching the UUID and group.
	 *
	 * @param uuid the medical facilities nurse detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities nurse detail
	 * @throws PortalException if a matching medical facilities nurse detail could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail
				getMedicalFacilitiesNurseDetailByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseDetailLocalService.
			getMedicalFacilitiesNurseDetailByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities nurse details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesNurseDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @return the range of medical facilities nurse details
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesNurseDetail> getMedicalFacilitiesNurseDetails(
				int start, int end) {

		return _medicalFacilitiesNurseDetailLocalService.
			getMedicalFacilitiesNurseDetails(start, end);
	}

	/**
	 * Returns all the medical facilities nurse details matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse details
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities nurse details, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesNurseDetail>
				getMedicalFacilitiesNurseDetailsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesNurseDetailLocalService.
			getMedicalFacilitiesNurseDetailsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities nurse details matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities nurse details
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities nurse details
	 * @param end the upper bound of the range of medical facilities nurse details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities nurse details, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesNurseDetail>
				getMedicalFacilitiesNurseDetailsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesNurseDetail>
								orderByComparator) {

		return _medicalFacilitiesNurseDetailLocalService.
			getMedicalFacilitiesNurseDetailsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities nurse details.
	 *
	 * @return the number of medical facilities nurse details
	 */
	@Override
	public int getMedicalFacilitiesNurseDetailsCount() {
		return _medicalFacilitiesNurseDetailLocalService.
			getMedicalFacilitiesNurseDetailsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesNurseDetailLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesNurseDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities nurse detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesNurseDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesNurseDetail the medical facilities nurse detail
	 * @return the medical facilities nurse detail that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesNurseDetail updateMedicalFacilitiesNurseDetail(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesNurseDetail medicalFacilitiesNurseDetail) {

		return _medicalFacilitiesNurseDetailLocalService.
			updateMedicalFacilitiesNurseDetail(medicalFacilitiesNurseDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesNurseDetailLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesNurseDetailLocalService getWrappedService() {
		return _medicalFacilitiesNurseDetailLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesNurseDetailLocalService
			medicalFacilitiesNurseDetailLocalService) {

		_medicalFacilitiesNurseDetailLocalService =
			medicalFacilitiesNurseDetailLocalService;
	}

	private MedicalFacilitiesNurseDetailLocalService
		_medicalFacilitiesNurseDetailLocalService;

}