/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgriculturePoultryException;
import com.agriculture.application.form.service.model.AgriculturePoultry;
import com.agriculture.application.form.service.model.AgriculturePoultryTable;
import com.agriculture.application.form.service.model.impl.AgriculturePoultryImpl;
import com.agriculture.application.form.service.model.impl.AgriculturePoultryModelImpl;
import com.agriculture.application.form.service.service.persistence.AgriculturePoultryPersistence;
import com.agriculture.application.form.service.service.persistence.AgriculturePoultryUtil;
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
 * The persistence implementation for the agriculture poultry service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgriculturePoultryPersistence.class)
public class AgriculturePoultryPersistenceImpl
	extends BasePersistenceImpl<AgriculturePoultry>
	implements AgriculturePoultryPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgriculturePoultryUtil</code> to access the agriculture poultry persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgriculturePoultryImpl.class.getName();

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
	 * Returns the agriculture poultry where agricultureApplicationId = &#63; or throws a <code>NoSuchAgriculturePoultryException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a matching agriculture poultry could not be found
	 */
	@Override
	public AgriculturePoultry findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriculturePoultryException {

		AgriculturePoultry agriculturePoultry = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agriculturePoultry == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgriculturePoultryException(sb.toString());
		}

		return agriculturePoultry;
	}

	/**
	 * Returns the agriculture poultry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture poultry, or <code>null</code> if a matching agriculture poultry could not be found
	 */
	@Override
	public AgriculturePoultry fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture poultry where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture poultry, or <code>null</code> if a matching agriculture poultry could not be found
	 */
	@Override
	public AgriculturePoultry fetchBygetAgricultureById(
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

		if (result instanceof AgriculturePoultry) {
			AgriculturePoultry agriculturePoultry = (AgriculturePoultry)result;

			if (agricultureApplicationId !=
					agriculturePoultry.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREPOULTRY_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgriculturePoultry> list = query.list();

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
								"AgriculturePoultryPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgriculturePoultry agriculturePoultry = list.get(0);

					result = agriculturePoultry;

					cacheResult(agriculturePoultry);
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
			return (AgriculturePoultry)result;
		}
	}

	/**
	 * Removes the agriculture poultry where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture poultry that was removed
	 */
	@Override
	public AgriculturePoultry removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgriculturePoultryException {

		AgriculturePoultry agriculturePoultry = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agriculturePoultry);
	}

	/**
	 * Returns the number of agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture poultries
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREPOULTRY_WHERE);

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
			"agriculturePoultry.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAP_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAP_by_AAI;
	private FinderPath _finderPathCountBygetAP_by_AAI;

	/**
	 * Returns all the agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture poultries
	 */
	@Override
	public List<AgriculturePoultry> findBygetAP_by_AAI(
		long agricultureApplicationId) {

		return findBygetAP_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @return the range of matching agriculture poultries
	 */
	@Override
	public List<AgriculturePoultry> findBygetAP_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAP_by_AAI(agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture poultries
	 */
	@Override
	public List<AgriculturePoultry> findBygetAP_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriculturePoultry> orderByComparator) {

		return findBygetAP_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture poultries
	 */
	@Override
	public List<AgriculturePoultry> findBygetAP_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgriculturePoultry> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAP_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAP_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgriculturePoultry> list = null;

		if (useFinderCache) {
			list = (List<AgriculturePoultry>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgriculturePoultry agriculturePoultry : list) {
					if (agricultureApplicationId !=
							agriculturePoultry.getAgricultureApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRICULTUREPOULTRY_WHERE);

			sb.append(_FINDER_COLUMN_GETAP_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgriculturePoultryModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgriculturePoultry>)QueryUtil.list(
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
	 * Returns the first agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a matching agriculture poultry could not be found
	 */
	@Override
	public AgriculturePoultry findBygetAP_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgriculturePoultry> orderByComparator)
		throws NoSuchAgriculturePoultryException {

		AgriculturePoultry agriculturePoultry = fetchBygetAP_by_AAI_First(
			agricultureApplicationId, orderByComparator);

		if (agriculturePoultry != null) {
			return agriculturePoultry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgriculturePoultryException(sb.toString());
	}

	/**
	 * Returns the first agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture poultry, or <code>null</code> if a matching agriculture poultry could not be found
	 */
	@Override
	public AgriculturePoultry fetchBygetAP_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgriculturePoultry> orderByComparator) {

		List<AgriculturePoultry> list = findBygetAP_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a matching agriculture poultry could not be found
	 */
	@Override
	public AgriculturePoultry findBygetAP_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgriculturePoultry> orderByComparator)
		throws NoSuchAgriculturePoultryException {

		AgriculturePoultry agriculturePoultry = fetchBygetAP_by_AAI_Last(
			agricultureApplicationId, orderByComparator);

		if (agriculturePoultry != null) {
			return agriculturePoultry;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgriculturePoultryException(sb.toString());
	}

	/**
	 * Returns the last agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture poultry, or <code>null</code> if a matching agriculture poultry could not be found
	 */
	@Override
	public AgriculturePoultry fetchBygetAP_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgriculturePoultry> orderByComparator) {

		int count = countBygetAP_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgriculturePoultry> list = findBygetAP_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture poultries before and after the current agriculture poultry in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agriculturePoultryId the primary key of the current agriculture poultry
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a agriculture poultry with the primary key could not be found
	 */
	@Override
	public AgriculturePoultry[] findBygetAP_by_AAI_PrevAndNext(
			long agriculturePoultryId, long agricultureApplicationId,
			OrderByComparator<AgriculturePoultry> orderByComparator)
		throws NoSuchAgriculturePoultryException {

		AgriculturePoultry agriculturePoultry = findByPrimaryKey(
			agriculturePoultryId);

		Session session = null;

		try {
			session = openSession();

			AgriculturePoultry[] array = new AgriculturePoultryImpl[3];

			array[0] = getBygetAP_by_AAI_PrevAndNext(
				session, agriculturePoultry, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agriculturePoultry;

			array[2] = getBygetAP_by_AAI_PrevAndNext(
				session, agriculturePoultry, agricultureApplicationId,
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

	protected AgriculturePoultry getBygetAP_by_AAI_PrevAndNext(
		Session session, AgriculturePoultry agriculturePoultry,
		long agricultureApplicationId,
		OrderByComparator<AgriculturePoultry> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREPOULTRY_WHERE);

		sb.append(_FINDER_COLUMN_GETAP_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgriculturePoultryModelImpl.ORDER_BY_JPQL);
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
						agriculturePoultry)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgriculturePoultry> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture poultries where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAP_by_AAI(long agricultureApplicationId) {
		for (AgriculturePoultry agriculturePoultry :
				findBygetAP_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agriculturePoultry);
		}
	}

	/**
	 * Returns the number of agriculture poultries where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture poultries
	 */
	@Override
	public int countBygetAP_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAP_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREPOULTRY_WHERE);

			sb.append(_FINDER_COLUMN_GETAP_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETAP_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agriculturePoultry.agricultureApplicationId = ?";

	public AgriculturePoultryPersistenceImpl() {
		setModelClass(AgriculturePoultry.class);

		setModelImplClass(AgriculturePoultryImpl.class);
		setModelPKClass(long.class);

		setTable(AgriculturePoultryTable.INSTANCE);
	}

	/**
	 * Caches the agriculture poultry in the entity cache if it is enabled.
	 *
	 * @param agriculturePoultry the agriculture poultry
	 */
	@Override
	public void cacheResult(AgriculturePoultry agriculturePoultry) {
		entityCache.putResult(
			AgriculturePoultryImpl.class, agriculturePoultry.getPrimaryKey(),
			agriculturePoultry);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agriculturePoultry.getAgricultureApplicationId()},
			agriculturePoultry);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture poultries in the entity cache if it is enabled.
	 *
	 * @param agriculturePoultries the agriculture poultries
	 */
	@Override
	public void cacheResult(List<AgriculturePoultry> agriculturePoultries) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agriculturePoultries.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgriculturePoultry agriculturePoultry : agriculturePoultries) {
			if (entityCache.getResult(
					AgriculturePoultryImpl.class,
					agriculturePoultry.getPrimaryKey()) == null) {

				cacheResult(agriculturePoultry);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture poultries.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgriculturePoultryImpl.class);

		finderCache.clearCache(AgriculturePoultryImpl.class);
	}

	/**
	 * Clears the cache for the agriculture poultry.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgriculturePoultry agriculturePoultry) {
		entityCache.removeResult(
			AgriculturePoultryImpl.class, agriculturePoultry);
	}

	@Override
	public void clearCache(List<AgriculturePoultry> agriculturePoultries) {
		for (AgriculturePoultry agriculturePoultry : agriculturePoultries) {
			entityCache.removeResult(
				AgriculturePoultryImpl.class, agriculturePoultry);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgriculturePoultryImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AgriculturePoultryImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgriculturePoultryModelImpl agriculturePoultryModelImpl) {

		Object[] args = new Object[] {
			agriculturePoultryModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agriculturePoultryModelImpl);
	}

	/**
	 * Creates a new agriculture poultry with the primary key. Does not add the agriculture poultry to the database.
	 *
	 * @param agriculturePoultryId the primary key for the new agriculture poultry
	 * @return the new agriculture poultry
	 */
	@Override
	public AgriculturePoultry create(long agriculturePoultryId) {
		AgriculturePoultry agriculturePoultry = new AgriculturePoultryImpl();

		agriculturePoultry.setNew(true);
		agriculturePoultry.setPrimaryKey(agriculturePoultryId);

		agriculturePoultry.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agriculturePoultry;
	}

	/**
	 * Removes the agriculture poultry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agriculturePoultryId the primary key of the agriculture poultry
	 * @return the agriculture poultry that was removed
	 * @throws NoSuchAgriculturePoultryException if a agriculture poultry with the primary key could not be found
	 */
	@Override
	public AgriculturePoultry remove(long agriculturePoultryId)
		throws NoSuchAgriculturePoultryException {

		return remove((Serializable)agriculturePoultryId);
	}

	/**
	 * Removes the agriculture poultry with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture poultry
	 * @return the agriculture poultry that was removed
	 * @throws NoSuchAgriculturePoultryException if a agriculture poultry with the primary key could not be found
	 */
	@Override
	public AgriculturePoultry remove(Serializable primaryKey)
		throws NoSuchAgriculturePoultryException {

		Session session = null;

		try {
			session = openSession();

			AgriculturePoultry agriculturePoultry =
				(AgriculturePoultry)session.get(
					AgriculturePoultryImpl.class, primaryKey);

			if (agriculturePoultry == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgriculturePoultryException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agriculturePoultry);
		}
		catch (NoSuchAgriculturePoultryException noSuchEntityException) {
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
	protected AgriculturePoultry removeImpl(
		AgriculturePoultry agriculturePoultry) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agriculturePoultry)) {
				agriculturePoultry = (AgriculturePoultry)session.get(
					AgriculturePoultryImpl.class,
					agriculturePoultry.getPrimaryKeyObj());
			}

			if (agriculturePoultry != null) {
				session.delete(agriculturePoultry);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agriculturePoultry != null) {
			clearCache(agriculturePoultry);
		}

		return agriculturePoultry;
	}

	@Override
	public AgriculturePoultry updateImpl(
		AgriculturePoultry agriculturePoultry) {

		boolean isNew = agriculturePoultry.isNew();

		if (!(agriculturePoultry instanceof AgriculturePoultryModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agriculturePoultry.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agriculturePoultry);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agriculturePoultry proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgriculturePoultry implementation " +
					agriculturePoultry.getClass());
		}

		AgriculturePoultryModelImpl agriculturePoultryModelImpl =
			(AgriculturePoultryModelImpl)agriculturePoultry;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agriculturePoultry.getCreateDate() == null)) {
			if (serviceContext == null) {
				agriculturePoultry.setCreateDate(date);
			}
			else {
				agriculturePoultry.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agriculturePoultryModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agriculturePoultry.setModifiedDate(date);
			}
			else {
				agriculturePoultry.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agriculturePoultry);
			}
			else {
				agriculturePoultry = (AgriculturePoultry)session.merge(
					agriculturePoultry);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgriculturePoultryImpl.class, agriculturePoultryModelImpl, false,
			true);

		cacheUniqueFindersCache(agriculturePoultryModelImpl);

		if (isNew) {
			agriculturePoultry.setNew(false);
		}

		agriculturePoultry.resetOriginalValues();

		return agriculturePoultry;
	}

	/**
	 * Returns the agriculture poultry with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture poultry
	 * @return the agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a agriculture poultry with the primary key could not be found
	 */
	@Override
	public AgriculturePoultry findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgriculturePoultryException {

		AgriculturePoultry agriculturePoultry = fetchByPrimaryKey(primaryKey);

		if (agriculturePoultry == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgriculturePoultryException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agriculturePoultry;
	}

	/**
	 * Returns the agriculture poultry with the primary key or throws a <code>NoSuchAgriculturePoultryException</code> if it could not be found.
	 *
	 * @param agriculturePoultryId the primary key of the agriculture poultry
	 * @return the agriculture poultry
	 * @throws NoSuchAgriculturePoultryException if a agriculture poultry with the primary key could not be found
	 */
	@Override
	public AgriculturePoultry findByPrimaryKey(long agriculturePoultryId)
		throws NoSuchAgriculturePoultryException {

		return findByPrimaryKey((Serializable)agriculturePoultryId);
	}

	/**
	 * Returns the agriculture poultry with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agriculturePoultryId the primary key of the agriculture poultry
	 * @return the agriculture poultry, or <code>null</code> if a agriculture poultry with the primary key could not be found
	 */
	@Override
	public AgriculturePoultry fetchByPrimaryKey(long agriculturePoultryId) {
		return fetchByPrimaryKey((Serializable)agriculturePoultryId);
	}

	/**
	 * Returns all the agriculture poultries.
	 *
	 * @return the agriculture poultries
	 */
	@Override
	public List<AgriculturePoultry> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture poultries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @return the range of agriculture poultries
	 */
	@Override
	public List<AgriculturePoultry> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture poultries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture poultries
	 */
	@Override
	public List<AgriculturePoultry> findAll(
		int start, int end,
		OrderByComparator<AgriculturePoultry> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture poultries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgriculturePoultryModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture poultries
	 * @param end the upper bound of the range of agriculture poultries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture poultries
	 */
	@Override
	public List<AgriculturePoultry> findAll(
		int start, int end,
		OrderByComparator<AgriculturePoultry> orderByComparator,
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

		List<AgriculturePoultry> list = null;

		if (useFinderCache) {
			list = (List<AgriculturePoultry>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREPOULTRY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREPOULTRY;

				sql = sql.concat(AgriculturePoultryModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgriculturePoultry>)QueryUtil.list(
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
	 * Removes all the agriculture poultries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgriculturePoultry agriculturePoultry : findAll()) {
			remove(agriculturePoultry);
		}
	}

	/**
	 * Returns the number of agriculture poultries.
	 *
	 * @return the number of agriculture poultries
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
					_SQL_COUNT_AGRICULTUREPOULTRY);

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
		return "agriculturePoultryId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREPOULTRY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgriculturePoultryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture poultry persistence.
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

		_finderPathWithPaginationFindBygetAP_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAP_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAP_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAP_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAP_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAP_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgriculturePoultryUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgriculturePoultryUtil.setPersistence(null);

		entityCache.removeCache(AgriculturePoultryImpl.class.getName());
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

	private static final String _SQL_SELECT_AGRICULTUREPOULTRY =
		"SELECT agriculturePoultry FROM AgriculturePoultry agriculturePoultry";

	private static final String _SQL_SELECT_AGRICULTUREPOULTRY_WHERE =
		"SELECT agriculturePoultry FROM AgriculturePoultry agriculturePoultry WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREPOULTRY =
		"SELECT COUNT(agriculturePoultry) FROM AgriculturePoultry agriculturePoultry";

	private static final String _SQL_COUNT_AGRICULTUREPOULTRY_WHERE =
		"SELECT COUNT(agriculturePoultry) FROM AgriculturePoultry agriculturePoultry WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "agriculturePoultry.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgriculturePoultry exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgriculturePoultry exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgriculturePoultryPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}