/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.stage.services.model.OsiInsolveDeskVerification;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the osi insolve desk verification service. This utility wraps <code>com.nbp.osi.insolvency.stage.services.service.persistence.impl.OsiInsolveDeskVerificationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiInsolveDeskVerificationPersistence
 * @generated
 */
public class OsiInsolveDeskVerificationUtil {

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
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		getPersistence().clearCache(osiInsolveDeskVerification);
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
	public static Map<Serializable, OsiInsolveDeskVerification>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OsiInsolveDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OsiInsolveDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OsiInsolveDeskVerification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OsiInsolveDeskVerification> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OsiInsolveDeskVerification update(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return getPersistence().update(osiInsolveDeskVerification);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OsiInsolveDeskVerification update(
		OsiInsolveDeskVerification osiInsolveDeskVerification,
		ServiceContext serviceContext) {

		return getPersistence().update(
			osiInsolveDeskVerification, serviceContext);
	}

	/**
	 * Returns all the osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification>
		findBygetDeskVerificationOsiInsolvencyById(long osiInsolvencyId) {

		return getPersistence().findBygetDeskVerificationOsiInsolvencyById(
			osiInsolvencyId);
	}

	/**
	 * Returns a range of all the osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @return the range of matching osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification>
		findBygetDeskVerificationOsiInsolvencyById(
			long osiInsolvencyId, int start, int end) {

		return getPersistence().findBygetDeskVerificationOsiInsolvencyById(
			osiInsolvencyId, start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification>
		findBygetDeskVerificationOsiInsolvencyById(
			long osiInsolvencyId, int start, int end,
			OrderByComparator<OsiInsolveDeskVerification> orderByComparator) {

		return getPersistence().findBygetDeskVerificationOsiInsolvencyById(
			osiInsolvencyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification>
		findBygetDeskVerificationOsiInsolvencyById(
			long osiInsolvencyId, int start, int end,
			OrderByComparator<OsiInsolveDeskVerification> orderByComparator,
			boolean useFinderCache) {

		return getPersistence().findBygetDeskVerificationOsiInsolvencyById(
			osiInsolvencyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolve desk verification
	 * @throws NoSuchOsiInsolveDeskVerificationException if a matching osi insolve desk verification could not be found
	 */
	public static OsiInsolveDeskVerification
			findBygetDeskVerificationOsiInsolvencyById_First(
				long osiInsolvencyId,
				OrderByComparator<OsiInsolveDeskVerification> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolveDeskVerificationException {

		return getPersistence().
			findBygetDeskVerificationOsiInsolvencyById_First(
				osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the first osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi insolve desk verification, or <code>null</code> if a matching osi insolve desk verification could not be found
	 */
	public static OsiInsolveDeskVerification
		fetchBygetDeskVerificationOsiInsolvencyById_First(
			long osiInsolvencyId,
			OrderByComparator<OsiInsolveDeskVerification> orderByComparator) {

		return getPersistence().
			fetchBygetDeskVerificationOsiInsolvencyById_First(
				osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolve desk verification
	 * @throws NoSuchOsiInsolveDeskVerificationException if a matching osi insolve desk verification could not be found
	 */
	public static OsiInsolveDeskVerification
			findBygetDeskVerificationOsiInsolvencyById_Last(
				long osiInsolvencyId,
				OrderByComparator<OsiInsolveDeskVerification> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolveDeskVerificationException {

		return getPersistence().findBygetDeskVerificationOsiInsolvencyById_Last(
			osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the last osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi insolve desk verification, or <code>null</code> if a matching osi insolve desk verification could not be found
	 */
	public static OsiInsolveDeskVerification
		fetchBygetDeskVerificationOsiInsolvencyById_Last(
			long osiInsolvencyId,
			OrderByComparator<OsiInsolveDeskVerification> orderByComparator) {

		return getPersistence().
			fetchBygetDeskVerificationOsiInsolvencyById_Last(
				osiInsolvencyId, orderByComparator);
	}

	/**
	 * Returns the osi insolve desk verifications before and after the current osi insolve desk verification in the ordered set where osiInsolvencyId = &#63;.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the current osi insolve desk verification
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi insolve desk verification
	 * @throws NoSuchOsiInsolveDeskVerificationException if a osi insolve desk verification with the primary key could not be found
	 */
	public static OsiInsolveDeskVerification[]
			findBygetDeskVerificationOsiInsolvencyById_PrevAndNext(
				long OsiInsolveDeskVerificationId, long osiInsolvencyId,
				OrderByComparator<OsiInsolveDeskVerification> orderByComparator)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolveDeskVerificationException {

		return getPersistence().
			findBygetDeskVerificationOsiInsolvencyById_PrevAndNext(
				OsiInsolveDeskVerificationId, osiInsolvencyId,
				orderByComparator);
	}

	/**
	 * Removes all the osi insolve desk verifications where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 */
	public static void removeBygetDeskVerificationOsiInsolvencyById(
		long osiInsolvencyId) {

		getPersistence().removeBygetDeskVerificationOsiInsolvencyById(
			osiInsolvencyId);
	}

	/**
	 * Returns the number of osi insolve desk verifications where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching osi insolve desk verifications
	 */
	public static int countBygetDeskVerificationOsiInsolvencyById(
		long osiInsolvencyId) {

		return getPersistence().countBygetDeskVerificationOsiInsolvencyById(
			osiInsolvencyId);
	}

	/**
	 * Caches the osi insolve desk verification in the entity cache if it is enabled.
	 *
	 * @param osiInsolveDeskVerification the osi insolve desk verification
	 */
	public static void cacheResult(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		getPersistence().cacheResult(osiInsolveDeskVerification);
	}

	/**
	 * Caches the osi insolve desk verifications in the entity cache if it is enabled.
	 *
	 * @param osiInsolveDeskVerifications the osi insolve desk verifications
	 */
	public static void cacheResult(
		List<OsiInsolveDeskVerification> osiInsolveDeskVerifications) {

		getPersistence().cacheResult(osiInsolveDeskVerifications);
	}

	/**
	 * Creates a new osi insolve desk verification with the primary key. Does not add the osi insolve desk verification to the database.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key for the new osi insolve desk verification
	 * @return the new osi insolve desk verification
	 */
	public static OsiInsolveDeskVerification create(
		long OsiInsolveDeskVerificationId) {

		return getPersistence().create(OsiInsolveDeskVerificationId);
	}

	/**
	 * Removes the osi insolve desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification that was removed
	 * @throws NoSuchOsiInsolveDeskVerificationException if a osi insolve desk verification with the primary key could not be found
	 */
	public static OsiInsolveDeskVerification remove(
			long OsiInsolveDeskVerificationId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolveDeskVerificationException {

		return getPersistence().remove(OsiInsolveDeskVerificationId);
	}

	public static OsiInsolveDeskVerification updateImpl(
		OsiInsolveDeskVerification osiInsolveDeskVerification) {

		return getPersistence().updateImpl(osiInsolveDeskVerification);
	}

	/**
	 * Returns the osi insolve desk verification with the primary key or throws a <code>NoSuchOsiInsolveDeskVerificationException</code> if it could not be found.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification
	 * @throws NoSuchOsiInsolveDeskVerificationException if a osi insolve desk verification with the primary key could not be found
	 */
	public static OsiInsolveDeskVerification findByPrimaryKey(
			long OsiInsolveDeskVerificationId)
		throws com.nbp.osi.insolvency.stage.services.exception.
			NoSuchOsiInsolveDeskVerificationException {

		return getPersistence().findByPrimaryKey(OsiInsolveDeskVerificationId);
	}

	/**
	 * Returns the osi insolve desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OsiInsolveDeskVerificationId the primary key of the osi insolve desk verification
	 * @return the osi insolve desk verification, or <code>null</code> if a osi insolve desk verification with the primary key could not be found
	 */
	public static OsiInsolveDeskVerification fetchByPrimaryKey(
		long OsiInsolveDeskVerificationId) {

		return getPersistence().fetchByPrimaryKey(OsiInsolveDeskVerificationId);
	}

	/**
	 * Returns all the osi insolve desk verifications.
	 *
	 * @return the osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @return the range of osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification> findAll(
		int start, int end,
		OrderByComparator<OsiInsolveDeskVerification> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the osi insolve desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiInsolveDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi insolve desk verifications
	 * @param end the upper bound of the range of osi insolve desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi insolve desk verifications
	 */
	public static List<OsiInsolveDeskVerification> findAll(
		int start, int end,
		OrderByComparator<OsiInsolveDeskVerification> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the osi insolve desk verifications from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of osi insolve desk verifications.
	 *
	 * @return the number of osi insolve desk verifications
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OsiInsolveDeskVerificationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		OsiInsolveDeskVerificationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile OsiInsolveDeskVerificationPersistence _persistence;

}