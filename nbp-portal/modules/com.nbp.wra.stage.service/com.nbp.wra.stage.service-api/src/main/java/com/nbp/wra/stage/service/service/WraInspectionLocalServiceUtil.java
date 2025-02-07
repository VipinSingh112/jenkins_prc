/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WraInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for WraInspection. This utility wraps
 * <code>com.nbp.wra.stage.service.service.impl.WraInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WraInspectionLocalService
 * @generated
 */
public class WraInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.stage.service.service.impl.WraInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the wra inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraInspection the wra inspection
	 * @return the wra inspection that was added
	 */
	public static WraInspection addWraInspection(WraInspection wraInspection) {
		return getService().addWraInspection(wraInspection);
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
	 * Creates a new wra inspection with the primary key. Does not add the wra inspection to the database.
	 *
	 * @param wraInspectionId the primary key for the new wra inspection
	 * @return the new wra inspection
	 */
	public static WraInspection createWraInspection(long wraInspectionId) {
		return getService().createWraInspection(wraInspectionId);
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
	 * Deletes the wra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection that was removed
	 * @throws PortalException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection deleteWraInspection(long wraInspectionId)
		throws PortalException {

		return getService().deleteWraInspection(wraInspectionId);
	}

	/**
	 * Deletes the wra inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraInspection the wra inspection
	 * @return the wra inspection that was removed
	 */
	public static WraInspection deleteWraInspection(
		WraInspection wraInspection) {

		return getService().deleteWraInspection(wraInspection);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraInspectionModelImpl</code>.
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

	public static WraInspection fetchWraInspection(long wraInspectionId) {
		return getService().fetchWraInspection(wraInspectionId);
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

	public static WraInspection getInspecByST_Slot_AppId(
			String status, long slotBookedByUser, long wraApplicationId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getService().getInspecByST_Slot_AppId(
			status, slotBookedByUser, wraApplicationId);
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

	public static List<WraInspection> getWra_CaseId(String caseId) {
		return getService().getWra_CaseId(caseId);
	}

	public static List<WraInspection> getWra_CI_AppId(
		long wraApplicationId, String status) {

		return getService().getWra_CI_AppId(wraApplicationId, status);
	}

	public static List<WraInspection> getWra_CI_Status(
		String caseId, String status) {

		return getService().getWra_CI_Status(caseId, status);
	}

	public static List<WraInspection> getWra_Status(String status) {
		return getService().getWra_Status(status);
	}

	public static List<WraInspection> getWraById(long wraApplicationId) {
		return getService().getWraById(wraApplicationId);
	}

	/**
	 * Returns the wra inspection with the primary key.
	 *
	 * @param wraInspectionId the primary key of the wra inspection
	 * @return the wra inspection
	 * @throws PortalException if a wra inspection with the primary key could not be found
	 */
	public static WraInspection getWraInspection(long wraInspectionId)
		throws PortalException {

		return getService().getWraInspection(wraInspectionId);
	}

	public static WraInspection getWraInspectionBy_CI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraInspectionException {

		return getService().getWraInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the wra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra inspections
	 * @param end the upper bound of the range of wra inspections (not inclusive)
	 * @return the range of wra inspections
	 */
	public static List<WraInspection> getWraInspections(int start, int end) {
		return getService().getWraInspections(start, end);
	}

	/**
	 * Returns the number of wra inspections.
	 *
	 * @return the number of wra inspections
	 */
	public static int getWraInspectionsCount() {
		return getService().getWraInspectionsCount();
	}

	public static WraInspection updateWraInspection(
		String caseId, java.util.Date dateOfInspection) {

		return getService().updateWraInspection(caseId, dateOfInspection);
	}

	/**
	 * Updates the wra inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraInspection the wra inspection
	 * @return the wra inspection that was updated
	 */
	public static WraInspection updateWraInspection(
		WraInspection wraInspection) {

		return getService().updateWraInspection(wraInspection);
	}

	public static WraInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<WraInspectionLocalService> _serviceSnapshot =
		new Snapshot<>(
			WraInspectionLocalServiceUtil.class,
			WraInspectionLocalService.class);

}