/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.explosives.competency.stages.service.model.ExplosiveReviewAndVerification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ExplosiveReviewAndVerification. This utility wraps
 * <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveReviewAndVerificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ExplosiveReviewAndVerificationLocalService
 * @generated
 */
public class ExplosiveReviewAndVerificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.explosives.competency.stages.service.service.impl.ExplosiveReviewAndVerificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the explosive review and verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveReviewAndVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 * @return the explosive review and verification that was added
	 */
	public static ExplosiveReviewAndVerification
		addExplosiveReviewAndVerification(
			ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return getService().addExplosiveReviewAndVerification(
			explosiveReviewAndVerification);
	}

	/**
	 * Creates a new explosive review and verification with the primary key. Does not add the explosive review and verification to the database.
	 *
	 * @param issuanceId the primary key for the new explosive review and verification
	 * @return the new explosive review and verification
	 */
	public static ExplosiveReviewAndVerification
		createExplosiveReviewAndVerification(long issuanceId) {

		return getService().createExplosiveReviewAndVerification(issuanceId);
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
	 * Deletes the explosive review and verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveReviewAndVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 * @return the explosive review and verification that was removed
	 */
	public static ExplosiveReviewAndVerification
		deleteExplosiveReviewAndVerification(
			ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return getService().deleteExplosiveReviewAndVerification(
			explosiveReviewAndVerification);
	}

	/**
	 * Deletes the explosive review and verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveReviewAndVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification that was removed
	 * @throws PortalException if a explosive review and verification with the primary key could not be found
	 */
	public static ExplosiveReviewAndVerification
			deleteExplosiveReviewAndVerification(long issuanceId)
		throws PortalException {

		return getService().deleteExplosiveReviewAndVerification(issuanceId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationModelImpl</code>.
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

	public static ExplosiveReviewAndVerification
		fetchExplosiveReviewAndVerification(long issuanceId) {

		return getService().fetchExplosiveReviewAndVerification(issuanceId);
	}

	/**
	 * Returns the explosive review and verification matching the UUID and group.
	 *
	 * @param uuid the explosive review and verification's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive review and verification, or <code>null</code> if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification
		fetchExplosiveReviewAndVerificationByUuidAndGroupId(
			String uuid, long groupId) {

		return getService().fetchExplosiveReviewAndVerificationByUuidAndGroupId(
			uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the explosive review and verification with the primary key.
	 *
	 * @param issuanceId the primary key of the explosive review and verification
	 * @return the explosive review and verification
	 * @throws PortalException if a explosive review and verification with the primary key could not be found
	 */
	public static ExplosiveReviewAndVerification
			getExplosiveReviewAndVerification(long issuanceId)
		throws PortalException {

		return getService().getExplosiveReviewAndVerification(issuanceId);
	}

	public static ExplosiveReviewAndVerification
			getExplosiveReviewAndVerificationByCI(String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getService().getExplosiveReviewAndVerificationByCI(caseId);
	}

	/**
	 * Returns the explosive review and verification matching the UUID and group.
	 *
	 * @param uuid the explosive review and verification's UUID
	 * @param groupId the primary key of the group
	 * @return the matching explosive review and verification
	 * @throws PortalException if a matching explosive review and verification could not be found
	 */
	public static ExplosiveReviewAndVerification
			getExplosiveReviewAndVerificationByUuidAndGroupId(
				String uuid, long groupId)
		throws PortalException {

		return getService().getExplosiveReviewAndVerificationByUuidAndGroupId(
			uuid, groupId);
	}

	public static List<ExplosiveReviewAndVerification>
			getExplosiveReviewAndVerificationListByCI(String caseId)
		throws com.nbp.explosives.competency.stages.service.exception.
			NoSuchExplosiveReviewAndVerificationException {

		return getService().getExplosiveReviewAndVerificationListByCI(caseId);
	}

	/**
	 * Returns a range of all the explosive review and verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.explosives.competency.stages.service.model.impl.ExplosiveReviewAndVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @return the range of explosive review and verifications
	 */
	public static List<ExplosiveReviewAndVerification>
		getExplosiveReviewAndVerifications(int start, int end) {

		return getService().getExplosiveReviewAndVerifications(start, end);
	}

	/**
	 * Returns all the explosive review and verifications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive review and verifications
	 * @param companyId the primary key of the company
	 * @return the matching explosive review and verifications, or an empty list if no matches were found
	 */
	public static List<ExplosiveReviewAndVerification>
		getExplosiveReviewAndVerificationsByUuidAndCompanyId(
			String uuid, long companyId) {

		return getService().
			getExplosiveReviewAndVerificationsByUuidAndCompanyId(
				uuid, companyId);
	}

	/**
	 * Returns a range of explosive review and verifications matching the UUID and company.
	 *
	 * @param uuid the UUID of the explosive review and verifications
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of explosive review and verifications
	 * @param end the upper bound of the range of explosive review and verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching explosive review and verifications, or an empty list if no matches were found
	 */
	public static List<ExplosiveReviewAndVerification>
		getExplosiveReviewAndVerificationsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			OrderByComparator<ExplosiveReviewAndVerification>
				orderByComparator) {

		return getService().
			getExplosiveReviewAndVerificationsByUuidAndCompanyId(
				uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of explosive review and verifications.
	 *
	 * @return the number of explosive review and verifications
	 */
	public static int getExplosiveReviewAndVerificationsCount() {
		return getService().getExplosiveReviewAndVerificationsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
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
	 * Updates the explosive review and verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ExplosiveReviewAndVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param explosiveReviewAndVerification the explosive review and verification
	 * @return the explosive review and verification that was updated
	 */
	public static ExplosiveReviewAndVerification
		updateExplosiveReviewAndVerification(
			ExplosiveReviewAndVerification explosiveReviewAndVerification) {

		return getService().updateExplosiveReviewAndVerification(
			explosiveReviewAndVerification);
	}

	public static ExplosiveReviewAndVerification
		updateExplosiveReviewAndVerificationData(
			String caseId, java.util.Date dateReceived, String amountDue,
			String amountreceived, String receiptNumber, String comments,
			String amountOutstanding, java.util.Date dueDate, String status) {

		return getService().updateExplosiveReviewAndVerificationData(
			caseId, dateReceived, amountDue, amountreceived, receiptNumber,
			comments, amountOutstanding, dueDate, status);
	}

	public static ExplosiveReviewAndVerificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ExplosiveReviewAndVerificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			ExplosiveReviewAndVerificationLocalServiceUtil.class,
			ExplosiveReviewAndVerificationLocalService.class);

}