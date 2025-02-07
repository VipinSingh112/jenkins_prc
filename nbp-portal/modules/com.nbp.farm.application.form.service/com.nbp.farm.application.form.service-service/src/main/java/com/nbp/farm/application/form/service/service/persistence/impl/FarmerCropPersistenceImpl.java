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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerCropException;
import com.nbp.farm.application.form.service.model.FarmerCrop;
import com.nbp.farm.application.form.service.model.FarmerCropTable;
import com.nbp.farm.application.form.service.model.impl.FarmerCropImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerCropModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerCropPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerCropUtil;
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
 * The persistence implementation for the farmer crop service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FarmerCropPersistence.class, BasePersistence.class})
public class FarmerCropPersistenceImpl
	extends BasePersistenceImpl<FarmerCrop> implements FarmerCropPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerCropUtil</code> to access the farmer crop persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerCropImpl.class.getName();

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
	 * Returns the farmer crop where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerCropException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	@Override
	public FarmerCrop findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerCropException {

		FarmerCrop farmerCrop = fetchBygetfarmerById(farmerApplicationId);

		if (farmerCrop == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerCropException(sb.toString());
		}

		return farmerCrop;
	}

	/**
	 * Returns the farmer crop where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	@Override
	public FarmerCrop fetchBygetfarmerById(long farmerApplicationId) {
		return fetchBygetfarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer crop where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	@Override
	public FarmerCrop fetchBygetfarmerById(
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

		if (result instanceof FarmerCrop) {
			FarmerCrop farmerCrop = (FarmerCrop)result;

			if (farmerApplicationId != farmerCrop.getFarmerApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERCROP_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerCrop> list = query.list();

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
								"FarmerCropPersistenceImpl.fetchBygetfarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerCrop farmerCrop = list.get(0);

					result = farmerCrop;

					cacheResult(farmerCrop);
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
			return (FarmerCrop)result;
		}
	}

	/**
	 * Removes the farmer crop where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer crop that was removed
	 */
	@Override
	public FarmerCrop removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerCropException {

		FarmerCrop farmerCrop = findBygetfarmerById(farmerApplicationId);

		return remove(farmerCrop);
	}

	/**
	 * Returns the number of farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crops
	 */
	@Override
	public int countBygetfarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetfarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERCROP_WHERE);

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
			"farmerCrop.farmerApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFA_FC_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFA_FC_FAI;
	private FinderPath _finderPathCountBygetFA_FC_FAI;

	/**
	 * Returns all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crops
	 */
	@Override
	public List<FarmerCrop> findBygetFA_FC_FAI(long farmerApplicationId) {
		return findBygetFA_FC_FAI(
			farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @return the range of matching farmer crops
	 */
	@Override
	public List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end) {

		return findBygetFA_FC_FAI(farmerApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer crops
	 */
	@Override
	public List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerCrop> orderByComparator) {

		return findBygetFA_FC_FAI(
			farmerApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer crops where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer crops
	 */
	@Override
	public List<FarmerCrop> findBygetFA_FC_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerCrop> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFA_FC_FAI;
				finderArgs = new Object[] {farmerApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFA_FC_FAI;
			finderArgs = new Object[] {
				farmerApplicationId, start, end, orderByComparator
			};
		}

		List<FarmerCrop> list = null;

		if (useFinderCache) {
			list = (List<FarmerCrop>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerCrop farmerCrop : list) {
					if (farmerApplicationId !=
							farmerCrop.getFarmerApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMERCROP_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FC_FAI_FARMERAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerCropModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				list = (List<FarmerCrop>)QueryUtil.list(
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
	 * Returns the first farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	@Override
	public FarmerCrop findBygetFA_FC_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerCrop> orderByComparator)
		throws NoSuchFarmerCropException {

		FarmerCrop farmerCrop = fetchBygetFA_FC_FAI_First(
			farmerApplicationId, orderByComparator);

		if (farmerCrop != null) {
			return farmerCrop;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerCropException(sb.toString());
	}

	/**
	 * Returns the first farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	@Override
	public FarmerCrop fetchBygetFA_FC_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerCrop> orderByComparator) {

		List<FarmerCrop> list = findBygetFA_FC_FAI(
			farmerApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop
	 * @throws NoSuchFarmerCropException if a matching farmer crop could not be found
	 */
	@Override
	public FarmerCrop findBygetFA_FC_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerCrop> orderByComparator)
		throws NoSuchFarmerCropException {

		FarmerCrop farmerCrop = fetchBygetFA_FC_FAI_Last(
			farmerApplicationId, orderByComparator);

		if (farmerCrop != null) {
			return farmerCrop;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerCropException(sb.toString());
	}

	/**
	 * Returns the last farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop, or <code>null</code> if a matching farmer crop could not be found
	 */
	@Override
	public FarmerCrop fetchBygetFA_FC_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerCrop> orderByComparator) {

		int count = countBygetFA_FC_FAI(farmerApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmerCrop> list = findBygetFA_FC_FAI(
			farmerApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer crops before and after the current farmer crop in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerCropId the primary key of the current farmer crop
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer crop
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	@Override
	public FarmerCrop[] findBygetFA_FC_FAI_PrevAndNext(
			long farmerCropId, long farmerApplicationId,
			OrderByComparator<FarmerCrop> orderByComparator)
		throws NoSuchFarmerCropException {

		FarmerCrop farmerCrop = findByPrimaryKey(farmerCropId);

		Session session = null;

		try {
			session = openSession();

			FarmerCrop[] array = new FarmerCropImpl[3];

			array[0] = getBygetFA_FC_FAI_PrevAndNext(
				session, farmerCrop, farmerApplicationId, orderByComparator,
				true);

			array[1] = farmerCrop;

			array[2] = getBygetFA_FC_FAI_PrevAndNext(
				session, farmerCrop, farmerApplicationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmerCrop getBygetFA_FC_FAI_PrevAndNext(
		Session session, FarmerCrop farmerCrop, long farmerApplicationId,
		OrderByComparator<FarmerCrop> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMERCROP_WHERE);

		sb.append(_FINDER_COLUMN_GETFA_FC_FAI_FARMERAPPLICATIONID_2);

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
			sb.append(FarmerCropModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(farmerApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(farmerCrop)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerCrop> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer crops where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	@Override
	public void removeBygetFA_FC_FAI(long farmerApplicationId) {
		for (FarmerCrop farmerCrop :
				findBygetFA_FC_FAI(
					farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerCrop);
		}
	}

	/**
	 * Returns the number of farmer crops where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crops
	 */
	@Override
	public int countBygetFA_FC_FAI(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFA_FC_FAI;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERCROP_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FC_FAI_FARMERAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETFA_FC_FAI_FARMERAPPLICATIONID_2 =
			"farmerCrop.farmerApplicationId = ?";

	public FarmerCropPersistenceImpl() {
		setModelClass(FarmerCrop.class);

		setModelImplClass(FarmerCropImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerCropTable.INSTANCE);
	}

	/**
	 * Caches the farmer crop in the entity cache if it is enabled.
	 *
	 * @param farmerCrop the farmer crop
	 */
	@Override
	public void cacheResult(FarmerCrop farmerCrop) {
		entityCache.putResult(
			FarmerCropImpl.class, farmerCrop.getPrimaryKey(), farmerCrop);

		finderCache.putResult(
			_finderPathFetchBygetfarmerById,
			new Object[] {farmerCrop.getFarmerApplicationId()}, farmerCrop);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer crops in the entity cache if it is enabled.
	 *
	 * @param farmerCrops the farmer crops
	 */
	@Override
	public void cacheResult(List<FarmerCrop> farmerCrops) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerCrops.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerCrop farmerCrop : farmerCrops) {
			if (entityCache.getResult(
					FarmerCropImpl.class, farmerCrop.getPrimaryKey()) == null) {

				cacheResult(farmerCrop);
			}
		}
	}

	/**
	 * Clears the cache for all farmer crops.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerCropImpl.class);

		finderCache.clearCache(FarmerCropImpl.class);
	}

	/**
	 * Clears the cache for the farmer crop.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerCrop farmerCrop) {
		entityCache.removeResult(FarmerCropImpl.class, farmerCrop);
	}

	@Override
	public void clearCache(List<FarmerCrop> farmerCrops) {
		for (FarmerCrop farmerCrop : farmerCrops) {
			entityCache.removeResult(FarmerCropImpl.class, farmerCrop);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerCropImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmerCropImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerCropModelImpl farmerCropModelImpl) {

		Object[] args = new Object[] {
			farmerCropModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetfarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetfarmerById, args, farmerCropModelImpl);
	}

	/**
	 * Creates a new farmer crop with the primary key. Does not add the farmer crop to the database.
	 *
	 * @param farmerCropId the primary key for the new farmer crop
	 * @return the new farmer crop
	 */
	@Override
	public FarmerCrop create(long farmerCropId) {
		FarmerCrop farmerCrop = new FarmerCropImpl();

		farmerCrop.setNew(true);
		farmerCrop.setPrimaryKey(farmerCropId);

		farmerCrop.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerCrop;
	}

	/**
	 * Removes the farmer crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop that was removed
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	@Override
	public FarmerCrop remove(long farmerCropId)
		throws NoSuchFarmerCropException {

		return remove((Serializable)farmerCropId);
	}

	/**
	 * Removes the farmer crop with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer crop
	 * @return the farmer crop that was removed
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	@Override
	public FarmerCrop remove(Serializable primaryKey)
		throws NoSuchFarmerCropException {

		Session session = null;

		try {
			session = openSession();

			FarmerCrop farmerCrop = (FarmerCrop)session.get(
				FarmerCropImpl.class, primaryKey);

			if (farmerCrop == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerCropException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerCrop);
		}
		catch (NoSuchFarmerCropException noSuchEntityException) {
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
	protected FarmerCrop removeImpl(FarmerCrop farmerCrop) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerCrop)) {
				farmerCrop = (FarmerCrop)session.get(
					FarmerCropImpl.class, farmerCrop.getPrimaryKeyObj());
			}

			if (farmerCrop != null) {
				session.delete(farmerCrop);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerCrop != null) {
			clearCache(farmerCrop);
		}

		return farmerCrop;
	}

	@Override
	public FarmerCrop updateImpl(FarmerCrop farmerCrop) {
		boolean isNew = farmerCrop.isNew();

		if (!(farmerCrop instanceof FarmerCropModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerCrop.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(farmerCrop);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerCrop proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerCrop implementation " +
					farmerCrop.getClass());
		}

		FarmerCropModelImpl farmerCropModelImpl =
			(FarmerCropModelImpl)farmerCrop;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerCrop.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerCrop.setCreateDate(date);
			}
			else {
				farmerCrop.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!farmerCropModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerCrop.setModifiedDate(date);
			}
			else {
				farmerCrop.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerCrop);
			}
			else {
				farmerCrop = (FarmerCrop)session.merge(farmerCrop);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerCropImpl.class, farmerCropModelImpl, false, true);

		cacheUniqueFindersCache(farmerCropModelImpl);

		if (isNew) {
			farmerCrop.setNew(false);
		}

		farmerCrop.resetOriginalValues();

		return farmerCrop;
	}

	/**
	 * Returns the farmer crop with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer crop
	 * @return the farmer crop
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	@Override
	public FarmerCrop findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerCropException {

		FarmerCrop farmerCrop = fetchByPrimaryKey(primaryKey);

		if (farmerCrop == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerCropException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerCrop;
	}

	/**
	 * Returns the farmer crop with the primary key or throws a <code>NoSuchFarmerCropException</code> if it could not be found.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop
	 * @throws NoSuchFarmerCropException if a farmer crop with the primary key could not be found
	 */
	@Override
	public FarmerCrop findByPrimaryKey(long farmerCropId)
		throws NoSuchFarmerCropException {

		return findByPrimaryKey((Serializable)farmerCropId);
	}

	/**
	 * Returns the farmer crop with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCropId the primary key of the farmer crop
	 * @return the farmer crop, or <code>null</code> if a farmer crop with the primary key could not be found
	 */
	@Override
	public FarmerCrop fetchByPrimaryKey(long farmerCropId) {
		return fetchByPrimaryKey((Serializable)farmerCropId);
	}

	/**
	 * Returns all the farmer crops.
	 *
	 * @return the farmer crops
	 */
	@Override
	public List<FarmerCrop> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @return the range of farmer crops
	 */
	@Override
	public List<FarmerCrop> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer crops
	 */
	@Override
	public List<FarmerCrop> findAll(
		int start, int end, OrderByComparator<FarmerCrop> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer crops.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crops
	 * @param end the upper bound of the range of farmer crops (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer crops
	 */
	@Override
	public List<FarmerCrop> findAll(
		int start, int end, OrderByComparator<FarmerCrop> orderByComparator,
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

		List<FarmerCrop> list = null;

		if (useFinderCache) {
			list = (List<FarmerCrop>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERCROP);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERCROP;

				sql = sql.concat(FarmerCropModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerCrop>)QueryUtil.list(
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
	 * Removes all the farmer crops from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerCrop farmerCrop : findAll()) {
			remove(farmerCrop);
		}
	}

	/**
	 * Returns the number of farmer crops.
	 *
	 * @return the number of farmer crops
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FARMERCROP);

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
		return "farmerCropId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERCROP;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerCropModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer crop persistence.
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

		_finderPathWithPaginationFindBygetFA_FC_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFA_FC_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmerApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFA_FC_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFA_FC_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFA_FC_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_FC_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmerCropUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerCropUtilPersistence(null);

		entityCache.removeCache(FarmerCropImpl.class.getName());
	}

	private void _setFarmerCropUtilPersistence(
		FarmerCropPersistence farmerCropPersistence) {

		try {
			Field field = FarmerCropUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, farmerCropPersistence);
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

	private static final String _SQL_SELECT_FARMERCROP =
		"SELECT farmerCrop FROM FarmerCrop farmerCrop";

	private static final String _SQL_SELECT_FARMERCROP_WHERE =
		"SELECT farmerCrop FROM FarmerCrop farmerCrop WHERE ";

	private static final String _SQL_COUNT_FARMERCROP =
		"SELECT COUNT(farmerCrop) FROM FarmerCrop farmerCrop";

	private static final String _SQL_COUNT_FARMERCROP_WHERE =
		"SELECT COUNT(farmerCrop) FROM FarmerCrop farmerCrop WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmerCrop.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerCrop exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerCrop exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerCropPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerCropModelArgumentsResolver _farmerCropModelArgumentsResolver;

}