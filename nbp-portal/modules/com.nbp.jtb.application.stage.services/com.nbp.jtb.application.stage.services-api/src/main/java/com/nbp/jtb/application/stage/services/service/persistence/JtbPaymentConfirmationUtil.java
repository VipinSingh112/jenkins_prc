/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.stage.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.jtb.application.stage.services.model.JtbPaymentConfirmation;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the jtb payment confirmation service. This utility wraps <code>com.nbp.jtb.application.stage.services.service.persistence.impl.JtbPaymentConfirmationPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbPaymentConfirmationPersistence
 * @generated
 */
public class JtbPaymentConfirmationUtil {

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
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		getPersistence().clearCache(jtbPaymentConfirmation);
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
	public static Map<Serializable, JtbPaymentConfirmation> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JtbPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JtbPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JtbPaymentConfirmation> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JtbPaymentConfirmation update(
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		return getPersistence().update(jtbPaymentConfirmation);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JtbPaymentConfirmation update(
		JtbPaymentConfirmation jtbPaymentConfirmation,
		ServiceContext serviceContext) {

		return getPersistence().update(jtbPaymentConfirmation, serviceContext);
	}

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or throws a <code>NoSuchJtbPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	public static JtbPaymentConfirmation findBygetJtbPaymentConfBy_CI(
			String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbPaymentConfirmationException {

		return getPersistence().findBygetJtbPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	public static JtbPaymentConfirmation fetchBygetJtbPaymentConfBy_CI(
		String caseId) {

		return getPersistence().fetchBygetJtbPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the jtb payment confirmation where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	public static JtbPaymentConfirmation fetchBygetJtbPaymentConfBy_CI(
		String caseId, boolean useFinderCache) {

		return getPersistence().fetchBygetJtbPaymentConfBy_CI(
			caseId, useFinderCache);
	}

	/**
	 * Removes the jtb payment confirmation where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb payment confirmation that was removed
	 */
	public static JtbPaymentConfirmation removeBygetJtbPaymentConfBy_CI(
			String caseId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbPaymentConfirmationException {

		return getPersistence().removeBygetJtbPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns the number of jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb payment confirmations
	 */
	public static int countBygetJtbPaymentConfBy_CI(String caseId) {
		return getPersistence().countBygetJtbPaymentConfBy_CI(caseId);
	}

	/**
	 * Returns all the jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId) {

		return getPersistence().findBygetJtbPayConfBy_CI(caseId);
	}

	/**
	 * Returns a range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @return the range of matching jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end) {

		return getPersistence().findBygetJtbPayConfBy_CI(caseId, start, end);
	}

	/**
	 * Returns an ordered range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		return getPersistence().findBygetJtbPayConfBy_CI(
			caseId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb payment confirmations where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> findBygetJtbPayConfBy_CI(
		String caseId, int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetJtbPayConfBy_CI(
			caseId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	public static JtbPaymentConfirmation findBygetJtbPayConfBy_CI_First(
			String caseId,
			OrderByComparator<JtbPaymentConfirmation> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbPaymentConfirmationException {

		return getPersistence().findBygetJtbPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the first jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	public static JtbPaymentConfirmation fetchBygetJtbPayConfBy_CI_First(
		String caseId,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetJtbPayConfBy_CI_First(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a matching jtb payment confirmation could not be found
	 */
	public static JtbPaymentConfirmation findBygetJtbPayConfBy_CI_Last(
			String caseId,
			OrderByComparator<JtbPaymentConfirmation> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbPaymentConfirmationException {

		return getPersistence().findBygetJtbPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the last jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb payment confirmation, or <code>null</code> if a matching jtb payment confirmation could not be found
	 */
	public static JtbPaymentConfirmation fetchBygetJtbPayConfBy_CI_Last(
		String caseId,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		return getPersistence().fetchBygetJtbPayConfBy_CI_Last(
			caseId, orderByComparator);
	}

	/**
	 * Returns the jtb payment confirmations before and after the current jtb payment confirmation in the ordered set where caseId = &#63;.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the current jtb payment confirmation
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	public static JtbPaymentConfirmation[] findBygetJtbPayConfBy_CI_PrevAndNext(
			long jtbPaymentConfirmationId, String caseId,
			OrderByComparator<JtbPaymentConfirmation> orderByComparator)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbPaymentConfirmationException {

		return getPersistence().findBygetJtbPayConfBy_CI_PrevAndNext(
			jtbPaymentConfirmationId, caseId, orderByComparator);
	}

	/**
	 * Removes all the jtb payment confirmations where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	public static void removeBygetJtbPayConfBy_CI(String caseId) {
		getPersistence().removeBygetJtbPayConfBy_CI(caseId);
	}

	/**
	 * Returns the number of jtb payment confirmations where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb payment confirmations
	 */
	public static int countBygetJtbPayConfBy_CI(String caseId) {
		return getPersistence().countBygetJtbPayConfBy_CI(caseId);
	}

	/**
	 * Caches the jtb payment confirmation in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentConfirmation the jtb payment confirmation
	 */
	public static void cacheResult(
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		getPersistence().cacheResult(jtbPaymentConfirmation);
	}

	/**
	 * Caches the jtb payment confirmations in the entity cache if it is enabled.
	 *
	 * @param jtbPaymentConfirmations the jtb payment confirmations
	 */
	public static void cacheResult(
		List<JtbPaymentConfirmation> jtbPaymentConfirmations) {

		getPersistence().cacheResult(jtbPaymentConfirmations);
	}

	/**
	 * Creates a new jtb payment confirmation with the primary key. Does not add the jtb payment confirmation to the database.
	 *
	 * @param jtbPaymentConfirmationId the primary key for the new jtb payment confirmation
	 * @return the new jtb payment confirmation
	 */
	public static JtbPaymentConfirmation create(long jtbPaymentConfirmationId) {
		return getPersistence().create(jtbPaymentConfirmationId);
	}

	/**
	 * Removes the jtb payment confirmation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation that was removed
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	public static JtbPaymentConfirmation remove(long jtbPaymentConfirmationId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbPaymentConfirmationException {

		return getPersistence().remove(jtbPaymentConfirmationId);
	}

	public static JtbPaymentConfirmation updateImpl(
		JtbPaymentConfirmation jtbPaymentConfirmation) {

		return getPersistence().updateImpl(jtbPaymentConfirmation);
	}

	/**
	 * Returns the jtb payment confirmation with the primary key or throws a <code>NoSuchJtbPaymentConfirmationException</code> if it could not be found.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation
	 * @throws NoSuchJtbPaymentConfirmationException if a jtb payment confirmation with the primary key could not be found
	 */
	public static JtbPaymentConfirmation findByPrimaryKey(
			long jtbPaymentConfirmationId)
		throws com.nbp.jtb.application.stage.services.exception.
			NoSuchJtbPaymentConfirmationException {

		return getPersistence().findByPrimaryKey(jtbPaymentConfirmationId);
	}

	/**
	 * Returns the jtb payment confirmation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbPaymentConfirmationId the primary key of the jtb payment confirmation
	 * @return the jtb payment confirmation, or <code>null</code> if a jtb payment confirmation with the primary key could not be found
	 */
	public static JtbPaymentConfirmation fetchByPrimaryKey(
		long jtbPaymentConfirmationId) {

		return getPersistence().fetchByPrimaryKey(jtbPaymentConfirmationId);
	}

	/**
	 * Returns all the jtb payment confirmations.
	 *
	 * @return the jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @return the range of jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the jtb payment confirmations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JtbPaymentConfirmationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb payment confirmations
	 * @param end the upper bound of the range of jtb payment confirmations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb payment confirmations
	 */
	public static List<JtbPaymentConfirmation> findAll(
		int start, int end,
		OrderByComparator<JtbPaymentConfirmation> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the jtb payment confirmations from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of jtb payment confirmations.
	 *
	 * @return the number of jtb payment confirmations
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static JtbPaymentConfirmationPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		JtbPaymentConfirmationPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile JtbPaymentConfirmationPersistence _persistence;

}