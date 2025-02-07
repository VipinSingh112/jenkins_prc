/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManuInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManuInspection. This utility wraps
 * <code>com.nbp.manufacturing.application.stages.services.service.impl.ManuInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInspectionLocalService
 * @generated
 */
public class ManuInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.stages.services.service.impl.ManuInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manu inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInspection the manu inspection
	 * @return the manu inspection that was added
	 */
	public static ManuInspection addManuInspection(
		ManuInspection manuInspection) {

		return getService().addManuInspection(manuInspection);
	}

	/**
	 * Creates a new manu inspection with the primary key. Does not add the manu inspection to the database.
	 *
	 * @param manuInspectionId the primary key for the new manu inspection
	 * @return the new manu inspection
	 */
	public static ManuInspection createManuInspection(long manuInspectionId) {
		return getService().createManuInspection(manuInspectionId);
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
	 * Deletes the manu inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection that was removed
	 * @throws PortalException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection deleteManuInspection(long manuInspectionId)
		throws PortalException {

		return getService().deleteManuInspection(manuInspectionId);
	}

	/**
	 * Deletes the manu inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInspection the manu inspection
	 * @return the manu inspection that was removed
	 */
	public static ManuInspection deleteManuInspection(
		ManuInspection manuInspection) {

		return getService().deleteManuInspection(manuInspection);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionModelImpl</code>.
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

	public static ManuInspection fetchManuInspection(long manuInspectionId) {
		return getService().fetchManuInspection(manuInspectionId);
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

	public static ManuInspection getInspectionByStatus_SlotBoooked(
			String status, long slotBookedByUser,
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getService().getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser, manufacturingApplicationId);
	}

	public static ManuInspection getManufacturingInspectionBY_CI(String caseId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuInspectionException {

		return getService().getManufacturingInspectionBY_CI(caseId);
	}

	/**
	 * Returns the manu inspection with the primary key.
	 *
	 * @param manuInspectionId the primary key of the manu inspection
	 * @return the manu inspection
	 * @throws PortalException if a manu inspection with the primary key could not be found
	 */
	public static ManuInspection getManuInspection(long manuInspectionId)
		throws PortalException {

		return getService().getManuInspection(manuInspectionId);
	}

	/**
	 * Returns a range of all the manu inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu inspections
	 * @param end the upper bound of the range of manu inspections (not inclusive)
	 * @return the range of manu inspections
	 */
	public static List<ManuInspection> getManuInspections(int start, int end) {
		return getService().getManuInspections(start, end);
	}

	public static List<ManuInspection> getManuInspections(
		long manufacturingApplicationId) {

		return getService().getManuInspections(manufacturingApplicationId);
	}

	public static List<ManuInspection> getManuInspectionsByCaseId(
		String caseId) {

		return getService().getManuInspectionsByCaseId(caseId);
	}

	public static List<ManuInspection> getManuInspectionsByStatusApplicationId(
		long manufacturingApplicationId, String status) {

		return getService().getManuInspectionsByStatusApplicationId(
			manufacturingApplicationId, status);
	}

	public static List<ManuInspection> getManuInspectionsByStatusCaseId(
		String caseId, String status) {

		return getService().getManuInspectionsByStatusCaseId(caseId, status);
	}

	/**
	 * Returns the number of manu inspections.
	 *
	 * @return the number of manu inspections
	 */
	public static int getManuInspectionsCount() {
		return getService().getManuInspectionsCount();
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
	 * Updates the manu inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInspection the manu inspection
	 * @return the manu inspection that was updated
	 */
	public static ManuInspection updateManuInspection(
		ManuInspection manuInspection) {

		return getService().updateManuInspection(manuInspection);
	}

	public static ManuInspection updateManuInspection(
		String caseId, java.util.Date dateOfInspection) {

		return getService().updateManuInspection(caseId, dateOfInspection);
	}

	public static ManuInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManuInspectionLocalService> _serviceSnapshot =
		new Snapshot<>(
			ManuInspectionLocalServiceUtil.class,
			ManuInspectionLocalService.class);

}