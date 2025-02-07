/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.miic.application.form.services.model.MiicApplicantDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the miic applicant details service. This utility wraps <code>com.nbp.miic.application.form.services.service.persistence.impl.MiicApplicantDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicApplicantDetailsPersistence
 * @generated
 */
public class MiicApplicantDetailsUtil {

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
	public static void clearCache(MiicApplicantDetails miicApplicantDetails) {
		getPersistence().clearCache(miicApplicantDetails);
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
	public static Map<Serializable, MiicApplicantDetails> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<MiicApplicantDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MiicApplicantDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MiicApplicantDetails> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MiicApplicantDetails> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MiicApplicantDetails update(
		MiicApplicantDetails miicApplicantDetails) {

		return getPersistence().update(miicApplicantDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MiicApplicantDetails update(
		MiicApplicantDetails miicApplicantDetails,
		ServiceContext serviceContext) {

		return getPersistence().update(miicApplicantDetails, serviceContext);
	}

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicantDetailsException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic applicant details
	 * @throws NoSuchMiicApplicantDetailsException if a matching miic applicant details could not be found
	 */
	public static MiicApplicantDetails findBygetMiicById(long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicantDetailsException {

		return getPersistence().findBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic applicant details, or <code>null</code> if a matching miic applicant details could not be found
	 */
	public static MiicApplicantDetails fetchBygetMiicById(
		long miicApplicationId) {

		return getPersistence().fetchBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns the miic applicant details where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic applicant details, or <code>null</code> if a matching miic applicant details could not be found
	 */
	public static MiicApplicantDetails fetchBygetMiicById(
		long miicApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetMiicById(
			miicApplicationId, useFinderCache);
	}

	/**
	 * Removes the miic applicant details where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic applicant details that was removed
	 */
	public static MiicApplicantDetails removeBygetMiicById(
			long miicApplicationId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicantDetailsException {

		return getPersistence().removeBygetMiicById(miicApplicationId);
	}

	/**
	 * Returns the number of miic applicant detailses where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic applicant detailses
	 */
	public static int countBygetMiicById(long miicApplicationId) {
		return getPersistence().countBygetMiicById(miicApplicationId);
	}

	/**
	 * Caches the miic applicant details in the entity cache if it is enabled.
	 *
	 * @param miicApplicantDetails the miic applicant details
	 */
	public static void cacheResult(MiicApplicantDetails miicApplicantDetails) {
		getPersistence().cacheResult(miicApplicantDetails);
	}

	/**
	 * Caches the miic applicant detailses in the entity cache if it is enabled.
	 *
	 * @param miicApplicantDetailses the miic applicant detailses
	 */
	public static void cacheResult(
		List<MiicApplicantDetails> miicApplicantDetailses) {

		getPersistence().cacheResult(miicApplicantDetailses);
	}

	/**
	 * Creates a new miic applicant details with the primary key. Does not add the miic applicant details to the database.
	 *
	 * @param miicApplicantDetailsId the primary key for the new miic applicant details
	 * @return the new miic applicant details
	 */
	public static MiicApplicantDetails create(long miicApplicantDetailsId) {
		return getPersistence().create(miicApplicantDetailsId);
	}

	/**
	 * Removes the miic applicant details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details that was removed
	 * @throws NoSuchMiicApplicantDetailsException if a miic applicant details with the primary key could not be found
	 */
	public static MiicApplicantDetails remove(long miicApplicantDetailsId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicantDetailsException {

		return getPersistence().remove(miicApplicantDetailsId);
	}

	public static MiicApplicantDetails updateImpl(
		MiicApplicantDetails miicApplicantDetails) {

		return getPersistence().updateImpl(miicApplicantDetails);
	}

	/**
	 * Returns the miic applicant details with the primary key or throws a <code>NoSuchMiicApplicantDetailsException</code> if it could not be found.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details
	 * @throws NoSuchMiicApplicantDetailsException if a miic applicant details with the primary key could not be found
	 */
	public static MiicApplicantDetails findByPrimaryKey(
			long miicApplicantDetailsId)
		throws com.nbp.miic.application.form.services.exception.
			NoSuchMiicApplicantDetailsException {

		return getPersistence().findByPrimaryKey(miicApplicantDetailsId);
	}

	/**
	 * Returns the miic applicant details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicantDetailsId the primary key of the miic applicant details
	 * @return the miic applicant details, or <code>null</code> if a miic applicant details with the primary key could not be found
	 */
	public static MiicApplicantDetails fetchByPrimaryKey(
		long miicApplicantDetailsId) {

		return getPersistence().fetchByPrimaryKey(miicApplicantDetailsId);
	}

	/**
	 * Returns all the miic applicant detailses.
	 *
	 * @return the miic applicant detailses
	 */
	public static List<MiicApplicantDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @return the range of miic applicant detailses
	 */
	public static List<MiicApplicantDetails> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic applicant detailses
	 */
	public static List<MiicApplicantDetails> findAll(
		int start, int end,
		OrderByComparator<MiicApplicantDetails> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the miic applicant detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicantDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applicant detailses
	 * @param end the upper bound of the range of miic applicant detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic applicant detailses
	 */
	public static List<MiicApplicantDetails> findAll(
		int start, int end,
		OrderByComparator<MiicApplicantDetails> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the miic applicant detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of miic applicant detailses.
	 *
	 * @return the number of miic applicant detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MiicApplicantDetailsPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		MiicApplicantDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile MiicApplicantDetailsPersistence _persistence;

}