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

import com.nbp.cannabis.application.form.services.model.GeneralDelarations;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for GeneralDelarations. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.GeneralDelarationsLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see GeneralDelarationsLocalService
 * @generated
 */
public class GeneralDelarationsLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.GeneralDelarationsLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the general delarations to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralDelarationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalDelarations the general delarations
	 * @return the general delarations that was added
	 */
	public static GeneralDelarations addGeneralDelarations(
		GeneralDelarations generalDelarations) {

		return getService().addGeneralDelarations(generalDelarations);
	}

	/**
	 * Creates a new general delarations with the primary key. Does not add the general delarations to the database.
	 *
	 * @param generalDeclarationId the primary key for the new general delarations
	 * @return the new general delarations
	 */
	public static GeneralDelarations createGeneralDelarations(
		long generalDeclarationId) {

		return getService().createGeneralDelarations(generalDeclarationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteCA_GD_CAI(long cannabisAppicationId) {
		getService().deleteCA_GD_CAI(cannabisAppicationId);
	}

	/**
	 * Deletes the general delarations from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralDelarationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalDelarations the general delarations
	 * @return the general delarations that was removed
	 */
	public static GeneralDelarations deleteGeneralDelarations(
		GeneralDelarations generalDelarations) {

		return getService().deleteGeneralDelarations(generalDelarations);
	}

	/**
	 * Deletes the general delarations with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralDelarationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations that was removed
	 * @throws PortalException if a general delarations with the primary key could not be found
	 */
	public static GeneralDelarations deleteGeneralDelarations(
			long generalDeclarationId)
		throws PortalException {

		return getService().deleteGeneralDelarations(generalDeclarationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.GeneralDelarationsModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.GeneralDelarationsModelImpl</code>.
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

	public static GeneralDelarations fetchGeneralDelarations(
		long generalDeclarationId) {

		return getService().fetchGeneralDelarations(generalDeclarationId);
	}

	/**
	 * Returns the general delarations matching the UUID and group.
	 *
	 * @param uuid the general delarations's UUID
	 * @param groupId the primary key of the group
	 * @return the matching general delarations, or <code>null</code> if a matching general delarations could not be found
	 */
	public static GeneralDelarations fetchGeneralDelarationsByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchGeneralDelarationsByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<GeneralDelarations> getCA_GD_CAI(
		long cannabisAppicationId) {

		return getService().getCA_GD_CAI(cannabisAppicationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the general delarations with the primary key.
	 *
	 * @param generalDeclarationId the primary key of the general delarations
	 * @return the general delarations
	 * @throws PortalException if a general delarations with the primary key could not be found
	 */
	public static GeneralDelarations getGeneralDelarations(
			long generalDeclarationId)
		throws PortalException {

		return getService().getGeneralDelarations(generalDeclarationId);
	}

	/**
	 * Returns the general delarations matching the UUID and group.
	 *
	 * @param uuid the general delarations's UUID
	 * @param groupId the primary key of the group
	 * @return the matching general delarations
	 * @throws PortalException if a matching general delarations could not be found
	 */
	public static GeneralDelarations getGeneralDelarationsByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return getService().getGeneralDelarationsByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the general delarationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.GeneralDelarationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @return the range of general delarationses
	 */
	public static List<GeneralDelarations> getGeneralDelarationses(
		int start, int end) {

		return getService().getGeneralDelarationses(start, end);
	}

	/**
	 * Returns all the general delarationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the general delarationses
	 * @param companyId the primary key of the company
	 * @return the matching general delarationses, or an empty list if no matches were found
	 */
	public static List<GeneralDelarations>
		getGeneralDelarationsesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getGeneralDelarationsesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of general delarationses matching the UUID and company.
	 *
	 * @param uuid the UUID of the general delarationses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of general delarationses
	 * @param end the upper bound of the range of general delarationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching general delarationses, or an empty list if no matches were found
	 */
	public static List<GeneralDelarations>
		getGeneralDelarationsesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<GeneralDelarations> orderByComparator) {

		return getService().getGeneralDelarationsesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of general delarationses.
	 *
	 * @return the number of general delarationses
	 */
	public static int getGeneralDelarationsesCount() {
		return getService().getGeneralDelarationsesCount();
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
	 * Updates the general delarations in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect GeneralDelarationsLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param generalDelarations the general delarations
	 * @return the general delarations that was updated
	 */
	public static GeneralDelarations updateGeneralDelarations(
		GeneralDelarations generalDelarations) {

		return getService().updateGeneralDelarations(generalDelarations);
	}

	public static GeneralDelarationsLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<GeneralDelarationsLocalService>
		_serviceSnapshot = new Snapshot<>(
			GeneralDelarationsLocalServiceUtil.class,
			GeneralDelarationsLocalService.class);

}