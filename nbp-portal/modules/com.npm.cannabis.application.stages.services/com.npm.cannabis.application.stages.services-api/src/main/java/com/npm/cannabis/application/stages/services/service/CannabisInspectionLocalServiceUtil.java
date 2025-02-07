/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisInspection. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisInspectionLocalService
 * @generated
 */
public class CannabisInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisInspection the cannabis inspection
	 * @return the cannabis inspection that was added
	 */
	public static CannabisInspection addCannabisInspection(
		CannabisInspection cannabisInspection) {

		return getService().addCannabisInspection(cannabisInspection);
	}

	/**
	 * Creates a new cannabis inspection with the primary key. Does not add the cannabis inspection to the database.
	 *
	 * @param cannabisInspectionId the primary key for the new cannabis inspection
	 * @return the new cannabis inspection
	 */
	public static CannabisInspection createCannabisInspection(
		long cannabisInspectionId) {

		return getService().createCannabisInspection(cannabisInspectionId);
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
	 * Deletes the cannabis inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisInspection the cannabis inspection
	 * @return the cannabis inspection that was removed
	 */
	public static CannabisInspection deleteCannabisInspection(
		CannabisInspection cannabisInspection) {

		return getService().deleteCannabisInspection(cannabisInspection);
	}

	/**
	 * Deletes the cannabis inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection that was removed
	 * @throws PortalException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection deleteCannabisInspection(
			long cannabisInspectionId)
		throws PortalException {

		return getService().deleteCannabisInspection(cannabisInspectionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionModelImpl</code>.
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

	public static CannabisInspection fetchCannabisInspection(
		long cannabisInspectionId) {

		return getService().fetchCannabisInspection(cannabisInspectionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the cannabis inspection with the primary key.
	 *
	 * @param cannabisInspectionId the primary key of the cannabis inspection
	 * @return the cannabis inspection
	 * @throws PortalException if a cannabis inspection with the primary key could not be found
	 */
	public static CannabisInspection getCannabisInspection(
			long cannabisInspectionId)
		throws PortalException {

		return getService().getCannabisInspection(cannabisInspectionId);
	}

	/**
	 * Returns a range of all the cannabis inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis inspections
	 * @param end the upper bound of the range of cannabis inspections (not inclusive)
	 * @return the range of cannabis inspections
	 */
	public static List<CannabisInspection> getCannabisInspections(
		int start, int end) {

		return getService().getCannabisInspections(start, end);
	}

	public static List<CannabisInspection> getCannabisInspections(
		long cannabisApplicationId) {

		return getService().getCannabisInspections(cannabisApplicationId);
	}

	public static List<CannabisInspection> getCannabisInspectionsByCaseId(
		String caseId) {

		return getService().getCannabisInspectionsByCaseId(caseId);
	}

	public static List<CannabisInspection>
		getCannabisInspectionsByStatusApplicationId(
			long cannabisApplicationId, String status) {

		return getService().getCannabisInspectionsByStatusApplicationId(
			cannabisApplicationId, status);
	}

	public static List<CannabisInspection> getCannabisInspectionsByStatusCaseId(
		String caseId, String status) {

		return getService().getCannabisInspectionsByStatusCaseId(
			caseId, status);
	}

	/**
	 * Returns the number of cannabis inspections.
	 *
	 * @return the number of cannabis inspections
	 */
	public static int getCannabisInspectionsCount() {
		return getService().getCannabisInspectionsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static CannabisInspection getInspectionByStatus_SlotBoooked(
			String status, long slotBookedByUser)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getService().getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser);
	}

	public static CannabisInspection getInspectionByStatus_SlotBoooked(
			String status, long slotBookedByUser, long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisInspectionException {

		return getService().getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser, cannabisApplicationId);
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
	 * Updates the cannabis inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisInspection the cannabis inspection
	 * @return the cannabis inspection that was updated
	 */
	public static CannabisInspection updateCannabisInspection(
		CannabisInspection cannabisInspection) {

		return getService().updateCannabisInspection(cannabisInspection);
	}

	public static CannabisInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisInspectionLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisInspectionLocalServiceUtil.class,
			CannabisInspectionLocalService.class);

}