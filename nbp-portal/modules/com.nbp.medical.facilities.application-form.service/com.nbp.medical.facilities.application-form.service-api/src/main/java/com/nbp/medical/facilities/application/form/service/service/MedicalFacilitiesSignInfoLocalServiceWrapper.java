/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesSignInfoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesSignInfoLocalService
 * @generated
 */
public class MedicalFacilitiesSignInfoLocalServiceWrapper
	implements MedicalFacilitiesSignInfoLocalService,
			   ServiceWrapper<MedicalFacilitiesSignInfoLocalService> {

	public MedicalFacilitiesSignInfoLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesSignInfoLocalServiceWrapper(
		MedicalFacilitiesSignInfoLocalService
			medicalFacilitiesSignInfoLocalService) {

		_medicalFacilitiesSignInfoLocalService =
			medicalFacilitiesSignInfoLocalService;
	}

	/**
	 * Adds the medical facilities sign info to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesSignInfo the medical facilities sign info
	 * @return the medical facilities sign info that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo addMedicalFacilitiesSignInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		return _medicalFacilitiesSignInfoLocalService.
			addMedicalFacilitiesSignInfo(medicalFacilitiesSignInfo);
	}

	/**
	 * Creates a new medical facilities sign info with the primary key. Does not add the medical facilities sign info to the database.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key for the new medical facilities sign info
	 * @return the new medical facilities sign info
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo createMedicalFacilitiesSignInfo(
			long medicalFacilitiesSignInfoId) {

		return _medicalFacilitiesSignInfoLocalService.
			createMedicalFacilitiesSignInfo(medicalFacilitiesSignInfoId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesSignInfoLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities sign info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info that was removed
	 * @throws PortalException if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo deleteMedicalFacilitiesSignInfo(
				long medicalFacilitiesSignInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesSignInfoLocalService.
			deleteMedicalFacilitiesSignInfo(medicalFacilitiesSignInfoId);
	}

	/**
	 * Deletes the medical facilities sign info from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesSignInfo the medical facilities sign info
	 * @return the medical facilities sign info that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo deleteMedicalFacilitiesSignInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		return _medicalFacilitiesSignInfoLocalService.
			deleteMedicalFacilitiesSignInfo(medicalFacilitiesSignInfo);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesSignInfoLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesSignInfoLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesSignInfoLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesSignInfoLocalService.dynamicQuery();
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

		return _medicalFacilitiesSignInfoLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesSignInfoModelImpl</code>.
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

		return _medicalFacilitiesSignInfoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesSignInfoModelImpl</code>.
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

		return _medicalFacilitiesSignInfoLocalService.dynamicQuery(
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

		return _medicalFacilitiesSignInfoLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesSignInfoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo fetchMedicalFacilitiesSignInfo(
			long medicalFacilitiesSignInfoId) {

		return _medicalFacilitiesSignInfoLocalService.
			fetchMedicalFacilitiesSignInfo(medicalFacilitiesSignInfoId);
	}

	/**
	 * Returns the medical facilities sign info matching the UUID and group.
	 *
	 * @param uuid the medical facilities sign info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities sign info, or <code>null</code> if a matching medical facilities sign info could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo
			fetchMedicalFacilitiesSignInfoByUuidAndGroupId(
				String uuid, long groupId) {

		return _medicalFacilitiesSignInfoLocalService.
			fetchMedicalFacilitiesSignInfoByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesSignInfoLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesSignInfoLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesSignInfoLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo getMedicalFacilitiesById(long applicationId)
			throws com.nbp.medical.facilities.application.form.service.
				exception.NoSuchMedicalFacilitiesSignInfoException {

		return _medicalFacilitiesSignInfoLocalService.getMedicalFacilitiesById(
			applicationId);
	}

	/**
	 * Returns the medical facilities sign info with the primary key.
	 *
	 * @param medicalFacilitiesSignInfoId the primary key of the medical facilities sign info
	 * @return the medical facilities sign info
	 * @throws PortalException if a medical facilities sign info with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo getMedicalFacilitiesSignInfo(
				long medicalFacilitiesSignInfoId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesSignInfoLocalService.
			getMedicalFacilitiesSignInfo(medicalFacilitiesSignInfoId);
	}

	/**
	 * Returns the medical facilities sign info matching the UUID and group.
	 *
	 * @param uuid the medical facilities sign info's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities sign info
	 * @throws PortalException if a matching medical facilities sign info could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo getMedicalFacilitiesSignInfoByUuidAndGroupId(
				String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesSignInfoLocalService.
			getMedicalFacilitiesSignInfoByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities sign infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesSignInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @return the range of medical facilities sign infos
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesSignInfo> getMedicalFacilitiesSignInfos(
				int start, int end) {

		return _medicalFacilitiesSignInfoLocalService.
			getMedicalFacilitiesSignInfos(start, end);
	}

	/**
	 * Returns all the medical facilities sign infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities sign infos
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities sign infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesSignInfo>
				getMedicalFacilitiesSignInfosByUuidAndCompanyId(
					String uuid, long companyId) {

		return _medicalFacilitiesSignInfoLocalService.
			getMedicalFacilitiesSignInfosByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities sign infos matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities sign infos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities sign infos
	 * @param end the upper bound of the range of medical facilities sign infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities sign infos, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesSignInfo>
				getMedicalFacilitiesSignInfosByUuidAndCompanyId(
					String uuid, long companyId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.nbp.medical.facilities.application.form.service.
							model.MedicalFacilitiesSignInfo>
								orderByComparator) {

		return _medicalFacilitiesSignInfoLocalService.
			getMedicalFacilitiesSignInfosByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities sign infos.
	 *
	 * @return the number of medical facilities sign infos
	 */
	@Override
	public int getMedicalFacilitiesSignInfosCount() {
		return _medicalFacilitiesSignInfoLocalService.
			getMedicalFacilitiesSignInfosCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesSignInfoLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesSignInfoLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities sign info in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesSignInfoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesSignInfo the medical facilities sign info
	 * @return the medical facilities sign info that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesSignInfo updateMedicalFacilitiesSignInfo(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesSignInfo medicalFacilitiesSignInfo) {

		return _medicalFacilitiesSignInfoLocalService.
			updateMedicalFacilitiesSignInfo(medicalFacilitiesSignInfo);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesSignInfoLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesSignInfoLocalService getWrappedService() {
		return _medicalFacilitiesSignInfoLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesSignInfoLocalService
			medicalFacilitiesSignInfoLocalService) {

		_medicalFacilitiesSignInfoLocalService =
			medicalFacilitiesSignInfoLocalService;
	}

	private MedicalFacilitiesSignInfoLocalService
		_medicalFacilitiesSignInfoLocalService;

}