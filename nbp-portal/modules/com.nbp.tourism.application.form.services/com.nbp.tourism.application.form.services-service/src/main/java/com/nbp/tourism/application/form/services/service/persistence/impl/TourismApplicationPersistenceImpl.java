/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.service.persistence.impl;

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

import com.nbp.tourism.application.form.services.exception.NoSuchTourismApplicationException;
import com.nbp.tourism.application.form.services.model.TourismApplication;
import com.nbp.tourism.application.form.services.model.TourismApplicationTable;
import com.nbp.tourism.application.form.services.model.impl.TourismApplicationImpl;
import com.nbp.tourism.application.form.services.model.impl.TourismApplicationModelImpl;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationPersistence;
import com.nbp.tourism.application.form.services.service.persistence.TourismApplicationUtil;
import com.nbp.tourism.application.form.services.service.persistence.impl.constants.TOURISMPersistenceConstants;

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
 * The persistence implementation for the tourism application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismApplicationPersistence.class)
public class TourismApplicationPersistenceImpl
	extends BasePersistenceImpl<TourismApplication>
	implements TourismApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismApplicationUtil</code> to access the tourism application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetTourismById;
	private FinderPath _finderPathCountBygetTourismById;

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication findBygetTourismById(long tourismApplicationId)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = fetchBygetTourismById(
			tourismApplicationId);

		if (tourismApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismApplicationException(sb.toString());
		}

		return tourismApplication;
	}

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismById(long tourismApplicationId) {
		return fetchBygetTourismById(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism application where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismById(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismById, finderArgs, this);
		}

		if (result instanceof TourismApplication) {
			TourismApplication tourismApplication = (TourismApplication)result;

			if (tourismApplicationId !=
					tourismApplication.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTourismById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									tourismApplicationId
								};
							}

							_log.warn(
								"TourismApplicationPersistenceImpl.fetchBygetTourismById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplication tourismApplication = list.get(0);

					result = tourismApplication;

					cacheResult(tourismApplication);
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
			return (TourismApplication)result;
		}
	}

	/**
	 * Removes the tourism application where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application that was removed
	 */
	@Override
	public TourismApplication removeBygetTourismById(long tourismApplicationId)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = findBygetTourismById(
			tourismApplicationId);

		return remove(tourismApplication);
	}

	/**
	 * Returns the number of tourism applications where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism applications
	 */
	@Override
	public int countBygetTourismById(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTourismById;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

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
		_FINDER_COLUMN_GETTOURISMBYID_TOURISMAPPLICATIONID_2 =
			"tourismApplication.tourismApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetTourismApplicationByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetTourismApplicationByStatusUser;
	private FinderPath _finderPathCountBygetTourismApplicationByStatusUser;

	/**
	 * Returns all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching tourism applications
	 */
	@Override
	public List<TourismApplication> findBygetTourismApplicationByStatusUser(
		int status, long userId) {

		return findBygetTourismApplicationByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of matching tourism applications
	 */
	@Override
	public List<TourismApplication> findBygetTourismApplicationByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetTourismApplicationByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism applications
	 */
	@Override
	public List<TourismApplication> findBygetTourismApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<TourismApplication> orderByComparator) {

		return findBygetTourismApplicationByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism applications
	 */
	@Override
	public List<TourismApplication> findBygetTourismApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<TourismApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetTourismApplicationByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetTourismApplicationByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<TourismApplication> list = null;

		if (useFinderCache) {
			list = (List<TourismApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismApplication tourismApplication : list) {
					if ((status != tourismApplication.getStatus()) ||
						(userId != tourismApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_TOURISMAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETTOURISMAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETTOURISMAPPLICATIONBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<TourismApplication>)QueryUtil.list(
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
	 * Returns the first tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication findBygetTourismApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<TourismApplication> orderByComparator)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication =
			fetchBygetTourismApplicationByStatusUser_First(
				status, userId, orderByComparator);

		if (tourismApplication != null) {
			return tourismApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchTourismApplicationException(sb.toString());
	}

	/**
	 * Returns the first tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismApplicationByStatusUser_First(
		int status, long userId,
		OrderByComparator<TourismApplication> orderByComparator) {

		List<TourismApplication> list = findBygetTourismApplicationByStatusUser(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication findBygetTourismApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<TourismApplication> orderByComparator)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication =
			fetchBygetTourismApplicationByStatusUser_Last(
				status, userId, orderByComparator);

		if (tourismApplication != null) {
			return tourismApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchTourismApplicationException(sb.toString());
	}

	/**
	 * Returns the last tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismApplicationByStatusUser_Last(
		int status, long userId,
		OrderByComparator<TourismApplication> orderByComparator) {

		int count = countBygetTourismApplicationByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<TourismApplication> list = findBygetTourismApplicationByStatusUser(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism applications before and after the current tourism application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param tourismApplicationId the primary key of the current tourism application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	@Override
	public TourismApplication[]
			findBygetTourismApplicationByStatusUser_PrevAndNext(
				long tourismApplicationId, int status, long userId,
				OrderByComparator<TourismApplication> orderByComparator)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = findByPrimaryKey(
			tourismApplicationId);

		Session session = null;

		try {
			session = openSession();

			TourismApplication[] array = new TourismApplicationImpl[3];

			array[0] = getBygetTourismApplicationByStatusUser_PrevAndNext(
				session, tourismApplication, status, userId, orderByComparator,
				true);

			array[1] = tourismApplication;

			array[2] = getBygetTourismApplicationByStatusUser_PrevAndNext(
				session, tourismApplication, status, userId, orderByComparator,
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

	protected TourismApplication
		getBygetTourismApplicationByStatusUser_PrevAndNext(
			Session session, TourismApplication tourismApplication, int status,
			long userId,
			OrderByComparator<TourismApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETTOURISMAPPLICATIONBYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETTOURISMAPPLICATIONBYSTATUSUSER_USERID_2);

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
			sb.append(TourismApplicationModelImpl.ORDER_BY_JPQL);
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
						tourismApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetTourismApplicationByStatusUser(
		int status, long userId) {

		for (TourismApplication tourismApplication :
				findBygetTourismApplicationByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tourismApplication);
		}
	}

	/**
	 * Returns the number of tourism applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching tourism applications
	 */
	@Override
	public int countBygetTourismApplicationByStatusUser(
		int status, long userId) {

		FinderPath finderPath =
			_finderPathCountBygetTourismApplicationByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETTOURISMAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETTOURISMAPPLICATIONBYSTATUSUSER_USERID_2);

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
		_FINDER_COLUMN_GETTOURISMAPPLICATIONBYSTATUSUSER_STATUS_2 =
			"tourismApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETTOURISMAPPLICATIONBYSTATUSUSER_USERID_2 =
			"tourismApplication.userId = ?";

	private FinderPath _finderPathWithPaginationFindBygetTourismByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetTourismByStatus;
	private FinderPath _finderPathCountBygetTourismByStatus;

	/**
	 * Returns all the tourism applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching tourism applications
	 */
	@Override
	public List<TourismApplication> findBygetTourismByStatus(int status) {
		return findBygetTourismByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of matching tourism applications
	 */
	@Override
	public List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end) {

		return findBygetTourismByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism applications
	 */
	@Override
	public List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end,
		OrderByComparator<TourismApplication> orderByComparator) {

		return findBygetTourismByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism applications
	 */
	@Override
	public List<TourismApplication> findBygetTourismByStatus(
		int status, int start, int end,
		OrderByComparator<TourismApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetTourismByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetTourismByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<TourismApplication> list = null;

		if (useFinderCache) {
			list = (List<TourismApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismApplication tourismApplication : list) {
					if (status != tourismApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_TOURISMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<TourismApplication>)QueryUtil.list(
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
	 * Returns the first tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication findBygetTourismByStatus_First(
			int status, OrderByComparator<TourismApplication> orderByComparator)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = fetchBygetTourismByStatus_First(
			status, orderByComparator);

		if (tourismApplication != null) {
			return tourismApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchTourismApplicationException(sb.toString());
	}

	/**
	 * Returns the first tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismByStatus_First(
		int status, OrderByComparator<TourismApplication> orderByComparator) {

		List<TourismApplication> list = findBygetTourismByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication findBygetTourismByStatus_Last(
			int status, OrderByComparator<TourismApplication> orderByComparator)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = fetchBygetTourismByStatus_Last(
			status, orderByComparator);

		if (tourismApplication != null) {
			return tourismApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchTourismApplicationException(sb.toString());
	}

	/**
	 * Returns the last tourism application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismByStatus_Last(
		int status, OrderByComparator<TourismApplication> orderByComparator) {

		int count = countBygetTourismByStatus(status);

		if (count == 0) {
			return null;
		}

		List<TourismApplication> list = findBygetTourismByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism applications before and after the current tourism application in the ordered set where status = &#63;.
	 *
	 * @param tourismApplicationId the primary key of the current tourism application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	@Override
	public TourismApplication[] findBygetTourismByStatus_PrevAndNext(
			long tourismApplicationId, int status,
			OrderByComparator<TourismApplication> orderByComparator)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = findByPrimaryKey(
			tourismApplicationId);

		Session session = null;

		try {
			session = openSession();

			TourismApplication[] array = new TourismApplicationImpl[3];

			array[0] = getBygetTourismByStatus_PrevAndNext(
				session, tourismApplication, status, orderByComparator, true);

			array[1] = tourismApplication;

			array[2] = getBygetTourismByStatus_PrevAndNext(
				session, tourismApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected TourismApplication getBygetTourismByStatus_PrevAndNext(
		Session session, TourismApplication tourismApplication, int status,
		OrderByComparator<TourismApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETTOURISMBYSTATUS_STATUS_2);

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
			sb.append(TourismApplicationModelImpl.ORDER_BY_JPQL);
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
						tourismApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetTourismByStatus(int status) {
		for (TourismApplication tourismApplication :
				findBygetTourismByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tourismApplication);
		}
	}

	/**
	 * Returns the number of tourism applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching tourism applications
	 */
	@Override
	public int countBygetTourismByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetTourismByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETTOURISMBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETTOURISMBYSTATUS_STATUS_2 =
		"tourismApplication.status = ?";

	private FinderPath _finderPathFetchBygetTourismByAppNo;
	private FinderPath _finderPathCountBygetTourismByAppNo;

	/**
	 * Returns the tourism application where applicationNumber = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication findBygetTourismByAppNo(String applicationNumber)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = fetchBygetTourismByAppNo(
			applicationNumber);

		if (tourismApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismApplicationException(sb.toString());
		}

		return tourismApplication;
	}

	/**
	 * Returns the tourism application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismByAppNo(
		String applicationNumber) {

		return fetchBygetTourismByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the tourism application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismByAppNo, finderArgs, this);
		}

		if (result instanceof TourismApplication) {
			TourismApplication tourismApplication = (TourismApplication)result;

			if (!Objects.equals(
					applicationNumber,
					tourismApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTOURISMBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETTOURISMBYAPPNO_APPLICATIONNUMBER_2);
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

				List<TourismApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTourismByAppNo, finderArgs,
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
								"TourismApplicationPersistenceImpl.fetchBygetTourismByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplication tourismApplication = list.get(0);

					result = tourismApplication;

					cacheResult(tourismApplication);
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
			return (TourismApplication)result;
		}
	}

	/**
	 * Removes the tourism application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the tourism application that was removed
	 */
	@Override
	public TourismApplication removeBygetTourismByAppNo(
			String applicationNumber)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = findBygetTourismByAppNo(
			applicationNumber);

		return remove(tourismApplication);
	}

	/**
	 * Returns the number of tourism applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching tourism applications
	 */
	@Override
	public int countBygetTourismByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetTourismByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTOURISMBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETTOURISMBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETTOURISMBYAPPNO_APPLICATIONNUMBER_2 =
			"tourismApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETTOURISMBYAPPNO_APPLICATIONNUMBER_3 =
			"(tourismApplication.applicationNumber IS NULL OR tourismApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetTourismByCaseId;
	private FinderPath _finderPathCountBygetTourismByCaseId;

	/**
	 * Returns the tourism application where caseId = &#63; or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application
	 * @throws NoSuchTourismApplicationException if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication findBygetTourismByCaseId(String caseId)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = fetchBygetTourismByCaseId(
			caseId);

		if (tourismApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismApplicationException(sb.toString());
		}

		return tourismApplication;
	}

	/**
	 * Returns the tourism application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismByCaseId(String caseId) {
		return fetchBygetTourismByCaseId(caseId, true);
	}

	/**
	 * Returns the tourism application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application, or <code>null</code> if a matching tourism application could not be found
	 */
	@Override
	public TourismApplication fetchBygetTourismByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTourismByCaseId, finderArgs, this);
		}

		if (result instanceof TourismApplication) {
			TourismApplication tourismApplication = (TourismApplication)result;

			if (!Objects.equals(caseId, tourismApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTOURISMBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTOURISMBYCASEID_CASEID_2);
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

				List<TourismApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTourismByCaseId, finderArgs,
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
								"TourismApplicationPersistenceImpl.fetchBygetTourismByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplication tourismApplication = list.get(0);

					result = tourismApplication;

					cacheResult(tourismApplication);
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
			return (TourismApplication)result;
		}
	}

	/**
	 * Removes the tourism application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the tourism application that was removed
	 */
	@Override
	public TourismApplication removeBygetTourismByCaseId(String caseId)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = findBygetTourismByCaseId(
			caseId);

		return remove(tourismApplication);
	}

	/**
	 * Returns the number of tourism applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism applications
	 */
	@Override
	public int countBygetTourismByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetTourismByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTOURISMBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTOURISMBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETTOURISMBYCASEID_CASEID_2 =
		"tourismApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETTOURISMBYCASEID_CASEID_3 =
		"(tourismApplication.caseId IS NULL OR tourismApplication.caseId = '')";

	public TourismApplicationPersistenceImpl() {
		setModelClass(TourismApplication.class);

		setModelImplClass(TourismApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(TourismApplicationTable.INSTANCE);
	}

	/**
	 * Caches the tourism application in the entity cache if it is enabled.
	 *
	 * @param tourismApplication the tourism application
	 */
	@Override
	public void cacheResult(TourismApplication tourismApplication) {
		entityCache.putResult(
			TourismApplicationImpl.class, tourismApplication.getPrimaryKey(),
			tourismApplication);

		finderCache.putResult(
			_finderPathFetchBygetTourismById,
			new Object[] {tourismApplication.getTourismApplicationId()},
			tourismApplication);

		finderCache.putResult(
			_finderPathFetchBygetTourismByAppNo,
			new Object[] {tourismApplication.getApplicationNumber()},
			tourismApplication);

		finderCache.putResult(
			_finderPathFetchBygetTourismByCaseId,
			new Object[] {tourismApplication.getCaseId()}, tourismApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism applications in the entity cache if it is enabled.
	 *
	 * @param tourismApplications the tourism applications
	 */
	@Override
	public void cacheResult(List<TourismApplication> tourismApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismApplication tourismApplication : tourismApplications) {
			if (entityCache.getResult(
					TourismApplicationImpl.class,
					tourismApplication.getPrimaryKey()) == null) {

				cacheResult(tourismApplication);
			}
		}
	}

	/**
	 * Clears the cache for all tourism applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismApplicationImpl.class);

		finderCache.clearCache(TourismApplicationImpl.class);
	}

	/**
	 * Clears the cache for the tourism application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismApplication tourismApplication) {
		entityCache.removeResult(
			TourismApplicationImpl.class, tourismApplication);
	}

	@Override
	public void clearCache(List<TourismApplication> tourismApplications) {
		for (TourismApplication tourismApplication : tourismApplications) {
			entityCache.removeResult(
				TourismApplicationImpl.class, tourismApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(TourismApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismApplicationModelImpl tourismApplicationModelImpl) {

		Object[] args = new Object[] {
			tourismApplicationModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismById, args,
			tourismApplicationModelImpl);

		args = new Object[] {
			tourismApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetTourismByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismByAppNo, args,
			tourismApplicationModelImpl);

		args = new Object[] {tourismApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetTourismByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTourismByCaseId, args,
			tourismApplicationModelImpl);
	}

	/**
	 * Creates a new tourism application with the primary key. Does not add the tourism application to the database.
	 *
	 * @param tourismApplicationId the primary key for the new tourism application
	 * @return the new tourism application
	 */
	@Override
	public TourismApplication create(long tourismApplicationId) {
		TourismApplication tourismApplication = new TourismApplicationImpl();

		tourismApplication.setNew(true);
		tourismApplication.setPrimaryKey(tourismApplicationId);

		tourismApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return tourismApplication;
	}

	/**
	 * Removes the tourism application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application that was removed
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	@Override
	public TourismApplication remove(long tourismApplicationId)
		throws NoSuchTourismApplicationException {

		return remove((Serializable)tourismApplicationId);
	}

	/**
	 * Removes the tourism application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism application
	 * @return the tourism application that was removed
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	@Override
	public TourismApplication remove(Serializable primaryKey)
		throws NoSuchTourismApplicationException {

		Session session = null;

		try {
			session = openSession();

			TourismApplication tourismApplication =
				(TourismApplication)session.get(
					TourismApplicationImpl.class, primaryKey);

			if (tourismApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismApplication);
		}
		catch (NoSuchTourismApplicationException noSuchEntityException) {
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
	protected TourismApplication removeImpl(
		TourismApplication tourismApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismApplication)) {
				tourismApplication = (TourismApplication)session.get(
					TourismApplicationImpl.class,
					tourismApplication.getPrimaryKeyObj());
			}

			if (tourismApplication != null) {
				session.delete(tourismApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismApplication != null) {
			clearCache(tourismApplication);
		}

		return tourismApplication;
	}

	@Override
	public TourismApplication updateImpl(
		TourismApplication tourismApplication) {

		boolean isNew = tourismApplication.isNew();

		if (!(tourismApplication instanceof TourismApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismApplication implementation " +
					tourismApplication.getClass());
		}

		TourismApplicationModelImpl tourismApplicationModelImpl =
			(TourismApplicationModelImpl)tourismApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismApplication.setCreateDate(date);
			}
			else {
				tourismApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismApplication.setModifiedDate(date);
			}
			else {
				tourismApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismApplication);
			}
			else {
				tourismApplication = (TourismApplication)session.merge(
					tourismApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismApplicationImpl.class, tourismApplicationModelImpl, false,
			true);

		cacheUniqueFindersCache(tourismApplicationModelImpl);

		if (isNew) {
			tourismApplication.setNew(false);
		}

		tourismApplication.resetOriginalValues();

		return tourismApplication;
	}

	/**
	 * Returns the tourism application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism application
	 * @return the tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	@Override
	public TourismApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismApplicationException {

		TourismApplication tourismApplication = fetchByPrimaryKey(primaryKey);

		if (tourismApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismApplication;
	}

	/**
	 * Returns the tourism application with the primary key or throws a <code>NoSuchTourismApplicationException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application
	 * @throws NoSuchTourismApplicationException if a tourism application with the primary key could not be found
	 */
	@Override
	public TourismApplication findByPrimaryKey(long tourismApplicationId)
		throws NoSuchTourismApplicationException {

		return findByPrimaryKey((Serializable)tourismApplicationId);
	}

	/**
	 * Returns the tourism application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismApplicationId the primary key of the tourism application
	 * @return the tourism application, or <code>null</code> if a tourism application with the primary key could not be found
	 */
	@Override
	public TourismApplication fetchByPrimaryKey(long tourismApplicationId) {
		return fetchByPrimaryKey((Serializable)tourismApplicationId);
	}

	/**
	 * Returns all the tourism applications.
	 *
	 * @return the tourism applications
	 */
	@Override
	public List<TourismApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @return the range of tourism applications
	 */
	@Override
	public List<TourismApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism applications
	 */
	@Override
	public List<TourismApplication> findAll(
		int start, int end,
		OrderByComparator<TourismApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism applications
	 * @param end the upper bound of the range of tourism applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism applications
	 */
	@Override
	public List<TourismApplication> findAll(
		int start, int end,
		OrderByComparator<TourismApplication> orderByComparator,
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

		List<TourismApplication> list = null;

		if (useFinderCache) {
			list = (List<TourismApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMAPPLICATION;

				sql = sql.concat(TourismApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismApplication>)QueryUtil.list(
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
	 * Removes all the tourism applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismApplication tourismApplication : findAll()) {
			remove(tourismApplication);
		}
	}

	/**
	 * Returns the number of tourism applications.
	 *
	 * @return the number of tourism applications
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
					_SQL_COUNT_TOURISMAPPLICATION);

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
		return "tourismApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism application persistence.
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

		_finderPathFetchBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTourismById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTourismById",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		_finderPathWithPaginationFindBygetTourismApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetTourismApplicationByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetTourismApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetTourismApplicationByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetTourismApplicationByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTourismApplicationByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetTourismByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetTourismByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetTourismByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetTourismByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, true);

		_finderPathCountBygetTourismByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTourismByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, false);

		_finderPathFetchBygetTourismByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTourismByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetTourismByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTourismByAppNo", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetTourismByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTourismByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetTourismByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTourismByCaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		TourismApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismApplicationUtil.setPersistence(null);

		entityCache.removeCache(TourismApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMAPPLICATION =
		"SELECT tourismApplication FROM TourismApplication tourismApplication";

	private static final String _SQL_SELECT_TOURISMAPPLICATION_WHERE =
		"SELECT tourismApplication FROM TourismApplication tourismApplication WHERE ";

	private static final String _SQL_COUNT_TOURISMAPPLICATION =
		"SELECT COUNT(tourismApplication) FROM TourismApplication tourismApplication";

	private static final String _SQL_COUNT_TOURISMAPPLICATION_WHERE =
		"SELECT COUNT(tourismApplication) FROM TourismApplication tourismApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "tourismApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}