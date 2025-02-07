/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolvencyPaymentConfirmation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiInsolvencyPaymentConfirmation. This utility wraps
 * <code>com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolvencyPaymentConfirmationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolvencyPaymentConfirmationLocalService
 * @generated
 */
public class OsiInsolvencyPaymentConfirmationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolvencyPaymentConfirmationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi insolvency payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was added
	 */
	public static OsiInsolvencyPaymentConfirmation
		addOsiInsolvencyPaymentConfirmation(
			OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		return getService().addOsiInsolvencyPaymentConfirmation(
			osiInsolvencyPaymentConfirmation);
	}

	/**
	 * Creates a new osi insolvency payment confirmation with the primary key. Does not add the osi insolvency payment confirmation to the database.
	 *
	 * @param osiIRPaymentId the primary key for the new osi insolvency payment confirmation
	 * @return the new osi insolvency payment confirmation
	 */
	public static OsiInsolvencyPaymentConfirmation
		createOsiInsolvencyPaymentConfirmation(long osiIRPaymentId) {

		return getService().createOsiInsolvencyPaymentConfirmation(
			osiIRPaymentId);
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
	 * Deletes the osi insolvency payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was removed
	 * @throws PortalException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
			deleteOsiInsolvencyPaymentConfirmation(long osiIRPaymentId)
		throws PortalException {

		return getService().deleteOsiInsolvencyPaymentConfirmation(
			osiIRPaymentId);
	}

	/**
	 * Deletes the osi insolvency payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was removed
	 */
	public static OsiInsolvencyPaymentConfirmation
		deleteOsiInsolvencyPaymentConfirmation(
			OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		return getService().deleteOsiInsolvencyPaymentConfirmation(
			osiInsolvencyPaymentConfirmation);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationModelImpl</code>.
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

	public static OsiInsolvencyPaymentConfirmation
		fetchOsiInsolvencyPaymentConfirmation(long osiIRPaymentId) {

		return getService().fetchOsiInsolvencyPaymentConfirmation(
			osiIRPaymentId);
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
	 * Returns the osi insolvency payment confirmation with the primary key.
	 *
	 * @param osiIRPaymentId the primary key of the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation
	 * @throws PortalException if a osi insolvency payment confirmation with the primary key could not be found
	 */
	public static OsiInsolvencyPaymentConfirmation
			getOsiInsolvencyPaymentConfirmation(long osiIRPaymentId)
		throws PortalException {

		return getService().getOsiInsolvencyPaymentConfirmation(osiIRPaymentId);
	}

	/**
	 * Returns a range of all the osi insolvency payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolvencyPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolvency payment confirmations
	 * @param end the upper bound of the range of osi insolvency payment confirmations (not inclusive)
	 * @return the range of osi insolvency payment confirmations
	 */
	public static List<OsiInsolvencyPaymentConfirmation>
		getOsiInsolvencyPaymentConfirmations(int start, int end) {

		return getService().getOsiInsolvencyPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of osi insolvency payment confirmations.
	 *
	 * @return the number of osi insolvency payment confirmations
	 */
	public static int getOsiInsolvencyPaymentConfirmationsCount() {
		return getService().getOsiInsolvencyPaymentConfirmationsCount();
	}

	public static OsiInsolvencyPaymentConfirmation getPaymentConfirmationBy_CI(
			String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolvencyPaymentConfirmationException {

		return getService().getPaymentConfirmationBy_CI(caseId);
	}

	public static List<OsiInsolvencyPaymentConfirmation>
		getPaymentConfirmations_By_CI(String caseId) {

		return getService().getPaymentConfirmations_By_CI(caseId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static OsiInsolvencyPaymentConfirmation
		updateFilmPaymentConfirmation(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountReceived, String receiptNumber, String comment,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updateFilmPaymentConfirmation(
			caseId, dateReceived, amountDue, amountReceived, receiptNumber,
			comment, amountOutstanding, dueDate, status);
	}

	/**
	 * Updates the osi insolvency payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolvencyPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolvencyPaymentConfirmation the osi insolvency payment confirmation
	 * @return the osi insolvency payment confirmation that was updated
	 */
	public static OsiInsolvencyPaymentConfirmation
		updateOsiInsolvencyPaymentConfirmation(
			OsiInsolvencyPaymentConfirmation osiInsolvencyPaymentConfirmation) {

		return getService().updateOsiInsolvencyPaymentConfirmation(
			osiInsolvencyPaymentConfirmation);
	}

	public static OsiInsolvencyPaymentConfirmationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiInsolvencyPaymentConfirmationLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiInsolvencyPaymentConfirmationLocalServiceUtil.class,
			OsiInsolvencyPaymentConfirmationLocalService.class);

}