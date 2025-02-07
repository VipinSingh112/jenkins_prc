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

import com.nbp.cannabis.application.form.services.model.CannabisDeclarationOfOwnership;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisDeclarationOfOwnership. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisDeclarationOfOwnershipLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisDeclarationOfOwnershipLocalService
 * @generated
 */
public class CannabisDeclarationOfOwnershipLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisDeclarationOfOwnershipLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis declaration of ownership to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisDeclarationOfOwnershipLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeclarationOfOwnership the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership that was added
	 */
	public static CannabisDeclarationOfOwnership
		addCannabisDeclarationOfOwnership(
			CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		return getService().addCannabisDeclarationOfOwnership(
			cannabisDeclarationOfOwnership);
	}

	/**
	 * Creates a new cannabis declaration of ownership with the primary key. Does not add the cannabis declaration of ownership to the database.
	 *
	 * @param cannabisDecOfOwnershipId the primary key for the new cannabis declaration of ownership
	 * @return the new cannabis declaration of ownership
	 */
	public static CannabisDeclarationOfOwnership
		createCannabisDeclarationOfOwnership(long cannabisDecOfOwnershipId) {

		return getService().createCannabisDeclarationOfOwnership(
			cannabisDecOfOwnershipId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteCA_DO_BY_Id(long cannabisId) {
		getService().deleteCA_DO_BY_Id(cannabisId);
	}

	public static void deleteCA_DO_CAI(long cannabisAppicationId) {
		getService().deleteCA_DO_CAI(cannabisAppicationId);
	}

	/**
	 * Deletes the cannabis declaration of ownership from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisDeclarationOfOwnershipLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeclarationOfOwnership the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership that was removed
	 */
	public static CannabisDeclarationOfOwnership
		deleteCannabisDeclarationOfOwnership(
			CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		return getService().deleteCannabisDeclarationOfOwnership(
			cannabisDeclarationOfOwnership);
	}

	/**
	 * Deletes the cannabis declaration of ownership with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisDeclarationOfOwnershipLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership that was removed
	 * @throws PortalException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public static CannabisDeclarationOfOwnership
			deleteCannabisDeclarationOfOwnership(long cannabisDecOfOwnershipId)
		throws PortalException {

		return getService().deleteCannabisDeclarationOfOwnership(
			cannabisDecOfOwnershipId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisDeclarationOfOwnershipModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisDeclarationOfOwnershipModelImpl</code>.
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

	public static CannabisDeclarationOfOwnership
		fetchCannabisDeclarationOfOwnership(long cannabisDecOfOwnershipId) {

		return getService().fetchCannabisDeclarationOfOwnership(
			cannabisDecOfOwnershipId);
	}

	/**
	 * Returns the cannabis declaration of ownership matching the UUID and group.
	 *
	 * @param uuid the cannabis declaration of ownership's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis declaration of ownership, or <code>null</code> if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership
		fetchCannabisDeclarationOfOwnershipByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchCannabisDeclarationOfOwnershipByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<CannabisDeclarationOfOwnership> getCA_DO_CAI(
		long cannabisAppicationId) {

		return getService().getCA_DO_CAI(cannabisAppicationId);
	}

	/**
	 * Returns the cannabis declaration of ownership with the primary key.
	 *
	 * @param cannabisDecOfOwnershipId the primary key of the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership
	 * @throws PortalException if a cannabis declaration of ownership with the primary key could not be found
	 */
	public static CannabisDeclarationOfOwnership
			getCannabisDeclarationOfOwnership(long cannabisDecOfOwnershipId)
		throws PortalException {

		return getService().getCannabisDeclarationOfOwnership(
			cannabisDecOfOwnershipId);
	}

	/**
	 * Returns the cannabis declaration of ownership matching the UUID and group.
	 *
	 * @param uuid the cannabis declaration of ownership's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis declaration of ownership
	 * @throws PortalException if a matching cannabis declaration of ownership could not be found
	 */
	public static CannabisDeclarationOfOwnership
			getCannabisDeclarationOfOwnershipByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getCannabisDeclarationOfOwnershipByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis declaration of ownerships.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisDeclarationOfOwnershipModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @return the range of cannabis declaration of ownerships
	 */
	public static List<CannabisDeclarationOfOwnership>
		getCannabisDeclarationOfOwnerships(int start, int end) {

		return getService().getCannabisDeclarationOfOwnerships(start, end);
	}

	/**
	 * Returns all the cannabis declaration of ownerships matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis declaration of ownerships
	 * @param companyId the primary key of the company
	 * @return the matching cannabis declaration of ownerships, or an empty list if no matches were found
	 */
	public static List<CannabisDeclarationOfOwnership>
		getCannabisDeclarationOfOwnershipsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getCannabisDeclarationOfOwnershipsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis declaration of ownerships matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis declaration of ownerships
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis declaration of ownerships
	 * @param end the upper bound of the range of cannabis declaration of ownerships (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis declaration of ownerships, or an empty list if no matches were found
	 */
	public static List<CannabisDeclarationOfOwnership>
		getCannabisDeclarationOfOwnershipsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisDeclarationOfOwnership>
				orderByComparator) {

		return getService().
			getCannabisDeclarationOfOwnershipsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis declaration of ownerships.
	 *
	 * @return the number of cannabis declaration of ownerships
	 */
	public static int getCannabisDeclarationOfOwnershipsCount() {
		return getService().getCannabisDeclarationOfOwnershipsCount();
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
	 * Updates the cannabis declaration of ownership in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisDeclarationOfOwnershipLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisDeclarationOfOwnership the cannabis declaration of ownership
	 * @return the cannabis declaration of ownership that was updated
	 */
	public static CannabisDeclarationOfOwnership
		updateCannabisDeclarationOfOwnership(
			CannabisDeclarationOfOwnership cannabisDeclarationOfOwnership) {

		return getService().updateCannabisDeclarationOfOwnership(
			cannabisDeclarationOfOwnership);
	}

	public static CannabisDeclarationOfOwnershipLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisDeclarationOfOwnershipLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisDeclarationOfOwnershipLocalServiceUtil.class,
			CannabisDeclarationOfOwnershipLocalService.class);

}