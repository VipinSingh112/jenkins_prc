/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.CannabisApplications;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisApplications. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisApplicationsLocalService
 * @generated
 */
public class CannabisApplicationsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisApplicationsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis applications to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was added
	 */
	public static CannabisApplications addCannabisApplications(
		CannabisApplications cannabisApplications) {

		return getService().addCannabisApplications(cannabisApplications);
	}

	/**
	 * Creates a new cannabis applications with the primary key. Does not add the cannabis applications to the database.
	 *
	 * @param cannabisApplicationId the primary key for the new cannabis applications
	 * @return the new cannabis applications
	 */
	public static CannabisApplications createCannabisApplications(
		long cannabisApplicationId) {

		return getService().createCannabisApplications(cannabisApplicationId);
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
	 * Deletes the cannabis applications from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was removed
	 */
	public static CannabisApplications deleteCannabisApplications(
		CannabisApplications cannabisApplications) {

		return getService().deleteCannabisApplications(cannabisApplications);
	}

	/**
	 * Deletes the cannabis applications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications that was removed
	 * @throws PortalException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications deleteCannabisApplications(
			long cannabisApplicationId)
		throws PortalException {

		return getService().deleteCannabisApplications(cannabisApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
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

	public static CannabisApplications fetchCannabisApplications(
		long cannabisApplicationId) {

		return getService().fetchCannabisApplications(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis applications matching the UUID and group.
	 *
	 * @param uuid the cannabis applications's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	public static CannabisApplications
		fetchCannabisApplicationsByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchCannabisApplicationsByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis applications with the primary key.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications
	 * @throws PortalException if a cannabis applications with the primary key could not be found
	 */
	public static CannabisApplications getCannabisApplications(
			long cannabisApplicationId)
		throws PortalException {

		return getService().getCannabisApplications(cannabisApplicationId);
	}

	public static CannabisApplications getCannabisApplicationsByAppNo(
			String applicationNumber)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getService().getCannabisApplicationsByAppNo(applicationNumber);
	}

	public static CannabisApplications getCannabisApplicationsByCaseId(
			String caseId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getService().getCannabisApplicationsByCaseId(caseId);
	}

	public static List<CannabisApplications>
		getCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory) {

		return getService().getCannabisApplicationsByLicenseCategory(
			status, licenseCategory);
	}

	public static int getCannabisApplicationsByLicenseCategoryCount(
		int status, String licenseCategory) {

		return getService().getCannabisApplicationsByLicenseCategoryCount(
			status, licenseCategory);
	}

	public static List<CannabisApplications>
		getCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory) {

		return getService().getCannabisApplicationsByLicenseSubCategory(
			status, licenseSubCategory);
	}

	public static int getCannabisApplicationsByLicenseSubCategoryCount(
		int status, String licenseSubCategory) {

		return getService().getCannabisApplicationsByLicenseSubCategoryCount(
			status, licenseSubCategory);
	}

	public static List<CannabisApplications>
		getCannabisApplicationsByRequestType(int status, String requestType) {

		return getService().getCannabisApplicationsByRequestType(
			status, requestType);
	}

	public static int getCannabisApplicationsByRequestTypeCount(
		int status, String requestType) {

		return getService().getCannabisApplicationsByRequestTypeCount(
			status, requestType);
	}

	public static CannabisApplications getCannabisApplicationsByRT_ExpiredAppNo(
			String expiredLicenseAppNo, String requestType)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchCannabisApplicationsException {

		return getService().getCannabisApplicationsByRT_ExpiredAppNo(
			expiredLicenseAppNo, requestType);
	}

	public static List<CannabisApplications> getCannabisApplicationsByS_U(
		long userId, int status) {

		return getService().getCannabisApplicationsByS_U(userId, status);
	}

	public static List<CannabisApplications> getCannabisApplicationsByStatus(
		int status) {

		return getService().getCannabisApplicationsByStatus(status);
	}

	public static List<CannabisApplications> getCannabisApplicationsByUser(
		long userId) {

		return getService().getCannabisApplicationsByUser(userId);
	}

	/**
	 * Returns the cannabis applications matching the UUID and group.
	 *
	 * @param uuid the cannabis applications's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis applications
	 * @throws PortalException if a matching cannabis applications could not be found
	 */
	public static CannabisApplications getCannabisApplicationsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getCannabisApplicationsByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of cannabis applicationses
	 */
	public static List<CannabisApplications> getCannabisApplicationses(
		int start, int end) {

		return getService().getCannabisApplicationses(start, end);
	}

	/**
	 * Returns all the cannabis applicationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis applicationses
	 * @param companyId the primary key of the company
	 * @return the matching cannabis applicationses, or an empty list if no matches were found
	 */
	public static List<CannabisApplications>
		getCannabisApplicationsesByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getCannabisApplicationsesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of cannabis applicationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis applicationses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis applicationses, or an empty list if no matches were found
	 */
	public static List<CannabisApplications>
		getCannabisApplicationsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return getService().getCannabisApplicationsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis applicationses.
	 *
	 * @return the number of cannabis applicationses
	 */
	public static int getCannabisApplicationsesCount() {
		return getService().getCannabisApplicationsesCount();
	}

	public static List<String> getCannabisDistinctCategories() {
		return getService().getCannabisDistinctCategories();
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
	 * Updates the cannabis applications in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisApplicationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisApplications the cannabis applications
	 * @return the cannabis applications that was updated
	 */
	public static CannabisApplications updateCannabisApplications(
		CannabisApplications cannabisApplications) {

		return getService().updateCannabisApplications(cannabisApplications);
	}

	public static CannabisApplicationsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisApplicationsLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisApplicationsLocalServiceUtil.class,
			CannabisApplicationsLocalService.class);

}