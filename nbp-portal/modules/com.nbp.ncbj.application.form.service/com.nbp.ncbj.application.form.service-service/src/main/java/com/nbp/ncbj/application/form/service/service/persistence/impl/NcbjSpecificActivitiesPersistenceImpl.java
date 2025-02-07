/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSpecificActivitiesException;
import com.nbp.ncbj.application.form.service.model.NcbjSpecificActivities;
import com.nbp.ncbj.application.form.service.model.NcbjSpecificActivitiesTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSpecificActivitiesImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSpecificActivitiesModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSpecificActivitiesPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSpecificActivitiesUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

import java.io.Serializable;

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
 * The persistence implementation for the ncbj specific activities service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjSpecificActivitiesPersistence.class)
public class NcbjSpecificActivitiesPersistenceImpl
	extends BasePersistenceImpl<NcbjSpecificActivities>
	implements NcbjSpecificActivitiesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjSpecificActivitiesUtil</code> to access the ncbj specific activities persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjSpecificActivitiesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetNcbjAppById;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbjAppById;
	private FinderPath _finderPathCountBygetNcbjAppById;

	/**
	 * Returns all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activitieses
	 */
	@Override
	public List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId) {

		return findBygetNcbjAppById(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @return the range of matching ncbj specific activitieses
	 */
	@Override
	public List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end) {

		return findBygetNcbjAppById(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj specific activitieses
	 */
	@Override
	public List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		return findBygetNcbjAppById(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj specific activitieses
	 */
	@Override
	public List<NcbjSpecificActivities> findBygetNcbjAppById(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNcbjAppById;
				finderArgs = new Object[] {ncbjApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbjAppById;
			finderArgs = new Object[] {
				ncbjApplicationId, start, end, orderByComparator
			};
		}

		List<NcbjSpecificActivities> list = null;

		if (useFinderCache) {
			list = (List<NcbjSpecificActivities>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjSpecificActivities ncbjSpecificActivities : list) {
					if (ncbjApplicationId !=
							ncbjSpecificActivities.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJSPECIFICACTIVITIES_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJAPPBYID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjSpecificActivitiesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjSpecificActivities>)QueryUtil.list(
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
	 * Returns the first ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	@Override
	public NcbjSpecificActivities findBygetNcbjAppById_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjSpecificActivities> orderByComparator)
		throws NoSuchNcbjSpecificActivitiesException {

		NcbjSpecificActivities ncbjSpecificActivities =
			fetchBygetNcbjAppById_First(ncbjApplicationId, orderByComparator);

		if (ncbjSpecificActivities != null) {
			return ncbjSpecificActivities;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjSpecificActivitiesException(sb.toString());
	}

	/**
	 * Returns the first ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	@Override
	public NcbjSpecificActivities fetchBygetNcbjAppById_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		List<NcbjSpecificActivities> list = findBygetNcbjAppById(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	@Override
	public NcbjSpecificActivities findBygetNcbjAppById_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjSpecificActivities> orderByComparator)
		throws NoSuchNcbjSpecificActivitiesException {

		NcbjSpecificActivities ncbjSpecificActivities =
			fetchBygetNcbjAppById_Last(ncbjApplicationId, orderByComparator);

		if (ncbjSpecificActivities != null) {
			return ncbjSpecificActivities;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjSpecificActivitiesException(sb.toString());
	}

	/**
	 * Returns the last ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	@Override
	public NcbjSpecificActivities fetchBygetNcbjAppById_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		int count = countBygetNcbjAppById(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjSpecificActivities> list = findBygetNcbjAppById(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj specific activitieses before and after the current ncbj specific activities in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the current ncbj specific activities
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	@Override
	public NcbjSpecificActivities[] findBygetNcbjAppById_PrevAndNext(
			long ncbjSpecificActivitiesId, long ncbjApplicationId,
			OrderByComparator<NcbjSpecificActivities> orderByComparator)
		throws NoSuchNcbjSpecificActivitiesException {

		NcbjSpecificActivities ncbjSpecificActivities = findByPrimaryKey(
			ncbjSpecificActivitiesId);

		Session session = null;

		try {
			session = openSession();

			NcbjSpecificActivities[] array = new NcbjSpecificActivitiesImpl[3];

			array[0] = getBygetNcbjAppById_PrevAndNext(
				session, ncbjSpecificActivities, ncbjApplicationId,
				orderByComparator, true);

			array[1] = ncbjSpecificActivities;

			array[2] = getBygetNcbjAppById_PrevAndNext(
				session, ncbjSpecificActivities, ncbjApplicationId,
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

	protected NcbjSpecificActivities getBygetNcbjAppById_PrevAndNext(
		Session session, NcbjSpecificActivities ncbjSpecificActivities,
		long ncbjApplicationId,
		OrderByComparator<NcbjSpecificActivities> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJSPECIFICACTIVITIES_WHERE);

		sb.append(_FINDER_COLUMN_GETNCBJAPPBYID_NCBJAPPLICATIONID_2);

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
			sb.append(NcbjSpecificActivitiesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(ncbjApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncbjSpecificActivities)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjSpecificActivities> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj specific activitieses where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNcbjAppById(long ncbjApplicationId) {
		for (NcbjSpecificActivities ncbjSpecificActivities :
				findBygetNcbjAppById(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjSpecificActivities);
		}
	}

	/**
	 * Returns the number of ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj specific activitieses
	 */
	@Override
	public int countBygetNcbjAppById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcbjAppById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSPECIFICACTIVITIES_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJAPPBYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETNCBJAPPBYID_NCBJAPPLICATIONID_2 =
			"ncbjSpecificActivities.ncbjApplicationId = ?";

	private FinderPath _finderPathFetchBygetApp_byNcbjID;
	private FinderPath _finderPathCountBygetApp_byNcbjID;

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSpecificActivitiesException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a matching ncbj specific activities could not be found
	 */
	@Override
	public NcbjSpecificActivities findBygetApp_byNcbjID(long ncbjApplicationId)
		throws NoSuchNcbjSpecificActivitiesException {

		NcbjSpecificActivities ncbjSpecificActivities = fetchBygetApp_byNcbjID(
			ncbjApplicationId);

		if (ncbjSpecificActivities == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjSpecificActivitiesException(sb.toString());
		}

		return ncbjSpecificActivities;
	}

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	@Override
	public NcbjSpecificActivities fetchBygetApp_byNcbjID(
		long ncbjApplicationId) {

		return fetchBygetApp_byNcbjID(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj specific activities where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj specific activities, or <code>null</code> if a matching ncbj specific activities could not be found
	 */
	@Override
	public NcbjSpecificActivities fetchBygetApp_byNcbjID(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetApp_byNcbjID, finderArgs, this);
		}

		if (result instanceof NcbjSpecificActivities) {
			NcbjSpecificActivities ncbjSpecificActivities =
				(NcbjSpecificActivities)result;

			if (ncbjApplicationId !=
					ncbjSpecificActivities.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJSPECIFICACTIVITIES_WHERE);

			sb.append(_FINDER_COLUMN_GETAPP_BYNCBJID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjSpecificActivities> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetApp_byNcbjID, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjSpecificActivitiesPersistenceImpl.fetchBygetApp_byNcbjID(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjSpecificActivities ncbjSpecificActivities = list.get(0);

					result = ncbjSpecificActivities;

					cacheResult(ncbjSpecificActivities);
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
			return (NcbjSpecificActivities)result;
		}
	}

	/**
	 * Removes the ncbj specific activities where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj specific activities that was removed
	 */
	@Override
	public NcbjSpecificActivities removeBygetApp_byNcbjID(
			long ncbjApplicationId)
		throws NoSuchNcbjSpecificActivitiesException {

		NcbjSpecificActivities ncbjSpecificActivities = findBygetApp_byNcbjID(
			ncbjApplicationId);

		return remove(ncbjSpecificActivities);
	}

	/**
	 * Returns the number of ncbj specific activitieses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj specific activitieses
	 */
	@Override
	public int countBygetApp_byNcbjID(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetApp_byNcbjID;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSPECIFICACTIVITIES_WHERE);

			sb.append(_FINDER_COLUMN_GETAPP_BYNCBJID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETAPP_BYNCBJID_NCBJAPPLICATIONID_2 =
			"ncbjSpecificActivities.ncbjApplicationId = ?";

	public NcbjSpecificActivitiesPersistenceImpl() {
		setModelClass(NcbjSpecificActivities.class);

		setModelImplClass(NcbjSpecificActivitiesImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjSpecificActivitiesTable.INSTANCE);
	}

	/**
	 * Caches the ncbj specific activities in the entity cache if it is enabled.
	 *
	 * @param ncbjSpecificActivities the ncbj specific activities
	 */
	@Override
	public void cacheResult(NcbjSpecificActivities ncbjSpecificActivities) {
		entityCache.putResult(
			NcbjSpecificActivitiesImpl.class,
			ncbjSpecificActivities.getPrimaryKey(), ncbjSpecificActivities);

		finderCache.putResult(
			_finderPathFetchBygetApp_byNcbjID,
			new Object[] {ncbjSpecificActivities.getNcbjApplicationId()},
			ncbjSpecificActivities);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj specific activitieses in the entity cache if it is enabled.
	 *
	 * @param ncbjSpecificActivitieses the ncbj specific activitieses
	 */
	@Override
	public void cacheResult(
		List<NcbjSpecificActivities> ncbjSpecificActivitieses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjSpecificActivitieses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjSpecificActivities ncbjSpecificActivities :
				ncbjSpecificActivitieses) {

			if (entityCache.getResult(
					NcbjSpecificActivitiesImpl.class,
					ncbjSpecificActivities.getPrimaryKey()) == null) {

				cacheResult(ncbjSpecificActivities);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj specific activitieses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjSpecificActivitiesImpl.class);

		finderCache.clearCache(NcbjSpecificActivitiesImpl.class);
	}

	/**
	 * Clears the cache for the ncbj specific activities.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjSpecificActivities ncbjSpecificActivities) {
		entityCache.removeResult(
			NcbjSpecificActivitiesImpl.class, ncbjSpecificActivities);
	}

	@Override
	public void clearCache(
		List<NcbjSpecificActivities> ncbjSpecificActivitieses) {

		for (NcbjSpecificActivities ncbjSpecificActivities :
				ncbjSpecificActivitieses) {

			entityCache.removeResult(
				NcbjSpecificActivitiesImpl.class, ncbjSpecificActivities);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjSpecificActivitiesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjSpecificActivitiesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjSpecificActivitiesModelImpl ncbjSpecificActivitiesModelImpl) {

		Object[] args = new Object[] {
			ncbjSpecificActivitiesModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetApp_byNcbjID, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetApp_byNcbjID, args,
			ncbjSpecificActivitiesModelImpl);
	}

	/**
	 * Creates a new ncbj specific activities with the primary key. Does not add the ncbj specific activities to the database.
	 *
	 * @param ncbjSpecificActivitiesId the primary key for the new ncbj specific activities
	 * @return the new ncbj specific activities
	 */
	@Override
	public NcbjSpecificActivities create(long ncbjSpecificActivitiesId) {
		NcbjSpecificActivities ncbjSpecificActivities =
			new NcbjSpecificActivitiesImpl();

		ncbjSpecificActivities.setNew(true);
		ncbjSpecificActivities.setPrimaryKey(ncbjSpecificActivitiesId);

		ncbjSpecificActivities.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjSpecificActivities;
	}

	/**
	 * Removes the ncbj specific activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities that was removed
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	@Override
	public NcbjSpecificActivities remove(long ncbjSpecificActivitiesId)
		throws NoSuchNcbjSpecificActivitiesException {

		return remove((Serializable)ncbjSpecificActivitiesId);
	}

	/**
	 * Removes the ncbj specific activities with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj specific activities
	 * @return the ncbj specific activities that was removed
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	@Override
	public NcbjSpecificActivities remove(Serializable primaryKey)
		throws NoSuchNcbjSpecificActivitiesException {

		Session session = null;

		try {
			session = openSession();

			NcbjSpecificActivities ncbjSpecificActivities =
				(NcbjSpecificActivities)session.get(
					NcbjSpecificActivitiesImpl.class, primaryKey);

			if (ncbjSpecificActivities == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjSpecificActivitiesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjSpecificActivities);
		}
		catch (NoSuchNcbjSpecificActivitiesException noSuchEntityException) {
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
	protected NcbjSpecificActivities removeImpl(
		NcbjSpecificActivities ncbjSpecificActivities) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjSpecificActivities)) {
				ncbjSpecificActivities = (NcbjSpecificActivities)session.get(
					NcbjSpecificActivitiesImpl.class,
					ncbjSpecificActivities.getPrimaryKeyObj());
			}

			if (ncbjSpecificActivities != null) {
				session.delete(ncbjSpecificActivities);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjSpecificActivities != null) {
			clearCache(ncbjSpecificActivities);
		}

		return ncbjSpecificActivities;
	}

	@Override
	public NcbjSpecificActivities updateImpl(
		NcbjSpecificActivities ncbjSpecificActivities) {

		boolean isNew = ncbjSpecificActivities.isNew();

		if (!(ncbjSpecificActivities instanceof
				NcbjSpecificActivitiesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjSpecificActivities.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjSpecificActivities);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjSpecificActivities proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjSpecificActivities implementation " +
					ncbjSpecificActivities.getClass());
		}

		NcbjSpecificActivitiesModelImpl ncbjSpecificActivitiesModelImpl =
			(NcbjSpecificActivitiesModelImpl)ncbjSpecificActivities;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjSpecificActivities.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjSpecificActivities.setCreateDate(date);
			}
			else {
				ncbjSpecificActivities.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjSpecificActivitiesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjSpecificActivities.setModifiedDate(date);
			}
			else {
				ncbjSpecificActivities.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjSpecificActivities);
			}
			else {
				ncbjSpecificActivities = (NcbjSpecificActivities)session.merge(
					ncbjSpecificActivities);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjSpecificActivitiesImpl.class, ncbjSpecificActivitiesModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjSpecificActivitiesModelImpl);

		if (isNew) {
			ncbjSpecificActivities.setNew(false);
		}

		ncbjSpecificActivities.resetOriginalValues();

		return ncbjSpecificActivities;
	}

	/**
	 * Returns the ncbj specific activities with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj specific activities
	 * @return the ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	@Override
	public NcbjSpecificActivities findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjSpecificActivitiesException {

		NcbjSpecificActivities ncbjSpecificActivities = fetchByPrimaryKey(
			primaryKey);

		if (ncbjSpecificActivities == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjSpecificActivitiesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjSpecificActivities;
	}

	/**
	 * Returns the ncbj specific activities with the primary key or throws a <code>NoSuchNcbjSpecificActivitiesException</code> if it could not be found.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities
	 * @throws NoSuchNcbjSpecificActivitiesException if a ncbj specific activities with the primary key could not be found
	 */
	@Override
	public NcbjSpecificActivities findByPrimaryKey(
			long ncbjSpecificActivitiesId)
		throws NoSuchNcbjSpecificActivitiesException {

		return findByPrimaryKey((Serializable)ncbjSpecificActivitiesId);
	}

	/**
	 * Returns the ncbj specific activities with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSpecificActivitiesId the primary key of the ncbj specific activities
	 * @return the ncbj specific activities, or <code>null</code> if a ncbj specific activities with the primary key could not be found
	 */
	@Override
	public NcbjSpecificActivities fetchByPrimaryKey(
		long ncbjSpecificActivitiesId) {

		return fetchByPrimaryKey((Serializable)ncbjSpecificActivitiesId);
	}

	/**
	 * Returns all the ncbj specific activitieses.
	 *
	 * @return the ncbj specific activitieses
	 */
	@Override
	public List<NcbjSpecificActivities> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @return the range of ncbj specific activitieses
	 */
	@Override
	public List<NcbjSpecificActivities> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj specific activitieses
	 */
	@Override
	public List<NcbjSpecificActivities> findAll(
		int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj specific activitieses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSpecificActivitiesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj specific activitieses
	 * @param end the upper bound of the range of ncbj specific activitieses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj specific activitieses
	 */
	@Override
	public List<NcbjSpecificActivities> findAll(
		int start, int end,
		OrderByComparator<NcbjSpecificActivities> orderByComparator,
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

		List<NcbjSpecificActivities> list = null;

		if (useFinderCache) {
			list = (List<NcbjSpecificActivities>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJSPECIFICACTIVITIES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJSPECIFICACTIVITIES;

				sql = sql.concat(NcbjSpecificActivitiesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjSpecificActivities>)QueryUtil.list(
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
	 * Removes all the ncbj specific activitieses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjSpecificActivities ncbjSpecificActivities : findAll()) {
			remove(ncbjSpecificActivities);
		}
	}

	/**
	 * Returns the number of ncbj specific activitieses.
	 *
	 * @return the number of ncbj specific activitieses
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
					_SQL_COUNT_NCBJSPECIFICACTIVITIES);

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
		return "ncbjSpecificActivitiesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJSPECIFICACTIVITIES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjSpecificActivitiesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj specific activities persistence.
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

		_finderPathWithPaginationFindBygetNcbjAppById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcbjAppById",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNcbjAppById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNcbjAppById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNcbjAppById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcbjAppById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		_finderPathFetchBygetApp_byNcbjID = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetApp_byNcbjID",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetApp_byNcbjID = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetApp_byNcbjID",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjSpecificActivitiesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjSpecificActivitiesUtil.setPersistence(null);

		entityCache.removeCache(NcbjSpecificActivitiesImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJSPECIFICACTIVITIES =
		"SELECT ncbjSpecificActivities FROM NcbjSpecificActivities ncbjSpecificActivities";

	private static final String _SQL_SELECT_NCBJSPECIFICACTIVITIES_WHERE =
		"SELECT ncbjSpecificActivities FROM NcbjSpecificActivities ncbjSpecificActivities WHERE ";

	private static final String _SQL_COUNT_NCBJSPECIFICACTIVITIES =
		"SELECT COUNT(ncbjSpecificActivities) FROM NcbjSpecificActivities ncbjSpecificActivities";

	private static final String _SQL_COUNT_NCBJSPECIFICACTIVITIES_WHERE =
		"SELECT COUNT(ncbjSpecificActivities) FROM NcbjSpecificActivities ncbjSpecificActivities WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjSpecificActivities.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjSpecificActivities exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjSpecificActivities exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjSpecificActivitiesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}