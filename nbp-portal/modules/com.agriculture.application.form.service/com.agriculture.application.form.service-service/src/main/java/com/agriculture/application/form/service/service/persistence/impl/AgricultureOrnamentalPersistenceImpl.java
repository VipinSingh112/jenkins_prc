/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureOrnamentalException;
import com.agriculture.application.form.service.model.AgricultureOrnamental;
import com.agriculture.application.form.service.model.AgricultureOrnamentalTable;
import com.agriculture.application.form.service.model.impl.AgricultureOrnamentalImpl;
import com.agriculture.application.form.service.model.impl.AgricultureOrnamentalModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureOrnamentalPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureOrnamentalUtil;
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
 * The persistence implementation for the agriculture ornamental service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureOrnamentalPersistence.class)
public class AgricultureOrnamentalPersistenceImpl
	extends BasePersistenceImpl<AgricultureOrnamental>
	implements AgricultureOrnamentalPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureOrnamentalUtil</code> to access the agriculture ornamental persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureOrnamentalImpl.class.getName();

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
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureOrnamentalException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	@Override
	public AgricultureOrnamental findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureOrnamentalException {

		AgricultureOrnamental agricultureOrnamental = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agricultureOrnamental == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureOrnamentalException(sb.toString());
		}

		return agricultureOrnamental;
	}

	/**
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	@Override
	public AgricultureOrnamental fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture ornamental where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	@Override
	public AgricultureOrnamental fetchBygetAgricultureById(
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

		if (result instanceof AgricultureOrnamental) {
			AgricultureOrnamental agricultureOrnamental =
				(AgricultureOrnamental)result;

			if (agricultureApplicationId !=
					agricultureOrnamental.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREORNAMENTAL_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureOrnamental> list = query.list();

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
								"AgricultureOrnamentalPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureOrnamental agricultureOrnamental = list.get(0);

					result = agricultureOrnamental;

					cacheResult(agricultureOrnamental);
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
			return (AgricultureOrnamental)result;
		}
	}

	/**
	 * Removes the agriculture ornamental where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture ornamental that was removed
	 */
	@Override
	public AgricultureOrnamental removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureOrnamentalException {

		AgricultureOrnamental agricultureOrnamental = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agricultureOrnamental);
	}

	/**
	 * Returns the number of agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture ornamentals
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREORNAMENTAL_WHERE);

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
			"agricultureOrnamental.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAO_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAO_by_AAI;
	private FinderPath _finderPathCountBygetAO_by_AAI;

	/**
	 * Returns all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture ornamentals
	 */
	@Override
	public List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId) {

		return findBygetAO_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @return the range of matching agriculture ornamentals
	 */
	@Override
	public List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAO_by_AAI(agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture ornamentals
	 */
	@Override
	public List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		return findBygetAO_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture ornamentals
	 */
	@Override
	public List<AgricultureOrnamental> findBygetAO_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAO_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAO_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureOrnamental> list = null;

		if (useFinderCache) {
			list = (List<AgricultureOrnamental>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureOrnamental agricultureOrnamental : list) {
					if (agricultureApplicationId !=
							agricultureOrnamental.
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

			sb.append(_SQL_SELECT_AGRICULTUREORNAMENTAL_WHERE);

			sb.append(_FINDER_COLUMN_GETAO_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureOrnamentalModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgricultureOrnamental>)QueryUtil.list(
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
	 * Returns the first agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	@Override
	public AgricultureOrnamental findBygetAO_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureOrnamental> orderByComparator)
		throws NoSuchAgricultureOrnamentalException {

		AgricultureOrnamental agricultureOrnamental = fetchBygetAO_by_AAI_First(
			agricultureApplicationId, orderByComparator);

		if (agricultureOrnamental != null) {
			return agricultureOrnamental;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureOrnamentalException(sb.toString());
	}

	/**
	 * Returns the first agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	@Override
	public AgricultureOrnamental fetchBygetAO_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		List<AgricultureOrnamental> list = findBygetAO_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a matching agriculture ornamental could not be found
	 */
	@Override
	public AgricultureOrnamental findBygetAO_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureOrnamental> orderByComparator)
		throws NoSuchAgricultureOrnamentalException {

		AgricultureOrnamental agricultureOrnamental = fetchBygetAO_by_AAI_Last(
			agricultureApplicationId, orderByComparator);

		if (agricultureOrnamental != null) {
			return agricultureOrnamental;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureOrnamentalException(sb.toString());
	}

	/**
	 * Returns the last agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture ornamental, or <code>null</code> if a matching agriculture ornamental could not be found
	 */
	@Override
	public AgricultureOrnamental fetchBygetAO_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		int count = countBygetAO_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureOrnamental> list = findBygetAO_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture ornamentals before and after the current agriculture ornamental in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureOrnamentalId the primary key of the current agriculture ornamental
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	@Override
	public AgricultureOrnamental[] findBygetAO_by_AAI_PrevAndNext(
			long agricultureOrnamentalId, long agricultureApplicationId,
			OrderByComparator<AgricultureOrnamental> orderByComparator)
		throws NoSuchAgricultureOrnamentalException {

		AgricultureOrnamental agricultureOrnamental = findByPrimaryKey(
			agricultureOrnamentalId);

		Session session = null;

		try {
			session = openSession();

			AgricultureOrnamental[] array = new AgricultureOrnamentalImpl[3];

			array[0] = getBygetAO_by_AAI_PrevAndNext(
				session, agricultureOrnamental, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agricultureOrnamental;

			array[2] = getBygetAO_by_AAI_PrevAndNext(
				session, agricultureOrnamental, agricultureApplicationId,
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

	protected AgricultureOrnamental getBygetAO_by_AAI_PrevAndNext(
		Session session, AgricultureOrnamental agricultureOrnamental,
		long agricultureApplicationId,
		OrderByComparator<AgricultureOrnamental> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREORNAMENTAL_WHERE);

		sb.append(_FINDER_COLUMN_GETAO_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgricultureOrnamentalModelImpl.ORDER_BY_JPQL);
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
						agricultureOrnamental)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureOrnamental> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture ornamentals where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAO_by_AAI(long agricultureApplicationId) {
		for (AgricultureOrnamental agricultureOrnamental :
				findBygetAO_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureOrnamental);
		}
	}

	/**
	 * Returns the number of agriculture ornamentals where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture ornamentals
	 */
	@Override
	public int countBygetAO_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAO_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREORNAMENTAL_WHERE);

			sb.append(_FINDER_COLUMN_GETAO_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETAO_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultureOrnamental.agricultureApplicationId = ?";

	public AgricultureOrnamentalPersistenceImpl() {
		setModelClass(AgricultureOrnamental.class);

		setModelImplClass(AgricultureOrnamentalImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureOrnamentalTable.INSTANCE);
	}

	/**
	 * Caches the agriculture ornamental in the entity cache if it is enabled.
	 *
	 * @param agricultureOrnamental the agriculture ornamental
	 */
	@Override
	public void cacheResult(AgricultureOrnamental agricultureOrnamental) {
		entityCache.putResult(
			AgricultureOrnamentalImpl.class,
			agricultureOrnamental.getPrimaryKey(), agricultureOrnamental);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultureOrnamental.getAgricultureApplicationId()},
			agricultureOrnamental);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture ornamentals in the entity cache if it is enabled.
	 *
	 * @param agricultureOrnamentals the agriculture ornamentals
	 */
	@Override
	public void cacheResult(
		List<AgricultureOrnamental> agricultureOrnamentals) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureOrnamentals.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureOrnamental agricultureOrnamental :
				agricultureOrnamentals) {

			if (entityCache.getResult(
					AgricultureOrnamentalImpl.class,
					agricultureOrnamental.getPrimaryKey()) == null) {

				cacheResult(agricultureOrnamental);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture ornamentals.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureOrnamentalImpl.class);

		finderCache.clearCache(AgricultureOrnamentalImpl.class);
	}

	/**
	 * Clears the cache for the agriculture ornamental.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureOrnamental agricultureOrnamental) {
		entityCache.removeResult(
			AgricultureOrnamentalImpl.class, agricultureOrnamental);
	}

	@Override
	public void clearCache(List<AgricultureOrnamental> agricultureOrnamentals) {
		for (AgricultureOrnamental agricultureOrnamental :
				agricultureOrnamentals) {

			entityCache.removeResult(
				AgricultureOrnamentalImpl.class, agricultureOrnamental);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureOrnamentalImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgricultureOrnamentalImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureOrnamentalModelImpl agricultureOrnamentalModelImpl) {

		Object[] args = new Object[] {
			agricultureOrnamentalModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultureOrnamentalModelImpl);
	}

	/**
	 * Creates a new agriculture ornamental with the primary key. Does not add the agriculture ornamental to the database.
	 *
	 * @param agricultureOrnamentalId the primary key for the new agriculture ornamental
	 * @return the new agriculture ornamental
	 */
	@Override
	public AgricultureOrnamental create(long agricultureOrnamentalId) {
		AgricultureOrnamental agricultureOrnamental =
			new AgricultureOrnamentalImpl();

		agricultureOrnamental.setNew(true);
		agricultureOrnamental.setPrimaryKey(agricultureOrnamentalId);

		agricultureOrnamental.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureOrnamental;
	}

	/**
	 * Removes the agriculture ornamental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental that was removed
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	@Override
	public AgricultureOrnamental remove(long agricultureOrnamentalId)
		throws NoSuchAgricultureOrnamentalException {

		return remove((Serializable)agricultureOrnamentalId);
	}

	/**
	 * Removes the agriculture ornamental with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture ornamental
	 * @return the agriculture ornamental that was removed
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	@Override
	public AgricultureOrnamental remove(Serializable primaryKey)
		throws NoSuchAgricultureOrnamentalException {

		Session session = null;

		try {
			session = openSession();

			AgricultureOrnamental agricultureOrnamental =
				(AgricultureOrnamental)session.get(
					AgricultureOrnamentalImpl.class, primaryKey);

			if (agricultureOrnamental == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureOrnamentalException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureOrnamental);
		}
		catch (NoSuchAgricultureOrnamentalException noSuchEntityException) {
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
	protected AgricultureOrnamental removeImpl(
		AgricultureOrnamental agricultureOrnamental) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureOrnamental)) {
				agricultureOrnamental = (AgricultureOrnamental)session.get(
					AgricultureOrnamentalImpl.class,
					agricultureOrnamental.getPrimaryKeyObj());
			}

			if (agricultureOrnamental != null) {
				session.delete(agricultureOrnamental);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureOrnamental != null) {
			clearCache(agricultureOrnamental);
		}

		return agricultureOrnamental;
	}

	@Override
	public AgricultureOrnamental updateImpl(
		AgricultureOrnamental agricultureOrnamental) {

		boolean isNew = agricultureOrnamental.isNew();

		if (!(agricultureOrnamental instanceof
				AgricultureOrnamentalModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureOrnamental.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureOrnamental);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureOrnamental proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureOrnamental implementation " +
					agricultureOrnamental.getClass());
		}

		AgricultureOrnamentalModelImpl agricultureOrnamentalModelImpl =
			(AgricultureOrnamentalModelImpl)agricultureOrnamental;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureOrnamental.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureOrnamental.setCreateDate(date);
			}
			else {
				agricultureOrnamental.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureOrnamentalModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureOrnamental.setModifiedDate(date);
			}
			else {
				agricultureOrnamental.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureOrnamental);
			}
			else {
				agricultureOrnamental = (AgricultureOrnamental)session.merge(
					agricultureOrnamental);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureOrnamentalImpl.class, agricultureOrnamentalModelImpl,
			false, true);

		cacheUniqueFindersCache(agricultureOrnamentalModelImpl);

		if (isNew) {
			agricultureOrnamental.setNew(false);
		}

		agricultureOrnamental.resetOriginalValues();

		return agricultureOrnamental;
	}

	/**
	 * Returns the agriculture ornamental with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture ornamental
	 * @return the agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	@Override
	public AgricultureOrnamental findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureOrnamentalException {

		AgricultureOrnamental agricultureOrnamental = fetchByPrimaryKey(
			primaryKey);

		if (agricultureOrnamental == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureOrnamentalException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureOrnamental;
	}

	/**
	 * Returns the agriculture ornamental with the primary key or throws a <code>NoSuchAgricultureOrnamentalException</code> if it could not be found.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental
	 * @throws NoSuchAgricultureOrnamentalException if a agriculture ornamental with the primary key could not be found
	 */
	@Override
	public AgricultureOrnamental findByPrimaryKey(long agricultureOrnamentalId)
		throws NoSuchAgricultureOrnamentalException {

		return findByPrimaryKey((Serializable)agricultureOrnamentalId);
	}

	/**
	 * Returns the agriculture ornamental with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureOrnamentalId the primary key of the agriculture ornamental
	 * @return the agriculture ornamental, or <code>null</code> if a agriculture ornamental with the primary key could not be found
	 */
	@Override
	public AgricultureOrnamental fetchByPrimaryKey(
		long agricultureOrnamentalId) {

		return fetchByPrimaryKey((Serializable)agricultureOrnamentalId);
	}

	/**
	 * Returns all the agriculture ornamentals.
	 *
	 * @return the agriculture ornamentals
	 */
	@Override
	public List<AgricultureOrnamental> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @return the range of agriculture ornamentals
	 */
	@Override
	public List<AgricultureOrnamental> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture ornamentals
	 */
	@Override
	public List<AgricultureOrnamental> findAll(
		int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture ornamentals.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureOrnamentalModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture ornamentals
	 * @param end the upper bound of the range of agriculture ornamentals (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture ornamentals
	 */
	@Override
	public List<AgricultureOrnamental> findAll(
		int start, int end,
		OrderByComparator<AgricultureOrnamental> orderByComparator,
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

		List<AgricultureOrnamental> list = null;

		if (useFinderCache) {
			list = (List<AgricultureOrnamental>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREORNAMENTAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREORNAMENTAL;

				sql = sql.concat(AgricultureOrnamentalModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureOrnamental>)QueryUtil.list(
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
	 * Removes all the agriculture ornamentals from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureOrnamental agricultureOrnamental : findAll()) {
			remove(agricultureOrnamental);
		}
	}

	/**
	 * Returns the number of agriculture ornamentals.
	 *
	 * @return the number of agriculture ornamentals
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
					_SQL_COUNT_AGRICULTUREORNAMENTAL);

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
		return "agricultureOrnamentalId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREORNAMENTAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureOrnamentalModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture ornamental persistence.
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

		_finderPathWithPaginationFindBygetAO_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAO_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAO_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAO_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAO_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAO_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgricultureOrnamentalUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureOrnamentalUtil.setPersistence(null);

		entityCache.removeCache(AgricultureOrnamentalImpl.class.getName());
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

	private static final String _SQL_SELECT_AGRICULTUREORNAMENTAL =
		"SELECT agricultureOrnamental FROM AgricultureOrnamental agricultureOrnamental";

	private static final String _SQL_SELECT_AGRICULTUREORNAMENTAL_WHERE =
		"SELECT agricultureOrnamental FROM AgricultureOrnamental agricultureOrnamental WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREORNAMENTAL =
		"SELECT COUNT(agricultureOrnamental) FROM AgricultureOrnamental agricultureOrnamental";

	private static final String _SQL_COUNT_AGRICULTUREORNAMENTAL_WHERE =
		"SELECT COUNT(agricultureOrnamental) FROM AgricultureOrnamental agricultureOrnamental WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agricultureOrnamental.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureOrnamental exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureOrnamental exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureOrnamentalPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}