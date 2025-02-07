/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jadsc.stage.services.model.JadscAppliReviewAndValid;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jadsc appli review and valid service. This utility wraps <code>com.nbp.jadsc.stage.services.service.persistence.impl.JadscAppliReviewAndValidPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JadscAppliReviewAndValidPersistence
 * @generated
 */
public class JadscAppliReviewAndValidUtil {

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
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		getPersistence().clearCache(jadscAppliReviewAndValid);
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
	public static Map<Serializable, JadscAppliReviewAndValid>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JadscAppliReviewAndValid> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JadscAppliReviewAndValid> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JadscAppliReviewAndValid> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JadscAppliReviewAndValid update(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		return getPersistence().update(jadscAppliReviewAndValid);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JadscAppliReviewAndValid update(
		JadscAppliReviewAndValid jadscAppliReviewAndValid,
		ServiceContext serviceContext) {

		return getPersistence().update(
			jadscAppliReviewAndValid, serviceContext);
	}

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or throws a <code>NoSuchJadscAppliReviewAndValidException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	public static JadscAppliReviewAndValid findBygetJadsc_RV_CI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return getPersistence().findBygetJadsc_RV_CI(caseId);
	}

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	public static JadscAppliReviewAndValid fetchBygetJadsc_RV_CI(
		String caseId) {

		return getPersistence().fetchBygetJadsc_RV_CI(caseId);
	}

	/**
	 * Returns the jadsc appli review and valid where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	public static JadscAppliReviewAndValid fetchBygetJadsc_RV_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJadsc_RV_CI(caseId, useFinderCache);
	}

	/**
	 * Removes the jadsc appli review and valid where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc appli review and valid that was removed
	 */
	public static JadscAppliReviewAndValid removeBygetJadsc_RV_CI(String caseId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return getPersistence().removeBygetJadsc_RV_CI(caseId);
	}

	/**
	 * Returns the number of jadsc appli review and valids where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc appli review and valids
	 */
	public static int countBygetJadsc_RV_CI(String caseId) {
		return getPersistence().countBygetJadsc_RV_CI(caseId);
	}

	/**
	 * Returns all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @return the matching jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication) {

		return getPersistence().findBygetJadsc_By_RV(versionOfApplication);
	}

	/**
	 * Returns a range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @return the range of matching jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end) {

		return getPersistence().findBygetJadsc_By_RV(
			versionOfApplication, start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		return getPersistence().findBygetJadsc_By_RV(
			versionOfApplication, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param versionOfApplication the version of application
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> findBygetJadsc_By_RV(
		String versionOfApplication, int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJadsc_By_RV(
			versionOfApplication, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	public static JadscAppliReviewAndValid findBygetJadsc_By_RV_First(
			String versionOfApplication,
			OrderByComparator<JadscAppliReviewAndValid> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return getPersistence().findBygetJadsc_By_RV_First(
			versionOfApplication, orderByComparator);
	}

	/**
	 * Returns the first jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	public static JadscAppliReviewAndValid fetchBygetJadsc_By_RV_First(
		String versionOfApplication,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_RV_First(
			versionOfApplication, orderByComparator);
	}

	/**
	 * Returns the last jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a matching jadsc appli review and valid could not be found
	 */
	public static JadscAppliReviewAndValid findBygetJadsc_By_RV_Last(
			String versionOfApplication,
			OrderByComparator<JadscAppliReviewAndValid> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return getPersistence().findBygetJadsc_By_RV_Last(
			versionOfApplication, orderByComparator);
	}

	/**
	 * Returns the last jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc appli review and valid, or <code>null</code> if a matching jadsc appli review and valid could not be found
	 */
	public static JadscAppliReviewAndValid fetchBygetJadsc_By_RV_Last(
		String versionOfApplication,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		return getPersistence().fetchBygetJadsc_By_RV_Last(
			versionOfApplication, orderByComparator);
	}

	/**
	 * Returns the jadsc appli review and valids before and after the current jadsc appli review and valid in the ordered set where versionOfApplication = &#63;.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the current jadsc appli review and valid
	 * @param versionOfApplication the version of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	public static JadscAppliReviewAndValid[] findBygetJadsc_By_RV_PrevAndNext(
			long jadscAppliReviewAndValidId, String versionOfApplication,
			OrderByComparator<JadscAppliReviewAndValid> orderByComparator)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return getPersistence().findBygetJadsc_By_RV_PrevAndNext(
			jadscAppliReviewAndValidId, versionOfApplication,
			orderByComparator);
	}

	/**
	 * Removes all the jadsc appli review and valids where versionOfApplication = &#63; from the database.
	 *
	 * @param versionOfApplication the version of application
	 */
	public static void removeBygetJadsc_By_RV(String versionOfApplication) {
		getPersistence().removeBygetJadsc_By_RV(versionOfApplication);
	}

	/**
	 * Returns the number of jadsc appli review and valids where versionOfApplication = &#63;.
	 *
	 * @param versionOfApplication the version of application
	 * @return the number of matching jadsc appli review and valids
	 */
	public static int countBygetJadsc_By_RV(String versionOfApplication) {
		return getPersistence().countBygetJadsc_By_RV(versionOfApplication);
	}

	/**
	 * Caches the jadsc appli review and valid in the entity cache if it is enabled.
	 *
	 * @param jadscAppliReviewAndValid the jadsc appli review and valid
	 */
	public static void cacheResult(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		getPersistence().cacheResult(jadscAppliReviewAndValid);
	}

	/**
	 * Caches the jadsc appli review and valids in the entity cache if it is enabled.
	 *
	 * @param jadscAppliReviewAndValids the jadsc appli review and valids
	 */
	public static void cacheResult(
		List<JadscAppliReviewAndValid> jadscAppliReviewAndValids) {

		getPersistence().cacheResult(jadscAppliReviewAndValids);
	}

	/**
	 * Creates a new jadsc appli review and valid with the primary key. Does not add the jadsc appli review and valid to the database.
	 *
	 * @param jadscAppliReviewAndValidId the primary key for the new jadsc appli review and valid
	 * @return the new jadsc appli review and valid
	 */
	public static JadscAppliReviewAndValid create(
		long jadscAppliReviewAndValidId) {

		return getPersistence().create(jadscAppliReviewAndValidId);
	}

	/**
	 * Removes the jadsc appli review and valid with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid that was removed
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	public static JadscAppliReviewAndValid remove(
			long jadscAppliReviewAndValidId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return getPersistence().remove(jadscAppliReviewAndValidId);
	}

	public static JadscAppliReviewAndValid updateImpl(
		JadscAppliReviewAndValid jadscAppliReviewAndValid) {

		return getPersistence().updateImpl(jadscAppliReviewAndValid);
	}

	/**
	 * Returns the jadsc appli review and valid with the primary key or throws a <code>NoSuchJadscAppliReviewAndValidException</code> if it could not be found.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid
	 * @throws NoSuchJadscAppliReviewAndValidException if a jadsc appli review and valid with the primary key could not be found
	 */
	public static JadscAppliReviewAndValid findByPrimaryKey(
			long jadscAppliReviewAndValidId)
		throws com.nbp.jadsc.stage.services.exception.
			NoSuchJadscAppliReviewAndValidException {

		return getPersistence().findByPrimaryKey(jadscAppliReviewAndValidId);
	}

	/**
	 * Returns the jadsc appli review and valid with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscAppliReviewAndValidId the primary key of the jadsc appli review and valid
	 * @return the jadsc appli review and valid, or <code>null</code> if a jadsc appli review and valid with the primary key could not be found
	 */
	public static JadscAppliReviewAndValid fetchByPrimaryKey(
		long jadscAppliReviewAndValidId) {

		return getPersistence().fetchByPrimaryKey(jadscAppliReviewAndValidId);
	}

	/**
	 * Returns all the jadsc appli review and valids.
	 *
	 * @return the jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @return the range of jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> findAll(
		int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jadsc appli review and valids.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JadscAppliReviewAndValidModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc appli review and valids
	 * @param end the upper bound of the range of jadsc appli review and valids (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc appli review and valids
	 */
	public static List<JadscAppliReviewAndValid> findAll(
		int start, int end,
		OrderByComparator<JadscAppliReviewAndValid> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jadsc appli review and valids from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jadsc appli review and valids.
	 *
	 * @return the number of jadsc appli review and valids
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JadscAppliReviewAndValidPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JadscAppliReviewAndValidPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JadscAppliReviewAndValidPersistence _persistence;

}