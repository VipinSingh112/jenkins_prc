/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.stages.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.stages.service.model.MiicCertificateOfIssuance;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for MiicCertificateOfIssuance. This utility wraps
 * <code>com.nbp.miic.stages.service.service.impl.MiicCertificateOfIssuanceLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MiicCertificateOfIssuanceLocalService
 * @generated
 */
public class MiicCertificateOfIssuanceLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.miic.stages.service.service.impl.MiicCertificateOfIssuanceLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the miic certificate of issuance to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was added
	 */
	public static MiicCertificateOfIssuance addMiicCertificateOfIssuance(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		return getService().addMiicCertificateOfIssuance(
			miicCertificateOfIssuance);
	}

	/**
	 * Creates a new miic certificate of issuance with the primary key. Does not add the miic certificate of issuance to the database.
	 *
	 * @param miicCertificateOfIssuanceId the primary key for the new miic certificate of issuance
	 * @return the new miic certificate of issuance
	 */
	public static MiicCertificateOfIssuance createMiicCertificateOfIssuance(
		long miicCertificateOfIssuanceId) {

		return getService().createMiicCertificateOfIssuance(
			miicCertificateOfIssuanceId);
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
	 * Deletes the miic certificate of issuance with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 * @throws PortalException if a miic certificate of issuance with the primary key could not be found
	 */
	public static MiicCertificateOfIssuance deleteMiicCertificateOfIssuance(
			long miicCertificateOfIssuanceId)
		throws PortalException {

		return getService().deleteMiicCertificateOfIssuance(
			miicCertificateOfIssuanceId);
	}

	/**
	 * Deletes the miic certificate of issuance from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was removed
	 */
	public static MiicCertificateOfIssuance deleteMiicCertificateOfIssuance(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		return getService().deleteMiicCertificateOfIssuance(
			miicCertificateOfIssuance);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
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

	public static MiicCertificateOfIssuance fetchMiicCertificateOfIssuance(
		long miicCertificateOfIssuanceId) {

		return getService().fetchMiicCertificateOfIssuance(
			miicCertificateOfIssuanceId);
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

	public static MiicCertificateOfIssuance getMiic_RD_by_CI(String caseId)
		throws com.nbp.miic.stages.service.exception.
			NoSuchMiicCertificateOfIssuanceException {

		return getService().getMiic_RD_by_CI(caseId);
	}

	/**
	 * Returns the miic certificate of issuance with the primary key.
	 *
	 * @param miicCertificateOfIssuanceId the primary key of the miic certificate of issuance
	 * @return the miic certificate of issuance
	 * @throws PortalException if a miic certificate of issuance with the primary key could not be found
	 */
	public static MiicCertificateOfIssuance getMiicCertificateOfIssuance(
			long miicCertificateOfIssuanceId)
		throws PortalException {

		return getService().getMiicCertificateOfIssuance(
			miicCertificateOfIssuanceId);
	}

	/**
	 * Returns a range of all the miic certificate of issuances.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.miic.stages.service.model.impl.MiicCertificateOfIssuanceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic certificate of issuances
	 * @param end the upper bound of the range of miic certificate of issuances (not inclusive)
	 * @return the range of miic certificate of issuances
	 */
	public static List<MiicCertificateOfIssuance> getMiicCertificateOfIssuances(
		int start, int end) {

		return getService().getMiicCertificateOfIssuances(start, end);
	}

	/**
	 * Returns the number of miic certificate of issuances.
	 *
	 * @return the number of miic certificate of issuances
	 */
	public static int getMiicCertificateOfIssuancesCount() {
		return getService().getMiicCertificateOfIssuancesCount();
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
	 * Updates the miic certificate of issuance in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MiicCertificateOfIssuanceLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param miicCertificateOfIssuance the miic certificate of issuance
	 * @return the miic certificate of issuance that was updated
	 */
	public static MiicCertificateOfIssuance updateMiicCertificateOfIssuance(
		MiicCertificateOfIssuance miicCertificateOfIssuance) {

		return getService().updateMiicCertificateOfIssuance(
			miicCertificateOfIssuance);
	}

	public static MiicCertificateOfIssuance updateMiicCertificateOfIssuance(
		String caseId, String certificateNumber,
		java.util.Date dateCertificateIssued, java.util.Date dateOfExpiration) {

		return getService().updateMiicCertificateOfIssuance(
			caseId, certificateNumber, dateCertificateIssued, dateOfExpiration);
	}

	public static MiicCertificateOfIssuance updateMiicCertificateOfIssuanceData(
		String caseId, String certificateNumber,
		java.util.Date dateCertificateIssued, java.util.Date dateOfExpiration,
		String nameOfLicensedTrustee) {

		return getService().updateMiicCertificateOfIssuanceData(
			caseId, certificateNumber, dateCertificateIssued, dateOfExpiration,
			nameOfLicensedTrustee);
	}

	public static MiicCertificateOfIssuanceLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<MiicCertificateOfIssuanceLocalService>
		_serviceSnapshot = new Snapshot<>(
			MiicCertificateOfIssuanceLocalServiceUtil.class,
			MiicCertificateOfIssuanceLocalService.class);

}