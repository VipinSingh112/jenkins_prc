/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureBuildingException;
import com.agriculture.application.form.service.model.AgricultureBuilding;
import com.agriculture.application.form.service.model.AgricultureBuildingTable;
import com.agriculture.application.form.service.model.impl.AgricultureBuildingImpl;
import com.agriculture.application.form.service.model.impl.AgricultureBuildingModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureBuildingPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureBuildingUtil;
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
 * The persistence implementation for the agriculture building service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureBuildingPersistence.class)
public class AgricultureBuildingPersistenceImpl
	extends BasePersistenceImpl<AgricultureBuilding>
	implements AgricultureBuildingPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureBuildingUtil</code> to access the agriculture building persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureBuildingImpl.class.getName();

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
	 * Returns the agriculture building where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureBuildingException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	@Override
	public AgricultureBuilding findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureBuildingException {

		AgricultureBuilding agricultureBuilding = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agricultureBuilding == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureBuildingException(sb.toString());
		}

		return agricultureBuilding;
	}

	/**
	 * Returns the agriculture building where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	@Override
	public AgricultureBuilding fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture building where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	@Override
	public AgricultureBuilding fetchBygetAgricultureById(
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

		if (result instanceof AgricultureBuilding) {
			AgricultureBuilding agricultureBuilding =
				(AgricultureBuilding)result;

			if (agricultureApplicationId !=
					agricultureBuilding.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREBUILDING_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureBuilding> list = query.list();

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
								"AgricultureBuildingPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureBuilding agricultureBuilding = list.get(0);

					result = agricultureBuilding;

					cacheResult(agricultureBuilding);
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
			return (AgricultureBuilding)result;
		}
	}

	/**
	 * Removes the agriculture building where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture building that was removed
	 */
	@Override
	public AgricultureBuilding removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureBuildingException {

		AgricultureBuilding agricultureBuilding = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agricultureBuilding);
	}

	/**
	 * Returns the number of agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture buildings
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREBUILDING_WHERE);

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
			"agricultureBuilding.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAB_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAB_by_AAI;
	private FinderPath _finderPathCountBygetAB_by_AAI;

	/**
	 * Returns all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId) {

		return findBygetAB_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @return the range of matching agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAB_by_AAI(agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		return findBygetAB_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> findBygetAB_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAB_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAB_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureBuilding> list = null;

		if (useFinderCache) {
			list = (List<AgricultureBuilding>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureBuilding agricultureBuilding : list) {
					if (agricultureApplicationId !=
							agricultureBuilding.getAgricultureApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRICULTUREBUILDING_WHERE);

			sb.append(_FINDER_COLUMN_GETAB_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureBuildingModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgricultureBuilding>)QueryUtil.list(
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
	 * Returns the first agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	@Override
	public AgricultureBuilding findBygetAB_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureBuilding> orderByComparator)
		throws NoSuchAgricultureBuildingException {

		AgricultureBuilding agricultureBuilding = fetchBygetAB_by_AAI_First(
			agricultureApplicationId, orderByComparator);

		if (agricultureBuilding != null) {
			return agricultureBuilding;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureBuildingException(sb.toString());
	}

	/**
	 * Returns the first agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	@Override
	public AgricultureBuilding fetchBygetAB_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		List<AgricultureBuilding> list = findBygetAB_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture building
	 * @throws NoSuchAgricultureBuildingException if a matching agriculture building could not be found
	 */
	@Override
	public AgricultureBuilding findBygetAB_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureBuilding> orderByComparator)
		throws NoSuchAgricultureBuildingException {

		AgricultureBuilding agricultureBuilding = fetchBygetAB_by_AAI_Last(
			agricultureApplicationId, orderByComparator);

		if (agricultureBuilding != null) {
			return agricultureBuilding;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureBuildingException(sb.toString());
	}

	/**
	 * Returns the last agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture building, or <code>null</code> if a matching agriculture building could not be found
	 */
	@Override
	public AgricultureBuilding fetchBygetAB_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		int count = countBygetAB_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureBuilding> list = findBygetAB_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture buildings before and after the current agriculture building in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureBuildingId the primary key of the current agriculture building
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture building
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	@Override
	public AgricultureBuilding[] findBygetAB_by_AAI_PrevAndNext(
			long agricultureBuildingId, long agricultureApplicationId,
			OrderByComparator<AgricultureBuilding> orderByComparator)
		throws NoSuchAgricultureBuildingException {

		AgricultureBuilding agricultureBuilding = findByPrimaryKey(
			agricultureBuildingId);

		Session session = null;

		try {
			session = openSession();

			AgricultureBuilding[] array = new AgricultureBuildingImpl[3];

			array[0] = getBygetAB_by_AAI_PrevAndNext(
				session, agricultureBuilding, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agricultureBuilding;

			array[2] = getBygetAB_by_AAI_PrevAndNext(
				session, agricultureBuilding, agricultureApplicationId,
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

	protected AgricultureBuilding getBygetAB_by_AAI_PrevAndNext(
		Session session, AgricultureBuilding agricultureBuilding,
		long agricultureApplicationId,
		OrderByComparator<AgricultureBuilding> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREBUILDING_WHERE);

		sb.append(_FINDER_COLUMN_GETAB_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgricultureBuildingModelImpl.ORDER_BY_JPQL);
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
						agricultureBuilding)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureBuilding> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture buildings where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAB_by_AAI(long agricultureApplicationId) {
		for (AgricultureBuilding agricultureBuilding :
				findBygetAB_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureBuilding);
		}
	}

	/**
	 * Returns the number of agriculture buildings where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture buildings
	 */
	@Override
	public int countBygetAB_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAB_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREBUILDING_WHERE);

			sb.append(_FINDER_COLUMN_GETAB_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETAB_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultureBuilding.agricultureApplicationId = ?";

	public AgricultureBuildingPersistenceImpl() {
		setModelClass(AgricultureBuilding.class);

		setModelImplClass(AgricultureBuildingImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureBuildingTable.INSTANCE);
	}

	/**
	 * Caches the agriculture building in the entity cache if it is enabled.
	 *
	 * @param agricultureBuilding the agriculture building
	 */
	@Override
	public void cacheResult(AgricultureBuilding agricultureBuilding) {
		entityCache.putResult(
			AgricultureBuildingImpl.class, agricultureBuilding.getPrimaryKey(),
			agricultureBuilding);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultureBuilding.getAgricultureApplicationId()},
			agricultureBuilding);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture buildings in the entity cache if it is enabled.
	 *
	 * @param agricultureBuildings the agriculture buildings
	 */
	@Override
	public void cacheResult(List<AgricultureBuilding> agricultureBuildings) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureBuildings.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureBuilding agricultureBuilding : agricultureBuildings) {
			if (entityCache.getResult(
					AgricultureBuildingImpl.class,
					agricultureBuilding.getPrimaryKey()) == null) {

				cacheResult(agricultureBuilding);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture buildings.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureBuildingImpl.class);

		finderCache.clearCache(AgricultureBuildingImpl.class);
	}

	/**
	 * Clears the cache for the agriculture building.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureBuilding agricultureBuilding) {
		entityCache.removeResult(
			AgricultureBuildingImpl.class, agricultureBuilding);
	}

	@Override
	public void clearCache(List<AgricultureBuilding> agricultureBuildings) {
		for (AgricultureBuilding agricultureBuilding : agricultureBuildings) {
			entityCache.removeResult(
				AgricultureBuildingImpl.class, agricultureBuilding);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureBuildingImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AgricultureBuildingImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureBuildingModelImpl agricultureBuildingModelImpl) {

		Object[] args = new Object[] {
			agricultureBuildingModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultureBuildingModelImpl);
	}

	/**
	 * Creates a new agriculture building with the primary key. Does not add the agriculture building to the database.
	 *
	 * @param agricultureBuildingId the primary key for the new agriculture building
	 * @return the new agriculture building
	 */
	@Override
	public AgricultureBuilding create(long agricultureBuildingId) {
		AgricultureBuilding agricultureBuilding = new AgricultureBuildingImpl();

		agricultureBuilding.setNew(true);
		agricultureBuilding.setPrimaryKey(agricultureBuildingId);

		agricultureBuilding.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureBuilding;
	}

	/**
	 * Removes the agriculture building with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building that was removed
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	@Override
	public AgricultureBuilding remove(long agricultureBuildingId)
		throws NoSuchAgricultureBuildingException {

		return remove((Serializable)agricultureBuildingId);
	}

	/**
	 * Removes the agriculture building with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture building
	 * @return the agriculture building that was removed
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	@Override
	public AgricultureBuilding remove(Serializable primaryKey)
		throws NoSuchAgricultureBuildingException {

		Session session = null;

		try {
			session = openSession();

			AgricultureBuilding agricultureBuilding =
				(AgricultureBuilding)session.get(
					AgricultureBuildingImpl.class, primaryKey);

			if (agricultureBuilding == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureBuildingException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureBuilding);
		}
		catch (NoSuchAgricultureBuildingException noSuchEntityException) {
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
	protected AgricultureBuilding removeImpl(
		AgricultureBuilding agricultureBuilding) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureBuilding)) {
				agricultureBuilding = (AgricultureBuilding)session.get(
					AgricultureBuildingImpl.class,
					agricultureBuilding.getPrimaryKeyObj());
			}

			if (agricultureBuilding != null) {
				session.delete(agricultureBuilding);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureBuilding != null) {
			clearCache(agricultureBuilding);
		}

		return agricultureBuilding;
	}

	@Override
	public AgricultureBuilding updateImpl(
		AgricultureBuilding agricultureBuilding) {

		boolean isNew = agricultureBuilding.isNew();

		if (!(agricultureBuilding instanceof AgricultureBuildingModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureBuilding.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureBuilding);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureBuilding proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureBuilding implementation " +
					agricultureBuilding.getClass());
		}

		AgricultureBuildingModelImpl agricultureBuildingModelImpl =
			(AgricultureBuildingModelImpl)agricultureBuilding;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureBuilding.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureBuilding.setCreateDate(date);
			}
			else {
				agricultureBuilding.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureBuildingModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureBuilding.setModifiedDate(date);
			}
			else {
				agricultureBuilding.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureBuilding);
			}
			else {
				agricultureBuilding = (AgricultureBuilding)session.merge(
					agricultureBuilding);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureBuildingImpl.class, agricultureBuildingModelImpl, false,
			true);

		cacheUniqueFindersCache(agricultureBuildingModelImpl);

		if (isNew) {
			agricultureBuilding.setNew(false);
		}

		agricultureBuilding.resetOriginalValues();

		return agricultureBuilding;
	}

	/**
	 * Returns the agriculture building with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture building
	 * @return the agriculture building
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	@Override
	public AgricultureBuilding findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureBuildingException {

		AgricultureBuilding agricultureBuilding = fetchByPrimaryKey(primaryKey);

		if (agricultureBuilding == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureBuildingException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureBuilding;
	}

	/**
	 * Returns the agriculture building with the primary key or throws a <code>NoSuchAgricultureBuildingException</code> if it could not be found.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building
	 * @throws NoSuchAgricultureBuildingException if a agriculture building with the primary key could not be found
	 */
	@Override
	public AgricultureBuilding findByPrimaryKey(long agricultureBuildingId)
		throws NoSuchAgricultureBuildingException {

		return findByPrimaryKey((Serializable)agricultureBuildingId);
	}

	/**
	 * Returns the agriculture building with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureBuildingId the primary key of the agriculture building
	 * @return the agriculture building, or <code>null</code> if a agriculture building with the primary key could not be found
	 */
	@Override
	public AgricultureBuilding fetchByPrimaryKey(long agricultureBuildingId) {
		return fetchByPrimaryKey((Serializable)agricultureBuildingId);
	}

	/**
	 * Returns all the agriculture buildings.
	 *
	 * @return the agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @return the range of agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> findAll(
		int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture buildings.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureBuildingModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture buildings
	 * @param end the upper bound of the range of agriculture buildings (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture buildings
	 */
	@Override
	public List<AgricultureBuilding> findAll(
		int start, int end,
		OrderByComparator<AgricultureBuilding> orderByComparator,
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

		List<AgricultureBuilding> list = null;

		if (useFinderCache) {
			list = (List<AgricultureBuilding>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREBUILDING);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREBUILDING;

				sql = sql.concat(AgricultureBuildingModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureBuilding>)QueryUtil.list(
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
	 * Removes all the agriculture buildings from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureBuilding agricultureBuilding : findAll()) {
			remove(agricultureBuilding);
		}
	}

	/**
	 * Returns the number of agriculture buildings.
	 *
	 * @return the number of agriculture buildings
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
					_SQL_COUNT_AGRICULTUREBUILDING);

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
		return "agricultureBuildingId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREBUILDING;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureBuildingModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture building persistence.
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

		_finderPathWithPaginationFindBygetAB_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAB_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAB_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAB_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAB_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAB_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgricultureBuildingUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureBuildingUtil.setPersistence(null);

		entityCache.removeCache(AgricultureBuildingImpl.class.getName());
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

	private static final String _SQL_SELECT_AGRICULTUREBUILDING =
		"SELECT agricultureBuilding FROM AgricultureBuilding agricultureBuilding";

	private static final String _SQL_SELECT_AGRICULTUREBUILDING_WHERE =
		"SELECT agricultureBuilding FROM AgricultureBuilding agricultureBuilding WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREBUILDING =
		"SELECT COUNT(agricultureBuilding) FROM AgricultureBuilding agricultureBuilding";

	private static final String _SQL_COUNT_AGRICULTUREBUILDING_WHERE =
		"SELECT COUNT(agricultureBuilding) FROM AgricultureBuilding agricultureBuilding WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "agricultureBuilding.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureBuilding exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureBuilding exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureBuildingPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}