/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.npm.cannabis.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.npm.cannabis.application.stages.services.model.CannabisLicensePayment;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for CannabisLicensePayment. This utility wraps
 * <code>com.npm.cannabis.application.stages.services.service.impl.CannabisLicensePaymentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see CannabisLicensePaymentLocalService
 * @generated
 */
public class CannabisLicensePaymentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.npm.cannabis.application.stages.services.service.impl.CannabisLicensePaymentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the cannabis license payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 * @return the cannabis license payment that was added
	 */
	public static CannabisLicensePayment addCannabisLicensePayment(
		CannabisLicensePayment cannabisLicensePayment) {

		return getService().addCannabisLicensePayment(cannabisLicensePayment);
	}

	/**
	 * Creates a new cannabis license payment with the primary key. Does not add the cannabis license payment to the database.
	 *
	 * @param cannabisLicensePaymentId the primary key for the new cannabis license payment
	 * @return the new cannabis license payment
	 */
	public static CannabisLicensePayment createCannabisLicensePayment(
		long cannabisLicensePaymentId) {

		return getService().createCannabisLicensePayment(
			cannabisLicensePaymentId);
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
	 * Deletes the cannabis license payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 * @return the cannabis license payment that was removed
	 */
	public static CannabisLicensePayment deleteCannabisLicensePayment(
		CannabisLicensePayment cannabisLicensePayment) {

		return getService().deleteCannabisLicensePayment(
			cannabisLicensePayment);
	}

	/**
	 * Deletes the cannabis license payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment that was removed
	 * @throws PortalException if a cannabis license payment with the primary key could not be found
	 */
	public static CannabisLicensePayment deleteCannabisLicensePayment(
			long cannabisLicensePaymentId)
		throws PortalException {

		return getService().deleteCannabisLicensePayment(
			cannabisLicensePaymentId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentModelImpl</code>.
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

	public static CannabisLicensePayment fetchCannabisLicensePayment(
		long cannabisLicensePaymentId) {

		return getService().fetchCannabisLicensePayment(
			cannabisLicensePaymentId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static CannabisLicensePayment getCannabisLicenceByPayment(
			long cannabisApplicationId)
		throws com.npm.cannabis.application.stages.services.exception.
			NoSuchCannabisLicensePaymentException {

		return getService().getCannabisLicenceByPayment(cannabisApplicationId);
	}

	/**
	 * Returns the cannabis license payment with the primary key.
	 *
	 * @param cannabisLicensePaymentId the primary key of the cannabis license payment
	 * @return the cannabis license payment
	 * @throws PortalException if a cannabis license payment with the primary key could not be found
	 */
	public static CannabisLicensePayment getCannabisLicensePayment(
			long cannabisLicensePaymentId)
		throws PortalException {

		return getService().getCannabisLicensePayment(cannabisLicensePaymentId);
	}

	/**
	 * Returns a range of all the cannabis license payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.npm.cannabis.application.stages.services.model.impl.CannabisLicensePaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis license payments
	 * @param end the upper bound of the range of cannabis license payments (not inclusive)
	 * @return the range of cannabis license payments
	 */
	public static List<CannabisLicensePayment> getCannabisLicensePayments(
		int start, int end) {

		return getService().getCannabisLicensePayments(start, end);
	}

	/**
	 * Returns the number of cannabis license payments.
	 *
	 * @return the number of cannabis license payments
	 */
	public static int getCannabisLicensePaymentsCount() {
		return getService().getCannabisLicensePaymentsCount();
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
	 * Updates the cannabis license payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect CannabisLicensePaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param cannabisLicensePayment the cannabis license payment
	 * @return the cannabis license payment that was updated
	 */
	public static CannabisLicensePayment updateCannabisLicensePayment(
		CannabisLicensePayment cannabisLicensePayment) {

		return getService().updateCannabisLicensePayment(
			cannabisLicensePayment);
	}

	public static CannabisLicensePayment updateCannabisLicensePayment(
		String caseId, String bondFeeReceived, String licenseFeeReceived,
		String paymentOption, String paymentStatus) {

		return getService().updateCannabisLicensePayment(
			caseId, bondFeeReceived, licenseFeeReceived, paymentOption,
			paymentStatus);
	}

	public static CannabisLicensePaymentLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<CannabisLicensePaymentLocalService>
		_serviceSnapshot = new Snapshot<>(
			CannabisLicensePaymentLocalServiceUtil.class,
			CannabisLicensePaymentLocalService.class);

}