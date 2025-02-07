/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesComDetailLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesComDetailLocalService
 * @generated
 */
public class MedicalFacilitiesComDetailLocalServiceWrapper
	implements MedicalFacilitiesComDetailLocalService,
			   ServiceWrapper<MedicalFacilitiesComDetailLocalService> {

	public MedicalFacilitiesComDetailLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesComDetailLocalServiceWrapper(
		MedicalFacilitiesComDetailLocalService
			medicalFacilitiesComDetailLocalService) {

		_medicalFacilitiesComDetailLocalService =
			medicalFacilitiesComDetailLocalService;
	}

	/**
	 * Adds the medical facilities com detail to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesComDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesComDetail the medical facilities com detail
	 * @return the medical facilities com detail that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail addMedicalFacilitiesComDetail(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesComDetail medicalFacilitiesComDetail) {

		return _medicalFacilitiesComDetailLocalService.
			addMedicalFacilitiesComDetail(medicalFacilitiesComDetail);
	}

	/**
	 * Creates a new medical facilities com detail with the primary key. Does not add the medical facilities com detail to the database.
	 *
	 * @param medicalFacilitiesComDetailId the primary key for the new medical facilities com detail
	 * @return the new medical facilities com detail
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail createMedicalFacilitiesComDetail(
			long medicalFacilitiesComDetailId) {

		return _medicalFacilitiesComDetailLocalService.
			createMedicalFacilitiesComDetail(medicalFacilitiesComDetailId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesComDetailLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities com detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesComDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesComDetailId the primary key of the medical facilities com detail
	 * @return the medical facilities com detail that was removed
	 * @throws PortalException if a medical facilities com detail with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail deleteMedicalFacilitiesComDetail(
				long medicalFacilitiesComDetailId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesComDetailLocalService.
			deleteMedicalFacilitiesComDetail(medicalFacilitiesComDetailId);
	}

	/**
	 * Deletes the medical facilities com detail from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesComDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesComDetail the medical facilities com detail
	 * @return the medical facilities com detail that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail deleteMedicalFacilitiesComDetail(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesComDetail medicalFacilitiesComDetail) {

		return _medicalFacilitiesComDetailLocalService.
			deleteMedicalFacilitiesComDetail(medicalFacilitiesComDetail);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesComDetailLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesComDetailLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesComDetailLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesComDetailLocalService.dynamicQuery();
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

		return _medicalFacilitiesComDetailLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesComDetailModelImpl</code>.
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

		return _medicalFacilitiesComDetailLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesComDetailModelImpl</code>.
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

		return _medicalFacilitiesComDetailLocalService.dynamicQuery(
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

		return _medicalFacilitiesComDetailLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesComDetailLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail fetchMedicalFacilitiesComDetail(
			long medicalFacilitiesComDetailId) {

		return _medicalFacilitiesComDetailLocalService.
			fetchMedicalFacilitiesComDetail(medicalFacilitiesComDetailId);
	}

	/**
	 * Returns the medical facilities com detail matching the UUID and group.
	 *
	 * @param uuid the medical facilities com detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities com detail, or <code>null</code> if a matching medical facilities com detail could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail
			fetchMedicalFacilitiesComDetailByUuidAndGroupId(
				String uuid, long groupId) {

		return _medicalFacilitiesComDetailLocalService.
			fetchMedicalFacilitiesComDetailByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesComDetailLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesComDetailLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesComDetailLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesComDetail> getMedicalFacilitiesAppliInfoBy_Id(
				long applicationId) {

		return _medicalFacilitiesComDetailLocalService.
			getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities com detail with the primary key.
	 *
	 * @param medicalFacilitiesComDetailId the primary key of the medical facilities com detail
	 * @return the medical facilities com detail
	 * @throws PortalException if a medical facilities com detail with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail getMedicalFacilitiesComDetail(
				long medicalFacilitiesComDetailId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesComDetailLocalService.
			getMedicalFacilitiesComDetail(medicalFacilitiesComDetailId);
	}

	/**
	 * Returns the medical facilities com detail matching the UUID and group.
	 *
	 * @param uuid the medical facilities com detail's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities com detail
	 * @throws PortalException if a matching medical facilities com detail could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail
				getMedicalFacilitiesComDetailByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesComDetailLocalService.
			getMedicalFacilitiesComDetailByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities com details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesComDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @return the range of medical facilities com details
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesComDetail> getMedicalFacilitiesComDetails(
				int start, int end) {

		return _medicalFacilitiesComDetailLocalService.
			getMedicalFacilitiesComDetails(start, end);
	}

	/**
	 * Returns all the medical facilities com details matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities com details
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities com details, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesComDetail>
				getMedicalFacilitiesComDetailsByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesComDetailLocalService.
			getMedicalFacilitiesComDetailsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities com details matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities com details
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities com details
	 * @param end the upper bound of the range of medical facilities com details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities com details, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesComDetail>
				getMedicalFacilitiesComDetailsByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesComDetail>
								orderByComparator) {

		return _medicalFacilitiesComDetailLocalService.
			getMedicalFacilitiesComDetailsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities com details.
	 *
	 * @return the number of medical facilities com details
	 */
	@Override
	public int getMedicalFacilitiesComDetailsCount() {
		return _medicalFacilitiesComDetailLocalService.
			getMedicalFacilitiesComDetailsCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesComDetailLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesComDetailLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities com detail in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesComDetailLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesComDetail the medical facilities com detail
	 * @return the medical facilities com detail that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesComDetail updateMedicalFacilitiesComDetail(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesComDetail medicalFacilitiesComDetail) {

		return _medicalFacilitiesComDetailLocalService.
			updateMedicalFacilitiesComDetail(medicalFacilitiesComDetail);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesComDetailLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesComDetailLocalService getWrappedService() {
		return _medicalFacilitiesComDetailLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesComDetailLocalService
			medicalFacilitiesComDetailLocalService) {

		_medicalFacilitiesComDetailLocalService =
			medicalFacilitiesComDetailLocalService;
	}

	private MedicalFacilitiesComDetailLocalService
		_medicalFacilitiesComDetailLocalService;

}