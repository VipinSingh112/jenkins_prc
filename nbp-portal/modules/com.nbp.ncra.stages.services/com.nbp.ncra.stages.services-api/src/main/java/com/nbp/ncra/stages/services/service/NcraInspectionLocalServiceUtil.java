/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.stages.services.model.NcraInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcraInspection. This utility wraps
 * <code>com.nbp.ncra.stages.services.service.impl.NcraInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcraInspectionLocalService
 * @generated
 */
public class NcraInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncra.stages.services.service.impl.NcraInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncra inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraInspection the ncra inspection
	 * @return the ncra inspection that was added
	 */
	public static NcraInspection addNcraInspection(
		NcraInspection ncraInspection) {

		return getService().addNcraInspection(ncraInspection);
	}

	/**
	 * Creates a new ncra inspection with the primary key. Does not add the ncra inspection to the database.
	 *
	 * @param ncraInspectionId the primary key for the new ncra inspection
	 * @return the new ncra inspection
	 */
	public static NcraInspection createNcraInspection(long ncraInspectionId) {
		return getService().createNcraInspection(ncraInspectionId);
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
	 * Deletes the ncra inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection that was removed
	 * @throws PortalException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection deleteNcraInspection(long ncraInspectionId)
		throws PortalException {

		return getService().deleteNcraInspection(ncraInspectionId);
	}

	/**
	 * Deletes the ncra inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraInspection the ncra inspection
	 * @return the ncra inspection that was removed
	 */
	public static NcraInspection deleteNcraInspection(
		NcraInspection ncraInspection) {

		return getService().deleteNcraInspection(ncraInspection);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraInspectionModelImpl</code>.
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

	public static NcraInspection fetchNcraInspection(long ncraInspectionId) {
		return getService().fetchNcraInspection(ncraInspectionId);
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

	public static NcraInspection
			getInspectionByStatus_SlotBoooked_ApplicationId(
				String status, long slotBookedByUser, long ncraApplicationId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getService().getInspectionByStatus_SlotBoooked_ApplicationId(
			status, slotBookedByUser, ncraApplicationId);
	}

	public static List<NcraInspection> getNcra_AI(long ncraApplicationId) {
		return getService().getNcra_AI(ncraApplicationId);
	}

	public static List<NcraInspection> getNcra_By_CaseId(String caseId) {
		return getService().getNcra_By_CaseId(caseId);
	}

	public static List<NcraInspection> getNcra_By_Status(String status) {
		return getService().getNcra_By_Status(status);
	}

	public static List<NcraInspection> getNcra_CaseIdApplicationId(
		String status, long ncraApplicationId) {

		return getService().getNcra_CaseIdApplicationId(
			status, ncraApplicationId);
	}

	public static List<NcraInspection> getNcra_CaseIdStatus(
		String caseId, String status) {

		return getService().getNcra_CaseIdStatus(caseId, status);
	}

	public static List<NcraInspection> getNcra_StatusApplicationId(
		String status, long ncraApplicationId) {

		return getService().getNcra_StatusApplicationId(
			status, ncraApplicationId);
	}

	/**
	 * Returns the ncra inspection with the primary key.
	 *
	 * @param ncraInspectionId the primary key of the ncra inspection
	 * @return the ncra inspection
	 * @throws PortalException if a ncra inspection with the primary key could not be found
	 */
	public static NcraInspection getNcraInspection(long ncraInspectionId)
		throws PortalException {

		return getService().getNcraInspection(ncraInspectionId);
	}

	public static NcraInspection getNcraInspectionBy_CI(String caseId)
		throws com.nbp.ncra.stages.services.exception.
			NoSuchNcraInspectionException {

		return getService().getNcraInspectionBy_CI(caseId);
	}

	/**
	 * Returns a range of all the ncra inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.stages.services.model.impl.NcraInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra inspections
	 * @param end the upper bound of the range of ncra inspections (not inclusive)
	 * @return the range of ncra inspections
	 */
	public static List<NcraInspection> getNcraInspections(int start, int end) {
		return getService().getNcraInspections(start, end);
	}

	/**
	 * Returns the number of ncra inspections.
	 *
	 * @return the number of ncra inspections
	 */
	public static int getNcraInspectionsCount() {
		return getService().getNcraInspectionsCount();
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
	 * Updates the ncra inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraInspection the ncra inspection
	 * @return the ncra inspection that was updated
	 */
	public static NcraInspection updateNcraInspection(
		NcraInspection ncraInspection) {

		return getService().updateNcraInspection(ncraInspection);
	}

	public static NcraInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcraInspectionLocalService> _serviceSnapshot =
		new Snapshot<>(
			NcraInspectionLocalServiceUtil.class,
			NcraInspectionLocalService.class);

}