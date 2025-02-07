/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.application.form.service.service.persistence.impl;

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

import com.nbp.healthcare.application.form.service.exception.NoSuchHealthCareApplicationException;
import com.nbp.healthcare.application.form.service.model.HealthCareApplication;
import com.nbp.healthcare.application.form.service.model.HealthCareApplicationTable;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationImpl;
import com.nbp.healthcare.application.form.service.model.impl.HealthCareApplicationModelImpl;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicationPersistence;
import com.nbp.healthcare.application.form.service.service.persistence.HealthCareApplicationUtil;
import com.nbp.healthcare.application.form.service.service.persistence.impl.constants.HEALTHPersistenceConstants;

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
 * The persistence implementation for the health care application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthCareApplicationPersistence.class)
public class HealthCareApplicationPersistenceImpl
	extends BasePersistenceImpl<HealthCareApplication>
	implements HealthCareApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthCareApplicationUtil</code> to access the health care application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthCareApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHealthCareById;
	private FinderPath _finderPathCountBygetHealthCareById;

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication findBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication = fetchBygetHealthCareById(
			healthCareApplicationId);

		if (healthCareApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthCareApplicationId=");
			sb.append(healthCareApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareApplicationException(sb.toString());
		}

		return healthCareApplication;
	}

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareById(
		long healthCareApplicationId) {

		return fetchBygetHealthCareById(healthCareApplicationId, true);
	}

	/**
	 * Returns the health care application where healthCareApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareById(
		long healthCareApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthCareApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareById, finderArgs, this);
		}

		if (result instanceof HealthCareApplication) {
			HealthCareApplication healthCareApplication =
				(HealthCareApplication)result;

			if (healthCareApplicationId !=
					healthCareApplication.getHealthCareApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

				List<HealthCareApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									healthCareApplicationId
								};
							}

							_log.warn(
								"HealthCareApplicationPersistenceImpl.fetchBygetHealthCareById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareApplication healthCareApplication = list.get(0);

					result = healthCareApplication;

					cacheResult(healthCareApplication);
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
			return (HealthCareApplication)result;
		}
	}

	/**
	 * Removes the health care application where healthCareApplicationId = &#63; from the database.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the health care application that was removed
	 */
	@Override
	public HealthCareApplication removeBygetHealthCareById(
			long healthCareApplicationId)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication = findBygetHealthCareById(
			healthCareApplicationId);

		return remove(healthCareApplication);
	}

	/**
	 * Returns the number of health care applications where healthCareApplicationId = &#63;.
	 *
	 * @param healthCareApplicationId the health care application ID
	 * @return the number of matching health care applications
	 */
	@Override
	public int countBygetHealthCareById(long healthCareApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHealthCareById;

		Object[] finderArgs = new Object[] {healthCareApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthCareApplicationId);

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
		_FINDER_COLUMN_GETHEALTHCAREBYID_HEALTHCAREAPPLICATIONID_2 =
			"healthCareApplication.healthCareApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetHealthCareByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetHealthCareByS_U;
	private FinderPath _finderPathCountBygetHealthCareByS_U;

	/**
	 * Returns all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching health care applications
	 */
	@Override
	public List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId) {

		return findBygetHealthCareByS_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of matching health care applications
	 */
	@Override
	public List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end) {

		return findBygetHealthCareByS_U(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care applications
	 */
	@Override
	public List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return findBygetHealthCareByS_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care applications
	 */
	@Override
	public List<HealthCareApplication> findBygetHealthCareByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHealthCareByS_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHealthCareByS_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<HealthCareApplication> list = null;

		if (useFinderCache) {
			list = (List<HealthCareApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthCareApplication healthCareApplication : list) {
					if ((status != healthCareApplication.getStatus()) ||
						(userId != healthCareApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_HEALTHCAREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHEALTHCAREBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETHEALTHCAREBYS_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HealthCareApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<HealthCareApplication>)QueryUtil.list(
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
	 * Returns the first health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication findBygetHealthCareByS_U_First(
			int status, long userId,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication =
			fetchBygetHealthCareByS_U_First(status, userId, orderByComparator);

		if (healthCareApplication != null) {
			return healthCareApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchHealthCareApplicationException(sb.toString());
	}

	/**
	 * Returns the first health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareByS_U_First(
		int status, long userId,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		List<HealthCareApplication> list = findBygetHealthCareByS_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication findBygetHealthCareByS_U_Last(
			int status, long userId,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication =
			fetchBygetHealthCareByS_U_Last(status, userId, orderByComparator);

		if (healthCareApplication != null) {
			return healthCareApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchHealthCareApplicationException(sb.toString());
	}

	/**
	 * Returns the last health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareByS_U_Last(
		int status, long userId,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		int count = countBygetHealthCareByS_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<HealthCareApplication> list = findBygetHealthCareByS_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health care applications before and after the current health care application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param healthCareApplicationId the primary key of the current health care application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	@Override
	public HealthCareApplication[] findBygetHealthCareByS_U_PrevAndNext(
			long healthCareApplicationId, int status, long userId,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication = findByPrimaryKey(
			healthCareApplicationId);

		Session session = null;

		try {
			session = openSession();

			HealthCareApplication[] array = new HealthCareApplicationImpl[3];

			array[0] = getBygetHealthCareByS_U_PrevAndNext(
				session, healthCareApplication, status, userId,
				orderByComparator, true);

			array[1] = healthCareApplication;

			array[2] = getBygetHealthCareByS_U_PrevAndNext(
				session, healthCareApplication, status, userId,
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

	protected HealthCareApplication getBygetHealthCareByS_U_PrevAndNext(
		Session session, HealthCareApplication healthCareApplication,
		int status, long userId,
		OrderByComparator<HealthCareApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHCAREAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETHEALTHCAREBYS_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETHEALTHCAREBYS_U_USERID_2);

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
			sb.append(HealthCareApplicationModelImpl.ORDER_BY_JPQL);
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
						healthCareApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthCareApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health care applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetHealthCareByS_U(int status, long userId) {
		for (HealthCareApplication healthCareApplication :
				findBygetHealthCareByS_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(healthCareApplication);
		}
	}

	/**
	 * Returns the number of health care applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching health care applications
	 */
	@Override
	public int countBygetHealthCareByS_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetHealthCareByS_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HEALTHCAREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHEALTHCAREBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETHEALTHCAREBYS_U_USERID_2);

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

	private static final String _FINDER_COLUMN_GETHEALTHCAREBYS_U_STATUS_2 =
		"healthCareApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETHEALTHCAREBYS_U_USERID_2 =
		"healthCareApplication.userId = ?";

	private FinderPath _finderPathFetchBygetHealthCareByAppNo;
	private FinderPath _finderPathCountBygetHealthCareByAppNo;

	/**
	 * Returns the health care application where applicationNumber = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication findBygetHealthCareByAppNo(
			String applicationNumber)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication =
			fetchBygetHealthCareByAppNo(applicationNumber);

		if (healthCareApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareApplicationException(sb.toString());
		}

		return healthCareApplication;
	}

	/**
	 * Returns the health care application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareByAppNo(
		String applicationNumber) {

		return fetchBygetHealthCareByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the health care application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareByAppNo, finderArgs, this);
		}

		if (result instanceof HealthCareApplication) {
			HealthCareApplication healthCareApplication =
				(HealthCareApplication)result;

			if (!Objects.equals(
					applicationNumber,
					healthCareApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHEALTHCAREBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETHEALTHCAREBYAPPNO_APPLICATIONNUMBER_2);
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

				List<HealthCareApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareByAppNo, finderArgs,
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
								"HealthCareApplicationPersistenceImpl.fetchBygetHealthCareByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareApplication healthCareApplication = list.get(0);

					result = healthCareApplication;

					cacheResult(healthCareApplication);
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
			return (HealthCareApplication)result;
		}
	}

	/**
	 * Removes the health care application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the health care application that was removed
	 */
	@Override
	public HealthCareApplication removeBygetHealthCareByAppNo(
			String applicationNumber)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication =
			findBygetHealthCareByAppNo(applicationNumber);

		return remove(healthCareApplication);
	}

	/**
	 * Returns the number of health care applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching health care applications
	 */
	@Override
	public int countBygetHealthCareByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetHealthCareByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHEALTHCAREBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETHEALTHCAREBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETHEALTHCAREBYAPPNO_APPLICATIONNUMBER_2 =
			"healthCareApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETHEALTHCAREBYAPPNO_APPLICATIONNUMBER_3 =
			"(healthCareApplication.applicationNumber IS NULL OR healthCareApplication.applicationNumber = '')";

	private FinderPath _finderPathWithPaginationFindBygetHealthCareByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetHealthCareByStatus;
	private FinderPath _finderPathCountBygetHealthCareByStatus;

	/**
	 * Returns all the health care applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching health care applications
	 */
	@Override
	public List<HealthCareApplication> findBygetHealthCareByStatus(int status) {
		return findBygetHealthCareByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of matching health care applications
	 */
	@Override
	public List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end) {

		return findBygetHealthCareByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health care applications
	 */
	@Override
	public List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return findBygetHealthCareByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health care applications
	 */
	@Override
	public List<HealthCareApplication> findBygetHealthCareByStatus(
		int status, int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHealthCareByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHealthCareByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<HealthCareApplication> list = null;

		if (useFinderCache) {
			list = (List<HealthCareApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthCareApplication healthCareApplication : list) {
					if (status != healthCareApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_HEALTHCAREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHEALTHCAREBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HealthCareApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<HealthCareApplication>)QueryUtil.list(
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
	 * Returns the first health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication findBygetHealthCareByStatus_First(
			int status,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication =
			fetchBygetHealthCareByStatus_First(status, orderByComparator);

		if (healthCareApplication != null) {
			return healthCareApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHealthCareApplicationException(sb.toString());
	}

	/**
	 * Returns the first health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareByStatus_First(
		int status,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		List<HealthCareApplication> list = findBygetHealthCareByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication findBygetHealthCareByStatus_Last(
			int status,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication =
			fetchBygetHealthCareByStatus_Last(status, orderByComparator);

		if (healthCareApplication != null) {
			return healthCareApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHealthCareApplicationException(sb.toString());
	}

	/**
	 * Returns the last health care application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareByStatus_Last(
		int status,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		int count = countBygetHealthCareByStatus(status);

		if (count == 0) {
			return null;
		}

		List<HealthCareApplication> list = findBygetHealthCareByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health care applications before and after the current health care application in the ordered set where status = &#63;.
	 *
	 * @param healthCareApplicationId the primary key of the current health care application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	@Override
	public HealthCareApplication[] findBygetHealthCareByStatus_PrevAndNext(
			long healthCareApplicationId, int status,
			OrderByComparator<HealthCareApplication> orderByComparator)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication = findByPrimaryKey(
			healthCareApplicationId);

		Session session = null;

		try {
			session = openSession();

			HealthCareApplication[] array = new HealthCareApplicationImpl[3];

			array[0] = getBygetHealthCareByStatus_PrevAndNext(
				session, healthCareApplication, status, orderByComparator,
				true);

			array[1] = healthCareApplication;

			array[2] = getBygetHealthCareByStatus_PrevAndNext(
				session, healthCareApplication, status, orderByComparator,
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

	protected HealthCareApplication getBygetHealthCareByStatus_PrevAndNext(
		Session session, HealthCareApplication healthCareApplication,
		int status, OrderByComparator<HealthCareApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHCAREAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETHEALTHCAREBYSTATUS_STATUS_2);

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
			sb.append(HealthCareApplicationModelImpl.ORDER_BY_JPQL);
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
						healthCareApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthCareApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health care applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetHealthCareByStatus(int status) {
		for (HealthCareApplication healthCareApplication :
				findBygetHealthCareByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(healthCareApplication);
		}
	}

	/**
	 * Returns the number of health care applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching health care applications
	 */
	@Override
	public int countBygetHealthCareByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetHealthCareByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHEALTHCAREBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETHEALTHCAREBYSTATUS_STATUS_2 =
		"healthCareApplication.status = ?";

	private FinderPath _finderPathFetchBygetHealthCareByCaseId;
	private FinderPath _finderPathCountBygetHealthCareByCaseId;

	/**
	 * Returns the health care application where caseId = &#63; or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching health care application
	 * @throws NoSuchHealthCareApplicationException if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication findBygetHealthCareByCaseId(String caseId)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication =
			fetchBygetHealthCareByCaseId(caseId);

		if (healthCareApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthCareApplicationException(sb.toString());
		}

		return healthCareApplication;
	}

	/**
	 * Returns the health care application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareByCaseId(String caseId) {
		return fetchBygetHealthCareByCaseId(caseId, true);
	}

	/**
	 * Returns the health care application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health care application, or <code>null</code> if a matching health care application could not be found
	 */
	@Override
	public HealthCareApplication fetchBygetHealthCareByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHealthCareByCaseId, finderArgs, this);
		}

		if (result instanceof HealthCareApplication) {
			HealthCareApplication healthCareApplication =
				(HealthCareApplication)result;

			if (!Objects.equals(caseId, healthCareApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHCAREAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBYCASEID_CASEID_2);
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

				List<HealthCareApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHealthCareByCaseId, finderArgs,
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
								"HealthCareApplicationPersistenceImpl.fetchBygetHealthCareByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthCareApplication healthCareApplication = list.get(0);

					result = healthCareApplication;

					cacheResult(healthCareApplication);
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
			return (HealthCareApplication)result;
		}
	}

	/**
	 * Removes the health care application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the health care application that was removed
	 */
	@Override
	public HealthCareApplication removeBygetHealthCareByCaseId(String caseId)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication =
			findBygetHealthCareByCaseId(caseId);

		return remove(healthCareApplication);
	}

	/**
	 * Returns the number of health care applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health care applications
	 */
	@Override
	public int countBygetHealthCareByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHealthCareByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHCAREAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHEALTHCAREBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHEALTHCAREBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHEALTHCAREBYCASEID_CASEID_2 =
		"healthCareApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETHEALTHCAREBYCASEID_CASEID_3 =
		"(healthCareApplication.caseId IS NULL OR healthCareApplication.caseId = '')";

	public HealthCareApplicationPersistenceImpl() {
		setModelClass(HealthCareApplication.class);

		setModelImplClass(HealthCareApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(HealthCareApplicationTable.INSTANCE);
	}

	/**
	 * Caches the health care application in the entity cache if it is enabled.
	 *
	 * @param healthCareApplication the health care application
	 */
	@Override
	public void cacheResult(HealthCareApplication healthCareApplication) {
		entityCache.putResult(
			HealthCareApplicationImpl.class,
			healthCareApplication.getPrimaryKey(), healthCareApplication);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareById,
			new Object[] {healthCareApplication.getHealthCareApplicationId()},
			healthCareApplication);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareByAppNo,
			new Object[] {healthCareApplication.getApplicationNumber()},
			healthCareApplication);

		finderCache.putResult(
			_finderPathFetchBygetHealthCareByCaseId,
			new Object[] {healthCareApplication.getCaseId()},
			healthCareApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health care applications in the entity cache if it is enabled.
	 *
	 * @param healthCareApplications the health care applications
	 */
	@Override
	public void cacheResult(
		List<HealthCareApplication> healthCareApplications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthCareApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthCareApplication healthCareApplication :
				healthCareApplications) {

			if (entityCache.getResult(
					HealthCareApplicationImpl.class,
					healthCareApplication.getPrimaryKey()) == null) {

				cacheResult(healthCareApplication);
			}
		}
	}

	/**
	 * Clears the cache for all health care applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthCareApplicationImpl.class);

		finderCache.clearCache(HealthCareApplicationImpl.class);
	}

	/**
	 * Clears the cache for the health care application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthCareApplication healthCareApplication) {
		entityCache.removeResult(
			HealthCareApplicationImpl.class, healthCareApplication);
	}

	@Override
	public void clearCache(List<HealthCareApplication> healthCareApplications) {
		for (HealthCareApplication healthCareApplication :
				healthCareApplications) {

			entityCache.removeResult(
				HealthCareApplicationImpl.class, healthCareApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthCareApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthCareApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthCareApplicationModelImpl healthCareApplicationModelImpl) {

		Object[] args = new Object[] {
			healthCareApplicationModelImpl.getHealthCareApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareById, args,
			healthCareApplicationModelImpl);

		args = new Object[] {
			healthCareApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetHealthCareByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareByAppNo, args,
			healthCareApplicationModelImpl);

		args = new Object[] {healthCareApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetHealthCareByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHealthCareByCaseId, args,
			healthCareApplicationModelImpl);
	}

	/**
	 * Creates a new health care application with the primary key. Does not add the health care application to the database.
	 *
	 * @param healthCareApplicationId the primary key for the new health care application
	 * @return the new health care application
	 */
	@Override
	public HealthCareApplication create(long healthCareApplicationId) {
		HealthCareApplication healthCareApplication =
			new HealthCareApplicationImpl();

		healthCareApplication.setNew(true);
		healthCareApplication.setPrimaryKey(healthCareApplicationId);

		healthCareApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthCareApplication;
	}

	/**
	 * Removes the health care application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application that was removed
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	@Override
	public HealthCareApplication remove(long healthCareApplicationId)
		throws NoSuchHealthCareApplicationException {

		return remove((Serializable)healthCareApplicationId);
	}

	/**
	 * Removes the health care application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health care application
	 * @return the health care application that was removed
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	@Override
	public HealthCareApplication remove(Serializable primaryKey)
		throws NoSuchHealthCareApplicationException {

		Session session = null;

		try {
			session = openSession();

			HealthCareApplication healthCareApplication =
				(HealthCareApplication)session.get(
					HealthCareApplicationImpl.class, primaryKey);

			if (healthCareApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthCareApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthCareApplication);
		}
		catch (NoSuchHealthCareApplicationException noSuchEntityException) {
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
	protected HealthCareApplication removeImpl(
		HealthCareApplication healthCareApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthCareApplication)) {
				healthCareApplication = (HealthCareApplication)session.get(
					HealthCareApplicationImpl.class,
					healthCareApplication.getPrimaryKeyObj());
			}

			if (healthCareApplication != null) {
				session.delete(healthCareApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthCareApplication != null) {
			clearCache(healthCareApplication);
		}

		return healthCareApplication;
	}

	@Override
	public HealthCareApplication updateImpl(
		HealthCareApplication healthCareApplication) {

		boolean isNew = healthCareApplication.isNew();

		if (!(healthCareApplication instanceof
				HealthCareApplicationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthCareApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthCareApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthCareApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthCareApplication implementation " +
					healthCareApplication.getClass());
		}

		HealthCareApplicationModelImpl healthCareApplicationModelImpl =
			(HealthCareApplicationModelImpl)healthCareApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthCareApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthCareApplication.setCreateDate(date);
			}
			else {
				healthCareApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthCareApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthCareApplication.setModifiedDate(date);
			}
			else {
				healthCareApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthCareApplication);
			}
			else {
				healthCareApplication = (HealthCareApplication)session.merge(
					healthCareApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthCareApplicationImpl.class, healthCareApplicationModelImpl,
			false, true);

		cacheUniqueFindersCache(healthCareApplicationModelImpl);

		if (isNew) {
			healthCareApplication.setNew(false);
		}

		healthCareApplication.resetOriginalValues();

		return healthCareApplication;
	}

	/**
	 * Returns the health care application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health care application
	 * @return the health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	@Override
	public HealthCareApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthCareApplicationException {

		HealthCareApplication healthCareApplication = fetchByPrimaryKey(
			primaryKey);

		if (healthCareApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthCareApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthCareApplication;
	}

	/**
	 * Returns the health care application with the primary key or throws a <code>NoSuchHealthCareApplicationException</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application
	 * @throws NoSuchHealthCareApplicationException if a health care application with the primary key could not be found
	 */
	@Override
	public HealthCareApplication findByPrimaryKey(long healthCareApplicationId)
		throws NoSuchHealthCareApplicationException {

		return findByPrimaryKey((Serializable)healthCareApplicationId);
	}

	/**
	 * Returns the health care application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthCareApplicationId the primary key of the health care application
	 * @return the health care application, or <code>null</code> if a health care application with the primary key could not be found
	 */
	@Override
	public HealthCareApplication fetchByPrimaryKey(
		long healthCareApplicationId) {

		return fetchByPrimaryKey((Serializable)healthCareApplicationId);
	}

	/**
	 * Returns all the health care applications.
	 *
	 * @return the health care applications
	 */
	@Override
	public List<HealthCareApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @return the range of health care applications
	 */
	@Override
	public List<HealthCareApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health care applications
	 */
	@Override
	public List<HealthCareApplication> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health care applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthCareApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health care applications
	 * @param end the upper bound of the range of health care applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health care applications
	 */
	@Override
	public List<HealthCareApplication> findAll(
		int start, int end,
		OrderByComparator<HealthCareApplication> orderByComparator,
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

		List<HealthCareApplication> list = null;

		if (useFinderCache) {
			list = (List<HealthCareApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHCAREAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHCAREAPPLICATION;

				sql = sql.concat(HealthCareApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthCareApplication>)QueryUtil.list(
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
	 * Removes all the health care applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthCareApplication healthCareApplication : findAll()) {
			remove(healthCareApplication);
		}
	}

	/**
	 * Returns the number of health care applications.
	 *
	 * @return the number of health care applications
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
					_SQL_COUNT_HEALTHCAREAPPLICATION);

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
		return "healthCareApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHCAREAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthCareApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health care application persistence.
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

		_finderPathFetchBygetHealthCareById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareById",
			new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, true);

		_finderPathCountBygetHealthCareById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareById", new String[] {Long.class.getName()},
			new String[] {"healthCareApplicationId"}, false);

		_finderPathWithPaginationFindBygetHealthCareByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHealthCareByS_U",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetHealthCareByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetHealthCareByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, true);

		_finderPathCountBygetHealthCareByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetHealthCareByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetHealthCareByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathWithPaginationFindBygetHealthCareByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetHealthCareByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetHealthCareByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetHealthCareByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetHealthCareByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetHealthCareByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHealthCareByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHealthCareByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHealthCareByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		HealthCareApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthCareApplicationUtil.setPersistence(null);

		entityCache.removeCache(HealthCareApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTHPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHCAREAPPLICATION =
		"SELECT healthCareApplication FROM HealthCareApplication healthCareApplication";

	private static final String _SQL_SELECT_HEALTHCAREAPPLICATION_WHERE =
		"SELECT healthCareApplication FROM HealthCareApplication healthCareApplication WHERE ";

	private static final String _SQL_COUNT_HEALTHCAREAPPLICATION =
		"SELECT COUNT(healthCareApplication) FROM HealthCareApplication healthCareApplication";

	private static final String _SQL_COUNT_HEALTHCAREAPPLICATION_WHERE =
		"SELECT COUNT(healthCareApplication) FROM HealthCareApplication healthCareApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthCareApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthCareApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthCareApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthCareApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}