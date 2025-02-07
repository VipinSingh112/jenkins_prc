/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.application.form.service.model.ExplosivesApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ExplosivesApplication. This utility wraps
 * <code>com.nbp.explosives.competency.application.form.service.service.impl.ExplosivesApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosivesApplicationLocalService
 * @generated
 */
public class ExplosivesApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.explosives.competency.application.form.service.service.impl.ExplosivesApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the explosives application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was added
	 */
	public static ExplosivesApplication addExplosivesApplication(
		ExplosivesApplication explosivesApplication) {

		return getService().addExplosivesApplication(explosivesApplication);
	}

	/**
	 * Creates a new explosives application with the primary key. Does not add the explosives application to the database.
	 *
	 * @param explosivesApplicationId the primary key for the new explosives application
	 * @return the new explosives application
	 */
	public static ExplosivesApplication createExplosivesApplication(
		long explosivesApplicationId) {

		return getService().createExplosivesApplication(
			explosivesApplicationId);
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
	 * Deletes the explosives application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was removed
	 */
	public static ExplosivesApplication deleteExplosivesApplication(
		ExplosivesApplication explosivesApplication) {

		return getService().deleteExplosivesApplication(explosivesApplication);
	}

	/**
	 * Deletes the explosives application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application that was removed
	 * @throws PortalException if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication deleteExplosivesApplication(
			long explosivesApplicationId)
		throws PortalException {

		return getService().deleteExplosivesApplication(
			explosivesApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
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

	public static ExplosivesApplication fetchExplosivesApplication(
		long explosivesApplicationId) {

		return getService().fetchExplosivesApplication(explosivesApplicationId);
	}

	/**
	 * Returns the explosives application matching the UUID and group.
	 *
	 * @param uuid the explosives application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosives application, or <code>null</code> if a matching explosives application could not be found
	 */
	public static ExplosivesApplication
		fetchExplosivesApplicationByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchExplosivesApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<ExplosivesApplication> getExplosiveAppByStatusUser(
		int status, long userId) {

		return getService().getExplosiveAppByStatusUser(status, userId);
	}

	public static ExplosivesApplication getExplosiveByAppNo(
			String applicationNumber)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getService().getExplosiveByAppNo(applicationNumber);
	}

	public static ExplosivesApplication getExplosiveByCaseId(String caseId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getService().getExplosiveByCaseId(caseId);
	}

	public static ExplosivesApplication getExplosiveById(
			long factoriesApplicationId)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getService().getExplosiveById(factoriesApplicationId);
	}

	public static List<ExplosivesApplication> getExplosiveByStatus(int status) {
		return getService().getExplosiveByStatus(status);
	}

	public static List<String> getExplosiveDistinctCategory() {
		return getService().getExplosiveDistinctCategory();
	}

	public static ExplosivesApplication getExplosiveRegstByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.explosives.competency.application.form.service.exception.
			NoSuchExplosivesApplicationException {

		return getService().getExplosiveRegstByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	/**
	 * Returns the explosives application with the primary key.
	 *
	 * @param explosivesApplicationId the primary key of the explosives application
	 * @return the explosives application
	 * @throws PortalException if a explosives application with the primary key could not be found
	 */
	public static ExplosivesApplication getExplosivesApplication(
			long explosivesApplicationId)
		throws PortalException {

		return getService().getExplosivesApplication(explosivesApplicationId);
	}

	/**
	 * Returns the explosives application matching the UUID and group.
	 *
	 * @param uuid the explosives application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosives application
	 * @throws PortalException if a matching explosives application could not be found
	 */
	public static ExplosivesApplication
			getExplosivesApplicationByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getExplosivesApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the explosives applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.application.form.service.model.impl.ExplosivesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @return the range of explosives applications
	 */
	public static List<ExplosivesApplication> getExplosivesApplications(
		int start, int end) {

		return getService().getExplosivesApplications(start, end);
	}

	/**
	 * Returns all the explosives applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosives applications
	 * @param companyId the primary key of the company
	 * @return the matching explosives applications, or an empty list if no matches were found
	 */
	public static List<ExplosivesApplication>
		getExplosivesApplicationsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().getExplosivesApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of explosives applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosives applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosives applications
	 * @param end the upper bound of the range of explosives applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosives applications, or an empty list if no matches were found
	 */
	public static List<ExplosivesApplication>
		getExplosivesApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ExplosivesApplication> orderByComparator) {

		return getService().getExplosivesApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosives applications.
	 *
	 * @return the number of explosives applications
	 */
	public static int getExplosivesApplicationsCount() {
		return getService().getExplosivesApplicationsCount();
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
	 * Updates the explosives application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosivesApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosivesApplication the explosives application
	 * @return the explosives application that was updated
	 */
	public static ExplosivesApplication updateExplosivesApplication(
		ExplosivesApplication explosivesApplication) {

		return getService().updateExplosivesApplication(explosivesApplication);
	}

	public static ExplosivesApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ExplosivesApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			ExplosivesApplicationLocalServiceUtil.class,
			ExplosivesApplicationLocalService.class);

}