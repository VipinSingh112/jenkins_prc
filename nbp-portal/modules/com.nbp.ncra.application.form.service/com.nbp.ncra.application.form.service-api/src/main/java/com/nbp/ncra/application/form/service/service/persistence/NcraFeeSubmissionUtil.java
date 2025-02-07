/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncra.application.form.service.model.NcraFeeSubmission;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncra fee submission service. This utility wraps <code>com.nbp.ncra.application.form.service.service.persistence.impl.NcraFeeSubmissionPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraFeeSubmissionPersistence
 * @generated
 */
public class NcraFeeSubmissionUtil {

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
	public static void clearCache(NcraFeeSubmission ncraFeeSubmission) {
		getPersistence().clearCache(ncraFeeSubmission);
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
	public static Map<Serializable, NcraFeeSubmission> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcraFeeSubmission> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcraFeeSubmission> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcraFeeSubmission> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcraFeeSubmission> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcraFeeSubmission update(
		NcraFeeSubmission ncraFeeSubmission) {

		return getPersistence().update(ncraFeeSubmission);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcraFeeSubmission update(
		NcraFeeSubmission ncraFeeSubmission, ServiceContext serviceContext) {

		return getPersistence().update(ncraFeeSubmission, serviceContext);
	}

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or throws a <code>NoSuchNcraFeeSubmissionException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra fee submission
	 * @throws NoSuchNcraFeeSubmissionException if a matching ncra fee submission could not be found
	 */
	public static NcraFeeSubmission findBygetNcraFee_By_NCRA_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraFeeSubmissionException {

		return getPersistence().findBygetNcraFee_By_NCRA_Id(ncraApplicationId);
	}

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra fee submission, or <code>null</code> if a matching ncra fee submission could not be found
	 */
	public static NcraFeeSubmission fetchBygetNcraFee_By_NCRA_Id(
		long ncraApplicationId) {

		return getPersistence().fetchBygetNcraFee_By_NCRA_Id(ncraApplicationId);
	}

	/**
	 * Returns the ncra fee submission where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra fee submission, or <code>null</code> if a matching ncra fee submission could not be found
	 */
	public static NcraFeeSubmission fetchBygetNcraFee_By_NCRA_Id(
		long ncraApplicationId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcraFee_By_NCRA_Id(
			ncraApplicationId, useFinderCache);
	}

	/**
	 * Removes the ncra fee submission where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra fee submission that was removed
	 */
	public static NcraFeeSubmission removeBygetNcraFee_By_NCRA_Id(
			long ncraApplicationId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraFeeSubmissionException {

		return getPersistence().removeBygetNcraFee_By_NCRA_Id(
			ncraApplicationId);
	}

	/**
	 * Returns the number of ncra fee submissions where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra fee submissions
	 */
	public static int countBygetNcraFee_By_NCRA_Id(long ncraApplicationId) {
		return getPersistence().countBygetNcraFee_By_NCRA_Id(ncraApplicationId);
	}

	/**
	 * Caches the ncra fee submission in the entity cache if it is enabled.
	 *
	 * @param ncraFeeSubmission the ncra fee submission
	 */
	public static void cacheResult(NcraFeeSubmission ncraFeeSubmission) {
		getPersistence().cacheResult(ncraFeeSubmission);
	}

	/**
	 * Caches the ncra fee submissions in the entity cache if it is enabled.
	 *
	 * @param ncraFeeSubmissions the ncra fee submissions
	 */
	public static void cacheResult(List<NcraFeeSubmission> ncraFeeSubmissions) {
		getPersistence().cacheResult(ncraFeeSubmissions);
	}

	/**
	 * Creates a new ncra fee submission with the primary key. Does not add the ncra fee submission to the database.
	 *
	 * @param ncraFeeSubmissionId the primary key for the new ncra fee submission
	 * @return the new ncra fee submission
	 */
	public static NcraFeeSubmission create(long ncraFeeSubmissionId) {
		return getPersistence().create(ncraFeeSubmissionId);
	}

	/**
	 * Removes the ncra fee submission with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission that was removed
	 * @throws NoSuchNcraFeeSubmissionException if a ncra fee submission with the primary key could not be found
	 */
	public static NcraFeeSubmission remove(long ncraFeeSubmissionId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraFeeSubmissionException {

		return getPersistence().remove(ncraFeeSubmissionId);
	}

	public static NcraFeeSubmission updateImpl(
		NcraFeeSubmission ncraFeeSubmission) {

		return getPersistence().updateImpl(ncraFeeSubmission);
	}

	/**
	 * Returns the ncra fee submission with the primary key or throws a <code>NoSuchNcraFeeSubmissionException</code> if it could not be found.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission
	 * @throws NoSuchNcraFeeSubmissionException if a ncra fee submission with the primary key could not be found
	 */
	public static NcraFeeSubmission findByPrimaryKey(long ncraFeeSubmissionId)
		throws com.nbp.ncra.application.form.service.exception.
			NoSuchNcraFeeSubmissionException {

		return getPersistence().findByPrimaryKey(ncraFeeSubmissionId);
	}

	/**
	 * Returns the ncra fee submission with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraFeeSubmissionId the primary key of the ncra fee submission
	 * @return the ncra fee submission, or <code>null</code> if a ncra fee submission with the primary key could not be found
	 */
	public static NcraFeeSubmission fetchByPrimaryKey(
		long ncraFeeSubmissionId) {

		return getPersistence().fetchByPrimaryKey(ncraFeeSubmissionId);
	}

	/**
	 * Returns all the ncra fee submissions.
	 *
	 * @return the ncra fee submissions
	 */
	public static List<NcraFeeSubmission> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @return the range of ncra fee submissions
	 */
	public static List<NcraFeeSubmission> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra fee submissions
	 */
	public static List<NcraFeeSubmission> findAll(
		int start, int end,
		OrderByComparator<NcraFeeSubmission> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncra fee submissions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraFeeSubmissionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra fee submissions
	 * @param end the upper bound of the range of ncra fee submissions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra fee submissions
	 */
	public static List<NcraFeeSubmission> findAll(
		int start, int end,
		OrderByComparator<NcraFeeSubmission> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncra fee submissions from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncra fee submissions.
	 *
	 * @return the number of ncra fee submissions
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcraFeeSubmissionPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcraFeeSubmissionPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcraFeeSubmissionPersistence _persistence;

}