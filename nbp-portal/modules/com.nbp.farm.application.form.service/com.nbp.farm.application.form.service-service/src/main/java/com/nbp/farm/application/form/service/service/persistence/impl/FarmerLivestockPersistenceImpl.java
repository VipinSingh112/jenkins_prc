/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.farm.application.form.service.exception.NoSuchFarmerLivestockException;
import com.nbp.farm.application.form.service.model.FarmerLivestock;
import com.nbp.farm.application.form.service.model.FarmerLivestockTable;
import com.nbp.farm.application.form.service.model.impl.FarmerLivestockImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerLivestockModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerLivestockPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerLivestockUtil;
import com.nbp.farm.application.form.service.service.persistence.impl.constants.FARMERAPPLICATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
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
 * The persistence implementation for the farmer livestock service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FarmerLivestockPersistence.class, BasePersistence.class})
public class FarmerLivestockPersistenceImpl
	extends BasePersistenceImpl<FarmerLivestock>
	implements FarmerLivestockPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerLivestockUtil</code> to access the farmer livestock persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerLivestockImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetfarmerById;
	private FinderPath _finderPathCountBygetfarmerById;

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerLivestockException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	@Override
	public FarmerLivestock findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerLivestockException {

		FarmerLivestock farmerLivestock = fetchBygetfarmerById(
			farmerApplicationId);

		if (farmerLivestock == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerLivestockException(sb.toString());
		}

		return farmerLivestock;
	}

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	@Override
	public FarmerLivestock fetchBygetfarmerById(long farmerApplicationId) {
		return fetchBygetfarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer livestock where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	@Override
	public FarmerLivestock fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {farmerApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetfarmerById, finderArgs,this);
		}

		if (result instanceof FarmerLivestock) {
			FarmerLivestock farmerLivestock = (FarmerLivestock)result;

			if (farmerApplicationId !=
					farmerLivestock.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERLIVESTOCK_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerLivestock> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetfarmerById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {farmerApplicationId};
							}

							_log.warn(
								"FarmerLivestockPersistenceImpl.fetchBygetfarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerLivestock farmerLivestock = list.get(0);

					result = farmerLivestock;

					cacheResult(farmerLivestock);
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
			return (FarmerLivestock)result;
		}
	}

	/**
	 * Removes the farmer livestock where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer livestock that was removed
	 */
	@Override
	public FarmerLivestock removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerLivestockException {

		FarmerLivestock farmerLivestock = findBygetfarmerById(
			farmerApplicationId);

		return remove(farmerLivestock);
	}

	/**
	 * Returns the number of farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer livestocks
	 */
	@Override
	public int countBygetfarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetfarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERLIVESTOCK_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

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
		_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2 =
			"farmerLivestock.farmerApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFA_FLS_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFA_FLS_FAI;
	private FinderPath _finderPathCountBygetFA_FLS_FAI;

	/**
	 * Returns all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer livestocks
	 */
	@Override
	public List<FarmerLivestock> findBygetFA_FLS_FAI(long farmerApplicationId) {
		return findBygetFA_FLS_FAI(
			farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @return the range of matching farmer livestocks
	 */
	@Override
	public List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end) {

		return findBygetFA_FLS_FAI(farmerApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer livestocks
	 */
	@Override
	public List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		return findBygetFA_FLS_FAI(
			farmerApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer livestocks
	 */
	@Override
	public List<FarmerLivestock> findBygetFA_FLS_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFA_FLS_FAI;
				finderArgs = new Object[] {farmerApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFA_FLS_FAI;
			finderArgs = new Object[] {
				farmerApplicationId, start, end, orderByComparator
			};
		}

		List<FarmerLivestock> list = null;

		if (useFinderCache) {
			list = (List<FarmerLivestock>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerLivestock farmerLivestock : list) {
					if (farmerApplicationId !=
							farmerLivestock.getFarmerApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMERLIVESTOCK_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FLS_FAI_FARMERAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerLivestockModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				list = (List<FarmerLivestock>)QueryUtil.list(
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
	 * Returns the first farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	@Override
	public FarmerLivestock findBygetFA_FLS_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerLivestock> orderByComparator)
		throws NoSuchFarmerLivestockException {

		FarmerLivestock farmerLivestock = fetchBygetFA_FLS_FAI_First(
			farmerApplicationId, orderByComparator);

		if (farmerLivestock != null) {
			return farmerLivestock;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerLivestockException(sb.toString());
	}

	/**
	 * Returns the first farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	@Override
	public FarmerLivestock fetchBygetFA_FLS_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		List<FarmerLivestock> list = findBygetFA_FLS_FAI(
			farmerApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer livestock
	 * @throws NoSuchFarmerLivestockException if a matching farmer livestock could not be found
	 */
	@Override
	public FarmerLivestock findBygetFA_FLS_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerLivestock> orderByComparator)
		throws NoSuchFarmerLivestockException {

		FarmerLivestock farmerLivestock = fetchBygetFA_FLS_FAI_Last(
			farmerApplicationId, orderByComparator);

		if (farmerLivestock != null) {
			return farmerLivestock;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerLivestockException(sb.toString());
	}

	/**
	 * Returns the last farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer livestock, or <code>null</code> if a matching farmer livestock could not be found
	 */
	@Override
	public FarmerLivestock fetchBygetFA_FLS_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		int count = countBygetFA_FLS_FAI(farmerApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmerLivestock> list = findBygetFA_FLS_FAI(
			farmerApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer livestocks before and after the current farmer livestock in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerLiveStockId the primary key of the current farmer livestock
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer livestock
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	@Override
	public FarmerLivestock[] findBygetFA_FLS_FAI_PrevAndNext(
			long farmerLiveStockId, long farmerApplicationId,
			OrderByComparator<FarmerLivestock> orderByComparator)
		throws NoSuchFarmerLivestockException {

		FarmerLivestock farmerLivestock = findByPrimaryKey(farmerLiveStockId);

		Session session = null;

		try {
			session = openSession();

			FarmerLivestock[] array = new FarmerLivestockImpl[3];

			array[0] = getBygetFA_FLS_FAI_PrevAndNext(
				session, farmerLivestock, farmerApplicationId,
				orderByComparator, true);

			array[1] = farmerLivestock;

			array[2] = getBygetFA_FLS_FAI_PrevAndNext(
				session, farmerLivestock, farmerApplicationId,
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

	protected FarmerLivestock getBygetFA_FLS_FAI_PrevAndNext(
		Session session, FarmerLivestock farmerLivestock,
		long farmerApplicationId,
		OrderByComparator<FarmerLivestock> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERLIVESTOCK_WHERE);

		sb.append(_FINDER_COLUMN_GETFA_FLS_FAI_FARMERAPPLICATIONID_2);

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
			sb.append(FarmerLivestockModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(farmerApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmerLivestock)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerLivestock> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer livestocks where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	@Override
	public void removeBygetFA_FLS_FAI(long farmerApplicationId) {
		for (FarmerLivestock farmerLivestock :
				findBygetFA_FLS_FAI(
					farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerLivestock);
		}
	}

	/**
	 * Returns the number of farmer livestocks where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer livestocks
	 */
	@Override
	public int countBygetFA_FLS_FAI(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFA_FLS_FAI;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERLIVESTOCK_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FLS_FAI_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

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
		_FINDER_COLUMN_GETFA_FLS_FAI_FARMERAPPLICATIONID_2 =
			"farmerLivestock.farmerApplicationId = ?";

	public FarmerLivestockPersistenceImpl() {
		setModelClass(FarmerLivestock.class);

		setModelImplClass(FarmerLivestockImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerLivestockTable.INSTANCE);
	}

	/**
	 * Caches the farmer livestock in the entity cache if it is enabled.
	 *
	 * @param farmerLivestock the farmer livestock
	 */
	@Override
	public void cacheResult(FarmerLivestock farmerLivestock) {
		entityCache.putResult(
			FarmerLivestockImpl.class, farmerLivestock.getPrimaryKey(),
			farmerLivestock);

		finderCache.putResult(
			_finderPathFetchBygetfarmerById,
			new Object[] {farmerLivestock.getFarmerApplicationId()},
			farmerLivestock);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer livestocks in the entity cache if it is enabled.
	 *
	 * @param farmerLivestocks the farmer livestocks
	 */
	@Override
	public void cacheResult(List<FarmerLivestock> farmerLivestocks) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerLivestocks.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerLivestock farmerLivestock : farmerLivestocks) {
			if (entityCache.getResult(
					FarmerLivestockImpl.class,
					farmerLivestock.getPrimaryKey()) == null) {

				cacheResult(farmerLivestock);
			}
		}
	}

	/**
	 * Clears the cache for all farmer livestocks.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerLivestockImpl.class);

		finderCache.clearCache(FarmerLivestockImpl.class);
	}

	/**
	 * Clears the cache for the farmer livestock.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerLivestock farmerLivestock) {
		entityCache.removeResult(FarmerLivestockImpl.class, farmerLivestock);
	}

	@Override
	public void clearCache(List<FarmerLivestock> farmerLivestocks) {
		for (FarmerLivestock farmerLivestock : farmerLivestocks) {
			entityCache.removeResult(
				FarmerLivestockImpl.class, farmerLivestock);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerLivestockImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmerLivestockImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerLivestockModelImpl farmerLivestockModelImpl) {

		Object[] args = new Object[] {
			farmerLivestockModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetfarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetfarmerById, args, farmerLivestockModelImpl);
	}

	/**
	 * Creates a new farmer livestock with the primary key. Does not add the farmer livestock to the database.
	 *
	 * @param farmerLiveStockId the primary key for the new farmer livestock
	 * @return the new farmer livestock
	 */
	@Override
	public FarmerLivestock create(long farmerLiveStockId) {
		FarmerLivestock farmerLivestock = new FarmerLivestockImpl();

		farmerLivestock.setNew(true);
		farmerLivestock.setPrimaryKey(farmerLiveStockId);

		farmerLivestock.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerLivestock;
	}

	/**
	 * Removes the farmer livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock that was removed
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	@Override
	public FarmerLivestock remove(long farmerLiveStockId)
		throws NoSuchFarmerLivestockException {

		return remove((Serializable)farmerLiveStockId);
	}

	/**
	 * Removes the farmer livestock with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer livestock
	 * @return the farmer livestock that was removed
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	@Override
	public FarmerLivestock remove(Serializable primaryKey)
		throws NoSuchFarmerLivestockException {

		Session session = null;

		try {
			session = openSession();

			FarmerLivestock farmerLivestock = (FarmerLivestock)session.get(
				FarmerLivestockImpl.class, primaryKey);

			if (farmerLivestock == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerLivestockException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerLivestock);
		}
		catch (NoSuchFarmerLivestockException noSuchEntityException) {
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
	protected FarmerLivestock removeImpl(FarmerLivestock farmerLivestock) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerLivestock)) {
				farmerLivestock = (FarmerLivestock)session.get(
					FarmerLivestockImpl.class,
					farmerLivestock.getPrimaryKeyObj());
			}

			if (farmerLivestock != null) {
				session.delete(farmerLivestock);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerLivestock != null) {
			clearCache(farmerLivestock);
		}

		return farmerLivestock;
	}

	@Override
	public FarmerLivestock updateImpl(FarmerLivestock farmerLivestock) {
		boolean isNew = farmerLivestock.isNew();

		if (!(farmerLivestock instanceof FarmerLivestockModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerLivestock.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerLivestock);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerLivestock proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerLivestock implementation " +
					farmerLivestock.getClass());
		}

		FarmerLivestockModelImpl farmerLivestockModelImpl =
			(FarmerLivestockModelImpl)farmerLivestock;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerLivestock.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerLivestock.setCreateDate(date);
			}
			else {
				farmerLivestock.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerLivestockModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerLivestock.setModifiedDate(date);
			}
			else {
				farmerLivestock.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerLivestock);
			}
			else {
				farmerLivestock = (FarmerLivestock)session.merge(
					farmerLivestock);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerLivestockImpl.class, farmerLivestockModelImpl, false, true);

		cacheUniqueFindersCache(farmerLivestockModelImpl);

		if (isNew) {
			farmerLivestock.setNew(false);
		}

		farmerLivestock.resetOriginalValues();

		return farmerLivestock;
	}

	/**
	 * Returns the farmer livestock with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer livestock
	 * @return the farmer livestock
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	@Override
	public FarmerLivestock findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerLivestockException {

		FarmerLivestock farmerLivestock = fetchByPrimaryKey(primaryKey);

		if (farmerLivestock == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerLivestockException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerLivestock;
	}

	/**
	 * Returns the farmer livestock with the primary key or throws a <code>NoSuchFarmerLivestockException</code> if it could not be found.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock
	 * @throws NoSuchFarmerLivestockException if a farmer livestock with the primary key could not be found
	 */
	@Override
	public FarmerLivestock findByPrimaryKey(long farmerLiveStockId)
		throws NoSuchFarmerLivestockException {

		return findByPrimaryKey((Serializable)farmerLiveStockId);
	}

	/**
	 * Returns the farmer livestock with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerLiveStockId the primary key of the farmer livestock
	 * @return the farmer livestock, or <code>null</code> if a farmer livestock with the primary key could not be found
	 */
	@Override
	public FarmerLivestock fetchByPrimaryKey(long farmerLiveStockId) {
		return fetchByPrimaryKey((Serializable)farmerLiveStockId);
	}

	/**
	 * Returns all the farmer livestocks.
	 *
	 * @return the farmer livestocks
	 */
	@Override
	public List<FarmerLivestock> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @return the range of farmer livestocks
	 */
	@Override
	public List<FarmerLivestock> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer livestocks
	 */
	@Override
	public List<FarmerLivestock> findAll(
		int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer livestocks.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerLivestockModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer livestocks
	 * @param end the upper bound of the range of farmer livestocks (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer livestocks
	 */
	@Override
	public List<FarmerLivestock> findAll(
		int start, int end,
		OrderByComparator<FarmerLivestock> orderByComparator,
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

		List<FarmerLivestock> list = null;

		if (useFinderCache) {
			list = (List<FarmerLivestock>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERLIVESTOCK);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERLIVESTOCK;

				sql = sql.concat(FarmerLivestockModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerLivestock>)QueryUtil.list(
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
	 * Removes all the farmer livestocks from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerLivestock farmerLivestock : findAll()) {
			remove(farmerLivestock);
		}
	}

	/**
	 * Returns the number of farmer livestocks.
	 *
	 * @return the number of farmer livestocks
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FARMERLIVESTOCK);

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
		return "farmerLiveStockId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERLIVESTOCK;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerLivestockModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer livestock persistence.
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

		_finderPathFetchBygetfarmerById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetfarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetfarmerById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetfarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_finderPathWithPaginationFindBygetFA_FLS_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFA_FLS_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmerApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFA_FLS_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFA_FLS_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFA_FLS_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_FLS_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmerLivestockUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerLivestockUtilPersistence(null);

		entityCache.removeCache(FarmerLivestockImpl.class.getName());
	}

	private void _setFarmerLivestockUtilPersistence(
		FarmerLivestockPersistence farmerLivestockPersistence) {

		try {
			Field field = FarmerLivestockUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerLivestockPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FARMERLIVESTOCK =
		"SELECT farmerLivestock FROM FarmerLivestock farmerLivestock";

	private static final String _SQL_SELECT_FARMERLIVESTOCK_WHERE =
		"SELECT farmerLivestock FROM FarmerLivestock farmerLivestock WHERE ";

	private static final String _SQL_COUNT_FARMERLIVESTOCK =
		"SELECT COUNT(farmerLivestock) FROM FarmerLivestock farmerLivestock";

	private static final String _SQL_COUNT_FARMERLIVESTOCK_WHERE =
		"SELECT COUNT(farmerLivestock) FROM FarmerLivestock farmerLivestock WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmerLivestock.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerLivestock exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerLivestock exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerLivestockPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerLivestockModelArgumentsResolver
		_farmerLivestockModelArgumentsResolver;

}