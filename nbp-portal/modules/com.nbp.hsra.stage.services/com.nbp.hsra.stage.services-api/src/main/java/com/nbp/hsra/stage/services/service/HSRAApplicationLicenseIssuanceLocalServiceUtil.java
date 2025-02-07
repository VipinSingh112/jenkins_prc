/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.stage.services.model.HSRAApplicationLicenseIssuance;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for HSRAApplicationLicenseIssuance. This utility wraps
 * <code>com.nbp.hsra.stage.services.service.impl.HSRAApplicationLicenseIssuanceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HSRAApplicationLicenseIssuanceLocalService
 * @generated
 */
public class HSRAApplicationLicenseIssuanceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.hsra.stage.services.service.impl.HSRAApplicationLicenseIssuanceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the hsra application license issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 * @return the hsra application license issuance that was added
	 */
	public static HSRAApplicationLicenseIssuance
		addHSRAApplicationLicenseIssuance(
			HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		return getService().addHSRAApplicationLicenseIssuance(
			hsraApplicationLicenseIssuance);
	}

	/**
	 * Creates a new hsra application license issuance with the primary key. Does not add the hsra application license issuance to the database.
	 *
	 * @param hsraFullLicenseId the primary key for the new hsra application license issuance
	 * @return the new hsra application license issuance
	 */
	public static HSRAApplicationLicenseIssuance
		createHSRAApplicationLicenseIssuance(long hsraFullLicenseId) {

		return getService().createHSRAApplicationLicenseIssuance(
			hsraFullLicenseId);
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
	 * Deletes the hsra application license issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 * @return the hsra application license issuance that was removed
	 */
	public static HSRAApplicationLicenseIssuance
		deleteHSRAApplicationLicenseIssuance(
			HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		return getService().deleteHSRAApplicationLicenseIssuance(
			hsraApplicationLicenseIssuance);
	}

	/**
	 * Deletes the hsra application license issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance that was removed
	 * @throws PortalException if a hsra application license issuance with the primary key could not be found
	 */
	public static HSRAApplicationLicenseIssuance
			deleteHSRAApplicationLicenseIssuance(long hsraFullLicenseId)
		throws PortalException {

		return getService().deleteHSRAApplicationLicenseIssuance(
			hsraFullLicenseId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceModelImpl</code>.
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

	public static HSRAApplicationLicenseIssuance
		fetchHSRAApplicationLicenseIssuance(long hsraFullLicenseId) {

		return getService().fetchHSRAApplicationLicenseIssuance(
			hsraFullLicenseId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the hsra application license issuance with the primary key.
	 *
	 * @param hsraFullLicenseId the primary key of the hsra application license issuance
	 * @return the hsra application license issuance
	 * @throws PortalException if a hsra application license issuance with the primary key could not be found
	 */
	public static HSRAApplicationLicenseIssuance
			getHSRAApplicationLicenseIssuance(long hsraFullLicenseId)
		throws PortalException {

		return getService().getHSRAApplicationLicenseIssuance(
			hsraFullLicenseId);
	}

	public static HSRAApplicationLicenseIssuance
			getHSRAApplicationLicenseIssuanceByCI(String caseId)
		throws com.nbp.hsra.stage.services.exception.
			NoSuchHSRAApplicationLicenseIssuanceException {

		return getService().getHSRAApplicationLicenseIssuanceByCI(caseId);
	}

	/**
	 * Returns a range of all the hsra application license issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.hsra.stage.services.model.impl.HSRAApplicationLicenseIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application license issuances
	 * @param end the upper bound of the range of hsra application license issuances (not inclusive)
	 * @return the range of hsra application license issuances
	 */
	public static List<HSRAApplicationLicenseIssuance>
		getHSRAApplicationLicenseIssuances(int start, int end) {

		return getService().getHSRAApplicationLicenseIssuances(start, end);
	}

	/**
	 * Returns the number of hsra application license issuances.
	 *
	 * @return the number of hsra application license issuances
	 */
	public static int getHSRAApplicationLicenseIssuancesCount() {
		return getService().getHSRAApplicationLicenseIssuancesCount();
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
	 * Updates the hsra application license issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect HSRAApplicationLicenseIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param hsraApplicationLicenseIssuance the hsra application license issuance
	 * @return the hsra application license issuance that was updated
	 */
	public static HSRAApplicationLicenseIssuance
		updateHSRAApplicationLicenseIssuance(
			HSRAApplicationLicenseIssuance hsraApplicationLicenseIssuance) {

		return getService().updateHSRAApplicationLicenseIssuance(
			hsraApplicationLicenseIssuance);
	}

	public static HSRAApplicationLicenseIssuance
		updateHSRAApplicationLicenseIssuance(
			String caseId, String licenseNumber, java.util.Date dateOfIssue,
			java.util.Date expiryDate, String receiptNumber, String status) {

		return getService().updateHSRAApplicationLicenseIssuance(
			caseId, licenseNumber, dateOfIssue, expiryDate, receiptNumber,
			status);
	}

	public static HSRAApplicationLicenseIssuance
		updateHSRAApplicationLicenseIssuance(
			String caseId, String licenseNumber, java.util.Date dateOfIssue,
			String feePaid, String receiptNumber, java.util.Date dueDate,
			String leadTime) {

		return getService().updateHSRAApplicationLicenseIssuance(
			caseId, licenseNumber, dateOfIssue, feePaid, receiptNumber, dueDate,
			leadTime);
	}

	public static HSRAApplicationLicenseIssuanceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<HSRAApplicationLicenseIssuanceLocalService>
		_serviceSnapshot = new Snapshot<>(
			HSRAApplicationLicenseIssuanceLocalServiceUtil.class,
			HSRAApplicationLicenseIssuanceLocalService.class);

}