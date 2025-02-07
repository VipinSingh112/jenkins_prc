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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerCropPracticeException;
import com.nbp.farm.application.form.service.model.FarmerCropPractice;
import com.nbp.farm.application.form.service.model.FarmerCropPracticeTable;
import com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerCropPracticeModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerCropPracticePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerCropPracticeUtil;
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
 * The persistence implementation for the farmer crop practice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {FarmerCropPracticePersistence.class, BasePersistence.class}
)
public class FarmerCropPracticePersistenceImpl
	extends BasePersistenceImpl<FarmerCropPractice>
	implements FarmerCropPracticePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerCropPracticeUtil</code> to access the farmer crop practice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerCropPracticeImpl.class.getName();

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
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerCropPracticeException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	@Override
	public FarmerCropPractice findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerCropPracticeException {

		FarmerCropPractice farmerCropPractice = fetchBygetfarmerById(
			farmerApplicationId);

		if (farmerCropPractice == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerCropPracticeException(sb.toString());
		}

		return farmerCropPractice;
	}

	/**
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	@Override
	public FarmerCropPractice fetchBygetfarmerById(long farmerApplicationId) {
		return fetchBygetfarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer crop practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	@Override
	public FarmerCropPractice fetchBygetfarmerById(
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

		if (result instanceof FarmerCropPractice) {
			FarmerCropPractice farmerCropPractice = (FarmerCropPractice)result;

			if (farmerApplicationId !=
					farmerCropPractice.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERCROPPRACTICE_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerCropPractice> list = query.list();

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
								"FarmerCropPracticePersistenceImpl.fetchBygetfarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerCropPractice farmerCropPractice = list.get(0);

					result = farmerCropPractice;

					cacheResult(farmerCropPractice);
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
			return (FarmerCropPractice)result;
		}
	}

	/**
	 * Removes the farmer crop practice where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer crop practice that was removed
	 */
	@Override
	public FarmerCropPractice removeBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerCropPracticeException {

		FarmerCropPractice farmerCropPractice = findBygetfarmerById(
			farmerApplicationId);

		return remove(farmerCropPractice);
	}

	/**
	 * Returns the number of farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crop practices
	 */
	@Override
	public int countBygetfarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetfarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERCROPPRACTICE_WHERE);

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
			"farmerCropPractice.farmerApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFA_FCP_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFA_FCP_FAI;
	private FinderPath _finderPathCountBygetFA_FCP_FAI;

	/**
	 * Returns all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer crop practices
	 */
	@Override
	public List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId) {

		return findBygetFA_FCP_FAI(
			farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @return the range of matching farmer crop practices
	 */
	@Override
	public List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end) {

		return findBygetFA_FCP_FAI(farmerApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer crop practices
	 */
	@Override
	public List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		return findBygetFA_FCP_FAI(
			farmerApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer crop practices
	 */
	@Override
	public List<FarmerCropPractice> findBygetFA_FCP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFA_FCP_FAI;
				finderArgs = new Object[] {farmerApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFA_FCP_FAI;
			finderArgs = new Object[] {
				farmerApplicationId, start, end, orderByComparator
			};
		}

		List<FarmerCropPractice> list = null;

		if (useFinderCache) {
			list = (List<FarmerCropPractice>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerCropPractice farmerCropPractice : list) {
					if (farmerApplicationId !=
							farmerCropPractice.getFarmerApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMERCROPPRACTICE_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FCP_FAI_FARMERAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerCropPracticeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				list = (List<FarmerCropPractice>)QueryUtil.list(
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
	 * Returns the first farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	@Override
	public FarmerCropPractice findBygetFA_FCP_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerCropPractice> orderByComparator)
		throws NoSuchFarmerCropPracticeException {

		FarmerCropPractice farmerCropPractice = fetchBygetFA_FCP_FAI_First(
			farmerApplicationId, orderByComparator);

		if (farmerCropPractice != null) {
			return farmerCropPractice;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerCropPracticeException(sb.toString());
	}

	/**
	 * Returns the first farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	@Override
	public FarmerCropPractice fetchBygetFA_FCP_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		List<FarmerCropPractice> list = findBygetFA_FCP_FAI(
			farmerApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a matching farmer crop practice could not be found
	 */
	@Override
	public FarmerCropPractice findBygetFA_FCP_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerCropPractice> orderByComparator)
		throws NoSuchFarmerCropPracticeException {

		FarmerCropPractice farmerCropPractice = fetchBygetFA_FCP_FAI_Last(
			farmerApplicationId, orderByComparator);

		if (farmerCropPractice != null) {
			return farmerCropPractice;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerCropPracticeException(sb.toString());
	}

	/**
	 * Returns the last farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer crop practice, or <code>null</code> if a matching farmer crop practice could not be found
	 */
	@Override
	public FarmerCropPractice fetchBygetFA_FCP_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		int count = countBygetFA_FCP_FAI(farmerApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmerCropPractice> list = findBygetFA_FCP_FAI(
			farmerApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer crop practices before and after the current farmer crop practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerCropPracticeId the primary key of the current farmer crop practice
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	@Override
	public FarmerCropPractice[] findBygetFA_FCP_FAI_PrevAndNext(
			long farmerCropPracticeId, long farmerApplicationId,
			OrderByComparator<FarmerCropPractice> orderByComparator)
		throws NoSuchFarmerCropPracticeException {

		FarmerCropPractice farmerCropPractice = findByPrimaryKey(
			farmerCropPracticeId);

		Session session = null;

		try {
			session = openSession();

			FarmerCropPractice[] array = new FarmerCropPracticeImpl[3];

			array[0] = getBygetFA_FCP_FAI_PrevAndNext(
				session, farmerCropPractice, farmerApplicationId,
				orderByComparator, true);

			array[1] = farmerCropPractice;

			array[2] = getBygetFA_FCP_FAI_PrevAndNext(
				session, farmerCropPractice, farmerApplicationId,
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

	protected FarmerCropPractice getBygetFA_FCP_FAI_PrevAndNext(
		Session session, FarmerCropPractice farmerCropPractice,
		long farmerApplicationId,
		OrderByComparator<FarmerCropPractice> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERCROPPRACTICE_WHERE);

		sb.append(_FINDER_COLUMN_GETFA_FCP_FAI_FARMERAPPLICATIONID_2);

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
			sb.append(FarmerCropPracticeModelImpl.ORDER_BY_JPQL);
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
						farmerCropPractice)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerCropPractice> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer crop practices where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	@Override
	public void removeBygetFA_FCP_FAI(long farmerApplicationId) {
		for (FarmerCropPractice farmerCropPractice :
				findBygetFA_FCP_FAI(
					farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerCropPractice);
		}
	}

	/**
	 * Returns the number of farmer crop practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer crop practices
	 */
	@Override
	public int countBygetFA_FCP_FAI(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFA_FCP_FAI;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERCROPPRACTICE_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FCP_FAI_FARMERAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETFA_FCP_FAI_FARMERAPPLICATIONID_2 =
			"farmerCropPractice.farmerApplicationId = ?";

	public FarmerCropPracticePersistenceImpl() {
		setModelClass(FarmerCropPractice.class);

		setModelImplClass(FarmerCropPracticeImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerCropPracticeTable.INSTANCE);
	}

	/**
	 * Caches the farmer crop practice in the entity cache if it is enabled.
	 *
	 * @param farmerCropPractice the farmer crop practice
	 */
	@Override
	public void cacheResult(FarmerCropPractice farmerCropPractice) {
		entityCache.putResult(
			FarmerCropPracticeImpl.class, farmerCropPractice.getPrimaryKey(),
			farmerCropPractice);

		finderCache.putResult(
			_finderPathFetchBygetfarmerById,
			new Object[] {farmerCropPractice.getFarmerApplicationId()},
			farmerCropPractice);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer crop practices in the entity cache if it is enabled.
	 *
	 * @param farmerCropPractices the farmer crop practices
	 */
	@Override
	public void cacheResult(List<FarmerCropPractice> farmerCropPractices) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerCropPractices.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerCropPractice farmerCropPractice : farmerCropPractices) {
			if (entityCache.getResult(
					FarmerCropPracticeImpl.class,
					farmerCropPractice.getPrimaryKey()) == null) {

				cacheResult(farmerCropPractice);
			}
		}
	}

	/**
	 * Clears the cache for all farmer crop practices.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerCropPracticeImpl.class);

		finderCache.clearCache(FarmerCropPracticeImpl.class);
	}

	/**
	 * Clears the cache for the farmer crop practice.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerCropPractice farmerCropPractice) {
		entityCache.removeResult(
			FarmerCropPracticeImpl.class, farmerCropPractice);
	}

	@Override
	public void clearCache(List<FarmerCropPractice> farmerCropPractices) {
		for (FarmerCropPractice farmerCropPractice : farmerCropPractices) {
			entityCache.removeResult(
				FarmerCropPracticeImpl.class, farmerCropPractice);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerCropPracticeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FarmerCropPracticeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerCropPracticeModelImpl farmerCropPracticeModelImpl) {

		Object[] args = new Object[] {
			farmerCropPracticeModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetfarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetfarmerById, args, farmerCropPracticeModelImpl);
	}

	/**
	 * Creates a new farmer crop practice with the primary key. Does not add the farmer crop practice to the database.
	 *
	 * @param farmerCropPracticeId the primary key for the new farmer crop practice
	 * @return the new farmer crop practice
	 */
	@Override
	public FarmerCropPractice create(long farmerCropPracticeId) {
		FarmerCropPractice farmerCropPractice = new FarmerCropPracticeImpl();

		farmerCropPractice.setNew(true);
		farmerCropPractice.setPrimaryKey(farmerCropPracticeId);

		farmerCropPractice.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerCropPractice;
	}

	/**
	 * Removes the farmer crop practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice that was removed
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	@Override
	public FarmerCropPractice remove(long farmerCropPracticeId)
		throws NoSuchFarmerCropPracticeException {

		return remove((Serializable)farmerCropPracticeId);
	}

	/**
	 * Removes the farmer crop practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer crop practice
	 * @return the farmer crop practice that was removed
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	@Override
	public FarmerCropPractice remove(Serializable primaryKey)
		throws NoSuchFarmerCropPracticeException {

		Session session = null;

		try {
			session = openSession();

			FarmerCropPractice farmerCropPractice =
				(FarmerCropPractice)session.get(
					FarmerCropPracticeImpl.class, primaryKey);

			if (farmerCropPractice == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerCropPracticeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerCropPractice);
		}
		catch (NoSuchFarmerCropPracticeException noSuchEntityException) {
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
	protected FarmerCropPractice removeImpl(
		FarmerCropPractice farmerCropPractice) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerCropPractice)) {
				farmerCropPractice = (FarmerCropPractice)session.get(
					FarmerCropPracticeImpl.class,
					farmerCropPractice.getPrimaryKeyObj());
			}

			if (farmerCropPractice != null) {
				session.delete(farmerCropPractice);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerCropPractice != null) {
			clearCache(farmerCropPractice);
		}

		return farmerCropPractice;
	}

	@Override
	public FarmerCropPractice updateImpl(
		FarmerCropPractice farmerCropPractice) {

		boolean isNew = farmerCropPractice.isNew();

		if (!(farmerCropPractice instanceof FarmerCropPracticeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerCropPractice.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerCropPractice);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerCropPractice proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerCropPractice implementation " +
					farmerCropPractice.getClass());
		}

		FarmerCropPracticeModelImpl farmerCropPracticeModelImpl =
			(FarmerCropPracticeModelImpl)farmerCropPractice;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerCropPractice.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerCropPractice.setCreateDate(date);
			}
			else {
				farmerCropPractice.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerCropPracticeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerCropPractice.setModifiedDate(date);
			}
			else {
				farmerCropPractice.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerCropPractice);
			}
			else {
				farmerCropPractice = (FarmerCropPractice)session.merge(
					farmerCropPractice);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerCropPracticeImpl.class, farmerCropPracticeModelImpl, false,
			true);

		cacheUniqueFindersCache(farmerCropPracticeModelImpl);

		if (isNew) {
			farmerCropPractice.setNew(false);
		}

		farmerCropPractice.resetOriginalValues();

		return farmerCropPractice;
	}

	/**
	 * Returns the farmer crop practice with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer crop practice
	 * @return the farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	@Override
	public FarmerCropPractice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerCropPracticeException {

		FarmerCropPractice farmerCropPractice = fetchByPrimaryKey(primaryKey);

		if (farmerCropPractice == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerCropPracticeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerCropPractice;
	}

	/**
	 * Returns the farmer crop practice with the primary key or throws a <code>NoSuchFarmerCropPracticeException</code> if it could not be found.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice
	 * @throws NoSuchFarmerCropPracticeException if a farmer crop practice with the primary key could not be found
	 */
	@Override
	public FarmerCropPractice findByPrimaryKey(long farmerCropPracticeId)
		throws NoSuchFarmerCropPracticeException {

		return findByPrimaryKey((Serializable)farmerCropPracticeId);
	}

	/**
	 * Returns the farmer crop practice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCropPracticeId the primary key of the farmer crop practice
	 * @return the farmer crop practice, or <code>null</code> if a farmer crop practice with the primary key could not be found
	 */
	@Override
	public FarmerCropPractice fetchByPrimaryKey(long farmerCropPracticeId) {
		return fetchByPrimaryKey((Serializable)farmerCropPracticeId);
	}

	/**
	 * Returns all the farmer crop practices.
	 *
	 * @return the farmer crop practices
	 */
	@Override
	public List<FarmerCropPractice> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @return the range of farmer crop practices
	 */
	@Override
	public List<FarmerCropPractice> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer crop practices
	 */
	@Override
	public List<FarmerCropPractice> findAll(
		int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer crop practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerCropPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer crop practices
	 * @param end the upper bound of the range of farmer crop practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer crop practices
	 */
	@Override
	public List<FarmerCropPractice> findAll(
		int start, int end,
		OrderByComparator<FarmerCropPractice> orderByComparator,
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

		List<FarmerCropPractice> list = null;

		if (useFinderCache) {
			list = (List<FarmerCropPractice>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERCROPPRACTICE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERCROPPRACTICE;

				sql = sql.concat(FarmerCropPracticeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerCropPractice>)QueryUtil.list(
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
	 * Removes all the farmer crop practices from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerCropPractice farmerCropPractice : findAll()) {
			remove(farmerCropPractice);
		}
	}

	/**
	 * Returns the number of farmer crop practices.
	 *
	 * @return the number of farmer crop practices
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FARMERCROPPRACTICE);

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
		return "farmerCropPracticeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERCROPPRACTICE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerCropPracticeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer crop practice persistence.
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

		_finderPathWithPaginationFindBygetFA_FCP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFA_FCP_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmerApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFA_FCP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFA_FCP_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFA_FCP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_FCP_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmerCropPracticeUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerCropPracticeUtilPersistence(null);

		entityCache.removeCache(FarmerCropPracticeImpl.class.getName());
	}

	private void _setFarmerCropPracticeUtilPersistence(
		FarmerCropPracticePersistence farmerCropPracticePersistence) {

		try {
			Field field = FarmerCropPracticeUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerCropPracticePersistence);
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

	private static final String _SQL_SELECT_FARMERCROPPRACTICE =
		"SELECT farmerCropPractice FROM FarmerCropPractice farmerCropPractice";

	private static final String _SQL_SELECT_FARMERCROPPRACTICE_WHERE =
		"SELECT farmerCropPractice FROM FarmerCropPractice farmerCropPractice WHERE ";

	private static final String _SQL_COUNT_FARMERCROPPRACTICE =
		"SELECT COUNT(farmerCropPractice) FROM FarmerCropPractice farmerCropPractice";

	private static final String _SQL_COUNT_FARMERCROPPRACTICE_WHERE =
		"SELECT COUNT(farmerCropPractice) FROM FarmerCropPractice farmerCropPractice WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "farmerCropPractice.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerCropPractice exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerCropPractice exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerCropPracticePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerCropPracticeModelArgumentsResolver
		_farmerCropPracticeModelArgumentsResolver;

}