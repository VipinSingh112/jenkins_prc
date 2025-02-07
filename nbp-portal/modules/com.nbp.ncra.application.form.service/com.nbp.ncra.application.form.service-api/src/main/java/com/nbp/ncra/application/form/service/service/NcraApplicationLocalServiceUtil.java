/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcraApplication. This utility wraps
 * <code>com.nbp.ncra.application.form.service.service.impl.NcraApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcraApplicationLocalService
 * @generated
 */
public class NcraApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncra.application.form.service.service.impl.NcraApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncra application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplication the ncra application
	 * @return the ncra application that was added
	 */
	public static NcraApplication addNcraApplication(
		NcraApplication ncraApplication) {

		return getService().addNcraApplication(ncraApplication);
	}

	/**
	 * Creates a new ncra application with the primary key. Does not add the ncra application to the database.
	 *
	 * @param ncraApplicationId the primary key for the new ncra application
	 * @return the new ncra application
	 */
	public static NcraApplication createNcraApplication(
		long ncraApplicationId) {

		return getService().createNcraApplication(ncraApplicationId);
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
	 * Deletes the ncra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application that was removed
	 * @throws PortalException if a ncra application with the primary key could not be found
	 */
	public static NcraApplication deleteNcraApplication(long ncraApplicationId)
		throws PortalException {

		return getService().deleteNcraApplication(ncraApplicationId);
	}

	/**
	 * Deletes the ncra application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplication the ncra application
	 * @return the ncra application that was removed
	 */
	public static NcraApplication deleteNcraApplication(
		NcraApplication ncraApplication) {

		return getService().deleteNcraApplication(ncraApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicationModelImpl</code>.
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

	public static NcraApplication fetchNcraApplication(long ncraApplicationId) {
		return getService().fetchNcraApplication(ncraApplicationId);
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
	 * Returns the ncra application with the primary key.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application
	 * @throws PortalException if a ncra application with the primary key could not be found
	 */
	public static NcraApplication getNcraApplication(long ncraApplicationId)
		throws PortalException {

		return getService().getNcraApplication(ncraApplicationId);
	}

	/**
	 * Returns a range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncra.application.form.service.model.impl.NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of ncra applications
	 */
	public static List<NcraApplication> getNcraApplications(
		int start, int end) {

		return getService().getNcraApplications(start, end);
	}

	/**
	 * Returns the number of ncra applications.
	 *
	 * @return the number of ncra applications
	 */
	public static int getNcraApplicationsCount() {
		return getService().getNcraApplicationsCount();
	}

	public static NcraApplication getNcraByAppNum(String applicationNumber)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getService().getNcraByAppNum(applicationNumber);
	}

	public static NcraApplication getNcraByCaseId(String caseId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getService().getNcraByCaseId(caseId);
	}

	public static NcraApplication getNcraByEI_CI(String entityId, String caseId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getService().getNcraByEI_CI(entityId, caseId);
	}

	public static List<NcraApplication> getNcraByEntityId(String entityId) {
		return getService().getNcraByEntityId(entityId);
	}

	public static List<NcraApplication> getNcraByEntityId_Status(
		String entityId, int status) {

		return getService().getNcraByEntityId_Status(entityId, status);
	}

	public static NcraApplication getNcraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraApplicationException {

		return getService().getNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);
	}

	public static List<NcraApplication> getNcraByS_U(int status, long userId) {
		return getService().getNcraByS_U(status, userId);
	}

	public static List<NcraApplication> getNcraByStatus(int status) {
		return getService().getNcraByStatus(status);
	}

	public static List<String> getNCRADistinctCategory() {
		return getService().getNCRADistinctCategory();
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
	 * Updates the ncra application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcraApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncraApplication the ncra application
	 * @return the ncra application that was updated
	 */
	public static NcraApplication updateNcraApplication(
		NcraApplication ncraApplication) {

		return getService().updateNcraApplication(ncraApplication);
	}

	public static NcraApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcraApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcraApplicationLocalServiceUtil.class,
			NcraApplicationLocalService.class);

}