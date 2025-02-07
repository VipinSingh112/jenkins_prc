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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjProductServiceDetailException;
import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetail;
import com.nbp.ncbj.application.form.service.model.NcbjProductServiceDetailTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjProductServiceDetailImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjProductServiceDetailModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjProductServiceDetailPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjProductServiceDetailUtil;
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
 * The persistence implementation for the ncbj product service detail service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjProductServiceDetailPersistence.class)
public class NcbjProductServiceDetailPersistenceImpl
	extends BasePersistenceImpl<NcbjProductServiceDetail>
	implements NcbjProductServiceDetailPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjProductServiceDetailUtil</code> to access the ncbj product service detail persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjProductServiceDetailImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNCBJ_ById;
	private FinderPath _finderPathCountBygetNCBJ_ById;

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjProductServiceDetailException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	@Override
	public NcbjProductServiceDetail findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjProductServiceDetailException {

		NcbjProductServiceDetail ncbjProductServiceDetail = fetchBygetNCBJ_ById(
			ncbjApplicationId);

		if (ncbjProductServiceDetail == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjProductServiceDetailException(sb.toString());
		}

		return ncbjProductServiceDetail;
	}

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	@Override
	public NcbjProductServiceDetail fetchBygetNCBJ_ById(
		long ncbjApplicationId) {

		return fetchBygetNCBJ_ById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj product service detail where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	@Override
	public NcbjProductServiceDetail fetchBygetNCBJ_ById(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJ_ById, finderArgs, this);
		}

		if (result instanceof NcbjProductServiceDetail) {
			NcbjProductServiceDetail ncbjProductServiceDetail =
				(NcbjProductServiceDetail)result;

			if (ncbjApplicationId !=
					ncbjProductServiceDetail.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJPRODUCTSERVICEDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjProductServiceDetail> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJ_ById, finderArgs, list);
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
								"NcbjProductServiceDetailPersistenceImpl.fetchBygetNCBJ_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjProductServiceDetail ncbjProductServiceDetail =
						list.get(0);

					result = ncbjProductServiceDetail;

					cacheResult(ncbjProductServiceDetail);
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
			return (NcbjProductServiceDetail)result;
		}
	}

	/**
	 * Removes the ncbj product service detail where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj product service detail that was removed
	 */
	@Override
	public NcbjProductServiceDetail removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjProductServiceDetailException {

		NcbjProductServiceDetail ncbjProductServiceDetail = findBygetNCBJ_ById(
			ncbjApplicationId);

		return remove(ncbjProductServiceDetail);
	}

	/**
	 * Returns the number of ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj product service details
	 */
	@Override
	public int countBygetNCBJ_ById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJPRODUCTSERVICEDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2 =
			"ncbjProductServiceDetail.ncbjApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetNCBJ_ByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetNCBJ_ByAppId;
	private FinderPath _finderPathCountBygetNCBJ_ByAppId;

	/**
	 * Returns all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj product service details
	 */
	@Override
	public List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId) {

		return findBygetNCBJ_ByAppId(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @return the range of matching ncbj product service details
	 */
	@Override
	public List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end) {

		return findBygetNCBJ_ByAppId(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj product service details
	 */
	@Override
	public List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		return findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj product service details
	 */
	@Override
	public List<NcbjProductServiceDetail> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNCBJ_ByAppId;
				finderArgs = new Object[] {ncbjApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNCBJ_ByAppId;
			finderArgs = new Object[] {
				ncbjApplicationId, start, end, orderByComparator
			};
		}

		List<NcbjProductServiceDetail> list = null;

		if (useFinderCache) {
			list = (List<NcbjProductServiceDetail>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjProductServiceDetail ncbjProductServiceDetail : list) {
					if (ncbjApplicationId !=
							ncbjProductServiceDetail.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJPRODUCTSERVICEDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjProductServiceDetailModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjProductServiceDetail>)QueryUtil.list(
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
	 * Returns the first ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	@Override
	public NcbjProductServiceDetail findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjProductServiceDetail> orderByComparator)
		throws NoSuchNcbjProductServiceDetailException {

		NcbjProductServiceDetail ncbjProductServiceDetail =
			fetchBygetNCBJ_ByAppId_First(ncbjApplicationId, orderByComparator);

		if (ncbjProductServiceDetail != null) {
			return ncbjProductServiceDetail;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjProductServiceDetailException(sb.toString());
	}

	/**
	 * Returns the first ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	@Override
	public NcbjProductServiceDetail fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		List<NcbjProductServiceDetail> list = findBygetNCBJ_ByAppId(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a matching ncbj product service detail could not be found
	 */
	@Override
	public NcbjProductServiceDetail findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjProductServiceDetail> orderByComparator)
		throws NoSuchNcbjProductServiceDetailException {

		NcbjProductServiceDetail ncbjProductServiceDetail =
			fetchBygetNCBJ_ByAppId_Last(ncbjApplicationId, orderByComparator);

		if (ncbjProductServiceDetail != null) {
			return ncbjProductServiceDetail;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjProductServiceDetailException(sb.toString());
	}

	/**
	 * Returns the last ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj product service detail, or <code>null</code> if a matching ncbj product service detail could not be found
	 */
	@Override
	public NcbjProductServiceDetail fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		int count = countBygetNCBJ_ByAppId(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjProductServiceDetail> list = findBygetNCBJ_ByAppId(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj product service details before and after the current ncbj product service detail in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the current ncbj product service detail
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	@Override
	public NcbjProductServiceDetail[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjProductServiceDetailId, long ncbjApplicationId,
			OrderByComparator<NcbjProductServiceDetail> orderByComparator)
		throws NoSuchNcbjProductServiceDetailException {

		NcbjProductServiceDetail ncbjProductServiceDetail = findByPrimaryKey(
			ncbjProductServiceDetailId);

		Session session = null;

		try {
			session = openSession();

			NcbjProductServiceDetail[] array =
				new NcbjProductServiceDetailImpl[3];

			array[0] = getBygetNCBJ_ByAppId_PrevAndNext(
				session, ncbjProductServiceDetail, ncbjApplicationId,
				orderByComparator, true);

			array[1] = ncbjProductServiceDetail;

			array[2] = getBygetNCBJ_ByAppId_PrevAndNext(
				session, ncbjProductServiceDetail, ncbjApplicationId,
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

	protected NcbjProductServiceDetail getBygetNCBJ_ByAppId_PrevAndNext(
		Session session, NcbjProductServiceDetail ncbjProductServiceDetail,
		long ncbjApplicationId,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJPRODUCTSERVICEDETAIL_WHERE);

		sb.append(_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2);

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
			sb.append(NcbjProductServiceDetailModelImpl.ORDER_BY_JPQL);
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
						ncbjProductServiceDetail)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjProductServiceDetail> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj product service details where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNCBJ_ByAppId(long ncbjApplicationId) {
		for (NcbjProductServiceDetail ncbjProductServiceDetail :
				findBygetNCBJ_ByAppId(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjProductServiceDetail);
		}
	}

	/**
	 * Returns the number of ncbj product service details where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj product service details
	 */
	@Override
	public int countBygetNCBJ_ByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJPRODUCTSERVICEDETAIL_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2 =
			"ncbjProductServiceDetail.ncbjApplicationId = ?";

	public NcbjProductServiceDetailPersistenceImpl() {
		setModelClass(NcbjProductServiceDetail.class);

		setModelImplClass(NcbjProductServiceDetailImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjProductServiceDetailTable.INSTANCE);
	}

	/**
	 * Caches the ncbj product service detail in the entity cache if it is enabled.
	 *
	 * @param ncbjProductServiceDetail the ncbj product service detail
	 */
	@Override
	public void cacheResult(NcbjProductServiceDetail ncbjProductServiceDetail) {
		entityCache.putResult(
			NcbjProductServiceDetailImpl.class,
			ncbjProductServiceDetail.getPrimaryKey(), ncbjProductServiceDetail);

		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById,
			new Object[] {ncbjProductServiceDetail.getNcbjApplicationId()},
			ncbjProductServiceDetail);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj product service details in the entity cache if it is enabled.
	 *
	 * @param ncbjProductServiceDetails the ncbj product service details
	 */
	@Override
	public void cacheResult(
		List<NcbjProductServiceDetail> ncbjProductServiceDetails) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjProductServiceDetails.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjProductServiceDetail ncbjProductServiceDetail :
				ncbjProductServiceDetails) {

			if (entityCache.getResult(
					NcbjProductServiceDetailImpl.class,
					ncbjProductServiceDetail.getPrimaryKey()) == null) {

				cacheResult(ncbjProductServiceDetail);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj product service details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjProductServiceDetailImpl.class);

		finderCache.clearCache(NcbjProductServiceDetailImpl.class);
	}

	/**
	 * Clears the cache for the ncbj product service detail.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjProductServiceDetail ncbjProductServiceDetail) {
		entityCache.removeResult(
			NcbjProductServiceDetailImpl.class, ncbjProductServiceDetail);
	}

	@Override
	public void clearCache(
		List<NcbjProductServiceDetail> ncbjProductServiceDetails) {

		for (NcbjProductServiceDetail ncbjProductServiceDetail :
				ncbjProductServiceDetails) {

			entityCache.removeResult(
				NcbjProductServiceDetailImpl.class, ncbjProductServiceDetail);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjProductServiceDetailImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjProductServiceDetailImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjProductServiceDetailModelImpl ncbjProductServiceDetailModelImpl) {

		Object[] args = new Object[] {
			ncbjProductServiceDetailModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJ_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById, args,
			ncbjProductServiceDetailModelImpl);
	}

	/**
	 * Creates a new ncbj product service detail with the primary key. Does not add the ncbj product service detail to the database.
	 *
	 * @param ncbjProductServiceDetailId the primary key for the new ncbj product service detail
	 * @return the new ncbj product service detail
	 */
	@Override
	public NcbjProductServiceDetail create(long ncbjProductServiceDetailId) {
		NcbjProductServiceDetail ncbjProductServiceDetail =
			new NcbjProductServiceDetailImpl();

		ncbjProductServiceDetail.setNew(true);
		ncbjProductServiceDetail.setPrimaryKey(ncbjProductServiceDetailId);

		ncbjProductServiceDetail.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return ncbjProductServiceDetail;
	}

	/**
	 * Removes the ncbj product service detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail that was removed
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	@Override
	public NcbjProductServiceDetail remove(long ncbjProductServiceDetailId)
		throws NoSuchNcbjProductServiceDetailException {

		return remove((Serializable)ncbjProductServiceDetailId);
	}

	/**
	 * Removes the ncbj product service detail with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj product service detail
	 * @return the ncbj product service detail that was removed
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	@Override
	public NcbjProductServiceDetail remove(Serializable primaryKey)
		throws NoSuchNcbjProductServiceDetailException {

		Session session = null;

		try {
			session = openSession();

			NcbjProductServiceDetail ncbjProductServiceDetail =
				(NcbjProductServiceDetail)session.get(
					NcbjProductServiceDetailImpl.class, primaryKey);

			if (ncbjProductServiceDetail == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjProductServiceDetailException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjProductServiceDetail);
		}
		catch (NoSuchNcbjProductServiceDetailException noSuchEntityException) {
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
	protected NcbjProductServiceDetail removeImpl(
		NcbjProductServiceDetail ncbjProductServiceDetail) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjProductServiceDetail)) {
				ncbjProductServiceDetail =
					(NcbjProductServiceDetail)session.get(
						NcbjProductServiceDetailImpl.class,
						ncbjProductServiceDetail.getPrimaryKeyObj());
			}

			if (ncbjProductServiceDetail != null) {
				session.delete(ncbjProductServiceDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjProductServiceDetail != null) {
			clearCache(ncbjProductServiceDetail);
		}

		return ncbjProductServiceDetail;
	}

	@Override
	public NcbjProductServiceDetail updateImpl(
		NcbjProductServiceDetail ncbjProductServiceDetail) {

		boolean isNew = ncbjProductServiceDetail.isNew();

		if (!(ncbjProductServiceDetail instanceof
				NcbjProductServiceDetailModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjProductServiceDetail.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjProductServiceDetail);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjProductServiceDetail proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjProductServiceDetail implementation " +
					ncbjProductServiceDetail.getClass());
		}

		NcbjProductServiceDetailModelImpl ncbjProductServiceDetailModelImpl =
			(NcbjProductServiceDetailModelImpl)ncbjProductServiceDetail;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjProductServiceDetail.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjProductServiceDetail.setCreateDate(date);
			}
			else {
				ncbjProductServiceDetail.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjProductServiceDetailModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjProductServiceDetail.setModifiedDate(date);
			}
			else {
				ncbjProductServiceDetail.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjProductServiceDetail);
			}
			else {
				ncbjProductServiceDetail =
					(NcbjProductServiceDetail)session.merge(
						ncbjProductServiceDetail);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjProductServiceDetailImpl.class,
			ncbjProductServiceDetailModelImpl, false, true);

		cacheUniqueFindersCache(ncbjProductServiceDetailModelImpl);

		if (isNew) {
			ncbjProductServiceDetail.setNew(false);
		}

		ncbjProductServiceDetail.resetOriginalValues();

		return ncbjProductServiceDetail;
	}

	/**
	 * Returns the ncbj product service detail with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj product service detail
	 * @return the ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	@Override
	public NcbjProductServiceDetail findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjProductServiceDetailException {

		NcbjProductServiceDetail ncbjProductServiceDetail = fetchByPrimaryKey(
			primaryKey);

		if (ncbjProductServiceDetail == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjProductServiceDetailException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjProductServiceDetail;
	}

	/**
	 * Returns the ncbj product service detail with the primary key or throws a <code>NoSuchNcbjProductServiceDetailException</code> if it could not be found.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail
	 * @throws NoSuchNcbjProductServiceDetailException if a ncbj product service detail with the primary key could not be found
	 */
	@Override
	public NcbjProductServiceDetail findByPrimaryKey(
			long ncbjProductServiceDetailId)
		throws NoSuchNcbjProductServiceDetailException {

		return findByPrimaryKey((Serializable)ncbjProductServiceDetailId);
	}

	/**
	 * Returns the ncbj product service detail with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjProductServiceDetailId the primary key of the ncbj product service detail
	 * @return the ncbj product service detail, or <code>null</code> if a ncbj product service detail with the primary key could not be found
	 */
	@Override
	public NcbjProductServiceDetail fetchByPrimaryKey(
		long ncbjProductServiceDetailId) {

		return fetchByPrimaryKey((Serializable)ncbjProductServiceDetailId);
	}

	/**
	 * Returns all the ncbj product service details.
	 *
	 * @return the ncbj product service details
	 */
	@Override
	public List<NcbjProductServiceDetail> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @return the range of ncbj product service details
	 */
	@Override
	public List<NcbjProductServiceDetail> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj product service details
	 */
	@Override
	public List<NcbjProductServiceDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj product service details.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjProductServiceDetailModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj product service details
	 * @param end the upper bound of the range of ncbj product service details (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj product service details
	 */
	@Override
	public List<NcbjProductServiceDetail> findAll(
		int start, int end,
		OrderByComparator<NcbjProductServiceDetail> orderByComparator,
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

		List<NcbjProductServiceDetail> list = null;

		if (useFinderCache) {
			list = (List<NcbjProductServiceDetail>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJPRODUCTSERVICEDETAIL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJPRODUCTSERVICEDETAIL;

				sql = sql.concat(
					NcbjProductServiceDetailModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjProductServiceDetail>)QueryUtil.list(
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
	 * Removes all the ncbj product service details from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjProductServiceDetail ncbjProductServiceDetail : findAll()) {
			remove(ncbjProductServiceDetail);
		}
	}

	/**
	 * Returns the number of ncbj product service details.
	 *
	 * @return the number of ncbj product service details
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
					_SQL_COUNT_NCBJPRODUCTSERVICEDETAIL);

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
		return "ncbjProductServiceDetailId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJPRODUCTSERVICEDETAIL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjProductServiceDetailModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj product service detail persistence.
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

		_finderPathFetchBygetNCBJ_ById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJ_ById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJ_ById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJ_ById",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		_finderPathWithPaginationFindBygetNCBJ_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNCBJ_ByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetNCBJ_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNCBJ_ByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJ_ByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJ_ByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjProductServiceDetailUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjProductServiceDetailUtil.setPersistence(null);

		entityCache.removeCache(NcbjProductServiceDetailImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJPRODUCTSERVICEDETAIL =
		"SELECT ncbjProductServiceDetail FROM NcbjProductServiceDetail ncbjProductServiceDetail";

	private static final String _SQL_SELECT_NCBJPRODUCTSERVICEDETAIL_WHERE =
		"SELECT ncbjProductServiceDetail FROM NcbjProductServiceDetail ncbjProductServiceDetail WHERE ";

	private static final String _SQL_COUNT_NCBJPRODUCTSERVICEDETAIL =
		"SELECT COUNT(ncbjProductServiceDetail) FROM NcbjProductServiceDetail ncbjProductServiceDetail";

	private static final String _SQL_COUNT_NCBJPRODUCTSERVICEDETAIL_WHERE =
		"SELECT COUNT(ncbjProductServiceDetail) FROM NcbjProductServiceDetail ncbjProductServiceDetail WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjProductServiceDetail.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjProductServiceDetail exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjProductServiceDetail exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjProductServiceDetailPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}