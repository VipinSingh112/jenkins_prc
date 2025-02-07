/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.VerificationCompanyInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the verification company info service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.VerificationCompanyInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VerificationCompanyInfoPersistence
 * @generated
 */
public class VerificationCompanyInfoUtil {

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
		VerificationCompanyInfo verificationCompanyInfo) {

		getPersistence().clearCache(verificationCompanyInfo);
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
	public static Map<Serializable, VerificationCompanyInfo> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VerificationCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VerificationCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VerificationCompanyInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VerificationCompanyInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VerificationCompanyInfo update(
		VerificationCompanyInfo verificationCompanyInfo) {

		return getPersistence().update(verificationCompanyInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VerificationCompanyInfo update(
		VerificationCompanyInfo verificationCompanyInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(verificationCompanyInfo, serviceContext);
	}

	/**
	 * Returns the verification company info where osiInsolvencyId = &#63; or throws a <code>NoSuchVerificationCompanyInfoException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification company info
	 * @throws NoSuchVerificationCompanyInfoException if a matching verification company info could not be found
	 */
	public static VerificationCompanyInfo findBygetOsiById(long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationCompanyInfoException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the verification company info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification company info, or <code>null</code> if a matching verification company info could not be found
	 */
	public static VerificationCompanyInfo fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the verification company info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching verification company info, or <code>null</code> if a matching verification company info could not be found
	 */
	public static VerificationCompanyInfo fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the verification company info where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the verification company info that was removed
	 */
	public static VerificationCompanyInfo removeBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationCompanyInfoException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of verification company infos where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching verification company infos
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the verification company info in the entity cache if it is enabled.
	 *
	 * @param verificationCompanyInfo the verification company info
	 */
	public static void cacheResult(
		VerificationCompanyInfo verificationCompanyInfo) {

		getPersistence().cacheResult(verificationCompanyInfo);
	}

	/**
	 * Caches the verification company infos in the entity cache if it is enabled.
	 *
	 * @param verificationCompanyInfos the verification company infos
	 */
	public static void cacheResult(
		List<VerificationCompanyInfo> verificationCompanyInfos) {

		getPersistence().cacheResult(verificationCompanyInfos);
	}

	/**
	 * Creates a new verification company info with the primary key. Does not add the verification company info to the database.
	 *
	 * @param verificationCompanyInfoId the primary key for the new verification company info
	 * @return the new verification company info
	 */
	public static VerificationCompanyInfo create(
		long verificationCompanyInfoId) {

		return getPersistence().create(verificationCompanyInfoId);
	}

	/**
	 * Removes the verification company info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param verificationCompanyInfoId the primary key of the verification company info
	 * @return the verification company info that was removed
	 * @throws NoSuchVerificationCompanyInfoException if a verification company info with the primary key could not be found
	 */
	public static VerificationCompanyInfo remove(long verificationCompanyInfoId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationCompanyInfoException {

		return getPersistence().remove(verificationCompanyInfoId);
	}

	public static VerificationCompanyInfo updateImpl(
		VerificationCompanyInfo verificationCompanyInfo) {

		return getPersistence().updateImpl(verificationCompanyInfo);
	}

	/**
	 * Returns the verification company info with the primary key or throws a <code>NoSuchVerificationCompanyInfoException</code> if it could not be found.
	 *
	 * @param verificationCompanyInfoId the primary key of the verification company info
	 * @return the verification company info
	 * @throws NoSuchVerificationCompanyInfoException if a verification company info with the primary key could not be found
	 */
	public static VerificationCompanyInfo findByPrimaryKey(
			long verificationCompanyInfoId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationCompanyInfoException {

		return getPersistence().findByPrimaryKey(verificationCompanyInfoId);
	}

	/**
	 * Returns the verification company info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param verificationCompanyInfoId the primary key of the verification company info
	 * @return the verification company info, or <code>null</code> if a verification company info with the primary key could not be found
	 */
	public static VerificationCompanyInfo fetchByPrimaryKey(
		long verificationCompanyInfoId) {

		return getPersistence().fetchByPrimaryKey(verificationCompanyInfoId);
	}

	/**
	 * Returns all the verification company infos.
	 *
	 * @return the verification company infos
	 */
	public static List<VerificationCompanyInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the verification company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification company infos
	 * @param end the upper bound of the range of verification company infos (not inclusive)
	 * @return the range of verification company infos
	 */
	public static List<VerificationCompanyInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the verification company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification company infos
	 * @param end the upper bound of the range of verification company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of verification company infos
	 */
	public static List<VerificationCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<VerificationCompanyInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the verification company infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationCompanyInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification company infos
	 * @param end the upper bound of the range of verification company infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of verification company infos
	 */
	public static List<VerificationCompanyInfo> findAll(
		int start, int end,
		OrderByComparator<VerificationCompanyInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the verification company infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of verification company infos.
	 *
	 * @return the number of verification company infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VerificationCompanyInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		VerificationCompanyInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile VerificationCompanyInfoPersistence _persistence;

}