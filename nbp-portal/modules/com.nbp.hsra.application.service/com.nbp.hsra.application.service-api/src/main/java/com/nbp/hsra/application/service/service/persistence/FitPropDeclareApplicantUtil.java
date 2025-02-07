/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.hsra.application.service.model.FitPropDeclareApplicant;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the fit prop declare applicant service. This utility wraps <code>com.nbp.hsra.application.service.service.persistence.impl.FitPropDeclareApplicantPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FitPropDeclareApplicantPersistence
 * @generated
 */
public class FitPropDeclareApplicantUtil {

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
		FitPropDeclareApplicant fitPropDeclareApplicant) {

		getPersistence().clearCache(fitPropDeclareApplicant);
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
	public static Map<Serializable, FitPropDeclareApplicant> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<FitPropDeclareApplicant> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<FitPropDeclareApplicant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<FitPropDeclareApplicant> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<FitPropDeclareApplicant> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static FitPropDeclareApplicant update(
		FitPropDeclareApplicant fitPropDeclareApplicant) {

		return getPersistence().update(fitPropDeclareApplicant);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static FitPropDeclareApplicant update(
		FitPropDeclareApplicant fitPropDeclareApplicant,
		ServiceContext serviceContext) {

		return getPersistence().update(fitPropDeclareApplicant, serviceContext);
	}

	/**
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or throws a <code>NoSuchFitPropDeclareApplicantException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop declare applicant
	 * @throws NoSuchFitPropDeclareApplicantException if a matching fit prop declare applicant could not be found
	 */
	public static FitPropDeclareApplicant findBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropDeclareApplicantException {

		return getPersistence().findBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching fit prop declare applicant, or <code>null</code> if a matching fit prop declare applicant could not be found
	 */
	public static FitPropDeclareApplicant fetchBygetHsraById(
		long hsraApplicationId) {

		return getPersistence().fetchBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the fit prop declare applicant where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fit prop declare applicant, or <code>null</code> if a matching fit prop declare applicant could not be found
	 */
	public static FitPropDeclareApplicant fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetHsraById(
			hsraApplicationId, useFinderCache);
	}

	/**
	 * Removes the fit prop declare applicant where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the fit prop declare applicant that was removed
	 */
	public static FitPropDeclareApplicant removeBygetHsraById(
			long hsraApplicationId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropDeclareApplicantException {

		return getPersistence().removeBygetHsraById(hsraApplicationId);
	}

	/**
	 * Returns the number of fit prop declare applicants where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching fit prop declare applicants
	 */
	public static int countBygetHsraById(long hsraApplicationId) {
		return getPersistence().countBygetHsraById(hsraApplicationId);
	}

	/**
	 * Caches the fit prop declare applicant in the entity cache if it is enabled.
	 *
	 * @param fitPropDeclareApplicant the fit prop declare applicant
	 */
	public static void cacheResult(
		FitPropDeclareApplicant fitPropDeclareApplicant) {

		getPersistence().cacheResult(fitPropDeclareApplicant);
	}

	/**
	 * Caches the fit prop declare applicants in the entity cache if it is enabled.
	 *
	 * @param fitPropDeclareApplicants the fit prop declare applicants
	 */
	public static void cacheResult(
		List<FitPropDeclareApplicant> fitPropDeclareApplicants) {

		getPersistence().cacheResult(fitPropDeclareApplicants);
	}

	/**
	 * Creates a new fit prop declare applicant with the primary key. Does not add the fit prop declare applicant to the database.
	 *
	 * @param fitPropDeclareApplicantId the primary key for the new fit prop declare applicant
	 * @return the new fit prop declare applicant
	 */
	public static FitPropDeclareApplicant create(
		long fitPropDeclareApplicantId) {

		return getPersistence().create(fitPropDeclareApplicantId);
	}

	/**
	 * Removes the fit prop declare applicant with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant that was removed
	 * @throws NoSuchFitPropDeclareApplicantException if a fit prop declare applicant with the primary key could not be found
	 */
	public static FitPropDeclareApplicant remove(long fitPropDeclareApplicantId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropDeclareApplicantException {

		return getPersistence().remove(fitPropDeclareApplicantId);
	}

	public static FitPropDeclareApplicant updateImpl(
		FitPropDeclareApplicant fitPropDeclareApplicant) {

		return getPersistence().updateImpl(fitPropDeclareApplicant);
	}

	/**
	 * Returns the fit prop declare applicant with the primary key or throws a <code>NoSuchFitPropDeclareApplicantException</code> if it could not be found.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant
	 * @throws NoSuchFitPropDeclareApplicantException if a fit prop declare applicant with the primary key could not be found
	 */
	public static FitPropDeclareApplicant findByPrimaryKey(
			long fitPropDeclareApplicantId)
		throws com.nbp.hsra.application.service.exception.
			NoSuchFitPropDeclareApplicantException {

		return getPersistence().findByPrimaryKey(fitPropDeclareApplicantId);
	}

	/**
	 * Returns the fit prop declare applicant with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fitPropDeclareApplicantId the primary key of the fit prop declare applicant
	 * @return the fit prop declare applicant, or <code>null</code> if a fit prop declare applicant with the primary key could not be found
	 */
	public static FitPropDeclareApplicant fetchByPrimaryKey(
		long fitPropDeclareApplicantId) {

		return getPersistence().fetchByPrimaryKey(fitPropDeclareApplicantId);
	}

	/**
	 * Returns all the fit prop declare applicants.
	 *
	 * @return the fit prop declare applicants
	 */
	public static List<FitPropDeclareApplicant> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @return the range of fit prop declare applicants
	 */
	public static List<FitPropDeclareApplicant> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fit prop declare applicants
	 */
	public static List<FitPropDeclareApplicant> findAll(
		int start, int end,
		OrderByComparator<FitPropDeclareApplicant> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fit prop declare applicants.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FitPropDeclareApplicantModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fit prop declare applicants
	 * @param end the upper bound of the range of fit prop declare applicants (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fit prop declare applicants
	 */
	public static List<FitPropDeclareApplicant> findAll(
		int start, int end,
		OrderByComparator<FitPropDeclareApplicant> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fit prop declare applicants from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fit prop declare applicants.
	 *
	 * @return the number of fit prop declare applicants
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FitPropDeclareApplicantPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		FitPropDeclareApplicantPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile FitPropDeclareApplicantPersistence _persistence;

}