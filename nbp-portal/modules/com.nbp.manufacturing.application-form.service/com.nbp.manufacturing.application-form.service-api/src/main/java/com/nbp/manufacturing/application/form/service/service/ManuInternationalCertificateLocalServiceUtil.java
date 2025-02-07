/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuInternationalCertificate;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ManuInternationalCertificate. This utility wraps
 * <code>com.nbp.manufacturing.application.form.service.service.impl.ManuInternationalCertificateLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ManuInternationalCertificateLocalService
 * @generated
 */
public class ManuInternationalCertificateLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.manufacturing.application.form.service.service.impl.ManuInternationalCertificateLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the manu international certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInternationalCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 * @return the manu international certificate that was added
	 */
	public static ManuInternationalCertificate addManuInternationalCertificate(
		ManuInternationalCertificate manuInternationalCertificate) {

		return getService().addManuInternationalCertificate(
			manuInternationalCertificate);
	}

	/**
	 * Creates a new manu international certificate with the primary key. Does not add the manu international certificate to the database.
	 *
	 * @param manuInternationalCertificateId the primary key for the new manu international certificate
	 * @return the new manu international certificate
	 */
	public static ManuInternationalCertificate
		createManuInternationalCertificate(
			long manuInternationalCertificateId) {

		return getService().createManuInternationalCertificate(
			manuInternationalCertificateId);
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
	 * Deletes the manu international certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInternationalCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate that was removed
	 * @throws PortalException if a manu international certificate with the primary key could not be found
	 */
	public static ManuInternationalCertificate
			deleteManuInternationalCertificate(
				long manuInternationalCertificateId)
		throws PortalException {

		return getService().deleteManuInternationalCertificate(
			manuInternationalCertificateId);
	}

	/**
	 * Deletes the manu international certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInternationalCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 * @return the manu international certificate that was removed
	 */
	public static ManuInternationalCertificate
		deleteManuInternationalCertificate(
			ManuInternationalCertificate manuInternationalCertificate) {

		return getService().deleteManuInternationalCertificate(
			manuInternationalCertificate);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateModelImpl</code>.
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

	public static ManuInternationalCertificate
		fetchManuInternationalCertificate(long manuInternationalCertificateId) {

		return getService().fetchManuInternationalCertificate(
			manuInternationalCertificateId);
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

	public static List<ManuInternationalCertificate> getMA_IC_MAI(
		long applicationId) {

		return getService().getMA_IC_MAI(applicationId);
	}

	public static ManuInternationalCertificate getManuByAppId(
		long applicationId) {

		return getService().getManuByAppId(applicationId);
	}

	/**
	 * Returns the manu international certificate with the primary key.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate
	 * @throws PortalException if a manu international certificate with the primary key could not be found
	 */
	public static ManuInternationalCertificate getManuInternationalCertificate(
			long manuInternationalCertificateId)
		throws PortalException {

		return getService().getManuInternationalCertificate(
			manuInternationalCertificateId);
	}

	/**
	 * Returns a range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.manufacturing.application.form.service.model.impl.ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @return the range of manu international certificates
	 */
	public static List<ManuInternationalCertificate>
		getManuInternationalCertificates(int start, int end) {

		return getService().getManuInternationalCertificates(start, end);
	}

	/**
	 * Returns the number of manu international certificates.
	 *
	 * @return the number of manu international certificates
	 */
	public static int getManuInternationalCertificatesCount() {
		return getService().getManuInternationalCertificatesCount();
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
	 * Updates the manu international certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ManuInternationalCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 * @return the manu international certificate that was updated
	 */
	public static ManuInternationalCertificate
		updateManuInternationalCertificate(
			ManuInternationalCertificate manuInternationalCertificate) {

		return getService().updateManuInternationalCertificate(
			manuInternationalCertificate);
	}

	public static ManuInternationalCertificateLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<ManuInternationalCertificateLocalService>
		_serviceSnapshot = new Snapshot<>(
			ManuInternationalCertificateLocalServiceUtil.class,
			ManuInternationalCertificateLocalService.class);

}