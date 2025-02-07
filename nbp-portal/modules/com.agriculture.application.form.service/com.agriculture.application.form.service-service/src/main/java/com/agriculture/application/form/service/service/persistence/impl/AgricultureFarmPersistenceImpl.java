/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureFarmException;
import com.agriculture.application.form.service.model.AgricultureFarm;
import com.agriculture.application.form.service.model.AgricultureFarmTable;
import com.agriculture.application.form.service.model.impl.AgricultureFarmImpl;
import com.agriculture.application.form.service.model.impl.AgricultureFarmModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureFarmPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureFarmUtil;
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
 * The persistence implementation for the agriculture farm service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureFarmPersistence.class)
public class AgricultureFarmPersistenceImpl
	extends BasePersistenceImpl<AgricultureFarm>
	implements AgricultureFarmPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureFarmUtil</code> to access the agriculture farm persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureFarmImpl.class.getName();

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
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureFarmException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	@Override
	public AgricultureFarm findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureFarmException {

		AgricultureFarm agricultureFarm = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agricultureFarm == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureFarmException(sb.toString());
		}

		return agricultureFarm;
	}

	/**
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	@Override
	public AgricultureFarm fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture farm where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	@Override
	public AgricultureFarm fetchBygetAgricultureById(
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

		if (result instanceof AgricultureFarm) {
			AgricultureFarm agricultureFarm = (AgricultureFarm)result;

			if (agricultureApplicationId !=
					agricultureFarm.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREFARM_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureFarm> list = query.list();

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
								"AgricultureFarmPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureFarm agricultureFarm = list.get(0);

					result = agricultureFarm;

					cacheResult(agricultureFarm);
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
			return (AgricultureFarm)result;
		}
	}

	/**
	 * Removes the agriculture farm where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture farm that was removed
	 */
	@Override
	public AgricultureFarm removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureFarmException {

		AgricultureFarm agricultureFarm = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agricultureFarm);
	}

	/**
	 * Returns the number of agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture farms
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREFARM_WHERE);

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
			"agricultureFarm.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAFa_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAFa_by_AAI;
	private FinderPath _finderPathCountBygetAFa_by_AAI;

	/**
	 * Returns all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture farms
	 */
	@Override
	public List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId) {

		return findBygetAFa_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @return the range of matching agriculture farms
	 */
	@Override
	public List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAFa_by_AAI(agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture farms
	 */
	@Override
	public List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		return findBygetAFa_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture farms
	 */
	@Override
	public List<AgricultureFarm> findBygetAFa_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAFa_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAFa_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureFarm> list = null;

		if (useFinderCache) {
			list = (List<AgricultureFarm>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureFarm agricultureFarm : list) {
					if (agricultureApplicationId !=
							agricultureFarm.getAgricultureApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRICULTUREFARM_WHERE);

			sb.append(_FINDER_COLUMN_GETAFA_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureFarmModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgricultureFarm>)QueryUtil.list(
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
	 * Returns the first agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	@Override
	public AgricultureFarm findBygetAFa_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureFarm> orderByComparator)
		throws NoSuchAgricultureFarmException {

		AgricultureFarm agricultureFarm = fetchBygetAFa_by_AAI_First(
			agricultureApplicationId, orderByComparator);

		if (agricultureFarm != null) {
			return agricultureFarm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureFarmException(sb.toString());
	}

	/**
	 * Returns the first agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	@Override
	public AgricultureFarm fetchBygetAFa_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		List<AgricultureFarm> list = findBygetAFa_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture farm
	 * @throws NoSuchAgricultureFarmException if a matching agriculture farm could not be found
	 */
	@Override
	public AgricultureFarm findBygetAFa_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureFarm> orderByComparator)
		throws NoSuchAgricultureFarmException {

		AgricultureFarm agricultureFarm = fetchBygetAFa_by_AAI_Last(
			agricultureApplicationId, orderByComparator);

		if (agricultureFarm != null) {
			return agricultureFarm;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureFarmException(sb.toString());
	}

	/**
	 * Returns the last agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture farm, or <code>null</code> if a matching agriculture farm could not be found
	 */
	@Override
	public AgricultureFarm fetchBygetAFa_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		int count = countBygetAFa_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureFarm> list = findBygetAFa_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture farms before and after the current agriculture farm in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureFarmId the primary key of the current agriculture farm
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture farm
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	@Override
	public AgricultureFarm[] findBygetAFa_by_AAI_PrevAndNext(
			long agricultureFarmId, long agricultureApplicationId,
			OrderByComparator<AgricultureFarm> orderByComparator)
		throws NoSuchAgricultureFarmException {

		AgricultureFarm agricultureFarm = findByPrimaryKey(agricultureFarmId);

		Session session = null;

		try {
			session = openSession();

			AgricultureFarm[] array = new AgricultureFarmImpl[3];

			array[0] = getBygetAFa_by_AAI_PrevAndNext(
				session, agricultureFarm, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agricultureFarm;

			array[2] = getBygetAFa_by_AAI_PrevAndNext(
				session, agricultureFarm, agricultureApplicationId,
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

	protected AgricultureFarm getBygetAFa_by_AAI_PrevAndNext(
		Session session, AgricultureFarm agricultureFarm,
		long agricultureApplicationId,
		OrderByComparator<AgricultureFarm> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREFARM_WHERE);

		sb.append(_FINDER_COLUMN_GETAFA_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgricultureFarmModelImpl.ORDER_BY_JPQL);
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
						agricultureFarm)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureFarm> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture farms where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAFa_by_AAI(long agricultureApplicationId) {
		for (AgricultureFarm agricultureFarm :
				findBygetAFa_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureFarm);
		}
	}

	/**
	 * Returns the number of agriculture farms where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture farms
	 */
	@Override
	public int countBygetAFa_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAFa_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREFARM_WHERE);

			sb.append(_FINDER_COLUMN_GETAFA_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETAFA_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultureFarm.agricultureApplicationId = ?";

	public AgricultureFarmPersistenceImpl() {
		setModelClass(AgricultureFarm.class);

		setModelImplClass(AgricultureFarmImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureFarmTable.INSTANCE);
	}

	/**
	 * Caches the agriculture farm in the entity cache if it is enabled.
	 *
	 * @param agricultureFarm the agriculture farm
	 */
	@Override
	public void cacheResult(AgricultureFarm agricultureFarm) {
		entityCache.putResult(
			AgricultureFarmImpl.class, agricultureFarm.getPrimaryKey(),
			agricultureFarm);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultureFarm.getAgricultureApplicationId()},
			agricultureFarm);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture farms in the entity cache if it is enabled.
	 *
	 * @param agricultureFarms the agriculture farms
	 */
	@Override
	public void cacheResult(List<AgricultureFarm> agricultureFarms) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureFarms.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureFarm agricultureFarm : agricultureFarms) {
			if (entityCache.getResult(
					AgricultureFarmImpl.class,
					agricultureFarm.getPrimaryKey()) == null) {

				cacheResult(agricultureFarm);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture farms.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureFarmImpl.class);

		finderCache.clearCache(AgricultureFarmImpl.class);
	}

	/**
	 * Clears the cache for the agriculture farm.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureFarm agricultureFarm) {
		entityCache.removeResult(AgricultureFarmImpl.class, agricultureFarm);
	}

	@Override
	public void clearCache(List<AgricultureFarm> agricultureFarms) {
		for (AgricultureFarm agricultureFarm : agricultureFarms) {
			entityCache.removeResult(
				AgricultureFarmImpl.class, agricultureFarm);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureFarmImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AgricultureFarmImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureFarmModelImpl agricultureFarmModelImpl) {

		Object[] args = new Object[] {
			agricultureFarmModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultureFarmModelImpl);
	}

	/**
	 * Creates a new agriculture farm with the primary key. Does not add the agriculture farm to the database.
	 *
	 * @param agricultureFarmId the primary key for the new agriculture farm
	 * @return the new agriculture farm
	 */
	@Override
	public AgricultureFarm create(long agricultureFarmId) {
		AgricultureFarm agricultureFarm = new AgricultureFarmImpl();

		agricultureFarm.setNew(true);
		agricultureFarm.setPrimaryKey(agricultureFarmId);

		agricultureFarm.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureFarm;
	}

	/**
	 * Removes the agriculture farm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm that was removed
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	@Override
	public AgricultureFarm remove(long agricultureFarmId)
		throws NoSuchAgricultureFarmException {

		return remove((Serializable)agricultureFarmId);
	}

	/**
	 * Removes the agriculture farm with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture farm
	 * @return the agriculture farm that was removed
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	@Override
	public AgricultureFarm remove(Serializable primaryKey)
		throws NoSuchAgricultureFarmException {

		Session session = null;

		try {
			session = openSession();

			AgricultureFarm agricultureFarm = (AgricultureFarm)session.get(
				AgricultureFarmImpl.class, primaryKey);

			if (agricultureFarm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureFarmException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureFarm);
		}
		catch (NoSuchAgricultureFarmException noSuchEntityException) {
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
	protected AgricultureFarm removeImpl(AgricultureFarm agricultureFarm) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureFarm)) {
				agricultureFarm = (AgricultureFarm)session.get(
					AgricultureFarmImpl.class,
					agricultureFarm.getPrimaryKeyObj());
			}

			if (agricultureFarm != null) {
				session.delete(agricultureFarm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureFarm != null) {
			clearCache(agricultureFarm);
		}

		return agricultureFarm;
	}

	@Override
	public AgricultureFarm updateImpl(AgricultureFarm agricultureFarm) {
		boolean isNew = agricultureFarm.isNew();

		if (!(agricultureFarm instanceof AgricultureFarmModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureFarm.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureFarm);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureFarm proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureFarm implementation " +
					agricultureFarm.getClass());
		}

		AgricultureFarmModelImpl agricultureFarmModelImpl =
			(AgricultureFarmModelImpl)agricultureFarm;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureFarm.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureFarm.setCreateDate(date);
			}
			else {
				agricultureFarm.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureFarmModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureFarm.setModifiedDate(date);
			}
			else {
				agricultureFarm.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureFarm);
			}
			else {
				agricultureFarm = (AgricultureFarm)session.merge(
					agricultureFarm);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureFarmImpl.class, agricultureFarmModelImpl, false, true);

		cacheUniqueFindersCache(agricultureFarmModelImpl);

		if (isNew) {
			agricultureFarm.setNew(false);
		}

		agricultureFarm.resetOriginalValues();

		return agricultureFarm;
	}

	/**
	 * Returns the agriculture farm with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture farm
	 * @return the agriculture farm
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	@Override
	public AgricultureFarm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureFarmException {

		AgricultureFarm agricultureFarm = fetchByPrimaryKey(primaryKey);

		if (agricultureFarm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureFarmException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureFarm;
	}

	/**
	 * Returns the agriculture farm with the primary key or throws a <code>NoSuchAgricultureFarmException</code> if it could not be found.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm
	 * @throws NoSuchAgricultureFarmException if a agriculture farm with the primary key could not be found
	 */
	@Override
	public AgricultureFarm findByPrimaryKey(long agricultureFarmId)
		throws NoSuchAgricultureFarmException {

		return findByPrimaryKey((Serializable)agricultureFarmId);
	}

	/**
	 * Returns the agriculture farm with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureFarmId the primary key of the agriculture farm
	 * @return the agriculture farm, or <code>null</code> if a agriculture farm with the primary key could not be found
	 */
	@Override
	public AgricultureFarm fetchByPrimaryKey(long agricultureFarmId) {
		return fetchByPrimaryKey((Serializable)agricultureFarmId);
	}

	/**
	 * Returns all the agriculture farms.
	 *
	 * @return the agriculture farms
	 */
	@Override
	public List<AgricultureFarm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @return the range of agriculture farms
	 */
	@Override
	public List<AgricultureFarm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture farms
	 */
	@Override
	public List<AgricultureFarm> findAll(
		int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture farms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureFarmModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture farms
	 * @param end the upper bound of the range of agriculture farms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture farms
	 */
	@Override
	public List<AgricultureFarm> findAll(
		int start, int end,
		OrderByComparator<AgricultureFarm> orderByComparator,
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

		List<AgricultureFarm> list = null;

		if (useFinderCache) {
			list = (List<AgricultureFarm>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREFARM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREFARM;

				sql = sql.concat(AgricultureFarmModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureFarm>)QueryUtil.list(
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
	 * Removes all the agriculture farms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureFarm agricultureFarm : findAll()) {
			remove(agricultureFarm);
		}
	}

	/**
	 * Returns the number of agriculture farms.
	 *
	 * @return the number of agriculture farms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_AGRICULTUREFARM);

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
		return "agricultureFarmId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREFARM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureFarmModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture farm persistence.
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

		_finderPathWithPaginationFindBygetAFa_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAFa_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAFa_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAFa_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAFa_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAFa_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgricultureFarmUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureFarmUtil.setPersistence(null);

		entityCache.removeCache(AgricultureFarmImpl.class.getName());
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

	private static final String _SQL_SELECT_AGRICULTUREFARM =
		"SELECT agricultureFarm FROM AgricultureFarm agricultureFarm";

	private static final String _SQL_SELECT_AGRICULTUREFARM_WHERE =
		"SELECT agricultureFarm FROM AgricultureFarm agricultureFarm WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREFARM =
		"SELECT COUNT(agricultureFarm) FROM AgricultureFarm agricultureFarm";

	private static final String _SQL_COUNT_AGRICULTUREFARM_WHERE =
		"SELECT COUNT(agricultureFarm) FROM AgricultureFarm agricultureFarm WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "agricultureFarm.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureFarm exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureFarm exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureFarmPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}