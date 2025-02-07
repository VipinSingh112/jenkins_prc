/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ogt.application.form.services.model.OgtApplication;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OgtApplication. This utility wraps
 * <code>com.nbp.ogt.application.form.services.service.impl.OgtApplicationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OgtApplicationLocalService
 * @generated
 */
public class OgtApplicationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ogt.application.form.services.service.impl.OgtApplicationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ogt application to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplication the ogt application
	 * @return the ogt application that was added
	 */
	public static OgtApplication addOgtApplication(
		OgtApplication ogtApplication) {

		return getService().addOgtApplication(ogtApplication);
	}

	/**
	 * Creates a new ogt application with the primary key. Does not add the ogt application to the database.
	 *
	 * @param ogtApplicationId the primary key for the new ogt application
	 * @return the new ogt application
	 */
	public static OgtApplication createOgtApplication(long ogtApplicationId) {
		return getService().createOgtApplication(ogtApplicationId);
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
	 * Deletes the ogt application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application that was removed
	 * @throws PortalException if a ogt application with the primary key could not be found
	 */
	public static OgtApplication deleteOgtApplication(long ogtApplicationId)
		throws PortalException {

		return getService().deleteOgtApplication(ogtApplicationId);
	}

	/**
	 * Deletes the ogt application from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplication the ogt application
	 * @return the ogt application that was removed
	 */
	public static OgtApplication deleteOgtApplication(
		OgtApplication ogtApplication) {

		return getService().deleteOgtApplication(ogtApplication);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtApplicationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtApplicationModelImpl</code>.
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

	public static OgtApplication fetchOgtApplication(long ogtApplicationId) {
		return getService().fetchOgtApplication(ogtApplicationId);
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
	 * Returns the ogt application with the primary key.
	 *
	 * @param ogtApplicationId the primary key of the ogt application
	 * @return the ogt application
	 * @throws PortalException if a ogt application with the primary key could not be found
	 */
	public static OgtApplication getOgtApplication(long ogtApplicationId)
		throws PortalException {

		return getService().getOgtApplication(ogtApplicationId);
	}

	/**
	 * Returns a range of all the ogt applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ogt.application.form.services.model.impl.OgtApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ogt applications
	 * @param end the upper bound of the range of ogt applications (not inclusive)
	 * @return the range of ogt applications
	 */
	public static List<OgtApplication> getOgtApplications(int start, int end) {
		return getService().getOgtApplications(start, end);
	}

	/**
	 * Returns the number of ogt applications.
	 *
	 * @return the number of ogt applications
	 */
	public static int getOgtApplicationsCount() {
		return getService().getOgtApplicationsCount();
	}

	public static OgtApplication getOgtByAppNum(String applicationNumber)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getService().getOgtByAppNum(applicationNumber);
	}

	public static OgtApplication getOgtByCaseId(String caseId)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getService().getOgtByCaseId(caseId);
	}

	public static OgtApplication getOgtByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws com.nbp.ogt.application.form.services.exception.
			NoSuchOgtApplicationException {

		return getService().getOgtByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);
	}

	public static List<OgtApplication> getOgtByS_U(long userId, int status) {
		return getService().getOgtByS_U(userId, status);
	}

	public static List<OgtApplication> getOgtByStatus(int status) {
		return getService().getOgtByStatus(status);
	}

	public static List<String> getOgtDistinctCategories() {
		return getService().getOgtDistinctCategories();
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
	 * Updates the ogt application in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OgtApplicationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ogtApplication the ogt application
	 * @return the ogt application that was updated
	 */
	public static OgtApplication updateOgtApplication(
		OgtApplication ogtApplication) {

		return getService().updateOgtApplication(ogtApplication);
	}

	public static OgtApplicationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OgtApplicationLocalService> _serviceSnapshot =
		new Snapshot<>(
			OgtApplicationLocalServiceUtil.class,
			OgtApplicationLocalService.class);

}