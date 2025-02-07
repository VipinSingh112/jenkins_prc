/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesAppliInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppliInfoLocalService
 * @generated
 */
public class MedicalFacilitiesAppliInfoLocalServiceWrapper
	implements MedicalFacilitiesAppliInfoLocalService,
			   ServiceWrapper<MedicalFacilitiesAppliInfoLocalService> {

	public MedicalFacilitiesAppliInfoLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesAppliInfoLocalServiceWrapper(
		MedicalFacilitiesAppliInfoLocalService
			medicalFacilitiesAppliInfoLocalService) {

		_medicalFacilitiesAppliInfoLocalService =
			medicalFacilitiesAppliInfoLocalService;
	}

	/**
	 * Adds the medical facilities appli info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesAppliInfo the medical facilities appli info
	 * @return the medical facilities appli info that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo addMedicalFacilitiesAppliInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		return _medicalFacilitiesAppliInfoLocalService.
			addMedicalFacilitiesAppliInfo(medicalFacilitiesAppliInfo);
	}

	/**
	 * Creates a new medical facilities appli info with the primary key. Does not add the medical facilities appli info to the database.
	 *
	 * @param medicalFacilitiesAppliId the primary key for the new medical facilities appli info
	 * @return the new medical facilities appli info
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo createMedicalFacilitiesAppliInfo(
			long medicalFacilitiesAppliId) {

		return _medicalFacilitiesAppliInfoLocalService.
			createMedicalFacilitiesAppliInfo(medicalFacilitiesAppliId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppliInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities appli info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info that was removed
	 * @throws PortalException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo deleteMedicalFacilitiesAppliInfo(
				long medicalFacilitiesAppliId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppliInfoLocalService.
			deleteMedicalFacilitiesAppliInfo(medicalFacilitiesAppliId);
	}

	/**
	 * Deletes the medical facilities appli info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesAppliInfo the medical facilities appli info
	 * @return the medical facilities appli info that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo deleteMedicalFacilitiesAppliInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		return _medicalFacilitiesAppliInfoLocalService.
			deleteMedicalFacilitiesAppliInfo(medicalFacilitiesAppliInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppliInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesAppliInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesAppliInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesAppliInfoLocalService.dynamicQuery();
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

		return _medicalFacilitiesAppliInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppliInfoModelImpl</code>.
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

		return _medicalFacilitiesAppliInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppliInfoModelImpl</code>.
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

		return _medicalFacilitiesAppliInfoLocalService.dynamicQuery(
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

		return _medicalFacilitiesAppliInfoLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesAppliInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo fetchMedicalFacilitiesAppliInfo(
			long medicalFacilitiesAppliId) {

		return _medicalFacilitiesAppliInfoLocalService.
			fetchMedicalFacilitiesAppliInfo(medicalFacilitiesAppliId);
	}

	/**
	 * Returns the medical facilities appli info matching the UUID and group.
	 *
	 * @param uuid the medical facilities appli info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities appli info, or <code>null</code> if a matching medical facilities appli info could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo
			fetchMedicalFacilitiesAppliInfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _medicalFacilitiesAppliInfoLocalService.
			fetchMedicalFacilitiesAppliInfoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesAppliInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesAppliInfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesAppliInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the medical facilities appli info with the primary key.
	 *
	 * @param medicalFacilitiesAppliId the primary key of the medical facilities appli info
	 * @return the medical facilities appli info
	 * @throws PortalException if a medical facilities appli info with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo getMedicalFacilitiesAppliInfo(
				long medicalFacilitiesAppliId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppliInfoLocalService.
			getMedicalFacilitiesAppliInfo(medicalFacilitiesAppliId);
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesAppliInfo> getMedicalFacilitiesAppliInfoBy_Id(
				long applicationId) {

		return _medicalFacilitiesAppliInfoLocalService.
			getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities appli info matching the UUID and group.
	 *
	 * @param uuid the medical facilities appli info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities appli info
	 * @throws PortalException if a matching medical facilities appli info could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo
				getMedicalFacilitiesAppliInfoByUuidAndGroupId(
					String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppliInfoLocalService.
			getMedicalFacilitiesAppliInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities appli infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppliInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @return the range of medical facilities appli infos
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesAppliInfo> getMedicalFacilitiesAppliInfos(
				int start, int end) {

		return _medicalFacilitiesAppliInfoLocalService.
			getMedicalFacilitiesAppliInfos(start, end);
	}

	/**
	 * Returns all the medical facilities appli infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities appli infos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities appli infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesAppliInfo>
				getMedicalFacilitiesAppliInfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesAppliInfoLocalService.
			getMedicalFacilitiesAppliInfosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities appli infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities appli infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities appli infos
	 * @param end the upper bound of the range of medical facilities appli infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities appli infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesAppliInfo>
				getMedicalFacilitiesAppliInfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesAppliInfo>
								orderByComparator) {

		return _medicalFacilitiesAppliInfoLocalService.
			getMedicalFacilitiesAppliInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities appli infos.
	 *
	 * @return the number of medical facilities appli infos
	 */
	@Override
	public int getMedicalFacilitiesAppliInfosCount() {
		return _medicalFacilitiesAppliInfoLocalService.
			getMedicalFacilitiesAppliInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesAppliInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppliInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities appli info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppliInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesAppliInfo the medical facilities appli info
	 * @return the medical facilities appli info that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesAppliInfo updateMedicalFacilitiesAppliInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesAppliInfo medicalFacilitiesAppliInfo) {

		return _medicalFacilitiesAppliInfoLocalService.
			updateMedicalFacilitiesAppliInfo(medicalFacilitiesAppliInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesAppliInfoLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesAppliInfoLocalService getWrappedService() {
		return _medicalFacilitiesAppliInfoLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesAppliInfoLocalService
			medicalFacilitiesAppliInfoLocalService) {

		_medicalFacilitiesAppliInfoLocalService =
			medicalFacilitiesAppliInfoLocalService;
	}

	private MedicalFacilitiesAppliInfoLocalService
		_medicalFacilitiesAppliInfoLocalService;

}