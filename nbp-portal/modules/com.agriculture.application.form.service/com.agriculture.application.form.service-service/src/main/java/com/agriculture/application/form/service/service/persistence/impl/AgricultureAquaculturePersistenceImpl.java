/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureAquacultureException;
import com.agriculture.application.form.service.model.AgricultureAquaculture;
import com.agriculture.application.form.service.model.AgricultureAquacultureTable;
import com.agriculture.application.form.service.model.impl.AgricultureAquacultureImpl;
import com.agriculture.application.form.service.model.impl.AgricultureAquacultureModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureAquaculturePersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureAquacultureUtil;
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
 * The persistence implementation for the agriculture aquaculture service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureAquaculturePersistence.class)
public class AgricultureAquaculturePersistenceImpl
	extends BasePersistenceImpl<AgricultureAquaculture>
	implements AgricultureAquaculturePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureAquacultureUtil</code> to access the agriculture aquaculture persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureAquacultureImpl.class.getName();

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
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureAquacultureException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	@Override
	public AgricultureAquaculture findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureAquacultureException {

		AgricultureAquaculture agricultureAquaculture =
			fetchBygetAgricultureById(agricultureApplicationId);

		if (agricultureAquaculture == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureAquacultureException(sb.toString());
		}

		return agricultureAquaculture;
	}

	/**
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	@Override
	public AgricultureAquaculture fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture aquaculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	@Override
	public AgricultureAquaculture fetchBygetAgricultureById(
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

		if (result instanceof AgricultureAquaculture) {
			AgricultureAquaculture agricultureAquaculture =
				(AgricultureAquaculture)result;

			if (agricultureApplicationId !=
					agricultureAquaculture.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREAQUACULTURE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureAquaculture> list = query.list();

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
								"AgricultureAquaculturePersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureAquaculture agricultureAquaculture = list.get(0);

					result = agricultureAquaculture;

					cacheResult(agricultureAquaculture);
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
			return (AgricultureAquaculture)result;
		}
	}

	/**
	 * Removes the agriculture aquaculture where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture aquaculture that was removed
	 */
	@Override
	public AgricultureAquaculture removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureAquacultureException {

		AgricultureAquaculture agricultureAquaculture =
			findBygetAgricultureById(agricultureApplicationId);

		return remove(agricultureAquaculture);
	}

	/**
	 * Returns the number of agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture aquacultures
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAQUACULTURE_WHERE);

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
			"agricultureAquaculture.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAAqua_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAAqua_by_AAI;
	private FinderPath _finderPathCountBygetAAqua_by_AAI;

	/**
	 * Returns all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId) {

		return findBygetAAqua_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of matching agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAAqua_by_AAI(
			agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		return findBygetAAqua_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> findBygetAAqua_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAAqua_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAAqua_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureAquaculture> list = null;

		if (useFinderCache) {
			list = (List<AgricultureAquaculture>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureAquaculture agricultureAquaculture : list) {
					if (agricultureApplicationId !=
							agricultureAquaculture.
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

			sb.append(_SQL_SELECT_AGRICULTUREAQUACULTURE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAAQUA_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureAquacultureModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgricultureAquaculture>)QueryUtil.list(
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
	 * Returns the first agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	@Override
	public AgricultureAquaculture findBygetAAqua_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureAquaculture> orderByComparator)
		throws NoSuchAgricultureAquacultureException {

		AgricultureAquaculture agricultureAquaculture =
			fetchBygetAAqua_by_AAI_First(
				agricultureApplicationId, orderByComparator);

		if (agricultureAquaculture != null) {
			return agricultureAquaculture;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureAquacultureException(sb.toString());
	}

	/**
	 * Returns the first agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	@Override
	public AgricultureAquaculture fetchBygetAAqua_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		List<AgricultureAquaculture> list = findBygetAAqua_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a matching agriculture aquaculture could not be found
	 */
	@Override
	public AgricultureAquaculture findBygetAAqua_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureAquaculture> orderByComparator)
		throws NoSuchAgricultureAquacultureException {

		AgricultureAquaculture agricultureAquaculture =
			fetchBygetAAqua_by_AAI_Last(
				agricultureApplicationId, orderByComparator);

		if (agricultureAquaculture != null) {
			return agricultureAquaculture;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureAquacultureException(sb.toString());
	}

	/**
	 * Returns the last agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture aquaculture, or <code>null</code> if a matching agriculture aquaculture could not be found
	 */
	@Override
	public AgricultureAquaculture fetchBygetAAqua_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		int count = countBygetAAqua_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureAquaculture> list = findBygetAAqua_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture aquacultures before and after the current agriculture aquaculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureAquacultureId the primary key of the current agriculture aquaculture
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public AgricultureAquaculture[] findBygetAAqua_by_AAI_PrevAndNext(
			long agricultureAquacultureId, long agricultureApplicationId,
			OrderByComparator<AgricultureAquaculture> orderByComparator)
		throws NoSuchAgricultureAquacultureException {

		AgricultureAquaculture agricultureAquaculture = findByPrimaryKey(
			agricultureAquacultureId);

		Session session = null;

		try {
			session = openSession();

			AgricultureAquaculture[] array = new AgricultureAquacultureImpl[3];

			array[0] = getBygetAAqua_by_AAI_PrevAndNext(
				session, agricultureAquaculture, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agricultureAquaculture;

			array[2] = getBygetAAqua_by_AAI_PrevAndNext(
				session, agricultureAquaculture, agricultureApplicationId,
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

	protected AgricultureAquaculture getBygetAAqua_by_AAI_PrevAndNext(
		Session session, AgricultureAquaculture agricultureAquaculture,
		long agricultureApplicationId,
		OrderByComparator<AgricultureAquaculture> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREAQUACULTURE_WHERE);

		sb.append(_FINDER_COLUMN_GETAAQUA_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgricultureAquacultureModelImpl.ORDER_BY_JPQL);
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
						agricultureAquaculture)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureAquaculture> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture aquacultures where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAAqua_by_AAI(long agricultureApplicationId) {
		for (AgricultureAquaculture agricultureAquaculture :
				findBygetAAqua_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureAquaculture);
		}
	}

	/**
	 * Returns the number of agriculture aquacultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture aquacultures
	 */
	@Override
	public int countBygetAAqua_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAAqua_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAQUACULTURE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAAQUA_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETAAQUA_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultureAquaculture.agricultureApplicationId = ?";

	public AgricultureAquaculturePersistenceImpl() {
		setModelClass(AgricultureAquaculture.class);

		setModelImplClass(AgricultureAquacultureImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureAquacultureTable.INSTANCE);
	}

	/**
	 * Caches the agriculture aquaculture in the entity cache if it is enabled.
	 *
	 * @param agricultureAquaculture the agriculture aquaculture
	 */
	@Override
	public void cacheResult(AgricultureAquaculture agricultureAquaculture) {
		entityCache.putResult(
			AgricultureAquacultureImpl.class,
			agricultureAquaculture.getPrimaryKey(), agricultureAquaculture);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultureAquaculture.getAgricultureApplicationId()},
			agricultureAquaculture);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture aquacultures in the entity cache if it is enabled.
	 *
	 * @param agricultureAquacultures the agriculture aquacultures
	 */
	@Override
	public void cacheResult(
		List<AgricultureAquaculture> agricultureAquacultures) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureAquacultures.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureAquaculture agricultureAquaculture :
				agricultureAquacultures) {

			if (entityCache.getResult(
					AgricultureAquacultureImpl.class,
					agricultureAquaculture.getPrimaryKey()) == null) {

				cacheResult(agricultureAquaculture);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture aquacultures.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureAquacultureImpl.class);

		finderCache.clearCache(AgricultureAquacultureImpl.class);
	}

	/**
	 * Clears the cache for the agriculture aquaculture.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureAquaculture agricultureAquaculture) {
		entityCache.removeResult(
			AgricultureAquacultureImpl.class, agricultureAquaculture);
	}

	@Override
	public void clearCache(
		List<AgricultureAquaculture> agricultureAquacultures) {

		for (AgricultureAquaculture agricultureAquaculture :
				agricultureAquacultures) {

			entityCache.removeResult(
				AgricultureAquacultureImpl.class, agricultureAquaculture);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureAquacultureImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgricultureAquacultureImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureAquacultureModelImpl agricultureAquacultureModelImpl) {

		Object[] args = new Object[] {
			agricultureAquacultureModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultureAquacultureModelImpl);
	}

	/**
	 * Creates a new agriculture aquaculture with the primary key. Does not add the agriculture aquaculture to the database.
	 *
	 * @param agricultureAquacultureId the primary key for the new agriculture aquaculture
	 * @return the new agriculture aquaculture
	 */
	@Override
	public AgricultureAquaculture create(long agricultureAquacultureId) {
		AgricultureAquaculture agricultureAquaculture =
			new AgricultureAquacultureImpl();

		agricultureAquaculture.setNew(true);
		agricultureAquaculture.setPrimaryKey(agricultureAquacultureId);

		agricultureAquaculture.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureAquaculture;
	}

	/**
	 * Removes the agriculture aquaculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public AgricultureAquaculture remove(long agricultureAquacultureId)
		throws NoSuchAgricultureAquacultureException {

		return remove((Serializable)agricultureAquacultureId);
	}

	/**
	 * Removes the agriculture aquaculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture that was removed
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public AgricultureAquaculture remove(Serializable primaryKey)
		throws NoSuchAgricultureAquacultureException {

		Session session = null;

		try {
			session = openSession();

			AgricultureAquaculture agricultureAquaculture =
				(AgricultureAquaculture)session.get(
					AgricultureAquacultureImpl.class, primaryKey);

			if (agricultureAquaculture == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureAquacultureException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureAquaculture);
		}
		catch (NoSuchAgricultureAquacultureException noSuchEntityException) {
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
	protected AgricultureAquaculture removeImpl(
		AgricultureAquaculture agricultureAquaculture) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureAquaculture)) {
				agricultureAquaculture = (AgricultureAquaculture)session.get(
					AgricultureAquacultureImpl.class,
					agricultureAquaculture.getPrimaryKeyObj());
			}

			if (agricultureAquaculture != null) {
				session.delete(agricultureAquaculture);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureAquaculture != null) {
			clearCache(agricultureAquaculture);
		}

		return agricultureAquaculture;
	}

	@Override
	public AgricultureAquaculture updateImpl(
		AgricultureAquaculture agricultureAquaculture) {

		boolean isNew = agricultureAquaculture.isNew();

		if (!(agricultureAquaculture instanceof
				AgricultureAquacultureModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureAquaculture.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureAquaculture);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureAquaculture proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureAquaculture implementation " +
					agricultureAquaculture.getClass());
		}

		AgricultureAquacultureModelImpl agricultureAquacultureModelImpl =
			(AgricultureAquacultureModelImpl)agricultureAquaculture;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureAquaculture.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureAquaculture.setCreateDate(date);
			}
			else {
				agricultureAquaculture.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureAquacultureModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureAquaculture.setModifiedDate(date);
			}
			else {
				agricultureAquaculture.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureAquaculture);
			}
			else {
				agricultureAquaculture = (AgricultureAquaculture)session.merge(
					agricultureAquaculture);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureAquacultureImpl.class, agricultureAquacultureModelImpl,
			false, true);

		cacheUniqueFindersCache(agricultureAquacultureModelImpl);

		if (isNew) {
			agricultureAquaculture.setNew(false);
		}

		agricultureAquaculture.resetOriginalValues();

		return agricultureAquaculture;
	}

	/**
	 * Returns the agriculture aquaculture with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public AgricultureAquaculture findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureAquacultureException {

		AgricultureAquaculture agricultureAquaculture = fetchByPrimaryKey(
			primaryKey);

		if (agricultureAquaculture == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureAquacultureException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureAquaculture;
	}

	/**
	 * Returns the agriculture aquaculture with the primary key or throws a <code>NoSuchAgricultureAquacultureException</code> if it could not be found.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture
	 * @throws NoSuchAgricultureAquacultureException if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public AgricultureAquaculture findByPrimaryKey(
			long agricultureAquacultureId)
		throws NoSuchAgricultureAquacultureException {

		return findByPrimaryKey((Serializable)agricultureAquacultureId);
	}

	/**
	 * Returns the agriculture aquaculture with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureAquacultureId the primary key of the agriculture aquaculture
	 * @return the agriculture aquaculture, or <code>null</code> if a agriculture aquaculture with the primary key could not be found
	 */
	@Override
	public AgricultureAquaculture fetchByPrimaryKey(
		long agricultureAquacultureId) {

		return fetchByPrimaryKey((Serializable)agricultureAquacultureId);
	}

	/**
	 * Returns all the agriculture aquacultures.
	 *
	 * @return the agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @return the range of agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> findAll(
		int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture aquacultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureAquacultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture aquacultures
	 * @param end the upper bound of the range of agriculture aquacultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture aquacultures
	 */
	@Override
	public List<AgricultureAquaculture> findAll(
		int start, int end,
		OrderByComparator<AgricultureAquaculture> orderByComparator,
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

		List<AgricultureAquaculture> list = null;

		if (useFinderCache) {
			list = (List<AgricultureAquaculture>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREAQUACULTURE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREAQUACULTURE;

				sql = sql.concat(AgricultureAquacultureModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureAquaculture>)QueryUtil.list(
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
	 * Removes all the agriculture aquacultures from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureAquaculture agricultureAquaculture : findAll()) {
			remove(agricultureAquaculture);
		}
	}

	/**
	 * Returns the number of agriculture aquacultures.
	 *
	 * @return the number of agriculture aquacultures
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
					_SQL_COUNT_AGRICULTUREAQUACULTURE);

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
		return "agricultureAquacultureId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREAQUACULTURE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureAquacultureModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture aquaculture persistence.
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

		_finderPathWithPaginationFindBygetAAqua_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAAqua_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAAqua_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAAqua_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAAqua_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAAqua_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgricultureAquacultureUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureAquacultureUtil.setPersistence(null);

		entityCache.removeCache(AgricultureAquacultureImpl.class.getName());
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

	private static final String _SQL_SELECT_AGRICULTUREAQUACULTURE =
		"SELECT agricultureAquaculture FROM AgricultureAquaculture agricultureAquaculture";

	private static final String _SQL_SELECT_AGRICULTUREAQUACULTURE_WHERE =
		"SELECT agricultureAquaculture FROM AgricultureAquaculture agricultureAquaculture WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREAQUACULTURE =
		"SELECT COUNT(agricultureAquaculture) FROM AgricultureAquaculture agricultureAquaculture";

	private static final String _SQL_COUNT_AGRICULTUREAQUACULTURE_WHERE =
		"SELECT COUNT(agricultureAquaculture) FROM AgricultureAquaculture agricultureAquaculture WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agricultureAquaculture.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureAquaculture exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureAquaculture exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureAquaculturePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}