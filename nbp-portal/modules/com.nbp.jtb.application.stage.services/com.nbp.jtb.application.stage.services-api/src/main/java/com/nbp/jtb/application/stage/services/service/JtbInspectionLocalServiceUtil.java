/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JtbInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JtbInspection. This utility wraps
 * <code>com.nbp.jtb.application.stage.services.service.impl.JtbInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JtbInspectionLocalService
 * @generated
 */
public class JtbInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.stage.services.service.impl.JtbInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jtb inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbInspection the jtb inspection
	 * @return the jtb inspection that was added
	 */
	public static JtbInspection addJtbInspection(JtbInspection jtbInspection) {
		return getService().addJtbInspection(jtbInspection);
	}

	/**
	 * Creates a new jtb inspection with the primary key. Does not add the jtb inspection to the database.
	 *
	 * @param jtbInspectionId the primary key for the new jtb inspection
	 * @return the new jtb inspection
	 */
	public static JtbInspection createJtbInspection(long jtbInspectionId) {
		return getService().createJtbInspection(jtbInspectionId);
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
	 * Deletes the jtb inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbInspection the jtb inspection
	 * @return the jtb inspection that was removed
	 */
	public static JtbInspection deleteJtbInspection(
		JtbInspection jtbInspection) {

		return getService().deleteJtbInspection(jtbInspection);
	}

	/**
	 * Deletes the jtb inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection that was removed
	 * @throws PortalException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection deleteJtbInspection(long jtbInspectionId)
		throws PortalException {

		return getService().deleteJtbInspection(jtbInspectionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbInspectionModelImpl</code>.
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

	public static JtbInspection fetchJtbInspection(long jtbInspectionId) {
		return getService().fetchJtbInspection(jtbInspectionId);
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

	public static List<JtbInspection> getJtb_CaseId(String caseId) {
		return getService().getJtb_CaseId(caseId);
	}

	public static List<JtbInspection> getJtb_CaseIdStatus(
		String caseId, String status) {

		return getService().getJtb_CaseIdStatus(caseId, status);
	}

	public static List<JtbInspection> getJtb_CIAppId(
		String status, long jtbApplicationId) {

		return getService().getJtb_CIAppId(status, jtbApplicationId);
	}

	public static List<JtbInspection> getJtb_FBAI(long jtbApplicationId) {
		return getService().getJtb_FBAI(jtbApplicationId);
	}

	public static List<JtbInspection> getJtb_Status(String status) {
		return getService().getJtb_Status(status);
	}

	public static JtbInspection getJtbByStatus_Slot_AppId(
			String status, long slotBookedByUser, long jtbApplicationId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getService().getJtbByStatus_Slot_AppId(
			status, slotBookedByUser, jtbApplicationId);
	}

	/**
	 * Returns the jtb inspection with the primary key.
	 *
	 * @param jtbInspectionId the primary key of the jtb inspection
	 * @return the jtb inspection
	 * @throws PortalException if a jtb inspection with the primary key could not be found
	 */
	public static JtbInspection getJtbInspection(long jtbInspectionId)
		throws PortalException {

		return getService().getJtbInspection(jtbInspectionId);
	}

	/**
	 * Returns a range of all the jtb inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb inspections
	 * @param end the upper bound of the range of jtb inspections (not inclusive)
	 * @return the range of jtb inspections
	 */
	public static List<JtbInspection> getJtbInspections(int start, int end) {
		return getService().getJtbInspections(start, end);
	}

	/**
	 * Returns the number of jtb inspections.
	 *
	 * @return the number of jtb inspections
	 */
	public static int getJtbInspectionsCount() {
		return getService().getJtbInspectionsCount();
	}

	public static JtbInspection getJtbyInspecBy_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbInspectionException {

		return getService().getJtbyInspecBy_CI(caseId);
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
	 * Updates the jtb inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbInspection the jtb inspection
	 * @return the jtb inspection that was updated
	 */
	public static JtbInspection updateJtbInspection(
		JtbInspection jtbInspection) {

		return getService().updateJtbInspection(jtbInspection);
	}

	public static JtbInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JtbInspectionLocalService> _serviceSnapshot =
		new Snapshot<>(
			JtbInspectionLocalServiceUtil.class,
			JtbInspectionLocalService.class);

}