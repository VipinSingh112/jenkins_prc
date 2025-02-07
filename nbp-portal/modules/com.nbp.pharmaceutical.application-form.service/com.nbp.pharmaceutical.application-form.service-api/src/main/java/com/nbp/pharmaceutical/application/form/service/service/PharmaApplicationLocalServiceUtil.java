/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.application.form.service.model.PharmaApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PharmaApplication. This utility wraps
 * <code>com.nbp.pharmaceutical.application.form.service.service.impl.PharmaApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaApplicationLocalService
 * @generated
 */
public class PharmaApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.pharmaceutical.application.form.service.service.impl.PharmaApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the pharma application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplication the pharma application
	 * @return the pharma application that was added
	 */
	public static PharmaApplication addPharmaApplication(
		PharmaApplication pharmaApplication) {

		return getService().addPharmaApplication(pharmaApplication);
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
	 * Creates a new pharma application with the primary key. Does not add the pharma application to the database.
	 *
	 * @param pharmaApplicationId the primary key for the new pharma application
	 * @return the new pharma application
	 */
	public static PharmaApplication createPharmaApplication(
		long pharmaApplicationId) {

		return getService().createPharmaApplication(pharmaApplicationId);
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
	 * Deletes the pharma application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application that was removed
	 * @throws PortalException if a pharma application with the primary key could not be found
	 */
	public static PharmaApplication deletePharmaApplication(
			long pharmaApplicationId)
		throws PortalException {

		return getService().deletePharmaApplication(pharmaApplicationId);
	}

	/**
	 * Deletes the pharma application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplication the pharma application
	 * @return the pharma application that was removed
	 */
	public static PharmaApplication deletePharmaApplication(
		PharmaApplication pharmaApplication) {

		return getService().deletePharmaApplication(pharmaApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationModelImpl</code>.
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

	public static PharmaApplication fetchPharmaApplication(
		long pharmaApplicationId) {

		return getService().fetchPharmaApplication(pharmaApplicationId);
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

	/**
	 * Returns the pharma application with the primary key.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application
	 * @throws PortalException if a pharma application with the primary key could not be found
	 */
	public static PharmaApplication getPharmaApplication(
			long pharmaApplicationId)
		throws PortalException {

		return getService().getPharmaApplication(pharmaApplicationId);
	}

	/**
	 * Returns a range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of pharma applications
	 */
	public static List<PharmaApplication> getPharmaApplications(
		int start, int end) {

		return getService().getPharmaApplications(start, end);
	}

	/**
	 * Returns the number of pharma applications.
	 *
	 * @return the number of pharma applications
	 */
	public static int getPharmaApplicationsCount() {
		return getService().getPharmaApplicationsCount();
	}

	public static PharmaApplication getPharmaByAppNum(String applicationNumber)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getService().getPharmaByAppNum(applicationNumber);
	}

	public static PharmaApplication getPharmaByAT_AppNo(
			String applicationType, String appNumber)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getService().getPharmaByAT_AppNo(applicationType, appNumber);
	}

	public static PharmaApplication getPharmaByCaseId(String caseId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getService().getPharmaByCaseId(caseId);
	}

	public static List<PharmaApplication> getPharmaByS_U(
			int status, long userId)
		throws com.nbp.pharmaceutical.application.form.service.exception.
			NoSuchPharmaApplicationException {

		return getService().getPharmaByS_U(status, userId);
	}

	public static List<PharmaApplication> getPharmaByStatus(int status) {
		return getService().getPharmaByStatus(status);
	}

	public static List<String> getPharmaDistinctStages() {
		return getService().getPharmaDistinctStages();
	}

	/**
	 * Updates the pharma application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaApplication the pharma application
	 * @return the pharma application that was updated
	 */
	public static PharmaApplication updatePharmaApplication(
		PharmaApplication pharmaApplication) {

		return getService().updatePharmaApplication(pharmaApplication);
	}

	public static PharmaApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PharmaApplicationLocalService>
		_serviceSnapshot = new Snapshot<>(
			PharmaApplicationLocalServiceUtil.class,
			PharmaApplicationLocalService.class);

}