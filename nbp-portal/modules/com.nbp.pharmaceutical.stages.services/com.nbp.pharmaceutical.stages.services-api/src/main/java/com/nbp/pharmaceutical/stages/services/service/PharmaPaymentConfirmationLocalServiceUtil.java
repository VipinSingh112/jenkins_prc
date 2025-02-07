/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.pharmaceutical.stages.services.model.PharmaPaymentConfirmation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for PharmaPaymentConfirmation. This utility wraps
 * <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaPaymentConfirmationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PharmaPaymentConfirmationLocalService
 * @generated
 */
public class PharmaPaymentConfirmationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.pharmaceutical.stages.services.service.impl.PharmaPaymentConfirmationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the pharma payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaPaymentConfirmation the pharma payment confirmation
	 * @return the pharma payment confirmation that was added
	 */
	public static PharmaPaymentConfirmation addPharmaPaymentConfirmation(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		return getService().addPharmaPaymentConfirmation(
			pharmaPaymentConfirmation);
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
	 * Creates a new pharma payment confirmation with the primary key. Does not add the pharma payment confirmation to the database.
	 *
	 * @param pharmaPaymentId the primary key for the new pharma payment confirmation
	 * @return the new pharma payment confirmation
	 */
	public static PharmaPaymentConfirmation createPharmaPaymentConfirmation(
		long pharmaPaymentId) {

		return getService().createPharmaPaymentConfirmation(pharmaPaymentId);
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
	 * Deletes the pharma payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation that was removed
	 * @throws PortalException if a pharma payment confirmation with the primary key could not be found
	 */
	public static PharmaPaymentConfirmation deletePharmaPaymentConfirmation(
			long pharmaPaymentId)
		throws PortalException {

		return getService().deletePharmaPaymentConfirmation(pharmaPaymentId);
	}

	/**
	 * Deletes the pharma payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaPaymentConfirmation the pharma payment confirmation
	 * @return the pharma payment confirmation that was removed
	 */
	public static PharmaPaymentConfirmation deletePharmaPaymentConfirmation(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		return getService().deletePharmaPaymentConfirmation(
			pharmaPaymentConfirmation);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaPaymentConfirmationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaPaymentConfirmationModelImpl</code>.
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

	public static PharmaPaymentConfirmation fetchPharmaPaymentConfirmation(
		long pharmaPaymentId) {

		return getService().fetchPharmaPaymentConfirmation(pharmaPaymentId);
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
	 * Returns the pharma payment confirmation with the primary key.
	 *
	 * @param pharmaPaymentId the primary key of the pharma payment confirmation
	 * @return the pharma payment confirmation
	 * @throws PortalException if a pharma payment confirmation with the primary key could not be found
	 */
	public static PharmaPaymentConfirmation getPharmaPaymentConfirmation(
			long pharmaPaymentId)
		throws PortalException {

		return getService().getPharmaPaymentConfirmation(pharmaPaymentId);
	}

	public static PharmaPaymentConfirmation getPharmaPaymentConfirmationBy_CI(
			String caseId)
		throws com.nbp.pharmaceutical.stages.services.exception.
			NoSuchPharmaPaymentConfirmationException {

		return getService().getPharmaPaymentConfirmationBy_CI(caseId);
	}

	public static List<PharmaPaymentConfirmation>
		getPharmaPaymentConfirmationBy_CId(String caseId) {

		return getService().getPharmaPaymentConfirmationBy_CId(caseId);
	}

	/**
	 * Returns a range of all the pharma payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.pharmaceutical.stages.services.model.impl.PharmaPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma payment confirmations
	 * @param end the upper bound of the range of pharma payment confirmations (not inclusive)
	 * @return the range of pharma payment confirmations
	 */
	public static List<PharmaPaymentConfirmation> getPharmaPaymentConfirmations(
		int start, int end) {

		return getService().getPharmaPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of pharma payment confirmations.
	 *
	 * @return the number of pharma payment confirmations
	 */
	public static int getPharmaPaymentConfirmationsCount() {
		return getService().getPharmaPaymentConfirmationsCount();
	}

	/**
	 * Updates the pharma payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PharmaPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param pharmaPaymentConfirmation the pharma payment confirmation
	 * @return the pharma payment confirmation that was updated
	 */
	public static PharmaPaymentConfirmation updatePharmaPaymentConfirmation(
		PharmaPaymentConfirmation pharmaPaymentConfirmation) {

		return getService().updatePharmaPaymentConfirmation(
			pharmaPaymentConfirmation);
	}

	public static PharmaPaymentConfirmation updatePharmaPaymentConfirmation(
		String caseId, java.util.Date dateReceived, String amountDue,
		String amountreceived, String receiptNumber, String comments) {

		return getService().updatePharmaPaymentConfirmation(
			caseId, dateReceived, amountDue, amountreceived, receiptNumber,
			comments);
	}

	public static PharmaPaymentConfirmation updatePharmaPaymentConfirmationData(
		String caseId, java.util.Date dateReceived, String amountDue,
		String amountreceived, String receiptNumber, String comments,
		String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updatePharmaPaymentConfirmationData(
			caseId, dateReceived, amountDue, amountreceived, receiptNumber,
			comments, amountOutstanding, dueDate, status);
	}

	public static PharmaPaymentConfirmationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<PharmaPaymentConfirmationLocalService>
		_serviceSnapshot = new Snapshot<>(
			PharmaPaymentConfirmationLocalServiceUtil.class,
			PharmaPaymentConfirmationLocalService.class);

}