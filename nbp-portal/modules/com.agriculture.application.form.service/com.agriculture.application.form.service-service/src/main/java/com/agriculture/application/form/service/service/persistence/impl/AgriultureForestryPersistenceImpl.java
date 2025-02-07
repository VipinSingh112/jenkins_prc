/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgriultureForestryException;
import com.agriculture.application.form.service.model.AgriultureForestry;
import com.agriculture.application.form.service.model.AgriultureForestryTable;
import com.agriculture.application.form.service.model.impl.AgriultureForestryImpl;
import com.agriculture.application.form.service.model.impl.AgriultureForestryModelImpl;
import com.agriculture.application.form.service.service.persistence.AgriultureForestryPersistence;
import com.agriculture.application.form.service.service.persistence.AgriultureForestryUtil;
import com.agriculture.application.form.service.service.persistence.impl.constants.AGRICULTUREPersistenceConstants;

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
 * The persistence implementation for the agriulture forestry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgriultureForestryPersistence.class)
public class AgriultureForestryPersistenceImpl
	extends BasePersistenceImpl<AgriultureForestry>
	implements AgriultureForestryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgriultureForestryUtil</code> to access the agriulture forestry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgriultureForestryImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAgricultureById;
	private FinderPath _finderPathCountBygetAgricultureById;

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriultureForestryException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	@Override
	public AgriultureForestry findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriultureForestryException {

		AgriultureForestry agriultureForestry = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agriultureForestry == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgriultureForestryException(sb.toString());
		}

		return agriultureForestry;
	}

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	@Override
	public AgriultureForestry fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriulture forestry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	@Override
	public AgriultureForestry fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {agricultureApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgricultureById, finderArgs, this);
		}

		if (result instanceof AgriultureForestry) {
			AgriultureForestry agriultureForestry = (AgriultureForestry)result;

			if (agricultureApplicationId !=
					agriultureForestry.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRIULTUREFORESTRY_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgriultureForestry> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgricultureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									agricultureApplicationId
								};
							}

							_log.warn(
								"AgriultureForestryPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgriultureForestry agriultureForestry = list.get(0);

					result = agriultureForestry;

					cacheResult(agriultureForestry);
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
			return (AgriultureForestry)result;
		}
	}

	/**
	 * Removes the agriulture forestry where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriulture forestry that was removed
	 */
	@Override
	public AgriultureForestry removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriultureForestryException {

		AgriultureForestry agriultureForestry = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agriultureForestry);
	}

	/**
	 * Returns the number of agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriulture forestries
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRIULTUREFORESTRY_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2 =
			"agriultureForestry.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAForest_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAForest_by_AAI;
	private FinderPath _finderPathCountBygetAForest_by_AAI;

	/**
	 * Returns all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriulture forestries
	 */
	@Override
	public List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId) {

		return findBygetAForest_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @return the range of matching agriulture forestries
	 */
	@Override
	public List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAForest_by_AAI(
			agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriulture forestries
	 */
	@Override
	public List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		return findBygetAForest_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriulture forestries
	 */
	@Override
	public List<AgriultureForestry> findBygetAForest_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAForest_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAForest_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgriultureForestry> list = null;

		if (useFinderCache) {
			list = (List<AgriultureForestry>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgriultureForestry agriultureForestry : list) {
					if (agricultureApplicationId !=
							agriultureForestry.getAgricultureApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRIULTUREFORESTRY_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAFOREST_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgriultureForestryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgriultureForestry>)QueryUtil.list(
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
	 * Returns the first agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	@Override
	public AgriultureForestry findBygetAForest_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgriultureForestry> orderByComparator)
		throws NoSuchAgriultureForestryException {

		AgriultureForestry agriultureForestry = fetchBygetAForest_by_AAI_First(
			agricultureApplicationId, orderByComparator);

		if (agriultureForestry != null) {
			return agriultureForestry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgriultureForestryException(sb.toString());
	}

	/**
	 * Returns the first agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	@Override
	public AgriultureForestry fetchBygetAForest_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		List<AgriultureForestry> list = findBygetAForest_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a matching agriulture forestry could not be found
	 */
	@Override
	public AgriultureForestry findBygetAForest_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgriultureForestry> orderByComparator)
		throws NoSuchAgriultureForestryException {

		AgriultureForestry agriultureForestry = fetchBygetAForest_by_AAI_Last(
			agricultureApplicationId, orderByComparator);

		if (agriultureForestry != null) {
			return agriultureForestry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgriultureForestryException(sb.toString());
	}

	/**
	 * Returns the last agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriulture forestry, or <code>null</code> if a matching agriulture forestry could not be found
	 */
	@Override
	public AgriultureForestry fetchBygetAForest_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		int count = countBygetAForest_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgriultureForestry> list = findBygetAForest_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriulture forestries before and after the current agriulture forestry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agriultureForestryId the primary key of the current agriulture forestry
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	@Override
	public AgriultureForestry[] findBygetAForest_by_AAI_PrevAndNext(
			long agriultureForestryId, long agricultureApplicationId,
			OrderByComparator<AgriultureForestry> orderByComparator)
		throws NoSuchAgriultureForestryException {

		AgriultureForestry agriultureForestry = findByPrimaryKey(
			agriultureForestryId);

		Session session = null;

		try {
			session = openSession();

			AgriultureForestry[] array = new AgriultureForestryImpl[3];

			array[0] = getBygetAForest_by_AAI_PrevAndNext(
				session, agriultureForestry, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agriultureForestry;

			array[2] = getBygetAForest_by_AAI_PrevAndNext(
				session, agriultureForestry, agricultureApplicationId,
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

	protected AgriultureForestry getBygetAForest_by_AAI_PrevAndNext(
		Session session, AgriultureForestry agriultureForestry,
		long agricultureApplicationId,
		OrderByComparator<AgriultureForestry> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRIULTUREFORESTRY_WHERE);

		sb.append(_FINDER_COLUMN_GETAFOREST_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgriultureForestryModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(agricultureApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						agriultureForestry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgriultureForestry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriulture forestries where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAForest_by_AAI(long agricultureApplicationId) {
		for (AgriultureForestry agriultureForestry :
				findBygetAForest_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agriultureForestry);
		}
	}

	/**
	 * Returns the number of agriulture forestries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriulture forestries
	 */
	@Override
	public int countBygetAForest_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAForest_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRIULTUREFORESTRY_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAFOREST_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_GETAFOREST_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agriultureForestry.agricultureApplicationId = ?";

	public AgriultureForestryPersistenceImpl() {
		setModelClass(AgriultureForestry.class);

		setModelImplClass(AgriultureForestryImpl.class);
		setModelPKClass(long.class);

		setTable(AgriultureForestryTable.INSTANCE);
	}

	/**
	 * Caches the agriulture forestry in the entity cache if it is enabled.
	 *
	 * @param agriultureForestry the agriulture forestry
	 */
	@Override
	public void cacheResult(AgriultureForestry agriultureForestry) {
		entityCache.putResult(
			AgriultureForestryImpl.class, agriultureForestry.getPrimaryKey(),
			agriultureForestry);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agriultureForestry.getAgricultureApplicationId()},
			agriultureForestry);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriulture forestries in the entity cache if it is enabled.
	 *
	 * @param agriultureForestries the agriulture forestries
	 */
	@Override
	public void cacheResult(List<AgriultureForestry> agriultureForestries) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agriultureForestries.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgriultureForestry agriultureForestry : agriultureForestries) {
			if (entityCache.getResult(
					AgriultureForestryImpl.class,
					agriultureForestry.getPrimaryKey()) == null) {

				cacheResult(agriultureForestry);
			}
		}
	}

	/**
	 * Clears the cache for all agriulture forestries.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgriultureForestryImpl.class);

		finderCache.clearCache(AgriultureForestryImpl.class);
	}

	/**
	 * Clears the cache for the agriulture forestry.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgriultureForestry agriultureForestry) {
		entityCache.removeResult(
			AgriultureForestryImpl.class, agriultureForestry);
	}

	@Override
	public void clearCache(List<AgriultureForestry> agriultureForestries) {
		for (AgriultureForestry agriultureForestry : agriultureForestries) {
			entityCache.removeResult(
				AgriultureForestryImpl.class, agriultureForestry);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgriultureForestryImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AgriultureForestryImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgriultureForestryModelImpl agriultureForestryModelImpl) {

		Object[] args = new Object[] {
			agriultureForestryModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agriultureForestryModelImpl);
	}

	/**
	 * Creates a new agriulture forestry with the primary key. Does not add the agriulture forestry to the database.
	 *
	 * @param agriultureForestryId the primary key for the new agriulture forestry
	 * @return the new agriulture forestry
	 */
	@Override
	public AgriultureForestry create(long agriultureForestryId) {
		AgriultureForestry agriultureForestry = new AgriultureForestryImpl();

		agriultureForestry.setNew(true);
		agriultureForestry.setPrimaryKey(agriultureForestryId);

		agriultureForestry.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agriultureForestry;
	}

	/**
	 * Removes the agriulture forestry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry that was removed
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	@Override
	public AgriultureForestry remove(long agriultureForestryId)
		throws NoSuchAgriultureForestryException {

		return remove((Serializable)agriultureForestryId);
	}

	/**
	 * Removes the agriulture forestry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriulture forestry
	 * @return the agriulture forestry that was removed
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	@Override
	public AgriultureForestry remove(Serializable primaryKey)
		throws NoSuchAgriultureForestryException {

		Session session = null;

		try {
			session = openSession();

			AgriultureForestry agriultureForestry =
				(AgriultureForestry)session.get(
					AgriultureForestryImpl.class, primaryKey);

			if (agriultureForestry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgriultureForestryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agriultureForestry);
		}
		catch (NoSuchAgriultureForestryException noSuchEntityException) {
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
	protected AgriultureForestry removeImpl(
		AgriultureForestry agriultureForestry) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agriultureForestry)) {
				agriultureForestry = (AgriultureForestry)session.get(
					AgriultureForestryImpl.class,
					agriultureForestry.getPrimaryKeyObj());
			}

			if (agriultureForestry != null) {
				session.delete(agriultureForestry);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agriultureForestry != null) {
			clearCache(agriultureForestry);
		}

		return agriultureForestry;
	}

	@Override
	public AgriultureForestry updateImpl(
		AgriultureForestry agriultureForestry) {

		boolean isNew = agriultureForestry.isNew();

		if (!(agriultureForestry instanceof AgriultureForestryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agriultureForestry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agriultureForestry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agriultureForestry proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgriultureForestry implementation " +
					agriultureForestry.getClass());
		}

		AgriultureForestryModelImpl agriultureForestryModelImpl =
			(AgriultureForestryModelImpl)agriultureForestry;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agriultureForestry.getCreateDate() == null)) {
			if (serviceContext == null) {
				agriultureForestry.setCreateDate(date);
			}
			else {
				agriultureForestry.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agriultureForestryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agriultureForestry.setModifiedDate(date);
			}
			else {
				agriultureForestry.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agriultureForestry);
			}
			else {
				agriultureForestry = (AgriultureForestry)session.merge(
					agriultureForestry);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgriultureForestryImpl.class, agriultureForestryModelImpl, false,
			true);

		cacheUniqueFindersCache(agriultureForestryModelImpl);

		if (isNew) {
			agriultureForestry.setNew(false);
		}

		agriultureForestry.resetOriginalValues();

		return agriultureForestry;
	}

	/**
	 * Returns the agriulture forestry with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriulture forestry
	 * @return the agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	@Override
	public AgriultureForestry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgriultureForestryException {

		AgriultureForestry agriultureForestry = fetchByPrimaryKey(primaryKey);

		if (agriultureForestry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgriultureForestryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agriultureForestry;
	}

	/**
	 * Returns the agriulture forestry with the primary key or throws a <code>NoSuchAgriultureForestryException</code> if it could not be found.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry
	 * @throws NoSuchAgriultureForestryException if a agriulture forestry with the primary key could not be found
	 */
	@Override
	public AgriultureForestry findByPrimaryKey(long agriultureForestryId)
		throws NoSuchAgriultureForestryException {

		return findByPrimaryKey((Serializable)agriultureForestryId);
	}

	/**
	 * Returns the agriulture forestry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriultureForestryId the primary key of the agriulture forestry
	 * @return the agriulture forestry, or <code>null</code> if a agriulture forestry with the primary key could not be found
	 */
	@Override
	public AgriultureForestry fetchByPrimaryKey(long agriultureForestryId) {
		return fetchByPrimaryKey((Serializable)agriultureForestryId);
	}

	/**
	 * Returns all the agriulture forestries.
	 *
	 * @return the agriulture forestries
	 */
	@Override
	public List<AgriultureForestry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @return the range of agriulture forestries
	 */
	@Override
	public List<AgriultureForestry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriulture forestries
	 */
	@Override
	public List<AgriultureForestry> findAll(
		int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriulture forestries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriultureForestryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriulture forestries
	 * @param end the upper bound of the range of agriulture forestries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriulture forestries
	 */
	@Override
	public List<AgriultureForestry> findAll(
		int start, int end,
		OrderByComparator<AgriultureForestry> orderByComparator,
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

		List<AgriultureForestry> list = null;

		if (useFinderCache) {
			list = (List<AgriultureForestry>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRIULTUREFORESTRY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRIULTUREFORESTRY;

				sql = sql.concat(AgriultureForestryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgriultureForestry>)QueryUtil.list(
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
	 * Removes all the agriulture forestries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgriultureForestry agriultureForestry : findAll()) {
			remove(agriultureForestry);
		}
	}

	/**
	 * Returns the number of agriulture forestries.
	 *
	 * @return the number of agriulture forestries
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
					_SQL_COUNT_AGRIULTUREFORESTRY);

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
		return "agriultureForestryId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRIULTUREFORESTRY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgriultureForestryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriulture forestry persistence.
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

		_finderPathFetchBygetAgricultureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgricultureById",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAgricultureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureById", new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		_finderPathWithPaginationFindBygetAForest_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAForest_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAForest_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetAForest_by_AAI", new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAForest_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAForest_by_AAI", new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgriultureForestryUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgriultureForestryUtil.setPersistence(null);

		entityCache.removeCache(AgriultureForestryImpl.class.getName());
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_AGRIULTUREFORESTRY =
		"SELECT agriultureForestry FROM AgriultureForestry agriultureForestry";

	private static final String _SQL_SELECT_AGRIULTUREFORESTRY_WHERE =
		"SELECT agriultureForestry FROM AgriultureForestry agriultureForestry WHERE ";

	private static final String _SQL_COUNT_AGRIULTUREFORESTRY =
		"SELECT COUNT(agriultureForestry) FROM AgriultureForestry agriultureForestry";

	private static final String _SQL_COUNT_AGRIULTUREFORESTRY_WHERE =
		"SELECT COUNT(agriultureForestry) FROM AgriultureForestry agriultureForestry WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "agriultureForestry.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgriultureForestry exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgriultureForestry exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgriultureForestryPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}