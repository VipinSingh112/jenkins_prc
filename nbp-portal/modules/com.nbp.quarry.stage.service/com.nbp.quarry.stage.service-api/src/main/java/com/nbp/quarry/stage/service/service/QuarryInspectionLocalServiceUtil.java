/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QuarryInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QuarryInspection. This utility wraps
 * <code>com.nbp.quarry.stage.service.service.impl.QuarryInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryInspectionLocalService
 * @generated
 */
public class QuarryInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quarry.stage.service.service.impl.QuarryInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the quarry inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInspection the quarry inspection
	 * @return the quarry inspection that was added
	 */
	public static QuarryInspection addQuarryInspection(
		QuarryInspection quarryInspection) {

		return getService().addQuarryInspection(quarryInspection);
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
	 * Creates a new quarry inspection with the primary key. Does not add the quarry inspection to the database.
	 *
	 * @param quarryInspectionId the primary key for the new quarry inspection
	 * @return the new quarry inspection
	 */
	public static QuarryInspection createQuarryInspection(
		long quarryInspectionId) {

		return getService().createQuarryInspection(quarryInspectionId);
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
	 * Deletes the quarry inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection that was removed
	 * @throws PortalException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection deleteQuarryInspection(
			long quarryInspectionId)
		throws PortalException {

		return getService().deleteQuarryInspection(quarryInspectionId);
	}

	/**
	 * Deletes the quarry inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInspection the quarry inspection
	 * @return the quarry inspection that was removed
	 */
	public static QuarryInspection deleteQuarryInspection(
		QuarryInspection quarryInspection) {

		return getService().deleteQuarryInspection(quarryInspection);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryInspectionModelImpl</code>.
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

	public static QuarryInspection fetchQuarryInspection(
		long quarryInspectionId) {

		return getService().fetchQuarryInspection(quarryInspectionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static QuarryInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long quarryApplicationId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getService().getInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, quarryApplicationId);
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

	public static List<QuarryInspection> getQuarry_CaseId(String caseId) {
		return getService().getQuarry_CaseId(caseId);
	}

	public static List<QuarryInspection> getQuarry_CaseIdApplicationId(
		String status, long quarryApplicationId) {

		return getService().getQuarry_CaseIdApplicationId(
			status, quarryApplicationId);
	}

	public static List<QuarryInspection> getQuarry_CaseIdStatus(
		String caseId, String status) {

		return getService().getQuarry_CaseIdStatus(caseId, status);
	}

	public static List<QuarryInspection> getQuarry_FBAI(
		long quarryApplicationId) {

		return getService().getQuarry_FBAI(quarryApplicationId);
	}

	public static List<QuarryInspection> getQuarry_Status(String status) {
		return getService().getQuarry_Status(status);
	}

	public static List<QuarryInspection> getQuarry_StatusApplicationId(
		String status, long quarryApplicationId) {

		return getService().getQuarry_StatusApplicationId(
			status, quarryApplicationId);
	}

	/**
	 * Returns the quarry inspection with the primary key.
	 *
	 * @param quarryInspectionId the primary key of the quarry inspection
	 * @return the quarry inspection
	 * @throws PortalException if a quarry inspection with the primary key could not be found
	 */
	public static QuarryInspection getQuarryInspection(long quarryInspectionId)
		throws PortalException {

		return getService().getQuarryInspection(quarryInspectionId);
	}

	public static QuarryInspection getQuarryInspectionBy_CI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryInspectionException {

		return getService().getQuarryInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the quarry inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry inspections
	 * @param end the upper bound of the range of quarry inspections (not inclusive)
	 * @return the range of quarry inspections
	 */
	public static List<QuarryInspection> getQuarryInspections(
		int start, int end) {

		return getService().getQuarryInspections(start, end);
	}

	/**
	 * Returns the number of quarry inspections.
	 *
	 * @return the number of quarry inspections
	 */
	public static int getQuarryInspectionsCount() {
		return getService().getQuarryInspectionsCount();
	}

	/**
	 * Updates the quarry inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryInspection the quarry inspection
	 * @return the quarry inspection that was updated
	 */
	public static QuarryInspection updateQuarryInspection(
		QuarryInspection quarryInspection) {

		return getService().updateQuarryInspection(quarryInspection);
	}

	public static QuarryInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QuarryInspectionLocalService>
		_serviceSnapshot = new Snapshot<>(
			QuarryInspectionLocalServiceUtil.class,
			QuarryInspectionLocalService.class);

}