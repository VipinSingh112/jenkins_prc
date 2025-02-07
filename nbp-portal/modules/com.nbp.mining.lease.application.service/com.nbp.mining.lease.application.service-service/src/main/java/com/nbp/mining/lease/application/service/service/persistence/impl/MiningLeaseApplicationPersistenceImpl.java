/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.lease.application.service.service.persistence.impl;

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

import com.nbp.mining.lease.application.service.exception.NoSuchMiningLeaseApplicationException;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplication;
import com.nbp.mining.lease.application.service.model.MiningLeaseApplicationTable;
import com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationImpl;
import com.nbp.mining.lease.application.service.model.impl.MiningLeaseApplicationModelImpl;
import com.nbp.mining.lease.application.service.service.persistence.MiningLeaseApplicationPersistence;
import com.nbp.mining.lease.application.service.service.persistence.MiningLeaseApplicationUtil;
import com.nbp.mining.lease.application.service.service.persistence.impl.constants.MINING_LEASE_APPLICATIONPersistenceConstants;

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
 * The persistence implementation for the mining lease application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiningLeaseApplicationPersistence.class)
public class MiningLeaseApplicationPersistenceImpl
	extends BasePersistenceImpl<MiningLeaseApplication>
	implements MiningLeaseApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiningLeaseApplicationUtil</code> to access the mining lease application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiningLeaseApplicationImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindBygetMiningByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetMiningByS_U;
	private FinderPath _finderPathCountBygetMiningByS_U;

	/**
	 * Returns all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status) {

		return findBygetMiningByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end) {

		return findBygetMiningByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return findBygetMiningByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMiningByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMiningByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<MiningLeaseApplication> list = null;

		if (useFinderCache) {
			list = (List<MiningLeaseApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningLeaseApplication miningLeaseApplication : list) {
					if ((userId != miningLeaseApplication.getUserId()) ||
						(status != miningLeaseApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETMININGBYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<MiningLeaseApplication>)QueryUtil.list(
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
	 * Returns the first mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByS_U_First(
			long userId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByS_U_First(userId, status, orderByComparator);

		if (miningLeaseApplication != null) {
			return miningLeaseApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiningLeaseApplicationException(sb.toString());
	}

	/**
	 * Returns the first mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByS_U_First(
		long userId, int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		List<MiningLeaseApplication> list = findBygetMiningByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByS_U_Last(
			long userId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByS_U_Last(userId, status, orderByComparator);

		if (miningLeaseApplication != null) {
			return miningLeaseApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiningLeaseApplicationException(sb.toString());
	}

	/**
	 * Returns the last mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByS_U_Last(
		long userId, int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		int count = countBygetMiningByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<MiningLeaseApplication> list = findBygetMiningByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication[] findBygetMiningByS_U_PrevAndNext(
			long miningLeaseApplicationId, long userId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication = findByPrimaryKey(
			miningLeaseApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiningLeaseApplication[] array = new MiningLeaseApplicationImpl[3];

			array[0] = getBygetMiningByS_U_PrevAndNext(
				session, miningLeaseApplication, userId, status,
				orderByComparator, true);

			array[1] = miningLeaseApplication;

			array[2] = getBygetMiningByS_U_PrevAndNext(
				session, miningLeaseApplication, userId, status,
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

	protected MiningLeaseApplication getBygetMiningByS_U_PrevAndNext(
		Session session, MiningLeaseApplication miningLeaseApplication,
		long userId, int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETMININGBYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETMININGBYS_U_STATUS_2);

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
			sb.append(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
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
						miningLeaseApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningLeaseApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining lease applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetMiningByS_U(long userId, int status) {
		for (MiningLeaseApplication miningLeaseApplication :
				findBygetMiningByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miningLeaseApplication);
		}
	}

	/**
	 * Returns the number of mining lease applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int countBygetMiningByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetMiningByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETMININGBYS_U_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETMININGBYS_U_USERID_2 =
		"miningLeaseApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETMININGBYS_U_STATUS_2 =
		"miningLeaseApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetMiningByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetMiningByStatus;
	private FinderPath _finderPathCountBygetMiningByStatus;

	/**
	 * Returns all the mining lease applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByStatus(int status) {
		return findBygetMiningByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end) {

		return findBygetMiningByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return findBygetMiningByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByStatus(
		int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMiningByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMiningByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<MiningLeaseApplication> list = null;

		if (useFinderCache) {
			list = (List<MiningLeaseApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningLeaseApplication miningLeaseApplication : list) {
					if (status != miningLeaseApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<MiningLeaseApplication>)QueryUtil.list(
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
	 * Returns the first mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByStatus_First(
			int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByStatus_First(status, orderByComparator);

		if (miningLeaseApplication != null) {
			return miningLeaseApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiningLeaseApplicationException(sb.toString());
	}

	/**
	 * Returns the first mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByStatus_First(
		int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		List<MiningLeaseApplication> list = findBygetMiningByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByStatus_Last(
			int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByStatus_Last(status, orderByComparator);

		if (miningLeaseApplication != null) {
			return miningLeaseApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiningLeaseApplicationException(sb.toString());
	}

	/**
	 * Returns the last mining lease application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByStatus_Last(
		int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		int count = countBygetMiningByStatus(status);

		if (count == 0) {
			return null;
		}

		List<MiningLeaseApplication> list = findBygetMiningByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication[] findBygetMiningByStatus_PrevAndNext(
			long miningLeaseApplicationId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication = findByPrimaryKey(
			miningLeaseApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiningLeaseApplication[] array = new MiningLeaseApplicationImpl[3];

			array[0] = getBygetMiningByStatus_PrevAndNext(
				session, miningLeaseApplication, status, orderByComparator,
				true);

			array[1] = miningLeaseApplication;

			array[2] = getBygetMiningByStatus_PrevAndNext(
				session, miningLeaseApplication, status, orderByComparator,
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

	protected MiningLeaseApplication getBygetMiningByStatus_PrevAndNext(
		Session session, MiningLeaseApplication miningLeaseApplication,
		int status, OrderByComparator<MiningLeaseApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETMININGBYSTATUS_STATUS_2);

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
			sb.append(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
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
						miningLeaseApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningLeaseApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining lease applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetMiningByStatus(int status) {
		for (MiningLeaseApplication miningLeaseApplication :
				findBygetMiningByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningLeaseApplication);
		}
	}

	/**
	 * Returns the number of mining lease applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int countBygetMiningByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetMiningByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMININGBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETMININGBYSTATUS_STATUS_2 =
		"miningLeaseApplication.status = ?";

	private FinderPath _finderPathFetchBygetMiningByAppNum;
	private FinderPath _finderPathCountBygetMiningByAppNum;

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByAppNum(
			String applicationNumber)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByAppNum(applicationNumber);

		if (miningLeaseApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningLeaseApplicationException(sb.toString());
		}

		return miningLeaseApplication;
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByAppNum(
		String applicationNumber) {

		return fetchBygetMiningByAppNum(applicationNumber, true);
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByAppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiningByAppNum, finderArgs, this);
		}

		if (result instanceof MiningLeaseApplication) {
			MiningLeaseApplication miningLeaseApplication =
				(MiningLeaseApplication)result;

			if (!Objects.equals(
					applicationNumber,
					miningLeaseApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETMININGBYAPPNUM_APPLICATIONNUMBER_2);
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

				List<MiningLeaseApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiningByAppNum, finderArgs,
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
								"MiningLeaseApplicationPersistenceImpl.fetchBygetMiningByAppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningLeaseApplication miningLeaseApplication = list.get(0);

					result = miningLeaseApplication;

					cacheResult(miningLeaseApplication);
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
			return (MiningLeaseApplication)result;
		}
	}

	/**
	 * Removes the mining lease application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the mining lease application that was removed
	 */
	@Override
	public MiningLeaseApplication removeBygetMiningByAppNum(
			String applicationNumber)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication = findBygetMiningByAppNum(
			applicationNumber);

		return remove(miningLeaseApplication);
	}

	/**
	 * Returns the number of mining lease applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int countBygetMiningByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetMiningByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETMININGBYAPPNUM_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETMININGBYAPPNUM_APPLICATIONNUMBER_2 =
			"miningLeaseApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMININGBYAPPNUM_APPLICATIONNUMBER_3 =
			"(miningLeaseApplication.applicationNumber IS NULL OR miningLeaseApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetMiningByCaseId;
	private FinderPath _finderPathCountBygetMiningByCaseId;

	/**
	 * Returns the mining lease application where caseId = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByCaseId(String caseId)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByCaseId(caseId);

		if (miningLeaseApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningLeaseApplicationException(sb.toString());
		}

		return miningLeaseApplication;
	}

	/**
	 * Returns the mining lease application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByCaseId(String caseId) {
		return fetchBygetMiningByCaseId(caseId, true);
	}

	/**
	 * Returns the mining lease application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiningByCaseId, finderArgs, this);
		}

		if (result instanceof MiningLeaseApplication) {
			MiningLeaseApplication miningLeaseApplication =
				(MiningLeaseApplication)result;

			if (!Objects.equals(caseId, miningLeaseApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYCASEID_CASEID_2);
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

				List<MiningLeaseApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiningByCaseId, finderArgs,
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
								"MiningLeaseApplicationPersistenceImpl.fetchBygetMiningByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningLeaseApplication miningLeaseApplication = list.get(0);

					result = miningLeaseApplication;

					cacheResult(miningLeaseApplication);
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
			return (MiningLeaseApplication)result;
		}
	}

	/**
	 * Removes the mining lease application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the mining lease application that was removed
	 */
	@Override
	public MiningLeaseApplication removeBygetMiningByCaseId(String caseId)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication = findBygetMiningByCaseId(
			caseId);

		return remove(miningLeaseApplication);
	}

	/**
	 * Returns the number of mining lease applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int countBygetMiningByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMiningByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMININGBYCASEID_CASEID_2 =
		"miningLeaseApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETMININGBYCASEID_CASEID_3 =
		"(miningLeaseApplication.caseId IS NULL OR miningLeaseApplication.caseId = '')";

	private FinderPath
		_finderPathFetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number;
	private FinderPath
		_finderPathCountBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number;

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication
			findBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				String applicationNumber, String prospRightsNum)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				applicationNumber, prospRightsNum);

		if (miningLeaseApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append(", prospRightsNum=");
			sb.append(prospRightsNum);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningLeaseApplicationException(sb.toString());
		}

		return miningLeaseApplication;
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication
		fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum) {

		return fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			applicationNumber, prospRightsNum, true);
	}

	/**
	 * Returns the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication
		fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum,
			boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");
		prospRightsNum = Objects.toString(prospRightsNum, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber, prospRightsNum};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number,
				finderArgs, this);
		}

		if (result instanceof MiningLeaseApplication) {
			MiningLeaseApplication miningLeaseApplication =
				(MiningLeaseApplication)result;

			if (!Objects.equals(
					applicationNumber,
					miningLeaseApplication.getApplicationNumber()) ||
				!Objects.equals(
					prospRightsNum,
					miningLeaseApplication.getProspRightsNum())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_APPLICATIONNUMBER_2);
			}

			boolean bindProspRightsNum = false;

			if (prospRightsNum.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_PROSPRIGHTSNUM_3);
			}
			else {
				bindProspRightsNum = true;

				sb.append(
					_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_PROSPRIGHTSNUM_2);
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

				if (bindProspRightsNum) {
					queryPos.add(prospRightsNum);
				}

				List<MiningLeaseApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									applicationNumber, prospRightsNum
								};
							}

							_log.warn(
								"MiningLeaseApplicationPersistenceImpl.fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningLeaseApplication miningLeaseApplication = list.get(0);

					result = miningLeaseApplication;

					cacheResult(miningLeaseApplication);
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
			return (MiningLeaseApplication)result;
		}
	}

	/**
	 * Removes the mining lease application where applicationNumber = &#63; and prospRightsNum = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the mining lease application that was removed
	 */
	@Override
	public MiningLeaseApplication
			removeBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				String applicationNumber, String prospRightsNum)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			findBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
				applicationNumber, prospRightsNum);

		return remove(miningLeaseApplication);
	}

	/**
	 * Returns the number of mining lease applications where applicationNumber = &#63; and prospRightsNum = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param prospRightsNum the prosp rights num
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int
		countBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number(
			String applicationNumber, String prospRightsNum) {

		applicationNumber = Objects.toString(applicationNumber, "");
		prospRightsNum = Objects.toString(prospRightsNum, "");

		FinderPath finderPath =
			_finderPathCountBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number;

		Object[] finderArgs = new Object[] {applicationNumber, prospRightsNum};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_APPLICATIONNUMBER_2);
			}

			boolean bindProspRightsNum = false;

			if (prospRightsNum.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_PROSPRIGHTSNUM_3);
			}
			else {
				bindProspRightsNum = true;

				sb.append(
					_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_PROSPRIGHTSNUM_2);
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

				if (bindProspRightsNum) {
					queryPos.add(prospRightsNum);
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
		_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_APPLICATIONNUMBER_2 =
			"miningLeaseApplication.applicationNumber = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_APPLICATIONNUMBER_3 =
			"(miningLeaseApplication.applicationNumber IS NULL OR miningLeaseApplication.applicationNumber = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_PROSPRIGHTSNUM_2 =
			"miningLeaseApplication.prospRightsNum = ?";

	private static final String
		_FINDER_COLUMN_GETMININGBY_PROSPECTINGRIGHTNUMBER_PROSPECTINGLICENCE_NUMBER_PROSPRIGHTSNUM_3 =
			"(miningLeaseApplication.prospRightsNum IS NULL OR miningLeaseApplication.prospRightsNum = '')";

	private FinderPath _finderPathWithPaginationFindBygetMiningByEntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetMiningByEntityId;
	private FinderPath _finderPathCountBygetMiningByEntityId;

	/**
	 * Returns all the mining lease applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId) {

		return findBygetMiningByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end) {

		return findBygetMiningByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return findBygetMiningByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByEntityId(
		String entityId, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMiningByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMiningByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<MiningLeaseApplication> list = null;

		if (useFinderCache) {
			list = (List<MiningLeaseApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningLeaseApplication miningLeaseApplication : list) {
					if (!entityId.equals(
							miningLeaseApplication.getEntityId())) {

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

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningLeaseApplication>)QueryUtil.list(
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
	 * Returns the first mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByEntityId_First(
			String entityId,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByEntityId_First(entityId, orderByComparator);

		if (miningLeaseApplication != null) {
			return miningLeaseApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchMiningLeaseApplicationException(sb.toString());
	}

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByEntityId_First(
		String entityId,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		List<MiningLeaseApplication> list = findBygetMiningByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByEntityId_Last(
			String entityId,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByEntityId_Last(entityId, orderByComparator);

		if (miningLeaseApplication != null) {
			return miningLeaseApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchMiningLeaseApplicationException(sb.toString());
	}

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByEntityId_Last(
		String entityId,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		int count = countBygetMiningByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<MiningLeaseApplication> list = findBygetMiningByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where entityId = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication[] findBygetMiningByEntityId_PrevAndNext(
			long miningLeaseApplicationId, String entityId,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		entityId = Objects.toString(entityId, "");

		MiningLeaseApplication miningLeaseApplication = findByPrimaryKey(
			miningLeaseApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiningLeaseApplication[] array = new MiningLeaseApplicationImpl[3];

			array[0] = getBygetMiningByEntityId_PrevAndNext(
				session, miningLeaseApplication, entityId, orderByComparator,
				true);

			array[1] = miningLeaseApplication;

			array[2] = getBygetMiningByEntityId_PrevAndNext(
				session, miningLeaseApplication, entityId, orderByComparator,
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

	protected MiningLeaseApplication getBygetMiningByEntityId_PrevAndNext(
		Session session, MiningLeaseApplication miningLeaseApplication,
		String entityId,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_ENTITYID_2);
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
			sb.append(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
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
						miningLeaseApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningLeaseApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining lease applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetMiningByEntityId(String entityId) {
		for (MiningLeaseApplication miningLeaseApplication :
				findBygetMiningByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miningLeaseApplication);
		}
	}

	/**
	 * Returns the number of mining lease applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int countBygetMiningByEntityId(String entityId) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetMiningByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_ENTITYID_2);
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

	private static final String _FINDER_COLUMN_GETMININGBYENTITYID_ENTITYID_2 =
		"miningLeaseApplication.entityId = ?";

	private static final String _FINDER_COLUMN_GETMININGBYENTITYID_ENTITYID_3 =
		"(miningLeaseApplication.entityId IS NULL OR miningLeaseApplication.entityId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetMiningByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMiningByEntityId_Status;
	private FinderPath _finderPathCountBygetMiningByEntityId_Status;

	/**
	 * Returns all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByEntityId_Status(
		String entityId, int status) {

		return findBygetMiningByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByEntityId_Status(
		String entityId, int status, int start, int end) {

		return findBygetMiningByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return findBygetMiningByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findBygetMiningByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMiningByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMiningByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<MiningLeaseApplication> list = null;

		if (useFinderCache) {
			list = (List<MiningLeaseApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiningLeaseApplication miningLeaseApplication : list) {
					if (!entityId.equals(
							miningLeaseApplication.getEntityId()) ||
						(status != miningLeaseApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiningLeaseApplication>)QueryUtil.list(
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
	 * Returns the first mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByEntityId_Status_First(
				entityId, status, orderByComparator);

		if (miningLeaseApplication != null) {
			return miningLeaseApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiningLeaseApplicationException(sb.toString());
	}

	/**
	 * Returns the first mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		List<MiningLeaseApplication> list = findBygetMiningByEntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByEntityId_Status_Last(
				entityId, status, orderByComparator);

		if (miningLeaseApplication != null) {
			return miningLeaseApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiningLeaseApplicationException(sb.toString());
	}

	/**
	 * Returns the last mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		int count = countBygetMiningByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<MiningLeaseApplication> list = findBygetMiningByEntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the mining lease applications before and after the current mining lease application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param miningLeaseApplicationId the primary key of the current mining lease application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication[]
			findBygetMiningByEntityId_Status_PrevAndNext(
				long miningLeaseApplicationId, String entityId, int status,
				OrderByComparator<MiningLeaseApplication> orderByComparator)
		throws NoSuchMiningLeaseApplicationException {

		entityId = Objects.toString(entityId, "");

		MiningLeaseApplication miningLeaseApplication = findByPrimaryKey(
			miningLeaseApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiningLeaseApplication[] array = new MiningLeaseApplicationImpl[3];

			array[0] = getBygetMiningByEntityId_Status_PrevAndNext(
				session, miningLeaseApplication, entityId, status,
				orderByComparator, true);

			array[1] = miningLeaseApplication;

			array[2] = getBygetMiningByEntityId_Status_PrevAndNext(
				session, miningLeaseApplication, entityId, status,
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

	protected MiningLeaseApplication
		getBygetMiningByEntityId_Status_PrevAndNext(
			Session session, MiningLeaseApplication miningLeaseApplication,
			String entityId, int status,
			OrderByComparator<MiningLeaseApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_STATUS_2);

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
			sb.append(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
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
						miningLeaseApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiningLeaseApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the mining lease applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetMiningByEntityId_Status(
		String entityId, int status) {

		for (MiningLeaseApplication miningLeaseApplication :
				findBygetMiningByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miningLeaseApplication);
		}
	}

	/**
	 * Returns the number of mining lease applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int countBygetMiningByEntityId_Status(String entityId, int status) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetMiningByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_STATUS_2);

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
		_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_ENTITYID_2 =
			"miningLeaseApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_ENTITYID_3 =
			"(miningLeaseApplication.entityId IS NULL OR miningLeaseApplication.entityId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMININGBYENTITYID_STATUS_STATUS_2 =
			"miningLeaseApplication.status = ?";

	private FinderPath _finderPathFetchBygetMiningByEI_CI;
	private FinderPath _finderPathCountBygetMiningByEI_CI;

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByEI_CI(
			String entityId, String caseId)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication = fetchBygetMiningByEI_CI(
			entityId, caseId);

		if (miningLeaseApplication == null) {
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

			throw new NoSuchMiningLeaseApplicationException(sb.toString());
		}

		return miningLeaseApplication;
	}

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByEI_CI(
		String entityId, String caseId) {

		return fetchBygetMiningByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the mining lease application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByEI_CI(
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
				_finderPathFetchBygetMiningByEI_CI, finderArgs, this);
		}

		if (result instanceof MiningLeaseApplication) {
			MiningLeaseApplication miningLeaseApplication =
				(MiningLeaseApplication)result;

			if (!Objects.equals(
					entityId, miningLeaseApplication.getEntityId()) ||
				!Objects.equals(caseId, miningLeaseApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYEI_CI_CASEID_2);
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

				List<MiningLeaseApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiningByEI_CI, finderArgs,
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
								"MiningLeaseApplicationPersistenceImpl.fetchBygetMiningByEI_CI(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningLeaseApplication miningLeaseApplication = list.get(0);

					result = miningLeaseApplication;

					cacheResult(miningLeaseApplication);
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
			return (MiningLeaseApplication)result;
		}
	}

	/**
	 * Removes the mining lease application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the mining lease application that was removed
	 */
	@Override
	public MiningLeaseApplication removeBygetMiningByEI_CI(
			String entityId, String caseId)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication = findBygetMiningByEI_CI(
			entityId, caseId);

		return remove(miningLeaseApplication);
	}

	/**
	 * Returns the number of mining lease applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int countBygetMiningByEI_CI(String entityId, String caseId) {
		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMiningByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMININGBYEI_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMININGBYEI_CI_ENTITYID_2 =
		"miningLeaseApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETMININGBYEI_CI_ENTITYID_3 =
		"(miningLeaseApplication.entityId IS NULL OR miningLeaseApplication.entityId = '') AND ";

	private static final String _FINDER_COLUMN_GETMININGBYEI_CI_CASEID_2 =
		"miningLeaseApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETMININGBYEI_CI_CASEID_3 =
		"(miningLeaseApplication.caseId IS NULL OR miningLeaseApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetMiningByRT_AppNo;
	private FinderPath _finderPathCountBygetMiningByRT_AppNo;

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication findBygetMiningByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			fetchBygetMiningByRT_AppNo(
				typeOfApplicant, expiredLicenseAppNumber);

		if (miningLeaseApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfApplicant=");
			sb.append(typeOfApplicant);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiningLeaseApplicationException(sb.toString());
		}

		return miningLeaseApplication;
	}

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return fetchBygetMiningByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching mining lease application, or <code>null</code> if a matching mining lease application could not be found
	 */
	@Override
	public MiningLeaseApplication fetchBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		typeOfApplicant = Objects.toString(typeOfApplicant, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				typeOfApplicant, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMiningByRT_AppNo, finderArgs, this);
		}

		if (result instanceof MiningLeaseApplication) {
			MiningLeaseApplication miningLeaseApplication =
				(MiningLeaseApplication)result;

			if (!Objects.equals(
					typeOfApplicant,
					miningLeaseApplication.getTypeOfApplicant()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					miningLeaseApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MININGLEASEAPPLICATION_WHERE);

			boolean bindTypeOfApplicant = false;

			if (typeOfApplicant.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYRT_APPNO_TYPEOFAPPLICANT_3);
			}
			else {
				bindTypeOfApplicant = true;

				sb.append(_FINDER_COLUMN_GETMININGBYRT_APPNO_TYPEOFAPPLICANT_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMININGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMININGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfApplicant) {
					queryPos.add(typeOfApplicant);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<MiningLeaseApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMiningByRT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfApplicant, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"MiningLeaseApplicationPersistenceImpl.fetchBygetMiningByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiningLeaseApplication miningLeaseApplication = list.get(0);

					result = miningLeaseApplication;

					cacheResult(miningLeaseApplication);
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
			return (MiningLeaseApplication)result;
		}
	}

	/**
	 * Removes the mining lease application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the mining lease application that was removed
	 */
	@Override
	public MiningLeaseApplication removeBygetMiningByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication =
			findBygetMiningByRT_AppNo(typeOfApplicant, expiredLicenseAppNumber);

		return remove(miningLeaseApplication);
	}

	/**
	 * Returns the number of mining lease applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching mining lease applications
	 */
	@Override
	public int countBygetMiningByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		typeOfApplicant = Objects.toString(typeOfApplicant, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetMiningByRT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfApplicant, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MININGLEASEAPPLICATION_WHERE);

			boolean bindTypeOfApplicant = false;

			if (typeOfApplicant.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMININGBYRT_APPNO_TYPEOFAPPLICANT_3);
			}
			else {
				bindTypeOfApplicant = true;

				sb.append(_FINDER_COLUMN_GETMININGBYRT_APPNO_TYPEOFAPPLICANT_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMININGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMININGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfApplicant) {
					queryPos.add(typeOfApplicant);
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
		_FINDER_COLUMN_GETMININGBYRT_APPNO_TYPEOFAPPLICANT_2 =
			"miningLeaseApplication.typeOfApplicant = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMININGBYRT_APPNO_TYPEOFAPPLICANT_3 =
			"(miningLeaseApplication.typeOfApplicant IS NULL OR miningLeaseApplication.typeOfApplicant = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMININGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"miningLeaseApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMININGBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(miningLeaseApplication.expiredLicenseAppNumber IS NULL OR miningLeaseApplication.expiredLicenseAppNumber = '')";

	public MiningLeaseApplicationPersistenceImpl() {
		setModelClass(MiningLeaseApplication.class);

		setModelImplClass(MiningLeaseApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(MiningLeaseApplicationTable.INSTANCE);
	}

	/**
	 * Caches the mining lease application in the entity cache if it is enabled.
	 *
	 * @param miningLeaseApplication the mining lease application
	 */
	@Override
	public void cacheResult(MiningLeaseApplication miningLeaseApplication) {
		entityCache.putResult(
			MiningLeaseApplicationImpl.class,
			miningLeaseApplication.getPrimaryKey(), miningLeaseApplication);

		finderCache.putResult(
			_finderPathFetchBygetMiningByAppNum,
			new Object[] {miningLeaseApplication.getApplicationNumber()},
			miningLeaseApplication);

		finderCache.putResult(
			_finderPathFetchBygetMiningByCaseId,
			new Object[] {miningLeaseApplication.getCaseId()},
			miningLeaseApplication);

		finderCache.putResult(
			_finderPathFetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number,
			new Object[] {
				miningLeaseApplication.getApplicationNumber(),
				miningLeaseApplication.getProspRightsNum()
			},
			miningLeaseApplication);

		finderCache.putResult(
			_finderPathFetchBygetMiningByEI_CI,
			new Object[] {
				miningLeaseApplication.getEntityId(),
				miningLeaseApplication.getCaseId()
			},
			miningLeaseApplication);

		finderCache.putResult(
			_finderPathFetchBygetMiningByRT_AppNo,
			new Object[] {
				miningLeaseApplication.getTypeOfApplicant(),
				miningLeaseApplication.getExpiredLicenseAppNumber()
			},
			miningLeaseApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the mining lease applications in the entity cache if it is enabled.
	 *
	 * @param miningLeaseApplications the mining lease applications
	 */
	@Override
	public void cacheResult(
		List<MiningLeaseApplication> miningLeaseApplications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miningLeaseApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiningLeaseApplication miningLeaseApplication :
				miningLeaseApplications) {

			if (entityCache.getResult(
					MiningLeaseApplicationImpl.class,
					miningLeaseApplication.getPrimaryKey()) == null) {

				cacheResult(miningLeaseApplication);
			}
		}
	}

	/**
	 * Clears the cache for all mining lease applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiningLeaseApplicationImpl.class);

		finderCache.clearCache(MiningLeaseApplicationImpl.class);
	}

	/**
	 * Clears the cache for the mining lease application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiningLeaseApplication miningLeaseApplication) {
		entityCache.removeResult(
			MiningLeaseApplicationImpl.class, miningLeaseApplication);
	}

	@Override
	public void clearCache(
		List<MiningLeaseApplication> miningLeaseApplications) {

		for (MiningLeaseApplication miningLeaseApplication :
				miningLeaseApplications) {

			entityCache.removeResult(
				MiningLeaseApplicationImpl.class, miningLeaseApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiningLeaseApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				MiningLeaseApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiningLeaseApplicationModelImpl miningLeaseApplicationModelImpl) {

		Object[] args = new Object[] {
			miningLeaseApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningByAppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningByAppNum, args,
			miningLeaseApplicationModelImpl);

		args = new Object[] {miningLeaseApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetMiningByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningByCaseId, args,
			miningLeaseApplicationModelImpl);

		args = new Object[] {
			miningLeaseApplicationModelImpl.getApplicationNumber(),
			miningLeaseApplicationModelImpl.getProspRightsNum()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number,
			args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number,
			args, miningLeaseApplicationModelImpl);

		args = new Object[] {
			miningLeaseApplicationModelImpl.getEntityId(),
			miningLeaseApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningByEI_CI, args,
			miningLeaseApplicationModelImpl);

		args = new Object[] {
			miningLeaseApplicationModelImpl.getTypeOfApplicant(),
			miningLeaseApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetMiningByRT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMiningByRT_AppNo, args,
			miningLeaseApplicationModelImpl);
	}

	/**
	 * Creates a new mining lease application with the primary key. Does not add the mining lease application to the database.
	 *
	 * @param miningLeaseApplicationId the primary key for the new mining lease application
	 * @return the new mining lease application
	 */
	@Override
	public MiningLeaseApplication create(long miningLeaseApplicationId) {
		MiningLeaseApplication miningLeaseApplication =
			new MiningLeaseApplicationImpl();

		miningLeaseApplication.setNew(true);
		miningLeaseApplication.setPrimaryKey(miningLeaseApplicationId);

		miningLeaseApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miningLeaseApplication;
	}

	/**
	 * Removes the mining lease application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application that was removed
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication remove(long miningLeaseApplicationId)
		throws NoSuchMiningLeaseApplicationException {

		return remove((Serializable)miningLeaseApplicationId);
	}

	/**
	 * Removes the mining lease application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the mining lease application
	 * @return the mining lease application that was removed
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication remove(Serializable primaryKey)
		throws NoSuchMiningLeaseApplicationException {

		Session session = null;

		try {
			session = openSession();

			MiningLeaseApplication miningLeaseApplication =
				(MiningLeaseApplication)session.get(
					MiningLeaseApplicationImpl.class, primaryKey);

			if (miningLeaseApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiningLeaseApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miningLeaseApplication);
		}
		catch (NoSuchMiningLeaseApplicationException noSuchEntityException) {
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
	protected MiningLeaseApplication removeImpl(
		MiningLeaseApplication miningLeaseApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miningLeaseApplication)) {
				miningLeaseApplication = (MiningLeaseApplication)session.get(
					MiningLeaseApplicationImpl.class,
					miningLeaseApplication.getPrimaryKeyObj());
			}

			if (miningLeaseApplication != null) {
				session.delete(miningLeaseApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miningLeaseApplication != null) {
			clearCache(miningLeaseApplication);
		}

		return miningLeaseApplication;
	}

	@Override
	public MiningLeaseApplication updateImpl(
		MiningLeaseApplication miningLeaseApplication) {

		boolean isNew = miningLeaseApplication.isNew();

		if (!(miningLeaseApplication instanceof
				MiningLeaseApplicationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miningLeaseApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miningLeaseApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miningLeaseApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiningLeaseApplication implementation " +
					miningLeaseApplication.getClass());
		}

		MiningLeaseApplicationModelImpl miningLeaseApplicationModelImpl =
			(MiningLeaseApplicationModelImpl)miningLeaseApplication;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miningLeaseApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				miningLeaseApplication.setCreateDate(date);
			}
			else {
				miningLeaseApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miningLeaseApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miningLeaseApplication.setModifiedDate(date);
			}
			else {
				miningLeaseApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miningLeaseApplication);
			}
			else {
				miningLeaseApplication = (MiningLeaseApplication)session.merge(
					miningLeaseApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiningLeaseApplicationImpl.class, miningLeaseApplicationModelImpl,
			false, true);

		cacheUniqueFindersCache(miningLeaseApplicationModelImpl);

		if (isNew) {
			miningLeaseApplication.setNew(false);
		}

		miningLeaseApplication.resetOriginalValues();

		return miningLeaseApplication;
	}

	/**
	 * Returns the mining lease application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the mining lease application
	 * @return the mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiningLeaseApplicationException {

		MiningLeaseApplication miningLeaseApplication = fetchByPrimaryKey(
			primaryKey);

		if (miningLeaseApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiningLeaseApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miningLeaseApplication;
	}

	/**
	 * Returns the mining lease application with the primary key or throws a <code>NoSuchMiningLeaseApplicationException</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application
	 * @throws NoSuchMiningLeaseApplicationException if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication findByPrimaryKey(
			long miningLeaseApplicationId)
		throws NoSuchMiningLeaseApplicationException {

		return findByPrimaryKey((Serializable)miningLeaseApplicationId);
	}

	/**
	 * Returns the mining lease application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miningLeaseApplicationId the primary key of the mining lease application
	 * @return the mining lease application, or <code>null</code> if a mining lease application with the primary key could not be found
	 */
	@Override
	public MiningLeaseApplication fetchByPrimaryKey(
		long miningLeaseApplicationId) {

		return fetchByPrimaryKey((Serializable)miningLeaseApplicationId);
	}

	/**
	 * Returns all the mining lease applications.
	 *
	 * @return the mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @return the range of mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findAll(
		int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the mining lease applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiningLeaseApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of mining lease applications
	 * @param end the upper bound of the range of mining lease applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of mining lease applications
	 */
	@Override
	public List<MiningLeaseApplication> findAll(
		int start, int end,
		OrderByComparator<MiningLeaseApplication> orderByComparator,
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

		List<MiningLeaseApplication> list = null;

		if (useFinderCache) {
			list = (List<MiningLeaseApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MININGLEASEAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MININGLEASEAPPLICATION;

				sql = sql.concat(MiningLeaseApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiningLeaseApplication>)QueryUtil.list(
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
	 * Removes all the mining lease applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiningLeaseApplication miningLeaseApplication : findAll()) {
			remove(miningLeaseApplication);
		}
	}

	/**
	 * Returns the number of mining lease applications.
	 *
	 * @return the number of mining lease applications
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
					_SQL_COUNT_MININGLEASEAPPLICATION);

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
		return "miningLeaseApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MININGLEASEAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiningLeaseApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the mining lease application persistence.
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

		_finderPathWithPaginationFindBygetMiningByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMiningByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetMiningByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMiningByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetMiningByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMiningByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetMiningByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMiningByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetMiningByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMiningByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, true);

		_finderPathCountBygetMiningByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, false);

		_finderPathFetchBygetMiningByAppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiningByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetMiningByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningByAppNum", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetMiningByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiningByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMiningByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningByCaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"applicationNumber", "prospRightsNum"}, true);

		_finderPathCountBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetMiningBy_ProspectingRightNumber_ProspectingLicence_Number",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"applicationNumber", "prospRightsNum"}, false);

		_finderPathWithPaginationFindBygetMiningByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMiningByEntityId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetMiningByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMiningByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, true);

		_finderPathCountBygetMiningByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, false);

		_finderPathWithPaginationFindBygetMiningByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMiningByEntityId_Status",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetMiningByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMiningByEntityId_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetMiningByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningByEntityId_Status",
			new String[] {String.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetMiningByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiningByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetMiningByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetMiningByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMiningByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfApplicant", "expiredLicenseAppNumber"}, true);

		_finderPathCountBygetMiningByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMiningByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfApplicant", "expiredLicenseAppNumber"}, false);

		MiningLeaseApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiningLeaseApplicationUtil.setPersistence(null);

		entityCache.removeCache(MiningLeaseApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MINING_LEASE_APPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MININGLEASEAPPLICATION =
		"SELECT miningLeaseApplication FROM MiningLeaseApplication miningLeaseApplication";

	private static final String _SQL_SELECT_MININGLEASEAPPLICATION_WHERE =
		"SELECT miningLeaseApplication FROM MiningLeaseApplication miningLeaseApplication WHERE ";

	private static final String _SQL_COUNT_MININGLEASEAPPLICATION =
		"SELECT COUNT(miningLeaseApplication) FROM MiningLeaseApplication miningLeaseApplication";

	private static final String _SQL_COUNT_MININGLEASEAPPLICATION_WHERE =
		"SELECT COUNT(miningLeaseApplication) FROM MiningLeaseApplication miningLeaseApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"miningLeaseApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiningLeaseApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiningLeaseApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiningLeaseApplicationPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}