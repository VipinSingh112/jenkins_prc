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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerPropertyException;
import com.nbp.farm.application.form.service.model.FarmerProperty;
import com.nbp.farm.application.form.service.model.FarmerPropertyTable;
import com.nbp.farm.application.form.service.model.impl.FarmerPropertyImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerPropertyModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerPropertyPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerPropertyUtil;
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
 * The persistence implementation for the farmer property service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FarmerPropertyPersistence.class, BasePersistence.class})
public class FarmerPropertyPersistenceImpl
	extends BasePersistenceImpl<FarmerProperty>
	implements FarmerPropertyPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerPropertyUtil</code> to access the farmer property persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerPropertyImpl.class.getName();

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
	 * Returns the farmer property where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerPropertyException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	@Override
	public FarmerProperty findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerPropertyException {

		FarmerProperty farmerProperty = fetchBygetfarmerById(
			farmerApplicationId);

		if (farmerProperty == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerPropertyException(sb.toString());
		}

		return farmerProperty;
	}

	/**
	 * Returns the farmer property where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	@Override
	public FarmerProperty fetchBygetfarmerById(long farmerApplicationId) {
		return fetchBygetfarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer property where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	@Override
	public FarmerProperty fetchBygetfarmerById(
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

		if (result instanceof FarmerProperty) {
			FarmerProperty farmerProperty = (FarmerProperty)result;

			if (farmerApplicationId !=
					farmerProperty.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERPROPERTY_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerProperty> list = query.list();

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
								"FarmerPropertyPersistenceImpl.fetchBygetfarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerProperty farmerProperty = list.get(0);

					result = farmerProperty;

					cacheResult(farmerProperty);
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
			return (FarmerProperty)result;
		}
	}

	/**
	 * Removes the farmer property where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer property that was removed
	 */
	@Override
	public FarmerProperty removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerPropertyException {

		FarmerProperty farmerProperty = findBygetfarmerById(
			farmerApplicationId);

		return remove(farmerProperty);
	}

	/**
	 * Returns the number of farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer properties
	 */
	@Override
	public int countBygetfarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetfarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERPROPERTY_WHERE);

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
			"farmerProperty.farmerApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFA_FPR_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFA_FPR_FAI;
	private FinderPath _finderPathCountBygetFA_FPR_FAI;

	/**
	 * Returns all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer properties
	 */
	@Override
	public List<FarmerProperty> findBygetFA_FPR_FAI(long farmerApplicationId) {
		return findBygetFA_FPR_FAI(
			farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @return the range of matching farmer properties
	 */
	@Override
	public List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end) {

		return findBygetFA_FPR_FAI(farmerApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer properties
	 */
	@Override
	public List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerProperty> orderByComparator) {

		return findBygetFA_FPR_FAI(
			farmerApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer properties where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer properties
	 */
	@Override
	public List<FarmerProperty> findBygetFA_FPR_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerProperty> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFA_FPR_FAI;
				finderArgs = new Object[] {farmerApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFA_FPR_FAI;
			finderArgs = new Object[] {
				farmerApplicationId, start, end, orderByComparator
			};
		}

		List<FarmerProperty> list = null;

		if (useFinderCache) {
			list = (List<FarmerProperty>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerProperty farmerProperty : list) {
					if (farmerApplicationId !=
							farmerProperty.getFarmerApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMERPROPERTY_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FPR_FAI_FARMERAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerPropertyModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				list = (List<FarmerProperty>)QueryUtil.list(
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
	 * Returns the first farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	@Override
	public FarmerProperty findBygetFA_FPR_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerProperty> orderByComparator)
		throws NoSuchFarmerPropertyException {

		FarmerProperty farmerProperty = fetchBygetFA_FPR_FAI_First(
			farmerApplicationId, orderByComparator);

		if (farmerProperty != null) {
			return farmerProperty;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerPropertyException(sb.toString());
	}

	/**
	 * Returns the first farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	@Override
	public FarmerProperty fetchBygetFA_FPR_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerProperty> orderByComparator) {

		List<FarmerProperty> list = findBygetFA_FPR_FAI(
			farmerApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer property
	 * @throws NoSuchFarmerPropertyException if a matching farmer property could not be found
	 */
	@Override
	public FarmerProperty findBygetFA_FPR_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerProperty> orderByComparator)
		throws NoSuchFarmerPropertyException {

		FarmerProperty farmerProperty = fetchBygetFA_FPR_FAI_Last(
			farmerApplicationId, orderByComparator);

		if (farmerProperty != null) {
			return farmerProperty;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerPropertyException(sb.toString());
	}

	/**
	 * Returns the last farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer property, or <code>null</code> if a matching farmer property could not be found
	 */
	@Override
	public FarmerProperty fetchBygetFA_FPR_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerProperty> orderByComparator) {

		int count = countBygetFA_FPR_FAI(farmerApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmerProperty> list = findBygetFA_FPR_FAI(
			farmerApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer properties before and after the current farmer property in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerPropertyId the primary key of the current farmer property
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer property
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	@Override
	public FarmerProperty[] findBygetFA_FPR_FAI_PrevAndNext(
			long farmerPropertyId, long farmerApplicationId,
			OrderByComparator<FarmerProperty> orderByComparator)
		throws NoSuchFarmerPropertyException {

		FarmerProperty farmerProperty = findByPrimaryKey(farmerPropertyId);

		Session session = null;

		try {
			session = openSession();

			FarmerProperty[] array = new FarmerPropertyImpl[3];

			array[0] = getBygetFA_FPR_FAI_PrevAndNext(
				session, farmerProperty, farmerApplicationId, orderByComparator,
				true);

			array[1] = farmerProperty;

			array[2] = getBygetFA_FPR_FAI_PrevAndNext(
				session, farmerProperty, farmerApplicationId, orderByComparator,
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

	protected FarmerProperty getBygetFA_FPR_FAI_PrevAndNext(
		Session session, FarmerProperty farmerProperty,
		long farmerApplicationId,
		OrderByComparator<FarmerProperty> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMERPROPERTY_WHERE);

		sb.append(_FINDER_COLUMN_GETFA_FPR_FAI_FARMERAPPLICATIONID_2);

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
			sb.append(FarmerPropertyModelImpl.ORDER_BY_JPQL);
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
						farmerProperty)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerProperty> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer properties where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	@Override
	public void removeBygetFA_FPR_FAI(long farmerApplicationId) {
		for (FarmerProperty farmerProperty :
				findBygetFA_FPR_FAI(
					farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerProperty);
		}
	}

	/**
	 * Returns the number of farmer properties where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer properties
	 */
	@Override
	public int countBygetFA_FPR_FAI(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFA_FPR_FAI;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERPROPERTY_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FPR_FAI_FARMERAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETFA_FPR_FAI_FARMERAPPLICATIONID_2 =
			"farmerProperty.farmerApplicationId = ?";

	public FarmerPropertyPersistenceImpl() {
		setModelClass(FarmerProperty.class);

		setModelImplClass(FarmerPropertyImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerPropertyTable.INSTANCE);
	}

	/**
	 * Caches the farmer property in the entity cache if it is enabled.
	 *
	 * @param farmerProperty the farmer property
	 */
	@Override
	public void cacheResult(FarmerProperty farmerProperty) {
		entityCache.putResult(
			FarmerPropertyImpl.class, farmerProperty.getPrimaryKey(),
			farmerProperty);

		finderCache.putResult(
			_finderPathFetchBygetfarmerById,
			new Object[] {farmerProperty.getFarmerApplicationId()},
			farmerProperty);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer properties in the entity cache if it is enabled.
	 *
	 * @param farmerProperties the farmer properties
	 */
	@Override
	public void cacheResult(List<FarmerProperty> farmerProperties) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerProperties.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerProperty farmerProperty : farmerProperties) {
			if (entityCache.getResult(
					FarmerPropertyImpl.class, farmerProperty.getPrimaryKey()) ==
						null) {

				cacheResult(farmerProperty);
			}
		}
	}

	/**
	 * Clears the cache for all farmer properties.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerPropertyImpl.class);

		finderCache.clearCache(FarmerPropertyImpl.class);
	}

	/**
	 * Clears the cache for the farmer property.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerProperty farmerProperty) {
		entityCache.removeResult(FarmerPropertyImpl.class, farmerProperty);
	}

	@Override
	public void clearCache(List<FarmerProperty> farmerProperties) {
		for (FarmerProperty farmerProperty : farmerProperties) {
			entityCache.removeResult(FarmerPropertyImpl.class, farmerProperty);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerPropertyImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmerPropertyImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerPropertyModelImpl farmerPropertyModelImpl) {

		Object[] args = new Object[] {
			farmerPropertyModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetfarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetfarmerById, args, farmerPropertyModelImpl);
	}

	/**
	 * Creates a new farmer property with the primary key. Does not add the farmer property to the database.
	 *
	 * @param farmerPropertyId the primary key for the new farmer property
	 * @return the new farmer property
	 */
	@Override
	public FarmerProperty create(long farmerPropertyId) {
		FarmerProperty farmerProperty = new FarmerPropertyImpl();

		farmerProperty.setNew(true);
		farmerProperty.setPrimaryKey(farmerPropertyId);

		farmerProperty.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerProperty;
	}

	/**
	 * Removes the farmer property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property that was removed
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	@Override
	public FarmerProperty remove(long farmerPropertyId)
		throws NoSuchFarmerPropertyException {

		return remove((Serializable)farmerPropertyId);
	}

	/**
	 * Removes the farmer property with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer property
	 * @return the farmer property that was removed
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	@Override
	public FarmerProperty remove(Serializable primaryKey)
		throws NoSuchFarmerPropertyException {

		Session session = null;

		try {
			session = openSession();

			FarmerProperty farmerProperty = (FarmerProperty)session.get(
				FarmerPropertyImpl.class, primaryKey);

			if (farmerProperty == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerPropertyException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerProperty);
		}
		catch (NoSuchFarmerPropertyException noSuchEntityException) {
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
	protected FarmerProperty removeImpl(FarmerProperty farmerProperty) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerProperty)) {
				farmerProperty = (FarmerProperty)session.get(
					FarmerPropertyImpl.class,
					farmerProperty.getPrimaryKeyObj());
			}

			if (farmerProperty != null) {
				session.delete(farmerProperty);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerProperty != null) {
			clearCache(farmerProperty);
		}

		return farmerProperty;
	}

	@Override
	public FarmerProperty updateImpl(FarmerProperty farmerProperty) {
		boolean isNew = farmerProperty.isNew();

		if (!(farmerProperty instanceof FarmerPropertyModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerProperty.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerProperty);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerProperty proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerProperty implementation " +
					farmerProperty.getClass());
		}

		FarmerPropertyModelImpl farmerPropertyModelImpl =
			(FarmerPropertyModelImpl)farmerProperty;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerProperty.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerProperty.setCreateDate(date);
			}
			else {
				farmerProperty.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerPropertyModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerProperty.setModifiedDate(date);
			}
			else {
				farmerProperty.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerProperty);
			}
			else {
				farmerProperty = (FarmerProperty)session.merge(farmerProperty);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerPropertyImpl.class, farmerPropertyModelImpl, false, true);

		cacheUniqueFindersCache(farmerPropertyModelImpl);

		if (isNew) {
			farmerProperty.setNew(false);
		}

		farmerProperty.resetOriginalValues();

		return farmerProperty;
	}

	/**
	 * Returns the farmer property with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer property
	 * @return the farmer property
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	@Override
	public FarmerProperty findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerPropertyException {

		FarmerProperty farmerProperty = fetchByPrimaryKey(primaryKey);

		if (farmerProperty == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerPropertyException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerProperty;
	}

	/**
	 * Returns the farmer property with the primary key or throws a <code>NoSuchFarmerPropertyException</code> if it could not be found.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property
	 * @throws NoSuchFarmerPropertyException if a farmer property with the primary key could not be found
	 */
	@Override
	public FarmerProperty findByPrimaryKey(long farmerPropertyId)
		throws NoSuchFarmerPropertyException {

		return findByPrimaryKey((Serializable)farmerPropertyId);
	}

	/**
	 * Returns the farmer property with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerPropertyId the primary key of the farmer property
	 * @return the farmer property, or <code>null</code> if a farmer property with the primary key could not be found
	 */
	@Override
	public FarmerProperty fetchByPrimaryKey(long farmerPropertyId) {
		return fetchByPrimaryKey((Serializable)farmerPropertyId);
	}

	/**
	 * Returns all the farmer properties.
	 *
	 * @return the farmer properties
	 */
	@Override
	public List<FarmerProperty> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @return the range of farmer properties
	 */
	@Override
	public List<FarmerProperty> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer properties
	 */
	@Override
	public List<FarmerProperty> findAll(
		int start, int end,
		OrderByComparator<FarmerProperty> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer properties.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerPropertyModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer properties
	 * @param end the upper bound of the range of farmer properties (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer properties
	 */
	@Override
	public List<FarmerProperty> findAll(
		int start, int end, OrderByComparator<FarmerProperty> orderByComparator,
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

		List<FarmerProperty> list = null;

		if (useFinderCache) {
			list = (List<FarmerProperty>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERPROPERTY);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERPROPERTY;

				sql = sql.concat(FarmerPropertyModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerProperty>)QueryUtil.list(
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
	 * Removes all the farmer properties from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerProperty farmerProperty : findAll()) {
			remove(farmerProperty);
		}
	}

	/**
	 * Returns the number of farmer properties.
	 *
	 * @return the number of farmer properties
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FARMERPROPERTY);

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
		return "farmerPropertyId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERPROPERTY;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerPropertyModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer property persistence.
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

		_finderPathWithPaginationFindBygetFA_FPR_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFA_FPR_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmerApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFA_FPR_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFA_FPR_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFA_FPR_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_FPR_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmerPropertyUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerPropertyUtilPersistence(null);

		entityCache.removeCache(FarmerPropertyImpl.class.getName());
	}

	private void _setFarmerPropertyUtilPersistence(
		FarmerPropertyPersistence farmerPropertyPersistence) {

		try {
			Field field = FarmerPropertyUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerPropertyPersistence);
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

	private static final String _SQL_SELECT_FARMERPROPERTY =
		"SELECT farmerProperty FROM FarmerProperty farmerProperty";

	private static final String _SQL_SELECT_FARMERPROPERTY_WHERE =
		"SELECT farmerProperty FROM FarmerProperty farmerProperty WHERE ";

	private static final String _SQL_COUNT_FARMERPROPERTY =
		"SELECT COUNT(farmerProperty) FROM FarmerProperty farmerProperty";

	private static final String _SQL_COUNT_FARMERPROPERTY_WHERE =
		"SELECT COUNT(farmerProperty) FROM FarmerProperty farmerProperty WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmerProperty.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerProperty exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerProperty exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerPropertyPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerPropertyModelArgumentsResolver
		_farmerPropertyModelArgumentsResolver;

}