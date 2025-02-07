/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HsraInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HsraInspection. This utility wraps
 * <code>com.nbp.hsra.stage.services.service.impl.HsraInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HsraInspectionLocalService
 * @generated
 */
public class HsraInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.stage.services.service.impl.HsraInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the hsra inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraInspection the hsra inspection
	 * @return the hsra inspection that was added
	 */
	public static HsraInspection addHsraInspection(
		HsraInspection hsraInspection) {

		return getService().addHsraInspection(hsraInspection);
	}

	/**
	 * Creates a new hsra inspection with the primary key. Does not add the hsra inspection to the database.
	 *
	 * @param hsraInspectionId the primary key for the new hsra inspection
	 * @return the new hsra inspection
	 */
	public static HsraInspection createHsraInspection(long hsraInspectionId) {
		return getService().createHsraInspection(hsraInspectionId);
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
	 * Deletes the hsra inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraInspection the hsra inspection
	 * @return the hsra inspection that was removed
	 */
	public static HsraInspection deleteHsraInspection(
		HsraInspection hsraInspection) {

		return getService().deleteHsraInspection(hsraInspection);
	}

	/**
	 * Deletes the hsra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection that was removed
	 * @throws PortalException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection deleteHsraInspection(long hsraInspectionId)
		throws PortalException {

		return getService().deleteHsraInspection(hsraInspectionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraInspectionModelImpl</code>.
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

	public static HsraInspection fetchHsraInspection(long hsraInspectionId) {
		return getService().fetchHsraInspection(hsraInspectionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<HsraInspection> getHsra_CaseId(String caseId) {
		return getService().getHsra_CaseId(caseId);
	}

	public static List<HsraInspection> getHsra_CaseIdApplicationId(
		String status, long hsraApplicationId) {

		return getService().getHsra_CaseIdApplicationId(
			status, hsraApplicationId);
	}

	public static List<HsraInspection> getHsra_CaseIdStatus(
		String caseId, String status) {

		return getService().getHsra_CaseIdStatus(caseId, status);
	}

	public static List<HsraInspection> getHsra_FBAI(long hsraApplicationId) {
		return getService().getHsra_FBAI(hsraApplicationId);
	}

	public static List<HsraInspection> getHsra_Status(String status) {
		return getService().getHsra_Status(status);
	}

	public static List<HsraInspection> getHsra_StatusApplicationId(
		String status, long hsraApplicationId) {

		return getService().getHsra_StatusApplicationId(
			status, hsraApplicationId);
	}

	/**
	 * Returns the hsra inspection with the primary key.
	 *
	 * @param hsraInspectionId the primary key of the hsra inspection
	 * @return the hsra inspection
	 * @throws PortalException if a hsra inspection with the primary key could not be found
	 */
	public static HsraInspection getHsraInspection(long hsraInspectionId)
		throws PortalException {

		return getService().getHsraInspection(hsraInspectionId);
	}

	public static HsraInspection getHsraInspectionBy_CI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getService().getHsraInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the hsra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HsraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra inspections
	 * @param end the upper bound of the range of hsra inspections (not inclusive)
	 * @return the range of hsra inspections
	 */
	public static List<HsraInspection> getHsraInspections(int start, int end) {
		return getService().getHsraInspections(start, end);
	}

	/**
	 * Returns the number of hsra inspections.
	 *
	 * @return the number of hsra inspections
	 */
	public static int getHsraInspectionsCount() {
		return getService().getHsraInspectionsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static HsraInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long hsraApplicationId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHsraInspectionException {

		return getService().getInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, hsraApplicationId);
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
	 * Updates the hsra inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HsraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraInspection the hsra inspection
	 * @return the hsra inspection that was updated
	 */
	public static HsraInspection updateHsraInspection(
		HsraInspection hsraInspection) {

		return getService().updateHsraInspection(hsraInspection);
	}

	public static HsraInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HsraInspectionLocalService> _serviceSnapshot =
		new Snapshot<>(
			HsraInspectionLocalServiceUtil.class,
			HsraInspectionLocalService.class);

}