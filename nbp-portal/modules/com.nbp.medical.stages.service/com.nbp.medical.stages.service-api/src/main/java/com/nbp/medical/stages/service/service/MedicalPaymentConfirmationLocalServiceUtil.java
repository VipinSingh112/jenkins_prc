/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.medical.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.medical.stages.service.model.MedicalPaymentConfirmation;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MedicalPaymentConfirmation. This utility wraps
 * <code>com.nbp.medical.stages.service.service.impl.MedicalPaymentConfirmationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPaymentConfirmationLocalService
 * @generated
 */
public class MedicalPaymentConfirmationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.medical.stages.service.service.impl.MedicalPaymentConfirmationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the medical payment confirmation to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was added
	 */
	public static MedicalPaymentConfirmation addMedicalPaymentConfirmation(
		MedicalPaymentConfirmation medicalPaymentConfirmation) {

		return getService().addMedicalPaymentConfirmation(
			medicalPaymentConfirmation);
	}

	/**
	 * Creates a new medical payment confirmation with the primary key. Does not add the medical payment confirmation to the database.
	 *
	 * @param medicalPaymentConfirmationId the primary key for the new medical payment confirmation
	 * @return the new medical payment confirmation
	 */
	public static MedicalPaymentConfirmation createMedicalPaymentConfirmation(
		long medicalPaymentConfirmationId) {

		return getService().createMedicalPaymentConfirmation(
			medicalPaymentConfirmationId);
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
	 * Deletes the medical payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 * @throws PortalException if a medical payment confirmation with the primary key could not be found
	 */
	public static MedicalPaymentConfirmation deleteMedicalPaymentConfirmation(
			long medicalPaymentConfirmationId)
		throws PortalException {

		return getService().deleteMedicalPaymentConfirmation(
			medicalPaymentConfirmationId);
	}

	/**
	 * Deletes the medical payment confirmation from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was removed
	 */
	public static MedicalPaymentConfirmation deleteMedicalPaymentConfirmation(
		MedicalPaymentConfirmation medicalPaymentConfirmation) {

		return getService().deleteMedicalPaymentConfirmation(
			medicalPaymentConfirmation);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
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

	public static MedicalPaymentConfirmation fetchMedicalPaymentConfirmation(
		long medicalPaymentConfirmationId) {

		return getService().fetchMedicalPaymentConfirmation(
			medicalPaymentConfirmationId);
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

	public static List<MedicalPaymentConfirmation> getMedicalPayConfBy_CI(
		String caseId) {

		return getService().getMedicalPayConfBy_CI(caseId);
	}

	public static MedicalPaymentConfirmation getMedicalPaymentConfBy_CI(
			String caseId)
		throws com.nbp.medical.stages.service.exception.
			NoSuchMedicalPaymentConfirmationException {

		return getService().getMedicalPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the medical payment confirmation with the primary key.
	 *
	 * @param medicalPaymentConfirmationId the primary key of the medical payment confirmation
	 * @return the medical payment confirmation
	 * @throws PortalException if a medical payment confirmation with the primary key could not be found
	 */
	public static MedicalPaymentConfirmation getMedicalPaymentConfirmation(
			long medicalPaymentConfirmationId)
		throws PortalException {

		return getService().getMedicalPaymentConfirmation(
			medicalPaymentConfirmationId);
	}

	/**
	 * Returns a range of all the medical payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.medical.stages.service.model.impl.MedicalPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical payment confirmations
	 * @param end the upper bound of the range of medical payment confirmations (not inclusive)
	 * @return the range of medical payment confirmations
	 */
	public static List<MedicalPaymentConfirmation>
		getMedicalPaymentConfirmations(int start, int end) {

		return getService().getMedicalPaymentConfirmations(start, end);
	}

	/**
	 * Returns the number of medical payment confirmations.
	 *
	 * @return the number of medical payment confirmations
	 */
	public static int getMedicalPaymentConfirmationsCount() {
		return getService().getMedicalPaymentConfirmationsCount();
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
	 * Updates the medical payment confirmation in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MedicalPaymentConfirmationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param medicalPaymentConfirmation the medical payment confirmation
	 * @return the medical payment confirmation that was updated
	 */
	public static MedicalPaymentConfirmation updateMedicalPaymentConfirmation(
		MedicalPaymentConfirmation medicalPaymentConfirmation) {

		return getService().updateMedicalPaymentConfirmation(
			medicalPaymentConfirmation);
	}

	public static MedicalPaymentConfirmation updateMedicalPaymentConfirmation(
		String caseId, java.util.Date dateReceived, String amountDue,
		String amountReceived, String receiptNumber, String comment,
		String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updateMedicalPaymentConfirmation(
			caseId, dateReceived, amountDue, amountReceived, receiptNumber,
			comment, amountOutstanding, dueDate, status);
	}

	public static MedicalPaymentConfirmationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MedicalPaymentConfirmationLocalService>
		_serviceSnapshot = new Snapshot<>(
			MedicalPaymentConfirmationLocalServiceUtil.class,
			MedicalPaymentConfirmationLocalService.class);

}