/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.form.service.model.JTBApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JTBApplication. This utility wraps
 * <code>com.nbp.jtb.application.form.service.service.impl.JTBApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JTBApplicationLocalService
 * @generated
 */
public class JTBApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.form.service.service.impl.JTBApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jtb application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was added
	 */
	public static JTBApplication addJTBApplication(
		JTBApplication jtbApplication) {

		return getService().addJTBApplication(jtbApplication);
	}

	/**
	 * Creates a new jtb application with the primary key. Does not add the jtb application to the database.
	 *
	 * @param jtbApplicationId the primary key for the new jtb application
	 * @return the new jtb application
	 */
	public static JTBApplication createJTBApplication(long jtbApplicationId) {
		return getService().createJTBApplication(jtbApplicationId);
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
	 * Deletes the jtb application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was removed
	 */
	public static JTBApplication deleteJTBApplication(
		JTBApplication jtbApplication) {

		return getService().deleteJTBApplication(jtbApplication);
	}

	/**
	 * Deletes the jtb application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application that was removed
	 * @throws PortalException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication deleteJTBApplication(long jtbApplicationId)
		throws PortalException {

		return getService().deleteJTBApplication(jtbApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
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

	public static JTBApplication fetchJTBApplication(long jtbApplicationId) {
		return getService().fetchJTBApplication(jtbApplicationId);
	}

	/**
	 * Returns the jtb application matching the UUID and group.
	 *
	 * @param uuid the jtb application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	public static JTBApplication fetchJTBApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchJTBApplicationByUuidAndGroupId(uuid, groupId);
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

	public static JTBApplication getJTB_By_AppNum(String applicationNumber)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getService().getJTB_By_AppNum(applicationNumber);
	}

	public static List<JTBApplication> getJTB_By_AppType_Status(
			int status, String typeOfApplication)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getService().getJTB_By_AppType_Status(status, typeOfApplication);
	}

	public static JTBApplication getJTB_By_RT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getService().getJTB_By_RT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	public static List<JTBApplication> getJTB_By_Status(int status) {
		return getService().getJTB_By_Status(status);
	}

	public static JTBApplication getJTB_ByCaseId(String caseId)
		throws com.nbp.jtb.application.form.service.exception.
			NoSuchJTBApplicationException {

		return getService().getJTB_ByCaseId(caseId);
	}

	/**
	 * Returns the jtb application with the primary key.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application
	 * @throws PortalException if a jtb application with the primary key could not be found
	 */
	public static JTBApplication getJTBApplication(long jtbApplicationId)
		throws PortalException {

		return getService().getJTBApplication(jtbApplicationId);
	}

	/**
	 * Returns the jtb application matching the UUID and group.
	 *
	 * @param uuid the jtb application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching jtb application
	 * @throws PortalException if a matching jtb application could not be found
	 */
	public static JTBApplication getJTBApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getJTBApplicationByUuidAndGroupId(uuid, groupId);
	}

	public static List<JTBApplication> getJTBApplicationList_By_S_UId(
		long userId, int status) {

		return getService().getJTBApplicationList_By_S_UId(userId, status);
	}

	/**
	 * Returns a range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of jtb applications
	 */
	public static List<JTBApplication> getJTBApplications(int start, int end) {
		return getService().getJTBApplications(start, end);
	}

	/**
	 * Returns all the jtb applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb applications
	 * @param companyId the primary key of the company
	 * @return the matching jtb applications, or an empty list if no matches were found
	 */
	public static List<JTBApplication> getJTBApplicationsByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getJTBApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of jtb applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the jtb applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching jtb applications, or an empty list if no matches were found
	 */
	public static List<JTBApplication> getJTBApplicationsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return getService().getJTBApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of jtb applications.
	 *
	 * @return the number of jtb applications
	 */
	public static int getJTBApplicationsCount() {
		return getService().getJTBApplicationsCount();
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

	public static List<String> getTpdcoDistinctCategories() {
		return getService().getTpdcoDistinctCategories();
	}

	/**
	 * Updates the jtb application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JTBApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbApplication the jtb application
	 * @return the jtb application that was updated
	 */
	public static JTBApplication updateJTBApplication(
		JTBApplication jtbApplication) {

		return getService().updateJTBApplication(jtbApplication);
	}

	public static JTBApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JTBApplicationLocalService> _serviceSnapshot =
		new Snapshot<>(
			JTBApplicationLocalServiceUtil.class,
			JTBApplicationLocalService.class);

}