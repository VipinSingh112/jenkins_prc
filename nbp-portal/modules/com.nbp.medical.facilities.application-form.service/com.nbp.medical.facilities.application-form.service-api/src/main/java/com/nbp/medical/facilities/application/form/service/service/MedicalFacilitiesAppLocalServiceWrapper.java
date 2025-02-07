/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;
import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * Provides a wrapper for {@link MedicalFacilitiesAppLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppLocalService
 * @generated
 */
public class MedicalFacilitiesAppLocalServiceWrapper
	implements MedicalFacilitiesAppLocalService,
			   ServiceWrapper<MedicalFacilitiesAppLocalService> {

	public MedicalFacilitiesAppLocalServiceWrapper() {
		this(null);
	}

	public MedicalFacilitiesAppLocalServiceWrapper(
		MedicalFacilitiesAppLocalService medicalFacilitiesAppLocalService) {

		_medicalFacilitiesAppLocalService = medicalFacilitiesAppLocalService;
	}

	/**
	 * Adds the medical facilities app to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 * @return the medical facilities app that was added
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp addMedicalFacilitiesApp(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesApp medicalFacilitiesApp) {

		return _medicalFacilitiesAppLocalService.addMedicalFacilitiesApp(
			medicalFacilitiesApp);
	}

	/**
	 * Creates a new medical facilities app with the primary key. Does not add the medical facilities app to the database.
	 *
	 * @param medicalFacilitiesAppId the primary key for the new medical facilities app
	 * @return the new medical facilities app
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp createMedicalFacilitiesApp(
			long medicalFacilitiesAppId) {

		return _medicalFacilitiesAppLocalService.createMedicalFacilitiesApp(
			medicalFacilitiesAppId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the medical facilities app with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app that was removed
	 * @throws PortalException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp deleteMedicalFacilitiesApp(
				long medicalFacilitiesAppId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppLocalService.deleteMedicalFacilitiesApp(
			medicalFacilitiesAppId);
	}

	/**
	 * Deletes the medical facilities app from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 * @return the medical facilities app that was removed
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp deleteMedicalFacilitiesApp(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesApp medicalFacilitiesApp) {

		return _medicalFacilitiesAppLocalService.deleteMedicalFacilitiesApp(
			medicalFacilitiesApp);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _medicalFacilitiesAppLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _medicalFacilitiesAppLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _medicalFacilitiesAppLocalService.dynamicQuery();
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

		return _medicalFacilitiesAppLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppModelImpl</code>.
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

		return _medicalFacilitiesAppLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppModelImpl</code>.
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

		return _medicalFacilitiesAppLocalService.dynamicQuery(
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

		return _medicalFacilitiesAppLocalService.dynamicQueryCount(
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

		return _medicalFacilitiesAppLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp fetchMedicalFacilitiesApp(
			long medicalFacilitiesAppId) {

		return _medicalFacilitiesAppLocalService.fetchMedicalFacilitiesApp(
			medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities app matching the UUID and group.
	 *
	 * @param uuid the medical facilities app's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp fetchMedicalFacilitiesAppByUuidAndGroupId(
			String uuid, long groupId) {

		return _medicalFacilitiesAppLocalService.
			fetchMedicalFacilitiesAppByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _medicalFacilitiesAppLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _medicalFacilitiesAppLocalService.
			getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _medicalFacilitiesAppLocalService.
			getIndexableActionableDynamicQuery();
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp getMedicalApplicationByExpiredNUmber(
			String expiredLicenceNUmber) {

		return _medicalFacilitiesAppLocalService.
			getMedicalApplicationByExpiredNUmber(expiredLicenceNUmber);
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp getMedicalByAppNo(String applicationNumber)
			throws com.nbp.medical.facilities.application.form.service.
				exception.NoSuchMedicalFacilitiesAppException {

		return _medicalFacilitiesAppLocalService.getMedicalByAppNo(
			applicationNumber);
	}

	@Override
	public java.util.List<String> getMedicalDistinctCategories() {
		return _medicalFacilitiesAppLocalService.getMedicalDistinctCategories();
	}

	/**
	 * Returns the medical facilities app with the primary key.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app
	 * @throws PortalException if a medical facilities app with the primary key could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp getMedicalFacilitiesApp(
				long medicalFacilitiesAppId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppLocalService.getMedicalFacilitiesApp(
			medicalFacilitiesAppId);
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesApp> getMedicalFacilitiesAppBy_S_U(
				int status, long userId) {

		return _medicalFacilitiesAppLocalService.getMedicalFacilitiesAppBy_S_U(
			status, userId);
	}

	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesApp> getMedicalFacilitiesAppBy_Status(int status) {

		return _medicalFacilitiesAppLocalService.
			getMedicalFacilitiesAppBy_Status(status);
	}

	/**
	 * Returns the medical facilities app matching the UUID and group.
	 *
	 * @param uuid the medical facilities app's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities app
	 * @throws PortalException if a matching medical facilities app could not be found
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp getMedicalFacilitiesAppByUuidAndGroupId(
				String uuid, long groupId)
			throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppLocalService.
			getMedicalFacilitiesAppByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the medical facilities apps.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.facilities.application.form.service.model.impl.MedicalFacilitiesAppModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @return the range of medical facilities apps
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesApp> getMedicalFacilitiesApps(int start, int end) {

		return _medicalFacilitiesAppLocalService.getMedicalFacilitiesApps(
			start, end);
	}

	/**
	 * Returns all the medical facilities apps matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities apps
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities apps, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesApp> getMedicalFacilitiesAppsByUuidAndCompanyId(
				String uuid, long companyId) {

		return _medicalFacilitiesAppLocalService.
			getMedicalFacilitiesAppsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of medical facilities apps matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities apps
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of medical facilities apps
	 * @param end the upper bound of the range of medical facilities apps (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching medical facilities apps, or an empty list if no matches were found
	 */
	@Override
	public java.util.List
		<com.nbp.medical.facilities.application.form.service.model.
			MedicalFacilitiesApp> getMedicalFacilitiesAppsByUuidAndCompanyId(
				String uuid, long companyId, int start, int end,
				com.liferay.portal.kernel.util.OrderByComparator
					<com.nbp.medical.facilities.application.form.service.model.
						MedicalFacilitiesApp> orderByComparator) {

		return _medicalFacilitiesAppLocalService.
			getMedicalFacilitiesAppsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities apps.
	 *
	 * @return the number of medical facilities apps
	 */
	@Override
	public int getMedicalFacilitiesAppsCount() {
		return _medicalFacilitiesAppLocalService.
			getMedicalFacilitiesAppsCount();
	}

	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp getMedicalFacilitiesByCaseId(String caseId)
			throws com.nbp.medical.facilities.application.form.service.
				exception.NoSuchMedicalFacilitiesAppException {

		return _medicalFacilitiesAppLocalService.getMedicalFacilitiesByCaseId(
			caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _medicalFacilitiesAppLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _medicalFacilitiesAppLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the medical facilities app in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalFacilitiesAppLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalFacilitiesApp the medical facilities app
	 * @return the medical facilities app that was updated
	 */
	@Override
	public com.nbp.medical.facilities.application.form.service.model.
		MedicalFacilitiesApp updateMedicalFacilitiesApp(
			com.nbp.medical.facilities.application.form.service.model.
				MedicalFacilitiesApp medicalFacilitiesApp) {

		return _medicalFacilitiesAppLocalService.updateMedicalFacilitiesApp(
			medicalFacilitiesApp);
	}

	@Override
	public BasePersistence<?> getBasePersistence() {
		return _medicalFacilitiesAppLocalService.getBasePersistence();
	}

	@Override
	public MedicalFacilitiesAppLocalService getWrappedService() {
		return _medicalFacilitiesAppLocalService;
	}

	@Override
	public void setWrappedService(
		MedicalFacilitiesAppLocalService medicalFacilitiesAppLocalService) {

		_medicalFacilitiesAppLocalService = medicalFacilitiesAppLocalService;
	}

	private MedicalFacilitiesAppLocalService _medicalFacilitiesAppLocalService;

}