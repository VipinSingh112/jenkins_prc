/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureLivestockException;
import com.agriculture.application.form.service.model.AgricultureLivestock;
import com.agriculture.application.form.service.model.AgricultureLivestockTable;
import com.agriculture.application.form.service.model.impl.AgricultureLivestockImpl;
import com.agriculture.application.form.service.model.impl.AgricultureLivestockModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureLivestockPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureLivestockUtil;
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
 * The persistence implementation for the agriculture livestock service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureLivestockPersistence.class)
public class AgricultureLivestockPersistenceImpl
	extends BasePersistenceImpl<AgricultureLivestock>
	implements AgricultureLivestockPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureLivestockUtil</code> to access the agriculture livestock persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureLivestockImpl.class.getName();

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
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureLivestockException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	@Override
	public AgricultureLivestock findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureLivestockException {

		AgricultureLivestock agricultureLivestock = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agricultureLivestock == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureLivestockException(sb.toString());
		}

		return agricultureLivestock;
	}

	/**
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	@Override
	public AgricultureLivestock fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture livestock where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	@Override
	public AgricultureLivestock fetchBygetAgricultureById(
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

		if (result instanceof AgricultureLivestock) {
			AgricultureLivestock agricultureLivestock =
				(AgricultureLivestock)result;

			if (agricultureApplicationId !=
					agricultureLivestock.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTURELIVESTOCK_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureLivestock> list = query.list();

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
								"AgricultureLivestockPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureLivestock agricultureLivestock = list.get(0);

					result = agricultureLivestock;

					cacheResult(agricultureLivestock);
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
			return (AgricultureLivestock)result;
		}
	}

	/**
	 * Removes the agriculture livestock where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture livestock that was removed
	 */
	@Override
	public AgricultureLivestock removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureLivestockException {

		AgricultureLivestock agricultureLivestock = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agricultureLivestock);
	}

	/**
	 * Returns the number of agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture livestocks
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTURELIVESTOCK_WHERE);

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
			"agricultureLivestock.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAL_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAL_by_AAI;
	private FinderPath _finderPathCountBygetAL_by_AAI;

	/**
	 * Returns all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture livestocks
	 */
	@Override
	public List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId) {

		return findBygetAL_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @return the range of matching agriculture livestocks
	 */
	@Override
	public List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAL_by_AAI(agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture livestocks
	 */
	@Override
	public List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		return findBygetAL_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture livestocks
	 */
	@Override
	public List<AgricultureLivestock> findBygetAL_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAL_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAL_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureLivestock> list = null;

		if (useFinderCache) {
			list = (List<AgricultureLivestock>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureLivestock agricultureLivestock : list) {
					if (agricultureApplicationId !=
							agricultureLivestock.
								getAgricultureApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRICULTURELIVESTOCK_WHERE);

			sb.append(_FINDER_COLUMN_GETAL_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureLivestockModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgricultureLivestock>)QueryUtil.list(
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
	 * Returns the first agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	@Override
	public AgricultureLivestock findBygetAL_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureLivestock> orderByComparator)
		throws NoSuchAgricultureLivestockException {

		AgricultureLivestock agricultureLivestock = fetchBygetAL_by_AAI_First(
			agricultureApplicationId, orderByComparator);

		if (agricultureLivestock != null) {
			return agricultureLivestock;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureLivestockException(sb.toString());
	}

	/**
	 * Returns the first agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	@Override
	public AgricultureLivestock fetchBygetAL_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		List<AgricultureLivestock> list = findBygetAL_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a matching agriculture livestock could not be found
	 */
	@Override
	public AgricultureLivestock findBygetAL_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureLivestock> orderByComparator)
		throws NoSuchAgricultureLivestockException {

		AgricultureLivestock agricultureLivestock = fetchBygetAL_by_AAI_Last(
			agricultureApplicationId, orderByComparator);

		if (agricultureLivestock != null) {
			return agricultureLivestock;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureLivestockException(sb.toString());
	}

	/**
	 * Returns the last agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture livestock, or <code>null</code> if a matching agriculture livestock could not be found
	 */
	@Override
	public AgricultureLivestock fetchBygetAL_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		int count = countBygetAL_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureLivestock> list = findBygetAL_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture livestocks before and after the current agriculture livestock in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureLivestockId the primary key of the current agriculture livestock
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	@Override
	public AgricultureLivestock[] findBygetAL_by_AAI_PrevAndNext(
			long agricultureLivestockId, long agricultureApplicationId,
			OrderByComparator<AgricultureLivestock> orderByComparator)
		throws NoSuchAgricultureLivestockException {

		AgricultureLivestock agricultureLivestock = findByPrimaryKey(
			agricultureLivestockId);

		Session session = null;

		try {
			session = openSession();

			AgricultureLivestock[] array = new AgricultureLivestockImpl[3];

			array[0] = getBygetAL_by_AAI_PrevAndNext(
				session, agricultureLivestock, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agricultureLivestock;

			array[2] = getBygetAL_by_AAI_PrevAndNext(
				session, agricultureLivestock, agricultureApplicationId,
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

	protected AgricultureLivestock getBygetAL_by_AAI_PrevAndNext(
		Session session, AgricultureLivestock agricultureLivestock,
		long agricultureApplicationId,
		OrderByComparator<AgricultureLivestock> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTURELIVESTOCK_WHERE);

		sb.append(_FINDER_COLUMN_GETAL_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgricultureLivestockModelImpl.ORDER_BY_JPQL);
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
						agricultureLivestock)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureLivestock> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture livestocks where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAL_by_AAI(long agricultureApplicationId) {
		for (AgricultureLivestock agricultureLivestock :
				findBygetAL_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureLivestock);
		}
	}

	/**
	 * Returns the number of agriculture livestocks where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture livestocks
	 */
	@Override
	public int countBygetAL_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAL_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTURELIVESTOCK_WHERE);

			sb.append(_FINDER_COLUMN_GETAL_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETAL_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultureLivestock.agricultureApplicationId = ?";

	public AgricultureLivestockPersistenceImpl() {
		setModelClass(AgricultureLivestock.class);

		setModelImplClass(AgricultureLivestockImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureLivestockTable.INSTANCE);
	}

	/**
	 * Caches the agriculture livestock in the entity cache if it is enabled.
	 *
	 * @param agricultureLivestock the agriculture livestock
	 */
	@Override
	public void cacheResult(AgricultureLivestock agricultureLivestock) {
		entityCache.putResult(
			AgricultureLivestockImpl.class,
			agricultureLivestock.getPrimaryKey(), agricultureLivestock);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultureLivestock.getAgricultureApplicationId()},
			agricultureLivestock);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture livestocks in the entity cache if it is enabled.
	 *
	 * @param agricultureLivestocks the agriculture livestocks
	 */
	@Override
	public void cacheResult(List<AgricultureLivestock> agricultureLivestocks) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureLivestocks.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureLivestock agricultureLivestock :
				agricultureLivestocks) {

			if (entityCache.getResult(
					AgricultureLivestockImpl.class,
					agricultureLivestock.getPrimaryKey()) == null) {

				cacheResult(agricultureLivestock);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture livestocks.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureLivestockImpl.class);

		finderCache.clearCache(AgricultureLivestockImpl.class);
	}

	/**
	 * Clears the cache for the agriculture livestock.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureLivestock agricultureLivestock) {
		entityCache.removeResult(
			AgricultureLivestockImpl.class, agricultureLivestock);
	}

	@Override
	public void clearCache(List<AgricultureLivestock> agricultureLivestocks) {
		for (AgricultureLivestock agricultureLivestock :
				agricultureLivestocks) {

			entityCache.removeResult(
				AgricultureLivestockImpl.class, agricultureLivestock);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureLivestockImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgricultureLivestockImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureLivestockModelImpl agricultureLivestockModelImpl) {

		Object[] args = new Object[] {
			agricultureLivestockModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultureLivestockModelImpl);
	}

	/**
	 * Creates a new agriculture livestock with the primary key. Does not add the agriculture livestock to the database.
	 *
	 * @param agricultureLivestockId the primary key for the new agriculture livestock
	 * @return the new agriculture livestock
	 */
	@Override
	public AgricultureLivestock create(long agricultureLivestockId) {
		AgricultureLivestock agricultureLivestock =
			new AgricultureLivestockImpl();

		agricultureLivestock.setNew(true);
		agricultureLivestock.setPrimaryKey(agricultureLivestockId);

		agricultureLivestock.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureLivestock;
	}

	/**
	 * Removes the agriculture livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock that was removed
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	@Override
	public AgricultureLivestock remove(long agricultureLivestockId)
		throws NoSuchAgricultureLivestockException {

		return remove((Serializable)agricultureLivestockId);
	}

	/**
	 * Removes the agriculture livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture livestock
	 * @return the agriculture livestock that was removed
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	@Override
	public AgricultureLivestock remove(Serializable primaryKey)
		throws NoSuchAgricultureLivestockException {

		Session session = null;

		try {
			session = openSession();

			AgricultureLivestock agricultureLivestock =
				(AgricultureLivestock)session.get(
					AgricultureLivestockImpl.class, primaryKey);

			if (agricultureLivestock == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureLivestockException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureLivestock);
		}
		catch (NoSuchAgricultureLivestockException noSuchEntityException) {
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
	protected AgricultureLivestock removeImpl(
		AgricultureLivestock agricultureLivestock) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureLivestock)) {
				agricultureLivestock = (AgricultureLivestock)session.get(
					AgricultureLivestockImpl.class,
					agricultureLivestock.getPrimaryKeyObj());
			}

			if (agricultureLivestock != null) {
				session.delete(agricultureLivestock);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureLivestock != null) {
			clearCache(agricultureLivestock);
		}

		return agricultureLivestock;
	}

	@Override
	public AgricultureLivestock updateImpl(
		AgricultureLivestock agricultureLivestock) {

		boolean isNew = agricultureLivestock.isNew();

		if (!(agricultureLivestock instanceof AgricultureLivestockModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureLivestock.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureLivestock);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureLivestock proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureLivestock implementation " +
					agricultureLivestock.getClass());
		}

		AgricultureLivestockModelImpl agricultureLivestockModelImpl =
			(AgricultureLivestockModelImpl)agricultureLivestock;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureLivestock.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureLivestock.setCreateDate(date);
			}
			else {
				agricultureLivestock.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureLivestockModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureLivestock.setModifiedDate(date);
			}
			else {
				agricultureLivestock.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureLivestock);
			}
			else {
				agricultureLivestock = (AgricultureLivestock)session.merge(
					agricultureLivestock);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureLivestockImpl.class, agricultureLivestockModelImpl,
			false, true);

		cacheUniqueFindersCache(agricultureLivestockModelImpl);

		if (isNew) {
			agricultureLivestock.setNew(false);
		}

		agricultureLivestock.resetOriginalValues();

		return agricultureLivestock;
	}

	/**
	 * Returns the agriculture livestock with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture livestock
	 * @return the agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	@Override
	public AgricultureLivestock findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureLivestockException {

		AgricultureLivestock agricultureLivestock = fetchByPrimaryKey(
			primaryKey);

		if (agricultureLivestock == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureLivestockException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureLivestock;
	}

	/**
	 * Returns the agriculture livestock with the primary key or throws a <code>NoSuchAgricultureLivestockException</code> if it could not be found.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock
	 * @throws NoSuchAgricultureLivestockException if a agriculture livestock with the primary key could not be found
	 */
	@Override
	public AgricultureLivestock findByPrimaryKey(long agricultureLivestockId)
		throws NoSuchAgricultureLivestockException {

		return findByPrimaryKey((Serializable)agricultureLivestockId);
	}

	/**
	 * Returns the agriculture livestock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureLivestockId the primary key of the agriculture livestock
	 * @return the agriculture livestock, or <code>null</code> if a agriculture livestock with the primary key could not be found
	 */
	@Override
	public AgricultureLivestock fetchByPrimaryKey(long agricultureLivestockId) {
		return fetchByPrimaryKey((Serializable)agricultureLivestockId);
	}

	/**
	 * Returns all the agriculture livestocks.
	 *
	 * @return the agriculture livestocks
	 */
	@Override
	public List<AgricultureLivestock> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @return the range of agriculture livestocks
	 */
	@Override
	public List<AgricultureLivestock> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture livestocks
	 */
	@Override
	public List<AgricultureLivestock> findAll(
		int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture livestocks
	 * @param end the upper bound of the range of agriculture livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture livestocks
	 */
	@Override
	public List<AgricultureLivestock> findAll(
		int start, int end,
		OrderByComparator<AgricultureLivestock> orderByComparator,
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

		List<AgricultureLivestock> list = null;

		if (useFinderCache) {
			list = (List<AgricultureLivestock>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTURELIVESTOCK);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTURELIVESTOCK;

				sql = sql.concat(AgricultureLivestockModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureLivestock>)QueryUtil.list(
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
	 * Removes all the agriculture livestocks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureLivestock agricultureLivestock : findAll()) {
			remove(agricultureLivestock);
		}
	}

	/**
	 * Returns the number of agriculture livestocks.
	 *
	 * @return the number of agriculture livestocks
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
					_SQL_COUNT_AGRICULTURELIVESTOCK);

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
		return "agricultureLivestockId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTURELIVESTOCK;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureLivestockModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture livestock persistence.
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

		_finderPathWithPaginationFindBygetAL_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAL_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAL_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAL_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAL_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAL_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgricultureLivestockUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureLivestockUtil.setPersistence(null);

		entityCache.removeCache(AgricultureLivestockImpl.class.getName());
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

	private static final String _SQL_SELECT_AGRICULTURELIVESTOCK =
		"SELECT agricultureLivestock FROM AgricultureLivestock agricultureLivestock";

	private static final String _SQL_SELECT_AGRICULTURELIVESTOCK_WHERE =
		"SELECT agricultureLivestock FROM AgricultureLivestock agricultureLivestock WHERE ";

	private static final String _SQL_COUNT_AGRICULTURELIVESTOCK =
		"SELECT COUNT(agricultureLivestock) FROM AgricultureLivestock agricultureLivestock";

	private static final String _SQL_COUNT_AGRICULTURELIVESTOCK_WHERE =
		"SELECT COUNT(agricultureLivestock) FROM AgricultureLivestock agricultureLivestock WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agricultureLivestock.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureLivestock exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureLivestock exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureLivestockPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}