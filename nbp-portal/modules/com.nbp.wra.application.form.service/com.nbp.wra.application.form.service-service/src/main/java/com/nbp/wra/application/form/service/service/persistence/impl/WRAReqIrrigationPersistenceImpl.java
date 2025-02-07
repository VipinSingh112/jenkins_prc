/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.wra.application.form.service.exception.NoSuchWRAReqIrrigationException;
import com.nbp.wra.application.form.service.model.WRAReqIrrigation;
import com.nbp.wra.application.form.service.model.WRAReqIrrigationTable;
import com.nbp.wra.application.form.service.model.impl.WRAReqIrrigationImpl;
import com.nbp.wra.application.form.service.model.impl.WRAReqIrrigationModelImpl;
import com.nbp.wra.application.form.service.service.persistence.WRAReqIrrigationPersistence;
import com.nbp.wra.application.form.service.service.persistence.WRAReqIrrigationUtil;
import com.nbp.wra.application.form.service.service.persistence.impl.constants.WRA_APPLICATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the wra req irrigation service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WRAReqIrrigationPersistence.class)
public class WRAReqIrrigationPersistenceImpl
	extends BasePersistenceImpl<WRAReqIrrigation>
	implements WRAReqIrrigationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WRAReqIrrigationUtil</code> to access the wra req irrigation persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WRAReqIrrigationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetWRA_By_Id;
	private FinderPath _finderPathCountBygetWRA_By_Id;

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or throws a <code>NoSuchWRAReqIrrigationException</code> if it could not be found.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation findBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = fetchBygetWRA_By_Id(
			wraApplicationId);

		if (wraReqIrrigation == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("wraApplicationId=");
			sb.append(wraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAReqIrrigationException(sb.toString());
		}

		return wraReqIrrigation;
	}

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation fetchBygetWRA_By_Id(long wraApplicationId) {
		return fetchBygetWRA_By_Id(wraApplicationId, true);
	}

	/**
	 * Returns the wra req irrigation where wraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation fetchBygetWRA_By_Id(
		long wraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {wraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRA_By_Id, finderArgs, this);
		}

		if (result instanceof WRAReqIrrigation) {
			WRAReqIrrigation wraReqIrrigation = (WRAReqIrrigation)result;

			if (wraApplicationId != wraReqIrrigation.getWraApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAREQIRRIGATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				List<WRAReqIrrigation> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRA_By_Id, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {wraApplicationId};
							}

							_log.warn(
								"WRAReqIrrigationPersistenceImpl.fetchBygetWRA_By_Id(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAReqIrrigation wraReqIrrigation = list.get(0);

					result = wraReqIrrigation;

					cacheResult(wraReqIrrigation);
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
			return (WRAReqIrrigation)result;
		}
	}

	/**
	 * Removes the wra req irrigation where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the wra req irrigation that was removed
	 */
	@Override
	public WRAReqIrrigation removeBygetWRA_By_Id(long wraApplicationId)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = findBygetWRA_By_Id(
			wraApplicationId);

		return remove(wraReqIrrigation);
	}

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	@Override
	public int countBygetWRA_By_Id(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_Id;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAREQIRRIGATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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

	private static final String _FINDER_COLUMN_GETWRA_BY_ID_WRAAPPLICATIONID_2 =
		"wraReqIrrigation.wraApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetWRA_By_AppId;
	private FinderPath _finderPathWithoutPaginationFindBygetWRA_By_AppId;
	private FinderPath _finderPathCountBygetWRA_By_AppId;

	/**
	 * Returns all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findBygetWRA_By_AppId(long wraApplicationId) {
		return findBygetWRA_By_AppId(
			wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of matching wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end) {

		return findBygetWRA_By_AppId(wraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return findBygetWRA_By_AppId(
			wraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findBygetWRA_By_AppId(
		long wraApplicationId, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWRA_By_AppId;
				finderArgs = new Object[] {wraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWRA_By_AppId;
			finderArgs = new Object[] {
				wraApplicationId, start, end, orderByComparator
			};
		}

		List<WRAReqIrrigation> list = null;

		if (useFinderCache) {
			list = (List<WRAReqIrrigation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAReqIrrigation wraReqIrrigation : list) {
					if (wraApplicationId !=
							wraReqIrrigation.getWraApplicationId()) {

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

			sb.append(_SQL_SELECT_WRAREQIRRIGATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_APPID_WRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WRAReqIrrigationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				list = (List<WRAReqIrrigation>)QueryUtil.list(
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
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation findBygetWRA_By_AppId_First(
			long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = fetchBygetWRA_By_AppId_First(
			wraApplicationId, orderByComparator);

		if (wraReqIrrigation != null) {
			return wraReqIrrigation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWRAReqIrrigationException(sb.toString());
	}

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation fetchBygetWRA_By_AppId_First(
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		List<WRAReqIrrigation> list = findBygetWRA_By_AppId(
			wraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation findBygetWRA_By_AppId_Last(
			long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = fetchBygetWRA_By_AppId_Last(
			wraApplicationId, orderByComparator);

		if (wraReqIrrigation != null) {
			return wraReqIrrigation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWRAReqIrrigationException(sb.toString());
	}

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation fetchBygetWRA_By_AppId_Last(
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		int count = countBygetWRA_By_AppId(wraApplicationId);

		if (count == 0) {
			return null;
		}

		List<WRAReqIrrigation> list = findBygetWRA_By_AppId(
			wraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra req irrigations before and after the current wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraReqIrrigationId the primary key of the current wra req irrigation
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public WRAReqIrrigation[] findBygetWRA_By_AppId_PrevAndNext(
			long wraReqIrrigationId, long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = findByPrimaryKey(
			wraReqIrrigationId);

		Session session = null;

		try {
			session = openSession();

			WRAReqIrrigation[] array = new WRAReqIrrigationImpl[3];

			array[0] = getBygetWRA_By_AppId_PrevAndNext(
				session, wraReqIrrigation, wraApplicationId, orderByComparator,
				true);

			array[1] = wraReqIrrigation;

			array[2] = getBygetWRA_By_AppId_PrevAndNext(
				session, wraReqIrrigation, wraApplicationId, orderByComparator,
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

	protected WRAReqIrrigation getBygetWRA_By_AppId_PrevAndNext(
		Session session, WRAReqIrrigation wraReqIrrigation,
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAREQIRRIGATION_WHERE);

		sb.append(_FINDER_COLUMN_GETWRA_BY_APPID_WRAAPPLICATIONID_2);

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
			sb.append(WRAReqIrrigationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(wraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraReqIrrigation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAReqIrrigation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra req irrigations where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	@Override
	public void removeBygetWRA_By_AppId(long wraApplicationId) {
		for (WRAReqIrrigation wraReqIrrigation :
				findBygetWRA_By_AppId(
					wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraReqIrrigation);
		}
	}

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	@Override
	public int countBygetWRA_By_AppId(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_AppId;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAREQIRRIGATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_APPID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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
		_FINDER_COLUMN_GETWRA_BY_APPID_WRAAPPLICATIONID_2 =
			"wraReqIrrigation.wraApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetWRA_By_CtrAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetWRA_By_CtrAppId;
	private FinderPath _finderPathCountBygetWRA_By_CtrAppId;

	/**
	 * Returns all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the matching wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId) {

		return findBygetWRA_By_CtrAppId(
			wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of matching wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end) {

		return findBygetWRA_By_CtrAppId(wraApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return findBygetWRA_By_CtrAppId(
			wraApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations where wraApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param wraApplicationId the wra application ID
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findBygetWRA_By_CtrAppId(
		long wraApplicationId, int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetWRA_By_CtrAppId;
				finderArgs = new Object[] {wraApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWRA_By_CtrAppId;
			finderArgs = new Object[] {
				wraApplicationId, start, end, orderByComparator
			};
		}

		List<WRAReqIrrigation> list = null;

		if (useFinderCache) {
			list = (List<WRAReqIrrigation>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAReqIrrigation wraReqIrrigation : list) {
					if (wraApplicationId !=
							wraReqIrrigation.getWraApplicationId()) {

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

			sb.append(_SQL_SELECT_WRAREQIRRIGATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_CTRAPPID_WRAAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WRAReqIrrigationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

				list = (List<WRAReqIrrigation>)QueryUtil.list(
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
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation findBygetWRA_By_CtrAppId_First(
			long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = fetchBygetWRA_By_CtrAppId_First(
			wraApplicationId, orderByComparator);

		if (wraReqIrrigation != null) {
			return wraReqIrrigation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWRAReqIrrigationException(sb.toString());
	}

	/**
	 * Returns the first wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation fetchBygetWRA_By_CtrAppId_First(
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		List<WRAReqIrrigation> list = findBygetWRA_By_CtrAppId(
			wraApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation findBygetWRA_By_CtrAppId_Last(
			long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = fetchBygetWRA_By_CtrAppId_Last(
			wraApplicationId, orderByComparator);

		if (wraReqIrrigation != null) {
			return wraReqIrrigation;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("wraApplicationId=");
		sb.append(wraApplicationId);

		sb.append("}");

		throw new NoSuchWRAReqIrrigationException(sb.toString());
	}

	/**
	 * Returns the last wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra req irrigation, or <code>null</code> if a matching wra req irrigation could not be found
	 */
	@Override
	public WRAReqIrrigation fetchBygetWRA_By_CtrAppId_Last(
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		int count = countBygetWRA_By_CtrAppId(wraApplicationId);

		if (count == 0) {
			return null;
		}

		List<WRAReqIrrigation> list = findBygetWRA_By_CtrAppId(
			wraApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra req irrigations before and after the current wra req irrigation in the ordered set where wraApplicationId = &#63;.
	 *
	 * @param wraReqIrrigationId the primary key of the current wra req irrigation
	 * @param wraApplicationId the wra application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public WRAReqIrrigation[] findBygetWRA_By_CtrAppId_PrevAndNext(
			long wraReqIrrigationId, long wraApplicationId,
			OrderByComparator<WRAReqIrrigation> orderByComparator)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = findByPrimaryKey(
			wraReqIrrigationId);

		Session session = null;

		try {
			session = openSession();

			WRAReqIrrigation[] array = new WRAReqIrrigationImpl[3];

			array[0] = getBygetWRA_By_CtrAppId_PrevAndNext(
				session, wraReqIrrigation, wraApplicationId, orderByComparator,
				true);

			array[1] = wraReqIrrigation;

			array[2] = getBygetWRA_By_CtrAppId_PrevAndNext(
				session, wraReqIrrigation, wraApplicationId, orderByComparator,
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

	protected WRAReqIrrigation getBygetWRA_By_CtrAppId_PrevAndNext(
		Session session, WRAReqIrrigation wraReqIrrigation,
		long wraApplicationId,
		OrderByComparator<WRAReqIrrigation> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAREQIRRIGATION_WHERE);

		sb.append(_FINDER_COLUMN_GETWRA_BY_CTRAPPID_WRAAPPLICATIONID_2);

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
			sb.append(WRAReqIrrigationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(wraApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraReqIrrigation)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAReqIrrigation> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra req irrigations where wraApplicationId = &#63; from the database.
	 *
	 * @param wraApplicationId the wra application ID
	 */
	@Override
	public void removeBygetWRA_By_CtrAppId(long wraApplicationId) {
		for (WRAReqIrrigation wraReqIrrigation :
				findBygetWRA_By_CtrAppId(
					wraApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraReqIrrigation);
		}
	}

	/**
	 * Returns the number of wra req irrigations where wraApplicationId = &#63;.
	 *
	 * @param wraApplicationId the wra application ID
	 * @return the number of matching wra req irrigations
	 */
	@Override
	public int countBygetWRA_By_CtrAppId(long wraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_CtrAppId;

		Object[] finderArgs = new Object[] {wraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAREQIRRIGATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_CTRAPPID_WRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(wraApplicationId);

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
		_FINDER_COLUMN_GETWRA_BY_CTRAPPID_WRAAPPLICATIONID_2 =
			"wraReqIrrigation.wraApplicationId = ?";

	public WRAReqIrrigationPersistenceImpl() {
		setModelClass(WRAReqIrrigation.class);

		setModelImplClass(WRAReqIrrigationImpl.class);
		setModelPKClass(long.class);

		setTable(WRAReqIrrigationTable.INSTANCE);
	}

	/**
	 * Caches the wra req irrigation in the entity cache if it is enabled.
	 *
	 * @param wraReqIrrigation the wra req irrigation
	 */
	@Override
	public void cacheResult(WRAReqIrrigation wraReqIrrigation) {
		entityCache.putResult(
			WRAReqIrrigationImpl.class, wraReqIrrigation.getPrimaryKey(),
			wraReqIrrigation);

		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id,
			new Object[] {wraReqIrrigation.getWraApplicationId()},
			wraReqIrrigation);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra req irrigations in the entity cache if it is enabled.
	 *
	 * @param wraReqIrrigations the wra req irrigations
	 */
	@Override
	public void cacheResult(List<WRAReqIrrigation> wraReqIrrigations) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraReqIrrigations.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WRAReqIrrigation wraReqIrrigation : wraReqIrrigations) {
			if (entityCache.getResult(
					WRAReqIrrigationImpl.class,
					wraReqIrrigation.getPrimaryKey()) == null) {

				cacheResult(wraReqIrrigation);
			}
		}
	}

	/**
	 * Clears the cache for all wra req irrigations.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WRAReqIrrigationImpl.class);

		finderCache.clearCache(WRAReqIrrigationImpl.class);
	}

	/**
	 * Clears the cache for the wra req irrigation.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WRAReqIrrigation wraReqIrrigation) {
		entityCache.removeResult(WRAReqIrrigationImpl.class, wraReqIrrigation);
	}

	@Override
	public void clearCache(List<WRAReqIrrigation> wraReqIrrigations) {
		for (WRAReqIrrigation wraReqIrrigation : wraReqIrrigations) {
			entityCache.removeResult(
				WRAReqIrrigationImpl.class, wraReqIrrigation);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WRAReqIrrigationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(WRAReqIrrigationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WRAReqIrrigationModelImpl wraReqIrrigationModelImpl) {

		Object[] args = new Object[] {
			wraReqIrrigationModelImpl.getWraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRA_By_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRA_By_Id, args, wraReqIrrigationModelImpl);
	}

	/**
	 * Creates a new wra req irrigation with the primary key. Does not add the wra req irrigation to the database.
	 *
	 * @param wraReqIrrigationId the primary key for the new wra req irrigation
	 * @return the new wra req irrigation
	 */
	@Override
	public WRAReqIrrigation create(long wraReqIrrigationId) {
		WRAReqIrrigation wraReqIrrigation = new WRAReqIrrigationImpl();

		wraReqIrrigation.setNew(true);
		wraReqIrrigation.setPrimaryKey(wraReqIrrigationId);

		wraReqIrrigation.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraReqIrrigation;
	}

	/**
	 * Removes the wra req irrigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation that was removed
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public WRAReqIrrigation remove(long wraReqIrrigationId)
		throws NoSuchWRAReqIrrigationException {

		return remove((Serializable)wraReqIrrigationId);
	}

	/**
	 * Removes the wra req irrigation with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra req irrigation
	 * @return the wra req irrigation that was removed
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public WRAReqIrrigation remove(Serializable primaryKey)
		throws NoSuchWRAReqIrrigationException {

		Session session = null;

		try {
			session = openSession();

			WRAReqIrrigation wraReqIrrigation = (WRAReqIrrigation)session.get(
				WRAReqIrrigationImpl.class, primaryKey);

			if (wraReqIrrigation == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWRAReqIrrigationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraReqIrrigation);
		}
		catch (NoSuchWRAReqIrrigationException noSuchEntityException) {
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
	protected WRAReqIrrigation removeImpl(WRAReqIrrigation wraReqIrrigation) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraReqIrrigation)) {
				wraReqIrrigation = (WRAReqIrrigation)session.get(
					WRAReqIrrigationImpl.class,
					wraReqIrrigation.getPrimaryKeyObj());
			}

			if (wraReqIrrigation != null) {
				session.delete(wraReqIrrigation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraReqIrrigation != null) {
			clearCache(wraReqIrrigation);
		}

		return wraReqIrrigation;
	}

	@Override
	public WRAReqIrrigation updateImpl(WRAReqIrrigation wraReqIrrigation) {
		boolean isNew = wraReqIrrigation.isNew();

		if (!(wraReqIrrigation instanceof WRAReqIrrigationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraReqIrrigation.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraReqIrrigation);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraReqIrrigation proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WRAReqIrrigation implementation " +
					wraReqIrrigation.getClass());
		}

		WRAReqIrrigationModelImpl wraReqIrrigationModelImpl =
			(WRAReqIrrigationModelImpl)wraReqIrrigation;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraReqIrrigation.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraReqIrrigation.setCreateDate(date);
			}
			else {
				wraReqIrrigation.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!wraReqIrrigationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraReqIrrigation.setModifiedDate(date);
			}
			else {
				wraReqIrrigation.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraReqIrrigation);
			}
			else {
				wraReqIrrigation = (WRAReqIrrigation)session.merge(
					wraReqIrrigation);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WRAReqIrrigationImpl.class, wraReqIrrigationModelImpl, false, true);

		cacheUniqueFindersCache(wraReqIrrigationModelImpl);

		if (isNew) {
			wraReqIrrigation.setNew(false);
		}

		wraReqIrrigation.resetOriginalValues();

		return wraReqIrrigation;
	}

	/**
	 * Returns the wra req irrigation with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra req irrigation
	 * @return the wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public WRAReqIrrigation findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWRAReqIrrigationException {

		WRAReqIrrigation wraReqIrrigation = fetchByPrimaryKey(primaryKey);

		if (wraReqIrrigation == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWRAReqIrrigationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraReqIrrigation;
	}

	/**
	 * Returns the wra req irrigation with the primary key or throws a <code>NoSuchWRAReqIrrigationException</code> if it could not be found.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation
	 * @throws NoSuchWRAReqIrrigationException if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public WRAReqIrrigation findByPrimaryKey(long wraReqIrrigationId)
		throws NoSuchWRAReqIrrigationException {

		return findByPrimaryKey((Serializable)wraReqIrrigationId);
	}

	/**
	 * Returns the wra req irrigation with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraReqIrrigationId the primary key of the wra req irrigation
	 * @return the wra req irrigation, or <code>null</code> if a wra req irrigation with the primary key could not be found
	 */
	@Override
	public WRAReqIrrigation fetchByPrimaryKey(long wraReqIrrigationId) {
		return fetchByPrimaryKey((Serializable)wraReqIrrigationId);
	}

	/**
	 * Returns all the wra req irrigations.
	 *
	 * @return the wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @return the range of wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findAll(
		int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra req irrigations.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAReqIrrigationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra req irrigations
	 * @param end the upper bound of the range of wra req irrigations (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra req irrigations
	 */
	@Override
	public List<WRAReqIrrigation> findAll(
		int start, int end,
		OrderByComparator<WRAReqIrrigation> orderByComparator,
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

		List<WRAReqIrrigation> list = null;

		if (useFinderCache) {
			list = (List<WRAReqIrrigation>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAREQIRRIGATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAREQIRRIGATION;

				sql = sql.concat(WRAReqIrrigationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WRAReqIrrigation>)QueryUtil.list(
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
	 * Removes all the wra req irrigations from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WRAReqIrrigation wraReqIrrigation : findAll()) {
			remove(wraReqIrrigation);
		}
	}

	/**
	 * Returns the number of wra req irrigations.
	 *
	 * @return the number of wra req irrigations
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_WRAREQIRRIGATION);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "wraReqIrrigationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAREQIRRIGATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WRAReqIrrigationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra req irrigation persistence.
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

		_finderPathFetchBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRA_By_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_By_Id",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		_finderPathWithPaginationFindBygetWRA_By_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWRA_By_AppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"wraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetWRA_By_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWRA_By_AppId",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRA_By_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_By_AppId",
			new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		_finderPathWithPaginationFindBygetWRA_By_CtrAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWRA_By_CtrAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"wraApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetWRA_By_CtrAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetWRA_By_CtrAppId", new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, true);

		_finderPathCountBygetWRA_By_CtrAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWRA_By_CtrAppId", new String[] {Long.class.getName()},
			new String[] {"wraApplicationId"}, false);

		WRAReqIrrigationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WRAReqIrrigationUtil.setPersistence(null);

		entityCache.removeCache(WRAReqIrrigationImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_WRAREQIRRIGATION =
		"SELECT wraReqIrrigation FROM WRAReqIrrigation wraReqIrrigation";

	private static final String _SQL_SELECT_WRAREQIRRIGATION_WHERE =
		"SELECT wraReqIrrigation FROM WRAReqIrrigation wraReqIrrigation WHERE ";

	private static final String _SQL_COUNT_WRAREQIRRIGATION =
		"SELECT COUNT(wraReqIrrigation) FROM WRAReqIrrigation wraReqIrrigation";

	private static final String _SQL_COUNT_WRAREQIRRIGATION_WHERE =
		"SELECT COUNT(wraReqIrrigation) FROM WRAReqIrrigation wraReqIrrigation WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "wraReqIrrigation.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WRAReqIrrigation exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WRAReqIrrigation exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WRAReqIrrigationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}