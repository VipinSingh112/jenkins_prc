/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.nbp.cannabis.application.form.services.exception.NoSuchStatementOfFinancialHistoryException;
import com.nbp.cannabis.application.form.services.model.StatementOfFinancialHistory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the statement of financial history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StatementOfFinancialHistoryUtil
 * @generated
 */
@ProviderType
public interface StatementOfFinancialHistoryPersistence
	extends BasePersistence<StatementOfFinancialHistory> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link StatementOfFinancialHistoryUtil} to access the statement of financial history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the statement of financial histories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching statement of financial histories
	 */
	public java.util.List<StatementOfFinancialHistory> findByUuid(String uuid);

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
	public java.util.List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

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
	public java.util.List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

	/**
	 * Returns the statement of financial histories before and after the current statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the current statement of financial history
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public StatementOfFinancialHistory[] findByUuid_PrevAndNext(
			long statementOfFinancialHistoryId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Removes all the statement of financial histories where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of statement of financial histories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching statement of financial histories
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStatementOfFinancialHistoryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory findByUUID_G(String uuid, long groupId)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the statement of financial history where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the statement of financial history that was removed
	 */
	public StatementOfFinancialHistory removeByUUID_G(String uuid, long groupId)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the number of statement of financial histories where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching statement of financial histories
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching statement of financial histories
	 */
	public java.util.List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId);

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
	public java.util.List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

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
	public java.util.List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

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
	public StatementOfFinancialHistory[] findByUuid_C_PrevAndNext(
			long statementOfFinancialHistoryId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Removes all the statement of financial histories where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching statement of financial histories
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching statement of financial histories
	 */
	public java.util.List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId);

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
	public java.util.List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end);

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
	public java.util.List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

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
	public java.util.List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory findBygetSOFH_by_CAI_First(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the first statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory fetchBygetSOFH_by_CAI_First(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

	/**
	 * Returns the last statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory findBygetSOFH_by_CAI_Last(
			long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the last statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	public StatementOfFinancialHistory fetchBygetSOFH_by_CAI_Last(
		long cannabisApplicationId,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

	/**
	 * Returns the statement of financial histories before and after the current statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the current statement of financial history
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public StatementOfFinancialHistory[] findBygetSOFH_by_CAI_PrevAndNext(
			long statementOfFinancialHistoryId, long cannabisApplicationId,
			com.liferay.portal.kernel.util.OrderByComparator
				<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Removes all the statement of financial histories where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	public void removeBygetSOFH_by_CAI(long cannabisApplicationId);

	/**
	 * Returns the number of statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching statement of financial histories
	 */
	public int countBygetSOFH_by_CAI(long cannabisApplicationId);

	/**
	 * Caches the statement of financial history in the entity cache if it is enabled.
	 *
	 * @param statementOfFinancialHistory the statement of financial history
	 */
	public void cacheResult(
		StatementOfFinancialHistory statementOfFinancialHistory);

	/**
	 * Caches the statement of financial histories in the entity cache if it is enabled.
	 *
	 * @param statementOfFinancialHistories the statement of financial histories
	 */
	public void cacheResult(
		java.util.List<StatementOfFinancialHistory>
			statementOfFinancialHistories);

	/**
	 * Creates a new statement of financial history with the primary key. Does not add the statement of financial history to the database.
	 *
	 * @param statementOfFinancialHistoryId the primary key for the new statement of financial history
	 * @return the new statement of financial history
	 */
	public StatementOfFinancialHistory create(
		long statementOfFinancialHistoryId);

	/**
	 * Removes the statement of financial history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history that was removed
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public StatementOfFinancialHistory remove(
			long statementOfFinancialHistoryId)
		throws NoSuchStatementOfFinancialHistoryException;

	public StatementOfFinancialHistory updateImpl(
		StatementOfFinancialHistory statementOfFinancialHistory);

	/**
	 * Returns the statement of financial history with the primary key or throws a <code>NoSuchStatementOfFinancialHistoryException</code> if it could not be found.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	public StatementOfFinancialHistory findByPrimaryKey(
			long statementOfFinancialHistoryId)
		throws NoSuchStatementOfFinancialHistoryException;

	/**
	 * Returns the statement of financial history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history, or <code>null</code> if a statement of financial history with the primary key could not be found
	 */
	public StatementOfFinancialHistory fetchByPrimaryKey(
		long statementOfFinancialHistoryId);

	/**
	 * Returns all the statement of financial histories.
	 *
	 * @return the statement of financial histories
	 */
	public java.util.List<StatementOfFinancialHistory> findAll();

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
	public java.util.List<StatementOfFinancialHistory> findAll(
		int start, int end);

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
	public java.util.List<StatementOfFinancialHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator);

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
	public java.util.List<StatementOfFinancialHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the statement of financial histories from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of statement of financial histories.
	 *
	 * @return the number of statement of financial histories
	 */
	public int countAll();

}