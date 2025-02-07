/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureApicultureException;
import com.agriculture.application.form.service.model.AgricultureApiculture;
import com.agriculture.application.form.service.model.AgricultureApicultureTable;
import com.agriculture.application.form.service.model.impl.AgricultureApicultureImpl;
import com.agriculture.application.form.service.model.impl.AgricultureApicultureModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureApiculturePersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureApicultureUtil;
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
 * The persistence implementation for the agriculture apiculture service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureApiculturePersistence.class)
public class AgricultureApiculturePersistenceImpl
	extends BasePersistenceImpl<AgricultureApiculture>
	implements AgricultureApiculturePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureApicultureUtil</code> to access the agriculture apiculture persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureApicultureImpl.class.getName();

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
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApicultureException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	@Override
	public AgricultureApiculture findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureApicultureException {

		AgricultureApiculture agricultureApiculture = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agricultureApiculture == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureApicultureException(sb.toString());
		}

		return agricultureApiculture;
	}

	/**
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	@Override
	public AgricultureApiculture fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture apiculture where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	@Override
	public AgricultureApiculture fetchBygetAgricultureById(
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

		if (result instanceof AgricultureApiculture) {
			AgricultureApiculture agricultureApiculture =
				(AgricultureApiculture)result;

			if (agricultureApplicationId !=
					agricultureApiculture.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREAPICULTURE_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureApiculture> list = query.list();

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
								"AgricultureApiculturePersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApiculture agricultureApiculture = list.get(0);

					result = agricultureApiculture;

					cacheResult(agricultureApiculture);
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
			return (AgricultureApiculture)result;
		}
	}

	/**
	 * Removes the agriculture apiculture where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture apiculture that was removed
	 */
	@Override
	public AgricultureApiculture removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureApicultureException {

		AgricultureApiculture agricultureApiculture = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agricultureApiculture);
	}

	/**
	 * Returns the number of agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture apicultures
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPICULTURE_WHERE);

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
			"agricultureApiculture.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAApi_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAApi_by_AAI;
	private FinderPath _finderPathCountBygetAApi_by_AAI;

	/**
	 * Returns all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture apicultures
	 */
	@Override
	public List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId) {

		return findBygetAApi_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @return the range of matching agriculture apicultures
	 */
	@Override
	public List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAApi_by_AAI(agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture apicultures
	 */
	@Override
	public List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		return findBygetAApi_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture apicultures
	 */
	@Override
	public List<AgricultureApiculture> findBygetAApi_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAApi_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAApi_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultureApiculture> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApiculture>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureApiculture agricultureApiculture : list) {
					if (agricultureApplicationId !=
							agricultureApiculture.
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

			sb.append(_SQL_SELECT_AGRICULTUREAPICULTURE_WHERE);

			sb.append(_FINDER_COLUMN_GETAAPI_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureApicultureModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgricultureApiculture>)QueryUtil.list(
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
	 * Returns the first agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	@Override
	public AgricultureApiculture findBygetAApi_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultureApiculture> orderByComparator)
		throws NoSuchAgricultureApicultureException {

		AgricultureApiculture agricultureApiculture =
			fetchBygetAApi_by_AAI_First(
				agricultureApplicationId, orderByComparator);

		if (agricultureApiculture != null) {
			return agricultureApiculture;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureApicultureException(sb.toString());
	}

	/**
	 * Returns the first agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	@Override
	public AgricultureApiculture fetchBygetAApi_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		List<AgricultureApiculture> list = findBygetAApi_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a matching agriculture apiculture could not be found
	 */
	@Override
	public AgricultureApiculture findBygetAApi_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultureApiculture> orderByComparator)
		throws NoSuchAgricultureApicultureException {

		AgricultureApiculture agricultureApiculture =
			fetchBygetAApi_by_AAI_Last(
				agricultureApplicationId, orderByComparator);

		if (agricultureApiculture != null) {
			return agricultureApiculture;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultureApicultureException(sb.toString());
	}

	/**
	 * Returns the last agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture apiculture, or <code>null</code> if a matching agriculture apiculture could not be found
	 */
	@Override
	public AgricultureApiculture fetchBygetAApi_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		int count = countBygetAApi_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultureApiculture> list = findBygetAApi_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture apicultures before and after the current agriculture apiculture in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApicultureId the primary key of the current agriculture apiculture
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	@Override
	public AgricultureApiculture[] findBygetAApi_by_AAI_PrevAndNext(
			long agricultureApicultureId, long agricultureApplicationId,
			OrderByComparator<AgricultureApiculture> orderByComparator)
		throws NoSuchAgricultureApicultureException {

		AgricultureApiculture agricultureApiculture = findByPrimaryKey(
			agricultureApicultureId);

		Session session = null;

		try {
			session = openSession();

			AgricultureApiculture[] array = new AgricultureApicultureImpl[3];

			array[0] = getBygetAApi_by_AAI_PrevAndNext(
				session, agricultureApiculture, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agricultureApiculture;

			array[2] = getBygetAApi_by_AAI_PrevAndNext(
				session, agricultureApiculture, agricultureApplicationId,
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

	protected AgricultureApiculture getBygetAApi_by_AAI_PrevAndNext(
		Session session, AgricultureApiculture agricultureApiculture,
		long agricultureApplicationId,
		OrderByComparator<AgricultureApiculture> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREAPICULTURE_WHERE);

		sb.append(_FINDER_COLUMN_GETAAPI_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgricultureApicultureModelImpl.ORDER_BY_JPQL);
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
						agricultureApiculture)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureApiculture> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture apicultures where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAApi_by_AAI(long agricultureApplicationId) {
		for (AgricultureApiculture agricultureApiculture :
				findBygetAApi_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultureApiculture);
		}
	}

	/**
	 * Returns the number of agriculture apicultures where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture apicultures
	 */
	@Override
	public int countBygetAApi_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAApi_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPICULTURE_WHERE);

			sb.append(_FINDER_COLUMN_GETAAPI_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETAAPI_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultureApiculture.agricultureApplicationId = ?";

	public AgricultureApiculturePersistenceImpl() {
		setModelClass(AgricultureApiculture.class);

		setModelImplClass(AgricultureApicultureImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureApicultureTable.INSTANCE);
	}

	/**
	 * Caches the agriculture apiculture in the entity cache if it is enabled.
	 *
	 * @param agricultureApiculture the agriculture apiculture
	 */
	@Override
	public void cacheResult(AgricultureApiculture agricultureApiculture) {
		entityCache.putResult(
			AgricultureApicultureImpl.class,
			agricultureApiculture.getPrimaryKey(), agricultureApiculture);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultureApiculture.getAgricultureApplicationId()},
			agricultureApiculture);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture apicultures in the entity cache if it is enabled.
	 *
	 * @param agricultureApicultures the agriculture apicultures
	 */
	@Override
	public void cacheResult(
		List<AgricultureApiculture> agricultureApicultures) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureApicultures.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureApiculture agricultureApiculture :
				agricultureApicultures) {

			if (entityCache.getResult(
					AgricultureApicultureImpl.class,
					agricultureApiculture.getPrimaryKey()) == null) {

				cacheResult(agricultureApiculture);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture apicultures.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureApicultureImpl.class);

		finderCache.clearCache(AgricultureApicultureImpl.class);
	}

	/**
	 * Clears the cache for the agriculture apiculture.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureApiculture agricultureApiculture) {
		entityCache.removeResult(
			AgricultureApicultureImpl.class, agricultureApiculture);
	}

	@Override
	public void clearCache(List<AgricultureApiculture> agricultureApicultures) {
		for (AgricultureApiculture agricultureApiculture :
				agricultureApicultures) {

			entityCache.removeResult(
				AgricultureApicultureImpl.class, agricultureApiculture);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureApicultureImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgricultureApicultureImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureApicultureModelImpl agricultureApicultureModelImpl) {

		Object[] args = new Object[] {
			agricultureApicultureModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultureApicultureModelImpl);
	}

	/**
	 * Creates a new agriculture apiculture with the primary key. Does not add the agriculture apiculture to the database.
	 *
	 * @param agricultureApicultureId the primary key for the new agriculture apiculture
	 * @return the new agriculture apiculture
	 */
	@Override
	public AgricultureApiculture create(long agricultureApicultureId) {
		AgricultureApiculture agricultureApiculture =
			new AgricultureApicultureImpl();

		agricultureApiculture.setNew(true);
		agricultureApiculture.setPrimaryKey(agricultureApicultureId);

		agricultureApiculture.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureApiculture;
	}

	/**
	 * Removes the agriculture apiculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture that was removed
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	@Override
	public AgricultureApiculture remove(long agricultureApicultureId)
		throws NoSuchAgricultureApicultureException {

		return remove((Serializable)agricultureApicultureId);
	}

	/**
	 * Removes the agriculture apiculture with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture apiculture
	 * @return the agriculture apiculture that was removed
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	@Override
	public AgricultureApiculture remove(Serializable primaryKey)
		throws NoSuchAgricultureApicultureException {

		Session session = null;

		try {
			session = openSession();

			AgricultureApiculture agricultureApiculture =
				(AgricultureApiculture)session.get(
					AgricultureApicultureImpl.class, primaryKey);

			if (agricultureApiculture == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureApicultureException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureApiculture);
		}
		catch (NoSuchAgricultureApicultureException noSuchEntityException) {
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
	protected AgricultureApiculture removeImpl(
		AgricultureApiculture agricultureApiculture) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureApiculture)) {
				agricultureApiculture = (AgricultureApiculture)session.get(
					AgricultureApicultureImpl.class,
					agricultureApiculture.getPrimaryKeyObj());
			}

			if (agricultureApiculture != null) {
				session.delete(agricultureApiculture);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureApiculture != null) {
			clearCache(agricultureApiculture);
		}

		return agricultureApiculture;
	}

	@Override
	public AgricultureApiculture updateImpl(
		AgricultureApiculture agricultureApiculture) {

		boolean isNew = agricultureApiculture.isNew();

		if (!(agricultureApiculture instanceof
				AgricultureApicultureModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureApiculture.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureApiculture);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureApiculture proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureApiculture implementation " +
					agricultureApiculture.getClass());
		}

		AgricultureApicultureModelImpl agricultureApicultureModelImpl =
			(AgricultureApicultureModelImpl)agricultureApiculture;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureApiculture.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureApiculture.setCreateDate(date);
			}
			else {
				agricultureApiculture.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureApicultureModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureApiculture.setModifiedDate(date);
			}
			else {
				agricultureApiculture.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureApiculture);
			}
			else {
				agricultureApiculture = (AgricultureApiculture)session.merge(
					agricultureApiculture);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureApicultureImpl.class, agricultureApicultureModelImpl,
			false, true);

		cacheUniqueFindersCache(agricultureApicultureModelImpl);

		if (isNew) {
			agricultureApiculture.setNew(false);
		}

		agricultureApiculture.resetOriginalValues();

		return agricultureApiculture;
	}

	/**
	 * Returns the agriculture apiculture with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture apiculture
	 * @return the agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	@Override
	public AgricultureApiculture findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureApicultureException {

		AgricultureApiculture agricultureApiculture = fetchByPrimaryKey(
			primaryKey);

		if (agricultureApiculture == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureApicultureException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureApiculture;
	}

	/**
	 * Returns the agriculture apiculture with the primary key or throws a <code>NoSuchAgricultureApicultureException</code> if it could not be found.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture
	 * @throws NoSuchAgricultureApicultureException if a agriculture apiculture with the primary key could not be found
	 */
	@Override
	public AgricultureApiculture findByPrimaryKey(long agricultureApicultureId)
		throws NoSuchAgricultureApicultureException {

		return findByPrimaryKey((Serializable)agricultureApicultureId);
	}

	/**
	 * Returns the agriculture apiculture with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApicultureId the primary key of the agriculture apiculture
	 * @return the agriculture apiculture, or <code>null</code> if a agriculture apiculture with the primary key could not be found
	 */
	@Override
	public AgricultureApiculture fetchByPrimaryKey(
		long agricultureApicultureId) {

		return fetchByPrimaryKey((Serializable)agricultureApicultureId);
	}

	/**
	 * Returns all the agriculture apicultures.
	 *
	 * @return the agriculture apicultures
	 */
	@Override
	public List<AgricultureApiculture> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @return the range of agriculture apicultures
	 */
	@Override
	public List<AgricultureApiculture> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture apicultures
	 */
	@Override
	public List<AgricultureApiculture> findAll(
		int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture apicultures.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApicultureModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture apicultures
	 * @param end the upper bound of the range of agriculture apicultures (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture apicultures
	 */
	@Override
	public List<AgricultureApiculture> findAll(
		int start, int end,
		OrderByComparator<AgricultureApiculture> orderByComparator,
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

		List<AgricultureApiculture> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApiculture>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREAPICULTURE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREAPICULTURE;

				sql = sql.concat(AgricultureApicultureModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureApiculture>)QueryUtil.list(
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
	 * Removes all the agriculture apicultures from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureApiculture agricultureApiculture : findAll()) {
			remove(agricultureApiculture);
		}
	}

	/**
	 * Returns the number of agriculture apicultures.
	 *
	 * @return the number of agriculture apicultures
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
					_SQL_COUNT_AGRICULTUREAPICULTURE);

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
		return "agricultureApicultureId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREAPICULTURE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureApicultureModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture apiculture persistence.
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

		_finderPathWithPaginationFindBygetAApi_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAApi_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAApi_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAApi_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAApi_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAApi_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgricultureApicultureUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureApicultureUtil.setPersistence(null);

		entityCache.removeCache(AgricultureApicultureImpl.class.getName());
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

	private static final String _SQL_SELECT_AGRICULTUREAPICULTURE =
		"SELECT agricultureApiculture FROM AgricultureApiculture agricultureApiculture";

	private static final String _SQL_SELECT_AGRICULTUREAPICULTURE_WHERE =
		"SELECT agricultureApiculture FROM AgricultureApiculture agricultureApiculture WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREAPICULTURE =
		"SELECT COUNT(agricultureApiculture) FROM AgricultureApiculture agricultureApiculture";

	private static final String _SQL_COUNT_AGRICULTUREAPICULTURE_WHERE =
		"SELECT COUNT(agricultureApiculture) FROM AgricultureApiculture agricultureApiculture WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agricultureApiculture.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureApiculture exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureApiculture exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureApiculturePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}