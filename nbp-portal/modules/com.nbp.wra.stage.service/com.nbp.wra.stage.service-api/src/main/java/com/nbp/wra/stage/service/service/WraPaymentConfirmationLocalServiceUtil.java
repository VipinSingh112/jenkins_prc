/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.wra.stage.service.model.WraPaymentConfirmation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for WraPaymentConfirmation. This utility wraps
 * <code>com.nbp.wra.stage.service.service.impl.WraPaymentConfirmationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see WraPaymentConfirmationLocalService
 * @generated
 */
public class WraPaymentConfirmationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.wra.stage.service.service.impl.WraPaymentConfirmationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the wra payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 * @return the wra payment confirmation that was added
	 */
	public static WraPaymentConfirmation addWraPaymentConfirmation(
		WraPaymentConfirmation wraPaymentConfirmation) {

		return getService().addWraPaymentConfirmation(wraPaymentConfirmation);
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
	 * Creates a new wra payment confirmation with the primary key. Does not add the wra payment confirmation to the database.
	 *
	 * @param wraPaymentConfirmationId the primary key for the new wra payment confirmation
	 * @return the new wra payment confirmation
	 */
	public static WraPaymentConfirmation createWraPaymentConfirmation(
		long wraPaymentConfirmationId) {

		return getService().createWraPaymentConfirmation(
			wraPaymentConfirmationId);
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
	 * Deletes the wra payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation that was removed
	 * @throws PortalException if a wra payment confirmation with the primary key could not be found
	 */
	public static WraPaymentConfirmation deleteWraPaymentConfirmation(
			long wraPaymentConfirmationId)
		throws PortalException {

		return getService().deleteWraPaymentConfirmation(
			wraPaymentConfirmationId);
	}

	/**
	 * Deletes the wra payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 * @return the wra payment confirmation that was removed
	 */
	public static WraPaymentConfirmation deleteWraPaymentConfirmation(
		WraPaymentConfirmation wraPaymentConfirmation) {

		return getService().deleteWraPaymentConfirmation(
			wraPaymentConfirmation);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationModelImpl</code>.
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

	public static WraPaymentConfirmation fetchWraPaymentConfirmation(
		long wraPaymentConfirmationId) {

		return getService().fetchWraPaymentConfirmation(
			wraPaymentConfirmationId);
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

	public static List<WraPaymentConfirmation> getWraPayConfBy_CI(
		String caseId) {

		return getService().getWraPayConfBy_CI(caseId);
	}

	public static WraPaymentConfirmation getWraPaymentConfBy_CI(String caseId)
		throws com.nbp.wra.stage.service.exception.
			NoSuchWraPaymentConfirmationException {

		return getService().getWraPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the wra payment confirmation with the primary key.
	 *
	 * @param wraPaymentConfirmationId the primary key of the wra payment confirmation
	 * @return the wra payment confirmation
	 * @throws PortalException if a wra payment confirmation with the primary key could not be found
	 */
	public static WraPaymentConfirmation getWraPaymentConfirmation(
			long wraPaymentConfirmationId)
		throws PortalException {

		return getService().getWraPaymentConfirmation(wraPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the wra payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.wra.stage.service.model.impl.WraPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra payment confirmations
	 * @param end the upper bound of the range of wra payment confirmations (not inclusive)
	 * @return the range of wra payment confirmations
	 */
	public static List<WraPaymentConfirmation> getWraPaymentConfirmations(
		int start, int end) {

		return getService().getWraPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of wra payment confirmations.
	 *
	 * @return the number of wra payment confirmations
	 */
	public static int getWraPaymentConfirmationsCount() {
		return getService().getWraPaymentConfirmationsCount();
	}

	public static WraPaymentConfirmation updateWraPaymentConfirmation(
		String caseId, java.util.Date dateReceived, String amountDue,
		String amountReceived, String receiptNumber, String comment,
		String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updateWraPaymentConfirmation(
			caseId, dateReceived, amountDue, amountReceived, receiptNumber,
			comment, amountOutstanding, dueDate, status);
	}

	/**
	 * Updates the wra payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect WraPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param wraPaymentConfirmation the wra payment confirmation
	 * @return the wra payment confirmation that was updated
	 */
	public static WraPaymentConfirmation updateWraPaymentConfirmation(
		WraPaymentConfirmation wraPaymentConfirmation) {

		return getService().updateWraPaymentConfirmation(
			wraPaymentConfirmation);
	}

	public static WraPaymentConfirmationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<WraPaymentConfirmationLocalService>
		_serviceSnapshot = new Snapshot<>(
			WraPaymentConfirmationLocalServiceUtil.class,
			WraPaymentConfirmationLocalService.class);

}