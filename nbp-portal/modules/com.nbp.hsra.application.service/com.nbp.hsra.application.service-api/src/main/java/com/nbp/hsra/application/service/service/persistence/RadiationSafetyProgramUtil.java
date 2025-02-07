/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.RadiationSafetyProgram;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the radiation safety program service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.RadiationSafetyProgramPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RadiationSafetyProgramPersistence
 * @generated
 */
public class RadiationSafetyProgramUtil {

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
		RadiationSafetyProgram radiationSafetyProgram) {

		getPersistence().clearCache(radiationSafetyProgram);
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
	public static Map<Serializable, RadiationSafetyProgram> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RadiationSafetyProgram> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RadiationSafetyProgram> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RadiationSafetyProgram> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RadiationSafetyProgram> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RadiationSafetyProgram update(
		RadiationSafetyProgram radiationSafetyProgram) {

		return getPersistence().update(radiationSafetyProgram);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RadiationSafetyProgram update(
		RadiationSafetyProgram radiationSafetyProgram,
		ServiceContext serviceContext) {

		return getPersistence().update(radiationSafetyProgram, serviceContext);
	}

	/**
	 * Returns the radiation safety program where hsraApplicationId = &#63; or throws a <code>NoSuchRadiationSafetyProgramException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety program
	 * @throws NoSuchRadiationSafetyProgramException if a matching radiation safety program could not be found
	 */
	public static RadiationSafetyProgram findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyProgramException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radiation safety program where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching radiation safety program, or <code>null</code> if a matching radiation safety program could not be found
	 */
	public static RadiationSafetyProgram fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the radiation safety program where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching radiation safety program, or <code>null</code> if a matching radiation safety program could not be found
	 */
	public static RadiationSafetyProgram fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the radiation safety program where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the radiation safety program that was removed
	 */
	public static RadiationSafetyProgram removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyProgramException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of radiation safety programs where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching radiation safety programs
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the radiation safety program in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyProgram the radiation safety program
	 */
	public static void cacheResult(
		RadiationSafetyProgram radiationSafetyProgram) {

		getPersistence().cacheResult(radiationSafetyProgram);
	}

	/**
	 * Caches the radiation safety programs in the entity cache if it is enabled.
	 *
	 * @param radiationSafetyPrograms the radiation safety programs
	 */
	public static void cacheResult(
		List<RadiationSafetyProgram> radiationSafetyPrograms) {

		getPersistence().cacheResult(radiationSafetyPrograms);
	}

	/**
	 * Creates a new radiation safety program with the primary key. Does not add the radiation safety program to the database.
	 *
	 * @param radiationSafetyProgramId the primary key for the new radiation safety program
	 * @return the new radiation safety program
	 */
	public static RadiationSafetyProgram create(long radiationSafetyProgramId) {
		return getPersistence().create(radiationSafetyProgramId);
	}

	/**
	 * Removes the radiation safety program with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program that was removed
	 * @throws NoSuchRadiationSafetyProgramException if a radiation safety program with the primary key could not be found
	 */
	public static RadiationSafetyProgram remove(long radiationSafetyProgramId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyProgramException {

		return getPersistence().remove(radiationSafetyProgramId);
	}

	public static RadiationSafetyProgram updateImpl(
		RadiationSafetyProgram radiationSafetyProgram) {

		return getPersistence().updateImpl(radiationSafetyProgram);
	}

	/**
	 * Returns the radiation safety program with the primary key or throws a <code>NoSuchRadiationSafetyProgramException</code> if it could not be found.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program
	 * @throws NoSuchRadiationSafetyProgramException if a radiation safety program with the primary key could not be found
	 */
	public static RadiationSafetyProgram findByPrimaryKey(
			long radiationSafetyProgramId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchRadiationSafetyProgramException {

		return getPersistence().findByPrimaryKey(radiationSafetyProgramId);
	}

	/**
	 * Returns the radiation safety program with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param radiationSafetyProgramId the primary key of the radiation safety program
	 * @return the radiation safety program, or <code>null</code> if a radiation safety program with the primary key could not be found
	 */
	public static RadiationSafetyProgram fetchByPrimaryKey(
		long radiationSafetyProgramId) {

		return getPersistence().fetchByPrimaryKey(radiationSafetyProgramId);
	}

	/**
	 * Returns all the radiation safety programs.
	 *
	 * @return the radiation safety programs
	 */
	public static List<RadiationSafetyProgram> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @return the range of radiation safety programs
	 */
	public static List<RadiationSafetyProgram> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of radiation safety programs
	 */
	public static List<RadiationSafetyProgram> findAll(
		int start, int end,
		OrderByComparator<RadiationSafetyProgram> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the radiation safety programs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RadiationSafetyProgramModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of radiation safety programs
	 * @param end the upper bound of the range of radiation safety programs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of radiation safety programs
	 */
	public static List<RadiationSafetyProgram> findAll(
		int start, int end,
		OrderByComparator<RadiationSafetyProgram> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the radiation safety programs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of radiation safety programs.
	 *
	 * @return the number of radiation safety programs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RadiationSafetyProgramPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		RadiationSafetyProgramPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile RadiationSafetyProgramPersistence _persistence;

}