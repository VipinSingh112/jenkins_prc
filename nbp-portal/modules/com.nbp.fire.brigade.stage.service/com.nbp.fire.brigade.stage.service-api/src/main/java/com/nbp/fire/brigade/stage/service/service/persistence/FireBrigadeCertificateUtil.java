/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.fire.brigade.stage.service.model.FireBrigadeCertificate;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fire brigade certificate service. This utility wraps <code>com.nbp.fire.brigade.stage.service.service.persistence.impl.FireBrigadeCertificatePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCertificatePersistence
 * @generated
 */
public class FireBrigadeCertificateUtil {

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
		FireBrigadeCertificate fireBrigadeCertificate) {

		getPersistence().clearCache(fireBrigadeCertificate);
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
	public static Map<Serializable, FireBrigadeCertificate> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FireBrigadeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FireBrigadeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FireBrigadeCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FireBrigadeCertificate> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FireBrigadeCertificate update(
		FireBrigadeCertificate fireBrigadeCertificate) {

		return getPersistence().update(fireBrigadeCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FireBrigadeCertificate update(
		FireBrigadeCertificate fireBrigadeCertificate,
		ServiceContext serviceContext) {

		return getPersistence().update(fireBrigadeCertificate, serviceContext);
	}

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or throws a <code>NoSuchFireBrigadeCertificateException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade certificate
	 * @throws NoSuchFireBrigadeCertificateException if a matching fire brigade certificate could not be found
	 */
	public static FireBrigadeCertificate
			findBygetFireBrigadeCertificateByCaseId(String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeCertificateException {

		return getPersistence().findBygetFireBrigadeCertificateByCaseId(caseId);
	}

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade certificate, or <code>null</code> if a matching fire brigade certificate could not be found
	 */
	public static FireBrigadeCertificate
		fetchBygetFireBrigadeCertificateByCaseId(String caseId) {

		return getPersistence().fetchBygetFireBrigadeCertificateByCaseId(
			caseId);
	}

	/**
	 * Returns the fire brigade certificate where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade certificate, or <code>null</code> if a matching fire brigade certificate could not be found
	 */
	public static FireBrigadeCertificate
		fetchBygetFireBrigadeCertificateByCaseId(
			String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetFireBrigadeCertificateByCaseId(
			caseId, useFinderCache);
	}

	/**
	 * Removes the fire brigade certificate where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade certificate that was removed
	 */
	public static FireBrigadeCertificate
			removeBygetFireBrigadeCertificateByCaseId(String caseId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeCertificateException {

		return getPersistence().removeBygetFireBrigadeCertificateByCaseId(
			caseId);
	}

	/**
	 * Returns the number of fire brigade certificates where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade certificates
	 */
	public static int countBygetFireBrigadeCertificateByCaseId(String caseId) {
		return getPersistence().countBygetFireBrigadeCertificateByCaseId(
			caseId);
	}

	/**
	 * Caches the fire brigade certificate in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCertificate the fire brigade certificate
	 */
	public static void cacheResult(
		FireBrigadeCertificate fireBrigadeCertificate) {

		getPersistence().cacheResult(fireBrigadeCertificate);
	}

	/**
	 * Caches the fire brigade certificates in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeCertificates the fire brigade certificates
	 */
	public static void cacheResult(
		List<FireBrigadeCertificate> fireBrigadeCertificates) {

		getPersistence().cacheResult(fireBrigadeCertificates);
	}

	/**
	 * Creates a new fire brigade certificate with the primary key. Does not add the fire brigade certificate to the database.
	 *
	 * @param fireBrigadeCertificateId the primary key for the new fire brigade certificate
	 * @return the new fire brigade certificate
	 */
	public static FireBrigadeCertificate create(long fireBrigadeCertificateId) {
		return getPersistence().create(fireBrigadeCertificateId);
	}

	/**
	 * Removes the fire brigade certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate that was removed
	 * @throws NoSuchFireBrigadeCertificateException if a fire brigade certificate with the primary key could not be found
	 */
	public static FireBrigadeCertificate remove(long fireBrigadeCertificateId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeCertificateException {

		return getPersistence().remove(fireBrigadeCertificateId);
	}

	public static FireBrigadeCertificate updateImpl(
		FireBrigadeCertificate fireBrigadeCertificate) {

		return getPersistence().updateImpl(fireBrigadeCertificate);
	}

	/**
	 * Returns the fire brigade certificate with the primary key or throws a <code>NoSuchFireBrigadeCertificateException</code> if it could not be found.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate
	 * @throws NoSuchFireBrigadeCertificateException if a fire brigade certificate with the primary key could not be found
	 */
	public static FireBrigadeCertificate findByPrimaryKey(
			long fireBrigadeCertificateId)
		throws com.nbp.fire.brigade.stage.service.exception.
			NoSuchFireBrigadeCertificateException {

		return getPersistence().findByPrimaryKey(fireBrigadeCertificateId);
	}

	/**
	 * Returns the fire brigade certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeCertificateId the primary key of the fire brigade certificate
	 * @return the fire brigade certificate, or <code>null</code> if a fire brigade certificate with the primary key could not be found
	 */
	public static FireBrigadeCertificate fetchByPrimaryKey(
		long fireBrigadeCertificateId) {

		return getPersistence().fetchByPrimaryKey(fireBrigadeCertificateId);
	}

	/**
	 * Returns all the fire brigade certificates.
	 *
	 * @return the fire brigade certificates
	 */
	public static List<FireBrigadeCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @return the range of fire brigade certificates
	 */
	public static List<FireBrigadeCertificate> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade certificates
	 */
	public static List<FireBrigadeCertificate> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeCertificate> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fire brigade certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade certificates
	 * @param end the upper bound of the range of fire brigade certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade certificates
	 */
	public static List<FireBrigadeCertificate> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeCertificate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fire brigade certificates from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fire brigade certificates.
	 *
	 * @return the number of fire brigade certificates
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FireBrigadeCertificatePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FireBrigadeCertificatePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FireBrigadeCertificatePersistence _persistence;

}