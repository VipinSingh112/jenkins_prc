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

import com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OsiInsolveDeskVerification. This utility wraps
 * <code>com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolveDeskVerificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolveDeskVerificationLocalService
 * @generated
 */
public class OsiInsolveDeskVerificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.insolvency.stage.services.service.impl.OsiInsolveDeskVerificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi insolve desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was added
	 */
	public static OsiInsolveDeskVerification addOsiInsolveDeskVerification(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return getService().addOsiInsolveDeskVerification(
			osiInsolveDeskVerification);
	}

	/**
	 * Creates a new osi insolve desk verification with the primary key. Does not add the osi insolve desk verification to the database.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key for the new osi insolve desk verification
	 * @return the new osi insolve desk verification
	 */
	public static OsiInsolveDeskVerification createOsiInsolveDeskVerification(
		long OsiInsolveDeskVerificationId) {

		return getService().createOsiInsolveDeskVerification(
			OsiInsolveDeskVerificationId);
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
	 * Deletes the osi insolve desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification that was removed
	 * @throws PortalException if a osi insolve desk verification with the primary key could not be found
	 */
	public static OsiInsolveDeskVerification deleteOsiInsolveDeskVerification(
			long OsiInsolveDeskVerificationId)
		throws PortalException {

		return getService().deleteOsiInsolveDeskVerification(
			OsiInsolveDeskVerificationId);
	}

	/**
	 * Deletes the osi insolve desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was removed
	 */
	public static OsiInsolveDeskVerification deleteOsiInsolveDeskVerification(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return getService().deleteOsiInsolveDeskVerification(
			osiInsolveDeskVerification);
	}

	public static void deleteOsiInsolvencyDeskVerificationId(
		long osiInsolvencyId) {

		getService().deleteOsiInsolvencyDeskVerificationId(osiInsolvencyId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
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

	public static OsiInsolveDeskVerification fetchOsiInsolveDeskVerification(
		long OsiInsolveDeskVerificationId) {

		return getService().fetchOsiInsolveDeskVerification(
			OsiInsolveDeskVerificationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<OsiInsolveDeskVerification>
		getDeskVerificationOsiInsolvencyById(long osiInsolvencyId) {

		return getService().getDeskVerificationOsiInsolvencyById(
			osiInsolvencyId);
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
	 * Returns the osi insolve desk verification with the primary key.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification
	 * @throws PortalException if a osi insolve desk verification with the primary key could not be found
	 */
	public static OsiInsolveDeskVerification getOsiInsolveDeskVerification(
			long OsiInsolveDeskVerificationId)
		throws PortalException {

		return getService().getOsiInsolveDeskVerification(
			OsiInsolveDeskVerificationId);
	}

	/**
	 * Returns a range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.insolvency.stage.services.model.impl.OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @return the range of osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification>
		getOsiInsolveDeskVerifications(int start, int end) {

		return getService().getOsiInsolveDeskVerifications(start, end);
	}

	/**
	 * Returns the number of osi insolve desk verifications.
	 *
	 * @return the number of osi insolve desk verifications
	 */
	public static int getOsiInsolveDeskVerificationsCount() {
		return getService().getOsiInsolveDeskVerificationsCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi insolve desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OsiInsolveDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 * @return the osi insolve desk verification that was updated
	 */
	public static OsiInsolveDeskVerification updateOsiInsolveDeskVerification(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return getService().updateOsiInsolveDeskVerification(
			osiInsolveDeskVerification);
	}

	public static OsiInsolveDeskVerificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OsiInsolveDeskVerificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			OsiInsolveDeskVerificationLocalServiceUtil.class,
			OsiInsolveDeskVerificationLocalService.class);

}