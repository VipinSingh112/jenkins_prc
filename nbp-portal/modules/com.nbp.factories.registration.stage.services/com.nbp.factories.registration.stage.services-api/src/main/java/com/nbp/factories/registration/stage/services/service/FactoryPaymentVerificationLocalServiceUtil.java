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

import com.nbp.factories.registration.stage.services.model.FactoryPaymentVerification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FactoryPaymentVerification. This utility wraps
 * <code>com.nbp.factories.registration.stage.services.service.impl.FactoryPaymentVerificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FactoryPaymentVerificationLocalService
 * @generated
 */
public class FactoryPaymentVerificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.factories.registration.stage.services.service.impl.FactoryPaymentVerificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the factory payment verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoryPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 * @return the factory payment verification that was added
	 */
	public static FactoryPaymentVerification addFactoryPaymentVerification(
		FactoryPaymentVerification factoryPaymentVerification) {

		return getService().addFactoryPaymentVerification(
			factoryPaymentVerification);
	}

	/**
	 * Creates a new factory payment verification with the primary key. Does not add the factory payment verification to the database.
	 *
	 * @param factoryPaymentVerificationId the primary key for the new factory payment verification
	 * @return the new factory payment verification
	 */
	public static FactoryPaymentVerification createFactoryPaymentVerification(
		long factoryPaymentVerificationId) {

		return getService().createFactoryPaymentVerification(
			factoryPaymentVerificationId);
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
	 * Deletes the factory payment verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoryPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 * @return the factory payment verification that was removed
	 */
	public static FactoryPaymentVerification deleteFactoryPaymentVerification(
		FactoryPaymentVerification factoryPaymentVerification) {

		return getService().deleteFactoryPaymentVerification(
			factoryPaymentVerification);
	}

	/**
	 * Deletes the factory payment verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoryPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification that was removed
	 * @throws PortalException if a factory payment verification with the primary key could not be found
	 */
	public static FactoryPaymentVerification deleteFactoryPaymentVerification(
			long factoryPaymentVerificationId)
		throws PortalException {

		return getService().deleteFactoryPaymentVerification(
			factoryPaymentVerificationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationModelImpl</code>.
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

	public static FactoryPaymentVerification fetchFactoryPaymentVerification(
		long factoryPaymentVerificationId) {

		return getService().fetchFactoryPaymentVerification(
			factoryPaymentVerificationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<FactoryPaymentVerification> getFactoryPayConfBy_CI(
		String caseId) {

		return getService().getFactoryPayConfBy_CI(caseId);
	}

	public static FactoryPaymentVerification getFactoryPaymentConfBy_CI(
			String caseId)
		throws com.nbp.factories.registration.stage.services.exception.
			NoSuchFactoryPaymentVerificationException {

		return getService().getFactoryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the factory payment verification with the primary key.
	 *
	 * @param factoryPaymentVerificationId the primary key of the factory payment verification
	 * @return the factory payment verification
	 * @throws PortalException if a factory payment verification with the primary key could not be found
	 */
	public static FactoryPaymentVerification getFactoryPaymentVerification(
			long factoryPaymentVerificationId)
		throws PortalException {

		return getService().getFactoryPaymentVerification(
			factoryPaymentVerificationId);
	}

	/**
	 * Returns a range of all the factory payment verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.factories.registration.stage.services.model.impl.FactoryPaymentVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factory payment verifications
	 * @param end the upper bound of the range of factory payment verifications (not inclusive)
	 * @return the range of factory payment verifications
	 */
	public static List<FactoryPaymentVerification>
		getFactoryPaymentVerifications(int start, int end) {

		return getService().getFactoryPaymentVerifications(start, end);
	}

	/**
	 * Returns the number of factory payment verifications.
	 *
	 * @return the number of factory payment verifications
	 */
	public static int getFactoryPaymentVerificationsCount() {
		return getService().getFactoryPaymentVerificationsCount();
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
	 * Updates the factory payment verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FactoryPaymentVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param factoryPaymentVerification the factory payment verification
	 * @return the factory payment verification that was updated
	 */
	public static FactoryPaymentVerification updateFactoryPaymentVerification(
		FactoryPaymentVerification factoryPaymentVerification) {

		return getService().updateFactoryPaymentVerification(
			factoryPaymentVerification);
	}

	public static FactoryPaymentVerification updateFactoryPaymentVerification(
		String caseId, java.util.Date dateReceived, String amountDue,
		String amountReceived, String receiptNumber, String comment,
		String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updateFactoryPaymentVerification(
			caseId, dateReceived, amountDue, amountReceived, receiptNumber,
			comment, amountOutstanding, dueDate, status);
	}

	public static FactoryPaymentVerificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FactoryPaymentVerificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			FactoryPaymentVerificationLocalServiceUtil.class,
			FactoryPaymentVerificationLocalService.class);

}