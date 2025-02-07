/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.application.form.services.model.CounsellingExperience;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the counselling experience service. This utility wraps <code>com.nbp.osi.application.form.services.service.persistence.impl.CounsellingExperiencePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CounsellingExperiencePersistence
 * @generated
 */
public class CounsellingExperienceUtil {

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
	public static void clearCache(CounsellingExperience counsellingExperience) {
		getPersistence().clearCache(counsellingExperience);
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
	public static Map<Serializable, CounsellingExperience> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CounsellingExperience> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CounsellingExperience> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CounsellingExperience> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CounsellingExperience update(
		CounsellingExperience counsellingExperience) {

		return getPersistence().update(counsellingExperience);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CounsellingExperience update(
		CounsellingExperience counsellingExperience,
		ServiceContext serviceContext) {

		return getPersistence().update(counsellingExperience, serviceContext);
	}

	/**
	 * Returns all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the matching counselling experiences
	 */
	public static List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId) {

		return getPersistence().findBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns a range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @return the range of matching counselling experiences
	 */
	public static List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end) {

		return getPersistence().findBygetOsiById(osiApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching counselling experiences
	 */
	public static List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		return getPersistence().findBygetOsiById(
			osiApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the counselling experiences where osiApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param osiApplicationId the osi application ID
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching counselling experiences
	 */
	public static List<CounsellingExperience> findBygetOsiById(
		long osiApplicationId, int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetOsiById(
			osiApplicationId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counselling experience
	 * @throws NoSuchCounsellingExperienceException if a matching counselling experience could not be found
	 */
	public static CounsellingExperience findBygetOsiById_First(
			long osiApplicationId,
			OrderByComparator<CounsellingExperience> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchCounsellingExperienceException {

		return getPersistence().findBygetOsiById_First(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the first counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching counselling experience, or <code>null</code> if a matching counselling experience could not be found
	 */
	public static CounsellingExperience fetchBygetOsiById_First(
		long osiApplicationId,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		return getPersistence().fetchBygetOsiById_First(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counselling experience
	 * @throws NoSuchCounsellingExperienceException if a matching counselling experience could not be found
	 */
	public static CounsellingExperience findBygetOsiById_Last(
			long osiApplicationId,
			OrderByComparator<CounsellingExperience> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchCounsellingExperienceException {

		return getPersistence().findBygetOsiById_Last(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the last counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching counselling experience, or <code>null</code> if a matching counselling experience could not be found
	 */
	public static CounsellingExperience fetchBygetOsiById_Last(
		long osiApplicationId,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		return getPersistence().fetchBygetOsiById_Last(
			osiApplicationId, orderByComparator);
	}

	/**
	 * Returns the counselling experiences before and after the current counselling experience in the ordered set where osiApplicationId = &#63;.
	 *
	 * @param counsellingExperienceId the primary key of the current counselling experience
	 * @param osiApplicationId the osi application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next counselling experience
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	public static CounsellingExperience[] findBygetOsiById_PrevAndNext(
			long counsellingExperienceId, long osiApplicationId,
			OrderByComparator<CounsellingExperience> orderByComparator)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchCounsellingExperienceException {

		return getPersistence().findBygetOsiById_PrevAndNext(
			counsellingExperienceId, osiApplicationId, orderByComparator);
	}

	/**
	 * Removes all the counselling experiences where osiApplicationId = &#63; from the database.
	 *
	 * @param osiApplicationId the osi application ID
	 */
	public static void removeBygetOsiById(long osiApplicationId) {
		getPersistence().removeBygetOsiById(osiApplicationId);
	}

	/**
	 * Returns the number of counselling experiences where osiApplicationId = &#63;.
	 *
	 * @param osiApplicationId the osi application ID
	 * @return the number of matching counselling experiences
	 */
	public static int countBygetOsiById(long osiApplicationId) {
		return getPersistence().countBygetOsiById(osiApplicationId);
	}

	/**
	 * Caches the counselling experience in the entity cache if it is enabled.
	 *
	 * @param counsellingExperience the counselling experience
	 */
	public static void cacheResult(
		CounsellingExperience counsellingExperience) {

		getPersistence().cacheResult(counsellingExperience);
	}

	/**
	 * Caches the counselling experiences in the entity cache if it is enabled.
	 *
	 * @param counsellingExperiences the counselling experiences
	 */
	public static void cacheResult(
		List<CounsellingExperience> counsellingExperiences) {

		getPersistence().cacheResult(counsellingExperiences);
	}

	/**
	 * Creates a new counselling experience with the primary key. Does not add the counselling experience to the database.
	 *
	 * @param counsellingExperienceId the primary key for the new counselling experience
	 * @return the new counselling experience
	 */
	public static CounsellingExperience create(long counsellingExperienceId) {
		return getPersistence().create(counsellingExperienceId);
	}

	/**
	 * Removes the counselling experience with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience that was removed
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	public static CounsellingExperience remove(long counsellingExperienceId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchCounsellingExperienceException {

		return getPersistence().remove(counsellingExperienceId);
	}

	public static CounsellingExperience updateImpl(
		CounsellingExperience counsellingExperience) {

		return getPersistence().updateImpl(counsellingExperience);
	}

	/**
	 * Returns the counselling experience with the primary key or throws a <code>NoSuchCounsellingExperienceException</code> if it could not be found.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience
	 * @throws NoSuchCounsellingExperienceException if a counselling experience with the primary key could not be found
	 */
	public static CounsellingExperience findByPrimaryKey(
			long counsellingExperienceId)
		throws com.nbp.osi.application.form.services.exception.
			NoSuchCounsellingExperienceException {

		return getPersistence().findByPrimaryKey(counsellingExperienceId);
	}

	/**
	 * Returns the counselling experience with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param counsellingExperienceId the primary key of the counselling experience
	 * @return the counselling experience, or <code>null</code> if a counselling experience with the primary key could not be found
	 */
	public static CounsellingExperience fetchByPrimaryKey(
		long counsellingExperienceId) {

		return getPersistence().fetchByPrimaryKey(counsellingExperienceId);
	}

	/**
	 * Returns all the counselling experiences.
	 *
	 * @return the counselling experiences
	 */
	public static List<CounsellingExperience> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @return the range of counselling experiences
	 */
	public static List<CounsellingExperience> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of counselling experiences
	 */
	public static List<CounsellingExperience> findAll(
		int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the counselling experiences.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CounsellingExperienceModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of counselling experiences
	 * @param end the upper bound of the range of counselling experiences (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of counselling experiences
	 */
	public static List<CounsellingExperience> findAll(
		int start, int end,
		OrderByComparator<CounsellingExperience> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the counselling experiences from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of counselling experiences.
	 *
	 * @return the number of counselling experiences
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static CounsellingExperiencePersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		CounsellingExperiencePersistence persistence) {

		_persistence = persistence;
	}

	private static volatile CounsellingExperiencePersistence _persistence;

}