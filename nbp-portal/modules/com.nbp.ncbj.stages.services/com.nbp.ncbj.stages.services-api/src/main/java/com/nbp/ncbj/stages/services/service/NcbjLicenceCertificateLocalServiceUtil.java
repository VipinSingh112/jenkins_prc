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

import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for NcbjLicenceCertificate. This utility wraps
 * <code>com.nbp.ncbj.stages.services.service.impl.NcbjLicenceCertificateLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificateLocalService
 * @generated
 */
public class NcbjLicenceCertificateLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.ncbj.stages.services.service.impl.NcbjLicenceCertificateLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the ncbj licence certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was added
	 */
	public static NcbjLicenceCertificate addNcbjLicenceCertificate(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		return getService().addNcbjLicenceCertificate(ncbjLicenceCertificate);
	}

	/**
	 * Creates a new ncbj licence certificate with the primary key. Does not add the ncbj licence certificate to the database.
	 *
	 * @param ncbjLicenceCertificateId the primary key for the new ncbj licence certificate
	 * @return the new ncbj licence certificate
	 */
	public static NcbjLicenceCertificate createNcbjLicenceCertificate(
		long ncbjLicenceCertificateId) {

		return getService().createNcbjLicenceCertificate(
			ncbjLicenceCertificateId);
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
	 * Deletes the ncbj licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 * @throws PortalException if a ncbj licence certificate with the primary key could not be found
	 */
	public static NcbjLicenceCertificate deleteNcbjLicenceCertificate(
			long ncbjLicenceCertificateId)
		throws PortalException {

		return getService().deleteNcbjLicenceCertificate(
			ncbjLicenceCertificateId);
	}

	/**
	 * Deletes the ncbj licence certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 */
	public static NcbjLicenceCertificate deleteNcbjLicenceCertificate(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		return getService().deleteNcbjLicenceCertificate(
			ncbjLicenceCertificate);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
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

	public static NcbjLicenceCertificate fetchNcbjLicenceCertificate(
		long ncbjLicenceCertificateId) {

		return getService().fetchNcbjLicenceCertificate(
			ncbjLicenceCertificateId);
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

	public static NcbjLicenceCertificate getNcbjLicenceCertiBy_CI(String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return getService().getNcbjLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns the ncbj licence certificate with the primary key.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate
	 * @throws PortalException if a ncbj licence certificate with the primary key could not be found
	 */
	public static NcbjLicenceCertificate getNcbjLicenceCertificate(
			long ncbjLicenceCertificateId)
		throws PortalException {

		return getService().getNcbjLicenceCertificate(ncbjLicenceCertificateId);
	}

	/**
	 * Returns a range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> getNcbjLicenceCertificates(
		int start, int end) {

		return getService().getNcbjLicenceCertificates(start, end);
	}

	/**
	 * Returns the number of ncbj licence certificates.
	 *
	 * @return the number of ncbj licence certificates
	 */
	public static int getNcbjLicenceCertificatesCount() {
		return getService().getNcbjLicenceCertificatesCount();
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
	 * Updates the ncbj licence certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect NcbjLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 * @return the ncbj licence certificate that was updated
	 */
	public static NcbjLicenceCertificate updateNcbjLicenceCertificate(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		return getService().updateNcbjLicenceCertificate(
			ncbjLicenceCertificate);
	}

	public static NcbjLicenceCertificate updateNcbjLicenceCertificate(
		String caseId, String licenceCertificate, String nameOfAppli,
		String nameOfCerti, String scopeOfCerti, java.util.Date issueDate,
		java.util.Date expirationDate, String status) {

		return getService().updateNcbjLicenceCertificate(
			caseId, licenceCertificate, nameOfAppli, nameOfCerti, scopeOfCerti,
			issueDate, expirationDate, status);
	}

	public static NcbjLicenceCertificateLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<NcbjLicenceCertificateLocalService>
		_serviceSnapshot = new Snapshot<>(
			NcbjLicenceCertificateLocalServiceUtil.class,
			NcbjLicenceCertificateLocalService.class);

}