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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionDetailAddException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAdd;
import com.nbp.ncbj.application.form.service.model.NcbjSectionDetailAddTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionDetailAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionDetailAddUtil;
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
 * The persistence implementation for the ncbj section detail add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjSectionDetailAddPersistence.class)
public class NcbjSectionDetailAddPersistenceImpl
	extends BasePersistenceImpl<NcbjSectionDetailAdd>
	implements NcbjSectionDetailAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjSectionDetailAddUtil</code> to access the ncbj section detail add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjSectionDetailAddImpl.class.getName();

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
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	@Override
	public NcbjSectionDetailAdd findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjSectionDetailAddException {

		NcbjSectionDetailAdd ncbjSectionDetailAdd = fetchBygetNCBJ_ById(
			ncbjApplicationId);

		if (ncbjSectionDetailAdd == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjSectionDetailAddException(sb.toString());
		}

		return ncbjSectionDetailAdd;
	}

	/**
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	@Override
	public NcbjSectionDetailAdd fetchBygetNCBJ_ById(long ncbjApplicationId) {
		return fetchBygetNCBJ_ById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj section detail add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	@Override
	public NcbjSectionDetailAdd fetchBygetNCBJ_ById(
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

		if (result instanceof NcbjSectionDetailAdd) {
			NcbjSectionDetailAdd ncbjSectionDetailAdd =
				(NcbjSectionDetailAdd)result;

			if (ncbjApplicationId !=
					ncbjSectionDetailAdd.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJSECTIONDETAILADD_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjSectionDetailAdd> list = query.list();

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
								"NcbjSectionDetailAddPersistenceImpl.fetchBygetNCBJ_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjSectionDetailAdd ncbjSectionDetailAdd = list.get(0);

					result = ncbjSectionDetailAdd;

					cacheResult(ncbjSectionDetailAdd);
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
			return (NcbjSectionDetailAdd)result;
		}
	}

	/**
	 * Removes the ncbj section detail add where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section detail add that was removed
	 */
	@Override
	public NcbjSectionDetailAdd removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjSectionDetailAddException {

		NcbjSectionDetailAdd ncbjSectionDetailAdd = findBygetNCBJ_ById(
			ncbjApplicationId);

		return remove(ncbjSectionDetailAdd);
	}

	/**
	 * Returns the number of ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section detail adds
	 */
	@Override
	public int countBygetNCBJ_ById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSECTIONDETAILADD_WHERE);

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
			"ncbjSectionDetailAdd.ncbjApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetNCBJ_ByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetNCBJ_ByAppId;
	private FinderPath _finderPathCountBygetNCBJ_ByAppId;

	/**
	 * Returns all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section detail adds
	 */
	@Override
	public List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId) {

		return findBygetNCBJ_ByAppId(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @return the range of matching ncbj section detail adds
	 */
	@Override
	public List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end) {

		return findBygetNCBJ_ByAppId(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj section detail adds
	 */
	@Override
	public List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		return findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj section detail adds
	 */
	@Override
	public List<NcbjSectionDetailAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator,
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

		List<NcbjSectionDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjSectionDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjSectionDetailAdd ncbjSectionDetailAdd : list) {
					if (ncbjApplicationId !=
							ncbjSectionDetailAdd.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJSECTIONDETAILADD_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjSectionDetailAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjSectionDetailAdd>)QueryUtil.list(
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
	 * Returns the first ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	@Override
	public NcbjSectionDetailAdd findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjSectionDetailAdd> orderByComparator)
		throws NoSuchNcbjSectionDetailAddException {

		NcbjSectionDetailAdd ncbjSectionDetailAdd =
			fetchBygetNCBJ_ByAppId_First(ncbjApplicationId, orderByComparator);

		if (ncbjSectionDetailAdd != null) {
			return ncbjSectionDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjSectionDetailAddException(sb.toString());
	}

	/**
	 * Returns the first ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	@Override
	public NcbjSectionDetailAdd fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		List<NcbjSectionDetailAdd> list = findBygetNCBJ_ByAppId(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a matching ncbj section detail add could not be found
	 */
	@Override
	public NcbjSectionDetailAdd findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjSectionDetailAdd> orderByComparator)
		throws NoSuchNcbjSectionDetailAddException {

		NcbjSectionDetailAdd ncbjSectionDetailAdd = fetchBygetNCBJ_ByAppId_Last(
			ncbjApplicationId, orderByComparator);

		if (ncbjSectionDetailAdd != null) {
			return ncbjSectionDetailAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjSectionDetailAddException(sb.toString());
	}

	/**
	 * Returns the last ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj section detail add, or <code>null</code> if a matching ncbj section detail add could not be found
	 */
	@Override
	public NcbjSectionDetailAdd fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		int count = countBygetNCBJ_ByAppId(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjSectionDetailAdd> list = findBygetNCBJ_ByAppId(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj section detail adds before and after the current ncbj section detail add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the current ncbj section detail add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	@Override
	public NcbjSectionDetailAdd[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjSectionDetailAddId, long ncbjApplicationId,
			OrderByComparator<NcbjSectionDetailAdd> orderByComparator)
		throws NoSuchNcbjSectionDetailAddException {

		NcbjSectionDetailAdd ncbjSectionDetailAdd = findByPrimaryKey(
			ncbjSectionDetailAddId);

		Session session = null;

		try {
			session = openSession();

			NcbjSectionDetailAdd[] array = new NcbjSectionDetailAddImpl[3];

			array[0] = getBygetNCBJ_ByAppId_PrevAndNext(
				session, ncbjSectionDetailAdd, ncbjApplicationId,
				orderByComparator, true);

			array[1] = ncbjSectionDetailAdd;

			array[2] = getBygetNCBJ_ByAppId_PrevAndNext(
				session, ncbjSectionDetailAdd, ncbjApplicationId,
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

	protected NcbjSectionDetailAdd getBygetNCBJ_ByAppId_PrevAndNext(
		Session session, NcbjSectionDetailAdd ncbjSectionDetailAdd,
		long ncbjApplicationId,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJSECTIONDETAILADD_WHERE);

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
			sb.append(NcbjSectionDetailAddModelImpl.ORDER_BY_JPQL);
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
						ncbjSectionDetailAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjSectionDetailAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj section detail adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNCBJ_ByAppId(long ncbjApplicationId) {
		for (NcbjSectionDetailAdd ncbjSectionDetailAdd :
				findBygetNCBJ_ByAppId(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjSectionDetailAdd);
		}
	}

	/**
	 * Returns the number of ncbj section detail adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section detail adds
	 */
	@Override
	public int countBygetNCBJ_ByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSECTIONDETAILADD_WHERE);

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
			"ncbjSectionDetailAdd.ncbjApplicationId = ?";

	public NcbjSectionDetailAddPersistenceImpl() {
		setModelClass(NcbjSectionDetailAdd.class);

		setModelImplClass(NcbjSectionDetailAddImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjSectionDetailAddTable.INSTANCE);
	}

	/**
	 * Caches the ncbj section detail add in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionDetailAdd the ncbj section detail add
	 */
	@Override
	public void cacheResult(NcbjSectionDetailAdd ncbjSectionDetailAdd) {
		entityCache.putResult(
			NcbjSectionDetailAddImpl.class,
			ncbjSectionDetailAdd.getPrimaryKey(), ncbjSectionDetailAdd);

		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById,
			new Object[] {ncbjSectionDetailAdd.getNcbjApplicationId()},
			ncbjSectionDetailAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj section detail adds in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionDetailAdds the ncbj section detail adds
	 */
	@Override
	public void cacheResult(List<NcbjSectionDetailAdd> ncbjSectionDetailAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjSectionDetailAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjSectionDetailAdd ncbjSectionDetailAdd :
				ncbjSectionDetailAdds) {

			if (entityCache.getResult(
					NcbjSectionDetailAddImpl.class,
					ncbjSectionDetailAdd.getPrimaryKey()) == null) {

				cacheResult(ncbjSectionDetailAdd);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj section detail adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjSectionDetailAddImpl.class);

		finderCache.clearCache(NcbjSectionDetailAddImpl.class);
	}

	/**
	 * Clears the cache for the ncbj section detail add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjSectionDetailAdd ncbjSectionDetailAdd) {
		entityCache.removeResult(
			NcbjSectionDetailAddImpl.class, ncbjSectionDetailAdd);
	}

	@Override
	public void clearCache(List<NcbjSectionDetailAdd> ncbjSectionDetailAdds) {
		for (NcbjSectionDetailAdd ncbjSectionDetailAdd :
				ncbjSectionDetailAdds) {

			entityCache.removeResult(
				NcbjSectionDetailAddImpl.class, ncbjSectionDetailAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjSectionDetailAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjSectionDetailAddImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjSectionDetailAddModelImpl ncbjSectionDetailAddModelImpl) {

		Object[] args = new Object[] {
			ncbjSectionDetailAddModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJ_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById, args,
			ncbjSectionDetailAddModelImpl);
	}

	/**
	 * Creates a new ncbj section detail add with the primary key. Does not add the ncbj section detail add to the database.
	 *
	 * @param ncbjSectionDetailAddId the primary key for the new ncbj section detail add
	 * @return the new ncbj section detail add
	 */
	@Override
	public NcbjSectionDetailAdd create(long ncbjSectionDetailAddId) {
		NcbjSectionDetailAdd ncbjSectionDetailAdd =
			new NcbjSectionDetailAddImpl();

		ncbjSectionDetailAdd.setNew(true);
		ncbjSectionDetailAdd.setPrimaryKey(ncbjSectionDetailAddId);

		ncbjSectionDetailAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjSectionDetailAdd;
	}

	/**
	 * Removes the ncbj section detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add that was removed
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	@Override
	public NcbjSectionDetailAdd remove(long ncbjSectionDetailAddId)
		throws NoSuchNcbjSectionDetailAddException {

		return remove((Serializable)ncbjSectionDetailAddId);
	}

	/**
	 * Removes the ncbj section detail add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj section detail add
	 * @return the ncbj section detail add that was removed
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	@Override
	public NcbjSectionDetailAdd remove(Serializable primaryKey)
		throws NoSuchNcbjSectionDetailAddException {

		Session session = null;

		try {
			session = openSession();

			NcbjSectionDetailAdd ncbjSectionDetailAdd =
				(NcbjSectionDetailAdd)session.get(
					NcbjSectionDetailAddImpl.class, primaryKey);

			if (ncbjSectionDetailAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjSectionDetailAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjSectionDetailAdd);
		}
		catch (NoSuchNcbjSectionDetailAddException noSuchEntityException) {
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
	protected NcbjSectionDetailAdd removeImpl(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjSectionDetailAdd)) {
				ncbjSectionDetailAdd = (NcbjSectionDetailAdd)session.get(
					NcbjSectionDetailAddImpl.class,
					ncbjSectionDetailAdd.getPrimaryKeyObj());
			}

			if (ncbjSectionDetailAdd != null) {
				session.delete(ncbjSectionDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjSectionDetailAdd != null) {
			clearCache(ncbjSectionDetailAdd);
		}

		return ncbjSectionDetailAdd;
	}

	@Override
	public NcbjSectionDetailAdd updateImpl(
		NcbjSectionDetailAdd ncbjSectionDetailAdd) {

		boolean isNew = ncbjSectionDetailAdd.isNew();

		if (!(ncbjSectionDetailAdd instanceof NcbjSectionDetailAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjSectionDetailAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjSectionDetailAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjSectionDetailAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjSectionDetailAdd implementation " +
					ncbjSectionDetailAdd.getClass());
		}

		NcbjSectionDetailAddModelImpl ncbjSectionDetailAddModelImpl =
			(NcbjSectionDetailAddModelImpl)ncbjSectionDetailAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjSectionDetailAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjSectionDetailAdd.setCreateDate(date);
			}
			else {
				ncbjSectionDetailAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjSectionDetailAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjSectionDetailAdd.setModifiedDate(date);
			}
			else {
				ncbjSectionDetailAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjSectionDetailAdd);
			}
			else {
				ncbjSectionDetailAdd = (NcbjSectionDetailAdd)session.merge(
					ncbjSectionDetailAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjSectionDetailAddImpl.class, ncbjSectionDetailAddModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjSectionDetailAddModelImpl);

		if (isNew) {
			ncbjSectionDetailAdd.setNew(false);
		}

		ncbjSectionDetailAdd.resetOriginalValues();

		return ncbjSectionDetailAdd;
	}

	/**
	 * Returns the ncbj section detail add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj section detail add
	 * @return the ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	@Override
	public NcbjSectionDetailAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjSectionDetailAddException {

		NcbjSectionDetailAdd ncbjSectionDetailAdd = fetchByPrimaryKey(
			primaryKey);

		if (ncbjSectionDetailAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjSectionDetailAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjSectionDetailAdd;
	}

	/**
	 * Returns the ncbj section detail add with the primary key or throws a <code>NoSuchNcbjSectionDetailAddException</code> if it could not be found.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add
	 * @throws NoSuchNcbjSectionDetailAddException if a ncbj section detail add with the primary key could not be found
	 */
	@Override
	public NcbjSectionDetailAdd findByPrimaryKey(long ncbjSectionDetailAddId)
		throws NoSuchNcbjSectionDetailAddException {

		return findByPrimaryKey((Serializable)ncbjSectionDetailAddId);
	}

	/**
	 * Returns the ncbj section detail add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionDetailAddId the primary key of the ncbj section detail add
	 * @return the ncbj section detail add, or <code>null</code> if a ncbj section detail add with the primary key could not be found
	 */
	@Override
	public NcbjSectionDetailAdd fetchByPrimaryKey(long ncbjSectionDetailAddId) {
		return fetchByPrimaryKey((Serializable)ncbjSectionDetailAddId);
	}

	/**
	 * Returns all the ncbj section detail adds.
	 *
	 * @return the ncbj section detail adds
	 */
	@Override
	public List<NcbjSectionDetailAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @return the range of ncbj section detail adds
	 */
	@Override
	public List<NcbjSectionDetailAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section detail adds
	 */
	@Override
	public List<NcbjSectionDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj section detail adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionDetailAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section detail adds
	 * @param end the upper bound of the range of ncbj section detail adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section detail adds
	 */
	@Override
	public List<NcbjSectionDetailAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionDetailAdd> orderByComparator,
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

		List<NcbjSectionDetailAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjSectionDetailAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJSECTIONDETAILADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJSECTIONDETAILADD;

				sql = sql.concat(NcbjSectionDetailAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjSectionDetailAdd>)QueryUtil.list(
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
	 * Removes all the ncbj section detail adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjSectionDetailAdd ncbjSectionDetailAdd : findAll()) {
			remove(ncbjSectionDetailAdd);
		}
	}

	/**
	 * Returns the number of ncbj section detail adds.
	 *
	 * @return the number of ncbj section detail adds
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
					_SQL_COUNT_NCBJSECTIONDETAILADD);

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
		return "ncbjSectionDetailAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJSECTIONDETAILADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjSectionDetailAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj section detail add persistence.
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

		NcbjSectionDetailAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjSectionDetailAddUtil.setPersistence(null);

		entityCache.removeCache(NcbjSectionDetailAddImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJSECTIONDETAILADD =
		"SELECT ncbjSectionDetailAdd FROM NcbjSectionDetailAdd ncbjSectionDetailAdd";

	private static final String _SQL_SELECT_NCBJSECTIONDETAILADD_WHERE =
		"SELECT ncbjSectionDetailAdd FROM NcbjSectionDetailAdd ncbjSectionDetailAdd WHERE ";

	private static final String _SQL_COUNT_NCBJSECTIONDETAILADD =
		"SELECT COUNT(ncbjSectionDetailAdd) FROM NcbjSectionDetailAdd ncbjSectionDetailAdd";

	private static final String _SQL_COUNT_NCBJSECTIONDETAILADD_WHERE =
		"SELECT COUNT(ncbjSectionDetailAdd) FROM NcbjSectionDetailAdd ncbjSectionDetailAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjSectionDetailAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjSectionDetailAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjSectionDetailAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjSectionDetailAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}