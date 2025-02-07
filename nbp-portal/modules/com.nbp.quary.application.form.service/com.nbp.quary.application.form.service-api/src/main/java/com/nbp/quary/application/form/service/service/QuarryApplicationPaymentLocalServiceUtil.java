/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quary.application.form.service.model.QuarryApplicationPayment;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QuarryApplicationPayment. This utility wraps
 * <code>com.nbp.quary.application.form.service.service.impl.QuarryApplicationPaymentLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryApplicationPaymentLocalService
 * @generated
 */
public class QuarryApplicationPaymentLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quary.application.form.service.service.impl.QuarryApplicationPaymentLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the quarry application payment to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 * @return the quarry application payment that was added
	 */
	public static QuarryApplicationPayment addQuarryApplicationPayment(
		QuarryApplicationPayment quarryApplicationPayment) {

		return getService().addQuarryApplicationPayment(
			quarryApplicationPayment);
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
	 * Creates a new quarry application payment with the primary key. Does not add the quarry application payment to the database.
	 *
	 * @param quarryApplicationPaymentId the primary key for the new quarry application payment
	 * @return the new quarry application payment
	 */
	public static QuarryApplicationPayment createQuarryApplicationPayment(
		long quarryApplicationPaymentId) {

		return getService().createQuarryApplicationPayment(
			quarryApplicationPaymentId);
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
	 * Deletes the quarry application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment that was removed
	 * @throws PortalException if a quarry application payment with the primary key could not be found
	 */
	public static QuarryApplicationPayment deleteQuarryApplicationPayment(
			long quarryApplicationPaymentId)
		throws PortalException {

		return getService().deleteQuarryApplicationPayment(
			quarryApplicationPaymentId);
	}

	/**
	 * Deletes the quarry application payment from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 * @return the quarry application payment that was removed
	 */
	public static QuarryApplicationPayment deleteQuarryApplicationPayment(
		QuarryApplicationPayment quarryApplicationPayment) {

		return getService().deleteQuarryApplicationPayment(
			quarryApplicationPayment);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentModelImpl</code>.
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

	public static QuarryApplicationPayment fetchQuarryApplicationPayment(
		long quarryApplicationPaymentId) {

		return getService().fetchQuarryApplicationPayment(
			quarryApplicationPaymentId);
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

	public static QuarryApplicationPayment getPaymentBy_Id(long quarryAppId)
		throws com.nbp.quary.application.form.service.exception.
			NoSuchQuarryApplicationPaymentException {

		return getService().getPaymentBy_Id(quarryAppId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the quarry application payment with the primary key.
	 *
	 * @param quarryApplicationPaymentId the primary key of the quarry application payment
	 * @return the quarry application payment
	 * @throws PortalException if a quarry application payment with the primary key could not be found
	 */
	public static QuarryApplicationPayment getQuarryApplicationPayment(
			long quarryApplicationPaymentId)
		throws PortalException {

		return getService().getQuarryApplicationPayment(
			quarryApplicationPaymentId);
	}

	/**
	 * Returns a range of all the quarry application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quary.application.form.service.model.impl.QuarryApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry application payments
	 * @param end the upper bound of the range of quarry application payments (not inclusive)
	 * @return the range of quarry application payments
	 */
	public static List<QuarryApplicationPayment> getQuarryApplicationPayments(
		int start, int end) {

		return getService().getQuarryApplicationPayments(start, end);
	}

	/**
	 * Returns the number of quarry application payments.
	 *
	 * @return the number of quarry application payments
	 */
	public static int getQuarryApplicationPaymentsCount() {
		return getService().getQuarryApplicationPaymentsCount();
	}

	/**
	 * Updates the quarry application payment in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryApplicationPaymentLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryApplicationPayment the quarry application payment
	 * @return the quarry application payment that was updated
	 */
	public static QuarryApplicationPayment updateQuarryApplicationPayment(
		QuarryApplicationPayment quarryApplicationPayment) {

		return getService().updateQuarryApplicationPayment(
			quarryApplicationPayment);
	}

	public static QuarryApplicationPaymentLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QuarryApplicationPaymentLocalService>
		_serviceSnapshot = new Snapshot<>(
			QuarryApplicationPaymentLocalServiceUtil.class,
			QuarryApplicationPaymentLocalService.class);

}