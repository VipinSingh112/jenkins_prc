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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerlivestockPracticeException;
import com.nbp.farm.application.form.service.model.FarmerlivestockPractice;
import com.nbp.farm.application.form.service.model.FarmerlivestockPracticeTable;
import com.nbp.farm.application.form.service.model.impl.FarmerlivestockPracticeImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerlivestockPracticeModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerlivestockPracticePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerlivestockPracticeUtil;
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
 * The persistence implementation for the farmerlivestock practice service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {FarmerlivestockPracticePersistence.class, BasePersistence.class}
)
public class FarmerlivestockPracticePersistenceImpl
	extends BasePersistenceImpl<FarmerlivestockPractice>
	implements FarmerlivestockPracticePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerlivestockPracticeUtil</code> to access the farmerlivestock practice persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerlivestockPracticeImpl.class.getName();

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
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerlivestockPracticeException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	@Override
	public FarmerlivestockPractice findBygetfarmerById(long farmerApplicationId)
		throws NoSuchFarmerlivestockPracticeException {

		FarmerlivestockPractice farmerlivestockPractice = fetchBygetfarmerById(
			farmerApplicationId);

		if (farmerlivestockPractice == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerlivestockPracticeException(sb.toString());
		}

		return farmerlivestockPractice;
	}

	/**
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	@Override
	public FarmerlivestockPractice fetchBygetfarmerById(
		long farmerApplicationId) {

		return fetchBygetfarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmerlivestock practice where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	@Override
	public FarmerlivestockPractice fetchBygetfarmerById(
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

		if (result instanceof FarmerlivestockPractice) {
			FarmerlivestockPractice farmerlivestockPractice =
				(FarmerlivestockPractice)result;

			if (farmerApplicationId !=
					farmerlivestockPractice.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERLIVESTOCKPRACTICE_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerlivestockPractice> list = query.list();

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
								"FarmerlivestockPracticePersistenceImpl.fetchBygetfarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerlivestockPractice farmerlivestockPractice = list.get(
						0);

					result = farmerlivestockPractice;

					cacheResult(farmerlivestockPractice);
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
			return (FarmerlivestockPractice)result;
		}
	}

	/**
	 * Removes the farmerlivestock practice where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmerlivestock practice that was removed
	 */
	@Override
	public FarmerlivestockPractice removeBygetfarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerlivestockPracticeException {

		FarmerlivestockPractice farmerlivestockPractice = findBygetfarmerById(
			farmerApplicationId);

		return remove(farmerlivestockPractice);
	}

	/**
	 * Returns the number of farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmerlivestock practices
	 */
	@Override
	public int countBygetfarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetfarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERLIVESTOCKPRACTICE_WHERE);

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
			"farmerlivestockPractice.farmerApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFA_FLSP_FAI;
	private FinderPath _finderPathWithoutPaginationFindBygetFA_FLSP_FAI;
	private FinderPath _finderPathCountBygetFA_FLSP_FAI;

	/**
	 * Returns all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmerlivestock practices
	 */
	@Override
	public List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId) {

		return findBygetFA_FLSP_FAI(
			farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @return the range of matching farmerlivestock practices
	 */
	@Override
	public List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end) {

		return findBygetFA_FLSP_FAI(farmerApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmerlivestock practices
	 */
	@Override
	public List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		return findBygetFA_FLSP_FAI(
			farmerApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmerlivestock practices
	 */
	@Override
	public List<FarmerlivestockPractice> findBygetFA_FLSP_FAI(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFA_FLSP_FAI;
				finderArgs = new Object[] {farmerApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFA_FLSP_FAI;
			finderArgs = new Object[] {
				farmerApplicationId, start, end, orderByComparator
			};
		}

		List<FarmerlivestockPractice> list = null;

		if (useFinderCache) {
			list = (List<FarmerlivestockPractice>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerlivestockPractice farmerlivestockPractice : list) {
					if (farmerApplicationId !=
							farmerlivestockPractice.getFarmerApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMERLIVESTOCKPRACTICE_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FLSP_FAI_FARMERAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerlivestockPracticeModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				list = (List<FarmerlivestockPractice>)QueryUtil.list(
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
	 * Returns the first farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	@Override
	public FarmerlivestockPractice findBygetFA_FLSP_FAI_First(
			long farmerApplicationId,
			OrderByComparator<FarmerlivestockPractice> orderByComparator)
		throws NoSuchFarmerlivestockPracticeException {

		FarmerlivestockPractice farmerlivestockPractice =
			fetchBygetFA_FLSP_FAI_First(farmerApplicationId, orderByComparator);

		if (farmerlivestockPractice != null) {
			return farmerlivestockPractice;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerlivestockPracticeException(sb.toString());
	}

	/**
	 * Returns the first farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	@Override
	public FarmerlivestockPractice fetchBygetFA_FLSP_FAI_First(
		long farmerApplicationId,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		List<FarmerlivestockPractice> list = findBygetFA_FLSP_FAI(
			farmerApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a matching farmerlivestock practice could not be found
	 */
	@Override
	public FarmerlivestockPractice findBygetFA_FLSP_FAI_Last(
			long farmerApplicationId,
			OrderByComparator<FarmerlivestockPractice> orderByComparator)
		throws NoSuchFarmerlivestockPracticeException {

		FarmerlivestockPractice farmerlivestockPractice =
			fetchBygetFA_FLSP_FAI_Last(farmerApplicationId, orderByComparator);

		if (farmerlivestockPractice != null) {
			return farmerlivestockPractice;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmerlivestockPracticeException(sb.toString());
	}

	/**
	 * Returns the last farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmerlivestock practice, or <code>null</code> if a matching farmerlivestock practice could not be found
	 */
	@Override
	public FarmerlivestockPractice fetchBygetFA_FLSP_FAI_Last(
		long farmerApplicationId,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		int count = countBygetFA_FLSP_FAI(farmerApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmerlivestockPractice> list = findBygetFA_FLSP_FAI(
			farmerApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmerlivestock practices before and after the current farmerlivestock practice in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerLivestockPracticeId the primary key of the current farmerlivestock practice
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	@Override
	public FarmerlivestockPractice[] findBygetFA_FLSP_FAI_PrevAndNext(
			long farmerLivestockPracticeId, long farmerApplicationId,
			OrderByComparator<FarmerlivestockPractice> orderByComparator)
		throws NoSuchFarmerlivestockPracticeException {

		FarmerlivestockPractice farmerlivestockPractice = findByPrimaryKey(
			farmerLivestockPracticeId);

		Session session = null;

		try {
			session = openSession();

			FarmerlivestockPractice[] array =
				new FarmerlivestockPracticeImpl[3];

			array[0] = getBygetFA_FLSP_FAI_PrevAndNext(
				session, farmerlivestockPractice, farmerApplicationId,
				orderByComparator, true);

			array[1] = farmerlivestockPractice;

			array[2] = getBygetFA_FLSP_FAI_PrevAndNext(
				session, farmerlivestockPractice, farmerApplicationId,
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

	protected FarmerlivestockPractice getBygetFA_FLSP_FAI_PrevAndNext(
		Session session, FarmerlivestockPractice farmerlivestockPractice,
		long farmerApplicationId,
		OrderByComparator<FarmerlivestockPractice> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERLIVESTOCKPRACTICE_WHERE);

		sb.append(_FINDER_COLUMN_GETFA_FLSP_FAI_FARMERAPPLICATIONID_2);

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
			sb.append(FarmerlivestockPracticeModelImpl.ORDER_BY_JPQL);
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
						farmerlivestockPractice)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerlivestockPractice> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmerlivestock practices where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	@Override
	public void removeBygetFA_FLSP_FAI(long farmerApplicationId) {
		for (FarmerlivestockPractice farmerlivestockPractice :
				findBygetFA_FLSP_FAI(
					farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerlivestockPractice);
		}
	}

	/**
	 * Returns the number of farmerlivestock practices where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmerlivestock practices
	 */
	@Override
	public int countBygetFA_FLSP_FAI(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFA_FLSP_FAI;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERLIVESTOCKPRACTICE_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_FLSP_FAI_FARMERAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETFA_FLSP_FAI_FARMERAPPLICATIONID_2 =
			"farmerlivestockPractice.farmerApplicationId = ?";

	public FarmerlivestockPracticePersistenceImpl() {
		setModelClass(FarmerlivestockPractice.class);

		setModelImplClass(FarmerlivestockPracticeImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerlivestockPracticeTable.INSTANCE);
	}

	/**
	 * Caches the farmerlivestock practice in the entity cache if it is enabled.
	 *
	 * @param farmerlivestockPractice the farmerlivestock practice
	 */
	@Override
	public void cacheResult(FarmerlivestockPractice farmerlivestockPractice) {
		entityCache.putResult(
			FarmerlivestockPracticeImpl.class,
			farmerlivestockPractice.getPrimaryKey(), farmerlivestockPractice);

		finderCache.putResult(
			_finderPathFetchBygetfarmerById,
			new Object[] {farmerlivestockPractice.getFarmerApplicationId()},
			farmerlivestockPractice);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmerlivestock practices in the entity cache if it is enabled.
	 *
	 * @param farmerlivestockPractices the farmerlivestock practices
	 */
	@Override
	public void cacheResult(
		List<FarmerlivestockPractice> farmerlivestockPractices) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerlivestockPractices.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerlivestockPractice farmerlivestockPractice :
				farmerlivestockPractices) {

			if (entityCache.getResult(
					FarmerlivestockPracticeImpl.class,
					farmerlivestockPractice.getPrimaryKey()) == null) {

				cacheResult(farmerlivestockPractice);
			}
		}
	}

	/**
	 * Clears the cache for all farmerlivestock practices.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerlivestockPracticeImpl.class);

		finderCache.clearCache(FarmerlivestockPracticeImpl.class);
	}

	/**
	 * Clears the cache for the farmerlivestock practice.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerlivestockPractice farmerlivestockPractice) {
		entityCache.removeResult(
			FarmerlivestockPracticeImpl.class, farmerlivestockPractice);
	}

	@Override
	public void clearCache(
		List<FarmerlivestockPractice> farmerlivestockPractices) {

		for (FarmerlivestockPractice farmerlivestockPractice :
				farmerlivestockPractices) {

			entityCache.removeResult(
				FarmerlivestockPracticeImpl.class, farmerlivestockPractice);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerlivestockPracticeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FarmerlivestockPracticeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerlivestockPracticeModelImpl farmerlivestockPracticeModelImpl) {

		Object[] args = new Object[] {
			farmerlivestockPracticeModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetfarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetfarmerById, args,
			farmerlivestockPracticeModelImpl);
	}

	/**
	 * Creates a new farmerlivestock practice with the primary key. Does not add the farmerlivestock practice to the database.
	 *
	 * @param farmerLivestockPracticeId the primary key for the new farmerlivestock practice
	 * @return the new farmerlivestock practice
	 */
	@Override
	public FarmerlivestockPractice create(long farmerLivestockPracticeId) {
		FarmerlivestockPractice farmerlivestockPractice =
			new FarmerlivestockPracticeImpl();

		farmerlivestockPractice.setNew(true);
		farmerlivestockPractice.setPrimaryKey(farmerLivestockPracticeId);

		farmerlivestockPractice.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmerlivestockPractice;
	}

	/**
	 * Removes the farmerlivestock practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice that was removed
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	@Override
	public FarmerlivestockPractice remove(long farmerLivestockPracticeId)
		throws NoSuchFarmerlivestockPracticeException {

		return remove((Serializable)farmerLivestockPracticeId);
	}

	/**
	 * Removes the farmerlivestock practice with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice that was removed
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	@Override
	public FarmerlivestockPractice remove(Serializable primaryKey)
		throws NoSuchFarmerlivestockPracticeException {

		Session session = null;

		try {
			session = openSession();

			FarmerlivestockPractice farmerlivestockPractice =
				(FarmerlivestockPractice)session.get(
					FarmerlivestockPracticeImpl.class, primaryKey);

			if (farmerlivestockPractice == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerlivestockPracticeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerlivestockPractice);
		}
		catch (NoSuchFarmerlivestockPracticeException noSuchEntityException) {
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
	protected FarmerlivestockPractice removeImpl(
		FarmerlivestockPractice farmerlivestockPractice) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerlivestockPractice)) {
				farmerlivestockPractice = (FarmerlivestockPractice)session.get(
					FarmerlivestockPracticeImpl.class,
					farmerlivestockPractice.getPrimaryKeyObj());
			}

			if (farmerlivestockPractice != null) {
				session.delete(farmerlivestockPractice);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerlivestockPractice != null) {
			clearCache(farmerlivestockPractice);
		}

		return farmerlivestockPractice;
	}

	@Override
	public FarmerlivestockPractice updateImpl(
		FarmerlivestockPractice farmerlivestockPractice) {

		boolean isNew = farmerlivestockPractice.isNew();

		if (!(farmerlivestockPractice instanceof
				FarmerlivestockPracticeModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerlivestockPractice.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerlivestockPractice);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerlivestockPractice proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerlivestockPractice implementation " +
					farmerlivestockPractice.getClass());
		}

		FarmerlivestockPracticeModelImpl farmerlivestockPracticeModelImpl =
			(FarmerlivestockPracticeModelImpl)farmerlivestockPractice;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerlivestockPractice.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerlivestockPractice.setCreateDate(date);
			}
			else {
				farmerlivestockPractice.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerlivestockPracticeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerlivestockPractice.setModifiedDate(date);
			}
			else {
				farmerlivestockPractice.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerlivestockPractice);
			}
			else {
				farmerlivestockPractice =
					(FarmerlivestockPractice)session.merge(
						farmerlivestockPractice);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerlivestockPracticeImpl.class, farmerlivestockPracticeModelImpl,
			false, true);

		cacheUniqueFindersCache(farmerlivestockPracticeModelImpl);

		if (isNew) {
			farmerlivestockPractice.setNew(false);
		}

		farmerlivestockPractice.resetOriginalValues();

		return farmerlivestockPractice;
	}

	/**
	 * Returns the farmerlivestock practice with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	@Override
	public FarmerlivestockPractice findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerlivestockPracticeException {

		FarmerlivestockPractice farmerlivestockPractice = fetchByPrimaryKey(
			primaryKey);

		if (farmerlivestockPractice == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerlivestockPracticeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerlivestockPractice;
	}

	/**
	 * Returns the farmerlivestock practice with the primary key or throws a <code>NoSuchFarmerlivestockPracticeException</code> if it could not be found.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice
	 * @throws NoSuchFarmerlivestockPracticeException if a farmerlivestock practice with the primary key could not be found
	 */
	@Override
	public FarmerlivestockPractice findByPrimaryKey(
			long farmerLivestockPracticeId)
		throws NoSuchFarmerlivestockPracticeException {

		return findByPrimaryKey((Serializable)farmerLivestockPracticeId);
	}

	/**
	 * Returns the farmerlivestock practice with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerLivestockPracticeId the primary key of the farmerlivestock practice
	 * @return the farmerlivestock practice, or <code>null</code> if a farmerlivestock practice with the primary key could not be found
	 */
	@Override
	public FarmerlivestockPractice fetchByPrimaryKey(
		long farmerLivestockPracticeId) {

		return fetchByPrimaryKey((Serializable)farmerLivestockPracticeId);
	}

	/**
	 * Returns all the farmerlivestock practices.
	 *
	 * @return the farmerlivestock practices
	 */
	@Override
	public List<FarmerlivestockPractice> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @return the range of farmerlivestock practices
	 */
	@Override
	public List<FarmerlivestockPractice> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmerlivestock practices
	 */
	@Override
	public List<FarmerlivestockPractice> findAll(
		int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmerlivestock practices.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerlivestockPracticeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmerlivestock practices
	 * @param end the upper bound of the range of farmerlivestock practices (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmerlivestock practices
	 */
	@Override
	public List<FarmerlivestockPractice> findAll(
		int start, int end,
		OrderByComparator<FarmerlivestockPractice> orderByComparator,
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

		List<FarmerlivestockPractice> list = null;

		if (useFinderCache) {
			list = (List<FarmerlivestockPractice>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERLIVESTOCKPRACTICE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERLIVESTOCKPRACTICE;

				sql = sql.concat(
					FarmerlivestockPracticeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerlivestockPractice>)QueryUtil.list(
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
	 * Removes all the farmerlivestock practices from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerlivestockPractice farmerlivestockPractice : findAll()) {
			remove(farmerlivestockPractice);
		}
	}

	/**
	 * Returns the number of farmerlivestock practices.
	 *
	 * @return the number of farmerlivestock practices
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
					_SQL_COUNT_FARMERLIVESTOCKPRACTICE);

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
		return "farmerLivestockPracticeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERLIVESTOCKPRACTICE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerlivestockPracticeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmerlivestock practice persistence.
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

		_finderPathWithPaginationFindBygetFA_FLSP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFA_FLSP_FAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmerApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFA_FLSP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFA_FLSP_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFA_FLSP_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_FLSP_FAI",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmerlivestockPracticeUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerlivestockPracticeUtilPersistence(null);

		entityCache.removeCache(FarmerlivestockPracticeImpl.class.getName());
	}

	private void _setFarmerlivestockPracticeUtilPersistence(
		FarmerlivestockPracticePersistence farmerlivestockPracticePersistence) {

		try {
			Field field = FarmerlivestockPracticeUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerlivestockPracticePersistence);
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

	private static final String _SQL_SELECT_FARMERLIVESTOCKPRACTICE =
		"SELECT farmerlivestockPractice FROM FarmerlivestockPractice farmerlivestockPractice";

	private static final String _SQL_SELECT_FARMERLIVESTOCKPRACTICE_WHERE =
		"SELECT farmerlivestockPractice FROM FarmerlivestockPractice farmerlivestockPractice WHERE ";

	private static final String _SQL_COUNT_FARMERLIVESTOCKPRACTICE =
		"SELECT COUNT(farmerlivestockPractice) FROM FarmerlivestockPractice farmerlivestockPractice";

	private static final String _SQL_COUNT_FARMERLIVESTOCKPRACTICE_WHERE =
		"SELECT COUNT(farmerlivestockPractice) FROM FarmerlivestockPractice farmerlivestockPractice WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"farmerlivestockPractice.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerlivestockPractice exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerlivestockPractice exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerlivestockPracticePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerlivestockPracticeModelArgumentsResolver
		_farmerlivestockPracticeModelArgumentsResolver;

}