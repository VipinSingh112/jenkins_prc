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

package com.nbp.farm.application.stages.service.service.persistence.impl;

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

import com.nbp.farm.application.stages.service.exception.NoSuchFarmDeskVerificationException;
import com.nbp.farm.application.stages.service.model.FarmDeskVerification;
import com.nbp.farm.application.stages.service.model.FarmDeskVerificationTable;
import com.nbp.farm.application.stages.service.model.impl.FarmDeskVerificationImpl;
import com.nbp.farm.application.stages.service.model.impl.FarmDeskVerificationModelImpl;
import com.nbp.farm.application.stages.service.service.persistence.FarmDeskVerificationPersistence;
import com.nbp.farm.application.stages.service.service.persistence.FarmDeskVerificationUtil;
import com.nbp.farm.application.stages.service.service.persistence.impl.constants.FARM_STAGESPersistenceConstants;

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
 * The persistence implementation for the farm desk verification service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {FarmDeskVerificationPersistence.class, BasePersistence.class}
)
public class FarmDeskVerificationPersistenceImpl
	extends BasePersistenceImpl<FarmDeskVerification>
	implements FarmDeskVerificationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmDeskVerificationUtil</code> to access the farm desk verification persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmDeskVerificationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath
		_finderPathWithPaginationFindBygetDeskVerificationFarmById;
	private FinderPath
		_finderPathWithoutPaginationFindBygetDeskVerificationFarmById;
	private FinderPath _finderPathCountBygetDeskVerificationFarmById;

	/**
	 * Returns all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farm desk verifications
	 */
	@Override
	public List<FarmDeskVerification> findBygetDeskVerificationFarmById(
		long farmerApplicationId) {

		return findBygetDeskVerificationFarmById(
			farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @return the range of matching farm desk verifications
	 */
	@Override
	public List<FarmDeskVerification> findBygetDeskVerificationFarmById(
		long farmerApplicationId, int start, int end) {

		return findBygetDeskVerificationFarmById(
			farmerApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm desk verifications
	 */
	@Override
	public List<FarmDeskVerification> findBygetDeskVerificationFarmById(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		return findBygetDeskVerificationFarmById(
			farmerApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm desk verifications
	 */
	@Override
	public List<FarmDeskVerification> findBygetDeskVerificationFarmById(
		long farmerApplicationId, int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetDeskVerificationFarmById;
				finderArgs = new Object[] {farmerApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetDeskVerificationFarmById;
			finderArgs = new Object[] {
				farmerApplicationId, start, end, orderByComparator
			};
		}

		List<FarmDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<FarmDeskVerification>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmDeskVerification farmDeskVerification : list) {
					if (farmerApplicationId !=
							farmDeskVerification.getFarmerApplicationId()) {

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

			sb.append(_SQL_SELECT_FARMDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONFARMBYID_FARMERAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				list = (List<FarmDeskVerification>)QueryUtil.list(
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
	 * Returns the first farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a matching farm desk verification could not be found
	 */
	@Override
	public FarmDeskVerification findBygetDeskVerificationFarmById_First(
			long farmerApplicationId,
			OrderByComparator<FarmDeskVerification> orderByComparator)
		throws NoSuchFarmDeskVerificationException {

		FarmDeskVerification farmDeskVerification =
			fetchBygetDeskVerificationFarmById_First(
				farmerApplicationId, orderByComparator);

		if (farmDeskVerification != null) {
			return farmDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the first farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm desk verification, or <code>null</code> if a matching farm desk verification could not be found
	 */
	@Override
	public FarmDeskVerification fetchBygetDeskVerificationFarmById_First(
		long farmerApplicationId,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		List<FarmDeskVerification> list = findBygetDeskVerificationFarmById(
			farmerApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a matching farm desk verification could not be found
	 */
	@Override
	public FarmDeskVerification findBygetDeskVerificationFarmById_Last(
			long farmerApplicationId,
			OrderByComparator<FarmDeskVerification> orderByComparator)
		throws NoSuchFarmDeskVerificationException {

		FarmDeskVerification farmDeskVerification =
			fetchBygetDeskVerificationFarmById_Last(
				farmerApplicationId, orderByComparator);

		if (farmDeskVerification != null) {
			return farmDeskVerification;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerApplicationId=");
		sb.append(farmerApplicationId);

		sb.append("}");

		throw new NoSuchFarmDeskVerificationException(sb.toString());
	}

	/**
	 * Returns the last farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm desk verification, or <code>null</code> if a matching farm desk verification could not be found
	 */
	@Override
	public FarmDeskVerification fetchBygetDeskVerificationFarmById_Last(
		long farmerApplicationId,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		int count = countBygetDeskVerificationFarmById(farmerApplicationId);

		if (count == 0) {
			return null;
		}

		List<FarmDeskVerification> list = findBygetDeskVerificationFarmById(
			farmerApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm desk verifications before and after the current farm desk verification in the ordered set where farmerApplicationId = &#63;.
	 *
	 * @param farmDeskVerificationId the primary key of the current farm desk verification
	 * @param farmerApplicationId the farmer application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	@Override
	public FarmDeskVerification[] findBygetDeskVerificationFarmById_PrevAndNext(
			long farmDeskVerificationId, long farmerApplicationId,
			OrderByComparator<FarmDeskVerification> orderByComparator)
		throws NoSuchFarmDeskVerificationException {

		FarmDeskVerification farmDeskVerification = findByPrimaryKey(
			farmDeskVerificationId);

		Session session = null;

		try {
			session = openSession();

			FarmDeskVerification[] array = new FarmDeskVerificationImpl[3];

			array[0] = getBygetDeskVerificationFarmById_PrevAndNext(
				session, farmDeskVerification, farmerApplicationId,
				orderByComparator, true);

			array[1] = farmDeskVerification;

			array[2] = getBygetDeskVerificationFarmById_PrevAndNext(
				session, farmDeskVerification, farmerApplicationId,
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

	protected FarmDeskVerification getBygetDeskVerificationFarmById_PrevAndNext(
		Session session, FarmDeskVerification farmDeskVerification,
		long farmerApplicationId,
		OrderByComparator<FarmDeskVerification> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMDESKVERIFICATION_WHERE);

		sb.append(
			_FINDER_COLUMN_GETDESKVERIFICATIONFARMBYID_FARMERAPPLICATIONID_2);

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
			sb.append(FarmDeskVerificationModelImpl.ORDER_BY_JPQL);
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
						farmDeskVerification)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmDeskVerification> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm desk verifications where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 */
	@Override
	public void removeBygetDeskVerificationFarmById(long farmerApplicationId) {
		for (FarmDeskVerification farmDeskVerification :
				findBygetDeskVerificationFarmById(
					farmerApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmDeskVerification);
		}
	}

	/**
	 * Returns the number of farm desk verifications where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farm desk verifications
	 */
	@Override
	public int countBygetDeskVerificationFarmById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetDeskVerificationFarmById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMDESKVERIFICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETDESKVERIFICATIONFARMBYID_FARMERAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETDESKVERIFICATIONFARMBYID_FARMERAPPLICATIONID_2 =
			"farmDeskVerification.farmerApplicationId = ?";

	public FarmDeskVerificationPersistenceImpl() {
		setModelClass(FarmDeskVerification.class);

		setModelImplClass(FarmDeskVerificationImpl.class);
		setModelPKClass(long.class);

		setTable(FarmDeskVerificationTable.INSTANCE);
	}

	/**
	 * Caches the farm desk verification in the entity cache if it is enabled.
	 *
	 * @param farmDeskVerification the farm desk verification
	 */
	@Override
	public void cacheResult(FarmDeskVerification farmDeskVerification) {
		entityCache.putResult(
			FarmDeskVerificationImpl.class,
			farmDeskVerification.getPrimaryKey(), farmDeskVerification);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farm desk verifications in the entity cache if it is enabled.
	 *
	 * @param farmDeskVerifications the farm desk verifications
	 */
	@Override
	public void cacheResult(List<FarmDeskVerification> farmDeskVerifications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmDeskVerifications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmDeskVerification farmDeskVerification :
				farmDeskVerifications) {

			if (entityCache.getResult(
					FarmDeskVerificationImpl.class,
					farmDeskVerification.getPrimaryKey()) == null) {

				cacheResult(farmDeskVerification);
			}
		}
	}

	/**
	 * Clears the cache for all farm desk verifications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmDeskVerificationImpl.class);

		finderCache.clearCache(FarmDeskVerificationImpl.class);
	}

	/**
	 * Clears the cache for the farm desk verification.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmDeskVerification farmDeskVerification) {
		entityCache.removeResult(
			FarmDeskVerificationImpl.class, farmDeskVerification);
	}

	@Override
	public void clearCache(List<FarmDeskVerification> farmDeskVerifications) {
		for (FarmDeskVerification farmDeskVerification :
				farmDeskVerifications) {

			entityCache.removeResult(
				FarmDeskVerificationImpl.class, farmDeskVerification);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmDeskVerificationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FarmDeskVerificationImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new farm desk verification with the primary key. Does not add the farm desk verification to the database.
	 *
	 * @param farmDeskVerificationId the primary key for the new farm desk verification
	 * @return the new farm desk verification
	 */
	@Override
	public FarmDeskVerification create(long farmDeskVerificationId) {
		FarmDeskVerification farmDeskVerification =
			new FarmDeskVerificationImpl();

		farmDeskVerification.setNew(true);
		farmDeskVerification.setPrimaryKey(farmDeskVerificationId);

		farmDeskVerification.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmDeskVerification;
	}

	/**
	 * Removes the farm desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification that was removed
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	@Override
	public FarmDeskVerification remove(long farmDeskVerificationId)
		throws NoSuchFarmDeskVerificationException {

		return remove((Serializable)farmDeskVerificationId);
	}

	/**
	 * Removes the farm desk verification with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farm desk verification
	 * @return the farm desk verification that was removed
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	@Override
	public FarmDeskVerification remove(Serializable primaryKey)
		throws NoSuchFarmDeskVerificationException {

		Session session = null;

		try {
			session = openSession();

			FarmDeskVerification farmDeskVerification =
				(FarmDeskVerification)session.get(
					FarmDeskVerificationImpl.class, primaryKey);

			if (farmDeskVerification == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmDeskVerificationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmDeskVerification);
		}
		catch (NoSuchFarmDeskVerificationException noSuchEntityException) {
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
	protected FarmDeskVerification removeImpl(
		FarmDeskVerification farmDeskVerification) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmDeskVerification)) {
				farmDeskVerification = (FarmDeskVerification)session.get(
					FarmDeskVerificationImpl.class,
					farmDeskVerification.getPrimaryKeyObj());
			}

			if (farmDeskVerification != null) {
				session.delete(farmDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmDeskVerification != null) {
			clearCache(farmDeskVerification);
		}

		return farmDeskVerification;
	}

	@Override
	public FarmDeskVerification updateImpl(
		FarmDeskVerification farmDeskVerification) {

		boolean isNew = farmDeskVerification.isNew();

		if (!(farmDeskVerification instanceof FarmDeskVerificationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmDeskVerification.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmDeskVerification);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmDeskVerification proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmDeskVerification implementation " +
					farmDeskVerification.getClass());
		}

		FarmDeskVerificationModelImpl farmDeskVerificationModelImpl =
			(FarmDeskVerificationModelImpl)farmDeskVerification;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmDeskVerification.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmDeskVerification.setCreateDate(date);
			}
			else {
				farmDeskVerification.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmDeskVerificationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmDeskVerification.setModifiedDate(date);
			}
			else {
				farmDeskVerification.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmDeskVerification);
			}
			else {
				farmDeskVerification = (FarmDeskVerification)session.merge(
					farmDeskVerification);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmDeskVerificationImpl.class, farmDeskVerificationModelImpl,
			false, true);

		if (isNew) {
			farmDeskVerification.setNew(false);
		}

		farmDeskVerification.resetOriginalValues();

		return farmDeskVerification;
	}

	/**
	 * Returns the farm desk verification with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farm desk verification
	 * @return the farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	@Override
	public FarmDeskVerification findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmDeskVerificationException {

		FarmDeskVerification farmDeskVerification = fetchByPrimaryKey(
			primaryKey);

		if (farmDeskVerification == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmDeskVerificationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmDeskVerification;
	}

	/**
	 * Returns the farm desk verification with the primary key or throws a <code>NoSuchFarmDeskVerificationException</code> if it could not be found.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification
	 * @throws NoSuchFarmDeskVerificationException if a farm desk verification with the primary key could not be found
	 */
	@Override
	public FarmDeskVerification findByPrimaryKey(long farmDeskVerificationId)
		throws NoSuchFarmDeskVerificationException {

		return findByPrimaryKey((Serializable)farmDeskVerificationId);
	}

	/**
	 * Returns the farm desk verification with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmDeskVerificationId the primary key of the farm desk verification
	 * @return the farm desk verification, or <code>null</code> if a farm desk verification with the primary key could not be found
	 */
	@Override
	public FarmDeskVerification fetchByPrimaryKey(long farmDeskVerificationId) {
		return fetchByPrimaryKey((Serializable)farmDeskVerificationId);
	}

	/**
	 * Returns all the farm desk verifications.
	 *
	 * @return the farm desk verifications
	 */
	@Override
	public List<FarmDeskVerification> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @return the range of farm desk verifications
	 */
	@Override
	public List<FarmDeskVerification> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm desk verifications
	 */
	@Override
	public List<FarmDeskVerification> findAll(
		int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm desk verifications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmDeskVerificationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm desk verifications
	 * @param end the upper bound of the range of farm desk verifications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm desk verifications
	 */
	@Override
	public List<FarmDeskVerification> findAll(
		int start, int end,
		OrderByComparator<FarmDeskVerification> orderByComparator,
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

		List<FarmDeskVerification> list = null;

		if (useFinderCache) {
			list = (List<FarmDeskVerification>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMDESKVERIFICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMDESKVERIFICATION;

				sql = sql.concat(FarmDeskVerificationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmDeskVerification>)QueryUtil.list(
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
	 * Removes all the farm desk verifications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmDeskVerification farmDeskVerification : findAll()) {
			remove(farmDeskVerification);
		}
	}

	/**
	 * Returns the number of farm desk verifications.
	 *
	 * @return the number of farm desk verifications
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
					_SQL_COUNT_FARMDESKVERIFICATION);

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
		return "farmDeskVerificationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMDESKVERIFICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmDeskVerificationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farm desk verification persistence.
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

		_finderPathWithPaginationFindBygetDeskVerificationFarmById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetDeskVerificationFarmById",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"farmerApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetDeskVerificationFarmById =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetDeskVerificationFarmById",
				new String[] {Long.class.getName()},
				new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetDeskVerificationFarmById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetDeskVerificationFarmById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmDeskVerificationUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmDeskVerificationUtilPersistence(null);

		entityCache.removeCache(FarmDeskVerificationImpl.class.getName());
	}

	private void _setFarmDeskVerificationUtilPersistence(
		FarmDeskVerificationPersistence farmDeskVerificationPersistence) {

		try {
			Field field = FarmDeskVerificationUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmDeskVerificationPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FARMDESKVERIFICATION =
		"SELECT farmDeskVerification FROM FarmDeskVerification farmDeskVerification";

	private static final String _SQL_SELECT_FARMDESKVERIFICATION_WHERE =
		"SELECT farmDeskVerification FROM FarmDeskVerification farmDeskVerification WHERE ";

	private static final String _SQL_COUNT_FARMDESKVERIFICATION =
		"SELECT COUNT(farmDeskVerification) FROM FarmDeskVerification farmDeskVerification";

	private static final String _SQL_COUNT_FARMDESKVERIFICATION_WHERE =
		"SELECT COUNT(farmDeskVerification) FROM FarmDeskVerification farmDeskVerification WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"farmDeskVerification.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmDeskVerification exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmDeskVerification exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmDeskVerificationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmDeskVerificationModelArgumentsResolver
		_farmDeskVerificationModelArgumentsResolver;

}