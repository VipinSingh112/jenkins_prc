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

import com.nbp.osi.insolvency.stage.services.model.OsiInsolDataVerification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiInsolDataVerification. This utility wraps
 * <code>com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolDataVerificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolDataVerificationLocalService
 * @generated
 */
public class OsiInsolDataVerificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolDataVerificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi insol data verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was added
	 */
	public static OsiInsolDataVerification addOsiInsolDataVerification(
		OsiInsolDataVerification osiInsolDataVerification) {

		return getService().addOsiInsolDataVerification(
			osiInsolDataVerification);
	}

	/**
	 * Creates a new osi insol data verification with the primary key. Does not add the osi insol data verification to the database.
	 *
	 * @param osiInsolDataVerificationId the primary key for the new osi insol data verification
	 * @return the new osi insol data verification
	 */
	public static OsiInsolDataVerification createOsiInsolDataVerification(
		long osiInsolDataVerificationId) {

		return getService().createOsiInsolDataVerification(
			osiInsolDataVerificationId);
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
	 * Deletes the osi insol data verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification that was removed
	 * @throws PortalException if a osi insol data verification with the primary key could not be found
	 */
	public static OsiInsolDataVerification deleteOsiInsolDataVerification(
			long osiInsolDataVerificationId)
		throws PortalException {

		return getService().deleteOsiInsolDataVerification(
			osiInsolDataVerificationId);
	}

	/**
	 * Deletes the osi insol data verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was removed
	 */
	public static OsiInsolDataVerification deleteOsiInsolDataVerification(
		OsiInsolDataVerification osiInsolDataVerification) {

		return getService().deleteOsiInsolDataVerification(
			osiInsolDataVerification);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
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

	public static OsiInsolDataVerification fetchOsiInsolDataVerification(
		long osiInsolDataVerificationId) {

		return getService().fetchOsiInsolDataVerification(
			osiInsolDataVerificationId);
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
	 * Returns the osi insol data verification with the primary key.
	 *
	 * @param osiInsolDataVerificationId the primary key of the osi insol data verification
	 * @return the osi insol data verification
	 * @throws PortalException if a osi insol data verification with the primary key could not be found
	 */
	public static OsiInsolDataVerification getOsiInsolDataVerification(
			long osiInsolDataVerificationId)
		throws PortalException {

		return getService().getOsiInsolDataVerification(
			osiInsolDataVerificationId);
	}

	/**
	 * Returns a range of all the osi insol data verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolDataVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insol data verifications
	 * @param end the upper bound of the range of osi insol data verifications (not inclusive)
	 * @return the range of osi insol data verifications
	 */
	public static List<OsiInsolDataVerification> getOsiInsolDataVerifications(
		int start, int end) {

		return getService().getOsiInsolDataVerifications(start, end);
	}

	/**
	 * Returns the number of osi insol data verifications.
	 *
	 * @return the number of osi insol data verifications
	 */
	public static int getOsiInsolDataVerificationsCount() {
		return getService().getOsiInsolDataVerificationsCount();
	}

	public static OsiInsolDataVerification getOSIIRIssuanceOfReportBy_CI(
			String caseId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolDataVerificationException {

		return getService().getOSIIRIssuanceOfReportBy_CI(caseId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	public static OsiInsolDataVerification updateDataVerification(
		String caseId, String status) {

		return getService().updateDataVerification(caseId, status);
	}

	/**
	 * Updates the osi insol data verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolDataVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolDataVerification the osi insol data verification
	 * @return the osi insol data verification that was updated
	 */
	public static OsiInsolDataVerification updateOsiInsolDataVerification(
		OsiInsolDataVerification osiInsolDataVerification) {

		return getService().updateOsiInsolDataVerification(
			osiInsolDataVerification);
	}

	public static OsiInsolDataVerificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiInsolDataVerificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiInsolDataVerificationLocalServiceUtil.class,
			OsiInsolDataVerificationLocalService.class);

}