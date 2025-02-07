/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.ncbj.stages.services.model.NcbjPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the ncbj payment confirmation service. This utility wraps <code>com.nbp.ncbj.stages.services.service.persistence.impl.NcbjPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjPaymentConfirmationPersistence
 * @generated
 */
public class NcbjPaymentConfirmationUtil {

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
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		getPersistence().clearCache(ncbjPaymentConfirmation);
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
	public static Map<Serializable, NcbjPaymentConfirmation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<NcbjPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NcbjPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NcbjPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NcbjPaymentConfirmation update(
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		return getPersistence().update(ncbjPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NcbjPaymentConfirmation update(
		NcbjPaymentConfirmation ncbjPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(ncbjPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or throws a <code>NoSuchNcbjPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	public static NcbjPaymentConfirmation findBygetNcbjPaymentConfBy_CI(
			String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return getPersistence().findBygetNcbjPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	public static NcbjPaymentConfirmation fetchBygetNcbjPaymentConfBy_CI(
		String caseId) {

		return getPersistence().fetchBygetNcbjPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the ncbj payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	public static NcbjPaymentConfirmation fetchBygetNcbjPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetNcbjPaymentConfBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the ncbj payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj payment confirmation that was removed
	 */
	public static NcbjPaymentConfirmation removeBygetNcbjPaymentConfBy_CI(
			String caseId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return getPersistence().removeBygetNcbjPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the number of ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj payment confirmations
	 */
	public static int countBygetNcbjPaymentConfBy_CI(String caseId) {
		return getPersistence().countBygetNcbjPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId) {

		return getPersistence().findBygetNcbjPayConfBy_CI(caseId);
	}

	/**
	 * Returns a range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @return the range of matching ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetNcbjPayConfBy_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetNcbjPayConfBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> findBygetNcbjPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetNcbjPayConfBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	public static NcbjPaymentConfirmation findBygetNcbjPayConfBy_CI_First(
			String caseId,
			OrderByComparator<NcbjPaymentConfirmation> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return getPersistence().findBygetNcbjPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	public static NcbjPaymentConfirmation fetchBygetNcbjPayConfBy_CI_First(
		String caseId,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetNcbjPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a matching ncbj payment confirmation could not be found
	 */
	public static NcbjPaymentConfirmation findBygetNcbjPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<NcbjPaymentConfirmation> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return getPersistence().findBygetNcbjPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj payment confirmation, or <code>null</code> if a matching ncbj payment confirmation could not be found
	 */
	public static NcbjPaymentConfirmation fetchBygetNcbjPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetNcbjPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the ncbj payment confirmations before and after the current ncbj payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the current ncbj payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	public static NcbjPaymentConfirmation[]
			findBygetNcbjPayConfBy_CI_PrevAndNext(
				long ncbjPaymentConfirmationId, String caseId,
				OrderByComparator<NcbjPaymentConfirmation> orderByComparator)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return getPersistence().findBygetNcbjPayConfBy_CI_PrevAndNext(
			ncbjPaymentConfirmationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the ncbj payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetNcbjPayConfBy_CI(String caseId) {
		getPersistence().removeBygetNcbjPayConfBy_CI(caseId);
	}

	/**
	 * Returns the number of ncbj payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj payment confirmations
	 */
	public static int countBygetNcbjPayConfBy_CI(String caseId) {
		return getPersistence().countBygetNcbjPayConfBy_CI(caseId);
	}

	/**
	 * Caches the ncbj payment confirmation in the entity cache if it is enabled.
	 *
	 * @param ncbjPaymentConfirmation the ncbj payment confirmation
	 */
	public static void cacheResult(
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		getPersistence().cacheResult(ncbjPaymentConfirmation);
	}

	/**
	 * Caches the ncbj payment confirmations in the entity cache if it is enabled.
	 *
	 * @param ncbjPaymentConfirmations the ncbj payment confirmations
	 */
	public static void cacheResult(
		List<NcbjPaymentConfirmation> ncbjPaymentConfirmations) {

		getPersistence().cacheResult(ncbjPaymentConfirmations);
	}

	/**
	 * Creates a new ncbj payment confirmation with the primary key. Does not add the ncbj payment confirmation to the database.
	 *
	 * @param ncbjPaymentConfirmationId the primary key for the new ncbj payment confirmation
	 * @return the new ncbj payment confirmation
	 */
	public static NcbjPaymentConfirmation create(
		long ncbjPaymentConfirmationId) {

		return getPersistence().create(ncbjPaymentConfirmationId);
	}

	/**
	 * Removes the ncbj payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation that was removed
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	public static NcbjPaymentConfirmation remove(long ncbjPaymentConfirmationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return getPersistence().remove(ncbjPaymentConfirmationId);
	}

	public static NcbjPaymentConfirmation updateImpl(
		NcbjPaymentConfirmation ncbjPaymentConfirmation) {

		return getPersistence().updateImpl(ncbjPaymentConfirmation);
	}

	/**
	 * Returns the ncbj payment confirmation with the primary key or throws a <code>NoSuchNcbjPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation
	 * @throws NoSuchNcbjPaymentConfirmationException if a ncbj payment confirmation with the primary key could not be found
	 */
	public static NcbjPaymentConfirmation findByPrimaryKey(
			long ncbjPaymentConfirmationId)
		throws com.nbp.ncbj.stages.services.exception.
			NoSuchNcbjPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(ncbjPaymentConfirmationId);
	}

	/**
	 * Returns the ncbj payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjPaymentConfirmationId the primary key of the ncbj payment confirmation
	 * @return the ncbj payment confirmation, or <code>null</code> if a ncbj payment confirmation with the primary key could not be found
	 */
	public static NcbjPaymentConfirmation fetchByPrimaryKey(
		long ncbjPaymentConfirmationId) {

		return getPersistence().fetchByPrimaryKey(ncbjPaymentConfirmationId);
	}

	/**
	 * Returns all the ncbj payment confirmations.
	 *
	 * @return the ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @return the range of ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the ncbj payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj payment confirmations
	 * @param end the upper bound of the range of ncbj payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj payment confirmations
	 */
	public static List<NcbjPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<NcbjPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the ncbj payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of ncbj payment confirmations.
	 *
	 * @return the number of ncbj payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NcbjPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		NcbjPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile NcbjPaymentConfirmationPersistence _persistence;

}