/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.agriculture.application.form.service.service.persistence.impl;

import com.agriculture.application.form.service.exception.NoSuchAgricultureApplicationException;
import com.agriculture.application.form.service.model.AgricultureApplication;
import com.agriculture.application.form.service.model.AgricultureApplicationTable;
import com.agriculture.application.form.service.model.impl.AgricultureApplicationImpl;
import com.agriculture.application.form.service.model.impl.AgricultureApplicationModelImpl;
import com.agriculture.application.form.service.service.persistence.AgricultureApplicationPersistence;
import com.agriculture.application.form.service.service.persistence.AgricultureApplicationUtil;
import com.agriculture.application.form.service.service.persistence.impl.constants.AGRICULTUREPersistenceConstants;

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
 * The persistence implementation for the agriculture application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AgricultureApplicationPersistence.class)
public class AgricultureApplicationPersistenceImpl
	extends BasePersistenceImpl<AgricultureApplication>
	implements AgricultureApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AgricultureApplicationUtil</code> to access the agriculture application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AgricultureApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAgricultureById;
	private FinderPath _finderPathCountBygetAgricultureById;

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication findBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			fetchBygetAgricultureById(agricultureApplicationId);

		if (agricultureApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("agricultureApplicationId=");
			sb.append(agricultureApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureApplicationException(sb.toString());
		}

		return agricultureApplication;
	}

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgricultureById(
		long agricultureApplicationId) {

		return fetchBygetAgricultureById(agricultureApplicationId, true);
	}

	/**
	 * Returns the agriculture application where agricultureApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgricultureById(
		long agricultureApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {agricultureApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgricultureById, finderArgs, this);
		}

		if (result instanceof AgricultureApplication) {
			AgricultureApplication agricultureApplication =
				(AgricultureApplication)result;

			if (agricultureApplicationId !=
					agricultureApplication.getAgricultureApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

				List<AgricultureApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgricultureById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									agricultureApplicationId
								};
							}

							_log.warn(
								"AgricultureApplicationPersistenceImpl.fetchBygetAgricultureById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApplication agricultureApplication = list.get(0);

					result = agricultureApplication;

					cacheResult(agricultureApplication);
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
			return (AgricultureApplication)result;
		}
	}

	/**
	 * Removes the agriculture application where agricultureApplicationId = &#63; from the database.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the agriculture application that was removed
	 */
	@Override
	public AgricultureApplication removeBygetAgricultureById(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			findBygetAgricultureById(agricultureApplicationId);

		return remove(agricultureApplication);
	}

	/**
	 * Returns the number of agriculture applications where agricultureApplicationId = &#63;.
	 *
	 * @param agricultureApplicationId the agriculture application ID
	 * @return the number of matching agriculture applications
	 */
	@Override
	public int countBygetAgricultureById(long agricultureApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAgricultureById;

		Object[] finderArgs = new Object[] {agricultureApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(agricultureApplicationId);

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
		_FINDER_COLUMN_GETAGRICULTUREBYID_AGRICULTUREAPPLICATIONID_2 =
			"agricultureApplication.agricultureApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetAgriApplicationByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAgriApplicationByStatusUser;
	private FinderPath _finderPathCountBygetAgriApplicationByStatusUser;

	/**
	 * Returns all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findBygetAgriApplicationByStatusUser(
		int status, long userId) {

		return findBygetAgriApplicationByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of matching agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findBygetAgriApplicationByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetAgriApplicationByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findBygetAgriApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		return findBygetAgriApplicationByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findBygetAgriApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAgriApplicationByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAgriApplicationByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<AgricultureApplication> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureApplication agricultureApplication : list) {
					if ((status != agricultureApplication.getStatus()) ||
						(userId != agricultureApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETAGRIAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETAGRIAPPLICATIONBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<AgricultureApplication>)QueryUtil.list(
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
	 * Returns the first agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication findBygetAgriApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			fetchBygetAgriApplicationByStatusUser_First(
				status, userId, orderByComparator);

		if (agricultureApplication != null) {
			return agricultureApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchAgricultureApplicationException(sb.toString());
	}

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgriApplicationByStatusUser_First(
		int status, long userId,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		List<AgricultureApplication> list =
			findBygetAgriApplicationByStatusUser(
				status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication findBygetAgriApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			fetchBygetAgriApplicationByStatusUser_Last(
				status, userId, orderByComparator);

		if (agricultureApplication != null) {
			return agricultureApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchAgricultureApplicationException(sb.toString());
	}

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgriApplicationByStatusUser_Last(
		int status, long userId,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		int count = countBygetAgriApplicationByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<AgricultureApplication> list =
			findBygetAgriApplicationByStatusUser(
				status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture applications before and after the current agriculture application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param agricultureApplicationId the primary key of the current agriculture application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	@Override
	public AgricultureApplication[]
			findBygetAgriApplicationByStatusUser_PrevAndNext(
				long agricultureApplicationId, int status, long userId,
				OrderByComparator<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication = findByPrimaryKey(
			agricultureApplicationId);

		Session session = null;

		try {
			session = openSession();

			AgricultureApplication[] array = new AgricultureApplicationImpl[3];

			array[0] = getBygetAgriApplicationByStatusUser_PrevAndNext(
				session, agricultureApplication, status, userId,
				orderByComparator, true);

			array[1] = agricultureApplication;

			array[2] = getBygetAgriApplicationByStatusUser_PrevAndNext(
				session, agricultureApplication, status, userId,
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

	protected AgricultureApplication
		getBygetAgriApplicationByStatusUser_PrevAndNext(
			Session session, AgricultureApplication agricultureApplication,
			int status, long userId,
			OrderByComparator<AgricultureApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETAGRIAPPLICATIONBYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETAGRIAPPLICATIONBYSTATUSUSER_USERID_2);

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
			sb.append(AgricultureApplicationModelImpl.ORDER_BY_JPQL);
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
						agricultureApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetAgriApplicationByStatusUser(
		int status, long userId) {

		for (AgricultureApplication agricultureApplication :
				findBygetAgriApplicationByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(agricultureApplication);
		}
	}

	/**
	 * Returns the number of agriculture applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching agriculture applications
	 */
	@Override
	public int countBygetAgriApplicationByStatusUser(int status, long userId) {
		FinderPath finderPath =
			_finderPathCountBygetAgriApplicationByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETAGRIAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETAGRIAPPLICATIONBYSTATUSUSER_USERID_2);

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

	private static final String
		_FINDER_COLUMN_GETAGRIAPPLICATIONBYSTATUSUSER_STATUS_2 =
			"agricultureApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETAGRIAPPLICATIONBYSTATUSUSER_USERID_2 =
			"agricultureApplication.userId = ?";

	private FinderPath _finderPathFetchBygetAgriApplicationByRT_AppNo;
	private FinderPath _finderPathCountBygetAgriApplicationByRT_AppNo;

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication findBygetAgriApplicationByRT_AppNo(
			String expiredLicenseAppNo, String requestType)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			fetchBygetAgriApplicationByRT_AppNo(
				expiredLicenseAppNo, requestType);

		if (agricultureApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("expiredLicenseAppNo=");
			sb.append(expiredLicenseAppNo);

			sb.append(", requestType=");
			sb.append(requestType);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureApplicationException(sb.toString());
		}

		return agricultureApplication;
	}

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType) {

		return fetchBygetAgriApplicationByRT_AppNo(
			expiredLicenseAppNo, requestType, true);
	}

	/**
	 * Returns the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType,
		boolean useFinderCache) {

		expiredLicenseAppNo = Objects.toString(expiredLicenseAppNo, "");
		requestType = Objects.toString(requestType, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {expiredLicenseAppNo, requestType};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgriApplicationByRT_AppNo, finderArgs,
				this);
		}

		if (result instanceof AgricultureApplication) {
			AgricultureApplication agricultureApplication =
				(AgricultureApplication)result;

			if (!Objects.equals(
					expiredLicenseAppNo,
					agricultureApplication.getExpiredLicenseAppNo()) ||
				!Objects.equals(
					requestType, agricultureApplication.getRequestType())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION_WHERE);

			boolean bindExpiredLicenseAppNo = false;

			if (expiredLicenseAppNo.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_EXPIREDLICENSEAPPNO_3);
			}
			else {
				bindExpiredLicenseAppNo = true;

				sb.append(
					_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_EXPIREDLICENSEAPPNO_2);
			}

			boolean bindRequestType = false;

			if (requestType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				sb.append(
					_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_REQUESTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindExpiredLicenseAppNo) {
					queryPos.add(expiredLicenseAppNo);
				}

				if (bindRequestType) {
					queryPos.add(requestType);
				}

				List<AgricultureApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgriApplicationByRT_AppNo,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									expiredLicenseAppNo, requestType
								};
							}

							_log.warn(
								"AgricultureApplicationPersistenceImpl.fetchBygetAgriApplicationByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApplication agricultureApplication = list.get(0);

					result = agricultureApplication;

					cacheResult(agricultureApplication);
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
			return (AgricultureApplication)result;
		}
	}

	/**
	 * Removes the agriculture application where expiredLicenseAppNo = &#63; and requestType = &#63; from the database.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the agriculture application that was removed
	 */
	@Override
	public AgricultureApplication removeBygetAgriApplicationByRT_AppNo(
			String expiredLicenseAppNo, String requestType)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			findBygetAgriApplicationByRT_AppNo(
				expiredLicenseAppNo, requestType);

		return remove(agricultureApplication);
	}

	/**
	 * Returns the number of agriculture applications where expiredLicenseAppNo = &#63; and requestType = &#63;.
	 *
	 * @param expiredLicenseAppNo the expired license app no
	 * @param requestType the request type
	 * @return the number of matching agriculture applications
	 */
	@Override
	public int countBygetAgriApplicationByRT_AppNo(
		String expiredLicenseAppNo, String requestType) {

		expiredLicenseAppNo = Objects.toString(expiredLicenseAppNo, "");
		requestType = Objects.toString(requestType, "");

		FinderPath finderPath = _finderPathCountBygetAgriApplicationByRT_AppNo;

		Object[] finderArgs = new Object[] {expiredLicenseAppNo, requestType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATION_WHERE);

			boolean bindExpiredLicenseAppNo = false;

			if (expiredLicenseAppNo.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_EXPIREDLICENSEAPPNO_3);
			}
			else {
				bindExpiredLicenseAppNo = true;

				sb.append(
					_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_EXPIREDLICENSEAPPNO_2);
			}

			boolean bindRequestType = false;

			if (requestType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				sb.append(
					_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_REQUESTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindExpiredLicenseAppNo) {
					queryPos.add(expiredLicenseAppNo);
				}

				if (bindRequestType) {
					queryPos.add(requestType);
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
		_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_EXPIREDLICENSEAPPNO_2 =
			"agricultureApplication.expiredLicenseAppNo = ? AND ";

	private static final String
		_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_EXPIREDLICENSEAPPNO_3 =
			"(agricultureApplication.expiredLicenseAppNo IS NULL OR agricultureApplication.expiredLicenseAppNo = '') AND ";

	private static final String
		_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_REQUESTTYPE_2 =
			"agricultureApplication.requestType = ?";

	private static final String
		_FINDER_COLUMN_GETAGRIAPPLICATIONBYRT_APPNO_REQUESTTYPE_3 =
			"(agricultureApplication.requestType IS NULL OR agricultureApplication.requestType = '')";

	private FinderPath _finderPathWithPaginationFindBygetAgricultureByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetAgricultureByStatus;
	private FinderPath _finderPathCountBygetAgricultureByStatus;

	/**
	 * Returns all the agriculture applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findBygetAgricultureByStatus(
		int status) {

		return findBygetAgricultureByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of matching agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end) {

		return findBygetAgricultureByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		return findBygetAgricultureByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findBygetAgricultureByStatus(
		int status, int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAgricultureByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAgricultureByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<AgricultureApplication> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AgricultureApplication agricultureApplication : list) {
					if (status != agricultureApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETAGRICULTUREBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AgricultureApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<AgricultureApplication>)QueryUtil.list(
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
	 * Returns the first agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication findBygetAgricultureByStatus_First(
			int status,
			OrderByComparator<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			fetchBygetAgricultureByStatus_First(status, orderByComparator);

		if (agricultureApplication != null) {
			return agricultureApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchAgricultureApplicationException(sb.toString());
	}

	/**
	 * Returns the first agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgricultureByStatus_First(
		int status,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		List<AgricultureApplication> list = findBygetAgricultureByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication findBygetAgricultureByStatus_Last(
			int status,
			OrderByComparator<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			fetchBygetAgricultureByStatus_Last(status, orderByComparator);

		if (agricultureApplication != null) {
			return agricultureApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchAgricultureApplicationException(sb.toString());
	}

	/**
	 * Returns the last agriculture application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgricultureByStatus_Last(
		int status,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		int count = countBygetAgricultureByStatus(status);

		if (count == 0) {
			return null;
		}

		List<AgricultureApplication> list = findBygetAgricultureByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the agriculture applications before and after the current agriculture application in the ordered set where status = &#63;.
	 *
	 * @param agricultureApplicationId the primary key of the current agriculture application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	@Override
	public AgricultureApplication[] findBygetAgricultureByStatus_PrevAndNext(
			long agricultureApplicationId, int status,
			OrderByComparator<AgricultureApplication> orderByComparator)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication = findByPrimaryKey(
			agricultureApplicationId);

		Session session = null;

		try {
			session = openSession();

			AgricultureApplication[] array = new AgricultureApplicationImpl[3];

			array[0] = getBygetAgricultureByStatus_PrevAndNext(
				session, agricultureApplication, status, orderByComparator,
				true);

			array[1] = agricultureApplication;

			array[2] = getBygetAgricultureByStatus_PrevAndNext(
				session, agricultureApplication, status, orderByComparator,
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

	protected AgricultureApplication getBygetAgricultureByStatus_PrevAndNext(
		Session session, AgricultureApplication agricultureApplication,
		int status, OrderByComparator<AgricultureApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETAGRICULTUREBYSTATUS_STATUS_2);

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
			sb.append(AgricultureApplicationModelImpl.ORDER_BY_JPQL);
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
						agricultureApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AgricultureApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the agriculture applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetAgricultureByStatus(int status) {
		for (AgricultureApplication agricultureApplication :
				findBygetAgricultureByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(agricultureApplication);
		}
	}

	/**
	 * Returns the number of agriculture applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching agriculture applications
	 */
	@Override
	public int countBygetAgricultureByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetAgricultureByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETAGRICULTUREBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETAGRICULTUREBYSTATUS_STATUS_2 =
		"agricultureApplication.status = ?";

	private FinderPath _finderPathFetchBygetAgricultureByAppNo;
	private FinderPath _finderPathCountBygetAgricultureByAppNo;

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication findBygetAgricultureByAppNo(
			String applicationNumber)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			fetchBygetAgricultureByAppNo(applicationNumber);

		if (agricultureApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureApplicationException(sb.toString());
		}

		return agricultureApplication;
	}

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgricultureByAppNo(
		String applicationNumber) {

		return fetchBygetAgricultureByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the agriculture application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgricultureByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgricultureByAppNo, finderArgs, this);
		}

		if (result instanceof AgricultureApplication) {
			AgricultureApplication agricultureApplication =
				(AgricultureApplication)result;

			if (!Objects.equals(
					applicationNumber,
					agricultureApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREBYAPPNO_APPLICATIONNUMBER_2);
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

				List<AgricultureApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgricultureByAppNo, finderArgs,
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
								"AgricultureApplicationPersistenceImpl.fetchBygetAgricultureByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApplication agricultureApplication = list.get(0);

					result = agricultureApplication;

					cacheResult(agricultureApplication);
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
			return (AgricultureApplication)result;
		}
	}

	/**
	 * Removes the agriculture application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the agriculture application that was removed
	 */
	@Override
	public AgricultureApplication removeBygetAgricultureByAppNo(
			String applicationNumber)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			findBygetAgricultureByAppNo(applicationNumber);

		return remove(agricultureApplication);
	}

	/**
	 * Returns the number of agriculture applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching agriculture applications
	 */
	@Override
	public int countBygetAgricultureByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetAgricultureByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETAGRICULTUREBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETAGRICULTUREBYAPPNO_APPLICATIONNUMBER_2 =
			"agricultureApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETAGRICULTUREBYAPPNO_APPLICATIONNUMBER_3 =
			"(agricultureApplication.applicationNumber IS NULL OR agricultureApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetAgricultureBy_CI;
	private FinderPath _finderPathCountBygetAgricultureBy_CI;

	/**
	 * Returns the agriculture application where caseId = &#63; or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application
	 * @throws NoSuchAgricultureApplicationException if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication findBygetAgricultureBy_CI(String caseId)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			fetchBygetAgricultureBy_CI(caseId);

		if (agricultureApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAgricultureApplicationException(sb.toString());
		}

		return agricultureApplication;
	}

	/**
	 * Returns the agriculture application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgricultureBy_CI(String caseId) {
		return fetchBygetAgricultureBy_CI(caseId, true);
	}

	/**
	 * Returns the agriculture application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching agriculture application, or <code>null</code> if a matching agriculture application could not be found
	 */
	@Override
	public AgricultureApplication fetchBygetAgricultureBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAgricultureBy_CI, finderArgs, this);
		}

		if (result instanceof AgricultureApplication) {
			AgricultureApplication agricultureApplication =
				(AgricultureApplication)result;

			if (!Objects.equals(caseId, agricultureApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_CI_CASEID_2);
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

				List<AgricultureApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAgricultureBy_CI, finderArgs,
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
								"AgricultureApplicationPersistenceImpl.fetchBygetAgricultureBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AgricultureApplication agricultureApplication = list.get(0);

					result = agricultureApplication;

					cacheResult(agricultureApplication);
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
			return (AgricultureApplication)result;
		}
	}

	/**
	 * Removes the agriculture application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the agriculture application that was removed
	 */
	@Override
	public AgricultureApplication removeBygetAgricultureBy_CI(String caseId)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication =
			findBygetAgricultureBy_CI(caseId);

		return remove(agricultureApplication);
	}

	/**
	 * Returns the number of agriculture applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching agriculture applications
	 */
	@Override
	public int countBygetAgricultureBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAgricultureBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_AGRICULTUREAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETAGRICULTUREBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETAGRICULTUREBY_CI_CASEID_2 =
		"agricultureApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETAGRICULTUREBY_CI_CASEID_3 =
		"(agricultureApplication.caseId IS NULL OR agricultureApplication.caseId = '')";

	public AgricultureApplicationPersistenceImpl() {
		setModelClass(AgricultureApplication.class);

		setModelImplClass(AgricultureApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(AgricultureApplicationTable.INSTANCE);
	}

	/**
	 * Caches the agriculture application in the entity cache if it is enabled.
	 *
	 * @param agricultureApplication the agriculture application
	 */
	@Override
	public void cacheResult(AgricultureApplication agricultureApplication) {
		entityCache.putResult(
			AgricultureApplicationImpl.class,
			agricultureApplication.getPrimaryKey(), agricultureApplication);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureById,
			new Object[] {agricultureApplication.getAgricultureApplicationId()},
			agricultureApplication);

		finderCache.putResult(
			_finderPathFetchBygetAgriApplicationByRT_AppNo,
			new Object[] {
				agricultureApplication.getExpiredLicenseAppNo(),
				agricultureApplication.getRequestType()
			},
			agricultureApplication);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureByAppNo,
			new Object[] {agricultureApplication.getApplicationNumber()},
			agricultureApplication);

		finderCache.putResult(
			_finderPathFetchBygetAgricultureBy_CI,
			new Object[] {agricultureApplication.getCaseId()},
			agricultureApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the agriculture applications in the entity cache if it is enabled.
	 *
	 * @param agricultureApplications the agriculture applications
	 */
	@Override
	public void cacheResult(
		List<AgricultureApplication> agricultureApplications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (agricultureApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AgricultureApplication agricultureApplication :
				agricultureApplications) {

			if (entityCache.getResult(
					AgricultureApplicationImpl.class,
					agricultureApplication.getPrimaryKey()) == null) {

				cacheResult(agricultureApplication);
			}
		}
	}

	/**
	 * Clears the cache for all agriculture applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AgricultureApplicationImpl.class);

		finderCache.clearCache(AgricultureApplicationImpl.class);
	}

	/**
	 * Clears the cache for the agriculture application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AgricultureApplication agricultureApplication) {
		entityCache.removeResult(
			AgricultureApplicationImpl.class, agricultureApplication);
	}

	@Override
	public void clearCache(
		List<AgricultureApplication> agricultureApplications) {

		for (AgricultureApplication agricultureApplication :
				agricultureApplications) {

			entityCache.removeResult(
				AgricultureApplicationImpl.class, agricultureApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AgricultureApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AgricultureApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AgricultureApplicationModelImpl agricultureApplicationModelImpl) {

		Object[] args = new Object[] {
			agricultureApplicationModelImpl.getAgricultureApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureById, args,
			agricultureApplicationModelImpl);

		args = new Object[] {
			agricultureApplicationModelImpl.getExpiredLicenseAppNo(),
			agricultureApplicationModelImpl.getRequestType()
		};

		finderCache.putResult(
			_finderPathCountBygetAgriApplicationByRT_AppNo, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgriApplicationByRT_AppNo, args,
			agricultureApplicationModelImpl);

		args = new Object[] {
			agricultureApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetAgricultureByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureByAppNo, args,
			agricultureApplicationModelImpl);

		args = new Object[] {agricultureApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAgricultureBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAgricultureBy_CI, args,
			agricultureApplicationModelImpl);
	}

	/**
	 * Creates a new agriculture application with the primary key. Does not add the agriculture application to the database.
	 *
	 * @param agricultureApplicationId the primary key for the new agriculture application
	 * @return the new agriculture application
	 */
	@Override
	public AgricultureApplication create(long agricultureApplicationId) {
		AgricultureApplication agricultureApplication =
			new AgricultureApplicationImpl();

		agricultureApplication.setNew(true);
		agricultureApplication.setPrimaryKey(agricultureApplicationId);

		agricultureApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return agricultureApplication;
	}

	/**
	 * Removes the agriculture application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application that was removed
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	@Override
	public AgricultureApplication remove(long agricultureApplicationId)
		throws NoSuchAgricultureApplicationException {

		return remove((Serializable)agricultureApplicationId);
	}

	/**
	 * Removes the agriculture application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the agriculture application
	 * @return the agriculture application that was removed
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	@Override
	public AgricultureApplication remove(Serializable primaryKey)
		throws NoSuchAgricultureApplicationException {

		Session session = null;

		try {
			session = openSession();

			AgricultureApplication agricultureApplication =
				(AgricultureApplication)session.get(
					AgricultureApplicationImpl.class, primaryKey);

			if (agricultureApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAgricultureApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(agricultureApplication);
		}
		catch (NoSuchAgricultureApplicationException noSuchEntityException) {
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
	protected AgricultureApplication removeImpl(
		AgricultureApplication agricultureApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(agricultureApplication)) {
				agricultureApplication = (AgricultureApplication)session.get(
					AgricultureApplicationImpl.class,
					agricultureApplication.getPrimaryKeyObj());
			}

			if (agricultureApplication != null) {
				session.delete(agricultureApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (agricultureApplication != null) {
			clearCache(agricultureApplication);
		}

		return agricultureApplication;
	}

	@Override
	public AgricultureApplication updateImpl(
		AgricultureApplication agricultureApplication) {

		boolean isNew = agricultureApplication.isNew();

		if (!(agricultureApplication instanceof
				AgricultureApplicationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(agricultureApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					agricultureApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in agricultureApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AgricultureApplication implementation " +
					agricultureApplication.getClass());
		}

		AgricultureApplicationModelImpl agricultureApplicationModelImpl =
			(AgricultureApplicationModelImpl)agricultureApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (agricultureApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				agricultureApplication.setCreateDate(date);
			}
			else {
				agricultureApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!agricultureApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				agricultureApplication.setModifiedDate(date);
			}
			else {
				agricultureApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(agricultureApplication);
			}
			else {
				agricultureApplication = (AgricultureApplication)session.merge(
					agricultureApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AgricultureApplicationImpl.class, agricultureApplicationModelImpl,
			false, true);

		cacheUniqueFindersCache(agricultureApplicationModelImpl);

		if (isNew) {
			agricultureApplication.setNew(false);
		}

		agricultureApplication.resetOriginalValues();

		return agricultureApplication;
	}

	/**
	 * Returns the agriculture application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the agriculture application
	 * @return the agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	@Override
	public AgricultureApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAgricultureApplicationException {

		AgricultureApplication agricultureApplication = fetchByPrimaryKey(
			primaryKey);

		if (agricultureApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAgricultureApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return agricultureApplication;
	}

	/**
	 * Returns the agriculture application with the primary key or throws a <code>NoSuchAgricultureApplicationException</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application
	 * @throws NoSuchAgricultureApplicationException if a agriculture application with the primary key could not be found
	 */
	@Override
	public AgricultureApplication findByPrimaryKey(
			long agricultureApplicationId)
		throws NoSuchAgricultureApplicationException {

		return findByPrimaryKey((Serializable)agricultureApplicationId);
	}

	/**
	 * Returns the agriculture application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param agricultureApplicationId the primary key of the agriculture application
	 * @return the agriculture application, or <code>null</code> if a agriculture application with the primary key could not be found
	 */
	@Override
	public AgricultureApplication fetchByPrimaryKey(
		long agricultureApplicationId) {

		return fetchByPrimaryKey((Serializable)agricultureApplicationId);
	}

	/**
	 * Returns all the agriculture applications.
	 *
	 * @return the agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @return the range of agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findAll(
		int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the agriculture applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AgricultureApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of agriculture applications
	 * @param end the upper bound of the range of agriculture applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of agriculture applications
	 */
	@Override
	public List<AgricultureApplication> findAll(
		int start, int end,
		OrderByComparator<AgricultureApplication> orderByComparator,
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

		List<AgricultureApplication> list = null;

		if (useFinderCache) {
			list = (List<AgricultureApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_AGRICULTUREAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_AGRICULTUREAPPLICATION;

				sql = sql.concat(AgricultureApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AgricultureApplication>)QueryUtil.list(
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
	 * Removes all the agriculture applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AgricultureApplication agricultureApplication : findAll()) {
			remove(agricultureApplication);
		}
	}

	/**
	 * Returns the number of agriculture applications.
	 *
	 * @return the number of agriculture applications
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
					_SQL_COUNT_AGRICULTUREAPPLICATION);

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
		return "agricultureApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_AGRICULTUREAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AgricultureApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the agriculture application persistence.
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

		_finderPathFetchBygetAgricultureById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgricultureById",
			new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, true);

		_finderPathCountBygetAgricultureById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureById", new String[] {Long.class.getName()},
			new String[] {"agricultureApplicationId"}, false);

		_finderPathWithPaginationFindBygetAgriApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAgriApplicationByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetAgriApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAgriApplicationByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetAgriApplicationByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgriApplicationByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetAgriApplicationByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgriApplicationByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"expiredLicenseAppNo", "requestType"}, true);

		_finderPathCountBygetAgriApplicationByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgriApplicationByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"expiredLicenseAppNo", "requestType"}, false);

		_finderPathWithPaginationFindBygetAgricultureByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetAgricultureByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetAgricultureByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAgricultureByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetAgricultureByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetAgricultureByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgricultureByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetAgricultureByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetAgricultureBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAgricultureBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAgricultureBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAgricultureBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		AgricultureApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AgricultureApplicationUtil.setPersistence(null);

		entityCache.removeCache(AgricultureApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = AGRICULTUREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_AGRICULTUREAPPLICATION =
		"SELECT agricultureApplication FROM AgricultureApplication agricultureApplication";

	private static final String _SQL_SELECT_AGRICULTUREAPPLICATION_WHERE =
		"SELECT agricultureApplication FROM AgricultureApplication agricultureApplication WHERE ";

	private static final String _SQL_COUNT_AGRICULTUREAPPLICATION =
		"SELECT COUNT(agricultureApplication) FROM AgricultureApplication agricultureApplication";

	private static final String _SQL_COUNT_AGRICULTUREAPPLICATION_WHERE =
		"SELECT COUNT(agricultureApplication) FROM AgricultureApplication agricultureApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"agricultureApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AgricultureApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AgricultureApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AgricultureApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}