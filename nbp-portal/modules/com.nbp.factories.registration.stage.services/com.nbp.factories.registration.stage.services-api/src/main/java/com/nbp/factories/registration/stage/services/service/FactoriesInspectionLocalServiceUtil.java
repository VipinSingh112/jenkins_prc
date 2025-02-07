/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.factories.registration.stage.services.model.FactoriesInspection;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoriesInspection. This utility wraps
 * <code>com.nbp.factories.registration.stage.services.service.impl.FactoriesInspectionLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoriesInspectionLocalService
 * @generated
 */
public class FactoriesInspectionLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.stage.services.service.impl.FactoriesInspectionLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factories inspection to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesInspection the factories inspection
	 * @return the factories inspection that was added
	 */
	public static FactoriesInspection addFactoriesInspection(
		FactoriesInspection factoriesInspection) {

		return getService().addFactoriesInspection(factoriesInspection);
	}

	/**
	 * Creates a new factories inspection with the primary key. Does not add the factories inspection to the database.
	 *
	 * @param factoriesInspectionId the primary key for the new factories inspection
	 * @return the new factories inspection
	 */
	public static FactoriesInspection createFactoriesInspection(
		long factoriesInspectionId) {

		return getService().createFactoriesInspection(factoriesInspectionId);
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
	 * Deletes the factories inspection from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesInspection the factories inspection
	 * @return the factories inspection that was removed
	 */
	public static FactoriesInspection deleteFactoriesInspection(
		FactoriesInspection factoriesInspection) {

		return getService().deleteFactoriesInspection(factoriesInspection);
	}

	/**
	 * Deletes the factories inspection with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection that was removed
	 * @throws PortalException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection deleteFactoriesInspection(
			long factoriesInspectionId)
		throws PortalException {

		return getService().deleteFactoriesInspection(factoriesInspectionId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionModelImpl</code>.
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

	public static FactoriesInspection fetchFactoriesInspection(
		long factoriesInspectionId) {

		return getService().fetchFactoriesInspection(factoriesInspectionId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the factories inspection with the primary key.
	 *
	 * @param factoriesInspectionId the primary key of the factories inspection
	 * @return the factories inspection
	 * @throws PortalException if a factories inspection with the primary key could not be found
	 */
	public static FactoriesInspection getFactoriesInspection(
			long factoriesInspectionId)
		throws PortalException {

		return getService().getFactoriesInspection(factoriesInspectionId);
	}

	/**
	 * Returns a range of all the factories inspections.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoriesInspectionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories inspections
	 * @param end the upper bound of the range of factories inspections (not inclusive)
	 * @return the range of factories inspections
	 */
	public static List<FactoriesInspection> getFactoriesInspections(
		int start, int end) {

		return getService().getFactoriesInspections(start, end);
	}

	public static List<FactoriesInspection> getFactoriesInspections(
		long factoriesApplicationId) {

		return getService().getFactoriesInspections(factoriesApplicationId);
	}

	public static List<FactoriesInspection> getFactoriesInspectionsByCaseId(
		String caseId) {

		return getService().getFactoriesInspectionsByCaseId(caseId);
	}

	public static List<FactoriesInspection>
		getFactoriesInspectionsByStatusApplicationId(
			long agriApplicationId, String status) {

		return getService().getFactoriesInspectionsByStatusApplicationId(
			agriApplicationId, status);
	}

	public static FactoriesInspection
			getFactoriesInspectionsByStatusApplicationId(
				String status, long slotBookedByUser,
				long factoriesApplicationId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getService().getFactoriesInspectionsByStatusApplicationId(
			status, slotBookedByUser, factoriesApplicationId);
	}

	public static List<FactoriesInspection>
		getFactoriesInspectionsByStatusCaseId(String caseId, String status) {

		return getService().getFactoriesInspectionsByStatusCaseId(
			caseId, status);
	}

	/**
	 * Returns the number of factories inspections.
	 *
	 * @return the number of factories inspections
	 */
	public static int getFactoriesInspectionsCount() {
		return getService().getFactoriesInspectionsCount();
	}

	public static FactoriesInspection getFactoryInspectionBy_CI(String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoriesInspectionException {

		return getService().getFactoryInspectionBy_CI(caseId);
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
	 * Updates the factories inspection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoriesInspectionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoriesInspection the factories inspection
	 * @return the factories inspection that was updated
	 */
	public static FactoriesInspection updateFactoriesInspection(
		FactoriesInspection factoriesInspection) {

		return getService().updateFactoriesInspection(factoriesInspection);
	}

	public static FactoriesInspection updateFactoriesInspection(
		String caseId, java.util.Date dateOfinspection) {

		return getService().updateFactoriesInspection(caseId, dateOfinspection);
	}

	public static FactoriesInspectionLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoriesInspectionLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoriesInspectionLocalServiceUtil.class,
			FactoriesInspectionLocalService.class);

}