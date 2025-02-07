/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.stages.services.model.OsiInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiInspection. This utility wraps
 * <code>com.nbp.osi.stages.services.service.impl.OsiInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInspectionLocalService
 * @generated
 */
public class OsiInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.stages.services.service.impl.OsiInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInspection the osi inspection
	 * @return the osi inspection that was added
	 */
	public static OsiInspection addOsiInspection(OsiInspection osiInspection) {
		return getService().addOsiInspection(osiInspection);
	}

	/**
	 * Creates a new osi inspection with the primary key. Does not add the osi inspection to the database.
	 *
	 * @param osiInspectionId the primary key for the new osi inspection
	 * @return the new osi inspection
	 */
	public static OsiInspection createOsiInspection(long osiInspectionId) {
		return getService().createOsiInspection(osiInspectionId);
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
	 * Deletes the osi inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection that was removed
	 * @throws PortalException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection deleteOsiInspection(long osiInspectionId)
		throws PortalException {

		return getService().deleteOsiInspection(osiInspectionId);
	}

	/**
	 * Deletes the osi inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInspection the osi inspection
	 * @return the osi inspection that was removed
	 */
	public static OsiInspection deleteOsiInspection(
		OsiInspection osiInspection) {

		return getService().deleteOsiInspection(osiInspection);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiInspectionModelImpl</code>.
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

	public static OsiInspection fetchOsiInspection(long osiInspectionId) {
		return getService().fetchOsiInspection(osiInspectionId);
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

	public static OsiInspection getInspectionByStatus_SlotBoooked(
			String status, long slotBookedByUser, long osiApplicationId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getService().getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser, osiApplicationId);
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
	 * Returns the osi inspection with the primary key.
	 *
	 * @param osiInspectionId the primary key of the osi inspection
	 * @return the osi inspection
	 * @throws PortalException if a osi inspection with the primary key could not be found
	 */
	public static OsiInspection getOsiInspection(long osiInspectionId)
		throws PortalException {

		return getService().getOsiInspection(osiInspectionId);
	}

	public static OsiInspection getOsiInspectionBY_CI(String caseId)
		throws com.nbp.osi.stages.services.exception.
			NoSuchOsiInspectionException {

		return getService().getOsiInspectionBY_CI(caseId);
	}

	/**
	 * Returns a range of all the osi inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.stages.services.model.impl.OsiInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi inspections
	 * @param end the upper bound of the range of osi inspections (not inclusive)
	 * @return the range of osi inspections
	 */
	public static List<OsiInspection> getOsiInspections(int start, int end) {
		return getService().getOsiInspections(start, end);
	}

	public static List<OsiInspection> getOSIInspections(long osiApplicationId) {
		return getService().getOSIInspections(osiApplicationId);
	}

	public static List<OsiInspection> getOSIInspectionsByCaseId(String caseId) {
		return getService().getOSIInspectionsByCaseId(caseId);
	}

	public static List<OsiInspection> getOSIInspectionsByStatusApplicationId(
		long osiApplicationId, String status) {

		return getService().getOSIInspectionsByStatusApplicationId(
			osiApplicationId, status);
	}

	public static List<OsiInspection> getOSIInspectionsByStatusCaseId(
		String caseId, String status) {

		return getService().getOSIInspectionsByStatusCaseId(caseId, status);
	}

	/**
	 * Returns the number of osi inspections.
	 *
	 * @return the number of osi inspections
	 */
	public static int getOsiInspectionsCount() {
		return getService().getOsiInspectionsCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static OsiInspection updateManuInspection(
		String caseId, java.util.Date dateOfInspection) {

		return getService().updateManuInspection(caseId, dateOfInspection);
	}

	/**
	 * Updates the osi inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInspection the osi inspection
	 * @return the osi inspection that was updated
	 */
	public static OsiInspection updateOsiInspection(
		OsiInspection osiInspection) {

		return getService().updateOsiInspection(osiInspection);
	}

	public static OsiInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiInspectionLocalService> _serviceSnapshot =
		new Snapshot<>(
			OsiInspectionLocalServiceUtil.class,
			OsiInspectionLocalService.class);

}