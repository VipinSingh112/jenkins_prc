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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerProfileException;
import com.nbp.farm.application.form.service.model.FarmerProfile;
import com.nbp.farm.application.form.service.model.FarmerProfileTable;
import com.nbp.farm.application.form.service.model.impl.FarmerProfileImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerProfileModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerProfilePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerProfileUtil;
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
 * The persistence implementation for the farmer profile service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FarmerProfilePersistence.class, BasePersistence.class})
public class FarmerProfilePersistenceImpl
	extends BasePersistenceImpl<FarmerProfile>
	implements FarmerProfilePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerProfileUtil</code> to access the farmer profile persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerProfileImpl.class.getName();

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
	 * Returns the farmer profile where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerProfileException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	@Override
	public FarmerProfile findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerProfileException {

		FarmerProfile farmerProfile = fetchBygetfarmerById(farmerApplicationId);

		if (farmerProfile == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerProfileException(sb.toString());
		}

		return farmerProfile;
	}

	/**
	 * Returns the farmer profile where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	@Override
	public FarmerProfile fetchBygetfarmerById(long farmerApplicationId) {
		return fetchBygetfarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer profile where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	@Override
	public FarmerProfile fetchBygetfarmerById(
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

		if (result instanceof FarmerProfile) {
			FarmerProfile farmerProfile = (FarmerProfile)result;

			if (farmerApplicationId != farmerProfile.getFarmerApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERPROFILE_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerProfile> list = query.list();

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
								"FarmerProfilePersistenceImpl.fetchBygetfarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerProfile farmerProfile = list.get(0);

					result = farmerProfile;

					cacheResult(farmerProfile);
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
			return (FarmerProfile)result;
		}
	}

	/**
	 * Removes the farmer profile where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer profile that was removed
	 */
	@Override
	public FarmerProfile removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerProfileException {

		FarmerProfile farmerProfile = findBygetfarmerById(farmerApplicationId);

		return remove(farmerProfile);
	}

	/**
	 * Returns the number of farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer profiles
	 */
	@Override
	public int countBygetfarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetfarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERPROFILE_WHERE);

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
			"farmerProfile.farmerApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFA_FP_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFA_FP_FAI;
	private FinderPath _finderPathCountBygetFA_FP_FAI;

	/**
	 * Returns all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer profiles
	 */
	@Override
	public List<FarmerProfile> findBygetFA_FP_FAI(long farmerApplicationId) {
		return findBygetFA_FP_FAI(
			farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @return the range of matching farmer profiles
	 */
	@Override
	public List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end) {

		return findBygetFA_FP_FAI(farmerApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer profiles
	 */
	@Override
	public List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerProfile> orderByComparator) {

		return findBygetFA_FP_FAI(
			farmerApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer profiles where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer profiles
	 */
	@Override
	public List<FarmerProfile> findBygetFA_FP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerProfile> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFA_FP_FAI;
				finderArgs = new Object[] {farmerApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFA_FP_FAI;
			finderArgs = new Object[] {
				farmerApplicationId, start, end, orderByComparator
			};
		}

		List<FarmerProfile> list = null;

		if (useFinderCache) {
			list = (List<FarmerProfile>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerProfile farmerProfile : list) {
					if (farmerApplicationId !=
							farmerProfile.getFarmerApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMERPROFILE_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FP_FAI_FARMERAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerProfileModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				list = (List<FarmerProfile>)QueryUtil.list(
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
	 * Returns the first farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	@Override
	public FarmerProfile findBygetFA_FP_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerProfile> orderByComparator)
		throws NoSuchFarmerProfileException {

		FarmerProfile farmerProfile = fetchBygetFA_FP_FAI_First(
			farmerApplicationId, orderByComparator);

		if (farmerProfile != null) {
			return farmerProfile;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerProfileException(sb.toString());
	}

	/**
	 * Returns the first farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	@Override
	public FarmerProfile fetchBygetFA_FP_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerProfile> orderByComparator) {

		List<FarmerProfile> list = findBygetFA_FP_FAI(
			farmerApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer profile
	 * @throws NoSuchFarmerProfileException if a matching farmer profile could not be found
	 */
	@Override
	public FarmerProfile findBygetFA_FP_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerProfile> orderByComparator)
		throws NoSuchFarmerProfileException {

		FarmerProfile farmerProfile = fetchBygetFA_FP_FAI_Last(
			farmerApplicationId, orderByComparator);

		if (farmerProfile != null) {
			return farmerProfile;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerProfileException(sb.toString());
	}

	/**
	 * Returns the last farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer profile, or <code>null</code> if a matching farmer profile could not be found
	 */
	@Override
	public FarmerProfile fetchBygetFA_FP_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerProfile> orderByComparator) {

		int count = countBygetFA_FP_FAI(farmerApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmerProfile> list = findBygetFA_FP_FAI(
			farmerApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer profiles before and after the current farmer profile in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerProfileId the primary key of the current farmer profile
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer profile
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	@Override
	public FarmerProfile[] findBygetFA_FP_FAI_PrevAndNext(
			long farmerProfileId, long farmerApplicationId,
			OrderByComparator<FarmerProfile> orderByComparator)
		throws NoSuchFarmerProfileException {

		FarmerProfile farmerProfile = findByPrimaryKey(farmerProfileId);

		Session session = null;

		try {
			session = openSession();

			FarmerProfile[] array = new FarmerProfileImpl[3];

			array[0] = getBygetFA_FP_FAI_PrevAndNext(
				session, farmerProfile, farmerApplicationId, orderByComparator,
				true);

			array[1] = farmerProfile;

			array[2] = getBygetFA_FP_FAI_PrevAndNext(
				session, farmerProfile, farmerApplicationId, orderByComparator,
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

	protected FarmerProfile getBygetFA_FP_FAI_PrevAndNext(
		Session session, FarmerProfile farmerProfile, long farmerApplicationId,
		OrderByComparator<FarmerProfile> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMERPROFILE_WHERE);

		sb.append(_FINDER_COLUMN_GETFA_FP_FAI_FARMERAPPLICATIONID_2);

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
			sb.append(FarmerProfileModelImpl.ORDER_BY_JPQL);
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
						farmerProfile)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerProfile> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer profiles where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	@Override
	public void removeBygetFA_FP_FAI(long farmerApplicationId) {
		for (FarmerProfile farmerProfile :
				findBygetFA_FP_FAI(
					farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerProfile);
		}
	}

	/**
	 * Returns the number of farmer profiles where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer profiles
	 */
	@Override
	public int countBygetFA_FP_FAI(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFA_FP_FAI;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERPROFILE_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FP_FAI_FARMERAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETFA_FP_FAI_FARMERAPPLICATIONID_2 =
			"farmerProfile.farmerApplicationId = ?";

	public FarmerProfilePersistenceImpl() {
		setModelClass(FarmerProfile.class);

		setModelImplClass(FarmerProfileImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerProfileTable.INSTANCE);
	}

	/**
	 * Caches the farmer profile in the entity cache if it is enabled.
	 *
	 * @param farmerProfile the farmer profile
	 */
	@Override
	public void cacheResult(FarmerProfile farmerProfile) {
		entityCache.putResult(
			FarmerProfileImpl.class, farmerProfile.getPrimaryKey(),
			farmerProfile);

		finderCache.putResult(
			_finderPathFetchBygetfarmerById,
			new Object[] {farmerProfile.getFarmerApplicationId()},
			farmerProfile);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer profiles in the entity cache if it is enabled.
	 *
	 * @param farmerProfiles the farmer profiles
	 */
	@Override
	public void cacheResult(List<FarmerProfile> farmerProfiles) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerProfiles.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerProfile farmerProfile : farmerProfiles) {
			if (entityCache.getResult(
					FarmerProfileImpl.class, farmerProfile.getPrimaryKey()) ==
						null) {

				cacheResult(farmerProfile);
			}
		}
	}

	/**
	 * Clears the cache for all farmer profiles.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerProfileImpl.class);

		finderCache.clearCache(FarmerProfileImpl.class);
	}

	/**
	 * Clears the cache for the farmer profile.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerProfile farmerProfile) {
		entityCache.removeResult(FarmerProfileImpl.class, farmerProfile);
	}

	@Override
	public void clearCache(List<FarmerProfile> farmerProfiles) {
		for (FarmerProfile farmerProfile : farmerProfiles) {
			entityCache.removeResult(FarmerProfileImpl.class, farmerProfile);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerProfileImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmerProfileImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerProfileModelImpl farmerProfileModelImpl) {

		Object[] args = new Object[] {
			farmerProfileModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetfarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetfarmerById, args, farmerProfileModelImpl);
	}

	/**
	 * Creates a new farmer profile with the primary key. Does not add the farmer profile to the database.
	 *
	 * @param farmerProfileId the primary key for the new farmer profile
	 * @return the new farmer profile
	 */
	@Override
	public FarmerProfile create(long farmerProfileId) {
		FarmerProfile farmerProfile = new FarmerProfileImpl();

		farmerProfile.setNew(true);
		farmerProfile.setPrimaryKey(farmerProfileId);

		farmerProfile.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerProfile;
	}

	/**
	 * Removes the farmer profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile that was removed
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	@Override
	public FarmerProfile remove(long farmerProfileId)
		throws NoSuchFarmerProfileException {

		return remove((Serializable)farmerProfileId);
	}

	/**
	 * Removes the farmer profile with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer profile
	 * @return the farmer profile that was removed
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	@Override
	public FarmerProfile remove(Serializable primaryKey)
		throws NoSuchFarmerProfileException {

		Session session = null;

		try {
			session = openSession();

			FarmerProfile farmerProfile = (FarmerProfile)session.get(
				FarmerProfileImpl.class, primaryKey);

			if (farmerProfile == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerProfileException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerProfile);
		}
		catch (NoSuchFarmerProfileException noSuchEntityException) {
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
	protected FarmerProfile removeImpl(FarmerProfile farmerProfile) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerProfile)) {
				farmerProfile = (FarmerProfile)session.get(
					FarmerProfileImpl.class, farmerProfile.getPrimaryKeyObj());
			}

			if (farmerProfile != null) {
				session.delete(farmerProfile);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerProfile != null) {
			clearCache(farmerProfile);
		}

		return farmerProfile;
	}

	@Override
	public FarmerProfile updateImpl(FarmerProfile farmerProfile) {
		boolean isNew = farmerProfile.isNew();

		if (!(farmerProfile instanceof FarmerProfileModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerProfile.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerProfile);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerProfile proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerProfile implementation " +
					farmerProfile.getClass());
		}

		FarmerProfileModelImpl farmerProfileModelImpl =
			(FarmerProfileModelImpl)farmerProfile;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerProfile.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerProfile.setCreateDate(date);
			}
			else {
				farmerProfile.setCreateDate(serviceContext.getCreateDate(date));
			}
		}

		if (!farmerProfileModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerProfile.setModifiedDate(date);
			}
			else {
				farmerProfile.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerProfile);
			}
			else {
				farmerProfile = (FarmerProfile)session.merge(farmerProfile);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerProfileImpl.class, farmerProfileModelImpl, false, true);

		cacheUniqueFindersCache(farmerProfileModelImpl);

		if (isNew) {
			farmerProfile.setNew(false);
		}

		farmerProfile.resetOriginalValues();

		return farmerProfile;
	}

	/**
	 * Returns the farmer profile with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer profile
	 * @return the farmer profile
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	@Override
	public FarmerProfile findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerProfileException {

		FarmerProfile farmerProfile = fetchByPrimaryKey(primaryKey);

		if (farmerProfile == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerProfileException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerProfile;
	}

	/**
	 * Returns the farmer profile with the primary key or throws a <code>NoSuchFarmerProfileException</code> if it could not be found.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile
	 * @throws NoSuchFarmerProfileException if a farmer profile with the primary key could not be found
	 */
	@Override
	public FarmerProfile findByPrimaryKey(long farmerProfileId)
		throws NoSuchFarmerProfileException {

		return findByPrimaryKey((Serializable)farmerProfileId);
	}

	/**
	 * Returns the farmer profile with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerProfileId the primary key of the farmer profile
	 * @return the farmer profile, or <code>null</code> if a farmer profile with the primary key could not be found
	 */
	@Override
	public FarmerProfile fetchByPrimaryKey(long farmerProfileId) {
		return fetchByPrimaryKey((Serializable)farmerProfileId);
	}

	/**
	 * Returns all the farmer profiles.
	 *
	 * @return the farmer profiles
	 */
	@Override
	public List<FarmerProfile> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @return the range of farmer profiles
	 */
	@Override
	public List<FarmerProfile> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer profiles
	 */
	@Override
	public List<FarmerProfile> findAll(
		int start, int end,
		OrderByComparator<FarmerProfile> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer profiles.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerProfileModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer profiles
	 * @param end the upper bound of the range of farmer profiles (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer profiles
	 */
	@Override
	public List<FarmerProfile> findAll(
		int start, int end, OrderByComparator<FarmerProfile> orderByComparator,
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

		List<FarmerProfile> list = null;

		if (useFinderCache) {
			list = (List<FarmerProfile>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERPROFILE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERPROFILE;

				sql = sql.concat(FarmerProfileModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerProfile>)QueryUtil.list(
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
	 * Removes all the farmer profiles from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerProfile farmerProfile : findAll()) {
			remove(farmerProfile);
		}
	}

	/**
	 * Returns the number of farmer profiles.
	 *
	 * @return the number of farmer profiles
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FARMERPROFILE);

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
		return "farmerProfileId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERPROFILE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerProfileModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer profile persistence.
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

		_finderPathWithPaginationFindBygetFA_FP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFA_FP_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmerApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFA_FP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFA_FP_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFA_FP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_FP_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmerProfileUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerProfileUtilPersistence(null);

		entityCache.removeCache(FarmerProfileImpl.class.getName());
	}

	private void _setFarmerProfileUtilPersistence(
		FarmerProfilePersistence farmerProfilePersistence) {

		try {
			Field field = FarmerProfileUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerProfilePersistence);
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

	private static final String _SQL_SELECT_FARMERPROFILE =
		"SELECT farmerProfile FROM FarmerProfile farmerProfile";

	private static final String _SQL_SELECT_FARMERPROFILE_WHERE =
		"SELECT farmerProfile FROM FarmerProfile farmerProfile WHERE ";

	private static final String _SQL_COUNT_FARMERPROFILE =
		"SELECT COUNT(farmerProfile) FROM FarmerProfile farmerProfile";

	private static final String _SQL_COUNT_FARMERPROFILE_WHERE =
		"SELECT COUNT(farmerProfile) FROM FarmerProfile farmerProfile WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmerProfile.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerProfile exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerProfile exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerProfilePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerProfileModelArgumentsResolver
		_farmerProfileModelArgumentsResolver;

}