/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultueFarmerException;
import com.agriculture.application.form.service.model.AgricultueFarmer;
import com.agriculture.application.form.service.model.AgricultueFarmerTable;
import com.agriculture.application.form.service.model.impl.AgricultueFarmerImpl;
import com.agriculture.application.form.service.model.impl.AgricultueFarmerModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultueFarmerPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultueFarmerUtil;
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
 * The persistence implementation for the agricultue farmer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultueFarmerPersistence.class)
public class AgricultueFarmerPersistenceImpl
	extends BasePersistenceImpl<AgricultueFarmer>
	implements AgricultueFarmerPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultueFarmerUtil</code> to access the agricultue farmer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultueFarmerImpl.class.getName();

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
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultueFarmerException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	@Override
	public AgricultueFarmer findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultueFarmerException {

		AgricultueFarmer agricultueFarmer = fetchBygetAgricultureById(
			agricultureApplicationId);

		if (agricultueFarmer == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultueFarmerException(sb.toString());
		}

		return agricultueFarmer;
	}

	/**
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	@Override
	public AgricultueFarmer fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agricultue farmer where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	@Override
	public AgricultueFarmer fetchBygetAgricultureById(
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

		if (result instanceof AgricultueFarmer) {
			AgricultueFarmer agricultueFarmer = (AgricultueFarmer)result;

			if (agricultureApplicationId !=
					agricultueFarmer.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUEFARMER_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultueFarmer> list = query.list();

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
								"AgricultueFarmerPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultueFarmer agricultueFarmer = list.get(0);

					result = agricultueFarmer;

					cacheResult(agricultueFarmer);
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
			return (AgricultueFarmer)result;
		}
	}

	/**
	 * Removes the agricultue farmer where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agricultue farmer that was removed
	 */
	@Override
	public AgricultueFarmer removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultueFarmerException {

		AgricultueFarmer agricultueFarmer = findBygetAgricultureById(
			agricultureApplicationId);

		return remove(agricultueFarmer);
	}

	/**
	 * Returns the number of agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agricultue farmers
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUEFARMER_WHERE);

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
			"agricultueFarmer.agricultureApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAF_by_AAI;
	private FinderPath _finderPathWithoutPaginationFindBygetAF_by_AAI;
	private FinderPath _finderPathCountBygetAF_by_AAI;

	/**
	 * Returns all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agricultue farmers
	 */
	@Override
	public List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId) {

		return findBygetAF_by_AAI(
			agricultureApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @return the range of matching agricultue farmers
	 */
	@Override
	public List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end) {

		return findBygetAF_by_AAI(agricultureApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agricultue farmers
	 */
	@Override
	public List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		return findBygetAF_by_AAI(
			agricultureApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agricultue farmers
	 */
	@Override
	public List<AgricultueFarmer> findBygetAF_by_AAI(
		long agricultureApplicationId, int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetAF_by_AAI;
				finderArgs = new Object[] {agricultureApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAF_by_AAI;
			finderArgs = new Object[] {
				agricultureApplicationId, start, end, orderByComparator
			};
		}

		List<AgricultueFarmer> list = null;

		if (useFinderCache) {
			list = (List<AgricultueFarmer>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultueFarmer agricultueFarmer : list) {
					if (agricultureApplicationId !=
							agricultueFarmer.getAgricultureApplicationId()) {

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

			sb.append(_SQL_SELECT_AGRICULTUEFARMER_WHERE);

			sb.append(_FINDER_COLUMN_GETAF_BY_AAI_AGRICULTUREAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultueFarmerModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				list = (List<AgricultueFarmer>)QueryUtil.list(
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
	 * Returns the first agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	@Override
	public AgricultueFarmer findBygetAF_by_AAI_First(
			long agricultureApplicationId,
			OrderByComparator<AgricultueFarmer> orderByComparator)
		throws NoSuchAgricultueFarmerException {

		AgricultueFarmer agricultueFarmer = fetchBygetAF_by_AAI_First(
			agricultureApplicationId, orderByComparator);

		if (agricultueFarmer != null) {
			return agricultueFarmer;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultueFarmerException(sb.toString());
	}

	/**
	 * Returns the first agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	@Override
	public AgricultueFarmer fetchBygetAF_by_AAI_First(
		long agricultureApplicationId,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		List<AgricultueFarmer> list = findBygetAF_by_AAI(
			agricultureApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a matching agricultue farmer could not be found
	 */
	@Override
	public AgricultueFarmer findBygetAF_by_AAI_Last(
			long agricultureApplicationId,
			OrderByComparator<AgricultueFarmer> orderByComparator)
		throws NoSuchAgricultueFarmerException {

		AgricultueFarmer agricultueFarmer = fetchBygetAF_by_AAI_Last(
			agricultureApplicationId, orderByComparator);

		if (agricultueFarmer != null) {
			return agricultueFarmer;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("agricultureApplicationId=");
		sb.append(agricultureApplicationId);

		sb.append("}");

		throw new NoSuchAgricultueFarmerException(sb.toString());
	}

	/**
	 * Returns the last agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agricultue farmer, or <code>null</code> if a matching agricultue farmer could not be found
	 */
	@Override
	public AgricultueFarmer fetchBygetAF_by_AAI_Last(
		long agricultureApplicationId,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		int count = countBygetAF_by_AAI(agricultureApplicationId);

		if (count == 0) {
			return null;
		}

		List<AgricultueFarmer> list = findBygetAF_by_AAI(
			agricultureApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agricultue farmers before and after the current agricultue farmer in the ordered set where agricultureApplicationId = &#63;.
	 *
	 * @param agricultueFarmerId the primary key of the current agricultue farmer
	 * @param agricultureApplicationId the agriculture application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	@Override
	public AgricultueFarmer[] findBygetAF_by_AAI_PrevAndNext(
			long agricultueFarmerId, long agricultureApplicationId,
			OrderByComparator<AgricultueFarmer> orderByComparator)
		throws NoSuchAgricultueFarmerException {

		AgricultueFarmer agricultueFarmer = findByPrimaryKey(
			agricultueFarmerId);

		Session session = null;

		try {
			session = openSession();

			AgricultueFarmer[] array = new AgricultueFarmerImpl[3];

			array[0] = getBygetAF_by_AAI_PrevAndNext(
				session, agricultueFarmer, agricultureApplicationId,
				orderByComparator, true);

			array[1] = agricultueFarmer;

			array[2] = getBygetAF_by_AAI_PrevAndNext(
				session, agricultueFarmer, agricultureApplicationId,
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

	protected AgricultueFarmer getBygetAF_by_AAI_PrevAndNext(
		Session session, AgricultueFarmer agricultueFarmer,
		long agricultureApplicationId,
		OrderByComparator<AgricultueFarmer> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUEFARMER_WHERE);

		sb.append(_FINDER_COLUMN_GETAF_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
			sb.append(AgricultueFarmerModelImpl.ORDER_BY_JPQL);
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
						agricultueFarmer)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultueFarmer> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agricultue farmers where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 */
	@Override
	public void removeBygetAF_by_AAI(long agricultureApplicationId) {
		for (AgricultueFarmer agricultueFarmer :
				findBygetAF_by_AAI(
					agricultureApplicationId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(agricultueFarmer);
		}
	}

	/**
	 * Returns the number of agricultue farmers where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agricultue farmers
	 */
	@Override
	public int countBygetAF_by_AAI(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAF_by_AAI;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUEFARMER_WHERE);

			sb.append(_FINDER_COLUMN_GETAF_BY_AAI_AGRICULTUREAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETAF_BY_AAI_AGRICULTUREAPPLICATIONID_2 =
			"agricultueFarmer.agricultureApplicationId = ?";

	public AgricultueFarmerPersistenceImpl() {
		setModelClass(AgricultueFarmer.class);

		setModelImplClass(AgricultueFarmerImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultueFarmerTable.INSTANCE);
	}

	/**
	 * Caches the agricultue farmer in the entity cache if it is enabled.
	 *
	 * @param agricultueFarmer the agricultue farmer
	 */
	@Override
	public void cacheResult(AgricultueFarmer agricultueFarmer) {
		entityCache.putResult(
			AgricultueFarmerImpl.class, agricultueFarmer.getPrimaryKey(),
			agricultueFarmer);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultueFarmer.getAgricultureApplicationId()},
			agricultueFarmer);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agricultue farmers in the entity cache if it is enabled.
	 *
	 * @param agricultueFarmers the agricultue farmers
	 */
	@Override
	public void cacheResult(List<AgricultueFarmer> agricultueFarmers) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultueFarmers.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultueFarmer agricultueFarmer : agricultueFarmers) {
			if (entityCache.getResult(
					AgricultueFarmerImpl.class,
					agricultueFarmer.getPrimaryKey()) == null) {

				cacheResult(agricultueFarmer);
			}
		}
	}

	/**
	 * Clears the cache for all agricultue farmers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultueFarmerImpl.class);

		finderCache.clearCache(AgricultueFarmerImpl.class);
	}

	/**
	 * Clears the cache for the agricultue farmer.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultueFarmer agricultueFarmer) {
		entityCache.removeResult(AgricultueFarmerImpl.class, agricultueFarmer);
	}

	@Override
	public void clearCache(List<AgricultueFarmer> agricultueFarmers) {
		for (AgricultueFarmer agricultueFarmer : agricultueFarmers) {
			entityCache.removeResult(
				AgricultueFarmerImpl.class, agricultueFarmer);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultueFarmerImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AgricultueFarmerImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultueFarmerModelImpl agricultueFarmerModelImpl) {

		Object[] args = new Object[] {
			agricultueFarmerModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultueFarmerModelImpl);
	}

	/**
	 * Creates a new agricultue farmer with the primary key. Does not add the agricultue farmer to the database.
	 *
	 * @param agricultueFarmerId the primary key for the new agricultue farmer
	 * @return the new agricultue farmer
	 */
	@Override
	public AgricultueFarmer create(long agricultueFarmerId) {
		AgricultueFarmer agricultueFarmer = new AgricultueFarmerImpl();

		agricultueFarmer.setNew(true);
		agricultueFarmer.setPrimaryKey(agricultueFarmerId);

		agricultueFarmer.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultueFarmer;
	}

	/**
	 * Removes the agricultue farmer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer that was removed
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	@Override
	public AgricultueFarmer remove(long agricultueFarmerId)
		throws NoSuchAgricultueFarmerException {

		return remove((Serializable)agricultueFarmerId);
	}

	/**
	 * Removes the agricultue farmer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agricultue farmer
	 * @return the agricultue farmer that was removed
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	@Override
	public AgricultueFarmer remove(Serializable primaryKey)
		throws NoSuchAgricultueFarmerException {

		Session session = null;

		try {
			session = openSession();

			AgricultueFarmer agricultueFarmer = (AgricultueFarmer)session.get(
				AgricultueFarmerImpl.class, primaryKey);

			if (agricultueFarmer == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultueFarmerException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultueFarmer);
		}
		catch (NoSuchAgricultueFarmerException noSuchEntityException) {
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
	protected AgricultueFarmer removeImpl(AgricultueFarmer agricultueFarmer) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultueFarmer)) {
				agricultueFarmer = (AgricultueFarmer)session.get(
					AgricultueFarmerImpl.class,
					agricultueFarmer.getPrimaryKeyObj());
			}

			if (agricultueFarmer != null) {
				session.delete(agricultueFarmer);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultueFarmer != null) {
			clearCache(agricultueFarmer);
		}

		return agricultueFarmer;
	}

	@Override
	public AgricultueFarmer updateImpl(AgricultueFarmer agricultueFarmer) {
		boolean isNew = agricultueFarmer.isNew();

		if (!(agricultueFarmer instanceof AgricultueFarmerModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultueFarmer.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultueFarmer);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultueFarmer proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultueFarmer implementation " +
					agricultueFarmer.getClass());
		}

		AgricultueFarmerModelImpl agricultueFarmerModelImpl =
			(AgricultueFarmerModelImpl)agricultueFarmer;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultueFarmer.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultueFarmer.setCreateDate(date);
			}
			else {
				agricultueFarmer.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultueFarmerModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultueFarmer.setModifiedDate(date);
			}
			else {
				agricultueFarmer.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultueFarmer);
			}
			else {
				agricultueFarmer = (AgricultueFarmer)session.merge(
					agricultueFarmer);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultueFarmerImpl.class, agricultueFarmerModelImpl, false, true);

		cacheUniqueFindersCache(agricultueFarmerModelImpl);

		if (isNew) {
			agricultueFarmer.setNew(false);
		}

		agricultueFarmer.resetOriginalValues();

		return agricultueFarmer;
	}

	/**
	 * Returns the agricultue farmer with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agricultue farmer
	 * @return the agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	@Override
	public AgricultueFarmer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultueFarmerException {

		AgricultueFarmer agricultueFarmer = fetchByPrimaryKey(primaryKey);

		if (agricultueFarmer == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultueFarmerException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultueFarmer;
	}

	/**
	 * Returns the agricultue farmer with the primary key or throws a <code>NoSuchAgricultueFarmerException</code> if it could not be found.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer
	 * @throws NoSuchAgricultueFarmerException if a agricultue farmer with the primary key could not be found
	 */
	@Override
	public AgricultueFarmer findByPrimaryKey(long agricultueFarmerId)
		throws NoSuchAgricultueFarmerException {

		return findByPrimaryKey((Serializable)agricultueFarmerId);
	}

	/**
	 * Returns the agricultue farmer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultueFarmerId the primary key of the agricultue farmer
	 * @return the agricultue farmer, or <code>null</code> if a agricultue farmer with the primary key could not be found
	 */
	@Override
	public AgricultueFarmer fetchByPrimaryKey(long agricultueFarmerId) {
		return fetchByPrimaryKey((Serializable)agricultueFarmerId);
	}

	/**
	 * Returns all the agricultue farmers.
	 *
	 * @return the agricultue farmers
	 */
	@Override
	public List<AgricultueFarmer> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @return the range of agricultue farmers
	 */
	@Override
	public List<AgricultueFarmer> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agricultue farmers
	 */
	@Override
	public List<AgricultueFarmer> findAll(
		int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agricultue farmers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultueFarmerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agricultue farmers
	 * @param end the upper bound of the range of agricultue farmers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agricultue farmers
	 */
	@Override
	public List<AgricultueFarmer> findAll(
		int start, int end,
		OrderByComparator<AgricultueFarmer> orderByComparator,
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

		List<AgricultueFarmer> list = null;

		if (useFinderCache) {
			list = (List<AgricultueFarmer>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUEFARMER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUEFARMER;

				sql = sql.concat(AgricultueFarmerModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultueFarmer>)QueryUtil.list(
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
	 * Removes all the agricultue farmers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultueFarmer agricultueFarmer : findAll()) {
			remove(agricultueFarmer);
		}
	}

	/**
	 * Returns the number of agricultue farmers.
	 *
	 * @return the number of agricultue farmers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_AGRICULTUEFARMER);

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
		return "agricultueFarmerId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUEFARMER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultueFarmerModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agricultue farmer persistence.
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

		_finderPathWithPaginationFindBygetAF_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAF_by_AAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetAF_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetAF_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAF_by_AAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAF_by_AAI",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		AgricultueFarmerUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultueFarmerUtil.setPersistence(null);

		entityCache.removeCache(AgricultueFarmerImpl.class.getName());
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

	private static final String _SQL_SELECT_AGRICULTUEFARMER =
		"SELECT agricultueFarmer FROM AgricultueFarmer agricultueFarmer";

	private static final String _SQL_SELECT_AGRICULTUEFARMER_WHERE =
		"SELECT agricultueFarmer FROM AgricultueFarmer agricultueFarmer WHERE ";

	private static final String _SQL_COUNT_AGRICULTUEFARMER =
		"SELECT COUNT(agricultueFarmer) FROM AgricultueFarmer agricultueFarmer";

	private static final String _SQL_COUNT_AGRICULTUEFARMER_WHERE =
		"SELECT COUNT(agricultueFarmer) FROM AgricultueFarmer agricultueFarmer WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "agricultueFarmer.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultueFarmer exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultueFarmer exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultueFarmerPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}