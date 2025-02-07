/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiServicesApplication. This utility wraps
 * <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesApplicationLocalService
 * @generated
 */
public class OsiServicesApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.application.form.service.service.impl.OsiServicesApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplication the osi services application
	 * @return the osi services application that was added
	 */
	public static OsiServicesApplication addOsiServicesApplication(
		OsiServicesApplication osiServicesApplication) {

		return getService().addOsiServicesApplication(osiServicesApplication);
	}

	/**
	 * Creates a new osi services application with the primary key. Does not add the osi services application to the database.
	 *
	 * @param osiServicesApplicationId the primary key for the new osi services application
	 * @return the new osi services application
	 */
	public static OsiServicesApplication createOsiServicesApplication(
		long osiServicesApplicationId) {

		return getService().createOsiServicesApplication(
			osiServicesApplicationId);
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
	 * Deletes the osi services application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application that was removed
	 * @throws PortalException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication deleteOsiServicesApplication(
			long osiServicesApplicationId)
		throws PortalException {

		return getService().deleteOsiServicesApplication(
			osiServicesApplicationId);
	}

	/**
	 * Deletes the osi services application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplication the osi services application
	 * @return the osi services application that was removed
	 */
	public static OsiServicesApplication deleteOsiServicesApplication(
		OsiServicesApplication osiServicesApplication) {

		return getService().deleteOsiServicesApplication(
			osiServicesApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicationModelImpl</code>.
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

	public static OsiServicesApplication fetchOsiServicesApplication(
		long osiServicesApplicationId) {

		return getService().fetchOsiServicesApplication(
			osiServicesApplicationId);
	}

	/**
	 * Returns the osi services application matching the UUID and group.
	 *
	 * @param uuid the osi services application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	public static OsiServicesApplication
		fetchOsiServicesApplicationByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchOsiServicesApplicationByUuidAndGroupId(
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

	public static List<String> getJadscDistinctCategory() {
		return getService().getJadscDistinctCategory();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static OsiServicesApplication getOsiServiceApplicationBy_CI(
			String caseId)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getService().getOsiServiceApplicationBy_CI(caseId);
	}

	public static List<String> getOSISERVICEDistinctCategory() {
		return getService().getOSISERVICEDistinctCategory();
	}

	/**
	 * Returns the osi services application with the primary key.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application
	 * @throws PortalException if a osi services application with the primary key could not be found
	 */
	public static OsiServicesApplication getOsiServicesApplication(
			long osiServicesApplicationId)
		throws PortalException {

		return getService().getOsiServicesApplication(osiServicesApplicationId);
	}

	public static List<OsiServicesApplication>
		getOsiServicesApplicationByEntityId_Status(int status, long userId) {

		return getService().getOsiServicesApplicationByEntityId_Status(
			status, userId);
	}

	/**
	 * Returns the osi services application matching the UUID and group.
	 *
	 * @param uuid the osi services application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching osi services application
	 * @throws PortalException if a matching osi services application could not be found
	 */
	public static OsiServicesApplication
			getOsiServicesApplicationByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getOsiServicesApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of osi services applications
	 */
	public static List<OsiServicesApplication> getOsiServicesApplications(
		int start, int end) {

		return getService().getOsiServicesApplications(start, end);
	}

	/**
	 * Returns all the osi services applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services applications
	 * @param companyId the primary key of the company
	 * @return the matching osi services applications, or an empty list if no matches were found
	 */
	public static List<OsiServicesApplication>
		getOsiServicesApplicationsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getOsiServicesApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of osi services applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the osi services applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching osi services applications, or an empty list if no matches were found
	 */
	public static List<OsiServicesApplication>
		getOsiServicesApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<OsiServicesApplication> orderByComparator) {

		return getService().getOsiServicesApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of osi services applications.
	 *
	 * @return the number of osi services applications
	 */
	public static int getOsiServicesApplicationsCount() {
		return getService().getOsiServicesApplicationsCount();
	}

	public static List<OsiServicesApplication> getOsiServicesApplicationStatus(
		int status, long userId) {

		return getService().getOsiServicesApplicationStatus(status, userId);
	}

	public static OsiServicesApplication getOSIServicesByAppNo(
			String applicationNumber)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getService().getOSIServicesByAppNo(applicationNumber);
	}

	public static OsiServicesApplication getOsiServicesByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.osi.services.application.form.service.exception.
			NoSuchOsiServicesApplicationException {

		return getService().getOsiServicesByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	public static List<OsiServicesApplication> getOSIServicesByStatus(
		int status) {

		return getService().getOSIServicesByStatus(status);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiServicesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesApplication the osi services application
	 * @return the osi services application that was updated
	 */
	public static OsiServicesApplication updateOsiServicesApplication(
		OsiServicesApplication osiServicesApplication) {

		return getService().updateOsiServicesApplication(
			osiServicesApplication);
	}

	public static OsiServicesApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiServicesApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiServicesApplicationLocalServiceUtil.class,
			OsiServicesApplicationLocalService.class);

}