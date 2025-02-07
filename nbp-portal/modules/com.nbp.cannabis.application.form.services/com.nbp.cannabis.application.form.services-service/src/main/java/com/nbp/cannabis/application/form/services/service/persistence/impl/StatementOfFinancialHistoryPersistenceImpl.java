/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.cannabis.application.form.services.exception.NoSuchStatementOfFinancialHistoryException;
import com.nbp.cannabis.application.form.services.model.StatementOfFinancialHistory;
import com.nbp.cannabis.application.form.services.model.StatementOfFinancialHistoryTable;
import com.nbp.cannabis.application.form.services.model.impl.StatementOfFinancialHistoryImpl;
import com.nbp.cannabis.application.form.services.model.impl.StatementOfFinancialHistoryModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.StatementOfFinancialHistoryPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.StatementOfFinancialHistoryUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the statement of financial history service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = StatementOfFinancialHistoryPersistence.class)
public class StatementOfFinancialHistoryPersistenceImpl
	extends BasePersistenceImpl<StatementOfFinancialHistory>
	implements StatementOfFinancialHistoryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>StatementOfFinancialHistoryUtil</code> to access the statement of financial history persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		StatementOfFinancialHistoryImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the statement of financial histories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching statement of financial histories
	 */
	@Override
	public List<StatementOfFinancialHistory> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<StatementOfFinancialHistory> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<StatementOfFinancialHistory> list = null;

		if (useFinderCache) {
			list = (List<StatementOfFinancialHistory>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StatementOfFinancialHistory statementOfFinancialHistory :
						list) {

					if (!uuid.equals(statementOfFinancialHistory.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_STATEMENTOFFINANCIALHISTORY_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StatementOfFinancialHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<StatementOfFinancialHistory>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory findByUuid_First(
			String uuid,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory =
			fetchByUuid_First(uuid, orderByComparator);

		if (statementOfFinancialHistory != null) {
			return statementOfFinancialHistory;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStatementOfFinancialHistoryException(sb.toString());
	}

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchByUuid_First(
		String uuid,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		List<StatementOfFinancialHistory> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory findByUuid_Last(
			String uuid,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory =
			fetchByUuid_Last(uuid, orderByComparator);

		if (statementOfFinancialHistory != null) {
			return statementOfFinancialHistory;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchStatementOfFinancialHistoryException(sb.toString());
	}

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchByUuid_Last(
		String uuid,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<StatementOfFinancialHistory> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StatementOfFinancialHistory[] findByUuid_PrevAndNext(
			long statementOfFinancialHistoryId, String uuid,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		uuid = Objects.toString(uuid, "");

		StatementOfFinancialHistory statementOfFinancialHistory =
			findByPrimaryKey(statementOfFinancialHistoryId);

		Session session = null;

		try {
			session = openSession();

			StatementOfFinancialHistory[] array =
				new StatementOfFinancialHistoryImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, statementOfFinancialHistory, uuid, orderByComparator,
				true);

			array[1] = statementOfFinancialHistory;

			array[2] = getByUuid_PrevAndNext(
				session, statementOfFinancialHistory, uuid, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected StatementOfFinancialHistory getByUuid_PrevAndNext(
		Session session,
		StatementOfFinancialHistory statementOfFinancialHistory, String uuid,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STATEMENTOFFINANCIALHISTORY_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StatementOfFinancialHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						statementOfFinancialHistory)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<StatementOfFinancialHistory> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the statement of financial histories where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (StatementOfFinancialHistory statementOfFinancialHistory :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(statementOfFinancialHistory);
		}
	}

	/**
	 * Returns the number of statement of financial histories where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching statement of financial histories
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STATEMENTOFFINANCIALHISTORY_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"statementOfFinancialHistory.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(statementOfFinancialHistory.uuid IS NULL OR statementOfFinancialHistory.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchStatementOfFinancialHistoryException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory findByUUID_G(String uuid, long groupId)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory = fetchByUUID_G(
			uuid, groupId);

		if (statementOfFinancialHistory == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchStatementOfFinancialHistoryException(sb.toString());
		}

		return statementOfFinancialHistory;
	}

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the statement of financial history where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof StatementOfFinancialHistory) {
			StatementOfFinancialHistory statementOfFinancialHistory =
				(StatementOfFinancialHistory)result;

			if (!Objects.equals(uuid, statementOfFinancialHistory.getUuid()) ||
				(groupId != statementOfFinancialHistory.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_STATEMENTOFFINANCIALHISTORY_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<StatementOfFinancialHistory> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					StatementOfFinancialHistory statementOfFinancialHistory =
						list.get(0);

					result = statementOfFinancialHistory;

					cacheResult(statementOfFinancialHistory);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (StatementOfFinancialHistory)result;
		}
	}

	/**
	 * Removes the statement of financial history where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the statement of financial history that was removed
	 */
	@Override
	public StatementOfFinancialHistory removeByUUID_G(String uuid, long groupId)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory = findByUUID_G(
			uuid, groupId);

		return remove(statementOfFinancialHistory);
	}

	/**
	 * Returns the number of statement of financial histories where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching statement of financial histories
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_STATEMENTOFFINANCIALHISTORY_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"statementOfFinancialHistory.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(statementOfFinancialHistory.uuid IS NULL OR statementOfFinancialHistory.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"statementOfFinancialHistory.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching statement of financial histories
	 */
	@Override
	public List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<StatementOfFinancialHistory> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<StatementOfFinancialHistory> list = null;

		if (useFinderCache) {
			list = (List<StatementOfFinancialHistory>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StatementOfFinancialHistory statementOfFinancialHistory :
						list) {

					if (!uuid.equals(statementOfFinancialHistory.getUuid()) ||
						(companyId !=
							statementOfFinancialHistory.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_STATEMENTOFFINANCIALHISTORY_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StatementOfFinancialHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<StatementOfFinancialHistory>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public StatementOfFinancialHistory findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (statementOfFinancialHistory != null) {
			return statementOfFinancialHistory;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchStatementOfFinancialHistoryException(sb.toString());
	}

	/**
	 * Returns the first statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		List<StatementOfFinancialHistory> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StatementOfFinancialHistory findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (statementOfFinancialHistory != null) {
			return statementOfFinancialHistory;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchStatementOfFinancialHistoryException(sb.toString());
	}

	/**
	 * Returns the last statement of financial history in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<StatementOfFinancialHistory> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StatementOfFinancialHistory[] findByUuid_C_PrevAndNext(
			long statementOfFinancialHistoryId, String uuid, long companyId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		uuid = Objects.toString(uuid, "");

		StatementOfFinancialHistory statementOfFinancialHistory =
			findByPrimaryKey(statementOfFinancialHistoryId);

		Session session = null;

		try {
			session = openSession();

			StatementOfFinancialHistory[] array =
				new StatementOfFinancialHistoryImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, statementOfFinancialHistory, uuid, companyId,
				orderByComparator, true);

			array[1] = statementOfFinancialHistory;

			array[2] = getByUuid_C_PrevAndNext(
				session, statementOfFinancialHistory, uuid, companyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected StatementOfFinancialHistory getByUuid_C_PrevAndNext(
		Session session,
		StatementOfFinancialHistory statementOfFinancialHistory, String uuid,
		long companyId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_STATEMENTOFFINANCIALHISTORY_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StatementOfFinancialHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						statementOfFinancialHistory)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<StatementOfFinancialHistory> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the statement of financial histories where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (StatementOfFinancialHistory statementOfFinancialHistory :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(statementOfFinancialHistory);
		}
	}

	/**
	 * Returns the number of statement of financial histories where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching statement of financial histories
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_STATEMENTOFFINANCIALHISTORY_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"statementOfFinancialHistory.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(statementOfFinancialHistory.uuid IS NULL OR statementOfFinancialHistory.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"statementOfFinancialHistory.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetSOFH_by_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetSOFH_by_CAI;
	private FinderPath _finderPathCountBygetSOFH_by_CAI;

	/**
	 * Returns all the statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching statement of financial histories
	 */
	@Override
	public List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId) {

		return findBygetSOFH_by_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetSOFH_by_CAI(cannabisApplicationId, start, end, null);
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
	@Override
	public List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return findBygetSOFH_by_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
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
	@Override
	public List<StatementOfFinancialHistory> findBygetSOFH_by_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetSOFH_by_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSOFH_by_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<StatementOfFinancialHistory> list = null;

		if (useFinderCache) {
			list = (List<StatementOfFinancialHistory>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (StatementOfFinancialHistory statementOfFinancialHistory :
						list) {

					if (cannabisApplicationId !=
							statementOfFinancialHistory.
								getCannabisApplicationId()) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_STATEMENTOFFINANCIALHISTORY_WHERE);

			sb.append(_FINDER_COLUMN_GETSOFH_BY_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(StatementOfFinancialHistoryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<StatementOfFinancialHistory>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory findBygetSOFH_by_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory =
			fetchBygetSOFH_by_CAI_First(
				cannabisApplicationId, orderByComparator);

		if (statementOfFinancialHistory != null) {
			return statementOfFinancialHistory;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchStatementOfFinancialHistoryException(sb.toString());
	}

	/**
	 * Returns the first statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchBygetSOFH_by_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		List<StatementOfFinancialHistory> list = findBygetSOFH_by_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory findBygetSOFH_by_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory =
			fetchBygetSOFH_by_CAI_Last(
				cannabisApplicationId, orderByComparator);

		if (statementOfFinancialHistory != null) {
			return statementOfFinancialHistory;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchStatementOfFinancialHistoryException(sb.toString());
	}

	/**
	 * Returns the last statement of financial history in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching statement of financial history, or <code>null</code> if a matching statement of financial history could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchBygetSOFH_by_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		int count = countBygetSOFH_by_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<StatementOfFinancialHistory> list = findBygetSOFH_by_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public StatementOfFinancialHistory[] findBygetSOFH_by_CAI_PrevAndNext(
			long statementOfFinancialHistoryId, long cannabisApplicationId,
			OrderByComparator<StatementOfFinancialHistory> orderByComparator)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory =
			findByPrimaryKey(statementOfFinancialHistoryId);

		Session session = null;

		try {
			session = openSession();

			StatementOfFinancialHistory[] array =
				new StatementOfFinancialHistoryImpl[3];

			array[0] = getBygetSOFH_by_CAI_PrevAndNext(
				session, statementOfFinancialHistory, cannabisApplicationId,
				orderByComparator, true);

			array[1] = statementOfFinancialHistory;

			array[2] = getBygetSOFH_by_CAI_PrevAndNext(
				session, statementOfFinancialHistory, cannabisApplicationId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected StatementOfFinancialHistory getBygetSOFH_by_CAI_PrevAndNext(
		Session session,
		StatementOfFinancialHistory statementOfFinancialHistory,
		long cannabisApplicationId,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_STATEMENTOFFINANCIALHISTORY_WHERE);

		sb.append(_FINDER_COLUMN_GETSOFH_BY_CAI_CANNABISAPPLICATIONID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(StatementOfFinancialHistoryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						statementOfFinancialHistory)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<StatementOfFinancialHistory> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the statement of financial histories where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetSOFH_by_CAI(long cannabisApplicationId) {
		for (StatementOfFinancialHistory statementOfFinancialHistory :
				findBygetSOFH_by_CAI(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(statementOfFinancialHistory);
		}
	}

	/**
	 * Returns the number of statement of financial histories where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching statement of financial histories
	 */
	@Override
	public int countBygetSOFH_by_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSOFH_by_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_STATEMENTOFFINANCIALHISTORY_WHERE);

			sb.append(_FINDER_COLUMN_GETSOFH_BY_CAI_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETSOFH_BY_CAI_CANNABISAPPLICATIONID_2 =
			"statementOfFinancialHistory.cannabisApplicationId = ?";

	public StatementOfFinancialHistoryPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(StatementOfFinancialHistory.class);

		setModelImplClass(StatementOfFinancialHistoryImpl.class);
		setModelPKClass(long.class);

		setTable(StatementOfFinancialHistoryTable.INSTANCE);
	}

	/**
	 * Caches the statement of financial history in the entity cache if it is enabled.
	 *
	 * @param statementOfFinancialHistory the statement of financial history
	 */
	@Override
	public void cacheResult(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		entityCache.putResult(
			StatementOfFinancialHistoryImpl.class,
			statementOfFinancialHistory.getPrimaryKey(),
			statementOfFinancialHistory);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				statementOfFinancialHistory.getUuid(),
				statementOfFinancialHistory.getGroupId()
			},
			statementOfFinancialHistory);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the statement of financial histories in the entity cache if it is enabled.
	 *
	 * @param statementOfFinancialHistories the statement of financial histories
	 */
	@Override
	public void cacheResult(
		List<StatementOfFinancialHistory> statementOfFinancialHistories) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (statementOfFinancialHistories.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (StatementOfFinancialHistory statementOfFinancialHistory :
				statementOfFinancialHistories) {

			if (entityCache.getResult(
					StatementOfFinancialHistoryImpl.class,
					statementOfFinancialHistory.getPrimaryKey()) == null) {

				cacheResult(statementOfFinancialHistory);
			}
		}
	}

	/**
	 * Clears the cache for all statement of financial histories.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(StatementOfFinancialHistoryImpl.class);

		finderCache.clearCache(StatementOfFinancialHistoryImpl.class);
	}

	/**
	 * Clears the cache for the statement of financial history.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		entityCache.removeResult(
			StatementOfFinancialHistoryImpl.class, statementOfFinancialHistory);
	}

	@Override
	public void clearCache(
		List<StatementOfFinancialHistory> statementOfFinancialHistories) {

		for (StatementOfFinancialHistory statementOfFinancialHistory :
				statementOfFinancialHistories) {

			entityCache.removeResult(
				StatementOfFinancialHistoryImpl.class,
				statementOfFinancialHistory);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(StatementOfFinancialHistoryImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				StatementOfFinancialHistoryImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		StatementOfFinancialHistoryModelImpl
			statementOfFinancialHistoryModelImpl) {

		Object[] args = new Object[] {
			statementOfFinancialHistoryModelImpl.getUuid(),
			statementOfFinancialHistoryModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			statementOfFinancialHistoryModelImpl);
	}

	/**
	 * Creates a new statement of financial history with the primary key. Does not add the statement of financial history to the database.
	 *
	 * @param statementOfFinancialHistoryId the primary key for the new statement of financial history
	 * @return the new statement of financial history
	 */
	@Override
	public StatementOfFinancialHistory create(
		long statementOfFinancialHistoryId) {

		StatementOfFinancialHistory statementOfFinancialHistory =
			new StatementOfFinancialHistoryImpl();

		statementOfFinancialHistory.setNew(true);
		statementOfFinancialHistory.setPrimaryKey(
			statementOfFinancialHistoryId);

		String uuid = PortalUUIDUtil.generate();

		statementOfFinancialHistory.setUuid(uuid);

		statementOfFinancialHistory.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return statementOfFinancialHistory;
	}

	/**
	 * Removes the statement of financial history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history that was removed
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	@Override
	public StatementOfFinancialHistory remove(
			long statementOfFinancialHistoryId)
		throws NoSuchStatementOfFinancialHistoryException {

		return remove((Serializable)statementOfFinancialHistoryId);
	}

	/**
	 * Removes the statement of financial history with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the statement of financial history
	 * @return the statement of financial history that was removed
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	@Override
	public StatementOfFinancialHistory remove(Serializable primaryKey)
		throws NoSuchStatementOfFinancialHistoryException {

		Session session = null;

		try {
			session = openSession();

			StatementOfFinancialHistory statementOfFinancialHistory =
				(StatementOfFinancialHistory)session.get(
					StatementOfFinancialHistoryImpl.class, primaryKey);

			if (statementOfFinancialHistory == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchStatementOfFinancialHistoryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(statementOfFinancialHistory);
		}
		catch (NoSuchStatementOfFinancialHistoryException
					noSuchEntityException) {

			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected StatementOfFinancialHistory removeImpl(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(statementOfFinancialHistory)) {
				statementOfFinancialHistory =
					(StatementOfFinancialHistory)session.get(
						StatementOfFinancialHistoryImpl.class,
						statementOfFinancialHistory.getPrimaryKeyObj());
			}

			if (statementOfFinancialHistory != null) {
				session.delete(statementOfFinancialHistory);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (statementOfFinancialHistory != null) {
			clearCache(statementOfFinancialHistory);
		}

		return statementOfFinancialHistory;
	}

	@Override
	public StatementOfFinancialHistory updateImpl(
		StatementOfFinancialHistory statementOfFinancialHistory) {

		boolean isNew = statementOfFinancialHistory.isNew();

		if (!(statementOfFinancialHistory instanceof
				StatementOfFinancialHistoryModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					statementOfFinancialHistory.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					statementOfFinancialHistory);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in statementOfFinancialHistory proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom StatementOfFinancialHistory implementation " +
					statementOfFinancialHistory.getClass());
		}

		StatementOfFinancialHistoryModelImpl
			statementOfFinancialHistoryModelImpl =
				(StatementOfFinancialHistoryModelImpl)
					statementOfFinancialHistory;

		if (Validator.isNull(statementOfFinancialHistory.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			statementOfFinancialHistory.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (statementOfFinancialHistory.getCreateDate() == null)) {
			if (serviceContext == null) {
				statementOfFinancialHistory.setCreateDate(date);
			}
			else {
				statementOfFinancialHistory.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!statementOfFinancialHistoryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				statementOfFinancialHistory.setModifiedDate(date);
			}
			else {
				statementOfFinancialHistory.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(statementOfFinancialHistory);
			}
			else {
				statementOfFinancialHistory =
					(StatementOfFinancialHistory)session.merge(
						statementOfFinancialHistory);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			StatementOfFinancialHistoryImpl.class,
			statementOfFinancialHistoryModelImpl, false, true);

		cacheUniqueFindersCache(statementOfFinancialHistoryModelImpl);

		if (isNew) {
			statementOfFinancialHistory.setNew(false);
		}

		statementOfFinancialHistory.resetOriginalValues();

		return statementOfFinancialHistory;
	}

	/**
	 * Returns the statement of financial history with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the statement of financial history
	 * @return the statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	@Override
	public StatementOfFinancialHistory findByPrimaryKey(Serializable primaryKey)
		throws NoSuchStatementOfFinancialHistoryException {

		StatementOfFinancialHistory statementOfFinancialHistory =
			fetchByPrimaryKey(primaryKey);

		if (statementOfFinancialHistory == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchStatementOfFinancialHistoryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return statementOfFinancialHistory;
	}

	/**
	 * Returns the statement of financial history with the primary key or throws a <code>NoSuchStatementOfFinancialHistoryException</code> if it could not be found.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history
	 * @throws NoSuchStatementOfFinancialHistoryException if a statement of financial history with the primary key could not be found
	 */
	@Override
	public StatementOfFinancialHistory findByPrimaryKey(
			long statementOfFinancialHistoryId)
		throws NoSuchStatementOfFinancialHistoryException {

		return findByPrimaryKey((Serializable)statementOfFinancialHistoryId);
	}

	/**
	 * Returns the statement of financial history with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param statementOfFinancialHistoryId the primary key of the statement of financial history
	 * @return the statement of financial history, or <code>null</code> if a statement of financial history with the primary key could not be found
	 */
	@Override
	public StatementOfFinancialHistory fetchByPrimaryKey(
		long statementOfFinancialHistoryId) {

		return fetchByPrimaryKey((Serializable)statementOfFinancialHistoryId);
	}

	/**
	 * Returns all the statement of financial histories.
	 *
	 * @return the statement of financial histories
	 */
	@Override
	public List<StatementOfFinancialHistory> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<StatementOfFinancialHistory> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<StatementOfFinancialHistory> findAll(
		int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<StatementOfFinancialHistory> findAll(
		int start, int end,
		OrderByComparator<StatementOfFinancialHistory> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<StatementOfFinancialHistory> list = null;

		if (useFinderCache) {
			list = (List<StatementOfFinancialHistory>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_STATEMENTOFFINANCIALHISTORY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_STATEMENTOFFINANCIALHISTORY;

				sql = sql.concat(
					StatementOfFinancialHistoryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<StatementOfFinancialHistory>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the statement of financial histories from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (StatementOfFinancialHistory statementOfFinancialHistory :
				findAll()) {

			remove(statementOfFinancialHistory);
		}
	}

	/**
	 * Returns the number of statement of financial histories.
	 *
	 * @return the number of statement of financial histories
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_STATEMENTOFFINANCIALHISTORY);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "statementOfFinancialHistoryId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_STATEMENTOFFINANCIALHISTORY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return StatementOfFinancialHistoryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the statement of financial history persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathWithPaginationFindBygetSOFH_by_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSOFH_by_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetSOFH_by_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetSOFH_by_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetSOFH_by_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetSOFH_by_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		StatementOfFinancialHistoryUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		StatementOfFinancialHistoryUtil.setPersistence(null);

		entityCache.removeCache(
			StatementOfFinancialHistoryImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_STATEMENTOFFINANCIALHISTORY =
		"SELECT statementOfFinancialHistory FROM StatementOfFinancialHistory statementOfFinancialHistory";

	private static final String _SQL_SELECT_STATEMENTOFFINANCIALHISTORY_WHERE =
		"SELECT statementOfFinancialHistory FROM StatementOfFinancialHistory statementOfFinancialHistory WHERE ";

	private static final String _SQL_COUNT_STATEMENTOFFINANCIALHISTORY =
		"SELECT COUNT(statementOfFinancialHistory) FROM StatementOfFinancialHistory statementOfFinancialHistory";

	private static final String _SQL_COUNT_STATEMENTOFFINANCIALHISTORY_WHERE =
		"SELECT COUNT(statementOfFinancialHistory) FROM StatementOfFinancialHistory statementOfFinancialHistory WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"statementOfFinancialHistory.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No StatementOfFinancialHistory exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No StatementOfFinancialHistory exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		StatementOfFinancialHistoryPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}