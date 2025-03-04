/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.osi.insolvency.application.form.services.model.AssessmentIndividualPersonalDetails;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the assessment individual personal details service. This utility wraps <code>com.nbp.osi.insolvency.application.form.services.service.persistence.impl.AssessmentIndividualPersonalDetailsPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AssessmentIndividualPersonalDetailsPersistence
 * @generated
 */
public class AssessmentIndividualPersonalDetailsUtil {

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
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		getPersistence().clearCache(assessmentIndividualPersonalDetails);
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
	public static Map<Serializable, AssessmentIndividualPersonalDetails>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AssessmentIndividualPersonalDetails>
		findWithDynamicQuery(DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AssessmentIndividualPersonalDetails>
		findWithDynamicQuery(DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AssessmentIndividualPersonalDetails>
		findWithDynamicQuery(
			DynamicQuery dynamicQuery, int start, int end,
			OrderByComparator<AssessmentIndividualPersonalDetails>
				orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AssessmentIndividualPersonalDetails update(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		return getPersistence().update(assessmentIndividualPersonalDetails);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AssessmentIndividualPersonalDetails update(
		AssessmentIndividualPersonalDetails assessmentIndividualPersonalDetails,
		ServiceContext serviceContext) {

		return getPersistence().update(
			assessmentIndividualPersonalDetails, serviceContext);
	}

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or throws a <code>NoSuchAssessmentIndividualPersonalDetailsException</code> if it could not be found.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assessment individual personal details
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a matching assessment individual personal details could not be found
	 */
	public static AssessmentIndividualPersonalDetails findBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssessmentIndividualPersonalDetailsException {

		return getPersistence().findBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the matching assessment individual personal details, or <code>null</code> if a matching assessment individual personal details could not be found
	 */
	public static AssessmentIndividualPersonalDetails fetchBygetOsiById(
		long osiInsolvencyId) {

		return getPersistence().fetchBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the assessment individual personal details where osiInsolvencyId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching assessment individual personal details, or <code>null</code> if a matching assessment individual personal details could not be found
	 */
	public static AssessmentIndividualPersonalDetails fetchBygetOsiById(
		long osiInsolvencyId, boolean useFinderCache) {

		return getPersistence().fetchBygetOsiById(
			osiInsolvencyId, useFinderCache);
	}

	/**
	 * Removes the assessment individual personal details where osiInsolvencyId = &#63; from the database.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the assessment individual personal details that was removed
	 */
	public static AssessmentIndividualPersonalDetails removeBygetOsiById(
			long osiInsolvencyId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssessmentIndividualPersonalDetailsException {

		return getPersistence().removeBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Returns the number of assessment individual personal detailses where osiInsolvencyId = &#63;.
	 *
	 * @param osiInsolvencyId the osi insolvency ID
	 * @return the number of matching assessment individual personal detailses
	 */
	public static int countBygetOsiById(long osiInsolvencyId) {
		return getPersistence().countBygetOsiById(osiInsolvencyId);
	}

	/**
	 * Caches the assessment individual personal details in the entity cache if it is enabled.
	 *
	 * @param assessmentIndividualPersonalDetails the assessment individual personal details
	 */
	public static void cacheResult(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		getPersistence().cacheResult(assessmentIndividualPersonalDetails);
	}

	/**
	 * Caches the assessment individual personal detailses in the entity cache if it is enabled.
	 *
	 * @param assessmentIndividualPersonalDetailses the assessment individual personal detailses
	 */
	public static void cacheResult(
		List<AssessmentIndividualPersonalDetails>
			assessmentIndividualPersonalDetailses) {

		getPersistence().cacheResult(assessmentIndividualPersonalDetailses);
	}

	/**
	 * Creates a new assessment individual personal details with the primary key. Does not add the assessment individual personal details to the database.
	 *
	 * @param assessmentDetailsId the primary key for the new assessment individual personal details
	 * @return the new assessment individual personal details
	 */
	public static AssessmentIndividualPersonalDetails create(
		long assessmentDetailsId) {

		return getPersistence().create(assessmentDetailsId);
	}

	/**
	 * Removes the assessment individual personal details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details that was removed
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a assessment individual personal details with the primary key could not be found
	 */
	public static AssessmentIndividualPersonalDetails remove(
			long assessmentDetailsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssessmentIndividualPersonalDetailsException {

		return getPersistence().remove(assessmentDetailsId);
	}

	public static AssessmentIndividualPersonalDetails updateImpl(
		AssessmentIndividualPersonalDetails
			assessmentIndividualPersonalDetails) {

		return getPersistence().updateImpl(assessmentIndividualPersonalDetails);
	}

	/**
	 * Returns the assessment individual personal details with the primary key or throws a <code>NoSuchAssessmentIndividualPersonalDetailsException</code> if it could not be found.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details
	 * @throws NoSuchAssessmentIndividualPersonalDetailsException if a assessment individual personal details with the primary key could not be found
	 */
	public static AssessmentIndividualPersonalDetails findByPrimaryKey(
			long assessmentDetailsId)
		throws com.nbp.osi.insolvency.application.form.services.exception.
			NoSuchAssessmentIndividualPersonalDetailsException {

		return getPersistence().findByPrimaryKey(assessmentDetailsId);
	}

	/**
	 * Returns the assessment individual personal details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param assessmentDetailsId the primary key of the assessment individual personal details
	 * @return the assessment individual personal details, or <code>null</code> if a assessment individual personal details with the primary key could not be found
	 */
	public static AssessmentIndividualPersonalDetails fetchByPrimaryKey(
		long assessmentDetailsId) {

		return getPersistence().fetchByPrimaryKey(assessmentDetailsId);
	}

	/**
	 * Returns all the assessment individual personal detailses.
	 *
	 * @return the assessment individual personal detailses
	 */
	public static List<AssessmentIndividualPersonalDetails> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @return the range of assessment individual personal detailses
	 */
	public static List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of assessment individual personal detailses
	 */
	public static List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end,
		OrderByComparator<AssessmentIndividualPersonalDetails>
			orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the assessment individual personal detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AssessmentIndividualPersonalDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of assessment individual personal detailses
	 * @param end the upper bound of the range of assessment individual personal detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of assessment individual personal detailses
	 */
	public static List<AssessmentIndividualPersonalDetails> findAll(
		int start, int end,
		OrderByComparator<AssessmentIndividualPersonalDetails>
			orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the assessment individual personal detailses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of assessment individual personal detailses.
	 *
	 * @return the number of assessment individual personal detailses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AssessmentIndividualPersonalDetailsPersistence
		getPersistence() {

		return _persistence;
	}

	public static void setPersistence(
		AssessmentIndividualPersonalDetailsPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile AssessmentIndividualPersonalDetailsPersistence
		_persistence;

}