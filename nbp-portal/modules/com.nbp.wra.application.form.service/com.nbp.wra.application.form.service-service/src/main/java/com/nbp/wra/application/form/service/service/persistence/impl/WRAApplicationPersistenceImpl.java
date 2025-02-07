/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.service.persistence.impl;

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

import com.nbp.wra.application.form.service.exception.NoSuchWRAApplicationException;
import com.nbp.wra.application.form.service.model.WRAApplication;
import com.nbp.wra.application.form.service.model.WRAApplicationTable;
import com.nbp.wra.application.form.service.model.impl.WRAApplicationImpl;
import com.nbp.wra.application.form.service.model.impl.WRAApplicationModelImpl;
import com.nbp.wra.application.form.service.service.persistence.WRAApplicationPersistence;
import com.nbp.wra.application.form.service.service.persistence.WRAApplicationUtil;
import com.nbp.wra.application.form.service.service.persistence.impl.constants.WRA_APPLICATIONPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Timestamp;

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
 * The persistence implementation for the wra application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = WRAApplicationPersistence.class)
public class WRAApplicationPersistenceImpl
	extends BasePersistenceImpl<WRAApplication>
	implements WRAApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>WRAApplicationUtil</code> to access the wra application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		WRAApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetWRA_ByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetWRA_ByS_U;
	private FinderPath _finderPathCountBygetWRA_ByS_U;

	/**
	 * Returns all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_ByS_U(int status, long userId) {
		return findBygetWRA_ByS_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end) {

		return findBygetWRA_ByS_U(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return findBygetWRA_ByS_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_ByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWRA_ByS_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWRA_ByS_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<WRAApplication> list = null;

		if (useFinderCache) {
			list = (List<WRAApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAApplication wraApplication : list) {
					if ((status != wraApplication.getStatus()) ||
						(userId != wraApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETWRA_BYS_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WRAApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<WRAApplication>)QueryUtil.list(
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
	 * Returns the first wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_ByS_U_First(
			int status, long userId,
			OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_ByS_U_First(
			status, userId, orderByComparator);

		if (wraApplication != null) {
			return wraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchWRAApplicationException(sb.toString());
	}

	/**
	 * Returns the first wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_ByS_U_First(
		int status, long userId,
		OrderByComparator<WRAApplication> orderByComparator) {

		List<WRAApplication> list = findBygetWRA_ByS_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_ByS_U_Last(
			int status, long userId,
			OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_ByS_U_Last(
			status, userId, orderByComparator);

		if (wraApplication != null) {
			return wraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchWRAApplicationException(sb.toString());
	}

	/**
	 * Returns the last wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_ByS_U_Last(
		int status, long userId,
		OrderByComparator<WRAApplication> orderByComparator) {

		int count = countBygetWRA_ByS_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<WRAApplication> list = findBygetWRA_ByS_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication[] findBygetWRA_ByS_U_PrevAndNext(
			long wraApplicationId, int status, long userId,
			OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findByPrimaryKey(wraApplicationId);

		Session session = null;

		try {
			session = openSession();

			WRAApplication[] array = new WRAApplicationImpl[3];

			array[0] = getBygetWRA_ByS_U_PrevAndNext(
				session, wraApplication, status, userId, orderByComparator,
				true);

			array[1] = wraApplication;

			array[2] = getBygetWRA_ByS_U_PrevAndNext(
				session, wraApplication, status, userId, orderByComparator,
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

	protected WRAApplication getBygetWRA_ByS_U_PrevAndNext(
		Session session, WRAApplication wraApplication, int status, long userId,
		OrderByComparator<WRAApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETWRA_BYS_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETWRA_BYS_U_USERID_2);

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
			sb.append(WRAApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetWRA_ByS_U(int status, long userId) {
		for (WRAApplication wraApplication :
				findBygetWRA_ByS_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraApplication);
		}
	}

	/**
	 * Returns the number of wra applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching wra applications
	 */
	@Override
	public int countBygetWRA_ByS_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetWRA_ByS_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETWRA_BYS_U_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

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

	private static final String _FINDER_COLUMN_GETWRA_BYS_U_STATUS_2 =
		"wraApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETWRA_BYS_U_USERID_2 =
		"wraApplication.userId = ?";

	private FinderPath _finderPathFetchBygetWRA_By_CaseId;
	private FinderPath _finderPathCountBygetWRA_By_CaseId;

	/**
	 * Returns the wra application where caseId = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_By_CaseId(String caseId)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_By_CaseId(caseId);

		if (wraApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAApplicationException(sb.toString());
		}

		return wraApplication;
	}

	/**
	 * Returns the wra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_CaseId(String caseId) {
		return fetchBygetWRA_By_CaseId(caseId, true);
	}

	/**
	 * Returns the wra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRA_By_CaseId, finderArgs, this);
		}

		if (result instanceof WRAApplication) {
			WRAApplication wraApplication = (WRAApplication)result;

			if (!Objects.equals(caseId, wraApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_2);
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

				List<WRAApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRA_By_CaseId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"WRAApplicationPersistenceImpl.fetchBygetWRA_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAApplication wraApplication = list.get(0);

					result = wraApplication;

					cacheResult(wraApplication);
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
			return (WRAApplication)result;
		}
	}

	/**
	 * Removes the wra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the wra application that was removed
	 */
	@Override
	public WRAApplication removeBygetWRA_By_CaseId(String caseId)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findBygetWRA_By_CaseId(caseId);

		return remove(wraApplication);
	}

	/**
	 * Returns the number of wra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching wra applications
	 */
	@Override
	public int countBygetWRA_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWRA_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_2 =
		"wraApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRA_BY_CASEID_CASEID_3 =
		"(wraApplication.caseId IS NULL OR wraApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetWRA_By_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetWRA_By_Status;
	private FinderPath _finderPathCountBygetWRA_By_Status;

	/**
	 * Returns all the wra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_Status(int status) {
		return findBygetWRA_By_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end) {

		return findBygetWRA_By_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return findBygetWRA_By_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_Status(
		int status, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetWRA_By_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWRA_By_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<WRAApplication> list = null;

		if (useFinderCache) {
			list = (List<WRAApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAApplication wraApplication : list) {
					if (status != wraApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WRAApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<WRAApplication>)QueryUtil.list(
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
	 * Returns the first wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_By_Status_First(
			int status, OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_By_Status_First(
			status, orderByComparator);

		if (wraApplication != null) {
			return wraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchWRAApplicationException(sb.toString());
	}

	/**
	 * Returns the first wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_Status_First(
		int status, OrderByComparator<WRAApplication> orderByComparator) {

		List<WRAApplication> list = findBygetWRA_By_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_By_Status_Last(
			int status, OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_By_Status_Last(
			status, orderByComparator);

		if (wraApplication != null) {
			return wraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchWRAApplicationException(sb.toString());
	}

	/**
	 * Returns the last wra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_Status_Last(
		int status, OrderByComparator<WRAApplication> orderByComparator) {

		int count = countBygetWRA_By_Status(status);

		if (count == 0) {
			return null;
		}

		List<WRAApplication> list = findBygetWRA_By_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where status = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication[] findBygetWRA_By_Status_PrevAndNext(
			long wraApplicationId, int status,
			OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findByPrimaryKey(wraApplicationId);

		Session session = null;

		try {
			session = openSession();

			WRAApplication[] array = new WRAApplicationImpl[3];

			array[0] = getBygetWRA_By_Status_PrevAndNext(
				session, wraApplication, status, orderByComparator, true);

			array[1] = wraApplication;

			array[2] = getBygetWRA_By_Status_PrevAndNext(
				session, wraApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected WRAApplication getBygetWRA_By_Status_PrevAndNext(
		Session session, WRAApplication wraApplication, int status,
		OrderByComparator<WRAApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETWRA_BY_STATUS_STATUS_2);

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
			sb.append(WRAApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetWRA_By_Status(int status) {
		for (WRAApplication wraApplication :
				findBygetWRA_By_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraApplication);
		}
	}

	/**
	 * Returns the number of wra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching wra applications
	 */
	@Override
	public int countBygetWRA_By_Status(int status) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETWRA_BY_STATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

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

	private static final String _FINDER_COLUMN_GETWRA_BY_STATUS_STATUS_2 =
		"wraApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetWRA_By_EntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetWRA_By_EntityId;
	private FinderPath _finderPathCountBygetWRA_By_EntityId;

	/**
	 * Returns all the wra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_EntityId(Date entityId) {
		return findBygetWRA_By_EntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end) {

		return findBygetWRA_By_EntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return findBygetWRA_By_EntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_EntityId(
		Date entityId, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetWRA_By_EntityId;
				finderArgs = new Object[] {_getTime(entityId)};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetWRA_By_EntityId;
			finderArgs = new Object[] {
				_getTime(entityId), start, end, orderByComparator
			};
		}

		List<WRAApplication> list = null;

		if (useFinderCache) {
			list = (List<WRAApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAApplication wraApplication : list) {
					if (!Objects.equals(
							entityId, wraApplication.getEntityId())) {

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

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId == null) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_ENTITYID_1);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WRAApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(new Timestamp(entityId.getTime()));
				}

				list = (List<WRAApplication>)QueryUtil.list(
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
	 * Returns the first wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_By_EntityId_First(
			Date entityId, OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_By_EntityId_First(
			entityId, orderByComparator);

		if (wraApplication != null) {
			return wraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchWRAApplicationException(sb.toString());
	}

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_EntityId_First(
		Date entityId, OrderByComparator<WRAApplication> orderByComparator) {

		List<WRAApplication> list = findBygetWRA_By_EntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_By_EntityId_Last(
			Date entityId, OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_By_EntityId_Last(
			entityId, orderByComparator);

		if (wraApplication != null) {
			return wraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchWRAApplicationException(sb.toString());
	}

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_EntityId_Last(
		Date entityId, OrderByComparator<WRAApplication> orderByComparator) {

		int count = countBygetWRA_By_EntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<WRAApplication> list = findBygetWRA_By_EntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where entityId = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication[] findBygetWRA_By_EntityId_PrevAndNext(
			long wraApplicationId, Date entityId,
			OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findByPrimaryKey(wraApplicationId);

		Session session = null;

		try {
			session = openSession();

			WRAApplication[] array = new WRAApplicationImpl[3];

			array[0] = getBygetWRA_By_EntityId_PrevAndNext(
				session, wraApplication, entityId, orderByComparator, true);

			array[1] = wraApplication;

			array[2] = getBygetWRA_By_EntityId_PrevAndNext(
				session, wraApplication, entityId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected WRAApplication getBygetWRA_By_EntityId_PrevAndNext(
		Session session, WRAApplication wraApplication, Date entityId,
		OrderByComparator<WRAApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId == null) {
			sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_ENTITYID_1);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_ENTITYID_2);
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
			sb.append(WRAApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEntityId) {
			queryPos.add(new Timestamp(entityId.getTime()));
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetWRA_By_EntityId(Date entityId) {
		for (WRAApplication wraApplication :
				findBygetWRA_By_EntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(wraApplication);
		}
	}

	/**
	 * Returns the number of wra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching wra applications
	 */
	@Override
	public int countBygetWRA_By_EntityId(Date entityId) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_EntityId;

		Object[] finderArgs = new Object[] {_getTime(entityId)};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId == null) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_ENTITYID_1);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_ENTITYID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(new Timestamp(entityId.getTime()));
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

	private static final String _FINDER_COLUMN_GETWRA_BY_ENTITYID_ENTITYID_1 =
		"wraApplication.entityId IS NULL";

	private static final String _FINDER_COLUMN_GETWRA_BY_ENTITYID_ENTITYID_2 =
		"wraApplication.entityId = ?";

	private FinderPath _finderPathWithPaginationFindBygetWRA_By_EntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetWRA_By_EntityId_Status;
	private FinderPath _finderPathCountBygetWRA_By_EntityId_Status;

	/**
	 * Returns all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status) {

		return findBygetWRA_By_EntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end) {

		return findBygetWRA_By_EntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return findBygetWRA_By_EntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching wra applications
	 */
	@Override
	public List<WRAApplication> findBygetWRA_By_EntityId_Status(
		Date entityId, int status, int start, int end,
		OrderByComparator<WRAApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetWRA_By_EntityId_Status;
				finderArgs = new Object[] {_getTime(entityId), status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetWRA_By_EntityId_Status;
			finderArgs = new Object[] {
				_getTime(entityId), status, start, end, orderByComparator
			};
		}

		List<WRAApplication> list = null;

		if (useFinderCache) {
			list = (List<WRAApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (WRAApplication wraApplication : list) {
					if (!Objects.equals(
							entityId, wraApplication.getEntityId()) ||
						(status != wraApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId == null) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_ENTITYID_1);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(WRAApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(new Timestamp(entityId.getTime()));
				}

				queryPos.add(status);

				list = (List<WRAApplication>)QueryUtil.list(
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
	 * Returns the first wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_By_EntityId_Status_First(
			Date entityId, int status,
			OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_By_EntityId_Status_First(
			entityId, status, orderByComparator);

		if (wraApplication != null) {
			return wraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchWRAApplicationException(sb.toString());
	}

	/**
	 * Returns the first wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_EntityId_Status_First(
		Date entityId, int status,
		OrderByComparator<WRAApplication> orderByComparator) {

		List<WRAApplication> list = findBygetWRA_By_EntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_By_EntityId_Status_Last(
			Date entityId, int status,
			OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_By_EntityId_Status_Last(
			entityId, status, orderByComparator);

		if (wraApplication != null) {
			return wraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchWRAApplicationException(sb.toString());
	}

	/**
	 * Returns the last wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_EntityId_Status_Last(
		Date entityId, int status,
		OrderByComparator<WRAApplication> orderByComparator) {

		int count = countBygetWRA_By_EntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<WRAApplication> list = findBygetWRA_By_EntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the wra applications before and after the current wra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param wraApplicationId the primary key of the current wra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication[] findBygetWRA_By_EntityId_Status_PrevAndNext(
			long wraApplicationId, Date entityId, int status,
			OrderByComparator<WRAApplication> orderByComparator)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findByPrimaryKey(wraApplicationId);

		Session session = null;

		try {
			session = openSession();

			WRAApplication[] array = new WRAApplicationImpl[3];

			array[0] = getBygetWRA_By_EntityId_Status_PrevAndNext(
				session, wraApplication, entityId, status, orderByComparator,
				true);

			array[1] = wraApplication;

			array[2] = getBygetWRA_By_EntityId_Status_PrevAndNext(
				session, wraApplication, entityId, status, orderByComparator,
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

	protected WRAApplication getBygetWRA_By_EntityId_Status_PrevAndNext(
		Session session, WRAApplication wraApplication, Date entityId,
		int status, OrderByComparator<WRAApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId == null) {
			sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_ENTITYID_1);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_STATUS_2);

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
			sb.append(WRAApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEntityId) {
			queryPos.add(new Timestamp(entityId.getTime()));
		}

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						wraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<WRAApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the wra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetWRA_By_EntityId_Status(Date entityId, int status) {
		for (WRAApplication wraApplication :
				findBygetWRA_By_EntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(wraApplication);
		}
	}

	/**
	 * Returns the number of wra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching wra applications
	 */
	@Override
	public int countBygetWRA_By_EntityId_Status(Date entityId, int status) {
		FinderPath finderPath = _finderPathCountBygetWRA_By_EntityId_Status;

		Object[] finderArgs = new Object[] {_getTime(entityId), status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId == null) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_ENTITYID_1);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(new Timestamp(entityId.getTime()));
				}

				queryPos.add(status);

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
		_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_ENTITYID_1 =
			"wraApplication.entityId IS NULL AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_ENTITYID_2 =
			"wraApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETWRA_BY_ENTITYID_STATUS_STATUS_2 =
			"wraApplication.status = ?";

	private FinderPath _finderPathFetchBygetWRA_By_EI_CI;
	private FinderPath _finderPathCountBygetWRA_By_EI_CI;

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRA_By_EI_CI(Date entityId, String caseId)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRA_By_EI_CI(
			entityId, caseId);

		if (wraApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("entityId=");
			sb.append(entityId);

			sb.append(", caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAApplicationException(sb.toString());
		}

		return wraApplication;
	}

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_EI_CI(Date entityId, String caseId) {
		return fetchBygetWRA_By_EI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the wra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRA_By_EI_CI(
		Date entityId, String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {_getTime(entityId), caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRA_By_EI_CI, finderArgs, this);
		}

		if (result instanceof WRAApplication) {
			WRAApplication wraApplication = (WRAApplication)result;

			if (!Objects.equals(entityId, wraApplication.getEntityId()) ||
				!Objects.equals(caseId, wraApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId == null) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_EI_CI_ENTITYID_1);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_EI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_EI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_EI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(new Timestamp(entityId.getTime()));
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<WRAApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRA_By_EI_CI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									_getTime(entityId), caseId
								};
							}

							_log.warn(
								"WRAApplicationPersistenceImpl.fetchBygetWRA_By_EI_CI(Date, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAApplication wraApplication = list.get(0);

					result = wraApplication;

					cacheResult(wraApplication);
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
			return (WRAApplication)result;
		}
	}

	/**
	 * Removes the wra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the wra application that was removed
	 */
	@Override
	public WRAApplication removeBygetWRA_By_EI_CI(Date entityId, String caseId)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findBygetWRA_By_EI_CI(entityId, caseId);

		return remove(wraApplication);
	}

	/**
	 * Returns the number of wra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching wra applications
	 */
	@Override
	public int countBygetWRA_By_EI_CI(Date entityId, String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetWRA_By_EI_CI;

		Object[] finderArgs = new Object[] {_getTime(entityId), caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId == null) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_EI_CI_ENTITYID_1);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_EI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRA_BY_EI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETWRA_BY_EI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(new Timestamp(entityId.getTime()));
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

	private static final String _FINDER_COLUMN_GETWRA_BY_EI_CI_ENTITYID_1 =
		"wraApplication.entityId IS NULL AND ";

	private static final String _FINDER_COLUMN_GETWRA_BY_EI_CI_ENTITYID_2 =
		"wraApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETWRA_BY_EI_CI_CASEID_2 =
		"wraApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETWRA_BY_EI_CI_CASEID_3 =
		"(wraApplication.caseId IS NULL OR wraApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetWRAByAppNo;
	private FinderPath _finderPathCountBygetWRAByAppNo;

	/**
	 * Returns the wra application where applicationNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWRAByAppNo(String applicationNumber)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWRAByAppNo(applicationNumber);

		if (wraApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAApplicationException(sb.toString());
		}

		return wraApplication;
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRAByAppNo(String applicationNumber) {
		return fetchBygetWRAByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWRAByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWRAByAppNo, finderArgs, this);
		}

		if (result instanceof WRAApplication) {
			WRAApplication wraApplication = (WRAApplication)result;

			if (!Objects.equals(
					applicationNumber, wraApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRABYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETWRABYAPPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<WRAApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWRAByAppNo, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"WRAApplicationPersistenceImpl.fetchBygetWRAByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAApplication wraApplication = list.get(0);

					result = wraApplication;

					cacheResult(wraApplication);
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
			return (WRAApplication)result;
		}
	}

	/**
	 * Removes the wra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the wra application that was removed
	 */
	@Override
	public WRAApplication removeBygetWRAByAppNo(String applicationNumber)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findBygetWRAByAppNo(applicationNumber);

		return remove(wraApplication);
	}

	/**
	 * Returns the number of wra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching wra applications
	 */
	@Override
	public int countBygetWRAByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetWRAByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRABYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETWRABYAPPNO_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
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

	private static final String
		_FINDER_COLUMN_GETWRABYAPPNO_APPLICATIONNUMBER_2 =
			"wraApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETWRABYAPPNO_APPLICATIONNUMBER_3 =
			"(wraApplication.applicationNumber IS NULL OR wraApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchByget_WraBy_Case_Id;
	private FinderPath _finderPathCountByget_WraBy_Case_Id;

	/**
	 * Returns the wra application where applicationNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findByget_WraBy_Case_Id(String applicationNumber)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchByget_WraBy_Case_Id(
			applicationNumber);

		if (wraApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAApplicationException(sb.toString());
		}

		return wraApplication;
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchByget_WraBy_Case_Id(String applicationNumber) {
		return fetchByget_WraBy_Case_Id(applicationNumber, true);
	}

	/**
	 * Returns the wra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchByget_WraBy_Case_Id(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_WraBy_Case_Id, finderArgs, this);
		}

		if (result instanceof WRAApplication) {
			WRAApplication wraApplication = (WRAApplication)result;

			if (!Objects.equals(
					applicationNumber, wraApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_WRABY_CASE_ID_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GET_WRABY_CASE_ID_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<WRAApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_WraBy_Case_Id, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"WRAApplicationPersistenceImpl.fetchByget_WraBy_Case_Id(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAApplication wraApplication = list.get(0);

					result = wraApplication;

					cacheResult(wraApplication);
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
			return (WRAApplication)result;
		}
	}

	/**
	 * Removes the wra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the wra application that was removed
	 */
	@Override
	public WRAApplication removeByget_WraBy_Case_Id(String applicationNumber)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findByget_WraBy_Case_Id(
			applicationNumber);

		return remove(wraApplication);
	}

	/**
	 * Returns the number of wra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching wra applications
	 */
	@Override
	public int countByget_WraBy_Case_Id(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountByget_WraBy_Case_Id;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_WRABY_CASE_ID_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GET_WRABY_CASE_ID_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
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

	private static final String
		_FINDER_COLUMN_GET_WRABY_CASE_ID_APPLICATIONNUMBER_2 =
			"wraApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GET_WRABY_CASE_ID_APPLICATIONNUMBER_3 =
			"(wraApplication.applicationNumber IS NULL OR wraApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetWraByRT_AppNo;
	private FinderPath _finderPathCountBygetWraByRT_AppNo;

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching wra application
	 * @throws NoSuchWRAApplicationException if a matching wra application could not be found
	 */
	@Override
	public WRAApplication findBygetWraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchBygetWraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);

		if (wraApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfTransaction=");
			sb.append(typeOfTransaction);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchWRAApplicationException(sb.toString());
		}

		return wraApplication;
	}

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return fetchBygetWraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching wra application, or <code>null</code> if a matching wra application could not be found
	 */
	@Override
	public WRAApplication fetchBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				typeOfTransaction, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetWraByRT_AppNo, finderArgs, this);
		}

		if (result instanceof WRAApplication) {
			WRAApplication wraApplication = (WRAApplication)result;

			if (!Objects.equals(
					typeOfTransaction, wraApplication.getTypeOfTransaction()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					wraApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_WRAAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRABYRT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(_FINDER_COLUMN_GETWRABYRT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETWRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfTransaction) {
					queryPos.add(typeOfTransaction);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<WRAApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetWraByRT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfTransaction, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"WRAApplicationPersistenceImpl.fetchBygetWraByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					WRAApplication wraApplication = list.get(0);

					result = wraApplication;

					cacheResult(wraApplication);
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
			return (WRAApplication)result;
		}
	}

	/**
	 * Removes the wra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the wra application that was removed
	 */
	@Override
	public WRAApplication removeBygetWraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = findBygetWraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);

		return remove(wraApplication);
	}

	/**
	 * Returns the number of wra applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching wra applications
	 */
	@Override
	public int countBygetWraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetWraByRT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_WRAAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETWRABYRT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(_FINDER_COLUMN_GETWRABYRT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETWRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETWRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfTransaction) {
					queryPos.add(typeOfTransaction);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
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

	private static final String
		_FINDER_COLUMN_GETWRABYRT_APPNO_TYPEOFTRANSACTION_2 =
			"wraApplication.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETWRABYRT_APPNO_TYPEOFTRANSACTION_3 =
			"(wraApplication.typeOfTransaction IS NULL OR wraApplication.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETWRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"wraApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETWRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(wraApplication.expiredLicenseAppNumber IS NULL OR wraApplication.expiredLicenseAppNumber = '')";

	public WRAApplicationPersistenceImpl() {
		setModelClass(WRAApplication.class);

		setModelImplClass(WRAApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(WRAApplicationTable.INSTANCE);
	}

	/**
	 * Caches the wra application in the entity cache if it is enabled.
	 *
	 * @param wraApplication the wra application
	 */
	@Override
	public void cacheResult(WRAApplication wraApplication) {
		entityCache.putResult(
			WRAApplicationImpl.class, wraApplication.getPrimaryKey(),
			wraApplication);

		finderCache.putResult(
			_finderPathFetchBygetWRA_By_CaseId,
			new Object[] {wraApplication.getCaseId()}, wraApplication);

		finderCache.putResult(
			_finderPathFetchBygetWRA_By_EI_CI,
			new Object[] {
				wraApplication.getEntityId(), wraApplication.getCaseId()
			},
			wraApplication);

		finderCache.putResult(
			_finderPathFetchBygetWRAByAppNo,
			new Object[] {wraApplication.getApplicationNumber()},
			wraApplication);

		finderCache.putResult(
			_finderPathFetchByget_WraBy_Case_Id,
			new Object[] {wraApplication.getApplicationNumber()},
			wraApplication);

		finderCache.putResult(
			_finderPathFetchBygetWraByRT_AppNo,
			new Object[] {
				wraApplication.getTypeOfTransaction(),
				wraApplication.getExpiredLicenseAppNumber()
			},
			wraApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the wra applications in the entity cache if it is enabled.
	 *
	 * @param wraApplications the wra applications
	 */
	@Override
	public void cacheResult(List<WRAApplication> wraApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (wraApplications.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (WRAApplication wraApplication : wraApplications) {
			if (entityCache.getResult(
					WRAApplicationImpl.class, wraApplication.getPrimaryKey()) ==
						null) {

				cacheResult(wraApplication);
			}
		}
	}

	/**
	 * Clears the cache for all wra applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(WRAApplicationImpl.class);

		finderCache.clearCache(WRAApplicationImpl.class);
	}

	/**
	 * Clears the cache for the wra application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(WRAApplication wraApplication) {
		entityCache.removeResult(WRAApplicationImpl.class, wraApplication);
	}

	@Override
	public void clearCache(List<WRAApplication> wraApplications) {
		for (WRAApplication wraApplication : wraApplications) {
			entityCache.removeResult(WRAApplicationImpl.class, wraApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(WRAApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(WRAApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		WRAApplicationModelImpl wraApplicationModelImpl) {

		Object[] args = new Object[] {wraApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetWRA_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRA_By_CaseId, args, wraApplicationModelImpl);

		args = new Object[] {
			_getTime(wraApplicationModelImpl.getEntityId()),
			wraApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetWRA_By_EI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRA_By_EI_CI, args, wraApplicationModelImpl);

		args = new Object[] {wraApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetWRAByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWRAByAppNo, args, wraApplicationModelImpl);

		args = new Object[] {wraApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountByget_WraBy_Case_Id, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_WraBy_Case_Id, args, wraApplicationModelImpl);

		args = new Object[] {
			wraApplicationModelImpl.getTypeOfTransaction(),
			wraApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetWraByRT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetWraByRT_AppNo, args, wraApplicationModelImpl);
	}

	/**
	 * Creates a new wra application with the primary key. Does not add the wra application to the database.
	 *
	 * @param wraApplicationId the primary key for the new wra application
	 * @return the new wra application
	 */
	@Override
	public WRAApplication create(long wraApplicationId) {
		WRAApplication wraApplication = new WRAApplicationImpl();

		wraApplication.setNew(true);
		wraApplication.setPrimaryKey(wraApplicationId);

		wraApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return wraApplication;
	}

	/**
	 * Removes the wra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application that was removed
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication remove(long wraApplicationId)
		throws NoSuchWRAApplicationException {

		return remove((Serializable)wraApplicationId);
	}

	/**
	 * Removes the wra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the wra application
	 * @return the wra application that was removed
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication remove(Serializable primaryKey)
		throws NoSuchWRAApplicationException {

		Session session = null;

		try {
			session = openSession();

			WRAApplication wraApplication = (WRAApplication)session.get(
				WRAApplicationImpl.class, primaryKey);

			if (wraApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchWRAApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(wraApplication);
		}
		catch (NoSuchWRAApplicationException noSuchEntityException) {
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
	protected WRAApplication removeImpl(WRAApplication wraApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(wraApplication)) {
				wraApplication = (WRAApplication)session.get(
					WRAApplicationImpl.class,
					wraApplication.getPrimaryKeyObj());
			}

			if (wraApplication != null) {
				session.delete(wraApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (wraApplication != null) {
			clearCache(wraApplication);
		}

		return wraApplication;
	}

	@Override
	public WRAApplication updateImpl(WRAApplication wraApplication) {
		boolean isNew = wraApplication.isNew();

		if (!(wraApplication instanceof WRAApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(wraApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					wraApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in wraApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom WRAApplication implementation " +
					wraApplication.getClass());
		}

		WRAApplicationModelImpl wraApplicationModelImpl =
			(WRAApplicationModelImpl)wraApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (wraApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				wraApplication.setCreateDate(date);
			}
			else {
				wraApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!wraApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				wraApplication.setModifiedDate(date);
			}
			else {
				wraApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(wraApplication);
			}
			else {
				wraApplication = (WRAApplication)session.merge(wraApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			WRAApplicationImpl.class, wraApplicationModelImpl, false, true);

		cacheUniqueFindersCache(wraApplicationModelImpl);

		if (isNew) {
			wraApplication.setNew(false);
		}

		wraApplication.resetOriginalValues();

		return wraApplication;
	}

	/**
	 * Returns the wra application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the wra application
	 * @return the wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchWRAApplicationException {

		WRAApplication wraApplication = fetchByPrimaryKey(primaryKey);

		if (wraApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchWRAApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return wraApplication;
	}

	/**
	 * Returns the wra application with the primary key or throws a <code>NoSuchWRAApplicationException</code> if it could not be found.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application
	 * @throws NoSuchWRAApplicationException if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication findByPrimaryKey(long wraApplicationId)
		throws NoSuchWRAApplicationException {

		return findByPrimaryKey((Serializable)wraApplicationId);
	}

	/**
	 * Returns the wra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param wraApplicationId the primary key of the wra application
	 * @return the wra application, or <code>null</code> if a wra application with the primary key could not be found
	 */
	@Override
	public WRAApplication fetchByPrimaryKey(long wraApplicationId) {
		return fetchByPrimaryKey((Serializable)wraApplicationId);
	}

	/**
	 * Returns all the wra applications.
	 *
	 * @return the wra applications
	 */
	@Override
	public List<WRAApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @return the range of wra applications
	 */
	@Override
	public List<WRAApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of wra applications
	 */
	@Override
	public List<WRAApplication> findAll(
		int start, int end,
		OrderByComparator<WRAApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the wra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>WRAApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of wra applications
	 * @param end the upper bound of the range of wra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of wra applications
	 */
	@Override
	public List<WRAApplication> findAll(
		int start, int end, OrderByComparator<WRAApplication> orderByComparator,
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

		List<WRAApplication> list = null;

		if (useFinderCache) {
			list = (List<WRAApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_WRAAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_WRAAPPLICATION;

				sql = sql.concat(WRAApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<WRAApplication>)QueryUtil.list(
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
	 * Removes all the wra applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (WRAApplication wraApplication : findAll()) {
			remove(wraApplication);
		}
	}

	/**
	 * Returns the number of wra applications.
	 *
	 * @return the number of wra applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_WRAAPPLICATION);

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
		return "wraApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_WRAAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return WRAApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the wra application persistence.
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

		_finderPathWithPaginationFindBygetWRA_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWRA_ByS_U",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetWRA_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWRA_ByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, true);

		_finderPathCountBygetWRA_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_ByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetWRA_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRA_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetWRA_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWRA_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetWRA_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWRA_By_Status",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetWRA_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetWRA_By_Status",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetWRA_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWRA_By_Status", new String[] {Integer.class.getName()},
			new String[] {"status"}, false);

		_finderPathWithPaginationFindBygetWRA_By_EntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetWRA_By_EntityId",
			new String[] {
				Date.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetWRA_By_EntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetWRA_By_EntityId", new String[] {Date.class.getName()},
			new String[] {"entityId"}, true);

		_finderPathCountBygetWRA_By_EntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWRA_By_EntityId", new String[] {Date.class.getName()},
			new String[] {"entityId"}, false);

		_finderPathWithPaginationFindBygetWRA_By_EntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetWRA_By_EntityId_Status",
				new String[] {
					Date.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetWRA_By_EntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetWRA_By_EntityId_Status",
				new String[] {Date.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetWRA_By_EntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWRA_By_EntityId_Status",
			new String[] {Date.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetWRA_By_EI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRA_By_EI_CI",
			new String[] {Date.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetWRA_By_EI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRA_By_EI_CI",
			new String[] {Date.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetWRAByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWRAByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetWRAByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetWRAByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchByget_WraBy_Case_Id = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_WraBy_Case_Id",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountByget_WraBy_Case_Id = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_WraBy_Case_Id", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetWraByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetWraByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetWraByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetWraByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			false);

		WRAApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		WRAApplicationUtil.setPersistence(null);

		entityCache.removeCache(WRAApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = WRA_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static Long _getTime(Date date) {
		if (date == null) {
			return null;
		}

		return date.getTime();
	}

	private static final String _SQL_SELECT_WRAAPPLICATION =
		"SELECT wraApplication FROM WRAApplication wraApplication";

	private static final String _SQL_SELECT_WRAAPPLICATION_WHERE =
		"SELECT wraApplication FROM WRAApplication wraApplication WHERE ";

	private static final String _SQL_COUNT_WRAAPPLICATION =
		"SELECT COUNT(wraApplication) FROM WRAApplication wraApplication";

	private static final String _SQL_COUNT_WRAAPPLICATION_WHERE =
		"SELECT COUNT(wraApplication) FROM WRAApplication wraApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "wraApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No WRAApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No WRAApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		WRAApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}