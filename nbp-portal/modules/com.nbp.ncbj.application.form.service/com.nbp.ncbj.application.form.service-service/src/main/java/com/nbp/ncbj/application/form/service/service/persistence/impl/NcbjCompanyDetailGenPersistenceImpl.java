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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjCompanyDetailGenException;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGen;
import com.nbp.ncbj.application.form.service.model.NcbjCompanyDetailGenTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjCompanyDetailGenModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailGenPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjCompanyDetailGenUtil;
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
 * The persistence implementation for the ncbj company detail gen service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjCompanyDetailGenPersistence.class)
public class NcbjCompanyDetailGenPersistenceImpl
	extends BasePersistenceImpl<NcbjCompanyDetailGen>
	implements NcbjCompanyDetailGenPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjCompanyDetailGenUtil</code> to access the ncbj company detail gen persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjCompanyDetailGenImpl.class.getName();

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
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjCompanyDetailGenException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	@Override
	public NcbjCompanyDetailGen findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjCompanyDetailGenException {

		NcbjCompanyDetailGen ncbjCompanyDetailGen = fetchBygetNCBJ_ById(
			ncbjApplicationId);

		if (ncbjCompanyDetailGen == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjCompanyDetailGenException(sb.toString());
		}

		return ncbjCompanyDetailGen;
	}

	/**
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	@Override
	public NcbjCompanyDetailGen fetchBygetNCBJ_ById(long ncbjApplicationId) {
		return fetchBygetNCBJ_ById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj company detail gen where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	@Override
	public NcbjCompanyDetailGen fetchBygetNCBJ_ById(
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

		if (result instanceof NcbjCompanyDetailGen) {
			NcbjCompanyDetailGen ncbjCompanyDetailGen =
				(NcbjCompanyDetailGen)result;

			if (ncbjApplicationId !=
					ncbjCompanyDetailGen.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJCOMPANYDETAILGEN_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjCompanyDetailGen> list = query.list();

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
								"NcbjCompanyDetailGenPersistenceImpl.fetchBygetNCBJ_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjCompanyDetailGen ncbjCompanyDetailGen = list.get(0);

					result = ncbjCompanyDetailGen;

					cacheResult(ncbjCompanyDetailGen);
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
			return (NcbjCompanyDetailGen)result;
		}
	}

	/**
	 * Removes the ncbj company detail gen where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company detail gen that was removed
	 */
	@Override
	public NcbjCompanyDetailGen removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNcbjCompanyDetailGenException {

		NcbjCompanyDetailGen ncbjCompanyDetailGen = findBygetNCBJ_ById(
			ncbjApplicationId);

		return remove(ncbjCompanyDetailGen);
	}

	/**
	 * Returns the number of ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company detail gens
	 */
	@Override
	public int countBygetNCBJ_ById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJCOMPANYDETAILGEN_WHERE);

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
			"ncbjCompanyDetailGen.ncbjApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindByget_NCBJ_ListBy_AppId;
	private FinderPath _finderPathWithoutPaginationFindByget_NCBJ_ListBy_AppId;
	private FinderPath _finderPathCountByget_NCBJ_ListBy_AppId;

	/**
	 * Returns all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company detail gens
	 */
	@Override
	public List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId) {

		return findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @return the range of matching ncbj company detail gens
	 */
	@Override
	public List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end) {

		return findByget_NCBJ_ListBy_AppId(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj company detail gens
	 */
	@Override
	public List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		return findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj company detail gens
	 */
	@Override
	public List<NcbjCompanyDetailGen> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByget_NCBJ_ListBy_AppId;
				finderArgs = new Object[] {ncbjApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByget_NCBJ_ListBy_AppId;
			finderArgs = new Object[] {
				ncbjApplicationId, start, end, orderByComparator
			};
		}

		List<NcbjCompanyDetailGen> list = null;

		if (useFinderCache) {
			list = (List<NcbjCompanyDetailGen>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjCompanyDetailGen ncbjCompanyDetailGen : list) {
					if (ncbjApplicationId !=
							ncbjCompanyDetailGen.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJCOMPANYDETAILGEN_WHERE);

			sb.append(_FINDER_COLUMN_GET_NCBJ_LISTBY_APPID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjCompanyDetailGenModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NcbjCompanyDetailGen>)QueryUtil.list(
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
	 * Returns the first ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	@Override
	public NcbjCompanyDetailGen findByget_NCBJ_ListBy_AppId_First(
			long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailGen> orderByComparator)
		throws NoSuchNcbjCompanyDetailGenException {

		NcbjCompanyDetailGen ncbjCompanyDetailGen =
			fetchByget_NCBJ_ListBy_AppId_First(
				ncbjApplicationId, orderByComparator);

		if (ncbjCompanyDetailGen != null) {
			return ncbjCompanyDetailGen;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjCompanyDetailGenException(sb.toString());
	}

	/**
	 * Returns the first ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	@Override
	public NcbjCompanyDetailGen fetchByget_NCBJ_ListBy_AppId_First(
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		List<NcbjCompanyDetailGen> list = findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a matching ncbj company detail gen could not be found
	 */
	@Override
	public NcbjCompanyDetailGen findByget_NCBJ_ListBy_AppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailGen> orderByComparator)
		throws NoSuchNcbjCompanyDetailGenException {

		NcbjCompanyDetailGen ncbjCompanyDetailGen =
			fetchByget_NCBJ_ListBy_AppId_Last(
				ncbjApplicationId, orderByComparator);

		if (ncbjCompanyDetailGen != null) {
			return ncbjCompanyDetailGen;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNcbjCompanyDetailGenException(sb.toString());
	}

	/**
	 * Returns the last ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company detail gen, or <code>null</code> if a matching ncbj company detail gen could not be found
	 */
	@Override
	public NcbjCompanyDetailGen fetchByget_NCBJ_ListBy_AppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		int count = countByget_NCBJ_ListBy_AppId(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NcbjCompanyDetailGen> list = findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj company detail gens before and after the current ncbj company detail gen in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the current ncbj company detail gen
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailGen[] findByget_NCBJ_ListBy_AppId_PrevAndNext(
			long ncbjCompanyDetailGenId, long ncbjApplicationId,
			OrderByComparator<NcbjCompanyDetailGen> orderByComparator)
		throws NoSuchNcbjCompanyDetailGenException {

		NcbjCompanyDetailGen ncbjCompanyDetailGen = findByPrimaryKey(
			ncbjCompanyDetailGenId);

		Session session = null;

		try {
			session = openSession();

			NcbjCompanyDetailGen[] array = new NcbjCompanyDetailGenImpl[3];

			array[0] = getByget_NCBJ_ListBy_AppId_PrevAndNext(
				session, ncbjCompanyDetailGen, ncbjApplicationId,
				orderByComparator, true);

			array[1] = ncbjCompanyDetailGen;

			array[2] = getByget_NCBJ_ListBy_AppId_PrevAndNext(
				session, ncbjCompanyDetailGen, ncbjApplicationId,
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

	protected NcbjCompanyDetailGen getByget_NCBJ_ListBy_AppId_PrevAndNext(
		Session session, NcbjCompanyDetailGen ncbjCompanyDetailGen,
		long ncbjApplicationId,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJCOMPANYDETAILGEN_WHERE);

		sb.append(_FINDER_COLUMN_GET_NCBJ_LISTBY_APPID_NCBJAPPLICATIONID_2);

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
			sb.append(NcbjCompanyDetailGenModelImpl.ORDER_BY_JPQL);
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
						ncbjCompanyDetailGen)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjCompanyDetailGen> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj company detail gens where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeByget_NCBJ_ListBy_AppId(long ncbjApplicationId) {
		for (NcbjCompanyDetailGen ncbjCompanyDetailGen :
				findByget_NCBJ_ListBy_AppId(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjCompanyDetailGen);
		}
	}

	/**
	 * Returns the number of ncbj company detail gens where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company detail gens
	 */
	@Override
	public int countByget_NCBJ_ListBy_AppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountByget_NCBJ_ListBy_AppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJCOMPANYDETAILGEN_WHERE);

			sb.append(_FINDER_COLUMN_GET_NCBJ_LISTBY_APPID_NCBJAPPLICATIONID_2);

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
		_FINDER_COLUMN_GET_NCBJ_LISTBY_APPID_NCBJAPPLICATIONID_2 =
			"ncbjCompanyDetailGen.ncbjApplicationId = ?";

	public NcbjCompanyDetailGenPersistenceImpl() {
		setModelClass(NcbjCompanyDetailGen.class);

		setModelImplClass(NcbjCompanyDetailGenImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjCompanyDetailGenTable.INSTANCE);
	}

	/**
	 * Caches the ncbj company detail gen in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailGen the ncbj company detail gen
	 */
	@Override
	public void cacheResult(NcbjCompanyDetailGen ncbjCompanyDetailGen) {
		entityCache.putResult(
			NcbjCompanyDetailGenImpl.class,
			ncbjCompanyDetailGen.getPrimaryKey(), ncbjCompanyDetailGen);

		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById,
			new Object[] {ncbjCompanyDetailGen.getNcbjApplicationId()},
			ncbjCompanyDetailGen);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj company detail gens in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyDetailGens the ncbj company detail gens
	 */
	@Override
	public void cacheResult(List<NcbjCompanyDetailGen> ncbjCompanyDetailGens) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjCompanyDetailGens.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjCompanyDetailGen ncbjCompanyDetailGen :
				ncbjCompanyDetailGens) {

			if (entityCache.getResult(
					NcbjCompanyDetailGenImpl.class,
					ncbjCompanyDetailGen.getPrimaryKey()) == null) {

				cacheResult(ncbjCompanyDetailGen);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj company detail gens.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjCompanyDetailGenImpl.class);

		finderCache.clearCache(NcbjCompanyDetailGenImpl.class);
	}

	/**
	 * Clears the cache for the ncbj company detail gen.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjCompanyDetailGen ncbjCompanyDetailGen) {
		entityCache.removeResult(
			NcbjCompanyDetailGenImpl.class, ncbjCompanyDetailGen);
	}

	@Override
	public void clearCache(List<NcbjCompanyDetailGen> ncbjCompanyDetailGens) {
		for (NcbjCompanyDetailGen ncbjCompanyDetailGen :
				ncbjCompanyDetailGens) {

			entityCache.removeResult(
				NcbjCompanyDetailGenImpl.class, ncbjCompanyDetailGen);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjCompanyDetailGenImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjCompanyDetailGenImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjCompanyDetailGenModelImpl ncbjCompanyDetailGenModelImpl) {

		Object[] args = new Object[] {
			ncbjCompanyDetailGenModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJ_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById, args,
			ncbjCompanyDetailGenModelImpl);
	}

	/**
	 * Creates a new ncbj company detail gen with the primary key. Does not add the ncbj company detail gen to the database.
	 *
	 * @param ncbjCompanyDetailGenId the primary key for the new ncbj company detail gen
	 * @return the new ncbj company detail gen
	 */
	@Override
	public NcbjCompanyDetailGen create(long ncbjCompanyDetailGenId) {
		NcbjCompanyDetailGen ncbjCompanyDetailGen =
			new NcbjCompanyDetailGenImpl();

		ncbjCompanyDetailGen.setNew(true);
		ncbjCompanyDetailGen.setPrimaryKey(ncbjCompanyDetailGenId);

		ncbjCompanyDetailGen.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjCompanyDetailGen;
	}

	/**
	 * Removes the ncbj company detail gen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen that was removed
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailGen remove(long ncbjCompanyDetailGenId)
		throws NoSuchNcbjCompanyDetailGenException {

		return remove((Serializable)ncbjCompanyDetailGenId);
	}

	/**
	 * Removes the ncbj company detail gen with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen that was removed
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailGen remove(Serializable primaryKey)
		throws NoSuchNcbjCompanyDetailGenException {

		Session session = null;

		try {
			session = openSession();

			NcbjCompanyDetailGen ncbjCompanyDetailGen =
				(NcbjCompanyDetailGen)session.get(
					NcbjCompanyDetailGenImpl.class, primaryKey);

			if (ncbjCompanyDetailGen == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjCompanyDetailGenException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjCompanyDetailGen);
		}
		catch (NoSuchNcbjCompanyDetailGenException noSuchEntityException) {
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
	protected NcbjCompanyDetailGen removeImpl(
		NcbjCompanyDetailGen ncbjCompanyDetailGen) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjCompanyDetailGen)) {
				ncbjCompanyDetailGen = (NcbjCompanyDetailGen)session.get(
					NcbjCompanyDetailGenImpl.class,
					ncbjCompanyDetailGen.getPrimaryKeyObj());
			}

			if (ncbjCompanyDetailGen != null) {
				session.delete(ncbjCompanyDetailGen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjCompanyDetailGen != null) {
			clearCache(ncbjCompanyDetailGen);
		}

		return ncbjCompanyDetailGen;
	}

	@Override
	public NcbjCompanyDetailGen updateImpl(
		NcbjCompanyDetailGen ncbjCompanyDetailGen) {

		boolean isNew = ncbjCompanyDetailGen.isNew();

		if (!(ncbjCompanyDetailGen instanceof NcbjCompanyDetailGenModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjCompanyDetailGen.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjCompanyDetailGen);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjCompanyDetailGen proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjCompanyDetailGen implementation " +
					ncbjCompanyDetailGen.getClass());
		}

		NcbjCompanyDetailGenModelImpl ncbjCompanyDetailGenModelImpl =
			(NcbjCompanyDetailGenModelImpl)ncbjCompanyDetailGen;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjCompanyDetailGen.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjCompanyDetailGen.setCreateDate(date);
			}
			else {
				ncbjCompanyDetailGen.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjCompanyDetailGenModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjCompanyDetailGen.setModifiedDate(date);
			}
			else {
				ncbjCompanyDetailGen.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjCompanyDetailGen);
			}
			else {
				ncbjCompanyDetailGen = (NcbjCompanyDetailGen)session.merge(
					ncbjCompanyDetailGen);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjCompanyDetailGenImpl.class, ncbjCompanyDetailGenModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjCompanyDetailGenModelImpl);

		if (isNew) {
			ncbjCompanyDetailGen.setNew(false);
		}

		ncbjCompanyDetailGen.resetOriginalValues();

		return ncbjCompanyDetailGen;
	}

	/**
	 * Returns the ncbj company detail gen with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailGen findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjCompanyDetailGenException {

		NcbjCompanyDetailGen ncbjCompanyDetailGen = fetchByPrimaryKey(
			primaryKey);

		if (ncbjCompanyDetailGen == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjCompanyDetailGenException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjCompanyDetailGen;
	}

	/**
	 * Returns the ncbj company detail gen with the primary key or throws a <code>NoSuchNcbjCompanyDetailGenException</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen
	 * @throws NoSuchNcbjCompanyDetailGenException if a ncbj company detail gen with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailGen findByPrimaryKey(long ncbjCompanyDetailGenId)
		throws NoSuchNcbjCompanyDetailGenException {

		return findByPrimaryKey((Serializable)ncbjCompanyDetailGenId);
	}

	/**
	 * Returns the ncbj company detail gen with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjCompanyDetailGenId the primary key of the ncbj company detail gen
	 * @return the ncbj company detail gen, or <code>null</code> if a ncbj company detail gen with the primary key could not be found
	 */
	@Override
	public NcbjCompanyDetailGen fetchByPrimaryKey(long ncbjCompanyDetailGenId) {
		return fetchByPrimaryKey((Serializable)ncbjCompanyDetailGenId);
	}

	/**
	 * Returns all the ncbj company detail gens.
	 *
	 * @return the ncbj company detail gens
	 */
	@Override
	public List<NcbjCompanyDetailGen> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @return the range of ncbj company detail gens
	 */
	@Override
	public List<NcbjCompanyDetailGen> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company detail gens
	 */
	@Override
	public List<NcbjCompanyDetailGen> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj company detail gens.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjCompanyDetailGenModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company detail gens
	 * @param end the upper bound of the range of ncbj company detail gens (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company detail gens
	 */
	@Override
	public List<NcbjCompanyDetailGen> findAll(
		int start, int end,
		OrderByComparator<NcbjCompanyDetailGen> orderByComparator,
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

		List<NcbjCompanyDetailGen> list = null;

		if (useFinderCache) {
			list = (List<NcbjCompanyDetailGen>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJCOMPANYDETAILGEN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJCOMPANYDETAILGEN;

				sql = sql.concat(NcbjCompanyDetailGenModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjCompanyDetailGen>)QueryUtil.list(
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
	 * Removes all the ncbj company detail gens from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjCompanyDetailGen ncbjCompanyDetailGen : findAll()) {
			remove(ncbjCompanyDetailGen);
		}
	}

	/**
	 * Returns the number of ncbj company detail gens.
	 *
	 * @return the number of ncbj company detail gens
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
					_SQL_COUNT_NCBJCOMPANYDETAILGEN);

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
		return "ncbjCompanyDetailGenId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJCOMPANYDETAILGEN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjCompanyDetailGenModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj company detail gen persistence.
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

		_finderPathWithPaginationFindByget_NCBJ_ListBy_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByget_NCBJ_ListBy_AppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathWithoutPaginationFindByget_NCBJ_ListBy_AppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByget_NCBJ_ListBy_AppId",
				new String[] {Long.class.getName()},
				new String[] {"ncbjApplicationId"}, true);

		_finderPathCountByget_NCBJ_ListBy_AppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_NCBJ_ListBy_AppId", new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjCompanyDetailGenUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjCompanyDetailGenUtil.setPersistence(null);

		entityCache.removeCache(NcbjCompanyDetailGenImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJCOMPANYDETAILGEN =
		"SELECT ncbjCompanyDetailGen FROM NcbjCompanyDetailGen ncbjCompanyDetailGen";

	private static final String _SQL_SELECT_NCBJCOMPANYDETAILGEN_WHERE =
		"SELECT ncbjCompanyDetailGen FROM NcbjCompanyDetailGen ncbjCompanyDetailGen WHERE ";

	private static final String _SQL_COUNT_NCBJCOMPANYDETAILGEN =
		"SELECT COUNT(ncbjCompanyDetailGen) FROM NcbjCompanyDetailGen ncbjCompanyDetailGen";

	private static final String _SQL_COUNT_NCBJCOMPANYDETAILGEN_WHERE =
		"SELECT COUNT(ncbjCompanyDetailGen) FROM NcbjCompanyDetailGen ncbjCompanyDetailGen WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjCompanyDetailGen.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjCompanyDetailGen exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjCompanyDetailGen exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjCompanyDetailGenPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}