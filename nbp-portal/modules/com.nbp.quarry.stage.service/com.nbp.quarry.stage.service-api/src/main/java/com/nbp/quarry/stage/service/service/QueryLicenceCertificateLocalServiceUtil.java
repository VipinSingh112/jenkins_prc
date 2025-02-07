/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.service.Snapshot;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QueryLicenceCertificate;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for QueryLicenceCertificate. This utility wraps
 * <code>com.nbp.quarry.stage.service.service.impl.QueryLicenceCertificateLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see QueryLicenceCertificateLocalService
 * @generated
 */
public class QueryLicenceCertificateLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.nbp.quarry.stage.service.service.impl.QueryLicenceCertificateLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the query licence certificate to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 * @return the query licence certificate that was added
	 */
	public static QueryLicenceCertificate addQueryLicenceCertificate(
		QueryLicenceCertificate queryLicenceCertificate) {

		return getService().addQueryLicenceCertificate(queryLicenceCertificate);
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
	 * Creates a new query licence certificate with the primary key. Does not add the query licence certificate to the database.
	 *
	 * @param queryLicenceCertificateId the primary key for the new query licence certificate
	 * @return the new query licence certificate
	 */
	public static QueryLicenceCertificate createQueryLicenceCertificate(
		long queryLicenceCertificateId) {

		return getService().createQueryLicenceCertificate(
			queryLicenceCertificateId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the query licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate that was removed
	 * @throws PortalException if a query licence certificate with the primary key could not be found
	 */
	public static QueryLicenceCertificate deleteQueryLicenceCertificate(
			long queryLicenceCertificateId)
		throws PortalException {

		return getService().deleteQueryLicenceCertificate(
			queryLicenceCertificateId);
	}

	/**
	 * Deletes the query licence certificate from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 * @return the query licence certificate that was removed
	 */
	public static QueryLicenceCertificate deleteQueryLicenceCertificate(
		QueryLicenceCertificate queryLicenceCertificate) {

		return getService().deleteQueryLicenceCertificate(
			queryLicenceCertificate);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateModelImpl</code>.
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

	public static QueryLicenceCertificate fetchQueryLicenceCertificate(
		long queryLicenceCertificateId) {

		return getService().fetchQueryLicenceCertificate(
			queryLicenceCertificateId);
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
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the query licence certificate with the primary key.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate
	 * @throws PortalException if a query licence certificate with the primary key could not be found
	 */
	public static QueryLicenceCertificate getQueryLicenceCertificate(
			long queryLicenceCertificateId)
		throws PortalException {

		return getService().getQueryLicenceCertificate(
			queryLicenceCertificateId);
	}

	public static QueryLicenceCertificate getQueryLicenceCertificateBy_CI(
			String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return getService().getQueryLicenceCertificateBy_CI(caseId);
	}

	/**
	 * Returns a range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.nbp.quarry.stage.service.model.impl.QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @return the range of query licence certificates
	 */
	public static List<QueryLicenceCertificate> getQueryLicenceCertificates(
		int start, int end) {

		return getService().getQueryLicenceCertificates(start, end);
	}

	/**
	 * Returns the number of query licence certificates.
	 *
	 * @return the number of query licence certificates
	 */
	public static int getQueryLicenceCertificatesCount() {
		return getService().getQueryLicenceCertificatesCount();
	}

	/**
	 * Updates the query licence certificate in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect QueryLicenceCertificateLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 * @return the query licence certificate that was updated
	 */
	public static QueryLicenceCertificate updateQueryLicenceCertificate(
		QueryLicenceCertificate queryLicenceCertificate) {

		return getService().updateQueryLicenceCertificate(
			queryLicenceCertificate);
	}

	public static QueryLicenceCertificate updateQueryLicenceCertificate(
		String caseId, String licenceCertificate, String category,
		java.util.Date issueDate, java.util.Date expirationDate,
		String status) {

		return getService().updateQueryLicenceCertificate(
			caseId, licenceCertificate, category, issueDate, expirationDate,
			status);
	}

	public static QueryLicenceCertificateLocalService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<QueryLicenceCertificateLocalService>
		_serviceSnapshot = new Snapshot<>(
			QueryLicenceCertificateLocalServiceUtil.class,
			QueryLicenceCertificateLocalService.class);

}