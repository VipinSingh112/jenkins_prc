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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerStakeholderAddressException;
import com.nbp.farm.application.form.service.model.FarmerStakeholderAddress;
import com.nbp.farm.application.form.service.model.FarmerStakeholderAddressTable;
import com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerStakeholderAddressModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerStakeholderAddressPersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerStakeholderAddressUtil;
import com.nbp.farm.application.form.service.service.persistence.impl.constants.FARMERAPPLICATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the farmer stakeholder address service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {FarmerStakeholderAddressPersistence.class, BasePersistence.class}
)
public class FarmerStakeholderAddressPersistenceImpl
	extends BasePersistenceImpl<FarmerStakeholderAddress>
	implements FarmerStakeholderAddressPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerStakeholderAddressUtil</code> to access the farmer stakeholder address persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerStakeholderAddressImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFA_SAI_AT;
	private FinderPath _finderPathCountBygetFA_SAI_AT;

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress findBygetFA_SAI_AT(
			String addressType, long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress = fetchBygetFA_SAI_AT(
			addressType, farmerStakeholderInfoId);

		if (farmerStakeholderAddress == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("addressType=");
			sb.append(addressType);

			sb.append(", farmerStakeholderInfoId=");
			sb.append(farmerStakeholderInfoId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerStakeholderAddressException(sb.toString());
		}

		return farmerStakeholderAddress;
	}

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId) {

		return fetchBygetFA_SAI_AT(addressType, farmerStakeholderInfoId, true);
	}

	/**
	 * Returns the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId,
		boolean useFinderCache) {

		addressType = Objects.toString(addressType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {addressType, farmerStakeholderInfoId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFA_SAI_AT, finderArgs,this);
		}

		if (result instanceof FarmerStakeholderAddress) {
			FarmerStakeholderAddress farmerStakeholderAddress =
				(FarmerStakeholderAddress)result;

			if (!Objects.equals(
					addressType, farmerStakeholderAddress.getAddressType()) ||
				(farmerStakeholderInfoId !=
					farmerStakeholderAddress.getFarmerStakeholderInfoId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FARMERSTAKEHOLDERADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFA_SAI_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETFA_SAI_AT_ADDRESSTYPE_2);
			}

			sb.append(_FINDER_COLUMN_GETFA_SAI_AT_FARMERSTAKEHOLDERINFOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(farmerStakeholderInfoId);

				List<FarmerStakeholderAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFA_SAI_AT, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									addressType, farmerStakeholderInfoId
								};
							}

							_log.warn(
								"FarmerStakeholderAddressPersistenceImpl.fetchBygetFA_SAI_AT(String, long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerStakeholderAddress farmerStakeholderAddress =
						list.get(0);

					result = farmerStakeholderAddress;

					cacheResult(farmerStakeholderAddress);
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
			return (FarmerStakeholderAddress)result;
		}
	}

	/**
	 * Removes the farmer stakeholder address where addressType = &#63; and farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the farmer stakeholder address that was removed
	 */
	@Override
	public FarmerStakeholderAddress removeBygetFA_SAI_AT(
			String addressType, long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress = findBygetFA_SAI_AT(
			addressType, farmerStakeholderInfoId);

		return remove(farmerStakeholderAddress);
	}

	/**
	 * Returns the number of farmer stakeholder addresses where addressType = &#63; and farmerStakeholderInfoId = &#63;.
	 *
	 * @param addressType the address type
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	@Override
	public int countBygetFA_SAI_AT(
		String addressType, long farmerStakeholderInfoId) {

		addressType = Objects.toString(addressType, "");

		FinderPath finderPath = _finderPathCountBygetFA_SAI_AT;

		Object[] finderArgs = new Object[] {
			addressType, farmerStakeholderInfoId
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMERSTAKEHOLDERADDRESS_WHERE);

			boolean bindAddressType = false;

			if (addressType.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFA_SAI_AT_ADDRESSTYPE_3);
			}
			else {
				bindAddressType = true;

				sb.append(_FINDER_COLUMN_GETFA_SAI_AT_ADDRESSTYPE_2);
			}

			sb.append(_FINDER_COLUMN_GETFA_SAI_AT_FARMERSTAKEHOLDERINFOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindAddressType) {
					queryPos.add(addressType);
				}

				queryPos.add(farmerStakeholderInfoId);

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

	private static final String _FINDER_COLUMN_GETFA_SAI_AT_ADDRESSTYPE_2 =
		"farmerStakeholderAddress.addressType = ? AND ";

	private static final String _FINDER_COLUMN_GETFA_SAI_AT_ADDRESSTYPE_3 =
		"(farmerStakeholderAddress.addressType IS NULL OR farmerStakeholderAddress.addressType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFA_SAI_AT_FARMERSTAKEHOLDERINFOID_2 =
			"farmerStakeholderAddress.farmerStakeholderInfoId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFA_SAI_FI;
	private FinderPath _finderPathWithoutPaginationFindBygetFA_SAI_FI;
	private FinderPath _finderPathCountBygetFA_SAI_FI;

	/**
	 * Returns all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder addresses
	 */
	@Override
	public List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId) {

		return findBygetFA_SAI_FI(
			farmerStakeholderInfoId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @return the range of matching farmer stakeholder addresses
	 */
	@Override
	public List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end) {

		return findBygetFA_SAI_FI(farmerStakeholderInfoId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer stakeholder addresses
	 */
	@Override
	public List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		return findBygetFA_SAI_FI(
			farmerStakeholderInfoId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer stakeholder addresses
	 */
	@Override
	public List<FarmerStakeholderAddress> findBygetFA_SAI_FI(
		long farmerStakeholderInfoId, int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFA_SAI_FI;
				finderArgs = new Object[] {farmerStakeholderInfoId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFA_SAI_FI;
			finderArgs = new Object[] {
				farmerStakeholderInfoId, start, end, orderByComparator
			};
		}

		List<FarmerStakeholderAddress> list = null;

		if (useFinderCache) {
			list = (List<FarmerStakeholderAddress>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerStakeholderAddress farmerStakeholderAddress : list) {
					if (farmerStakeholderInfoId !=
							farmerStakeholderAddress.
								getFarmerStakeholderInfoId()) {

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

			sb.append(_SQL_SELECT_FARMERSTAKEHOLDERADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_SAI_FI_FARMERSTAKEHOLDERINFOID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmerStakeholderAddressModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerStakeholderInfoId);

				list = (List<FarmerStakeholderAddress>)QueryUtil.list(
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
	 * Returns the first farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress findBygetFA_SAI_FI_First(
			long farmerStakeholderInfoId,
			OrderByComparator<FarmerStakeholderAddress> orderByComparator)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress =
			fetchBygetFA_SAI_FI_First(
				farmerStakeholderInfoId, orderByComparator);

		if (farmerStakeholderAddress != null) {
			return farmerStakeholderAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerStakeholderInfoId=");
		sb.append(farmerStakeholderInfoId);

		sb.append("}");

		throw new NoSuchFarmerStakeholderAddressException(sb.toString());
	}

	/**
	 * Returns the first farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchBygetFA_SAI_FI_First(
		long farmerStakeholderInfoId,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		List<FarmerStakeholderAddress> list = findBygetFA_SAI_FI(
			farmerStakeholderInfoId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress findBygetFA_SAI_FI_Last(
			long farmerStakeholderInfoId,
			OrderByComparator<FarmerStakeholderAddress> orderByComparator)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress =
			fetchBygetFA_SAI_FI_Last(
				farmerStakeholderInfoId, orderByComparator);

		if (farmerStakeholderAddress != null) {
			return farmerStakeholderAddress;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("farmerStakeholderInfoId=");
		sb.append(farmerStakeholderInfoId);

		sb.append("}");

		throw new NoSuchFarmerStakeholderAddressException(sb.toString());
	}

	/**
	 * Returns the last farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchBygetFA_SAI_FI_Last(
		long farmerStakeholderInfoId,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		int count = countBygetFA_SAI_FI(farmerStakeholderInfoId);

		if (count == 0) {
			return null;
		}

		List<FarmerStakeholderAddress> list = findBygetFA_SAI_FI(
			farmerStakeholderInfoId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer stakeholder addresses before and after the current farmer stakeholder address in the ordered set where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderAddressId the primary key of the current farmer stakeholder address
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderAddress[] findBygetFA_SAI_FI_PrevAndNext(
			long farmerStakeholderAddressId, long farmerStakeholderInfoId,
			OrderByComparator<FarmerStakeholderAddress> orderByComparator)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress = findByPrimaryKey(
			farmerStakeholderAddressId);

		Session session = null;

		try {
			session = openSession();

			FarmerStakeholderAddress[] array =
				new FarmerStakeholderAddressImpl[3];

			array[0] = getBygetFA_SAI_FI_PrevAndNext(
				session, farmerStakeholderAddress, farmerStakeholderInfoId,
				orderByComparator, true);

			array[1] = farmerStakeholderAddress;

			array[2] = getBygetFA_SAI_FI_PrevAndNext(
				session, farmerStakeholderAddress, farmerStakeholderInfoId,
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

	protected FarmerStakeholderAddress getBygetFA_SAI_FI_PrevAndNext(
		Session session, FarmerStakeholderAddress farmerStakeholderAddress,
		long farmerStakeholderInfoId,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERSTAKEHOLDERADDRESS_WHERE);

		sb.append(_FINDER_COLUMN_GETFA_SAI_FI_FARMERSTAKEHOLDERINFOID_2);

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
			sb.append(FarmerStakeholderAddressModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(farmerStakeholderInfoId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmerStakeholderAddress)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerStakeholderAddress> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer stakeholder addresses where farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 */
	@Override
	public void removeBygetFA_SAI_FI(long farmerStakeholderInfoId) {
		for (FarmerStakeholderAddress farmerStakeholderAddress :
				findBygetFA_SAI_FI(
					farmerStakeholderInfoId, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(farmerStakeholderAddress);
		}
	}

	/**
	 * Returns the number of farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	@Override
	public int countBygetFA_SAI_FI(long farmerStakeholderInfoId) {
		FinderPath finderPath = _finderPathCountBygetFA_SAI_FI;

		Object[] finderArgs = new Object[] {farmerStakeholderInfoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERSTAKEHOLDERADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETFA_SAI_FI_FARMERSTAKEHOLDERINFOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerStakeholderInfoId);

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
		_FINDER_COLUMN_GETFA_SAI_FI_FARMERSTAKEHOLDERINFOID_2 =
			"farmerStakeholderAddress.farmerStakeholderInfoId = ?";

	private FinderPath _finderPathFetchBygetFarmerById;
	private FinderPath _finderPathCountBygetFarmerById;

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress findBygetFarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress =
			fetchBygetFarmerById(farmerApplicationId);

		if (farmerStakeholderAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerStakeholderAddressException(sb.toString());
		}

		return farmerStakeholderAddress;
	}

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchBygetFarmerById(
		long farmerApplicationId) {

		return fetchBygetFarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer stakeholder address where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchBygetFarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {farmerApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFarmerById, finderArgs,this);
		}

		if (result instanceof FarmerStakeholderAddress) {
			FarmerStakeholderAddress farmerStakeholderAddress =
				(FarmerStakeholderAddress)result;

			if (farmerApplicationId !=
					farmerStakeholderAddress.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERSTAKEHOLDERADDRESS_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerStakeholderAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFarmerById, finderArgs, list);
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
								"FarmerStakeholderAddressPersistenceImpl.fetchBygetFarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerStakeholderAddress farmerStakeholderAddress =
						list.get(0);

					result = farmerStakeholderAddress;

					cacheResult(farmerStakeholderAddress);
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
			return (FarmerStakeholderAddress)result;
		}
	}

	/**
	 * Removes the farmer stakeholder address where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer stakeholder address that was removed
	 */
	@Override
	public FarmerStakeholderAddress removeBygetFarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress = findBygetFarmerById(
			farmerApplicationId);

		return remove(farmerStakeholderAddress);
	}

	/**
	 * Returns the number of farmer stakeholder addresses where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	@Override
	public int countBygetFarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERSTAKEHOLDERADDRESS_WHERE);

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
			"farmerStakeholderAddress.farmerApplicationId = ?";

	private FinderPath _finderPathFetchBygetFarmerByStakeInfoId;
	private FinderPath _finderPathCountBygetFarmerByStakeInfoId;

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress findBygetFarmerByStakeInfoId(
			long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress =
			fetchBygetFarmerByStakeInfoId(farmerStakeholderInfoId);

		if (farmerStakeholderAddress == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerStakeholderInfoId=");
			sb.append(farmerStakeholderInfoId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerStakeholderAddressException(sb.toString());
		}

		return farmerStakeholderAddress;
	}

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchBygetFarmerByStakeInfoId(
		long farmerStakeholderInfoId) {

		return fetchBygetFarmerByStakeInfoId(farmerStakeholderInfoId, true);
	}

	/**
	 * Returns the farmer stakeholder address where farmerStakeholderInfoId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer stakeholder address, or <code>null</code> if a matching farmer stakeholder address could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchBygetFarmerByStakeInfoId(
		long farmerStakeholderInfoId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {farmerStakeholderInfoId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFarmerByStakeInfoId, finderArgs,this);
		}

		if (result instanceof FarmerStakeholderAddress) {
			FarmerStakeholderAddress farmerStakeholderAddress =
				(FarmerStakeholderAddress)result;

			if (farmerStakeholderInfoId !=
					farmerStakeholderAddress.getFarmerStakeholderInfoId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERSTAKEHOLDERADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFARMERBYSTAKEINFOID_FARMERSTAKEHOLDERINFOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerStakeholderInfoId);

				List<FarmerStakeholderAddress> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFarmerByStakeInfoId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									farmerStakeholderInfoId
								};
							}

							_log.warn(
								"FarmerStakeholderAddressPersistenceImpl.fetchBygetFarmerByStakeInfoId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerStakeholderAddress farmerStakeholderAddress =
						list.get(0);

					result = farmerStakeholderAddress;

					cacheResult(farmerStakeholderAddress);
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
			return (FarmerStakeholderAddress)result;
		}
	}

	/**
	 * Removes the farmer stakeholder address where farmerStakeholderInfoId = &#63; from the database.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the farmer stakeholder address that was removed
	 */
	@Override
	public FarmerStakeholderAddress removeBygetFarmerByStakeInfoId(
			long farmerStakeholderInfoId)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress =
			findBygetFarmerByStakeInfoId(farmerStakeholderInfoId);

		return remove(farmerStakeholderAddress);
	}

	/**
	 * Returns the number of farmer stakeholder addresses where farmerStakeholderInfoId = &#63;.
	 *
	 * @param farmerStakeholderInfoId the farmer stakeholder info ID
	 * @return the number of matching farmer stakeholder addresses
	 */
	@Override
	public int countBygetFarmerByStakeInfoId(long farmerStakeholderInfoId) {
		FinderPath finderPath = _finderPathCountBygetFarmerByStakeInfoId;

		Object[] finderArgs = new Object[] {farmerStakeholderInfoId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERSTAKEHOLDERADDRESS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFARMERBYSTAKEINFOID_FARMERSTAKEHOLDERINFOID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerStakeholderInfoId);

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
		_FINDER_COLUMN_GETFARMERBYSTAKEINFOID_FARMERSTAKEHOLDERINFOID_2 =
			"farmerStakeholderAddress.farmerStakeholderInfoId = ?";

	public FarmerStakeholderAddressPersistenceImpl() {
		setModelClass(FarmerStakeholderAddress.class);

		setModelImplClass(FarmerStakeholderAddressImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerStakeholderAddressTable.INSTANCE);
	}

	/**
	 * Caches the farmer stakeholder address in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderAddress the farmer stakeholder address
	 */
	@Override
	public void cacheResult(FarmerStakeholderAddress farmerStakeholderAddress) {
		entityCache.putResult(
			FarmerStakeholderAddressImpl.class,
			farmerStakeholderAddress.getPrimaryKey(), farmerStakeholderAddress);

		finderCache.putResult(
			_finderPathFetchBygetFA_SAI_AT,
			new Object[] {
				farmerStakeholderAddress.getAddressType(),
				farmerStakeholderAddress.getFarmerStakeholderInfoId()
			},
			farmerStakeholderAddress);

		finderCache.putResult(
			_finderPathFetchBygetFarmerById,
			new Object[] {farmerStakeholderAddress.getFarmerApplicationId()},
			farmerStakeholderAddress);

		finderCache.putResult(
			_finderPathFetchBygetFarmerByStakeInfoId,
			new Object[] {
				farmerStakeholderAddress.getFarmerStakeholderInfoId()
			},
			farmerStakeholderAddress);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer stakeholder addresses in the entity cache if it is enabled.
	 *
	 * @param farmerStakeholderAddresses the farmer stakeholder addresses
	 */
	@Override
	public void cacheResult(
		List<FarmerStakeholderAddress> farmerStakeholderAddresses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerStakeholderAddresses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerStakeholderAddress farmerStakeholderAddress :
				farmerStakeholderAddresses) {

			if (entityCache.getResult(
					FarmerStakeholderAddressImpl.class,
					farmerStakeholderAddress.getPrimaryKey()) == null) {

				cacheResult(farmerStakeholderAddress);
			}
		}
	}

	/**
	 * Clears the cache for all farmer stakeholder addresses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerStakeholderAddressImpl.class);

		finderCache.clearCache(FarmerStakeholderAddressImpl.class);
	}

	/**
	 * Clears the cache for the farmer stakeholder address.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmerStakeholderAddress farmerStakeholderAddress) {
		entityCache.removeResult(
			FarmerStakeholderAddressImpl.class, farmerStakeholderAddress);
	}

	@Override
	public void clearCache(
		List<FarmerStakeholderAddress> farmerStakeholderAddresses) {

		for (FarmerStakeholderAddress farmerStakeholderAddress :
				farmerStakeholderAddresses) {

			entityCache.removeResult(
				FarmerStakeholderAddressImpl.class, farmerStakeholderAddress);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerStakeholderAddressImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FarmerStakeholderAddressImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerStakeholderAddressModelImpl farmerStakeholderAddressModelImpl) {

		Object[] args = new Object[] {
			farmerStakeholderAddressModelImpl.getAddressType(),
			farmerStakeholderAddressModelImpl.getFarmerStakeholderInfoId()
		};

		finderCache.putResult(
			_finderPathCountBygetFA_SAI_AT, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFA_SAI_AT, args,
			farmerStakeholderAddressModelImpl);

		args = new Object[] {
			farmerStakeholderAddressModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFarmerById, args,
			farmerStakeholderAddressModelImpl);

		args = new Object[] {
			farmerStakeholderAddressModelImpl.getFarmerStakeholderInfoId()
		};

		finderCache.putResult(
			_finderPathCountBygetFarmerByStakeInfoId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFarmerByStakeInfoId, args,
			farmerStakeholderAddressModelImpl);
	}

	/**
	 * Creates a new farmer stakeholder address with the primary key. Does not add the farmer stakeholder address to the database.
	 *
	 * @param farmerStakeholderAddressId the primary key for the new farmer stakeholder address
	 * @return the new farmer stakeholder address
	 */
	@Override
	public FarmerStakeholderAddress create(long farmerStakeholderAddressId) {
		FarmerStakeholderAddress farmerStakeholderAddress =
			new FarmerStakeholderAddressImpl();

		farmerStakeholderAddress.setNew(true);
		farmerStakeholderAddress.setPrimaryKey(farmerStakeholderAddressId);

		farmerStakeholderAddress.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return farmerStakeholderAddress;
	}

	/**
	 * Removes the farmer stakeholder address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address that was removed
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderAddress remove(long farmerStakeholderAddressId)
		throws NoSuchFarmerStakeholderAddressException {

		return remove((Serializable)farmerStakeholderAddressId);
	}

	/**
	 * Removes the farmer stakeholder address with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address that was removed
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderAddress remove(Serializable primaryKey)
		throws NoSuchFarmerStakeholderAddressException {

		Session session = null;

		try {
			session = openSession();

			FarmerStakeholderAddress farmerStakeholderAddress =
				(FarmerStakeholderAddress)session.get(
					FarmerStakeholderAddressImpl.class, primaryKey);

			if (farmerStakeholderAddress == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerStakeholderAddressException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerStakeholderAddress);
		}
		catch (NoSuchFarmerStakeholderAddressException noSuchEntityException) {
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
	protected FarmerStakeholderAddress removeImpl(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerStakeholderAddress)) {
				farmerStakeholderAddress =
					(FarmerStakeholderAddress)session.get(
						FarmerStakeholderAddressImpl.class,
						farmerStakeholderAddress.getPrimaryKeyObj());
			}

			if (farmerStakeholderAddress != null) {
				session.delete(farmerStakeholderAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerStakeholderAddress != null) {
			clearCache(farmerStakeholderAddress);
		}

		return farmerStakeholderAddress;
	}

	@Override
	public FarmerStakeholderAddress updateImpl(
		FarmerStakeholderAddress farmerStakeholderAddress) {

		boolean isNew = farmerStakeholderAddress.isNew();

		if (!(farmerStakeholderAddress instanceof
				FarmerStakeholderAddressModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmerStakeholderAddress.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerStakeholderAddress);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerStakeholderAddress proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerStakeholderAddress implementation " +
					farmerStakeholderAddress.getClass());
		}

		FarmerStakeholderAddressModelImpl farmerStakeholderAddressModelImpl =
			(FarmerStakeholderAddressModelImpl)farmerStakeholderAddress;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerStakeholderAddress.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerStakeholderAddress.setCreateDate(date);
			}
			else {
				farmerStakeholderAddress.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerStakeholderAddressModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerStakeholderAddress.setModifiedDate(date);
			}
			else {
				farmerStakeholderAddress.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerStakeholderAddress);
			}
			else {
				farmerStakeholderAddress =
					(FarmerStakeholderAddress)session.merge(
						farmerStakeholderAddress);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerStakeholderAddressImpl.class,
			farmerStakeholderAddressModelImpl, false, true);

		cacheUniqueFindersCache(farmerStakeholderAddressModelImpl);

		if (isNew) {
			farmerStakeholderAddress.setNew(false);
		}

		farmerStakeholderAddress.resetOriginalValues();

		return farmerStakeholderAddress;
	}

	/**
	 * Returns the farmer stakeholder address with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderAddress findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmerStakeholderAddressException {

		FarmerStakeholderAddress farmerStakeholderAddress = fetchByPrimaryKey(
			primaryKey);

		if (farmerStakeholderAddress == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerStakeholderAddressException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerStakeholderAddress;
	}

	/**
	 * Returns the farmer stakeholder address with the primary key or throws a <code>NoSuchFarmerStakeholderAddressException</code> if it could not be found.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address
	 * @throws NoSuchFarmerStakeholderAddressException if a farmer stakeholder address with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderAddress findByPrimaryKey(
			long farmerStakeholderAddressId)
		throws NoSuchFarmerStakeholderAddressException {

		return findByPrimaryKey((Serializable)farmerStakeholderAddressId);
	}

	/**
	 * Returns the farmer stakeholder address with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerStakeholderAddressId the primary key of the farmer stakeholder address
	 * @return the farmer stakeholder address, or <code>null</code> if a farmer stakeholder address with the primary key could not be found
	 */
	@Override
	public FarmerStakeholderAddress fetchByPrimaryKey(
		long farmerStakeholderAddressId) {

		return fetchByPrimaryKey((Serializable)farmerStakeholderAddressId);
	}

	/**
	 * Returns all the farmer stakeholder addresses.
	 *
	 * @return the farmer stakeholder addresses
	 */
	@Override
	public List<FarmerStakeholderAddress> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer stakeholder addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @return the range of farmer stakeholder addresses
	 */
	@Override
	public List<FarmerStakeholderAddress> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer stakeholder addresses
	 */
	@Override
	public List<FarmerStakeholderAddress> findAll(
		int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer stakeholder addresses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerStakeholderAddressModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer stakeholder addresses
	 * @param end the upper bound of the range of farmer stakeholder addresses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer stakeholder addresses
	 */
	@Override
	public List<FarmerStakeholderAddress> findAll(
		int start, int end,
		OrderByComparator<FarmerStakeholderAddress> orderByComparator,
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

		List<FarmerStakeholderAddress> list = null;

		if (useFinderCache) {
			list = (List<FarmerStakeholderAddress>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERSTAKEHOLDERADDRESS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERSTAKEHOLDERADDRESS;

				sql = sql.concat(
					FarmerStakeholderAddressModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerStakeholderAddress>)QueryUtil.list(
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
	 * Removes all the farmer stakeholder addresses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerStakeholderAddress farmerStakeholderAddress : findAll()) {
			remove(farmerStakeholderAddress);
		}
	}

	/**
	 * Returns the number of farmer stakeholder addresses.
	 *
	 * @return the number of farmer stakeholder addresses
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
					_SQL_COUNT_FARMERSTAKEHOLDERADDRESS);

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
		return "farmerStakeholderAddressId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERSTAKEHOLDERADDRESS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerStakeholderAddressModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer stakeholder address persistence.
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

		_finderPathFetchBygetFA_SAI_AT = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFA_SAI_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "farmerStakeholderInfoId"}, true);

		_finderPathCountBygetFA_SAI_AT = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_SAI_AT",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"addressType", "farmerStakeholderInfoId"}, false);

		_finderPathWithPaginationFindBygetFA_SAI_FI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFA_SAI_FI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"farmerStakeholderInfoId"}, true);

		_finderPathWithoutPaginationFindBygetFA_SAI_FI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFA_SAI_FI",
			new String[] {Long.class.getName()},
			new String[] {"farmerStakeholderInfoId"}, true);

		_finderPathCountBygetFA_SAI_FI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFA_SAI_FI",
			new String[] {Long.class.getName()},
			new String[] {"farmerStakeholderInfoId"}, false);

		_finderPathFetchBygetFarmerById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetFarmerById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_finderPathFetchBygetFarmerByStakeInfoId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFarmerByStakeInfoId",
			new String[] {Long.class.getName()},
			new String[] {"farmerStakeholderInfoId"}, true);

		_finderPathCountBygetFarmerByStakeInfoId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFarmerByStakeInfoId",
			new String[] {Long.class.getName()},
			new String[] {"farmerStakeholderInfoId"}, false);

		_setFarmerStakeholderAddressUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerStakeholderAddressUtilPersistence(null);

		entityCache.removeCache(FarmerStakeholderAddressImpl.class.getName());
	}

	private void _setFarmerStakeholderAddressUtilPersistence(
		FarmerStakeholderAddressPersistence
			farmerStakeholderAddressPersistence) {

		try {
			Field field = FarmerStakeholderAddressUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmerStakeholderAddressPersistence);
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

	private static final String _SQL_SELECT_FARMERSTAKEHOLDERADDRESS =
		"SELECT farmerStakeholderAddress FROM FarmerStakeholderAddress farmerStakeholderAddress";

	private static final String _SQL_SELECT_FARMERSTAKEHOLDERADDRESS_WHERE =
		"SELECT farmerStakeholderAddress FROM FarmerStakeholderAddress farmerStakeholderAddress WHERE ";

	private static final String _SQL_COUNT_FARMERSTAKEHOLDERADDRESS =
		"SELECT COUNT(farmerStakeholderAddress) FROM FarmerStakeholderAddress farmerStakeholderAddress";

	private static final String _SQL_COUNT_FARMERSTAKEHOLDERADDRESS_WHERE =
		"SELECT COUNT(farmerStakeholderAddress) FROM FarmerStakeholderAddress farmerStakeholderAddress WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"farmerStakeholderAddress.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerStakeholderAddress exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerStakeholderAddress exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerStakeholderAddressPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerStakeholderAddressModelArgumentsResolver
		_farmerStakeholderAddressModelArgumentsResolver;

}