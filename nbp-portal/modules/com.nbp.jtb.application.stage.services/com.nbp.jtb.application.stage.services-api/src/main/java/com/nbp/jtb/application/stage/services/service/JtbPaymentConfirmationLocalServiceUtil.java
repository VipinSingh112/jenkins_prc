/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JtbPaymentConfirmation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for JtbPaymentConfirmation. This utility wraps
 * <code>com.nbp.jtb.application.stage.services.service.impl.JtbPaymentConfirmationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see JtbPaymentConfirmationLocalService
 * @generated
 */
public class JtbPaymentConfirmationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.jtb.application.stage.services.service.impl.JtbPaymentConfirmationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the jtb payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentConfirmation the jtb payment confirmation
	 * @return the jtb payment confirmation that was added
	 */
	public static JtbPaymentConfirmation addJtbPaymentConfirmation(
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		return getService().addJtbPaymentConfirmation(jtbPaymentConfirmation);
	}

	/**
	 * Creates a new jtb payment confirmation with the primary key. Does not add the jtb payment confirmation to the database.
	 *
	 * @param jtbPaymentConfirmationId the primary key for the new jtb payment confirmation
	 * @return the new jtb payment confirmation
	 */
	public static JtbPaymentConfirmation createJtbPaymentConfirmation(
		long jtbPaymentConfirmationId) {

		return getService().createJtbPaymentConfirmation(
			jtbPaymentConfirmationId);
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
	 * Deletes the jtb payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentConfirmation the jtb payment confirmation
	 * @return the jtb payment confirmation that was removed
	 */
	public static JtbPaymentConfirmation deleteJtbPaymentConfirmation(
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		return getService().deleteJtbPaymentConfirmation(
			jtbPaymentConfirmation);
	}

	/**
	 * Deletes the jtb payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation that was removed
	 * @throws PortalException if a jtb payment confirmation with the primary key could not be found
	 */
	public static JtbPaymentConfirmation deleteJtbPaymentConfirmation(
			long jtbPaymentConfirmationId)
		throws PortalException {

		return getService().deleteJtbPaymentConfirmation(
			jtbPaymentConfirmationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbPaymentConfirmationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbPaymentConfirmationModelImpl</code>.
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

	public static JtbPaymentConfirmation fetchJtbPaymentConfirmation(
		long jtbPaymentConfirmationId) {

		return getService().fetchJtbPaymentConfirmation(
			jtbPaymentConfirmationId);
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

	public static List<JtbPaymentConfirmation> getJtbPayConfBy_CI(
		String caseId) {

		return getService().getJtbPayConfBy_CI(caseId);
	}

	public static JtbPaymentConfirmation getJtbPaymentConfBy_CI(String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbPaymentConfirmationException {

		return getService().getJtbPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the jtb payment confirmation with the primary key.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation
	 * @throws PortalException if a jtb payment confirmation with the primary key could not be found
	 */
	public static JtbPaymentConfirmation getJtbPaymentConfirmation(
			long jtbPaymentConfirmationId)
		throws PortalException {

		return getService().getJtbPaymentConfirmation(jtbPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.jtb.application.stage.services.model.impl.JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @return the range of jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> getJtbPaymentConfirmations(
		int start, int end) {

		return getService().getJtbPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of jtb payment confirmations.
	 *
	 * @return the number of jtb payment confirmations
	 */
	public static int getJtbPaymentConfirmationsCount() {
		return getService().getJtbPaymentConfirmationsCount();
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
	 * Updates the jtb payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect JtbPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param jtbPaymentConfirmation the jtb payment confirmation
	 * @return the jtb payment confirmation that was updated
	 */
	public static JtbPaymentConfirmation updateJtbPaymentConfirmation(
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		return getService().updateJtbPaymentConfirmation(
			jtbPaymentConfirmation);
	}

	public static JtbPaymentConfirmation updateJtbPaymentConfirmation(
		String caseId, java.util.Date dateReceived, String amountDue,
		String amountReceived, String receiptNumber, String comment,
		String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updateJtbPaymentConfirmation(
			caseId, dateReceived, amountDue, amountReceived, receiptNumber,
			comment, amountOutstanding, dueDate, status);
	}

	public static JtbPaymentConfirmationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<JtbPaymentConfirmationLocalService>
		_serviceSnapshot = new Snapshot<>(
			JtbPaymentConfirmationLocalServiceUtil.class,
			JtbPaymentConfirmationLocalService.class);

}