/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.stages.services.model.ManuDeskVerification;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManuDeskVerification. This utility wraps
 * <code>com.nbp.manufacturing.application.stages.services.service.impl.ManuDeskVerificationLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManuDeskVerificationLocalService
 * @generated
 */
public class ManuDeskVerificationLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.stages.services.service.impl.ManuDeskVerificationLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manu desk verification to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuDeskVerification the manu desk verification
	 * @return the manu desk verification that was added
	 */
	public static ManuDeskVerification addManuDeskVerification(
		ManuDeskVerification manuDeskVerification) {

		return getService().addManuDeskVerification(manuDeskVerification);
	}

	/**
	 * Creates a new manu desk verification with the primary key. Does not add the manu desk verification to the database.
	 *
	 * @param manuDeskVerificationId the primary key for the new manu desk verification
	 * @return the new manu desk verification
	 */
	public static ManuDeskVerification createManuDeskVerification(
		long manuDeskVerificationId) {

		return getService().createManuDeskVerification(manuDeskVerificationId);
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
	 * Deletes the manu desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification that was removed
	 * @throws PortalException if a manu desk verification with the primary key could not be found
	 */
	public static ManuDeskVerification deleteManuDeskVerification(
			long manuDeskVerificationId)
		throws PortalException {

		return getService().deleteManuDeskVerification(manuDeskVerificationId);
	}

	/**
	 * Deletes the manu desk verification from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuDeskVerification the manu desk verification
	 * @return the manu desk verification that was removed
	 */
	public static ManuDeskVerification deleteManuDeskVerification(
		ManuDeskVerification manuDeskVerification) {

		return getService().deleteManuDeskVerification(manuDeskVerification);
	}

	public static void deleteManufacturingDV_ById(
		long manufacturingApplicationId) {

		getService().deleteManufacturingDV_ById(manufacturingApplicationId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl</code>.
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

	public static ManuDeskVerification fetchManuDeskVerification(
		long manuDeskVerificationId) {

		return getService().fetchManuDeskVerification(manuDeskVerificationId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<ManuDeskVerification>
		getDeskVerificationManufactuirngById(long manufacturingApplicationId) {

		return getService().getDeskVerificationManufactuirngById(
			manufacturingApplicationId);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the manu desk verification with the primary key.
	 *
	 * @param manuDeskVerificationId the primary key of the manu desk verification
	 * @return the manu desk verification
	 * @throws PortalException if a manu desk verification with the primary key could not be found
	 */
	public static ManuDeskVerification getManuDeskVerification(
			long manuDeskVerificationId)
		throws PortalException {

		return getService().getManuDeskVerification(manuDeskVerificationId);
	}

	public static List<ManuDeskVerification>
		getManuDeskVerificationByStatus_ApplicationId(
			String status, long manufacturingApplicationId) {

		return getService().getManuDeskVerificationByStatus_ApplicationId(
			status, manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu desk verifications
	 * @param end the upper bound of the range of manu desk verifications (not inclusive)
	 * @return the range of manu desk verifications
	 */
	public static List<ManuDeskVerification> getManuDeskVerifications(
		int start, int end) {

		return getService().getManuDeskVerifications(start, end);
	}

	/**
	 * Returns the number of manu desk verifications.
	 *
	 * @return the number of manu desk verifications
	 */
	public static int getManuDeskVerificationsCount() {
		return getService().getManuDeskVerificationsCount();
	}

	public static ManuDeskVerification getManufactuirngById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.stages.services.exception.
			NoSuchManuDeskVerificationException {

		return getService().getManufactuirngById(manufacturingApplicationId);
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
	 * Updates the manu desk verification in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuDeskVerificationLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuDeskVerification the manu desk verification
	 * @return the manu desk verification that was updated
	 */
	public static ManuDeskVerification updateManuDeskVerification(
		ManuDeskVerification manuDeskVerification) {

		return getService().updateManuDeskVerification(manuDeskVerification);
	}

	public static ManuDeskVerificationLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManuDeskVerificationLocalService>
		_serviceSnapshot = new Snapshot<>(
			ManuDeskVerificationLocalServiceUtil.class,
			ManuDeskVerificationLocalService.class);

}