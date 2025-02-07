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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisDeskVerificationException;
import com.npm.cannabis.application.stages.services.model.CannabisDeskVerification;
import com.npm.cannabis.application.stages.services.model.CannabisDeskVerificationTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisDeskVerificationImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisDeskVerificationModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisDeskVerificationPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisDeskVerificationUtil;
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
 * The persistence implementation for the cannabis desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {CannabisDeskVerificationPersistence.class, BasePersistence.class}
)
public class CannabisDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<CannabisDeskVerification>
	implements CannabisDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisDeskVerificationUtil</code> to access the cannabis desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationPharmaById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationPharmaById;
	private FinderPath _finderPathCountBygetDeskVerificationPharmaById;

	/**
	 * Returns all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis desk verifications
	 */
	@Override
	public List<CannabisDeskVerification> findBygetDeskVerificationPharmaById(
		long cannabisApplicationId) {

		return findBygetDeskVerificationPharmaById(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @return the range of matching cannabis desk verifications
	 */
	@Override
	public List<CannabisDeskVerification> findBygetDeskVerificationPharmaById(
		long cannabisApplicationId, int start, int end) {

		return findBygetDeskVerificationPharmaById(
			cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis desk verifications
	 */
	@Override
	public List<CannabisDeskVerification> findBygetDeskVerificationPharmaById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisDeskVerification> orderByComparator) {

		return findBygetDeskVerificationPharmaById(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis desk verifications
	 */
	@Override
	public List<CannabisDeskVerification> findBygetDeskVerificationPharmaById(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationPharmaById;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationPharmaById;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<CannabisDeskVerification>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisDeskVerification cannabisDeskVerification : list) {
					if (cannabisApplicationId !=
							cannabisDeskVerification.
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

			sb.append(_SQL_SELECT_CANNABISDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONPHARMABYID_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list = (List<CannabisDeskVerification>)QueryUtil.list(
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
	 * Returns the first cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a matching cannabis desk verification could not be found
	 */
	@Override
	public CannabisDeskVerification findBygetDeskVerificationPharmaById_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisDeskVerification> orderByComparator)
		throws NoSuchCannabisDeskVerificationException {

		CannabisDeskVerification cannabisDeskVerification =
			fetchBygetDeskVerificationPharmaById_First(
				cannabisApplicationId, orderByComparator);

		if (cannabisDeskVerification != null) {
			return cannabisDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis desk verification, or <code>null</code> if a matching cannabis desk verification could not be found
	 */
	@Override
	public CannabisDeskVerification fetchBygetDeskVerificationPharmaById_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisDeskVerification> orderByComparator) {

		List<CannabisDeskVerification> list =
			findBygetDeskVerificationPharmaById(
				cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a matching cannabis desk verification could not be found
	 */
	@Override
	public CannabisDeskVerification findBygetDeskVerificationPharmaById_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisDeskVerification> orderByComparator)
		throws NoSuchCannabisDeskVerificationException {

		CannabisDeskVerification cannabisDeskVerification =
			fetchBygetDeskVerificationPharmaById_Last(
				cannabisApplicationId, orderByComparator);

		if (cannabisDeskVerification != null) {
			return cannabisDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis desk verification, or <code>null</code> if a matching cannabis desk verification could not be found
	 */
	@Override
	public CannabisDeskVerification fetchBygetDeskVerificationPharmaById_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationPharmaById(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisDeskVerification> list =
			findBygetDeskVerificationPharmaById(
				cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis desk verifications before and after the current cannabis desk verification in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisDeskVerificationId the primary key of the current cannabis desk verification
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	@Override
	public CannabisDeskVerification[]
			findBygetDeskVerificationPharmaById_PrevAndNext(
				long cannabisDeskVerificationId, long cannabisApplicationId,
				OrderByComparator<CannabisDeskVerification> orderByComparator)
		throws NoSuchCannabisDeskVerificationException {

		CannabisDeskVerification cannabisDeskVerification = findByPrimaryKey(
			cannabisDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			CannabisDeskVerification[] array =
				new CannabisDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationPharmaById_PrevAndNext(
				session, cannabisDeskVerification, cannabisApplicationId,
				orderByComparator, true);

			array[1] = cannabisDeskVerification;

			array[2] = getBygetDeskVerificationPharmaById_PrevAndNext(
				session, cannabisDeskVerification, cannabisApplicationId,
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

	protected CannabisDeskVerification
		getBygetDeskVerificationPharmaById_PrevAndNext(
			Session session, CannabisDeskVerification cannabisDeskVerification,
			long cannabisApplicationId,
			OrderByComparator<CannabisDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISDESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERIFICATIONPHARMABYID_CANNABISAPPLICATIONID_2);

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
			sb.append(CannabisDeskVerificationModelImpl.ORDER_BY_JPQL);
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
						cannabisDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis desk verifications where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetDeskVerificationPharmaById(
		long cannabisApplicationId) {

		for (CannabisDeskVerification cannabisDeskVerification :
				findBygetDeskVerificationPharmaById(
					cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisDeskVerification);
		}
	}

	/**
	 * Returns the number of cannabis desk verifications where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis desk verifications
	 */
	@Override
	public int countBygetDeskVerificationPharmaById(
		long cannabisApplicationId) {

		FinderPath finderPath = _finderPathCountBygetDeskVerificationPharmaById;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONPHARMABYID_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONPHARMABYID_CANNABISAPPLICATIONID_2 =
			"cannabisDeskVerification.cannabisApplicationId = ?";

	public CannabisDeskVerificationPersistenceImpl() {
		setModelClass(CannabisDeskVerification.class);

		setModelImplClass(CannabisDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the cannabis desk verification in the entity cache if it is enabled.
	 *
	 * @param cannabisDeskVerification the cannabis desk verification
	 */
	@Override
	public void cacheResult(CannabisDeskVerification cannabisDeskVerification) {
		entityCache.putResult(
			CannabisDeskVerificationImpl.class,
			cannabisDeskVerification.getPrimaryKey(), cannabisDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis desk verifications in the entity cache if it is enabled.
	 *
	 * @param cannabisDeskVerifications the cannabis desk verifications
	 */
	@Override
	public void cacheResult(
		List<CannabisDeskVerification> cannabisDeskVerifications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisDeskVerification cannabisDeskVerification :
				cannabisDeskVerifications) {

			if (entityCache.getResult(
					CannabisDeskVerificationImpl.class,
					cannabisDeskVerification.getPrimaryKey()) == null) {

				cacheResult(cannabisDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisDeskVerificationImpl.class);

		finderCache.clearCache(CannabisDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the cannabis desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CannabisDeskVerification cannabisDeskVerification) {
		entityCache.removeResult(
			CannabisDeskVerificationImpl.class, cannabisDeskVerification);
	}

	@Override
	public void clearCache(
		List<CannabisDeskVerification> cannabisDeskVerifications) {

		for (CannabisDeskVerification cannabisDeskVerification :
				cannabisDeskVerifications) {

			entityCache.removeResult(
				CannabisDeskVerificationImpl.class, cannabisDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cannabis desk verification with the primary key. Does not add the cannabis desk verification to the database.
	 *
	 * @param cannabisDeskVerificationId the primary key for the new cannabis desk verification
	 * @return the new cannabis desk verification
	 */
	@Override
	public CannabisDeskVerification create(long cannabisDeskVerificationId) {
		CannabisDeskVerification cannabisDeskVerification =
			new CannabisDeskVerificationImpl();

		cannabisDeskVerification.setNew(true);
		cannabisDeskVerification.setPrimaryKey(cannabisDeskVerificationId);

		cannabisDeskVerification.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisDeskVerification;
	}

	/**
	 * Removes the cannabis desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification that was removed
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	@Override
	public CannabisDeskVerification remove(long cannabisDeskVerificationId)
		throws NoSuchCannabisDeskVerificationException {

		return remove((Serializable)cannabisDeskVerificationId);
	}

	/**
	 * Removes the cannabis desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis desk verification
	 * @return the cannabis desk verification that was removed
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	@Override
	public CannabisDeskVerification remove(Serializable primaryKey)
		throws NoSuchCannabisDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			CannabisDeskVerification cannabisDeskVerification =
				(CannabisDeskVerification)session.get(
					CannabisDeskVerificationImpl.class, primaryKey);

			if (cannabisDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisDeskVerification);
		}
		catch (NoSuchCannabisDeskVerificationException noSuchEntityException) {
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
	protected CannabisDeskVerification removeImpl(
		CannabisDeskVerification cannabisDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisDeskVerification)) {
				cannabisDeskVerification =
					(CannabisDeskVerification)session.get(
						CannabisDeskVerificationImpl.class,
						cannabisDeskVerification.getPrimaryKeyObj());
			}

			if (cannabisDeskVerification != null) {
				session.delete(cannabisDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisDeskVerification != null) {
			clearCache(cannabisDeskVerification);
		}

		return cannabisDeskVerification;
	}

	@Override
	public CannabisDeskVerification updateImpl(
		CannabisDeskVerification cannabisDeskVerification) {

		boolean isNew = cannabisDeskVerification.isNew();

		if (!(cannabisDeskVerification instanceof
				CannabisDeskVerificationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisDeskVerification implementation " +
					cannabisDeskVerification.getClass());
		}

		CannabisDeskVerificationModelImpl cannabisDeskVerificationModelImpl =
			(CannabisDeskVerificationModelImpl)cannabisDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisDeskVerification.setCreateDate(date);
			}
			else {
				cannabisDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisDeskVerification.setModifiedDate(date);
			}
			else {
				cannabisDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisDeskVerification);
			}
			else {
				cannabisDeskVerification =
					(CannabisDeskVerification)session.merge(
						cannabisDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisDeskVerificationImpl.class,
			cannabisDeskVerificationModelImpl, false, true);

		if (isNew) {
			cannabisDeskVerification.setNew(false);
		}

		cannabisDeskVerification.resetOriginalValues();

		return cannabisDeskVerification;
	}

	/**
	 * Returns the cannabis desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis desk verification
	 * @return the cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	@Override
	public CannabisDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisDeskVerificationException {

		CannabisDeskVerification cannabisDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (cannabisDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisDeskVerification;
	}

	/**
	 * Returns the cannabis desk verification with the primary key or throws a <code>NoSuchCannabisDeskVerificationException</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification
	 * @throws NoSuchCannabisDeskVerificationException if a cannabis desk verification with the primary key could not be found
	 */
	@Override
	public CannabisDeskVerification findByPrimaryKey(
			long cannabisDeskVerificationId)
		throws NoSuchCannabisDeskVerificationException {

		return findByPrimaryKey((Serializable)cannabisDeskVerificationId);
	}

	/**
	 * Returns the cannabis desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisDeskVerificationId the primary key of the cannabis desk verification
	 * @return the cannabis desk verification, or <code>null</code> if a cannabis desk verification with the primary key could not be found
	 */
	@Override
	public CannabisDeskVerification fetchByPrimaryKey(
		long cannabisDeskVerificationId) {

		return fetchByPrimaryKey((Serializable)cannabisDeskVerificationId);
	}

	/**
	 * Returns all the cannabis desk verifications.
	 *
	 * @return the cannabis desk verifications
	 */
	@Override
	public List<CannabisDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @return the range of cannabis desk verifications
	 */
	@Override
	public List<CannabisDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis desk verifications
	 */
	@Override
	public List<CannabisDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CannabisDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis desk verifications
	 * @param end the upper bound of the range of cannabis desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis desk verifications
	 */
	@Override
	public List<CannabisDeskVerification> findAll(
		int start, int end,
		OrderByComparator<CannabisDeskVerification> orderByComparator,
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

		List<CannabisDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<CannabisDeskVerification>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISDESKVERIFICATION;

				sql = sql.concat(
					CannabisDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisDeskVerification>)QueryUtil.list(
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
	 * Removes all the cannabis desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisDeskVerification cannabisDeskVerification : findAll()) {
			remove(cannabisDeskVerification);
		}
	}

	/**
	 * Returns the number of cannabis desk verifications.
	 *
	 * @return the number of cannabis desk verifications
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
					_SQL_COUNT_CANNABISDESKVERIFICATION);

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
		return _SQL_SELECT_CANNABISDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerificationPharmaById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationPharmaById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationPharmaById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationPharmaById",
				new String[] {Long.class.getName()},
				new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetDeskVerificationPharmaById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationPharmaById",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_setCannabisDeskVerificationUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setCannabisDeskVerificationUtilPersistence(null);

		entityCache.removeCache(CannabisDeskVerificationImpl.class.getName());
	}

	private void _setCannabisDeskVerificationUtilPersistence(
		CannabisDeskVerificationPersistence
			cannabisDeskVerificationPersistence) {

		try {
			Field field = CannabisDeskVerificationUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, cannabisDeskVerificationPersistence);
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

	private static final String _SQL_SELECT_CANNABISDESKVERIFICATION =
		"SELECT cannabisDeskVerification FROM CannabisDeskVerification cannabisDeskVerification";

	private static final String _SQL_SELECT_CANNABISDESKVERIFICATION_WHERE =
		"SELECT cannabisDeskVerification FROM CannabisDeskVerification cannabisDeskVerification WHERE ";

	private static final String _SQL_COUNT_CANNABISDESKVERIFICATION =
		"SELECT COUNT(cannabisDeskVerification) FROM CannabisDeskVerification cannabisDeskVerification";

	private static final String _SQL_COUNT_CANNABISDESKVERIFICATION_WHERE =
		"SELECT COUNT(cannabisDeskVerification) FROM CannabisDeskVerification cannabisDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private CannabisDeskVerificationModelArgumentsResolver
		_cannabisDeskVerificationModelArgumentsResolver;

}