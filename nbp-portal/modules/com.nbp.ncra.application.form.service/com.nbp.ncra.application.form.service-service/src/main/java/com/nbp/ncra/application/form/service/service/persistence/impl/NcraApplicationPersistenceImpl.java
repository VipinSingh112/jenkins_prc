/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence.impl;

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

import com.nbp.ncra.application.form.service.exception.NoSuchNcraApplicationException;
import com.nbp.ncra.application.form.service.model.NcraApplication;
import com.nbp.ncra.application.form.service.model.NcraApplicationTable;
import com.nbp.ncra.application.form.service.model.impl.NcraApplicationImpl;
import com.nbp.ncra.application.form.service.model.impl.NcraApplicationModelImpl;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicationPersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraApplicationUtil;
import com.nbp.ncra.application.form.service.service.persistence.impl.constants.NCRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ncra application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcraApplicationPersistence.class)
public class NcraApplicationPersistenceImpl
	extends BasePersistenceImpl<NcraApplication>
	implements NcraApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcraApplicationUtil</code> to access the ncra application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcraApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetNcraByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetNcraByS_U;
	private FinderPath _finderPathCountBygetNcraByS_U;

	/**
	 * Returns all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByS_U(long userId, int status) {
		return findBygetNcraByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end) {

		return findBygetNcraByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return findBygetNcraByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNcraByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcraByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<NcraApplication> list = null;

		if (useFinderCache) {
			list = (List<NcraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraApplication ncraApplication : list) {
					if ((userId != ncraApplication.getUserId()) ||
						(status != ncraApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRABYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETNCRABYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<NcraApplication>)QueryUtil.list(
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
	 * Returns the first ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByS_U_First(
			long userId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByS_U_First(
			userId, status, orderByComparator);

		if (ncraApplication != null) {
			return ncraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcraApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByS_U_First(
		long userId, int status,
		OrderByComparator<NcraApplication> orderByComparator) {

		List<NcraApplication> list = findBygetNcraByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByS_U_Last(
			long userId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByS_U_Last(
			userId, status, orderByComparator);

		if (ncraApplication != null) {
			return ncraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcraApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByS_U_Last(
		long userId, int status,
		OrderByComparator<NcraApplication> orderByComparator) {

		int count = countBygetNcraByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<NcraApplication> list = findBygetNcraByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication[] findBygetNcraByS_U_PrevAndNext(
			long ncraApplicationId, long userId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = findByPrimaryKey(ncraApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcraApplication[] array = new NcraApplicationImpl[3];

			array[0] = getBygetNcraByS_U_PrevAndNext(
				session, ncraApplication, userId, status, orderByComparator,
				true);

			array[1] = ncraApplication;

			array[2] = getBygetNcraByS_U_PrevAndNext(
				session, ncraApplication, userId, status, orderByComparator,
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

	protected NcraApplication getBygetNcraByS_U_PrevAndNext(
		Session session, NcraApplication ncraApplication, long userId,
		int status, OrderByComparator<NcraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETNCRABYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETNCRABYS_U_STATUS_2);

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
			sb.append(NcraApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetNcraByS_U(long userId, int status) {
		for (NcraApplication ncraApplication :
				findBygetNcraByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncraApplication);
		}
	}

	/**
	 * Returns the number of ncra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	@Override
	public int countBygetNcraByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetNcraByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRABYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETNCRABYS_U_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

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

	private static final String _FINDER_COLUMN_GETNCRABYS_U_USERID_2 =
		"ncraApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETNCRABYS_U_STATUS_2 =
		"ncraApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetNcraByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetNcraByStatus;
	private FinderPath _finderPathCountBygetNcraByStatus;

	/**
	 * Returns all the ncra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByStatus(int status) {
		return findBygetNcraByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end) {

		return findBygetNcraByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return findBygetNcraByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByStatus(
		int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNcraByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcraByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<NcraApplication> list = null;

		if (useFinderCache) {
			list = (List<NcraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraApplication ncraApplication : list) {
					if (status != ncraApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRABYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<NcraApplication>)QueryUtil.list(
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
	 * Returns the first ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByStatus_First(
			int status, OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByStatus_First(
			status, orderByComparator);

		if (ncraApplication != null) {
			return ncraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcraApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByStatus_First(
		int status, OrderByComparator<NcraApplication> orderByComparator) {

		List<NcraApplication> list = findBygetNcraByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByStatus_Last(
			int status, OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByStatus_Last(
			status, orderByComparator);

		if (ncraApplication != null) {
			return ncraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcraApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByStatus_Last(
		int status, OrderByComparator<NcraApplication> orderByComparator) {

		int count = countBygetNcraByStatus(status);

		if (count == 0) {
			return null;
		}

		List<NcraApplication> list = findBygetNcraByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication[] findBygetNcraByStatus_PrevAndNext(
			long ncraApplicationId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = findByPrimaryKey(ncraApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcraApplication[] array = new NcraApplicationImpl[3];

			array[0] = getBygetNcraByStatus_PrevAndNext(
				session, ncraApplication, status, orderByComparator, true);

			array[1] = ncraApplication;

			array[2] = getBygetNcraByStatus_PrevAndNext(
				session, ncraApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcraApplication getBygetNcraByStatus_PrevAndNext(
		Session session, NcraApplication ncraApplication, int status,
		OrderByComparator<NcraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETNCRABYSTATUS_STATUS_2);

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
			sb.append(NcraApplicationModelImpl.ORDER_BY_JPQL);
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
						ncraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetNcraByStatus(int status) {
		for (NcraApplication ncraApplication :
				findBygetNcraByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncraApplication);
		}
	}

	/**
	 * Returns the number of ncra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	@Override
	public int countBygetNcraByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetNcraByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRABYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETNCRABYSTATUS_STATUS_2 =
		"ncraApplication.status = ?";

	private FinderPath _finderPathFetchBygetNcraByAppNum;
	private FinderPath _finderPathCountBygetNcraByAppNum;

	/**
	 * Returns the ncra application where applicationNumber = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByAppNum(String applicationNumber)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByAppNum(
			applicationNumber);

		if (ncraApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraApplicationException(sb.toString());
		}

		return ncraApplication;
	}

	/**
	 * Returns the ncra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByAppNum(String applicationNumber) {
		return fetchBygetNcraByAppNum(applicationNumber, true);
	}

	/**
	 * Returns the ncra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByAppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcraByAppNum, finderArgs, this);
		}

		if (result instanceof NcraApplication) {
			NcraApplication ncraApplication = (NcraApplication)result;

			if (!Objects.equals(
					applicationNumber,
					ncraApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETNCRABYAPPNUM_APPLICATIONNUMBER_2);
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

				List<NcraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraByAppNum, finderArgs,
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
								"NcraApplicationPersistenceImpl.fetchBygetNcraByAppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplication ncraApplication = list.get(0);

					result = ncraApplication;

					cacheResult(ncraApplication);
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
			return (NcraApplication)result;
		}
	}

	/**
	 * Removes the ncra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ncra application that was removed
	 */
	@Override
	public NcraApplication removeBygetNcraByAppNum(String applicationNumber)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = findBygetNcraByAppNum(
			applicationNumber);

		return remove(ncraApplication);
	}

	/**
	 * Returns the number of ncra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncra applications
	 */
	@Override
	public int countBygetNcraByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetNcraByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETNCRABYAPPNUM_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETNCRABYAPPNUM_APPLICATIONNUMBER_2 =
			"ncraApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETNCRABYAPPNUM_APPLICATIONNUMBER_3 =
			"(ncraApplication.applicationNumber IS NULL OR ncraApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetNcraByCaseId;
	private FinderPath _finderPathCountBygetNcraByCaseId;

	/**
	 * Returns the ncra application where caseId = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByCaseId(String caseId)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByCaseId(caseId);

		if (ncraApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraApplicationException(sb.toString());
		}

		return ncraApplication;
	}

	/**
	 * Returns the ncra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByCaseId(String caseId) {
		return fetchBygetNcraByCaseId(caseId, true);
	}

	/**
	 * Returns the ncra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcraByCaseId, finderArgs, this);
		}

		if (result instanceof NcraApplication) {
			NcraApplication ncraApplication = (NcraApplication)result;

			if (!Objects.equals(caseId, ncraApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYCASEID_CASEID_2);
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

				List<NcraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraByCaseId, finderArgs,
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
								"NcraApplicationPersistenceImpl.fetchBygetNcraByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplication ncraApplication = list.get(0);

					result = ncraApplication;

					cacheResult(ncraApplication);
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
			return (NcraApplication)result;
		}
	}

	/**
	 * Removes the ncra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra application that was removed
	 */
	@Override
	public NcraApplication removeBygetNcraByCaseId(String caseId)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = findBygetNcraByCaseId(caseId);

		return remove(ncraApplication);
	}

	/**
	 * Returns the number of ncra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra applications
	 */
	@Override
	public int countBygetNcraByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcraByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCRABYCASEID_CASEID_2 =
		"ncraApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCRABYCASEID_CASEID_3 =
		"(ncraApplication.caseId IS NULL OR ncraApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcraByEntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetNcraByEntityId;
	private FinderPath _finderPathCountBygetNcraByEntityId;

	/**
	 * Returns all the ncra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByEntityId(String entityId) {
		return findBygetNcraByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end) {

		return findBygetNcraByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return findBygetNcraByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByEntityId(
		String entityId, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcraByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcraByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<NcraApplication> list = null;

		if (useFinderCache) {
			list = (List<NcraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraApplication ncraApplication : list) {
					if (!entityId.equals(ncraApplication.getEntityId())) {
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

			sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraApplication>)QueryUtil.list(
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
	 * Returns the first ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByEntityId_First(
			String entityId,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByEntityId_First(
			entityId, orderByComparator);

		if (ncraApplication != null) {
			return ncraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchNcraApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByEntityId_First(
		String entityId, OrderByComparator<NcraApplication> orderByComparator) {

		List<NcraApplication> list = findBygetNcraByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByEntityId_Last(
			String entityId,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByEntityId_Last(
			entityId, orderByComparator);

		if (ncraApplication != null) {
			return ncraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchNcraApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByEntityId_Last(
		String entityId, OrderByComparator<NcraApplication> orderByComparator) {

		int count = countBygetNcraByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<NcraApplication> list = findBygetNcraByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where entityId = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication[] findBygetNcraByEntityId_PrevAndNext(
			long ncraApplicationId, String entityId,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		entityId = Objects.toString(entityId, "");

		NcraApplication ncraApplication = findByPrimaryKey(ncraApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcraApplication[] array = new NcraApplicationImpl[3];

			array[0] = getBygetNcraByEntityId_PrevAndNext(
				session, ncraApplication, entityId, orderByComparator, true);

			array[1] = ncraApplication;

			array[2] = getBygetNcraByEntityId_PrevAndNext(
				session, ncraApplication, entityId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcraApplication getBygetNcraByEntityId_PrevAndNext(
		Session session, NcraApplication ncraApplication, String entityId,
		OrderByComparator<NcraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_ENTITYID_2);
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
			sb.append(NcraApplicationModelImpl.ORDER_BY_JPQL);
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
						ncraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetNcraByEntityId(String entityId) {
		for (NcraApplication ncraApplication :
				findBygetNcraByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncraApplication);
		}
	}

	/**
	 * Returns the number of ncra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching ncra applications
	 */
	@Override
	public int countBygetNcraByEntityId(String entityId) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetNcraByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_ENTITYID_2);
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

	private static final String _FINDER_COLUMN_GETNCRABYENTITYID_ENTITYID_2 =
		"ncraApplication.entityId = ?";

	private static final String _FINDER_COLUMN_GETNCRABYENTITYID_ENTITYID_3 =
		"(ncraApplication.entityId IS NULL OR ncraApplication.entityId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcraByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetNcraByEntityId_Status;
	private FinderPath _finderPathCountBygetNcraByEntityId_Status;

	/**
	 * Returns all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status) {

		return findBygetNcraByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end) {

		return findBygetNcraByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return findBygetNcraByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra applications
	 */
	@Override
	public List<NcraApplication> findBygetNcraByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcraByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetNcraByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<NcraApplication> list = null;

		if (useFinderCache) {
			list = (List<NcraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraApplication ncraApplication : list) {
					if (!entityId.equals(ncraApplication.getEntityId()) ||
						(status != ncraApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraApplication>)QueryUtil.list(
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
	 * Returns the first ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByEntityId_Status_First(
			entityId, status, orderByComparator);

		if (ncraApplication != null) {
			return ncraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcraApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<NcraApplication> orderByComparator) {

		List<NcraApplication> list = findBygetNcraByEntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByEntityId_Status_Last(
			entityId, status, orderByComparator);

		if (ncraApplication != null) {
			return ncraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcraApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<NcraApplication> orderByComparator) {

		int count = countBygetNcraByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<NcraApplication> list = findBygetNcraByEntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra applications before and after the current ncra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param ncraApplicationId the primary key of the current ncra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication[] findBygetNcraByEntityId_Status_PrevAndNext(
			long ncraApplicationId, String entityId, int status,
			OrderByComparator<NcraApplication> orderByComparator)
		throws NoSuchNcraApplicationException {

		entityId = Objects.toString(entityId, "");

		NcraApplication ncraApplication = findByPrimaryKey(ncraApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcraApplication[] array = new NcraApplicationImpl[3];

			array[0] = getBygetNcraByEntityId_Status_PrevAndNext(
				session, ncraApplication, entityId, status, orderByComparator,
				true);

			array[1] = ncraApplication;

			array[2] = getBygetNcraByEntityId_Status_PrevAndNext(
				session, ncraApplication, entityId, status, orderByComparator,
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

	protected NcraApplication getBygetNcraByEntityId_Status_PrevAndNext(
		Session session, NcraApplication ncraApplication, String entityId,
		int status, OrderByComparator<NcraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_STATUS_2);

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
			sb.append(NcraApplicationModelImpl.ORDER_BY_JPQL);
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
						ncraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetNcraByEntityId_Status(String entityId, int status) {
		for (NcraApplication ncraApplication :
				findBygetNcraByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncraApplication);
		}
	}

	/**
	 * Returns the number of ncra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching ncra applications
	 */
	@Override
	public int countBygetNcraByEntityId_Status(String entityId, int status) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetNcraByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_STATUS_2);

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
		_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_ENTITYID_2 =
			"ncraApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_ENTITYID_3 =
			"(ncraApplication.entityId IS NULL OR ncraApplication.entityId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCRABYENTITYID_STATUS_STATUS_2 =
			"ncraApplication.status = ?";

	private FinderPath _finderPathFetchBygetNcraByEI_CI;
	private FinderPath _finderPathCountBygetNcraByEI_CI;

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByEI_CI(String entityId, String caseId)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByEI_CI(
			entityId, caseId);

		if (ncraApplication == null) {
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

			throw new NoSuchNcraApplicationException(sb.toString());
		}

		return ncraApplication;
	}

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByEI_CI(
		String entityId, String caseId) {

		return fetchBygetNcraByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the ncra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByEI_CI(
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
				_finderPathFetchBygetNcraByEI_CI, finderArgs, this);
		}

		if (result instanceof NcraApplication) {
			NcraApplication ncraApplication = (NcraApplication)result;

			if (!Objects.equals(entityId, ncraApplication.getEntityId()) ||
				!Objects.equals(caseId, ncraApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYEI_CI_CASEID_2);
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

				List<NcraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraByEI_CI, finderArgs, list);
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
								"NcraApplicationPersistenceImpl.fetchBygetNcraByEI_CI(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplication ncraApplication = list.get(0);

					result = ncraApplication;

					cacheResult(ncraApplication);
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
			return (NcraApplication)result;
		}
	}

	/**
	 * Removes the ncra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the ncra application that was removed
	 */
	@Override
	public NcraApplication removeBygetNcraByEI_CI(
			String entityId, String caseId)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = findBygetNcraByEI_CI(
			entityId, caseId);

		return remove(ncraApplication);
	}

	/**
	 * Returns the number of ncra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching ncra applications
	 */
	@Override
	public int countBygetNcraByEI_CI(String entityId, String caseId) {
		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcraByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCRABYEI_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCRABYEI_CI_ENTITYID_2 =
		"ncraApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETNCRABYEI_CI_ENTITYID_3 =
		"(ncraApplication.entityId IS NULL OR ncraApplication.entityId = '') AND ";

	private static final String _FINDER_COLUMN_GETNCRABYEI_CI_CASEID_2 =
		"ncraApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCRABYEI_CI_CASEID_3 =
		"(ncraApplication.caseId IS NULL OR ncraApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetNcraByRT_AppNo;
	private FinderPath _finderPathCountBygetNcraByRT_AppNo;

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncra application
	 * @throws NoSuchNcraApplicationException if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication findBygetNcraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchBygetNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);

		if (ncraApplication == null) {
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

			throw new NoSuchNcraApplicationException(sb.toString());
		}

		return ncraApplication;
	}

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return fetchBygetNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application, or <code>null</code> if a matching ncra application could not be found
	 */
	@Override
	public NcraApplication fetchBygetNcraByRT_AppNo(
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
				_finderPathFetchBygetNcraByRT_AppNo, finderArgs, this);
		}

		if (result instanceof NcraApplication) {
			NcraApplication ncraApplication = (NcraApplication)result;

			if (!Objects.equals(
					typeOfTransaction,
					ncraApplication.getTypeOfTransaction()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					ncraApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCRAAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYRT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(_FINDER_COLUMN_GETNCRABYRT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETNCRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
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

				List<NcraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraByRT_AppNo, finderArgs,
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
								"NcraApplicationPersistenceImpl.fetchBygetNcraByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplication ncraApplication = list.get(0);

					result = ncraApplication;

					cacheResult(ncraApplication);
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
			return (NcraApplication)result;
		}
	}

	/**
	 * Removes the ncra application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ncra application that was removed
	 */
	@Override
	public NcraApplication removeBygetNcraByRT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = findBygetNcraByRT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);

		return remove(ncraApplication);
	}

	/**
	 * Returns the number of ncra applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ncra applications
	 */
	@Override
	public int countBygetNcraByRT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetNcraByRT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCRABYRT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(_FINDER_COLUMN_GETNCRABYRT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETNCRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
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
		_FINDER_COLUMN_GETNCRABYRT_APPNO_TYPEOFTRANSACTION_2 =
			"ncraApplication.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETNCRABYRT_APPNO_TYPEOFTRANSACTION_3 =
			"(ncraApplication.typeOfTransaction IS NULL OR ncraApplication.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"ncraApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETNCRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(ncraApplication.expiredLicenseAppNumber IS NULL OR ncraApplication.expiredLicenseAppNumber = '')";

	public NcraApplicationPersistenceImpl() {
		setModelClass(NcraApplication.class);

		setModelImplClass(NcraApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(NcraApplicationTable.INSTANCE);
	}

	/**
	 * Caches the ncra application in the entity cache if it is enabled.
	 *
	 * @param ncraApplication the ncra application
	 */
	@Override
	public void cacheResult(NcraApplication ncraApplication) {
		entityCache.putResult(
			NcraApplicationImpl.class, ncraApplication.getPrimaryKey(),
			ncraApplication);

		finderCache.putResult(
			_finderPathFetchBygetNcraByAppNum,
			new Object[] {ncraApplication.getApplicationNumber()},
			ncraApplication);

		finderCache.putResult(
			_finderPathFetchBygetNcraByCaseId,
			new Object[] {ncraApplication.getCaseId()}, ncraApplication);

		finderCache.putResult(
			_finderPathFetchBygetNcraByEI_CI,
			new Object[] {
				ncraApplication.getEntityId(), ncraApplication.getCaseId()
			},
			ncraApplication);

		finderCache.putResult(
			_finderPathFetchBygetNcraByRT_AppNo,
			new Object[] {
				ncraApplication.getTypeOfTransaction(),
				ncraApplication.getExpiredLicenseAppNumber()
			},
			ncraApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncra applications in the entity cache if it is enabled.
	 *
	 * @param ncraApplications the ncra applications
	 */
	@Override
	public void cacheResult(List<NcraApplication> ncraApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncraApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcraApplication ncraApplication : ncraApplications) {
			if (entityCache.getResult(
					NcraApplicationImpl.class,
					ncraApplication.getPrimaryKey()) == null) {

				cacheResult(ncraApplication);
			}
		}
	}

	/**
	 * Clears the cache for all ncra applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcraApplicationImpl.class);

		finderCache.clearCache(NcraApplicationImpl.class);
	}

	/**
	 * Clears the cache for the ncra application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcraApplication ncraApplication) {
		entityCache.removeResult(NcraApplicationImpl.class, ncraApplication);
	}

	@Override
	public void clearCache(List<NcraApplication> ncraApplications) {
		for (NcraApplication ncraApplication : ncraApplications) {
			entityCache.removeResult(
				NcraApplicationImpl.class, ncraApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcraApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcraApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcraApplicationModelImpl ncraApplicationModelImpl) {

		Object[] args = new Object[] {
			ncraApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetNcraByAppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraByAppNum, args, ncraApplicationModelImpl);

		args = new Object[] {ncraApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetNcraByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraByCaseId, args, ncraApplicationModelImpl);

		args = new Object[] {
			ncraApplicationModelImpl.getEntityId(),
			ncraApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcraByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraByEI_CI, args, ncraApplicationModelImpl);

		args = new Object[] {
			ncraApplicationModelImpl.getTypeOfTransaction(),
			ncraApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetNcraByRT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraByRT_AppNo, args,
			ncraApplicationModelImpl);
	}

	/**
	 * Creates a new ncra application with the primary key. Does not add the ncra application to the database.
	 *
	 * @param ncraApplicationId the primary key for the new ncra application
	 * @return the new ncra application
	 */
	@Override
	public NcraApplication create(long ncraApplicationId) {
		NcraApplication ncraApplication = new NcraApplicationImpl();

		ncraApplication.setNew(true);
		ncraApplication.setPrimaryKey(ncraApplicationId);

		ncraApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncraApplication;
	}

	/**
	 * Removes the ncra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application that was removed
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication remove(long ncraApplicationId)
		throws NoSuchNcraApplicationException {

		return remove((Serializable)ncraApplicationId);
	}

	/**
	 * Removes the ncra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncra application
	 * @return the ncra application that was removed
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication remove(Serializable primaryKey)
		throws NoSuchNcraApplicationException {

		Session session = null;

		try {
			session = openSession();

			NcraApplication ncraApplication = (NcraApplication)session.get(
				NcraApplicationImpl.class, primaryKey);

			if (ncraApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcraApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncraApplication);
		}
		catch (NoSuchNcraApplicationException noSuchEntityException) {
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
	protected NcraApplication removeImpl(NcraApplication ncraApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncraApplication)) {
				ncraApplication = (NcraApplication)session.get(
					NcraApplicationImpl.class,
					ncraApplication.getPrimaryKeyObj());
			}

			if (ncraApplication != null) {
				session.delete(ncraApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncraApplication != null) {
			clearCache(ncraApplication);
		}

		return ncraApplication;
	}

	@Override
	public NcraApplication updateImpl(NcraApplication ncraApplication) {
		boolean isNew = ncraApplication.isNew();

		if (!(ncraApplication instanceof NcraApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncraApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncraApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncraApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcraApplication implementation " +
					ncraApplication.getClass());
		}

		NcraApplicationModelImpl ncraApplicationModelImpl =
			(NcraApplicationModelImpl)ncraApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncraApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncraApplication.setCreateDate(date);
			}
			else {
				ncraApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncraApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncraApplication.setModifiedDate(date);
			}
			else {
				ncraApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncraApplication);
			}
			else {
				ncraApplication = (NcraApplication)session.merge(
					ncraApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcraApplicationImpl.class, ncraApplicationModelImpl, false, true);

		cacheUniqueFindersCache(ncraApplicationModelImpl);

		if (isNew) {
			ncraApplication.setNew(false);
		}

		ncraApplication.resetOriginalValues();

		return ncraApplication;
	}

	/**
	 * Returns the ncra application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncra application
	 * @return the ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcraApplicationException {

		NcraApplication ncraApplication = fetchByPrimaryKey(primaryKey);

		if (ncraApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcraApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncraApplication;
	}

	/**
	 * Returns the ncra application with the primary key or throws a <code>NoSuchNcraApplicationException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application
	 * @throws NoSuchNcraApplicationException if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication findByPrimaryKey(long ncraApplicationId)
		throws NoSuchNcraApplicationException {

		return findByPrimaryKey((Serializable)ncraApplicationId);
	}

	/**
	 * Returns the ncra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplicationId the primary key of the ncra application
	 * @return the ncra application, or <code>null</code> if a ncra application with the primary key could not be found
	 */
	@Override
	public NcraApplication fetchByPrimaryKey(long ncraApplicationId) {
		return fetchByPrimaryKey((Serializable)ncraApplicationId);
	}

	/**
	 * Returns all the ncra applications.
	 *
	 * @return the ncra applications
	 */
	@Override
	public List<NcraApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @return the range of ncra applications
	 */
	@Override
	public List<NcraApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra applications
	 */
	@Override
	public List<NcraApplication> findAll(
		int start, int end,
		OrderByComparator<NcraApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra applications
	 * @param end the upper bound of the range of ncra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra applications
	 */
	@Override
	public List<NcraApplication> findAll(
		int start, int end,
		OrderByComparator<NcraApplication> orderByComparator,
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

		List<NcraApplication> list = null;

		if (useFinderCache) {
			list = (List<NcraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCRAAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCRAAPPLICATION;

				sql = sql.concat(NcraApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcraApplication>)QueryUtil.list(
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
	 * Removes all the ncra applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcraApplication ncraApplication : findAll()) {
			remove(ncraApplication);
		}
	}

	/**
	 * Returns the number of ncra applications.
	 *
	 * @return the number of ncra applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCRAAPPLICATION);

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
		return "ncraApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCRAAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcraApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncra application persistence.
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

		_finderPathWithPaginationFindBygetNcraByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcraByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetNcraByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNcraByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetNcraByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcraByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetNcraByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcraByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetNcraByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNcraByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetNcraByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcraByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetNcraByAppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetNcraByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcraByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetNcraByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcraByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcraByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetNcraByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcraByEntityId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetNcraByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetNcraByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, true);

		_finderPathCountBygetNcraByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, false);

		_finderPathWithPaginationFindBygetNcraByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetNcraByEntityId_Status",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetNcraByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetNcraByEntityId_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetNcraByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraByEntityId_Status",
			new String[] {String.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetNcraByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetNcraByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcraByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetNcraByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetNcraByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			false);

		NcraApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcraApplicationUtil.setPersistence(null);

		entityCache.removeCache(NcraApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCRAAPPLICATION =
		"SELECT ncraApplication FROM NcraApplication ncraApplication";

	private static final String _SQL_SELECT_NCRAAPPLICATION_WHERE =
		"SELECT ncraApplication FROM NcraApplication ncraApplication WHERE ";

	private static final String _SQL_COUNT_NCRAAPPLICATION =
		"SELECT COUNT(ncraApplication) FROM NcraApplication ncraApplication";

	private static final String _SQL_COUNT_NCRAAPPLICATION_WHERE =
		"SELECT COUNT(ncraApplication) FROM NcraApplication ncraApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncraApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcraApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcraApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcraApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}