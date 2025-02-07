/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.sez.status.application.form.service.model.SezDevProposedProject;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the sez dev proposed project service. This utility wraps <code>com.nbp.sez.status.application.form.service.service.persistence.impl.SezDevProposedProjectPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDevProposedProjectPersistence
 * @generated
 */
public class SezDevProposedProjectUtil {

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
	public static void clearCache(SezDevProposedProject sezDevProposedProject) {
		getPersistence().clearCache(sezDevProposedProject);
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
	public static Map<Serializable, SezDevProposedProject> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<SezDevProposedProject> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<SezDevProposedProject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<SezDevProposedProject> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<SezDevProposedProject> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static SezDevProposedProject update(
		SezDevProposedProject sezDevProposedProject) {

		return getPersistence().update(sezDevProposedProject);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static SezDevProposedProject update(
		SezDevProposedProject sezDevProposedProject,
		ServiceContext serviceContext) {

		return getPersistence().update(sezDevProposedProject, serviceContext);
	}

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevProposedProjectException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev proposed project
	 * @throws NoSuchSezDevProposedProjectException if a matching sez dev proposed project could not be found
	 */
	public static SezDevProposedProject findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectException {

		return getPersistence().findBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev proposed project, or <code>null</code> if a matching sez dev proposed project could not be found
	 */
	public static SezDevProposedProject fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the sez dev proposed project where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev proposed project, or <code>null</code> if a matching sez dev proposed project could not be found
	 */
	public static SezDevProposedProject fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetSezStatusByAppId(
			sezStatusApplicationId, useFinderCache);
	}

	/**
	 * Removes the sez dev proposed project where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev proposed project that was removed
	 */
	public static SezDevProposedProject removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectException {

		return getPersistence().removeBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Returns the number of sez dev proposed projects where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev proposed projects
	 */
	public static int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		return getPersistence().countBygetSezStatusByAppId(
			sezStatusApplicationId);
	}

	/**
	 * Caches the sez dev proposed project in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProject the sez dev proposed project
	 */
	public static void cacheResult(
		SezDevProposedProject sezDevProposedProject) {

		getPersistence().cacheResult(sezDevProposedProject);
	}

	/**
	 * Caches the sez dev proposed projects in the entity cache if it is enabled.
	 *
	 * @param sezDevProposedProjects the sez dev proposed projects
	 */
	public static void cacheResult(
		List<SezDevProposedProject> sezDevProposedProjects) {

		getPersistence().cacheResult(sezDevProposedProjects);
	}

	/**
	 * Creates a new sez dev proposed project with the primary key. Does not add the sez dev proposed project to the database.
	 *
	 * @param sezDevProposedProjectId the primary key for the new sez dev proposed project
	 * @return the new sez dev proposed project
	 */
	public static SezDevProposedProject create(long sezDevProposedProjectId) {
		return getPersistence().create(sezDevProposedProjectId);
	}

	/**
	 * Removes the sez dev proposed project with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project that was removed
	 * @throws NoSuchSezDevProposedProjectException if a sez dev proposed project with the primary key could not be found
	 */
	public static SezDevProposedProject remove(long sezDevProposedProjectId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectException {

		return getPersistence().remove(sezDevProposedProjectId);
	}

	public static SezDevProposedProject updateImpl(
		SezDevProposedProject sezDevProposedProject) {

		return getPersistence().updateImpl(sezDevProposedProject);
	}

	/**
	 * Returns the sez dev proposed project with the primary key or throws a <code>NoSuchSezDevProposedProjectException</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project
	 * @throws NoSuchSezDevProposedProjectException if a sez dev proposed project with the primary key could not be found
	 */
	public static SezDevProposedProject findByPrimaryKey(
			long sezDevProposedProjectId)
		throws com.nbp.sez.status.application.form.service.exception.
			NoSuchSezDevProposedProjectException {

		return getPersistence().findByPrimaryKey(sezDevProposedProjectId);
	}

	/**
	 * Returns the sez dev proposed project with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevProposedProjectId the primary key of the sez dev proposed project
	 * @return the sez dev proposed project, or <code>null</code> if a sez dev proposed project with the primary key could not be found
	 */
	public static SezDevProposedProject fetchByPrimaryKey(
		long sezDevProposedProjectId) {

		return getPersistence().fetchByPrimaryKey(sezDevProposedProjectId);
	}

	/**
	 * Returns all the sez dev proposed projects.
	 *
	 * @return the sez dev proposed projects
	 */
	public static List<SezDevProposedProject> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @return the range of sez dev proposed projects
	 */
	public static List<SezDevProposedProject> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev proposed projects
	 */
	public static List<SezDevProposedProject> findAll(
		int start, int end,
		OrderByComparator<SezDevProposedProject> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the sez dev proposed projects.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevProposedProjectModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev proposed projects
	 * @param end the upper bound of the range of sez dev proposed projects (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev proposed projects
	 */
	public static List<SezDevProposedProject> findAll(
		int start, int end,
		OrderByComparator<SezDevProposedProject> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the sez dev proposed projects from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of sez dev proposed projects.
	 *
	 * @return the number of sez dev proposed projects
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SezDevProposedProjectPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		SezDevProposedProjectPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile SezDevProposedProjectPersistence _persistence;

}