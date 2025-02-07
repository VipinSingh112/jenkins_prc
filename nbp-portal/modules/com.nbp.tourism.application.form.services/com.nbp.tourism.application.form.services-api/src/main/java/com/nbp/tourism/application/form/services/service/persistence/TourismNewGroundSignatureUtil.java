/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.tourism.application.form.services.model.TourismNewGroundSignature;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the tourism new ground signature service. This utility wraps <code>com.nbp.tourism.application.form.services.service.persistence.impl.TourismNewGroundSignaturePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewGroundSignaturePersistence
 * @generated
 */
public class TourismNewGroundSignatureUtil {

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
		TourismNewGroundSignature tourismNewGroundSignature) {

		getPersistence().clearCache(tourismNewGroundSignature);
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
	public static Map<Serializable, TourismNewGroundSignature>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<TourismNewGroundSignature> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<TourismNewGroundSignature> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<TourismNewGroundSignature> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<TourismNewGroundSignature> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static TourismNewGroundSignature update(
		TourismNewGroundSignature tourismNewGroundSignature) {

		return getPersistence().update(tourismNewGroundSignature);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static TourismNewGroundSignature update(
		TourismNewGroundSignature tourismNewGroundSignature,
		ServiceContext serviceContext) {

		return getPersistence().update(
			tourismNewGroundSignature, serviceContext);
	}

	/**
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or throws a <code>NoSuchTourismNewGroundSignatureException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground signature
	 * @throws NoSuchTourismNewGroundSignatureException if a matching tourism new ground signature could not be found
	 */
	public static TourismNewGroundSignature findBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewGroundSignatureException {

		return getPersistence().findBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism new ground signature, or <code>null</code> if a matching tourism new ground signature could not be found
	 */
	public static TourismNewGroundSignature fetchBygetTourismById(
		long tourismApplicationId) {

		return getPersistence().fetchBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the tourism new ground signature where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism new ground signature, or <code>null</code> if a matching tourism new ground signature could not be found
	 */
	public static TourismNewGroundSignature fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetTourismById(
			tourismApplicationId, useFinderCache);
	}

	/**
	 * Removes the tourism new ground signature where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism new ground signature that was removed
	 */
	public static TourismNewGroundSignature removeBygetTourismById(
			long tourismApplicationId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewGroundSignatureException {

		return getPersistence().removeBygetTourismById(tourismApplicationId);
	}

	/**
	 * Returns the number of tourism new ground signatures where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism new ground signatures
	 */
	public static int countBygetTourismById(long tourismApplicationId) {
		return getPersistence().countBygetTourismById(tourismApplicationId);
	}

	/**
	 * Caches the tourism new ground signature in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundSignature the tourism new ground signature
	 */
	public static void cacheResult(
		TourismNewGroundSignature tourismNewGroundSignature) {

		getPersistence().cacheResult(tourismNewGroundSignature);
	}

	/**
	 * Caches the tourism new ground signatures in the entity cache if it is enabled.
	 *
	 * @param tourismNewGroundSignatures the tourism new ground signatures
	 */
	public static void cacheResult(
		List<TourismNewGroundSignature> tourismNewGroundSignatures) {

		getPersistence().cacheResult(tourismNewGroundSignatures);
	}

	/**
	 * Creates a new tourism new ground signature with the primary key. Does not add the tourism new ground signature to the database.
	 *
	 * @param TourismNewGroundSignatureId the primary key for the new tourism new ground signature
	 * @return the new tourism new ground signature
	 */
	public static TourismNewGroundSignature create(
		long TourismNewGroundSignatureId) {

		return getPersistence().create(TourismNewGroundSignatureId);
	}

	/**
	 * Removes the tourism new ground signature with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature that was removed
	 * @throws NoSuchTourismNewGroundSignatureException if a tourism new ground signature with the primary key could not be found
	 */
	public static TourismNewGroundSignature remove(
			long TourismNewGroundSignatureId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewGroundSignatureException {

		return getPersistence().remove(TourismNewGroundSignatureId);
	}

	public static TourismNewGroundSignature updateImpl(
		TourismNewGroundSignature tourismNewGroundSignature) {

		return getPersistence().updateImpl(tourismNewGroundSignature);
	}

	/**
	 * Returns the tourism new ground signature with the primary key or throws a <code>NoSuchTourismNewGroundSignatureException</code> if it could not be found.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature
	 * @throws NoSuchTourismNewGroundSignatureException if a tourism new ground signature with the primary key could not be found
	 */
	public static TourismNewGroundSignature findByPrimaryKey(
			long TourismNewGroundSignatureId)
		throws com.nbp.tourism.application.form.services.exception.
			NoSuchTourismNewGroundSignatureException {

		return getPersistence().findByPrimaryKey(TourismNewGroundSignatureId);
	}

	/**
	 * Returns the tourism new ground signature with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param TourismNewGroundSignatureId the primary key of the tourism new ground signature
	 * @return the tourism new ground signature, or <code>null</code> if a tourism new ground signature with the primary key could not be found
	 */
	public static TourismNewGroundSignature fetchByPrimaryKey(
		long TourismNewGroundSignatureId) {

		return getPersistence().fetchByPrimaryKey(TourismNewGroundSignatureId);
	}

	/**
	 * Returns all the tourism new ground signatures.
	 *
	 * @return the tourism new ground signatures
	 */
	public static List<TourismNewGroundSignature> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @return the range of tourism new ground signatures
	 */
	public static List<TourismNewGroundSignature> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism new ground signatures
	 */
	public static List<TourismNewGroundSignature> findAll(
		int start, int end,
		OrderByComparator<TourismNewGroundSignature> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the tourism new ground signatures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismNewGroundSignatureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism new ground signatures
	 * @param end the upper bound of the range of tourism new ground signatures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism new ground signatures
	 */
	public static List<TourismNewGroundSignature> findAll(
		int start, int end,
		OrderByComparator<TourismNewGroundSignature> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the tourism new ground signatures from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of tourism new ground signatures.
	 *
	 * @return the number of tourism new ground signatures
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static TourismNewGroundSignaturePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		TourismNewGroundSignaturePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile TourismNewGroundSignaturePersistence _persistence;

}