/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.agriculture.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.agriculture.stages.services.model.AgricultureInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for AgricultureInspection. This utility wraps
 * <code>com.nbp.agriculture.stages.services.service.impl.AgricultureInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AgricultureInspectionLocalService
 * @generated
 */
public class AgricultureInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.agriculture.stages.services.service.impl.AgricultureInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the agriculture inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureInspection the agriculture inspection
	 * @return the agriculture inspection that was added
	 */
	public static AgricultureInspection addAgricultureInspection(
		AgricultureInspection agricultureInspection) {

		return getService().addAgricultureInspection(agricultureInspection);
	}

	/**
	 * Creates a new agriculture inspection with the primary key. Does not add the agriculture inspection to the database.
	 *
	 * @param agricultureInspectionId the primary key for the new agriculture inspection
	 * @return the new agriculture inspection
	 */
	public static AgricultureInspection createAgricultureInspection(
		long agricultureInspectionId) {

		return getService().createAgricultureInspection(
			agricultureInspectionId);
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
	 * Deletes the agriculture inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureInspection the agriculture inspection
	 * @return the agriculture inspection that was removed
	 */
	public static AgricultureInspection deleteAgricultureInspection(
		AgricultureInspection agricultureInspection) {

		return getService().deleteAgricultureInspection(agricultureInspection);
	}

	/**
	 * Deletes the agriculture inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection that was removed
	 * @throws PortalException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection deleteAgricultureInspection(
			long agricultureInspectionId)
		throws PortalException {

		return getService().deleteAgricultureInspection(
			agricultureInspectionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionModelImpl</code>.
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

	public static AgricultureInspection fetchAgricultureInspection(
		long agricultureInspectionId) {

		return getService().fetchAgricultureInspection(agricultureInspectionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static AgricultureInspection getAgricultureBy_CI(String caseId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getService().getAgricultureBy_CI(caseId);
	}

	/**
	 * Returns the agriculture inspection with the primary key.
	 *
	 * @param agricultureInspectionId the primary key of the agriculture inspection
	 * @return the agriculture inspection
	 * @throws PortalException if a agriculture inspection with the primary key could not be found
	 */
	public static AgricultureInspection getAgricultureInspection(
			long agricultureInspectionId)
		throws PortalException {

		return getService().getAgricultureInspection(agricultureInspectionId);
	}

	/**
	 * Returns a range of all the agriculture inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.agriculture.stages.services.model.impl.AgricultureInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture inspections
	 * @param end the upper bound of the range of agriculture inspections (not inclusive)
	 * @return the range of agriculture inspections
	 */
	public static List<AgricultureInspection> getAgricultureInspections(
		int start, int end) {

		return getService().getAgricultureInspections(start, end);
	}

	/**
	 * Returns the number of agriculture inspections.
	 *
	 * @return the number of agriculture inspections
	 */
	public static int getAgricultureInspectionsCount() {
		return getService().getAgricultureInspectionsCount();
	}

	public static List<AgricultureInspection> getAgriInspections(
		long agriApplicationId) {

		return getService().getAgriInspections(agriApplicationId);
	}

	public static List<AgricultureInspection> getAgriInspectionsByCaseId(
		String caseId) {

		return getService().getAgriInspectionsByCaseId(caseId);
	}

	public static List<AgricultureInspection>
		getAgriInspectionsByStatusApplicationId(
			long agriApplicationId, String status) {

		return getService().getAgriInspectionsByStatusApplicationId(
			agriApplicationId, status);
	}

	public static AgricultureInspection getAgriInspectionsByStatusApplicationId(
			String status, long slotBookedByUser, long agriApplicationId)
		throws com.nbp.agriculture.stages.services.exception.
			NoSuchAgricultureInspectionException {

		return getService().getAgriInspectionsByStatusApplicationId(
			status, slotBookedByUser, agriApplicationId);
	}

	public static List<AgricultureInspection> getAgriInspectionsByStatusCaseId(
		String caseId, String status) {

		return getService().getAgriInspectionsByStatusCaseId(caseId, status);
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
	 * Updates the agriculture inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect AgricultureInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param agricultureInspection the agriculture inspection
	 * @return the agriculture inspection that was updated
	 */
	public static AgricultureInspection updateAgricultureInspection(
		AgricultureInspection agricultureInspection) {

		return getService().updateAgricultureInspection(agricultureInspection);
	}

	public static AgricultureInspection updateAgricultureInspection(
		String caseId, java.util.Date dateOfinspection) {

		return getService().updateAgricultureInspection(
			caseId, dateOfinspection);
	}

	public static AgricultureInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<AgricultureInspectionLocalService>
		_serviceSnapshot = new Snapshot<>(
			AgricultureInspectionLocalServiceUtil.class,
			AgricultureInspectionLocalService.class);

}