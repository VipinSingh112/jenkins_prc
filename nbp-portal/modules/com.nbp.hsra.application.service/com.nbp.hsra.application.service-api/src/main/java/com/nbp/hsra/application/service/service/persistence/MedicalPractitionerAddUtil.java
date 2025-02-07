/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.MedicalPractitionerAdd;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the medical practitioner add service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.MedicalPractitionerAddPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MedicalPractitionerAddPersistence
 * @generated
 */
public class MedicalPractitionerAddUtil {

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
		MedicalPractitionerAdd medicalPractitionerAdd) {

		getPersistence().clearCache(medicalPractitionerAdd);
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
	public static Map<Serializable, MedicalPractitionerAdd> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MedicalPractitionerAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MedicalPractitionerAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MedicalPractitionerAdd> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MedicalPractitionerAdd update(
		MedicalPractitionerAdd medicalPractitionerAdd) {

		return getPersistence().update(medicalPractitionerAdd);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MedicalPractitionerAdd update(
		MedicalPractitionerAdd medicalPractitionerAdd,
		ServiceContext serviceContext) {

		return getPersistence().update(medicalPractitionerAdd, serviceContext);
	}

	/**
	 * Returns all the medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching medical practitioner adds
	 */
	public static List<MedicalPractitionerAdd> findBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns a range of all the medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @return the range of matching medical practitioner adds
	 */
	public static List<MedicalPractitionerAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching medical practitioner adds
	 */
	public static List<MedicalPractitionerAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching medical practitioner adds
	 */
	public static List<MedicalPractitionerAdd> findBygetHsraById(
		long hsraApplicationId, int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetHsraById(
			hsraApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a matching medical practitioner add could not be found
	 */
	public static MedicalPractitionerAdd findBygetHsraById_First(
			long hsraApplicationId,
			OrderByComparator<MedicalPractitionerAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchMedicalPractitionerAddException {

		return getPersistence().findBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the first medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching medical practitioner add, or <code>null</code> if a matching medical practitioner add could not be found
	 */
	public static MedicalPractitionerAdd fetchBygetHsraById_First(
		long hsraApplicationId,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_First(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a matching medical practitioner add could not be found
	 */
	public static MedicalPractitionerAdd findBygetHsraById_Last(
			long hsraApplicationId,
			OrderByComparator<MedicalPractitionerAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchMedicalPractitionerAddException {

		return getPersistence().findBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the last medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching medical practitioner add, or <code>null</code> if a matching medical practitioner add could not be found
	 */
	public static MedicalPractitionerAdd fetchBygetHsraById_Last(
		long hsraApplicationId,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		return getPersistence().fetchBygetHsraById_Last(
			hsraApplicationId, orderByComparator);
	}

	/**
	 * Returns the medical practitioner adds before and after the current medical practitioner add in the ordered set where hsraApplicationId = &#63;.
	 *
	 * @param medicalPractitionerAddId the primary key of the current medical practitioner add
	 * @param hsraApplicationId the hsra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a medical practitioner add with the primary key could not be found
	 */
	public static MedicalPractitionerAdd[] findBygetHsraById_PrevAndNext(
			long medicalPractitionerAddId, long hsraApplicationId,
			OrderByComparator<MedicalPractitionerAdd> orderByComparator)
		throws com.nbp.hsra.application.service.exception.
			NoSuchMedicalPractitionerAddException {

		return getPersistence().findBygetHsraById_PrevAndNext(
			medicalPractitionerAddId, hsraApplicationId, orderByComparator);
	}

	/**
	 * Removes all the medical practitioner adds where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 */
	public static void removeBygetHsraById(long hsraApplicationId) {
		getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of medical practitioner adds where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching medical practitioner adds
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the medical practitioner add in the entity cache if it is enabled.
	 *
	 * @param medicalPractitionerAdd the medical practitioner add
	 */
	public static void cacheResult(
		MedicalPractitionerAdd medicalPractitionerAdd) {

		getPersistence().cacheResult(medicalPractitionerAdd);
	}

	/**
	 * Caches the medical practitioner adds in the entity cache if it is enabled.
	 *
	 * @param medicalPractitionerAdds the medical practitioner adds
	 */
	public static void cacheResult(
		List<MedicalPractitionerAdd> medicalPractitionerAdds) {

		getPersistence().cacheResult(medicalPractitionerAdds);
	}

	/**
	 * Creates a new medical practitioner add with the primary key. Does not add the medical practitioner add to the database.
	 *
	 * @param medicalPractitionerAddId the primary key for the new medical practitioner add
	 * @return the new medical practitioner add
	 */
	public static MedicalPractitionerAdd create(long medicalPractitionerAddId) {
		return getPersistence().create(medicalPractitionerAddId);
	}

	/**
	 * Removes the medical practitioner add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param medicalPractitionerAddId the primary key of the medical practitioner add
	 * @return the medical practitioner add that was removed
	 * @throws NoSuchMedicalPractitionerAddException if a medical practitioner add with the primary key could not be found
	 */
	public static MedicalPractitionerAdd remove(long medicalPractitionerAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchMedicalPractitionerAddException {

		return getPersistence().remove(medicalPractitionerAddId);
	}

	public static MedicalPractitionerAdd updateImpl(
		MedicalPractitionerAdd medicalPractitionerAdd) {

		return getPersistence().updateImpl(medicalPractitionerAdd);
	}

	/**
	 * Returns the medical practitioner add with the primary key or throws a <code>NoSuchMedicalPractitionerAddException</code> if it could not be found.
	 *
	 * @param medicalPractitionerAddId the primary key of the medical practitioner add
	 * @return the medical practitioner add
	 * @throws NoSuchMedicalPractitionerAddException if a medical practitioner add with the primary key could not be found
	 */
	public static MedicalPractitionerAdd findByPrimaryKey(
			long medicalPractitionerAddId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchMedicalPractitionerAddException {

		return getPersistence().findByPrimaryKey(medicalPractitionerAddId);
	}

	/**
	 * Returns the medical practitioner add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param medicalPractitionerAddId the primary key of the medical practitioner add
	 * @return the medical practitioner add, or <code>null</code> if a medical practitioner add with the primary key could not be found
	 */
	public static MedicalPractitionerAdd fetchByPrimaryKey(
		long medicalPractitionerAddId) {

		return getPersistence().fetchByPrimaryKey(medicalPractitionerAddId);
	}

	/**
	 * Returns all the medical practitioner adds.
	 *
	 * @return the medical practitioner adds
	 */
	public static List<MedicalPractitionerAdd> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the medical practitioner adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @return the range of medical practitioner adds
	 */
	public static List<MedicalPractitionerAdd> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the medical practitioner adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of medical practitioner adds
	 */
	public static List<MedicalPractitionerAdd> findAll(
		int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the medical practitioner adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MedicalPractitionerAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of medical practitioner adds
	 * @param end the upper bound of the range of medical practitioner adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of medical practitioner adds
	 */
	public static List<MedicalPractitionerAdd> findAll(
		int start, int end,
		OrderByComparator<MedicalPractitionerAdd> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the medical practitioner adds from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of medical practitioner adds.
	 *
	 * @return the number of medical practitioner adds
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MedicalPractitionerAddPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MedicalPractitionerAddPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MedicalPractitionerAddPersistence _persistence;

}