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

import com.nbp.cannabis.application.form.services.model.CannabisConsentByPropertyOwner;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisConsentByPropertyOwner. This utility wraps
 * <code>com.nbp.cannabis.application.form.services.service.impl.CannabisConsentByPropertyOwnerLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisConsentByPropertyOwnerLocalService
 * @generated
 */
public class CannabisConsentByPropertyOwnerLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.cannabis.application.form.services.service.impl.CannabisConsentByPropertyOwnerLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis consent by property owner to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentByPropertyOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was added
	 */
	public static CannabisConsentByPropertyOwner
		addCannabisConsentByPropertyOwner(
			CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return getService().addCannabisConsentByPropertyOwner(
			cannabisConsentByPropertyOwner);
	}

	/**
	 * Creates a new cannabis consent by property owner with the primary key. Does not add the cannabis consent by property owner to the database.
	 *
	 * @param cannabisCPOId the primary key for the new cannabis consent by property owner
	 * @return the new cannabis consent by property owner
	 */
	public static CannabisConsentByPropertyOwner
		createCannabisConsentByPropertyOwner(long cannabisCPOId) {

		return getService().createCannabisConsentByPropertyOwner(cannabisCPOId);
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
	 * Deletes the cannabis consent by property owner from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentByPropertyOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was removed
	 */
	public static CannabisConsentByPropertyOwner
		deleteCannabisConsentByPropertyOwner(
			CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return getService().deleteCannabisConsentByPropertyOwner(
			cannabisConsentByPropertyOwner);
	}

	/**
	 * Deletes the cannabis consent by property owner with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentByPropertyOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was removed
	 * @throws PortalException if a cannabis consent by property owner with the primary key could not be found
	 */
	public static CannabisConsentByPropertyOwner
			deleteCannabisConsentByPropertyOwner(long cannabisCPOId)
		throws PortalException {

		return getService().deleteCannabisConsentByPropertyOwner(cannabisCPOId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerModelImpl</code>.
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

	public static CannabisConsentByPropertyOwner
		fetchCannabisConsentByPropertyOwner(long cannabisCPOId) {

		return getService().fetchCannabisConsentByPropertyOwner(cannabisCPOId);
	}

	/**
	 * Returns the cannabis consent by property owner matching the UUID and group.
	 *
	 * @param uuid the cannabis consent by property owner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis consent by property owner, or <code>null</code> if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner
		fetchCannabisConsentByPropertyOwnerByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchCannabisConsentByPropertyOwnerByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CannabisConsentByPropertyOwner getCA_CPO_CAI(
		long cannabisAppicationId) {

		return getService().getCA_CPO_CAI(cannabisAppicationId);
	}

	/**
	 * Returns the cannabis consent by property owner with the primary key.
	 *
	 * @param cannabisCPOId the primary key of the cannabis consent by property owner
	 * @return the cannabis consent by property owner
	 * @throws PortalException if a cannabis consent by property owner with the primary key could not be found
	 */
	public static CannabisConsentByPropertyOwner
			getCannabisConsentByPropertyOwner(long cannabisCPOId)
		throws PortalException {

		return getService().getCannabisConsentByPropertyOwner(cannabisCPOId);
	}

	/**
	 * Returns the cannabis consent by property owner matching the UUID and group.
	 *
	 * @param uuid the cannabis consent by property owner's UUID
	 * @param groupId the primary key of the group
	 * @return the matching cannabis consent by property owner
	 * @throws PortalException if a matching cannabis consent by property owner could not be found
	 */
	public static CannabisConsentByPropertyOwner
			getCannabisConsentByPropertyOwnerByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getCannabisConsentByPropertyOwnerByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the cannabis consent by property owners.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.cannabis.application.form.services.model.impl.CannabisConsentByPropertyOwnerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @return the range of cannabis consent by property owners
	 */
	public static List<CannabisConsentByPropertyOwner>
		getCannabisConsentByPropertyOwners(int start, int end) {

		return getService().getCannabisConsentByPropertyOwners(start, end);
	}

	/**
	 * Returns all the cannabis consent by property owners matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis consent by property owners
	 * @param companyId the primary key of the company
	 * @return the matching cannabis consent by property owners, or an empty list if no matches were found
	 */
	public static List<CannabisConsentByPropertyOwner>
		getCannabisConsentByPropertyOwnersByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getCannabisConsentByPropertyOwnersByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of cannabis consent by property owners matching the UUID and company.
	 *
	 * @param uuid the UUID of the cannabis consent by property owners
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of cannabis consent by property owners
	 * @param end the upper bound of the range of cannabis consent by property owners (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching cannabis consent by property owners, or an empty list if no matches were found
	 */
	public static List<CannabisConsentByPropertyOwner>
		getCannabisConsentByPropertyOwnersByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<CannabisConsentByPropertyOwner>
				orderByComparator) {

		return getService().
			getCannabisConsentByPropertyOwnersByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of cannabis consent by property owners.
	 *
	 * @return the number of cannabis consent by property owners
	 */
	public static int getCannabisConsentByPropertyOwnersCount() {
		return getService().getCannabisConsentByPropertyOwnersCount();
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
	 * Updates the cannabis consent by property owner in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisConsentByPropertyOwnerLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisConsentByPropertyOwner the cannabis consent by property owner
	 * @return the cannabis consent by property owner that was updated
	 */
	public static CannabisConsentByPropertyOwner
		updateCannabisConsentByPropertyOwner(
			CannabisConsentByPropertyOwner cannabisConsentByPropertyOwner) {

		return getService().updateCannabisConsentByPropertyOwner(
			cannabisConsentByPropertyOwner);
	}

	public static CannabisConsentByPropertyOwnerLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisConsentByPropertyOwnerLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisConsentByPropertyOwnerLocalServiceUtil.class,
			CannabisConsentByPropertyOwnerLocalService.class);

}