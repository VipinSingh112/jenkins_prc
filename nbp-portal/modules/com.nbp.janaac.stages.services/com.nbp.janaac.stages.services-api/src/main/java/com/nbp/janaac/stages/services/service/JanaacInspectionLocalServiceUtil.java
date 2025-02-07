/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.janaac.stages.services.model.JanaacInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JanaacInspection. This utility wraps
 * <code>com.nbp.janaac.stages.services.service.impl.JanaacInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JanaacInspectionLocalService
 * @generated
 */
public class JanaacInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.janaac.stages.services.service.impl.JanaacInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the janaac inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacInspection the janaac inspection
	 * @return the janaac inspection that was added
	 */
	public static JanaacInspection addJanaacInspection(
		JanaacInspection janaacInspection) {

		return getService().addJanaacInspection(janaacInspection);
	}

	/**
	 * Creates a new janaac inspection with the primary key. Does not add the janaac inspection to the database.
	 *
	 * @param janaacInspectionId the primary key for the new janaac inspection
	 * @return the new janaac inspection
	 */
	public static JanaacInspection createJanaacInspection(
		long janaacInspectionId) {

		return getService().createJanaacInspection(janaacInspectionId);
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
	 * Deletes the janaac inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacInspection the janaac inspection
	 * @return the janaac inspection that was removed
	 */
	public static JanaacInspection deleteJanaacInspection(
		JanaacInspection janaacInspection) {

		return getService().deleteJanaacInspection(janaacInspection);
	}

	/**
	 * Deletes the janaac inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection that was removed
	 * @throws PortalException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection deleteJanaacInspection(
			long janaacInspectionId)
		throws PortalException {

		return getService().deleteJanaacInspection(janaacInspectionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacInspectionModelImpl</code>.
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

	public static JanaacInspection fetchJanaacInspection(
		long janaacInspectionId) {

		return getService().fetchJanaacInspection(janaacInspectionId);
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

	public static JanaacInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long ncraApplicationId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getService().getInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, ncraApplicationId);
	}

	public static List<JanaacInspection> getJanaac_AI(
		long janaacApplicationId) {

		return getService().getJanaac_AI(janaacApplicationId);
	}

	public static List<JanaacInspection> getJanaac_By_CaseId(String caseId) {
		return getService().getJanaac_By_CaseId(caseId);
	}

	public static List<JanaacInspection> getJanaac_By_Status(String status) {
		return getService().getJanaac_By_Status(status);
	}

	public static List<JanaacInspection> getJanaac_StatusApplicationId(
		String status, long janaacApplicationId) {

		return getService().getJanaac_StatusApplicationId(
			status, janaacApplicationId);
	}

	/**
	 * Returns the janaac inspection with the primary key.
	 *
	 * @param janaacInspectionId the primary key of the janaac inspection
	 * @return the janaac inspection
	 * @throws PortalException if a janaac inspection with the primary key could not be found
	 */
	public static JanaacInspection getJanaacInspection(long janaacInspectionId)
		throws PortalException {

		return getService().getJanaacInspection(janaacInspectionId);
	}

	public static JanaacInspection getJanaacInspectionBy_CI(String caseId)
		throws com.nbp.janaac.stages.services.exception.
			NoSuchJanaacInspectionException {

		return getService().getJanaacInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the janaac inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.janaac.stages.services.model.impl.JanaacInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac inspections
	 * @param end the upper bound of the range of janaac inspections (not inclusive)
	 * @return the range of janaac inspections
	 */
	public static List<JanaacInspection> getJanaacInspections(
		int start, int end) {

		return getService().getJanaacInspections(start, end);
	}

	/**
	 * Returns the number of janaac inspections.
	 *
	 * @return the number of janaac inspections
	 */
	public static int getJanaacInspectionsCount() {
		return getService().getJanaacInspectionsCount();
	}

	public static List<JanaacInspection> getNcra_CaseIdApplicationId(
		String status, long janaacApplicationId) {

		return getService().getNcra_CaseIdApplicationId(
			status, janaacApplicationId);
	}

	public static List<JanaacInspection> getNcra_CaseIdStatus(
		String caseId, String status) {

		return getService().getNcra_CaseIdStatus(caseId, status);
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
	 * Updates the janaac inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JanaacInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param janaacInspection the janaac inspection
	 * @return the janaac inspection that was updated
	 */
	public static JanaacInspection updateJanaacInspection(
		JanaacInspection janaacInspection) {

		return getService().updateJanaacInspection(janaacInspection);
	}

	public static JanaacInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JanaacInspectionLocalService>
		_serviceSnapshot = new Snapshot<>(
			JanaacInspectionLocalServiceUtil.class,
			JanaacInspectionLocalService.class);

}