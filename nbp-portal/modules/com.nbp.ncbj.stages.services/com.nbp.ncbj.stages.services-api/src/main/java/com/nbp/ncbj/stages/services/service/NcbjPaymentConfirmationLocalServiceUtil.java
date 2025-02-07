/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjPaymentConfirmation. This utility wraps
 * <code>com.nbp.ncbj.stages.services.service.impl.NcbjPaymentConfirmationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPaymentConfirmationLocalService
 * @generated
 */
public class NcbjPaymentConfirmationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.stages.services.service.impl.NcbjPaymentConfirmationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was added
	 */
	public static NcbjPaymentConfirmation addNcbjPaymentConfirmation(
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		return getService().addNcbjPaymentConfirmation(ncbjPaymentConfirmation);
	}

	/**
	 * Creates a new ncbj payment confirmation with the primary key. Does not add the ncbj payment confirmation to the database.
	 *
	 * @param ncbjPaymentConfirmationId the primary key for the new ncbj payment confirmation
	 * @return the new ncbj payment confirmation
	 */
	public static NcbjPaymentConfirmation createNcbjPaymentConfirmation(
		long ncbjPaymentConfirmationId) {

		return getService().createNcbjPaymentConfirmation(
			ncbjPaymentConfirmationId);
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
	 * Deletes the ncbj payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was removed
	 * @throws PortalException if a ncbj payment confirmation with the primary key could not be found
	 */
	public static NcbjPaymentConfirmation deleteNcbjPaymentConfirmation(
			long ncbjPaymentConfirmationId)
		throws PortalException {

		return getService().deleteNcbjPaymentConfirmation(
			ncbjPaymentConfirmationId);
	}

	/**
	 * Deletes the ncbj payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was removed
	 */
	public static NcbjPaymentConfirmation deleteNcbjPaymentConfirmation(
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		return getService().deleteNcbjPaymentConfirmation(
			ncbjPaymentConfirmation);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationModelImpl</code>.
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

	public static NcbjPaymentConfirmation fetchNcbjPaymentConfirmation(
		long ncbjPaymentConfirmationId) {

		return getService().fetchNcbjPaymentConfirmation(
			ncbjPaymentConfirmationId);
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

	public static List<NcbjPaymentConfirmation> getNcbjPayConfBy_CI(
		String caseId) {

		return getService().getNcbjPayConfBy_CI(caseId);
	}

	public static NcbjPaymentConfirmation getNcbjPaymentConfBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return getService().getNcbjPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the ncbj payment confirmation with the primary key.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation
	 * @throws PortalException if a ncbj payment confirmation with the primary key could not be found
	 */
	public static NcbjPaymentConfirmation getNcbjPaymentConfirmation(
			long ncbjPaymentConfirmationId)
		throws PortalException {

		return getService().getNcbjPaymentConfirmation(
			ncbjPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @return the range of ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> getNcbjPaymentConfirmations(
		int start, int end) {

		return getService().getNcbjPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of ncbj payment confirmations.
	 *
	 * @return the number of ncbj payment confirmations
	 */
	public static int getNcbjPaymentConfirmationsCount() {
		return getService().getNcbjPaymentConfirmationsCount();
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
	 * Updates the ncbj payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was updated
	 */
	public static NcbjPaymentConfirmation updateNcbjPaymentConfirmation(
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		return getService().updateNcbjPaymentConfirmation(
			ncbjPaymentConfirmation);
	}

	public static NcbjPaymentConfirmation updateNcbjPaymentConfirmation(
		String caseId, java.util.Date dateReceived, String amountDue,
		String amountReceived, String receiptNumber, String comment,
		String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updateNcbjPaymentConfirmation(
			caseId, dateReceived, amountDue, amountReceived, receiptNumber,
			comment, amountOutstanding, dueDate, status);
	}

	public static NcbjPaymentConfirmationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjPaymentConfirmationLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjPaymentConfirmationLocalServiceUtil.class,
			NcbjPaymentConfirmationLocalService.class);

}