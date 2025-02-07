/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.manufacturing.application.form.service.model.ManuInternationalCertificate;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the manu international certificate service. This utility wraps <code>com.nbp.manufacturing.application.form.service.service.persistence.impl.ManuInternationalCertificatePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuInternationalCertificatePersistence
 * @generated
 */
public class ManuInternationalCertificateUtil {

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
		ManuInternationalCertificate manuInternationalCertificate) {

		getPersistence().clearCache(manuInternationalCertificate);
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
	public static Map<Serializable, ManuInternationalCertificate>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ManuInternationalCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ManuInternationalCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ManuInternationalCertificate> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ManuInternationalCertificate update(
		ManuInternationalCertificate manuInternationalCertificate) {

		return getPersistence().update(manuInternationalCertificate);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ManuInternationalCertificate update(
		ManuInternationalCertificate manuInternationalCertificate,
		ServiceContext serviceContext) {

		return getPersistence().update(
			manuInternationalCertificate, serviceContext);
	}

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or throws a <code>NoSuchManuInternationalCertificateException</code> if it could not be found.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	public static ManuInternationalCertificate findBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuInternationalCertificateException {

		return getPersistence().findBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	public static ManuInternationalCertificate fetchBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the manu international certificate where manufacturingApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	public static ManuInternationalCertificate fetchBygetManufactureById(
		long manufacturingApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetManufactureById(
			manufacturingApplicationId, useFinderCache);
	}

	/**
	 * Removes the manu international certificate where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the manu international certificate that was removed
	 */
	public static ManuInternationalCertificate removeBygetManufactureById(
			long manufacturingApplicationId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuInternationalCertificateException {

		return getPersistence().removeBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu international certificates
	 */
	public static int countBygetManufactureById(
		long manufacturingApplicationId) {

		return getPersistence().countBygetManufactureById(
			manufacturingApplicationId);
	}

	/**
	 * Returns all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the matching manu international certificates
	 */
	public static List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId) {

		return getPersistence().findBygetMA_IC_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns a range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @return the range of matching manu international certificates
	 */
	public static List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end) {

		return getPersistence().findBygetMA_IC_MAI(
			manufacturingApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching manu international certificates
	 */
	public static List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		return getPersistence().findBygetMA_IC_MAI(
			manufacturingApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching manu international certificates
	 */
	public static List<ManuInternationalCertificate> findBygetMA_IC_MAI(
		long manufacturingApplicationId, int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetMA_IC_MAI(
			manufacturingApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	public static ManuInternationalCertificate findBygetMA_IC_MAI_First(
			long manufacturingApplicationId,
			OrderByComparator<ManuInternationalCertificate> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuInternationalCertificateException {

		return getPersistence().findBygetMA_IC_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the first manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	public static ManuInternationalCertificate fetchBygetMA_IC_MAI_First(
		long manufacturingApplicationId,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		return getPersistence().fetchBygetMA_IC_MAI_First(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a matching manu international certificate could not be found
	 */
	public static ManuInternationalCertificate findBygetMA_IC_MAI_Last(
			long manufacturingApplicationId,
			OrderByComparator<ManuInternationalCertificate> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuInternationalCertificateException {

		return getPersistence().findBygetMA_IC_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the last manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching manu international certificate, or <code>null</code> if a matching manu international certificate could not be found
	 */
	public static ManuInternationalCertificate fetchBygetMA_IC_MAI_Last(
		long manufacturingApplicationId,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		return getPersistence().fetchBygetMA_IC_MAI_Last(
			manufacturingApplicationId, orderByComparator);
	}

	/**
	 * Returns the manu international certificates before and after the current manu international certificate in the ordered set where manufacturingApplicationId = &#63;.
	 *
	 * @param manuInternationalCertificateId the primary key of the current manu international certificate
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	public static ManuInternationalCertificate[] findBygetMA_IC_MAI_PrevAndNext(
			long manuInternationalCertificateId,
			long manufacturingApplicationId,
			OrderByComparator<ManuInternationalCertificate> orderByComparator)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuInternationalCertificateException {

		return getPersistence().findBygetMA_IC_MAI_PrevAndNext(
			manuInternationalCertificateId, manufacturingApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the manu international certificates where manufacturingApplicationId = &#63; from the database.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 */
	public static void removeBygetMA_IC_MAI(long manufacturingApplicationId) {
		getPersistence().removeBygetMA_IC_MAI(manufacturingApplicationId);
	}

	/**
	 * Returns the number of manu international certificates where manufacturingApplicationId = &#63;.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID
	 * @return the number of matching manu international certificates
	 */
	public static int countBygetMA_IC_MAI(long manufacturingApplicationId) {
		return getPersistence().countBygetMA_IC_MAI(manufacturingApplicationId);
	}

	/**
	 * Caches the manu international certificate in the entity cache if it is enabled.
	 *
	 * @param manuInternationalCertificate the manu international certificate
	 */
	public static void cacheResult(
		ManuInternationalCertificate manuInternationalCertificate) {

		getPersistence().cacheResult(manuInternationalCertificate);
	}

	/**
	 * Caches the manu international certificates in the entity cache if it is enabled.
	 *
	 * @param manuInternationalCertificates the manu international certificates
	 */
	public static void cacheResult(
		List<ManuInternationalCertificate> manuInternationalCertificates) {

		getPersistence().cacheResult(manuInternationalCertificates);
	}

	/**
	 * Creates a new manu international certificate with the primary key. Does not add the manu international certificate to the database.
	 *
	 * @param manuInternationalCertificateId the primary key for the new manu international certificate
	 * @return the new manu international certificate
	 */
	public static ManuInternationalCertificate create(
		long manuInternationalCertificateId) {

		return getPersistence().create(manuInternationalCertificateId);
	}

	/**
	 * Removes the manu international certificate with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate that was removed
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	public static ManuInternationalCertificate remove(
			long manuInternationalCertificateId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuInternationalCertificateException {

		return getPersistence().remove(manuInternationalCertificateId);
	}

	public static ManuInternationalCertificate updateImpl(
		ManuInternationalCertificate manuInternationalCertificate) {

		return getPersistence().updateImpl(manuInternationalCertificate);
	}

	/**
	 * Returns the manu international certificate with the primary key or throws a <code>NoSuchManuInternationalCertificateException</code> if it could not be found.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate
	 * @throws NoSuchManuInternationalCertificateException if a manu international certificate with the primary key could not be found
	 */
	public static ManuInternationalCertificate findByPrimaryKey(
			long manuInternationalCertificateId)
		throws com.nbp.manufacturing.application.form.service.exception.
			NoSuchManuInternationalCertificateException {

		return getPersistence().findByPrimaryKey(
			manuInternationalCertificateId);
	}

	/**
	 * Returns the manu international certificate with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param manuInternationalCertificateId the primary key of the manu international certificate
	 * @return the manu international certificate, or <code>null</code> if a manu international certificate with the primary key could not be found
	 */
	public static ManuInternationalCertificate fetchByPrimaryKey(
		long manuInternationalCertificateId) {

		return getPersistence().fetchByPrimaryKey(
			manuInternationalCertificateId);
	}

	/**
	 * Returns all the manu international certificates.
	 *
	 * @return the manu international certificates
	 */
	public static List<ManuInternationalCertificate> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @return the range of manu international certificates
	 */
	public static List<ManuInternationalCertificate> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of manu international certificates
	 */
	public static List<ManuInternationalCertificate> findAll(
		int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the manu international certificates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ManuInternationalCertificateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of manu international certificates
	 * @param end the upper bound of the range of manu international certificates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of manu international certificates
	 */
	public static List<ManuInternationalCertificate> findAll(
		int start, int end,
		OrderByComparator<ManuInternationalCertificate> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the manu international certificates from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of manu international certificates.
	 *
	 * @return the number of manu international certificates
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ManuInternationalCertificatePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		ManuInternationalCertificatePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile ManuInternationalCertificatePersistence
		_persistence;

}