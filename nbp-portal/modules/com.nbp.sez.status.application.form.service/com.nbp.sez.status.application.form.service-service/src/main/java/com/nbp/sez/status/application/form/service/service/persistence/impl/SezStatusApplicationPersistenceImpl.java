/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezStatusApplicationException;
import com.nbp.sez.status.application.form.service.model.SezStatusApplication;
import com.nbp.sez.status.application.form.service.model.SezStatusApplicationTable;
import com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezStatusApplicationModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusApplicationPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezStatusApplicationUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

import java.io.Serializable;

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
 * The persistence implementation for the sez status application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezStatusApplicationPersistence.class)
public class SezStatusApplicationPersistenceImpl
	extends BasePersistenceImpl<SezStatusApplication>
	implements SezStatusApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezStatusApplicationUtil</code> to access the sez status application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezStatusApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetSezByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetSezByS_U;
	private FinderPath _finderPathCountBygetSezByS_U;

	/**
	 * Returns all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId) {

		return findBygetSezByS_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end) {

		return findBygetSezByS_U(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return findBygetSezByS_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetSezByS_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezByS_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<SezStatusApplication> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplication sezStatusApplication : list) {
					if ((status != sezStatusApplication.getStatus()) ||
						(userId != sezStatusApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETSEZBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETSEZBYS_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<SezStatusApplication>)QueryUtil.list(
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
	 * Returns the first sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezByS_U_First(
			int status, long userId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = fetchBygetSezByS_U_First(
			status, userId, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezByS_U_First(
		int status, long userId,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		List<SezStatusApplication> list = findBygetSezByS_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezByS_U_Last(
			int status, long userId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = fetchBygetSezByS_U_Last(
			status, userId, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezByS_U_Last(
		int status, long userId,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		int count = countBygetSezByS_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplication> list = findBygetSezByS_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication[] findBygetSezByS_U_PrevAndNext(
			long sezStatusApplicationId, int status, long userId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = findByPrimaryKey(
			sezStatusApplicationId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplication[] array = new SezStatusApplicationImpl[3];

			array[0] = getBygetSezByS_U_PrevAndNext(
				session, sezStatusApplication, status, userId,
				orderByComparator, true);

			array[1] = sezStatusApplication;

			array[2] = getBygetSezByS_U_PrevAndNext(
				session, sezStatusApplication, status, userId,
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

	protected SezStatusApplication getBygetSezByS_U_PrevAndNext(
		Session session, SezStatusApplication sezStatusApplication, int status,
		long userId, OrderByComparator<SezStatusApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZBYS_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETSEZBYS_U_USERID_2);

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
			sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
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
						sezStatusApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetSezByS_U(int status, long userId) {
		for (SezStatusApplication sezStatusApplication :
				findBygetSezByS_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusApplication);
		}
	}

	/**
	 * Returns the number of sez status applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSezByS_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetSezByS_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETSEZBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETSEZBYS_U_USERID_2);

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

	private static final String _FINDER_COLUMN_GETSEZBYS_U_STATUS_2 =
		"sezStatusApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETSEZBYS_U_USERID_2 =
		"sezStatusApplication.userId = ?";

	private FinderPath _finderPathFetchBygetSezStatusByCaseId;
	private FinderPath _finderPathCountBygetSezStatusByCaseId;

	/**
	 * Returns the sez status application where caseId = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezStatusByCaseId(String caseId)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = fetchBygetSezStatusByCaseId(
			caseId);

		if (sezStatusApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusApplicationException(sb.toString());
		}

		return sezStatusApplication;
	}

	/**
	 * Returns the sez status application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByCaseId(String caseId) {
		return fetchBygetSezStatusByCaseId(caseId, true);
	}

	/**
	 * Returns the sez status application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByCaseId, finderArgs, this);
		}

		if (result instanceof SezStatusApplication) {
			SezStatusApplication sezStatusApplication =
				(SezStatusApplication)result;

			if (!Objects.equals(caseId, sezStatusApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYCASEID_CASEID_2);
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

				List<SezStatusApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByCaseId, finderArgs,
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
								"SezStatusApplicationPersistenceImpl.fetchBygetSezStatusByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplication sezStatusApplication = list.get(0);

					result = sezStatusApplication;

					cacheResult(sezStatusApplication);
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
			return (SezStatusApplication)result;
		}
	}

	/**
	 * Removes the sez status application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the sez status application that was removed
	 */
	@Override
	public SezStatusApplication removeBygetSezStatusByCaseId(String caseId)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = findBygetSezStatusByCaseId(
			caseId);

		return remove(sezStatusApplication);
	}

	/**
	 * Returns the number of sez status applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSezStatusByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETSEZSTATUSBYCASEID_CASEID_2 =
		"sezStatusApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETSEZSTATUSBYCASEID_CASEID_3 =
		"(sezStatusApplication.caseId IS NULL OR sezStatusApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetSezByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetSezByStatus;
	private FinderPath _finderPathCountBygetSezByStatus;

	/**
	 * Returns all the sez status applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezByStatus(int status) {
		return findBygetSezByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end) {

		return findBygetSezByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return findBygetSezByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezByStatus(
		int status, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetSezByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<SezStatusApplication> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplication sezStatusApplication : list) {
					if (status != sezStatusApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETSEZBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<SezStatusApplication>)QueryUtil.list(
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
	 * Returns the first sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezByStatus_First(
			int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = fetchBygetSezByStatus_First(
			status, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezByStatus_First(
		int status, OrderByComparator<SezStatusApplication> orderByComparator) {

		List<SezStatusApplication> list = findBygetSezByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezByStatus_Last(
			int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = fetchBygetSezByStatus_Last(
			status, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezByStatus_Last(
		int status, OrderByComparator<SezStatusApplication> orderByComparator) {

		int count = countBygetSezByStatus(status);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplication> list = findBygetSezByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication[] findBygetSezByStatus_PrevAndNext(
			long sezStatusApplicationId, int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = findByPrimaryKey(
			sezStatusApplicationId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplication[] array = new SezStatusApplicationImpl[3];

			array[0] = getBygetSezByStatus_PrevAndNext(
				session, sezStatusApplication, status, orderByComparator, true);

			array[1] = sezStatusApplication;

			array[2] = getBygetSezByStatus_PrevAndNext(
				session, sezStatusApplication, status, orderByComparator,
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

	protected SezStatusApplication getBygetSezByStatus_PrevAndNext(
		Session session, SezStatusApplication sezStatusApplication, int status,
		OrderByComparator<SezStatusApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZBYSTATUS_STATUS_2);

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
			sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
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
						sezStatusApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetSezByStatus(int status) {
		for (SezStatusApplication sezStatusApplication :
				findBygetSezByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusApplication);
		}
	}

	/**
	 * Returns the number of sez status applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSezByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetSezByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETSEZBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETSEZBYSTATUS_STATUS_2 =
		"sezStatusApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetSezStatusByEntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetSezStatusByEntityId;
	private FinderPath _finderPathCountBygetSezStatusByEntityId;

	/**
	 * Returns all the sez status applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId) {

		return findBygetSezStatusByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end) {

		return findBygetSezStatusByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return findBygetSezStatusByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezStatusByEntityId(
		String entityId, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSezStatusByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<SezStatusApplication> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplication sezStatusApplication : list) {
					if (!entityId.equals(sezStatusApplication.getEntityId())) {
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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				list = (List<SezStatusApplication>)QueryUtil.list(
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
	 * Returns the first sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezStatusByEntityId_First(
			String entityId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication =
			fetchBygetSezStatusByEntityId_First(entityId, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByEntityId_First(
		String entityId,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		List<SezStatusApplication> list = findBygetSezStatusByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezStatusByEntityId_Last(
			String entityId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication =
			fetchBygetSezStatusByEntityId_Last(entityId, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByEntityId_Last(
		String entityId,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		int count = countBygetSezStatusByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplication> list = findBygetSezStatusByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where entityId = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication[] findBygetSezStatusByEntityId_PrevAndNext(
			long sezStatusApplicationId, String entityId,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		entityId = Objects.toString(entityId, "");

		SezStatusApplication sezStatusApplication = findByPrimaryKey(
			sezStatusApplicationId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplication[] array = new SezStatusApplicationImpl[3];

			array[0] = getBygetSezStatusByEntityId_PrevAndNext(
				session, sezStatusApplication, entityId, orderByComparator,
				true);

			array[1] = sezStatusApplication;

			array[2] = getBygetSezStatusByEntityId_PrevAndNext(
				session, sezStatusApplication, entityId, orderByComparator,
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

	protected SezStatusApplication getBygetSezStatusByEntityId_PrevAndNext(
		Session session, SezStatusApplication sezStatusApplication,
		String entityId,
		OrderByComparator<SezStatusApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_ENTITYID_2);
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
			sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEntityId) {
			queryPos.add(entityId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezStatusApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetSezStatusByEntityId(String entityId) {
		for (SezStatusApplication sezStatusApplication :
				findBygetSezStatusByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(sezStatusApplication);
		}
	}

	/**
	 * Returns the number of sez status applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSezStatusByEntityId(String entityId) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_ENTITYID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
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
		_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_ENTITYID_2 =
			"sezStatusApplication.entityId = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_ENTITYID_3 =
			"(sezStatusApplication.entityId IS NULL OR sezStatusApplication.entityId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetSezStatusByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetSezStatusByEntityId_Status;
	private FinderPath _finderPathCountBygetSezStatusByEntityId_Status;

	/**
	 * Returns all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezStatusByEntityId_Status(
		String entityId, int status) {

		return findBygetSezStatusByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezStatusByEntityId_Status(
		String entityId, int status, int start, int end) {

		return findBygetSezStatusByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezStatusByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return findBygetSezStatusByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSezStatusByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSezStatusByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetSezStatusByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<SezStatusApplication> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplication sezStatusApplication : list) {
					if (!entityId.equals(sezStatusApplication.getEntityId()) ||
						(status != sezStatusApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				queryPos.add(status);

				list = (List<SezStatusApplication>)QueryUtil.list(
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
	 * Returns the first sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezStatusByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication =
			fetchBygetSezStatusByEntityId_Status_First(
				entityId, status, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the first sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		List<SezStatusApplication> list = findBygetSezStatusByEntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezStatusByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication =
			fetchBygetSezStatusByEntityId_Status_Last(
				entityId, status, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the last sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		int count = countBygetSezStatusByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplication> list = findBygetSezStatusByEntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication[]
			findBygetSezStatusByEntityId_Status_PrevAndNext(
				long sezStatusApplicationId, String entityId, int status,
				OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		entityId = Objects.toString(entityId, "");

		SezStatusApplication sezStatusApplication = findByPrimaryKey(
			sezStatusApplicationId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplication[] array = new SezStatusApplicationImpl[3];

			array[0] = getBygetSezStatusByEntityId_Status_PrevAndNext(
				session, sezStatusApplication, entityId, status,
				orderByComparator, true);

			array[1] = sezStatusApplication;

			array[2] = getBygetSezStatusByEntityId_Status_PrevAndNext(
				session, sezStatusApplication, entityId, status,
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

	protected SezStatusApplication
		getBygetSezStatusByEntityId_Status_PrevAndNext(
			Session session, SezStatusApplication sezStatusApplication,
			String entityId, int status,
			OrderByComparator<SezStatusApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_STATUS_2);

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
			sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEntityId) {
			queryPos.add(entityId);
		}

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezStatusApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetSezStatusByEntityId_Status(
		String entityId, int status) {

		for (SezStatusApplication sezStatusApplication :
				findBygetSezStatusByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusApplication);
		}
	}

	/**
	 * Returns the number of sez status applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSezStatusByEntityId_Status(
		String entityId, int status) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
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
		_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_ENTITYID_2 =
			"sezStatusApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_ENTITYID_3 =
			"(sezStatusApplication.entityId IS NULL OR sezStatusApplication.entityId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYENTITYID_STATUS_STATUS_2 =
			"sezStatusApplication.status = ?";

	private FinderPath _finderPathFetchBygetSezStatusByEI_CI;
	private FinderPath _finderPathCountBygetSezStatusByEI_CI;

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezStatusByEI_CI(
			String entityId, String caseId)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = fetchBygetSezStatusByEI_CI(
			entityId, caseId);

		if (sezStatusApplication == null) {
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

			throw new NoSuchSezStatusApplicationException(sb.toString());
		}

		return sezStatusApplication;
	}

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByEI_CI(
		String entityId, String caseId) {

		return fetchBygetSezStatusByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the sez status application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {entityId, caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByEI_CI, finderArgs, this);
		}

		if (result instanceof SezStatusApplication) {
			SezStatusApplication sezStatusApplication =
				(SezStatusApplication)result;

			if (!Objects.equals(entityId, sezStatusApplication.getEntityId()) ||
				!Objects.equals(caseId, sezStatusApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYEI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<SezStatusApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByEI_CI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {entityId, caseId};
							}

							_log.warn(
								"SezStatusApplicationPersistenceImpl.fetchBygetSezStatusByEI_CI(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplication sezStatusApplication = list.get(0);

					result = sezStatusApplication;

					cacheResult(sezStatusApplication);
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
			return (SezStatusApplication)result;
		}
	}

	/**
	 * Removes the sez status application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the sez status application that was removed
	 */
	@Override
	public SezStatusApplication removeBygetSezStatusByEI_CI(
			String entityId, String caseId)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = findBygetSezStatusByEI_CI(
			entityId, caseId);

		return remove(sezStatusApplication);
	}

	/**
	 * Returns the number of sez status applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSezStatusByEI_CI(String entityId, String caseId) {
		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETSEZSTATUSBYEI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
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

	private static final String _FINDER_COLUMN_GETSEZSTATUSBYEI_CI_ENTITYID_2 =
		"sezStatusApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETSEZSTATUSBYEI_CI_ENTITYID_3 =
		"(sezStatusApplication.entityId IS NULL OR sezStatusApplication.entityId = '') AND ";

	private static final String _FINDER_COLUMN_GETSEZSTATUSBYEI_CI_CASEID_2 =
		"sezStatusApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETSEZSTATUSBYEI_CI_CASEID_3 =
		"(sezStatusApplication.caseId IS NULL OR sezStatusApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetSezStatusByAppNo;
	private FinderPath _finderPathCountBygetSezStatusByAppNo;

	/**
	 * Returns the sez status application where applicationNumber = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezStatusByAppNo(
			String applicationNumber)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = fetchBygetSezStatusByAppNo(
			applicationNumber);

		if (sezStatusApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezStatusApplicationException(sb.toString());
		}

		return sezStatusApplication;
	}

	/**
	 * Returns the sez status application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByAppNo(
		String applicationNumber) {

		return fetchBygetSezStatusByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the sez status application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppNo, finderArgs, this);
		}

		if (result instanceof SezStatusApplication) {
			SezStatusApplication sezStatusApplication =
				(SezStatusApplication)result;

			if (!Objects.equals(
					applicationNumber,
					sezStatusApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAPPNO_APPLICATIONNUMBER_2);
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

				List<SezStatusApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppNo, finderArgs,
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
								"SezStatusApplicationPersistenceImpl.fetchBygetSezStatusByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplication sezStatusApplication = list.get(0);

					result = sezStatusApplication;

					cacheResult(sezStatusApplication);
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
			return (SezStatusApplication)result;
		}
	}

	/**
	 * Removes the sez status application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the sez status application that was removed
	 */
	@Override
	public SezStatusApplication removeBygetSezStatusByAppNo(
			String applicationNumber)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = findBygetSezStatusByAppNo(
			applicationNumber);

		return remove(sezStatusApplication);
	}

	/**
	 * Returns the number of sez status applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSezStatusByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPNO_APPLICATIONNUMBER_2 =
			"sezStatusApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYAPPNO_APPLICATIONNUMBER_3 =
			"(sezStatusApplication.applicationNumber IS NULL OR sezStatusApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetSezStatusByAT_AppNo;
	private FinderPath _finderPathCountBygetSezStatusByAT_AppNo;

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSezStatusByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication =
			fetchBygetSezStatusByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);

		if (sezStatusApplication == null) {
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

			throw new NoSuchSezStatusApplicationException(sb.toString());
		}

		return sezStatusApplication;
	}

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return fetchBygetSezStatusByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSezStatusByAT_AppNo(
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
				_finderPathFetchBygetSezStatusByAT_AppNo, finderArgs, this);
		}

		if (result instanceof SezStatusApplication) {
			SezStatusApplication sezStatusApplication =
				(SezStatusApplication)result;

			if (!Objects.equals(
					typeOfTransaction,
					sezStatusApplication.getTypeOfTransaction()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					sezStatusApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
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

				List<SezStatusApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAT_AppNo,
							finderArgs, list);
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
								"SezStatusApplicationPersistenceImpl.fetchBygetSezStatusByAT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezStatusApplication sezStatusApplication = list.get(0);

					result = sezStatusApplication;

					cacheResult(sezStatusApplication);
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
			return (SezStatusApplication)result;
		}
	}

	/**
	 * Removes the sez status application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the sez status application that was removed
	 */
	@Override
	public SezStatusApplication removeBygetSezStatusByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication =
			findBygetSezStatusByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);

		return remove(sezStatusApplication);
	}

	/**
	 * Returns the number of sez status applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSezStatusByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetSezStatusByAT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
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
		_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_TYPEOFTRANSACTION_2 =
			"sezStatusApplication.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_TYPEOFTRANSACTION_3 =
			"(sezStatusApplication.typeOfTransaction IS NULL OR sezStatusApplication.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"sezStatusApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETSEZSTATUSBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(sezStatusApplication.expiredLicenseAppNumber IS NULL OR sezStatusApplication.expiredLicenseAppNumber = '')";

	private FinderPath _finderPathWithPaginationFindBygetSez_By_App_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetSez_By_App_Status;
	private FinderPath _finderPathCountBygetSez_By_App_Status;

	/**
	 * Returns all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @return the matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo) {

		return findBygetSez_By_App_Status(
			status, doYouWantTo, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end) {

		return findBygetSez_By_App_Status(
			status, doYouWantTo, start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return findBygetSez_By_App_Status(
			status, doYouWantTo, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching sez status applications
	 */
	@Override
	public List<SezStatusApplication> findBygetSez_By_App_Status(
		int status, String doYouWantTo, int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
		boolean useFinderCache) {

		doYouWantTo = Objects.toString(doYouWantTo, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetSez_By_App_Status;
				finderArgs = new Object[] {status, doYouWantTo};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetSez_By_App_Status;
			finderArgs = new Object[] {
				status, doYouWantTo, start, end, orderByComparator
			};
		}

		List<SezStatusApplication> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (SezStatusApplication sezStatusApplication : list) {
					if ((status != sezStatusApplication.getStatus()) ||
						!doYouWantTo.equals(
							sezStatusApplication.getDoYouWantTo())) {

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

			sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_STATUS_2);

			boolean bindDoYouWantTo = false;

			if (doYouWantTo.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_DOYOUWANTTO_3);
			}
			else {
				bindDoYouWantTo = true;

				sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_DOYOUWANTTO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindDoYouWantTo) {
					queryPos.add(doYouWantTo);
				}

				list = (List<SezStatusApplication>)QueryUtil.list(
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
	 * Returns the first sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSez_By_App_Status_First(
			int status, String doYouWantTo,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication =
			fetchBygetSez_By_App_Status_First(
				status, doYouWantTo, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", doYouWantTo=");
		sb.append(doYouWantTo);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the first sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSez_By_App_Status_First(
		int status, String doYouWantTo,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		List<SezStatusApplication> list = findBygetSez_By_App_Status(
			status, doYouWantTo, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application
	 * @throws NoSuchSezStatusApplicationException if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication findBygetSez_By_App_Status_Last(
			int status, String doYouWantTo,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication =
			fetchBygetSez_By_App_Status_Last(
				status, doYouWantTo, orderByComparator);

		if (sezStatusApplication != null) {
			return sezStatusApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", doYouWantTo=");
		sb.append(doYouWantTo);

		sb.append("}");

		throw new NoSuchSezStatusApplicationException(sb.toString());
	}

	/**
	 * Returns the last sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching sez status application, or <code>null</code> if a matching sez status application could not be found
	 */
	@Override
	public SezStatusApplication fetchBygetSez_By_App_Status_Last(
		int status, String doYouWantTo,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		int count = countBygetSez_By_App_Status(status, doYouWantTo);

		if (count == 0) {
			return null;
		}

		List<SezStatusApplication> list = findBygetSez_By_App_Status(
			status, doYouWantTo, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the sez status applications before and after the current sez status application in the ordered set where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param sezStatusApplicationId the primary key of the current sez status application
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication[] findBygetSez_By_App_Status_PrevAndNext(
			long sezStatusApplicationId, int status, String doYouWantTo,
			OrderByComparator<SezStatusApplication> orderByComparator)
		throws NoSuchSezStatusApplicationException {

		doYouWantTo = Objects.toString(doYouWantTo, "");

		SezStatusApplication sezStatusApplication = findByPrimaryKey(
			sezStatusApplicationId);

		Session session = null;

		try {
			session = openSession();

			SezStatusApplication[] array = new SezStatusApplicationImpl[3];

			array[0] = getBygetSez_By_App_Status_PrevAndNext(
				session, sezStatusApplication, status, doYouWantTo,
				orderByComparator, true);

			array[1] = sezStatusApplication;

			array[2] = getBygetSez_By_App_Status_PrevAndNext(
				session, sezStatusApplication, status, doYouWantTo,
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

	protected SezStatusApplication getBygetSez_By_App_Status_PrevAndNext(
		Session session, SezStatusApplication sezStatusApplication, int status,
		String doYouWantTo,
		OrderByComparator<SezStatusApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_STATUS_2);

		boolean bindDoYouWantTo = false;

		if (doYouWantTo.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_DOYOUWANTTO_3);
		}
		else {
			bindDoYouWantTo = true;

			sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_DOYOUWANTTO_2);
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
			sb.append(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (bindDoYouWantTo) {
			queryPos.add(doYouWantTo);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						sezStatusApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<SezStatusApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the sez status applications where status = &#63; and doYouWantTo = &#63; from the database.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 */
	@Override
	public void removeBygetSez_By_App_Status(int status, String doYouWantTo) {
		for (SezStatusApplication sezStatusApplication :
				findBygetSez_By_App_Status(
					status, doYouWantTo, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(sezStatusApplication);
		}
	}

	/**
	 * Returns the number of sez status applications where status = &#63; and doYouWantTo = &#63;.
	 *
	 * @param status the status
	 * @param doYouWantTo the do you want to
	 * @return the number of matching sez status applications
	 */
	@Override
	public int countBygetSez_By_App_Status(int status, String doYouWantTo) {
		doYouWantTo = Objects.toString(doYouWantTo, "");

		FinderPath finderPath = _finderPathCountBygetSez_By_App_Status;

		Object[] finderArgs = new Object[] {status, doYouWantTo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_SEZSTATUSAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_STATUS_2);

			boolean bindDoYouWantTo = false;

			if (doYouWantTo.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_DOYOUWANTTO_3);
			}
			else {
				bindDoYouWantTo = true;

				sb.append(_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_DOYOUWANTTO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindDoYouWantTo) {
					queryPos.add(doYouWantTo);
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

	private static final String _FINDER_COLUMN_GETSEZ_BY_APP_STATUS_STATUS_2 =
		"sezStatusApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_DOYOUWANTTO_2 =
			"sezStatusApplication.doYouWantTo = ?";

	private static final String
		_FINDER_COLUMN_GETSEZ_BY_APP_STATUS_DOYOUWANTTO_3 =
			"(sezStatusApplication.doYouWantTo IS NULL OR sezStatusApplication.doYouWantTo = '')";

	public SezStatusApplicationPersistenceImpl() {
		setModelClass(SezStatusApplication.class);

		setModelImplClass(SezStatusApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(SezStatusApplicationTable.INSTANCE);
	}

	/**
	 * Caches the sez status application in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplication the sez status application
	 */
	@Override
	public void cacheResult(SezStatusApplication sezStatusApplication) {
		entityCache.putResult(
			SezStatusApplicationImpl.class,
			sezStatusApplication.getPrimaryKey(), sezStatusApplication);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByCaseId,
			new Object[] {sezStatusApplication.getCaseId()},
			sezStatusApplication);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByEI_CI,
			new Object[] {
				sezStatusApplication.getEntityId(),
				sezStatusApplication.getCaseId()
			},
			sezStatusApplication);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppNo,
			new Object[] {sezStatusApplication.getApplicationNumber()},
			sezStatusApplication);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAT_AppNo,
			new Object[] {
				sezStatusApplication.getTypeOfTransaction(),
				sezStatusApplication.getExpiredLicenseAppNumber()
			},
			sezStatusApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez status applications in the entity cache if it is enabled.
	 *
	 * @param sezStatusApplications the sez status applications
	 */
	@Override
	public void cacheResult(List<SezStatusApplication> sezStatusApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezStatusApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezStatusApplication sezStatusApplication :
				sezStatusApplications) {

			if (entityCache.getResult(
					SezStatusApplicationImpl.class,
					sezStatusApplication.getPrimaryKey()) == null) {

				cacheResult(sezStatusApplication);
			}
		}
	}

	/**
	 * Clears the cache for all sez status applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezStatusApplicationImpl.class);

		finderCache.clearCache(SezStatusApplicationImpl.class);
	}

	/**
	 * Clears the cache for the sez status application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezStatusApplication sezStatusApplication) {
		entityCache.removeResult(
			SezStatusApplicationImpl.class, sezStatusApplication);
	}

	@Override
	public void clearCache(List<SezStatusApplication> sezStatusApplications) {
		for (SezStatusApplication sezStatusApplication :
				sezStatusApplications) {

			entityCache.removeResult(
				SezStatusApplicationImpl.class, sezStatusApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezStatusApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezStatusApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezStatusApplicationModelImpl sezStatusApplicationModelImpl) {

		Object[] args = new Object[] {
			sezStatusApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByCaseId, args,
			sezStatusApplicationModelImpl);

		args = new Object[] {
			sezStatusApplicationModelImpl.getEntityId(),
			sezStatusApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByEI_CI, args,
			sezStatusApplicationModelImpl);

		args = new Object[] {
			sezStatusApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppNo, args,
			sezStatusApplicationModelImpl);

		args = new Object[] {
			sezStatusApplicationModelImpl.getTypeOfTransaction(),
			sezStatusApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAT_AppNo, args,
			sezStatusApplicationModelImpl);
	}

	/**
	 * Creates a new sez status application with the primary key. Does not add the sez status application to the database.
	 *
	 * @param sezStatusApplicationId the primary key for the new sez status application
	 * @return the new sez status application
	 */
	@Override
	public SezStatusApplication create(long sezStatusApplicationId) {
		SezStatusApplication sezStatusApplication =
			new SezStatusApplicationImpl();

		sezStatusApplication.setNew(true);
		sezStatusApplication.setPrimaryKey(sezStatusApplicationId);

		sezStatusApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezStatusApplication;
	}

	/**
	 * Removes the sez status application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application that was removed
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication remove(long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationException {

		return remove((Serializable)sezStatusApplicationId);
	}

	/**
	 * Removes the sez status application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez status application
	 * @return the sez status application that was removed
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication remove(Serializable primaryKey)
		throws NoSuchSezStatusApplicationException {

		Session session = null;

		try {
			session = openSession();

			SezStatusApplication sezStatusApplication =
				(SezStatusApplication)session.get(
					SezStatusApplicationImpl.class, primaryKey);

			if (sezStatusApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezStatusApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezStatusApplication);
		}
		catch (NoSuchSezStatusApplicationException noSuchEntityException) {
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
	protected SezStatusApplication removeImpl(
		SezStatusApplication sezStatusApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezStatusApplication)) {
				sezStatusApplication = (SezStatusApplication)session.get(
					SezStatusApplicationImpl.class,
					sezStatusApplication.getPrimaryKeyObj());
			}

			if (sezStatusApplication != null) {
				session.delete(sezStatusApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezStatusApplication != null) {
			clearCache(sezStatusApplication);
		}

		return sezStatusApplication;
	}

	@Override
	public SezStatusApplication updateImpl(
		SezStatusApplication sezStatusApplication) {

		boolean isNew = sezStatusApplication.isNew();

		if (!(sezStatusApplication instanceof SezStatusApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezStatusApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezStatusApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezStatusApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezStatusApplication implementation " +
					sezStatusApplication.getClass());
		}

		SezStatusApplicationModelImpl sezStatusApplicationModelImpl =
			(SezStatusApplicationModelImpl)sezStatusApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezStatusApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezStatusApplication.setCreateDate(date);
			}
			else {
				sezStatusApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezStatusApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezStatusApplication.setModifiedDate(date);
			}
			else {
				sezStatusApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezStatusApplication);
			}
			else {
				sezStatusApplication = (SezStatusApplication)session.merge(
					sezStatusApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezStatusApplicationImpl.class, sezStatusApplicationModelImpl,
			false, true);

		cacheUniqueFindersCache(sezStatusApplicationModelImpl);

		if (isNew) {
			sezStatusApplication.setNew(false);
		}

		sezStatusApplication.resetOriginalValues();

		return sezStatusApplication;
	}

	/**
	 * Returns the sez status application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez status application
	 * @return the sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezStatusApplicationException {

		SezStatusApplication sezStatusApplication = fetchByPrimaryKey(
			primaryKey);

		if (sezStatusApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezStatusApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezStatusApplication;
	}

	/**
	 * Returns the sez status application with the primary key or throws a <code>NoSuchSezStatusApplicationException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application
	 * @throws NoSuchSezStatusApplicationException if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication findByPrimaryKey(long sezStatusApplicationId)
		throws NoSuchSezStatusApplicationException {

		return findByPrimaryKey((Serializable)sezStatusApplicationId);
	}

	/**
	 * Returns the sez status application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the primary key of the sez status application
	 * @return the sez status application, or <code>null</code> if a sez status application with the primary key could not be found
	 */
	@Override
	public SezStatusApplication fetchByPrimaryKey(long sezStatusApplicationId) {
		return fetchByPrimaryKey((Serializable)sezStatusApplicationId);
	}

	/**
	 * Returns all the sez status applications.
	 *
	 * @return the sez status applications
	 */
	@Override
	public List<SezStatusApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @return the range of sez status applications
	 */
	@Override
	public List<SezStatusApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez status applications
	 */
	@Override
	public List<SezStatusApplication> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez status applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezStatusApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez status applications
	 * @param end the upper bound of the range of sez status applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez status applications
	 */
	@Override
	public List<SezStatusApplication> findAll(
		int start, int end,
		OrderByComparator<SezStatusApplication> orderByComparator,
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

		List<SezStatusApplication> list = null;

		if (useFinderCache) {
			list = (List<SezStatusApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZSTATUSAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZSTATUSAPPLICATION;

				sql = sql.concat(SezStatusApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezStatusApplication>)QueryUtil.list(
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
	 * Removes all the sez status applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezStatusApplication sezStatusApplication : findAll()) {
			remove(sezStatusApplication);
		}
	}

	/**
	 * Returns the number of sez status applications.
	 *
	 * @return the number of sez status applications
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
					_SQL_COUNT_SEZSTATUSAPPLICATION);

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
		return "sezStatusApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZSTATUSAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezStatusApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez status application persistence.
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

		_finderPathWithPaginationFindBygetSezByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezByS_U",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetSezByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetSezByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, true);

		_finderPathCountBygetSezByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetSezByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetSezStatusByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetSezStatusByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetSezByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetSezByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetSezByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetSezByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetSezByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetSezByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetSezStatusByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetSezStatusByEntityId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByEntityId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetSezStatusByEntityId",
				new String[] {String.class.getName()},
				new String[] {"entityId"}, true);

		_finderPathCountBygetSezStatusByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByEntityId",
			new String[] {String.class.getName()}, new String[] {"entityId"},
			false);

		_finderPathWithPaginationFindBygetSezStatusByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetSezStatusByEntityId_Status",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetSezStatusByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetSezStatusByEntityId_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetSezStatusByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByEntityId_Status",
			new String[] {String.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetSezStatusByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetSezStatusByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetSezStatusByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetSezStatusByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppNo", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetSezStatusByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetSezStatusByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			false);

		_finderPathWithPaginationFindBygetSez_By_App_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetSez_By_App_Status",
			new String[] {
				Integer.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "doYouWantTo"}, true);

		_finderPathWithoutPaginationFindBygetSez_By_App_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetSez_By_App_Status",
			new String[] {Integer.class.getName(), String.class.getName()},
			new String[] {"status", "doYouWantTo"}, true);

		_finderPathCountBygetSez_By_App_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSez_By_App_Status",
			new String[] {Integer.class.getName(), String.class.getName()},
			new String[] {"status", "doYouWantTo"}, false);

		SezStatusApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezStatusApplicationUtil.setPersistence(null);

		entityCache.removeCache(SezStatusApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZSTATUSAPPLICATION =
		"SELECT sezStatusApplication FROM SezStatusApplication sezStatusApplication";

	private static final String _SQL_SELECT_SEZSTATUSAPPLICATION_WHERE =
		"SELECT sezStatusApplication FROM SezStatusApplication sezStatusApplication WHERE ";

	private static final String _SQL_COUNT_SEZSTATUSAPPLICATION =
		"SELECT COUNT(sezStatusApplication) FROM SezStatusApplication sezStatusApplication";

	private static final String _SQL_COUNT_SEZSTATUSAPPLICATION_WHERE =
		"SELECT COUNT(sezStatusApplication) FROM SezStatusApplication sezStatusApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezStatusApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezStatusApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezStatusApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezStatusApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}