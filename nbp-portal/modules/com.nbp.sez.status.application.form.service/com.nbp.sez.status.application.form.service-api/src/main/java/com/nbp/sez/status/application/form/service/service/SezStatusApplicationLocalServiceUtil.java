/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezStatusApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for SezStatusApplication. This utility wraps
 * <code>com.nbp.sez.status.application.form.service.service.impl.SezStatusApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SezStatusApplicationLocalService
 * @generated
 */
public class SezStatusApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.sez.status.application.form.service.service.impl.SezStatusApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the sez status application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplication the sez status application
	 * @return the sez status application that was added
	 */
	public static SezStatusApplication addSezStatusApplication(
		SezStatusApplication sezStatusApplication) {

		return getService().addSezStatusApplication(sezStatusApplication);
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
	 * Creates a new sez status application with the primary key. Does not add the sez status application to the database.
	 *
	 * @param sezStatusApplicationId the primary key for the new sez status application
	 * @return the new sez status application
	 */
	public static SezStatusApplication createSezStatusApplication(
		long sezStatusApplicationId) {

		return getService().createSezStatusApplication(sezStatusApplicationId);
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
	 * Deletes the sez status application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application that was removed
	 * @throws PortalException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication deleteSezStatusApplication(
			long sezStatusApplicationId)
		throws PortalException {

		return getService().deleteSezStatusApplication(sezStatusApplicationId);
	}

	/**
	 * Deletes the sez status application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplication the sez status application
	 * @return the sez status application that was removed
	 */
	public static SezStatusApplication deleteSezStatusApplication(
		SezStatusApplication sezStatusApplication) {

		return getService().deleteSezStatusApplication(sezStatusApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationModelImpl</code>.
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

	public static SezStatusApplication fetchSezStatusApplication(
		long sezStatusApplicationId) {

		return getService().fetchSezStatusApplication(sezStatusApplicationId);
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

	public static List<SezStatusApplication> getSez_By_App_Status(
			int status, String doYouWantTo)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getService().getSez_By_App_Status(status, doYouWantTo);
	}

	public static SezStatusApplication getSezByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getService().getSezByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	public static List<SezStatusApplication> getSezByS_U(
		int status, long userId) {

		return getService().getSezByS_U(status, userId);
	}

	public static List<SezStatusApplication> getsezByStatus(int status) {
		return getService().getsezByStatus(status);
	}

	public static SezStatusApplication getSezByStatus(int status)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getService().getSezByStatus(status);
	}

	public static List<String> getSezDistinctCategory() {
		return getService().getSezDistinctCategory();
	}

	public static List<SezStatusApplication> getSezStatus_By_EI_Status(
		String entityId, int status) {

		return getService().getSezStatus_By_EI_Status(entityId, status);
	}

	/**
	 * Returns the sez status application with the primary key.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application
	 * @throws PortalException if a sez status application with the primary key could not be found
	 */
	public static SezStatusApplication getSezStatusApplication(
			long sezStatusApplicationId)
		throws PortalException {

		return getService().getSezStatusApplication(sezStatusApplicationId);
	}

	/**
	 * Returns a range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of sez status applications
	 */
	public static List<SezStatusApplication> getSezStatusApplications(
		int start, int end) {

		return getService().getSezStatusApplications(start, end);
	}

	/**
	 * Returns the number of sez status applications.
	 *
	 * @return the number of sez status applications
	 */
	public static int getSezStatusApplicationsCount() {
		return getService().getSezStatusApplicationsCount();
	}

	public static SezStatusApplication getSezStatusBY_CI(String caseId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getService().getSezStatusBY_CI(caseId);
	}

	public static SezStatusApplication getSezStatusBy_EI_CI(
			String entityId, String caseId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getService().getSezStatusBy_EI_CI(entityId, caseId);
	}

	public static List<SezStatusApplication> getSezStatusBy_EntityId(
		String entityId) {

		return getService().getSezStatusBy_EntityId(entityId);
	}

	public static SezStatusApplication getSezStatusByAppNo(
			String applicationNumber)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezStatusApplicationException {

		return getService().getSezStatusByAppNo(applicationNumber);
	}

	/**
	 * Updates the sez status application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SezStatusApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param sezStatusApplication the sez status application
	 * @return the sez status application that was updated
	 */
	public static SezStatusApplication updateSezStatusApplication(
		SezStatusApplication sezStatusApplication) {

		return getService().updateSezStatusApplication(sezStatusApplication);
	}

	public static SezStatusApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<SezStatusApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			SezStatusApplicationLocalServiceUtil.class,
			SezStatusApplicationLocalService.class);

}