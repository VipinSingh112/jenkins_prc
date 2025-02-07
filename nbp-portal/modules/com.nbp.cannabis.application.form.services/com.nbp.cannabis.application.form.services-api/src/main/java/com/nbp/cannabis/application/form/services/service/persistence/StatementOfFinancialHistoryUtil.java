/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.nbp.cannabis.application.form.services.model.StatementOfFinancialHistory;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the statement of financial history service. This utility wraps <code>com.nbp.cannabis.application.form.services.service.persistence.impl.StatementOfFinancialHistoryPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatementOfFinancialHistoryPersistence
 * @generated
 */
public class StatementOfFinancialHistoryUtil {

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
		StatementOfFinancialHistory statementOfFinancialHistory) {

		getPersistence().clearCache(statementOfFinancialHistory);
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
	public static Map<Serializable, StatementOfFinancialHistory>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<StatementOfFinancialHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<StatementOfFinancialHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<StatementOfFinancialHistory> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static StatementOfFinancialHistory update(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		return getPersistence().update(statementOfFinancialHistory);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static StatementOfFinancialHistory update(
		StatementOfFinancialHistory statementOfFinancialHistory,
		ServiceContext serviceContext) {

		return getPersistence().update(
			statementOfFinancialHistory, serviceContext);
	}

	/**
	 * Returns all the statement of financial histories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the statement of financial histories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @return the range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end) {

		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the statement of financial histories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statement of financial histories where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory findByUuid_First(
			String uuid,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory fetchByUuid_First(
		String uuid,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory findByUuid_Last(
			String uuid,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory fetchByUuid_Last(
		String uuid,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the statement of financial histories before and after the current statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the current statement of financial history
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public static StatementOfFinancialHistory[] findByUuid_PrevAndNext(
			long statementOfFinancialHistoryId, String uuid,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findByUuid_PrevAndNext(
			statementOfFinancialHistoryId, uuid, orderByComparator);
	}

	/**
	 * Removes all the statement of financial histories where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of statement of financial histories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching statement of financial histories
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStatementOfFinancialHistoryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory findByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory fetchByUUID_G(
		String uuid, long groupId) {

		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the statement of financial history where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the statement of financial history that was removed
	 */
	public static StatementOfFinancialHistory removeByUUID_G(
			String uuid, long groupId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of statement of financial histories where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching statement of financial histories
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId) {

		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @return the range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the statement of financial histories before and after the current statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the current statement of financial history
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public static StatementOfFinancialHistory[] findByUuid_C_PrevAndNext(
			long statementOfFinancialHistoryId, String uuid, long companyId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findByUuid_C_PrevAndNext(
			statementOfFinancialHistoryId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the statement of financial histories where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching statement of financial histories
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId) {

		return getPersistence().findBygetSOFH_by_CAI(cannabisApplicationId);
	}

	/**
	 * Returns a range of all the statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @return the range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end) {

		return getPersistence().findBygetSOFH_by_CAI(
			cannabisApplicationId, start, end);
	}

	/**
	 * Returns an ordered range of all the statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().findBygetSOFH_by_CAI(
			cannabisApplicationId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygetSOFH_by_CAI(
			cannabisApplicationId, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory findBygetSOFH_by_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findBygetSOFH_by_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the first statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory fetchBygetSOFH_by_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().fetchBygetSOFH_by_CAI_First(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory findBygetSOFH_by_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findBygetSOFH_by_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the last statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public static StatementOfFinancialHistory fetchBygetSOFH_by_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().fetchBygetSOFH_by_CAI_Last(
			cannabisApplicationId, orderByComparator);
	}

	/**
	 * Returns the statement of financial histories before and after the current statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the current statement of financial history
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public static StatementOfFinancialHistory[]
			findBygetSOFH_by_CAI_PrevAndNext(
				long statementOfFinancialHistoryId, long cannabisApplicationId,
				OrderByComparator<StatementOfFinancialHistory>
					orderByComparator)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findBygetSOFH_by_CAI_PrevAndNext(
			statementOfFinancialHistoryId, cannabisApplicationId,
			orderByComparator);
	}

	/**
	 * Removes all the statement of financial histories where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public static void removeBygetSOFH_by_CAI(long cannabisApplicationId) {
		getPersistence().removeBygetSOFH_by_CAI(cannabisApplicationId);
	}

	/**
	 * Returns the number of statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching statement of financial histories
	 */
	public static int countBygetSOFH_by_CAI(long cannabisApplicationId) {
		return getPersistence().countBygetSOFH_by_CAI(cannabisApplicationId);
	}

	/**
	 * Caches the statement of financial history in the entity cache if it is enabled.
	 *
	 * @param statementOfFinancialHistory the statement of financial history
	 */
	public static void cacheResult(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		getPersistence().cacheResult(statementOfFinancialHistory);
	}

	/**
	 * Caches the statement of financial histories in the entity cache if it is enabled.
	 *
	 * @param statementOfFinancialHistories the statement of financial histories
	 */
	public static void cacheResult(
		List<StatementOfFinancialHistory> statementOfFinancialHistories) {

		getPersistence().cacheResult(statementOfFinancialHistories);
	}

	/**
	 * Creates a new statement of financial history with the primary key. Does not add the statement of financial history to the database.
	 *
	 * @param statementOfFinancialHistoryId the primary key for the new statement of financial history
	 * @return the new statement of financial history
	 */
	public static StatementOfFinancialHistory create(
		long statementOfFinancialHistoryId) {

		return getPersistence().create(statementOfFinancialHistoryId);
	}

	/**
	 * Removes the statement of financial history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history that was removed
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public static StatementOfFinancialHistory remove(
			long statementOfFinancialHistoryId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().remove(statementOfFinancialHistoryId);
	}

	public static StatementOfFinancialHistory updateImpl(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		return getPersistence().updateImpl(statementOfFinancialHistory);
	}

	/**
	 * Returns the statement of financial history with the primary key or throws a <code>NoSuchStatementOfFinancialHistoryException</code> if it could not be found.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public static StatementOfFinancialHistory findByPrimaryKey(
			long statementOfFinancialHistoryId)
		throws com.nbp.cannabis.application.form.services.exception.
			NoSuchStatementOfFinancialHistoryException {

		return getPersistence().findByPrimaryKey(statementOfFinancialHistoryId);
	}

	/**
	 * Returns the statement of financial history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history, or <code>null</code> if a statement of financial history with the primary key could not be found
	 */
	public static StatementOfFinancialHistory fetchByPrimaryKey(
		long statementOfFinancialHistoryId) {

		return getPersistence().fetchByPrimaryKey(
			statementOfFinancialHistoryId);
	}

	/**
	 * Returns all the statement of financial histories.
	 *
	 * @return the statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the statement of financial histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @return the range of statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findAll(
		int start, int end) {

		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the statement of financial histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findAll(
		int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the statement of financial histories.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>StatementOfFinancialHistoryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of statement of financial histories
	 * @param end the upper bound of the range of statement of financial histories (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of statement of financial histories
	 */
	public static List<StatementOfFinancialHistory> findAll(
		int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the statement of financial histories from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of statement of financial histories.
	 *
	 * @return the number of statement of financial histories
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static StatementOfFinancialHistoryPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(
		StatementOfFinancialHistoryPersistence persistence) {

		_persistence = persistence;
	}

	private static volatile StatementOfFinancialHistoryPersistence _persistence;

}