/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.creative.stages.services.model.CreativeInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CreativeInspection. This utility wraps
 * <code>com.nbp.creative.stages.services.service.impl.CreativeInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CreativeInspectionLocalService
 * @generated
 */
public class CreativeInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.creative.stages.services.service.impl.CreativeInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the creative inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeInspection the creative inspection
	 * @return the creative inspection that was added
	 */
	public static CreativeInspection addCreativeInspection(
		CreativeInspection creativeInspection) {

		return getService().addCreativeInspection(creativeInspection);
	}

	/**
	 * Creates a new creative inspection with the primary key. Does not add the creative inspection to the database.
	 *
	 * @param creativeInspectionId the primary key for the new creative inspection
	 * @return the new creative inspection
	 */
	public static CreativeInspection createCreativeInspection(
		long creativeInspectionId) {

		return getService().createCreativeInspection(creativeInspectionId);
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
	 * Deletes the creative inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeInspection the creative inspection
	 * @return the creative inspection that was removed
	 */
	public static CreativeInspection deleteCreativeInspection(
		CreativeInspection creativeInspection) {

		return getService().deleteCreativeInspection(creativeInspection);
	}

	/**
	 * Deletes the creative inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection that was removed
	 * @throws PortalException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection deleteCreativeInspection(
			long creativeInspectionId)
		throws PortalException {

		return getService().deleteCreativeInspection(creativeInspectionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeInspectionModelImpl</code>.
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

	public static CreativeInspection fetchCreativeInspection(
		long creativeInspectionId) {

		return getService().fetchCreativeInspection(creativeInspectionId);
	}

	public static CreativeInspection geCreativeInspectionBy_CI(String caseId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getService().geCreativeInspectionBy_CI(caseId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the creative inspection with the primary key.
	 *
	 * @param creativeInspectionId the primary key of the creative inspection
	 * @return the creative inspection
	 * @throws PortalException if a creative inspection with the primary key could not be found
	 */
	public static CreativeInspection getCreativeInspection(
			long creativeInspectionId)
		throws PortalException {

		return getService().getCreativeInspection(creativeInspectionId);
	}

	/**
	 * Returns a range of all the creative inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.creative.stages.services.model.impl.CreativeInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative inspections
	 * @param end the upper bound of the range of creative inspections (not inclusive)
	 * @return the range of creative inspections
	 */
	public static List<CreativeInspection> getCreativeInspections(
		int start, int end) {

		return getService().getCreativeInspections(start, end);
	}

	public static List<CreativeInspection> getCreativeInspections(
		long creativeApplicationId) {

		return getService().getCreativeInspections(creativeApplicationId);
	}

	public static List<CreativeInspection> getCreativeInspectionsByCaseId(
		String caseId) {

		return getService().getCreativeInspectionsByCaseId(caseId);
	}

	public static List<CreativeInspection>
		getCreativeInspectionsByStatusApplicationId(
			long creativeApplicationId, String status) {

		return getService().getCreativeInspectionsByStatusApplicationId(
			creativeApplicationId, status);
	}

	public static List<CreativeInspection> getCreativeInspectionsByStatusCaseId(
		String caseId, String status) {

		return getService().getCreativeInspectionsByStatusCaseId(
			caseId, status);
	}

	/**
	 * Returns the number of creative inspections.
	 *
	 * @return the number of creative inspections
	 */
	public static int getCreativeInspectionsCount() {
		return getService().getCreativeInspectionsCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	public static CreativeInspection getInspectionByStatus_SlotBoooked(
			String status, long slotBookedByUser, long creativeApplicationId)
		throws com.nbp.creative.stages.services.exception.
			NoSuchCreativeInspectionException {

		return getService().getInspectionByStatus_SlotBoooked(
			status, slotBookedByUser, creativeApplicationId);
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
	 * Updates the creative inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CreativeInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param creativeInspection the creative inspection
	 * @return the creative inspection that was updated
	 */
	public static CreativeInspection updateCreativeInspection(
		CreativeInspection creativeInspection) {

		return getService().updateCreativeInspection(creativeInspection);
	}

	public static CreativeInspection updateCreativeInspection(
		String caseId, java.util.Date dateOfinspection) {

		return getService().updateCreativeInspection(caseId, dateOfinspection);
	}

	public static CreativeInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CreativeInspectionLocalService>
		_serviceSnapshot = new Snapshot<>(
			CreativeInspectionLocalServiceUtil.class,
			CreativeInspectionLocalService.class);

}