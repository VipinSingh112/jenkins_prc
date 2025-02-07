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

import com.nbp.ncbj.application.form.service.exception.NoSuchNCBJCompanyNewException;
import com.nbp.ncbj.application.form.service.model.NCBJCompanyNew;
import com.nbp.ncbj.application.form.service.model.NCBJCompanyNewTable;
import com.nbp.ncbj.application.form.service.model.impl.NCBJCompanyNewImpl;
import com.nbp.ncbj.application.form.service.model.impl.NCBJCompanyNewModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NCBJCompanyNewPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NCBJCompanyNewUtil;
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
 * The persistence implementation for the ncbj company new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NCBJCompanyNewPersistence.class)
public class NCBJCompanyNewPersistenceImpl
	extends BasePersistenceImpl<NCBJCompanyNew>
	implements NCBJCompanyNewPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NCBJCompanyNewUtil</code> to access the ncbj company new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NCBJCompanyNewImpl.class.getName();

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
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or throws a <code>NoSuchNCBJCompanyNewException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	@Override
	public NCBJCompanyNew findBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNCBJCompanyNewException {

		NCBJCompanyNew ncbjCompanyNew = fetchBygetNCBJ_ById(ncbjApplicationId);

		if (ncbjCompanyNew == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNCBJCompanyNewException(sb.toString());
		}

		return ncbjCompanyNew;
	}

	/**
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	@Override
	public NCBJCompanyNew fetchBygetNCBJ_ById(long ncbjApplicationId) {
		return fetchBygetNCBJ_ById(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj company new where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	@Override
	public NCBJCompanyNew fetchBygetNCBJ_ById(
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

		if (result instanceof NCBJCompanyNew) {
			NCBJCompanyNew ncbjCompanyNew = (NCBJCompanyNew)result;

			if (ncbjApplicationId != ncbjCompanyNew.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJCOMPANYNEW_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_BYID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NCBJCompanyNew> list = query.list();

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
								"NCBJCompanyNewPersistenceImpl.fetchBygetNCBJ_ById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NCBJCompanyNew ncbjCompanyNew = list.get(0);

					result = ncbjCompanyNew;

					cacheResult(ncbjCompanyNew);
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
			return (NCBJCompanyNew)result;
		}
	}

	/**
	 * Removes the ncbj company new where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj company new that was removed
	 */
	@Override
	public NCBJCompanyNew removeBygetNCBJ_ById(long ncbjApplicationId)
		throws NoSuchNCBJCompanyNewException {

		NCBJCompanyNew ncbjCompanyNew = findBygetNCBJ_ById(ncbjApplicationId);

		return remove(ncbjCompanyNew);
	}

	/**
	 * Returns the number of ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company news
	 */
	@Override
	public int countBygetNCBJ_ById(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJ_ById;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJCOMPANYNEW_WHERE);

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
			"ncbjCompanyNew.ncbjApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindByget_NCBJ_ListBy_AppId;
	private FinderPath _finderPathWithoutPaginationFindByget_NCBJ_ListBy_AppId;
	private FinderPath _finderPathCountByget_NCBJ_ListBy_AppId;

	/**
	 * Returns all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj company news
	 */
	@Override
	public List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId) {

		return findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @return the range of matching ncbj company news
	 */
	@Override
	public List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end) {

		return findByget_NCBJ_ListBy_AppId(ncbjApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj company news
	 */
	@Override
	public List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		return findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj company news
	 */
	@Override
	public List<NCBJCompanyNew> findByget_NCBJ_ListBy_AppId(
		long ncbjApplicationId, int start, int end,
		OrderByComparator<NCBJCompanyNew> orderByComparator,
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

		List<NCBJCompanyNew> list = null;

		if (useFinderCache) {
			list = (List<NCBJCompanyNew>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NCBJCompanyNew ncbjCompanyNew : list) {
					if (ncbjApplicationId !=
							ncbjCompanyNew.getNcbjApplicationId()) {

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

			sb.append(_SQL_SELECT_NCBJCOMPANYNEW_WHERE);

			sb.append(_FINDER_COLUMN_GET_NCBJ_LISTBY_APPID_NCBJAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NCBJCompanyNewModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				list = (List<NCBJCompanyNew>)QueryUtil.list(
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
	 * Returns the first ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	@Override
	public NCBJCompanyNew findByget_NCBJ_ListBy_AppId_First(
			long ncbjApplicationId,
			OrderByComparator<NCBJCompanyNew> orderByComparator)
		throws NoSuchNCBJCompanyNewException {

		NCBJCompanyNew ncbjCompanyNew = fetchByget_NCBJ_ListBy_AppId_First(
			ncbjApplicationId, orderByComparator);

		if (ncbjCompanyNew != null) {
			return ncbjCompanyNew;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNCBJCompanyNewException(sb.toString());
	}

	/**
	 * Returns the first ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	@Override
	public NCBJCompanyNew fetchByget_NCBJ_ListBy_AppId_First(
		long ncbjApplicationId,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		List<NCBJCompanyNew> list = findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a matching ncbj company new could not be found
	 */
	@Override
	public NCBJCompanyNew findByget_NCBJ_ListBy_AppId_Last(
			long ncbjApplicationId,
			OrderByComparator<NCBJCompanyNew> orderByComparator)
		throws NoSuchNCBJCompanyNewException {

		NCBJCompanyNew ncbjCompanyNew = fetchByget_NCBJ_ListBy_AppId_Last(
			ncbjApplicationId, orderByComparator);

		if (ncbjCompanyNew != null) {
			return ncbjCompanyNew;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("ncbjApplicationId=");
		sb.append(ncbjApplicationId);

		sb.append("}");

		throw new NoSuchNCBJCompanyNewException(sb.toString());
	}

	/**
	 * Returns the last ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj company new, or <code>null</code> if a matching ncbj company new could not be found
	 */
	@Override
	public NCBJCompanyNew fetchByget_NCBJ_ListBy_AppId_Last(
		long ncbjApplicationId,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		int count = countByget_NCBJ_ListBy_AppId(ncbjApplicationId);

		if (count == 0) {
			return null;
		}

		List<NCBJCompanyNew> list = findByget_NCBJ_ListBy_AppId(
			ncbjApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj company news before and after the current ncbj company new in the ordered set where ncbjApplicationId = &#63;.
	 *
	 * @param nCBJCompanyNewId the primary key of the current ncbj company new
	 * @param ncbjApplicationId the ncbj application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	@Override
	public NCBJCompanyNew[] findByget_NCBJ_ListBy_AppId_PrevAndNext(
			long nCBJCompanyNewId, long ncbjApplicationId,
			OrderByComparator<NCBJCompanyNew> orderByComparator)
		throws NoSuchNCBJCompanyNewException {

		NCBJCompanyNew ncbjCompanyNew = findByPrimaryKey(nCBJCompanyNewId);

		Session session = null;

		try {
			session = openSession();

			NCBJCompanyNew[] array = new NCBJCompanyNewImpl[3];

			array[0] = getByget_NCBJ_ListBy_AppId_PrevAndNext(
				session, ncbjCompanyNew, ncbjApplicationId, orderByComparator,
				true);

			array[1] = ncbjCompanyNew;

			array[2] = getByget_NCBJ_ListBy_AppId_PrevAndNext(
				session, ncbjCompanyNew, ncbjApplicationId, orderByComparator,
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

	protected NCBJCompanyNew getByget_NCBJ_ListBy_AppId_PrevAndNext(
		Session session, NCBJCompanyNew ncbjCompanyNew, long ncbjApplicationId,
		OrderByComparator<NCBJCompanyNew> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_NCBJCOMPANYNEW_WHERE);

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
			sb.append(NCBJCompanyNewModelImpl.ORDER_BY_JPQL);
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
						ncbjCompanyNew)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NCBJCompanyNew> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj company news where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 */
	@Override
	public void removeByget_NCBJ_ListBy_AppId(long ncbjApplicationId) {
		for (NCBJCompanyNew ncbjCompanyNew :
				findByget_NCBJ_ListBy_AppId(
					ncbjApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjCompanyNew);
		}
	}

	/**
	 * Returns the number of ncbj company news where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj company news
	 */
	@Override
	public int countByget_NCBJ_ListBy_AppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountByget_NCBJ_ListBy_AppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJCOMPANYNEW_WHERE);

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
			"ncbjCompanyNew.ncbjApplicationId = ?";

	public NCBJCompanyNewPersistenceImpl() {
		setModelClass(NCBJCompanyNew.class);

		setModelImplClass(NCBJCompanyNewImpl.class);
		setModelPKClass(long.class);

		setTable(NCBJCompanyNewTable.INSTANCE);
	}

	/**
	 * Caches the ncbj company new in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyNew the ncbj company new
	 */
	@Override
	public void cacheResult(NCBJCompanyNew ncbjCompanyNew) {
		entityCache.putResult(
			NCBJCompanyNewImpl.class, ncbjCompanyNew.getPrimaryKey(),
			ncbjCompanyNew);

		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById,
			new Object[] {ncbjCompanyNew.getNcbjApplicationId()},
			ncbjCompanyNew);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj company news in the entity cache if it is enabled.
	 *
	 * @param ncbjCompanyNews the ncbj company news
	 */
	@Override
	public void cacheResult(List<NCBJCompanyNew> ncbjCompanyNews) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjCompanyNews.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NCBJCompanyNew ncbjCompanyNew : ncbjCompanyNews) {
			if (entityCache.getResult(
					NCBJCompanyNewImpl.class, ncbjCompanyNew.getPrimaryKey()) ==
						null) {

				cacheResult(ncbjCompanyNew);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj company news.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NCBJCompanyNewImpl.class);

		finderCache.clearCache(NCBJCompanyNewImpl.class);
	}

	/**
	 * Clears the cache for the ncbj company new.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NCBJCompanyNew ncbjCompanyNew) {
		entityCache.removeResult(NCBJCompanyNewImpl.class, ncbjCompanyNew);
	}

	@Override
	public void clearCache(List<NCBJCompanyNew> ncbjCompanyNews) {
		for (NCBJCompanyNew ncbjCompanyNew : ncbjCompanyNews) {
			entityCache.removeResult(NCBJCompanyNewImpl.class, ncbjCompanyNew);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NCBJCompanyNewImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NCBJCompanyNewImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NCBJCompanyNewModelImpl ncbjCompanyNewModelImpl) {

		Object[] args = new Object[] {
			ncbjCompanyNewModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJ_ById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJ_ById, args, ncbjCompanyNewModelImpl);
	}

	/**
	 * Creates a new ncbj company new with the primary key. Does not add the ncbj company new to the database.
	 *
	 * @param nCBJCompanyNewId the primary key for the new ncbj company new
	 * @return the new ncbj company new
	 */
	@Override
	public NCBJCompanyNew create(long nCBJCompanyNewId) {
		NCBJCompanyNew ncbjCompanyNew = new NCBJCompanyNewImpl();

		ncbjCompanyNew.setNew(true);
		ncbjCompanyNew.setPrimaryKey(nCBJCompanyNewId);

		ncbjCompanyNew.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjCompanyNew;
	}

	/**
	 * Removes the ncbj company new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new that was removed
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	@Override
	public NCBJCompanyNew remove(long nCBJCompanyNewId)
		throws NoSuchNCBJCompanyNewException {

		return remove((Serializable)nCBJCompanyNewId);
	}

	/**
	 * Removes the ncbj company new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj company new
	 * @return the ncbj company new that was removed
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	@Override
	public NCBJCompanyNew remove(Serializable primaryKey)
		throws NoSuchNCBJCompanyNewException {

		Session session = null;

		try {
			session = openSession();

			NCBJCompanyNew ncbjCompanyNew = (NCBJCompanyNew)session.get(
				NCBJCompanyNewImpl.class, primaryKey);

			if (ncbjCompanyNew == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNCBJCompanyNewException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjCompanyNew);
		}
		catch (NoSuchNCBJCompanyNewException noSuchEntityException) {
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
	protected NCBJCompanyNew removeImpl(NCBJCompanyNew ncbjCompanyNew) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjCompanyNew)) {
				ncbjCompanyNew = (NCBJCompanyNew)session.get(
					NCBJCompanyNewImpl.class,
					ncbjCompanyNew.getPrimaryKeyObj());
			}

			if (ncbjCompanyNew != null) {
				session.delete(ncbjCompanyNew);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjCompanyNew != null) {
			clearCache(ncbjCompanyNew);
		}

		return ncbjCompanyNew;
	}

	@Override
	public NCBJCompanyNew updateImpl(NCBJCompanyNew ncbjCompanyNew) {
		boolean isNew = ncbjCompanyNew.isNew();

		if (!(ncbjCompanyNew instanceof NCBJCompanyNewModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjCompanyNew.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjCompanyNew);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjCompanyNew proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NCBJCompanyNew implementation " +
					ncbjCompanyNew.getClass());
		}

		NCBJCompanyNewModelImpl ncbjCompanyNewModelImpl =
			(NCBJCompanyNewModelImpl)ncbjCompanyNew;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjCompanyNew.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjCompanyNew.setCreateDate(date);
			}
			else {
				ncbjCompanyNew.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjCompanyNewModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjCompanyNew.setModifiedDate(date);
			}
			else {
				ncbjCompanyNew.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjCompanyNew);
			}
			else {
				ncbjCompanyNew = (NCBJCompanyNew)session.merge(ncbjCompanyNew);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NCBJCompanyNewImpl.class, ncbjCompanyNewModelImpl, false, true);

		cacheUniqueFindersCache(ncbjCompanyNewModelImpl);

		if (isNew) {
			ncbjCompanyNew.setNew(false);
		}

		ncbjCompanyNew.resetOriginalValues();

		return ncbjCompanyNew;
	}

	/**
	 * Returns the ncbj company new with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj company new
	 * @return the ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	@Override
	public NCBJCompanyNew findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNCBJCompanyNewException {

		NCBJCompanyNew ncbjCompanyNew = fetchByPrimaryKey(primaryKey);

		if (ncbjCompanyNew == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNCBJCompanyNewException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjCompanyNew;
	}

	/**
	 * Returns the ncbj company new with the primary key or throws a <code>NoSuchNCBJCompanyNewException</code> if it could not be found.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new
	 * @throws NoSuchNCBJCompanyNewException if a ncbj company new with the primary key could not be found
	 */
	@Override
	public NCBJCompanyNew findByPrimaryKey(long nCBJCompanyNewId)
		throws NoSuchNCBJCompanyNewException {

		return findByPrimaryKey((Serializable)nCBJCompanyNewId);
	}

	/**
	 * Returns the ncbj company new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param nCBJCompanyNewId the primary key of the ncbj company new
	 * @return the ncbj company new, or <code>null</code> if a ncbj company new with the primary key could not be found
	 */
	@Override
	public NCBJCompanyNew fetchByPrimaryKey(long nCBJCompanyNewId) {
		return fetchByPrimaryKey((Serializable)nCBJCompanyNewId);
	}

	/**
	 * Returns all the ncbj company news.
	 *
	 * @return the ncbj company news
	 */
	@Override
	public List<NCBJCompanyNew> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @return the range of ncbj company news
	 */
	@Override
	public List<NCBJCompanyNew> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj company news
	 */
	@Override
	public List<NCBJCompanyNew> findAll(
		int start, int end,
		OrderByComparator<NCBJCompanyNew> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj company news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NCBJCompanyNewModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj company news
	 * @param end the upper bound of the range of ncbj company news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj company news
	 */
	@Override
	public List<NCBJCompanyNew> findAll(
		int start, int end, OrderByComparator<NCBJCompanyNew> orderByComparator,
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

		List<NCBJCompanyNew> list = null;

		if (useFinderCache) {
			list = (List<NCBJCompanyNew>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJCOMPANYNEW);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJCOMPANYNEW;

				sql = sql.concat(NCBJCompanyNewModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NCBJCompanyNew>)QueryUtil.list(
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
	 * Removes all the ncbj company news from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NCBJCompanyNew ncbjCompanyNew : findAll()) {
			remove(ncbjCompanyNew);
		}
	}

	/**
	 * Returns the number of ncbj company news.
	 *
	 * @return the number of ncbj company news
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJCOMPANYNEW);

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
		return "nCBJCompanyNewId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJCOMPANYNEW;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NCBJCompanyNewModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj company new persistence.
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

		NCBJCompanyNewUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NCBJCompanyNewUtil.setPersistence(null);

		entityCache.removeCache(NCBJCompanyNewImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJCOMPANYNEW =
		"SELECT ncbjCompanyNew FROM NCBJCompanyNew ncbjCompanyNew";

	private static final String _SQL_SELECT_NCBJCOMPANYNEW_WHERE =
		"SELECT ncbjCompanyNew FROM NCBJCompanyNew ncbjCompanyNew WHERE ";

	private static final String _SQL_COUNT_NCBJCOMPANYNEW =
		"SELECT COUNT(ncbjCompanyNew) FROM NCBJCompanyNew ncbjCompanyNew";

	private static final String _SQL_COUNT_NCBJCOMPANYNEW_WHERE =
		"SELECT COUNT(ncbjCompanyNew) FROM NCBJCompanyNew ncbjCompanyNew WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjCompanyNew.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NCBJCompanyNew exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NCBJCompanyNew exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NCBJCompanyNewPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}