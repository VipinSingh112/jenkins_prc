/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for FireBrigadeCertificate. This utility wraps
 * <code>com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeCertificateLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCertificateLocalService
 * @generated
 */
public class FireBrigadeCertificateLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.fire.brigade.stage.service.service.impl.FireBrigadeCertificateLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the fire brigade certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 * @return the fire brigade certificate that was added
	 */
	public static FireBrigadeCertificate addFireBrigadeCertificate(
		FireBrigadeCertificate fireBrigadeCertificate) {

		return getService().addFireBrigadeCertificate(fireBrigadeCertificate);
	}

	/**
	 * Creates a new fire brigade certificate with the primary key. Does not add the fire brigade certificate to the database.
	 *
	 * @param fireBrigadeCertificateId the primary key for the new fire brigade certificate
	 * @return the new fire brigade certificate
	 */
	public static FireBrigadeCertificate createFireBrigadeCertificate(
		long fireBrigadeCertificateId) {

		return getService().createFireBrigadeCertificate(
			fireBrigadeCertificateId);
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
	 * Deletes the fire brigade certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 * @return the fire brigade certificate that was removed
	 */
	public static FireBrigadeCertificate deleteFireBrigadeCertificate(
		FireBrigadeCertificate fireBrigadeCertificate) {

		return getService().deleteFireBrigadeCertificate(
			fireBrigadeCertificate);
	}

	/**
	 * Deletes the fire brigade certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate that was removed
	 * @throws PortalException if a fire brigade certificate with the primary key could not be found
	 */
	public static FireBrigadeCertificate deleteFireBrigadeCertificate(
			long fireBrigadeCertificateId)
		throws PortalException {

		return getService().deleteFireBrigadeCertificate(
			fireBrigadeCertificateId);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeCertificateModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeCertificateModelImpl</code>.
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

	public static FireBrigadeCertificate fetchFireBrigadeCertificate(
		long fireBrigadeCertificateId) {

		return getService().fetchFireBrigadeCertificate(
			fireBrigadeCertificateId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	/**
	 * Returns the fire brigade certificate with the primary key.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate
	 * @throws PortalException if a fire brigade certificate with the primary key could not be found
	 */
	public static FireBrigadeCertificate getFireBrigadeCertificate(
			long fireBrigadeCertificateId)
		throws PortalException {

		return getService().getFireBrigadeCertificate(fireBrigadeCertificateId);
	}

	public static FireBrigadeCertificate getFireBrigadeCertificateByCaseId(
			String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeCertificateException {

		return getService().getFireBrigadeCertificateByCaseId(caseId);
	}

	/**
	 * Returns a range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @return the range of fire brigade certificates
	 */
	public static List<FireBrigadeCertificate> getFireBrigadeCertificates(
		int start, int end) {

		return getService().getFireBrigadeCertificates(start, end);
	}

	/**
	 * Returns the number of fire brigade certificates.
	 *
	 * @return the number of fire brigade certificates
	 */
	public static int getFireBrigadeCertificatesCount() {
		return getService().getFireBrigadeCertificatesCount();
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

	public static FireBrigadeCertificate
		updateFireBrigadeApplicationCertificate(
			String caseId, String nameOfOwner, String typeOfPremises,
			java.util.Date dateOfIssue, java.util.Date dateOfExpiry,
			String certificateNumber) {

		return getService().updateFireBrigadeApplicationCertificate(
			caseId, nameOfOwner, typeOfPremises, dateOfIssue, dateOfExpiry,
			certificateNumber);
	}

	/**
	 * Updates the fire brigade certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FireBrigadeCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 * @return the fire brigade certificate that was updated
	 */
	public static FireBrigadeCertificate updateFireBrigadeCertificate(
		FireBrigadeCertificate fireBrigadeCertificate) {

		return getService().updateFireBrigadeCertificate(
			fireBrigadeCertificate);
	}

	public static FireBrigadeCertificate updateFireBrigadeCertificate(
		String caseId, String nameOfOwner, String typeOfPremises,
		java.util.Date dateOfIssue, java.util.Date dateOfExpiry) {

		return getService().updateFireBrigadeCertificate(
			caseId, nameOfOwner, typeOfPremises, dateOfIssue, dateOfExpiry);
	}

	public static FireBrigadeCertificateLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<FireBrigadeCertificateLocalService>
		_serviceSnapshot = new Snapshot<>(
			FireBrigadeCertificateLocalServiceUtil.class,
			FireBrigadeCertificateLocalService.class);

}