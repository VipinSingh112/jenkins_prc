/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.services.stages.service.model.OSIServicesCertiOfIssuance;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for OSIServicesCertiOfIssuance. This utility wraps
 * <code>com.nbp.osi.services.stages.service.service.impl.OSIServicesCertiOfIssuanceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see OSIServicesCertiOfIssuanceLocalService
 * @generated
 */
public class OSIServicesCertiOfIssuanceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.osi.services.stages.service.service.impl.OSIServicesCertiOfIssuanceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the osi services certi of issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesCertiOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesCertiOfIssuance the osi services certi of issuance
	 * @return the osi services certi of issuance that was added
	 */
	public static OSIServicesCertiOfIssuance addOSIServicesCertiOfIssuance(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		return getService().addOSIServicesCertiOfIssuance(
			osiServicesCertiOfIssuance);
	}

	/**
	 * Creates a new osi services certi of issuance with the primary key. Does not add the osi services certi of issuance to the database.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key for the new osi services certi of issuance
	 * @return the new osi services certi of issuance
	 */
	public static OSIServicesCertiOfIssuance createOSIServicesCertiOfIssuance(
		long oSIServicesCertiOfIssuanceId) {

		return getService().createOSIServicesCertiOfIssuance(
			oSIServicesCertiOfIssuanceId);
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
	 * Deletes the osi services certi of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesCertiOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance that was removed
	 * @throws PortalException if a osi services certi of issuance with the primary key could not be found
	 */
	public static OSIServicesCertiOfIssuance deleteOSIServicesCertiOfIssuance(
			long oSIServicesCertiOfIssuanceId)
		throws PortalException {

		return getService().deleteOSIServicesCertiOfIssuance(
			oSIServicesCertiOfIssuanceId);
	}

	/**
	 * Deletes the osi services certi of issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesCertiOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesCertiOfIssuance the osi services certi of issuance
	 * @return the osi services certi of issuance that was removed
	 */
	public static OSIServicesCertiOfIssuance deleteOSIServicesCertiOfIssuance(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		return getService().deleteOSIServicesCertiOfIssuance(
			osiServicesCertiOfIssuance);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesCertiOfIssuanceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesCertiOfIssuanceModelImpl</code>.
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

	public static OSIServicesCertiOfIssuance fetchOSIServicesCertiOfIssuance(
		long oSIServicesCertiOfIssuanceId) {

		return getService().fetchOSIServicesCertiOfIssuance(
			oSIServicesCertiOfIssuanceId);
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
	 * Returns the osi services certi of issuance with the primary key.
	 *
	 * @param oSIServicesCertiOfIssuanceId the primary key of the osi services certi of issuance
	 * @return the osi services certi of issuance
	 * @throws PortalException if a osi services certi of issuance with the primary key could not be found
	 */
	public static OSIServicesCertiOfIssuance getOSIServicesCertiOfIssuance(
			long oSIServicesCertiOfIssuanceId)
		throws PortalException {

		return getService().getOSIServicesCertiOfIssuance(
			oSIServicesCertiOfIssuanceId);
	}

	public static OSIServicesCertiOfIssuance
			getOSIServicesCertiOfIssuanceByCaseId(String caseId)
		throws com.nbp.osi.services.stages.service.exception.
			NoSuchOSIServicesCertiOfIssuanceException {

		return getService().getOSIServicesCertiOfIssuanceByCaseId(caseId);
	}

	/**
	 * Returns a range of all the osi services certi of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.osi.services.stages.service.model.impl.OSIServicesCertiOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services certi of issuances
	 * @param end the upper bound of the range of osi services certi of issuances (not inclusive)
	 * @return the range of osi services certi of issuances
	 */
	public static List<OSIServicesCertiOfIssuance>
		getOSIServicesCertiOfIssuances(int start, int end) {

		return getService().getOSIServicesCertiOfIssuances(start, end);
	}

	/**
	 * Returns the number of osi services certi of issuances.
	 *
	 * @return the number of osi services certi of issuances
	 */
	public static int getOSIServicesCertiOfIssuancesCount() {
		return getService().getOSIServicesCertiOfIssuancesCount();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the osi services certi of issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect OSIServicesCertiOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param osiServicesCertiOfIssuance the osi services certi of issuance
	 * @return the osi services certi of issuance that was updated
	 */
	public static OSIServicesCertiOfIssuance updateOSIServicesCertiOfIssuance(
		OSIServicesCertiOfIssuance osiServicesCertiOfIssuance) {

		return getService().updateOSIServicesCertiOfIssuance(
			osiServicesCertiOfIssuance);
	}

	public static OSIServicesCertiOfIssuance updateOsiServicesCertiOfIssuance(
		String caseId, String nameOfInsolventPerson,
		java.util.Date dateCertificateIssued, java.util.Date dateOfExpiration,
		String certificateNum, String nameOfLicensedTrustee) {

		return getService().updateOsiServicesCertiOfIssuance(
			caseId, nameOfInsolventPerson, dateCertificateIssued,
			dateOfExpiration, certificateNum, nameOfLicensedTrustee);
	}

	public static OSIServicesCertiOfIssuanceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<OSIServicesCertiOfIssuanceLocalService>
		_serviceSnapshot = new Snapshot<>(
			OSIServicesCertiOfIssuanceLocalServiceUtil.class,
			OSIServicesCertiOfIssuanceLocalService.class);

}