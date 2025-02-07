/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FireBrigadeApplication. This utility wraps
 * <code>com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeApplicationLocalService
 * @generated
 */
public class FireBrigadeApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.fire.brigade.application.form.service.service.impl.FireBrigadeApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the fire brigade application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 * @return the fire brigade application that was added
	 */
	public static FireBrigadeApplication addFireBrigadeApplication(
		FireBrigadeApplication fireBrigadeApplication) {

		return getService().addFireBrigadeApplication(fireBrigadeApplication);
	}

	/**
	 * Creates a new fire brigade application with the primary key. Does not add the fire brigade application to the database.
	 *
	 * @param fireBrigadeApplicationId the primary key for the new fire brigade application
	 * @return the new fire brigade application
	 */
	public static FireBrigadeApplication createFireBrigadeApplication(
		long fireBrigadeApplicationId) {

		return getService().createFireBrigadeApplication(
			fireBrigadeApplicationId);
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
	 * Deletes the fire brigade application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 * @return the fire brigade application that was removed
	 */
	public static FireBrigadeApplication deleteFireBrigadeApplication(
		FireBrigadeApplication fireBrigadeApplication) {

		return getService().deleteFireBrigadeApplication(
			fireBrigadeApplication);
	}

	/**
	 * Deletes the fire brigade application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application that was removed
	 * @throws PortalException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication deleteFireBrigadeApplication(
			long fireBrigadeApplicationId)
		throws PortalException {

		return getService().deleteFireBrigadeApplication(
			fireBrigadeApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeApplicationModelImpl</code>.
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

	public static FireBrigadeApplication fetchFireBrigadeApplication(
		long fireBrigadeApplicationId) {

		return getService().fetchFireBrigadeApplication(
			fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade application matching the UUID and group.
	 *
	 * @param uuid the fire brigade application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication
		fetchFireBrigadeApplicationByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchFireBrigadeApplicationByUuidAndGroupId(
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

	public static FireBrigadeApplication getFB_ByAppType_AppNo(
			String applicationType, String applicationNumber)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getService().getFB_ByAppType_AppNo(
			applicationType, applicationNumber);
	}

	/**
	 * Returns the fire brigade application with the primary key.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application
	 * @throws PortalException if a fire brigade application with the primary key could not be found
	 */
	public static FireBrigadeApplication getFireBrigadeApplication(
			long fireBrigadeApplicationId)
		throws PortalException {

		return getService().getFireBrigadeApplication(fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade application matching the UUID and group.
	 *
	 * @param uuid the fire brigade application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching fire brigade application
	 * @throws PortalException if a matching fire brigade application could not be found
	 */
	public static FireBrigadeApplication
			getFireBrigadeApplicationByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getFireBrigadeApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of fire brigade applications
	 */
	public static List<FireBrigadeApplication> getFireBrigadeApplications(
		int start, int end) {

		return getService().getFireBrigadeApplications(start, end);
	}

	/**
	 * Returns all the fire brigade applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade applications
	 * @param companyId the primary key of the company
	 * @return the matching fire brigade applications, or an empty list if no matches were found
	 */
	public static List<FireBrigadeApplication>
		getFireBrigadeApplicationsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getFireBrigadeApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of fire brigade applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the fire brigade applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching fire brigade applications, or an empty list if no matches were found
	 */
	public static List<FireBrigadeApplication>
		getFireBrigadeApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return getService().getFireBrigadeApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of fire brigade applications.
	 *
	 * @return the number of fire brigade applications
	 */
	public static int getFireBrigadeApplicationsCount() {
		return getService().getFireBrigadeApplicationsCount();
	}

	public static FireBrigadeApplication getFireBrigadeByAppNo(
			String applicationNumber)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getService().getFireBrigadeByAppNo(applicationNumber);
	}

	public static FireBrigadeApplication getFireBrigadeByEI_CI(
			String entityId, String caseId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getService().getFireBrigadeByEI_CI(entityId, caseId);
	}

	public static List<FireBrigadeApplication> getFireBrigadeByEntityId(
		String entityId) {

		return getService().getFireBrigadeByEntityId(entityId);
	}

	public static List<FireBrigadeApplication> getFireBrigadeByEntityId_Status(
		String entityId, int status) {

		return getService().getFireBrigadeByEntityId_Status(entityId, status);
	}

	public static List<FireBrigadeApplication> getFireBrigadeByS_U(
		int status, long userId) {

		return getService().getFireBrigadeByS_U(status, userId);
	}

	public static List<FireBrigadeApplication> getFireBrigadeByStatus(
		int status) {

		return getService().getFireBrigadeByStatus(status);
	}

	public static List<String> getFireBrigadeDistinctCategory() {
		return getService().getFireBrigadeDistinctCategory();
	}

	public static FireBrigadeApplication getFireBrigadeStatusByCaseId(
			String caseId)
		throws com.nbp.fire.brigade.application.form.service.exception.
			NoSuchFireBrigadeApplicationException {

		return getService().getFireBrigadeStatusByCaseId(caseId);
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
	 * Updates the fire brigade application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 * @return the fire brigade application that was updated
	 */
	public static FireBrigadeApplication updateFireBrigadeApplication(
		FireBrigadeApplication fireBrigadeApplication) {

		return getService().updateFireBrigadeApplication(
			fireBrigadeApplication);
	}

	public static FireBrigadeApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FireBrigadeApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			FireBrigadeApplicationLocalServiceUtil.class,
			FireBrigadeApplicationLocalService.class);

}