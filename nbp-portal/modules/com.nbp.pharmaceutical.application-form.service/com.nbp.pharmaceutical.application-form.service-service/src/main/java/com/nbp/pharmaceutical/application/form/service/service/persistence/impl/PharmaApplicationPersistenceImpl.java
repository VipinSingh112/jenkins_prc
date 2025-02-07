/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.pharmaceutical.application.form.service.service.persistence.impl;

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

import com.nbp.pharmaceutical.application.form.service.exception.NoSuchPharmaApplicationException;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplication;
import com.nbp.pharmaceutical.application.form.service.model.PharmaApplicationTable;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationImpl;
import com.nbp.pharmaceutical.application.form.service.model.impl.PharmaApplicationModelImpl;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaApplicationPersistence;
import com.nbp.pharmaceutical.application.form.service.service.persistence.PharmaApplicationUtil;
import com.nbp.pharmaceutical.application.form.service.service.persistence.impl.constants.PHARMACEUTICALPersistenceConstants;

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
 * The persistence implementation for the pharma application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = PharmaApplicationPersistence.class)
public class PharmaApplicationPersistenceImpl
	extends BasePersistenceImpl<PharmaApplication>
	implements PharmaApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>PharmaApplicationUtil</code> to access the pharma application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		PharmaApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetPharmaByAppId;
	private FinderPath _finderPathCountBygetPharmaByAppId;

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication findBygetPharmaByAppId(long pharmaApplicationId)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = fetchBygetPharmaByAppId(
			pharmaApplicationId);

		if (pharmaApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("pharmaApplicationId=");
			sb.append(pharmaApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationException(sb.toString());
		}

		return pharmaApplication;
	}

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByAppId(long pharmaApplicationId) {
		return fetchBygetPharmaByAppId(pharmaApplicationId, true);
	}

	/**
	 * Returns the pharma application where pharmaApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByAppId(
		long pharmaApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {pharmaApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPharmaByAppId, finderArgs, this);
		}

		if (result instanceof PharmaApplication) {
			PharmaApplication pharmaApplication = (PharmaApplication)result;

			if (pharmaApplicationId !=
					pharmaApplication.getPharmaApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYAPPID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

				List<PharmaApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPharmaByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {pharmaApplicationId};
							}

							_log.warn(
								"PharmaApplicationPersistenceImpl.fetchBygetPharmaByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplication pharmaApplication = list.get(0);

					result = pharmaApplication;

					cacheResult(pharmaApplication);
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
			return (PharmaApplication)result;
		}
	}

	/**
	 * Removes the pharma application where pharmaApplicationId = &#63; from the database.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the pharma application that was removed
	 */
	@Override
	public PharmaApplication removeBygetPharmaByAppId(long pharmaApplicationId)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = findBygetPharmaByAppId(
			pharmaApplicationId);

		return remove(pharmaApplication);
	}

	/**
	 * Returns the number of pharma applications where pharmaApplicationId = &#63;.
	 *
	 * @param pharmaApplicationId the pharma application ID
	 * @return the number of matching pharma applications
	 */
	@Override
	public int countBygetPharmaByAppId(long pharmaApplicationId) {
		FinderPath finderPath = _finderPathCountBygetPharmaByAppId;

		Object[] finderArgs = new Object[] {pharmaApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYAPPID_PHARMAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(pharmaApplicationId);

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
		_FINDER_COLUMN_GETPHARMABYAPPID_PHARMAAPPLICATIONID_2 =
			"pharmaApplication.pharmaApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetPharmaByStatusUser;
	private FinderPath _finderPathWithoutPaginationFindBygetPharmaByStatusUser;
	private FinderPath _finderPathCountBygetPharmaByStatusUser;

	/**
	 * Returns all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching pharma applications
	 */
	@Override
	public List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId) {

		return findBygetPharmaByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of matching pharma applications
	 */
	@Override
	public List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetPharmaByStatusUser(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma applications
	 */
	@Override
	public List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return findBygetPharmaByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma applications
	 */
	@Override
	public List<PharmaApplication> findBygetPharmaByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPharmaByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPharmaByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<PharmaApplication> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplication pharmaApplication : list) {
					if ((status != pharmaApplication.getStatus()) ||
						(userId != pharmaApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_PHARMAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETPHARMABYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<PharmaApplication>)QueryUtil.list(
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
	 * Returns the first pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication findBygetPharmaByStatusUser_First(
			int status, long userId,
			OrderByComparator<PharmaApplication> orderByComparator)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication =
			fetchBygetPharmaByStatusUser_First(
				status, userId, orderByComparator);

		if (pharmaApplication != null) {
			return pharmaApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchPharmaApplicationException(sb.toString());
	}

	/**
	 * Returns the first pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByStatusUser_First(
		int status, long userId,
		OrderByComparator<PharmaApplication> orderByComparator) {

		List<PharmaApplication> list = findBygetPharmaByStatusUser(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication findBygetPharmaByStatusUser_Last(
			int status, long userId,
			OrderByComparator<PharmaApplication> orderByComparator)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = fetchBygetPharmaByStatusUser_Last(
			status, userId, orderByComparator);

		if (pharmaApplication != null) {
			return pharmaApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchPharmaApplicationException(sb.toString());
	}

	/**
	 * Returns the last pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByStatusUser_Last(
		int status, long userId,
		OrderByComparator<PharmaApplication> orderByComparator) {

		int count = countBygetPharmaByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<PharmaApplication> list = findBygetPharmaByStatusUser(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma applications before and after the current pharma application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param pharmaApplicationId the primary key of the current pharma application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	@Override
	public PharmaApplication[] findBygetPharmaByStatusUser_PrevAndNext(
			long pharmaApplicationId, int status, long userId,
			OrderByComparator<PharmaApplication> orderByComparator)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = findByPrimaryKey(
			pharmaApplicationId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplication[] array = new PharmaApplicationImpl[3];

			array[0] = getBygetPharmaByStatusUser_PrevAndNext(
				session, pharmaApplication, status, userId, orderByComparator,
				true);

			array[1] = pharmaApplication;

			array[2] = getBygetPharmaByStatusUser_PrevAndNext(
				session, pharmaApplication, status, userId, orderByComparator,
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

	protected PharmaApplication getBygetPharmaByStatusUser_PrevAndNext(
		Session session, PharmaApplication pharmaApplication, int status,
		long userId, OrderByComparator<PharmaApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETPHARMABYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETPHARMABYSTATUSUSER_USERID_2);

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
			sb.append(PharmaApplicationModelImpl.ORDER_BY_JPQL);
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
						pharmaApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetPharmaByStatusUser(int status, long userId) {
		for (PharmaApplication pharmaApplication :
				findBygetPharmaByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(pharmaApplication);
		}
	}

	/**
	 * Returns the number of pharma applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching pharma applications
	 */
	@Override
	public int countBygetPharmaByStatusUser(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetPharmaByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PHARMAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETPHARMABYSTATUSUSER_USERID_2);

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

	private static final String _FINDER_COLUMN_GETPHARMABYSTATUSUSER_STATUS_2 =
		"pharmaApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETPHARMABYSTATUSUSER_USERID_2 =
		"pharmaApplication.userId = ?";

	private FinderPath _finderPathWithPaginationFindBygetPharmaByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetPharmaByStatus;
	private FinderPath _finderPathCountBygetPharmaByStatus;

	/**
	 * Returns all the pharma applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching pharma applications
	 */
	@Override
	public List<PharmaApplication> findBygetPharmaByStatus(int status) {
		return findBygetPharmaByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of matching pharma applications
	 */
	@Override
	public List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end) {

		return findBygetPharmaByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching pharma applications
	 */
	@Override
	public List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return findBygetPharmaByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching pharma applications
	 */
	@Override
	public List<PharmaApplication> findBygetPharmaByStatus(
		int status, int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetPharmaByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetPharmaByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<PharmaApplication> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PharmaApplication pharmaApplication : list) {
					if (status != pharmaApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_PHARMAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(PharmaApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<PharmaApplication>)QueryUtil.list(
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
	 * Returns the first pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication findBygetPharmaByStatus_First(
			int status, OrderByComparator<PharmaApplication> orderByComparator)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = fetchBygetPharmaByStatus_First(
			status, orderByComparator);

		if (pharmaApplication != null) {
			return pharmaApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchPharmaApplicationException(sb.toString());
	}

	/**
	 * Returns the first pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByStatus_First(
		int status, OrderByComparator<PharmaApplication> orderByComparator) {

		List<PharmaApplication> list = findBygetPharmaByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication findBygetPharmaByStatus_Last(
			int status, OrderByComparator<PharmaApplication> orderByComparator)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = fetchBygetPharmaByStatus_Last(
			status, orderByComparator);

		if (pharmaApplication != null) {
			return pharmaApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchPharmaApplicationException(sb.toString());
	}

	/**
	 * Returns the last pharma application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByStatus_Last(
		int status, OrderByComparator<PharmaApplication> orderByComparator) {

		int count = countBygetPharmaByStatus(status);

		if (count == 0) {
			return null;
		}

		List<PharmaApplication> list = findBygetPharmaByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the pharma applications before and after the current pharma application in the ordered set where status = &#63;.
	 *
	 * @param pharmaApplicationId the primary key of the current pharma application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	@Override
	public PharmaApplication[] findBygetPharmaByStatus_PrevAndNext(
			long pharmaApplicationId, int status,
			OrderByComparator<PharmaApplication> orderByComparator)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = findByPrimaryKey(
			pharmaApplicationId);

		Session session = null;

		try {
			session = openSession();

			PharmaApplication[] array = new PharmaApplicationImpl[3];

			array[0] = getBygetPharmaByStatus_PrevAndNext(
				session, pharmaApplication, status, orderByComparator, true);

			array[1] = pharmaApplication;

			array[2] = getBygetPharmaByStatus_PrevAndNext(
				session, pharmaApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected PharmaApplication getBygetPharmaByStatus_PrevAndNext(
		Session session, PharmaApplication pharmaApplication, int status,
		OrderByComparator<PharmaApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_PHARMAAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETPHARMABYSTATUS_STATUS_2);

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
			sb.append(PharmaApplicationModelImpl.ORDER_BY_JPQL);
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
						pharmaApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<PharmaApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the pharma applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetPharmaByStatus(int status) {
		for (PharmaApplication pharmaApplication :
				findBygetPharmaByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(pharmaApplication);
		}
	}

	/**
	 * Returns the number of pharma applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching pharma applications
	 */
	@Override
	public int countBygetPharmaByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetPharmaByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETPHARMABYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETPHARMABYSTATUS_STATUS_2 =
		"pharmaApplication.status = ?";

	private FinderPath _finderPathFetchBygetPharmaByAppNum;
	private FinderPath _finderPathCountBygetPharmaByAppNum;

	/**
	 * Returns the pharma application where applicationNumber = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication findBygetPharmaByAppNum(String applicationNumber)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = fetchBygetPharmaByAppNum(
			applicationNumber);

		if (pharmaApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationException(sb.toString());
		}

		return pharmaApplication;
	}

	/**
	 * Returns the pharma application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByAppNum(
		String applicationNumber) {

		return fetchBygetPharmaByAppNum(applicationNumber, true);
	}

	/**
	 * Returns the pharma application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByAppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPharmaByAppNum, finderArgs, this);
		}

		if (result instanceof PharmaApplication) {
			PharmaApplication pharmaApplication = (PharmaApplication)result;

			if (!Objects.equals(
					applicationNumber,
					pharmaApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMABYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETPHARMABYAPPNUM_APPLICATIONNUMBER_2);
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

				List<PharmaApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPharmaByAppNum, finderArgs,
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
								"PharmaApplicationPersistenceImpl.fetchBygetPharmaByAppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplication pharmaApplication = list.get(0);

					result = pharmaApplication;

					cacheResult(pharmaApplication);
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
			return (PharmaApplication)result;
		}
	}

	/**
	 * Removes the pharma application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the pharma application that was removed
	 */
	@Override
	public PharmaApplication removeBygetPharmaByAppNum(String applicationNumber)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = findBygetPharmaByAppNum(
			applicationNumber);

		return remove(pharmaApplication);
	}

	/**
	 * Returns the number of pharma applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching pharma applications
	 */
	@Override
	public int countBygetPharmaByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetPharmaByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMABYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETPHARMABYAPPNUM_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETPHARMABYAPPNUM_APPLICATIONNUMBER_2 =
			"pharmaApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMABYAPPNUM_APPLICATIONNUMBER_3 =
			"(pharmaApplication.applicationNumber IS NULL OR pharmaApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBypharmaApplicationByCaseId;
	private FinderPath _finderPathCountBypharmaApplicationByCaseId;

	/**
	 * Returns the pharma application where caseld = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param caseld the caseld
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication findBypharmaApplicationByCaseId(String caseld)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = fetchBypharmaApplicationByCaseId(
			caseld);

		if (pharmaApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseld=");
			sb.append(caseld);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationException(sb.toString());
		}

		return pharmaApplication;
	}

	/**
	 * Returns the pharma application where caseld = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseld the caseld
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBypharmaApplicationByCaseId(String caseld) {
		return fetchBypharmaApplicationByCaseId(caseld, true);
	}

	/**
	 * Returns the pharma application where caseld = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseld the caseld
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBypharmaApplicationByCaseId(
		String caseld, boolean useFinderCache) {

		caseld = Objects.toString(caseld, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseld};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBypharmaApplicationByCaseId, finderArgs, this);
		}

		if (result instanceof PharmaApplication) {
			PharmaApplication pharmaApplication = (PharmaApplication)result;

			if (!Objects.equals(caseld, pharmaApplication.getCaseld())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_PHARMAAPPLICATION_WHERE);

			boolean bindCaseld = false;

			if (caseld.isEmpty()) {
				sb.append(_FINDER_COLUMN_PHARMAAPPLICATIONBYCASEID_CASELD_3);
			}
			else {
				bindCaseld = true;

				sb.append(_FINDER_COLUMN_PHARMAAPPLICATIONBYCASEID_CASELD_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseld) {
					queryPos.add(caseld);
				}

				List<PharmaApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBypharmaApplicationByCaseId,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseld};
							}

							_log.warn(
								"PharmaApplicationPersistenceImpl.fetchBypharmaApplicationByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplication pharmaApplication = list.get(0);

					result = pharmaApplication;

					cacheResult(pharmaApplication);
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
			return (PharmaApplication)result;
		}
	}

	/**
	 * Removes the pharma application where caseld = &#63; from the database.
	 *
	 * @param caseld the caseld
	 * @return the pharma application that was removed
	 */
	@Override
	public PharmaApplication removeBypharmaApplicationByCaseId(String caseld)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = findBypharmaApplicationByCaseId(
			caseld);

		return remove(pharmaApplication);
	}

	/**
	 * Returns the number of pharma applications where caseld = &#63;.
	 *
	 * @param caseld the caseld
	 * @return the number of matching pharma applications
	 */
	@Override
	public int countBypharmaApplicationByCaseId(String caseld) {
		caseld = Objects.toString(caseld, "");

		FinderPath finderPath = _finderPathCountBypharmaApplicationByCaseId;

		Object[] finderArgs = new Object[] {caseld};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_PHARMAAPPLICATION_WHERE);

			boolean bindCaseld = false;

			if (caseld.isEmpty()) {
				sb.append(_FINDER_COLUMN_PHARMAAPPLICATIONBYCASEID_CASELD_3);
			}
			else {
				bindCaseld = true;

				sb.append(_FINDER_COLUMN_PHARMAAPPLICATIONBYCASEID_CASELD_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseld) {
					queryPos.add(caseld);
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
		_FINDER_COLUMN_PHARMAAPPLICATIONBYCASEID_CASELD_2 =
			"pharmaApplication.caseld = ?";

	private static final String
		_FINDER_COLUMN_PHARMAAPPLICATIONBYCASEID_CASELD_3 =
			"(pharmaApplication.caseld IS NULL OR pharmaApplication.caseld = '')";

	private FinderPath _finderPathFetchBygetPharmaByAT_AppNo;
	private FinderPath _finderPathCountBygetPharmaByAT_AppNo;

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching pharma application
	 * @throws NoSuchPharmaApplicationException if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication findBygetPharmaByAT_AppNo(
			String requesttype, String expiredLicenseAppNumber)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = fetchBygetPharmaByAT_AppNo(
			requesttype, expiredLicenseAppNumber);

		if (pharmaApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("requesttype=");
			sb.append(requesttype);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchPharmaApplicationException(sb.toString());
		}

		return pharmaApplication;
	}

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber) {

		return fetchBygetPharmaByAT_AppNo(
			requesttype, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching pharma application, or <code>null</code> if a matching pharma application could not be found
	 */
	@Override
	public PharmaApplication fetchBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		requesttype = Objects.toString(requesttype, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {requesttype, expiredLicenseAppNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetPharmaByAT_AppNo, finderArgs, this);
		}

		if (result instanceof PharmaApplication) {
			PharmaApplication pharmaApplication = (PharmaApplication)result;

			if (!Objects.equals(
					requesttype, pharmaApplication.getRequesttype()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					pharmaApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_PHARMAAPPLICATION_WHERE);

			boolean bindRequesttype = false;

			if (requesttype.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMABYAT_APPNO_REQUESTTYPE_3);
			}
			else {
				bindRequesttype = true;

				sb.append(_FINDER_COLUMN_GETPHARMABYAT_APPNO_REQUESTTYPE_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMABYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMABYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRequesttype) {
					queryPos.add(requesttype);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<PharmaApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetPharmaByAT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									requesttype, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"PharmaApplicationPersistenceImpl.fetchBygetPharmaByAT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					PharmaApplication pharmaApplication = list.get(0);

					result = pharmaApplication;

					cacheResult(pharmaApplication);
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
			return (PharmaApplication)result;
		}
	}

	/**
	 * Removes the pharma application where requesttype = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the pharma application that was removed
	 */
	@Override
	public PharmaApplication removeBygetPharmaByAT_AppNo(
			String requesttype, String expiredLicenseAppNumber)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = findBygetPharmaByAT_AppNo(
			requesttype, expiredLicenseAppNumber);

		return remove(pharmaApplication);
	}

	/**
	 * Returns the number of pharma applications where requesttype = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param requesttype the requesttype
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching pharma applications
	 */
	@Override
	public int countBygetPharmaByAT_AppNo(
		String requesttype, String expiredLicenseAppNumber) {

		requesttype = Objects.toString(requesttype, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetPharmaByAT_AppNo;

		Object[] finderArgs = new Object[] {
			requesttype, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_PHARMAAPPLICATION_WHERE);

			boolean bindRequesttype = false;

			if (requesttype.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETPHARMABYAT_APPNO_REQUESTTYPE_3);
			}
			else {
				bindRequesttype = true;

				sb.append(_FINDER_COLUMN_GETPHARMABYAT_APPNO_REQUESTTYPE_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETPHARMABYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETPHARMABYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRequesttype) {
					queryPos.add(requesttype);
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
		_FINDER_COLUMN_GETPHARMABYAT_APPNO_REQUESTTYPE_2 =
			"pharmaApplication.requesttype = ? AND ";

	private static final String
		_FINDER_COLUMN_GETPHARMABYAT_APPNO_REQUESTTYPE_3 =
			"(pharmaApplication.requesttype IS NULL OR pharmaApplication.requesttype = '') AND ";

	private static final String
		_FINDER_COLUMN_GETPHARMABYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"pharmaApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETPHARMABYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(pharmaApplication.expiredLicenseAppNumber IS NULL OR pharmaApplication.expiredLicenseAppNumber = '')";

	public PharmaApplicationPersistenceImpl() {
		setModelClass(PharmaApplication.class);

		setModelImplClass(PharmaApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(PharmaApplicationTable.INSTANCE);
	}

	/**
	 * Caches the pharma application in the entity cache if it is enabled.
	 *
	 * @param pharmaApplication the pharma application
	 */
	@Override
	public void cacheResult(PharmaApplication pharmaApplication) {
		entityCache.putResult(
			PharmaApplicationImpl.class, pharmaApplication.getPrimaryKey(),
			pharmaApplication);

		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppId,
			new Object[] {pharmaApplication.getPharmaApplicationId()},
			pharmaApplication);

		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppNum,
			new Object[] {pharmaApplication.getApplicationNumber()},
			pharmaApplication);

		finderCache.putResult(
			_finderPathFetchBypharmaApplicationByCaseId,
			new Object[] {pharmaApplication.getCaseld()}, pharmaApplication);

		finderCache.putResult(
			_finderPathFetchBygetPharmaByAT_AppNo,
			new Object[] {
				pharmaApplication.getRequesttype(),
				pharmaApplication.getExpiredLicenseAppNumber()
			},
			pharmaApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the pharma applications in the entity cache if it is enabled.
	 *
	 * @param pharmaApplications the pharma applications
	 */
	@Override
	public void cacheResult(List<PharmaApplication> pharmaApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (pharmaApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (PharmaApplication pharmaApplication : pharmaApplications) {
			if (entityCache.getResult(
					PharmaApplicationImpl.class,
					pharmaApplication.getPrimaryKey()) == null) {

				cacheResult(pharmaApplication);
			}
		}
	}

	/**
	 * Clears the cache for all pharma applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PharmaApplicationImpl.class);

		finderCache.clearCache(PharmaApplicationImpl.class);
	}

	/**
	 * Clears the cache for the pharma application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PharmaApplication pharmaApplication) {
		entityCache.removeResult(
			PharmaApplicationImpl.class, pharmaApplication);
	}

	@Override
	public void clearCache(List<PharmaApplication> pharmaApplications) {
		for (PharmaApplication pharmaApplication : pharmaApplications) {
			entityCache.removeResult(
				PharmaApplicationImpl.class, pharmaApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(PharmaApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(PharmaApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		PharmaApplicationModelImpl pharmaApplicationModelImpl) {

		Object[] args = new Object[] {
			pharmaApplicationModelImpl.getPharmaApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetPharmaByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppId, args,
			pharmaApplicationModelImpl);

		args = new Object[] {pharmaApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetPharmaByAppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharmaByAppNum, args,
			pharmaApplicationModelImpl);

		args = new Object[] {pharmaApplicationModelImpl.getCaseld()};

		finderCache.putResult(
			_finderPathCountBypharmaApplicationByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBypharmaApplicationByCaseId, args,
			pharmaApplicationModelImpl);

		args = new Object[] {
			pharmaApplicationModelImpl.getRequesttype(),
			pharmaApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetPharmaByAT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetPharmaByAT_AppNo, args,
			pharmaApplicationModelImpl);
	}

	/**
	 * Creates a new pharma application with the primary key. Does not add the pharma application to the database.
	 *
	 * @param pharmaApplicationId the primary key for the new pharma application
	 * @return the new pharma application
	 */
	@Override
	public PharmaApplication create(long pharmaApplicationId) {
		PharmaApplication pharmaApplication = new PharmaApplicationImpl();

		pharmaApplication.setNew(true);
		pharmaApplication.setPrimaryKey(pharmaApplicationId);

		pharmaApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return pharmaApplication;
	}

	/**
	 * Removes the pharma application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application that was removed
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	@Override
	public PharmaApplication remove(long pharmaApplicationId)
		throws NoSuchPharmaApplicationException {

		return remove((Serializable)pharmaApplicationId);
	}

	/**
	 * Removes the pharma application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pharma application
	 * @return the pharma application that was removed
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	@Override
	public PharmaApplication remove(Serializable primaryKey)
		throws NoSuchPharmaApplicationException {

		Session session = null;

		try {
			session = openSession();

			PharmaApplication pharmaApplication =
				(PharmaApplication)session.get(
					PharmaApplicationImpl.class, primaryKey);

			if (pharmaApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPharmaApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(pharmaApplication);
		}
		catch (NoSuchPharmaApplicationException noSuchEntityException) {
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
	protected PharmaApplication removeImpl(
		PharmaApplication pharmaApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pharmaApplication)) {
				pharmaApplication = (PharmaApplication)session.get(
					PharmaApplicationImpl.class,
					pharmaApplication.getPrimaryKeyObj());
			}

			if (pharmaApplication != null) {
				session.delete(pharmaApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (pharmaApplication != null) {
			clearCache(pharmaApplication);
		}

		return pharmaApplication;
	}

	@Override
	public PharmaApplication updateImpl(PharmaApplication pharmaApplication) {
		boolean isNew = pharmaApplication.isNew();

		if (!(pharmaApplication instanceof PharmaApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(pharmaApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					pharmaApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in pharmaApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom PharmaApplication implementation " +
					pharmaApplication.getClass());
		}

		PharmaApplicationModelImpl pharmaApplicationModelImpl =
			(PharmaApplicationModelImpl)pharmaApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (pharmaApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				pharmaApplication.setCreateDate(date);
			}
			else {
				pharmaApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!pharmaApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				pharmaApplication.setModifiedDate(date);
			}
			else {
				pharmaApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(pharmaApplication);
			}
			else {
				pharmaApplication = (PharmaApplication)session.merge(
					pharmaApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			PharmaApplicationImpl.class, pharmaApplicationModelImpl, false,
			true);

		cacheUniqueFindersCache(pharmaApplicationModelImpl);

		if (isNew) {
			pharmaApplication.setNew(false);
		}

		pharmaApplication.resetOriginalValues();

		return pharmaApplication;
	}

	/**
	 * Returns the pharma application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pharma application
	 * @return the pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	@Override
	public PharmaApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPharmaApplicationException {

		PharmaApplication pharmaApplication = fetchByPrimaryKey(primaryKey);

		if (pharmaApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPharmaApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return pharmaApplication;
	}

	/**
	 * Returns the pharma application with the primary key or throws a <code>NoSuchPharmaApplicationException</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application
	 * @throws NoSuchPharmaApplicationException if a pharma application with the primary key could not be found
	 */
	@Override
	public PharmaApplication findByPrimaryKey(long pharmaApplicationId)
		throws NoSuchPharmaApplicationException {

		return findByPrimaryKey((Serializable)pharmaApplicationId);
	}

	/**
	 * Returns the pharma application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pharmaApplicationId the primary key of the pharma application
	 * @return the pharma application, or <code>null</code> if a pharma application with the primary key could not be found
	 */
	@Override
	public PharmaApplication fetchByPrimaryKey(long pharmaApplicationId) {
		return fetchByPrimaryKey((Serializable)pharmaApplicationId);
	}

	/**
	 * Returns all the pharma applications.
	 *
	 * @return the pharma applications
	 */
	@Override
	public List<PharmaApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @return the range of pharma applications
	 */
	@Override
	public List<PharmaApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of pharma applications
	 */
	@Override
	public List<PharmaApplication> findAll(
		int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the pharma applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PharmaApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of pharma applications
	 * @param end the upper bound of the range of pharma applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of pharma applications
	 */
	@Override
	public List<PharmaApplication> findAll(
		int start, int end,
		OrderByComparator<PharmaApplication> orderByComparator,
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

		List<PharmaApplication> list = null;

		if (useFinderCache) {
			list = (List<PharmaApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_PHARMAAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_PHARMAAPPLICATION;

				sql = sql.concat(PharmaApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<PharmaApplication>)QueryUtil.list(
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
	 * Removes all the pharma applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PharmaApplication pharmaApplication : findAll()) {
			remove(pharmaApplication);
		}
	}

	/**
	 * Returns the number of pharma applications.
	 *
	 * @return the number of pharma applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_PHARMAAPPLICATION);

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
		return "pharmaApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_PHARMAAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return PharmaApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pharma application persistence.
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

		_finderPathFetchBygetPharmaByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPharmaByAppId",
			new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, true);

		_finderPathCountBygetPharmaByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaByAppId", new String[] {Long.class.getName()},
			new String[] {"pharmaApplicationId"}, false);

		_finderPathWithPaginationFindBygetPharmaByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetPharmaByStatusUser",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetPharmaByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetPharmaByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetPharmaByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetPharmaByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetPharmaByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetPharmaByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetPharmaByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, true);

		_finderPathCountBygetPharmaByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, false);

		_finderPathFetchBygetPharmaByAppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPharmaByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetPharmaByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaByAppNum", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBypharmaApplicationByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBypharmaApplicationByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseld"},
			true);

		_finderPathCountBypharmaApplicationByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBypharmaApplicationByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseld"},
			false);

		_finderPathFetchBygetPharmaByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetPharmaByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"requesttype", "expiredLicenseAppNumber"}, true);

		_finderPathCountBygetPharmaByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetPharmaByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"requesttype", "expiredLicenseAppNumber"}, false);

		PharmaApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		PharmaApplicationUtil.setPersistence(null);

		entityCache.removeCache(PharmaApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = PHARMACEUTICALPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_PHARMAAPPLICATION =
		"SELECT pharmaApplication FROM PharmaApplication pharmaApplication";

	private static final String _SQL_SELECT_PHARMAAPPLICATION_WHERE =
		"SELECT pharmaApplication FROM PharmaApplication pharmaApplication WHERE ";

	private static final String _SQL_COUNT_PHARMAAPPLICATION =
		"SELECT COUNT(pharmaApplication) FROM PharmaApplication pharmaApplication";

	private static final String _SQL_COUNT_PHARMAAPPLICATION_WHERE =
		"SELECT COUNT(pharmaApplication) FROM PharmaApplication pharmaApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "pharmaApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No PharmaApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No PharmaApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		PharmaApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}