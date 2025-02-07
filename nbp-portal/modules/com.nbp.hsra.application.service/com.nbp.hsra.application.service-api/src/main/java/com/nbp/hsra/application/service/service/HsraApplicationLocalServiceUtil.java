/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.HsraApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HsraApplication. This utility wraps
 * <code>com.nbp.hsra.application.service.service.impl.HsraApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HsraApplicationLocalService
 * @generated
 */
public class HsraApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.application.service.service.impl.HsraApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the hsra application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was added
	 */
	public static HsraApplication addHsraApplication(
		HsraApplication hsraApplication) {

		return getService().addHsraApplication(hsraApplication);
	}

	/**
	 * Creates a new hsra application with the primary key. Does not add the hsra application to the database.
	 *
	 * @param hsraApplicationId the primary key for the new hsra application
	 * @return the new hsra application
	 */
	public static HsraApplication createHsraApplication(
		long hsraApplicationId) {

		return getService().createHsraApplication(hsraApplicationId);
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
	 * Deletes the hsra application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was removed
	 */
	public static HsraApplication deleteHsraApplication(
		HsraApplication hsraApplication) {

		return getService().deleteHsraApplication(hsraApplication);
	}

	/**
	 * Deletes the hsra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application that was removed
	 * @throws PortalException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication deleteHsraApplication(long hsraApplicationId)
		throws PortalException {

		return getService().deleteHsraApplication(hsraApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
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

	public static HsraApplication fetchHsraApplication(long hsraApplicationId) {
		return getService().fetchHsraApplication(hsraApplicationId);
	}

	/**
	 * Returns the hsra application matching the UUID and group.
	 *
	 * @param uuid the hsra application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	public static HsraApplication fetchHsraApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchHsraApplicationByUuidAndGroupId(uuid, groupId);
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

	/**
	 * Returns the hsra application with the primary key.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application
	 * @throws PortalException if a hsra application with the primary key could not be found
	 */
	public static HsraApplication getHsraApplication(long hsraApplicationId)
		throws PortalException {

		return getService().getHsraApplication(hsraApplicationId);
	}

	/**
	 * Returns the hsra application matching the UUID and group.
	 *
	 * @param uuid the hsra application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching hsra application
	 * @throws PortalException if a matching hsra application could not be found
	 */
	public static HsraApplication getHsraApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getHsraApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of hsra applications
	 */
	public static List<HsraApplication> getHsraApplications(
		int start, int end) {

		return getService().getHsraApplications(start, end);
	}

	/**
	 * Returns all the hsra applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra applications
	 * @param companyId the primary key of the company
	 * @return the matching hsra applications, or an empty list if no matches were found
	 */
	public static List<HsraApplication> getHsraApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getHsraApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of hsra applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the hsra applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching hsra applications, or an empty list if no matches were found
	 */
	public static List<HsraApplication> getHsraApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return getService().getHsraApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of hsra applications.
	 *
	 * @return the number of hsra applications
	 */
	public static int getHsraApplicationsCount() {
		return getService().getHsraApplicationsCount();
	}

	public static HsraApplication getHsraByAppNum(String applicationNumber)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getService().getHsraByAppNum(applicationNumber);
	}

	public static HsraApplication getHsraByCaseId(String caseId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getService().getHsraByCaseId(caseId);
	}

	public static HsraApplication getHsraByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.hsra.application.service.exception.
			NoSuchHsraApplicationException {

		return getService().getHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	public static List<HsraApplication> getHsraByS_U(long userId, int status) {
		return getService().getHsraByS_U(userId, status);
	}

	public static List<HsraApplication> getHsraByStatus(int status) {
		return getService().getHsraByStatus(status);
	}

	public static List<String> getHsraDistinctCategory() {
		return getService().getHsraDistinctCategory();
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
	 * Updates the hsra application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplication the hsra application
	 * @return the hsra application that was updated
	 */
	public static HsraApplication updateHsraApplication(
		HsraApplication hsraApplication) {

		return getService().updateHsraApplication(hsraApplication);
	}

	public static HsraApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HsraApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			HsraApplicationLocalServiceUtil.class,
			HsraApplicationLocalService.class);

}