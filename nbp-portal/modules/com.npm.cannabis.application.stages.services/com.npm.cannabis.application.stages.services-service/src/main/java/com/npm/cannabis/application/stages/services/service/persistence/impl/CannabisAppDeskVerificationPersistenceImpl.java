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

package com.npm.cannabis.application.stages.services.service.persistence.impl;

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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisAppDeskVerificationException;
import com.npm.cannabis.application.stages.services.model.CannabisAppDeskVerification;
import com.npm.cannabis.application.stages.services.model.CannabisAppDeskVerificationTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisAppDeskVerificationImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisAppDeskVerificationModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisAppDeskVerificationPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisAppDeskVerificationUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the cannabis app desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {
		CannabisAppDeskVerificationPersistence.class, BasePersistence.class
	}
)
public class CannabisAppDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<CannabisAppDeskVerification>
	implements CannabisAppDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisAppDeskVerificationUtil</code> to access the cannabis app desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisAppDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCannabisDV_ById;
	private FinderPath _finderPathWithoutPaginationFindBygetCannabisDV_ById;
	private FinderPath _finderPathCountBygetCannabisDV_ById;

	/**
	 * Returns all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId) {

		return findBygetCannabisDV_ById(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @return the range of matching cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end) {

		return findBygetCannabisDV_ById(
			cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		return findBygetCannabisDV_ById(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> findBygetCannabisDV_ById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCannabisDV_ById;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCannabisDV_ById;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisAppDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<CannabisAppDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisAppDeskVerification cannabisAppDeskVerification :
						list) {

					if (cannabisApplicationId !=
							cannabisAppDeskVerification.
								getCannabisApplicationId()) {

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

			sb.append(_SQL_SELECT_CANNABISAPPDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISDV_BYID_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisAppDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisAppDeskVerification>)QueryUtil.list(
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
	 * Returns the first cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a matching cannabis app desk verification could not be found
	 */
	@Override
	public CannabisAppDeskVerification findBygetCannabisDV_ById_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisAppDeskVerification> orderByComparator)
		throws NoSuchCannabisAppDeskVerificationException {

		CannabisAppDeskVerification cannabisAppDeskVerification =
			fetchBygetCannabisDV_ById_First(
				cannabisApplicationId, orderByComparator);

		if (cannabisAppDeskVerification != null) {
			return cannabisAppDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisAppDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis app desk verification, or <code>null</code> if a matching cannabis app desk verification could not be found
	 */
	@Override
	public CannabisAppDeskVerification fetchBygetCannabisDV_ById_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		List<CannabisAppDeskVerification> list = findBygetCannabisDV_ById(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a matching cannabis app desk verification could not be found
	 */
	@Override
	public CannabisAppDeskVerification findBygetCannabisDV_ById_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisAppDeskVerification> orderByComparator)
		throws NoSuchCannabisAppDeskVerificationException {

		CannabisAppDeskVerification cannabisAppDeskVerification =
			fetchBygetCannabisDV_ById_Last(
				cannabisApplicationId, orderByComparator);

		if (cannabisAppDeskVerification != null) {
			return cannabisAppDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisAppDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis app desk verification, or <code>null</code> if a matching cannabis app desk verification could not be found
	 */
	@Override
	public CannabisAppDeskVerification fetchBygetCannabisDV_ById_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		int count = countBygetCannabisDV_ById(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisAppDeskVerification> list = findBygetCannabisDV_ById(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis app desk verifications before and after the current cannabis app desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVerificationId the primary key of the current cannabis app desk verification
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public CannabisAppDeskVerification[] findBygetCannabisDV_ById_PrevAndNext(
			long cannabisDeskVerificationId, long cannabisApplicationId,
			OrderByComparator<CannabisAppDeskVerification> orderByComparator)
		throws NoSuchCannabisAppDeskVerificationException {

		CannabisAppDeskVerification cannabisAppDeskVerification =
			findByPrimaryKey(cannabisDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			CannabisAppDeskVerification[] array =
				new CannabisAppDeskVerificationImpl[3];

			array[0] = getBygetCannabisDV_ById_PrevAndNext(
				session, cannabisAppDeskVerification, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisAppDeskVerification;

			array[2] = getBygetCannabisDV_ById_PrevAndNext(
				session, cannabisAppDeskVerification, cannabisApplicationId,
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

	protected CannabisAppDeskVerification getBygetCannabisDV_ById_PrevAndNext(
		Session session,
		CannabisAppDeskVerification cannabisAppDeskVerification,
		long cannabisApplicationId,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPDESKVERIFICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETCANNABISDV_BYID_CANNABISAPPLICATIONID_2);

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
			sb.append(CannabisAppDeskVerificationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisAppDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisAppDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis app desk verifications where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCannabisDV_ById(long cannabisApplicationId) {
		for (CannabisAppDeskVerification cannabisAppDeskVerification :
				findBygetCannabisDV_ById(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisAppDeskVerification);
		}
	}

	/**
	 * Returns the number of cannabis app desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis app desk verifications
	 */
	@Override
	public int countBygetCannabisDV_ById(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCannabisDV_ById;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISDV_BYID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

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
		_FINDER_COLUMN_GETCANNABISDV_BYID_CANNABISAPPLICATIONID_2 =
			"cannabisAppDeskVerification.cannabisApplicationId = ?";

	public CannabisAppDeskVerificationPersistenceImpl() {
		setModelClass(CannabisAppDeskVerification.class);

		setModelImplClass(CannabisAppDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisAppDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the cannabis app desk verification in the entity cache if it is enabled.
	 *
	 * @param cannabisAppDeskVerification the cannabis app desk verification
	 */
	@Override
	public void cacheResult(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		entityCache.putResult(
			CannabisAppDeskVerificationImpl.class,
			cannabisAppDeskVerification.getPrimaryKey(),
			cannabisAppDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis app desk verifications in the entity cache if it is enabled.
	 *
	 * @param cannabisAppDeskVerifications the cannabis app desk verifications
	 */
	@Override
	public void cacheResult(
		List<CannabisAppDeskVerification> cannabisAppDeskVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisAppDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisAppDeskVerification cannabisAppDeskVerification :
				cannabisAppDeskVerifications) {

			if (entityCache.getResult(
					CannabisAppDeskVerificationImpl.class,
					cannabisAppDeskVerification.getPrimaryKey()) == null) {

				cacheResult(cannabisAppDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis app desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisAppDeskVerificationImpl.class);

		finderCache.clearCache(CannabisAppDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the cannabis app desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		entityCache.removeResult(
			CannabisAppDeskVerificationImpl.class, cannabisAppDeskVerification);
	}

	@Override
	public void clearCache(
		List<CannabisAppDeskVerification> cannabisAppDeskVerifications) {

		for (CannabisAppDeskVerification cannabisAppDeskVerification :
				cannabisAppDeskVerifications) {

			entityCache.removeResult(
				CannabisAppDeskVerificationImpl.class,
				cannabisAppDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisAppDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisAppDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cannabis app desk verification with the primary key. Does not add the cannabis app desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis app desk verification
	 * @return the new cannabis app desk verification
	 */
	@Override
	public CannabisAppDeskVerification create(long cannabisDeskVerificationId) {
		CannabisAppDeskVerification cannabisAppDeskVerification =
			new CannabisAppDeskVerificationImpl();

		cannabisAppDeskVerification.setNew(true);
		cannabisAppDeskVerification.setPrimaryKey(cannabisDeskVerificationId);

		cannabisAppDeskVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisAppDeskVerification;
	}

	/**
	 * Removes the cannabis app desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification that was removed
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public CannabisAppDeskVerification remove(long cannabisDeskVerificationId)
		throws NoSuchCannabisAppDeskVerificationException {

		return remove((Serializable)cannabisDeskVerificationId);
	}

	/**
	 * Removes the cannabis app desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification that was removed
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public CannabisAppDeskVerification remove(Serializable primaryKey)
		throws NoSuchCannabisAppDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			CannabisAppDeskVerification cannabisAppDeskVerification =
				(CannabisAppDeskVerification)session.get(
					CannabisAppDeskVerificationImpl.class, primaryKey);

			if (cannabisAppDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisAppDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisAppDeskVerification);
		}
		catch (NoSuchCannabisAppDeskVerificationException
					noSuchEntityException) {

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
	protected CannabisAppDeskVerification removeImpl(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisAppDeskVerification)) {
				cannabisAppDeskVerification =
					(CannabisAppDeskVerification)session.get(
						CannabisAppDeskVerificationImpl.class,
						cannabisAppDeskVerification.getPrimaryKeyObj());
			}

			if (cannabisAppDeskVerification != null) {
				session.delete(cannabisAppDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisAppDeskVerification != null) {
			clearCache(cannabisAppDeskVerification);
		}

		return cannabisAppDeskVerification;
	}

	@Override
	public CannabisAppDeskVerification updateImpl(
		CannabisAppDeskVerification cannabisAppDeskVerification) {

		boolean isNew = cannabisAppDeskVerification.isNew();

		if (!(cannabisAppDeskVerification instanceof
				CannabisAppDeskVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisAppDeskVerification.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisAppDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisAppDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisAppDeskVerification implementation " +
					cannabisAppDeskVerification.getClass());
		}

		CannabisAppDeskVerificationModelImpl
			cannabisAppDeskVerificationModelImpl =
				(CannabisAppDeskVerificationModelImpl)
					cannabisAppDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisAppDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisAppDeskVerification.setCreateDate(date);
			}
			else {
				cannabisAppDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisAppDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisAppDeskVerification.setModifiedDate(date);
			}
			else {
				cannabisAppDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisAppDeskVerification);
			}
			else {
				cannabisAppDeskVerification =
					(CannabisAppDeskVerification)session.merge(
						cannabisAppDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisAppDeskVerificationImpl.class,
			cannabisAppDeskVerificationModelImpl, false, true);

		if (isNew) {
			cannabisAppDeskVerification.setNew(false);
		}

		cannabisAppDeskVerification.resetOriginalValues();

		return cannabisAppDeskVerification;
	}

	/**
	 * Returns the cannabis app desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public CannabisAppDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisAppDeskVerificationException {

		CannabisAppDeskVerification cannabisAppDeskVerification =
			fetchByPrimaryKey(primaryKey);

		if (cannabisAppDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisAppDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisAppDeskVerification;
	}

	/**
	 * Returns the cannabis app desk verification with the primary key or throws a <code>NoSuchCannabisAppDeskVerificationException</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification
	 * @throws NoSuchCannabisAppDeskVerificationException if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public CannabisAppDeskVerification findByPrimaryKey(
			long cannabisDeskVerificationId)
		throws NoSuchCannabisAppDeskVerificationException {

		return findByPrimaryKey((Serializable)cannabisDeskVerificationId);
	}

	/**
	 * Returns the cannabis app desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis app desk verification
	 * @return the cannabis app desk verification, or <code>null</code> if a cannabis app desk verification with the primary key could not be found
	 */
	@Override
	public CannabisAppDeskVerification fetchByPrimaryKey(
		long cannabisDeskVerificationId) {

		return fetchByPrimaryKey((Serializable)cannabisDeskVerificationId);
	}

	/**
	 * Returns all the cannabis app desk verifications.
	 *
	 * @return the cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis app desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @return the range of cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis app desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis app desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisAppDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis app desk verifications
	 * @param end the upper bound of the range of cannabis app desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis app desk verifications
	 */
	@Override
	public List<CannabisAppDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CannabisAppDeskVerification> orderByComparator,
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

		List<CannabisAppDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<CannabisAppDeskVerification>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPDESKVERIFICATION;

				sql = sql.concat(
					CannabisAppDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisAppDeskVerification>)QueryUtil.list(
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
	 * Removes all the cannabis app desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisAppDeskVerification cannabisAppDeskVerification :
				findAll()) {

			remove(cannabisAppDeskVerification);
		}
	}

	/**
	 * Returns the number of cannabis app desk verifications.
	 *
	 * @return the number of cannabis app desk verifications
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
					_SQL_COUNT_CANNABISAPPDESKVERIFICATION);

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
		return "cannabisDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisAppDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis app desk verification persistence.
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

		_finderPathWithPaginationFindBygetCannabisDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCannabisDV_ById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCannabisDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetCannabisDV_ById", new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCannabisDV_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCannabisDV_ById", new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_setCannabisAppDeskVerificationUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setCannabisAppDeskVerificationUtilPersistence(null);

		entityCache.removeCache(
			CannabisAppDeskVerificationImpl.class.getName());
	}

	private void _setCannabisAppDeskVerificationUtilPersistence(
		CannabisAppDeskVerificationPersistence
			cannabisAppDeskVerificationPersistence) {

		try {
			Field field =
				CannabisAppDeskVerificationUtil.class.getDeclaredField(
					"_persistence");

			field.setAccessible(true);

			field.set(null, cannabisAppDeskVerificationPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABIS_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISAPPDESKVERIFICATION =
		"SELECT cannabisAppDeskVerification FROM CannabisAppDeskVerification cannabisAppDeskVerification";

	private static final String _SQL_SELECT_CANNABISAPPDESKVERIFICATION_WHERE =
		"SELECT cannabisAppDeskVerification FROM CannabisAppDeskVerification cannabisAppDeskVerification WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPDESKVERIFICATION =
		"SELECT COUNT(cannabisAppDeskVerification) FROM CannabisAppDeskVerification cannabisAppDeskVerification";

	private static final String _SQL_COUNT_CANNABISAPPDESKVERIFICATION_WHERE =
		"SELECT COUNT(cannabisAppDeskVerification) FROM CannabisAppDeskVerification cannabisAppDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisAppDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisAppDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisAppDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisAppDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private CannabisAppDeskVerificationModelArgumentsResolver
		_cannabisAppDeskVerificationModelArgumentsResolver;

}