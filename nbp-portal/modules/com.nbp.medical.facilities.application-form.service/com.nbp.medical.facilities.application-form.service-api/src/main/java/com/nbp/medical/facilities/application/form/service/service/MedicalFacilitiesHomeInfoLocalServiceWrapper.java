/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesHomeInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesHomeInfoLocalService
 * @generated
 */
public class MedicalFacilitiesHomeInfoLocalServiceWrapper
	implements MedicalFacilitiesHomeInfoLocalService,
			   ServiceWrapper<MedicalFacilitiesHomeInfoLocalService> {

	public MedicalFacilitiesHomeInfoLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesHomeInfoLocalServiceWrapper(
		MedicalFacilitiesHomeInfoLocalService
			medicalFacilitiesHomeInfoLocalService) {

		_medicalFacilitiesHomeInfoLocalService =
			medicalFacilitiesHomeInfoLocalService;
	}

	/**
	 * Adds the medical facilities home info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo addMedicalFacilitiesHomeInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return _medicalFacilitiesHomeInfoLocalService.
			addMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfo);
	}

	/**
	 * Creates a new medical facilities home info with the primary key. Does not add the medical facilities home info to the database.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key for the new medical facilities home info
	 * @return the new medical facilities home info
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo createMedicalFacilitiesHomeInfo(
			long medicalFacilitiesHomeInfoId) {

		return _medicalFacilitiesHomeInfoLocalService.
			createMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities home info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info that was removed
	 * @throws PortalException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo deleteMedicalFacilitiesHomeInfo(
				long medicalFacilitiesHomeInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeInfoLocalService.
			deleteMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfoId);
	}

	/**
	 * Deletes the medical facilities home info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo deleteMedicalFacilitiesHomeInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return _medicalFacilitiesHomeInfoLocalService.
			deleteMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesHomeInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesHomeInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesHomeInfoLocalService.dynamicQuery();
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

		return _medicalFacilitiesHomeInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
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

		return _medicalFacilitiesHomeInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
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

		return _medicalFacilitiesHomeInfoLocalService.dynamicQuery(
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

		return _medicalFacilitiesHomeInfoLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesHomeInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo fetchMedicalFacilitiesHomeInfo(
			long medicalFacilitiesHomeInfoId) {

		return _medicalFacilitiesHomeInfoLocalService.
			fetchMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns the medical facilities home info matching the UUID and group.
	 *
	 * @param uuid the medical facilities home info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home info, or <code>null</code> if a matching medical facilities home info could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo
			fetchMedicalFacilitiesHomeInfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _medicalFacilitiesHomeInfoLocalService.
			fetchMedicalFacilitiesHomeInfoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesHomeInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesHomeInfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesHomeInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo getMedicalFacilities_ByAppId(
				long applicationId)
			throws com.nbp.medical.facilities.application.form.service.
				exception.NoSuchMedicalFacilitiesHomeInfoException {

		return _medicalFacilitiesHomeInfoLocalService.
			getMedicalFacilities_ByAppId(applicationId);
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesHomeInfo> getMedicalFacilitiesAppliInfoBy_Id(
				long applicationId) {

		return _medicalFacilitiesHomeInfoLocalService.
			getMedicalFacilitiesAppliInfoBy_Id(applicationId);
	}

	/**
	 * Returns the medical facilities home info with the primary key.
	 *
	 * @param medicalFacilitiesHomeInfoId the primary key of the medical facilities home info
	 * @return the medical facilities home info
	 * @throws PortalException if a medical facilities home info with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo getMedicalFacilitiesHomeInfo(
				long medicalFacilitiesHomeInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeInfoLocalService.
			getMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfoId);
	}

	/**
	 * Returns the medical facilities home info matching the UUID and group.
	 *
	 * @param uuid the medical facilities home info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities home info
	 * @throws PortalException if a matching medical facilities home info could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo getMedicalFacilitiesHomeInfoByUuidAndGroupId(
				String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeInfoLocalService.
			getMedicalFacilitiesHomeInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities home infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesHomeInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @return the range of medical facilities home infos
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesHomeInfo> getMedicalFacilitiesHomeInfos(
				int start, int end) {

		return _medicalFacilitiesHomeInfoLocalService.
			getMedicalFacilitiesHomeInfos(start, end);
	}

	/**
	 * Returns all the medical facilities home infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home infos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities home infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesHomeInfo>
				getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesHomeInfoLocalService.
			getMedicalFacilitiesHomeInfosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities home infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities home infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities home infos
	 * @param end the upper bound of the range of medical facilities home infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities home infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesHomeInfo>
				getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesHomeInfo>
								orderByComparator) {

		return _medicalFacilitiesHomeInfoLocalService.
			getMedicalFacilitiesHomeInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities home infos.
	 *
	 * @return the number of medical facilities home infos
	 */
	@Override
	public int getMedicalFacilitiesHomeInfosCount() {
		return _medicalFacilitiesHomeInfoLocalService.
			getMedicalFacilitiesHomeInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesHomeInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesHomeInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities home info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesHomeInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesHomeInfo the medical facilities home info
	 * @return the medical facilities home info that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesHomeInfo updateMedicalFacilitiesHomeInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesHomeInfo medicalFacilitiesHomeInfo) {

		return _medicalFacilitiesHomeInfoLocalService.
			updateMedicalFacilitiesHomeInfo(medicalFacilitiesHomeInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesHomeInfoLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesHomeInfoLocalService getWrappedService() {
		return _medicalFacilitiesHomeInfoLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesHomeInfoLocalService
			medicalFacilitiesHomeInfoLocalService) {

		_medicalFacilitiesHomeInfoLocalService =
			medicalFacilitiesHomeInfoLocalService;
	}

	private MedicalFacilitiesHomeInfoLocalService
		_medicalFacilitiesHomeInfoLocalService;

}