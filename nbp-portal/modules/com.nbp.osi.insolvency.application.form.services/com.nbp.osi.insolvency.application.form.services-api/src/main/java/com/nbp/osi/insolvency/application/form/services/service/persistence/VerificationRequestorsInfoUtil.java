/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.VerificationRequestorsInfo;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the verification requestors info service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.VerificationRequestorsInfoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VerificationRequestorsInfoPersistence
 * @generated
 */
public class VerificationRequestorsInfoUtil {

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
		VerificationRequestorsInfo verificationRequestorsInfo) {

		getPersistence().clearCache(verificationRequestorsInfo);
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
	public static Map<Serializable, VerificationRequestorsInfo>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<VerificationRequestorsInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<VerificationRequestorsInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<VerificationRequestorsInfo> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<VerificationRequestorsInfo> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static VerificationRequestorsInfo update(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		return getPersistence().update(verificationRequestorsInfo);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static VerificationRequestorsInfo update(
		VerificationRequestorsInfo verificationRequestorsInfo,
		ServiceContext serviceContext) {

		return getPersistence().update(
			verificationRequestorsInfo, serviceContext);
	}

	/**
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or throws a <code>NoSuchVerificationRequestorsInfoException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors info
	 * @throws NoSuchVerificationRequestorsInfoException if a matching verification requestors info could not be found
	 */
	public static VerificationRequestorsInfo findBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationRequestorsInfoException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching verification requestors info, or <code>null</code> if a matching verification requestors info could not be found
	 */
	public static VerificationRequestorsInfo fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the verification requestors info where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching verification requestors info, or <code>null</code> if a matching verification requestors info could not be found
	 */
	public static VerificationRequestorsInfo fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the verification requestors info where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the verification requestors info that was removed
	 */
	public static VerificationRequestorsInfo removeBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationRequestorsInfoException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of verification requestors infos where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching verification requestors infos
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the verification requestors info in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInfo the verification requestors info
	 */
	public static void cacheResult(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		getPersistence().cacheResult(verificationRequestorsInfo);
	}

	/**
	 * Caches the verification requestors infos in the entity cache if it is enabled.
	 *
	 * @param verificationRequestorsInfos the verification requestors infos
	 */
	public static void cacheResult(
		List<VerificationRequestorsInfo> verificationRequestorsInfos) {

		getPersistence().cacheResult(verificationRequestorsInfos);
	}

	/**
	 * Creates a new verification requestors info with the primary key. Does not add the verification requestors info to the database.
	 *
	 * @param requestorInformationId the primary key for the new verification requestors info
	 * @return the new verification requestors info
	 */
	public static VerificationRequestorsInfo create(
		long requestorInformationId) {

		return getPersistence().create(requestorInformationId);
	}

	/**
	 * Removes the verification requestors info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info that was removed
	 * @throws NoSuchVerificationRequestorsInfoException if a verification requestors info with the primary key could not be found
	 */
	public static VerificationRequestorsInfo remove(long requestorInformationId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationRequestorsInfoException {

		return getPersistence().remove(requestorInformationId);
	}

	public static VerificationRequestorsInfo updateImpl(
		VerificationRequestorsInfo verificationRequestorsInfo) {

		return getPersistence().updateImpl(verificationRequestorsInfo);
	}

	/**
	 * Returns the verification requestors info with the primary key or throws a <code>NoSuchVerificationRequestorsInfoException</code> if it could not be found.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info
	 * @throws NoSuchVerificationRequestorsInfoException if a verification requestors info with the primary key could not be found
	 */
	public static VerificationRequestorsInfo findByPrimaryKey(
			long requestorInformationId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchVerificationRequestorsInfoException {

		return getPersistence().findByPrimaryKey(requestorInformationId);
	}

	/**
	 * Returns the verification requestors info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param requestorInformationId the primary key of the verification requestors info
	 * @return the verification requestors info, or <code>null</code> if a verification requestors info with the primary key could not be found
	 */
	public static VerificationRequestorsInfo fetchByPrimaryKey(
		long requestorInformationId) {

		return getPersistence().fetchByPrimaryKey(requestorInformationId);
	}

	/**
	 * Returns all the verification requestors infos.
	 *
	 * @return the verification requestors infos
	 */
	public static List<VerificationRequestorsInfo> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @return the range of verification requestors infos
	 */
	public static List<VerificationRequestorsInfo> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of verification requestors infos
	 */
	public static List<VerificationRequestorsInfo> findAll(
		int start, int end,
		OrderByComparator<VerificationRequestorsInfo> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the verification requestors infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VerificationRequestorsInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of verification requestors infos
	 * @param end the upper bound of the range of verification requestors infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of verification requestors infos
	 */
	public static List<VerificationRequestorsInfo> findAll(
		int start, int end,
		OrderByComparator<VerificationRequestorsInfo> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the verification requestors infos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of verification requestors infos.
	 *
	 * @return the number of verification requestors infos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VerificationRequestorsInfoPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		VerificationRequestorsInfoPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile VerificationRequestorsInfoPersistence _persistence;

}