/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjLicenceCertificate;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj licence certificate service. This utility wraps <code>com.nbp.ncbj.stages.services.service.persistence.impl.NcbjLicenceCertificatePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificatePersistence
 * @generated
 */
public class NcbjLicenceCertificateUtil {

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
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		getPersistence().clearCache(ncbjLicenceCertificate);
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
	public static Map<Serializable, NcbjLicenceCertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjLicenceCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjLicenceCertificate update(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		return getPersistence().update(ncbjLicenceCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjLicenceCertificate update(
		NcbjLicenceCertificate ncbjLicenceCertificate,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjLicenceCertificate, serviceContext);
	}

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or throws a <code>NoSuchNcbjLicenceCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	public static NcbjLicenceCertificate findBygetNcbjLicenceCertiBy_CI(
			String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return getPersistence().findBygetNcbjLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	public static NcbjLicenceCertificate fetchBygetNcbjLicenceCertiBy_CI(
		String caseId) {

		return getPersistence().fetchBygetNcbjLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns the ncbj licence certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	public static NcbjLicenceCertificate fetchBygetNcbjLicenceCertiBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbjLicenceCertiBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the ncbj licence certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj licence certificate that was removed
	 */
	public static NcbjLicenceCertificate removeBygetNcbjLicenceCertiBy_CI(
			String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return getPersistence().removeBygetNcbjLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns the number of ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj licence certificates
	 */
	public static int countBygetNcbjLicenceCertiBy_CI(String caseId) {
		return getPersistence().countBygetNcbjLicenceCertiBy_CI(caseId);
	}

	/**
	 * Returns all the ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId) {

		return getPersistence().findBygetNcbjLicCertiBy_CI(caseId);
	}

	/**
	 * Returns a range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of matching ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetNcbjLicCertiBy_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		return getPersistence().findBygetNcbjLicCertiBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj licence certificates where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> findBygetNcbjLicCertiBy_CI(
		String caseId, int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbjLicCertiBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	public static NcbjLicenceCertificate findBygetNcbjLicCertiBy_CI_First(
			String caseId,
			OrderByComparator<NcbjLicenceCertificate> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return getPersistence().findBygetNcbjLicCertiBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	public static NcbjLicenceCertificate fetchBygetNcbjLicCertiBy_CI_First(
		String caseId,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		return getPersistence().fetchBygetNcbjLicCertiBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a matching ncbj licence certificate could not be found
	 */
	public static NcbjLicenceCertificate findBygetNcbjLicCertiBy_CI_Last(
			String caseId,
			OrderByComparator<NcbjLicenceCertificate> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return getPersistence().findBygetNcbjLicCertiBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj licence certificate, or <code>null</code> if a matching ncbj licence certificate could not be found
	 */
	public static NcbjLicenceCertificate fetchBygetNcbjLicCertiBy_CI_Last(
		String caseId,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		return getPersistence().fetchBygetNcbjLicCertiBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the ncbj licence certificates before and after the current ncbj licence certificate in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the current ncbj licence certificate
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	public static NcbjLicenceCertificate[]
			findBygetNcbjLicCertiBy_CI_PrevAndNext(
				long ncbjLicenceCertificateId, String caseId,
				OrderByComparator<NcbjLicenceCertificate> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return getPersistence().findBygetNcbjLicCertiBy_CI_PrevAndNext(
			ncbjLicenceCertificateId, caseId, orderByComparator);
	}

	/**
	 * Removes all the ncbj licence certificates where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetNcbjLicCertiBy_CI(String caseId) {
		getPersistence().removeBygetNcbjLicCertiBy_CI(caseId);
	}

	/**
	 * Returns the number of ncbj licence certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj licence certificates
	 */
	public static int countBygetNcbjLicCertiBy_CI(String caseId) {
		return getPersistence().countBygetNcbjLicCertiBy_CI(caseId);
	}

	/**
	 * Caches the ncbj licence certificate in the entity cache if it is enabled.
	 *
	 * @param ncbjLicenceCertificate the ncbj licence certificate
	 */
	public static void cacheResult(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		getPersistence().cacheResult(ncbjLicenceCertificate);
	}

	/**
	 * Caches the ncbj licence certificates in the entity cache if it is enabled.
	 *
	 * @param ncbjLicenceCertificates the ncbj licence certificates
	 */
	public static void cacheResult(
		List<NcbjLicenceCertificate> ncbjLicenceCertificates) {

		getPersistence().cacheResult(ncbjLicenceCertificates);
	}

	/**
	 * Creates a new ncbj licence certificate with the primary key. Does not add the ncbj licence certificate to the database.
	 *
	 * @param ncbjLicenceCertificateId the primary key for the new ncbj licence certificate
	 * @return the new ncbj licence certificate
	 */
	public static NcbjLicenceCertificate create(long ncbjLicenceCertificateId) {
		return getPersistence().create(ncbjLicenceCertificateId);
	}

	/**
	 * Removes the ncbj licence certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate that was removed
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	public static NcbjLicenceCertificate remove(long ncbjLicenceCertificateId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return getPersistence().remove(ncbjLicenceCertificateId);
	}

	public static NcbjLicenceCertificate updateImpl(
		NcbjLicenceCertificate ncbjLicenceCertificate) {

		return getPersistence().updateImpl(ncbjLicenceCertificate);
	}

	/**
	 * Returns the ncbj licence certificate with the primary key or throws a <code>NoSuchNcbjLicenceCertificateException</code> if it could not be found.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate
	 * @throws NoSuchNcbjLicenceCertificateException if a ncbj licence certificate with the primary key could not be found
	 */
	public static NcbjLicenceCertificate findByPrimaryKey(
			long ncbjLicenceCertificateId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjLicenceCertificateException {

		return getPersistence().findByPrimaryKey(ncbjLicenceCertificateId);
	}

	/**
	 * Returns the ncbj licence certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjLicenceCertificateId the primary key of the ncbj licence certificate
	 * @return the ncbj licence certificate, or <code>null</code> if a ncbj licence certificate with the primary key could not be found
	 */
	public static NcbjLicenceCertificate fetchByPrimaryKey(
		long ncbjLicenceCertificateId) {

		return getPersistence().fetchByPrimaryKey(ncbjLicenceCertificateId);
	}

	/**
	 * Returns all the ncbj licence certificates.
	 *
	 * @return the ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @return the range of ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj licence certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjLicenceCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj licence certificates
	 * @param end the upper bound of the range of ncbj licence certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj licence certificates
	 */
	public static List<NcbjLicenceCertificate> findAll(
		int start, int end,
		OrderByComparator<NcbjLicenceCertificate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj licence certificates from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj licence certificates.
	 *
	 * @return the number of ncbj licence certificates
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjLicenceCertificatePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjLicenceCertificatePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjLicenceCertificatePersistence _persistence;

}