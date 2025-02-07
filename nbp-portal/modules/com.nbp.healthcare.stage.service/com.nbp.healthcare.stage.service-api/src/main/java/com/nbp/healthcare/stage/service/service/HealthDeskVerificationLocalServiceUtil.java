/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.healthcare.stage.service.model.HealthDeskVerification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HealthDeskVerification. This utility wraps
 * <code>com.nbp.healthcare.stage.service.service.impl.HealthDeskVerificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HealthDeskVerificationLocalService
 * @generated
 */
public class HealthDeskVerificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.healthcare.stage.service.service.impl.HealthDeskVerificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the health desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDeskVerification the health desk verification
	 * @return the health desk verification that was added
	 */
	public static HealthDeskVerification addHealthDeskVerification(
		HealthDeskVerification healthDeskVerification) {

		return getService().addHealthDeskVerification(healthDeskVerification);
	}

	/**
	 * Creates a new health desk verification with the primary key. Does not add the health desk verification to the database.
	 *
	 * @param healthDeskVerificationId the primary key for the new health desk verification
	 * @return the new health desk verification
	 */
	public static HealthDeskVerification createHealthDeskVerification(
		long healthDeskVerificationId) {

		return getService().createHealthDeskVerification(
			healthDeskVerificationId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	public static void deleteHealthCareDV_ById(long healthCareApplicationId) {
		getService().deleteHealthCareDV_ById(healthCareApplicationId);
	}

	/**
	 * Deletes the health desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDeskVerification the health desk verification
	 * @return the health desk verification that was removed
	 */
	public static HealthDeskVerification deleteHealthDeskVerification(
		HealthDeskVerification healthDeskVerification) {

		return getService().deleteHealthDeskVerification(
			healthDeskVerification);
	}

	/**
	 * Deletes the health desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification that was removed
	 * @throws PortalException if a health desk verification with the primary key could not be found
	 */
	public static HealthDeskVerification deleteHealthDeskVerification(
			long healthDeskVerificationId)
		throws PortalException {

		return getService().deleteHealthDeskVerification(
			healthDeskVerificationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationModelImpl</code>.
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

	public static HealthDeskVerification fetchHealthDeskVerification(
		long healthDeskVerificationId) {

		return getService().fetchHealthDeskVerification(
			healthDeskVerificationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the health desk verification with the primary key.
	 *
	 * @param healthDeskVerificationId the primary key of the health desk verification
	 * @return the health desk verification
	 * @throws PortalException if a health desk verification with the primary key could not be found
	 */
	public static HealthDeskVerification getHealthDeskVerification(
			long healthDeskVerificationId)
		throws PortalException {

		return getService().getHealthDeskVerification(healthDeskVerificationId);
	}

	/**
	 * Returns a range of all the health desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.healthcare.stage.service.model.impl.HealthDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health desk verifications
	 * @param end the upper bound of the range of health desk verifications (not inclusive)
	 * @return the range of health desk verifications
	 */
	public static List<HealthDeskVerification> getHealthDeskVerifications(
		int start, int end) {

		return getService().getHealthDeskVerifications(start, end);
	}

	/**
	 * Returns the number of health desk verifications.
	 *
	 * @return the number of health desk verifications
	 */
	public static int getHealthDeskVerificationsCount() {
		return getService().getHealthDeskVerificationsCount();
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

	public static List<HealthDeskVerification> healthCareDeskVerification(
		long healthCareApplicationId) {

		return getService().healthCareDeskVerification(healthCareApplicationId);
	}

	/**
	 * Updates the health desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HealthDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param healthDeskVerification the health desk verification
	 * @return the health desk verification that was updated
	 */
	public static HealthDeskVerification updateHealthDeskVerification(
		HealthDeskVerification healthDeskVerification) {

		return getService().updateHealthDeskVerification(
			healthDeskVerification);
	}

	public static HealthDeskVerificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HealthDeskVerificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			HealthDeskVerificationLocalServiceUtil.class,
			HealthDeskVerificationLocalService.class);

}