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

import com.npm.cannabis.application.stages.services.exception.NoSuchCannabisConditionalLicensePreCondtionsException;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicensePreCondtions;
import com.npm.cannabis.application.stages.services.model.CannabisConditionalLicensePreCondtionsTable;
import com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsImpl;
import com.npm.cannabis.application.stages.services.model.impl.CannabisConditionalLicensePreCondtionsModelImpl;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisConditionalLicensePreCondtionsPersistence;
import com.npm.cannabis.application.stages.services.service.persistence.CannabisConditionalLicensePreCondtionsUtil;
import com.npm.cannabis.application.stages.services.service.persistence.impl.constants.CANNABIS_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

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
 * The persistence implementation for the cannabis conditional license pre condtions service.
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
		CannabisConditionalLicensePreCondtionsPersistence.class,
		BasePersistence.class
	}
)
public class CannabisConditionalLicensePreCondtionsPersistenceImpl
	extends BasePersistenceImpl<CannabisConditionalLicensePreCondtions>
	implements CannabisConditionalLicensePreCondtionsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisConditionalLicensePreCondtionsUtil</code> to access the cannabis conditional license pre condtions persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisConditionalLicensePreCondtionsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetCI_CAI;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CAI;
	private FinderPath _finderPathCountBygetCI_CAI;

	/**
	 * Returns all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId) {

		return findBygetCI_CAI(
			cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end) {

		return findBygetCI_CAI(cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		return findBygetCI_CAI(
			cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_CAI(
		long cannabisApplicationId, int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_CAI;
				finderArgs = new Object[] {cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CAI;
			finderArgs = new Object[] {
				cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisConditionalLicensePreCondtions> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisConditionalLicensePreCondtions>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions : list) {

					if (cannabisApplicationId !=
							cannabisConditionalLicensePreCondtions.
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

			sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisConditionalLicensePreCondtionsModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(cannabisApplicationId);

				list =
					(List<CannabisConditionalLicensePreCondtions>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findBygetCI_CAI_First(
			long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = fetchBygetCI_CAI_First(
				cannabisApplicationId, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions fetchBygetCI_CAI_First(
		long cannabisApplicationId,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		List<CannabisConditionalLicensePreCondtions> list = findBygetCI_CAI(
			cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findBygetCI_CAI_Last(
			long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = fetchBygetCI_CAI_Last(
				cannabisApplicationId, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions fetchBygetCI_CAI_Last(
		long cannabisApplicationId,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		int count = countBygetCI_CAI(cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisConditionalLicensePreCondtions> list = findBygetCI_CAI(
			cannabisApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions[] findBygetCI_CAI_PrevAndNext(
			long cannabisPreconditionsId, long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = findByPrimaryKey(
				cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisConditionalLicensePreCondtions[] array =
				new CannabisConditionalLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CAI_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions,
				cannabisApplicationId, orderByComparator, true);

			array[1] = cannabisConditionalLicensePreCondtions;

			array[2] = getBygetCI_CAI_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions,
				cannabisApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisConditionalLicensePreCondtions getBygetCI_CAI_PrevAndNext(
		Session session,
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions,
		long cannabisApplicationId,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

		sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

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
			sb.append(
				CannabisConditionalLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
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
						cannabisConditionalLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConditionalLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where cannabisApplicationId = &#63; from the database.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCI_CAI(long cannabisApplicationId) {
		for (CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions :
					findBygetCI_CAI(
						cannabisApplicationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(cannabisConditionalLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where cannabisApplicationId = &#63;.
	 *
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	@Override
	public int countBygetCI_CAI(long cannabisApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCI_CAI;

		Object[] finderArgs = new Object[] {cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETCI_CAI_CANNABISAPPLICATIONID_2 =
			"cannabisConditionalLicensePreCondtions.cannabisApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CaseId;
	private FinderPath _finderPathCountBygetCI_CaseId;

	/**
	 * Returns all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_CaseId(
		String caseId) {

		return findBygetCI_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end) {

		return findBygetCI_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		return findBygetCI_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<CannabisConditionalLicensePreCondtions> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisConditionalLicensePreCondtions>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions : list) {

					if (!caseId.equals(
							cannabisConditionalLicensePreCondtions.
								getCaseId())) {

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

			sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisConditionalLicensePreCondtionsModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list =
					(List<CannabisConditionalLicensePreCondtions>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findBygetCI_CaseId_First(
			String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = fetchBygetCI_CaseId_First(
				caseId, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions fetchBygetCI_CaseId_First(
		String caseId,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		List<CannabisConditionalLicensePreCondtions> list = findBygetCI_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findBygetCI_CaseId_Last(
			String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = fetchBygetCI_CaseId_Last(
				caseId, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions fetchBygetCI_CaseId_Last(
		String caseId,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		int count = countBygetCI_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisConditionalLicensePreCondtions> list = findBygetCI_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseId_PrevAndNext(
				long cannabisPreconditionsId, String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		caseId = Objects.toString(caseId, "");

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = findByPrimaryKey(
				cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisConditionalLicensePreCondtions[] array =
				new CannabisConditionalLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CaseId_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions, caseId,
				orderByComparator, true);

			array[1] = cannabisConditionalLicensePreCondtions;

			array[2] = getBygetCI_CaseId_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions, caseId,
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

	protected CannabisConditionalLicensePreCondtions
		getBygetCI_CaseId_PrevAndNext(
			Session session,
			CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions,
			String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
		}

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
			sb.append(
				CannabisConditionalLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisConditionalLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConditionalLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCI_CaseId(String caseId) {
		for (CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions :
					findBygetCI_CaseId(
						caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisConditionalLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	@Override
	public int countBygetCI_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETCI_CASEID_CASEID_2 =
		"cannabisConditionalLicensePreCondtions.caseId = ?";

	private static final String _FINDER_COLUMN_GETCI_CASEID_CASEID_3 =
		"(cannabisConditionalLicensePreCondtions.caseId IS NULL OR cannabisConditionalLicensePreCondtions.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_Status;
	private FinderPath _finderPathCountBygetCI_Status;

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_Status(
		String status) {

		return findBygetCI_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end) {

		return findBygetCI_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		return findBygetCI_Status(status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findBygetCI_Status(
		String status, int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator,
		boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCI_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<CannabisConditionalLicensePreCondtions> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisConditionalLicensePreCondtions>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions : list) {

					if (!status.equals(
							cannabisConditionalLicensePreCondtions.
								getStatus())) {

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

			sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisConditionalLicensePreCondtionsModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				list =
					(List<CannabisConditionalLicensePreCondtions>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findBygetCI_Status_First(
			String status,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = fetchBygetCI_Status_First(
				status, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions fetchBygetCI_Status_First(
		String status,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		List<CannabisConditionalLicensePreCondtions> list = findBygetCI_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findBygetCI_Status_Last(
			String status,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = fetchBygetCI_Status_Last(
				status, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions fetchBygetCI_Status_Last(
		String status,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		int count = countBygetCI_Status(status);

		if (count == 0) {
			return null;
		}

		List<CannabisConditionalLicensePreCondtions> list = findBygetCI_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions[]
			findBygetCI_Status_PrevAndNext(
				long cannabisPreconditionsId, String status,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		status = Objects.toString(status, "");

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = findByPrimaryKey(
				cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisConditionalLicensePreCondtions[] array =
				new CannabisConditionalLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_Status_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions, status,
				orderByComparator, true);

			array[1] = cannabisConditionalLicensePreCondtions;

			array[2] = getBygetCI_Status_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions, status,
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

	protected CannabisConditionalLicensePreCondtions
		getBygetCI_Status_PrevAndNext(
			Session session,
			CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions,
			String status,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
		}

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
			sb.append(
				CannabisConditionalLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisConditionalLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConditionalLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetCI_Status(String status) {
		for (CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions :
					findBygetCI_Status(
						status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisConditionalLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	@Override
	public int countBygetCI_Status(String status) {
		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCI_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_STATUS_STATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

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

	private static final String _FINDER_COLUMN_GETCI_STATUS_STATUS_2 =
		"cannabisConditionalLicensePreCondtions.status = ?";

	private static final String _FINDER_COLUMN_GETCI_STATUS_STATUS_3 =
		"(cannabisConditionalLicensePreCondtions.status IS NULL OR cannabisConditionalLicensePreCondtions.status = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetCI_CaseIdStatus;
	private FinderPath _finderPathCountBygetCI_CaseIdStatus;

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(String status, String caseId) {

		return findBygetCI_CaseIdStatus(
			status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end) {

		return findBygetCI_CaseIdStatus(status, caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return findBygetCI_CaseIdStatus(
			status, caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdStatus(
			String status, String caseId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
			boolean useFinderCache) {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCI_CaseIdStatus;
				finderArgs = new Object[] {status, caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCI_CaseIdStatus;
			finderArgs = new Object[] {
				status, caseId, start, end, orderByComparator
			};
		}

		List<CannabisConditionalLicensePreCondtions> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisConditionalLicensePreCondtions>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions : list) {

					if (!status.equals(
							cannabisConditionalLicensePreCondtions.
								getStatus()) ||
						!caseId.equals(
							cannabisConditionalLicensePreCondtions.
								getCaseId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisConditionalLicensePreCondtionsModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list =
					(List<CannabisConditionalLicensePreCondtions>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdStatus_First(
				String status, String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions =
				fetchBygetCI_CaseIdStatus_First(
					status, caseId, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdStatus_First(
			String status, String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		List<CannabisConditionalLicensePreCondtions> list =
			findBygetCI_CaseIdStatus(status, caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions =
				fetchBygetCI_CaseIdStatus_Last(
					status, caseId, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdStatus_Last(
			String status, String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		int count = countBygetCI_CaseIdStatus(status, caseId);

		if (count == 0) {
			return null;
		}

		List<CannabisConditionalLicensePreCondtions> list =
			findBygetCI_CaseIdStatus(
				status, caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63; and caseId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseIdStatus_PrevAndNext(
				long cannabisPreconditionsId, String status, String caseId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = findByPrimaryKey(
				cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisConditionalLicensePreCondtions[] array =
				new CannabisConditionalLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CaseIdStatus_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions, status, caseId,
				orderByComparator, true);

			array[1] = cannabisConditionalLicensePreCondtions;

			array[2] = getBygetCI_CaseIdStatus_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions, status, caseId,
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

	protected CannabisConditionalLicensePreCondtions
		getBygetCI_CaseIdStatus_PrevAndNext(
			Session session,
			CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions,
			String status, String caseId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
		}

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
		}

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
			sb.append(
				CannabisConditionalLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisConditionalLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConditionalLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; and caseId = &#63; from the database.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCI_CaseIdStatus(String status, String caseId) {
		for (CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions :
					findBygetCI_CaseIdStatus(
						status, caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
						null)) {

			remove(cannabisConditionalLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63; and caseId = &#63;.
	 *
	 * @param status the status
	 * @param caseId the case ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	@Override
	public int countBygetCI_CaseIdStatus(String status, String caseId) {
		status = Objects.toString(status, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseIdStatus;

		Object[] finderArgs = new Object[] {status, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

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

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_2 =
		"cannabisConditionalLicensePreCondtions.status = ? AND ";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_STATUS_3 =
		"(cannabisConditionalLicensePreCondtions.status IS NULL OR cannabisConditionalLicensePreCondtions.status = '') AND ";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_2 =
		"cannabisConditionalLicensePreCondtions.caseId = ?";

	private static final String _FINDER_COLUMN_GETCI_CASEIDSTATUS_CASEID_3 =
		"(cannabisConditionalLicensePreCondtions.caseId IS NULL OR cannabisConditionalLicensePreCondtions.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetCI_CaseIdApplicationId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId;
	private FinderPath _finderPathCountBygetCI_CaseIdApplicationId;

	/**
	 * Returns all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		return findBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions>
		findBygetCI_CaseIdApplicationId(
			String status, long cannabisApplicationId, int start, int end,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
			boolean useFinderCache) {

		status = Objects.toString(status, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId;
				finderArgs = new Object[] {status, cannabisApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCI_CaseIdApplicationId;
			finderArgs = new Object[] {
				status, cannabisApplicationId, start, end, orderByComparator
			};
		}

		List<CannabisConditionalLicensePreCondtions> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisConditionalLicensePreCondtions>)
					finderCache.getResult(finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisConditionalLicensePreCondtions
						cannabisConditionalLicensePreCondtions : list) {

					if (!status.equals(
							cannabisConditionalLicensePreCondtions.
								getStatus()) ||
						(cannabisApplicationId !=
							cannabisConditionalLicensePreCondtions.
								getCannabisApplicationId())) {

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
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(
					CannabisConditionalLicensePreCondtionsModelImpl.
						ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

				queryPos.add(cannabisApplicationId);

				list =
					(List<CannabisConditionalLicensePreCondtions>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdApplicationId_First(
				String status, long cannabisApplicationId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions =
				fetchBygetCI_CaseIdApplicationId_First(
					status, cannabisApplicationId, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the first cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdApplicationId_First(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		List<CannabisConditionalLicensePreCondtions> list =
			findBygetCI_CaseIdApplicationId(
				status, cannabisApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions
			findBygetCI_CaseIdApplicationId_Last(
				String status, long cannabisApplicationId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions =
				fetchBygetCI_CaseIdApplicationId_Last(
					status, cannabisApplicationId, orderByComparator);

		if (cannabisConditionalLicensePreCondtions != null) {
			return cannabisConditionalLicensePreCondtions;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", cannabisApplicationId=");
		sb.append(cannabisApplicationId);

		sb.append("}");

		throw new NoSuchCannabisConditionalLicensePreCondtionsException(
			sb.toString());
	}

	/**
	 * Returns the last cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis conditional license pre condtions, or <code>null</code> if a matching cannabis conditional license pre condtions could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions
		fetchBygetCI_CaseIdApplicationId_Last(
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator) {

		int count = countBygetCI_CaseIdApplicationId(
			status, cannabisApplicationId);

		if (count == 0) {
			return null;
		}

		List<CannabisConditionalLicensePreCondtions> list =
			findBygetCI_CaseIdApplicationId(
				status, cannabisApplicationId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis conditional license pre condtionses before and after the current cannabis conditional license pre condtions in the ordered set where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param cannabisPreconditionsId the primary key of the current cannabis conditional license pre condtions
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions[]
			findBygetCI_CaseIdApplicationId_PrevAndNext(
				long cannabisPreconditionsId, String status,
				long cannabisApplicationId,
				OrderByComparator<CannabisConditionalLicensePreCondtions>
					orderByComparator)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		status = Objects.toString(status, "");

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = findByPrimaryKey(
				cannabisPreconditionsId);

		Session session = null;

		try {
			session = openSession();

			CannabisConditionalLicensePreCondtions[] array =
				new CannabisConditionalLicensePreCondtionsImpl[3];

			array[0] = getBygetCI_CaseIdApplicationId_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions, status,
				cannabisApplicationId, orderByComparator, true);

			array[1] = cannabisConditionalLicensePreCondtions;

			array[2] = getBygetCI_CaseIdApplicationId_PrevAndNext(
				session, cannabisConditionalLicensePreCondtions, status,
				cannabisApplicationId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisConditionalLicensePreCondtions
		getBygetCI_CaseIdApplicationId_PrevAndNext(
			Session session,
			CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions,
			String status, long cannabisApplicationId,
			OrderByComparator<CannabisConditionalLicensePreCondtions>
				orderByComparator,
			boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

		boolean bindStatus = false;

		if (status.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
		}
		else {
			bindStatus = true;

			sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
		}

		sb.append(
			_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

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
			sb.append(
				CannabisConditionalLicensePreCondtionsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStatus) {
			queryPos.add(status);
		}

		queryPos.add(cannabisApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisConditionalLicensePreCondtions)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisConditionalLicensePreCondtions> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63; from the database.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 */
	@Override
	public void removeBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		for (CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions :
					findBygetCI_CaseIdApplicationId(
						status, cannabisApplicationId, QueryUtil.ALL_POS,
						QueryUtil.ALL_POS, null)) {

			remove(cannabisConditionalLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses where status = &#63; and cannabisApplicationId = &#63;.
	 *
	 * @param status the status
	 * @param cannabisApplicationId the cannabis application ID
	 * @return the number of matching cannabis conditional license pre condtionses
	 */
	@Override
	public int countBygetCI_CaseIdApplicationId(
		String status, long cannabisApplicationId) {

		status = Objects.toString(status, "");

		FinderPath finderPath = _finderPathCountBygetCI_CaseIdApplicationId;

		Object[] finderArgs = new Object[] {status, cannabisApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE);

			boolean bindStatus = false;

			if (status.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3);
			}
			else {
				bindStatus = true;

				sb.append(_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2);
			}

			sb.append(
				_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStatus) {
					queryPos.add(status);
				}

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
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_2 =
			"cannabisConditionalLicensePreCondtions.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_STATUS_3 =
			"(cannabisConditionalLicensePreCondtions.status IS NULL OR cannabisConditionalLicensePreCondtions.status = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCI_CASEIDAPPLICATIONID_CANNABISAPPLICATIONID_2 =
			"cannabisConditionalLicensePreCondtions.cannabisApplicationId = ?";

	public CannabisConditionalLicensePreCondtionsPersistenceImpl() {
		setModelClass(CannabisConditionalLicensePreCondtions.class);

		setModelImplClass(CannabisConditionalLicensePreCondtionsImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisConditionalLicensePreCondtionsTable.INSTANCE);
	}

	/**
	 * Caches the cannabis conditional license pre condtions in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicensePreCondtions the cannabis conditional license pre condtions
	 */
	@Override
	public void cacheResult(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions) {

		entityCache.putResult(
			CannabisConditionalLicensePreCondtionsImpl.class,
			cannabisConditionalLicensePreCondtions.getPrimaryKey(),
			cannabisConditionalLicensePreCondtions);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis conditional license pre condtionses in the entity cache if it is enabled.
	 *
	 * @param cannabisConditionalLicensePreCondtionses the cannabis conditional license pre condtionses
	 */
	@Override
	public void cacheResult(
		List<CannabisConditionalLicensePreCondtions>
			cannabisConditionalLicensePreCondtionses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisConditionalLicensePreCondtionses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions :
					cannabisConditionalLicensePreCondtionses) {

			if (entityCache.getResult(
					CannabisConditionalLicensePreCondtionsImpl.class,
					cannabisConditionalLicensePreCondtions.getPrimaryKey()) ==
						null) {

				cacheResult(cannabisConditionalLicensePreCondtions);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(
			CannabisConditionalLicensePreCondtionsImpl.class);

		finderCache.clearCache(
			CannabisConditionalLicensePreCondtionsImpl.class);
	}

	/**
	 * Clears the cache for the cannabis conditional license pre condtions.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions) {

		entityCache.removeResult(
			CannabisConditionalLicensePreCondtionsImpl.class,
			cannabisConditionalLicensePreCondtions);
	}

	@Override
	public void clearCache(
		List<CannabisConditionalLicensePreCondtions>
			cannabisConditionalLicensePreCondtionses) {

		for (CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions :
					cannabisConditionalLicensePreCondtionses) {

			entityCache.removeResult(
				CannabisConditionalLicensePreCondtionsImpl.class,
				cannabisConditionalLicensePreCondtions);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(
			CannabisConditionalLicensePreCondtionsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisConditionalLicensePreCondtionsImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new cannabis conditional license pre condtions with the primary key. Does not add the cannabis conditional license pre condtions to the database.
	 *
	 * @param cannabisPreconditionsId the primary key for the new cannabis conditional license pre condtions
	 * @return the new cannabis conditional license pre condtions
	 */
	@Override
	public CannabisConditionalLicensePreCondtions create(
		long cannabisPreconditionsId) {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions =
				new CannabisConditionalLicensePreCondtionsImpl();

		cannabisConditionalLicensePreCondtions.setNew(true);
		cannabisConditionalLicensePreCondtions.setPrimaryKey(
			cannabisPreconditionsId);

		cannabisConditionalLicensePreCondtions.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return cannabisConditionalLicensePreCondtions;
	}

	/**
	 * Removes the cannabis conditional license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions that was removed
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions remove(
			long cannabisPreconditionsId)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		return remove((Serializable)cannabisPreconditionsId);
	}

	/**
	 * Removes the cannabis conditional license pre condtions with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions that was removed
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions remove(
			Serializable primaryKey)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		Session session = null;

		try {
			session = openSession();

			CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions =
					(CannabisConditionalLicensePreCondtions)session.get(
						CannabisConditionalLicensePreCondtionsImpl.class,
						primaryKey);

			if (cannabisConditionalLicensePreCondtions == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisConditionalLicensePreCondtionsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisConditionalLicensePreCondtions);
		}
		catch (NoSuchCannabisConditionalLicensePreCondtionsException
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
	protected CannabisConditionalLicensePreCondtions removeImpl(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisConditionalLicensePreCondtions)) {
				cannabisConditionalLicensePreCondtions =
					(CannabisConditionalLicensePreCondtions)session.get(
						CannabisConditionalLicensePreCondtionsImpl.class,
						cannabisConditionalLicensePreCondtions.
							getPrimaryKeyObj());
			}

			if (cannabisConditionalLicensePreCondtions != null) {
				session.delete(cannabisConditionalLicensePreCondtions);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisConditionalLicensePreCondtions != null) {
			clearCache(cannabisConditionalLicensePreCondtions);
		}

		return cannabisConditionalLicensePreCondtions;
	}

	@Override
	public CannabisConditionalLicensePreCondtions updateImpl(
		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions) {

		boolean isNew = cannabisConditionalLicensePreCondtions.isNew();

		if (!(cannabisConditionalLicensePreCondtions instanceof
				CannabisConditionalLicensePreCondtionsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					cannabisConditionalLicensePreCondtions.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisConditionalLicensePreCondtions);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisConditionalLicensePreCondtions proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisConditionalLicensePreCondtions implementation " +
					cannabisConditionalLicensePreCondtions.getClass());
		}

		CannabisConditionalLicensePreCondtionsModelImpl
			cannabisConditionalLicensePreCondtionsModelImpl =
				(CannabisConditionalLicensePreCondtionsModelImpl)
					cannabisConditionalLicensePreCondtions;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew &&
			(cannabisConditionalLicensePreCondtions.getCreateDate() == null)) {

			if (serviceContext == null) {
				cannabisConditionalLicensePreCondtions.setCreateDate(date);
			}
			else {
				cannabisConditionalLicensePreCondtions.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisConditionalLicensePreCondtionsModelImpl.
				hasSetModifiedDate()) {

			if (serviceContext == null) {
				cannabisConditionalLicensePreCondtions.setModifiedDate(date);
			}
			else {
				cannabisConditionalLicensePreCondtions.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisConditionalLicensePreCondtions);
			}
			else {
				cannabisConditionalLicensePreCondtions =
					(CannabisConditionalLicensePreCondtions)session.merge(
						cannabisConditionalLicensePreCondtions);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisConditionalLicensePreCondtionsImpl.class,
			cannabisConditionalLicensePreCondtionsModelImpl, false, true);

		if (isNew) {
			cannabisConditionalLicensePreCondtions.setNew(false);
		}

		cannabisConditionalLicensePreCondtions.resetOriginalValues();

		return cannabisConditionalLicensePreCondtions;
	}

	/**
	 * Returns the cannabis conditional license pre condtions with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		CannabisConditionalLicensePreCondtions
			cannabisConditionalLicensePreCondtions = fetchByPrimaryKey(
				primaryKey);

		if (cannabisConditionalLicensePreCondtions == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisConditionalLicensePreCondtionsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisConditionalLicensePreCondtions;
	}

	/**
	 * Returns the cannabis conditional license pre condtions with the primary key or throws a <code>NoSuchCannabisConditionalLicensePreCondtionsException</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions
	 * @throws NoSuchCannabisConditionalLicensePreCondtionsException if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions findByPrimaryKey(
			long cannabisPreconditionsId)
		throws NoSuchCannabisConditionalLicensePreCondtionsException {

		return findByPrimaryKey((Serializable)cannabisPreconditionsId);
	}

	/**
	 * Returns the cannabis conditional license pre condtions with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisPreconditionsId the primary key of the cannabis conditional license pre condtions
	 * @return the cannabis conditional license pre condtions, or <code>null</code> if a cannabis conditional license pre condtions with the primary key could not be found
	 */
	@Override
	public CannabisConditionalLicensePreCondtions fetchByPrimaryKey(
		long cannabisPreconditionsId) {

		return fetchByPrimaryKey((Serializable)cannabisPreconditionsId);
	}

	/**
	 * Returns all the cannabis conditional license pre condtionses.
	 *
	 * @return the cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @return the range of cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end) {

		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis conditional license pre condtionses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisConditionalLicensePreCondtionsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis conditional license pre condtionses
	 * @param end the upper bound of the range of cannabis conditional license pre condtionses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis conditional license pre condtionses
	 */
	@Override
	public List<CannabisConditionalLicensePreCondtions> findAll(
		int start, int end,
		OrderByComparator<CannabisConditionalLicensePreCondtions>
			orderByComparator,
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

		List<CannabisConditionalLicensePreCondtions> list = null;

		if (useFinderCache) {
			list =
				(List<CannabisConditionalLicensePreCondtions>)
					finderCache.getResult(finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS;

				sql = sql.concat(
					CannabisConditionalLicensePreCondtionsModelImpl.
						ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list =
					(List<CannabisConditionalLicensePreCondtions>)
						QueryUtil.list(query, getDialect(), start, end);

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
	 * Removes all the cannabis conditional license pre condtionses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisConditionalLicensePreCondtions
				cannabisConditionalLicensePreCondtions : findAll()) {

			remove(cannabisConditionalLicensePreCondtions);
		}
	}

	/**
	 * Returns the number of cannabis conditional license pre condtionses.
	 *
	 * @return the number of cannabis conditional license pre condtionses
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
					_SQL_COUNT_CANNABISCONDITIONALLICENSEPRECONDTIONS);

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
		return "cannabisPreconditionsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisConditionalLicensePreCondtionsModelImpl.
			TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis conditional license pre condtions persistence.
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

		_finderPathWithPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CAI",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, true);

		_finderPathCountBygetCI_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_CAI",
			new String[] {Long.class.getName()},
			new String[] {"cannabisApplicationId"}, false);

		_finderPathWithPaginationFindBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCI_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_Status",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetCI_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCI_Status",
			new String[] {String.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCI_CaseIdStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "caseId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetCI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, true);

		_finderPathCountBygetCI_CaseIdStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCI_CaseIdStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"status", "caseId"}, false);

		_finderPathWithPaginationFindBygetCI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCI_CaseIdApplicationId",
				new String[] {
					String.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "cannabisApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetCI_CaseIdApplicationId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCI_CaseIdApplicationId",
				new String[] {String.class.getName(), Long.class.getName()},
				new String[] {"status", "cannabisApplicationId"}, true);

		_finderPathCountBygetCI_CaseIdApplicationId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCI_CaseIdApplicationId",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"status", "cannabisApplicationId"}, false);

		_setCannabisConditionalLicensePreCondtionsUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setCannabisConditionalLicensePreCondtionsUtilPersistence(null);

		entityCache.removeCache(
			CannabisConditionalLicensePreCondtionsImpl.class.getName());
	}

	private void _setCannabisConditionalLicensePreCondtionsUtilPersistence(
		CannabisConditionalLicensePreCondtionsPersistence
			cannabisConditionalLicensePreCondtionsPersistence) {

		try {
			Field field =
				CannabisConditionalLicensePreCondtionsUtil.class.
					getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, cannabisConditionalLicensePreCondtionsPersistence);
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

	private static final String
		_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS =
			"SELECT cannabisConditionalLicensePreCondtions FROM CannabisConditionalLicensePreCondtions cannabisConditionalLicensePreCondtions";

	private static final String
		_SQL_SELECT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE =
			"SELECT cannabisConditionalLicensePreCondtions FROM CannabisConditionalLicensePreCondtions cannabisConditionalLicensePreCondtions WHERE ";

	private static final String
		_SQL_COUNT_CANNABISCONDITIONALLICENSEPRECONDTIONS =
			"SELECT COUNT(cannabisConditionalLicensePreCondtions) FROM CannabisConditionalLicensePreCondtions cannabisConditionalLicensePreCondtions";

	private static final String
		_SQL_COUNT_CANNABISCONDITIONALLICENSEPRECONDTIONS_WHERE =
			"SELECT COUNT(cannabisConditionalLicensePreCondtions) FROM CannabisConditionalLicensePreCondtions cannabisConditionalLicensePreCondtions WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisConditionalLicensePreCondtions.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisConditionalLicensePreCondtions exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisConditionalLicensePreCondtions exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisConditionalLicensePreCondtionsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private CannabisConditionalLicensePreCondtionsModelArgumentsResolver
		_cannabisConditionalLicensePreCondtionsModelArgumentsResolver;

}