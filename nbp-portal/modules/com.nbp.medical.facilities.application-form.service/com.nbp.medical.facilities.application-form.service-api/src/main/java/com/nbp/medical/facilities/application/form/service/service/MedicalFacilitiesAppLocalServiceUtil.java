/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.facilities.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.facilities.application.form.service.model.MedicalFacilitiesApp;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalFacilitiesApp. This utility wraps
 * <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesAppLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalFacilitiesAppLocalService
 * @generated
 */
public class MedicalFacilitiesAppLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.facilities.application.form.service.service.impl.MedicalFacilitiesAppLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

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
	public static MedicalFacilitiesApp addMedicalFacilitiesApp(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		return getService().addMedicalFacilitiesApp(medicalFacilitiesApp);
	}

	/**
	 * Creates a new medical facilities app with the primary key. Does not add the medical facilities app to the database.
	 *
	 * @param medicalFacilitiesAppId the primary key for the new medical facilities app
	 * @return the new medical facilities app
	 */
	public static MedicalFacilitiesApp createMedicalFacilitiesApp(
		long medicalFacilitiesAppId) {

		return getService().createMedicalFacilitiesApp(medicalFacilitiesAppId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
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
	public static MedicalFacilitiesApp deleteMedicalFacilitiesApp(
			long medicalFacilitiesAppId)
		throws PortalException {

		return getService().deleteMedicalFacilitiesApp(medicalFacilitiesAppId);
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
	public static MedicalFacilitiesApp deleteMedicalFacilitiesApp(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		return getService().deleteMedicalFacilitiesApp(medicalFacilitiesApp);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static MedicalFacilitiesApp fetchMedicalFacilitiesApp(
		long medicalFacilitiesAppId) {

		return getService().fetchMedicalFacilitiesApp(medicalFacilitiesAppId);
	}

	/**
	 * Returns the medical facilities app matching the UUID and group.
	 *
	 * @param uuid the medical facilities app's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities app, or <code>null</code> if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp
		fetchMedicalFacilitiesAppByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchMedicalFacilitiesAppByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static MedicalFacilitiesApp getMedicalApplicationByExpiredNUmber(
		String expiredLicenceNUmber) {

		return getService().getMedicalApplicationByExpiredNUmber(
			expiredLicenceNUmber);
	}

	public static MedicalFacilitiesApp getMedicalByAppNo(
			String applicationNumber)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getService().getMedicalByAppNo(applicationNumber);
	}

	public static List<String> getMedicalDistinctCategories() {
		return getService().getMedicalDistinctCategories();
	}

	/**
	 * Returns the medical facilities app with the primary key.
	 *
	 * @param medicalFacilitiesAppId the primary key of the medical facilities app
	 * @return the medical facilities app
	 * @throws PortalException if a medical facilities app with the primary key could not be found
	 */
	public static MedicalFacilitiesApp getMedicalFacilitiesApp(
			long medicalFacilitiesAppId)
		throws PortalException {

		return getService().getMedicalFacilitiesApp(medicalFacilitiesAppId);
	}

	public static List<MedicalFacilitiesApp> getMedicalFacilitiesAppBy_S_U(
		int status, long userId) {

		return getService().getMedicalFacilitiesAppBy_S_U(status, userId);
	}

	public static List<MedicalFacilitiesApp> getMedicalFacilitiesAppBy_Status(
		int status) {

		return getService().getMedicalFacilitiesAppBy_Status(status);
	}

	/**
	 * Returns the medical facilities app matching the UUID and group.
	 *
	 * @param uuid the medical facilities app's UUID
	 * @param groupId the primary key of the group
	 * @return the matching medical facilities app
	 * @throws PortalException if a matching medical facilities app could not be found
	 */
	public static MedicalFacilitiesApp getMedicalFacilitiesAppByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getMedicalFacilitiesAppByUuidAndGroupId(
			uuid, groupId);
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
	public static List<MedicalFacilitiesApp> getMedicalFacilitiesApps(
		int start, int end) {

		return getService().getMedicalFacilitiesApps(start, end);
	}

	/**
	 * Returns all the medical facilities apps matching the UUID and company.
	 *
	 * @param uuid the UUID of the medical facilities apps
	 * @param companyId the primary key of the company
	 * @return the matching medical facilities apps, or an empty list if no matches were found
	 */
	public static List<MedicalFacilitiesApp>
		getMedicalFacilitiesAppsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getMedicalFacilitiesAppsByUuidAndCompanyId(
			uuid, companyId);
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
	public static List<MedicalFacilitiesApp>
		getMedicalFacilitiesAppsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<MedicalFacilitiesApp> orderByComparator) {

		return getService().getMedicalFacilitiesAppsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of medical facilities apps.
	 *
	 * @return the number of medical facilities apps
	 */
	public static int getMedicalFacilitiesAppsCount() {
		return getService().getMedicalFacilitiesAppsCount();
	}

	public static MedicalFacilitiesApp getMedicalFacilitiesByCaseId(
			String caseId)
		throws com.nbp.medical.facilities.application.form.service.exception.
			NoSuchMedicalFacilitiesAppException {

		return getService().getMedicalFacilitiesByCaseId(caseId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
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
	public static MedicalFacilitiesApp updateMedicalFacilitiesApp(
		MedicalFacilitiesApp medicalFacilitiesApp) {

		return getService().updateMedicalFacilitiesApp(medicalFacilitiesApp);
	}

	public static MedicalFacilitiesAppLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalFacilitiesAppLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalFacilitiesAppLocalServiceUtil.class,
			MedicalFacilitiesAppLocalService.class);

}