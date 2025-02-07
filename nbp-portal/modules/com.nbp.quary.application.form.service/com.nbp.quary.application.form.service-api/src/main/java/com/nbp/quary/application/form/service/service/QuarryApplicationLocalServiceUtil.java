/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QuarryApplication. This utility wraps
 * <code>com.nbp.quary.application.form.service.service.impl.QuarryApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationLocalService
 * @generated
 */
public class QuarryApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quary.application.form.service.service.impl.QuarryApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the quarry application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplication the quarry application
	 * @return the quarry application that was added
	 */
	public static QuarryApplication addQuarryApplication(
		QuarryApplication quarryApplication) {

		return getService().addQuarryApplication(quarryApplication);
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
	 * Creates a new quarry application with the primary key. Does not add the quarry application to the database.
	 *
	 * @param quarryApplicationId the primary key for the new quarry application
	 * @return the new quarry application
	 */
	public static QuarryApplication createQuarryApplication(
		long quarryApplicationId) {

		return getService().createQuarryApplication(quarryApplicationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the quarry application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application that was removed
	 * @throws PortalException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication deleteQuarryApplication(
			long quarryApplicationId)
		throws PortalException {

		return getService().deleteQuarryApplication(quarryApplicationId);
	}

	/**
	 * Deletes the quarry application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplication the quarry application
	 * @return the quarry application that was removed
	 */
	public static QuarryApplication deleteQuarryApplication(
		QuarryApplication quarryApplication) {

		return getService().deleteQuarryApplication(quarryApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationModelImpl</code>.
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

	public static QuarryApplication fetchQuarryApplication(
		long quarryApplicationId) {

		return getService().fetchQuarryApplication(quarryApplicationId);
	}

	/**
	 * Returns the quarry application matching the UUID and group.
	 *
	 * @param uuid the quarry application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	public static QuarryApplication fetchQuarryApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchQuarryApplicationByUuidAndGroupId(
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
	 * Returns the quarry application with the primary key.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application
	 * @throws PortalException if a quarry application with the primary key could not be found
	 */
	public static QuarryApplication getQuarryApplication(
			long quarryApplicationId)
		throws PortalException {

		return getService().getQuarryApplication(quarryApplicationId);
	}

	public static List<QuarryApplication> getQuarryApplicationByStatus(
		int status) {

		return getService().getQuarryApplicationByStatus(status);
	}

	public static List<QuarryApplication> getQuarryApplicationByStatus_UId(
		int status, long userId) {

		return getService().getQuarryApplicationByStatus_UId(status, userId);
	}

	/**
	 * Returns the quarry application matching the UUID and group.
	 *
	 * @param uuid the quarry application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching quarry application
	 * @throws PortalException if a matching quarry application could not be found
	 */
	public static QuarryApplication getQuarryApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getQuarryApplicationByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of quarry applications
	 */
	public static List<QuarryApplication> getQuarryApplications(
		int start, int end) {

		return getService().getQuarryApplications(start, end);
	}

	/**
	 * Returns all the quarry applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry applications
	 * @param companyId the primary key of the company
	 * @return the matching quarry applications, or an empty list if no matches were found
	 */
	public static List<QuarryApplication>
		getQuarryApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getQuarryApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of quarry applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the quarry applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching quarry applications, or an empty list if no matches were found
	 */
	public static List<QuarryApplication>
		getQuarryApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<QuarryApplication> orderByComparator) {

		return getService().getQuarryApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of quarry applications.
	 *
	 * @return the number of quarry applications
	 */
	public static int getQuarryApplicationsCount() {
		return getService().getQuarryApplicationsCount();
	}

	public static QuarryApplication getQuarryByAppNo(String applicationNumber)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getService().getQuarryByAppNo(applicationNumber);
	}

	public static QuarryApplication getQuarryByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getService().getQuarryByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	public static QuarryApplication getQuarryByCaseId(String caseId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationException {

		return getService().getQuarryByCaseId(caseId);
	}

	public static List<String> getQuaryDistinctCategories() {
		return getService().getQuaryDistinctCategories();
	}

	/**
	 * Updates the quarry application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplication the quarry application
	 * @return the quarry application that was updated
	 */
	public static QuarryApplication updateQuarryApplication(
		QuarryApplication quarryApplication) {

		return getService().updateQuarryApplication(quarryApplication);
	}

	public static QuarryApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QuarryApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			QuarryApplicationLocalServiceUtil.class,
			QuarryApplicationLocalService.class);

}