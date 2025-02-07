/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quarry.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.quarry.stage.service.model.QueryLicenceCertificate;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the query licence certificate service. This utility wraps <code>com.nbp.quarry.stage.service.service.persistence.impl.QueryLicenceCertificatePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QueryLicenceCertificatePersistence
 * @generated
 */
public class QueryLicenceCertificateUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(
		QueryLicenceCertificate queryLicenceCertificate) {

		getPersistence().clearCache(queryLicenceCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, QueryLicenceCertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<QueryLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<QueryLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<QueryLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static QueryLicenceCertificate update(
		QueryLicenceCertificate queryLicenceCertificate) {

		return getPersistence().update(queryLicenceCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static QueryLicenceCertificate update(
		QueryLicenceCertificate queryLicenceCertificate,
		ServiceContext serviceContext) {

		return getPersistence().update(queryLicenceCertificate, serviceContext);
	}

	/**
	 * Returns the query licence certificate where caseId = &#63; or throws a <code>NoSuchQueryLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	public static QueryLicenceCertificate findBygetQueryLicenceCertificateBy_CI(
			String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return getPersistence().findBygetQueryLicenceCertificateBy_CI(caseId);
	}

	/**
	 * Returns the query licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	public static QueryLicenceCertificate
		fetchBygetQueryLicenceCertificateBy_CI(String caseId) {

		return getPersistence().fetchBygetQueryLicenceCertificateBy_CI(caseId);
	}

	/**
	 * Returns the query licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	public static QueryLicenceCertificate
		fetchBygetQueryLicenceCertificateBy_CI(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetQueryLicenceCertificateBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the query licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the query licence certificate that was removed
	 */
	public static QueryLicenceCertificate
			removeBygetQueryLicenceCertificateBy_CI(String caseId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return getPersistence().removeBygetQueryLicenceCertificateBy_CI(caseId);
	}

	/**
	 * Returns the number of query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching query licence certificates
	 */
	public static int countBygetQueryLicenceCertificateBy_CI(String caseId) {
		return getPersistence().countBygetQueryLicenceCertificateBy_CI(caseId);
	}

	/**
	 * Returns all the query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching query licence certificates
	 */
	public static List<QueryLicenceCertificate>
		findBygetQueryLicenceCertificatBy_CI(String caseId) {

		return getPersistence().findBygetQueryLicenceCertificatBy_CI(caseId);
	}

	/**
	 * Returns a range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @return the range of matching query licence certificates
	 */
	public static List<QueryLicenceCertificate>
		findBygetQueryLicenceCertificatBy_CI(
			String caseId, int start, int end) {

		return getPersistence().findBygetQueryLicenceCertificatBy_CI(
			caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching query licence certificates
	 */
	public static List<QueryLicenceCertificate>
		findBygetQueryLicenceCertificatBy_CI(
			String caseId, int start, int end,
			OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		return getPersistence().findBygetQueryLicenceCertificatBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching query licence certificates
	 */
	public static List<QueryLicenceCertificate>
		findBygetQueryLicenceCertificatBy_CI(
			String caseId, int start, int end,
			OrderByComparator<QueryLicenceCertificate> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetQueryLicenceCertificatBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	public static QueryLicenceCertificate
			findBygetQueryLicenceCertificatBy_CI_First(
				String caseId,
				OrderByComparator<QueryLicenceCertificate> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return getPersistence().findBygetQueryLicenceCertificatBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	public static QueryLicenceCertificate
		fetchBygetQueryLicenceCertificatBy_CI_First(
			String caseId,
			OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		return getPersistence().fetchBygetQueryLicenceCertificatBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a matching query licence certificate could not be found
	 */
	public static QueryLicenceCertificate
			findBygetQueryLicenceCertificatBy_CI_Last(
				String caseId,
				OrderByComparator<QueryLicenceCertificate> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return getPersistence().findBygetQueryLicenceCertificatBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching query licence certificate, or <code>null</code> if a matching query licence certificate could not be found
	 */
	public static QueryLicenceCertificate
		fetchBygetQueryLicenceCertificatBy_CI_Last(
			String caseId,
			OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		return getPersistence().fetchBygetQueryLicenceCertificatBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the query licence certificates before and after the current query licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param queryLicenceCertificateId the primary key of the current query licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	public static QueryLicenceCertificate[]
			findBygetQueryLicenceCertificatBy_CI_PrevAndNext(
				long queryLicenceCertificateId, String caseId,
				OrderByComparator<QueryLicenceCertificate> orderByComparator)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return getPersistence().
			findBygetQueryLicenceCertificatBy_CI_PrevAndNext(
				queryLicenceCertificateId, caseId, orderByComparator);
	}

	/**
	 * Removes all the query licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetQueryLicenceCertificatBy_CI(String caseId) {
		getPersistence().removeBygetQueryLicenceCertificatBy_CI(caseId);
	}

	/**
	 * Returns the number of query licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching query licence certificates
	 */
	public static int countBygetQueryLicenceCertificatBy_CI(String caseId) {
		return getPersistence().countBygetQueryLicenceCertificatBy_CI(caseId);
	}

	/**
	 * Caches the query licence certificate in the entity cache if it is enabled.
	 *
	 * @param queryLicenceCertificate the query licence certificate
	 */
	public static void cacheResult(
		QueryLicenceCertificate queryLicenceCertificate) {

		getPersistence().cacheResult(queryLicenceCertificate);
	}

	/**
	 * Caches the query licence certificates in the entity cache if it is enabled.
	 *
	 * @param queryLicenceCertificates the query licence certificates
	 */
	public static void cacheResult(
		List<QueryLicenceCertificate> queryLicenceCertificates) {

		getPersistence().cacheResult(queryLicenceCertificates);
	}

	/**
	 * Creates a new query licence certificate with the primary key. Does not add the query licence certificate to the database.
	 *
	 * @param queryLicenceCertificateId the primary key for the new query licence certificate
	 * @return the new query licence certificate
	 */
	public static QueryLicenceCertificate create(
		long queryLicenceCertificateId) {

		return getPersistence().create(queryLicenceCertificateId);
	}

	/**
	 * Removes the query licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate that was removed
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	public static QueryLicenceCertificate remove(long queryLicenceCertificateId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return getPersistence().remove(queryLicenceCertificateId);
	}

	public static QueryLicenceCertificate updateImpl(
		QueryLicenceCertificate queryLicenceCertificate) {

		return getPersistence().updateImpl(queryLicenceCertificate);
	}

	/**
	 * Returns the query licence certificate with the primary key or throws a <code>NoSuchQueryLicenceCertificateException</code> if it could not be found.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate
	 * @throws NoSuchQueryLicenceCertificateException if a query licence certificate with the primary key could not be found
	 */
	public static QueryLicenceCertificate findByPrimaryKey(
			long queryLicenceCertificateId)
		throws com.nbp.quarry.stage.service.exception.
			NoSuchQueryLicenceCertificateException {

		return getPersistence().findByPrimaryKey(queryLicenceCertificateId);
	}

	/**
	 * Returns the query licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param queryLicenceCertificateId the primary key of the query licence certificate
	 * @return the query licence certificate, or <code>null</code> if a query licence certificate with the primary key could not be found
	 */
	public static QueryLicenceCertificate fetchByPrimaryKey(
		long queryLicenceCertificateId) {

		return getPersistence().fetchByPrimaryKey(queryLicenceCertificateId);
	}

	/**
	 * Returns all the query licence certificates.
	 *
	 * @return the query licence certificates
	 */
	public static List<QueryLicenceCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @return the range of query licence certificates
	 */
	public static List<QueryLicenceCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of query licence certificates
	 */
	public static List<QueryLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<QueryLicenceCertificate> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the query licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QueryLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of query licence certificates
	 * @param end the upper bound of the range of query licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of query licence certificates
	 */
	public static List<QueryLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<QueryLicenceCertificate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the query licence certificates from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of query licence certificates.
	 *
	 * @return the number of query licence certificates
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static QueryLicenceCertificatePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		QueryLicenceCertificatePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile QueryLicenceCertificatePersistence _persistence;

}