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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjNumOfEmpAddException;
import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAdd;
import com.nbp.ncbj.application.form.service.model.NcbjNumOfEmpAddTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjNumOfEmpAddImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjNumOfEmpAddModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumOfEmpAddPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjNumOfEmpAddUtil;
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
 * The persistence implementation for the ncbj num of emp add service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjNumOfEmpAddPersistence.class)
public class NcbjNumOfEmpAddPersistenceImpl
	extends BasePersistenceImpl<NcbjNumOfEmpAdd>
	implements NcbjNumOfEmpAddPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjNumOfEmpAddUtil</code> to access the ncbj num of emp add persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjNumOfEmpAddImpl.class.getName();

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
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjNumOfEmpAddException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjNumOfEmpAddException {

		NcbjNumOfEmpAdd ncbjNumOfEmpAdd = fetchBygetNCBJ_ById(
			ncbjApplicationId);

		if (ncbjNumOfEmpAdd == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjNumOfEmpAddException(sb.toString());
		}

		return ncbjNumOfEmpAdd;
	}

	/**
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd fetchBygetNCBJ_ById(long ncbjApplicationId) {
		return fetchBygetNCBJ_ById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj num of emp add where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd fetchBygetNCBJ_ById(
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

		if (result instanceof NcbjNumOfEmpAdd) {
			NcbjNumOfEmpAdd ncbjNumOfEmpAdd = (NcbjNumOfEmpAdd)result;

			if (ncbjApplicationId != ncbjNumOfEmpAdd.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJNUMOFEMPADD_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjNumOfEmpAdd> list = query.list();

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
								"NcbjNumOfEmpAddPersistenceImpl.fetchBygetNCBJ_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjNumOfEmpAdd ncbjNumOfEmpAdd = list.get(0);

					result = ncbjNumOfEmpAdd;

					cacheResult(ncbjNumOfEmpAdd);
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
			return (NcbjNumOfEmpAdd)result;
		}
	}

	/**
	 * Removes the ncbj num of emp add where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj num of emp add that was removed
	 */
	@Override
	public NcbjNumOfEmpAdd removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjNumOfEmpAddException {

		NcbjNumOfEmpAdd ncbjNumOfEmpAdd = findBygetNCBJ_ById(ncbjApplicationId);

		return remove(ncbjNumOfEmpAdd);
	}

	/**
	 * Returns the number of ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj num of emp adds
	 */
	@Override
	public int countBygetNCBJ_ById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJNUMOFEMPADD_WHERE);

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
			"ncbjNumOfEmpAdd.ncbjApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetNCBJ_ByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetNCBJ_ByAppId;
	private FinderPath _finderPathCountBygetNCBJ_ByAppId;

	/**
	 * Returns all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj num of emp adds
	 */
	@Override
	public List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(long ncbjApplicationId) {
		return findBygetNCBJ_ByAppId(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @return the range of matching ncbj num of emp adds
	 */
	@Override
	public List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end) {

		return findBygetNCBJ_ByAppId(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj num of emp adds
	 */
	@Override
	public List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		return findBygetNCBJ_ByAppId(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj num of emp adds
	 */
	@Override
	public List<NcbjNumOfEmpAdd> findBygetNCBJ_ByAppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator,
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

		List<NcbjNumOfEmpAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjNumOfEmpAdd>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjNumOfEmpAdd ncbjNumOfEmpAdd : list) {
					if (ncbjApplicationId !=
							ncbjNumOfEmpAdd.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJNUMOFEMPADD_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYAPPID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjNumOfEmpAddModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjNumOfEmpAdd>)QueryUtil.list(
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
	 * Returns the first ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd findBygetNCBJ_ByAppId_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjNumOfEmpAdd> orderByComparator)
		throws NoSuchNcbjNumOfEmpAddException {

		NcbjNumOfEmpAdd ncbjNumOfEmpAdd = fetchBygetNCBJ_ByAppId_First(
			ncbjApplicationId, orderByComparator);

		if (ncbjNumOfEmpAdd != null) {
			return ncbjNumOfEmpAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjNumOfEmpAddException(sb.toString());
	}

	/**
	 * Returns the first ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd fetchBygetNCBJ_ByAppId_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		List<NcbjNumOfEmpAdd> list = findBygetNCBJ_ByAppId(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a matching ncbj num of emp add could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd findBygetNCBJ_ByAppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjNumOfEmpAdd> orderByComparator)
		throws NoSuchNcbjNumOfEmpAddException {

		NcbjNumOfEmpAdd ncbjNumOfEmpAdd = fetchBygetNCBJ_ByAppId_Last(
			ncbjApplicationId, orderByComparator);

		if (ncbjNumOfEmpAdd != null) {
			return ncbjNumOfEmpAdd;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjNumOfEmpAddException(sb.toString());
	}

	/**
	 * Returns the last ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj num of emp add, or <code>null</code> if a matching ncbj num of emp add could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd fetchBygetNCBJ_ByAppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		int count = countBygetNCBJ_ByAppId(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjNumOfEmpAdd> list = findBygetNCBJ_ByAppId(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj num of emp adds before and after the current ncbj num of emp add in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the current ncbj num of emp add
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd[] findBygetNCBJ_ByAppId_PrevAndNext(
			long ncbjNumOfEmpAddId, long ncbjApplicationId,
			OrderByComparator<NcbjNumOfEmpAdd> orderByComparator)
		throws NoSuchNcbjNumOfEmpAddException {

		NcbjNumOfEmpAdd ncbjNumOfEmpAdd = findByPrimaryKey(ncbjNumOfEmpAddId);

		Session session = null;

		try {
			session = openSession();

			NcbjNumOfEmpAdd[] array = new NcbjNumOfEmpAddImpl[3];

			array[0] = getBygetNCBJ_ByAppId_PrevAndNext(
				session, ncbjNumOfEmpAdd, ncbjApplicationId, orderByComparator,
				true);

			array[1] = ncbjNumOfEmpAdd;

			array[2] = getBygetNCBJ_ByAppId_PrevAndNext(
				session, ncbjNumOfEmpAdd, ncbjApplicationId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcbjNumOfEmpAdd getBygetNCBJ_ByAppId_PrevAndNext(
		Session session, NcbjNumOfEmpAdd ncbjNumOfEmpAdd,
		long ncbjApplicationId,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJNUMOFEMPADD_WHERE);

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
			sb.append(NcbjNumOfEmpAddModelImpl.ORDER_BY_JPQL);
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
						ncbjNumOfEmpAdd)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjNumOfEmpAdd> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj num of emp adds where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeBygetNCBJ_ByAppId(long ncbjApplicationId) {
		for (NcbjNumOfEmpAdd ncbjNumOfEmpAdd :
				findBygetNCBJ_ByAppId(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjNumOfEmpAdd);
		}
	}

	/**
	 * Returns the number of ncbj num of emp adds where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj num of emp adds
	 */
	@Override
	public int countBygetNCBJ_ByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJNUMOFEMPADD_WHERE);

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
			"ncbjNumOfEmpAdd.ncbjApplicationId = ?";

	public NcbjNumOfEmpAddPersistenceImpl() {
		setModelClass(NcbjNumOfEmpAdd.class);

		setModelImplClass(NcbjNumOfEmpAddImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjNumOfEmpAddTable.INSTANCE);
	}

	/**
	 * Caches the ncbj num of emp add in the entity cache if it is enabled.
	 *
	 * @param ncbjNumOfEmpAdd the ncbj num of emp add
	 */
	@Override
	public void cacheResult(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		entityCache.putResult(
			NcbjNumOfEmpAddImpl.class, ncbjNumOfEmpAdd.getPrimaryKey(),
			ncbjNumOfEmpAdd);

		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById,
			new Object[] {ncbjNumOfEmpAdd.getNcbjApplicationId()},
			ncbjNumOfEmpAdd);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj num of emp adds in the entity cache if it is enabled.
	 *
	 * @param ncbjNumOfEmpAdds the ncbj num of emp adds
	 */
	@Override
	public void cacheResult(List<NcbjNumOfEmpAdd> ncbjNumOfEmpAdds) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjNumOfEmpAdds.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjNumOfEmpAdd ncbjNumOfEmpAdd : ncbjNumOfEmpAdds) {
			if (entityCache.getResult(
					NcbjNumOfEmpAddImpl.class,
					ncbjNumOfEmpAdd.getPrimaryKey()) == null) {

				cacheResult(ncbjNumOfEmpAdd);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj num of emp adds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjNumOfEmpAddImpl.class);

		finderCache.clearCache(NcbjNumOfEmpAddImpl.class);
	}

	/**
	 * Clears the cache for the ncbj num of emp add.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		entityCache.removeResult(NcbjNumOfEmpAddImpl.class, ncbjNumOfEmpAdd);
	}

	@Override
	public void clearCache(List<NcbjNumOfEmpAdd> ncbjNumOfEmpAdds) {
		for (NcbjNumOfEmpAdd ncbjNumOfEmpAdd : ncbjNumOfEmpAdds) {
			entityCache.removeResult(
				NcbjNumOfEmpAddImpl.class, ncbjNumOfEmpAdd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjNumOfEmpAddImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjNumOfEmpAddImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjNumOfEmpAddModelImpl ncbjNumOfEmpAddModelImpl) {

		Object[] args = new Object[] {
			ncbjNumOfEmpAddModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJ_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById, args, ncbjNumOfEmpAddModelImpl);
	}

	/**
	 * Creates a new ncbj num of emp add with the primary key. Does not add the ncbj num of emp add to the database.
	 *
	 * @param ncbjNumOfEmpAddId the primary key for the new ncbj num of emp add
	 * @return the new ncbj num of emp add
	 */
	@Override
	public NcbjNumOfEmpAdd create(long ncbjNumOfEmpAddId) {
		NcbjNumOfEmpAdd ncbjNumOfEmpAdd = new NcbjNumOfEmpAddImpl();

		ncbjNumOfEmpAdd.setNew(true);
		ncbjNumOfEmpAdd.setPrimaryKey(ncbjNumOfEmpAddId);

		ncbjNumOfEmpAdd.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjNumOfEmpAdd;
	}

	/**
	 * Removes the ncbj num of emp add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add that was removed
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd remove(long ncbjNumOfEmpAddId)
		throws NoSuchNcbjNumOfEmpAddException {

		return remove((Serializable)ncbjNumOfEmpAddId);
	}

	/**
	 * Removes the ncbj num of emp add with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add that was removed
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd remove(Serializable primaryKey)
		throws NoSuchNcbjNumOfEmpAddException {

		Session session = null;

		try {
			session = openSession();

			NcbjNumOfEmpAdd ncbjNumOfEmpAdd = (NcbjNumOfEmpAdd)session.get(
				NcbjNumOfEmpAddImpl.class, primaryKey);

			if (ncbjNumOfEmpAdd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjNumOfEmpAddException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjNumOfEmpAdd);
		}
		catch (NoSuchNcbjNumOfEmpAddException noSuchEntityException) {
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
	protected NcbjNumOfEmpAdd removeImpl(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjNumOfEmpAdd)) {
				ncbjNumOfEmpAdd = (NcbjNumOfEmpAdd)session.get(
					NcbjNumOfEmpAddImpl.class,
					ncbjNumOfEmpAdd.getPrimaryKeyObj());
			}

			if (ncbjNumOfEmpAdd != null) {
				session.delete(ncbjNumOfEmpAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjNumOfEmpAdd != null) {
			clearCache(ncbjNumOfEmpAdd);
		}

		return ncbjNumOfEmpAdd;
	}

	@Override
	public NcbjNumOfEmpAdd updateImpl(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		boolean isNew = ncbjNumOfEmpAdd.isNew();

		if (!(ncbjNumOfEmpAdd instanceof NcbjNumOfEmpAddModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjNumOfEmpAdd.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjNumOfEmpAdd);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjNumOfEmpAdd proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjNumOfEmpAdd implementation " +
					ncbjNumOfEmpAdd.getClass());
		}

		NcbjNumOfEmpAddModelImpl ncbjNumOfEmpAddModelImpl =
			(NcbjNumOfEmpAddModelImpl)ncbjNumOfEmpAdd;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjNumOfEmpAdd.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjNumOfEmpAdd.setCreateDate(date);
			}
			else {
				ncbjNumOfEmpAdd.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjNumOfEmpAddModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjNumOfEmpAdd.setModifiedDate(date);
			}
			else {
				ncbjNumOfEmpAdd.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjNumOfEmpAdd);
			}
			else {
				ncbjNumOfEmpAdd = (NcbjNumOfEmpAdd)session.merge(
					ncbjNumOfEmpAdd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjNumOfEmpAddImpl.class, ncbjNumOfEmpAddModelImpl, false, true);

		cacheUniqueFindersCache(ncbjNumOfEmpAddModelImpl);

		if (isNew) {
			ncbjNumOfEmpAdd.setNew(false);
		}

		ncbjNumOfEmpAdd.resetOriginalValues();

		return ncbjNumOfEmpAdd;
	}

	/**
	 * Returns the ncbj num of emp add with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjNumOfEmpAddException {

		NcbjNumOfEmpAdd ncbjNumOfEmpAdd = fetchByPrimaryKey(primaryKey);

		if (ncbjNumOfEmpAdd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjNumOfEmpAddException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjNumOfEmpAdd;
	}

	/**
	 * Returns the ncbj num of emp add with the primary key or throws a <code>NoSuchNcbjNumOfEmpAddException</code> if it could not be found.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add
	 * @throws NoSuchNcbjNumOfEmpAddException if a ncbj num of emp add with the primary key could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd findByPrimaryKey(long ncbjNumOfEmpAddId)
		throws NoSuchNcbjNumOfEmpAddException {

		return findByPrimaryKey((Serializable)ncbjNumOfEmpAddId);
	}

	/**
	 * Returns the ncbj num of emp add with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjNumOfEmpAddId the primary key of the ncbj num of emp add
	 * @return the ncbj num of emp add, or <code>null</code> if a ncbj num of emp add with the primary key could not be found
	 */
	@Override
	public NcbjNumOfEmpAdd fetchByPrimaryKey(long ncbjNumOfEmpAddId) {
		return fetchByPrimaryKey((Serializable)ncbjNumOfEmpAddId);
	}

	/**
	 * Returns all the ncbj num of emp adds.
	 *
	 * @return the ncbj num of emp adds
	 */
	@Override
	public List<NcbjNumOfEmpAdd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @return the range of ncbj num of emp adds
	 */
	@Override
	public List<NcbjNumOfEmpAdd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj num of emp adds
	 */
	@Override
	public List<NcbjNumOfEmpAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj num of emp adds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjNumOfEmpAddModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj num of emp adds
	 * @param end the upper bound of the range of ncbj num of emp adds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj num of emp adds
	 */
	@Override
	public List<NcbjNumOfEmpAdd> findAll(
		int start, int end,
		OrderByComparator<NcbjNumOfEmpAdd> orderByComparator,
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

		List<NcbjNumOfEmpAdd> list = null;

		if (useFinderCache) {
			list = (List<NcbjNumOfEmpAdd>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJNUMOFEMPADD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJNUMOFEMPADD;

				sql = sql.concat(NcbjNumOfEmpAddModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjNumOfEmpAdd>)QueryUtil.list(
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
	 * Removes all the ncbj num of emp adds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjNumOfEmpAdd ncbjNumOfEmpAdd : findAll()) {
			remove(ncbjNumOfEmpAdd);
		}
	}

	/**
	 * Returns the number of ncbj num of emp adds.
	 *
	 * @return the number of ncbj num of emp adds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJNUMOFEMPADD);

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
		return "ncbjNumOfEmpAddId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJNUMOFEMPADD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjNumOfEmpAddModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj num of emp add persistence.
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

		NcbjNumOfEmpAddUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjNumOfEmpAddUtil.setPersistence(null);

		entityCache.removeCache(NcbjNumOfEmpAddImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJNUMOFEMPADD =
		"SELECT ncbjNumOfEmpAdd FROM NcbjNumOfEmpAdd ncbjNumOfEmpAdd";

	private static final String _SQL_SELECT_NCBJNUMOFEMPADD_WHERE =
		"SELECT ncbjNumOfEmpAdd FROM NcbjNumOfEmpAdd ncbjNumOfEmpAdd WHERE ";

	private static final String _SQL_COUNT_NCBJNUMOFEMPADD =
		"SELECT COUNT(ncbjNumOfEmpAdd) FROM NcbjNumOfEmpAdd ncbjNumOfEmpAdd";

	private static final String _SQL_COUNT_NCBJNUMOFEMPADD_WHERE =
		"SELECT COUNT(ncbjNumOfEmpAdd) FROM NcbjNumOfEmpAdd ncbjNumOfEmpAdd WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjNumOfEmpAdd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjNumOfEmpAdd exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjNumOfEmpAdd exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjNumOfEmpAddPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}