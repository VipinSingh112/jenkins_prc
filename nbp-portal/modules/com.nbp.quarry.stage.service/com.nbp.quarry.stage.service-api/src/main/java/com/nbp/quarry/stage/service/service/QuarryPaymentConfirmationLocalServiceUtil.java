/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QuarryPaymentConfirmation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QuarryPaymentConfirmation. This utility wraps
 * <code>com.nbp.quarry.stage.service.service.impl.QuarryPaymentConfirmationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QuarryPaymentConfirmationLocalService
 * @generated
 */
public class QuarryPaymentConfirmationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quarry.stage.service.service.impl.QuarryPaymentConfirmationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the quarry payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was added
	 */
	public static QuarryPaymentConfirmation addQuarryPaymentConfirmation(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		return getService().addQuarryPaymentConfirmation(
			quarryPaymentConfirmation);
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
	 * Creates a new quarry payment confirmation with the primary key. Does not add the quarry payment confirmation to the database.
	 *
	 * @param quarryPaymentConfirmationId the primary key for the new quarry payment confirmation
	 * @return the new quarry payment confirmation
	 */
	public static QuarryPaymentConfirmation createQuarryPaymentConfirmation(
		long quarryPaymentConfirmationId) {

		return getService().createQuarryPaymentConfirmation(
			quarryPaymentConfirmationId);
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
	 * Deletes the quarry payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 * @throws PortalException if a quarry payment confirmation with the primary key could not be found
	 */
	public static QuarryPaymentConfirmation deleteQuarryPaymentConfirmation(
			long quarryPaymentConfirmationId)
		throws PortalException {

		return getService().deleteQuarryPaymentConfirmation(
			quarryPaymentConfirmationId);
	}

	/**
	 * Deletes the quarry payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was removed
	 */
	public static QuarryPaymentConfirmation deleteQuarryPaymentConfirmation(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		return getService().deleteQuarryPaymentConfirmation(
			quarryPaymentConfirmation);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
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

	public static QuarryPaymentConfirmation fetchQuarryPaymentConfirmation(
		long quarryPaymentConfirmationId) {

		return getService().fetchQuarryPaymentConfirmation(
			quarryPaymentConfirmationId);
	}

	public static List<QuarryPaymentConfirmation> findBygetQuarryPayConfBy_CI(
		String caseId) {

		return getService().findBygetQuarryPayConfBy_CI(caseId);
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

	public static QuarryPaymentConfirmation getQuarryPaymentConfBy_CI(
			String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQuarryPaymentConfirmationException {

		return getService().getQuarryPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the quarry payment confirmation with the primary key.
	 *
	 * @param quarryPaymentConfirmationId the primary key of the quarry payment confirmation
	 * @return the quarry payment confirmation
	 * @throws PortalException if a quarry payment confirmation with the primary key could not be found
	 */
	public static QuarryPaymentConfirmation getQuarryPaymentConfirmation(
			long quarryPaymentConfirmationId)
		throws PortalException {

		return getService().getQuarryPaymentConfirmation(
			quarryPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the quarry payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QuarryPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry payment confirmations
	 * @param end the upper bound of the range of quarry payment confirmations (not inclusive)
	 * @return the range of quarry payment confirmations
	 */
	public static List<QuarryPaymentConfirmation> getQuarryPaymentConfirmations(
		int start, int end) {

		return getService().getQuarryPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of quarry payment confirmations.
	 *
	 * @return the number of quarry payment confirmations
	 */
	public static int getQuarryPaymentConfirmationsCount() {
		return getService().getQuarryPaymentConfirmationsCount();
	}

	/**
	 * Updates the quarry payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QuarryPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param quarryPaymentConfirmation the quarry payment confirmation
	 * @return the quarry payment confirmation that was updated
	 */
	public static QuarryPaymentConfirmation updateQuarryPaymentConfirmation(
		QuarryPaymentConfirmation quarryPaymentConfirmation) {

		return getService().updateQuarryPaymentConfirmation(
			quarryPaymentConfirmation);
	}

	public static QuarryPaymentConfirmation updateQuarryPaymentConfirmation(
		String caseId, java.util.Date dateReceived, String amountDue,
		String amountReceived, String receiptNumber, String comment,
		String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updateQuarryPaymentConfirmation(
			caseId, dateReceived, amountDue, amountReceived, receiptNumber,
			comment, amountOutstanding, dueDate, status);
	}

	public static QuarryPaymentConfirmationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QuarryPaymentConfirmationLocalService>
		_serviceSnapshot = new Snapshot<>(
			QuarryPaymentConfirmationLocalServiceUtil.class,
			QuarryPaymentConfirmationLocalService.class);

}