/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.application.form.service.model.CreativeApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreativeApplication. This utility wraps
 * <code>com.nbp.creative.application.form.service.service.impl.CreativeApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeApplicationLocalService
 * @generated
 */
public class CreativeApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.creative.application.form.service.service.impl.CreativeApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the creative application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplication the creative application
	 * @return the creative application that was added
	 */
	public static CreativeApplication addCreativeApplication(
		CreativeApplication creativeApplication) {

		return getService().addCreativeApplication(creativeApplication);
	}

	/**
	 * Creates a new creative application with the primary key. Does not add the creative application to the database.
	 *
	 * @param CreativeApplicationId the primary key for the new creative application
	 * @return the new creative application
	 */
	public static CreativeApplication createCreativeApplication(
		long CreativeApplicationId) {

		return getService().createCreativeApplication(CreativeApplicationId);
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
	 * Deletes the creative application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplication the creative application
	 * @return the creative application that was removed
	 */
	public static CreativeApplication deleteCreativeApplication(
		CreativeApplication creativeApplication) {

		return getService().deleteCreativeApplication(creativeApplication);
	}

	/**
	 * Deletes the creative application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application that was removed
	 * @throws PortalException if a creative application with the primary key could not be found
	 */
	public static CreativeApplication deleteCreativeApplication(
			long CreativeApplicationId)
		throws PortalException {

		return getService().deleteCreativeApplication(CreativeApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationModelImpl</code>.
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

	public static CreativeApplication fetchCreativeApplication(
		long CreativeApplicationId) {

		return getService().fetchCreativeApplication(CreativeApplicationId);
	}

	/**
	 * Returns the creative application matching the UUID and group.
	 *
	 * @param uuid the creative application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	public static CreativeApplication fetchCreativeApplicationByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchCreativeApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	public static CreativeApplication findBygetCreativeByCaseId(String caseId)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getService().findBygetCreativeByCaseId(caseId);
	}

	public static CreativeApplication findBygetCreativeById(
		long creativeApplicationId) {

		return getService().findBygetCreativeById(creativeApplicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the creative application with the primary key.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application
	 * @throws PortalException if a creative application with the primary key could not be found
	 */
	public static CreativeApplication getCreativeApplication(
			long CreativeApplicationId)
		throws PortalException {

		return getService().getCreativeApplication(CreativeApplicationId);
	}

	/**
	 * Returns the creative application matching the UUID and group.
	 *
	 * @param uuid the creative application's UUID
	 * @param groupId the primary key of the group
	 * @return the matching creative application
	 * @throws PortalException if a matching creative application could not be found
	 */
	public static CreativeApplication getCreativeApplicationByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getCreativeApplicationByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.application.form.service.model.impl.CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of creative applications
	 */
	public static List<CreativeApplication> getCreativeApplications(
		int start, int end) {

		return getService().getCreativeApplications(start, end);
	}

	/**
	 * Returns all the creative applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative applications
	 * @param companyId the primary key of the company
	 * @return the matching creative applications, or an empty list if no matches were found
	 */
	public static List<CreativeApplication>
		getCreativeApplicationsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getCreativeApplicationsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of creative applications matching the UUID and company.
	 *
	 * @param uuid the UUID of the creative applications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching creative applications, or an empty list if no matches were found
	 */
	public static List<CreativeApplication>
		getCreativeApplicationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CreativeApplication> orderByComparator) {

		return getService().getCreativeApplicationsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of creative applications.
	 *
	 * @return the number of creative applications
	 */
	public static int getCreativeApplicationsCount() {
		return getService().getCreativeApplicationsCount();
	}

	public static CreativeApplication getCreativeByAppNo(
			String applicationNumber)
		throws com.nbp.creative.application.form.service.exception.
			NoSuchCreativeApplicationException {

		return getService().getCreativeByAppNo(applicationNumber);
	}

	public static List<CreativeApplication> getCreativeByS_U(
		int status, long userId) {

		return getService().getCreativeByS_U(status, userId);
	}

	public static List<CreativeApplication> getCreativeByStatus(int status) {
		return getService().getCreativeByStatus(status);
	}

	public static List<String> getCreativeeDistinctCategory() {
		return getService().getCreativeeDistinctCategory();
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
	 * Updates the creative application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeApplication the creative application
	 * @return the creative application that was updated
	 */
	public static CreativeApplication updateCreativeApplication(
		CreativeApplication creativeApplication) {

		return getService().updateCreativeApplication(creativeApplication);
	}

	public static CreativeApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CreativeApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			CreativeApplicationLocalServiceUtil.class,
			CreativeApplicationLocalService.class);

}